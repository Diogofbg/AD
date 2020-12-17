package pt.uma.tpsi;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;


public class SmartTermo extends JFrame {
    private JPanel jPanelMain;
    private JButton jButtonTempPlus;
    private JButton jButtonTempMinus;
    private JButton jButtonHumidityPlus;
    private JButton jButtonHumidityMinus;
    private JTextArea jTextAreaLog;
    private JLabel jLabelHumidityActual;
    private JLabel jLabelHumidityWanted;
    private JLabel jLabelTempActual;
    private JLabel jLabelTempWanted;
    private JLabel jLabelDate;
    private float tempActual, tempWanted, humidityActual,humidityWanted;

    public SmartTermo(String title){
        super(title);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.pack();
        this.setContentPane(jPanelMain);


        this.tempActual=22;
        this.tempWanted=24;
        this.humidityActual=10;
        this.humidityWanted=7;


        this.jLabelTempActual.setText(tempActual+"º");
        this.jLabelTempWanted.setText(tempWanted+"º");
        this.jLabelHumidityActual.setText(humidityActual+"º");
        this.jLabelHumidityWanted.setText(humidityWanted+"º");
        this.jLabelDate.setText("Data: "+ new Date());

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Random r = new Random();
                double prob = r.nextDouble();
                if(tempActual<tempWanted && prob<=0.8){
                    tempActual+=0.5;
                }
                if (prob <= 0.3){
                    tempActual-=0.5;
                }
                jLabelTempActual.setText(tempActual+"º");

            }
        };

        Timer timer = new Timer("Timer");
        timer.scheduleAtFixedRate(task,0,1000);


        jButtonTempPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tempWanted+=0.5;
                jLabelTempWanted.setText(tempWanted+"º");
                jTextAreaLog.setText("Aumentou a temperatura para: "+tempWanted+ "\n"+jTextAreaLog.getText());
            }
        });
        jButtonTempMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tempWanted-=0.5;
                jLabelTempWanted.setText(tempWanted+"º");
                jTextAreaLog.setText("Diminuiu a temperatura para: "+tempWanted + "\n"+jTextAreaLog.getText());
            }
        });
        jButtonHumidityPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                humidityWanted+=5;
                jLabelHumidityWanted.setText(humidityWanted+"%");
                jTextAreaLog.setText("Aumentou a humidade para: "+humidityWanted+ "\n"+ jTextAreaLog.getText());
            }
        });
        jButtonHumidityMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                humidityWanted-=5;
                jLabelHumidityWanted.setText(humidityWanted+"%");
                jTextAreaLog.setText("Diminuiu a humidade para: "+humidityWanted+ "\n"+jTextAreaLog.getText());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new SmartTermo("Smart Termo");
        frame.setVisible(true);
    }

}

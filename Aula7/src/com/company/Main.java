package com.company;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Introduza uma comando:");
        String line = scanner.nextLine();
        Command Menu = Command.valueOf(line);

        if(Menu == Command.START) {
            // COMEÇAR...
            System.out.println("START");
        }
        else if(Menu == Command.SAVEGAME) {
            // GUARDAR...
            System.out.println("SAVEGAME");
        }
        else if(Menu == Command.LOADGAME) {
            // CARREGAR...
            System.out.println("LOADGAME");
        }
        else if(Menu == Command.HIGHSCORES) {
            // SCORES...
            System.out.println("HIGHSCORES");
        }
        else if(Menu == Command.QUIT) {
            // SAIR...
            System.out.println("QUIT");
        }
        else{
            System.out.println("NENHUMA OPCAO");
        }

        switch (Menu) {
            case START:
                System.out.println("START");
                break;
            case SAVEGAME:
                System.out.println("SAVEGAME");
                break;
            case LOADGAME:
                System.out.println("LOADGAME");
                break;
            case HIGHSCORES:
                System.out.println("HIGHSCORES");
                break;
            case QUIT:
                System.out.println("QUIT");
                break;
            default:
                System.out.println("Introduziu uma opcao invalida");
        }
*/
        List<Rational> racionais = new ArrayList<Rational>();
        Rational racional1 = new Rational(90,1);
        Rational racional2 = new Rational(2,2);
        Rational racional3 = new Rational(3,3);

        racionais.add(racional1);
        racionais.add(racional2);
        racionais.add(racional3);

        System.out.println("Lista por ordenar: ");
        for(Rational r: racionais){
            System.out.println("\t" + r.toString());
        }

        System.out.println("");

        System.out.println("Lista ordenada");
        Collections.sort(racionais);
        for(Rational r: racionais){
            System.out.println("\t" + r.toString());
        }
    }

    public enum Command {
        START, SAVEGAME, LOADGAME, HIGHSCORES, QUIT;
    }



}

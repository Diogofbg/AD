package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here

        CPU cpu = new CPU(4,64,3000);

        MobileDevice device = new MobileDevice("Apple", "Iphone", 2021, 2132132, cpu);
        //System.out.println(device.toString());

        MobilePhone phone = new MobilePhone("Samsung", "Galaxy", 2032, 434324,
                new CPU(8,64,4000), "4G");
        //System.out.println(phone.toString());


        Tablet tablet = new Tablet("Apple", "Ipad", 2015, 312321,
                new CPU(16,32,5000), true);
        //System.out.println(tablet.toString());

        ArrayList<MobileDevice> devices = new ArrayList<MobileDevice>();
        devices.add(device);
        devices.add(phone);
        devices.add(tablet);

        for(MobileDevice dev: devices){
            System.out.println(dev.toString());
        }

        Collections.sort(devices);
        System.out.println("");

        for(MobileDevice dev: devices){
            System.out.println(dev.toString());
        }

    }
}

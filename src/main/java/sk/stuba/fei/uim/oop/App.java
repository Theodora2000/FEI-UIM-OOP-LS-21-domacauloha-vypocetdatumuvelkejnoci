package sk.stuba.fei.uim.oop;

import java.util.Scanner;

public class App {

    public static void main(String[] args){

        System.out.println("Zadaj rok: ");
        Scanner myObj = new Scanner(System.in);
        int rok = myObj.nextInt();
        int a,b,c,m,n,d,e,marec,april;
        a = rok%19;
        b=  rok%4;
        c= rok%7;
        m=24;
        n=5;
        d=(19*a+m)%30;
        e=(n+2*b+4*c+6*d)%7;
        marec = 22+d+e;
        april = d+e-9;
        if(marec>31) {
            System.out.println("Apil: " + april);
        } else{
            System.out.println("Marec: " + marec);
        }



    }
}

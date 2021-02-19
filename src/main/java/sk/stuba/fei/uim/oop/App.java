package sk.stuba.fei.uim.oop;

import java.util.Scanner;

public class App {

    public static void main(String[] args){

        System.out.println("Zadaj rok: ");
        Scanner myObj = new Scanner(System.in);
        int rok = myObj.nextInt();
        int a,b,c,m,n,d,e;
        a = rok%19;
        b=  rok%4;
        c= rok%7;
        m=24;
        n=5;
        d=(19*a+m)%30;
        e=(n+2*b+4*c+6*d)%7;

        if (d+e<=9)
        {
            int day = 22+d+e;
            System.out.println( day + " marca");
        }
        else if (d==29 && e==6)
        {
            System.out.println("19 marec");

        }

        else if (d==28 && e==6 && a>10)
        {
            System.out.println("18 april");
        }

         else

        {
            int day;
            day = d+e-9;
            System.out.println(day+" aprila");
        }




    }
}

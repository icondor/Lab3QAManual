import java.util.Scanner;

/* basic demo of while and do while for manual testers */
public class Max {


    public static void main(String[] args) {



//        calculMinimMaxim();
//        calculMinimMaxim();

        afiseazaTablaICuCinci();

    }


    public static void afiseazaTablaICuCinci() {
        System.out.println("sdbdfsfasd");

        // 0x5=0
        // 1x5=5
        //2x5=10
        //...
        //10x5=50


       for(int a=0;a<=10;a++) {
            for (int i = 0; i <= 10; i++) {
                System.out.println(i + "x" + a + "=" + a * i);
            }
        }

    }


    public static void calculMinimMaxim(){
        Scanner citire= new Scanner(System.in);
        int lungimesir1,a=0;
        int sir1[],max=0;

        int min = 0;



        do {
            System.out.print("Introdu lungimea sirului= ");
            lungimesir1 = citire.nextInt();
        }
        while(lungimesir1<=0);



//        System.out.print("Introdu lungimea sirului= ");
//        lungimesir1 = citire.nextInt();
//        while(lungimesir1<1)
//        {
//            System.out.print("Introdu lungimea sirului= ");
//            lungimesir1 = citire.nextInt();
//        }


//        while(true) {
//            System.out.print("Introdu lungimea sirului= ");
//            lungimesir1 = citire.nextInt();
//            if(lungimesir1>0)
//                break;
//        }


        sir1= new int[lungimesir1]; // sirul va fi de lungimesir1 elemente

        max = Integer.MIN_VALUE;

        min = Integer.MAX_VALUE;

        while(a<lungimesir1){
            System.out.print("Introdu " +(a +1) +" element al sirului este= ");
            sir1[a]=citire.nextInt();
//            if(a==0)
//                max=sir1[a];

            if(max<=sir1[a]){
                max=sir1[a];
            }

            if(min>=sir1[a]){
                min=sir1[a];
            }



            a++;
        }

        if (a!=0) {

            System.out.print("Numarul cel mai mare din sir este=" + max);
            System.out.print("Numarul cel mai mare din sir este=" + min);
        }
        else
        {
            System.out.println("nu se poate cu valori mai mici sau egale cu zero ");
        }
    }

}
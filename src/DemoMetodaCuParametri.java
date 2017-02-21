/**
 * Created by icondor on 21/02/17.
 */
public class DemoMetodaCuParametri {

    public static void main(String[] args) {

        int[] a ={5,6,7,8};
        int max;
        max = getMax(a);
        System.out.println(max);


        int[] b ={-5,6,70,8};

        max = getMax(b);
        System.out.println(max);
    }

    public static int getMax(int[] parametru) { // semnatura metodei
        int max = Integer.MIN_VALUE;
        for(int i=0;i<parametru.length; i++) {
            if(max<=parametru[i]) {
                max=parametru[i];
            }

        }
        return max;

    }

}

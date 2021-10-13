package stuff;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] originmas = new int [] {0,5,10,0,11,14,13,4,11,8,8,7,1,4,12,11};
        int [] mas = new int [originmas.length];
        int max=0;
        int num=0;
        int step=0;

        do {
            if (step==1)
                for (int i=0; i<originmas.length;i++)
                    mas[i]= originmas[i];

            for (int i=0; i< originmas.length; i++)
                if(originmas[i]>max) {
                    max = originmas[i];
                    num=i;
                }
            originmas[num]=0;
                for (int i=num+1; max>0; max--) {
                    if (i>=originmas.length)
                    {i=0;}
                    originmas[i]++;
                    i++;
                }
                step++;
        }
        while (!Arrays.equals(originmas,mas));

        for (int i=0; i<originmas.length;i++)
            System.out.print(originmas[i]+",");
        System.out.println();
        System.out.println(step+"- cycle lenght");
    }
}


import java.util.Scanner;
import java.util.ArrayList;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        ArrayList linha1 = new ArrayList();
        ArrayList linha2 = new ArrayList();
        int menor1,maior1=0;
        int menor2,maior2=0;

        for (int i=0; i<4;i++){
            linha1.add(sc.nextInt());
        }
        for (int i=0; i<4;i++){
            linha2.add(sc.nextInt());
        }


        menor1=(Integer)linha1.get(0);
        maior1=(Integer)linha1.get(3);

        menor2=(Integer)linha2.get(0);
        maior2=(Integer)linha2.get(3);

        if ((menor1<maior2 && maior1<menor2)   || (menor1>maior2 && maior1>menor2)){
            System.out.print(0);
        }
        
        else if (menor1==menor2 && maior1==maior2){
            System.out.print(1);
        }

        else if (maior1>menor2 && maior2>menor1){
            System.out.print(1);
        }

        else if (maior1<menor2 && maior2<menor1){
            System.out.print(1);
        }

        sc.close();


    }
}

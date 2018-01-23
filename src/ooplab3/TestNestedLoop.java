package ooplab3;

public class TestNestedLoop {
    public static void main(String[] args) {
        int n=1;
        for (int i=1;i<=8;i++){
            //statement
            for(int j=1;j<=i;j++){
                //statement
                if(i==8||i==j||j==1) {
                    System.out.print("*\t");
                }else {
                    System.out.print(n + "\t");
                    n++;
                }
            }//j
            System.out.println();

        }//i
        System.out.println("\t\t");
        int x=1;
        int y = 15;
        for (int i=1;i<=8;i++){
            //statement
            for(int j=1;j<=8;j++){
                //statement
                if(i==8||i==j||j==1||j==8||i==1) {
                    System.out.print("*\t");
                }else if(i<j){
                    System.out.print(y + "\t");
                    y--;
                }else {
                    System.out.print(x+"\t");
                    x++;

                }
            }//j
            System.out.println();

        }//i


    }//main


}// class
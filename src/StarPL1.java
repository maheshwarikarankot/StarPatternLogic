package StarPatternLogic;

public class StarPL1 {
    public static void main(String[] args) {
        for(int i=0;i<=4;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
//  Reverse star pattern
        System.out.println("----------------------------");
        for(int i=0;i<=4;i++){
            for(int j=4;j>=i;j--){    // j=4 to print all 5 * in the 1st row
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------------------------------");
        for(int i=0;i<=4;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<=4;i++){
            for(int j=4;j>i;j--){    // j=4 to print all 5 * in the 1st row
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

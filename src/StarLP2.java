package StarPatternLogic;

public class StarLP2 {
    public static void main(String[] args) {
//        for(int i=1;i<=4;i++){
//            for(int j=4;j>=i;j--){
//                System.out.print(" ");
//            }
//            for(int k=1;k<=i;k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for(int i=1;i<=4;i++){
            for(int j=4;j>=i;j--){   // i<=no. & j=no. should be same to generate pyramid pattern
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }

}

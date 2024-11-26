import java.util.*;


public class TIC_TAC {
    public static boolean notMarked(int a,int b,int matrix[][]){
        if(matrix[a][b]==0) return true;
        else return false;
    }

    public static boolean isTicTac(int a,int b,int matrix[][]){

        int cnt1=0,cnt2=0;
        for(int i=0;i<matrix.length;i++){
            if(matrix[a][i]==1) cnt1++;
            if(matrix[i][b]==1) cnt2++;
        }
        if(cnt1==3 || cnt2==3) return true;
        else return false;


    }
    public static void printMatrix(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {


        int [][]matrix=new int[3][3];
        Scanner sc=new Scanner(System.in);

        System.out.println("Your Initial TIC_TAC Board");
        printMatrix(matrix);

        boolean user=true;
        while(true){
            int a,b;
            System.out.println("Enter your Indices (0,0) to (2,2)");
            a=sc.nextInt(); b=sc.nextInt();
            if(a<0 || b<0 || a>2 || b>2){
                System.out.println("Invalid choice please select b/w (0,0) to (3,3)");
            }
            else{

                boolean state=notMarked(a,b,matrix);
                if(state){
                    matrix[a][b]=1;

                }
                else{
                    //ask the user that it is already marked select another index
                    System.out.println("it is already marked select the another indexes");
                }

                boolean winState=isTicTac(a,b,matrix);
                if(winState){
                    System.out.println("You won!");
                    printMatrix(matrix);
                    break;
                }

            }





        }



    }
}

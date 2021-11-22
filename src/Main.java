import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Scanner s = new Scanner(System.in);

        int i=1,j=1,n;
        System.out.print("Enter N: ");
        n = s.nextInt();

        int p = 2*n-1,x=2*n+1;

        for(i = 1;i<=p;i++){
            for(j=1;j<=x;j++){
                if(i<=j && j<n+1 && i!=n){
                    System.out.print(" ");
                }
                else if(i>=j && i!=n && j<n+1 && i+j >=2*n){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }

    }
}

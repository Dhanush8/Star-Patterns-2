import java.util.Scanner;

public class project {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the number of lines: ");
        int number=sc.nextInt();
        
        for(int x=1;x<=number;x++)
        { 
            for(int y=1;y<=x;y++)
            {   
                System.out.print("* ");
            }
            System.out.println("");
        }
        for(int x=1;x<=number;x++)
        {    
            for(int z=number-x;z>=1;z--)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
}

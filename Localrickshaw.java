import java.util.Scanner;


public class Localrickshaw
{
    String travel;
    
    public static void main (String[] args)
    {
        int totalfare;
        Scanner sc = new Scanner (System.in);
        System.out.println("HELLO CUSTOMER");
        System.out.println("Enter wheather you are local or not");
        
    
        String customer=sc.nextLine();
        System.out.println(customer);
        
        System.out.println("Travel time");
        String travel=sc.nextLine();
        System.out.println(travel);
        
        System.out.println("Distance");
        int distance=sc.nextInt();
        System.out.println(distance+"km");
        
        System.out.println("Time");
        int time =sc.nextInt();
        System.out.println(time+"minutes");
        
        if (travel=="Day")
        {
        totalfare = distance*100;
        System.out.println("Rs"+totalfare);
    }
    
        else{
        totalfare=distance*120;
        System.out.println("Rs"+totalfare);}
    }
    
    
}
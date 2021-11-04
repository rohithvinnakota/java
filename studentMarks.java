import java.util.*;
public class studentMarks 
    {
    public static void main(String args[])
        {
             Scanner sh=new Scanner(System.in);

      System.out.println("Enter the name  of student:");

            String name=sh.nextLine();

        System.out.println("Enter roll number:");

                int roll=sh.nextInt();

        System.out.println("Enter the Computer Science marks:");

            int computer_science=sh.nextInt();

        System.out.println("Enter the Maths marks:");
           
                int maths=sh.nextInt();

        System.out.println("Enter the English marks:");

            int english=sh.nextInt();
        
        System.out.println("Enter the Telugu marks:");

            int telugu=sh.nextInt();
            

        int total=telugu+english+computer_science+maths;

        int average=total/4;

           

        System.out.println("\t\t\t\tANDHRA LAYOLA DEGEER COLLEGE");
        System.out.println("\t\t\t\t\tAUTONAMOUS");
        System.out.print("\t\tStudent Name:"+name);
        System.out.println("\t\t\t\t\tRoll number:"+roll);
        System.out.println("\t\t\t\t\tStudent Marks");
        System.out.print("\t\tSUBJECT");
        System.out.println("\t\t\t\t\tMARKS");

        System.out.println("\t\tTelugu\t\t\t\t\t"+telugu);
        System.out.println("\t\tEnglish\t\t\t\t\t"+english);
        System.out.println("\t\tComputer Science\t\t\t"+computer_science);
        System.out.println("\t\tMaths\t\t\t\t\t"+maths);
        System.out.print("\t\tTotal Marks\t\t\t\t"+total);
        System.out.println("\t\t\t\t\tAverage:"+average);
    
    

        if(average<=100 && average>=80)
        {
                System.out.println("\t\t\t\tGRADE:A GRADE");
        }
        else if(average<=70 && average>=60)
        {
            System.out.println("\t\t\t\tGRADE:B GRADE");
        }
        else if(average<=50 && average>=40)
        {
                System.out.println("\t\t\t\tGRADE:C GRADE");
        }
        else if(average<=40 && average>=30)
        {
            System.out.println("\t\t\t\tGRADE:D GRADE");
        }
        else
        {
            System.out.println("\t\t\t\tGRADE:FAIL");
        }

    }
}
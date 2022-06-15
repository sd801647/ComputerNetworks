import java.util.Scanner;


public class crcsender {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter User data stream : ");
        String msg = sc.nextLine();
        System.out.println("Enter the CRC generator : ");
        String generator = sc.nextLine();
        
        int data[] = new int[msg.length() + generator.length() - 1];
        int divisor[] = new int[generator.length()];

        for(int i=0; i<msg.length(); i++)
        {
            data[i] = Integer.parseInt(msg.charAt(i)+"");
        }
        for(int i=0;i<generator.length(); i++)
        {
            divisor[i] = Integer.parseInt(generator.charAt(i) + "");
        }

        //calculate CRC
        for(int i=0;i<msg.length();i++)
        {
            if(data[i] == 1)
            {
                for(int j=0;j<divisor.length;j++)
                {
                    data[i+j] = divisor[j]^data[i+j];
                }
            }
        }

        //display CRC
        System.out.println("The Codeword is : ");
        for(int i=0;i<msg.length();i++)
        {
            data[i] = Integer.parseInt(msg.charAt(i) + "");
        }
        for(int i=0;i<data.length;i++)
        {
            System.out.print(data[i]);
        }
        System.out.println();
        System.out.println("Data is sent from Sender side");
    }
    
}

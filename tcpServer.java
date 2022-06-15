import java.io.*;
import java.net.*;

public class tcpServer {
    private static Socket socket;
    public static void main(String args[])
    {
        try{
            int port = 25000;
            ServerSocket serverSocket = new ServerSocket(port); 
            socket = serverSocket.accept();
            System.out.println("Server Started and listening to the port 25000");
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String number = br.readLine();
            System.out.println("Received from Client " + number);
            BufferedReader bufferRead= new BufferedReader(new InputStreamReader(System.in));
            String s = bufferRead.readLine();
            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);

            bw.write(s);
            bw.flush();

            System.out.println("Sent to " + socket + "Client : " + s);
        }

        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try{
                socket.close();
            }
            catch(Exception e) {}
        }
    }
    
}

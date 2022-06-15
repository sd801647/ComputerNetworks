import java.io.*;
import java.net.*;


public class tcpClient {
    private static Socket socket;
    public static void main(String[] args) {
        try{
            String host = "127.0.0.1";
            int port = 25000;
            socket = new Socket(host, 25000);
            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            String s = bufferRead.readLine();
            String sendMessage = s + "\n";
            bw.write(sendMessage);
            bw.flush();
            System.out.println("Send to server " + sendMessage);
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            System.out.println(socket);
            String message = br.readLine();
            System.out.println("Received from Server " + message);
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

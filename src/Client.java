import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String args[]){
        try{
            System.out.println("ClientSide Started!");
            Socket soc = new Socket("localhost",9806);
            BufferedReader userinput = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a string::");
            String str = userinput.readLine();
            PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
            out.println(str);
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            System.out.println(in.readLine());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

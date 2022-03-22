import java.net.*;  
import java.io.*;  
class client{  
    public static void main(String args[])throws Exception{  
        Socket s=new Socket("localhost",60000);  
        DataInputStream din=new DataInputStream(s.getInputStream());  
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
          
        String str="",str2="";  
        while(!str.equals("stop")){  
            if(str.equals("stop")){
                s.close();
                dout.close(); 
            }
        str=br.readLine();  
        dout.write(("HELO\n").getBytes());
        dout.flush();  
        str2=din.readUTF();  
        System.out.println("Server says: "+str2);  
        }  
          
        dout.close();  
        s.close();  
        }}  
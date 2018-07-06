/**
 * 
 */
package localrep.socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 谷春
 *
 */
public class serverSocket1 {
    
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(6666);
        while (true) {
            Socket socket = serverSocket.accept();
            InputStream in = socket.getInputStream();
            DataInputStream da = new DataInputStream(in);
            String aa = da.readUTF();
            System.out.println(aa);
            
        }
    }

}

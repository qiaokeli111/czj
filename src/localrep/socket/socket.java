/**
 * 
 */
package localrep.socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author 谷春
 *
 */
public class socket {
public static void main(String[] args) throws UnknownHostException, IOException, InterruptedException {
    Socket socket = new Socket("127.0.0.1", 6666);
    OutputStream oo = socket.getOutputStream();
    DataOutputStream da = new DataOutputStream(oo);
    Thread.sleep(1000);
    da.writeUTF("jiayou!");
}
}

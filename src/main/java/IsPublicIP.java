import com.google.common.net.InetAddresses;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.http.conn.util.InetAddressUtils;


import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @创建人 xiang
 * @创建时间 2019/5/28
 */
public class IsPublicIP extends UDF {

    public boolean evaluate(String ip){
        try {

            InetAddress address=InetAddress.getByAddress(ip.getBytes());
               if(address.isLoopbackAddress()||address.isSiteLocalAddress()){
                   return false;
               }

        } catch (UnknownHostException e) {
            return false;

        }
        return true;
    }

}

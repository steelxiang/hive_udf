import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.http.conn.util.InetAddressUtils;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @创建人 xiang
 * @创建时间 2019/5/28
 */
public class IsIP extends UDF {
    public boolean evaluate(String ip){

        return   InetAddressUtils.isIPv4Address(ip);
    }

}

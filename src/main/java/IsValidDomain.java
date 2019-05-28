import com.google.common.net.InternetDomainName;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.http.conn.util.InetAddressUtils;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @创建人 xiang
 * @创建时间 2019/5/28
 */
public class IsValidDomain extends UDF {

    public boolean evaluate(String domain){

        return InternetDomainName.isValid(domain);
    }

}

import com.yj.regex.MyRegex;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * @Author yJade
 * @Date 2022-12-04 14:23
 * @Package PACKAGE_NAME
 */
public class MyRegexTest {
    @Test
    void testIsEmail() {
        ArrayList<String> emails = new ArrayList<>();
        emails.add("123193@qq.com");
        emails.add("@qq.com");
        emails.add("1231@.com");
        emails.add("123@zzz.");

        for (String email : emails) {
            System.out.println(email + " is a correct Email address? " + MyRegex.isEmail(email));
        }
    }
}

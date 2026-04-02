package okhttp3;

import java.nio.charset.Charset;
import okio.ByteString;
/* JADX WARN: Classes with same name are omitted:
  classes4.dex
 */
/* loaded from: classes3.dex */
public final class Credentials {
    private Credentials() {
    }

    public static String basic(String userName, String password) {
        return basic(userName, password, Charset.forName("ISO-8859-1"));
    }

    public static String basic(String userName, String password, Charset charset) {
        String usernameAndPassword = userName + ":" + password;
        byte[] bytes = usernameAndPassword.getBytes(charset);
        String encoded = ByteString.of(bytes).base64();
        return "Basic " + encoded;
    }
}

package bo.app;

import com.google.common.net.HttpHeaders;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class n4 {
    public static final n4 a = new n4();

    private n4() {
    }

    public static final Map a() {
        HashMap hashMap = new HashMap();
        hashMap.put(HttpHeaders.ACCEPT_ENCODING, "gzip, deflate");
        hashMap.put(HttpHeaders.CONTENT_TYPE, "application/json");
        return hashMap;
    }
}

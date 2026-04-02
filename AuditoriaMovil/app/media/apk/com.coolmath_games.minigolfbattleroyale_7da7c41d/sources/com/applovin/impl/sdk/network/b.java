package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.r;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.p;
import com.applovin.impl.sdk.utils.q;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.xml.sax.SAXException;
/* loaded from: classes.dex */
public class b {
    private static final List<String> a = Arrays.asList("5.0/i", "4.0/ad", "1.0/mediate");
    private final k b;
    private final r c;
    private C0030b d;

    /* loaded from: classes.dex */
    public static class a {
        private long a;
        private long b;

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j) {
            this.a = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(long j) {
            this.b = j;
        }

        public long a() {
            return this.a;
        }

        public long b() {
            return this.b;
        }
    }

    /* renamed from: com.applovin.impl.sdk.network.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0030b {
        private final long a = System.currentTimeMillis();
        private final String b;
        private final long c;
        private final long d;

        C0030b(String str, long j, long j2) {
            this.b = str;
            this.c = j;
            this.d = j2;
        }

        public long a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }

        public long c() {
            return this.c;
        }

        public long d() {
            return this.d;
        }

        public String toString() {
            return "RequestMeasurement{timestampMillis=" + this.a + ", urlHostAndPathString='" + this.b + "', responseSize=" + this.c + ", connectionTimeMillis=" + this.d + '}';
        }
    }

    /* loaded from: classes.dex */
    public interface c<T> {
        void a(int i, String str, T t);

        void a(T t, int i);
    }

    public b(k kVar) {
        this.b = kVar;
        this.c = kVar.z();
    }

    private int a(Throwable th) {
        if (th instanceof UnknownHostException) {
            return -1009;
        }
        if (th instanceof SocketTimeoutException) {
            return -1001;
        }
        if (th instanceof IOException) {
            return -100;
        }
        return th instanceof JSONException ? -104 : -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> T a(String str, T t) throws JSONException, SAXException, ClassCastException {
        if (t == null) {
            return str;
        }
        if (str != 0 && str.length() >= 3) {
            if (t instanceof JSONObject) {
                return (T) new JSONObject(str);
            }
            if (t instanceof p) {
                return (T) q.a(str, this.b);
            }
            if (t instanceof String) {
                return str;
            }
            r rVar = this.c;
            rVar.e("ConnectionManager", "Failed to process response of type '" + t.getClass().getName() + "'");
        }
        return t;
    }

    private String a(String str) {
        return "#" + str.hashCode() + " \"" + StringUtils.getHostAndPath(str) + "\"";
    }

    private HttpURLConnection a(String str, String str2, Map<String, String> map, int i) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(str2);
        httpURLConnection.setConnectTimeout(i < 0 ? ((Integer) this.b.a(com.applovin.impl.sdk.c.b.cR)).intValue() : i);
        if (i < 0) {
            i = ((Integer) this.b.a(com.applovin.impl.sdk.c.b.cS)).intValue();
        }
        httpURLConnection.setReadTimeout(i);
        httpURLConnection.setDefaultUseCaches(false);
        httpURLConnection.setAllowUserInteraction(false);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setDoInput(true);
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        return httpURLConnection;
    }

    private void a(int i, String str) {
        if (((Boolean) this.b.a(com.applovin.impl.sdk.c.b.af)).booleanValue()) {
            try {
                e.a(i, str, this.b.J());
            } catch (Throwable th) {
                r z = this.b.z();
                z.b("ConnectionManager", "Failed to track response code for " + a(str), th);
            }
        }
    }

    private void a(String str, String str2, int i, long j) {
        r rVar = this.c;
        rVar.c("ConnectionManager", "Successful " + str + " returned " + i + " in " + (((float) (System.currentTimeMillis() - j)) / 1000.0f) + " s over " + com.applovin.impl.sdk.utils.g.f(this.b) + " to " + a(str2));
    }

    private void a(String str, String str2, int i, long j, Throwable th) {
        r rVar = this.c;
        rVar.b("ConnectionManager", "Failed " + str + " returned " + i + " in " + (((float) (System.currentTimeMillis() - j)) / 1000.0f) + " s over " + com.applovin.impl.sdk.utils.g.f(this.b) + " to " + a(str2), th);
    }

    public C0030b a() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0412 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v23, types: [int] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r27v0, types: [com.applovin.impl.sdk.network.b] */
    /* JADX WARN: Type inference failed for: r30v0, types: [com.applovin.impl.sdk.network.b$c<T>, com.applovin.impl.sdk.network.b$c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> void a(com.applovin.impl.sdk.network.c<T> r28, com.applovin.impl.sdk.network.b.a r29, com.applovin.impl.sdk.network.b.c<T> r30) {
        /*
            Method dump skipped, instructions count: 1169
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.network.b.a(com.applovin.impl.sdk.network.c, com.applovin.impl.sdk.network.b$a, com.applovin.impl.sdk.network.b$c):void");
    }
}

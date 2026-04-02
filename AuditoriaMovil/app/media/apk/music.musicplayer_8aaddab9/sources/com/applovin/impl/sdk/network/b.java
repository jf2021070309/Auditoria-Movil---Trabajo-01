package com.applovin.impl.sdk.network;

import ch.qos.logback.core.CoreConstants;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.q;
import com.applovin.impl.sdk.utils.r;
import com.applovin.impl.sdk.v;
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

    /* renamed from: b  reason: collision with root package name */
    private final m f4182b;

    /* renamed from: c  reason: collision with root package name */
    private final v f4183c;

    /* renamed from: d  reason: collision with root package name */
    private C0092b f4184d;

    /* loaded from: classes.dex */
    public static class a {
        private long a;

        /* renamed from: b  reason: collision with root package name */
        private long f4185b;

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j2) {
            this.a = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(long j2) {
            this.f4185b = j2;
        }

        public long a() {
            return this.a;
        }

        public long b() {
            return this.f4185b;
        }
    }

    /* renamed from: com.applovin.impl.sdk.network.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0092b {
        private final long a = System.currentTimeMillis();

        /* renamed from: b  reason: collision with root package name */
        private final String f4186b;

        /* renamed from: c  reason: collision with root package name */
        private final long f4187c;

        /* renamed from: d  reason: collision with root package name */
        private final long f4188d;

        public C0092b(String str, long j2, long j3) {
            this.f4186b = str;
            this.f4187c = j2;
            this.f4188d = j3;
        }

        public long a() {
            return this.a;
        }

        public String b() {
            return this.f4186b;
        }

        public long c() {
            return this.f4187c;
        }

        public long d() {
            return this.f4188d;
        }

        public String toString() {
            StringBuilder y = e.a.d.a.a.y("RequestMeasurement{timestampMillis=");
            y.append(this.a);
            y.append(", urlHostAndPathString='");
            e.a.d.a.a.J(y, this.f4186b, CoreConstants.SINGLE_QUOTE_CHAR, ", responseSize=");
            y.append(this.f4187c);
            y.append(", connectionTimeMillis=");
            y.append(this.f4188d);
            y.append('}');
            return y.toString();
        }
    }

    /* loaded from: classes.dex */
    public interface c<T> {
        void a(int i2, String str, T t);

        void a(T t, int i2);
    }

    public b(m mVar) {
        this.f4182b = mVar;
        this.f4183c = mVar.B();
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
            if (t instanceof q) {
                return (T) r.a(str, this.f4182b);
            }
            if (t instanceof String) {
                return str;
            }
            v vVar = this.f4183c;
            StringBuilder y = e.a.d.a.a.y("Failed to process response of type '");
            y.append(t.getClass().getName());
            y.append("'");
            vVar.e("ConnectionManager", y.toString());
        }
        return t;
    }

    private String a(String str) {
        StringBuilder y = e.a.d.a.a.y("#");
        y.append(str.hashCode());
        y.append(" \"");
        y.append(StringUtils.getHostAndPath(str));
        y.append("\"");
        return y.toString();
    }

    private HttpURLConnection a(String str, String str2, Map<String, String> map, int i2) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(str2);
        httpURLConnection.setConnectTimeout(i2 < 0 ? ((Integer) this.f4182b.a(com.applovin.impl.sdk.c.b.cR)).intValue() : i2);
        if (i2 < 0) {
            i2 = ((Integer) this.f4182b.a(com.applovin.impl.sdk.c.b.cS)).intValue();
        }
        httpURLConnection.setReadTimeout(i2);
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

    private void a(int i2, String str) {
        if (((Boolean) this.f4182b.a(com.applovin.impl.sdk.c.b.am)).booleanValue()) {
            try {
                e.a(i2, str, this.f4182b.L());
            } catch (Throwable th) {
                v B = this.f4182b.B();
                StringBuilder y = e.a.d.a.a.y("Failed to track response code for ");
                y.append(a(str));
                B.b("ConnectionManager", y.toString(), th);
            }
        }
    }

    private void a(String str, String str2, int i2, long j2) {
        v vVar = this.f4183c;
        vVar.c("ConnectionManager", "Successful " + str + " returned " + i2 + " in " + (((float) (System.currentTimeMillis() - j2)) / 1000.0f) + " s over " + com.applovin.impl.sdk.utils.h.f(this.f4182b) + " to " + a(str2));
    }

    private void a(String str, String str2, int i2, long j2, Throwable th) {
        v vVar = this.f4183c;
        vVar.b("ConnectionManager", "Failed " + str + " returned " + i2 + " in " + (((float) (System.currentTimeMillis() - j2)) / 1000.0f) + " s over " + com.applovin.impl.sdk.utils.h.f(this.f4182b) + " to " + a(str2), th);
    }

    public C0092b a() {
        return this.f4184d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x043c A[EXC_TOP_SPLITTER, SYNTHETIC] */
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
            Method dump skipped, instructions count: 1213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.network.b.a(com.applovin.impl.sdk.network.c, com.applovin.impl.sdk.network.b$a, com.applovin.impl.sdk.network.b$c):void");
    }
}

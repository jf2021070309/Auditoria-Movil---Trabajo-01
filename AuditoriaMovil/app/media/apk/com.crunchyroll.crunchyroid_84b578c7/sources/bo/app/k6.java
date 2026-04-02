package bo.app;

import com.braze.support.BrazeLogger;
import com.google.android.gms.common.internal.ImagesContract;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
/* loaded from: classes.dex */
public final class k6 {
    public static final k6 a = new k6();
    private static o5 b;

    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final a b = new a();

        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Exception initializing static TLS socket factory.";
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final b b = new b();

        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Exception setting TLS socket factory on url connection.";
        }
    }

    static {
        try {
            b = new o5();
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(a, BrazeLogger.Priority.E, e, a.b);
        }
    }

    private k6() {
    }

    public final HttpURLConnection a(URL url) {
        com.amazon.aps.iva.yb0.j.f(url, ImagesContract.URL);
        URLConnection openConnection = url.openConnection();
        if (com.amazon.aps.iva.yb0.j.a(url.getProtocol(), "https")) {
            try {
                com.amazon.aps.iva.yb0.j.d(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                o5 o5Var = b;
                if (o5Var != null) {
                    httpsURLConnection.setSSLSocketFactory(o5Var);
                } else {
                    com.amazon.aps.iva.yb0.j.m("socketFactory");
                    throw null;
                }
            } catch (Exception e) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, b.b);
            }
        }
        com.amazon.aps.iva.yb0.j.d(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        return (HttpURLConnection) openConnection;
    }
}

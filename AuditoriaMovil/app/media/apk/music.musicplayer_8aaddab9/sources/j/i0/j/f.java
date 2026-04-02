package j.i0.j;

import j.w;
import j.x;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
/* loaded from: classes.dex */
public class f {
    public static final f a;

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f9511b;

    static {
        Class<?> cls;
        f fVar;
        boolean z;
        e eVar;
        e eVar2;
        d dVar = null;
        try {
            try {
                cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            } catch (ClassNotFoundException unused) {
                fVar = null;
            }
        } catch (ClassNotFoundException unused2) {
            cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
        }
        Class<?> cls2 = cls;
        e eVar3 = new e(null, "setUseSessionTickets", Boolean.TYPE);
        e eVar4 = new e(null, "setHostname", String.class);
        if (Security.getProvider("GMSCore_OpenSSL") == null) {
            try {
                Class.forName("android.net.Network");
            } catch (ClassNotFoundException unused3) {
                z = false;
            }
        }
        z = true;
        if (z) {
            eVar = new e(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            eVar2 = new e(null, "setAlpnProtocols", byte[].class);
        } else {
            eVar = null;
            eVar2 = null;
        }
        fVar = new a(cls2, eVar3, eVar4, eVar, eVar2);
        if (fVar == null) {
            if (!("conscrypt".equals(System.getProperty("okhttp.platform")) ? true : "Conscrypt".equals(Security.getProviders()[0].getName())) || (fVar = b.n()) == null) {
                try {
                    fVar = new c(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
                } catch (NoSuchMethodException unused4) {
                    fVar = null;
                }
                if (fVar == null) {
                    try {
                        Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                        dVar = new d(cls3.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider")), cls3.getMethod("get", SSLSocket.class), cls3.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"));
                    } catch (ClassNotFoundException | NoSuchMethodException unused5) {
                    }
                    fVar = dVar != null ? dVar : new f();
                }
            }
        }
        a = fVar;
        f9511b = Logger.getLogger(w.class.getName());
    }

    public static List<String> b(List<x> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            x xVar = list.get(i2);
            if (xVar != x.HTTP_1_0) {
                arrayList.add(xVar.toString());
            }
        }
        return arrayList;
    }

    public void a(SSLSocket sSLSocket) {
    }

    public j.i0.l.c c(X509TrustManager x509TrustManager) {
        return new j.i0.l.a(d(x509TrustManager));
    }

    public j.i0.l.e d(X509TrustManager x509TrustManager) {
        return new j.i0.l.b(x509TrustManager.getAcceptedIssuers());
    }

    public void e(SSLSocketFactory sSLSocketFactory) {
    }

    public void f(SSLSocket sSLSocket, @Nullable String str, List<x> list) {
    }

    public void g(Socket socket, InetSocketAddress inetSocketAddress, int i2) throws IOException {
        socket.connect(inetSocketAddress, i2);
    }

    public SSLContext h() {
        if ("1.7".equals(System.getProperty("java.specification.version"))) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException("No TLS provider", e2);
        }
    }

    @Nullable
    public String i(SSLSocket sSLSocket) {
        return null;
    }

    public Object j(String str) {
        if (f9511b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public boolean k(String str) {
        return true;
    }

    public void l(int i2, String str, @Nullable Throwable th) {
        f9511b.log(i2 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void m(String str, Object obj) {
        if (obj == null) {
            str = e.a.d.a.a.k(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        l(5, str, (Throwable) obj);
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}

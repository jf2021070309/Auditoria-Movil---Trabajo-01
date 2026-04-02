package okhttp3.internal.platform;

import android.util.Log;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import okhttp3.internal.Util;
import okhttp3.internal.tls.CertificateChainCleaner;
/* loaded from: classes4.dex */
class a extends Platform {
    private final Class<?> a;
    private final d<Socket> b;
    private final d<Socket> c;
    private final d<Socket> d;
    private final d<Socket> e;
    private final b f = b.a();

    public a(Class<?> cls, d<Socket> dVar, d<Socket> dVar2, d<Socket> dVar3, d<Socket> dVar4) {
        this.a = cls;
        this.b = dVar;
        this.c = dVar2;
        this.d = dVar3;
        this.e = dVar4;
    }

    @Override // okhttp3.internal.platform.Platform
    public void connectSocket(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (!Util.isAndroidGetsocknameError(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (SecurityException e2) {
            IOException iOException = new IOException("Exception in connect");
            iOException.initCause(e2);
            throw iOException;
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        Object a;
        Object a2 = a(sSLSocketFactory, this.a, "sslParameters");
        if (a2 == null) {
            try {
                a = a(sSLSocketFactory, Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, sSLSocketFactory.getClass().getClassLoader()), "sslParameters");
            } catch (ClassNotFoundException e) {
                return super.trustManager(sSLSocketFactory);
            }
        } else {
            a = a2;
        }
        X509TrustManager x509TrustManager = (X509TrustManager) a(a, X509TrustManager.class, "x509TrustManager");
        return x509TrustManager != null ? x509TrustManager : (X509TrustManager) a(a, X509TrustManager.class, "trustManager");
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<Protocol> list) {
        if (str != null) {
            this.b.b(sSLSocket, true);
            this.c.b(sSLSocket, str);
        }
        if (this.e != null && this.e.a((d<Socket>) sSLSocket)) {
            this.e.d(sSLSocket, a(list));
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        if (this.d != null && this.d.a((d<Socket>) sSLSocket)) {
            byte[] bArr = (byte[]) this.d.d(sSLSocket, new Object[0]);
            return bArr != null ? new String(bArr, Util.UTF_8) : null;
        }
        return null;
    }

    @Override // okhttp3.internal.platform.Platform
    public void log(int i, String str, Throwable th) {
        int min;
        int i2 = i == 5 ? 5 : 3;
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int i3 = 0;
        int length = str.length();
        while (i3 < length) {
            int indexOf = str.indexOf(10, i3);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i3 + 4000);
                Log.println(i2, "OkHttp", str.substring(i3, min));
                if (min >= indexOf) {
                    break;
                }
                i3 = min;
            }
            i3 = min + 1;
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public Object getStackTraceForCloseable(String str) {
        return this.f.a(str);
    }

    @Override // okhttp3.internal.platform.Platform
    public void logCloseableLeak(String str, Object obj) {
        if (!this.f.a(obj)) {
            log(5, str, null);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public boolean isCleartextTrafficPermitted(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), str)).booleanValue();
        } catch (ClassNotFoundException e) {
            return super.isCleartextTrafficPermitted(str);
        } catch (IllegalAccessException e2) {
            throw new AssertionError();
        } catch (IllegalArgumentException e3) {
            throw new AssertionError();
        } catch (NoSuchMethodException e4) {
            return super.isCleartextTrafficPermitted(str);
        } catch (InvocationTargetException e5) {
            throw new AssertionError();
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public CertificateChainCleaner buildCertificateChainCleaner(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new C0341a(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception e) {
            return super.buildCertificateChainCleaner(x509TrustManager);
        }
    }

    public static Platform a() {
        Class<?> cls;
        d dVar;
        d dVar2;
        d dVar3;
        try {
            try {
                cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            } catch (ClassNotFoundException e) {
                cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            }
            d dVar4 = new d(null, "setUseSessionTickets", Boolean.TYPE);
            d dVar5 = new d(null, "setHostname", String.class);
            try {
                Class.forName("android.net.Network");
                dVar = new d(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            } catch (ClassNotFoundException e2) {
                dVar = null;
            }
            try {
                dVar2 = new d(null, "setAlpnProtocols", byte[].class);
                dVar3 = dVar;
            } catch (ClassNotFoundException e3) {
                dVar2 = null;
                dVar3 = dVar;
                return new a(cls, dVar4, dVar5, dVar3, dVar2);
            }
            return new a(cls, dVar4, dVar5, dVar3, dVar2);
        } catch (ClassNotFoundException e4) {
            return null;
        }
    }

    /* renamed from: okhttp3.internal.platform.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0341a extends CertificateChainCleaner {
        private final Object a;
        private final Method b;

        C0341a(Object obj, Method method) {
            this.a = obj;
            this.b = method;
        }

        @Override // okhttp3.internal.tls.CertificateChainCleaner
        public List<Certificate> clean(List<Certificate> list, String str) {
            try {
                return (List) this.b.invoke(this.a, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
                sSLPeerUnverifiedException.initCause(e2);
                throw sSLPeerUnverifiedException;
            }
        }

        public boolean equals(Object obj) {
            return obj instanceof C0341a;
        }

        public int hashCode() {
            return 0;
        }
    }

    /* loaded from: classes4.dex */
    static final class b {
        private final Method a;
        private final Method b;
        private final Method c;

        b(Method method, Method method2, Method method3) {
            this.a = method;
            this.b = method2;
            this.c = method3;
        }

        Object a(String str) {
            if (this.a != null) {
                try {
                    Object invoke = this.a.invoke(null, new Object[0]);
                    this.b.invoke(invoke, str);
                    return invoke;
                } catch (Exception e) {
                }
            }
            return null;
        }

        boolean a(Object obj) {
            if (obj != null) {
                try {
                    this.c.invoke(obj, new Object[0]);
                    return true;
                } catch (Exception e) {
                    return false;
                }
            }
            return false;
        }

        static b a() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                method2 = cls.getMethod(MonitorConstants.CONNECT_TYPE_GET, new Class[0]);
                method = cls.getMethod("open", String.class);
                method3 = cls.getMethod("warnIfOpen", new Class[0]);
            } catch (Exception e) {
                method = null;
                method2 = null;
            }
            return new b(method2, method, method3);
        }
    }
}

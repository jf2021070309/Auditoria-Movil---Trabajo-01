package j.i0.j;

import android.os.Build;
import android.util.Log;
import j.x;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
/* loaded from: classes.dex */
public class a extends f {

    /* renamed from: c  reason: collision with root package name */
    public final e<Socket> f9491c;

    /* renamed from: d  reason: collision with root package name */
    public final e<Socket> f9492d;

    /* renamed from: e  reason: collision with root package name */
    public final e<Socket> f9493e;

    /* renamed from: f  reason: collision with root package name */
    public final e<Socket> f9494f;

    /* renamed from: g  reason: collision with root package name */
    public final c f9495g;

    /* renamed from: j.i0.j.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0210a extends j.i0.l.c {
        public final Object a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f9496b;

        public C0210a(Object obj, Method method) {
            this.a = obj;
            this.f9496b = method;
        }

        @Override // j.i0.l.c
        public List<Certificate> a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
            try {
                return (List) this.f9496b.invoke(this.a, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e3.getMessage());
                sSLPeerUnverifiedException.initCause(e3);
                throw sSLPeerUnverifiedException;
            }
        }

        public boolean equals(Object obj) {
            return obj instanceof C0210a;
        }

        public int hashCode() {
            return 0;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements j.i0.l.e {
        public final X509TrustManager a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f9497b;

        public b(X509TrustManager x509TrustManager, Method method) {
            this.f9497b = method;
            this.a = x509TrustManager;
        }

        @Override // j.i0.l.e
        public X509Certificate a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f9497b.invoke(this.a, x509Certificate);
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
                return null;
            } catch (IllegalAccessException e2) {
                throw j.i0.c.a("unable to get issues and signature", e2);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.a.equals(bVar.a) && this.f9497b.equals(bVar.f9497b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f9497b.hashCode() * 31) + this.a.hashCode();
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {
        public final Method a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f9498b;

        /* renamed from: c  reason: collision with root package name */
        public final Method f9499c;

        public c(Method method, Method method2, Method method3) {
            this.a = method;
            this.f9498b = method2;
            this.f9499c = method3;
        }
    }

    public a(Class<?> cls, e<Socket> eVar, e<Socket> eVar2, e<Socket> eVar3, e<Socket> eVar4) {
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", new Class[0]);
            method2 = cls2.getMethod("open", String.class);
            method = cls2.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f9495g = new c(method3, method2, method);
        this.f9491c = eVar;
        this.f9492d = eVar2;
        this.f9493e = eVar3;
        this.f9494f = eVar4;
    }

    @Override // j.i0.j.f
    public j.i0.l.c c(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new C0210a(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return new j.i0.l.a(d(x509TrustManager));
        }
    }

    @Override // j.i0.j.f
    public j.i0.l.e d(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return new j.i0.l.b(x509TrustManager.getAcceptedIssuers());
        }
    }

    @Override // j.i0.j.f
    public void f(SSLSocket sSLSocket, String str, List<x> list) {
        if (str != null) {
            this.f9491c.c(sSLSocket, Boolean.TRUE);
            this.f9492d.c(sSLSocket, str);
        }
        e<Socket> eVar = this.f9494f;
        if (eVar != null) {
            if (eVar.a(sSLSocket.getClass()) != null) {
                Object[] objArr = new Object[1];
                k.d dVar = new k.d();
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    x xVar = list.get(i2);
                    if (xVar != x.HTTP_1_0) {
                        dVar.h0(xVar.toString().length());
                        dVar.m0(xVar.toString());
                    }
                }
                objArr[0] = dVar.y();
                this.f9494f.d(sSLSocket, objArr);
            }
        }
    }

    @Override // j.i0.j.f
    public void g(Socket socket, InetSocketAddress inetSocketAddress, int i2) throws IOException {
        try {
            socket.connect(inetSocketAddress, i2);
        } catch (AssertionError e2) {
            if (!j.i0.c.s(e2)) {
                throw e2;
            }
            throw new IOException(e2);
        } catch (ClassCastException e3) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e3;
            }
            IOException iOException = new IOException("Exception in connect");
            iOException.initCause(e3);
            throw iOException;
        } catch (SecurityException e4) {
            IOException iOException2 = new IOException("Exception in connect");
            iOException2.initCause(e4);
            throw iOException2;
        }
    }

    @Override // j.i0.j.f
    public SSLContext h() {
        boolean z = true;
        try {
            if (Build.VERSION.SDK_INT >= 22) {
                z = false;
            }
        } catch (NoClassDefFoundError unused) {
        }
        if (z) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException("No TLS provider", e2);
        }
    }

    @Override // j.i0.j.f
    @Nullable
    public String i(SSLSocket sSLSocket) {
        byte[] bArr;
        e<Socket> eVar = this.f9493e;
        if (eVar == null) {
            return null;
        }
        if ((eVar.a(sSLSocket.getClass()) != null) && (bArr = (byte[]) this.f9493e.d(sSLSocket, new Object[0])) != null) {
            return new String(bArr, j.i0.c.f9276i);
        }
        return null;
    }

    @Override // j.i0.j.f
    public Object j(String str) {
        c cVar = this.f9495g;
        Method method = cVar.a;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, new Object[0]);
                cVar.f9498b.invoke(invoke, str);
                return invoke;
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    @Override // j.i0.j.f
    public boolean k(String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return n(str, cls, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return true;
        } catch (IllegalAccessException e2) {
            e = e2;
            throw j.i0.c.a("unable to determine cleartext support", e);
        } catch (IllegalArgumentException e3) {
            e = e3;
            throw j.i0.c.a("unable to determine cleartext support", e);
        } catch (InvocationTargetException e4) {
            e = e4;
            throw j.i0.c.a("unable to determine cleartext support", e);
        }
    }

    @Override // j.i0.j.f
    public void l(int i2, String str, @Nullable Throwable th) {
        int min;
        int i3 = i2 != 5 ? 3 : 5;
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int i4 = 0;
        int length = str.length();
        while (i4 < length) {
            int indexOf = str.indexOf(10, i4);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i4 + 4000);
                Log.println(i3, "OkHttp", str.substring(i4, min));
                if (min >= indexOf) {
                    break;
                }
                i4 = min;
            }
            i4 = min + 1;
        }
    }

    @Override // j.i0.j.f
    public void m(String str, Object obj) {
        c cVar = this.f9495g;
        Objects.requireNonNull(cVar);
        boolean z = false;
        if (obj != null) {
            try {
                cVar.f9499c.invoke(obj, new Object[0]);
                z = true;
            } catch (Exception unused) {
            }
        }
        if (z) {
            return;
        }
        l(5, str, null);
    }

    public final boolean n(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            try {
                return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
            } catch (NoSuchMethodException unused) {
                return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
            }
        } catch (NoSuchMethodException unused2) {
            return true;
        }
    }
}

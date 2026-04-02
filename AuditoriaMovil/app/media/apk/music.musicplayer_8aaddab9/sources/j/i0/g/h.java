package j.i0.g;

import j.d0;
import j.g0;
import j.i0.f.f;
import j.n;
import j.s;
import j.t;
import j.w;
import j.z;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Objects;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
/* loaded from: classes2.dex */
public final class h implements t {
    public final w a;

    /* renamed from: b  reason: collision with root package name */
    public volatile j.i0.f.g f9339b;

    /* renamed from: c  reason: collision with root package name */
    public Object f9340c;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f9341d;

    public h(w wVar, boolean z) {
        this.a = wVar;
    }

    @Override // j.t
    public d0 a(t.a aVar) throws IOException {
        d0 b2;
        z c2;
        c cVar;
        f fVar = (f) aVar;
        z zVar = fVar.f9329f;
        j.d dVar = fVar.f9330g;
        n nVar = fVar.f9331h;
        j.i0.f.g gVar = new j.i0.f.g(this.a.r, b(zVar.a), dVar, nVar, this.f9340c);
        this.f9339b = gVar;
        int i2 = 0;
        d0 d0Var = null;
        while (!this.f9341d) {
            try {
                try {
                    b2 = fVar.b(zVar, gVar, null, null);
                    if (d0Var != null) {
                        d0.a aVar2 = new d0.a(b2);
                        d0.a aVar3 = new d0.a(d0Var);
                        aVar3.f9223g = null;
                        d0 a = aVar3.a();
                        if (a.f9212g != null) {
                            throw new IllegalArgumentException("priorResponse.body != null");
                        }
                        aVar2.f9226j = a;
                        b2 = aVar2.a();
                    }
                    try {
                        c2 = c(b2, gVar.f9310c);
                    } catch (IOException e2) {
                        gVar.g();
                        throw e2;
                    }
                } catch (Throwable th) {
                    gVar.h(null);
                    gVar.g();
                    throw th;
                }
            } catch (j.i0.f.e e3) {
                if (!d(e3.f9300b, gVar, false, zVar)) {
                    throw e3.a;
                }
            } catch (IOException e4) {
                if (!d(e4, gVar, !(e4 instanceof j.i0.i.a), zVar)) {
                    throw e4;
                }
            }
            if (c2 == null) {
                gVar.g();
                return b2;
            }
            j.i0.c.e(b2.f9212g);
            int i3 = i2 + 1;
            if (i3 > 20) {
                gVar.g();
                throw new ProtocolException(e.a.d.a.a.e("Too many follow-up requests: ", i3));
            }
            if (f(b2, c2.a)) {
                synchronized (gVar.f9311d) {
                    cVar = gVar.f9321n;
                }
                if (cVar != null) {
                    throw new IllegalStateException("Closing the body of " + b2 + " didn't close its backing stream. Bad interceptor?");
                }
            } else {
                gVar.g();
                gVar = new j.i0.f.g(this.a.r, b(c2.a), dVar, nVar, this.f9340c);
                this.f9339b = gVar;
            }
            d0Var = b2;
            zVar = c2;
            i2 = i3;
        }
        gVar.g();
        throw new IOException("Canceled");
    }

    public final j.a b(s sVar) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        j.f fVar;
        if (sVar.f9536b.equals("https")) {
            w wVar = this.a;
            SSLSocketFactory sSLSocketFactory2 = wVar.f9577l;
            HostnameVerifier hostnameVerifier2 = wVar.f9579n;
            fVar = wVar.o;
            sSLSocketFactory = sSLSocketFactory2;
            hostnameVerifier = hostnameVerifier2;
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            fVar = null;
        }
        String str = sVar.f9539e;
        int i2 = sVar.f9540f;
        w wVar2 = this.a;
        return new j.a(str, i2, wVar2.s, wVar2.f9576k, sSLSocketFactory, hostnameVerifier, fVar, wVar2.p, null, wVar2.f9569d, wVar2.f9570e, wVar2.f9574i);
    }

    public final z c(d0 d0Var, g0 g0Var) throws IOException {
        int i2 = d0Var.f9208c;
        String str = d0Var.a.f9602b;
        if (i2 == 307 || i2 == 308) {
            if (!str.equals("GET") && !str.equals("HEAD")) {
                return null;
            }
        } else if (i2 == 401) {
            Objects.requireNonNull(this.a.q);
            return null;
        } else if (i2 == 503) {
            d0 d0Var2 = d0Var.f9215j;
            if ((d0Var2 == null || d0Var2.f9208c != 503) && e(d0Var, Integer.MAX_VALUE) == 0) {
                return d0Var.a;
            }
            return null;
        } else if (i2 == 407) {
            if (g0Var.f9250b.type() == Proxy.Type.HTTP) {
                Objects.requireNonNull(this.a.p);
                return null;
            }
            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
        } else if (i2 == 408) {
            if (this.a.v) {
                d0 d0Var3 = d0Var.f9215j;
                if ((d0Var3 == null || d0Var3.f9208c != 408) && e(d0Var, 0) <= 0) {
                    return d0Var.a;
                }
                return null;
            }
            return null;
        } else {
            switch (i2) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        if (this.a.u) {
            String c2 = d0Var.f9211f.c("Location");
            if (c2 == null) {
                c2 = null;
            }
            if (c2 == null) {
                return null;
            }
            s.a k2 = d0Var.a.a.k(c2);
            s a = k2 != null ? k2.a() : null;
            if (a == null) {
                return null;
            }
            if (a.f9536b.equals(d0Var.a.a.f9536b) || this.a.t) {
                z zVar = d0Var.a;
                Objects.requireNonNull(zVar);
                z.a aVar = new z.a(zVar);
                if (e.j.d.w.g0(str)) {
                    boolean equals = str.equals("PROPFIND");
                    if (!str.equals("PROPFIND")) {
                        aVar.c("GET", null);
                    } else {
                        aVar.c(str, equals ? d0Var.a.f9604d : null);
                    }
                    if (!equals) {
                        aVar.f9608c.c("Transfer-Encoding");
                        aVar.f9608c.c("Content-Length");
                        aVar.f9608c.c("Content-Type");
                    }
                }
                if (!f(d0Var, a)) {
                    aVar.f9608c.c("Authorization");
                }
                aVar.e(a);
                return aVar.a();
            }
            return null;
        }
        return null;
    }

    public final boolean d(IOException iOException, j.i0.f.g gVar, boolean z, z zVar) {
        f.a aVar;
        gVar.h(iOException);
        if (this.a.v) {
            if (z && (iOException instanceof FileNotFoundException)) {
                return false;
            }
            if (!(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? ((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException) : !((iOException instanceof SocketTimeoutException) && !z))) {
                return gVar.f9310c != null || (((aVar = gVar.f9309b) != null && aVar.a()) || gVar.f9315h.b());
            }
            return false;
        }
        return false;
    }

    public final int e(d0 d0Var, int i2) {
        String c2 = d0Var.f9211f.c("Retry-After");
        if (c2 == null) {
            c2 = null;
        }
        if (c2 == null) {
            return i2;
        }
        if (c2.matches("\\d+")) {
            return Integer.valueOf(c2).intValue();
        }
        return Integer.MAX_VALUE;
    }

    public final boolean f(d0 d0Var, s sVar) {
        s sVar2 = d0Var.a.a;
        return sVar2.f9539e.equals(sVar.f9539e) && sVar2.f9540f == sVar.f9540f && sVar2.f9536b.equals(sVar.f9536b);
    }
}

package j.i0.f;

import e.j.d.w;
import j.d0;
import j.g0;
import j.h;
import j.i;
import j.i0.h.a;
import j.i0.i.g;
import j.i0.i.u;
import j.n;
import j.q;
import j.r;
import j.s;
import j.t;
import j.w;
import j.x;
import j.z;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
/* loaded from: classes.dex */
public final class c extends g.e {

    /* renamed from: b  reason: collision with root package name */
    public final h f9287b;

    /* renamed from: c  reason: collision with root package name */
    public final g0 f9288c;

    /* renamed from: d  reason: collision with root package name */
    public Socket f9289d;

    /* renamed from: e  reason: collision with root package name */
    public Socket f9290e;

    /* renamed from: f  reason: collision with root package name */
    public q f9291f;

    /* renamed from: g  reason: collision with root package name */
    public x f9292g;

    /* renamed from: h  reason: collision with root package name */
    public j.i0.i.g f9293h;

    /* renamed from: i  reason: collision with root package name */
    public k.g f9294i;

    /* renamed from: j  reason: collision with root package name */
    public k.f f9295j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f9296k;

    /* renamed from: l  reason: collision with root package name */
    public int f9297l;

    /* renamed from: m  reason: collision with root package name */
    public int f9298m = 1;

    /* renamed from: n  reason: collision with root package name */
    public final List<Reference<g>> f9299n = new ArrayList();
    public long o = Long.MAX_VALUE;

    public c(h hVar, g0 g0Var) {
        this.f9287b = hVar;
        this.f9288c = g0Var;
    }

    @Override // j.i0.i.g.e
    public void a(j.i0.i.g gVar) {
        synchronized (this.f9287b) {
            this.f9298m = gVar.i();
        }
    }

    @Override // j.i0.i.g.e
    public void b(j.i0.i.q qVar) throws IOException {
        qVar.c(j.i0.i.b.REFUSED_STREAM);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0139 A[EDGE_INSN: B:104:0x0139->B:87:0x0139 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00be A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(int r16, int r17, int r18, int r19, boolean r20, j.d r21, j.n r22) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.i0.f.c.c(int, int, int, int, boolean, j.d, j.n):void");
    }

    public final void d(int i2, int i3, j.d dVar, n nVar) throws IOException {
        g0 g0Var = this.f9288c;
        Proxy proxy = g0Var.f9250b;
        this.f9289d = (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) ? g0Var.a.f9182c.createSocket() : new Socket(proxy);
        InetSocketAddress inetSocketAddress = this.f9288c.f9251c;
        Objects.requireNonNull(nVar);
        this.f9289d.setSoTimeout(i3);
        try {
            j.i0.j.f.a.g(this.f9289d, this.f9288c.f9251c, i2);
            try {
                this.f9294i = w.l(w.w0(this.f9289d));
                this.f9295j = w.k(w.v0(this.f9289d));
            } catch (NullPointerException e2) {
                if ("throw with null exception".equals(e2.getMessage())) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            StringBuilder y = e.a.d.a.a.y("Failed to connect to ");
            y.append(this.f9288c.f9251c);
            ConnectException connectException = new ConnectException(y.toString());
            connectException.initCause(e3);
            throw connectException;
        }
    }

    public final void e(int i2, int i3, int i4, j.d dVar, n nVar) throws IOException {
        z.a aVar = new z.a();
        aVar.e(this.f9288c.a.a);
        aVar.c("CONNECT", null);
        aVar.b("Host", j.i0.c.n(this.f9288c.a.a, true));
        aVar.b("Proxy-Connection", "Keep-Alive");
        aVar.b("User-Agent", "okhttp/3.12.8");
        z a = aVar.a();
        d0.a aVar2 = new d0.a();
        aVar2.a = a;
        aVar2.f9218b = x.HTTP_1_1;
        aVar2.f9219c = 407;
        aVar2.f9220d = "Preemptive Authenticate";
        aVar2.f9223g = j.i0.c.f9270c;
        aVar2.f9227k = -1L;
        aVar2.f9228l = -1L;
        r.a aVar3 = aVar2.f9222f;
        Objects.requireNonNull(aVar3);
        r.a("Proxy-Authenticate");
        r.b("OkHttp-Preemptive", "Proxy-Authenticate");
        aVar3.c("Proxy-Authenticate");
        aVar3.a.add("Proxy-Authenticate");
        aVar3.a.add("OkHttp-Preemptive");
        aVar2.a();
        Objects.requireNonNull(this.f9288c.a.f9183d);
        s sVar = a.a;
        d(i2, i3, dVar, nVar);
        k.g gVar = this.f9294i;
        k.f fVar = this.f9295j;
        j.i0.h.a aVar4 = new j.i0.h.a(null, null, gVar, fVar);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        gVar.c().g(i3, timeUnit);
        this.f9295j.c().g(i4, timeUnit);
        aVar4.k(a.f9603c, "CONNECT " + j.i0.c.n(sVar, true) + " HTTP/1.1");
        fVar.flush();
        d0.a d2 = aVar4.d(false);
        d2.a = a;
        d0 a2 = d2.a();
        long a3 = j.i0.g.e.a(a2);
        if (a3 == -1) {
            a3 = 0;
        }
        k.x h2 = aVar4.h(a3);
        j.i0.c.u(h2, Integer.MAX_VALUE, timeUnit);
        ((a.f) h2).close();
        int i5 = a2.f9208c;
        if (i5 == 200) {
            if (!this.f9294i.b().p() || !this.f9295j.b().p()) {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        } else if (i5 == 407) {
            Objects.requireNonNull(this.f9288c.a.f9183d);
            throw new IOException("Failed to authenticate with proxy");
        } else {
            StringBuilder y = e.a.d.a.a.y("Unexpected response code for CONNECT: ");
            y.append(a2.f9208c);
            throw new IOException(y.toString());
        }
    }

    public final void f(b bVar, int i2, j.d dVar, n nVar) throws IOException {
        SSLSocket sSLSocket;
        j.a aVar = this.f9288c.a;
        if (aVar.f9188i == null) {
            List<x> list = aVar.f9184e;
            x xVar = x.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(xVar)) {
                this.f9290e = this.f9289d;
                this.f9292g = x.HTTP_1_1;
                return;
            }
            this.f9290e = this.f9289d;
            this.f9292g = xVar;
            j(i2);
            return;
        }
        Objects.requireNonNull(nVar);
        j.a aVar2 = this.f9288c.a;
        SSLSocketFactory sSLSocketFactory = aVar2.f9188i;
        try {
            try {
                Socket socket = this.f9289d;
                s sVar = aVar2.a;
                sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, sVar.f9539e, sVar.f9540f, true);
            } catch (AssertionError e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
            sSLSocket = null;
        }
        try {
            i a = bVar.a(sSLSocket);
            if (a.f9263g) {
                j.i0.j.f.a.f(sSLSocket, aVar2.a.f9539e, aVar2.f9184e);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            q a2 = q.a(session);
            if (aVar2.f9189j.verify(aVar2.a.f9539e, session)) {
                aVar2.f9190k.a(aVar2.a.f9539e, a2.f9534c);
                String i3 = a.f9263g ? j.i0.j.f.a.i(sSLSocket) : null;
                this.f9290e = sSLSocket;
                this.f9294i = w.l(w.w0(sSLSocket));
                this.f9295j = w.k(w.v0(this.f9290e));
                this.f9291f = a2;
                this.f9292g = i3 != null ? x.get(i3) : x.HTTP_1_1;
                j.i0.j.f.a.a(sSLSocket);
                if (this.f9292g == x.HTTP_2) {
                    j(i2);
                    return;
                }
                return;
            }
            List<Certificate> list2 = a2.f9534c;
            if (list2.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + aVar2.a.f9539e + " not verified (no certificates)");
            }
            X509Certificate x509Certificate = (X509Certificate) list2.get(0);
            throw new SSLPeerUnverifiedException("Hostname " + aVar2.a.f9539e + " not verified:\n    certificate: " + j.f.b(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + j.i0.l.d.a(x509Certificate));
        } catch (AssertionError e3) {
            e = e3;
            if (!j.i0.c.s(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (Throwable th2) {
            th = th2;
            if (sSLSocket != null) {
                j.i0.j.f.a.a(sSLSocket);
            }
            j.i0.c.f(sSLSocket);
            throw th;
        }
    }

    public boolean g(j.a aVar, @Nullable g0 g0Var) {
        if (this.f9299n.size() < this.f9298m && !this.f9296k) {
            j.i0.a aVar2 = j.i0.a.a;
            j.a aVar3 = this.f9288c.a;
            Objects.requireNonNull((w.a) aVar2);
            if (!aVar3.a(aVar)) {
                return false;
            }
            if (aVar.a.f9539e.equals(this.f9288c.a.a.f9539e)) {
                return true;
            }
            if (this.f9293h == null || g0Var == null || g0Var.f9250b.type() != Proxy.Type.DIRECT || this.f9288c.f9250b.type() != Proxy.Type.DIRECT || !this.f9288c.f9251c.equals(g0Var.f9251c) || g0Var.a.f9189j != j.i0.l.d.a || !k(aVar.a)) {
                return false;
            }
            try {
                aVar.f9190k.a(aVar.a.f9539e, this.f9291f.f9534c);
                return true;
            } catch (SSLPeerUnverifiedException unused) {
            }
        }
        return false;
    }

    public boolean h() {
        return this.f9293h != null;
    }

    public j.i0.g.c i(j.w wVar, t.a aVar, g gVar) throws SocketException {
        if (this.f9293h != null) {
            return new j.i0.i.f(wVar, aVar, gVar, this.f9293h);
        }
        j.i0.g.f fVar = (j.i0.g.f) aVar;
        this.f9290e.setSoTimeout(fVar.f9333j);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f9294i.c().g(fVar.f9333j, timeUnit);
        this.f9295j.c().g(fVar.f9334k, timeUnit);
        return new j.i0.h.a(wVar, gVar, this.f9294i, this.f9295j);
    }

    public final void j(int i2) throws IOException {
        this.f9290e.setSoTimeout(0);
        g.c cVar = new g.c(true);
        Socket socket = this.f9290e;
        String str = this.f9288c.a.a.f9539e;
        k.g gVar = this.f9294i;
        k.f fVar = this.f9295j;
        cVar.a = socket;
        cVar.f9417b = str;
        cVar.f9418c = gVar;
        cVar.f9419d = fVar;
        cVar.f9420e = this;
        cVar.f9421f = i2;
        j.i0.i.g gVar2 = new j.i0.i.g(cVar);
        this.f9293h = gVar2;
        j.i0.i.r rVar = gVar2.w;
        synchronized (rVar) {
            if (rVar.f9483f) {
                throw new IOException("closed");
            }
            if (rVar.f9480c) {
                Logger logger = j.i0.i.r.a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(j.i0.c.m(">> CONNECTION %s", j.i0.i.e.a.t()));
                }
                rVar.f9479b.O(j.i0.i.e.a.I());
                rVar.f9479b.flush();
            }
        }
        j.i0.i.r rVar2 = gVar2.w;
        u uVar = gVar2.t;
        synchronized (rVar2) {
            if (rVar2.f9483f) {
                throw new IOException("closed");
            }
            rVar2.h(0, Integer.bitCount(uVar.a) * 6, (byte) 4, (byte) 0);
            int i3 = 0;
            while (i3 < 10) {
                if (((1 << i3) & uVar.a) != 0) {
                    rVar2.f9479b.j(i3 == 4 ? 3 : i3 == 7 ? 4 : i3);
                    rVar2.f9479b.k(uVar.f9490b[i3]);
                }
                i3++;
            }
            rVar2.f9479b.flush();
        }
        int a = gVar2.t.a();
        if (a != 65535) {
            gVar2.w.v(0, a - 65535);
        }
        new Thread(gVar2.x).start();
    }

    public boolean k(s sVar) {
        int i2 = sVar.f9540f;
        s sVar2 = this.f9288c.a.a;
        if (i2 != sVar2.f9540f) {
            return false;
        }
        if (sVar.f9539e.equals(sVar2.f9539e)) {
            return true;
        }
        q qVar = this.f9291f;
        return qVar != null && j.i0.l.d.a.c(sVar.f9539e, (X509Certificate) qVar.f9534c.get(0));
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("Connection{");
        y.append(this.f9288c.a.a.f9539e);
        y.append(":");
        y.append(this.f9288c.a.a.f9540f);
        y.append(", proxy=");
        y.append(this.f9288c.f9250b);
        y.append(" hostAddress=");
        y.append(this.f9288c.f9251c);
        y.append(" cipherSuite=");
        q qVar = this.f9291f;
        y.append(qVar != null ? qVar.f9533b : "none");
        y.append(" protocol=");
        y.append(this.f9292g);
        y.append('}');
        return y.toString();
    }
}

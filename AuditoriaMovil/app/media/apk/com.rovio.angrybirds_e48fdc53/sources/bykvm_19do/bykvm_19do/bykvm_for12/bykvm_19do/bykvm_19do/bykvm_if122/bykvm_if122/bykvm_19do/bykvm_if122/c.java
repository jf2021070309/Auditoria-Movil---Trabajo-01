package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_if122;

import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.l;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.a0;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1.g;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.c0;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.i;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.j;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.k;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.p;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.q;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.s;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.t;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.v;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.w;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.y;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
/* loaded from: classes.dex */
public final class c extends g.i implements i {
    private final j b;
    private final c0 c;
    private Socket d;
    private Socket e;
    private q f;
    private w g;
    private bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1.g h;
    private bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.e i;
    private bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.d j;
    public boolean k;
    public int l;
    public int m = 1;
    public final List<Reference<g>> n = new ArrayList();
    public long o = Long.MAX_VALUE;

    public c(j jVar, c0 c0Var) {
        this.b = jVar;
        this.c = c0Var;
    }

    private y a(int i, int i2, y yVar, s sVar) throws IOException {
        String str = "CONNECT " + bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.a(sVar, true) + " HTTP/1.1";
        while (true) {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_int108.a aVar = new bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_int108.a(null, null, this.i, this.j);
            this.i.b().a(i, TimeUnit.MILLISECONDS);
            this.j.b().a(i2, TimeUnit.MILLISECONDS);
            aVar.a(yVar.c(), str);
            aVar.a();
            a0 a = aVar.a(false).a(yVar).a();
            long a2 = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_for12.e.a(a);
            if (a2 == -1) {
                a2 = 0;
            }
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.s b = aVar.b(a2);
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.b(b, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            b.close();
            int k = a.k();
            if (k == 200) {
                if (this.i.a().f() && this.j.a().f()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            } else if (k != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + a.k());
            } else {
                y a3 = this.c.a().g().a(this.c, a);
                if (a3 == null) {
                    throw new IOException("Failed to authenticate with proxy");
                }
                if ("close".equalsIgnoreCase(a.b("Connection"))) {
                    return a3;
                }
                yVar = a3;
            }
        }
    }

    private void a(int i, int i2, int i3, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.e eVar, p pVar) throws IOException {
        y f = f();
        s g = f.g();
        for (int i4 = 0; i4 < 21; i4++) {
            a(i, i2, eVar, pVar);
            f = a(i2, i3, f, g);
            if (f == null) {
                return;
            }
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.a(this.d);
            this.d = null;
            this.j = null;
            this.i = null;
            pVar.a(eVar, this.c.d(), this.c.b(), null);
        }
    }

    private void a(int i, int i2, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.e eVar, p pVar) throws IOException {
        Proxy b = this.c.b();
        this.d = (b.type() == Proxy.Type.DIRECT || b.type() == Proxy.Type.HTTP) ? this.c.a().i().createSocket() : new Socket(b);
        pVar.a(eVar, this.c.d(), b);
        this.d.setSoTimeout(i2);
        try {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_try19.e.b().a(this.d, this.c.d(), i);
            try {
                this.i = l.a(l.b(this.d));
                this.j = l.a(l.a(this.d));
            } catch (NullPointerException e) {
                if ("throw with null exception".equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.c.d());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    private void a(b bVar) throws IOException {
        SSLSocket sSLSocket;
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.a a = this.c.a();
        try {
            try {
                sSLSocket = (SSLSocket) a.j().createSocket(this.d, a.k().g(), a.k().j(), true);
            } catch (AssertionError e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
            sSLSocket = null;
        }
        try {
            k a2 = bVar.a(sSLSocket);
            if (a2.c()) {
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_try19.e.b().a(sSLSocket, a.k().g(), a.e());
            }
            sSLSocket.startHandshake();
            q a3 = q.a(sSLSocket.getSession());
            if (a.d().verify(a.k().g(), sSLSocket.getSession())) {
                a.a().a(a.k().g(), a3.b());
                String b = a2.c() ? bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_try19.e.b().b(sSLSocket) : null;
                this.e = sSLSocket;
                this.i = l.a(l.b(sSLSocket));
                this.j = l.a(l.a(this.e));
                this.f = a3;
                this.g = b != null ? w.a(b) : w.HTTP_1_1;
                if (sSLSocket != null) {
                    bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_try19.e.b().a(sSLSocket);
                    return;
                }
                return;
            }
            X509Certificate x509Certificate = (X509Certificate) a3.b().get(0);
            throw new SSLPeerUnverifiedException("Hostname " + a.k().g() + " not verified:\n    certificate: " + bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.g.a((Certificate) x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_case1.e.a(x509Certificate));
        } catch (AssertionError e2) {
            e = e2;
            if (!bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.a(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (Throwable th2) {
            th = th2;
            if (sSLSocket != null) {
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_try19.e.b().a(sSLSocket);
            }
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.a((Socket) sSLSocket);
            throw th;
        }
    }

    private void a(b bVar, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.e eVar, p pVar) throws IOException {
        if (this.c.a().j() == null) {
            this.g = w.HTTP_1_1;
            this.e = this.d;
            return;
        }
        pVar.g(eVar);
        a(bVar);
        pVar.a(eVar, this.f);
        if (this.g == w.HTTP_2) {
            this.e.setSoTimeout(0);
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1.g a = new g.h(true).a(this.e, this.c.a().k().g(), this.i, this.j).a(this).a();
            this.h = a;
            a.k();
        }
    }

    private y f() {
        return new y.a().a(this.c.a().k()).b("Host", bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.a(this.c.a().k(), true)).b("Proxy-Connection", "Keep-Alive").b("User-Agent", bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.d.a()).a();
    }

    public bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_for12.c a(v vVar, t.a aVar, g gVar) throws SocketException {
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1.g gVar2 = this.h;
        if (gVar2 != null) {
            return new bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1.f(vVar, aVar, gVar, gVar2);
        }
        this.e.setSoTimeout(aVar.d());
        this.i.b().a(aVar.d(), TimeUnit.MILLISECONDS);
        this.j.b().a(aVar.a(), TimeUnit.MILLISECONDS);
        return new bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_int108.a(vVar, gVar, this.i, this.j);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.i
    public c0 a() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007d A[Catch: IOException -> 0x00e1, TRY_LEAVE, TryCatch #0 {IOException -> 0x00e1, blocks: (B:16:0x0075, B:18:0x007d), top: B:58:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00de A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r16, int r17, int r18, boolean r19, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.e r20, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.p r21) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_if122.c.a(int, int, int, boolean, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.e, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.p):void");
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1.g.i
    public void a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1.g gVar) {
        synchronized (this.b) {
            this.m = gVar.j();
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1.g.i
    public void a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1.i iVar) throws IOException {
        iVar.a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1.b.REFUSED_STREAM);
    }

    public boolean a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.a aVar, c0 c0Var) {
        if (this.n.size() < this.m && !this.k && bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.a.a.a(this.c.a(), aVar)) {
            if (aVar.k().g().equals(a().a().k().g())) {
                return true;
            }
            if (this.h != null && c0Var != null && c0Var.b().type() == Proxy.Type.DIRECT && this.c.b().type() == Proxy.Type.DIRECT && this.c.d().equals(c0Var.d()) && c0Var.a().d() == bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_case1.e.a && a(aVar.k())) {
                try {
                    aVar.a().a(aVar.k().g(), b().b());
                    return true;
                } catch (SSLPeerUnverifiedException e) {
                }
            }
        }
        return false;
    }

    public boolean a(s sVar) {
        if (sVar.j() == this.c.a().k().j()) {
            if (sVar.g().equals(this.c.a().k().g())) {
                return true;
            }
            if (this.f != null && bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_case1.e.a.a(sVar.g(), (X509Certificate) this.f.b().get(0))) {
                return true;
            }
        }
        return false;
    }

    public boolean a(boolean z) {
        if (!this.e.isClosed() && !this.e.isInputShutdown() && !this.e.isOutputShutdown()) {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1.g gVar = this.h;
            if (gVar != null) {
                return true ^ gVar.i();
            }
            if (!z) {
                return true;
            }
            try {
                int soTimeout = this.e.getSoTimeout();
                try {
                    this.e.setSoTimeout(1);
                    if (!this.i.f()) {
                        this.e.setSoTimeout(soTimeout);
                        return true;
                    }
                    this.e.setSoTimeout(soTimeout);
                } catch (Throwable th) {
                    this.e.setSoTimeout(soTimeout);
                    throw th;
                }
            } catch (SocketTimeoutException e) {
                return true;
            } catch (IOException e2) {
            }
        }
        return false;
    }

    public q b() {
        return this.f;
    }

    public boolean c() {
        return this.h != null;
    }

    public w d() {
        return this.g;
    }

    public Socket e() {
        return this.e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.c.a().k().g());
        sb.append(":");
        sb.append(this.c.a().k().j());
        sb.append(", proxy=");
        sb.append(this.c.b());
        sb.append(" hostAddress=");
        sb.append(this.c.d());
        sb.append(" cipherSuite=");
        q qVar = this.f;
        sb.append(qVar != null ? qVar.a() : "none");
        sb.append(" protocol=");
        sb.append(this.g);
        sb.append('}');
        return sb.toString();
    }
}

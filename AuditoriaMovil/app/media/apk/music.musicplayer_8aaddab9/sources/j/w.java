package j;

import j.d;
import j.n;
import java.io.IOException;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
/* loaded from: classes.dex */
public class w implements Cloneable, d.a {
    public static final List<x> a = j.i0.c.p(x.HTTP_2, x.HTTP_1_1);

    /* renamed from: b  reason: collision with root package name */
    public static final List<i> f9567b = j.i0.c.p(i.f9259c, i.f9261e);

    /* renamed from: c  reason: collision with root package name */
    public final l f9568c;

    /* renamed from: d  reason: collision with root package name */
    public final List<x> f9569d;

    /* renamed from: e  reason: collision with root package name */
    public final List<i> f9570e;

    /* renamed from: f  reason: collision with root package name */
    public final List<t> f9571f;

    /* renamed from: g  reason: collision with root package name */
    public final List<t> f9572g;

    /* renamed from: h  reason: collision with root package name */
    public final n.b f9573h;

    /* renamed from: i  reason: collision with root package name */
    public final ProxySelector f9574i;

    /* renamed from: j  reason: collision with root package name */
    public final k f9575j;

    /* renamed from: k  reason: collision with root package name */
    public final SocketFactory f9576k;

    /* renamed from: l  reason: collision with root package name */
    public final SSLSocketFactory f9577l;

    /* renamed from: m  reason: collision with root package name */
    public final j.i0.l.c f9578m;

    /* renamed from: n  reason: collision with root package name */
    public final HostnameVerifier f9579n;
    public final f o;
    public final j.b p;
    public final j.b q;
    public final h r;
    public final m s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final int w;
    public final int x;
    public final int y;

    /* loaded from: classes.dex */
    public class a extends j.i0.a {
        @Override // j.i0.a
        public Socket a(h hVar, j.a aVar, j.i0.f.g gVar) {
            for (j.i0.f.c cVar : hVar.f9255e) {
                if (cVar.g(aVar, null) && cVar.h() && cVar != gVar.b()) {
                    if (gVar.f9321n == null && gVar.f9317j.f9299n.size() == 1) {
                        Socket c2 = gVar.c(true, false, false);
                        gVar.f9317j = cVar;
                        cVar.f9299n.add(gVar.f9317j.f9299n.get(0));
                        return c2;
                    }
                    throw new IllegalStateException();
                }
            }
            return null;
        }

        @Override // j.i0.a
        public j.i0.f.c b(h hVar, j.a aVar, j.i0.f.g gVar, g0 g0Var) {
            for (j.i0.f.c cVar : hVar.f9255e) {
                if (cVar.g(aVar, g0Var)) {
                    gVar.a(cVar, true);
                    return cVar;
                }
            }
            return null;
        }

        @Override // j.i0.a
        @Nullable
        public IOException c(d dVar, @Nullable IOException iOException) {
            return ((y) dVar).c(iOException);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: g  reason: collision with root package name */
        public ProxySelector f9585g;

        /* renamed from: h  reason: collision with root package name */
        public k f9586h;

        /* renamed from: i  reason: collision with root package name */
        public SocketFactory f9587i;
        @Nullable

        /* renamed from: j  reason: collision with root package name */
        public SSLSocketFactory f9588j;
        @Nullable

        /* renamed from: k  reason: collision with root package name */
        public j.i0.l.c f9589k;

        /* renamed from: l  reason: collision with root package name */
        public HostnameVerifier f9590l;

        /* renamed from: m  reason: collision with root package name */
        public f f9591m;

        /* renamed from: n  reason: collision with root package name */
        public j.b f9592n;
        public j.b o;
        public h p;
        public m q;
        public boolean r;
        public boolean s;
        public boolean t;
        public int u;
        public int v;
        public int w;

        /* renamed from: d  reason: collision with root package name */
        public final List<t> f9582d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public final List<t> f9583e = new ArrayList();
        public l a = new l();

        /* renamed from: b  reason: collision with root package name */
        public List<x> f9580b = w.a;

        /* renamed from: c  reason: collision with root package name */
        public List<i> f9581c = w.f9567b;

        /* renamed from: f  reason: collision with root package name */
        public n.b f9584f = new o(n.a);

        public b() {
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.f9585g = proxySelector;
            if (proxySelector == null) {
                this.f9585g = new j.i0.k.a();
            }
            this.f9586h = k.a;
            this.f9587i = SocketFactory.getDefault();
            this.f9590l = j.i0.l.d.a;
            this.f9591m = f.a;
            j.b bVar = j.b.a;
            this.f9592n = bVar;
            this.o = bVar;
            this.p = new h();
            this.q = m.a;
            this.r = true;
            this.s = true;
            this.t = true;
            this.u = 10000;
            this.v = 10000;
            this.w = 10000;
        }
    }

    static {
        j.i0.a.a = new a();
    }

    public w() {
        this(new b());
    }

    public w(b bVar) {
        boolean z;
        this.f9568c = bVar.a;
        this.f9569d = bVar.f9580b;
        List<i> list = bVar.f9581c;
        this.f9570e = list;
        this.f9571f = j.i0.c.o(bVar.f9582d);
        this.f9572g = j.i0.c.o(bVar.f9583e);
        this.f9573h = bVar.f9584f;
        this.f9574i = bVar.f9585g;
        this.f9575j = bVar.f9586h;
        this.f9576k = bVar.f9587i;
        loop0: while (true) {
            for (i iVar : list) {
                z = z || iVar.f9262f;
            }
        }
        SSLSocketFactory sSLSocketFactory = bVar.f9588j;
        if (sSLSocketFactory == null && z) {
            try {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
                    throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
                }
                X509TrustManager x509TrustManager = (X509TrustManager) trustManagers[0];
                try {
                    j.i0.j.f fVar = j.i0.j.f.a;
                    SSLContext h2 = fVar.h();
                    h2.init(null, new TrustManager[]{x509TrustManager}, null);
                    this.f9577l = h2.getSocketFactory();
                    this.f9578m = fVar.c(x509TrustManager);
                } catch (GeneralSecurityException e2) {
                    throw j.i0.c.a("No System TLS", e2);
                }
            } catch (GeneralSecurityException e3) {
                throw j.i0.c.a("No System TLS", e3);
            }
        } else {
            this.f9577l = sSLSocketFactory;
            this.f9578m = bVar.f9589k;
        }
        SSLSocketFactory sSLSocketFactory2 = this.f9577l;
        if (sSLSocketFactory2 != null) {
            j.i0.j.f.a.e(sSLSocketFactory2);
        }
        this.f9579n = bVar.f9590l;
        f fVar2 = bVar.f9591m;
        j.i0.l.c cVar = this.f9578m;
        this.o = j.i0.c.l(fVar2.f9233c, cVar) ? fVar2 : new f(fVar2.f9232b, cVar);
        this.p = bVar.f9592n;
        this.q = bVar.o;
        this.r = bVar.p;
        this.s = bVar.q;
        this.t = bVar.r;
        this.u = bVar.s;
        this.v = bVar.t;
        this.w = bVar.u;
        this.x = bVar.v;
        this.y = bVar.w;
        if (this.f9571f.contains(null)) {
            StringBuilder y = e.a.d.a.a.y("Null interceptor: ");
            y.append(this.f9571f);
            throw new IllegalStateException(y.toString());
        } else if (this.f9572g.contains(null)) {
            StringBuilder y2 = e.a.d.a.a.y("Null network interceptor: ");
            y2.append(this.f9572g);
            throw new IllegalStateException(y2.toString());
        }
    }

    @Override // j.d.a
    public d a(z zVar) {
        y yVar = new y(this, zVar, false);
        yVar.f9595d = ((o) this.f9573h).a;
        return yVar;
    }
}

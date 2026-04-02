package j.i0.f;

import j.g0;
import j.n;
import j.s;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class f {
    public final j.a a;

    /* renamed from: b  reason: collision with root package name */
    public final d f9301b;

    /* renamed from: c  reason: collision with root package name */
    public final j.d f9302c;

    /* renamed from: d  reason: collision with root package name */
    public final n f9303d;

    /* renamed from: e  reason: collision with root package name */
    public List<Proxy> f9304e;

    /* renamed from: f  reason: collision with root package name */
    public int f9305f;

    /* renamed from: g  reason: collision with root package name */
    public List<InetSocketAddress> f9306g = Collections.emptyList();

    /* renamed from: h  reason: collision with root package name */
    public final List<g0> f9307h = new ArrayList();

    /* loaded from: classes2.dex */
    public static final class a {
        public final List<g0> a;

        /* renamed from: b  reason: collision with root package name */
        public int f9308b = 0;

        public a(List<g0> list) {
            this.a = list;
        }

        public boolean a() {
            return this.f9308b < this.a.size();
        }
    }

    public f(j.a aVar, d dVar, j.d dVar2, n nVar) {
        this.f9304e = Collections.emptyList();
        this.a = aVar;
        this.f9301b = dVar;
        this.f9302c = dVar2;
        this.f9303d = nVar;
        s sVar = aVar.a;
        Proxy proxy = aVar.f9187h;
        if (proxy != null) {
            this.f9304e = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = aVar.f9186g.select(sVar.q());
            this.f9304e = (select == null || select.isEmpty()) ? j.i0.c.p(Proxy.NO_PROXY) : j.i0.c.o(select);
        }
        this.f9305f = 0;
    }

    public void a(g0 g0Var, IOException iOException) {
        j.a aVar;
        ProxySelector proxySelector;
        if (g0Var.f9250b.type() != Proxy.Type.DIRECT && (proxySelector = (aVar = this.a).f9186g) != null) {
            proxySelector.connectFailed(aVar.a.q(), g0Var.f9250b.address(), iOException);
        }
        d dVar = this.f9301b;
        synchronized (dVar) {
            dVar.a.add(g0Var);
        }
    }

    public boolean b() {
        return c() || !this.f9307h.isEmpty();
    }

    public final boolean c() {
        return this.f9305f < this.f9304e.size();
    }
}

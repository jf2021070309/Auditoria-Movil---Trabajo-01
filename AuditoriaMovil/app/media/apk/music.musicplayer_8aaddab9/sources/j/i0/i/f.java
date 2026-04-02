package j.i0.i;

import j.d0;
import j.f0;
import j.i0.i.q;
import j.r;
import j.t;
import j.w;
import j.x;
import j.z;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public final class f implements j.i0.g.c {
    public static final List<String> a = j.i0.c.p("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: b  reason: collision with root package name */
    public static final List<String> f9389b = j.i0.c.p("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: c  reason: collision with root package name */
    public final t.a f9390c;

    /* renamed from: d  reason: collision with root package name */
    public final j.i0.f.g f9391d;

    /* renamed from: e  reason: collision with root package name */
    public final g f9392e;

    /* renamed from: f  reason: collision with root package name */
    public q f9393f;

    /* renamed from: g  reason: collision with root package name */
    public final x f9394g;

    /* loaded from: classes2.dex */
    public class a extends k.j {

        /* renamed from: b  reason: collision with root package name */
        public boolean f9395b;

        /* renamed from: c  reason: collision with root package name */
        public long f9396c;

        public a(k.x xVar) {
            super(xVar);
            this.f9395b = false;
            this.f9396c = 0L;
        }

        @Override // k.x
        public long S(k.d dVar, long j2) throws IOException {
            try {
                long S = this.a.S(dVar, j2);
                if (S > 0) {
                    this.f9396c += S;
                }
                return S;
            } catch (IOException e2) {
                a(e2);
                throw e2;
            }
        }

        public final void a(IOException iOException) {
            if (this.f9395b) {
                return;
            }
            this.f9395b = true;
            f fVar = f.this;
            fVar.f9391d.i(false, fVar, this.f9396c, iOException);
        }

        @Override // k.j, k.x, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.a.close();
            a(null);
        }
    }

    public f(w wVar, t.a aVar, j.i0.f.g gVar, g gVar2) {
        this.f9390c = aVar;
        this.f9391d = gVar;
        this.f9392e = gVar2;
        List<x> list = wVar.f9569d;
        x xVar = x.H2_PRIOR_KNOWLEDGE;
        this.f9394g = list.contains(xVar) ? xVar : x.HTTP_2;
    }

    @Override // j.i0.g.c
    public void a() throws IOException {
        ((q.a) this.f9393f.f()).close();
    }

    @Override // j.i0.g.c
    public void b(z zVar) throws IOException {
        int i2;
        q qVar;
        if (this.f9393f != null) {
            return;
        }
        boolean z = false;
        boolean z2 = zVar.f9604d != null;
        j.r rVar = zVar.f9603c;
        ArrayList arrayList = new ArrayList(rVar.g() + 4);
        arrayList.add(new c(c.f9364c, zVar.f9602b));
        arrayList.add(new c(c.f9365d, e.j.d.w.j0(zVar.a)));
        String c2 = zVar.f9603c.c("Host");
        if (c2 != null) {
            arrayList.add(new c(c.f9367f, c2));
        }
        arrayList.add(new c(c.f9366e, zVar.a.f9536b));
        int g2 = rVar.g();
        for (int i3 = 0; i3 < g2; i3++) {
            k.h h2 = k.h.h(rVar.d(i3).toLowerCase(Locale.US));
            if (!a.contains(h2.K())) {
                arrayList.add(new c(h2, rVar.h(i3)));
            }
        }
        g gVar = this.f9392e;
        boolean z3 = !z2;
        synchronized (gVar.w) {
            synchronized (gVar) {
                if (gVar.f9403g > 1073741823) {
                    gVar.v(b.REFUSED_STREAM);
                }
                if (gVar.f9404h) {
                    throw new j.i0.i.a();
                }
                i2 = gVar.f9403g;
                gVar.f9403g = i2 + 2;
                qVar = new q(i2, gVar, z3, false, null);
                z = (!z2 || gVar.s == 0 || qVar.f9460b == 0) ? true : true;
                if (qVar.h()) {
                    gVar.f9400d.put(Integer.valueOf(i2), qVar);
                }
            }
            r rVar2 = gVar.w;
            synchronized (rVar2) {
                if (rVar2.f9483f) {
                    throw new IOException("closed");
                }
                rVar2.m(z3, i2, arrayList);
            }
        }
        if (z) {
            gVar.w.flush();
        }
        this.f9393f = qVar;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        qVar.f9467i.g(((j.i0.g.f) this.f9390c).f9333j, timeUnit);
        this.f9393f.f9468j.g(((j.i0.g.f) this.f9390c).f9334k, timeUnit);
    }

    @Override // j.i0.g.c
    public f0 c(d0 d0Var) throws IOException {
        Objects.requireNonNull(this.f9391d.f9313f);
        String c2 = d0Var.f9211f.c("Content-Type");
        if (c2 == null) {
            c2 = null;
        }
        return new j.i0.g.g(c2, j.i0.g.e.a(d0Var), e.j.d.w.l(new a(this.f9393f.f9465g)));
    }

    @Override // j.i0.g.c
    public void cancel() {
        q qVar = this.f9393f;
        if (qVar != null) {
            qVar.e(b.CANCEL);
        }
    }

    @Override // j.i0.g.c
    public d0.a d(boolean z) throws IOException {
        j.r removeFirst;
        q qVar = this.f9393f;
        synchronized (qVar) {
            qVar.f9467i.h();
            while (qVar.f9463e.isEmpty() && qVar.f9469k == null) {
                qVar.j();
            }
            qVar.f9467i.l();
            if (qVar.f9463e.isEmpty()) {
                throw new v(qVar.f9469k);
            }
            removeFirst = qVar.f9463e.removeFirst();
        }
        x xVar = this.f9394g;
        ArrayList arrayList = new ArrayList(20);
        int g2 = removeFirst.g();
        j.i0.g.i iVar = null;
        for (int i2 = 0; i2 < g2; i2++) {
            String d2 = removeFirst.d(i2);
            String h2 = removeFirst.h(i2);
            if (d2.equals(":status")) {
                iVar = j.i0.g.i.a("HTTP/1.1 " + h2);
            } else if (!f9389b.contains(d2)) {
                Objects.requireNonNull((w.a) j.i0.a.a);
                arrayList.add(d2);
                arrayList.add(h2.trim());
            }
        }
        if (iVar != null) {
            d0.a aVar = new d0.a();
            aVar.f9218b = xVar;
            aVar.f9219c = iVar.f9342b;
            aVar.f9220d = iVar.f9343c;
            r.a aVar2 = new r.a();
            Collections.addAll(aVar2.a, (String[]) arrayList.toArray(new String[arrayList.size()]));
            aVar.f9222f = aVar2;
            if (z) {
                Objects.requireNonNull((w.a) j.i0.a.a);
                if (aVar.f9219c == 100) {
                    return null;
                }
            }
            return aVar;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // j.i0.g.c
    public void e() throws IOException {
        this.f9392e.w.flush();
    }

    @Override // j.i0.g.c
    public k.v f(z zVar, long j2) {
        return this.f9393f.f();
    }
}

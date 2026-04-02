package j.i0.f;

import j.g0;
import j.h;
import j.i0.f.f;
import j.i0.i.v;
import j.m;
import j.n;
import j.s;
import j.w;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class g {
    public final j.a a;

    /* renamed from: b  reason: collision with root package name */
    public f.a f9309b;

    /* renamed from: c  reason: collision with root package name */
    public g0 f9310c;

    /* renamed from: d  reason: collision with root package name */
    public final h f9311d;

    /* renamed from: e  reason: collision with root package name */
    public final j.d f9312e;

    /* renamed from: f  reason: collision with root package name */
    public final n f9313f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f9314g;

    /* renamed from: h  reason: collision with root package name */
    public final f f9315h;

    /* renamed from: i  reason: collision with root package name */
    public int f9316i;

    /* renamed from: j  reason: collision with root package name */
    public c f9317j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f9318k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f9319l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f9320m;

    /* renamed from: n  reason: collision with root package name */
    public j.i0.g.c f9321n;

    /* loaded from: classes2.dex */
    public static final class a extends WeakReference<g> {
        public final Object a;

        public a(g gVar, Object obj) {
            super(gVar);
            this.a = obj;
        }
    }

    public g(h hVar, j.a aVar, j.d dVar, n nVar, Object obj) {
        this.f9311d = hVar;
        this.a = aVar;
        this.f9312e = dVar;
        this.f9313f = nVar;
        Objects.requireNonNull((w.a) j.i0.a.a);
        this.f9315h = new f(aVar, hVar.f9256f, dVar, nVar);
        this.f9314g = obj;
    }

    public void a(c cVar, boolean z) {
        if (this.f9317j != null) {
            throw new IllegalStateException();
        }
        this.f9317j = cVar;
        this.f9318k = z;
        cVar.f9299n.add(new a(this, this.f9314g));
    }

    public synchronized c b() {
        return this.f9317j;
    }

    public final Socket c(boolean z, boolean z2, boolean z3) {
        Socket socket;
        if (z3) {
            this.f9321n = null;
        }
        boolean z4 = true;
        if (z2) {
            this.f9319l = true;
        }
        c cVar = this.f9317j;
        if (cVar != null) {
            if (z) {
                cVar.f9296k = true;
            }
            if (this.f9321n == null) {
                if (this.f9319l || cVar.f9296k) {
                    int size = cVar.f9299n.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (cVar.f9299n.get(i2).get() == this) {
                            cVar.f9299n.remove(i2);
                            if (this.f9317j.f9299n.isEmpty()) {
                                this.f9317j.o = System.nanoTime();
                                j.i0.a aVar = j.i0.a.a;
                                h hVar = this.f9311d;
                                c cVar2 = this.f9317j;
                                Objects.requireNonNull((w.a) aVar);
                                Objects.requireNonNull(hVar);
                                if (cVar2.f9296k || hVar.f9252b == 0) {
                                    hVar.f9255e.remove(cVar2);
                                } else {
                                    hVar.notifyAll();
                                    z4 = false;
                                }
                                if (z4) {
                                    socket = this.f9317j.f9290e;
                                    this.f9317j = null;
                                    return socket;
                                }
                            }
                            socket = null;
                            this.f9317j = null;
                            return socket;
                        }
                    }
                    throw new IllegalStateException();
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final c d(int i2, int i3, int i4, int i5, boolean z) throws IOException {
        c cVar;
        g0 g0Var;
        Socket c2;
        c cVar2;
        boolean z2;
        boolean z3;
        Socket socket;
        f.a aVar;
        String str;
        int i6;
        boolean contains;
        synchronized (this.f9311d) {
            if (this.f9319l) {
                throw new IllegalStateException("released");
            }
            if (this.f9321n != null) {
                throw new IllegalStateException("codec != null");
            }
            if (this.f9320m) {
                throw new IOException("Canceled");
            }
            cVar = this.f9317j;
            g0Var = null;
            c2 = (cVar == null || !cVar.f9296k) ? null : c(false, false, true);
            c cVar3 = this.f9317j;
            if (cVar3 != null) {
                cVar = null;
            } else {
                cVar3 = null;
            }
            if (!this.f9318k) {
                cVar = null;
            }
            if (cVar3 == null) {
                j.i0.a.a.b(this.f9311d, this.a, this, null);
                cVar2 = this.f9317j;
                if (cVar2 != null) {
                    z2 = true;
                } else {
                    g0Var = this.f9310c;
                }
            }
            cVar2 = cVar3;
            z2 = false;
        }
        j.i0.c.f(c2);
        if (cVar != null) {
            Objects.requireNonNull(this.f9313f);
        }
        if (z2) {
            Objects.requireNonNull(this.f9313f);
        }
        if (cVar2 != null) {
            this.f9310c = this.f9317j.f9288c;
            return cVar2;
        }
        if (g0Var != null || ((aVar = this.f9309b) != null && aVar.a())) {
            z3 = false;
        } else {
            f fVar = this.f9315h;
            if (!fVar.b()) {
                throw new NoSuchElementException();
            }
            ArrayList arrayList = new ArrayList();
            while (fVar.c()) {
                if (!fVar.c()) {
                    StringBuilder y = e.a.d.a.a.y("No route to ");
                    y.append(fVar.a.a.f9539e);
                    y.append("; exhausted proxy configurations: ");
                    y.append(fVar.f9304e);
                    throw new SocketException(y.toString());
                }
                List<Proxy> list = fVar.f9304e;
                int i7 = fVar.f9305f;
                fVar.f9305f = i7 + 1;
                Proxy proxy = list.get(i7);
                fVar.f9306g = new ArrayList();
                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                    s sVar = fVar.a.a;
                    str = sVar.f9539e;
                    i6 = sVar.f9540f;
                } else {
                    SocketAddress address = proxy.address();
                    if (!(address instanceof InetSocketAddress)) {
                        StringBuilder y2 = e.a.d.a.a.y("Proxy.address() is not an InetSocketAddress: ");
                        y2.append(address.getClass());
                        throw new IllegalArgumentException(y2.toString());
                    }
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                    InetAddress address2 = inetSocketAddress.getAddress();
                    str = address2 == null ? inetSocketAddress.getHostName() : address2.getHostAddress();
                    i6 = inetSocketAddress.getPort();
                }
                if (i6 < 1 || i6 > 65535) {
                    throw new SocketException("No route to " + str + ":" + i6 + "; port is out of range");
                }
                if (proxy.type() == Proxy.Type.SOCKS) {
                    fVar.f9306g.add(InetSocketAddress.createUnresolved(str, i6));
                } else {
                    Objects.requireNonNull(fVar.f9303d);
                    Objects.requireNonNull((m.a) fVar.a.f9181b);
                    if (str == null) {
                        throw new UnknownHostException("hostname == null");
                    }
                    try {
                        List asList = Arrays.asList(InetAddress.getAllByName(str));
                        if (asList.isEmpty()) {
                            throw new UnknownHostException(fVar.a.f9181b + " returned no addresses for " + str);
                        }
                        Objects.requireNonNull(fVar.f9303d);
                        int size = asList.size();
                        for (int i8 = 0; i8 < size; i8++) {
                            fVar.f9306g.add(new InetSocketAddress((InetAddress) asList.get(i8), i6));
                        }
                    } catch (NullPointerException e2) {
                        UnknownHostException unknownHostException = new UnknownHostException(e.a.d.a.a.k("Broken system behaviour for dns lookup of ", str));
                        unknownHostException.initCause(e2);
                        throw unknownHostException;
                    }
                }
                int size2 = fVar.f9306g.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    g0 g0Var2 = new g0(fVar.a, proxy, fVar.f9306g.get(i9));
                    d dVar = fVar.f9301b;
                    synchronized (dVar) {
                        contains = dVar.a.contains(g0Var2);
                    }
                    if (contains) {
                        fVar.f9307h.add(g0Var2);
                    } else {
                        arrayList.add(g0Var2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(fVar.f9307h);
                fVar.f9307h.clear();
            }
            this.f9309b = new f.a(arrayList);
            z3 = true;
        }
        synchronized (this.f9311d) {
            if (this.f9320m) {
                throw new IOException("Canceled");
            }
            if (z3) {
                f.a aVar2 = this.f9309b;
                Objects.requireNonNull(aVar2);
                ArrayList arrayList2 = new ArrayList(aVar2.a);
                int size3 = arrayList2.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size3) {
                        break;
                    }
                    g0 g0Var3 = (g0) arrayList2.get(i10);
                    j.i0.a.a.b(this.f9311d, this.a, this, g0Var3);
                    c cVar4 = this.f9317j;
                    if (cVar4 != null) {
                        this.f9310c = g0Var3;
                        z2 = true;
                        cVar2 = cVar4;
                        break;
                    }
                    i10++;
                }
            }
            if (!z2) {
                if (g0Var == null) {
                    f.a aVar3 = this.f9309b;
                    if (!aVar3.a()) {
                        throw new NoSuchElementException();
                    }
                    List<g0> list2 = aVar3.a;
                    int i11 = aVar3.f9308b;
                    aVar3.f9308b = i11 + 1;
                    g0Var = list2.get(i11);
                }
                this.f9310c = g0Var;
                this.f9316i = 0;
                cVar2 = new c(this.f9311d, g0Var);
                a(cVar2, false);
            }
        }
        if (z2) {
            Objects.requireNonNull(this.f9313f);
            return cVar2;
        }
        cVar2.c(i2, i3, i4, i5, z, this.f9312e, this.f9313f);
        j.i0.a aVar4 = j.i0.a.a;
        h hVar = this.f9311d;
        Objects.requireNonNull((w.a) aVar4);
        hVar.f9256f.a(cVar2.f9288c);
        synchronized (this.f9311d) {
            this.f9318k = true;
            j.i0.a aVar5 = j.i0.a.a;
            h hVar2 = this.f9311d;
            Objects.requireNonNull((w.a) aVar5);
            if (!hVar2.f9257g) {
                hVar2.f9257g = true;
                h.a.execute(hVar2.f9254d);
            }
            hVar2.f9255e.add(cVar2);
            if (cVar2.h()) {
                socket = j.i0.a.a.a(this.f9311d, this.a, this);
                cVar2 = this.f9317j;
            } else {
                socket = null;
            }
        }
        j.i0.c.f(socket);
        Objects.requireNonNull(this.f9313f);
        return cVar2;
    }

    public final c e(int i2, int i3, int i4, int i5, boolean z, boolean z2) throws IOException {
        while (true) {
            c d2 = d(i2, i3, i4, i5, z);
            synchronized (this.f9311d) {
                if (d2.f9297l == 0 && !d2.h()) {
                    return d2;
                }
                boolean z3 = false;
                if (!d2.f9290e.isClosed() && !d2.f9290e.isInputShutdown() && !d2.f9290e.isOutputShutdown()) {
                    j.i0.i.g gVar = d2.f9293h;
                    if (gVar != null) {
                        long nanoTime = System.nanoTime();
                        synchronized (gVar) {
                            if (!gVar.f9404h) {
                                if (gVar.o >= gVar.f9410n || nanoTime < gVar.q) {
                                    z3 = true;
                                }
                            }
                        }
                    } else {
                        if (z2) {
                            try {
                                int soTimeout = d2.f9290e.getSoTimeout();
                                d2.f9290e.setSoTimeout(1);
                                if (d2.f9294i.p()) {
                                    d2.f9290e.setSoTimeout(soTimeout);
                                } else {
                                    d2.f9290e.setSoTimeout(soTimeout);
                                }
                            } catch (SocketTimeoutException unused) {
                            } catch (IOException unused2) {
                            }
                        }
                        z3 = true;
                    }
                }
                if (z3) {
                    return d2;
                }
                f();
            }
        }
    }

    public void f() {
        c cVar;
        Socket c2;
        synchronized (this.f9311d) {
            cVar = this.f9317j;
            c2 = c(true, false, false);
            if (this.f9317j != null) {
                cVar = null;
            }
        }
        j.i0.c.f(c2);
        if (cVar != null) {
            Objects.requireNonNull(this.f9313f);
        }
    }

    public void g() {
        c cVar;
        Socket c2;
        synchronized (this.f9311d) {
            cVar = this.f9317j;
            c2 = c(false, true, false);
            if (this.f9317j != null) {
                cVar = null;
            }
        }
        j.i0.c.f(c2);
        if (cVar != null) {
            j.i0.a.a.c(this.f9312e, null);
            Objects.requireNonNull(this.f9313f);
            Objects.requireNonNull(this.f9313f);
        }
    }

    public void h(IOException iOException) {
        c cVar;
        boolean z;
        Socket c2;
        synchronized (this.f9311d) {
            cVar = null;
            if (iOException instanceof v) {
                j.i0.i.b bVar = ((v) iOException).a;
                if (bVar == j.i0.i.b.REFUSED_STREAM) {
                    int i2 = this.f9316i + 1;
                    this.f9316i = i2;
                    if (i2 > 1) {
                        this.f9310c = null;
                        z = true;
                    }
                    z = false;
                } else {
                    if (bVar != j.i0.i.b.CANCEL) {
                        this.f9310c = null;
                        z = true;
                    }
                    z = false;
                }
            } else {
                c cVar2 = this.f9317j;
                if (cVar2 != null && (!cVar2.h() || (iOException instanceof j.i0.i.a))) {
                    if (this.f9317j.f9297l == 0) {
                        g0 g0Var = this.f9310c;
                        if (g0Var != null && iOException != null) {
                            this.f9315h.a(g0Var, iOException);
                        }
                        this.f9310c = null;
                    }
                    z = true;
                }
                z = false;
            }
            c cVar3 = this.f9317j;
            c2 = c(z, false, true);
            if (this.f9317j == null && this.f9318k) {
                cVar = cVar3;
            }
        }
        j.i0.c.f(c2);
        if (cVar != null) {
            Objects.requireNonNull(this.f9313f);
        }
    }

    public void i(boolean z, j.i0.g.c cVar, long j2, IOException iOException) {
        c cVar2;
        Socket c2;
        boolean z2;
        Objects.requireNonNull(this.f9313f);
        synchronized (this.f9311d) {
            if (cVar != null) {
                if (cVar == this.f9321n) {
                    if (!z) {
                        this.f9317j.f9297l++;
                    }
                    cVar2 = this.f9317j;
                    c2 = c(z, false, true);
                    if (this.f9317j != null) {
                        cVar2 = null;
                    }
                    z2 = this.f9319l;
                }
            }
            throw new IllegalStateException("expected " + this.f9321n + " but was " + cVar);
        }
        j.i0.c.f(c2);
        if (cVar2 != null) {
            Objects.requireNonNull(this.f9313f);
        }
        if (iOException != null) {
            j.i0.a.a.c(this.f9312e, iOException);
            Objects.requireNonNull(this.f9313f);
        } else if (z2) {
            j.i0.a.a.c(this.f9312e, null);
            Objects.requireNonNull(this.f9313f);
        }
    }

    public String toString() {
        c b2 = b();
        return b2 != null ? b2.toString() : this.a.toString();
    }
}

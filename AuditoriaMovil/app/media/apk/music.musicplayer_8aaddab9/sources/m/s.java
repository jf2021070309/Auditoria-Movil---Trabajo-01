package m;

import j.d;
import j.d0;
import j.p;
import j.r;
import j.s;
import j.v;
import j.y;
import j.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import m.y;
/* loaded from: classes.dex */
public final class s<T> implements m.b<T> {
    public final z a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f9870b;

    /* renamed from: c  reason: collision with root package name */
    public final d.a f9871c;

    /* renamed from: d  reason: collision with root package name */
    public final j<j.f0, T> f9872d;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f9873e;
    @GuardedBy("this")
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public j.d f9874f;
    @GuardedBy("this")
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    public Throwable f9875g;
    @GuardedBy("this")

    /* renamed from: h  reason: collision with root package name */
    public boolean f9876h;

    /* loaded from: classes2.dex */
    public class a implements j.e {
        public final /* synthetic */ d a;

        public a(d dVar) {
            this.a = dVar;
        }

        public void a(j.d dVar, IOException iOException) {
            try {
                this.a.a(s.this, iOException);
            } catch (Throwable th) {
                g0.o(th);
                th.printStackTrace();
            }
        }

        public void b(j.d dVar, j.d0 d0Var) {
            try {
                try {
                    this.a.b(s.this, s.this.b(d0Var));
                } catch (Throwable th) {
                    g0.o(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                g0.o(th2);
                try {
                    this.a.a(s.this, th2);
                } catch (Throwable th3) {
                    g0.o(th3);
                    th3.printStackTrace();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends j.f0 {

        /* renamed from: b  reason: collision with root package name */
        public final j.f0 f9878b;

        /* renamed from: c  reason: collision with root package name */
        public final k.g f9879c;
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        public IOException f9880d;

        /* loaded from: classes2.dex */
        public class a extends k.j {
            public a(k.x xVar) {
                super(xVar);
            }

            @Override // k.x
            public long S(k.d dVar, long j2) throws IOException {
                try {
                    h.o.c.j.e(dVar, "sink");
                    return this.a.S(dVar, j2);
                } catch (IOException e2) {
                    b.this.f9880d = e2;
                    throw e2;
                }
            }
        }

        public b(j.f0 f0Var) {
            this.f9878b = f0Var;
            this.f9879c = e.j.d.w.l(new a(f0Var.h()));
        }

        @Override // j.f0
        public long a() {
            return this.f9878b.a();
        }

        @Override // j.f0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f9878b.close();
        }

        @Override // j.f0
        public j.u f() {
            return this.f9878b.f();
        }

        @Override // j.f0
        public k.g h() {
            return this.f9879c;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends j.f0 {
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public final j.u f9882b;

        /* renamed from: c  reason: collision with root package name */
        public final long f9883c;

        public c(@Nullable j.u uVar, long j2) {
            this.f9882b = uVar;
            this.f9883c = j2;
        }

        @Override // j.f0
        public long a() {
            return this.f9883c;
        }

        @Override // j.f0
        public j.u f() {
            return this.f9882b;
        }

        @Override // j.f0
        public k.g h() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public s(z zVar, Object[] objArr, d.a aVar, j<j.f0, T> jVar) {
        this.a = zVar;
        this.f9870b = objArr;
        this.f9871c = aVar;
        this.f9872d = jVar;
    }

    @Override // m.b
    public synchronized j.z M() {
        j.d dVar = this.f9874f;
        if (dVar != null) {
            return ((j.y) dVar).f9596e;
        }
        Throwable th = this.f9875g;
        if (th != null) {
            if (th instanceof IOException) {
                throw new RuntimeException("Unable to create request.", this.f9875g);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            j.d a2 = a();
            this.f9874f = a2;
            return ((j.y) a2).f9596e;
        } catch (IOException e2) {
            this.f9875g = e2;
            throw new RuntimeException("Unable to create request.", e2);
        } catch (Error e3) {
            e = e3;
            g0.o(e);
            this.f9875g = e;
            throw e;
        } catch (RuntimeException e4) {
            e = e4;
            g0.o(e);
            this.f9875g = e;
            throw e;
        }
    }

    public final j.d a() throws IOException {
        j.s a2;
        d.a aVar = this.f9871c;
        z zVar = this.a;
        Object[] objArr = this.f9870b;
        w<?>[] wVarArr = zVar.f9929j;
        int length = objArr.length;
        if (length == wVarArr.length) {
            y yVar = new y(zVar.f9922c, zVar.f9921b, zVar.f9923d, zVar.f9924e, zVar.f9925f, zVar.f9926g, zVar.f9927h, zVar.f9928i);
            if (zVar.f9930k) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i2 = 0; i2 < length; i2++) {
                arrayList.add(objArr[i2]);
                wVarArr[i2].a(yVar, objArr[i2]);
            }
            s.a aVar2 = yVar.f9912f;
            if (aVar2 != null) {
                a2 = aVar2.a();
            } else {
                s.a k2 = yVar.f9910d.k(yVar.f9911e);
                a2 = k2 != null ? k2.a() : null;
                if (a2 == null) {
                    StringBuilder y = e.a.d.a.a.y("Malformed URL. Base: ");
                    y.append(yVar.f9910d);
                    y.append(", Relative: ");
                    y.append(yVar.f9911e);
                    throw new IllegalArgumentException(y.toString());
                }
            }
            y.a aVar3 = yVar.f9919m;
            if (aVar3 == null) {
                p.a aVar4 = yVar.f9918l;
                if (aVar4 != null) {
                    aVar3 = new j.p(aVar4.a, aVar4.f9532b);
                } else {
                    v.a aVar5 = yVar.f9917k;
                    if (aVar5 != null) {
                        if (aVar5.f9565c.isEmpty()) {
                            throw new IllegalStateException("Multipart body must have at least one part.");
                        }
                        aVar3 = new j.v(aVar5.a, aVar5.f9564b, aVar5.f9565c);
                    } else if (yVar.f9916j) {
                        long j2 = 0;
                        j.i0.c.d(j2, j2, j2);
                        aVar3 = new j.b0(null, 0, new byte[0], 0);
                    }
                }
            }
            j.u uVar = yVar.f9915i;
            if (uVar != null) {
                if (aVar3 != null) {
                    aVar3 = new y.a(aVar3, uVar);
                } else {
                    yVar.f9914h.a("Content-Type", uVar.f9553c);
                }
            }
            z.a aVar6 = yVar.f9913g;
            aVar6.e(a2);
            List<String> list = yVar.f9914h.a;
            r.a aVar7 = new r.a();
            Collections.addAll(aVar7.a, (String[]) list.toArray(new String[list.size()]));
            aVar6.f9608c = aVar7;
            aVar6.c(yVar.f9909c, aVar3);
            aVar6.d(n.class, new n(zVar.a, arrayList));
            j.d a3 = aVar.a(aVar6.a());
            Objects.requireNonNull(a3, "Call.Factory returned null.");
            return a3;
        }
        throw new IllegalArgumentException(e.a.d.a.a.p(e.a.d.a.a.z("Argument count (", length, ") doesn't match expected count ("), wVarArr.length, ")"));
    }

    public a0<T> b(j.d0 d0Var) throws IOException {
        j.f0 f0Var = d0Var.f9212g;
        d0.a aVar = new d0.a(d0Var);
        aVar.f9223g = new c(f0Var.f(), f0Var.a());
        j.d0 a2 = aVar.a();
        int i2 = a2.f9208c;
        if (i2 < 200 || i2 >= 300) {
            try {
                j.f0 a3 = g0.a(f0Var);
                if (a2.a()) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                return new a0<>(a2, null, a3);
            } finally {
                f0Var.close();
            }
        } else if (i2 == 204 || i2 == 205) {
            f0Var.close();
            return a0.b(null, a2);
        } else {
            b bVar = new b(f0Var);
            try {
                return a0.b(this.f9872d.a(bVar), a2);
            } catch (RuntimeException e2) {
                IOException iOException = bVar.f9880d;
                if (iOException == null) {
                    throw e2;
                }
                throw iOException;
            }
        }
    }

    @Override // m.b
    public void cancel() {
        j.d dVar;
        this.f9873e = true;
        synchronized (this) {
            dVar = this.f9874f;
        }
        if (dVar != null) {
            ((j.y) dVar).cancel();
        }
    }

    public Object clone() throws CloneNotSupportedException {
        return new s(this.a, this.f9870b, this.f9871c, this.f9872d);
    }

    @Override // m.b
    public void h(d<T> dVar) {
        j.d dVar2;
        Throwable th;
        synchronized (this) {
            if (this.f9876h) {
                throw new IllegalStateException("Already executed.");
            }
            this.f9876h = true;
            dVar2 = this.f9874f;
            th = this.f9875g;
            if (dVar2 == null && th == null) {
                j.d a2 = a();
                this.f9874f = a2;
                dVar2 = a2;
            }
        }
        if (th != null) {
            dVar.a(this, th);
            return;
        }
        if (this.f9873e) {
            ((j.y) dVar2).cancel();
        }
        a aVar = new a(dVar);
        j.y yVar = (j.y) dVar2;
        synchronized (yVar) {
            if (yVar.f9598g) {
                throw new IllegalStateException("Already Executed");
            }
            yVar.f9598g = true;
        }
        yVar.f9593b.f9340c = j.i0.j.f.a.j("response.body().close()");
        Objects.requireNonNull(yVar.f9595d);
        j.l lVar = yVar.a.f9568c;
        y.b bVar = new y.b(aVar);
        synchronized (lVar) {
            lVar.f9527b.add(bVar);
        }
        lVar.b();
    }

    @Override // m.b
    public boolean i() {
        boolean z = true;
        if (this.f9873e) {
            return true;
        }
        synchronized (this) {
            j.d dVar = this.f9874f;
            if (dVar == null || !((j.y) dVar).f9593b.f9341d) {
                z = false;
            }
        }
        return z;
    }

    @Override // m.b
    public m.b v() {
        return new s(this.a, this.f9870b, this.f9871c, this.f9872d);
    }
}

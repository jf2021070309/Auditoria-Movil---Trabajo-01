package i.a.f2;

import android.os.Handler;
import android.os.Looper;
import e.j.d.w;
import h.k;
import h.m.f;
import h.o.b.l;
import i.a.g1;
import i.a.j;
import i.a.l0;
import i.a.o0;
import i.a.p0;
import i.a.p1;
import i.a.r1;
import java.util.concurrent.CancellationException;
/* loaded from: classes2.dex */
public final class a extends i.a.f2.b implements l0 {
    private volatile a _immediate;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f8982b;

    /* renamed from: c  reason: collision with root package name */
    public final String f8983c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f8984d;

    /* renamed from: e  reason: collision with root package name */
    public final a f8985e;

    /* renamed from: i.a.f2.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0203a implements p0 {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Runnable f8986b;

        public C0203a(Runnable runnable) {
            this.f8986b = runnable;
        }

        @Override // i.a.p0
        public void dispose() {
            a.this.f8982b.removeCallbacks(this.f8986b);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Runnable {
        public final /* synthetic */ j a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ a f8987b;

        public b(j jVar, a aVar) {
            this.a = jVar;
            this.f8987b = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.G(this.f8987b, k.a);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends h.o.c.k implements l<Throwable, k> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Runnable f8988b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Runnable runnable) {
            super(1);
            this.f8988b = runnable;
        }

        @Override // h.o.b.l
        public k invoke(Throwable th) {
            a.this.f8982b.removeCallbacks(this.f8988b);
            return k.a;
        }
    }

    public a(Handler handler, String str, boolean z) {
        super(null);
        this.f8982b = handler;
        this.f8983c = str;
        this.f8984d = z;
        this._immediate = z ? this : null;
        a aVar = this._immediate;
        if (aVar == null) {
            aVar = new a(handler, str, true);
            this._immediate = aVar;
        }
        this.f8985e = aVar;
    }

    @Override // i.a.f2.b, i.a.l0
    public p0 H(long j2, Runnable runnable, f fVar) {
        if (this.f8982b.postDelayed(runnable, w.q(j2, 4611686018427387903L))) {
            return new C0203a(runnable);
        }
        j0(fVar, runnable);
        return r1.a;
    }

    @Override // i.a.c0
    public void e0(f fVar, Runnable runnable) {
        if (this.f8982b.post(runnable)) {
            return;
        }
        j0(fVar, runnable);
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) && ((a) obj).f8982b == this.f8982b;
    }

    @Override // i.a.c0
    public boolean g0(f fVar) {
        return (this.f8984d && h.o.c.j.a(Looper.myLooper(), this.f8982b.getLooper())) ? false : true;
    }

    @Override // i.a.p1
    public p1 h0() {
        return this.f8985e;
    }

    public int hashCode() {
        return System.identityHashCode(this.f8982b);
    }

    public final void j0(f fVar, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        int i2 = g1.T;
        g1 g1Var = (g1) fVar.get(g1.a.a);
        if (g1Var != null) {
            g1Var.W(cancellationException);
        }
        o0.f9155b.e0(fVar, runnable);
    }

    @Override // i.a.l0
    public void m(long j2, j<? super k> jVar) {
        b bVar = new b(jVar, this);
        if (!this.f8982b.postDelayed(bVar, w.q(j2, 4611686018427387903L))) {
            j0(((i.a.k) jVar).f9094g, bVar);
            return;
        }
        ((i.a.k) jVar).r(new c(bVar));
    }

    @Override // i.a.p1, i.a.c0
    public String toString() {
        String i0 = i0();
        if (i0 == null) {
            String str = this.f8983c;
            if (str == null) {
                str = this.f8982b.toString();
            }
            return this.f8984d ? h.o.c.j.i(str, ".immediate") : str;
        }
        return i0;
    }
}

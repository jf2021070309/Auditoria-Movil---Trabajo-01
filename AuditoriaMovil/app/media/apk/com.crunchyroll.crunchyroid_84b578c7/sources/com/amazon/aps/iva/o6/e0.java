package com.amazon.aps.iva.o6;

import android.net.Uri;
import android.os.Looper;
import com.amazon.aps.iva.b6.p1;
import com.amazon.aps.iva.g6.e;
import com.amazon.aps.iva.o6.c0;
import com.amazon.aps.iva.o6.d0;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.q5.r0;
import com.amazon.aps.iva.w5.f;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
/* compiled from: ProgressiveMediaSource.java */
/* loaded from: classes.dex */
public final class e0 extends com.amazon.aps.iva.o6.a implements d0.b {
    public final com.amazon.aps.iva.q5.b0 h;
    public final b0.g i;
    public final f.a j;
    public final c0.a k;
    public final com.amazon.aps.iva.g6.f l;
    public final com.amazon.aps.iva.t6.j m;
    public final int n;
    public boolean o;
    public long p;
    public boolean q;
    public boolean r;
    public com.amazon.aps.iva.w5.y s;

    /* compiled from: ProgressiveMediaSource.java */
    /* loaded from: classes.dex */
    public class a extends o {
        public a(k0 k0Var) {
            super(k0Var);
        }

        @Override // com.amazon.aps.iva.o6.o, com.amazon.aps.iva.q5.r0
        public final r0.b h(int i, r0.b bVar, boolean z) {
            super.h(i, bVar, z);
            bVar.g = true;
            return bVar;
        }

        @Override // com.amazon.aps.iva.o6.o, com.amazon.aps.iva.q5.r0
        public final r0.d p(int i, r0.d dVar, long j) {
            super.p(i, dVar, j);
            dVar.m = true;
            return dVar;
        }
    }

    /* compiled from: ProgressiveMediaSource.java */
    /* loaded from: classes.dex */
    public static final class b implements v.a {
        public final f.a a;
        public final c0.a b;
        public com.amazon.aps.iva.g6.g c;
        public com.amazon.aps.iva.t6.j d;
        public final int e;

        public b(f.a aVar, com.amazon.aps.iva.x6.s sVar) {
            com.amazon.aps.iva.a6.i0 i0Var = new com.amazon.aps.iva.a6.i0(sVar, 1);
            com.amazon.aps.iva.g6.c cVar = new com.amazon.aps.iva.g6.c();
            com.amazon.aps.iva.t6.i iVar = new com.amazon.aps.iva.t6.i();
            this.a = aVar;
            this.b = i0Var;
            this.c = cVar;
            this.d = iVar;
            this.e = 1048576;
        }

        @Override // com.amazon.aps.iva.o6.v.a
        @CanIgnoreReturnValue
        public final v.a a(com.amazon.aps.iva.g6.g gVar) {
            if (gVar != null) {
                this.c = gVar;
                return this;
            }
            throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        }

        @Override // com.amazon.aps.iva.o6.v.a
        public final int[] c() {
            return new int[]{4};
        }

        @Override // com.amazon.aps.iva.o6.v.a
        public final v d(com.amazon.aps.iva.q5.b0 b0Var) {
            b0Var.c.getClass();
            return new e0(b0Var, this.a, this.b, this.c.a(b0Var), this.d, this.e);
        }

        @Override // com.amazon.aps.iva.o6.v.a
        @CanIgnoreReturnValue
        public final v.a e(com.amazon.aps.iva.t6.j jVar) {
            if (jVar != null) {
                this.d = jVar;
                return this;
            }
            throw new NullPointerException("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        }
    }

    public e0(com.amazon.aps.iva.q5.b0 b0Var, f.a aVar, c0.a aVar2, com.amazon.aps.iva.g6.f fVar, com.amazon.aps.iva.t6.j jVar, int i) {
        b0.g gVar = b0Var.c;
        gVar.getClass();
        this.i = gVar;
        this.h = b0Var;
        this.j = aVar;
        this.k = aVar2;
        this.l = fVar;
        this.m = jVar;
        this.n = i;
        this.o = true;
        this.p = -9223372036854775807L;
    }

    @Override // com.amazon.aps.iva.o6.v
    public final com.amazon.aps.iva.q5.b0 b() {
        return this.h;
    }

    @Override // com.amazon.aps.iva.o6.v
    public final void c(u uVar) {
        g0[] g0VarArr;
        d0 d0Var = (d0) uVar;
        if (d0Var.w) {
            for (g0 g0Var : d0Var.t) {
                g0Var.i();
                com.amazon.aps.iva.g6.d dVar = g0Var.h;
                if (dVar != null) {
                    dVar.e(g0Var.e);
                    g0Var.h = null;
                    g0Var.g = null;
                }
            }
        }
        d0Var.l.e(d0Var);
        d0Var.q.removeCallbacksAndMessages(null);
        d0Var.r = null;
        d0Var.M = true;
    }

    @Override // com.amazon.aps.iva.o6.v
    public final u h(v.b bVar, com.amazon.aps.iva.t6.b bVar2, long j) {
        com.amazon.aps.iva.w5.f a2 = this.j.a();
        com.amazon.aps.iva.w5.y yVar = this.s;
        if (yVar != null) {
            a2.j(yVar);
        }
        b0.g gVar = this.i;
        Uri uri = gVar.b;
        com.amazon.aps.iva.cq.b.D(this.g);
        return new d0(uri, a2, new c((com.amazon.aps.iva.x6.s) ((com.amazon.aps.iva.a6.i0) this.k).b), this.l, new e.a(this.d.c, 0, bVar), this.m, o(bVar), this, bVar2, gVar.g, this.n);
    }

    @Override // com.amazon.aps.iva.o6.a
    public final void r(com.amazon.aps.iva.w5.y yVar) {
        this.s = yVar;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        p1 p1Var = this.g;
        com.amazon.aps.iva.cq.b.D(p1Var);
        com.amazon.aps.iva.g6.f fVar = this.l;
        fVar.a(myLooper, p1Var);
        fVar.g();
        u();
    }

    @Override // com.amazon.aps.iva.o6.a
    public final void t() {
        this.l.release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.amazon.aps.iva.o6.e0$a] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.amazon.aps.iva.o6.a, com.amazon.aps.iva.o6.e0] */
    public final void u() {
        k0 k0Var = new k0(this.p, this.q, this.r, this.h);
        if (this.o) {
            k0Var = new a(k0Var);
        }
        s(k0Var);
    }

    public final void v(boolean z, boolean z2, long j) {
        if (j == -9223372036854775807L) {
            j = this.p;
        }
        if (!this.o && this.p == j && this.q == z && this.r == z2) {
            return;
        }
        this.p = j;
        this.q = z;
        this.r = z2;
        this.o = false;
        u();
    }

    @Override // com.amazon.aps.iva.o6.v
    public final void j() {
    }
}

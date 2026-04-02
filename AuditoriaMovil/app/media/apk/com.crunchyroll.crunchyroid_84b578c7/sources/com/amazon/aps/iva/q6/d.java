package com.amazon.aps.iva.q6;

import android.util.SparseArray;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.q6.f;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.x6.c0;
import com.amazon.aps.iva.x6.d0;
import com.amazon.aps.iva.x6.f0;
import com.amazon.aps.iva.x6.p;
import java.io.IOException;
/* compiled from: BundledChunkExtractor.java */
/* loaded from: classes.dex */
public final class d implements p, f {
    public static final com.amazon.aps.iva.g1.n k = new com.amazon.aps.iva.g1.n(5);
    public static final c0 l = new c0();
    public final com.amazon.aps.iva.x6.n b;
    public final int c;
    public final v d;
    public final SparseArray<a> e = new SparseArray<>();
    public boolean f;
    public f.a g;
    public long h;
    public d0 i;
    public v[] j;

    /* compiled from: BundledChunkExtractor.java */
    /* loaded from: classes.dex */
    public static final class a implements f0 {
        public final int a;
        public final v b;
        public final com.amazon.aps.iva.x6.m c = new com.amazon.aps.iva.x6.m();
        public v d;
        public f0 e;
        public long f;

        public a(int i, int i2, v vVar) {
            this.a = i2;
            this.b = vVar;
        }

        @Override // com.amazon.aps.iva.x6.f0
        public final void c(v vVar) {
            v vVar2 = this.b;
            if (vVar2 != null) {
                vVar = vVar.g(vVar2);
            }
            this.d = vVar;
            f0 f0Var = this.e;
            int i = g0.a;
            f0Var.c(vVar);
        }

        @Override // com.amazon.aps.iva.x6.f0
        public final void d(long j, int i, int i2, int i3, f0.a aVar) {
            long j2 = this.f;
            if (j2 != -9223372036854775807L && j >= j2) {
                this.e = this.c;
            }
            f0 f0Var = this.e;
            int i4 = g0.a;
            f0Var.d(j, i, i2, i3, aVar);
        }

        @Override // com.amazon.aps.iva.x6.f0
        public final int e(com.amazon.aps.iva.q5.o oVar, int i, boolean z) throws IOException {
            f0 f0Var = this.e;
            int i2 = g0.a;
            return f0Var.b(oVar, i, z);
        }

        @Override // com.amazon.aps.iva.x6.f0
        public final void f(int i, com.amazon.aps.iva.t5.v vVar) {
            f0 f0Var = this.e;
            int i2 = g0.a;
            f0Var.a(i, vVar);
        }

        public final void g(f.a aVar, long j) {
            if (aVar == null) {
                this.e = this.c;
                return;
            }
            this.f = j;
            f0 a = ((c) aVar).a(this.a);
            this.e = a;
            v vVar = this.d;
            if (vVar != null) {
                a.c(vVar);
            }
        }
    }

    public d(com.amazon.aps.iva.x6.n nVar, int i, v vVar) {
        this.b = nVar;
        this.c = i;
        this.d = vVar;
    }

    public final void a(f.a aVar, long j, long j2) {
        this.g = aVar;
        this.h = j2;
        boolean z = this.f;
        com.amazon.aps.iva.x6.n nVar = this.b;
        if (!z) {
            nVar.g(this);
            if (j != -9223372036854775807L) {
                nVar.c(0L, j);
            }
            this.f = true;
            return;
        }
        if (j == -9223372036854775807L) {
            j = 0;
        }
        nVar.c(0L, j);
        int i = 0;
        while (true) {
            SparseArray<a> sparseArray = this.e;
            if (i < sparseArray.size()) {
                sparseArray.valueAt(i).g(aVar, j2);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.amazon.aps.iva.x6.p
    public final void m(d0 d0Var) {
        this.i = d0Var;
    }

    @Override // com.amazon.aps.iva.x6.p
    public final void o() {
        SparseArray<a> sparseArray = this.e;
        v[] vVarArr = new v[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            v vVar = sparseArray.valueAt(i).d;
            com.amazon.aps.iva.cq.b.D(vVar);
            vVarArr[i] = vVar;
        }
        this.j = vVarArr;
    }

    @Override // com.amazon.aps.iva.x6.p
    public final f0 r(int i, int i2) {
        boolean z;
        v vVar;
        SparseArray<a> sparseArray = this.e;
        a aVar = sparseArray.get(i);
        if (aVar == null) {
            if (this.j == null) {
                z = true;
            } else {
                z = false;
            }
            com.amazon.aps.iva.cq.b.C(z);
            if (i2 == this.c) {
                vVar = this.d;
            } else {
                vVar = null;
            }
            aVar = new a(i, i2, vVar);
            aVar.g(this.g, this.h);
            sparseArray.put(i, aVar);
        }
        return aVar;
    }
}

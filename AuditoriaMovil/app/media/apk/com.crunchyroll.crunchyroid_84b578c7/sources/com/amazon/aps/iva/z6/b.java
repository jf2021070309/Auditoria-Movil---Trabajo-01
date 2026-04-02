package com.amazon.aps.iva.z6;

import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.t5.v;
import com.amazon.aps.iva.x6.d0;
import com.amazon.aps.iva.x6.i;
import com.amazon.aps.iva.x6.n;
import com.amazon.aps.iva.x6.o;
import com.amazon.aps.iva.x6.p;
import java.io.IOException;
/* compiled from: AviExtractor.java */
/* loaded from: classes.dex */
public final class b implements n {
    public int c;
    public c e;
    public long h;
    public e i;
    public int m;
    public boolean n;
    public final v a = new v(12);
    public final C0913b b = new C0913b();
    public p d = new z();
    public e[] g = new e[0];
    public long k = -1;
    public long l = -1;
    public int j = -1;
    public long f = -9223372036854775807L;

    /* compiled from: AviExtractor.java */
    /* loaded from: classes.dex */
    public class a implements d0 {
        public final long a;

        public a(long j) {
            this.a = j;
        }

        @Override // com.amazon.aps.iva.x6.d0
        public final d0.a d(long j) {
            b bVar = b.this;
            d0.a b = bVar.g[0].b(j);
            int i = 1;
            while (true) {
                e[] eVarArr = bVar.g;
                if (i < eVarArr.length) {
                    d0.a b2 = eVarArr[i].b(j);
                    if (b2.a.b < b.a.b) {
                        b = b2;
                    }
                    i++;
                } else {
                    return b;
                }
            }
        }

        @Override // com.amazon.aps.iva.x6.d0
        public final boolean f() {
            return true;
        }

        @Override // com.amazon.aps.iva.x6.d0
        public final long i() {
            return this.a;
        }
    }

    /* compiled from: AviExtractor.java */
    /* renamed from: com.amazon.aps.iva.z6.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0913b {
        public int a;
        public int b;
        public int c;
    }

    public final e a(int i) {
        e[] eVarArr;
        boolean z;
        for (e eVar : this.g) {
            if (eVar.b != i && eVar.c != i) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return eVar;
            }
        }
        return null;
    }

    @Override // com.amazon.aps.iva.x6.n
    public final boolean b(o oVar) throws IOException {
        v vVar = this.a;
        ((i) oVar).c(vVar.a, 0, 12, false);
        vVar.F(0);
        if (vVar.h() != 1179011410) {
            return false;
        }
        vVar.G(4);
        if (vVar.h() != 541677121) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void c(long j, long j2) {
        e[] eVarArr;
        this.h = -1L;
        this.i = null;
        for (e eVar : this.g) {
            if (eVar.j == 0) {
                eVar.h = 0;
            } else {
                eVar.h = eVar.l[g0.f(eVar.k, j, true)];
            }
        }
        if (j == 0) {
            if (this.g.length == 0) {
                this.c = 0;
                return;
            } else {
                this.c = 3;
                return;
            }
        }
        this.c = 6;
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void g(p pVar) {
        this.c = 0;
        this.d = pVar;
        this.h = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    @Override // com.amazon.aps.iva.x6.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(com.amazon.aps.iva.x6.o r23, com.amazon.aps.iva.x6.c0 r24) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.z6.b.h(com.amazon.aps.iva.x6.o, com.amazon.aps.iva.x6.c0):int");
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void release() {
    }
}

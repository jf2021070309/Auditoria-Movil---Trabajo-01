package com.amazon.aps.iva.c7;

import com.amazon.aps.iva.o7.h;
import com.amazon.aps.iva.q5.f0;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.t5.v;
import com.amazon.aps.iva.x6.d0;
import com.amazon.aps.iva.x6.i;
import com.amazon.aps.iva.x6.n;
import com.amazon.aps.iva.x6.o;
import com.amazon.aps.iva.x6.p;
import java.io.IOException;
/* compiled from: JpegExtractor.java */
/* loaded from: classes.dex */
public final class a implements n {
    public p b;
    public int c;
    public int d;
    public int e;
    public com.amazon.aps.iva.j7.a g;
    public o h;
    public c i;
    public h j;
    public final v a = new v(6);
    public long f = -1;

    public final void a() {
        d(new f0.b[0]);
        p pVar = this.b;
        pVar.getClass();
        pVar.o();
        this.b.m(new d0.b(-9223372036854775807L));
        this.c = 6;
    }

    @Override // com.amazon.aps.iva.x6.n
    public final boolean b(o oVar) throws IOException {
        i iVar = (i) oVar;
        if (e(iVar) != 65496) {
            return false;
        }
        int e = e(iVar);
        this.d = e;
        v vVar = this.a;
        if (e == 65504) {
            vVar.C(2);
            iVar.c(vVar.a, 0, 2, false);
            iVar.m(vVar.z() - 2, false);
            this.d = e(iVar);
        }
        if (this.d != 65505) {
            return false;
        }
        iVar.m(2, false);
        vVar.C(6);
        iVar.c(vVar.a, 0, 6, false);
        if (vVar.v() != 1165519206 || vVar.z() != 0) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void c(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            h hVar = this.j;
            hVar.getClass();
            hVar.c(j, j2);
        }
    }

    public final void d(f0.b... bVarArr) {
        p pVar = this.b;
        pVar.getClass();
        com.amazon.aps.iva.x6.f0 r = pVar.r(1024, 4);
        v.a aVar = new v.a();
        aVar.j = "image/jpeg";
        aVar.i = new f0(bVarArr);
        r.c(new com.amazon.aps.iva.q5.v(aVar));
    }

    public final int e(i iVar) throws IOException {
        com.amazon.aps.iva.t5.v vVar = this.a;
        vVar.C(2);
        iVar.c(vVar.a, 0, 2, false);
        return vVar.z();
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void g(p pVar) {
        this.b = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0159  */
    @Override // com.amazon.aps.iva.x6.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(com.amazon.aps.iva.x6.o r25, com.amazon.aps.iva.x6.c0 r26) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.c7.a.h(com.amazon.aps.iva.x6.o, com.amazon.aps.iva.x6.c0):int");
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void release() {
        h hVar = this.j;
        if (hVar != null) {
            hVar.getClass();
        }
    }
}

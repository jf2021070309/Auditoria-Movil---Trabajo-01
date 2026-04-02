package com.amazon.aps.iva.b7;

import com.amazon.aps.iva.t5.v;
import com.amazon.aps.iva.x6.i;
import com.amazon.aps.iva.x6.n;
import com.amazon.aps.iva.x6.o;
import com.amazon.aps.iva.x6.p;
import java.io.IOException;
/* compiled from: FlvExtractor.java */
/* loaded from: classes.dex */
public final class c implements n {
    public p f;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public a o;
    public f p;
    public final v a = new v(4);
    public final v b = new v(9);
    public final v c = new v(11);
    public final v d = new v();
    public final d e = new d();
    public int g = 1;

    public final v a(i iVar) throws IOException {
        int i = this.l;
        v vVar = this.d;
        byte[] bArr = vVar.a;
        if (i > bArr.length) {
            vVar.D(0, new byte[Math.max(bArr.length * 2, i)]);
        } else {
            vVar.F(0);
        }
        vVar.E(this.l);
        iVar.f(vVar.a, 0, this.l, false);
        return vVar;
    }

    @Override // com.amazon.aps.iva.x6.n
    public final boolean b(o oVar) throws IOException {
        v vVar = this.a;
        i iVar = (i) oVar;
        iVar.c(vVar.a, 0, 3, false);
        vVar.F(0);
        if (vVar.w() != 4607062) {
            return false;
        }
        iVar.c(vVar.a, 0, 2, false);
        vVar.F(0);
        if ((vVar.z() & 250) != 0) {
            return false;
        }
        iVar.c(vVar.a, 0, 4, false);
        vVar.F(0);
        int e = vVar.e();
        iVar.f = 0;
        iVar.m(e, false);
        iVar.c(vVar.a, 0, 4, false);
        vVar.F(0);
        if (vVar.e() != 0) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void c(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void g(p pVar) {
        this.f = pVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
        if (r1.b(r13, r6) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008d, code lost:
        if (r1.b(r13, r6) != false) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00e6 A[SYNTHETIC] */
    @Override // com.amazon.aps.iva.x6.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(com.amazon.aps.iva.x6.o r16, com.amazon.aps.iva.x6.c0 r17) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b7.c.h(com.amazon.aps.iva.x6.o, com.amazon.aps.iva.x6.c0):int");
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void release() {
    }
}

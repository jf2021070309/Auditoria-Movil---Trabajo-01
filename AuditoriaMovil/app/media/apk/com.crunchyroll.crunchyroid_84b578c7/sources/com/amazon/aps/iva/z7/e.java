package com.amazon.aps.iva.z7;

import com.amazon.aps.iva.z7.e0;
import java.io.IOException;
/* compiled from: AdtsExtractor.java */
/* loaded from: classes.dex */
public final class e implements com.amazon.aps.iva.x6.n {
    public final com.amazon.aps.iva.t5.v d;
    public final com.amazon.aps.iva.t5.u e;
    public com.amazon.aps.iva.x6.p f;
    public long g;
    public boolean j;
    public boolean k;
    public boolean l;
    public final int a = 0;
    public final f b = new f(null, true);
    public final com.amazon.aps.iva.t5.v c = new com.amazon.aps.iva.t5.v(2048);
    public int i = -1;
    public long h = -1;

    public e(int i) {
        com.amazon.aps.iva.t5.v vVar = new com.amazon.aps.iva.t5.v(10);
        this.d = vVar;
        this.e = new com.amazon.aps.iva.t5.u(vVar.a);
    }

    public final int a(com.amazon.aps.iva.x6.i iVar) throws IOException {
        int i = 0;
        while (true) {
            com.amazon.aps.iva.t5.v vVar = this.d;
            iVar.c(vVar.a, 0, 10, false);
            vVar.F(0);
            if (vVar.w() != 4801587) {
                break;
            }
            vVar.G(3);
            int t = vVar.t();
            i += t + 10;
            iVar.m(t, false);
        }
        iVar.f = 0;
        iVar.m(i, false);
        if (this.h == -1) {
            this.h = i;
        }
        return i;
    }

    @Override // com.amazon.aps.iva.x6.n
    public final boolean b(com.amazon.aps.iva.x6.o oVar) throws IOException {
        boolean z;
        com.amazon.aps.iva.x6.i iVar = (com.amazon.aps.iva.x6.i) oVar;
        int a = a(iVar);
        int i = a;
        int i2 = 0;
        int i3 = 0;
        do {
            com.amazon.aps.iva.t5.v vVar = this.d;
            iVar.c(vVar.a, 0, 2, false);
            vVar.F(0);
            if ((vVar.z() & 65526) == 65520) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                i++;
                iVar.f = 0;
                iVar.m(i, false);
            } else {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                iVar.c(vVar.a, 0, 4, false);
                com.amazon.aps.iva.t5.u uVar = this.e;
                uVar.o(14);
                int i4 = uVar.i(13);
                if (i4 <= 6) {
                    i++;
                    iVar.f = 0;
                    iVar.m(i, false);
                } else {
                    iVar.m(i4 - 6, false);
                    i3 += i4;
                }
            }
            i2 = 0;
            i3 = 0;
        } while (i - a < 8192);
        return false;
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void c(long j, long j2) {
        this.k = false;
        this.b.b();
        this.g = j2;
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void g(com.amazon.aps.iva.x6.p pVar) {
        this.f = pVar;
        this.b.d(pVar, new e0.d(0, 1));
        pVar.o();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0094, code lost:
        r17.j = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009e, code lost:
        throw com.amazon.aps.iva.q5.h0.a("Malformed ADTS stream", null);
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0121 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0123  */
    @Override // com.amazon.aps.iva.x6.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(com.amazon.aps.iva.x6.o r18, com.amazon.aps.iva.x6.c0 r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.z7.e.h(com.amazon.aps.iva.x6.o, com.amazon.aps.iva.x6.c0):int");
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void release() {
    }
}

package com.amazon.aps.iva.z7;

import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.z7.e0;
/* compiled from: Id3Reader.java */
/* loaded from: classes.dex */
public final class o implements j {
    public com.amazon.aps.iva.x6.f0 b;
    public boolean c;
    public int e;
    public int f;
    public final com.amazon.aps.iva.t5.v a = new com.amazon.aps.iva.t5.v(10);
    public long d = -9223372036854775807L;

    @Override // com.amazon.aps.iva.z7.j
    public final void a(com.amazon.aps.iva.t5.v vVar) {
        com.amazon.aps.iva.cq.b.D(this.b);
        if (!this.c) {
            return;
        }
        int i = vVar.c - vVar.b;
        int i2 = this.f;
        if (i2 < 10) {
            int min = Math.min(i, 10 - i2);
            byte[] bArr = vVar.a;
            int i3 = vVar.b;
            com.amazon.aps.iva.t5.v vVar2 = this.a;
            System.arraycopy(bArr, i3, vVar2.a, this.f, min);
            if (this.f + min == 10) {
                vVar2.F(0);
                if (73 == vVar2.u() && 68 == vVar2.u() && 51 == vVar2.u()) {
                    vVar2.G(3);
                    this.e = vVar2.t() + 10;
                } else {
                    com.amazon.aps.iva.t5.p.g();
                    this.c = false;
                    return;
                }
            }
        }
        int min2 = Math.min(i, this.e - this.f);
        this.b.a(min2, vVar);
        this.f += min2;
    }

    @Override // com.amazon.aps.iva.z7.j
    public final void b() {
        this.c = false;
        this.d = -9223372036854775807L;
    }

    @Override // com.amazon.aps.iva.z7.j
    public final void c() {
        int i;
        com.amazon.aps.iva.cq.b.D(this.b);
        if (this.c && (i = this.e) != 0 && this.f == i) {
            long j = this.d;
            if (j != -9223372036854775807L) {
                this.b.d(j, 1, i, 0, null);
            }
            this.c = false;
        }
    }

    @Override // com.amazon.aps.iva.z7.j
    public final void d(com.amazon.aps.iva.x6.p pVar, e0.d dVar) {
        dVar.a();
        dVar.b();
        com.amazon.aps.iva.x6.f0 r = pVar.r(dVar.d, 5);
        this.b = r;
        v.a aVar = new v.a();
        dVar.b();
        aVar.a = dVar.e;
        aVar.k = "application/id3";
        r.c(new com.amazon.aps.iva.q5.v(aVar));
    }

    @Override // com.amazon.aps.iva.z7.j
    public final void e(int i, long j) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        if (j != -9223372036854775807L) {
            this.d = j;
        }
        this.e = 0;
        this.f = 0;
    }
}

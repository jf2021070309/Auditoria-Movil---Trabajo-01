package com.amazon.aps.iva.z7;

import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.z7.e0;
import java.util.Collections;
import java.util.List;
/* compiled from: DvbSubtitleReader.java */
/* loaded from: classes.dex */
public final class i implements j {
    public final List<e0.a> a;
    public final com.amazon.aps.iva.x6.f0[] b;
    public boolean c;
    public int d;
    public int e;
    public long f = -9223372036854775807L;

    public i(List<e0.a> list) {
        this.a = list;
        this.b = new com.amazon.aps.iva.x6.f0[list.size()];
    }

    @Override // com.amazon.aps.iva.z7.j
    public final void a(com.amazon.aps.iva.t5.v vVar) {
        com.amazon.aps.iva.x6.f0[] f0VarArr;
        boolean z;
        boolean z2;
        if (this.c) {
            if (this.d == 2) {
                if (vVar.c - vVar.b == 0) {
                    z2 = false;
                } else {
                    if (vVar.u() != 32) {
                        this.c = false;
                    }
                    this.d--;
                    z2 = this.c;
                }
                if (!z2) {
                    return;
                }
            }
            if (this.d == 1) {
                if (vVar.c - vVar.b == 0) {
                    z = false;
                } else {
                    if (vVar.u() != 0) {
                        this.c = false;
                    }
                    this.d--;
                    z = this.c;
                }
                if (!z) {
                    return;
                }
            }
            int i = vVar.b;
            int i2 = vVar.c - i;
            for (com.amazon.aps.iva.x6.f0 f0Var : this.b) {
                vVar.F(i);
                f0Var.a(i2, vVar);
            }
            this.e += i2;
        }
    }

    @Override // com.amazon.aps.iva.z7.j
    public final void b() {
        this.c = false;
        this.f = -9223372036854775807L;
    }

    @Override // com.amazon.aps.iva.z7.j
    public final void c() {
        if (this.c) {
            if (this.f != -9223372036854775807L) {
                for (com.amazon.aps.iva.x6.f0 f0Var : this.b) {
                    f0Var.d(this.f, 1, this.e, 0, null);
                }
            }
            this.c = false;
        }
    }

    @Override // com.amazon.aps.iva.z7.j
    public final void d(com.amazon.aps.iva.x6.p pVar, e0.d dVar) {
        int i = 0;
        while (true) {
            com.amazon.aps.iva.x6.f0[] f0VarArr = this.b;
            if (i < f0VarArr.length) {
                e0.a aVar = this.a.get(i);
                dVar.a();
                dVar.b();
                com.amazon.aps.iva.x6.f0 r = pVar.r(dVar.d, 3);
                v.a aVar2 = new v.a();
                dVar.b();
                aVar2.a = dVar.e;
                aVar2.k = "application/dvbsubs";
                aVar2.m = Collections.singletonList(aVar.b);
                aVar2.c = aVar.a;
                r.c(new com.amazon.aps.iva.q5.v(aVar2));
                f0VarArr[i] = r;
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.amazon.aps.iva.z7.j
    public final void e(int i, long j) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        if (j != -9223372036854775807L) {
            this.f = j;
        }
        this.e = 0;
        this.d = 2;
    }
}

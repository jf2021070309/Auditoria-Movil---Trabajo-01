package com.amazon.aps.iva.z7;

import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.z7.e0;
/* compiled from: SectionReader.java */
/* loaded from: classes.dex */
public final class z implements e0 {
    public final y a;
    public final com.amazon.aps.iva.t5.v b = new com.amazon.aps.iva.t5.v(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public z(y yVar) {
        this.a = yVar;
    }

    @Override // com.amazon.aps.iva.z7.e0
    public final void a(int i, com.amazon.aps.iva.t5.v vVar) {
        boolean z;
        int i2;
        boolean z2;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = vVar.b + vVar.u();
        } else {
            i2 = -1;
        }
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            vVar.F(i2);
            this.d = 0;
        }
        while (true) {
            int i3 = vVar.c;
            int i4 = vVar.b;
            if (i3 - i4 > 0) {
                int i5 = this.d;
                com.amazon.aps.iva.t5.v vVar2 = this.b;
                if (i5 < 3) {
                    if (i5 == 0) {
                        int u = vVar.u();
                        vVar.F(vVar.b - 1);
                        if (u == 255) {
                            this.f = true;
                            return;
                        }
                    }
                    int min = Math.min(vVar.c - vVar.b, 3 - this.d);
                    vVar.d(this.d, vVar2.a, min);
                    int i6 = this.d + min;
                    this.d = i6;
                    if (i6 == 3) {
                        vVar2.F(0);
                        vVar2.E(3);
                        vVar2.G(1);
                        int u2 = vVar2.u();
                        int u3 = vVar2.u();
                        if ((u2 & 128) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.e = z2;
                        int i7 = (((u2 & 15) << 8) | u3) + 3;
                        this.c = i7;
                        byte[] bArr = vVar2.a;
                        if (bArr.length < i7) {
                            vVar2.a(Math.min(4098, Math.max(i7, bArr.length * 2)));
                        }
                    }
                } else {
                    int min2 = Math.min(i3 - i4, this.c - i5);
                    vVar.d(this.d, vVar2.a, min2);
                    int i8 = this.d + min2;
                    this.d = i8;
                    int i9 = this.c;
                    if (i8 != i9) {
                        continue;
                    } else {
                        if (this.e) {
                            if (g0.l(0, vVar2.a, i9, -1) != 0) {
                                this.f = true;
                                return;
                            }
                            vVar2.E(this.c - 4);
                        } else {
                            vVar2.E(i9);
                        }
                        vVar2.F(0);
                        this.a.a(vVar2);
                        this.d = 0;
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // com.amazon.aps.iva.z7.e0
    public final void b() {
        this.f = true;
    }

    @Override // com.amazon.aps.iva.z7.e0
    public final void c(com.amazon.aps.iva.t5.b0 b0Var, com.amazon.aps.iva.x6.p pVar, e0.d dVar) {
        this.a.c(b0Var, pVar, dVar);
        this.f = true;
    }
}

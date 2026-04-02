package com.amazon.aps.iva.z7;

import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.x6.c;
import com.amazon.aps.iva.z7.e0;
/* compiled from: Ac4Reader.java */
/* loaded from: classes.dex */
public final class d implements j {
    public final com.amazon.aps.iva.t5.u a;
    public final com.amazon.aps.iva.t5.v b;
    public final String c;
    public String d;
    public com.amazon.aps.iva.x6.f0 e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public long j;
    public com.amazon.aps.iva.q5.v k;
    public int l;
    public long m;

    public d(String str) {
        com.amazon.aps.iva.t5.u uVar = new com.amazon.aps.iva.t5.u(new byte[16]);
        this.a = uVar;
        this.b = new com.amazon.aps.iva.t5.v(uVar.b);
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.i = false;
        this.m = -9223372036854775807L;
        this.c = str;
    }

    @Override // com.amazon.aps.iva.z7.j
    public final void a(com.amazon.aps.iva.t5.v vVar) {
        int i;
        boolean z;
        boolean z2;
        int u;
        boolean z3;
        boolean z4;
        com.amazon.aps.iva.cq.b.D(this.e);
        while (true) {
            int i2 = vVar.c - vVar.b;
            if (i2 > 0) {
                int i3 = this.f;
                com.amazon.aps.iva.t5.v vVar2 = this.b;
                boolean z5 = true;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            int min = Math.min(i2, this.l - this.g);
                            this.e.a(min, vVar);
                            int i4 = this.g + min;
                            this.g = i4;
                            int i5 = this.l;
                            if (i4 == i5) {
                                long j = this.m;
                                if (j != -9223372036854775807L) {
                                    this.e.d(j, 1, i5, 0, null);
                                    this.m += this.j;
                                }
                                this.f = 0;
                            }
                        }
                    } else {
                        byte[] bArr = vVar2.a;
                        int min2 = Math.min(i2, 16 - this.g);
                        vVar.d(this.g, bArr, min2);
                        int i6 = this.g + min2;
                        this.g = i6;
                        if (i6 != 16) {
                            z5 = false;
                        }
                        if (z5) {
                            com.amazon.aps.iva.t5.u uVar = this.a;
                            uVar.o(0);
                            c.a b = com.amazon.aps.iva.x6.c.b(uVar);
                            com.amazon.aps.iva.q5.v vVar3 = this.k;
                            int i7 = b.a;
                            if (vVar3 == null || 2 != vVar3.z || i7 != vVar3.A || !"audio/ac4".equals(vVar3.m)) {
                                v.a aVar = new v.a();
                                aVar.a = this.d;
                                aVar.k = "audio/ac4";
                                aVar.x = 2;
                                aVar.y = i7;
                                aVar.c = this.c;
                                com.amazon.aps.iva.q5.v vVar4 = new com.amazon.aps.iva.q5.v(aVar);
                                this.k = vVar4;
                                this.e.c(vVar4);
                            }
                            this.l = b.b;
                            this.j = (b.c * 1000000) / this.k.A;
                            vVar2.F(0);
                            this.e.a(16, vVar2);
                            this.f = 2;
                        }
                    }
                } else {
                    while (true) {
                        i = 65;
                        if (vVar.c - vVar.b > 0) {
                            if (!this.h) {
                                if (vVar.u() == 172) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                this.h = z2;
                            } else {
                                u = vVar.u();
                                if (u == 172) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                this.h = z3;
                                if (u == 64 || u == 65) {
                                    break;
                                }
                            }
                        } else {
                            z = false;
                            break;
                        }
                    }
                    if (u == 65) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    this.i = z4;
                    z = true;
                    if (z) {
                        this.f = 1;
                        byte[] bArr2 = vVar2.a;
                        bArr2[0] = -84;
                        if (!this.i) {
                            i = 64;
                        }
                        bArr2[1] = (byte) i;
                        this.g = 2;
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // com.amazon.aps.iva.z7.j
    public final void b() {
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.i = false;
        this.m = -9223372036854775807L;
    }

    @Override // com.amazon.aps.iva.z7.j
    public final void d(com.amazon.aps.iva.x6.p pVar, e0.d dVar) {
        dVar.a();
        dVar.b();
        this.d = dVar.e;
        dVar.b();
        this.e = pVar.r(dVar.d, 1);
    }

    @Override // com.amazon.aps.iva.z7.j
    public final void e(int i, long j) {
        if (j != -9223372036854775807L) {
            this.m = j;
        }
    }

    @Override // com.amazon.aps.iva.z7.j
    public final void c() {
    }
}

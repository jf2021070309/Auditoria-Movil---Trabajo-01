package com.amazon.aps.iva.z7;

import com.amazon.aps.iva.q5.h0;
import com.amazon.aps.iva.z7.e0;
/* compiled from: PesReader.java */
/* loaded from: classes.dex */
public final class t implements e0 {
    public final j a;
    public final com.amazon.aps.iva.t5.u b = new com.amazon.aps.iva.t5.u(new byte[10]);
    public int c = 0;
    public int d;
    public com.amazon.aps.iva.t5.b0 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public long l;

    public t(j jVar) {
        this.a = jVar;
    }

    @Override // com.amazon.aps.iva.z7.e0
    public final void a(int i, com.amazon.aps.iva.t5.v vVar) throws h0 {
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        com.amazon.aps.iva.cq.b.D(this.e);
        int i7 = i & 1;
        j jVar = this.a;
        int i8 = -1;
        int i9 = 3;
        int i10 = 2;
        if (i7 != 0) {
            int i11 = this.c;
            if (i11 != 0 && i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        if (this.j != -1) {
                            com.amazon.aps.iva.t5.p.g();
                        }
                        jVar.c();
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    com.amazon.aps.iva.t5.p.g();
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i12 = i;
        while (true) {
            int i13 = vVar.c;
            int i14 = vVar.b;
            int i15 = i13 - i14;
            if (i15 > 0) {
                int i16 = this.c;
                if (i16 != 0) {
                    com.amazon.aps.iva.t5.u uVar = this.b;
                    if (i16 != 1) {
                        if (i16 != i10) {
                            if (i16 == i9) {
                                int i17 = this.j;
                                if (i17 == i8) {
                                    i6 = 0;
                                } else {
                                    i6 = i15 - i17;
                                }
                                if (i6 > 0) {
                                    i15 -= i6;
                                    vVar.E(i14 + i15);
                                }
                                jVar.a(vVar);
                                int i18 = this.j;
                                if (i18 != i8) {
                                    int i19 = i18 - i15;
                                    this.j = i19;
                                    if (i19 == 0) {
                                        jVar.c();
                                        this.c = 1;
                                        this.d = 0;
                                    }
                                }
                                i2 = i8;
                                i3 = i9;
                                i4 = i10;
                            } else {
                                throw new IllegalStateException();
                            }
                        } else if (d(Math.min(10, this.i), vVar, uVar.b) && d(this.i, vVar, null)) {
                            uVar.o(0);
                            this.l = -9223372036854775807L;
                            int i20 = 4;
                            if (this.f) {
                                uVar.r(4);
                                uVar.r(1);
                                long i21 = uVar.i(15) << 15;
                                uVar.r(1);
                                long i22 = i21 | (uVar.i(i9) << 30) | uVar.i(15);
                                uVar.r(1);
                                if (!this.h && this.g) {
                                    uVar.r(4);
                                    uVar.r(1);
                                    long i23 = uVar.i(15) << 15;
                                    uVar.r(1);
                                    uVar.r(1);
                                    this.e.b(i23 | (uVar.i(i9) << 30) | uVar.i(15));
                                    this.h = true;
                                }
                                this.l = this.e.b(i22);
                            }
                            if (!this.k) {
                                i20 = 0;
                            }
                            i12 |= i20;
                            jVar.e(i12, this.l);
                            this.c = 3;
                            this.d = 0;
                            i9 = 3;
                            i8 = -1;
                            i10 = 2;
                        } else {
                            i3 = i9;
                            i4 = 2;
                            i2 = -1;
                        }
                    } else {
                        i3 = i9;
                        if (d(9, vVar, uVar.b)) {
                            uVar.o(0);
                            if (uVar.i(24) != 1) {
                                com.amazon.aps.iva.t5.p.g();
                                this.j = -1;
                                i2 = -1;
                                i4 = 2;
                                z = false;
                            } else {
                                uVar.r(8);
                                int i24 = uVar.i(16);
                                uVar.r(5);
                                this.k = uVar.h();
                                i4 = 2;
                                uVar.r(2);
                                this.f = uVar.h();
                                this.g = uVar.h();
                                uVar.r(6);
                                int i25 = uVar.i(8);
                                this.i = i25;
                                if (i24 == 0) {
                                    i2 = -1;
                                    this.j = -1;
                                } else {
                                    i2 = -1;
                                    int i26 = ((i24 + 6) - 9) - i25;
                                    this.j = i26;
                                    if (i26 < 0) {
                                        com.amazon.aps.iva.t5.p.g();
                                        this.j = -1;
                                    }
                                }
                                z = true;
                            }
                            if (z) {
                                i5 = i4;
                            } else {
                                i5 = 0;
                            }
                            this.c = i5;
                            this.d = 0;
                        }
                        i4 = 2;
                        i2 = -1;
                    }
                } else {
                    i2 = i8;
                    i3 = i9;
                    i4 = i10;
                    vVar.G(i15);
                }
                i9 = i3;
                i10 = i4;
                i8 = i2;
            } else {
                return;
            }
        }
    }

    @Override // com.amazon.aps.iva.z7.e0
    public final void b() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.b();
    }

    @Override // com.amazon.aps.iva.z7.e0
    public final void c(com.amazon.aps.iva.t5.b0 b0Var, com.amazon.aps.iva.x6.p pVar, e0.d dVar) {
        this.e = b0Var;
        this.a.d(pVar, dVar);
    }

    public final boolean d(int i, com.amazon.aps.iva.t5.v vVar, byte[] bArr) {
        int min = Math.min(vVar.c - vVar.b, i - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            vVar.G(min);
        } else {
            vVar.d(this.d, bArr, min);
        }
        int i2 = this.d + min;
        this.d = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }
}

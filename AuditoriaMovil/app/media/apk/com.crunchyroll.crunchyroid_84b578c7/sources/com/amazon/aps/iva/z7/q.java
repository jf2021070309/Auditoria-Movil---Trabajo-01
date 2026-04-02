package com.amazon.aps.iva.z7;

import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.x6.b0;
import com.amazon.aps.iva.z7.e0;
import com.google.common.primitives.UnsignedBytes;
/* compiled from: MpegAudioReader.java */
/* loaded from: classes.dex */
public final class q implements j {
    public final com.amazon.aps.iva.t5.v a;
    public final b0.a b;
    public final String c;
    public com.amazon.aps.iva.x6.f0 d;
    public String e;
    public int f = 0;
    public int g;
    public boolean h;
    public boolean i;
    public long j;
    public int k;
    public long l;

    public q(String str) {
        com.amazon.aps.iva.t5.v vVar = new com.amazon.aps.iva.t5.v(4);
        this.a = vVar;
        vVar.a[0] = -1;
        this.b = new b0.a();
        this.l = -9223372036854775807L;
        this.c = str;
    }

    @Override // com.amazon.aps.iva.z7.j
    public final void a(com.amazon.aps.iva.t5.v vVar) {
        boolean z;
        boolean z2;
        com.amazon.aps.iva.cq.b.D(this.d);
        while (true) {
            int i = vVar.c;
            int i2 = vVar.b;
            int i3 = i - i2;
            if (i3 > 0) {
                int i4 = this.f;
                com.amazon.aps.iva.t5.v vVar2 = this.a;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            int min = Math.min(i3, this.k - this.g);
                            this.d.a(min, vVar);
                            int i5 = this.g + min;
                            this.g = i5;
                            int i6 = this.k;
                            if (i5 >= i6) {
                                long j = this.l;
                                if (j != -9223372036854775807L) {
                                    this.d.d(j, 1, i6, 0, null);
                                    this.l += this.j;
                                }
                                this.g = 0;
                                this.f = 0;
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        int min2 = Math.min(i3, 4 - this.g);
                        vVar.d(this.g, vVar2.a, min2);
                        int i7 = this.g + min2;
                        this.g = i7;
                        if (i7 >= 4) {
                            vVar2.F(0);
                            int e = vVar2.e();
                            b0.a aVar = this.b;
                            if (!aVar.a(e)) {
                                this.g = 0;
                                this.f = 1;
                            } else {
                                this.k = aVar.c;
                                if (!this.h) {
                                    int i8 = aVar.d;
                                    this.j = (aVar.g * 1000000) / i8;
                                    v.a aVar2 = new v.a();
                                    aVar2.a = this.e;
                                    aVar2.k = aVar.b;
                                    aVar2.l = 4096;
                                    aVar2.x = aVar.e;
                                    aVar2.y = i8;
                                    aVar2.c = this.c;
                                    this.d.c(new com.amazon.aps.iva.q5.v(aVar2));
                                    this.h = true;
                                }
                                vVar2.F(0);
                                this.d.a(4, vVar2);
                                this.f = 2;
                            }
                        }
                    }
                } else {
                    byte[] bArr = vVar.a;
                    while (true) {
                        if (i2 < i) {
                            byte b = bArr[i2];
                            if ((b & UnsignedBytes.MAX_VALUE) == 255) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (this.i && (b & 224) == 224) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            this.i = z;
                            if (z2) {
                                vVar.F(i2 + 1);
                                this.i = false;
                                vVar2.a[1] = bArr[i2];
                                this.g = 2;
                                this.f = 1;
                                break;
                            }
                            i2++;
                        } else {
                            vVar.F(i);
                            break;
                        }
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
        this.i = false;
        this.l = -9223372036854775807L;
    }

    @Override // com.amazon.aps.iva.z7.j
    public final void d(com.amazon.aps.iva.x6.p pVar, e0.d dVar) {
        dVar.a();
        dVar.b();
        this.e = dVar.e;
        dVar.b();
        this.d = pVar.r(dVar.d, 1);
    }

    @Override // com.amazon.aps.iva.z7.j
    public final void e(int i, long j) {
        if (j != -9223372036854775807L) {
            this.l = j;
        }
    }

    @Override // com.amazon.aps.iva.z7.j
    public final void c() {
    }
}

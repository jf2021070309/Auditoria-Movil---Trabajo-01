package com.fyber.inneractive.sdk.player.c.d.f;

import android.util.Log;
import com.fyber.inneractive.sdk.player.c.d.f.v;
/* loaded from: classes.dex */
public final class o implements v {
    private final h a;
    private final com.fyber.inneractive.sdk.player.c.k.j b = new com.fyber.inneractive.sdk.player.c.k.j(new byte[10]);
    private int c = 0;
    private int d;
    private com.fyber.inneractive.sdk.player.c.k.r e;
    private boolean f;
    private boolean g;
    private boolean h;
    private int i;
    private int j;
    private boolean k;
    private long l;

    public o(h hVar) {
        this.a = hVar;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f.v
    public final void a(com.fyber.inneractive.sdk.player.c.k.r rVar, com.fyber.inneractive.sdk.player.c.d.h hVar, v.d dVar) {
        this.e = rVar;
        this.a.a(hVar, dVar);
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f.v
    public final void a() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.a();
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f.v
    public final void a(com.fyber.inneractive.sdk.player.c.k.k kVar, boolean z) {
        boolean z2;
        if (z) {
            int i = this.c;
            if (i == 2) {
                Log.w("PesReader", "Unexpected start indicator reading extended header");
            } else if (i == 3) {
                if (this.j != -1) {
                    Log.w("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                }
                this.a.b();
            }
            a(1);
        }
        while (kVar.b() > 0) {
            int i2 = this.c;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        if (a(kVar, this.b.a, Math.min(10, this.i)) && a(kVar, (byte[]) null, this.i)) {
                            this.b.a(0);
                            this.l = -9223372036854775807L;
                            if (this.f) {
                                this.b.b(4);
                                this.b.b(1);
                                this.b.b(1);
                                long c = (this.b.c(3) << 30) | (this.b.c(15) << 15) | this.b.c(15);
                                this.b.b(1);
                                if (!this.h && this.g) {
                                    this.b.b(4);
                                    this.b.b(1);
                                    this.b.b(1);
                                    this.b.b(1);
                                    this.e.a((this.b.c(3) << 30) | (this.b.c(15) << 15) | this.b.c(15));
                                    this.h = true;
                                }
                                this.l = this.e.a(c);
                            }
                            this.a.a(this.l, this.k);
                            a(3);
                        }
                    } else if (i2 == 3) {
                        int b = kVar.b();
                        int i3 = this.j;
                        int i4 = i3 != -1 ? b - i3 : 0;
                        if (i4 > 0) {
                            b -= i4;
                            kVar.b(kVar.b + b);
                        }
                        this.a.a(kVar);
                        int i5 = this.j;
                        if (i5 != -1) {
                            int i6 = i5 - b;
                            this.j = i6;
                            if (i6 == 0) {
                                this.a.b();
                                a(1);
                            }
                        }
                    }
                } else if (a(kVar, this.b.a, 9)) {
                    this.b.a(0);
                    int c2 = this.b.c(24);
                    if (c2 != 1) {
                        Log.w("PesReader", "Unexpected start code prefix: " + c2);
                        this.j = -1;
                        z2 = false;
                    } else {
                        this.b.b(8);
                        int c3 = this.b.c(16);
                        this.b.b(5);
                        this.k = this.b.a();
                        this.b.b(2);
                        this.f = this.b.a();
                        this.g = this.b.a();
                        this.b.b(6);
                        int c4 = this.b.c(8);
                        this.i = c4;
                        if (c3 == 0) {
                            this.j = -1;
                        } else {
                            this.j = ((c3 + 6) - 9) - c4;
                        }
                        z2 = true;
                    }
                    a(z2 ? 2 : 0);
                }
            } else {
                kVar.d(kVar.b());
            }
        }
    }

    private void a(int i) {
        this.c = i;
        this.d = 0;
    }

    private boolean a(com.fyber.inneractive.sdk.player.c.k.k kVar, byte[] bArr, int i) {
        int min = Math.min(kVar.b(), i - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            kVar.d(min);
        } else {
            kVar.a(bArr, this.d, min);
        }
        int i2 = this.d + min;
        this.d = i2;
        return i2 == i;
    }
}

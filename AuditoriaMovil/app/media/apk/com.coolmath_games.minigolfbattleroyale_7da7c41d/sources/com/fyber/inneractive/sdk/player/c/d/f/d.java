package com.fyber.inneractive.sdk.player.c.d.f;

import android.util.Log;
import android.util.Pair;
import com.fyber.inneractive.sdk.player.c.d.f.v;
import java.util.Arrays;
import java.util.Collections;
import kotlin.UByte;
/* loaded from: classes.dex */
public final class d implements h {
    private static final byte[] b = {73, 68, 51};
    long a;
    private final boolean c;
    private final com.fyber.inneractive.sdk.player.c.k.j d;
    private final com.fyber.inneractive.sdk.player.c.k.k e;
    private final String f;
    private String g;
    private com.fyber.inneractive.sdk.player.c.d.n h;
    private com.fyber.inneractive.sdk.player.c.d.n i;
    private int j;
    private int k;
    private int l;
    private boolean m;
    private boolean n;
    private long o;
    private int p;
    private com.fyber.inneractive.sdk.player.c.d.n q;
    private long r;

    @Override // com.fyber.inneractive.sdk.player.c.d.f.h
    public final void b() {
    }

    public d() {
        this(true, null);
    }

    public d(boolean z, String str) {
        this.d = new com.fyber.inneractive.sdk.player.c.k.j(new byte[7]);
        this.e = new com.fyber.inneractive.sdk.player.c.k.k(Arrays.copyOf(b, 10));
        c();
        this.c = z;
        this.f = str;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f.h
    public final void a() {
        c();
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f.h
    public final void a(com.fyber.inneractive.sdk.player.c.d.h hVar, v.d dVar) {
        dVar.a();
        this.g = dVar.c();
        this.h = hVar.a(dVar.b());
        if (this.c) {
            dVar.a();
            com.fyber.inneractive.sdk.player.c.d.n a = hVar.a(dVar.b());
            this.i = a;
            a.a(com.fyber.inneractive.sdk.player.c.h.a(dVar.c(), "application/id3", (com.fyber.inneractive.sdk.player.c.c.a) null));
            return;
        }
        this.i = new com.fyber.inneractive.sdk.player.c.d.e();
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f.h
    public final void a(long j, boolean z) {
        this.a = j;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f.h
    public final void a(com.fyber.inneractive.sdk.player.c.k.k kVar) {
        while (kVar.b() > 0) {
            int i = this.j;
            if (i == 0) {
                byte[] bArr = kVar.a;
                int i2 = kVar.b;
                int i3 = kVar.c;
                while (i2 < i3) {
                    int i4 = i2 + 1;
                    int i5 = bArr[i2] & UByte.MAX_VALUE;
                    if (this.l == 512 && i5 >= 240 && i5 != 255) {
                        this.m = (i5 & 1) == 0;
                        this.j = 2;
                        this.k = 0;
                    } else {
                        int i6 = this.l;
                        int i7 = i5 | i6;
                        if (i7 == 329) {
                            this.l = 768;
                        } else if (i7 == 511) {
                            this.l = 512;
                        } else if (i7 == 836) {
                            this.l = 1024;
                        } else if (i7 == 1075) {
                            this.j = 1;
                            this.k = b.length;
                            this.p = 0;
                            this.e.c(0);
                        } else if (i6 != 256) {
                            this.l = 256;
                            i4--;
                        }
                        i2 = i4;
                    }
                    i2 = i4;
                    break;
                }
                kVar.c(i2);
            } else if (i != 1) {
                if (i == 2) {
                    if (a(kVar, this.d.a, this.m ? 7 : 5)) {
                        this.d.a(0);
                        if (!this.n) {
                            int c = this.d.c(2) + 1;
                            if (c != 2) {
                                Log.w("AdtsReader", "Detected audio object type: " + c + ", but assuming AAC LC.");
                                c = 2;
                            }
                            int c2 = this.d.c(4);
                            this.d.b(1);
                            byte[] a = com.fyber.inneractive.sdk.player.c.k.c.a(c, c2, this.d.c(3));
                            Pair<Integer, Integer> a2 = com.fyber.inneractive.sdk.player.c.k.c.a(a);
                            com.fyber.inneractive.sdk.player.c.h a3 = com.fyber.inneractive.sdk.player.c.h.a(this.g, "audio/mp4a-latm", -1, -1, ((Integer) a2.second).intValue(), ((Integer) a2.first).intValue(), Collections.singletonList(a), null, this.f);
                            this.o = 1024000000 / a3.s;
                            this.h.a(a3);
                            this.n = true;
                        } else {
                            this.d.b(10);
                        }
                        this.d.b(4);
                        int c3 = (this.d.c(13) - 2) - 5;
                        if (this.m) {
                            c3 -= 2;
                        }
                        a(this.h, this.o, 0, c3);
                    }
                } else if (i == 3) {
                    int min = Math.min(kVar.b(), this.p - this.k);
                    this.q.a(kVar, min);
                    int i8 = this.k + min;
                    this.k = i8;
                    int i9 = this.p;
                    if (i8 == i9) {
                        this.q.a(this.a, 1, i9, 0, null);
                        this.a += this.r;
                        c();
                    }
                }
            } else if (a(kVar, this.e.a, 10)) {
                this.i.a(this.e, 10);
                this.e.c(6);
                a(this.i, 0L, 10, this.e.m() + 10);
            }
        }
    }

    private boolean a(com.fyber.inneractive.sdk.player.c.k.k kVar, byte[] bArr, int i) {
        int min = Math.min(kVar.b(), i - this.k);
        kVar.a(bArr, this.k, min);
        int i2 = this.k + min;
        this.k = i2;
        return i2 == i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        this.j = 0;
        this.k = 0;
        this.l = 256;
    }

    private void a(com.fyber.inneractive.sdk.player.c.d.n nVar, long j, int i, int i2) {
        this.j = 3;
        this.k = i;
        this.q = nVar;
        this.r = j;
        this.p = i2;
    }
}

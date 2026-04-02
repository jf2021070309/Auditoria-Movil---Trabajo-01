package com.fyber.inneractive.sdk.player.c.d.f;

import com.fyber.inneractive.sdk.player.c.d.f.v;
import kotlin.UByte;
/* loaded from: classes.dex */
public final class m implements h {
    private final com.fyber.inneractive.sdk.player.c.k.k a;
    private final com.fyber.inneractive.sdk.player.c.d.k b;
    private final String c;
    private String d;
    private com.fyber.inneractive.sdk.player.c.d.n e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private long j;
    private int k;
    private long l;

    @Override // com.fyber.inneractive.sdk.player.c.d.f.h
    public final void b() {
    }

    public m() {
        this(null);
    }

    public m(String str) {
        this.f = 0;
        com.fyber.inneractive.sdk.player.c.k.k kVar = new com.fyber.inneractive.sdk.player.c.k.k(4);
        this.a = kVar;
        kVar.a[0] = -1;
        this.b = new com.fyber.inneractive.sdk.player.c.d.k();
        this.c = str;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f.h
    public final void a() {
        this.f = 0;
        this.g = 0;
        this.i = false;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f.h
    public final void a(com.fyber.inneractive.sdk.player.c.d.h hVar, v.d dVar) {
        dVar.a();
        this.d = dVar.c();
        this.e = hVar.a(dVar.b());
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f.h
    public final void a(long j, boolean z) {
        this.l = j;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f.h
    public final void a(com.fyber.inneractive.sdk.player.c.k.k kVar) {
        while (kVar.b() > 0) {
            int i = this.f;
            if (i == 0) {
                byte[] bArr = kVar.a;
                int i2 = kVar.b;
                int i3 = kVar.c;
                while (true) {
                    if (i2 < i3) {
                        boolean z = (bArr[i2] & UByte.MAX_VALUE) == 255;
                        boolean z2 = this.i && (bArr[i2] & 224) == 224;
                        this.i = z;
                        if (z2) {
                            kVar.c(i2 + 1);
                            this.i = false;
                            this.a.a[1] = bArr[i2];
                            this.g = 2;
                            this.f = 1;
                            break;
                        }
                        i2++;
                    } else {
                        kVar.c(i3);
                        break;
                    }
                }
            } else if (i == 1) {
                int min = Math.min(kVar.b(), 4 - this.g);
                kVar.a(this.a.a, this.g, min);
                int i4 = this.g + min;
                this.g = i4;
                if (i4 >= 4) {
                    this.a.c(0);
                    if (!com.fyber.inneractive.sdk.player.c.d.k.a(this.a.j(), this.b)) {
                        this.g = 0;
                        this.f = 1;
                    } else {
                        this.k = this.b.c;
                        if (!this.h) {
                            this.j = (this.b.g * 1000000) / this.b.d;
                            this.e.a(com.fyber.inneractive.sdk.player.c.h.a(this.d, this.b.b, -1, 4096, this.b.e, this.b.d, null, null, this.c));
                            this.h = true;
                        }
                        this.a.c(0);
                        this.e.a(this.a, 4);
                        this.f = 2;
                    }
                }
            } else if (i == 2) {
                int min2 = Math.min(kVar.b(), this.k - this.g);
                this.e.a(kVar, min2);
                int i5 = this.g + min2;
                this.g = i5;
                int i6 = this.k;
                if (i5 >= i6) {
                    this.e.a(this.l, 1, i6, 0, null);
                    this.l += this.j;
                    this.g = 0;
                    this.f = 0;
                }
            }
        }
    }
}

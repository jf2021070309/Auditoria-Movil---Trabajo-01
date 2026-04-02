package com.fyber.inneractive.sdk.player.c.d.f;

import androidx.core.view.InputDeviceCompat;
import com.fyber.inneractive.sdk.player.c.d.f.v;
/* loaded from: classes.dex */
public final class r implements v {
    private final q a;
    private final com.fyber.inneractive.sdk.player.c.k.k b = new com.fyber.inneractive.sdk.player.c.k.k(32);
    private int c;
    private int d;
    private boolean e;
    private boolean f;

    public r(q qVar) {
        this.a = qVar;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f.v
    public final void a(com.fyber.inneractive.sdk.player.c.k.r rVar, com.fyber.inneractive.sdk.player.c.d.h hVar, v.d dVar) {
        this.a.a(rVar, hVar, dVar);
        this.f = true;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f.v
    public final void a() {
        this.f = true;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f.v
    public final void a(com.fyber.inneractive.sdk.player.c.k.k kVar, boolean z) {
        int d = z ? kVar.b + kVar.d() : -1;
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            kVar.c(d);
            this.d = 0;
        }
        while (kVar.b() > 0) {
            int i = this.d;
            if (i < 3) {
                if (i == 0) {
                    int d2 = kVar.d();
                    kVar.c(kVar.b - 1);
                    if (d2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(kVar.b(), 3 - this.d);
                kVar.a(this.b.a, this.d, min);
                int i2 = this.d + min;
                this.d = i2;
                if (i2 == 3) {
                    this.b.a(3);
                    this.b.d(1);
                    int d3 = this.b.d();
                    int d4 = this.b.d();
                    this.e = (d3 & 128) != 0;
                    this.c = (((d3 & 15) << 8) | d4) + 3;
                    if (this.b.c() < this.c) {
                        byte[] bArr = this.b.a;
                        this.b.a(Math.min((int) InputDeviceCompat.SOURCE_TOUCHSCREEN, Math.max(this.c, bArr.length * 2)));
                        System.arraycopy(bArr, 0, this.b.a, 0, 3);
                    }
                }
            } else {
                int min2 = Math.min(kVar.b(), this.c - this.d);
                kVar.a(this.b.a, this.d, min2);
                int i3 = this.d + min2;
                this.d = i3;
                int i4 = this.c;
                if (i3 != i4) {
                    continue;
                } else {
                    if (this.e) {
                        if (com.fyber.inneractive.sdk.player.c.k.t.a(this.b.a, this.c, -1) != 0) {
                            this.f = true;
                            return;
                        }
                        this.b.a(this.c - 4);
                    } else {
                        this.b.a(i4);
                    }
                    this.a.a(this.b);
                    this.d = 0;
                }
            }
        }
    }
}

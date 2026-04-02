package com.fyber.inneractive.sdk.player.c.d.f;

import com.fyber.inneractive.sdk.player.c.a.a;
import com.fyber.inneractive.sdk.player.c.d.f.v;
/* loaded from: classes.dex */
public final class b implements h {
    long a;
    private final com.fyber.inneractive.sdk.player.c.k.j b;
    private final com.fyber.inneractive.sdk.player.c.k.k c;
    private final String d;
    private String e;
    private com.fyber.inneractive.sdk.player.c.d.n f;
    private int g;
    private int h;
    private boolean i;
    private long j;
    private com.fyber.inneractive.sdk.player.c.h k;
    private int l;

    @Override // com.fyber.inneractive.sdk.player.c.d.f.h
    public final void b() {
    }

    public b() {
        this(null);
    }

    public b(String str) {
        this.b = new com.fyber.inneractive.sdk.player.c.k.j(new byte[8]);
        this.c = new com.fyber.inneractive.sdk.player.c.k.k(this.b.a);
        this.g = 0;
        this.d = str;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f.h
    public final void a() {
        this.g = 0;
        this.h = 0;
        this.i = false;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f.h
    public final void a(com.fyber.inneractive.sdk.player.c.d.h hVar, v.d dVar) {
        dVar.a();
        this.e = dVar.c();
        this.f = hVar.a(dVar.b());
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f.h
    public final void a(long j, boolean z) {
        this.a = j;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f.h
    public final void a(com.fyber.inneractive.sdk.player.c.k.k kVar) {
        boolean z;
        while (kVar.b() > 0) {
            int i = this.g;
            if (i == 0) {
                while (true) {
                    if (kVar.b() <= 0) {
                        z = false;
                        break;
                    } else if (!this.i) {
                        this.i = kVar.d() == 11;
                    } else {
                        int d = kVar.d();
                        if (d == 119) {
                            this.i = false;
                            z = true;
                            break;
                        }
                        this.i = d == 11;
                    }
                }
                if (z) {
                    this.g = 1;
                    this.c.a[0] = 11;
                    this.c.a[1] = 119;
                    this.h = 2;
                }
            } else if (i == 1) {
                byte[] bArr = this.c.a;
                int min = Math.min(kVar.b(), 8 - this.h);
                kVar.a(bArr, this.h, min);
                int i2 = this.h + min;
                this.h = i2;
                if (i2 == 8) {
                    this.b.a(0);
                    a.C0051a a = com.fyber.inneractive.sdk.player.c.a.a.a(this.b);
                    if (this.k == null || a.c != this.k.r || a.b != this.k.s || a.a != this.k.f) {
                        com.fyber.inneractive.sdk.player.c.h a2 = com.fyber.inneractive.sdk.player.c.h.a(this.e, a.a, -1, -1, a.c, a.b, null, null, this.d);
                        this.k = a2;
                        this.f.a(a2);
                    }
                    this.l = a.d;
                    this.j = (a.e * 1000000) / this.k.s;
                    this.c.c(0);
                    this.f.a(this.c, 8);
                    this.g = 2;
                }
            } else if (i == 2) {
                int min2 = Math.min(kVar.b(), this.l - this.h);
                this.f.a(kVar, min2);
                int i3 = this.h + min2;
                this.h = i3;
                int i4 = this.l;
                if (i3 == i4) {
                    this.f.a(this.a, 1, i4, 0, null);
                    this.a += this.j;
                    this.g = 0;
                }
            }
        }
    }
}

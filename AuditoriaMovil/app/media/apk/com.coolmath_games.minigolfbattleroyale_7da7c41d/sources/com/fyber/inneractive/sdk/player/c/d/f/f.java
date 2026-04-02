package com.fyber.inneractive.sdk.player.c.d.f;

import com.fyber.inneractive.sdk.player.c.d.f.v;
import kotlin.jvm.internal.ByteCompanionObject;
/* loaded from: classes.dex */
public final class f implements h {
    private final com.fyber.inneractive.sdk.player.c.k.k a;
    private final String b;
    private String c;
    private com.fyber.inneractive.sdk.player.c.d.n d;
    private int e;
    private int f;
    private int g;
    private long h;
    private com.fyber.inneractive.sdk.player.c.h i;
    private int j;
    private long k;

    @Override // com.fyber.inneractive.sdk.player.c.d.f.h
    public final void b() {
    }

    public f(String str) {
        com.fyber.inneractive.sdk.player.c.k.k kVar = new com.fyber.inneractive.sdk.player.c.k.k(new byte[15]);
        this.a = kVar;
        kVar.a[0] = ByteCompanionObject.MAX_VALUE;
        this.a.a[1] = -2;
        this.a.a[2] = ByteCompanionObject.MIN_VALUE;
        this.a.a[3] = 1;
        this.e = 0;
        this.b = str;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f.h
    public final void a() {
        this.e = 0;
        this.f = 0;
        this.g = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f.h
    public final void a(com.fyber.inneractive.sdk.player.c.d.h hVar, v.d dVar) {
        dVar.a();
        this.c = dVar.c();
        this.d = hVar.a(dVar.b());
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f.h
    public final void a(long j, boolean z) {
        this.k = j;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f.h
    public final void a(com.fyber.inneractive.sdk.player.c.k.k kVar) {
        while (kVar.b() > 0) {
            int i = this.e;
            boolean z = false;
            if (i == 0) {
                while (true) {
                    if (kVar.b() <= 0) {
                        break;
                    }
                    int i2 = this.g << 8;
                    this.g = i2;
                    int d = i2 | kVar.d();
                    this.g = d;
                    if (d == 2147385345) {
                        this.g = 0;
                        z = true;
                        break;
                    }
                }
                if (z) {
                    this.f = 4;
                    this.e = 1;
                }
            } else if (i == 1) {
                byte[] bArr = this.a.a;
                int min = Math.min(kVar.b(), 15 - this.f);
                kVar.a(bArr, this.f, min);
                int i3 = this.f + min;
                this.f = i3;
                if (i3 == 15) {
                    byte[] bArr2 = this.a.a;
                    if (this.i == null) {
                        com.fyber.inneractive.sdk.player.c.h a = com.fyber.inneractive.sdk.player.c.a.g.a(bArr2, this.c, this.b);
                        this.i = a;
                        this.d.a(a);
                    }
                    this.j = com.fyber.inneractive.sdk.player.c.a.g.b(bArr2);
                    this.h = (int) ((com.fyber.inneractive.sdk.player.c.a.g.a(bArr2) * 1000000) / this.i.s);
                    this.a.c(0);
                    this.d.a(this.a, 15);
                    this.e = 2;
                }
            } else if (i == 2) {
                int min2 = Math.min(kVar.b(), this.j - this.f);
                this.d.a(kVar, min2);
                int i4 = this.f + min2;
                this.f = i4;
                int i5 = this.j;
                if (i4 == i5) {
                    this.d.a(this.k, 1, i5, 0, null);
                    this.k += this.h;
                    this.e = 0;
                }
            }
        }
    }
}

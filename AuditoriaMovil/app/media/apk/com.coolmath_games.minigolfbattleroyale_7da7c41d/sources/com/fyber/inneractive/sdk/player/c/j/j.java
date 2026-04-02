package com.fyber.inneractive.sdk.player.c.j;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class j implements b {
    private final boolean a;
    private final int b;
    private final byte[] c;
    private final a[] d;
    private int e;
    private int f;
    private int g;
    private a[] h;

    public j() {
        this((byte) 0);
    }

    private j(byte b) {
        com.fyber.inneractive.sdk.player.c.k.a.a(true);
        com.fyber.inneractive.sdk.player.c.k.a.a(true);
        this.a = true;
        this.b = 65536;
        this.g = 0;
        this.h = new a[100];
        this.c = null;
        this.d = new a[1];
    }

    public final synchronized void d() {
        if (this.a) {
            a(0);
        }
    }

    public final synchronized void a(int i) {
        boolean z = i < this.e;
        this.e = i;
        if (z) {
            b();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.b
    public final synchronized a a() {
        a aVar;
        this.f++;
        if (this.g > 0) {
            a[] aVarArr = this.h;
            int i = this.g - 1;
            this.g = i;
            aVar = aVarArr[i];
            this.h[i] = null;
        } else {
            aVar = new a(new byte[this.b]);
        }
        return aVar;
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.b
    public final synchronized void a(a aVar) {
        this.d[0] = aVar;
        a(this.d);
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.b
    public final synchronized void a(a[] aVarArr) {
        boolean z;
        if (this.g + aVarArr.length >= this.h.length) {
            this.h = (a[]) Arrays.copyOf(this.h, Math.max(this.h.length * 2, this.g + aVarArr.length));
        }
        for (a aVar : aVarArr) {
            if (aVar.a != this.c && aVar.a.length != this.b) {
                z = false;
                com.fyber.inneractive.sdk.player.c.k.a.a(z);
                a[] aVarArr2 = this.h;
                int i = this.g;
                this.g = i + 1;
                aVarArr2[i] = aVar;
            }
            z = true;
            com.fyber.inneractive.sdk.player.c.k.a.a(z);
            a[] aVarArr22 = this.h;
            int i2 = this.g;
            this.g = i2 + 1;
            aVarArr22[i2] = aVar;
        }
        this.f -= aVarArr.length;
        notifyAll();
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.b
    public final synchronized void b() {
        int i = 0;
        int max = Math.max(0, com.fyber.inneractive.sdk.player.c.k.t.a(this.e, this.b) - this.f);
        if (max >= this.g) {
            return;
        }
        if (this.c != null) {
            int i2 = this.g - 1;
            while (i <= i2) {
                a aVar = this.h[i];
                if (aVar.a == this.c) {
                    i++;
                } else {
                    a aVar2 = this.h[i2];
                    if (aVar2.a != this.c) {
                        i2--;
                    } else {
                        this.h[i] = aVar2;
                        this.h[i2] = aVar;
                        i2--;
                        i++;
                    }
                }
            }
            max = Math.max(max, i);
            if (max >= this.g) {
                return;
            }
        }
        Arrays.fill(this.h, max, this.g, (Object) null);
        this.g = max;
    }

    public final synchronized int e() {
        return this.f * this.b;
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.b
    public final int c() {
        return this.b;
    }
}

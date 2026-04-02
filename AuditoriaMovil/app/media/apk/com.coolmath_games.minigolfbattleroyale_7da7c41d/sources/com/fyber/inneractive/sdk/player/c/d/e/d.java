package com.fyber.inneractive.sdk.player.c.d.e;

import java.io.IOException;
import java.util.Arrays;
/* loaded from: classes.dex */
final class d {
    final e a = new e();
    final com.fyber.inneractive.sdk.player.c.k.k b = new com.fyber.inneractive.sdk.player.c.k.k(new byte[65025], 0);
    int c = -1;
    boolean d;
    private int e;

    public final boolean a(com.fyber.inneractive.sdk.player.c.d.g gVar) throws IOException, InterruptedException {
        int i;
        com.fyber.inneractive.sdk.player.c.k.a.b(gVar != null);
        if (this.d) {
            this.d = false;
            this.b.a();
        }
        while (!this.d) {
            if (this.c < 0) {
                if (!this.a.a(gVar, true)) {
                    return false;
                }
                int i2 = this.a.h;
                if ((this.a.b & 1) == 1 && this.b.c == 0) {
                    i2 += a(0);
                    i = this.e + 0;
                } else {
                    i = 0;
                }
                gVar.b(i2);
                this.c = i;
            }
            int a = a(this.c);
            int i3 = this.c + this.e;
            if (a > 0) {
                if (this.b.c() < this.b.c + a) {
                    com.fyber.inneractive.sdk.player.c.k.k kVar = this.b;
                    kVar.a = Arrays.copyOf(kVar.a, this.b.c + a);
                }
                gVar.b(this.b.a, this.b.c, a);
                com.fyber.inneractive.sdk.player.c.k.k kVar2 = this.b;
                kVar2.b(kVar2.c + a);
                this.d = this.a.j[i3 + (-1)] != 255;
            }
            if (i3 == this.a.g) {
                i3 = -1;
            }
            this.c = i3;
        }
        return true;
    }

    private int a(int i) {
        int i2 = 0;
        this.e = 0;
        while (this.e + i < this.a.g) {
            int[] iArr = this.a.j;
            int i3 = this.e;
            this.e = i3 + 1;
            int i4 = iArr[i3 + i];
            i2 += i4;
            if (i4 != 255) {
                break;
            }
        }
        return i2;
    }
}

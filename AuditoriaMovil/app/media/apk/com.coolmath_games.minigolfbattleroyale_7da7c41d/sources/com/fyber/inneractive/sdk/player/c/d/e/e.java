package com.fyber.inneractive.sdk.player.c.d.e;

import com.fyber.inneractive.sdk.player.c.k.t;
import com.fyber.inneractive.sdk.player.c.l;
import java.io.EOFException;
import java.io.IOException;
/* loaded from: classes.dex */
final class e {
    private static final int k = t.e("OggS");
    public int a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public int g;
    public int h;
    public int i;
    public final int[] j = new int[255];
    private final com.fyber.inneractive.sdk.player.c.k.k l = new com.fyber.inneractive.sdk.player.c.k.k(255);

    public final void a() {
        this.a = 0;
        this.b = 0;
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.g = 0;
        this.h = 0;
        this.i = 0;
    }

    public final boolean a(com.fyber.inneractive.sdk.player.c.d.g gVar, boolean z) throws IOException, InterruptedException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        this.l.a();
        a();
        if (!(gVar.d() == -1 || gVar.d() - gVar.b() >= 27) || !gVar.b(this.l.a, 0, 27, true)) {
            if (z) {
                return false;
            }
            throw new EOFException();
        } else if (this.l.h() != k) {
            if (z) {
                return false;
            }
            throw new l("expected OggS capture pattern at begin of page");
        } else {
            int d = this.l.d();
            this.a = d;
            if (d != 0) {
                if (z) {
                    return false;
                }
                throw new l("unsupported bit stream revision");
            }
            this.b = this.l.d();
            com.fyber.inneractive.sdk.player.c.k.k kVar = this.l;
            byte[] bArr = kVar.a;
            kVar.b = kVar.b + 1;
            byte[] bArr2 = kVar.a;
            kVar.b = kVar.b + 1;
            long j = (bArr[i] & 255) | ((bArr2[i2] & 255) << 8);
            byte[] bArr3 = kVar.a;
            kVar.b = kVar.b + 1;
            long j2 = j | ((bArr3[i3] & 255) << 16);
            byte[] bArr4 = kVar.a;
            kVar.b = kVar.b + 1;
            long j3 = j2 | ((bArr4[i4] & 255) << 24);
            byte[] bArr5 = kVar.a;
            kVar.b = kVar.b + 1;
            long j4 = j3 | ((bArr5[i5] & 255) << 32);
            byte[] bArr6 = kVar.a;
            kVar.b = kVar.b + 1;
            long j5 = j4 | ((bArr6[i6] & 255) << 40);
            byte[] bArr7 = kVar.a;
            kVar.b = kVar.b + 1;
            long j6 = j5 | ((bArr7[i7] & 255) << 48);
            byte[] bArr8 = kVar.a;
            kVar.b = kVar.b + 1;
            this.c = j6 | ((255 & bArr8[i8]) << 56);
            this.d = this.l.i();
            this.e = this.l.i();
            this.f = this.l.i();
            int d2 = this.l.d();
            this.g = d2;
            this.h = d2 + 27;
            this.l.a();
            gVar.c(this.l.a, 0, this.g);
            for (int i9 = 0; i9 < this.g; i9++) {
                this.j[i9] = this.l.d();
                this.i += this.j[i9];
            }
            return true;
        }
    }
}

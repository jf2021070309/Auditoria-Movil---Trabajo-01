package com.fyber.inneractive.sdk.player.c.d.a;

import com.fyber.inneractive.sdk.player.c.d.a.d;
import com.fyber.inneractive.sdk.player.c.d.n;
import com.fyber.inneractive.sdk.player.c.h;
import com.fyber.inneractive.sdk.player.c.k.i;
import com.fyber.inneractive.sdk.player.c.k.k;
import com.fyber.inneractive.sdk.player.c.l;
/* loaded from: classes.dex */
final class e extends d {
    private final k a;
    private final k c;
    private int d;
    private boolean e;
    private int f;

    public e(n nVar) {
        super(nVar);
        this.a = new k(i.a);
        this.c = new k(4);
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.a.d
    protected final boolean a(k kVar) throws d.a {
        int d = kVar.d();
        int i = (d >> 4) & 15;
        int i2 = d & 15;
        if (i2 != 7) {
            throw new d.a("Video format not supported: " + i2);
        }
        this.f = i;
        return i != 5;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.a.d
    protected final void a(k kVar, long j) throws l {
        int d = kVar.d();
        long g = j + (kVar.g() * 1000);
        if (d == 0 && !this.e) {
            k kVar2 = new k(new byte[kVar.b()]);
            kVar.a(kVar2.a, 0, kVar.b());
            com.fyber.inneractive.sdk.player.c.l.a a = com.fyber.inneractive.sdk.player.c.l.a.a(kVar2);
            this.d = a.b;
            this.b.a(h.a(null, "video/avc", a.c, a.d, a.a, a.e));
            this.e = true;
        } else if (d == 1 && this.e) {
            byte[] bArr = this.c.a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i = 4 - this.d;
            int i2 = 0;
            while (kVar.b() > 0) {
                kVar.a(this.c.a, i, this.d);
                this.c.c(0);
                int n = this.c.n();
                this.a.c(0);
                this.b.a(this.a, 4);
                this.b.a(kVar, n);
                i2 = i2 + 4 + n;
            }
            this.b.a(g, this.f == 1 ? 1 : 0, i2, 0, null);
        }
    }
}

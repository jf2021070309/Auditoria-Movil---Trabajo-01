package com.fyber.inneractive.sdk.player.c.d.a;

import com.fyber.inneractive.sdk.player.c.d.f;
import com.fyber.inneractive.sdk.player.c.d.g;
import com.fyber.inneractive.sdk.player.c.d.h;
import com.fyber.inneractive.sdk.player.c.d.i;
import com.fyber.inneractive.sdk.player.c.d.l;
import com.fyber.inneractive.sdk.player.c.d.m;
import com.fyber.inneractive.sdk.player.c.k.k;
import com.fyber.inneractive.sdk.player.c.k.t;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
/* loaded from: classes.dex */
public final class b implements f, m {
    public static final i a = new i() { // from class: com.fyber.inneractive.sdk.player.c.d.a.b.1
        @Override // com.fyber.inneractive.sdk.player.c.d.i
        public final f[] a() {
            return new f[]{new b()};
        }
    };
    private static final int e = t.e("FLV");
    public int b;
    public int c;
    public long d;
    private h j;
    private int l;
    private a m;
    private e n;
    private c o;
    private final k f = new k(4);
    private final k g = new k(9);
    private final k h = new k(11);
    private final k i = new k();
    private int k = 1;

    @Override // com.fyber.inneractive.sdk.player.c.d.m
    public final long a(long j) {
        return 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.m
    public final boolean b_() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f
    public final boolean a(g gVar) throws IOException, InterruptedException {
        gVar.c(this.f.a, 0, 3);
        this.f.c(0);
        if (this.f.g() != e) {
            return false;
        }
        gVar.c(this.f.a, 0, 2);
        this.f.c(0);
        if ((this.f.e() & IronSourceConstants.INTERSTITIAL_DAILY_CAPPED) != 0) {
            return false;
        }
        gVar.c(this.f.a, 0, 4);
        this.f.c(0);
        int j = this.f.j();
        gVar.a();
        gVar.c(j);
        gVar.c(this.f.a, 0, 4);
        this.f.c(0);
        return this.f.j() == 0;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f
    public final void a(h hVar) {
        this.j = hVar;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f
    public final void a(long j, long j2) {
        this.k = 1;
        this.l = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f
    public final int a(g gVar, l lVar) throws IOException, InterruptedException {
        c cVar;
        e eVar;
        a aVar;
        while (true) {
            int i = this.k;
            boolean z = true;
            if (i == 1) {
                if (gVar.a(this.g.a, 0, 9, true)) {
                    this.g.c(0);
                    this.g.d(4);
                    int d = this.g.d();
                    boolean z2 = (d & 4) != 0;
                    boolean z3 = (d & 1) != 0;
                    if (z2 && this.m == null) {
                        this.m = new a(this.j.a(8));
                    }
                    if (z3 && this.n == null) {
                        this.n = new e(this.j.a(9));
                    }
                    if (this.o == null) {
                        this.o = new c();
                    }
                    this.j.b();
                    this.j.a(this);
                    this.l = (this.g.j() - 9) + 4;
                    this.k = 2;
                } else {
                    z = false;
                }
                if (!z) {
                    return -1;
                }
            } else if (i == 2) {
                gVar.b(this.l);
                this.l = 0;
                this.k = 3;
            } else if (i == 3) {
                if (gVar.a(this.h.a, 0, 11, true)) {
                    this.h.c(0);
                    this.b = this.h.d();
                    this.c = this.h.g();
                    this.d = this.h.g();
                    this.d = ((this.h.d() << 24) | this.d) * 1000;
                    this.h.d(3);
                    this.k = 4;
                } else {
                    z = false;
                }
                if (!z) {
                    return -1;
                }
            } else if (i == 4) {
                if (this.b == 8 && (aVar = this.m) != null) {
                    aVar.b(b(gVar), this.d);
                } else if (this.b == 9 && (eVar = this.n) != null) {
                    eVar.b(b(gVar), this.d);
                } else if (this.b == 18 && (cVar = this.o) != null) {
                    cVar.b(b(gVar), this.d);
                } else {
                    gVar.b(this.c);
                    z = false;
                }
                this.l = 4;
                this.k = 2;
                if (z) {
                    return 0;
                }
            } else {
                continue;
            }
        }
    }

    private k b(g gVar) throws IOException, InterruptedException {
        if (this.c > this.i.c()) {
            k kVar = this.i;
            kVar.a(new byte[Math.max(kVar.c() * 2, this.c)], 0);
        } else {
            this.i.c(0);
        }
        this.i.b(this.c);
        gVar.b(this.i.a, 0, this.c);
        return this.i;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.m
    public final long b() {
        return this.o.a;
    }
}

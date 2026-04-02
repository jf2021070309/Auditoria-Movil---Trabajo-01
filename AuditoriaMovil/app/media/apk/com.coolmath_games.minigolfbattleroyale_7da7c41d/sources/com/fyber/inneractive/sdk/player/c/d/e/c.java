package com.fyber.inneractive.sdk.player.c.d.e;

import com.fyber.inneractive.sdk.player.c.d.n;
import com.fyber.inneractive.sdk.player.c.l;
import java.io.IOException;
/* loaded from: classes.dex */
public final class c implements com.fyber.inneractive.sdk.player.c.d.f {
    public static final com.fyber.inneractive.sdk.player.c.d.i a = new com.fyber.inneractive.sdk.player.c.d.i() { // from class: com.fyber.inneractive.sdk.player.c.d.e.c.1
        @Override // com.fyber.inneractive.sdk.player.c.d.i
        public final com.fyber.inneractive.sdk.player.c.d.f[] a() {
            return new com.fyber.inneractive.sdk.player.c.d.f[]{new c()};
        }
    };
    private h b;

    @Override // com.fyber.inneractive.sdk.player.c.d.f
    public final boolean a(com.fyber.inneractive.sdk.player.c.d.g gVar) throws IOException, InterruptedException {
        try {
            e eVar = new e();
            if (eVar.a(gVar, true) && (eVar.b & 2) == 2) {
                int min = Math.min(eVar.i, 8);
                com.fyber.inneractive.sdk.player.c.k.k kVar = new com.fyber.inneractive.sdk.player.c.k.k(min);
                gVar.c(kVar.a, 0, min);
                kVar.c(0);
                if (kVar.b() >= 5 && kVar.d() == 127 && kVar.h() == 1179402563) {
                    this.b = new b();
                } else {
                    kVar.c(0);
                    if (j.b(kVar)) {
                        this.b = new j();
                    } else {
                        kVar.c(0);
                        if (g.b(kVar)) {
                            this.b = new g();
                        }
                    }
                }
                return true;
            }
        } catch (l unused) {
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f
    public final void a(com.fyber.inneractive.sdk.player.c.d.h hVar) {
        n a2 = hVar.a(0);
        hVar.b();
        this.b.a(hVar, a2);
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f
    public final void a(long j, long j2) {
        this.b.a(j, j2);
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f
    public final int a(com.fyber.inneractive.sdk.player.c.d.g gVar, com.fyber.inneractive.sdk.player.c.d.l lVar) throws IOException, InterruptedException {
        h hVar = this.b;
        int i = hVar.c;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return hVar.a(gVar, lVar);
                }
                throw new IllegalStateException();
            }
            gVar.b((int) hVar.b);
            hVar.c = 2;
            return 0;
        }
        return hVar.a(gVar);
    }
}

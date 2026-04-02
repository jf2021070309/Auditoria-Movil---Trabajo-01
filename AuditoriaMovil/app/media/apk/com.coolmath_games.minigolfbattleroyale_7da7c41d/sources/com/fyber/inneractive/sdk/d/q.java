package com.fyber.inneractive.sdk.d;

import com.fyber.inneractive.sdk.config.u;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
/* loaded from: classes.dex */
public final class q extends g<com.fyber.inneractive.sdk.j.g> {
    public com.fyber.inneractive.sdk.player.g a;
    public boolean b;

    @Override // com.fyber.inneractive.sdk.d.g
    public final boolean isVideoAd() {
        return true;
    }

    public q(u uVar, com.fyber.inneractive.sdk.config.a.s sVar, com.fyber.inneractive.sdk.j.g gVar, InneractiveAdRequest inneractiveAdRequest) {
        super(uVar, sVar);
        this.b = false;
        a((q) gVar);
        a(inneractiveAdRequest);
    }

    @Override // com.fyber.inneractive.sdk.d.g
    public final void b() {
        com.fyber.inneractive.sdk.player.g gVar = this.a;
        if (gVar != null) {
            gVar.d();
            this.a = null;
        }
    }

    public final void a(String str, String... strArr) {
        com.fyber.inneractive.sdk.player.g gVar = this.a;
        if (gVar != null) {
            gVar.a(str, strArr);
        }
    }

    public final String c() {
        if (this.g != 0) {
            com.fyber.inneractive.sdk.j.g gVar = (com.fyber.inneractive.sdk.j.g) this.g;
            if (gVar.E != null) {
                return gVar.E.b;
            }
        }
        return null;
    }

    public final String e() {
        if (this.g != 0) {
            com.fyber.inneractive.sdk.g.a.b bVar = ((com.fyber.inneractive.sdk.j.g) this.g).E.g;
            r1 = bVar != null ? bVar.f : null;
            if (r1 == null) {
                return c();
            }
        }
        return r1;
    }

    @Override // com.fyber.inneractive.sdk.d.g
    public final boolean d() {
        return this.a != null;
    }

    @Override // com.fyber.inneractive.sdk.d.g
    public final boolean a_() {
        if (this.i.g() == null) {
            return false;
        }
        return this.i.g().i();
    }
}

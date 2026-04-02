package com.fyber.inneractive.sdk.d;

import com.fyber.inneractive.sdk.external.InneractiveError;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.player.g;
import com.fyber.inneractive.sdk.util.IAlog;
/* loaded from: classes.dex */
public final class f extends b<com.fyber.inneractive.sdk.j.g, q> implements g.a {
    private com.fyber.inneractive.sdk.player.g g;
    private String h;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.d.b
    public final String b() {
        return "send_failed_vast_creatives";
    }

    public f(String str) {
        this.h = str;
    }

    @Override // com.fyber.inneractive.sdk.d.b
    public final void a() {
        IAlog.b(IAlog.a(this) + "start called", new Object[0]);
        this.c = new q(g(), this.e, (com.fyber.inneractive.sdk.j.g) this.b, this.a);
        this.g = new com.fyber.inneractive.sdk.player.g((com.fyber.inneractive.sdk.j.g) this.b, this.a, (q) this.c, this);
        ((q) this.c).a = this.g;
        ((q) this.c).k = this.f;
        com.fyber.inneractive.sdk.player.g gVar = this.g;
        gVar.c = null;
        if (gVar.a != null && gVar.a.E != null) {
            gVar.c = gVar.a.E.a();
        }
        if (gVar.c == null) {
            gVar.e();
            gVar.b.b(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR));
            return;
        }
        gVar.c();
        gVar.b();
    }

    @Override // com.fyber.inneractive.sdk.d.b, com.fyber.inneractive.sdk.e.a
    public final void e() {
        this.g.d();
    }

    @Override // com.fyber.inneractive.sdk.d.b, com.fyber.inneractive.sdk.player.g.a
    public final void h() {
        super.h();
    }

    @Override // com.fyber.inneractive.sdk.player.g.a
    public final void b(InneractiveInfrastructureError inneractiveInfrastructureError) {
        a((InneractiveError) inneractiveInfrastructureError);
        a(inneractiveInfrastructureError);
    }
}

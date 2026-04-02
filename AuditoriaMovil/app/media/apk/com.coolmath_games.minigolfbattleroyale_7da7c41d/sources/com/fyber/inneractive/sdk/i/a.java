package com.fyber.inneractive.sdk.i;

import android.content.Context;
import com.fyber.inneractive.sdk.d.q;
import com.fyber.inneractive.sdk.d.r;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.player.b;
/* loaded from: classes.dex */
public final class a extends i {
    private com.fyber.inneractive.sdk.player.d c;

    @Override // com.fyber.inneractive.sdk.i.i
    public final void a(b.a aVar) {
    }

    public a(com.fyber.inneractive.sdk.player.g gVar) {
        this.c = (com.fyber.inneractive.sdk.player.d) gVar.d;
    }

    @Override // com.fyber.inneractive.sdk.i.i
    public final com.fyber.inneractive.sdk.player.e.e a(Context context) {
        if (this.b == null) {
            this.b = new com.fyber.inneractive.sdk.player.e.d(context);
        }
        return this.b;
    }

    @Override // com.fyber.inneractive.sdk.i.i
    public final com.fyber.inneractive.sdk.player.b.b a(InneractiveAdSpot inneractiveAdSpot, q qVar) {
        if (this.a == null) {
            InneractiveUnitController selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
            this.a = new com.fyber.inneractive.sdk.player.b.g(this.c, (com.fyber.inneractive.sdk.player.e.d) this.b, com.fyber.inneractive.sdk.config.a.a(inneractiveAdSpot.getAdContent().f().p), qVar.i(), selectedUnitController instanceof r ? ((r) selectedUnitController).isOverlayOutside() : false);
        }
        return this.a;
    }

    @Override // com.fyber.inneractive.sdk.i.i
    public final boolean a() {
        return this.c.p();
    }
}

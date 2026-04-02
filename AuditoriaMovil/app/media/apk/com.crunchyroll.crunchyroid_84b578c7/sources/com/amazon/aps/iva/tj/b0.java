package com.amazon.aps.iva.tj;

import android.content.Context;
import android.os.Looper;
import com.amazon.aps.iva.rj.b;
import com.amazon.aps.iva.sj.b;
import com.amazon.aps.iva.sj.c;
import com.crunchyroll.player.exoplayercomponent.components.ExoplayerComponent;
import com.google.android.gms.cast.framework.media.NotificationOptions;
/* compiled from: ExoplayerComponent.kt */
/* loaded from: classes.dex */
public final class b0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ka0.c0<com.amazon.aps.iva.a6.m>, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ ExoplayerComponent h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(ExoplayerComponent exoplayerComponent) {
        super(1);
        this.h = exoplayerComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.amazon.aps.iva.ja0.b] */
    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ka0.c0<com.amazon.aps.iva.a6.m> c0Var) {
        com.amazon.aps.iva.rj.b bVar;
        boolean z;
        com.amazon.aps.iva.ka0.c0<com.amazon.aps.iva.a6.m> c0Var2 = c0Var;
        com.amazon.aps.iva.yb0.j.f(c0Var2, "muxStatsSdk");
        ExoplayerComponent exoplayerComponent = this.h;
        com.amazon.aps.iva.rj.b bVar2 = exoplayerComponent.r;
        if (bVar2 != null) {
            ExoplayerComponent.a aVar = exoplayerComponent.j;
            if (aVar != null) {
                if (!aVar.a.b) {
                    c0Var2 = null;
                }
                Context context = bVar2.a;
                context.getClass();
                Context applicationContext = context.getApplicationContext();
                b.a aVar2 = new b.a();
                if (c0Var2 != null) {
                    bVar = new com.amazon.aps.iva.ja0.b(new com.amazon.aps.iva.p0.e(new com.amazon.aps.iva.ja0.a(c0Var2)), bVar2, bVar2);
                } else {
                    bVar = bVar2;
                }
                com.amazon.aps.iva.sj.b bVar3 = new com.amazon.aps.iva.sj.b(applicationContext, new c.a(NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS, -1, -1, false, true, -1, bVar, bVar), aVar2);
                com.amazon.aps.iva.a6.m mVar = bVar2.i;
                boolean z2 = false;
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    z = true;
                } else {
                    z = false;
                }
                com.amazon.aps.iva.cq.b.C(z);
                if (mVar == null || mVar.c0() == Looper.getMainLooper()) {
                    z2 = true;
                }
                com.amazon.aps.iva.cq.b.C(z2);
                bVar3.j = mVar;
                bVar3.i = true;
                b.a aVar3 = bVar2.e;
                aVar3.getClass();
                aVar3.a = bVar3;
                return com.amazon.aps.iva.kb0.q.a;
            }
            com.amazon.aps.iva.yb0.j.m("playerConfig");
            throw null;
        }
        com.amazon.aps.iva.yb0.j.m("adsHelper");
        throw null;
    }
}

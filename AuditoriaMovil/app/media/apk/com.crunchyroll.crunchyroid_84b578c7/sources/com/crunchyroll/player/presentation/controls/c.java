package com.crunchyroll.player.presentation.controls;

import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.p;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.cj.h;
import com.amazon.aps.iva.cj.n;
import com.amazon.aps.iva.dj.f;
import com.amazon.aps.iva.il.k;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: PlayerControlsLayout.kt */
/* loaded from: classes2.dex */
public final class c extends l implements com.amazon.aps.iva.xb0.l<p, k> {
    public final /* synthetic */ PlayerControlsLayout h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PlayerControlsLayout playerControlsLayout) {
        super(1);
        this.h = playerControlsLayout;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final k invoke(p pVar) {
        j.f(pVar, "it");
        PlayerControlsLayout playerControlsLayout = this.h;
        LifecycleCoroutineScopeImpl O = x.O(playerControlsLayout);
        h hVar = n.e;
        if (hVar != null) {
            com.amazon.aps.iva.hj.c a = hVar.a();
            f.a.getClass();
            return new k(O, hVar, a, f.a.b.f, new a(playerControlsLayout), new b(playerControlsLayout));
        }
        j.m("player");
        throw null;
    }
}

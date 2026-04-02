package com.amazon.aps.iva.bl;

import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.nk.j;
import com.amazon.aps.iva.ve0.u0;
import com.crunchyroll.player.presentation.controls.PlayerControlsLayout;
/* compiled from: PlayerTimelineDataProvider.kt */
/* loaded from: classes2.dex */
public final class d implements a {
    public final u0<j> a;
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.ob0.g> b;
    public final m c = com.amazon.aps.iva.kb0.f.b(new c(this));

    public d(u0 u0Var, PlayerControlsLayout.a aVar) {
        this.a = u0Var;
        this.b = aVar;
    }

    @Override // com.amazon.aps.iva.bl.a
    public final LiveData<h> getData() {
        return (LiveData) this.c.getValue();
    }
}

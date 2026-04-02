package com.amazon.aps.iva.wk;

import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.nk.j;
import com.amazon.aps.iva.ve0.u0;
import com.crunchyroll.player.presentation.controls.PlayerControlsLayout;
/* compiled from: AdsTimelineDataProvider.kt */
/* loaded from: classes2.dex */
public final class e implements b {
    public final u0<j> a;
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.ob0.g> b;
    public final m c = com.amazon.aps.iva.kb0.f.b(new d(this));

    public e(u0 u0Var, PlayerControlsLayout.b bVar) {
        this.a = u0Var;
        this.b = bVar;
    }

    @Override // com.amazon.aps.iva.wk.b
    public final LiveData<a> getData() {
        return (LiveData) this.c.getValue();
    }
}

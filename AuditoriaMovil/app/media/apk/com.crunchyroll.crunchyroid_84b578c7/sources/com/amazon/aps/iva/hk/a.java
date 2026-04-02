package com.amazon.aps.iva.hk;

import android.content.Context;
import android.view.accessibility.CaptioningManager;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: CaptionsTrackSelector.kt */
/* loaded from: classes.dex */
public final class a extends l implements com.amazon.aps.iva.xb0.a<Boolean> {
    public final /* synthetic */ Context h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(0);
        this.h = context;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Boolean invoke() {
        Object systemService = this.h.getSystemService("captioning");
        j.d(systemService, "null cannot be cast to non-null type android.view.accessibility.CaptioningManager");
        return Boolean.valueOf(((CaptioningManager) systemService).isEnabled());
    }
}

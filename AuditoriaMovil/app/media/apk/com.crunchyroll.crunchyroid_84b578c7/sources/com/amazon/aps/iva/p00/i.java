package com.amazon.aps.iva.p00;

import android.view.View;
import android.view.ViewGroup;
import com.amazon.aps.iva.yb0.l;
/* compiled from: VideoDownloadModuleImpl.kt */
/* loaded from: classes2.dex */
public final class i extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.a10.d> {
    public final /* synthetic */ c h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(c cVar) {
        super(0);
        this.h = cVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.a10.d invoke() {
        c cVar = this.h;
        View findViewById = cVar.a.findViewById(cVar.e);
        com.amazon.aps.iva.yb0.j.e(findViewById, "activity.findViewById(snackbarContainerId)");
        return new com.amazon.aps.iva.a10.d((ViewGroup) findViewById);
    }
}

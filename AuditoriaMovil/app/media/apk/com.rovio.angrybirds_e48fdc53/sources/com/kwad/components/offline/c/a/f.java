package com.kwad.components.offline.c.a;

import com.kwad.components.offline.api.tk.IOfflineTKRenderListener;
import com.kwad.sdk.components.k;
/* loaded from: classes.dex */
public final class f implements IOfflineTKRenderListener {
    private final k aae;

    public f(k kVar) {
        this.aae = kVar;
    }

    @Override // com.kwad.components.offline.api.tk.IOfflineTKRenderListener
    public final void onFailed(Throwable th) {
        k kVar = this.aae;
        if (kVar != null) {
            kVar.onFailed(th);
        }
    }

    @Override // com.kwad.components.offline.api.tk.IOfflineTKRenderListener
    public final void onSuccess() {
        k kVar = this.aae;
        if (kVar != null) {
            kVar.onSuccess();
        }
    }
}

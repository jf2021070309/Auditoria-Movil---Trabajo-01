package com.kwad.components.offline.c.a;

import com.kwad.components.offline.api.tk.IOfflineTKCallHandler;
import com.kwad.sdk.components.i;
/* loaded from: classes.dex */
public final class e implements IOfflineTKCallHandler {
    private final i aad;

    public e(i iVar) {
        this.aad = iVar;
    }

    @Override // com.kwad.components.offline.api.tk.IOfflineTKCallHandler
    public final void callJS(String str) {
        i iVar = this.aad;
        if (iVar != null) {
            iVar.callJS(str);
        }
    }
}

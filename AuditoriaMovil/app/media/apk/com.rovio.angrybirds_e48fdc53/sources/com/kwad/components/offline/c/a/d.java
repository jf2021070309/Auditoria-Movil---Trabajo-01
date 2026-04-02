package com.kwad.components.offline.c.a;

import com.kwad.components.offline.api.tk.jsbridge.IOfflineCompoTKBridgeHandler;
/* loaded from: classes.dex */
public final class d implements IOfflineCompoTKBridgeHandler {
    private final com.kwad.sdk.core.webview.c.g aac;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(com.kwad.sdk.core.webview.c.g gVar) {
        this.aac = gVar;
    }

    @Override // com.kwad.components.offline.api.tk.jsbridge.IOfflineCompoTKBridgeHandler
    public final void callTKBridge(String str) {
        com.kwad.sdk.core.webview.c.g gVar = this.aac;
        if (gVar != null) {
            gVar.callTKBridge(str);
        }
    }
}

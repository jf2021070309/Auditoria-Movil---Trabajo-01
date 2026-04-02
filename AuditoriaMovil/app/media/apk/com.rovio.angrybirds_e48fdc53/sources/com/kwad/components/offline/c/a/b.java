package com.kwad.components.offline.c.a;

import com.kwad.components.offline.api.tk.jsbridge.IOfflineCompoBridgeHandler;
import com.kwad.components.offline.api.tk.jsbridge.IOfflineCompoCallBackFunction;
import com.kwad.sdk.utils.ao;
/* loaded from: classes.dex */
public final class b implements IOfflineCompoBridgeHandler {
    private final com.kwad.sdk.core.webview.c.a ZY;

    public b(com.kwad.sdk.core.webview.c.a aVar) {
        ao.checkNotNull(aVar);
        this.ZY = aVar;
    }

    @Override // com.kwad.components.offline.api.tk.jsbridge.IOfflineCompoBridgeHandler
    public final String getKey() {
        return this.ZY.getKey();
    }

    @Override // com.kwad.components.offline.api.tk.jsbridge.IOfflineCompoBridgeHandler
    public final void handleJsCall(String str, IOfflineCompoCallBackFunction iOfflineCompoCallBackFunction) {
        this.ZY.a(str, new a(iOfflineCompoCallBackFunction));
    }

    @Override // com.kwad.components.offline.api.tk.jsbridge.IOfflineCompoBridgeHandler
    public final void onDestroy() {
        this.ZY.onDestroy();
    }
}

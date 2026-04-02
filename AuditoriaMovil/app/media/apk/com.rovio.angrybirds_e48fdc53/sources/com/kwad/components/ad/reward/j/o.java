package com.kwad.components.ad.reward.j;

import com.kwad.components.core.webview.b.a.v;
import com.kwad.components.core.webview.jshandler.ak;
/* loaded from: classes.dex */
public final class o extends v implements ak.b {
    private com.kwad.components.core.playable.a pb;

    public o(com.kwad.components.ad.reward.j jVar) {
        com.kwad.components.core.playable.a aVar = jVar.pb;
        this.pb = aVar;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    @Override // com.kwad.components.core.webview.jshandler.ak.b
    public final void a(ak.a aVar) {
        b(aVar);
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "registerPlayableStatusListener";
    }

    @Override // com.kwad.components.core.webview.b.a.v, com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        super.onDestroy();
        com.kwad.components.core.playable.a aVar = this.pb;
        if (aVar != null) {
            aVar.b(this);
            this.pb = null;
        }
    }
}

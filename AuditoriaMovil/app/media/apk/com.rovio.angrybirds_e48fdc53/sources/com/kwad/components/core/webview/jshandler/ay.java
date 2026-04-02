package com.kwad.components.core.webview.jshandler;

import android.content.Context;
import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes.dex */
public class ay implements com.kwad.sdk.core.webview.c.a {
    private a VN;
    private AdTemplate mAdTemplate;
    protected Context mContext;

    /* loaded from: classes.dex */
    public interface a {
        boolean dy();
    }

    public ay(Context context, AdTemplate adTemplate) {
        this.mContext = com.kwad.sdk.m.l.wrapContextIfNeed(context);
        this.mAdTemplate = adTemplate;
    }

    public final void a(a aVar) {
        this.VN = aVar;
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        a aVar = this.VN;
        boolean dy = aVar != null ? aVar.dy() : true;
        com.kwad.sdk.core.e.c.d("WebShowPlayableHandler", "handleJsCall launch AdPlayableActivityProxy : " + dy);
        if (dy) {
            com.kwad.components.core.page.a.launch(this.mContext, this.mAdTemplate);
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "showPlayable";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
    }
}

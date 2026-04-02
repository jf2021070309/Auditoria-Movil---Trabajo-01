package com.kwad.components.core.webview.b;

import android.text.TextUtils;
import com.kwad.components.core.webview.b.b.l;
import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes.dex */
public final class a implements com.kwad.sdk.core.webview.c.a {
    private final AdTemplate mAdTemplate;

    public a(AdTemplate adTemplate) {
        this.mAdTemplate = adTemplate;
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        String str2;
        AdTemplate adTemplate = this.mAdTemplate;
        if (adTemplate != null) {
            String aK = com.kwad.sdk.core.response.b.a.aK(com.kwad.sdk.core.response.b.d.ck(adTemplate));
            if (!TextUtils.isEmpty(aK)) {
                l lVar = new l();
                lVar.Xf = aK;
                cVar.a(lVar);
                return;
            }
            str2 = "landing page url is null";
        } else {
            str2 = "adTemplate is null";
        }
        cVar.onError(-1, str2);
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "getLandingPageInfo";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
    }
}

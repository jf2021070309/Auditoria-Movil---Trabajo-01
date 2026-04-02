package com.kwad.components.core.t;

import android.content.Context;
import com.kwad.components.core.page.AdWebViewActivityProxy;
import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes.dex */
public final class h {
    public static boolean d(AdTemplate adTemplate, boolean z) {
        if (!z && com.kwad.sdk.core.response.b.b.cP(com.kwad.sdk.core.response.b.d.ck(adTemplate))) {
            return com.kwad.sdk.core.config.d.zX();
        }
        return false;
    }

    public static void f(Context context, AdTemplate adTemplate) {
        AdWebViewActivityProxy.launch(context, new AdWebViewActivityProxy.a.C0206a().at(com.kwad.sdk.core.response.b.b.bq(adTemplate)).V(adTemplate).ay(true).oE());
    }
}

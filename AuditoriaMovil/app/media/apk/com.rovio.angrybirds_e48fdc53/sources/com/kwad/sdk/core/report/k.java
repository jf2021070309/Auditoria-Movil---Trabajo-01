package com.kwad.sdk.core.report;

import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes.dex */
public class k extends com.kwad.sdk.core.response.a.a {
    public int arg;
    public long creativeId;
    public long llsid;
    public int score;
    public String source = "union";

    public static k aN(AdTemplate adTemplate) {
        k kVar = new k();
        kVar.creativeId = com.kwad.sdk.core.response.b.d.cu(adTemplate);
        kVar.llsid = com.kwad.sdk.core.response.b.d.ch(adTemplate);
        int cz = com.kwad.sdk.core.response.b.d.cz(adTemplate);
        kVar.score = cz;
        kVar.arg = cz > 0 ? 1 : 0;
        return kVar;
    }

    public final String Cb() {
        return toJson().toString();
    }
}

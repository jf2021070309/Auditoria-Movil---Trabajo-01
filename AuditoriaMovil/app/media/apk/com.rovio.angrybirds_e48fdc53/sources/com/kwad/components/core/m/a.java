package com.kwad.components.core.m;

import android.text.TextUtils;
import com.kwad.components.core.request.model.ImpInfo;
import com.kwad.components.core.response.model.AdResultData;
import com.kwad.sdk.core.network.m;
import com.kwad.sdk.core.response.b.d;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class a extends m<com.kwad.components.core.request.a, AdResultData> {
    private ImpInfo Lp;

    public a(ImpInfo impInfo) {
        this.Lp = impInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.kwad.sdk.core.network.m
    /* renamed from: g */
    public void afterParseData(AdResultData adResultData) {
        super.afterParseData(adResultData);
        h(adResultData);
    }

    private static void h(AdResultData adResultData) {
        com.kwad.components.core.p.a pC;
        int i;
        for (AdTemplate adTemplate : adResultData.getProceedTemplateList()) {
            AdInfo ck = d.ck(adTemplate);
            if (com.kwad.sdk.core.response.b.a.aV(ck)) {
                if (com.kwad.sdk.core.response.b.a.aT(ck).size() == 0) {
                    pC = com.kwad.components.core.p.a.pC();
                    i = 21005;
                    pC.g(adTemplate, i);
                }
            } else if (com.kwad.sdk.core.response.b.a.aZ(ck) && TextUtils.isEmpty(com.kwad.sdk.core.response.b.a.F(ck))) {
                pC = com.kwad.components.core.p.a.pC();
                i = 21006;
                pC.g(adTemplate, i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.kwad.sdk.core.network.m
    /* renamed from: ai */
    public AdResultData parseData(String str) {
        JSONObject jSONObject = new JSONObject(str);
        AdResultData adResultData = new AdResultData(this.Lp.adScene);
        adResultData.parseJson(jSONObject);
        return adResultData;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.kwad.sdk.core.network.a
    /* renamed from: mq */
    public com.kwad.components.core.request.a createRequest() {
        return new com.kwad.components.core.request.a(this.Lp);
    }
}

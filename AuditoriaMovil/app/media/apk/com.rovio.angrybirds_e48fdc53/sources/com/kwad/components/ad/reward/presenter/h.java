package com.kwad.components.ad.reward.presenter;

import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes.dex */
public final class h {
    public static boolean A(com.kwad.components.ad.reward.j jVar) {
        AdTemplate adTemplate = jVar.mAdTemplate;
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        if ((com.kwad.sdk.core.response.b.a.bv(ck) && jVar.pb != null && jVar.pb.pz()) || com.kwad.components.ad.reward.a.b.k(ck) || adTemplate.mXiaomiAppStoreDetailViewOpen) {
            return false;
        }
        if (com.kwad.components.ad.reward.a.b.gQ()) {
            return true;
        }
        return com.kwad.sdk.core.response.b.a.ax(ck) && com.kwad.sdk.core.response.b.a.al(ck);
    }
}

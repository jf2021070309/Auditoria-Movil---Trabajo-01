package com.kwad.components.ad.reward;

import android.content.Context;
import com.kwad.components.core.page.DownloadLandPageActivity;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes.dex */
public final class m {
    public static void m(j jVar) {
        AdTemplate adTemplate = jVar.mAdTemplate;
        Context context = jVar.mContext;
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        if ((com.kwad.sdk.core.response.b.a.bv(ck) && jVar.pb != null && jVar.pb.pz()) || com.kwad.components.ad.reward.a.b.k(ck) || adTemplate.mXiaomiAppStoreDetailViewOpen || !com.kwad.sdk.core.response.b.a.ax(ck) || !com.kwad.sdk.core.response.b.a.al(ck) || adTemplate.hasEnterAdWebViewLandPageActivity) {
            return;
        }
        jVar.mAdTemplate.hasEnterAdWebViewLandPageActivity = true;
        DownloadLandPageActivity.launch(context, adTemplate, true);
    }
}

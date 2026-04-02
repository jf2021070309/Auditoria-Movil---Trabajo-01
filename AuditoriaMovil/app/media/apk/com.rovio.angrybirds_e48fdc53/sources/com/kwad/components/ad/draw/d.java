package com.kwad.components.ad.draw;

import android.text.TextUtils;
import com.kwad.components.ad.KsAdLoadManager;
import com.kwad.components.core.request.model.ImpInfo;
import com.kwad.components.core.request.model.a;
import com.kwad.components.core.response.model.AdResultData;
import com.kwad.components.core.t.k;
import com.kwad.sdk.api.KsLoadManager;
import com.kwad.sdk.api.KsScene;
import com.kwad.sdk.core.network.f;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.internal.api.SceneImpl;
import com.kwad.sdk.utils.bj;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class d {
    public static void loadDrawAd(KsScene ksScene, final KsLoadManager.DrawAdListener drawAdListener) {
        SceneImpl covert = SceneImpl.covert(ksScene);
        boolean a = k.qq().a(covert, "loadDrawAd");
        covert.setAdStyle(6);
        KsAdLoadManager.M();
        KsAdLoadManager.a(new a.C0211a().e(new ImpInfo(covert)).aE(a).a(new com.kwad.components.core.request.c() { // from class: com.kwad.components.ad.draw.d.1
            @Override // com.kwad.components.core.request.c, com.kwad.components.core.request.i
            public final void a(AdResultData adResultData) {
                final ArrayList arrayList = new ArrayList();
                for (AdTemplate adTemplate : adResultData.getAdTemplateList()) {
                    if (adTemplate != null && !TextUtils.isEmpty(com.kwad.sdk.core.response.b.a.F(com.kwad.sdk.core.response.b.d.ck(adTemplate)))) {
                        arrayList.add(new c(adTemplate));
                    }
                }
                if (!arrayList.isEmpty()) {
                    bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.ad.draw.d.1.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            KsAdLoadManager.M().b(arrayList);
                            KsLoadManager.DrawAdListener.this.onDrawAdLoad(arrayList);
                        }
                    });
                    return;
                }
                onError(f.aoZ.errorCode, TextUtils.isEmpty(adResultData.testErrorMsg) ? f.aoZ.msg + "(无视频资源)" : adResultData.testErrorMsg);
            }

            @Override // com.kwad.components.core.request.c, com.kwad.components.core.request.i
            public final void onError(final int i, final String str) {
                bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.ad.draw.d.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.kwad.sdk.core.e.c.d("KsAdDrawLoadManager", "loadDrawAd onError:" + String.format("code:%s__msg:%s", Integer.valueOf(i), str));
                        KsLoadManager.DrawAdListener.this.onError(i, str);
                    }
                });
            }
        }).pL());
    }
}

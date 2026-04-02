package com.kwad.components.ad.reward.i;

import android.content.Context;
import com.kwad.sdk.core.report.AdTrackLog;
import com.kwad.sdk.core.report.j;
import com.kwad.sdk.core.response.model.AdTemplate;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class b {
    public static void a(final Context context, AdTemplate adTemplate, String str, final int i, JSONObject jSONObject) {
        j ci = new j().ci(18);
        ci.a(adTemplate, str, null, new com.kwad.sdk.g.a<AdTrackLog>() { // from class: com.kwad.components.ad.reward.i.b.1
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.g.a
            /* renamed from: a */
            public void accept(AdTrackLog adTrackLog) {
                adTrackLog.rewardDetailStatusBarHeight = com.kwad.sdk.d.a.a.getStatusBarHeight(context);
                adTrackLog.rewardDetailCallPositionY = i;
            }
        });
        com.kwad.sdk.core.report.a.d(adTemplate, jSONObject, ci);
    }

    public static void a(AdTemplate adTemplate, String str, String str2, j jVar, JSONObject jSONObject) {
        if (jVar == null) {
            jVar = new j();
        }
        jVar.a(adTemplate, str, str2, null);
        com.kwad.sdk.core.report.a.a(adTemplate, jVar, jSONObject);
    }
}

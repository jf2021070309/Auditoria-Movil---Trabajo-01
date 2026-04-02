package com.kwad.sdk.core.b.a;

import com.kwad.components.ad.splashscreen.local.SplashSkipViewModel;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class id implements com.kwad.sdk.core.d<SplashSkipViewModel> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(SplashSkipViewModel splashSkipViewModel, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        splashSkipViewModel.skipSecond = jSONObject.optInt("skipSecond");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(SplashSkipViewModel splashSkipViewModel, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (splashSkipViewModel.skipSecond != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "skipSecond", splashSkipViewModel.skipSecond);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(SplashSkipViewModel splashSkipViewModel, JSONObject jSONObject) {
        a2(splashSkipViewModel, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(SplashSkipViewModel splashSkipViewModel, JSONObject jSONObject) {
        return b2(splashSkipViewModel, jSONObject);
    }
}

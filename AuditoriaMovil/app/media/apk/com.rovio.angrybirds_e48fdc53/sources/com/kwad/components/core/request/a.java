package com.kwad.components.core.request;

import android.text.TextUtils;
import com.kwad.components.core.request.model.ImpInfo;
import com.kwad.sdk.components.DevelopMangerComponents;
import com.kwad.sdk.internal.api.AdLabelImpl;
import com.kwad.sdk.internal.api.SceneImpl;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.o;
import com.kwad.sdk.utils.s;
import com.kwad.sdk.utils.t;
import com.kwad.sdk.utils.y;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class a extends com.kwad.sdk.core.network.d {
    private static boolean PG = true;
    ImpInfo Lp;
    private int PF;

    public a(ImpInfo impInfo) {
        this(impInfo, null);
    }

    private a(ImpInfo impInfo, com.kwad.components.core.request.model.c cVar) {
        this(impInfo, null, false, null);
    }

    public a(ImpInfo impInfo, List<String> list, boolean z, com.kwad.components.core.request.model.c cVar) {
        super(c(impInfo), impInfo.adScene);
        putBody("timestamp", System.currentTimeMillis());
        this.Lp = impInfo;
        AdLabelImpl adLabelFromAdScene = impInfo.getAdLabelFromAdScene();
        if (adLabelFromAdScene != null && !adLabelFromAdScene.isAdLabelAppInfoInValid()) {
            a(com.kwad.sdk.core.request.model.a.Cq(), adLabelFromAdScene);
        }
        JSONArray jSONArray = new JSONArray();
        t.putValue(jSONArray, impInfo.toJson());
        putBody("impInfo", jSONArray);
        putBody("universePhotoInfo", cVar);
        int i = this.PF;
        if (i > 0) {
            putBody("calledUnionType", i);
        }
        com.kwad.sdk.components.c.f(DevelopMangerComponents.class);
        String yM = TextUtils.isEmpty("") ? ((DevelopMangerComponents) com.kwad.sdk.components.c.f(DevelopMangerComponents.class)).yM() : "";
        if (!TextUtils.isEmpty(yM)) {
            putBody("universeDebugParam", yM);
        }
        String d = d(impInfo);
        if (!TextUtils.isEmpty(d)) {
            putBody("sdkDebugReqInfo", d);
        }
        com.kwad.sdk.components.c.f(DevelopMangerComponents.class);
        if (list != null) {
            putBody("preloadIdList", new JSONArray((Collection) list));
            putBody("preloadCheck", z);
        }
        putBody("appTag", y.Iv());
        com.kwad.sdk.components.c.f(DevelopMangerComponents.class);
        String rewardCallbackExtraByKey = this.Lp.getRewardCallbackExtraByKey("thirdUserId");
        com.kwad.sdk.core.request.model.g Cx = com.kwad.sdk.core.request.model.g.Cx();
        if (rewardCallbackExtraByKey != null) {
            Cx.dC(rewardCallbackExtraByKey);
        }
        if (adLabelFromAdScene != null && !adLabelFromAdScene.isUserInfoVaild()) {
            a(Cx, adLabelFromAdScene);
        }
        putBody("userInfo", Cx);
    }

    public a(com.kwad.components.core.request.model.a aVar) {
        this(aVar.Lp, aVar.PN, aVar.PO, aVar.PQ);
        this.PF = aVar.PP ? 1 : 0;
    }

    private static void a(com.kwad.sdk.core.request.model.g gVar, AdLabelImpl adLabelImpl) {
        if (adLabelImpl.thirdAge != 0) {
            gVar.thirdAge = adLabelImpl.thirdAge;
        }
        if (adLabelImpl.thirdGender != 0) {
            gVar.thirdGender = adLabelImpl.thirdGender;
        }
        if (TextUtils.isEmpty(adLabelImpl.thirdInterest)) {
            return;
        }
        gVar.thirdInterest = adLabelImpl.thirdInterest;
    }

    private void a(JSONObject jSONObject, AdLabelImpl adLabelImpl) {
        JSONObject jSONObject2 = new JSONObject();
        if (!TextUtils.isEmpty(adLabelImpl.prevTitle)) {
            t.putValue(jSONObject2, "prevTitle", adLabelImpl.prevTitle);
        }
        if (!TextUtils.isEmpty(adLabelImpl.postTitle)) {
            t.putValue(jSONObject2, "postTitle", adLabelImpl.postTitle);
        }
        if (!TextUtils.isEmpty(adLabelImpl.historyTitle)) {
            t.putValue(jSONObject2, "historyTitle", adLabelImpl.historyTitle);
        }
        if (!TextUtils.isEmpty(adLabelImpl.channel)) {
            t.putValue(jSONObject2, "channel", adLabelImpl.channel);
        }
        t.putValue(jSONObject, "content", jSONObject2);
        putBody("appInfo", jSONObject);
    }

    private static int c(ImpInfo impInfo) {
        try {
            return impInfo.adScene.getScreenOrientation();
        } catch (Throwable th) {
            return 0;
        }
    }

    private static String d(ImpInfo impInfo) {
        com.kwad.sdk.service.a.e eVar;
        if (PG && (eVar = (com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)) != null) {
            try {
                return (String) s.h(Class.forName("com.kwad.devTools.PosConfigFetcher").newInstance(), "getConfigParamByPosId", Long.valueOf(impInfo.adScene.getPosId()), eVar.getContext());
            } catch (Exception e) {
                PG = false;
            }
        }
        return "";
    }

    public final void aC(int i) {
        this.PF = i;
    }

    public final int getAdNum() {
        return this.Lp.adScene.getAdNum();
    }

    @Override // com.kwad.sdk.core.network.b, com.kwad.sdk.core.network.g
    public SceneImpl getScene() {
        ImpInfo impInfo = this.Lp;
        if (impInfo != null) {
            return impInfo.adScene;
        }
        return null;
    }

    @Override // com.kwad.sdk.core.network.b, com.kwad.sdk.core.network.g
    public String getUrl() {
        return com.kwad.sdk.h.wZ();
    }

    @Override // com.kwad.sdk.core.network.d
    public boolean needAppList() {
        return true;
    }

    @Override // com.kwad.sdk.core.network.b
    public void onCreate() {
        o.bE(true);
        super.onCreate();
    }
}

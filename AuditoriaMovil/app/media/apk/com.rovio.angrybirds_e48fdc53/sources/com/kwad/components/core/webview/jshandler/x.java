package com.kwad.components.core.webview.jshandler;

import android.text.TextUtils;
import com.kwad.components.core.request.model.ImpInfo;
import com.kwad.components.core.response.model.AdResultData;
import com.kwad.sdk.core.network.BaseResultData;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.bj;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class x implements com.kwad.sdk.core.webview.c.a {
    private final com.kwad.sdk.core.webview.b TO;
    private final boolean Ug = false;
    private com.kwad.sdk.core.network.m<com.kwad.components.core.request.a, AdResultData> ib;

    /* loaded from: classes.dex */
    public static final class a implements com.kwad.sdk.core.b {
        private List<AdTemplate> Uj;

        public a(List<AdTemplate> list) {
            this.Uj = list;
        }

        @Override // com.kwad.sdk.core.b
        public final void parseJson(JSONObject jSONObject) {
        }

        @Override // com.kwad.sdk.core.b
        public final JSONObject toJson() {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            for (AdTemplate adTemplate : this.Uj) {
                if (!TextUtils.isEmpty(adTemplate.mOriginJString)) {
                    try {
                        jSONArray.put(new JSONObject(adTemplate.mOriginJString));
                    } catch (JSONException e) {
                        com.kwad.sdk.core.e.c.printStackTrace(e);
                    }
                }
                jSONArray.put(adTemplate.toJson());
            }
            com.kwad.sdk.utils.t.putValue(jSONObject, "impAdInfo", jSONArray);
            return jSONObject;
        }
    }

    public x(com.kwad.sdk.core.webview.b bVar) {
        this.TO = bVar;
    }

    private void a(final ImpInfo impInfo, final com.kwad.sdk.core.webview.c.c cVar) {
        com.kwad.sdk.core.network.m<com.kwad.components.core.request.a, AdResultData> mVar = this.ib;
        if (mVar != null) {
            mVar.cancel();
        }
        com.kwad.sdk.core.network.m<com.kwad.components.core.request.a, AdResultData> mVar2 = new com.kwad.sdk.core.network.m<com.kwad.components.core.request.a, AdResultData>() { // from class: com.kwad.components.core.webview.jshandler.x.1
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.core.network.m
            /* renamed from: ai */
            public AdResultData parseData(String str) {
                JSONObject jSONObject = new JSONObject(str);
                AdResultData adResultData = new AdResultData(impInfo.adScene);
                adResultData.parseJson(jSONObject);
                return adResultData;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.core.network.a
            /* renamed from: mq */
            public com.kwad.components.core.request.a createRequest() {
                return new com.kwad.components.core.request.a(impInfo);
            }
        };
        this.ib = mVar2;
        mVar2.request(new com.kwad.sdk.core.network.p<com.kwad.components.core.request.a, AdResultData>() { // from class: com.kwad.components.core.webview.jshandler.x.2
            private void b(final AdResultData adResultData) {
                if (!adResultData.isAdResultDataEmpty()) {
                    bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.core.webview.jshandler.x.2.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            cVar.a(new a(adResultData.getAdTemplateList()));
                        }
                    });
                    return;
                }
                StringBuilder sb = new StringBuilder("onError:");
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(com.kwad.sdk.core.network.f.aoZ.errorCode);
                objArr[1] = TextUtils.isEmpty(adResultData.testErrorMsg) ? com.kwad.sdk.core.network.f.aoZ.msg : adResultData.testErrorMsg;
                sb.append(String.format("code:%s__msg:%s", objArr));
                com.kwad.sdk.core.e.c.d("WebCardGetKsAdDataHandler", sb.toString());
                bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.core.webview.jshandler.x.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        cVar.a(new a(new ArrayList()));
                    }
                });
            }

            private void f(int i, String str) {
                com.kwad.sdk.core.e.c.d("WebCardGetKsAdDataHandler", "requestAggregateAd onError code:" + i + " msg: " + str);
                x.this.a(cVar);
            }

            @Override // com.kwad.sdk.core.network.p, com.kwad.sdk.core.network.h
            public final /* synthetic */ void onError(com.kwad.sdk.core.network.g gVar, int i, String str) {
                f(i, str);
            }

            @Override // com.kwad.sdk.core.network.p, com.kwad.sdk.core.network.h
            public final /* synthetic */ void onSuccess(com.kwad.sdk.core.network.g gVar, BaseResultData baseResultData) {
                b((AdResultData) baseResultData);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final com.kwad.sdk.core.webview.c.c cVar) {
        bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.core.webview.jshandler.x.3
            @Override // java.lang.Runnable
            public final void run() {
                cVar.a(new a(new ArrayList()));
            }
        });
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        if (!this.Ug) {
            if (this.TO.DX()) {
                cVar.onError(-1, "native adTemplate is null");
                return;
            } else {
                cVar.a(new a(this.TO.DW()));
                return;
            }
        }
        AdTemplate adTemplate = this.TO.getAdTemplate();
        ImpInfo impInfo = new ImpInfo(adTemplate.mAdScene);
        if (adTemplate.mAdScene != null) {
            impInfo.pageScene = adTemplate.mAdScene.getPageScene();
        }
        impInfo.subPageScene = 106L;
        impInfo.adScene.setAdNum(12);
        impInfo.sdkExtraData = com.kwad.sdk.core.response.b.d.ct(adTemplate);
        a(impInfo, cVar);
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "getKsAdData";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        com.kwad.sdk.core.network.m<com.kwad.components.core.request.a, AdResultData> mVar = this.ib;
        if (mVar != null) {
            mVar.cancel();
        }
    }
}

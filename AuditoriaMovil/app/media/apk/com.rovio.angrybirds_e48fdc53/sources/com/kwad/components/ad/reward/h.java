package com.kwad.components.ad.reward;

import android.text.TextUtils;
import com.kwad.sdk.core.network.BaseResultData;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class h {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        private static h oW = new h((byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b extends com.kwad.sdk.core.network.m<i, BaseResultData> {
        private AdTemplate adTemplate;
        private com.kwad.sdk.core.network.p<i, BaseResultData> oX = new com.kwad.sdk.core.network.p<i, BaseResultData>() { // from class: com.kwad.components.ad.reward.h.b.1
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.core.network.p, com.kwad.sdk.core.network.h
            /* renamed from: a */
            public void onError(i iVar, int i, String str) {
                super.onError(iVar, i, str);
                com.kwad.components.core.p.a.pC().d(b.this.adTemplate, 1, str);
                com.kwad.sdk.core.e.c.i("RewardCallbackVerifyHelper", "callbackUrlInfo verify failed");
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.core.network.p, com.kwad.sdk.core.network.h
            /* renamed from: a */
            public void onSuccess(i iVar, BaseResultData baseResultData) {
                super.onSuccess(iVar, baseResultData);
                com.kwad.components.core.p.a.pC().d(b.this.adTemplate, 0, "success");
                com.kwad.sdk.core.e.c.i("RewardCallbackVerifyHelper", "callbackUrlInfo verify success");
            }
        };

        public b(AdTemplate adTemplate) {
            this.adTemplate = adTemplate;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.kwad.sdk.core.network.a
        /* renamed from: fL */
        public i createRequest() {
            return new i(this.adTemplate);
        }

        public final void fK() {
            request(this.oX);
        }

        @Override // com.kwad.sdk.core.network.m
        public final BaseResultData parseData(String str) {
            BaseResultData baseResultData = new BaseResultData() { // from class: com.kwad.components.ad.reward.RewardCallbackVerifyHelper$ServerCallbackNetworking$2
            };
            if (!TextUtils.isEmpty(str)) {
                try {
                    baseResultData.parseJson(new JSONObject(str));
                } catch (Throwable th) {
                    com.kwad.sdk.core.e.c.printStackTrace(th);
                }
            }
            return baseResultData;
        }
    }

    private h() {
    }

    /* synthetic */ h(byte b2) {
        this();
    }

    public static h fI() {
        return a.oW;
    }

    private static void s(AdTemplate adTemplate) {
        new b(adTemplate).fK();
    }

    public final void r(AdTemplate adTemplate) {
        com.kwad.sdk.core.e.c.d("RewardCallbackVerifyHelper", "handleRewardVerify");
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        if (TextUtils.isEmpty(com.kwad.sdk.core.response.b.a.bD(ck))) {
            q.b(adTemplate, ck);
        } else {
            s(adTemplate);
        }
    }
}

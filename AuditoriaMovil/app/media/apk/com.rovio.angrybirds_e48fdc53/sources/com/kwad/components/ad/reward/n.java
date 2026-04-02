package com.kwad.components.ad.reward;

import com.kwad.components.ad.reward.model.RewardCallBackRespInfo;
import com.kwad.sdk.utils.bj;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class n {
    public static void a(final int i, final j jVar) {
        com.kwad.sdk.core.network.m<com.kwad.components.core.request.d, RewardCallBackRespInfo> mVar = new com.kwad.sdk.core.network.m<com.kwad.components.core.request.d, RewardCallBackRespInfo>() { // from class: com.kwad.components.ad.reward.n.1
            private static RewardCallBackRespInfo M(String str) {
                JSONObject jSONObject = new JSONObject(str);
                RewardCallBackRespInfo rewardCallBackRespInfo = new RewardCallBackRespInfo();
                rewardCallBackRespInfo.parseJson(jSONObject);
                return rewardCallBackRespInfo;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.core.network.a
            /* renamed from: gA */
            public com.kwad.components.core.request.d createRequest() {
                return new com.kwad.components.core.request.d(i, jVar.mAdTemplate);
            }

            @Override // com.kwad.sdk.core.network.m
            public final /* synthetic */ RewardCallBackRespInfo parseData(String str) {
                return M(str);
            }
        };
        if (i == 1) {
            mVar.request(n(jVar));
        } else if (i == 2) {
            mVar.request(o(jVar));
        }
    }

    public static void a(j jVar, long j, long j2, long j3) {
        boolean p = p(jVar);
        long cH = p ? com.kwad.sdk.core.response.b.a.cH(com.kwad.sdk.core.response.b.d.ck(jVar.mAdTemplate)) : 0L;
        if (jVar.pw || !p || !jVar.mCheckExposureResult || j <= ((j2 - 800) - j3) - cH || cH <= 0) {
            return;
        }
        if (com.kwad.sdk.core.response.b.a.cI(com.kwad.sdk.core.response.b.d.ck(jVar.mAdTemplate))) {
            jVar.pv = 1;
            a(2, jVar);
        } else {
            jVar.mAdOpenInteractionListener.onRewardVerify();
        }
        jVar.pw = true;
    }

    private static com.kwad.sdk.core.network.p<com.kwad.components.core.request.d, RewardCallBackRespInfo> n(final j jVar) {
        return new com.kwad.sdk.core.network.p<com.kwad.components.core.request.d, RewardCallBackRespInfo>() { // from class: com.kwad.components.ad.reward.n.2
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.core.network.p, com.kwad.sdk.core.network.h
            /* renamed from: a */
            public void onStartRequest(com.kwad.components.core.request.d dVar) {
                dVar.PH = System.currentTimeMillis();
                com.kwad.components.ad.reward.check.a.c(j.this.mAdTemplate, 1);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.core.network.p, com.kwad.sdk.core.network.h
            /* renamed from: a */
            public void onError(com.kwad.components.core.request.d dVar, int i, String str) {
                super.onError(dVar, i, str);
                bj.postOnUiThread(new Runnable() { // from class: com.kwad.components.ad.reward.n.2.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.this.mCheckExposureResult = false;
                    }
                });
                com.kwad.components.ad.reward.check.a.a(j.this.mAdTemplate, 1, System.currentTimeMillis() - dVar.PH, i, str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.core.network.p, com.kwad.sdk.core.network.h
            /* renamed from: a */
            public void onSuccess(com.kwad.components.core.request.d dVar, final RewardCallBackRespInfo rewardCallBackRespInfo) {
                bj.postOnUiThread(new Runnable() { // from class: com.kwad.components.ad.reward.n.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.this.mCheckExposureResult = rewardCallBackRespInfo.result == 1;
                    }
                });
                com.kwad.components.ad.reward.check.a.a(j.this.mAdTemplate, 1, System.currentTimeMillis() - dVar.PH, rewardCallBackRespInfo.result, rewardCallBackRespInfo.errorMsg);
            }
        };
    }

    private static com.kwad.sdk.core.network.p<com.kwad.components.core.request.d, RewardCallBackRespInfo> o(final j jVar) {
        return new com.kwad.sdk.core.network.p<com.kwad.components.core.request.d, RewardCallBackRespInfo>() { // from class: com.kwad.components.ad.reward.n.3
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.core.network.p, com.kwad.sdk.core.network.h
            /* renamed from: a */
            public void onStartRequest(com.kwad.components.core.request.d dVar) {
                dVar.PH = System.currentTimeMillis();
                com.kwad.components.ad.reward.check.a.c(j.this.mAdTemplate, 2);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.core.network.p, com.kwad.sdk.core.network.h
            /* renamed from: a */
            public void onError(com.kwad.components.core.request.d dVar, int i, String str) {
                super.onError(dVar, i, str);
                bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.ad.reward.n.3.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.this.pv = 2;
                    }
                });
                com.kwad.components.ad.reward.check.a.a(j.this.mAdTemplate, 2, System.currentTimeMillis() - dVar.PH, i, str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.core.network.p, com.kwad.sdk.core.network.h
            /* renamed from: a */
            public void onSuccess(com.kwad.components.core.request.d dVar, final RewardCallBackRespInfo rewardCallBackRespInfo) {
                bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.ad.reward.n.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        j jVar2;
                        int i = 1;
                        if (rewardCallBackRespInfo.result == 1) {
                            jVar2 = j.this;
                        } else {
                            jVar2 = j.this;
                            i = 2;
                        }
                        jVar2.pv = i;
                        j.this.mAdOpenInteractionListener.onRewardVerify();
                    }
                });
                com.kwad.components.ad.reward.check.a.a(j.this.mAdTemplate, 2, System.currentTimeMillis() - dVar.PH, rewardCallBackRespInfo.result, rewardCallBackRespInfo.errorMsg);
            }
        };
    }

    private static boolean p(j jVar) {
        return !jVar.pw && com.kwad.sdk.core.response.b.a.cJ(com.kwad.sdk.core.response.b.d.ck(jVar.mAdTemplate));
    }
}

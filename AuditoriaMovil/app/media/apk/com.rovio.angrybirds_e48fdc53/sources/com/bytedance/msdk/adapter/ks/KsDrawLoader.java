package com.bytedance.msdk.adapter.ks;

import android.content.Context;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bytedance.msdk.api.AdError;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
import com.kwad.sdk.api.KsAdSDK;
import com.kwad.sdk.api.KsDrawAd;
import com.kwad.sdk.api.KsLoadManager;
import com.kwad.sdk.api.KsScene;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class KsDrawLoader extends KsBaseLoader {

    /* loaded from: classes.dex */
    private static class KsDrawAdLoaderManager {
        private KsLoadManager.DrawAdListener a;
        private KsDrawLoader b;

        public KsDrawAdLoaderManager(final Context context, KsDrawLoader ksDrawLoader, final MediationAdSlotValueSet mediationAdSlotValueSet) {
            this.b = ksDrawLoader;
            this.a = new KsLoadManager.DrawAdListener() { // from class: com.bytedance.msdk.adapter.ks.KsDrawLoader.KsDrawAdLoaderManager.1
                @Override // com.kwad.sdk.api.KsLoadManager.DrawAdListener
                public void onDrawAdLoad(List<KsDrawAd> list) {
                    if (list != null && list.size() != 0) {
                        ArrayList arrayList = new ArrayList();
                        for (KsDrawAd ksDrawAd : list) {
                            if (ksDrawAd != null) {
                                Bridge gMBridge = KsDrawAdLoaderManager.this.b.getGMBridge();
                                new KsDrawExpressAd(context, KsDrawAdLoaderManager.this.b, gMBridge, ksDrawAd, mediationAdSlotValueSet);
                                arrayList.add(gMBridge);
                            }
                        }
                        if (arrayList.size() > 0) {
                            KsDrawAdLoaderManager.this.b.notifyAdSuccess(arrayList);
                            return;
                        }
                    } else if (KsDrawAdLoaderManager.this.b == null) {
                        return;
                    }
                    KsDrawAdLoaderManager.this.b.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, AdError.ERROR_MEDIA_REQUEST_SUCCESS_NO_ADS_MSG);
                }

                @Override // com.kwad.sdk.api.KsLoadManager.DrawAdListener
                public void onError(int i, String str) {
                    if (KsDrawAdLoaderManager.this.b != null) {
                        KsDrawAdLoaderManager.this.b.notifyAdFailed(i, str);
                    }
                }
            };
        }

        public void loadAd(KsScene ksScene) {
            KsLoadManager loadManager = KsAdSDK.getLoadManager();
            if (loadManager != null) {
                loadManager.loadDrawAd(ksScene, this.a);
                return;
            }
            KsDrawLoader ksDrawLoader = this.b;
            if (ksDrawLoader != null) {
                ksDrawLoader.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "loadManager is null can not load ads");
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl
    public void realLoader(Context context, MediationAdSlotValueSet mediationAdSlotValueSet) {
        try {
            KsScene.Builder builder = new KsScene.Builder(Long.valueOf(mediationAdSlotValueSet.getADNId()).longValue());
            builder.height(mediationAdSlotValueSet.getHeight());
            builder.width(mediationAdSlotValueSet.getWidth());
            builder.adNum(mediationAdSlotValueSet.getAdCount());
            new KsDrawAdLoaderManager(context, this, mediationAdSlotValueSet).loadAd(builder.build());
        } catch (Exception e) {
            notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, AdError.ERROR_MEDIA_REQUEST_ID_MSG);
        }
    }
}

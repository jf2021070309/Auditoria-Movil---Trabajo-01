package com.bytedance.msdk.adapter.ks;

import android.content.Context;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
import com.kwad.sdk.api.KsAdSDK;
import com.kwad.sdk.api.KsFeedAd;
import com.kwad.sdk.api.KsLoadManager;
import com.kwad.sdk.api.KsNativeAd;
import com.kwad.sdk.api.KsScene;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class KsNativeLoader extends KsBaseLoader {
    private void a(final Context context, KsScene ksScene, final MediationAdSlotValueSet mediationAdSlotValueSet, KsNativeLoader ksNativeLoader) {
        KsLoadManager loadManager = KsAdSDK.getLoadManager();
        if (loadManager != null) {
            loadManager.loadConfigFeedAd(ksScene, new KsLoadManager.FeedAdListener() { // from class: com.bytedance.msdk.adapter.ks.KsNativeLoader.1
                @Override // com.kwad.sdk.api.KsLoadManager.FeedAdListener
                public void onError(int i, String str) {
                    KsNativeLoader.this.notifyAdFailed(i, str);
                }

                @Override // com.kwad.sdk.api.KsLoadManager.FeedAdListener
                public void onFeedAdLoad(List<KsFeedAd> list) {
                    if (list == null || list.isEmpty()) {
                        KsNativeLoader.this.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "返回广告位列表空");
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (KsFeedAd ksFeedAd : list) {
                        if (ksFeedAd != null) {
                            Bridge gMBridge = KsNativeLoader.this.getGMBridge();
                            new KsNativeExpressAd(context, ksFeedAd, mediationAdSlotValueSet, gMBridge, KsNativeLoader.this);
                            arrayList.add(gMBridge);
                        }
                    }
                    KsNativeLoader.this.notifyAdSuccess(arrayList);
                }
            });
        }
    }

    private void b(final Context context, KsScene ksScene, final MediationAdSlotValueSet mediationAdSlotValueSet, final KsNativeLoader ksNativeLoader) {
        KsLoadManager loadManager = KsAdSDK.getLoadManager();
        if (loadManager != null) {
            loadManager.loadNativeAd(ksScene, new KsLoadManager.NativeAdListener() { // from class: com.bytedance.msdk.adapter.ks.KsNativeLoader.2
                @Override // com.kwad.sdk.api.KsLoadManager.NativeAdListener
                public void onError(int i, String str) {
                    KsNativeLoader.this.notifyAdFailed(i, str);
                }

                @Override // com.kwad.sdk.api.KsLoadManager.NativeAdListener
                public void onNativeAdLoad(List<KsNativeAd> list) {
                    if (list == null || list.isEmpty()) {
                        KsNativeLoader.this.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "返回广告位列表空");
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (KsNativeAd ksNativeAd : list) {
                        Bridge gMBridge = KsNativeLoader.this.getGMBridge();
                        new KsNative(context, ksNativeAd, mediationAdSlotValueSet, gMBridge, ksNativeLoader);
                        arrayList.add(gMBridge);
                    }
                    KsNativeLoader.this.notifyAdSuccess(arrayList);
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl
    public void realLoader(Context context, MediationAdSlotValueSet mediationAdSlotValueSet) {
        try {
            long longValue = Long.valueOf(mediationAdSlotValueSet.getADNId()).longValue();
            KsScene build = new KsScene.Builder(longValue).adNum(mediationAdSlotValueSet.getAdCount()).build();
            if (context != null) {
                int screenWidthInPx = Utils.getScreenWidthInPx(context);
                if (mediationAdSlotValueSet.getWidth() != 0) {
                    screenWidthInPx = mediationAdSlotValueSet.getWidth();
                } else if (mediationAdSlotValueSet.getExpressWidth() != 0.0f) {
                    screenWidthInPx = (int) Utils.dip2Px(context, mediationAdSlotValueSet.getExpressWidth());
                }
                build = new KsScene.Builder(longValue).width(screenWidthInPx).adNum(mediationAdSlotValueSet.getAdCount()).build();
            }
            if (mediationAdSlotValueSet.isExpress()) {
                a(context, build, mediationAdSlotValueSet, this);
            } else {
                b(context, build, mediationAdSlotValueSet, this);
            }
        } catch (Exception e) {
            notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "代码位不合法");
        }
    }
}

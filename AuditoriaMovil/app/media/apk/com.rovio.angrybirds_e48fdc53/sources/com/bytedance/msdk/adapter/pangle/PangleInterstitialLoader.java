package com.bytedance.msdk.adapter.pangle;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.JProtect;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.adapter.util.TTLogUtil;
import com.bytedance.msdk.api.AdError;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class PangleInterstitialLoader extends MediationAdLoaderImpl {
    public static final String TAG = "PangleInterstitialAdapter";
    public static final String VERSION_00 = "0.0";
    public static final String VERSION_4900 = "4.9.0.0";
    private PangleExpressInterstitialAd a;
    private Context b;
    private MediationAdSlotValueSet c;
    private Bridge d;

    /* loaded from: classes.dex */
    class PangleExpressInterstitialAd extends MediationBaseAdBridge {
        private TTNativeExpressAd a;
        private boolean b;
        TTNativeExpressAd.AdInteractionListener c;

        PangleExpressInterstitialAd() {
            super(PangleInterstitialLoader.this.c, PangleInterstitialLoader.this.d);
            this.c = new TTNativeExpressAd.AdInteractionListener() { // from class: com.bytedance.msdk.adapter.pangle.PangleInterstitialLoader.PangleExpressInterstitialAd.2
                @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
                @JProtect
                public void onAdClicked(View view, int i) {
                    Bridge bridge = PangleExpressInterstitialAd.this.mGMAd;
                    if (bridge != null) {
                        bridge.call(1009, null, Void.class);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.AdInteractionListener
                @JProtect
                public void onAdDismiss() {
                    Bridge bridge = PangleExpressInterstitialAd.this.mGMAd;
                    if (bridge != null) {
                        bridge.call(1014, null, Void.class);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
                @JProtect
                public void onAdShow(View view, int i) {
                    Bridge bridge = PangleExpressInterstitialAd.this.mGMAd;
                    if (bridge != null) {
                        bridge.call(1008, null, Void.class);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
                @JProtect
                public void onRenderFail(View view, String str, int i) {
                    char c;
                    Logger.e("TTMediationSDK_interisitial", TTLogUtil.getTagThirdLevelById(PangleInterstitialLoader.this.getRitId(), PangleInterstitialLoader.this.getAdnId()) + "PangleExpressInterstitialAd onRenderFail -> code=" + i + ",msg=" + str);
                    PangleInterstitialLoader.this.notifyAdFailed(i, str);
                    while (true) {
                        while (c != 'P') {
                            c = c != 'Q' ? 'P' : 'R';
                        }
                        return;
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
                @JProtect
                public void onRenderSuccess(View view, float f, float f2) {
                    PangleExpressInterstitialAd.this.b = true;
                    Logger.d("TTMediationSDK_interisitial", TTLogUtil.getTagThirdLevelById(PangleInterstitialLoader.this.getRitId(), PangleInterstitialLoader.this.getAdnId()) + "穿山甲SDK--插屏-onRenderSucces");
                    PangleExpressInterstitialAd pangleExpressInterstitialAd = PangleExpressInterstitialAd.this;
                    PangleInterstitialLoader.this.notifyAdSuccess(pangleExpressInterstitialAd, pangleExpressInterstitialAd.mGMAd);
                }
            };
        }

        @Override // com.bykv.vk.openvk.api.proto.Caller
        public <T> T call(int i, ValueSet valueSet, Class<T> cls) {
            if (i == 8147) {
                Log.i("TMe", "MintegralInterstitialLoader getReqId ");
                return (T) getReqId();
            }
            if (i == 8113) {
                Log.i("TMe", "MintegralInterstitialLoader showAd ");
                Activity activity = (Activity) valueSet.objectValue(20033, Activity.class);
                if (activity != null) {
                    showAd(activity);
                }
            } else if (i == 8109) {
                onDestroy();
            } else if (i == 8120) {
                return (T) Boolean.valueOf(hasDestroyed());
            } else {
                if (i == 8121) {
                    return (T) isReadyStatus();
                }
                if (i == 8239) {
                    return (T) getMediaExtraInfo();
                }
                if (i == 8245) {
                    return (T) Long.valueOf(getCreativeId());
                }
                if (i == 8246) {
                    return (T) Long.valueOf(getAdId());
                }
            }
            return (T) MediationValueUtil.checkClassType(cls);
        }

        public long getAdId() {
            TTNativeExpressAd tTNativeExpressAd = this.a;
            if (tTNativeExpressAd != null) {
                return PangleAdapterUtils.getAdId(tTNativeExpressAd.getMediaExtraInfo());
            }
            return 0L;
        }

        public long getCreativeId() {
            TTNativeExpressAd tTNativeExpressAd = this.a;
            if (tTNativeExpressAd != null) {
                return PangleAdapterUtils.getCreativeId(tTNativeExpressAd.getMediaExtraInfo());
            }
            return 0L;
        }

        public Map<String, Object> getMediaExtraInfo() {
            Map<String, Object> mediaExtraInfo;
            TTNativeExpressAd tTNativeExpressAd = this.a;
            if (tTNativeExpressAd == null || (mediaExtraInfo = tTNativeExpressAd.getMediaExtraInfo()) == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(PangleAdapterUtils.MEDIA_EXTRA_COUPON, mediaExtraInfo.get(PangleAdapterUtils.MEDIA_EXTRA_COUPON));
            hashMap.put(PangleAdapterUtils.MEDIA_EXTRA_LIVE_ROOM, mediaExtraInfo.get(PangleAdapterUtils.MEDIA_EXTRA_LIVE_ROOM));
            hashMap.put(PangleAdapterUtils.MEDIA_EXTRA_PRODUCT, mediaExtraInfo.get(PangleAdapterUtils.MEDIA_EXTRA_PRODUCT));
            return hashMap;
        }

        public String getReqId() {
            TTNativeExpressAd tTNativeExpressAd = this.a;
            if (tTNativeExpressAd != null) {
                return PangleAdapterUtils.getReqId(tTNativeExpressAd.getMediaExtraInfo());
            }
            return null;
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public boolean hasDestroyed() {
            return this.a == null;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @JProtect
        public void loadAd() {
            TTAdNative createAdNative = TTAdSdk.getAdManager().createAdNative(PangleInterstitialLoader.this.b);
            AdSlot.Builder buildPangleAdSlot = PangleAdapterUtils.buildPangleAdSlot(PangleInterstitialLoader.this.c, PangleInterstitialLoader.this.getRitId(), PangleInterstitialLoader.this.getAdm(), false);
            buildPangleAdSlot.setExpressViewAcceptedSize(PangleInterstitialLoader.this.c.getWidth(), PangleInterstitialLoader.this.c.getHeight());
            createAdNative.loadInteractionExpressAd(buildPangleAdSlot.build(), new TTAdNative.NativeExpressAdListener() { // from class: com.bytedance.msdk.adapter.pangle.PangleInterstitialLoader.PangleExpressInterstitialAd.1
                @Override // com.bytedance.sdk.openadsdk.TTAdNative.NativeExpressAdListener, com.bytedance.sdk.openadsdk.common.CommonListener
                public void onError(int i, String str) {
                    PangleInterstitialLoader.this.notifyAdFailed(i, str);
                }

                @Override // com.bytedance.sdk.openadsdk.TTAdNative.NativeExpressAdListener
                public void onNativeExpressAdLoad(List<TTNativeExpressAd> list) {
                    Map<String, Object> mediaExtraInfo;
                    if (list == null || list.size() == 0) {
                        PangleInterstitialLoader.this.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "load成功但返回广告是空");
                        return;
                    }
                    Logger.d("TTMediationSDK_interisitial", TTLogUtil.getTagThirdLevelById(PangleInterstitialLoader.this.getRitId(), PangleInterstitialLoader.this.getAdnId()) + "穿山甲SDK--插屏-onNativeExpressAdLoad");
                    PangleExpressInterstitialAd.this.a = list.get(0);
                    MediationValueSetBuilder create = MediationValueSetBuilder.create();
                    create.add(8033, true);
                    create.add(8059, PangleExpressInterstitialAd.this.a.getInteractionType());
                    PangleExpressInterstitialAd.this.mGMAd.call(8140, create.build(), Void.class);
                    if (PangleInterstitialLoader.this.isClientBidding() && (mediaExtraInfo = PangleExpressInterstitialAd.this.a.getMediaExtraInfo()) != null) {
                        double value = PangleAdapterUtils.getValue(mediaExtraInfo.get(InAppPurchaseMetaData.KEY_PRICE));
                        Logger.d("TTMediationSDK_ECMP", TTLogUtil.getTagThirdLevelById(PangleInterstitialLoader.this.getRitId(), PangleInterstitialLoader.this.getAdnId()) + "pangle 插屏 返回的 cpm价格：" + value);
                        PangleExpressInterstitialAd pangleExpressInterstitialAd = PangleExpressInterstitialAd.this;
                        if (value <= PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
                            value = 0.0d;
                        }
                        pangleExpressInterstitialAd.setCpm(value);
                    }
                    PangleExpressInterstitialAd.this.a.setExpressInteractionListener(PangleExpressInterstitialAd.this.c);
                    PangleExpressInterstitialAd.this.a.render();
                }
            });
            char c = '\t';
            char c2 = 26;
            while (true) {
                boolean z = true;
                while (true) {
                    if (!z) {
                        if (!z) {
                            break;
                        }
                        if (c2 > 22) {
                            continue;
                        }
                        while (true) {
                            switch (c) {
                                case 30:
                                case 31:
                                    return;
                            }
                        }
                    }
                    c2 = 65492;
                    c = 30;
                    z = true;
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public void onDestroy() {
            TTNativeExpressAd tTNativeExpressAd = this.a;
            if (tTNativeExpressAd != null) {
                tTNativeExpressAd.setExpressInteractionListener((TTNativeExpressAd.AdInteractionListener) null);
                this.a.setDownloadListener(null);
            }
        }

        @JProtect
        public void showAd(Activity activity) {
            TTNativeExpressAd tTNativeExpressAd = this.a;
            if (tTNativeExpressAd != null) {
                tTNativeExpressAd.showInteractionExpressAd(activity);
            }
        }

        @Override // com.bykv.vk.openvk.api.proto.Bridge
        public ValueSet values() {
            return null;
        }
    }

    private String a() {
        try {
            return TTAdSdk.getAdManager().getSDKVersion();
        } catch (Exception e) {
            return "0.0";
        }
    }

    private boolean b() {
        return !"0.0".equals(a()) && VERSION_4900.compareTo(a()) > 0;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl
    @JProtect
    public void realLoader(Context context, MediationAdSlotValueSet mediationAdSlotValueSet) {
        if (context == null || mediationAdSlotValueSet == null) {
            notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "context is null or adSlotValueSet is null");
            return;
        }
        this.b = context;
        this.c = mediationAdSlotValueSet;
        this.d = getGMBridge();
        if (!b()) {
            notifyAdFailed(AdError.ERROR_CODE_CSJ4900_INTERSTITIAL_ERROR, AdError.getMessage(AdError.ERROR_CODE_CSJ4900_INTERSTITIAL_ERROR));
            return;
        }
        PangleExpressInterstitialAd pangleExpressInterstitialAd = new PangleExpressInterstitialAd();
        this.a = pangleExpressInterstitialAd;
        pangleExpressInterstitialAd.loadAd();
    }
}

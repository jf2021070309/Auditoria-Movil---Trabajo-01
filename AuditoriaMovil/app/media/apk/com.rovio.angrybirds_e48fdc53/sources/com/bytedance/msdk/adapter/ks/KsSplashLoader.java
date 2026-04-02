package com.bytedance.msdk.adapter.ks;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.JProtect;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.bytedance.msdk.api.AdError;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;
import com.kwad.sdk.api.KsAdSDK;
import com.kwad.sdk.api.KsLoadManager;
import com.kwad.sdk.api.KsScene;
import com.kwad.sdk.api.KsSplashScreenAd;
/* loaded from: classes.dex */
public class KsSplashLoader extends MediationAdLoaderImpl {
    private Context a;

    /* loaded from: classes.dex */
    class KsSplashAd extends MediationBaseAdBridge {
        private KsSplashScreenAd a;
        KsLoadManager.SplashScreenAdListener b;

        public KsSplashAd(MediationAdSlotValueSet mediationAdSlotValueSet, Bridge bridge) {
            super(mediationAdSlotValueSet, bridge);
            this.b = new KsLoadManager.SplashScreenAdListener() { // from class: com.bytedance.msdk.adapter.ks.KsSplashLoader.KsSplashAd.2
                @Override // com.kwad.sdk.api.KsLoadManager.SplashScreenAdListener
                public void onError(int i, String str) {
                    Log.i("TTMediationSDK", "KsSplashLoader load  onError");
                    KsSplashLoader.this.notifyAdFailed(i, str);
                }

                @Override // com.kwad.sdk.api.KsLoadManager.SplashScreenAdListener
                public void onRequestResult(int i) {
                }

                @Override // com.kwad.sdk.api.KsLoadManager.SplashScreenAdListener
                public void onSplashScreenAdLoad(KsSplashScreenAd ksSplashScreenAd) {
                    Log.i("TTMediationSDK", "KsSplashLoader load  onSplashScreenAdLoad ksSplashScreenAd:" + ksSplashScreenAd);
                    if (ksSplashScreenAd == null) {
                        KsSplashLoader.this.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "ksSplashScreenAd is null");
                        return;
                    }
                    KsSplashAd.this.a = ksSplashScreenAd;
                    if (KsSplashLoader.this.isClientBidding()) {
                        double ecpm = ksSplashScreenAd.getECPM();
                        KsSplashAd ksSplashAd = KsSplashAd.this;
                        if (ecpm <= PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
                            ecpm = 0.0d;
                        }
                        ksSplashAd.setCpm(ecpm);
                    }
                    KsSplashAd.this.setExpress();
                    Log.i("KsRewardLoader", AdError.AD_LOAD_SUCCESS_MSG);
                    KsSplashAd ksSplashAd2 = KsSplashAd.this;
                    KsSplashLoader.this.notifyAdSuccess(ksSplashAd2, ksSplashAd2.mGMAd);
                }
            };
        }

        @JProtect
        void a(KsScene ksScene) {
            Log.i("TTMediationSDK", "KsSplashLoader loadAd");
            KsAdSDK.getLoadManager().loadSplashScreenAd(ksScene, this.b);
        }

        @Override // com.bykv.vk.openvk.api.proto.Caller
        public <T> T call(int i, ValueSet valueSet, Class<T> cls) {
            if (i == 6152) {
                Log.i("TTMediationSDK", "KsSplashLoader showSplashAd");
                ViewGroup viewGroup = (ViewGroup) valueSet.objectValue(20060, ViewGroup.class);
                if (viewGroup != null) {
                    showSplashAd(viewGroup);
                }
            } else if (i != 6154 && i != 6153) {
                if (i == 6161) {
                    Log.i("TTMediationSDK", "KsSplashLoader showMinWindow");
                    Rect rect = (Rect) valueSet.objectValue(20067, Rect.class);
                    if (rect != null) {
                        showMinWindow(rect);
                    }
                } else if (i == 8109) {
                    onDestroy();
                } else if (i == 8120) {
                    return (T) Boolean.valueOf(hasDestroyed());
                } else {
                    if (i == 8121) {
                        return (T) isReadyStatus();
                    }
                }
            }
            return (T) MediationValueUtil.checkClassType(cls);
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public boolean hasDestroyed() {
            return this.a == null;
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public MediationConstant.AdIsReadyStatus isReadyStatus() {
            KsSplashScreenAd ksSplashScreenAd = this.a;
            return (ksSplashScreenAd == null || !ksSplashScreenAd.isAdEnable()) ? MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY : MediationConstant.AdIsReadyStatus.AD_IS_READY;
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public void onDestroy() {
            if (this.a != null) {
                this.a = null;
            }
        }

        public void showMinWindow(Rect rect) {
            if (this.a == null || KsSplashLoader.this.a == null || rect == null) {
            }
        }

        public void showSplashAd(ViewGroup viewGroup) {
            if (this.a == null || viewGroup == null) {
                return;
            }
            View view = this.a.getView(KsSplashLoader.this.a == null ? KsSplashLoader.this.a : KsSplashLoader.this.a.getApplicationContext(), new KsSplashScreenAd.SplashScreenAdInteractionListener() { // from class: com.bytedance.msdk.adapter.ks.KsSplashLoader.KsSplashAd.1
                @Override // com.kwad.sdk.api.KsSplashScreenAd.SplashScreenAdInteractionListener
                public void onAdClicked() {
                    Log.i("TTMediationSDK", "KsSplashLoader onAdClicked");
                    Bridge bridge = KsSplashAd.this.mGMAd;
                    if (bridge != null) {
                        bridge.call(1009, null, Void.class);
                    }
                }

                @Override // com.kwad.sdk.api.KsSplashScreenAd.SplashScreenAdInteractionListener
                public void onAdShowEnd() {
                    Log.i("TTMediationSDK", "KsSplashLoader onAdShowEnd");
                    Bridge bridge = KsSplashAd.this.mGMAd;
                    if (bridge != null) {
                        bridge.call(1011, null, Void.class);
                    }
                }

                @Override // com.kwad.sdk.api.KsSplashScreenAd.SplashScreenAdInteractionListener
                public void onAdShowError(int i, String str) {
                    Log.i("TTMediationSDK", "KsSplashLoader onAdShowError");
                    if (KsSplashAd.this.mGMAd != null) {
                        MediationValueSetBuilder create = MediationValueSetBuilder.create();
                        create.add(8014, i);
                        create.add(8015, str);
                        KsSplashAd.this.mGMAd.call(1017, create.build(), Void.class);
                    }
                }

                @Override // com.kwad.sdk.api.KsSplashScreenAd.SplashScreenAdInteractionListener
                public void onAdShowStart() {
                    Log.i("TTMediationSDK", "KsSplashLoader onAdShowStart");
                    Bridge bridge = KsSplashAd.this.mGMAd;
                    if (bridge != null) {
                        bridge.call(1008, null, Void.class);
                    }
                }

                @Override // com.kwad.sdk.api.KsSplashScreenAd.SplashScreenAdInteractionListener
                public void onDownloadTipsDialogCancel() {
                }

                @Override // com.kwad.sdk.api.KsSplashScreenAd.SplashScreenAdInteractionListener
                public void onDownloadTipsDialogDismiss() {
                }

                @Override // com.kwad.sdk.api.KsSplashScreenAd.SplashScreenAdInteractionListener
                public void onDownloadTipsDialogShow() {
                }

                @Override // com.kwad.sdk.api.KsSplashScreenAd.SplashScreenAdInteractionListener
                public void onSkippedAd() {
                    Log.i("TTMediationSDK", "KsSplashLoader onSkippedAd");
                    Bridge bridge = KsSplashAd.this.mGMAd;
                    if (bridge != null) {
                        bridge.call(1019, null, Void.class);
                    }
                }
            });
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(view);
                }
                view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            }
        }

        @Override // com.bykv.vk.openvk.api.proto.Bridge
        public ValueSet values() {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl
    public void realLoader(Context context, MediationAdSlotValueSet mediationAdSlotValueSet) {
        Log.i("TTMediationSDK", "KsSplashLoader realLoader adnId:" + getAdnId());
        this.a = context;
        try {
            new KsSplashAd(mediationAdSlotValueSet, getGMBridge()).a(new KsScene.Builder(Long.valueOf(getAdnId()).longValue()).build());
        } catch (Exception e) {
            notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "代码位不合法");
        }
    }
}

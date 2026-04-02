package com.bytedance.msdk.adapter.ks;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.JProtect;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;
import com.kwad.sdk.api.KsAdSDK;
import com.kwad.sdk.api.KsFullScreenVideoAd;
import com.kwad.sdk.api.KsLoadManager;
import com.kwad.sdk.api.KsScene;
import com.kwad.sdk.api.KsVideoPlayConfig;
import java.util.List;
/* loaded from: classes.dex */
public class KsFullVideoLoader extends MediationAdLoaderImpl {

    /* loaded from: classes.dex */
    class KsFullVideoAd extends MediationBaseAdBridge {
        private KsFullScreenVideoAd a;
        KsLoadManager.FullScreenVideoAdListener b;

        public KsFullVideoAd(MediationAdSlotValueSet mediationAdSlotValueSet, Bridge bridge) {
            super(mediationAdSlotValueSet, bridge);
            this.b = new KsLoadManager.FullScreenVideoAdListener() { // from class: com.bytedance.msdk.adapter.ks.KsFullVideoLoader.KsFullVideoAd.1
                @Override // com.kwad.sdk.api.KsLoadManager.FullScreenVideoAdListener
                @JProtect
                public void onError(int i, String str) {
                    Log.i("TTMediationSDK", "ks_KsFullVideoLoader onError");
                    KsFullVideoLoader.this.notifyAdFailed(i, str);
                }

                /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
                    continue;
                 */
                @Override // com.kwad.sdk.api.KsLoadManager.FullScreenVideoAdListener
                @com.bytedance.JProtect
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void onFullScreenVideoAdLoad(java.util.List<com.kwad.sdk.api.KsFullScreenVideoAd> r6) {
                    /*
                        r5 = this;
                        java.lang.String r0 = "TTMediationSDK"
                        java.lang.String r1 = "ks_KsFullVideoLoader onFullScreenVideoAdLoad"
                        android.util.Log.i(r0, r1)
                        if (r6 == 0) goto L6f
                        int r0 = r6.size()
                        if (r0 == 0) goto L6f
                        r0 = 0
                        java.lang.Object r1 = r6.get(r0)
                        if (r1 != 0) goto L17
                        goto L6f
                    L17:
                        com.bytedance.msdk.adapter.ks.KsFullVideoLoader$KsFullVideoAd r1 = com.bytedance.msdk.adapter.ks.KsFullVideoLoader.KsFullVideoAd.this
                        java.lang.Object r6 = r6.get(r0)
                        com.kwad.sdk.api.KsFullScreenVideoAd r6 = (com.kwad.sdk.api.KsFullScreenVideoAd) r6
                        com.bytedance.msdk.adapter.ks.KsFullVideoLoader.KsFullVideoAd.a(r1, r6)
                        com.bytedance.msdk.adapter.ks.KsFullVideoLoader$KsFullVideoAd r6 = com.bytedance.msdk.adapter.ks.KsFullVideoLoader.KsFullVideoAd.this
                        com.bytedance.msdk.adapter.ks.KsFullVideoLoader r6 = com.bytedance.msdk.adapter.ks.KsFullVideoLoader.this
                        boolean r6 = r6.isClientBidding()
                        if (r6 == 0) goto L44
                        com.bytedance.msdk.adapter.ks.KsFullVideoLoader$KsFullVideoAd r6 = com.bytedance.msdk.adapter.ks.KsFullVideoLoader.KsFullVideoAd.this
                        com.kwad.sdk.api.KsFullScreenVideoAd r6 = com.bytedance.msdk.adapter.ks.KsFullVideoLoader.KsFullVideoAd.a(r6)
                        int r6 = r6.getECPM()
                        double r0 = (double) r6
                        com.bytedance.msdk.adapter.ks.KsFullVideoLoader$KsFullVideoAd r6 = com.bytedance.msdk.adapter.ks.KsFullVideoLoader.KsFullVideoAd.this
                        r2 = 0
                        int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                        if (r4 <= 0) goto L40
                        goto L41
                    L40:
                        r0 = r2
                    L41:
                        r6.setCpm(r0)
                    L44:
                        com.bytedance.msdk.adapter.ks.KsFullVideoLoader$KsFullVideoAd r6 = com.bytedance.msdk.adapter.ks.KsFullVideoLoader.KsFullVideoAd.this
                        r6.setExpress()
                        com.bytedance.msdk.adapter.ks.KsFullVideoLoader$KsFullVideoAd r6 = com.bytedance.msdk.adapter.ks.KsFullVideoLoader.KsFullVideoAd.this
                        com.kwad.sdk.api.KsFullScreenVideoAd r6 = com.bytedance.msdk.adapter.ks.KsFullVideoLoader.KsFullVideoAd.a(r6)
                        com.bytedance.msdk.adapter.ks.KsFullVideoLoader$KsFullVideoAd$1$1 r0 = new com.bytedance.msdk.adapter.ks.KsFullVideoLoader$KsFullVideoAd$1$1
                        r0.<init>()
                        r6.setFullScreenVideoAdInteractionListener(r0)
                        com.bytedance.msdk.adapter.ks.KsFullVideoLoader$KsFullVideoAd r6 = com.bytedance.msdk.adapter.ks.KsFullVideoLoader.KsFullVideoAd.this
                        com.bytedance.msdk.adapter.ks.KsFullVideoLoader r0 = com.bytedance.msdk.adapter.ks.KsFullVideoLoader.this
                        com.bykv.vk.openvk.api.proto.Bridge r1 = r6.mGMAd
                        r0.notifyAdSuccess(r6, r1)
                        com.bytedance.msdk.adapter.ks.KsFullVideoLoader$KsFullVideoAd r6 = com.bytedance.msdk.adapter.ks.KsFullVideoLoader.KsFullVideoAd.this
                        com.bytedance.msdk.adapter.ks.KsFullVideoLoader r0 = com.bytedance.msdk.adapter.ks.KsFullVideoLoader.this
                        com.bykv.vk.openvk.api.proto.Bridge r6 = r6.mGMAd
                        r1 = 80002(0x13882, float:1.12107E-40)
                        java.lang.String r2 = "没有cache回调"
                        r0.notifyAdCache(r6, r1, r2)
                        return
                    L6f:
                        com.bytedance.msdk.adapter.ks.KsFullVideoLoader$KsFullVideoAd r6 = com.bytedance.msdk.adapter.ks.KsFullVideoLoader.KsFullVideoAd.this
                        com.bytedance.msdk.adapter.ks.KsFullVideoLoader r6 = com.bytedance.msdk.adapter.ks.KsFullVideoLoader.this
                        r0 = 80001(0x13881, float:1.12105E-40)
                        java.lang.String r1 = "暂无广告"
                        r6.notifyAdFailed(r0, r1)
                    L7b:
                        r6 = 8
                        r0 = 45
                        r1 = 19
                        r2 = 18
                        r3 = r2
                    L84:
                        if (r3 == r2) goto L89
                        if (r3 == r1) goto L8c
                        goto L7b
                    L89:
                        switch(r6) {
                            case 8: goto L93;
                            case 9: goto L96;
                            case 10: goto L96;
                            default: goto L8c;
                        }
                    L8c:
                        if (r6 == r0) goto L96
                        r3 = 47
                        if (r6 == r3) goto L93
                        goto L7b
                    L93:
                        r6 = r0
                        r3 = r1
                        goto L84
                    L96:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.msdk.adapter.ks.KsFullVideoLoader.KsFullVideoAd.AnonymousClass1.onFullScreenVideoAdLoad(java.util.List):void");
                }

                @Override // com.kwad.sdk.api.KsLoadManager.FullScreenVideoAdListener
                public void onFullScreenVideoResult(List<KsFullScreenVideoAd> list) {
                }
            };
        }

        @Override // com.bykv.vk.openvk.api.proto.Caller
        public <T> T call(int i, ValueSet valueSet, Class<T> cls) {
            if (i == 8113) {
                Log.i("TTMediationSDK", "ks_KsFullVideoLoader showAd");
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
            }
            return (T) MediationValueUtil.checkClassType(cls);
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public boolean hasDestroyed() {
            Log.i("TTMediationSDK", "ks_KsFullVideoLoader hasDestroyed");
            return this.a == null;
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public MediationConstant.AdIsReadyStatus isReadyStatus() {
            Log.i("TTMediationSDK", "ks_KsFullVideoLoader isReadyStatus");
            KsFullScreenVideoAd ksFullScreenVideoAd = this.a;
            return (ksFullScreenVideoAd == null || !ksFullScreenVideoAd.isAdEnable()) ? MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY : MediationConstant.AdIsReadyStatus.AD_IS_READY;
        }

        @JProtect
        public void loadAd(KsScene ksScene) {
            Log.i("TTMediationSDK", "ks_KsFullVideoLoader loadAd");
            KsAdSDK.getLoadManager().loadFullScreenVideoAd(ksScene, this.b);
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public void onDestroy() {
            Log.i("TTMediationSDK", "ks_KsFullVideoLoader onDestroy");
            KsFullScreenVideoAd ksFullScreenVideoAd = this.a;
            if (ksFullScreenVideoAd != null) {
                ksFullScreenVideoAd.setFullScreenVideoAdInteractionListener(null);
                this.a = null;
            }
        }

        @JProtect
        public void showAd(Activity activity) {
            Log.i("TTMediationSDK", "ks_KsFullVideoLoader showAd");
            if (activity == null || this.a == null) {
                return;
            }
            KsVideoPlayConfig.Builder builder = new KsVideoPlayConfig.Builder();
            boolean isMuted = isMuted();
            if (getOrientation() == 2) {
                builder.showLandscape(true);
            }
            builder.videoSoundEnable(!isMuted);
            this.a.showFullScreenVideoAd(activity, builder.build());
        }

        @Override // com.bykv.vk.openvk.api.proto.Bridge
        public ValueSet values() {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl
    public void realLoader(Context context, MediationAdSlotValueSet mediationAdSlotValueSet) {
        try {
            new KsFullVideoAd(mediationAdSlotValueSet, getGMBridge()).loadAd(new KsScene.Builder(Long.valueOf(getAdnId()).longValue()).build());
        } catch (Exception e) {
            notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "代码位不合法");
        }
    }
}

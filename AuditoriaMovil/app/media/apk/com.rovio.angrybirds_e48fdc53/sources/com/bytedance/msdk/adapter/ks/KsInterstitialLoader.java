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
import com.kwad.sdk.api.KsInterstitialAd;
import com.kwad.sdk.api.KsLoadManager;
import com.kwad.sdk.api.KsScene;
import com.kwad.sdk.api.KsVideoPlayConfig;
/* loaded from: classes.dex */
public class KsInterstitialLoader extends MediationAdLoaderImpl {

    /* loaded from: classes.dex */
    class KsInterstitialVideoAd extends MediationBaseAdBridge {
        private KsInterstitialAd a;
        private boolean b;
        KsLoadManager.InterstitialAdListener c;

        public KsInterstitialVideoAd(MediationAdSlotValueSet mediationAdSlotValueSet, Bridge bridge) {
            super(mediationAdSlotValueSet, bridge);
            this.c = new KsLoadManager.InterstitialAdListener() { // from class: com.bytedance.msdk.adapter.ks.KsInterstitialLoader.KsInterstitialVideoAd.1
                @Override // com.kwad.sdk.api.KsLoadManager.InterstitialAdListener
                @JProtect
                public void onError(int i, String str) {
                    Log.e("TTMediationSDK", "ks_KsInterstitialLoader onError");
                    KsInterstitialLoader.this.notifyAdFailed(i, str);
                }

                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
                    */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
                /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x0078 A[ORIG_RETURN, RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0067 -> B:16:0x006b). Please submit an issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0076 -> B:24:0x0079). Please submit an issue!!! */
                @Override // com.kwad.sdk.api.KsLoadManager.InterstitialAdListener
                @com.bytedance.JProtect
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void onInterstitialAdLoad(java.util.List<com.kwad.sdk.api.KsInterstitialAd> r6) {
                    /*
                        r5 = this;
                        if (r6 == 0) goto L5b
                        int r0 = r6.size()
                        if (r0 != 0) goto L9
                        goto L5b
                    L9:
                        java.lang.String r0 = "TTMediationSDK"
                        java.lang.String r1 = "ks_KsInterstitialLoader onInterstitialAdLoad"
                        android.util.Log.e(r0, r1)
                        com.bytedance.msdk.adapter.ks.KsInterstitialLoader$KsInterstitialVideoAd r0 = com.bytedance.msdk.adapter.ks.KsInterstitialLoader.KsInterstitialVideoAd.this
                        r1 = 0
                        java.lang.Object r6 = r6.get(r1)
                        com.kwad.sdk.api.KsInterstitialAd r6 = (com.kwad.sdk.api.KsInterstitialAd) r6
                        com.bytedance.msdk.adapter.ks.KsInterstitialLoader.KsInterstitialVideoAd.a(r0, r6)
                        com.bytedance.msdk.adapter.ks.KsInterstitialLoader$KsInterstitialVideoAd r6 = com.bytedance.msdk.adapter.ks.KsInterstitialLoader.KsInterstitialVideoAd.this
                        r6.setExpress()
                        com.bytedance.msdk.adapter.ks.KsInterstitialLoader$KsInterstitialVideoAd r6 = com.bytedance.msdk.adapter.ks.KsInterstitialLoader.KsInterstitialVideoAd.this
                        com.bytedance.msdk.adapter.ks.KsInterstitialLoader r6 = com.bytedance.msdk.adapter.ks.KsInterstitialLoader.this
                        boolean r6 = r6.isClientBidding()
                        if (r6 == 0) goto L43
                        com.bytedance.msdk.adapter.ks.KsInterstitialLoader$KsInterstitialVideoAd r6 = com.bytedance.msdk.adapter.ks.KsInterstitialLoader.KsInterstitialVideoAd.this
                        com.kwad.sdk.api.KsInterstitialAd r6 = com.bytedance.msdk.adapter.ks.KsInterstitialLoader.KsInterstitialVideoAd.a(r6)
                        int r6 = r6.getECPM()
                        double r0 = (double) r6
                        com.bytedance.msdk.adapter.ks.KsInterstitialLoader$KsInterstitialVideoAd r6 = com.bytedance.msdk.adapter.ks.KsInterstitialLoader.KsInterstitialVideoAd.this
                        r2 = 0
                        int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                        if (r4 <= 0) goto L3f
                        goto L40
                    L3f:
                        r0 = r2
                    L40:
                        r6.setCpm(r0)
                    L43:
                        com.bytedance.msdk.adapter.ks.KsInterstitialLoader$KsInterstitialVideoAd r6 = com.bytedance.msdk.adapter.ks.KsInterstitialLoader.KsInterstitialVideoAd.this
                        com.bytedance.msdk.adapter.ks.KsInterstitialLoader r0 = com.bytedance.msdk.adapter.ks.KsInterstitialLoader.this
                        com.bykv.vk.openvk.api.proto.Bridge r1 = r6.mGMAd
                        r0.notifyAdSuccess(r6, r1)
                        com.bytedance.msdk.adapter.ks.KsInterstitialLoader$KsInterstitialVideoAd r6 = com.bytedance.msdk.adapter.ks.KsInterstitialLoader.KsInterstitialVideoAd.this
                        com.kwad.sdk.api.KsInterstitialAd r6 = com.bytedance.msdk.adapter.ks.KsInterstitialLoader.KsInterstitialVideoAd.a(r6)
                        com.bytedance.msdk.adapter.ks.KsInterstitialLoader$KsInterstitialVideoAd$1$1 r0 = new com.bytedance.msdk.adapter.ks.KsInterstitialLoader$KsInterstitialVideoAd$1$1
                        r0.<init>()
                        r6.setAdInteractionListener(r0)
                        goto L79
                    L5b:
                        com.bytedance.msdk.adapter.ks.KsInterstitialLoader$KsInterstitialVideoAd r6 = com.bytedance.msdk.adapter.ks.KsInterstitialLoader.KsInterstitialVideoAd.this
                        com.bytedance.msdk.adapter.ks.KsInterstitialLoader r6 = com.bytedance.msdk.adapter.ks.KsInterstitialLoader.this
                        r0 = 80001(0x13881, float:1.12105E-40)
                        java.lang.String r1 = "暂无广告"
                        r6.notifyAdFailed(r0, r1)
                    L67:
                        r6 = 18
                        r0 = 8
                    L6b:
                        switch(r6) {
                            case 18: goto L6f;
                            case 19: goto L74;
                            case 20: goto L78;
                            default: goto L6e;
                        }
                    L6e:
                        goto L67
                    L6f:
                        switch(r0) {
                            case 8: goto L78;
                            case 9: goto L73;
                            case 10: goto L73;
                            default: goto L72;
                        }
                    L72:
                        goto L74
                    L73:
                        return
                    L74:
                        r6 = 47
                        if (r0 == r6) goto L79
                    L78:
                        return
                    L79:
                        r6 = 19
                        r0 = 45
                        goto L6b
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.msdk.adapter.ks.KsInterstitialLoader.KsInterstitialVideoAd.AnonymousClass1.onInterstitialAdLoad(java.util.List):void");
                }

                @Override // com.kwad.sdk.api.KsLoadManager.InterstitialAdListener
                public void onRequestResult(int i) {
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            if (this.b) {
                return;
            }
            this.b = true;
            Bridge bridge = this.mGMAd;
            if (bridge != null) {
                bridge.call(1014, null, Void.class);
            }
        }

        @Override // com.bykv.vk.openvk.api.proto.Caller
        public <T> T call(int i, ValueSet valueSet, Class<T> cls) {
            if (i == 8113) {
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
            return this.a == null;
        }

        @JProtect
        public void loadAd(KsScene ksScene) {
            Log.e("TTMediationSDK", "ks_KsInterstitialLoader loadAd");
            KsAdSDK.getLoadManager().loadInterstitialAd(ksScene, this.c);
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public void onDestroy() {
            KsInterstitialAd ksInterstitialAd = this.a;
            if (ksInterstitialAd != null) {
                ksInterstitialAd.setAdInteractionListener(null);
                this.a = null;
            }
        }

        @JProtect
        public void showAd(Activity activity) {
            if (this.a != null) {
                this.a.showInterstitialAd(activity, new KsVideoPlayConfig.Builder().videoSoundEnable(!isMuted()).build());
            }
        }

        @Override // com.bykv.vk.openvk.api.proto.Bridge
        public ValueSet values() {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl
    public void realLoader(Context context, MediationAdSlotValueSet mediationAdSlotValueSet) {
        try {
            new KsInterstitialVideoAd(mediationAdSlotValueSet, getGMBridge()).loadAd(new KsScene.Builder(Long.valueOf(getAdnId()).longValue()).build());
        } catch (Exception e) {
            notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "代码位不合法");
        }
    }
}

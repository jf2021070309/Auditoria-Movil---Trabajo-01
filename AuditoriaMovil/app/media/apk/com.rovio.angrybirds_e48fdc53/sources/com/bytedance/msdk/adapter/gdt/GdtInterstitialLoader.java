package com.bytedance.msdk.adapter.gdt;

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
import com.qq.e.ads.cfg.VideoOption;
import com.qq.e.ads.interstitial2.UnifiedInterstitialAD;
import com.qq.e.ads.interstitial2.UnifiedInterstitialADListener;
import com.qq.e.comm.util.AdError;
import java.util.Map;
/* loaded from: classes.dex */
public class GdtInterstitialLoader extends MediationAdLoaderImpl {
    private Context a;
    private int b;
    private int c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class GdtIntersitialAd extends MediationBaseAdBridge {
        private UnifiedInterstitialAD a;
        private boolean b;
        UnifiedInterstitialADListener c;

        public GdtIntersitialAd(MediationAdSlotValueSet mediationAdSlotValueSet, Bridge bridge) {
            super(mediationAdSlotValueSet, bridge);
            this.c = new UnifiedInterstitialADListener() { // from class: com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader.GdtIntersitialAd.1
                @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
                @JProtect
                public void onADClicked() {
                    Log.i("TTMediationSDK", "GdtInterstitialLoader onADClicked");
                    Bridge bridge2 = GdtIntersitialAd.this.mGMAd;
                    if (bridge2 != null) {
                        bridge2.call(1009, null, Void.class);
                    }
                }

                @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
                @JProtect
                public void onADClosed() {
                    Log.i("TTMediationSDK", "GdtInterstitialLoader onADClosed");
                    Bridge bridge2 = GdtIntersitialAd.this.mGMAd;
                    if (bridge2 != null) {
                        bridge2.call(1014, null, Void.class);
                    }
                }

                @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
                @JProtect
                public void onADExposure() {
                    Log.i("TTMediationSDK", "GdtInterstitialLoader onADExposure");
                    Bridge bridge2 = GdtIntersitialAd.this.mGMAd;
                    if (bridge2 != null) {
                        bridge2.call(1008, null, Void.class);
                    }
                }

                @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
                @JProtect
                public void onADLeftApplication() {
                    Log.i("TTMediationSDK", "GdtInterstitialLoader onADLeftApplication");
                    Bridge bridge2 = GdtIntersitialAd.this.mGMAd;
                    if (bridge2 != null) {
                        bridge2.call(1016, null, Void.class);
                    }
                }

                @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
                @JProtect
                public void onADOpened() {
                    Log.i("TTMediationSDK", "GdtInterstitialLoader onADOpened");
                    Bridge bridge2 = GdtIntersitialAd.this.mGMAd;
                    if (bridge2 != null) {
                        bridge2.call(1015, null, Void.class);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x008f  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0093  */
                @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
                @com.bytedance.JProtect
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void onADReceive() {
                    /*
                        r4 = this;
                        java.lang.String r0 = "TTMediationSDK"
                        java.lang.String r1 = "GdtInterstitialLoader onADReceive"
                        android.util.Log.i(r0, r1)
                        com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader$GdtIntersitialAd r1 = com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader.GdtIntersitialAd.this
                        r2 = 1
                        com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader.GdtIntersitialAd.a(r1, r2)
                        com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader$GdtIntersitialAd r1 = com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader.GdtIntersitialAd.this
                        com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader r1 = com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader.this
                        boolean r1 = r1.isClientBidding()
                        if (r1 == 0) goto L4d
                        com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader$GdtIntersitialAd r1 = com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader.GdtIntersitialAd.this
                        com.qq.e.ads.interstitial2.UnifiedInterstitialAD r2 = com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader.GdtIntersitialAd.a(r1)
                        int r2 = r2.getECPM()
                        r3 = -1
                        if (r2 == r3) goto L30
                        com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader$GdtIntersitialAd r2 = com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader.GdtIntersitialAd.this
                        com.qq.e.ads.interstitial2.UnifiedInterstitialAD r2 = com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader.GdtIntersitialAd.a(r2)
                        int r2 = r2.getECPM()
                        double r2 = (double) r2
                        goto L32
                    L30:
                        r2 = 0
                    L32:
                        r1.setCpm(r2)
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "GdtInterstitialLoader GDT_clientBidding 插屏 返回的 cpm价格："
                        r1.append(r2)
                        com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader$GdtIntersitialAd r2 = com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader.GdtIntersitialAd.this
                        com.qq.e.ads.interstitial2.UnifiedInterstitialAD r2 = com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader.GdtIntersitialAd.a(r2)
                        int r2 = r2.getECPM()
                        r1.append(r2)
                        goto L7b
                    L4d:
                        com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader$GdtIntersitialAd r1 = com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader.GdtIntersitialAd.this
                        com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader r1 = com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader.this
                        boolean r1 = r1.isMultiBidding()
                        if (r1 == 0) goto L82
                        com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader$GdtIntersitialAd r1 = com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader.GdtIntersitialAd.this
                        com.qq.e.ads.interstitial2.UnifiedInterstitialAD r2 = com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader.GdtIntersitialAd.a(r1)
                        java.lang.String r2 = r2.getECPMLevel()
                        r1.setLevelTag(r2)
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "GdtInterstitialLoader GDT_多阶底价 插屏 返回的价格标签："
                        r1.append(r2)
                        com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader$GdtIntersitialAd r2 = com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader.GdtIntersitialAd.this
                        com.qq.e.ads.interstitial2.UnifiedInterstitialAD r2 = com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader.GdtIntersitialAd.a(r2)
                        java.lang.String r2 = r2.getECPMLevel()
                        r1.append(r2)
                    L7b:
                        java.lang.String r1 = r1.toString()
                        android.util.Log.d(r0, r1)
                    L82:
                        com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader$GdtIntersitialAd r0 = com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader.GdtIntersitialAd.this
                        com.qq.e.ads.interstitial2.UnifiedInterstitialAD r0 = com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader.GdtIntersitialAd.a(r0)
                        int r0 = r0.getAdPatternType()
                        r1 = 2
                        if (r0 != r1) goto L93
                        com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader$GdtIntersitialAd r0 = com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader.GdtIntersitialAd.this
                        r1 = 5
                        goto L96
                    L93:
                        com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader$GdtIntersitialAd r0 = com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader.GdtIntersitialAd.this
                        r1 = 3
                    L96:
                        r0.setImageMode(r1)
                        com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader$GdtIntersitialAd r0 = com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader.GdtIntersitialAd.this
                        com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader r1 = com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader.this
                        com.bykv.vk.openvk.api.proto.Bridge r2 = r0.mGMAd
                        r1.notifyAdSuccess(r0, r2)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader.GdtIntersitialAd.AnonymousClass1.onADReceive():void");
                }

                @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
                @JProtect
                public void onNoAD(AdError adError) {
                    Log.i("TTMediationSDK", "GdtInterstitialLoader onNoAD");
                    GdtIntersitialAd.this.b = false;
                    if (adError != null) {
                        GdtInterstitialLoader.this.notifyAdFailed(adError.getErrorCode(), adError.getErrorMsg());
                    } else {
                        GdtInterstitialLoader.this.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "暂无广告");
                    }
                }

                @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
                public void onRenderFail() {
                }

                @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
                public void onRenderSuccess() {
                }

                @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
                public void onVideoCached() {
                }
            };
        }

        @JProtect
        void a() {
            UnifiedInterstitialAD unifiedInterstitialAD;
            VideoOption build;
            Log.i("TTMediationSDK", "GdtInterstitialLoader loadAd adnId:" + GdtInterstitialLoader.this.getAdnId());
            if (!(GdtInterstitialLoader.this.a instanceof Activity)) {
                Log.d("TTMediationSDK", "GdtInterstitialLoader 传入mContext 不是 Activity 请求中断");
                return;
            }
            this.a = new UnifiedInterstitialAD((Activity) GdtInterstitialLoader.this.a, GdtInterstitialLoader.this.getAdnId(), this.c);
            if (getGdtVideoOption() instanceof VideoOption) {
                unifiedInterstitialAD = this.a;
                build = (VideoOption) getGdtVideoOption();
            } else {
                unifiedInterstitialAD = this.a;
                build = new VideoOption.Builder().build();
            }
            unifiedInterstitialAD.setVideoOption(build);
            if (GdtInterstitialLoader.this.c > 0) {
                this.a.setMaxVideoDuration(GdtInterstitialLoader.this.c);
            }
            if (GdtInterstitialLoader.this.b > 0) {
                this.a.setMinVideoDuration(GdtInterstitialLoader.this.b);
            }
            this.a.loadAD();
        }

        public void bidLoseNotify(Map<String, Object> map) {
            if (!GdtInterstitialLoader.this.isClientBidding() || this.a == null || map == null) {
                return;
            }
            try {
                Object obj = map.get(MediationConstant.BIDDING_LOSE_REASON);
                if (obj instanceof MediationConstant.BiddingLossReason) {
                    this.a.sendLossNotification(0, GDTAdapterUtils.getBiddingLossReason((MediationConstant.BiddingLossReason) obj), null);
                }
            } catch (Exception e) {
            }
        }

        public void bidWinNotify(Map<String, Object> map) {
            UnifiedInterstitialAD unifiedInterstitialAD;
            if (GdtInterstitialLoader.this.isClientBidding() && (unifiedInterstitialAD = this.a) != null) {
                try {
                    unifiedInterstitialAD.sendWinNotification((int) getCpm());
                } catch (Exception e) {
                }
            }
        }

        @Override // com.bykv.vk.openvk.api.proto.Caller
        public <T> T call(int i, ValueSet valueSet, Class<T> cls) {
            if (i == 8142) {
                Log.i("TTMediationSDK", "GdtInterstitialLoader bidWinNotify");
                Map<String, Object> map = (Map) valueSet.objectValue(8006, Map.class);
                if (map != null) {
                    bidWinNotify(map);
                }
            } else if (i == 8144) {
                Log.i("TTMediationSDK", "GdtInterstitialLoader bidLoseNotify");
                Map<String, Object> map2 = (Map) valueSet.objectValue(8006, Map.class);
                if (map2 != null) {
                    bidLoseNotify(map2);
                }
            } else if (i == 8113) {
                Log.i("TTMediationSDK", "GdtInterstitialLoader showAd");
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

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public MediationConstant.AdIsReadyStatus isReadyStatus() {
            UnifiedInterstitialAD unifiedInterstitialAD = this.a;
            return (unifiedInterstitialAD == null || !unifiedInterstitialAD.isValid()) ? MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY : MediationConstant.AdIsReadyStatus.AD_IS_READY;
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public void onDestroy() {
            UnifiedInterstitialAD unifiedInterstitialAD = this.a;
            if (unifiedInterstitialAD != null) {
                unifiedInterstitialAD.destroy();
                this.a = null;
            }
        }

        @JProtect
        public void showAd(Activity activity) {
            if (this.a == null || activity == null || activity.isFinishing()) {
                return;
            }
            this.a.show(activity);
        }

        @Override // com.bykv.vk.openvk.api.proto.Bridge
        public ValueSet values() {
            return null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:817)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:856)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:406)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:204)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:138)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:406)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:204)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:138)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    @com.bytedance.JProtect
    private void a(com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet r3) {
        /*
            r2 = this;
            com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader$GdtIntersitialAd r0 = new com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader$GdtIntersitialAd
            com.bykv.vk.openvk.api.proto.Bridge r1 = r2.getGMBridge()
            r0.<init>(r3, r1)
            r0.a()
            r3 = 92
        Le:
            r0 = 14
        L10:
            switch(r0) {
                case 13: goto L19;
                case 14: goto L1b;
                case 15: goto L14;
                default: goto L13;
            }
        L13:
            goto Le
        L14:
            switch(r3) {
                case 94: goto L1b;
                case 95: goto L18;
                case 96: goto L1b;
                default: goto L17;
            }
        L17:
            goto L1b
        L18:
            return
        L19:
            r0 = 72
        L1b:
            r0 = 15
            r3 = 95
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader.a(com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet):void");
    }

    public void destroy() {
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl
    public void realLoader(Context context, MediationAdSlotValueSet mediationAdSlotValueSet) {
        Log.i("TTMediationSDK", "GdtInterstitialLoader realLoader adnId:" + getAdnId());
        this.a = context;
        this.b = mediationAdSlotValueSet.getGdtMinVideoDuration();
        this.c = mediationAdSlotValueSet.getGdtMaxVideoDuration();
        a(mediationAdSlotValueSet);
    }
}

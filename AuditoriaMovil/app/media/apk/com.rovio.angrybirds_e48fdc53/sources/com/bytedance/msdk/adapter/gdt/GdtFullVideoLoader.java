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
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;
import com.qq.e.ads.interstitial2.ADRewardListener;
import com.qq.e.ads.interstitial2.UnifiedInterstitialAD;
import com.qq.e.ads.interstitial2.UnifiedInterstitialADListener;
import com.qq.e.ads.interstitial2.UnifiedInterstitialMediaListener;
import com.qq.e.comm.util.AdError;
import com.ss.android.socialbase.downloader.constants.DownloadErrorCode;
import java.util.Map;
/* loaded from: classes.dex */
public class GdtFullVideoLoader extends MediationAdLoaderImpl {
    private Context a;
    private int b;
    private int c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class GdtFullVideoAd extends MediationBaseAdBridge {
        private UnifiedInterstitialAD a;
        private boolean b;
        UnifiedInterstitialADListener c;
        UnifiedInterstitialMediaListener d;
        ADRewardListener e;

        public GdtFullVideoAd(MediationAdSlotValueSet mediationAdSlotValueSet, Bridge bridge) {
            super(mediationAdSlotValueSet, bridge);
            this.c = new UnifiedInterstitialADListener() { // from class: com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader.GdtFullVideoAd.1
                @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
                @JProtect
                public void onADClicked() {
                    Log.i("TTMediationSDK", "GdtFullVideoLoader onADClicked");
                    Bridge bridge2 = GdtFullVideoAd.this.mGMAd;
                    if (bridge2 != null) {
                        bridge2.call(1009, null, Void.class);
                    }
                }

                @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
                @JProtect
                public void onADClosed() {
                    Log.i("TTMediationSDK", "GdtFullVideoLoader onADClosed");
                    Bridge bridge2 = GdtFullVideoAd.this.mGMAd;
                    if (bridge2 != null) {
                        bridge2.call(1014, null, Void.class);
                    }
                }

                @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
                @JProtect
                public void onADExposure() {
                    Log.i("TTMediationSDK", "GdtFullVideoLoader onADExposure");
                    Bridge bridge2 = GdtFullVideoAd.this.mGMAd;
                    if (bridge2 != null) {
                        bridge2.call(1008, null, Void.class);
                    }
                }

                @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
                public void onADLeftApplication() {
                }

                @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
                public void onADOpened() {
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x008f  */
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
                        java.lang.String r1 = "GdtFullVideoLoader onADReceive"
                        android.util.Log.i(r0, r1)
                        com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader$GdtFullVideoAd r1 = com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader.GdtFullVideoAd.this
                        r2 = 1
                        com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader.GdtFullVideoAd.a(r1, r2)
                        com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader$GdtFullVideoAd r1 = com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader.GdtFullVideoAd.this
                        com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader r1 = com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader.this
                        boolean r1 = r1.isClientBidding()
                        if (r1 == 0) goto L4d
                        com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader$GdtFullVideoAd r1 = com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader.GdtFullVideoAd.this
                        com.qq.e.ads.interstitial2.UnifiedInterstitialAD r2 = com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader.GdtFullVideoAd.a(r1)
                        int r2 = r2.getECPM()
                        r3 = -1
                        if (r2 == r3) goto L30
                        com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader$GdtFullVideoAd r2 = com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader.GdtFullVideoAd.this
                        com.qq.e.ads.interstitial2.UnifiedInterstitialAD r2 = com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader.GdtFullVideoAd.a(r2)
                        int r2 = r2.getECPM()
                        double r2 = (double) r2
                        goto L32
                    L30:
                        r2 = 0
                    L32:
                        r1.setCpm(r2)
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "GdtFullVideoLoader GDT_clientBidding FullVideo 返回的 cpm价格："
                        r1.append(r2)
                        com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader$GdtFullVideoAd r2 = com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader.GdtFullVideoAd.this
                        com.qq.e.ads.interstitial2.UnifiedInterstitialAD r2 = com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader.GdtFullVideoAd.a(r2)
                        int r2 = r2.getECPM()
                        r1.append(r2)
                        goto L7b
                    L4d:
                        com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader$GdtFullVideoAd r1 = com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader.GdtFullVideoAd.this
                        com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader r1 = com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader.this
                        boolean r1 = r1.isMultiBidding()
                        if (r1 == 0) goto L82
                        com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader$GdtFullVideoAd r1 = com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader.GdtFullVideoAd.this
                        com.qq.e.ads.interstitial2.UnifiedInterstitialAD r2 = com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader.GdtFullVideoAd.a(r1)
                        java.lang.String r2 = r2.getECPMLevel()
                        r1.setLevelTag(r2)
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "GdtFullVideoLoader GDT_多阶底价 FullVideo 返回的价格标签："
                        r1.append(r2)
                        com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader$GdtFullVideoAd r2 = com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader.GdtFullVideoAd.this
                        com.qq.e.ads.interstitial2.UnifiedInterstitialAD r2 = com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader.GdtFullVideoAd.a(r2)
                        java.lang.String r2 = r2.getECPMLevel()
                        r1.append(r2)
                    L7b:
                        java.lang.String r1 = r1.toString()
                        android.util.Log.d(r0, r1)
                    L82:
                        com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader$GdtFullVideoAd r0 = com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader.GdtFullVideoAd.this
                        com.qq.e.ads.interstitial2.UnifiedInterstitialAD r0 = com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader.GdtFullVideoAd.a(r0)
                        int r0 = r0.getAdPatternType()
                        r1 = 2
                        if (r0 != r1) goto Laf
                        com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader$GdtFullVideoAd r0 = com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader.GdtFullVideoAd.this
                        r1 = 5
                        r0.setImageMode(r1)
                        com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader$GdtFullVideoAd r0 = com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader.GdtFullVideoAd.this
                        com.qq.e.ads.interstitial2.UnifiedInterstitialAD r0 = com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader.GdtFullVideoAd.a(r0)
                        com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader$GdtFullVideoAd r1 = com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader.GdtFullVideoAd.this
                        com.qq.e.ads.interstitial2.UnifiedInterstitialMediaListener r1 = r1.d
                        r0.setMediaListener(r1)
                        com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader$GdtFullVideoAd r0 = com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader.GdtFullVideoAd.this
                        com.qq.e.ads.interstitial2.UnifiedInterstitialAD r0 = com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader.GdtFullVideoAd.a(r0)
                        com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader$GdtFullVideoAd r1 = com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader.GdtFullVideoAd.this
                        com.qq.e.ads.interstitial2.ADRewardListener r1 = r1.e
                        r0.setRewardListener(r1)
                    Laf:
                        com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader$GdtFullVideoAd r0 = com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader.GdtFullVideoAd.this
                        com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader r1 = com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader.this
                        com.bykv.vk.openvk.api.proto.Bridge r2 = r0.mGMAd
                        r1.notifyAdSuccess(r0, r2)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader.GdtFullVideoAd.AnonymousClass1.onADReceive():void");
                }

                @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
                @JProtect
                public void onNoAD(AdError adError) {
                    Log.i("TTMediationSDK", "GdtFullVideoLoader onNoAD");
                    GdtFullVideoAd.this.b = false;
                    if (adError != null) {
                        GdtFullVideoLoader.this.notifyAdFailed(adError.getErrorCode(), adError.getErrorMsg());
                    } else {
                        GdtFullVideoLoader.this.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "暂无广告");
                    }
                }

                @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
                public void onRenderFail() {
                }

                @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
                public void onRenderSuccess() {
                }

                @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
                @JProtect
                public void onVideoCached() {
                    Log.i("TTMediationSDK", "GdtFullVideoLoader onVideoCached");
                    GdtFullVideoAd gdtFullVideoAd = GdtFullVideoAd.this;
                    GdtFullVideoLoader.this.notifyAdCache(gdtFullVideoAd.mGMAd, -1, "");
                }
            };
            this.d = new UnifiedInterstitialMediaListener() { // from class: com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader.GdtFullVideoAd.2
                @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialMediaListener
                @JProtect
                public void onVideoComplete() {
                    Log.i("TTMediationSDK", "GdtFullVideoLoader onVideoComplete");
                    Bridge bridge2 = GdtFullVideoAd.this.mGMAd;
                    if (bridge2 != null) {
                        bridge2.call(DownloadErrorCode.ERROR_CUR_BYTES_ZERO, null, Void.class);
                    }
                }

                @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialMediaListener
                @JProtect
                public void onVideoError(AdError adError) {
                    Log.i("TTMediationSDK", "GdtFullVideoLoader onVideoError");
                    if (GdtFullVideoAd.this.mGMAd == null || adError == null) {
                        return;
                    }
                    MediationValueSetBuilder create = MediationValueSetBuilder.create();
                    create.add(8015, adError.getErrorMsg());
                    create.add(8014, adError.getErrorCode());
                    GdtFullVideoAd.this.mGMAd.call(1021, create.build(), Void.class);
                    char c = '8';
                    char c2 = '<';
                    while (true) {
                        boolean z = true;
                        while (true) {
                            if (z) {
                                switch (c2) {
                                    case 'Q':
                                        switch (c) {
                                            case 29:
                                            case 30:
                                            case 31:
                                                return;
                                        }
                                    case 'R':
                                        break;
                                    case 'S':
                                        return;
                                    default:
                                        c2 = 'S';
                                        z = true;
                                }
                                while (true) {
                                    switch (c) {
                                        case '\'':
                                            break;
                                        case '(':
                                            return;
                                        case ')':
                                            break;
                                        default:
                                            c = '\'';
                                    }
                                }
                                c2 = 'S';
                                z = true;
                            } else if (!z) {
                                break;
                            } else {
                                c2 = 'S';
                                z = true;
                            }
                        }
                    }
                }

                @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialMediaListener
                public void onVideoInit() {
                }

                @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialMediaListener
                public void onVideoLoading() {
                }

                @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialMediaListener
                public void onVideoPageClose() {
                }

                @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialMediaListener
                public void onVideoPageOpen() {
                }

                @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialMediaListener
                public void onVideoPause() {
                }

                @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialMediaListener
                public void onVideoReady(long j) {
                }

                @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialMediaListener
                public void onVideoStart() {
                }
            };
            this.e = new ADRewardListener() { // from class: com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader.GdtFullVideoAd.3
                @Override // com.qq.e.comm.listeners.ADRewardListener
                public void onReward(Map<String, Object> map) {
                    Log.i("TTMediationSDK", "GdtFullVideoLoader onRewardVerify");
                    if (GdtFullVideoAd.this.mGMAd != null) {
                        MediationValueSetBuilder create = MediationValueSetBuilder.create();
                        create.add(8017, true);
                        create.add(8018, GdtFullVideoAd.this.getRewardAmount());
                        create.add(8019, GdtFullVideoAd.this.getRewardName());
                        GdtFullVideoAd.this.mGMAd.call(1018, create.build(), Void.class);
                    }
                }
            };
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00bc A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00c0 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a8 -> B:30:0x00a9). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00b6 -> B:39:0x00b8). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00b8 -> B:41:0x00bc). Please submit an issue!!! */
        @com.bytedance.JProtect
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void a() {
            /*
                r8 = this;
                com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader r0 = com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader.this
                android.content.Context r0 = com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader.a(r0)
                boolean r0 = r0 instanceof android.app.Activity
                r1 = 4
                r2 = 5
                r3 = 49
                if (r0 == 0) goto La6
                com.qq.e.ads.interstitial2.UnifiedInterstitialAD r0 = new com.qq.e.ads.interstitial2.UnifiedInterstitialAD
                com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader r4 = com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader.this
                android.content.Context r4 = com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader.a(r4)
                android.app.Activity r4 = (android.app.Activity) r4
                com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader r5 = com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader.this
                java.lang.String r5 = r5.getAdnId()
                com.qq.e.ads.interstitial2.UnifiedInterstitialADListener r6 = r8.c
                r0.<init>(r4, r5, r6)
                r8.a = r0
                java.lang.Object r0 = r8.getGdtVideoOption()
                boolean r0 = r0 instanceof com.qq.e.ads.cfg.VideoOption
                if (r0 == 0) goto L36
                com.qq.e.ads.interstitial2.UnifiedInterstitialAD r0 = r8.a
                java.lang.Object r4 = r8.getGdtVideoOption()
                com.qq.e.ads.cfg.VideoOption r4 = (com.qq.e.ads.cfg.VideoOption) r4
                goto L41
            L36:
                com.qq.e.ads.interstitial2.UnifiedInterstitialAD r0 = r8.a
                com.qq.e.ads.cfg.VideoOption$Builder r4 = new com.qq.e.ads.cfg.VideoOption$Builder
                r4.<init>()
                com.qq.e.ads.cfg.VideoOption r4 = r4.build()
            L41:
                r0.setVideoOption(r4)
                com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader r0 = com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader.this
                int r0 = com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader.b(r0)
                if (r0 <= 0) goto L57
                com.qq.e.ads.interstitial2.UnifiedInterstitialAD r0 = r8.a
                com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader r4 = com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader.this
                int r4 = com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader.b(r4)
                r0.setMaxVideoDuration(r4)
            L57:
                com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader r0 = com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader.this
                int r0 = com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader.c(r0)
                if (r0 <= 0) goto L6a
                com.qq.e.ads.interstitial2.UnifiedInterstitialAD r0 = r8.a
                com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader r4 = com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader.this
                int r4 = com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader.c(r4)
                r0.setMinVideoDuration(r4)
            L6a:
                com.qq.e.ads.rewardvideo.ServerSideVerificationOptions$Builder r0 = new com.qq.e.ads.rewardvideo.ServerSideVerificationOptions$Builder
                r0.<init>()
                java.lang.String r4 = r8.getUserID()
                if (r4 == 0) goto L78
                r0.setUserId(r4)
            L78:
                java.util.Map r5 = r8.getCustomData()
                if (r5 == 0) goto L93
                java.lang.String r6 = "gdt"
                java.lang.Object r7 = r5.get(r6)
                boolean r7 = r7 instanceof java.lang.String
                if (r7 == 0) goto L93
                java.lang.Object r6 = r5.get(r6)
                java.lang.String r6 = (java.lang.String) r6
                if (r6 == 0) goto L93
                r0.setCustomData(r6)
            L93:
                if (r4 != 0) goto L97
                if (r5 == 0) goto La0
            L97:
                com.qq.e.ads.interstitial2.UnifiedInterstitialAD r4 = r8.a
                com.qq.e.ads.rewardvideo.ServerSideVerificationOptions r0 = r0.build()
                r4.setServerSideVerificationOptions(r0)
            La0:
                com.qq.e.ads.interstitial2.UnifiedInterstitialAD r0 = r8.a
                r0.loadFullScreenAD()
                goto Lbc
            La6:
                r0 = 8
            La8:
                r4 = r2
            La9:
                if (r4 == r1) goto Lb6
                if (r4 == r2) goto Lc0
                r5 = 6
                if (r4 == r5) goto Lb1
                goto La8
            Lb1:
                r5 = 43
                if (r0 != r5) goto Lc0
                goto Lb8
            Lb6:
                r3 = 63
            Lb8:
                switch(r3) {
                    case 63: goto Lc0;
                    case 64: goto La9;
                    case 65: goto Lbc;
                    default: goto Lbb;
                }
            Lbb:
                goto Lb6
            Lbc:
                r0 = 125(0x7d, float:1.75E-43)
                r4 = r1
                goto La9
            Lc0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader.GdtFullVideoAd.a():void");
        }

        public void bidLoseNotify(Map<String, Object> map) {
            if (!GdtFullVideoLoader.this.isClientBidding() || this.a == null || map == null) {
                return;
            }
            try {
                Object obj = map.get(MediationConstant.BIDDING_LOSE_REASON);
                if (obj instanceof MediationConstant.BiddingLossReason) {
                    this.a.sendLossNotification(0, GDTAdapterUtils.getBiddingLossReason((MediationConstant.BiddingLossReason) obj), null);
                }
            } catch (Throwable th) {
            }
        }

        public void bidWinNotify(Map<String, Object> map) {
            UnifiedInterstitialAD unifiedInterstitialAD;
            if (GdtFullVideoLoader.this.isClientBidding() && (unifiedInterstitialAD = this.a) != null) {
                try {
                    unifiedInterstitialAD.sendWinNotification((int) getCpm());
                } catch (Exception e) {
                }
            }
        }

        @Override // com.bykv.vk.openvk.api.proto.Caller
        public <T> T call(int i, ValueSet valueSet, Class<T> cls) {
            boolean hasDestroyed;
            if (i != 8211) {
                if (i == 8142) {
                    Log.i("TTMediationSDK", "GdtFullVideoLoader bidWinNotify");
                    Map<String, Object> map = (Map) valueSet.objectValue(8006, Map.class);
                    if (map != null) {
                        bidWinNotify(map);
                    }
                } else if (i == 8144) {
                    Log.i("TTMediationSDK", "GdtFullVideoLoader bidLoseNotify");
                    Map<String, Object> map2 = (Map) valueSet.objectValue(8006, Map.class);
                    if (map2 != null) {
                        bidLoseNotify(map2);
                    }
                } else if (i == 8113) {
                    Log.i("TTMediationSDK", "GdtFullVideoLoader showAd");
                    Activity activity = (Activity) valueSet.objectValue(20033, Activity.class);
                    if (activity != null) {
                        showAd(activity);
                    }
                } else if (i == 8109) {
                    onDestroy();
                } else if (i == 8120) {
                    hasDestroyed = hasDestroyed();
                } else if (i == 8121) {
                    return (T) isReadyStatus();
                }
                return (T) MediationValueUtil.checkClassType(cls);
            }
            Log.i("TTMediationSDK", "GdtFullVideoLoader METHOD_ADN_HAS_AD_VIDEO_CACHED_API");
            hasDestroyed = true;
            return (T) Boolean.valueOf(hasDestroyed);
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
            UnifiedInterstitialAD unifiedInterstitialAD = this.a;
            if (unifiedInterstitialAD != null) {
                unifiedInterstitialAD.showFullScreenAD(activity);
            }
        }

        @Override // com.bykv.vk.openvk.api.proto.Bridge
        public ValueSet values() {
            return null;
        }
    }

    @JProtect
    private void a(MediationAdSlotValueSet mediationAdSlotValueSet) {
        new GdtFullVideoAd(mediationAdSlotValueSet, getGMBridge()).a();
        while (true) {
            char c = 15;
            while (true) {
                switch (c) {
                    case '\r':
                        break;
                    case 14:
                        return;
                    case 15:
                    default:
                        c = 14;
                }
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl
    public void realLoader(Context context, MediationAdSlotValueSet mediationAdSlotValueSet) {
        Log.i("TTMediationSDK", "GdtFullVideoLoader realLoader adnId:" + getAdnId());
        this.a = context;
        this.b = mediationAdSlotValueSet.getGdtMinVideoDuration();
        this.c = mediationAdSlotValueSet.getGdtMaxVideoDuration();
        a(mediationAdSlotValueSet);
    }
}

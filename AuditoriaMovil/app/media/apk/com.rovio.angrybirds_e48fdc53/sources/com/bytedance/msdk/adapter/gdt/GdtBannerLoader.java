package com.bytedance.msdk.adapter.gdt;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.JProtect;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationViewBinder;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;
import com.qq.e.ads.banner2.UnifiedBannerADListener;
import com.qq.e.ads.banner2.UnifiedBannerView;
import com.qq.e.ads.cfg.DownAPPConfirmPolicy;
import com.qq.e.ads.cfg.VideoOption;
import com.qq.e.ads.nativ.ADSize;
import com.qq.e.ads.nativ.NativeADMediaListener;
import com.qq.e.ads.nativ.NativeADUnifiedListener;
import com.qq.e.ads.nativ.NativeExpressAD;
import com.qq.e.ads.nativ.NativeExpressADView;
import com.qq.e.ads.nativ.NativeExpressMediaListener;
import com.qq.e.ads.nativ.NativeUnifiedADAppMiitInfo;
import com.qq.e.ads.nativ.NativeUnifiedADData;
import com.qq.e.comm.pi.AdData;
import com.qq.e.comm.util.AdError;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class GdtBannerLoader extends MediationAdLoaderImpl {
    private Context a;
    private MediationAdSlotValueSet b;
    private Bridge c;
    private FrameLayout.LayoutParams d;
    private final NativeExpressAD.NativeExpressADListener e = new NativeExpressAD.NativeExpressADListener() { // from class: com.bytedance.msdk.adapter.gdt.GdtBannerLoader.1
        TTExpressAd a;

        @Override // com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener
        public void onADClicked(NativeExpressADView nativeExpressADView) {
            TTExpressAd tTExpressAd = this.a;
            if (tTExpressAd != null) {
                tTExpressAd.onAdClicked();
            }
        }

        @Override // com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener
        public void onADClosed(NativeExpressADView nativeExpressADView) {
            TTExpressAd tTExpressAd = this.a;
            if (tTExpressAd != null) {
                tTExpressAd.onAdClosed();
            }
        }

        @Override // com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener
        public void onADExposure(NativeExpressADView nativeExpressADView) {
            TTExpressAd tTExpressAd = this.a;
            if (tTExpressAd != null) {
                tTExpressAd.onAdShow();
            }
        }

        @Override // com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener
        public void onADLeftApplication(NativeExpressADView nativeExpressADView) {
            TTExpressAd tTExpressAd = this.a;
            if (tTExpressAd != null) {
                tTExpressAd.onAdLeftApplication();
            }
        }

        @Override // com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener
        public void onADLoaded(List<NativeExpressADView> list) {
            if (list == null || list.size() == 0) {
                GdtBannerLoader.this.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "load list is null or empty");
                return;
            }
            for (NativeExpressADView nativeExpressADView : list) {
                if (nativeExpressADView != null) {
                    GdtBannerLoader gdtBannerLoader = GdtBannerLoader.this;
                    TTExpressAd tTExpressAd = new TTExpressAd(nativeExpressADView, gdtBannerLoader.b, GdtBannerLoader.this.c);
                    this.a = tTExpressAd;
                    tTExpressAd.render();
                    return;
                }
            }
        }

        @Override // com.qq.e.ads.NativeAbstractAD.BasicADListener
        public void onNoAD(AdError adError) {
            if (adError != null) {
                GdtBannerLoader.this.notifyAdFailed(adError.getErrorCode(), adError.getErrorMsg());
            } else {
                GdtBannerLoader.this.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "error is null");
            }
        }

        @Override // com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener
        public void onRenderFail(NativeExpressADView nativeExpressADView) {
            GdtBannerLoader.this.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "render fail");
        }

        @Override // com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener
        public void onRenderSuccess(NativeExpressADView nativeExpressADView) {
            GdtBannerLoader gdtBannerLoader = GdtBannerLoader.this;
            gdtBannerLoader.notifyAdSuccess(this.a, gdtBannerLoader.c);
        }
    };
    private final NativeADUnifiedListener f = new NativeADUnifiedListener() { // from class: com.bytedance.msdk.adapter.gdt.GdtBannerLoader.2
        @Override // com.qq.e.ads.nativ.NativeADUnifiedListener
        public void onADLoaded(List<NativeUnifiedADData> list) {
            if (list == null || list.size() <= 0) {
                GdtBannerLoader.this.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "load list is empty");
                return;
            }
            for (NativeUnifiedADData nativeUnifiedADData : list) {
                if (nativeUnifiedADData != null) {
                    GdtBannerLoader gdtBannerLoader = GdtBannerLoader.this;
                    gdtBannerLoader.notifyAdSuccess(new GdtNativeAd(nativeUnifiedADData, gdtBannerLoader.b, GdtBannerLoader.this.c), GdtBannerLoader.this.c);
                    return;
                }
            }
        }

        @Override // com.qq.e.ads.NativeAbstractAD.BasicADListener
        public void onNoAD(AdError adError) {
            if (adError != null) {
                GdtBannerLoader.this.notifyAdFailed(adError.getErrorCode(), adError.getErrorMsg());
            } else {
                GdtBannerLoader.this.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "error is null");
            }
        }
    };

    /* loaded from: classes.dex */
    class GdtBannerAd extends MediationBaseAdBridge {
        private UnifiedBannerView a;
        private boolean b;
        private boolean c;

        public GdtBannerAd(MediationAdSlotValueSet mediationAdSlotValueSet, Bridge bridge) {
            super(mediationAdSlotValueSet, bridge);
            this.b = false;
            this.c = false;
        }

        private View b() {
            return this.a;
        }

        void a() {
            if (GdtBannerLoader.this.a instanceof Activity) {
                UnifiedBannerView unifiedBannerView = new UnifiedBannerView((Activity) GdtBannerLoader.this.a, GdtBannerLoader.this.getAdnId(), new UnifiedBannerADListener() { // from class: com.bytedance.msdk.adapter.gdt.GdtBannerLoader.GdtBannerAd.1
                    @Override // com.qq.e.ads.banner2.UnifiedBannerADListener
                    public void onADClicked() {
                        Bridge bridge = GdtBannerAd.this.mGMAd;
                        if (bridge != null) {
                            bridge.call(1009, null, Void.class);
                        }
                    }

                    @Override // com.qq.e.ads.banner2.UnifiedBannerADListener
                    public void onADClosed() {
                        Bridge bridge = GdtBannerAd.this.mGMAd;
                        if (bridge != null) {
                            bridge.call(1014, null, Void.class);
                        }
                    }

                    @Override // com.qq.e.ads.banner2.UnifiedBannerADListener
                    public void onADExposure() {
                        Bridge bridge = GdtBannerAd.this.mGMAd;
                        if (bridge != null) {
                            bridge.call(1008, null, Void.class);
                        }
                    }

                    @Override // com.qq.e.ads.banner2.UnifiedBannerADListener
                    public void onADLeftApplication() {
                        Bridge bridge = GdtBannerAd.this.mGMAd;
                        if (bridge != null) {
                            bridge.call(1016, null, Void.class);
                        }
                    }

                    @Override // com.qq.e.ads.banner2.UnifiedBannerADListener
                    public void onADReceive() {
                        if (GdtBannerAd.this.b) {
                            return;
                        }
                        GdtBannerAd.this.b = true;
                        if (GdtBannerAd.this.a != null) {
                            if (GdtBannerLoader.this.isClientBidding()) {
                                int ecpm = GdtBannerAd.this.a.getECPM();
                                GdtBannerAd.this.setCpm(ecpm > 0 ? ecpm : PangleAdapterUtils.CPM_DEFLAUT_VALUE);
                            } else if (GdtBannerLoader.this.isMultiBidding()) {
                                GdtBannerAd gdtBannerAd = GdtBannerAd.this;
                                gdtBannerAd.setCpmLevel(gdtBannerAd.a.getECPMLevel());
                            }
                        }
                        GdtBannerAd gdtBannerAd2 = GdtBannerAd.this;
                        GdtBannerLoader.this.notifyAdSuccess(gdtBannerAd2, gdtBannerAd2.mGMAd);
                    }

                    @Override // com.qq.e.ads.banner2.UnifiedBannerADListener
                    public void onNoAD(AdError adError) {
                        if (GdtBannerAd.this.b) {
                            return;
                        }
                        GdtBannerAd.this.b = true;
                        GdtBannerLoader.this.notifyAdFailed(adError != null ? adError.getErrorCode() : -1, adError != null ? adError.getErrorMsg() : "位置错误");
                    }
                });
                this.a = unifiedBannerView;
                unifiedBannerView.setRefresh(0);
                this.a.loadAD();
            }
        }

        public void bidLoseNotify(Map<String, Object> map) {
            if (!GdtBannerLoader.this.isClientBidding() || this.a == null || map == null) {
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
            UnifiedBannerView unifiedBannerView;
            if (GdtBannerLoader.this.isClientBidding() && (unifiedBannerView = this.a) != null) {
                try {
                    unifiedBannerView.sendWinNotification((int) getCpm());
                } catch (Exception e) {
                }
            }
        }

        @Override // com.bykv.vk.openvk.api.proto.Caller
        public <T> T call(int i, ValueSet valueSet, Class<T> cls) {
            if (i == 6081) {
                return (T) b();
            }
            if (i == 8121) {
                return (T) isReadyStatus();
            }
            if (i == 8120) {
                return (T) Boolean.valueOf(hasDestroyed());
            }
            if (i == 8109) {
                onDestroy();
            } else if (i == 8142) {
                Log.i("TTMediationSDK", "GdtBannerLoader bidWinNotify");
                Map<String, Object> map = (Map) valueSet.objectValue(8006, Map.class);
                if (map != null) {
                    bidWinNotify(map);
                }
            } else if (i == 8144) {
                Log.i("TTMediationSDK", "GdtBannerLoader bidLoseNotify");
                Map<String, Object> map2 = (Map) valueSet.objectValue(8006, Map.class);
                if (map2 != null) {
                    bidLoseNotify(map2);
                }
            }
            return (T) MediationValueUtil.checkClassType(cls);
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public boolean hasDestroyed() {
            return this.c;
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public MediationConstant.AdIsReadyStatus isReadyStatus() {
            UnifiedBannerView unifiedBannerView = this.a;
            return (unifiedBannerView == null || !unifiedBannerView.isValid()) ? MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY : MediationConstant.AdIsReadyStatus.AD_IS_READY;
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public void onDestroy() {
            this.c = true;
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.msdk.adapter.gdt.GdtBannerLoader.GdtBannerAd.2
                @Override // java.lang.Runnable
                public void run() {
                    if (GdtBannerAd.this.a != null) {
                        GdtBannerAd.this.a.destroy();
                    }
                }
            });
        }

        @Override // com.bykv.vk.openvk.api.proto.Bridge
        public ValueSet values() {
            return null;
        }
    }

    /* loaded from: classes.dex */
    class GdtNativeAd extends MediationBaseAdBridge {
        private String a;
        NativeUnifiedADData b;
        private volatile boolean c;
        NativeADMediaListener d;

        GdtNativeAd(NativeUnifiedADData nativeUnifiedADData, MediationAdSlotValueSet mediationAdSlotValueSet, Bridge bridge) {
            super(mediationAdSlotValueSet, bridge);
            this.a = "GdtBanner-gdtNativeAd";
            this.c = false;
            this.d = new NativeADMediaListener() { // from class: com.bytedance.msdk.adapter.gdt.GdtBannerLoader.GdtNativeAd.3
                @Override // com.qq.e.ads.nativ.NativeADMediaListener
                @JProtect
                public void onVideoClicked() {
                    Log.d(GdtNativeAd.this.a, "onVideoClicked");
                }

                @Override // com.qq.e.ads.nativ.NativeADMediaListener
                @JProtect
                public void onVideoCompleted() {
                    while (true) {
                        char c = '^';
                        char c2 = 'K';
                        while (true) {
                            if (c == '\\') {
                                switch (c2) {
                                    case 21:
                                        return;
                                    case 22:
                                    case 23:
                                        c = ']';
                                        c2 = ']';
                                }
                            } else if (c != ']') {
                                c = ']';
                                c2 = ']';
                            }
                        }
                        while (true) {
                            switch (c2) {
                                case '[':
                                    break;
                                case '\\':
                                case ']':
                                    return;
                                default:
                                    c2 = '[';
                            }
                        }
                    }
                }

                @Override // com.qq.e.ads.nativ.NativeADMediaListener
                @JProtect
                public void onVideoError(AdError adError) {
                    while (true) {
                        char c = '^';
                        char c2 = 'K';
                        while (true) {
                            if (c == '\\') {
                                switch (c2) {
                                    case 21:
                                        return;
                                    case 22:
                                    case 23:
                                        c = ']';
                                        c2 = ']';
                                }
                            } else if (c != ']') {
                                c = ']';
                                c2 = ']';
                            }
                        }
                        while (true) {
                            switch (c2) {
                                case '[':
                                    break;
                                case '\\':
                                case ']':
                                    return;
                                default:
                                    c2 = '[';
                            }
                        }
                    }
                }

                @Override // com.qq.e.ads.nativ.NativeADMediaListener
                public void onVideoInit() {
                    Log.d(GdtNativeAd.this.a, "onVideoInit: ");
                }

                @Override // com.qq.e.ads.nativ.NativeADMediaListener
                public void onVideoLoaded(int i) {
                    Log.d(GdtNativeAd.this.a, "onVideoLoaded: ");
                }

                @Override // com.qq.e.ads.nativ.NativeADMediaListener
                public void onVideoLoading() {
                    Log.d(GdtNativeAd.this.a, "onVideoLoading: ");
                }

                @Override // com.qq.e.ads.nativ.NativeADMediaListener
                @JProtect
                public void onVideoPause() {
                    while (true) {
                        char c = ']';
                        char c2 = ']';
                        while (true) {
                            switch (c) {
                                case '\\':
                                    switch (c2) {
                                        case 21:
                                            return;
                                    }
                                    c = '^';
                                    c2 = 'K';
                                    break;
                                case ']':
                                    while (true) {
                                        switch (c2) {
                                            case '[':
                                            case ']':
                                                break;
                                            case '\\':
                                                return;
                                            default:
                                                c2 = '[';
                                        }
                                    }
                                    c = '^';
                                    c2 = 'K';
                                    break;
                                case '^':
                                    if (c2 <= 4) {
                                        break;
                                    } else {
                                        return;
                                    }
                            }
                        }
                    }
                }

                @Override // com.qq.e.ads.nativ.NativeADMediaListener
                public void onVideoReady() {
                    Log.d(GdtNativeAd.this.a, "onVideoReady");
                }

                @Override // com.qq.e.ads.nativ.NativeADMediaListener
                @JProtect
                public void onVideoResume() {
                    while (true) {
                        char c = ']';
                        char c2 = ']';
                        while (true) {
                            switch (c) {
                                case '\\':
                                    switch (c2) {
                                        case 21:
                                            return;
                                    }
                                    c = '^';
                                    c2 = 'K';
                                    break;
                                case ']':
                                    while (true) {
                                        switch (c2) {
                                            case '[':
                                            case ']':
                                                break;
                                            case '\\':
                                                return;
                                            default:
                                                c2 = '[';
                                        }
                                    }
                                    c = '^';
                                    c2 = 'K';
                                    break;
                                case '^':
                                    if (c2 <= 4) {
                                        break;
                                    } else {
                                        return;
                                    }
                            }
                        }
                    }
                }

                @Override // com.qq.e.ads.nativ.NativeADMediaListener
                @JProtect
                public void onVideoStart() {
                    Log.d(GdtNativeAd.this.a, "onVideoStart");
                }

                @Override // com.qq.e.ads.nativ.NativeADMediaListener
                public void onVideoStop() {
                    Log.d(GdtNativeAd.this.a, "onVideoStop");
                }
            };
            this.b = nativeUnifiedADData;
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            NativeUnifiedADAppMiitInfo appMiitInfo = this.b.getAppMiitInfo();
            if (appMiitInfo != null) {
                create.add(8056, appMiitInfo.getAppName());
                create.add(8057, appMiitInfo.getAuthorName());
                create.add(8078, appMiitInfo.getPackageSizeBytes());
                create.add(8079, appMiitInfo.getPermissionsUrl());
                create.add(8080, appMiitInfo.getPrivacyAgreement());
                create.add(8081, appMiitInfo.getVersionName());
            }
            create.add(8045, this.b.getTitle());
            create.add(8046, this.b.getDesc());
            create.add(8061, this.b.getCTAText());
            create.add(8048, this.b.getIconUrl());
            create.add(8050, this.b.getImgUrl());
            create.add(8052, this.b.getPictureWidth());
            create.add(8051, this.b.getPictureHeight());
            create.add(8053, this.b.getImgList());
            create.add(8082, this.b.getAppScore());
            create.add(8049, this.b.getTitle());
            create.add(8055, this.b.isAppAd());
            if (GdtBannerLoader.this.isClientBidding()) {
                create.add(8016, Math.max(this.b.getECPM(), (double) PangleAdapterUtils.CPM_DEFLAUT_VALUE));
            } else if (GdtBannerLoader.this.isMultiBidding()) {
                create.add(8058, this.b.getECPMLevel());
            }
            if (this.b.getAdPatternType() == 2) {
                create.add(8060, 5);
            } else if (this.b.getAdPatternType() == 4 || this.b.getAdPatternType() == 1) {
                create.add(8060, 3);
            } else if (this.b.getAdPatternType() == 3) {
                create.add(8060, 4);
            }
            if (this.b.isAppAd()) {
                create.add(8059, 4);
            } else {
                create.add(8059, 3);
            }
            create.add(8033, false);
            bridge.call(8140, create.build(), Void.class);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00ed A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00e9 -> B:42:0x00ea). Please submit an issue!!! */
        @com.bytedance.JProtect
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void a(android.content.Context r10, android.view.ViewGroup r11, java.util.List<android.view.View> r12, java.util.List<android.view.View> r13, java.util.List<android.view.View> r14, com.bytedance.sdk.openadsdk.mediation.ad.MediationViewBinder r15) {
            /*
                r9 = this;
                com.qq.e.ads.nativ.NativeUnifiedADData r0 = r9.b
                r1 = 51
                if (r0 == 0) goto Le9
                if (r14 == 0) goto L12
                if (r13 != 0) goto Lf
                java.util.ArrayList r13 = new java.util.ArrayList
                r13.<init>()
            Lf:
                r13.addAll(r14)
            L12:
                r7 = r13
                r13 = 0
                android.view.View r14 = r11.getChildAt(r13)
                boolean r14 = r14 instanceof com.qq.e.ads.nativ.widget.NativeAdContainer
                java.lang.String r0 = "tt_gdt_developer_view"
                r8 = -1
                if (r14 == 0) goto L4f
                android.view.View r14 = r11.getChildAt(r13)
                com.qq.e.ads.nativ.widget.NativeAdContainer r14 = (com.qq.e.ads.nativ.widget.NativeAdContainer) r14
            L25:
                int r2 = r14.getChildCount()
                if (r13 >= r2) goto L4d
                android.view.View r2 = r14.getChildAt(r13)
                if (r2 == 0) goto L4a
                int r3 = com.bytedance.msdk.adapter.gdt.R.id.tt_mediation_gdt_developer_view_tag_key
                java.lang.Object r3 = r2.getTag(r3)
                if (r3 == 0) goto L46
                boolean r4 = r3 instanceof java.lang.String
                if (r4 == 0) goto L46
                java.lang.String r3 = (java.lang.String) r3
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L46
                goto L4a
            L46:
                r14.removeView(r2)
                goto L25
            L4a:
                int r13 = r13 + 1
                goto L25
            L4d:
                r4 = r14
                goto L82
            L4f:
                com.qq.e.ads.nativ.widget.NativeAdContainer r14 = new com.qq.e.ads.nativ.widget.NativeAdContainer
                r14.<init>(r10)
                int r2 = com.bytedance.msdk.adapter.gdt.R.id.tt_mediation_gdt_developer_view_root_tag_key
                java.lang.String r3 = "tt_gdt_developer_view_root"
                r14.setTag(r2, r3)
            L5b:
                int r2 = r11.getChildCount()
                if (r2 <= 0) goto L7b
                android.view.View r2 = r11.getChildAt(r13)
                int r3 = com.bytedance.msdk.adapter.gdt.R.id.tt_mediation_gdt_developer_view_tag_key
                r2.setTag(r3, r0)
                int r3 = r11.indexOfChild(r2)
                r11.removeViewInLayout(r2)
                if (r2 == 0) goto L5b
                android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
                r14.addView(r2, r3, r4)
                goto L5b
            L7b:
                r11.removeAllViews()
                r11.addView(r14, r8, r8)
                goto L4d
            L82:
                int r13 = r15.mediaViewId
                android.view.View r13 = r11.findViewById(r13)
                android.view.ViewGroup r13 = (android.view.ViewGroup) r13
                com.qq.e.ads.nativ.NativeUnifiedADData r2 = r9.b
                com.bytedance.msdk.adapter.gdt.GdtBannerLoader r14 = com.bytedance.msdk.adapter.gdt.GdtBannerLoader.this
                android.widget.FrameLayout$LayoutParams r5 = com.bytedance.msdk.adapter.gdt.GdtBannerLoader.c(r14)
                r3 = r10
                r6 = r12
                r2.bindAdToView(r3, r4, r5, r6, r7)
                if (r13 == 0) goto Lbd
                com.qq.e.ads.nativ.NativeUnifiedADData r12 = r9.b
                int r12 = r12.getAdPatternType()
                r14 = 2
                if (r12 != r14) goto Lbd
                com.qq.e.ads.nativ.MediaView r12 = new com.qq.e.ads.nativ.MediaView
                r12.<init>(r10)
                r13.removeAllViews()
                r13.addView(r12, r8, r8)
                com.qq.e.ads.cfg.VideoOption$Builder r10 = new com.qq.e.ads.cfg.VideoOption$Builder
                r10.<init>()
                com.qq.e.ads.cfg.VideoOption r10 = r10.build()
                com.qq.e.ads.nativ.NativeUnifiedADData r13 = r9.b
                com.qq.e.ads.nativ.NativeADMediaListener r14 = r9.d
                r13.bindMediaView(r12, r10, r14)
            Lbd:
                com.qq.e.ads.nativ.NativeUnifiedADData r10 = r9.b
                java.lang.String r10 = r10.getCTAText()
                boolean r10 = android.text.TextUtils.isEmpty(r10)
                if (r10 != 0) goto Ldc
                int r10 = r15.callToActionId
                android.view.View r10 = r11.findViewById(r10)
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                r11.add(r10)
                com.qq.e.ads.nativ.NativeUnifiedADData r10 = r9.b
                r10.bindCTAViews(r11)
            Ldc:
                com.qq.e.ads.nativ.NativeUnifiedADData r10 = r9.b
                com.bytedance.msdk.adapter.gdt.GdtBannerLoader$GdtNativeAd$1 r11 = new com.bytedance.msdk.adapter.gdt.GdtBannerLoader$GdtNativeAd$1
                r11.<init>()
                r10.setNativeAdEventListener(r11)
                r10 = 52
                goto Lea
            Le9:
                r10 = r1
            Lea:
                if (r10 == r1) goto Led
                goto Le9
            Led:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.msdk.adapter.gdt.GdtBannerLoader.GdtNativeAd.a(android.content.Context, android.view.ViewGroup, java.util.List, java.util.List, java.util.List, com.bytedance.sdk.openadsdk.mediation.ad.MediationViewBinder):void");
        }

        public void bidLoseNotify(Map<String, Object> map) {
            if (!GdtBannerLoader.this.isClientBidding() || this.b == null || map == null) {
                return;
            }
            try {
                Object obj = map.get(MediationConstant.BIDDING_LOSE_REASON);
                if (obj instanceof MediationConstant.BiddingLossReason) {
                    this.b.sendLossNotification(0, GDTAdapterUtils.getBiddingLossReason((MediationConstant.BiddingLossReason) obj), null);
                }
            } catch (Exception e) {
            }
        }

        public void bidWinNotify(Map<String, Object> map) {
            NativeUnifiedADData nativeUnifiedADData;
            if (GdtBannerLoader.this.isClientBidding() && (nativeUnifiedADData = this.b) != null) {
                try {
                    nativeUnifiedADData.sendWinNotification((int) getCpm());
                } catch (Exception e) {
                }
            }
        }

        @Override // com.bykv.vk.openvk.api.proto.Caller
        public <T> T call(int i, ValueSet valueSet, Class<T> cls) {
            if (i == 8121) {
                return (T) isReadyStatus();
            }
            if (i == 8120) {
                return (T) Boolean.valueOf(hasDestroyed());
            }
            if (i == 8159) {
                a((Activity) valueSet.objectValue(20033, Activity.class), (ViewGroup) valueSet.objectValue(8067, ViewGroup.class), (List) valueSet.objectValue(8068, List.class), (List) valueSet.objectValue(8069, List.class), (List) valueSet.objectValue(8070, List.class), (MediationViewBinder) valueSet.objectValue(8071, MediationViewBinder.class));
            } else if (i == 8109) {
                onDestroy();
            } else if (i == 8142) {
                Log.i(this.a, "GdtBannerLoader Native bidWinNotify");
                Map<String, Object> map = (Map) valueSet.objectValue(8006, Map.class);
                if (map != null) {
                    bidWinNotify(map);
                }
            } else if (i == 8144) {
                Log.i(this.a, "GdtBannerLoader Native bidLoseNotify");
                Map<String, Object> map2 = (Map) valueSet.objectValue(8006, Map.class);
                if (map2 != null) {
                    bidLoseNotify(map2);
                }
            }
            return (T) MediationValueUtil.checkClassType(cls);
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public boolean hasDestroyed() {
            return this.c;
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public MediationConstant.AdIsReadyStatus isReadyStatus() {
            NativeUnifiedADData nativeUnifiedADData = this.b;
            return (nativeUnifiedADData == null || !nativeUnifiedADData.isValid()) ? MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY : MediationConstant.AdIsReadyStatus.AD_IS_READY;
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public void onDestroy() {
            this.c = true;
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.msdk.adapter.gdt.GdtBannerLoader.GdtNativeAd.2
                @Override // java.lang.Runnable
                public void run() {
                    NativeUnifiedADData nativeUnifiedADData = GdtNativeAd.this.b;
                    if (nativeUnifiedADData != null) {
                        nativeUnifiedADData.destroy();
                    }
                }
            });
        }

        @Override // com.bykv.vk.openvk.api.proto.Bridge
        public ValueSet values() {
            return null;
        }
    }

    /* loaded from: classes.dex */
    class TTExpressAd extends MediationBaseAdBridge {
        private String a;
        NativeExpressADView b;
        private volatile boolean c;
        private final NativeExpressMediaListener d;

        TTExpressAd(NativeExpressADView nativeExpressADView, MediationAdSlotValueSet mediationAdSlotValueSet, Bridge bridge) {
            super(mediationAdSlotValueSet, bridge);
            this.a = "GdtBanenrLoader-TTExpressAd";
            this.c = false;
            NativeExpressMediaListener nativeExpressMediaListener = new NativeExpressMediaListener() { // from class: com.bytedance.msdk.adapter.gdt.GdtBannerLoader.TTExpressAd.2
                @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
                public void onVideoCached(NativeExpressADView nativeExpressADView2) {
                    Log.i(TTExpressAd.this.a, "onVideoCached");
                }

                @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
                @JProtect
                public void onVideoComplete(NativeExpressADView nativeExpressADView2) {
                    while (true) {
                        char c = '^';
                        char c2 = 'K';
                        while (true) {
                            if (c == '\\') {
                                switch (c2) {
                                    case 21:
                                        return;
                                    case 22:
                                    case 23:
                                        c = ']';
                                        c2 = ']';
                                }
                            } else if (c != ']') {
                                c = ']';
                                c2 = ']';
                            }
                        }
                        while (true) {
                            switch (c2) {
                                case '[':
                                    break;
                                case '\\':
                                case ']':
                                    return;
                                default:
                                    c2 = '[';
                            }
                        }
                    }
                }

                @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
                @JProtect
                public void onVideoError(NativeExpressADView nativeExpressADView2, AdError adError) {
                    while (true) {
                        char c = '^';
                        char c2 = 'K';
                        while (true) {
                            if (c == '\\') {
                                switch (c2) {
                                    case 21:
                                        return;
                                    case 22:
                                    case 23:
                                        c = ']';
                                        c2 = ']';
                                }
                            } else if (c != ']') {
                                c = ']';
                                c2 = ']';
                            }
                        }
                        while (true) {
                            switch (c2) {
                                case '[':
                                    break;
                                case '\\':
                                case ']':
                                    return;
                                default:
                                    c2 = '[';
                            }
                        }
                    }
                }

                @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
                public void onVideoInit(NativeExpressADView nativeExpressADView2) {
                    String str = TTExpressAd.this.a;
                    Log.i(str, "onVideoInit: " + TTExpressAd.this.a((AdData.VideoPlayer) nativeExpressADView2.getBoundData().getProperty(AdData.VideoPlayer.class)));
                }

                @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
                public void onVideoLoading(NativeExpressADView nativeExpressADView2) {
                    Log.i(TTExpressAd.this.a, "onVideoLoading");
                }

                @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
                public void onVideoPageClose(NativeExpressADView nativeExpressADView2) {
                }

                @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
                public void onVideoPageOpen(NativeExpressADView nativeExpressADView2) {
                }

                @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
                @JProtect
                public void onVideoPause(NativeExpressADView nativeExpressADView2) {
                    while (true) {
                        char c = ']';
                        char c2 = ']';
                        while (true) {
                            switch (c) {
                                case '\\':
                                    switch (c2) {
                                        case 21:
                                            return;
                                    }
                                    c = '^';
                                    c2 = 'K';
                                    break;
                                case ']':
                                    while (true) {
                                        switch (c2) {
                                            case '[':
                                            case ']':
                                                break;
                                            case '\\':
                                                return;
                                            default:
                                                c2 = '[';
                                        }
                                    }
                                    c = '^';
                                    c2 = 'K';
                                    break;
                                case '^':
                                    if (c2 <= 4) {
                                        break;
                                    } else {
                                        return;
                                    }
                            }
                        }
                    }
                }

                @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
                public void onVideoReady(NativeExpressADView nativeExpressADView2, long j) {
                }

                @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
                @JProtect
                public void onVideoStart(NativeExpressADView nativeExpressADView2) {
                    while (true) {
                        char c = ']';
                        char c2 = ']';
                        while (true) {
                            switch (c) {
                                case '\\':
                                    switch (c2) {
                                        case 21:
                                            return;
                                    }
                                    c = '^';
                                    c2 = 'K';
                                    break;
                                case ']':
                                    while (true) {
                                        switch (c2) {
                                            case '[':
                                            case ']':
                                                break;
                                            case '\\':
                                                return;
                                            default:
                                                c2 = '[';
                                        }
                                    }
                                    c = '^';
                                    c2 = 'K';
                                    break;
                                case '^':
                                    if (c2 <= 4) {
                                        break;
                                    } else {
                                        return;
                                    }
                            }
                        }
                    }
                }
            };
            this.d = nativeExpressMediaListener;
            this.b = nativeExpressADView;
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            AdData boundData = nativeExpressADView.getBoundData();
            if (boundData.getAdPatternType() == 2) {
                nativeExpressADView.setMediaListener(nativeExpressMediaListener);
                create.add(8060, 5);
            } else if (boundData.getAdPatternType() == 4 || boundData.getAdPatternType() == 1 || boundData.getAdPatternType() != 3) {
                create.add(8060, 3);
            } else {
                create.add(8060, 4);
            }
            create.add(8033, true);
            create.add(8045, boundData.getTitle());
            create.add(8046, boundData.getDesc());
            create.add(8059, 3);
            bridge.call(8140, create.build(), Void.class);
            if (GdtBannerLoader.this.isClientBidding()) {
                setCpm(boundData.getECPM() != -1 ? boundData.getECPM() : PangleAdapterUtils.CPM_DEFLAUT_VALUE);
            } else if (GdtBannerLoader.this.isMultiBidding()) {
                setCpmLevel(boundData.getECPMLevel());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String a(AdData.VideoPlayer videoPlayer) {
            if (videoPlayer != null) {
                return "{state:" + videoPlayer.getVideoState() + ",duration:" + videoPlayer.getDuration() + ",position:" + videoPlayer.getCurrentPosition() + "}";
            }
            return null;
        }

        public void bidLoseNotify(Map<String, Object> map) {
            if (!GdtBannerLoader.this.isClientBidding() || this.b == null || map == null) {
                return;
            }
            try {
                Object obj = map.get(MediationConstant.BIDDING_LOSE_REASON);
                if (obj instanceof MediationConstant.BiddingLossReason) {
                    this.b.sendLossNotification(0, GDTAdapterUtils.getBiddingLossReason((MediationConstant.BiddingLossReason) obj), null);
                }
            } catch (Exception e) {
            }
        }

        public void bidWinNotify(Map<String, Object> map) {
            NativeExpressADView nativeExpressADView;
            if (GdtBannerLoader.this.isClientBidding() && (nativeExpressADView = this.b) != null) {
                try {
                    nativeExpressADView.sendWinNotification((int) getCpm());
                } catch (Exception e) {
                }
            }
        }

        @Override // com.bykv.vk.openvk.api.proto.Caller
        public <T> T call(int i, ValueSet valueSet, Class<T> cls) {
            if (i == 6081) {
                return (T) getAdView();
            }
            if (i == 8121) {
                return (T) isReadyStatus();
            }
            if (i == 8120) {
                return (T) Boolean.valueOf(hasDestroyed());
            }
            if (i == 8109) {
                onDestroy();
            } else if (i == 8142) {
                Log.i(this.a, "GdtBannerLoader ExpressNative bidWinNotify");
                Map<String, Object> map = (Map) valueSet.objectValue(8006, Map.class);
                if (map != null) {
                    bidWinNotify(map);
                }
            } else if (i == 8144) {
                Log.i(this.a, "GdtBannerLoader ExpressNative bidLoseNotify");
                Map<String, Object> map2 = (Map) valueSet.objectValue(8006, Map.class);
                if (map2 != null) {
                    bidLoseNotify(map2);
                }
            }
            return (T) MediationValueUtil.checkClassType(cls);
        }

        @JProtect
        public View getAdView() {
            return this.b;
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public boolean hasDestroyed() {
            return this.c;
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public MediationConstant.AdIsReadyStatus isReadyStatus() {
            NativeExpressADView nativeExpressADView = this.b;
            return (nativeExpressADView == null || !nativeExpressADView.isValid()) ? MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY : MediationConstant.AdIsReadyStatus.AD_IS_READY;
        }

        public void onAdClicked() {
            Bridge bridge = this.mGMAd;
            if (bridge != null) {
                bridge.call(1009, null, Void.class);
            }
        }

        public void onAdClosed() {
            Bridge bridge = this.mGMAd;
            if (bridge != null) {
                bridge.call(1014, null, Void.class);
            }
        }

        public void onAdLeftApplication() {
            Bridge bridge = this.mGMAd;
            if (bridge != null) {
                bridge.call(1016, null, Void.class);
            }
        }

        public void onAdShow() {
            Bridge bridge = this.mGMAd;
            if (bridge != null) {
                bridge.call(1008, null, Void.class);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public void onDestroy() {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.msdk.adapter.gdt.GdtBannerLoader.TTExpressAd.1
                @Override // java.lang.Runnable
                public void run() {
                    NativeExpressADView nativeExpressADView = TTExpressAd.this.b;
                    if (nativeExpressADView != null) {
                        nativeExpressADView.destroy();
                    }
                }
            });
            this.c = true;
        }

        @JProtect
        public void render() {
            NativeExpressADView nativeExpressADView = this.b;
            if (nativeExpressADView == null) {
                return;
            }
            nativeExpressADView.render();
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

        @Override // com.bykv.vk.openvk.api.proto.Bridge
        public ValueSet values() {
            return null;
        }
    }

    private ADSize a(MediationAdSlotValueSet mediationAdSlotValueSet) {
        ADSize aDSize = new ADSize(-1, -2);
        float expressWidth = mediationAdSlotValueSet.getExpressWidth();
        float expressHeight = mediationAdSlotValueSet.getExpressHeight();
        if (expressWidth > 0.0f) {
            boolean isExpressNativeAutoHeight = GDTAdapterUtils.isExpressNativeAutoHeight(mediationAdSlotValueSet);
            Log.i("TTMediationSDK", "gdt banner native express autoHeight:" + isExpressNativeAutoHeight + " width:" + expressWidth + "  height:" + expressHeight);
            return (isExpressNativeAutoHeight || expressHeight == 0.0f) ? new ADSize((int) expressWidth, -2) : new ADSize((int) expressWidth, (int) expressHeight);
        }
        return aDSize;
    }

    private void a() {
        DownAPPConfirmPolicy downAPPConfirmPolicy;
        int intValue;
        NativeExpressAD nativeExpressAD = isServerBidding() ? new NativeExpressAD(this.a, a(this.b), getAdnId(), this.e, getAdm()) : new NativeExpressAD(this.a, a(this.b), getAdnId(), this.e);
        int gdtMaxVideoDuration = this.b.getGdtMaxVideoDuration();
        int gdtMinVideoDuration = this.b.getGdtMinVideoDuration();
        if (gdtMinVideoDuration > 0) {
            nativeExpressAD.setMinVideoDuration(gdtMinVideoDuration);
        }
        if (gdtMaxVideoDuration > 0) {
            nativeExpressAD.setMaxVideoDuration(gdtMaxVideoDuration);
        }
        Object gdtVideoOption = this.b.getGdtVideoOption();
        nativeExpressAD.setVideoOption(gdtVideoOption instanceof VideoOption ? (VideoOption) gdtVideoOption : new VideoOption.Builder().build());
        if (this.b.getGdtDownAPPConfirmPolicy() instanceof DownAPPConfirmPolicy) {
            downAPPConfirmPolicy = (DownAPPConfirmPolicy) this.b.getGdtDownAPPConfirmPolicy();
        } else if ((this.b.getGdtDownAPPConfirmPolicy() instanceof Integer) && (intValue = ((Integer) this.b.getGdtDownAPPConfirmPolicy()).intValue()) != 0) {
            if (intValue == 1) {
                downAPPConfirmPolicy = DownAPPConfirmPolicy.NOConfirm;
            }
            nativeExpressAD.loadAD(1);
        } else {
            downAPPConfirmPolicy = DownAPPConfirmPolicy.Default;
        }
        nativeExpressAD.setDownAPPConfirmPolicy(downAPPConfirmPolicy);
        nativeExpressAD.loadAD(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b() {
        /*
            r5 = this;
            boolean r0 = r5.isServerBidding()
            if (r0 == 0) goto L18
            com.qq.e.ads.nativ.NativeUnifiedAD r0 = new com.qq.e.ads.nativ.NativeUnifiedAD
            android.content.Context r1 = r5.a
            java.lang.String r2 = r5.getAdnId()
            com.qq.e.ads.nativ.NativeADUnifiedListener r3 = r5.f
            java.lang.String r4 = r5.getAdm()
            r0.<init>(r1, r2, r3, r4)
            goto L25
        L18:
            com.qq.e.ads.nativ.NativeUnifiedAD r0 = new com.qq.e.ads.nativ.NativeUnifiedAD
            android.content.Context r1 = r5.a
            java.lang.String r2 = r5.getAdnId()
            com.qq.e.ads.nativ.NativeADUnifiedListener r3 = r5.f
            r0.<init>(r1, r2, r3)
        L25:
            com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet r1 = r5.b
            int r1 = r1.getGdtMaxVideoDuration()
            com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet r2 = r5.b
            int r2 = r2.getGdtMinVideoDuration()
            if (r2 <= 0) goto L36
            r0.setMinVideoDuration(r2)
        L36:
            if (r1 <= 0) goto L3b
            r0.setMaxVideoDuration(r1)
        L3b:
            com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet r1 = r5.b
            java.lang.Object r1 = r1.getGdtDownAPPConfirmPolicy()
            boolean r1 = r1 instanceof com.qq.e.ads.cfg.DownAPPConfirmPolicy
            r2 = 1
            if (r1 == 0) goto L52
            com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet r1 = r5.b
            java.lang.Object r1 = r1.getGdtDownAPPConfirmPolicy()
            com.qq.e.ads.cfg.DownAPPConfirmPolicy r1 = (com.qq.e.ads.cfg.DownAPPConfirmPolicy) r1
        L4e:
            r0.setDownAPPConfirmPolicy(r1)
            goto L73
        L52:
            com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet r1 = r5.b
            java.lang.Object r1 = r1.getGdtDownAPPConfirmPolicy()
            boolean r1 = r1 instanceof java.lang.Integer
            if (r1 == 0) goto L70
            com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet r1 = r5.b
            java.lang.Object r1 = r1.getGdtDownAPPConfirmPolicy()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != 0) goto L6b
            goto L70
        L6b:
            if (r1 != r2) goto L73
            com.qq.e.ads.cfg.DownAPPConfirmPolicy r1 = com.qq.e.ads.cfg.DownAPPConfirmPolicy.NOConfirm
            goto L4e
        L70:
            com.qq.e.ads.cfg.DownAPPConfirmPolicy r1 = com.qq.e.ads.cfg.DownAPPConfirmPolicy.Default
            goto L4e
        L73:
            com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet r1 = r5.b
            java.lang.Object r1 = r1.getGdtNativeLogoParams()
            boolean r3 = r1 instanceof android.widget.FrameLayout.LayoutParams
            if (r3 == 0) goto L81
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            r5.d = r1
        L81:
            r0.loadData(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.msdk.adapter.gdt.GdtBannerLoader.b():void");
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl
    public void realLoader(Context context, MediationAdSlotValueSet mediationAdSlotValueSet) {
        String str;
        if (context == null || mediationAdSlotValueSet == null) {
            str = "context is null or adSlotValueSet is null";
        } else {
            this.a = context;
            this.b = mediationAdSlotValueSet;
            this.c = getGMBridge();
            if (mediationAdSlotValueSet.getAdSubType() != 4) {
                new GdtBannerAd(mediationAdSlotValueSet, this.c).a();
                return;
            }
            int originType = mediationAdSlotValueSet.getOriginType();
            if (originType == 1) {
                a();
                return;
            } else if (originType == 2) {
                b();
                return;
            } else {
                str = "originType is mismatch";
            }
        }
        notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, str);
    }
}

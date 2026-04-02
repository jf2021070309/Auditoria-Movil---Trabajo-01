package com.bytedance.msdk.adapter.pangle;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.JProtect;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.adapter.util.TTLogUtil;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CSJAdError;
import com.bytedance.sdk.openadsdk.CSJSplashAd;
import com.bytedance.sdk.openadsdk.ISplashCardListener;
import com.bytedance.sdk.openadsdk.ISplashClickEyeListener;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTSplashAd;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;
import com.ss.android.socialbase.downloader.constants.DownloadErrorCode;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class PangleSplashLoader extends MediationAdLoaderImpl {
    public static final String VERSION_00 = "0.0";
    public static final String VERSION_4712 = "4.7.1.2";
    private Context a;
    private int b = 3000;
    private PangleSplashAd c;
    private MediationAdSlotValueSet d;
    private Bridge e;

    /* loaded from: classes.dex */
    class PangleSplashAd extends MediationBaseAdBridge {
        private TTSplashAd a;
        private CSJSplashAd b;
        boolean c;

        PangleSplashAd() {
            super(PangleSplashLoader.this.d, PangleSplashLoader.this.e);
        }

        private void a(TTAdNative tTAdNative, AdSlot adSlot) {
            tTAdNative.loadSplashAd(adSlot, new TTAdNative.CSJSplashAdListener() { // from class: com.bytedance.msdk.adapter.pangle.PangleSplashLoader.PangleSplashAd.1
                /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block
                    	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:817)
                    	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
                    	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
                    	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:406)
                    	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:204)
                    	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:138)
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
                    	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:406)
                    	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:204)
                    	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:138)
                    	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
                    	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
                    	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
                    	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
                    	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
                    */
                @Override // com.bytedance.sdk.openadsdk.TTAdNative.CSJSplashAdListener
                @com.bytedance.JProtect
                public void onSplashLoadFail(com.bytedance.sdk.openadsdk.CSJAdError r3) {
                    /*
                        r2 = this;
                        java.lang.String r0 = "TTMediationSDK"
                        java.lang.String r1 = "new api onSplashLoadFail"
                        com.bytedance.msdk.adapter.util.Logger.e(r0, r1)
                        if (r3 == 0) goto L30
                        com.bytedance.msdk.adapter.pangle.PangleSplashLoader$PangleSplashAd r0 = com.bytedance.msdk.adapter.pangle.PangleSplashLoader.PangleSplashAd.this
                        com.bytedance.msdk.adapter.pangle.PangleSplashLoader r0 = com.bytedance.msdk.adapter.pangle.PangleSplashLoader.this
                        int r1 = r3.getCode()
                        java.lang.String r3 = r3.getMsg()
                        r0.notifyAdFailed(r1, r3)
                        r3 = 55
                        r0 = 0
                    L1b:
                        r1 = 72
                    L1d:
                        switch(r1) {
                            case 72: goto L2b;
                            case 73: goto L3c;
                            case 74: goto L21;
                            default: goto L20;
                        }
                    L20:
                        goto L1b
                    L21:
                        switch(r0) {
                            case 52: goto L1b;
                            case 53: goto L25;
                            case 54: goto L2b;
                            default: goto L24;
                        }
                    L24:
                        goto L3c
                    L25:
                        switch(r3) {
                            case 29: goto L1b;
                            case 30: goto L1b;
                            case 31: goto L21;
                            default: goto L28;
                        }
                    L28:
                        r3 = 30
                        goto L25
                    L2b:
                        r1 = 73
                        r0 = 16
                        goto L1d
                    L30:
                        com.bytedance.msdk.adapter.pangle.PangleSplashLoader$PangleSplashAd r3 = com.bytedance.msdk.adapter.pangle.PangleSplashLoader.PangleSplashAd.this
                        com.bytedance.msdk.adapter.pangle.PangleSplashLoader r3 = com.bytedance.msdk.adapter.pangle.PangleSplashLoader.this
                        r0 = 80001(0x13881, float:1.12105E-40)
                        java.lang.String r1 = "csjAdError is null"
                        r3.notifyAdFailed(r0, r1)
                    L3c:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.msdk.adapter.pangle.PangleSplashLoader.PangleSplashAd.AnonymousClass1.onSplashLoadFail(com.bytedance.sdk.openadsdk.CSJAdError):void");
                }

                @Override // com.bytedance.sdk.openadsdk.TTAdNative.CSJSplashAdListener
                @JProtect
                public void onSplashLoadSuccess() {
                    while (true) {
                        char c = '^';
                        char c2 = 'K';
                        while (true) {
                            switch (c) {
                                case '\\':
                                    switch (c2) {
                                        case 21:
                                            Logger.e("TTMediationSDK", "new api onSplashLoadSuccess");
                                            c = ']';
                                            c2 = ']';
                                        case 22:
                                        case 23:
                                            return;
                                    }
                                    break;
                                case ']':
                                    break;
                                case '^':
                                    if (c2 <= 4) {
                                        c = ']';
                                        c2 = ']';
                                    }
                                    Logger.e("TTMediationSDK", "new api onSplashLoadSuccess");
                                    c = ']';
                                    c2 = ']';
                                default:
                                    c = ']';
                                    c2 = ']';
                            }
                            while (true) {
                                switch (c2) {
                                    case '[':
                                        break;
                                    case '\\':
                                        break;
                                    case ']':
                                        return;
                                    default:
                                        c2 = '[';
                                }
                            }
                            Logger.e("TTMediationSDK", "new api onSplashLoadSuccess");
                            c = ']';
                            c2 = ']';
                        }
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.TTAdNative.CSJSplashAdListener
                @JProtect
                public void onSplashRenderFail(CSJSplashAd cSJSplashAd, CSJAdError cSJAdError) {
                    Logger.e("TTMediationSDK", "new api onSplashRenderFail");
                    PangleSplashLoader pangleSplashLoader = PangleSplashLoader.this;
                    if (cSJAdError != null) {
                        pangleSplashLoader.notifyAdFailed(cSJAdError.getCode(), cSJAdError.getMsg());
                    } else {
                        pangleSplashLoader.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "csjAdError is null");
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.TTAdNative.CSJSplashAdListener
                @JProtect
                public void onSplashRenderSuccess(CSJSplashAd cSJSplashAd) {
                    Map<String, Object> mediaExtraInfo;
                    Logger.e("TTMediationSDK", "new api onSplashRenderSuccess");
                    if (cSJSplashAd == null) {
                        PangleSplashLoader.this.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "渲染成功但广告是空");
                        return;
                    }
                    PangleSplashAd.this.b = cSJSplashAd;
                    MediationValueSetBuilder create = MediationValueSetBuilder.create();
                    create.add(8033, true);
                    create.add(8059, PangleSplashAd.this.b.getInteractionType());
                    PangleSplashAd.this.mGMAd.call(8140, create.build(), Void.class);
                    if (PangleSplashLoader.this.isClientBidding() && (mediaExtraInfo = PangleSplashAd.this.b.getMediaExtraInfo()) != null) {
                        double value = PangleAdapterUtils.getValue(mediaExtraInfo.get(InAppPurchaseMetaData.KEY_PRICE));
                        Logger.d("TTMediationSDK_ECMP", TTLogUtil.getTagThirdLevelById(PangleSplashLoader.this.getRitId(), PangleSplashLoader.this.getAdnId()) + "pangle Splash 返回的 cpm价格：" + value);
                        PangleSplashAd pangleSplashAd = PangleSplashAd.this;
                        if (value <= PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
                            value = 0.0d;
                        }
                        pangleSplashAd.setCpm(value);
                    }
                    PangleSplashAd.this.b.setSplashAdListener(new CSJSplashAd.SplashAdListener() { // from class: com.bytedance.msdk.adapter.pangle.PangleSplashLoader.PangleSplashAd.1.1
                        @Override // com.bytedance.sdk.openadsdk.CSJSplashAd.SplashAdListener
                        public void onSplashAdClick(CSJSplashAd cSJSplashAd2) {
                            Logger.e("TTMediationSDK", "new api onSplashAdClick");
                            Bridge bridge = PangleSplashAd.this.mGMAd;
                            if (bridge != null) {
                                bridge.call(1009, null, Void.class);
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.CSJSplashAd.SplashAdListener
                        public void onSplashAdClose(CSJSplashAd cSJSplashAd2, int i) {
                            Bridge bridge;
                            int i2;
                            Logger.e("TTMediationSDK", "new api onSplashAdClose closeType = " + i);
                            if (i == 1 || i == 3) {
                                bridge = PangleSplashAd.this.mGMAd;
                                if (bridge == null) {
                                    return;
                                }
                                i2 = 1019;
                            } else {
                                bridge = PangleSplashAd.this.mGMAd;
                                if (bridge == null) {
                                    return;
                                }
                                i2 = 1011;
                            }
                            bridge.call(i2, null, Void.class);
                        }

                        @Override // com.bytedance.sdk.openadsdk.CSJSplashAd.SplashAdListener
                        public void onSplashAdShow(CSJSplashAd cSJSplashAd2) {
                            Logger.e("TTMediationSDK", "new api onSplashAdShow");
                            Bridge bridge = PangleSplashAd.this.mGMAd;
                            if (bridge != null) {
                                bridge.call(1008, null, Void.class);
                            }
                        }
                    });
                    PangleSplashAd.this.b.setSplashCardListener(new CSJSplashAd.SplashCardListener() { // from class: com.bytedance.msdk.adapter.pangle.PangleSplashLoader.PangleSplashAd.1.2
                        @Override // com.bytedance.sdk.openadsdk.CSJSplashAd.SplashCardListener
                        public void onSplashCardClick() {
                            Logger.e("TTMediationSDK", "new api onSplashCardClick");
                            try {
                                if (PangleSplashAd.this.mGMAd != null) {
                                    PangleSplashAd.this.mGMAd.call(6156, null, Void.class);
                                }
                            } catch (Throwable th) {
                                th.printStackTrace();
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.CSJSplashAd.SplashCardListener
                        public void onSplashCardClose() {
                            Logger.e("TTMediationSDK", "new api onSplashCardClose");
                            Bridge bridge = PangleSplashAd.this.mGMAd;
                            if (bridge != null) {
                                bridge.call(DownloadErrorCode.ERROR_SEGMENT_APPLY, null, Void.class);
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.CSJSplashAd.SplashCardListener
                        public void onSplashCardReadyToShow(CSJSplashAd cSJSplashAd2) {
                            Logger.e("TTMediationSDK", "new api onSplashCardReadyToShow");
                            Logger.e("TTMediationSDK", "new api onSplashCardReadyToShow csjSplashAd.getSplashCardView()" + cSJSplashAd2.getSplashCardView());
                            if (PangleSplashAd.this.mGMAd != null) {
                                MediationValueSetBuilder create2 = MediationValueSetBuilder.create();
                                create2.add(8428, true);
                                PangleSplashAd.this.mGMAd.call(DownloadErrorCode.ERROR_PROBE_FIRST_BUFFER, create2.build(), Void.class);
                            }
                            Bridge bridge = PangleSplashAd.this.mGMAd;
                            if (bridge != null) {
                                bridge.call(DownloadErrorCode.ERROR_DOWNLOAD_COMPLETE_HANDLER, null, Void.class);
                            }
                        }
                    });
                    PangleSplashAd.this.b.setSplashClickEyeListener(new CSJSplashAd.SplashClickEyeListener() { // from class: com.bytedance.msdk.adapter.pangle.PangleSplashLoader.PangleSplashAd.1.3
                        @Override // com.bytedance.sdk.openadsdk.CSJSplashAd.SplashClickEyeListener
                        public void onSplashClickEyeClick() {
                            Logger.e("TTMediationSDK", "new api onSplashClickEyeClick");
                            Bridge bridge = PangleSplashAd.this.mGMAd;
                            if (bridge != null) {
                                bridge.call(6159, null, Void.class);
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.CSJSplashAd.SplashClickEyeListener
                        public void onSplashClickEyeClose() {
                            Logger.e("TTMediationSDK", "new api onSplashClickEyeClose");
                            Bridge bridge = PangleSplashAd.this.mGMAd;
                            if (bridge != null) {
                                bridge.call(DownloadErrorCode.ERROR_GET_AVAILABLE_SPACE, null, Void.class);
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.CSJSplashAd.SplashClickEyeListener
                        public void onSplashClickEyeReadyToShow(CSJSplashAd cSJSplashAd2) {
                            Logger.e("TTMediationSDK", "new api onSplashClickEyeReadyToShow");
                            PangleSplashAd pangleSplashAd2 = PangleSplashAd.this;
                            pangleSplashAd2.c = true;
                            Bridge bridge = pangleSplashAd2.mGMAd;
                            if (bridge != null) {
                                bridge.call(DownloadErrorCode.ERROR_RESPONSE_DATA_NOT_EQUALS, null, Void.class);
                            }
                        }
                    });
                    PangleSplashAd pangleSplashAd2 = PangleSplashAd.this;
                    PangleSplashLoader.this.notifyAdSuccess(pangleSplashAd2, pangleSplashAd2.mGMAd);
                }
            }, PangleSplashLoader.this.b);
        }

        private void b(TTAdNative tTAdNative, AdSlot adSlot) {
            tTAdNative.loadSplashAd(adSlot, new TTAdNative.SplashAdListener() { // from class: com.bytedance.msdk.adapter.pangle.PangleSplashLoader.PangleSplashAd.2
                @Override // com.bytedance.sdk.openadsdk.TTAdNative.SplashAdListener, com.bytedance.sdk.openadsdk.common.CommonListener
                @JProtect
                public void onError(int i, String str) {
                    PangleSplashLoader.this.notifyAdFailed(i, str);
                }

                @Override // com.bytedance.sdk.openadsdk.TTAdNative.SplashAdListener
                @JProtect
                public void onSplashAdLoad(TTSplashAd tTSplashAd) {
                    Map<String, Object> mediaExtraInfo;
                    if (tTSplashAd == null) {
                        PangleSplashLoader.this.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "load成功但广告是空");
                        return;
                    }
                    PangleSplashAd.this.a = tTSplashAd;
                    MediationValueSetBuilder create = MediationValueSetBuilder.create();
                    create.add(8033, true);
                    create.add(8059, PangleSplashAd.this.a.getInteractionType());
                    PangleSplashAd.this.mGMAd.call(8140, create.build(), Void.class);
                    if (PangleSplashLoader.this.isClientBidding() && (mediaExtraInfo = PangleSplashAd.this.a.getMediaExtraInfo()) != null) {
                        double value = PangleAdapterUtils.getValue(mediaExtraInfo.get(InAppPurchaseMetaData.KEY_PRICE));
                        Logger.d("TTMediationSDK_ECMP", TTLogUtil.getTagThirdLevelById(PangleSplashLoader.this.getRitId(), PangleSplashLoader.this.getAdnId()) + "pangle Splash 返回的 cpm价格：" + value);
                        PangleSplashAd pangleSplashAd = PangleSplashAd.this;
                        if (value <= PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
                            value = 0.0d;
                        }
                        pangleSplashAd.setCpm(value);
                    }
                    PangleSplashAd.this.a.setSplashInteractionListener(new TTSplashAd.AdInteractionListener() { // from class: com.bytedance.msdk.adapter.pangle.PangleSplashLoader.PangleSplashAd.2.1
                        @Override // com.bytedance.sdk.openadsdk.TTSplashAd.AdInteractionListener
                        public void onAdClicked(View view, int i) {
                            Bridge bridge = PangleSplashAd.this.mGMAd;
                            if (bridge != null) {
                                bridge.call(1009, null, Void.class);
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.TTSplashAd.AdInteractionListener
                        public void onAdShow(View view, int i) {
                            Bridge bridge = PangleSplashAd.this.mGMAd;
                            if (bridge != null) {
                                bridge.call(1008, null, Void.class);
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.TTSplashAd.AdInteractionListener
                        public void onAdSkip() {
                            Logger.e("TTMediationSDK", "穿山甲_splash_onAdSkip");
                            Bridge bridge = PangleSplashAd.this.mGMAd;
                            if (bridge != null) {
                                bridge.call(1019, null, Void.class);
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.TTSplashAd.AdInteractionListener
                        public void onAdTimeOver() {
                            Logger.e("TTMediationSDK", "穿山甲_splash_onAdTimeOver");
                            Bridge bridge = PangleSplashAd.this.mGMAd;
                            if (bridge != null) {
                                bridge.call(1011, null, Void.class);
                            }
                        }
                    });
                    PangleSplashAd.this.a.setSplashClickEyeListener(new ISplashClickEyeListener() { // from class: com.bytedance.msdk.adapter.pangle.PangleSplashLoader.PangleSplashAd.2.2
                        @Override // com.bytedance.sdk.openadsdk.ISplashClickEyeListener
                        public boolean isSupportSplashClickEye(boolean z) {
                            Logger.e("TTMediationSDK", "穿山甲_splash_isSupportSplashClickEye:" + z);
                            PangleSplashAd.this.c = z;
                            return false;
                        }

                        @Override // com.bytedance.sdk.openadsdk.ISplashClickEyeListener
                        public void onSplashClickEyeAnimationFinish() {
                            Logger.e("TTMediationSDK", "穿山甲_splash_onSplashClickEyeAnimationFinish");
                            Bridge bridge = PangleSplashAd.this.mGMAd;
                            if (bridge != null) {
                                bridge.call(DownloadErrorCode.ERROR_GET_AVAILABLE_SPACE, null, Void.class);
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.ISplashClickEyeListener
                        public void onSplashClickEyeAnimationStart() {
                            Bridge bridge;
                            Logger.e("TTMediationSDK", "穿山甲_splash_onSplashClickEyeAnimationStart");
                            PangleSplashAd pangleSplashAd2 = PangleSplashAd.this;
                            if (!pangleSplashAd2.c || (bridge = pangleSplashAd2.mGMAd) == null) {
                                return;
                            }
                            bridge.call(DownloadErrorCode.ERROR_RESPONSE_DATA_NOT_EQUALS, null, Void.class);
                        }
                    });
                    PangleSplashAd.this.a.setSplashCardListener(new ISplashCardListener() { // from class: com.bytedance.msdk.adapter.pangle.PangleSplashLoader.PangleSplashAd.2.3
                        @Override // com.bytedance.sdk.openadsdk.ISplashCardListener
                        public Activity getActivity() {
                            Logger.e("TTMediationSDK", "穿山甲_splash_getActivity");
                            Bridge bridge = PangleSplashAd.this.mGMAd;
                            if (bridge != null) {
                                return (Activity) bridge.call(DownloadErrorCode.ERROR_BAD_URL, null, Activity.class);
                            }
                            return null;
                        }

                        @Override // com.bytedance.sdk.openadsdk.ISplashCardListener
                        public void onSplashClickEyeClose() {
                            Logger.e("TTMediationSDK", "穿山甲_splash_onSplashClickEyeClose");
                            Bridge bridge = PangleSplashAd.this.mGMAd;
                            if (bridge != null) {
                                bridge.call(DownloadErrorCode.ERROR_SEGMENT_APPLY, null, Void.class);
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.ISplashCardListener
                        public void onSplashEyeReady() {
                            Logger.e("TTMediationSDK", "穿山甲_splash_onSplashEyeReady");
                            Bridge bridge = PangleSplashAd.this.mGMAd;
                            if (bridge != null) {
                                bridge.call(DownloadErrorCode.ERROR_DOWNLOAD_COMPLETE_HANDLER, null, Void.class);
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.ISplashCardListener
                        public void setSupportSplashClickEye(boolean z) {
                            Logger.e("TTMediationSDK", "穿山甲_splash_setSupportSplashClickEye");
                            if (PangleSplashAd.this.mGMAd != null) {
                                MediationValueSetBuilder create2 = MediationValueSetBuilder.create();
                                create2.add(8428, true);
                                PangleSplashAd.this.mGMAd.call(DownloadErrorCode.ERROR_PROBE_FIRST_BUFFER, create2.build(), Void.class);
                            }
                        }
                    });
                    PangleSplashAd pangleSplashAd2 = PangleSplashAd.this;
                    PangleSplashLoader.this.notifyAdSuccess(pangleSplashAd2, pangleSplashAd2.mGMAd);
                }

                @Override // com.bytedance.sdk.openadsdk.TTAdNative.SplashAdListener
                @JProtect
                public void onTimeout() {
                    PangleSplashLoader.this.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "load splashad time out");
                }
            }, PangleSplashLoader.this.b);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0079 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:11:0x007c A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0075 A[LOOP:0: B:6:0x0075->B:12:0x0075, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:6:0x0075 -> B:8:0x0079). Please submit an issue!!! */
        @com.bytedance.JProtect
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void a() {
            /*
                r5 = this;
                com.bytedance.sdk.openadsdk.TTAdManager r0 = com.bytedance.sdk.openadsdk.TTAdSdk.getAdManager()
                com.bytedance.msdk.adapter.pangle.PangleSplashLoader r1 = com.bytedance.msdk.adapter.pangle.PangleSplashLoader.this
                android.content.Context r1 = com.bytedance.msdk.adapter.pangle.PangleSplashLoader.c(r1)
                com.bytedance.sdk.openadsdk.TTAdNative r0 = r0.createAdNative(r1)
                com.bytedance.msdk.adapter.pangle.PangleSplashLoader r1 = com.bytedance.msdk.adapter.pangle.PangleSplashLoader.this
                com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet r1 = com.bytedance.msdk.adapter.pangle.PangleSplashLoader.a(r1)
                com.bytedance.msdk.adapter.pangle.PangleSplashLoader r2 = com.bytedance.msdk.adapter.pangle.PangleSplashLoader.this
                java.lang.String r2 = r2.getAdnId()
                com.bytedance.msdk.adapter.pangle.PangleSplashLoader r3 = com.bytedance.msdk.adapter.pangle.PangleSplashLoader.this
                java.lang.String r3 = r3.getAdm()
                r4 = 0
                com.bytedance.sdk.openadsdk.AdSlot$Builder r1 = com.bytedance.msdk.adapter.pangle.PangleAdapterUtils.buildPangleAdSlot(r1, r2, r3, r4)
                com.bytedance.msdk.adapter.pangle.PangleSplashLoader r2 = com.bytedance.msdk.adapter.pangle.PangleSplashLoader.this
                com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet r2 = com.bytedance.msdk.adapter.pangle.PangleSplashLoader.a(r2)
                int r2 = r2.getWidth()
                com.bytedance.msdk.adapter.pangle.PangleSplashLoader r3 = com.bytedance.msdk.adapter.pangle.PangleSplashLoader.this
                com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet r3 = com.bytedance.msdk.adapter.pangle.PangleSplashLoader.a(r3)
                int r3 = r3.getHeight()
                com.bytedance.sdk.openadsdk.AdSlot$Builder r2 = r1.setImageAcceptedSize(r2, r3)
                com.bytedance.msdk.adapter.pangle.PangleSplashLoader r3 = com.bytedance.msdk.adapter.pangle.PangleSplashLoader.this
                com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet r3 = com.bytedance.msdk.adapter.pangle.PangleSplashLoader.a(r3)
                float r3 = r3.getExpressWidth()
                com.bytedance.msdk.adapter.pangle.PangleSplashLoader r4 = com.bytedance.msdk.adapter.pangle.PangleSplashLoader.this
                com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet r4 = com.bytedance.msdk.adapter.pangle.PangleSplashLoader.a(r4)
                float r4 = r4.getExpressHeight()
                r2.setExpressViewAcceptedSize(r3, r4)
                com.bytedance.sdk.openadsdk.AdSlot r1 = r1.build()
                com.bytedance.msdk.adapter.pangle.PangleSplashLoader r2 = com.bytedance.msdk.adapter.pangle.PangleSplashLoader.this
                boolean r2 = com.bytedance.msdk.adapter.pangle.PangleSplashLoader.d(r2)
                java.lang.String r3 = "TTMediationSDK"
                if (r2 == 0) goto L6b
                java.lang.String r2 = "use old api load splash ad"
                com.bytedance.msdk.adapter.util.Logger.e(r3, r2)
                r5.b(r0, r1)
                goto L79
            L6b:
                java.lang.String r2 = "use new api load splash ad"
                com.bytedance.msdk.adapter.util.Logger.e(r3, r2)
                r5.a(r0, r1)
                r0 = 64
            L75:
                switch(r0) {
                    case 64: goto L7c;
                    case 65: goto L79;
                    case 66: goto L7c;
                    default: goto L78;
                }
            L78:
                goto L75
            L79:
                r0 = 66
                goto L75
            L7c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.msdk.adapter.pangle.PangleSplashLoader.PangleSplashAd.a():void");
        }

        @Override // com.bykv.vk.openvk.api.proto.Caller
        public <T> T call(int i, ValueSet valueSet, Class<T> cls) {
            if (i == 6162) {
                Log.i("PangleSplashAdapter", "PangleSplashLoader splashMinWindowAnimationFinish");
                splashMinWindowAnimationFinish();
            } else if (i == 6163) {
                Log.i("PangleSplashAdapter", "PangleSplashLoader getSplashBitMap");
            } else if (i == 6152) {
                Log.i("PangleSplashAdapter", "PangleSplashLoader showSplashAd");
                ViewGroup viewGroup = (ViewGroup) valueSet.objectValue(20060, ViewGroup.class);
                if (viewGroup != null) {
                    showSplashAd(viewGroup);
                }
            } else if (i == 6154) {
                Log.i("PangleSplashAdapter", "PangleSplashLoader showSplashCardView");
                ViewGroup viewGroup2 = (ViewGroup) valueSet.objectValue(20060, ViewGroup.class);
                Activity activity = (Activity) valueSet.objectValue(20033, Activity.class);
                if (viewGroup2 != null && activity != null) {
                    showSplashCardView(viewGroup2, activity);
                }
            } else if (i == 6153) {
                Log.i("PangleSplashAdapter", "PangleSplashLoader showSplashClickEyeView");
                ViewGroup viewGroup3 = (ViewGroup) valueSet.objectValue(20060, ViewGroup.class);
                if (viewGroup3 != null) {
                    showSplashClickEyeView(viewGroup3);
                }
            } else if (i != 6161) {
                if (i == 8109) {
                    onDestroy();
                } else if (i == 8120) {
                    return (T) Boolean.valueOf(hasDestroyed());
                } else {
                    if (i == 8121) {
                        return (T) isReadyStatus();
                    }
                    if (i == 8147) {
                        return (T) getReqId();
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
            }
            return (T) MediationValueUtil.checkClassType(cls);
        }

        public long getAdId() {
            Map<String, Object> mediaExtraInfo;
            if (PangleSplashLoader.this.b()) {
                TTSplashAd tTSplashAd = this.a;
                if (tTSplashAd == null) {
                    return 0L;
                }
                mediaExtraInfo = tTSplashAd.getMediaExtraInfo();
            } else {
                CSJSplashAd cSJSplashAd = this.b;
                if (cSJSplashAd == null) {
                    return 0L;
                }
                mediaExtraInfo = cSJSplashAd.getMediaExtraInfo();
            }
            return PangleAdapterUtils.getAdId(mediaExtraInfo);
        }

        public long getCreativeId() {
            Map<String, Object> mediaExtraInfo;
            if (PangleSplashLoader.this.b()) {
                TTSplashAd tTSplashAd = this.a;
                if (tTSplashAd == null) {
                    return 0L;
                }
                mediaExtraInfo = tTSplashAd.getMediaExtraInfo();
            } else {
                CSJSplashAd cSJSplashAd = this.b;
                if (cSJSplashAd == null) {
                    return 0L;
                }
                mediaExtraInfo = cSJSplashAd.getMediaExtraInfo();
            }
            return PangleAdapterUtils.getCreativeId(mediaExtraInfo);
        }

        public Map<String, Object> getMediaExtraInfo() {
            Map<String, Object> mediaExtraInfo;
            HashMap hashMap;
            if (PangleSplashLoader.this.b()) {
                TTSplashAd tTSplashAd = this.a;
                if (tTSplashAd == null || (mediaExtraInfo = tTSplashAd.getMediaExtraInfo()) == null) {
                    return null;
                }
                hashMap = new HashMap();
            } else {
                CSJSplashAd cSJSplashAd = this.b;
                if (cSJSplashAd == null || (mediaExtraInfo = cSJSplashAd.getMediaExtraInfo()) == null) {
                    return null;
                }
                hashMap = new HashMap();
            }
            hashMap.put(PangleAdapterUtils.MEDIA_EXTRA_COUPON, mediaExtraInfo.get(PangleAdapterUtils.MEDIA_EXTRA_COUPON));
            hashMap.put(PangleAdapterUtils.MEDIA_EXTRA_LIVE_ROOM, mediaExtraInfo.get(PangleAdapterUtils.MEDIA_EXTRA_LIVE_ROOM));
            hashMap.put(PangleAdapterUtils.MEDIA_EXTRA_PRODUCT, mediaExtraInfo.get(PangleAdapterUtils.MEDIA_EXTRA_PRODUCT));
            return hashMap;
        }

        public int[] getMinWindowSize() {
            if (PangleSplashLoader.this.b()) {
                TTSplashAd tTSplashAd = this.a;
                if (tTSplashAd != null) {
                    return tTSplashAd.getSplashClickEyeSizeToDp();
                }
                return null;
            }
            CSJSplashAd cSJSplashAd = this.b;
            if (cSJSplashAd != null) {
                return cSJSplashAd.getSplashClickEyeSizeToDp();
            }
            return null;
        }

        @JProtect
        public String getReqId() {
            Map<String, Object> mediaExtraInfo;
            if (PangleSplashLoader.this.b()) {
                TTSplashAd tTSplashAd = this.a;
                if (tTSplashAd == null) {
                    return "";
                }
                mediaExtraInfo = tTSplashAd.getMediaExtraInfo();
            } else {
                CSJSplashAd cSJSplashAd = this.b;
                if (cSJSplashAd == null) {
                    return "";
                }
                mediaExtraInfo = cSJSplashAd.getMediaExtraInfo();
            }
            return PangleAdapterUtils.getReqId(mediaExtraInfo);
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public boolean hasDestroyed() {
            return PangleSplashLoader.this.b() ? this.a == null : this.b == null;
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public void onDestroy() {
            if (PangleSplashLoader.this.b()) {
                TTSplashAd tTSplashAd = this.a;
                if (tTSplashAd != null) {
                    tTSplashAd.setSplashInteractionListener(null);
                    this.a.setDownloadListener(null);
                    this.a.renderExpressAd(null);
                    this.a = null;
                    return;
                }
                return;
            }
            CSJSplashAd cSJSplashAd = this.b;
            if (cSJSplashAd != null) {
                cSJSplashAd.setSplashAdListener(null);
                this.b.setDownloadListener(null);
                this.b.setSplashCardListener(null);
                this.b.setSplashClickEyeListener(null);
                this.b = null;
            }
        }

        @JProtect
        public void showSplashAd(ViewGroup viewGroup) {
            View splashView;
            if (!PangleSplashLoader.this.b()) {
                CSJSplashAd cSJSplashAd = this.b;
                if (cSJSplashAd == null || viewGroup == null) {
                    return;
                }
                cSJSplashAd.showSplashView(viewGroup);
                return;
            }
            TTSplashAd tTSplashAd = this.a;
            if (tTSplashAd == null || viewGroup == null || (splashView = tTSplashAd.getSplashView()) == null) {
                return;
            }
            ViewParent parent = splashView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(splashView);
            }
            viewGroup.removeAllViews();
            viewGroup.addView(splashView);
            char c = 'R';
            while (true) {
                switch (c) {
                    case 'R':
                    default:
                        c = 'T';
                    case 'S':
                    case 'T':
                        return;
                }
            }
        }

        public void showSplashCardView(ViewGroup viewGroup, Activity activity) {
            CSJSplashAd cSJSplashAd = this.b;
            if (cSJSplashAd != null) {
                cSJSplashAd.showSplashCardView(viewGroup, activity);
            }
        }

        public void showSplashClickEyeView(ViewGroup viewGroup) {
            CSJSplashAd cSJSplashAd = this.b;
            if (cSJSplashAd != null) {
                cSJSplashAd.showSplashClickEyeView(viewGroup);
            }
        }

        public void splashMinWindowAnimationFinish() {
            TTSplashAd tTSplashAd = this.a;
            if (tTSplashAd != null) {
                tTSplashAd.splashClickEyeAnimationFinish();
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

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b() {
        return !"0.0".equals(a()) && VERSION_4712.compareTo(a()) > 0;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl
    @JProtect
    public void realLoader(Context context, MediationAdSlotValueSet mediationAdSlotValueSet) {
        if (context == null || mediationAdSlotValueSet == null) {
            notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "context is null or adSlotValueSet is null");
            return;
        }
        this.a = context;
        this.d = mediationAdSlotValueSet;
        this.e = getGMBridge();
        this.b = mediationAdSlotValueSet.getAdLoadTimeOut();
        PangleSplashAd pangleSplashAd = new PangleSplashAd();
        this.c = pangleSplashAd;
        pangleSplashAd.a();
    }
}

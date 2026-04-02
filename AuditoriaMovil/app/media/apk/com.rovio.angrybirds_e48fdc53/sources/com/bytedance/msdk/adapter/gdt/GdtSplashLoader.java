package com.bytedance.msdk.adapter.gdt;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.JProtect;
import com.bytedance.msdk.adapter.gdt.SplashDismissController;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;
import com.facebook.appevents.AppEventsConstants;
import com.qq.e.ads.splash.SplashAD;
import com.qq.e.ads.splash.SplashADZoomOutListener;
import com.qq.e.comm.managers.setting.GlobalSetting;
import com.qq.e.comm.util.AdError;
import com.ss.android.socialbase.downloader.constants.DownloadErrorCode;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class GdtSplashLoader extends MediationAdLoaderImpl {
    private Context a;
    private GDTSplashAd c;
    private SplashDismissController e;
    private boolean f;
    private int b = 3000;
    boolean d = false;
    private int g = 2;

    /* loaded from: classes.dex */
    class GDTSplashAd extends MediationBaseAdBridge {
        private SplashAD a;
        private RelativeLayout b;
        private FrameLayout c;
        SplashADZoomOutListener d;

        GDTSplashAd(MediationAdSlotValueSet mediationAdSlotValueSet, Bridge bridge) {
            super(mediationAdSlotValueSet, bridge);
            this.d = new SplashADZoomOutListener() { // from class: com.bytedance.msdk.adapter.gdt.GdtSplashLoader.GDTSplashAd.1
                public long millisUntilFinished;

                @Override // com.qq.e.ads.splash.SplashADZoomOutListener
                public boolean isSupportZoomOut() {
                    Log.i("TTMediationSDK", "GdtSplashLoader isSupportZoomOut");
                    return true;
                }

                @Override // com.qq.e.ads.splash.SplashADListener
                @JProtect
                public void onADClicked() {
                    Log.i("TTMediationSDK", "GdtSplashLoader onADClicked");
                    GDTSplashAd gDTSplashAd = GDTSplashAd.this;
                    if (gDTSplashAd.mGMAd != null) {
                        if (GdtSplashLoader.this.e != null) {
                            GdtSplashLoader.this.e.setClick(true);
                            GdtSplashLoader.this.e.setCallBack(new SplashDismissController.CallBack() { // from class: com.bytedance.msdk.adapter.gdt.GdtSplashLoader.GDTSplashAd.1.1
                                @Override // com.bytedance.msdk.adapter.gdt.SplashDismissController.CallBack
                                public void onResume() {
                                    if (GdtSplashLoader.this.e == null || !GdtSplashLoader.this.e.jumpToAdPage() || GdtSplashLoader.this.e.isCallDismiss()) {
                                        return;
                                    }
                                    GDTSplashAd.this.mGMAd.call(1011, null, Void.class);
                                }
                            });
                        }
                        GDTSplashAd.this.mGMAd.call(1009, null, Void.class);
                        while (true) {
                            for (boolean z = true; !z; z = true) {
                                if (!z) {
                                    break;
                                }
                            }
                            return;
                        }
                    }
                }

                @Override // com.qq.e.ads.splash.SplashADListener
                public void onADDismissed() {
                    Log.i("TTMediationSDK", "GdtSplashLoader onADDismissed");
                    GDTSplashAd gDTSplashAd = GDTSplashAd.this;
                    if (gDTSplashAd.mGMAd != null) {
                        if (GdtSplashLoader.this.e == null || !GdtSplashLoader.this.e.jumpToAdPage()) {
                            if (GdtSplashLoader.this.e != null) {
                                GdtSplashLoader.this.e.setCallDismiss(true);
                            }
                            GDTSplashAd.this.mGMAd.call(1011, null, Void.class);
                        }
                    }
                }

                @Override // com.qq.e.ads.splash.SplashADListener
                @JProtect
                public void onADExposure() {
                    Log.i("TTMediationSDK", "GdtSplashLoader onADExposure");
                    Bridge bridge2 = GDTSplashAd.this.mGMAd;
                    if (bridge2 != null) {
                        bridge2.call(1008, null, Void.class);
                    }
                }

                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
                    */
                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Path cross not found for [B:28:0x00b7, B:22:0x00ad], limit reached: 41 */
                /* JADX WARN: Removed duplicated region for block: B:22:0x00ad  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x00b7  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x00cb A[LOOP:1: B:34:0x00c3->B:37:0x00cb, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:41:0x00a7 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:42:0x00c7 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00a7 -> B:20:0x00aa). Please submit an issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b7 -> B:36:0x00c7). Please submit an issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00bd -> B:32:0x00bf). Please submit an issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00c3 -> B:36:0x00c7). Please submit an issue!!! */
                @Override // com.qq.e.ads.splash.SplashADListener
                @com.bytedance.JProtect
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void onADLoaded(long r7) {
                    /*
                        r6 = this;
                        java.lang.String r0 = "TTMediationSDK"
                        java.lang.String r1 = "GdtSplashLoader onADLoaded"
                        android.util.Log.i(r0, r1)
                        long r1 = android.os.SystemClock.elapsedRealtime()
                        long r7 = r7 - r1
                        com.bytedance.msdk.adapter.gdt.GdtSplashLoader$GDTSplashAd r1 = com.bytedance.msdk.adapter.gdt.GdtSplashLoader.GDTSplashAd.this
                        com.qq.e.ads.splash.SplashAD r1 = com.bytedance.msdk.adapter.gdt.GdtSplashLoader.GDTSplashAd.a(r1)
                        r2 = 7
                        r3 = 5
                        if (r1 == 0) goto L9b
                        r4 = 1000(0x3e8, double:4.94E-321)
                        int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                        if (r7 <= 0) goto L9b
                        com.bytedance.msdk.adapter.gdt.GdtSplashLoader$GDTSplashAd r7 = com.bytedance.msdk.adapter.gdt.GdtSplashLoader.GDTSplashAd.this
                        com.bytedance.msdk.adapter.gdt.GdtSplashLoader r7 = com.bytedance.msdk.adapter.gdt.GdtSplashLoader.this
                        boolean r7 = r7.isClientBidding()
                        if (r7 == 0) goto L5c
                        com.bytedance.msdk.adapter.gdt.GdtSplashLoader$GDTSplashAd r7 = com.bytedance.msdk.adapter.gdt.GdtSplashLoader.GDTSplashAd.this
                        com.qq.e.ads.splash.SplashAD r8 = com.bytedance.msdk.adapter.gdt.GdtSplashLoader.GDTSplashAd.a(r7)
                        int r8 = r8.getECPM()
                        r1 = -1
                        if (r8 == r1) goto L3f
                        com.bytedance.msdk.adapter.gdt.GdtSplashLoader$GDTSplashAd r8 = com.bytedance.msdk.adapter.gdt.GdtSplashLoader.GDTSplashAd.this
                        com.qq.e.ads.splash.SplashAD r8 = com.bytedance.msdk.adapter.gdt.GdtSplashLoader.GDTSplashAd.a(r8)
                        int r8 = r8.getECPM()
                        double r4 = (double) r8
                        goto L41
                    L3f:
                        r4 = 0
                    L41:
                        r7.setCpm(r4)
                        java.lang.StringBuilder r7 = new java.lang.StringBuilder
                        r7.<init>()
                        java.lang.String r8 = "GdtSplashLoader GDT_clientBidding splash 返回的 cpm价格："
                        r7.append(r8)
                        com.bytedance.msdk.adapter.gdt.GdtSplashLoader$GDTSplashAd r8 = com.bytedance.msdk.adapter.gdt.GdtSplashLoader.GDTSplashAd.this
                        com.qq.e.ads.splash.SplashAD r8 = com.bytedance.msdk.adapter.gdt.GdtSplashLoader.GDTSplashAd.a(r8)
                        int r8 = r8.getECPM()
                        r7.append(r8)
                        goto L8a
                    L5c:
                        com.bytedance.msdk.adapter.gdt.GdtSplashLoader$GDTSplashAd r7 = com.bytedance.msdk.adapter.gdt.GdtSplashLoader.GDTSplashAd.this
                        com.bytedance.msdk.adapter.gdt.GdtSplashLoader r7 = com.bytedance.msdk.adapter.gdt.GdtSplashLoader.this
                        boolean r7 = r7.isMultiBidding()
                        if (r7 == 0) goto L91
                        com.bytedance.msdk.adapter.gdt.GdtSplashLoader$GDTSplashAd r7 = com.bytedance.msdk.adapter.gdt.GdtSplashLoader.GDTSplashAd.this
                        com.qq.e.ads.splash.SplashAD r8 = com.bytedance.msdk.adapter.gdt.GdtSplashLoader.GDTSplashAd.a(r7)
                        java.lang.String r8 = r8.getECPMLevel()
                        r7.setLevelTag(r8)
                        java.lang.StringBuilder r7 = new java.lang.StringBuilder
                        r7.<init>()
                        java.lang.String r8 = "GdtSplashLoader GDT_多阶底价 splash 返回的 价格标签："
                        r7.append(r8)
                        com.bytedance.msdk.adapter.gdt.GdtSplashLoader$GDTSplashAd r8 = com.bytedance.msdk.adapter.gdt.GdtSplashLoader.GDTSplashAd.this
                        com.qq.e.ads.splash.SplashAD r8 = com.bytedance.msdk.adapter.gdt.GdtSplashLoader.GDTSplashAd.a(r8)
                        java.lang.String r8 = r8.getECPMLevel()
                        r7.append(r8)
                    L8a:
                        java.lang.String r7 = r7.toString()
                        android.util.Log.i(r0, r7)
                    L91:
                        com.bytedance.msdk.adapter.gdt.GdtSplashLoader$GDTSplashAd r7 = com.bytedance.msdk.adapter.gdt.GdtSplashLoader.GDTSplashAd.this
                        com.bytedance.msdk.adapter.gdt.GdtSplashLoader r8 = com.bytedance.msdk.adapter.gdt.GdtSplashLoader.this
                        com.bykv.vk.openvk.api.proto.Bridge r0 = r7.mGMAd
                        r8.notifyAdSuccess(r7, r0)
                        goto Lc7
                    L9b:
                        com.bytedance.msdk.adapter.gdt.GdtSplashLoader$GDTSplashAd r7 = com.bytedance.msdk.adapter.gdt.GdtSplashLoader.GDTSplashAd.this
                        com.bytedance.msdk.adapter.gdt.GdtSplashLoader r7 = com.bytedance.msdk.adapter.gdt.GdtSplashLoader.this
                        r8 = 80001(0x13881, float:1.12105E-40)
                        java.lang.String r0 = "暂无广告"
                        r7.notifyAdFailed(r8, r0)
                    La7:
                        r7 = 34
                        r8 = r3
                    Laa:
                        r0 = 0
                        if (r8 == r3) goto Lb7
                        r1 = 6
                        if (r8 == r1) goto Lc3
                        if (r8 == r2) goto Lb3
                        goto La7
                    Lb3:
                        switch(r7) {
                            case 40: goto Lbf;
                            case 41: goto Lb3;
                            case 42: goto Lbf;
                            default: goto Lb6;
                        }
                    Lb6:
                        goto Lbb
                    Lb7:
                        switch(r7) {
                            case 32: goto Lbb;
                            case 33: goto Lc7;
                            case 34: goto Lc2;
                            default: goto Lba;
                        }
                    Lba:
                        goto Lc3
                    Lbb:
                        r7 = 36
                        if (r0 >= r7) goto Lc2
                    Lbf:
                        r0 = 82
                        goto Lbb
                    Lc2:
                        return
                    Lc3:
                        switch(r7) {
                            case 85: goto Lc7;
                            case 86: goto Lc7;
                            case 87: goto La7;
                            default: goto Lc6;
                        }
                    Lc6:
                        goto Lcb
                    Lc7:
                        r7 = 42
                        r8 = r2
                        goto Laa
                    Lcb:
                        r7 = 86
                        goto Lc3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.msdk.adapter.gdt.GdtSplashLoader.GDTSplashAd.AnonymousClass1.onADLoaded(long):void");
                }

                @Override // com.qq.e.ads.splash.SplashADListener
                public void onADPresent() {
                }

                @Override // com.qq.e.ads.splash.SplashADListener
                public void onADTick(long j) {
                    Log.i("TTMediationSDK", "GdtSplashLoader onADTick");
                    this.millisUntilFinished = j;
                }

                @Override // com.qq.e.ads.splash.SplashADListener
                @JProtect
                public void onNoAD(AdError adError) {
                    if (adError == null) {
                        Log.i("TTMediationSDK", "GdtSplashLoader onNoAD ");
                        GdtSplashLoader.this.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "暂无广告");
                        return;
                    }
                    Log.i("TTMediationSDK", "GdtSplashLoader onNoAD err_code:" + adError.getErrorCode() + "  msg:" + adError.getErrorMsg());
                    GdtSplashLoader.this.notifyAdFailed(adError.getErrorCode(), adError.getErrorMsg());
                    for (char c = 'R'; c != 'P'; c = 'P') {
                    }
                }

                @Override // com.qq.e.ads.splash.SplashADZoomOutListener
                public void onZoomOut() {
                    Log.i("TTMediationSDK", "GdtSplashLoader onZoomOut");
                    Bridge bridge2 = GDTSplashAd.this.mGMAd;
                    if (bridge2 != null) {
                        bridge2.call(DownloadErrorCode.ERROR_RESPONSE_DATA_NOT_EQUALS, null, Void.class);
                    }
                }

                @Override // com.qq.e.ads.splash.SplashADZoomOutListener
                public void onZoomOutPlayFinish() {
                    Log.i("TTMediationSDK", "GdtSplashLoader onZoomOutPlayFinish");
                    Bridge bridge2 = GDTSplashAd.this.mGMAd;
                    if (bridge2 != null) {
                        bridge2.call(DownloadErrorCode.ERROR_GET_AVAILABLE_SPACE, null, Void.class);
                    }
                }
            };
            RelativeLayout relativeLayout = new RelativeLayout(GdtSplashLoader.this.a);
            relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            FrameLayout frameLayout = new FrameLayout(GdtSplashLoader.this.a);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            relativeLayout.addView(frameLayout);
            this.c = frameLayout;
            this.b = relativeLayout;
        }

        public void bidLoseNotify(Map<String, Object> map) {
            if (!GdtSplashLoader.this.isClientBidding() || this.a == null || map == null) {
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
            SplashAD splashAD;
            if (GdtSplashLoader.this.isClientBidding() && (splashAD = this.a) != null) {
                try {
                    splashAD.sendWinNotification((int) getCpm());
                } catch (Exception e) {
                }
            }
        }

        @Override // com.bykv.vk.openvk.api.proto.Caller
        public <T> T call(int i, ValueSet valueSet, Class<T> cls) {
            if (i == 6162) {
                Log.i("TTMediationSDK", "GdtSplashLoader splashMinWindowAnimationFinish");
                splashMinWindowAnimationFinish();
            } else if (i == 6163) {
                Log.i("TTMediationSDK", "GdtSplashLoader getSplashBitMap");
                return (T) getSplashBitMap();
            } else if (i == 8142) {
                Log.i("TTMediationSDK", "GdtSplashLoader bidWinNotify");
                Map<String, Object> map = (Map) valueSet.objectValue(8006, Map.class);
                if (map != null) {
                    bidWinNotify(map);
                }
            } else if (i == 8144) {
                Log.i("TTMediationSDK", "GdtSplashLoader bidLoseNotify");
                Map<String, Object> map2 = (Map) valueSet.objectValue(8006, Map.class);
                if (map2 != null) {
                    bidLoseNotify(map2);
                }
            } else if (i == 6152) {
                Log.i("TTMediationSDK", "GdtSplashLoader showSplashAd");
                ViewGroup viewGroup = (ViewGroup) valueSet.objectValue(20060, ViewGroup.class);
                if (viewGroup != null) {
                    showSplashAd(viewGroup);
                }
            } else if (i != 6154 && i != 6153 && i != 6161) {
                if (i == 8109) {
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

        public Bitmap getSplashBitMap() {
            SplashAD splashAD = this.a;
            if (splashAD != null) {
                splashAD.getZoomOutBitmap();
                return null;
            }
            return null;
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public boolean hasDestroyed() {
            return this.a == null;
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public MediationConstant.AdIsReadyStatus isReadyStatus() {
            SplashAD splashAD = this.a;
            return (splashAD == null || !splashAD.isValid() || GdtSplashLoader.this.hasNotifyFail()) ? MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY : MediationConstant.AdIsReadyStatus.AD_IS_READY;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
        @com.bytedance.JProtect
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void loadAd() {
            /*
                r5 = this;
                com.bytedance.msdk.adapter.gdt.GdtSplashLoader r0 = com.bytedance.msdk.adapter.gdt.GdtSplashLoader.this
                android.content.Context r0 = com.bytedance.msdk.adapter.gdt.GdtSplashLoader.a(r0)
                boolean r0 = r0 instanceof android.app.Activity
                if (r0 == 0) goto L72
                com.bytedance.msdk.adapter.gdt.GdtSplashLoader r0 = com.bytedance.msdk.adapter.gdt.GdtSplashLoader.this
                int r0 = com.bytedance.msdk.adapter.gdt.GdtSplashLoader.b(r0)
                if (r0 >= 0) goto L1a
                com.bytedance.msdk.adapter.gdt.GdtSplashLoader r0 = com.bytedance.msdk.adapter.gdt.GdtSplashLoader.this
                r1 = 3000(0xbb8, float:4.204E-42)
            L16:
                com.bytedance.msdk.adapter.gdt.GdtSplashLoader.a(r0, r1)
                goto L27
            L1a:
                com.bytedance.msdk.adapter.gdt.GdtSplashLoader r0 = com.bytedance.msdk.adapter.gdt.GdtSplashLoader.this
                int r0 = com.bytedance.msdk.adapter.gdt.GdtSplashLoader.b(r0)
                r1 = 5000(0x1388, float:7.006E-42)
                if (r0 <= r1) goto L27
                com.bytedance.msdk.adapter.gdt.GdtSplashLoader r0 = com.bytedance.msdk.adapter.gdt.GdtSplashLoader.this
                goto L16
            L27:
                com.qq.e.ads.splash.SplashAD r0 = new com.qq.e.ads.splash.SplashAD
                com.bytedance.msdk.adapter.gdt.GdtSplashLoader r1 = com.bytedance.msdk.adapter.gdt.GdtSplashLoader.this
                android.content.Context r1 = com.bytedance.msdk.adapter.gdt.GdtSplashLoader.a(r1)
                com.bytedance.msdk.adapter.gdt.GdtSplashLoader r2 = com.bytedance.msdk.adapter.gdt.GdtSplashLoader.this
                java.lang.String r2 = r2.getAdnId()
                com.qq.e.ads.splash.SplashADZoomOutListener r3 = r5.d
                com.bytedance.msdk.adapter.gdt.GdtSplashLoader r4 = com.bytedance.msdk.adapter.gdt.GdtSplashLoader.this
                int r4 = com.bytedance.msdk.adapter.gdt.GdtSplashLoader.b(r4)
                r0.<init>(r1, r2, r3, r4)
                r5.a = r0
                com.bytedance.msdk.adapter.gdt.GdtSplashLoader r0 = com.bytedance.msdk.adapter.gdt.GdtSplashLoader.this
                boolean r0 = r0.d
                if (r0 == 0) goto L4d
                com.qq.e.ads.splash.SplashAD r0 = r5.a
                r0.preLoad()
            L4d:
                com.bytedance.msdk.adapter.gdt.GdtSplashLoader r0 = com.bytedance.msdk.adapter.gdt.GdtSplashLoader.this
                int r0 = com.bytedance.msdk.adapter.gdt.GdtSplashLoader.c(r0)
                r1 = 2
                if (r0 != r1) goto L5c
                com.qq.e.ads.splash.SplashAD r0 = r5.a
                r0.fetchAdOnly()
                goto L72
            L5c:
                com.bytedance.msdk.adapter.gdt.GdtSplashLoader r0 = com.bytedance.msdk.adapter.gdt.GdtSplashLoader.this
                int r0 = com.bytedance.msdk.adapter.gdt.GdtSplashLoader.c(r0)
                if (r0 == 0) goto L6d
                com.bytedance.msdk.adapter.gdt.GdtSplashLoader r0 = com.bytedance.msdk.adapter.gdt.GdtSplashLoader.this
                int r0 = com.bytedance.msdk.adapter.gdt.GdtSplashLoader.c(r0)
                r1 = 1
                if (r0 != r1) goto L72
            L6d:
                com.qq.e.ads.splash.SplashAD r0 = r5.a
                r0.fetchFullScreenAdOnly()
            L72:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.msdk.adapter.gdt.GdtSplashLoader.GDTSplashAd.loadAd():void");
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public void onDestroy() {
            this.a = null;
            this.d = null;
            GdtSplashLoader.this.a = null;
            GdtSplashLoader.this.e = null;
        }

        public void showSplashAd(ViewGroup viewGroup) {
            if (this.a == null || viewGroup == null) {
                return;
            }
            viewGroup.removeAllViews();
            RelativeLayout relativeLayout = this.b;
            if (relativeLayout == null || this.c == null) {
                return;
            }
            ViewParent parent = relativeLayout.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.b);
            }
            viewGroup.addView(this.b, -1, -1);
            if (GdtSplashLoader.this.g == 2) {
                this.a.showAd(this.c);
            } else if (GdtSplashLoader.this.g == 0 || GdtSplashLoader.this.g == 1) {
                this.a.showFullScreenAd(this.c);
            }
        }

        public void splashMinWindowAnimationFinish() {
            SplashAD splashAD = this.a;
            if (splashAD != null) {
                splashAD.zoomOutAnimationFinish();
            }
        }

        @Override // com.bykv.vk.openvk.api.proto.Bridge
        public ValueSet values() {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl
    public void realLoader(Context context, MediationAdSlotValueSet mediationAdSlotValueSet) {
        Log.i("TTMediationSDK", "GdtSplashLoader realLoader adnId:" + getAdnId());
        this.a = context;
        boolean splashShakeButton = getSplashShakeButton();
        this.f = splashShakeButton;
        if (!splashShakeButton) {
            HashMap hashMap = new HashMap();
            hashMap.put("shakable", AppEventsConstants.EVENT_PARAM_VALUE_NO);
            GlobalSetting.setExtraUserData(hashMap);
        }
        Context context2 = this.a;
        if (context2 instanceof Activity) {
            Activity activity = (Activity) context2;
            this.e = new SplashDismissController(activity, getOriginActivity(activity));
        }
        if (mediationAdSlotValueSet != null) {
            int originType = mediationAdSlotValueSet.getOriginType();
            this.g = originType;
            if (originType != 0 && originType != 1 && originType != 2) {
                this.g = 2;
            }
        }
        this.b = getLoadTimeOut();
        this.d = isSplashPreLoad();
        GDTSplashAd gDTSplashAd = new GDTSplashAd(mediationAdSlotValueSet, getGMBridge());
        this.c = gDTSplashAd;
        gDTSplashAd.loadAd();
    }
}

package com.bytedance.msdk.adapter.gdt;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
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
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import com.bytedance.sdk.openadsdk.mediation.bridge.native_ad.MediationNativeAd;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;
import com.qq.e.ads.cfg.VideoOption;
import com.qq.e.ads.nativ.MediaView;
import com.qq.e.ads.nativ.NativeADEventListener;
import com.qq.e.ads.nativ.NativeADMediaListener;
import com.qq.e.ads.nativ.NativeUnifiedADAppMiitInfo;
import com.qq.e.ads.nativ.NativeUnifiedADData;
import com.qq.e.ads.nativ.widget.NativeAdContainer;
import com.qq.e.comm.util.AdError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class GdtDrawNative extends MediationNativeAd {
    private Context a;
    private NativeUnifiedADData b;
    private volatile boolean c;
    private NativeADMediaListener d;

    public GdtDrawNative(Context context, NativeUnifiedADData nativeUnifiedADData, MediationAdLoaderImpl mediationAdLoaderImpl, Bridge bridge) {
        super(mediationAdLoaderImpl, bridge);
        this.c = false;
        this.d = new NativeADMediaListener() { // from class: com.bytedance.msdk.adapter.gdt.GdtDrawNative.2
            @Override // com.qq.e.ads.nativ.NativeADMediaListener
            @JProtect
            public void onVideoClicked() {
                GdtDrawNative.this.notifyOnClickAd();
            }

            @Override // com.qq.e.ads.nativ.NativeADMediaListener
            @JProtect
            public void onVideoCompleted() {
                GdtDrawNative.this.notifyOnVideoComplete();
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x000f, code lost:
                continue;
             */
            /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
            @Override // com.qq.e.ads.nativ.NativeADMediaListener
            @com.bytedance.JProtect
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onVideoError(com.qq.e.comm.util.AdError r3) {
                /*
                    r2 = this;
                    if (r3 == 0) goto L26
                    com.bytedance.msdk.adapter.gdt.GdtDrawNative r0 = com.bytedance.msdk.adapter.gdt.GdtDrawNative.this
                    int r1 = r3.getErrorCode()
                    java.lang.String r3 = r3.getErrorMsg()
                    r0.notifyOnVideoError(r1, r3)
                Lf:
                    r3 = 73
                    r0 = 96
                L13:
                    switch(r3) {
                        case 72: goto L1e;
                        case 73: goto L17;
                        case 74: goto L1a;
                        default: goto L16;
                    }
                L16:
                    goto L23
                L17:
                    switch(r0) {
                        case 94: goto Lf;
                        case 95: goto L1e;
                        case 96: goto L1e;
                        default: goto L1a;
                    }
                L1a:
                    switch(r0) {
                        case 55: goto L30;
                        case 56: goto L30;
                        case 57: goto L1e;
                        default: goto L1d;
                    }
                L1d:
                    goto Lf
                L1e:
                    r3 = 74
                    r0 = 55
                    goto L13
                L23:
                    r3 = 72
                    goto L13
                L26:
                    com.bytedance.msdk.adapter.gdt.GdtDrawNative r3 = com.bytedance.msdk.adapter.gdt.GdtDrawNative.this
                    r0 = 80004(0x13884, float:1.1211E-40)
                    java.lang.String r1 = "error is null"
                    r3.notifyOnVideoError(r0, r1)
                L30:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.msdk.adapter.gdt.GdtDrawNative.AnonymousClass2.onVideoError(com.qq.e.comm.util.AdError):void");
            }

            @Override // com.qq.e.ads.nativ.NativeADMediaListener
            public void onVideoInit() {
            }

            @Override // com.qq.e.ads.nativ.NativeADMediaListener
            public void onVideoLoaded(int i) {
            }

            @Override // com.qq.e.ads.nativ.NativeADMediaListener
            public void onVideoLoading() {
            }

            @Override // com.qq.e.ads.nativ.NativeADMediaListener
            @JProtect
            public void onVideoPause() {
                GdtDrawNative.this.notifyOnVideoPause();
            }

            @Override // com.qq.e.ads.nativ.NativeADMediaListener
            public void onVideoReady() {
            }

            @Override // com.qq.e.ads.nativ.NativeADMediaListener
            @JProtect
            public void onVideoResume() {
                GdtDrawNative.this.notifyOnVideoResume();
            }

            @Override // com.qq.e.ads.nativ.NativeADMediaListener
            @JProtect
            public void onVideoStart() {
                GdtDrawNative.this.notifyOnVideoStart();
            }

            @Override // com.qq.e.ads.nativ.NativeADMediaListener
            public void onVideoStop() {
            }
        };
        this.a = context;
        this.b = nativeUnifiedADData;
        a();
    }

    private void a() {
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
        if (isClientBidding()) {
            create.add(8016, Math.max(this.b.getECPM(), (double) PangleAdapterUtils.CPM_DEFLAUT_VALUE));
        } else if (isMultiBidding()) {
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
        notifyNativeValue(create.build());
    }

    private void a(Context context, ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, MediationViewBinder mediationViewBinder) {
        NativeAdContainer nativeAdContainer;
        Object tag;
        NativeUnifiedADData nativeUnifiedADData;
        if (context == null) {
            context = this.a;
        }
        if (list3 != null) {
            if (list2 == null) {
                list2 = new ArrayList<>();
            }
            list2.addAll(list3);
        }
        List<View> list4 = list2;
        if (isServerBidding() && (nativeUnifiedADData = this.b) != null) {
            nativeUnifiedADData.setBidECPM(nativeUnifiedADData.getECPM());
        }
        if (this.b == null || !(viewGroup instanceof FrameLayout)) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) viewGroup;
        int i = 0;
        if (frameLayout.getChildAt(0) instanceof NativeAdContainer) {
            nativeAdContainer = (NativeAdContainer) frameLayout.getChildAt(0);
            while (i < nativeAdContainer.getChildCount()) {
                View childAt = nativeAdContainer.getChildAt(i);
                if (childAt == null || ((tag = childAt.getTag(R.id.tt_mediation_gdt_developer_view_tag_key)) != null && (tag instanceof String) && ((String) tag).equals("tt_gdt_developer_view"))) {
                    i++;
                } else {
                    nativeAdContainer.removeView(childAt);
                }
            }
        } else {
            nativeAdContainer = new NativeAdContainer(context);
            nativeAdContainer.setTag(R.id.tt_mediation_gdt_developer_view_root_tag_key, "tt_gdt_developer_view_root");
            while (frameLayout.getChildCount() > 0) {
                View childAt2 = frameLayout.getChildAt(0);
                childAt2.setTag(R.id.tt_mediation_gdt_developer_view_tag_key, "tt_gdt_developer_view");
                int indexOfChild = frameLayout.indexOfChild(childAt2);
                frameLayout.removeViewInLayout(childAt2);
                if (childAt2 != null) {
                    nativeAdContainer.addView(childAt2, indexOfChild, childAt2.getLayoutParams());
                }
            }
            frameLayout.removeAllViews();
            frameLayout.addView(nativeAdContainer, -1, -1);
        }
        NativeAdContainer nativeAdContainer2 = nativeAdContainer;
        FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(mediationViewBinder.mediaViewId);
        this.b.bindAdToView(context, nativeAdContainer2, null, list, list4);
        VideoOption build = new VideoOption.Builder().build();
        if (frameLayout2 != null && getImageMode() == 5) {
            MediaView mediaView = new MediaView(context);
            frameLayout2.removeAllViews();
            frameLayout2.addView(mediaView, -1, -1);
            this.b.bindMediaView(mediaView, build, this.d);
        }
        if (!TextUtils.isEmpty(this.b.getCTAText())) {
            View findViewById = frameLayout.findViewById(mediationViewBinder.callToActionId);
            ArrayList arrayList = new ArrayList();
            arrayList.add(findViewById);
            this.b.bindCTAViews(arrayList);
        }
        this.b.setNativeAdEventListener(new NativeADEventListener() { // from class: com.bytedance.msdk.adapter.gdt.GdtDrawNative.1
            @Override // com.qq.e.ads.nativ.NativeADEventListener
            public void onADClicked() {
                GdtDrawNative.this.notifyOnClickAd();
            }

            @Override // com.qq.e.ads.nativ.NativeADEventListener
            public void onADError(AdError adError) {
            }

            @Override // com.qq.e.ads.nativ.NativeADEventListener
            public void onADExposed() {
                GdtDrawNative.this.notifyOnShowAd();
            }

            @Override // com.qq.e.ads.nativ.NativeADEventListener
            public void onADStatusChanged() {
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.native_ad.MediationNativeAd, com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i, ValueSet valueSet, Class<T> cls) {
        if (i == 8148) {
            NativeUnifiedADData nativeUnifiedADData = this.b;
            if (nativeUnifiedADData != null) {
                nativeUnifiedADData.resume();
            }
        } else if (i == 8149) {
            NativeUnifiedADData nativeUnifiedADData2 = this.b;
            if (nativeUnifiedADData2 != null) {
                nativeUnifiedADData2.pauseVideo();
            }
        } else if (i == 8109) {
            this.c = true;
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.msdk.adapter.gdt.GdtDrawNative.3
                @Override // java.lang.Runnable
                public void run() {
                    if (GdtDrawNative.this.b != null) {
                        GdtDrawNative.this.b.destroy();
                    }
                }
            });
        } else if (i == 8120) {
            return (T) Boolean.valueOf(this.c);
        } else {
            if (i == 8191) {
                NativeUnifiedADData nativeUnifiedADData3 = this.b;
                if (nativeUnifiedADData3 != null) {
                    nativeUnifiedADData3.pauseAppDownload();
                }
            } else if (i == 8192) {
                NativeUnifiedADData nativeUnifiedADData4 = this.b;
                if (nativeUnifiedADData4 != null) {
                    nativeUnifiedADData4.resumeAppDownload();
                }
            } else if (i == 8121) {
                return (T) isReadyStatus();
            } else {
                try {
                    if (i == 8142) {
                        NativeUnifiedADData nativeUnifiedADData5 = this.b;
                        if (nativeUnifiedADData5 != null) {
                            nativeUnifiedADData5.sendWinNotification((int) getCpm());
                        }
                    } else if (i == 8144) {
                        Map map = (Map) valueSet.objectValue(8006, Map.class);
                        if (map != null && this.b != null) {
                            Object obj = map.get(MediationConstant.BIDDING_LOSE_REASON);
                            if (obj instanceof MediationConstant.BiddingLossReason) {
                                this.b.sendLossNotification(0, GDTAdapterUtils.getBiddingLossReason((MediationConstant.BiddingLossReason) obj), null);
                            }
                        }
                    } else if (i == 8194) {
                        NativeUnifiedADData nativeUnifiedADData6 = this.b;
                        if (nativeUnifiedADData6 != null) {
                            nativeUnifiedADData6.negativeFeedback();
                        }
                    } else if (i == 8159) {
                        a((Activity) valueSet.objectValue(20033, Activity.class), (ViewGroup) valueSet.objectValue(8067, ViewGroup.class), (List) valueSet.objectValue(8068, List.class), (List) valueSet.objectValue(8069, List.class), (List) valueSet.objectValue(8070, List.class), (MediationViewBinder) valueSet.objectValue(8071, MediationViewBinder.class));
                    }
                } catch (Exception e) {
                }
            }
        }
        return (T) MediationValueUtil.checkClassType(cls);
    }

    public MediationConstant.AdIsReadyStatus isReadyStatus() {
        NativeUnifiedADData nativeUnifiedADData = this.b;
        return (nativeUnifiedADData == null || !nativeUnifiedADData.isValid()) ? MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY : MediationConstant.AdIsReadyStatus.AD_IS_READY;
    }
}

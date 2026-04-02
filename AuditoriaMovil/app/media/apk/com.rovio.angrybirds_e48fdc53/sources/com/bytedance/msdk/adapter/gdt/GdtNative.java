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
public class GdtNative extends MediationNativeAd {
    private NativeUnifiedADData a;
    private volatile boolean b;
    private Context c;
    private FrameLayout.LayoutParams d;
    private NativeADMediaListener e;

    public GdtNative(Context context, MediationAdLoaderImpl mediationAdLoaderImpl, Bridge bridge, NativeUnifiedADData nativeUnifiedADData, FrameLayout.LayoutParams layoutParams) {
        super(mediationAdLoaderImpl, bridge);
        this.b = false;
        this.e = new NativeADMediaListener() { // from class: com.bytedance.msdk.adapter.gdt.GdtNative.2
            @Override // com.qq.e.ads.nativ.NativeADMediaListener
            @JProtect
            public void onVideoClicked() {
                GdtNative.this.notifyOnClickAd();
            }

            @Override // com.qq.e.ads.nativ.NativeADMediaListener
            @JProtect
            public void onVideoCompleted() {
                GdtNative.this.notifyOnVideoComplete();
            }

            @Override // com.qq.e.ads.nativ.NativeADMediaListener
            @JProtect
            public void onVideoError(AdError adError) {
                if (adError == null) {
                    GdtNative.this.notifyOnVideoError(MediationConstant.ErrorCode.ADN_AD_VIDEO_ERROR, "error is null");
                    return;
                }
                GdtNative.this.notifyOnVideoError(adError.getErrorCode(), adError.getErrorMsg());
                while (true) {
                    char c = 'J';
                    char c2 = '7';
                    while (true) {
                        switch (c) {
                            case 'H':
                                break;
                            case 'I':
                                switch (c2) {
                                    case '^':
                                        break;
                                    case '_':
                                    case '`':
                                        return;
                                    default:
                                        if (c2 != '8' || c2 == '9') {
                                            return;
                                        }
                                        break;
                                }
                                c = 'I';
                                c2 = '`';
                                break;
                            case 'J':
                                if (c2 != '8') {
                                    return;
                                }
                                return;
                            default:
                                c = 'H';
                        }
                    }
                }
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
                GdtNative.this.notifyOnVideoPause();
            }

            @Override // com.qq.e.ads.nativ.NativeADMediaListener
            public void onVideoReady() {
            }

            @Override // com.qq.e.ads.nativ.NativeADMediaListener
            @JProtect
            public void onVideoResume() {
                GdtNative.this.notifyOnVideoResume();
            }

            @Override // com.qq.e.ads.nativ.NativeADMediaListener
            @JProtect
            public void onVideoStart() {
                GdtNative.this.notifyOnVideoStart();
            }

            @Override // com.qq.e.ads.nativ.NativeADMediaListener
            public void onVideoStop() {
            }
        };
        this.c = context;
        this.a = nativeUnifiedADData;
        this.d = layoutParams;
        b();
    }

    private int a() {
        NativeUnifiedADData nativeUnifiedADData = this.a;
        if (nativeUnifiedADData != null) {
            int appStatus = nativeUnifiedADData.getAppStatus();
            if (appStatus == 0) {
                return 0;
            }
            if (appStatus == 1) {
                return 6;
            }
            if (appStatus == 2) {
                return 8;
            }
            if (appStatus == 4) {
                return 2;
            }
            if (appStatus == 8) {
                return 5;
            }
            if (appStatus == 16) {
                return 4;
            }
            if (appStatus == 32) {
                return 3;
            }
            if (appStatus == 64) {
                return 7;
            }
        }
        return 1;
    }

    private void a(Context context, ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, MediationViewBinder mediationViewBinder) {
        NativeAdContainer nativeAdContainer;
        Object tag;
        NativeUnifiedADData nativeUnifiedADData;
        if (context == null) {
            context = this.c;
        }
        if (list3 != null) {
            if (list2 == null) {
                list2 = new ArrayList<>();
            }
            list2.addAll(list3);
        }
        List<View> list4 = list2;
        if (isServerBidding() && (nativeUnifiedADData = this.a) != null) {
            nativeUnifiedADData.setBidECPM(nativeUnifiedADData.getECPM());
        }
        if (this.a == null || !(viewGroup instanceof FrameLayout)) {
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
        this.a.bindAdToView(context, nativeAdContainer2, this.d, list, list4);
        VideoOption build = new VideoOption.Builder().build();
        if (frameLayout2 != null && getImageMode() == 5) {
            MediaView mediaView = new MediaView(context);
            frameLayout2.removeAllViews();
            frameLayout2.addView(mediaView, -1, -1);
            this.a.bindMediaView(mediaView, build, this.e);
        }
        if (!TextUtils.isEmpty(this.a.getCTAText())) {
            View findViewById = frameLayout.findViewById(mediationViewBinder.callToActionId);
            ArrayList arrayList = new ArrayList();
            arrayList.add(findViewById);
            this.a.bindCTAViews(arrayList);
        }
        this.a.setNativeAdEventListener(new NativeADEventListener() { // from class: com.bytedance.msdk.adapter.gdt.GdtNative.1
            @Override // com.qq.e.ads.nativ.NativeADEventListener
            public void onADClicked() {
                GdtNative.this.notifyOnClickAd();
            }

            @Override // com.qq.e.ads.nativ.NativeADEventListener
            public void onADError(AdError adError) {
            }

            @Override // com.qq.e.ads.nativ.NativeADEventListener
            public void onADExposed() {
                GdtNative.this.notifyOnShowAd();
            }

            @Override // com.qq.e.ads.nativ.NativeADEventListener
            public void onADStatusChanged() {
            }
        });
    }

    private void b() {
        MediationValueSetBuilder create = MediationValueSetBuilder.create();
        NativeUnifiedADAppMiitInfo appMiitInfo = this.a.getAppMiitInfo();
        if (appMiitInfo != null) {
            create.add(8056, appMiitInfo.getAppName());
            create.add(8057, appMiitInfo.getAuthorName());
            create.add(8078, appMiitInfo.getPackageSizeBytes());
            create.add(8079, appMiitInfo.getPermissionsUrl());
            create.add(8080, appMiitInfo.getPrivacyAgreement());
            create.add(8081, appMiitInfo.getVersionName());
        }
        create.add(8045, this.a.getTitle());
        create.add(8046, this.a.getDesc());
        create.add(8061, this.a.getCTAText());
        create.add(8048, this.a.getIconUrl());
        create.add(8050, this.a.getImgUrl());
        create.add(8052, this.a.getPictureWidth());
        create.add(8051, this.a.getPictureHeight());
        create.add(8053, this.a.getImgList());
        create.add(8082, this.a.getAppScore());
        create.add(8049, this.a.getTitle());
        create.add(8055, this.a.isAppAd());
        if (isClientBidding()) {
            create.add(8016, Math.max(this.a.getECPM(), (double) PangleAdapterUtils.CPM_DEFLAUT_VALUE));
        } else if (isMultiBidding()) {
            create.add(8058, this.a.getECPMLevel());
        }
        if (this.a.getAdPatternType() == 2) {
            create.add(8060, 5);
        } else if (this.a.getAdPatternType() == 4 || this.a.getAdPatternType() == 1) {
            create.add(8060, 3);
        } else if (this.a.getAdPatternType() == 3) {
            create.add(8060, 4);
        }
        if (this.a.isAppAd()) {
            create.add(8059, 4);
        } else {
            create.add(8059, 3);
        }
        create.add(8033, false);
        notifyNativeValue(create.build());
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.native_ad.MediationNativeAd, com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i, ValueSet valueSet, Class<T> cls) {
        if (i == 8148) {
            NativeUnifiedADData nativeUnifiedADData = this.a;
            if (nativeUnifiedADData != null) {
                nativeUnifiedADData.resume();
            }
        } else if (i == 8149) {
            NativeUnifiedADData nativeUnifiedADData2 = this.a;
            if (nativeUnifiedADData2 != null) {
                nativeUnifiedADData2.pauseVideo();
            }
        } else if (i == 8109) {
            this.b = true;
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.msdk.adapter.gdt.GdtNative.3
                @Override // java.lang.Runnable
                public void run() {
                    if (GdtNative.this.a != null) {
                        GdtNative.this.a.destroy();
                    }
                }
            });
        } else if (i == 8120) {
            return (T) Boolean.valueOf(this.b);
        } else {
            if (i == 8191) {
                NativeUnifiedADData nativeUnifiedADData3 = this.a;
                if (nativeUnifiedADData3 != null) {
                    nativeUnifiedADData3.pauseAppDownload();
                }
            } else if (i == 8192) {
                NativeUnifiedADData nativeUnifiedADData4 = this.a;
                if (nativeUnifiedADData4 != null) {
                    nativeUnifiedADData4.resumeAppDownload();
                }
            } else if (i == 8193) {
                return (T) Integer.valueOf(a());
            } else {
                if (i == 8121) {
                    return (T) isReadyStatus();
                }
                try {
                    if (i == 8142) {
                        NativeUnifiedADData nativeUnifiedADData5 = this.a;
                        if (nativeUnifiedADData5 != null) {
                            nativeUnifiedADData5.sendWinNotification((int) getCpm());
                        }
                    } else if (i == 8144) {
                        Map map = (Map) valueSet.objectValue(8006, Map.class);
                        if (map != null && this.a != null) {
                            Object obj = map.get(MediationConstant.BIDDING_LOSE_REASON);
                            if (obj instanceof MediationConstant.BiddingLossReason) {
                                this.a.sendLossNotification(0, GDTAdapterUtils.getBiddingLossReason((MediationConstant.BiddingLossReason) obj), null);
                            }
                        }
                    } else if (i == 8194) {
                        NativeUnifiedADData nativeUnifiedADData6 = this.a;
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
        NativeUnifiedADData nativeUnifiedADData = this.a;
        return (nativeUnifiedADData == null || !nativeUnifiedADData.isValid()) ? MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY : MediationConstant.AdIsReadyStatus.AD_IS_READY;
    }
}

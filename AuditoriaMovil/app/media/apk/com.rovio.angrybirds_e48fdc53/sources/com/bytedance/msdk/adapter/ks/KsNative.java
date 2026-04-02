package com.bytedance.msdk.adapter.ks;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.JProtect;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationViewBinder;
import com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo;
import com.bytedance.sdk.openadsdk.mediation.bridge.native_ad.MediationNativeAd;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;
import com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl;
import com.kwad.sdk.api.KsApkDownloadListener;
import com.kwad.sdk.api.KsNativeAd;
import java.util.List;
/* loaded from: classes.dex */
public class KsNative extends MediationNativeAd {
    private KsNativeAd a;
    private Context b;
    private MediationAdSlotValueSet c;
    KsNativeAd.AdInteractionListener d;
    KsNativeAd.VideoPlayListener e;
    KsApkDownloadListener f;

    public KsNative(Context context, KsNativeAd ksNativeAd, MediationAdSlotValueSet mediationAdSlotValueSet, Bridge bridge, KsNativeLoader ksNativeLoader) {
        super(ksNativeLoader, bridge);
        this.d = new KsNativeAd.AdInteractionListener() { // from class: com.bytedance.msdk.adapter.ks.KsNative.1
            @Override // com.kwad.sdk.api.KsNativeAd.AdInteractionListener
            public boolean handleDownloadDialog(DialogInterface.OnClickListener onClickListener) {
                return false;
            }

            @Override // com.kwad.sdk.api.KsNativeAd.AdInteractionListener
            @JProtect
            public void onAdClicked(View view, KsNativeAd ksNativeAd2) {
                KsNative.this.notifyOnClickAd();
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x001d  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0019 A[SYNTHETIC] */
            @Override // com.kwad.sdk.api.KsNativeAd.AdInteractionListener
            @com.bytedance.JProtect
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onAdShow(com.kwad.sdk.api.KsNativeAd r4) {
                /*
                    r3 = this;
                    com.bytedance.msdk.adapter.ks.KsNative r4 = com.bytedance.msdk.adapter.ks.KsNative.this
                    r4.notifyOnShowAd()
                L5:
                    r4 = 94
                    r0 = 75
                    r1 = 93
                Lb:
                    r2 = 92
                    if (r4 == r2) goto L12
                    if (r4 == r1) goto L15
                    goto L1a
                L12:
                    switch(r0) {
                        case 21: goto L1a;
                        case 22: goto L1a;
                        case 23: goto L1a;
                        default: goto L15;
                    }
                L15:
                    switch(r0) {
                        case 91: goto L5;
                        case 92: goto L1a;
                        case 93: goto L19;
                        default: goto L18;
                    }
                L18:
                    goto L1d
                L19:
                    return
                L1a:
                    r4 = r1
                    r0 = r4
                    goto Lb
                L1d:
                    r0 = 91
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.msdk.adapter.ks.KsNative.AnonymousClass1.onAdShow(com.kwad.sdk.api.KsNativeAd):void");
            }

            @Override // com.kwad.sdk.api.KsNativeAd.AdInteractionListener
            public void onDownloadTipsDialogDismiss() {
            }

            @Override // com.kwad.sdk.api.KsNativeAd.AdInteractionListener
            public void onDownloadTipsDialogShow() {
            }
        };
        this.e = new KsNativeAd.VideoPlayListener() { // from class: com.bytedance.msdk.adapter.ks.KsNative.2
            @Override // com.kwad.sdk.api.KsNativeAd.VideoPlayListener
            @JProtect
            public void onVideoPlayComplete() {
                KsNative.this.notifyOnVideoComplete();
            }

            @Override // com.kwad.sdk.api.KsNativeAd.VideoPlayListener
            @JProtect
            public void onVideoPlayError(int i, int i2) {
                KsNative ksNative = KsNative.this;
                ksNative.notifyOnVideoError(i, "Android MediaPlay Error Code :" + i2);
            }

            @Override // com.kwad.sdk.api.KsNativeAd.VideoPlayListener
            public void onVideoPlayPause() {
            }

            @Override // com.kwad.sdk.api.KsNativeAd.VideoPlayListener
            public void onVideoPlayReady() {
            }

            @Override // com.kwad.sdk.api.KsNativeAd.VideoPlayListener
            public void onVideoPlayResume() {
            }

            @Override // com.kwad.sdk.api.KsNativeAd.VideoPlayListener
            @JProtect
            public void onVideoPlayStart() {
                KsNative.this.notifyOnVideoStart();
            }
        };
        this.f = new KsApkDownloadListener() { // from class: com.bytedance.msdk.adapter.ks.KsNative.3
            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public void onDownloadFailed() {
                KsNative.this.notifyOnDownloadFailed(-1L, -1L, null, null);
            }

            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public void onDownloadFinished() {
                KsNative.this.notifyOnDownloadFinished(-1L, null, null);
            }

            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public void onDownloadStarted() {
                KsNative.this.notifyOnDownloadStarted();
            }

            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public void onIdle() {
                KsNative.this.notifyOnIdel();
            }

            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public void onInstalled() {
                KsNative.this.notifyOnInstalled(null, null);
            }

            @Override // com.kwad.sdk.api.KsApkDownloadListener
            public void onPaused(int i) {
                KsNative.this.notifyOnDownloadPause(-1L, -1L, null, null);
            }

            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public void onProgressUpdate(int i) {
                KsNative.this.notifyOnProgressUpdate(-1L, -1L, i, 2);
            }
        };
        this.b = context;
        this.a = ksNativeAd;
        this.c = mediationAdSlotValueSet;
        a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x01e0, code lost:
        if (r1 != null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a() {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.msdk.adapter.ks.KsNative.a():void");
    }

    private void a(ViewGroup viewGroup, List<View> list, List<View> list2, MediationViewBinder mediationViewBinder) {
        KsNativeAd ksNativeAd;
        View findViewById;
        if (list != null && list2 != null) {
            list.addAll(list2);
        }
        if (viewGroup instanceof FrameLayout) {
            KsNativeAd ksNativeAd2 = this.a;
            if (ksNativeAd2 != null) {
                ksNativeAd2.registerViewForInteraction(viewGroup, list, this.d);
            }
            KsNativeAd ksNativeAd3 = this.a;
            if (ksNativeAd3 != null && ksNativeAd3.getAdSourceLogoUrl(1) != null && (findViewById = viewGroup.findViewById(mediationViewBinder.logoLayoutId)) != null) {
                findViewById.setVisibility(0);
                if (findViewById instanceof ViewGroup) {
                    ViewGroup viewGroup2 = (ViewGroup) findViewById;
                    viewGroup2.removeAllViews();
                    ImageView imageView = new ImageView(this.b);
                    new DownloadImageTask(imageView).execute(this.a.getAdSourceLogoUrl(1));
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    viewGroup2.addView(imageView, -1, -1);
                } else if (findViewById instanceof ImageView) {
                    ImageView imageView2 = (ImageView) findViewById;
                    new DownloadImageTask(imageView2).execute(this.a.getAdSourceLogoUrl(1));
                    imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                }
            }
            if (!isUseCustomVideo() || (ksNativeAd = this.a) == null || TextUtils.isEmpty(ksNativeAd.getVideoUrl())) {
                FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(mediationViewBinder.mediaViewId);
                if (this.a == null || frameLayout == null) {
                    return;
                }
                KSAdVideoPlayConfigImpl kSAdVideoPlayConfigImpl = new KSAdVideoPlayConfigImpl();
                kSAdVideoPlayConfigImpl.setVideoSoundEnable(!this.c.isMuted());
                View videoView = this.a.getVideoView(this.b, kSAdVideoPlayConfigImpl);
                if (videoView == null) {
                    return;
                }
                removeSelfFromParent(videoView);
                frameLayout.removeAllViews();
                frameLayout.addView(videoView, -1, -1);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.native_ad.MediationNativeAd, com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i, ValueSet valueSet, Class<T> cls) {
        if (i == 8159) {
            a((ViewGroup) valueSet.objectValue(8067, ViewGroup.class), (List) valueSet.objectValue(8068, List.class), (List) valueSet.objectValue(8069, List.class), (MediationViewBinder) valueSet.objectValue(8071, MediationViewBinder.class));
        } else if (i == 8161) {
            return (T) Integer.valueOf(getVideoWidth());
        } else {
            if (i == 8162) {
                return (T) Integer.valueOf(getVideoHeight());
            }
            if (i == 8163) {
                return (T) String.valueOf(getVideoUrl());
            }
            if (i == 8164) {
                return (T) getNativeCustomVideoReporter();
            }
            if (i == 8109) {
                KsNativeAd ksNativeAd = this.a;
                if (ksNativeAd != null) {
                    ksNativeAd.setVideoPlayListener(null);
                    this.a = null;
                }
            } else if (i == 8120) {
                return (T) Boolean.valueOf(this.a == null);
            }
        }
        return (T) MediationValueUtil.checkClassType(cls);
    }

    public IMediationCustomizeVideo getNativeCustomVideoReporter() {
        if (isUseCustomVideo()) {
            return new IMediationCustomizeVideo() { // from class: com.bytedance.msdk.adapter.ks.KsNative.4
                @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
                public String getVideoUrl() {
                    return null;
                }

                @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
                public void reportVideoAutoStart() {
                }

                @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
                public void reportVideoBreak(long j) {
                }

                @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
                public void reportVideoContinue(long j) {
                }

                @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
                public void reportVideoError(long j, int i, int i2) {
                }

                @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
                public void reportVideoFinish() {
                    if (KsNative.this.a != null) {
                        KsNative.this.a.reportAdVideoPlayEnd();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
                public void reportVideoPause(long j) {
                }

                @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
                public void reportVideoStart() {
                    if (KsNative.this.a != null) {
                        KsNative.this.a.reportAdVideoPlayStart();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
                public void reportVideoStartError(int i, int i2) {
                }
            };
        }
        return null;
    }

    public int getVideoHeight() {
        KsNativeAd ksNativeAd = this.a;
        if (ksNativeAd != null) {
            return ksNativeAd.getVideoHeight();
        }
        return 0;
    }

    public String getVideoUrl() {
        KsNativeAd ksNativeAd;
        return (!isUseCustomVideo() || (ksNativeAd = this.a) == null) ? "" : ksNativeAd.getVideoUrl();
    }

    public int getVideoWidth() {
        KsNativeAd ksNativeAd = this.a;
        if (ksNativeAd != null) {
            return ksNativeAd.getVideoWidth();
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.native_ad.MediationNativeAd, com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return null;
    }
}

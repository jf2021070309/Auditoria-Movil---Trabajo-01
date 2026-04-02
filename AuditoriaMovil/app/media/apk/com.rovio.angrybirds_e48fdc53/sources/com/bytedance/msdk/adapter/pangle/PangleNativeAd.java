package com.bytedance.msdk.adapter.pangle;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.JProtect;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.adapter.util.UIUtils;
import com.bytedance.msdk.api.format.TTMediaView;
import com.bytedance.msdk.api.format.TTNativeAdView;
import com.bytedance.msdk.api.v2.GMAdDislike;
import com.bytedance.msdk.api.v2.GMDislikeCallback;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAppDownloadListener;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.TTFeedAd;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationViewBinder;
import com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import com.bytedance.sdk.openadsdk.mediation.bridge.native_ad.MediationNativeAd;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class PangleNativeAd {

    /* loaded from: classes.dex */
    private static class PangleNative extends MediationNativeAd {
        private TTFeedAd a;
        private int b;
        TTNativeAd.AdInteractionListener c;
        TTFeedAd.VideoAdListener d;
        TTAppDownloadListener e;

        /* JADX WARN: Code restructure failed: missing block: B:55:0x017c, code lost:
            if (r10 != null) goto L66;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        PangleNative(com.bytedance.sdk.openadsdk.TTFeedAd r7, boolean r8, com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl r9, com.bykv.vk.openvk.api.proto.Bridge r10) {
            /*
                Method dump skipped, instructions count: 585
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.msdk.adapter.pangle.PangleNativeAd.PangleNative.<init>(com.bytedance.sdk.openadsdk.TTFeedAd, boolean, com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl, com.bykv.vk.openvk.api.proto.Bridge):void");
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.native_ad.MediationNativeAd, com.bykv.vk.openvk.api.proto.Caller
        public <T> T call(int i, ValueSet valueSet, Class<T> cls) {
            if (i == 8159) {
                registerViewForInteraction((ViewGroup) valueSet.objectValue(8067, ViewGroup.class), (List) valueSet.objectValue(8068, List.class), (List) valueSet.objectValue(8069, List.class), (MediationViewBinder) valueSet.objectValue(8071, MediationViewBinder.class));
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
                    return (T) getGMNativeCustomVideoReporter();
                }
                if (i == 8109) {
                    onDestroy();
                } else if (i == 8120) {
                    return (T) Boolean.valueOf(hasDestroyed());
                } else {
                    if (i == 8147) {
                        return (T) getReqId();
                    }
                    if (i == 8191) {
                        pauseAppDownload();
                    } else if (i == 8192) {
                        resumeAppDownload();
                    } else if (i == 6093) {
                        cancelDownload();
                    } else if (i == 8193) {
                        return (T) Integer.valueOf(getDownloadStatus());
                    } else {
                        if (i == 8239) {
                            return (T) getMediaExtraInfo();
                        }
                        if (i == 6072) {
                            return (T) getDislikeDialog((Activity) valueSet.objectValue(20033, Activity.class), (Map) valueSet.objectValue(8075, Map.class));
                        }
                        if (i == 8245) {
                            return (T) Long.valueOf(getCreativeId());
                        }
                        if (i == 8246) {
                            return (T) Long.valueOf(getAdId());
                        }
                    }
                }
            }
            return (T) MediationValueUtil.checkClassType(cls);
        }

        public void cancelDownload() {
            TTFeedAd tTFeedAd = this.a;
            if (tTFeedAd == null || tTFeedAd.getDownloadStatusController() == null) {
                return;
            }
            this.a.getDownloadStatusController().cancelDownload();
        }

        public long getAdId() {
            TTFeedAd tTFeedAd = this.a;
            if (tTFeedAd != null) {
                return PangleAdapterUtils.getAdId(tTFeedAd.getMediaExtraInfo());
            }
            return 0L;
        }

        public long getCreativeId() {
            TTFeedAd tTFeedAd = this.a;
            if (tTFeedAd != null) {
                return PangleAdapterUtils.getCreativeId(tTFeedAd.getMediaExtraInfo());
            }
            return 0L;
        }

        public GMAdDislike getDislikeDialog(Activity activity, Map<String, Object> map) {
            final TTDislikeDialogAbstract tTDislikeDialogAbstract = null;
            if (this.a != null) {
                if (map != null && (map.get("pangle_custom_dialog") instanceof TTDislikeDialogAbstract)) {
                    tTDislikeDialogAbstract = (TTDislikeDialogAbstract) map.get("pangle_custom_dialog");
                }
                if (tTDislikeDialogAbstract == null) {
                    final TTAdDislike dislikeDialog = this.a.getDislikeDialog(activity);
                    return new GMAdDislike() { // from class: com.bytedance.msdk.adapter.pangle.PangleNativeAd.PangleNative.4
                        @Override // com.bytedance.msdk.api.v2.GMAdDislike
                        public void setDislikeCallback(GMDislikeCallback gMDislikeCallback) {
                            if (gMDislikeCallback != null) {
                                dislikeDialog.setDislikeInteractionCallback(new TTAdDislike.DislikeInteractionCallback() { // from class: com.bytedance.msdk.adapter.pangle.PangleNativeAd.PangleNative.4.1
                                    @Override // com.bytedance.sdk.openadsdk.TTAdDislike.DislikeInteractionCallback
                                    public void onCancel() {
                                        PangleNative.this.notifyDislikeOnCancel();
                                    }

                                    @Override // com.bytedance.sdk.openadsdk.TTAdDislike.DislikeInteractionCallback
                                    public void onSelected(int i, String str, boolean z) {
                                        try {
                                            PangleNative.this.notifyDislikeClick(str, null);
                                            PangleNative.this.notifyDislikeSelect(i, str);
                                        } catch (Throwable th) {
                                            th.printStackTrace();
                                        }
                                    }

                                    @Override // com.bytedance.sdk.openadsdk.TTAdDislike.DislikeInteractionCallback
                                    public void onShow() {
                                        PangleNative.this.notifyDislikeOnShow();
                                    }
                                });
                            }
                        }

                        @Override // com.bytedance.msdk.api.v2.GMAdDislike
                        public void showDislikeDialog() {
                            TTAdDislike tTAdDislike = dislikeDialog;
                            if (tTAdDislike != null) {
                                tTAdDislike.showDislikeDialog();
                            }
                        }
                    };
                }
                Logger.e("TTMediationSDK", "---pangle_getDislikeDialog_custom_dialog---");
                this.a.setDislikeDialog(tTDislikeDialogAbstract);
                return new GMAdDislike(this) { // from class: com.bytedance.msdk.adapter.pangle.PangleNativeAd.PangleNative.3
                    @Override // com.bytedance.msdk.api.v2.GMAdDislike
                    public void setDislikeCallback(GMDislikeCallback gMDislikeCallback) {
                    }

                    @Override // com.bytedance.msdk.api.v2.GMAdDislike
                    public void showDislikeDialog() {
                        TTDislikeDialogAbstract tTDislikeDialogAbstract2 = tTDislikeDialogAbstract;
                        if (tTDislikeDialogAbstract2 != null) {
                            tTDislikeDialogAbstract2.show();
                        }
                    }
                };
            }
            return null;
        }

        public int getDownloadStatus() {
            return this.b;
        }

        public IMediationCustomizeVideo getGMNativeCustomVideoReporter() {
            if (isUseCustomVideo()) {
                return new IMediationCustomizeVideo() { // from class: com.bytedance.msdk.adapter.pangle.PangleNativeAd.PangleNative.2
                    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
                    public String getVideoUrl() {
                        return null;
                    }

                    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
                    public void reportVideoAutoStart() {
                        if (PangleNative.this.a == null || PangleNative.this.a.getCustomVideo() == null) {
                            return;
                        }
                        PangleNative.this.a.getCustomVideo().reportVideoAutoStart();
                    }

                    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
                    public void reportVideoBreak(long j) {
                        if (PangleNative.this.a == null || PangleNative.this.a.getCustomVideo() == null) {
                            return;
                        }
                        PangleNative.this.a.getCustomVideo().reportVideoBreak(j);
                    }

                    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
                    public void reportVideoContinue(long j) {
                        if (PangleNative.this.a == null || PangleNative.this.a.getCustomVideo() == null) {
                            return;
                        }
                        PangleNative.this.a.getCustomVideo().reportVideoContinue(j);
                    }

                    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
                    public void reportVideoError(long j, int i, int i2) {
                        if (PangleNative.this.a == null || PangleNative.this.a.getCustomVideo() == null) {
                            return;
                        }
                        PangleNative.this.a.getCustomVideo().reportVideoError(j, i, i2);
                    }

                    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
                    public void reportVideoFinish() {
                        if (PangleNative.this.a == null || PangleNative.this.a.getCustomVideo() == null) {
                            return;
                        }
                        PangleNative.this.a.getCustomVideo().reportVideoFinish();
                    }

                    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
                    public void reportVideoPause(long j) {
                        if (PangleNative.this.a == null || PangleNative.this.a.getCustomVideo() == null) {
                            return;
                        }
                        PangleNative.this.a.getCustomVideo().reportVideoPause(j);
                    }

                    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
                    public void reportVideoStart() {
                        if (PangleNative.this.a == null || PangleNative.this.a.getCustomVideo() == null) {
                            return;
                        }
                        PangleNative.this.a.getCustomVideo().reportVideoStart();
                    }

                    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
                    public void reportVideoStartError(int i, int i2) {
                        if (PangleNative.this.a == null || PangleNative.this.a.getCustomVideo() == null) {
                            return;
                        }
                        PangleNative.this.a.getCustomVideo().reportVideoStartError(i, i2);
                    }
                };
            }
            return null;
        }

        public Map<String, Object> getMediaExtraInfo() {
            Map<String, Object> mediaExtraInfo;
            TTFeedAd tTFeedAd = this.a;
            if (tTFeedAd == null || (mediaExtraInfo = tTFeedAd.getMediaExtraInfo()) == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(PangleAdapterUtils.MEDIA_EXTRA_COUPON, mediaExtraInfo.get(PangleAdapterUtils.MEDIA_EXTRA_COUPON));
            hashMap.put(PangleAdapterUtils.MEDIA_EXTRA_LIVE_ROOM, mediaExtraInfo.get(PangleAdapterUtils.MEDIA_EXTRA_LIVE_ROOM));
            hashMap.put(PangleAdapterUtils.MEDIA_EXTRA_PRODUCT, mediaExtraInfo.get(PangleAdapterUtils.MEDIA_EXTRA_PRODUCT));
            return hashMap;
        }

        public String getReqId() {
            TTFeedAd tTFeedAd = this.a;
            if (tTFeedAd != null) {
                return PangleAdapterUtils.getReqId(tTFeedAd.getMediaExtraInfo());
            }
            return null;
        }

        public int getVideoHeight() {
            TTFeedAd tTFeedAd = this.a;
            if (tTFeedAd != null) {
                return tTFeedAd.getAdViewHeight();
            }
            return 0;
        }

        public String getVideoUrl() {
            TTFeedAd tTFeedAd;
            if (!isUseCustomVideo() || (tTFeedAd = this.a) == null || tTFeedAd.getCustomVideo() == null) {
                return null;
            }
            return this.a.getCustomVideo().getVideoUrl();
        }

        public int getVideoWidth() {
            TTFeedAd tTFeedAd = this.a;
            if (tTFeedAd != null) {
                return tTFeedAd.getAdViewWidth();
            }
            return 0;
        }

        public boolean hasDestroyed() {
            return this.a == null;
        }

        public boolean hasDislike() {
            return true;
        }

        public void onDestroy() {
            TTFeedAd tTFeedAd = this.a;
            if (tTFeedAd != null) {
                tTFeedAd.setVideoAdListener(null);
                this.a.destroy();
                this.a = null;
            }
        }

        public void pauseAppDownload() {
            TTFeedAd tTFeedAd = this.a;
            if (tTFeedAd == null || tTFeedAd.getDownloadStatusController() == null || this.b != 2) {
                return;
            }
            this.a.getDownloadStatusController().changeDownloadStatus();
        }

        @JProtect
        public void registerViewForInteraction(Activity activity, ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, MediationViewBinder mediationViewBinder) {
            TTMediaView tTMediaView;
            TTFeedAd tTFeedAd;
            View adView;
            TTFeedAd tTFeedAd2;
            View findViewById;
            for (char c = '\\'; c != 'Z'; c = '[') {
                if (c == '[') {
                    if (viewGroup instanceof TTNativeAdView) {
                        TTFeedAd tTFeedAd3 = this.a;
                        if (tTFeedAd3 != null) {
                            tTFeedAd3.setDownloadListener(this.e);
                            try {
                                this.a.setVideoRewardListener(new TTFeedAd.VideoRewardListener() { // from class: com.bytedance.msdk.adapter.pangle.PangleNativeAd.PangleNative.1
                                    @Override // com.bytedance.sdk.openadsdk.TTFeedAd.VideoRewardListener
                                    public void onFeedRewardCountDown(int i) {
                                        if (PangleNative.this.mGMAd != null) {
                                            MediationValueSetBuilder create = MediationValueSetBuilder.create();
                                            create.add(20055, i);
                                            PangleNative.this.mGMAd.call(6107, create.build(), Void.class);
                                        }
                                    }
                                });
                            } catch (Throwable th) {
                                th.printStackTrace();
                            }
                            this.a.registerViewForInteraction(viewGroup, null, list, list2, list3, null, this.c);
                        }
                        TTFeedAd tTFeedAd4 = this.a;
                        if (tTFeedAd4 != null && tTFeedAd4.getAdLogo() != null && (findViewById = viewGroup.findViewById(mediationViewBinder.logoLayoutId)) != null) {
                            findViewById.setVisibility(0);
                            if (findViewById instanceof ViewGroup) {
                                ViewGroup viewGroup2 = (ViewGroup) findViewById;
                                viewGroup2.removeAllViews();
                                ImageView imageView = new ImageView(viewGroup.getContext());
                                imageView.setImageBitmap(this.a.getAdLogo());
                                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                                layoutParams.width = UIUtils.dp2px(viewGroup.getContext(), 38.0f);
                                layoutParams.height = UIUtils.dp2px(viewGroup.getContext(), 38.0f);
                                findViewById.setLayoutParams(layoutParams);
                                viewGroup2.addView(imageView, -1, -1);
                            } else if (findViewById instanceof ImageView) {
                                ((ImageView) findViewById).setImageBitmap(this.a.getAdLogo());
                            }
                        }
                        if ((isUseCustomVideo() && (tTFeedAd2 = this.a) != null && tTFeedAd2.getCustomVideo() != null && !TextUtils.isEmpty(this.a.getCustomVideo().getVideoUrl())) || (tTMediaView = (TTMediaView) viewGroup.findViewById(mediationViewBinder.mediaViewId)) == null || (tTFeedAd = this.a) == null || (adView = tTFeedAd.getAdView()) == null) {
                            return;
                        }
                        removeSelfFromParent(adView);
                        tTMediaView.removeAllViews();
                        tTMediaView.addView(adView, -1, -1);
                        return;
                    }
                    return;
                }
            }
            while (true) {
            }
        }

        @JProtect
        public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, MediationViewBinder mediationViewBinder) {
            registerViewForInteraction(null, viewGroup, list, list2, null, mediationViewBinder);
        }

        public void resumeAppDownload() {
            TTFeedAd tTFeedAd = this.a;
            if (tTFeedAd == null || tTFeedAd.getDownloadStatusController() == null || this.b != 3) {
                return;
            }
            this.a.getDownloadStatusController().changeDownloadStatus();
        }
    }

    @JProtect
    public void loadAd(Context context, final boolean z, TTAdNative tTAdNative, AdSlot adSlot, final MediationAdLoaderImpl mediationAdLoaderImpl) {
        if (tTAdNative == null || mediationAdLoaderImpl == null) {
            return;
        }
        tTAdNative.loadFeedAd(adSlot, new TTAdNative.FeedAdListener(this) { // from class: com.bytedance.msdk.adapter.pangle.PangleNativeAd.1
            @Override // com.bytedance.sdk.openadsdk.TTAdNative.FeedAdListener, com.bytedance.sdk.openadsdk.common.CommonListener
            public void onError(int i, String str) {
                mediationAdLoaderImpl.notifyAdFailed(i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.TTAdNative.FeedAdListener
            public void onFeedAdLoad(List<TTFeedAd> list) {
                if (list == null || list.isEmpty()) {
                    mediationAdLoaderImpl.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "load成功但返回广告是空");
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (TTFeedAd tTFeedAd : list) {
                    Bridge gMBridge = mediationAdLoaderImpl.getGMBridge();
                    new PangleNative(tTFeedAd, z, mediationAdLoaderImpl, gMBridge);
                    arrayList.add(gMBridge);
                }
                mediationAdLoaderImpl.notifyAdSuccess(arrayList);
            }
        });
    }
}

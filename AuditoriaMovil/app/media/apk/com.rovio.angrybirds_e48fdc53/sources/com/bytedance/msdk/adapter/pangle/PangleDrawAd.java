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
import com.bytedance.msdk.adapter.util.UIUtils;
import com.bytedance.msdk.api.format.TTMediaView;
import com.bytedance.msdk.api.format.TTNativeAdView;
import com.bytedance.msdk.api.v2.GMAdDislike;
import com.bytedance.msdk.api.v2.GMDislikeCallback;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAppDownloadListener;
import com.bytedance.sdk.openadsdk.TTDrawFeedAd;
import com.bytedance.sdk.openadsdk.TTFeedAd;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationViewBinder;
import com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl;
import com.bytedance.sdk.openadsdk.mediation.bridge.native_ad.MediationNativeAd;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class PangleDrawAd {

    /* loaded from: classes.dex */
    private static class PangleDraw extends MediationNativeAd {
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
        PangleDraw(com.bytedance.sdk.openadsdk.TTFeedAd r7, boolean r8, com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl r9, com.bykv.vk.openvk.api.proto.Bridge r10) {
            /*
                Method dump skipped, instructions count: 600
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.msdk.adapter.pangle.PangleDrawAd.PangleDraw.<init>(com.bytedance.sdk.openadsdk.TTFeedAd, boolean, com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl, com.bykv.vk.openvk.api.proto.Bridge):void");
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
            TTFeedAd tTFeedAd = this.a;
            if (tTFeedAd != null) {
                final TTAdDislike dislikeDialog = tTFeedAd.getDislikeDialog(activity);
                return new GMAdDislike(this) { // from class: com.bytedance.msdk.adapter.pangle.PangleDrawAd.PangleDraw.2
                    @Override // com.bytedance.msdk.api.v2.GMAdDislike
                    public void setDislikeCallback(final GMDislikeCallback gMDislikeCallback) {
                        if (gMDislikeCallback != null) {
                            dislikeDialog.setDislikeInteractionCallback(new TTAdDislike.DislikeInteractionCallback(this) { // from class: com.bytedance.msdk.adapter.pangle.PangleDrawAd.PangleDraw.2.1
                                @Override // com.bytedance.sdk.openadsdk.TTAdDislike.DislikeInteractionCallback
                                public void onCancel() {
                                    gMDislikeCallback.onCancel();
                                }

                                @Override // com.bytedance.sdk.openadsdk.TTAdDislike.DislikeInteractionCallback
                                public void onSelected(int i, String str, boolean z) {
                                    gMDislikeCallback.onSelected(i, str);
                                }

                                @Override // com.bytedance.sdk.openadsdk.TTAdDislike.DislikeInteractionCallback
                                public void onShow() {
                                    GMDislikeCallback gMDislikeCallback2 = gMDislikeCallback;
                                    if (gMDislikeCallback2 != null) {
                                        gMDislikeCallback2.onShow();
                                    }
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
            return null;
        }

        public int getDownloadStatus() {
            return this.b;
        }

        public IMediationCustomizeVideo getGMNativeCustomVideoReporter() {
            if (isUseCustomVideo()) {
                return new IMediationCustomizeVideo() { // from class: com.bytedance.msdk.adapter.pangle.PangleDrawAd.PangleDraw.1
                    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
                    public String getVideoUrl() {
                        return null;
                    }

                    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
                    public void reportVideoAutoStart() {
                        if (PangleDraw.this.a == null || PangleDraw.this.a.getCustomVideo() == null) {
                            return;
                        }
                        PangleDraw.this.a.getCustomVideo().reportVideoAutoStart();
                    }

                    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
                    public void reportVideoBreak(long j) {
                        if (PangleDraw.this.a == null || PangleDraw.this.a.getCustomVideo() == null) {
                            return;
                        }
                        PangleDraw.this.a.getCustomVideo().reportVideoBreak(j);
                    }

                    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
                    public void reportVideoContinue(long j) {
                        if (PangleDraw.this.a == null || PangleDraw.this.a.getCustomVideo() == null) {
                            return;
                        }
                        PangleDraw.this.a.getCustomVideo().reportVideoContinue(j);
                    }

                    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
                    public void reportVideoError(long j, int i, int i2) {
                        if (PangleDraw.this.a == null || PangleDraw.this.a.getCustomVideo() == null) {
                            return;
                        }
                        PangleDraw.this.a.getCustomVideo().reportVideoError(j, i, i2);
                    }

                    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
                    public void reportVideoFinish() {
                        if (PangleDraw.this.a == null || PangleDraw.this.a.getCustomVideo() == null) {
                            return;
                        }
                        PangleDraw.this.a.getCustomVideo().reportVideoFinish();
                    }

                    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
                    public void reportVideoPause(long j) {
                        if (PangleDraw.this.a == null || PangleDraw.this.a.getCustomVideo() == null) {
                            return;
                        }
                        PangleDraw.this.a.getCustomVideo().reportVideoPause(j);
                    }

                    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
                    public void reportVideoStart() {
                        if (PangleDraw.this.a == null || PangleDraw.this.a.getCustomVideo() == null) {
                            return;
                        }
                        PangleDraw.this.a.getCustomVideo().reportVideoStart();
                    }

                    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
                    public void reportVideoStartError(int i, int i2) {
                        if (PangleDraw.this.a == null || PangleDraw.this.a.getCustomVideo() == null) {
                            return;
                        }
                        PangleDraw.this.a.getCustomVideo().reportVideoStartError(i, i2);
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
            return tTFeedAd != null ? PangleAdapterUtils.getReqId(tTFeedAd.getMediaExtraInfo()) : "";
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
        public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, MediationViewBinder mediationViewBinder) {
            TTMediaView tTMediaView;
            TTFeedAd tTFeedAd;
            View adView;
            TTFeedAd tTFeedAd2;
            View findViewById;
            if (viewGroup instanceof TTNativeAdView) {
                TTFeedAd tTFeedAd3 = this.a;
                if (tTFeedAd3 != null) {
                    tTFeedAd3.setDownloadListener(this.e);
                    this.a.registerViewForInteraction(viewGroup, list, list2, this.c);
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
            }
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
        tTAdNative.loadDrawFeedAd(adSlot, new TTAdNative.DrawFeedAdListener(this) { // from class: com.bytedance.msdk.adapter.pangle.PangleDrawAd.1
            @Override // com.bytedance.sdk.openadsdk.TTAdNative.DrawFeedAdListener
            public void onDrawFeedAdLoad(List<TTDrawFeedAd> list) {
                if (list == null || list.isEmpty()) {
                    mediationAdLoaderImpl.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "load成功但返回广告是空");
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (TTDrawFeedAd tTDrawFeedAd : list) {
                    Bridge gMBridge = mediationAdLoaderImpl.getGMBridge();
                    new PangleDraw(tTDrawFeedAd, z, mediationAdLoaderImpl, gMBridge);
                    arrayList.add(gMBridge);
                }
                mediationAdLoaderImpl.notifyAdSuccess(arrayList);
            }

            @Override // com.bytedance.sdk.openadsdk.TTAdNative.DrawFeedAdListener, com.bytedance.sdk.openadsdk.common.CommonListener
            public void onError(int i, String str) {
                mediationAdLoaderImpl.notifyAdFailed(i, str);
            }
        });
    }
}

package com.bytedance.msdk.adapter.pangle;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.JProtect;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.adapter.util.ThreadHelper;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import com.bytedance.sdk.openadsdk.mediation.bridge.native_ad.MediationNativeAd;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class PangleNativeExpressAd {
    private boolean a;

    /* loaded from: classes.dex */
    class PangleNativeExpressedAd extends MediationNativeAd {
        TTNativeExpressAd a;
        private volatile boolean b;
        TTNativeExpressAd.ExpressAdInteractionListener c;
        TTNativeExpressAd.ExpressVideoAdListener d;

        PangleNativeExpressedAd(PangleNativeExpressAd pangleNativeExpressAd, TTNativeExpressAd tTNativeExpressAd, MediationAdLoaderImpl mediationAdLoaderImpl, Bridge bridge) {
            super(mediationAdLoaderImpl, bridge);
            Map<String, Object> mediaExtraInfo;
            this.b = false;
            this.c = new TTNativeExpressAd.ExpressAdInteractionListener() { // from class: com.bytedance.msdk.adapter.pangle.PangleNativeExpressAd.PangleNativeExpressedAd.3
                @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
                @JProtect
                public void onAdClicked(View view, int i) {
                    PangleNativeExpressedAd.this.notifyOnClickAd();
                }

                @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
                @JProtect
                public void onAdShow(View view, int i) {
                    PangleNativeExpressedAd.this.notifyOnShowAd();
                }

                @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
                @JProtect
                public void onRenderFail(View view, String str, int i) {
                    PangleNativeExpressedAd.this.notifyRenderFail(view, i, str);
                }

                @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
                @JProtect
                public void onRenderSuccess(View view, float f, float f2) {
                    PangleNativeExpressedAd.this.notifyRenderSuccess(f, f2);
                }
            };
            this.d = new TTNativeExpressAd.ExpressVideoAdListener() { // from class: com.bytedance.msdk.adapter.pangle.PangleNativeExpressAd.PangleNativeExpressedAd.4
                @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressVideoAdListener
                @JProtect
                public void onClickRetry() {
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

                /* JADX WARN: Code restructure failed: missing block: B:24:0x0026, code lost:
                    continue;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:28:0x0040, code lost:
                    continue;
                 */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
                @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressVideoAdListener
                @com.bytedance.JProtect
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void onProgressUpdate(long r3, long r5) {
                    /*
                        r2 = this;
                        com.bytedance.msdk.adapter.pangle.PangleNativeExpressAd$PangleNativeExpressedAd r0 = com.bytedance.msdk.adapter.pangle.PangleNativeExpressAd.PangleNativeExpressedAd.this
                        com.bykv.vk.openvk.api.proto.Bridge r0 = r0.mGMAd
                        if (r0 == 0) goto L45
                        com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder r0 = com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder.create()
                        r1 = 8072(0x1f88, float:1.1311E-41)
                        r0.add(r1, r3)
                        r3 = 8073(0x1f89, float:1.1313E-41)
                        r0.add(r3, r5)
                        com.bytedance.msdk.adapter.pangle.PangleNativeExpressAd$PangleNativeExpressedAd r3 = com.bytedance.msdk.adapter.pangle.PangleNativeExpressAd.PangleNativeExpressedAd.this
                        com.bykv.vk.openvk.api.proto.Bridge r3 = r3.mGMAd
                        com.bykv.vk.openvk.api.proto.ValueSet r4 = r0.build()
                        r5 = 1025(0x401, float:1.436E-42)
                        java.lang.Class<java.lang.Void> r6 = java.lang.Void.class
                        r3.call(r5, r4, r6)
                        r3 = 55
                        r4 = 0
                    L26:
                        r5 = 72
                    L28:
                        switch(r5) {
                            case 72: goto L40;
                            case 73: goto L3b;
                            case 74: goto L2c;
                            default: goto L2b;
                        }
                    L2b:
                        goto L26
                    L2c:
                        r5 = 52
                        if (r4 == r5) goto L26
                        r5 = 53
                        if (r4 == r5) goto L35
                        goto L40
                    L35:
                        switch(r3) {
                            case 29: goto L45;
                            case 30: goto L26;
                            case 31: goto L2c;
                            default: goto L38;
                        }
                    L38:
                        r3 = 30
                        goto L35
                    L3b:
                        r5 = 57
                        if (r4 > r5) goto L40
                        goto L45
                    L40:
                        r5 = 73
                        r4 = 16
                        goto L28
                    L45:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.msdk.adapter.pangle.PangleNativeExpressAd.PangleNativeExpressedAd.AnonymousClass4.onProgressUpdate(long, long):void");
                }

                @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressVideoAdListener
                @JProtect
                public void onVideoAdComplete() {
                    PangleNativeExpressedAd.this.notifyOnVideoComplete();
                }

                @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressVideoAdListener
                @JProtect
                public void onVideoAdContinuePlay() {
                    PangleNativeExpressedAd.this.notifyOnVideoResume();
                }

                @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressVideoAdListener
                @JProtect
                public void onVideoAdPaused() {
                    PangleNativeExpressedAd.this.notifyOnVideoPause();
                }

                @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressVideoAdListener
                @JProtect
                public void onVideoAdStartPlay() {
                    PangleNativeExpressedAd.this.notifyOnVideoStart();
                }

                @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressVideoAdListener
                @JProtect
                public void onVideoError(int i, int i2) {
                    PangleNativeExpressedAd pangleNativeExpressedAd = PangleNativeExpressedAd.this;
                    pangleNativeExpressedAd.notifyOnVideoError(i, "MediaPlayer inter error code:" + i2);
                }

                @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressVideoAdListener
                public void onVideoLoad() {
                }
            };
            this.a = tTNativeExpressAd;
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8033, true);
            create.add(8060, this.a.getImageMode());
            create.add(8059, this.a.getInteractionType());
            if (pangleNativeExpressAd.a && (mediaExtraInfo = tTNativeExpressAd.getMediaExtraInfo()) != null) {
                double value = PangleAdapterUtils.getValue(mediaExtraInfo.get(InAppPurchaseMetaData.KEY_PRICE));
                Logger.d("TTMediationSDK_ECMP", "pangle 模板native 返回的 cpm价格：" + value);
                create.add(8016, value <= PangleAdapterUtils.CPM_DEFLAUT_VALUE ? 0.0d : value);
            }
            notifyNativeValue(create.build());
            this.a.setExpressInteractionListener(this.c);
            this.a.setVideoAdListener(this.d);
            HashMap hashMap = new HashMap();
            hashMap.put("ad_id", Long.valueOf(getAdId()));
            hashMap.put("c_id", Long.valueOf(getCreativeId()));
            Map<String, Object> mediaExtraInfo2 = this.a.getMediaExtraInfo();
            if (mediaExtraInfo2 != null) {
                hashMap.put("log_extra", mediaExtraInfo2.toString());
            }
            MediationValueSetBuilder create2 = MediationValueSetBuilder.create();
            create2.add(8075, hashMap);
            bridge.call(8227, create2.build(), Void.class);
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.native_ad.MediationNativeAd, com.bykv.vk.openvk.api.proto.Caller
        public <T> T call(int i, ValueSet valueSet, Class<T> cls) {
            if (i == 6083) {
                render();
            } else if (i == 6081) {
                return (T) getAdView();
            } else {
                if (i == 8135) {
                    return (T) true;
                }
                if (i == 8109) {
                    onDestroy();
                } else if (i == 8120) {
                    return (T) Boolean.valueOf(hasDestroyed());
                } else {
                    if (i == 6085) {
                        setDislikeCallback((Activity) valueSet.objectValue(20033, Activity.class));
                    } else if (i == 8147) {
                        return (T) getReqId();
                    } else {
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
            }
            return (T) MediationValueUtil.checkClassType(cls);
        }

        public long getAdId() {
            TTNativeExpressAd tTNativeExpressAd = this.a;
            if (tTNativeExpressAd != null) {
                return PangleAdapterUtils.getAdId(tTNativeExpressAd.getMediaExtraInfo());
            }
            return 0L;
        }

        @JProtect
        public View getAdView() {
            TTNativeExpressAd tTNativeExpressAd = this.a;
            if (tTNativeExpressAd != null) {
                return tTNativeExpressAd.getExpressAdView();
            }
            return null;
        }

        public long getCreativeId() {
            TTNativeExpressAd tTNativeExpressAd = this.a;
            if (tTNativeExpressAd != null) {
                return PangleAdapterUtils.getCreativeId(tTNativeExpressAd.getMediaExtraInfo());
            }
            return 0L;
        }

        public Map<String, Object> getMediaExtraInfo() {
            Map<String, Object> mediaExtraInfo;
            TTNativeExpressAd tTNativeExpressAd = this.a;
            if (tTNativeExpressAd == null || (mediaExtraInfo = tTNativeExpressAd.getMediaExtraInfo()) == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(PangleAdapterUtils.MEDIA_EXTRA_COUPON, mediaExtraInfo.get(PangleAdapterUtils.MEDIA_EXTRA_COUPON));
            hashMap.put(PangleAdapterUtils.MEDIA_EXTRA_LIVE_ROOM, mediaExtraInfo.get(PangleAdapterUtils.MEDIA_EXTRA_LIVE_ROOM));
            hashMap.put(PangleAdapterUtils.MEDIA_EXTRA_PRODUCT, mediaExtraInfo.get(PangleAdapterUtils.MEDIA_EXTRA_PRODUCT));
            return hashMap;
        }

        @JProtect
        public String getReqId() {
            TTNativeExpressAd tTNativeExpressAd = this.a;
            if (tTNativeExpressAd != null) {
                return PangleAdapterUtils.getReqId(tTNativeExpressAd.getMediaExtraInfo());
            }
            return null;
        }

        public boolean hasDestroyed() {
            return this.b;
        }

        public boolean hasDislike() {
            return true;
        }

        public void onDestroy() {
            this.b = true;
            ThreadHelper.runOnUiThread(new Runnable() { // from class: com.bytedance.msdk.adapter.pangle.PangleNativeExpressAd.PangleNativeExpressedAd.1
                @Override // java.lang.Runnable
                public void run() {
                    TTNativeExpressAd tTNativeExpressAd = PangleNativeExpressedAd.this.a;
                    if (tTNativeExpressAd != null) {
                        tTNativeExpressAd.destroy();
                    }
                }
            });
        }

        @JProtect
        public void render() {
            TTNativeExpressAd tTNativeExpressAd = this.a;
            if (tTNativeExpressAd == null) {
                return;
            }
            tTNativeExpressAd.render();
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

        public void setDislikeCallback(Activity activity) {
            TTNativeExpressAd tTNativeExpressAd = this.a;
            if (tTNativeExpressAd != null) {
                tTNativeExpressAd.setDislikeCallback(activity, new TTAdDislike.DislikeInteractionCallback() { // from class: com.bytedance.msdk.adapter.pangle.PangleNativeExpressAd.PangleNativeExpressedAd.2
                    @Override // com.bytedance.sdk.openadsdk.TTAdDislike.DislikeInteractionCallback
                    public void onCancel() {
                        PangleNativeExpressedAd.this.notifyDislikeOnCancel();
                    }

                    @Override // com.bytedance.sdk.openadsdk.TTAdDislike.DislikeInteractionCallback
                    public void onSelected(int i, String str, boolean z) {
                        PangleNativeExpressedAd.this.notifyDislikeClick(str, null);
                        PangleNativeExpressedAd.this.notifyDislikeSelect(i, str);
                    }

                    @Override // com.bytedance.sdk.openadsdk.TTAdDislike.DislikeInteractionCallback
                    public void onShow() {
                        PangleNativeExpressedAd.this.notifyDislikeOnShow();
                    }
                });
            }
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.native_ad.MediationNativeAd, com.bykv.vk.openvk.api.proto.Bridge
        public ValueSet values() {
            return null;
        }
    }

    @JProtect
    public void loadAd(Context context, boolean z, TTAdNative tTAdNative, AdSlot adSlot, final MediationAdLoaderImpl mediationAdLoaderImpl) {
        if (tTAdNative == null || mediationAdLoaderImpl == null) {
            return;
        }
        this.a = z;
        tTAdNative.loadNativeExpressAd(adSlot, new TTAdNative.NativeExpressAdListener() { // from class: com.bytedance.msdk.adapter.pangle.PangleNativeExpressAd.1
            @Override // com.bytedance.sdk.openadsdk.TTAdNative.NativeExpressAdListener, com.bytedance.sdk.openadsdk.common.CommonListener
            public void onError(int i, String str) {
                mediationAdLoaderImpl.notifyAdFailed(i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.TTAdNative.NativeExpressAdListener
            public void onNativeExpressAdLoad(List<TTNativeExpressAd> list) {
                if (list == null || list.size() == 0) {
                    mediationAdLoaderImpl.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "load成功但返回广告是空");
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (TTNativeExpressAd tTNativeExpressAd : list) {
                    if (tTNativeExpressAd != null) {
                        Bridge gMBridge = mediationAdLoaderImpl.getGMBridge();
                        new PangleNativeExpressedAd(PangleNativeExpressAd.this, tTNativeExpressAd, mediationAdLoaderImpl, gMBridge);
                        arrayList.add(gMBridge);
                    }
                }
                mediationAdLoaderImpl.notifyAdSuccess(arrayList);
            }
        });
    }
}

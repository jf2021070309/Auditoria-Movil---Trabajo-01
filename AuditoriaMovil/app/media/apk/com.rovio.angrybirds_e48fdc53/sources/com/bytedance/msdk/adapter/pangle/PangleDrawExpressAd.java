package com.bytedance.msdk.adapter.pangle;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.JProtect;
import com.bytedance.msdk.adapter.util.Logger;
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
public class PangleDrawExpressAd {

    /* loaded from: classes.dex */
    private static class PangleDrawExpressedAd extends MediationNativeAd {
        private TTNativeExpressAd a;
        private boolean b;
        TTNativeExpressAd.ExpressAdInteractionListener c;
        TTNativeExpressAd.ExpressVideoAdListener d;

        PangleDrawExpressedAd(TTNativeExpressAd tTNativeExpressAd, boolean z, MediationAdLoaderImpl mediationAdLoaderImpl, Bridge bridge) {
            super(mediationAdLoaderImpl, bridge);
            Map<String, Object> mediaExtraInfo;
            this.c = new TTNativeExpressAd.ExpressAdInteractionListener() { // from class: com.bytedance.msdk.adapter.pangle.PangleDrawExpressAd.PangleDrawExpressedAd.2
                @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
                @JProtect
                public void onAdClicked(View view, int i) {
                    PangleDrawExpressedAd.this.notifyOnClickAd();
                }

                @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
                @JProtect
                public void onAdShow(View view, int i) {
                    PangleDrawExpressedAd.this.notifyOnShowAd();
                }

                @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
                @JProtect
                public void onRenderFail(View view, String str, int i) {
                    PangleDrawExpressedAd.this.notifyRenderFail(view, i, str);
                }

                @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
                @JProtect
                public void onRenderSuccess(View view, float f, float f2) {
                    PangleDrawExpressedAd.this.notifyRenderSuccess(f, f2);
                }
            };
            this.d = new TTNativeExpressAd.ExpressVideoAdListener() { // from class: com.bytedance.msdk.adapter.pangle.PangleDrawExpressAd.PangleDrawExpressedAd.3
                @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressVideoAdListener
                @JProtect
                public void onClickRetry() {
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
                        com.bytedance.msdk.adapter.pangle.PangleDrawExpressAd$PangleDrawExpressedAd r0 = com.bytedance.msdk.adapter.pangle.PangleDrawExpressAd.PangleDrawExpressedAd.this
                        com.bykv.vk.openvk.api.proto.Bridge r0 = r0.mGMAd
                        if (r0 == 0) goto L45
                        com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder r0 = com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder.create()
                        r1 = 8072(0x1f88, float:1.1311E-41)
                        r0.add(r1, r3)
                        r3 = 8073(0x1f89, float:1.1313E-41)
                        r0.add(r3, r5)
                        com.bytedance.msdk.adapter.pangle.PangleDrawExpressAd$PangleDrawExpressedAd r3 = com.bytedance.msdk.adapter.pangle.PangleDrawExpressAd.PangleDrawExpressedAd.this
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
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.msdk.adapter.pangle.PangleDrawExpressAd.PangleDrawExpressedAd.AnonymousClass3.onProgressUpdate(long, long):void");
                }

                @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressVideoAdListener
                @JProtect
                public void onVideoAdComplete() {
                    PangleDrawExpressedAd.this.notifyOnVideoComplete();
                }

                @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressVideoAdListener
                @JProtect
                public void onVideoAdContinuePlay() {
                    PangleDrawExpressedAd.this.notifyOnVideoResume();
                }

                @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressVideoAdListener
                @JProtect
                public void onVideoAdPaused() {
                    PangleDrawExpressedAd.this.notifyOnVideoPause();
                }

                @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressVideoAdListener
                @JProtect
                public void onVideoAdStartPlay() {
                    PangleDrawExpressedAd.this.notifyOnVideoStart();
                }

                @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressVideoAdListener
                @JProtect
                public void onVideoError(int i, int i2) {
                    PangleDrawExpressedAd pangleDrawExpressedAd = PangleDrawExpressedAd.this;
                    pangleDrawExpressedAd.notifyOnVideoError(i, "MediaPlayer inter error code:" + i2);
                }

                @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressVideoAdListener
                public void onVideoLoad() {
                }
            };
            this.a = tTNativeExpressAd;
            this.b = z;
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8033, true);
            create.add(8060, this.a.getImageMode());
            create.add(8059, this.a.getInteractionType());
            if (this.b && (mediaExtraInfo = tTNativeExpressAd.getMediaExtraInfo()) != null) {
                double value = PangleAdapterUtils.getValue(mediaExtraInfo.get(InAppPurchaseMetaData.KEY_PRICE));
                Logger.d("TTMediationSDK_ECMP", "pangle 模板draw 返回的 cpm价格：" + value);
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
            this.mGMAd.call(8227, create2.build(), Void.class);
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
            return tTNativeExpressAd != null ? PangleAdapterUtils.getReqId(tTNativeExpressAd.getMediaExtraInfo()) : "";
        }

        public boolean hasDestroyed() {
            return this.a == null;
        }

        public boolean hasDislike() {
            return true;
        }

        public void onDestroy() {
            TTNativeExpressAd tTNativeExpressAd = this.a;
            if (tTNativeExpressAd != null) {
                tTNativeExpressAd.destroy();
                this.a = null;
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block
            	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:817)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
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
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
            */
        @com.bytedance.JProtect
        public void render() {
            /*
                r2 = this;
                com.bytedance.sdk.openadsdk.TTNativeExpressAd r0 = r2.a
                if (r0 == 0) goto L1a
                r0.render()
                r0 = 92
            L9:
                r1 = 14
            Lb:
                switch(r1) {
                    case 13: goto L13;
                    case 14: goto L15;
                    case 15: goto Lf;
                    default: goto Le;
                }
            Le:
                goto L9
            Lf:
                switch(r0) {
                    case 94: goto L15;
                    case 95: goto L1a;
                    case 96: goto L15;
                    default: goto L12;
                }
            L12:
                goto L15
            L13:
                r1 = 72
            L15:
                r1 = 15
                r0 = 95
                goto Lb
            L1a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.msdk.adapter.pangle.PangleDrawExpressAd.PangleDrawExpressedAd.render():void");
        }

        public void setDislikeCallback(Activity activity) {
            TTNativeExpressAd tTNativeExpressAd = this.a;
            if (tTNativeExpressAd != null) {
                tTNativeExpressAd.setDislikeCallback(activity, new TTAdDislike.DislikeInteractionCallback() { // from class: com.bytedance.msdk.adapter.pangle.PangleDrawExpressAd.PangleDrawExpressedAd.1
                    @Override // com.bytedance.sdk.openadsdk.TTAdDislike.DislikeInteractionCallback
                    public void onCancel() {
                        PangleDrawExpressedAd.this.notifyDislikeOnCancel();
                    }

                    @Override // com.bytedance.sdk.openadsdk.TTAdDislike.DislikeInteractionCallback
                    public void onSelected(int i, String str, boolean z) {
                        PangleDrawExpressedAd.this.notifyDislikeClick(str, null);
                        PangleDrawExpressedAd.this.notifyDislikeSelect(i, str);
                    }

                    @Override // com.bytedance.sdk.openadsdk.TTAdDislike.DislikeInteractionCallback
                    public void onShow() {
                        PangleDrawExpressedAd.this.notifyDislikeOnShow();
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
    public void loadAd(Context context, final boolean z, TTAdNative tTAdNative, AdSlot adSlot, final MediationAdLoaderImpl mediationAdLoaderImpl) {
        if (tTAdNative == null || mediationAdLoaderImpl == null) {
            return;
        }
        tTAdNative.loadExpressDrawFeedAd(adSlot, new TTAdNative.NativeExpressAdListener(this) { // from class: com.bytedance.msdk.adapter.pangle.PangleDrawExpressAd.1
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
                        new PangleDrawExpressedAd(tTNativeExpressAd, z, mediationAdLoaderImpl, gMBridge);
                        arrayList.add(gMBridge);
                    }
                }
                mediationAdLoaderImpl.notifyAdSuccess(arrayList);
            }
        });
    }
}

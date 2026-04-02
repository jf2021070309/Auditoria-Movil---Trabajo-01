package com.bytedance.msdk.adapter.pangle;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.JProtect;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.adapter.util.TTLogUtil;
import com.bytedance.msdk.api.TTAdConstant;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTFullScreenVideoAd;
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
public class PangleFullVideoLoader extends MediationAdLoaderImpl {
    public static final String TAG = "PangleFullVideoAdapter";
    private Context a;
    private MediationAdSlotValueSet b;
    private Bridge c;

    /* loaded from: classes.dex */
    class PangleFullVideoAd extends MediationBaseAdBridge {
        private TTFullScreenVideoAd a;
        private boolean b;
        private boolean c;
        TTAdNative.FullScreenVideoAdListener d;

        PangleFullVideoAd() {
            super(PangleFullVideoLoader.this.b, PangleFullVideoLoader.this.c);
            this.d = new TTAdNative.FullScreenVideoAdListener() { // from class: com.bytedance.msdk.adapter.pangle.PangleFullVideoLoader.PangleFullVideoAd.1
                /* JADX WARN: Code restructure failed: missing block: B:19:0x000d, code lost:
                    continue;
                 */
                @Override // com.bytedance.sdk.openadsdk.TTAdNative.FullScreenVideoAdListener, com.bytedance.sdk.openadsdk.common.CommonListener
                @com.bytedance.JProtect
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void onError(int r3, java.lang.String r4) {
                    /*
                        r2 = this;
                        com.bytedance.msdk.adapter.pangle.PangleFullVideoLoader$PangleFullVideoAd r0 = com.bytedance.msdk.adapter.pangle.PangleFullVideoLoader.PangleFullVideoAd.this
                        r1 = 0
                        com.bytedance.msdk.adapter.pangle.PangleFullVideoLoader.PangleFullVideoAd.a(r0, r1)
                        com.bytedance.msdk.adapter.pangle.PangleFullVideoLoader$PangleFullVideoAd r0 = com.bytedance.msdk.adapter.pangle.PangleFullVideoLoader.PangleFullVideoAd.this
                        com.bytedance.msdk.adapter.pangle.PangleFullVideoLoader r0 = com.bytedance.msdk.adapter.pangle.PangleFullVideoLoader.this
                        r0.notifyAdFailed(r3, r4)
                    Ld:
                        r3 = 95
                        r4 = r3
                    L10:
                        switch(r3) {
                            case 94: goto L1c;
                            case 95: goto L14;
                            case 96: goto L17;
                            default: goto L13;
                        }
                    L13:
                        goto L22
                    L14:
                        switch(r4) {
                            case 94: goto Ld;
                            case 95: goto L22;
                            case 96: goto Ld;
                            default: goto L17;
                        }
                    L17:
                        r3 = 56
                        if (r4 == r3) goto L22
                        goto L21
                    L1c:
                        r3 = 39
                        if (r4 != r3) goto L21
                        goto Ld
                    L21:
                        return
                    L22:
                        r3 = 94
                        r4 = 125(0x7d, float:1.75E-43)
                        goto L10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.msdk.adapter.pangle.PangleFullVideoLoader.PangleFullVideoAd.AnonymousClass1.onError(int, java.lang.String):void");
                }

                @Override // com.bytedance.sdk.openadsdk.TTAdNative.FullScreenVideoAdListener
                @JProtect
                public void onFullScreenVideoAdLoad(TTFullScreenVideoAd tTFullScreenVideoAd) {
                    if (tTFullScreenVideoAd == null) {
                        PangleFullVideoLoader.this.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "load成功但返回广告是null");
                        return;
                    }
                    PangleFullVideoAd.this.a = tTFullScreenVideoAd;
                    MediationValueSetBuilder create = MediationValueSetBuilder.create();
                    create.add(8033, true);
                    create.add(8059, PangleFullVideoAd.this.a.getInteractionType());
                    PangleFullVideoAd.this.mGMAd.call(8140, create.build(), Void.class);
                    Map<String, Object> mediaExtraInfo = PangleFullVideoAd.this.a.getMediaExtraInfo();
                    if (PangleFullVideoLoader.this.isClientBidding() && mediaExtraInfo != null) {
                        double value = PangleAdapterUtils.getValue(mediaExtraInfo.get(InAppPurchaseMetaData.KEY_PRICE));
                        Logger.d("TTMediationSDK_ECMP", TTLogUtil.getTagThirdLevelById(PangleFullVideoLoader.this.getRitId(), PangleFullVideoLoader.this.getAdnId()) + "pangle 全屏 返回的 cpm价格：" + value);
                        PangleFullVideoAd pangleFullVideoAd = PangleFullVideoAd.this;
                        if (value <= PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
                            value = 0.0d;
                        }
                        pangleFullVideoAd.setCpm(value);
                    }
                    if (mediaExtraInfo != null) {
                        Object obj = mediaExtraInfo.get("materialMetaIsFromPreload");
                        if (obj instanceof Boolean) {
                            PangleFullVideoAd.this.c = ((Boolean) obj).booleanValue();
                            Logger.d("TTMediationSDK", "pangle 全屏 返回的adnPreload：" + PangleFullVideoAd.this.c);
                        }
                    }
                    PangleFullVideoAd.this.a.setFullScreenVideoAdInteractionListener(new TTFullScreenVideoAd.FullScreenVideoAdInteractionListener() { // from class: com.bytedance.msdk.adapter.pangle.PangleFullVideoLoader.PangleFullVideoAd.1.1
                        @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd.FullScreenVideoAdInteractionListener
                        public void onAdClose() {
                            Bridge bridge = PangleFullVideoAd.this.mGMAd;
                            if (bridge != null) {
                                bridge.call(1014, null, Void.class);
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd.FullScreenVideoAdInteractionListener
                        public void onAdShow() {
                            Bridge bridge = PangleFullVideoAd.this.mGMAd;
                            if (bridge != null) {
                                bridge.call(1008, null, Void.class);
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd.FullScreenVideoAdInteractionListener
                        public void onAdVideoBarClick() {
                            Bridge bridge = PangleFullVideoAd.this.mGMAd;
                            if (bridge != null) {
                                bridge.call(1009, null, Void.class);
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd.FullScreenVideoAdInteractionListener
                        public void onSkippedVideo() {
                            Bridge bridge = PangleFullVideoAd.this.mGMAd;
                            if (bridge != null) {
                                bridge.call(DownloadErrorCode.ERROR_TARGET_FILE_DELETE_FAILED, null, Void.class);
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd.FullScreenVideoAdInteractionListener
                        public void onVideoComplete() {
                            Bridge bridge = PangleFullVideoAd.this.mGMAd;
                            if (bridge != null) {
                                bridge.call(DownloadErrorCode.ERROR_CUR_BYTES_ZERO, null, Void.class);
                            }
                        }
                    });
                    PangleFullVideoAd.this.b = true;
                    PangleFullVideoAd pangleFullVideoAd2 = PangleFullVideoAd.this;
                    PangleFullVideoLoader.this.notifyAdSuccess(pangleFullVideoAd2, pangleFullVideoAd2.mGMAd);
                }

                @Override // com.bytedance.sdk.openadsdk.TTAdNative.FullScreenVideoAdListener
                public void onFullScreenVideoCached() {
                    Log.d("TMe", "pangle full cached");
                }

                @Override // com.bytedance.sdk.openadsdk.TTAdNative.FullScreenVideoAdListener
                @JProtect
                public void onFullScreenVideoCached(TTFullScreenVideoAd tTFullScreenVideoAd) {
                    Log.d("TMe", "pangle full cached 2");
                    PangleFullVideoAd.this.b = true;
                    PangleFullVideoAd pangleFullVideoAd = PangleFullVideoAd.this;
                    PangleFullVideoLoader.this.notifyAdCache(pangleFullVideoAd.mGMAd, 0, "");
                }
            };
        }

        public boolean adnHasAdVideoCachedApi() {
            return true;
        }

        @Override // com.bykv.vk.openvk.api.proto.Caller
        public <T> T call(int i, ValueSet valueSet, Class<T> cls) {
            if (i == 8113) {
                Log.i(PangleFullVideoLoader.TAG, "ks_KsFullVideoLoader showAd");
                Activity activity = (Activity) valueSet.objectValue(20033, Activity.class);
                Map<TTAdConstant.GroMoreExtraKey, Object> map = (Map) valueSet.objectValue(8075, Map.class);
                if (activity != null) {
                    showAd(activity, map);
                }
            } else if (i == 8109) {
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
                if (i == 8211) {
                    return (T) Boolean.valueOf(adnHasAdVideoCachedApi());
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
                if (i == 8247) {
                    return (T) Boolean.valueOf(isAdnPreload());
                }
            }
            return (T) MediationValueUtil.checkClassType(cls);
        }

        public long getAdId() {
            TTFullScreenVideoAd tTFullScreenVideoAd = this.a;
            if (tTFullScreenVideoAd != null) {
                return PangleAdapterUtils.getAdId(tTFullScreenVideoAd.getMediaExtraInfo());
            }
            return 0L;
        }

        public long getCreativeId() {
            TTFullScreenVideoAd tTFullScreenVideoAd = this.a;
            if (tTFullScreenVideoAd != null) {
                return PangleAdapterUtils.getCreativeId(tTFullScreenVideoAd.getMediaExtraInfo());
            }
            return 0L;
        }

        public Map<String, Object> getMediaExtraInfo() {
            Map<String, Object> mediaExtraInfo;
            TTFullScreenVideoAd tTFullScreenVideoAd = this.a;
            if (tTFullScreenVideoAd == null || (mediaExtraInfo = tTFullScreenVideoAd.getMediaExtraInfo()) == null) {
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
            TTFullScreenVideoAd tTFullScreenVideoAd = this.a;
            return tTFullScreenVideoAd != null ? PangleAdapterUtils.getReqId(tTFullScreenVideoAd.getMediaExtraInfo()) : "";
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public boolean hasDestroyed() {
            return this.a == null;
        }

        public boolean isAdnPreload() {
            return this.c;
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public MediationConstant.AdIsReadyStatus isReadyStatus() {
            TTFullScreenVideoAd tTFullScreenVideoAd = this.a;
            return (tTFullScreenVideoAd == null || tTFullScreenVideoAd.getExpirationTimestamp() <= System.currentTimeMillis()) ? MediationConstant.AdIsReadyStatus.AD_IS_EXPIRED : MediationConstant.AdIsReadyStatus.AD_IS_READY;
        }

        @JProtect
        public void loadAd() {
            TTAdNative createAdNative = TTAdSdk.getAdManager().createAdNative(PangleFullVideoLoader.this.a);
            AdSlot.Builder buildPangleAdSlot = PangleAdapterUtils.buildPangleAdSlot(PangleFullVideoLoader.this.b, PangleFullVideoLoader.this.getAdnId(), PangleFullVideoLoader.this.getAdm(), false);
            buildPangleAdSlot.setImageAcceptedSize(DownloadErrorCode.ERROR_TTNET_NOT_MODIFIED, 1920).setOrientation(PangleFullVideoLoader.this.b.getOrientation());
            createAdNative.loadFullScreenVideoAd(buildPangleAdSlot.build(), this.d);
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public void onDestroy() {
            TTFullScreenVideoAd tTFullScreenVideoAd = this.a;
            if (tTFullScreenVideoAd != null) {
                tTFullScreenVideoAd.setFullScreenVideoAdInteractionListener(null);
                this.a.setDownloadListener(null);
                this.a = null;
            }
        }

        @JProtect
        public void showAd(Activity activity, Map<TTAdConstant.GroMoreExtraKey, Object> map) {
            if (this.a != null) {
                TTAdConstant.RitScenes ritScenes = PangleAdapterUtils.getRitScenes(map);
                String customRitScenes = PangleAdapterUtils.getCustomRitScenes(map);
                if (ritScenes != null) {
                    this.a.showFullScreenVideoAd(activity, ritScenes, customRitScenes);
                } else {
                    this.a.showFullScreenVideoAd(activity);
                }
            }
        }

        @Override // com.bykv.vk.openvk.api.proto.Bridge
        public ValueSet values() {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl
    public void realLoader(Context context, MediationAdSlotValueSet mediationAdSlotValueSet) {
        Log.i(TAG, "MintegralFullVideoLoader realLoader adnId:" + getAdnId());
        if (context == null || mediationAdSlotValueSet == null) {
            notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "context is null or adSlotValueSet is null");
            return;
        }
        this.a = context;
        this.b = mediationAdSlotValueSet;
        this.c = getGMBridge();
        new PangleFullVideoAd().loadAd();
    }
}

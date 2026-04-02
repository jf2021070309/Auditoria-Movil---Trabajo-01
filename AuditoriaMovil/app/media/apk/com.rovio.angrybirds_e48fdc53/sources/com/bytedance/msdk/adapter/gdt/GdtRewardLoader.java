package com.bytedance.msdk.adapter.gdt;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.JProtect;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;
import com.qq.e.ads.rewardvideo.RewardVideoAD;
import com.qq.e.ads.rewardvideo.RewardVideoADListener;
import com.qq.e.ads.rewardvideo.ServerSideVerificationOptions;
import com.qq.e.comm.util.AdError;
import java.util.Map;
/* loaded from: classes.dex */
public class GdtRewardLoader extends MediationAdLoaderImpl {
    private Context a;
    private MediationAdSlotValueSet b;
    private Bridge c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class GdtRewardVideo extends MediationBaseAdBridge {
        private RewardVideoAD a;
        private boolean b;
        RewardVideoADListener c;

        GdtRewardVideo() {
            super(GdtRewardLoader.this.b, GdtRewardLoader.this.c);
            this.c = new RewardVideoADListener() { // from class: com.bytedance.msdk.adapter.gdt.GdtRewardLoader.GdtRewardVideo.1
                @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
                @JProtect
                public void onADClick() {
                    Bridge bridge = GdtRewardVideo.this.mGMAd;
                    if (bridge != null) {
                        bridge.call(8115, null, Void.class);
                    }
                }

                @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
                @JProtect
                public void onADClose() {
                    Bridge bridge = GdtRewardVideo.this.mGMAd;
                    if (bridge != null) {
                        bridge.call(8116, null, Void.class);
                    }
                }

                @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
                public void onADExpose() {
                }

                @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
                @JProtect
                public void onADLoad() {
                    GdtRewardVideo.this.b = true;
                    if (GdtRewardVideo.this.a == null) {
                        GdtRewardLoader.this.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "load成功但广告为空");
                        return;
                    }
                    if (GdtRewardLoader.this.isClientBidding()) {
                        GdtRewardVideo gdtRewardVideo = GdtRewardVideo.this;
                        gdtRewardVideo.setCpm(gdtRewardVideo.a.getECPM() != -1 ? GdtRewardVideo.this.a.getECPM() : PangleAdapterUtils.CPM_DEFLAUT_VALUE);
                    } else if (GdtRewardLoader.this.isMultiBidding()) {
                        GdtRewardVideo gdtRewardVideo2 = GdtRewardVideo.this;
                        gdtRewardVideo2.setLevelTag(gdtRewardVideo2.a.getECPMLevel());
                    } else {
                        GdtRewardLoader.this.isServerBidding();
                    }
                    GdtRewardVideo gdtRewardVideo3 = GdtRewardVideo.this;
                    GdtRewardLoader.this.notifyAdSuccess(gdtRewardVideo3, gdtRewardVideo3.mGMAd);
                }

                @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
                @JProtect
                public void onADShow() {
                    Bridge bridge = GdtRewardVideo.this.mGMAd;
                    if (bridge != null) {
                        bridge.call(8230, null, Void.class);
                    }
                }

                @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
                @JProtect
                public void onError(AdError adError) {
                    GdtRewardVideo.this.b = false;
                    if (adError == null) {
                        GdtRewardLoader.this.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "error is null");
                        return;
                    }
                    GdtRewardLoader.this.notifyAdFailed(adError.getErrorCode(), adError.getErrorMsg());
                    for (char c = 'I'; c != 'H' && c != 'J'; c = 'H') {
                    }
                }

                @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
                @JProtect
                public void onReward(Map<String, Object> map) {
                    if (GdtRewardVideo.this.mGMAd == null) {
                        return;
                    }
                    MediationValueSetBuilder create = MediationValueSetBuilder.create();
                    create.add(8017, true);
                    create.add(8018, GdtRewardLoader.this.b.getRewardAmount());
                    create.add(8019, GdtRewardLoader.this.b.getRewardName());
                    create.add(8020, map);
                    GdtRewardVideo.this.mGMAd.call(8231, create.build(), Void.class);
                    char c = '_';
                    while (true) {
                        char c2 = '^';
                        while (true) {
                            if (c2 == '`') {
                                if (c != ')') {
                                    if (c != '*') {
                                        return;
                                    }
                                }
                            }
                            c = '(';
                            c2 = '`';
                        }
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x000c, code lost:
                    continue;
                 */
                @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
                @com.bytedance.JProtect
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void onVideoCached() {
                    /*
                        r4 = this;
                        com.bytedance.msdk.adapter.gdt.GdtRewardLoader$GdtRewardVideo r0 = com.bytedance.msdk.adapter.gdt.GdtRewardLoader.GdtRewardVideo.this
                        com.bytedance.msdk.adapter.gdt.GdtRewardLoader r1 = com.bytedance.msdk.adapter.gdt.GdtRewardLoader.this
                        com.bykv.vk.openvk.api.proto.Bridge r0 = r0.mGMAd
                        r2 = -1
                        java.lang.String r3 = ""
                        r1.notifyAdCache(r0, r2, r3)
                    Lc:
                        r0 = 95
                        r1 = r0
                    Lf:
                        switch(r0) {
                            case 94: goto L1a;
                            case 95: goto L13;
                            case 96: goto L16;
                            default: goto L12;
                        }
                    L12:
                        goto L20
                    L13:
                        switch(r1) {
                            case 94: goto Lc;
                            case 95: goto L20;
                            case 96: goto Lc;
                            default: goto L16;
                        }
                    L16:
                        switch(r1) {
                            case 55: goto L20;
                            case 56: goto L20;
                            case 57: goto L20;
                            default: goto L19;
                        }
                    L19:
                        goto L1f
                    L1a:
                        r0 = 39
                        if (r1 != r0) goto L1f
                        goto Lc
                    L1f:
                        return
                    L20:
                        r0 = 94
                        r1 = 125(0x7d, float:1.75E-43)
                        goto Lf
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.msdk.adapter.gdt.GdtRewardLoader.GdtRewardVideo.AnonymousClass1.onVideoCached():void");
                }

                @Override // com.qq.e.ads.rewardvideo.RewardVideoADListener
                @JProtect
                public void onVideoComplete() {
                    Bridge bridge = GdtRewardVideo.this.mGMAd;
                    if (bridge != null) {
                        bridge.call(8118, null, Void.class);
                    }
                }
            };
        }

        @JProtect
        void a() {
            boolean z = !GdtRewardLoader.this.b.isMuted();
            this.a = !TextUtils.isEmpty(GdtRewardLoader.this.getAdm()) ? new RewardVideoAD(GdtRewardLoader.this.a, GdtRewardLoader.this.getAdnId(), this.c, z, GdtRewardLoader.this.getAdm()) : new RewardVideoAD(GdtRewardLoader.this.a, GdtRewardLoader.this.getAdnId(), this.c, z);
            ServerSideVerificationOptions.Builder builder = new ServerSideVerificationOptions.Builder();
            String userId = GdtRewardLoader.this.b.getUserId();
            if (userId != null) {
                builder.setUserId(userId);
            }
            Map<String, Object> extraObject = GdtRewardLoader.this.b.getExtraObject();
            String str = null;
            if (extraObject != null && extraObject.get("gdt") != null) {
                str = String.valueOf(extraObject.get("gdt"));
                builder.setCustomData(str);
            }
            if (userId != null || !TextUtils.isEmpty(str)) {
                this.a.setServerSideVerificationOptions(builder.build());
            }
            this.a.loadAD();
        }

        public boolean adnHasAdVideoCachedApi() {
            return true;
        }

        public void bidLoseNotify(Map<String, Object> map) {
            if (!GdtRewardLoader.this.isClientBidding() || this.a == null || map == null) {
                return;
            }
            try {
                Object obj = map.get(MediationConstant.BIDDING_LOSE_REASON);
                if (obj instanceof MediationConstant.BiddingLossReason) {
                    this.a.sendLossNotification(0, GDTAdapterUtils.getBiddingLossReason((MediationConstant.BiddingLossReason) obj), null);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void bidWinNotify(Map<String, Object> map) {
            RewardVideoAD rewardVideoAD;
            if (GdtRewardLoader.this.isClientBidding() && (rewardVideoAD = this.a) != null) {
                try {
                    rewardVideoAD.sendWinNotification((int) getCpm());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        @Override // com.bykv.vk.openvk.api.proto.Caller
        public <T> T call(int i, ValueSet valueSet, Class<T> cls) {
            boolean adnHasAdVideoCachedApi;
            if (i == 8113) {
                Activity activity = (Activity) valueSet.objectValue(20033, Activity.class);
                if (activity != null) {
                    showAd(activity);
                }
            } else if (i != 8109) {
                if (i == 8120) {
                    adnHasAdVideoCachedApi = hasDestroyed();
                } else if (i == 8121) {
                    return (T) isReadyStatus();
                } else {
                    if (i == 8211) {
                        adnHasAdVideoCachedApi = adnHasAdVideoCachedApi();
                    } else if (i == 8142) {
                        Log.i("GdtRewardVideoAdapter", "GdtSplashLoader bidWinNotify");
                        Map<String, Object> map = (Map) valueSet.objectValue(8006, Map.class);
                        if (map != null) {
                            bidWinNotify(map);
                        }
                    } else if (i == 8144) {
                        Log.i("GdtRewardVideoAdapter", "GdtSplashLoader bidLoseNotify");
                        Map<String, Object> map2 = (Map) valueSet.objectValue(8006, Map.class);
                        if (map2 != null) {
                            bidLoseNotify(map2);
                        }
                    }
                }
                return (T) Boolean.valueOf(adnHasAdVideoCachedApi);
            } else {
                onDestroy();
            }
            return (T) MediationValueUtil.checkClassType(cls);
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public boolean hasDestroyed() {
            return this.a == null;
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public MediationConstant.AdIsReadyStatus isReadyStatus() {
            RewardVideoAD rewardVideoAD = this.a;
            return (rewardVideoAD == null || !rewardVideoAD.isValid()) ? MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY : MediationConstant.AdIsReadyStatus.AD_IS_READY;
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public void onDestroy() {
            if (this.a != null) {
                this.a = null;
            }
        }

        @JProtect
        public void showAd(Activity activity) {
            if (this.a != null) {
                if (GdtRewardLoader.this.isServerBidding()) {
                    RewardVideoAD rewardVideoAD = this.a;
                    rewardVideoAD.setBidECPM(rewardVideoAD.getECPM());
                }
                this.a.showAD(activity);
                for (char c = 'I'; c != 'H' && c != 'J'; c = 'H') {
                }
            }
        }

        @Override // com.bykv.vk.openvk.api.proto.Bridge
        public ValueSet values() {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001c A[SYNTHETIC] */
    @com.bytedance.JProtect
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a() {
        /*
            r4 = this;
            com.bytedance.msdk.adapter.gdt.GdtRewardLoader$GdtRewardVideo r0 = new com.bytedance.msdk.adapter.gdt.GdtRewardLoader$GdtRewardVideo
            r0.<init>()
            r0.a()
        L8:
            r0 = 94
            r1 = 75
            r2 = 93
        Le:
            r3 = 92
            if (r0 == r3) goto L15
            if (r0 == r2) goto L18
            goto L1d
        L15:
            switch(r1) {
                case 21: goto L1d;
                case 22: goto L1d;
                case 23: goto L1d;
                default: goto L18;
            }
        L18:
            switch(r1) {
                case 91: goto L8;
                case 92: goto L1d;
                case 93: goto L1c;
                default: goto L1b;
            }
        L1b:
            goto L20
        L1c:
            return
        L1d:
            r0 = r2
            r1 = r0
            goto Le
        L20:
            r1 = 91
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.msdk.adapter.gdt.GdtRewardLoader.a():void");
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl
    public void realLoader(Context context, MediationAdSlotValueSet mediationAdSlotValueSet) {
        if (context == null || mediationAdSlotValueSet == null) {
            notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "context is null or adSlotValueSet is null");
            return;
        }
        this.a = context;
        this.b = mediationAdSlotValueSet;
        this.c = getGMBridge();
        a();
    }
}

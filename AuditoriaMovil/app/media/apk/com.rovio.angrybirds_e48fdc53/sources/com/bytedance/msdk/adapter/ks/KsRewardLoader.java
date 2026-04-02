package com.bytedance.msdk.adapter.ks;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.bytedance.msdk.api.AdError;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;
import com.kwad.sdk.api.KsAdSDK;
import com.kwad.sdk.api.KsLoadManager;
import com.kwad.sdk.api.KsRewardVideoAd;
import com.kwad.sdk.api.KsScene;
import com.kwad.sdk.api.KsVideoPlayConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class KsRewardLoader extends KsBaseLoader {

    /* loaded from: classes.dex */
    static class KsRewardVideo extends MediationBaseAdBridge {
        private KsRewardVideoAd a;
        private KsRewardLoader b;
        private Bridge c;
        private MediationAdSlotValueSet d;
        KsLoadManager.RewardVideoAdListener e;

        public KsRewardVideo(KsRewardLoader ksRewardLoader, MediationAdSlotValueSet mediationAdSlotValueSet, Bridge bridge) {
            super(mediationAdSlotValueSet, bridge);
            this.e = new KsLoadManager.RewardVideoAdListener() { // from class: com.bytedance.msdk.adapter.ks.KsRewardLoader.KsRewardVideo.1
                @Override // com.kwad.sdk.api.KsLoadManager.RewardVideoAdListener
                public void onError(int i, String str) {
                    Log.i("KsRewardLoader", "load fail");
                    KsRewardVideo.this.b.notifyAdFailed(i, str);
                }

                @Override // com.kwad.sdk.api.KsLoadManager.RewardVideoAdListener
                public void onRewardVideoAdLoad(List<KsRewardVideoAd> list) {
                    if (list == null || list.size() == 0 || list.get(0) == null) {
                        KsRewardVideo.this.b.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "广告位空");
                        return;
                    }
                    KsRewardVideo.this.a = list.get(0);
                    MediationValueSetBuilder create = MediationValueSetBuilder.create();
                    if (KsRewardVideo.this.b.isClientBidding()) {
                        double ecpm = KsRewardVideo.this.a.getECPM();
                        double d = PangleAdapterUtils.CPM_DEFLAUT_VALUE;
                        if (ecpm > PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
                            d = ecpm;
                        }
                        create.add(8016, d);
                        KsRewardVideo.this.setCpm(ecpm);
                    }
                    KsRewardVideo.this.a.setRewardAdInteractionListener(new KsRewardVideoAd.RewardAdInteractionListener() { // from class: com.bytedance.msdk.adapter.ks.KsRewardLoader.KsRewardVideo.1.1
                        @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
                        public void onAdClicked() {
                            Log.i("KsRewardLoader", "onAdClicked");
                            if (KsRewardVideo.this.c != null) {
                                KsRewardVideo.this.c.call(8115, null, Void.class);
                            }
                        }

                        @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
                        public void onExtraRewardVerify(int i) {
                            Log.i("KsRewardLoader", "onExtraRewardVerify");
                        }

                        @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
                        public void onPageDismiss() {
                            Log.i("KsRewardLoader", "onPageDismiss");
                            if (KsRewardVideo.this.c != null) {
                                KsRewardVideo.this.c.call(8116, null, Void.class);
                            }
                        }

                        @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
                        public void onRewardStepVerify(int i, int i2) {
                            Log.i("KsRewardLoader", "onRewardStepVerify");
                        }

                        @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
                        public void onRewardVerify() {
                            Log.i("KsRewardLoader", "onRewardVerify");
                            if (KsRewardVideo.this.c != null) {
                                MediationValueSetBuilder create2 = MediationValueSetBuilder.create();
                                create2.add(8017, true);
                                create2.add(8018, KsRewardVideo.this.d.getRewardAmount());
                                create2.add(8019, KsRewardVideo.this.d.getRewardName());
                                KsRewardVideo.this.c.call(8231, create2.build(), Void.class);
                            }
                        }

                        @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
                        public void onVideoPlayEnd() {
                            Log.i("KsRewardLoader", "onVideoPlayEnd");
                            if (KsRewardVideo.this.c != null) {
                                KsRewardVideo.this.c.call(8118, null, Void.class);
                            }
                        }

                        @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
                        public void onVideoPlayError(int i, int i2) {
                            Log.i("KsRewardLoader", "onVideoPlayError");
                            if (KsRewardVideo.this.c != null) {
                                KsRewardVideo.this.c.call(8117, null, Void.class);
                            }
                        }

                        @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
                        public void onVideoPlayStart() {
                            Log.i("KsRewardLoader", "onVideoPlayStart");
                            if (KsRewardVideo.this.c != null) {
                                KsRewardVideo.this.c.call(8230, null, Void.class);
                            }
                        }

                        @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
                        public void onVideoSkipToEnd(long j) {
                            Log.i("KsRewardLoader", "onVideoSkipToEnd");
                            if (KsRewardVideo.this.c != null) {
                                KsRewardVideo.this.c.call(8119, null, Void.class);
                            }
                        }
                    });
                    KsRewardVideo.this.a.setRewardPlayAgainInteractionListener(new KsRewardVideoAd.RewardAdInteractionListener() { // from class: com.bytedance.msdk.adapter.ks.KsRewardLoader.KsRewardVideo.1.2
                        @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
                        public void onAdClicked() {
                            Log.i("KsRewardLoader", "play again onAdClicked");
                            if (KsRewardVideo.this.c != null) {
                                KsRewardVideo.this.c.call(8232, null, Void.class);
                            }
                        }

                        @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
                        public void onExtraRewardVerify(int i) {
                            Log.i("KsRewardLoader", "play again onExtraRewardVerify");
                        }

                        @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
                        public void onPageDismiss() {
                            Log.i("KsRewardLoader", "play again onPageDismiss");
                            if (KsRewardVideo.this.c != null) {
                                KsRewardVideo.this.c.call(8233, null, Void.class);
                            }
                        }

                        @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
                        public void onRewardStepVerify(int i, int i2) {
                            Log.i("KsRewardLoader", "play again onRewardStepVerify");
                        }

                        @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
                        public void onRewardVerify() {
                            Log.i("KsRewardLoader", "play again onRewardVerify");
                            if (KsRewardVideo.this.c != null) {
                                MediationValueSetBuilder create2 = MediationValueSetBuilder.create();
                                create2.add(8017, true);
                                create2.add(8018, KsRewardVideo.this.d.getRewardAmount());
                                create2.add(8019, KsRewardVideo.this.d.getRewardName());
                                KsRewardVideo.this.c.call(8238, create2.build(), Void.class);
                            }
                        }

                        @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
                        public void onVideoPlayEnd() {
                            Log.i("KsRewardLoader", "play again onVideoPlayEnd");
                            if (KsRewardVideo.this.c != null) {
                                KsRewardVideo.this.c.call(8235, null, Void.class);
                            }
                        }

                        @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
                        public void onVideoPlayError(int i, int i2) {
                            Log.i("KsRewardLoader", "play again onVideoPlayError");
                            if (KsRewardVideo.this.c != null) {
                                KsRewardVideo.this.c.call(8234, null, Void.class);
                            }
                        }

                        @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
                        public void onVideoPlayStart() {
                            Log.i("KsRewardLoader", "play again onVideoPlayStart");
                            if (KsRewardVideo.this.c != null) {
                                KsRewardVideo.this.c.call(8237, null, Void.class);
                            }
                        }

                        @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
                        public void onVideoSkipToEnd(long j) {
                            Log.i("KsRewardLoader", "play again onVideoSkipToEnd");
                            if (KsRewardVideo.this.c != null) {
                                KsRewardVideo.this.c.call(8236, null, Void.class);
                            }
                        }
                    });
                    if (KsRewardVideo.this.b != null) {
                        Log.i("KsRewardLoader", AdError.AD_LOAD_SUCCESS_MSG);
                        KsRewardLoader ksRewardLoader2 = KsRewardVideo.this.b;
                        KsRewardVideo ksRewardVideo = KsRewardVideo.this;
                        ksRewardLoader2.notifyAdSuccess(ksRewardVideo, ksRewardVideo.c);
                    }
                    if (KsRewardVideo.this.b != null) {
                        Log.i("KsRewardLoader", "cache success");
                        KsRewardVideo.this.b.notifyAdCache(KsRewardVideo.this.c, MediationConstant.ErrorCode.ADN_AD_NO_CACHE, "没有cache回调");
                    }
                }

                @Override // com.kwad.sdk.api.KsLoadManager.RewardVideoAdListener
                public void onRewardVideoResult(List<KsRewardVideoAd> list) {
                }
            };
            this.b = ksRewardLoader;
            this.d = mediationAdSlotValueSet;
            this.c = bridge;
            a();
        }

        private void a() {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8035, this);
            this.c.call(8128, create.build(), Void.class);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(KsScene ksScene) {
            if (KsAdSDK.getLoadManager() != null) {
                KsAdSDK.getLoadManager().loadRewardVideoAd(ksScene, this.e);
            }
        }

        @Override // com.bykv.vk.openvk.api.proto.Caller
        public <T> T call(int i, ValueSet valueSet, Class<T> cls) {
            if (i == 8113) {
                Activity activity = (Activity) valueSet.objectValue(20033, Activity.class);
                if (activity != null) {
                    showAd(activity);
                }
            } else if (i == 8109) {
                onDestroy();
            } else if (i == 8120) {
                return (T) Boolean.valueOf(hasDestroyed());
            } else {
                if (i == 8121) {
                    return (T) isReadyStatus();
                }
            }
            return (T) MediationValueUtil.checkClassType(cls);
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public boolean hasDestroyed() {
            return this.a == null;
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public MediationConstant.AdIsReadyStatus isReadyStatus() {
            KsRewardVideoAd ksRewardVideoAd = this.a;
            return (ksRewardVideoAd == null || !ksRewardVideoAd.isAdEnable()) ? MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY : MediationConstant.AdIsReadyStatus.AD_IS_READY;
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public void onDestroy() {
            KsRewardVideoAd ksRewardVideoAd = this.a;
            if (ksRewardVideoAd != null) {
                ksRewardVideoAd.setRewardAdInteractionListener(null);
                this.a = null;
            }
        }

        public void showAd(Activity activity) {
            if (this.a != null) {
                KsVideoPlayConfig.Builder builder = new KsVideoPlayConfig.Builder();
                MediationAdSlotValueSet mediationAdSlotValueSet = this.d;
                boolean isMuted = mediationAdSlotValueSet != null ? mediationAdSlotValueSet.isMuted() : false;
                MediationAdSlotValueSet mediationAdSlotValueSet2 = this.d;
                if (mediationAdSlotValueSet2 != null && mediationAdSlotValueSet2.getOrientation() == 2) {
                    builder.showLandscape(true);
                }
                builder.videoSoundEnable(!isMuted);
                this.a.showRewardVideoAd(activity, builder.build());
            }
        }

        @Override // com.bykv.vk.openvk.api.proto.Bridge
        public ValueSet values() {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl
    public void realLoader(Context context, MediationAdSlotValueSet mediationAdSlotValueSet) {
        Log.i("yyy", "开始加载ks激励视频");
        try {
            KsScene.Builder builder = new KsScene.Builder(Long.valueOf(mediationAdSlotValueSet.getADNId()).longValue());
            HashMap hashMap = new HashMap();
            String userId = mediationAdSlotValueSet.getUserId();
            if (userId != null) {
                hashMap.put("thirdUserId", userId);
            }
            Map<String, Object> extraObject = mediationAdSlotValueSet.getExtraObject();
            if (extraObject != null && extraObject.get("ks") != null) {
                hashMap.put("extraData", String.valueOf(extraObject.get("ks")));
            }
            if (hashMap.size() > 0) {
                builder.rewardCallbackExtraData(hashMap);
            }
            new KsRewardVideo(this, mediationAdSlotValueSet, getGMBridge()).a(builder.build());
        } catch (Exception e) {
            notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "代码位不合法");
        }
    }
}

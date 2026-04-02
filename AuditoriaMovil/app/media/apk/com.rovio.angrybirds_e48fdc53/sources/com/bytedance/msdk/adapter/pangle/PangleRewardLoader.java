package com.bytedance.msdk.adapter.pangle;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.adapter.util.TTLogUtil;
import com.bytedance.msdk.api.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class PangleRewardLoader extends MediationAdLoaderImpl {
    public static final String TAG = "PgRewardVideoAdapter";
    public static final String VERSION_00 = "0.0";
    public static final String VERSION_4400 = "4.4.0.0";
    private PangleRewardVideo a;
    private Context b;
    private MediationAdSlotValueSet c;
    private Bridge d;

    /* loaded from: classes.dex */
    class PangleRewardVideo extends MediationBaseAdBridge {
        private TTRewardVideoAd a;
        private boolean b;
        private boolean c;
        TTAdNative.RewardVideoAdListener d;

        PangleRewardVideo() {
            super(PangleRewardLoader.this.c, PangleRewardLoader.this.d);
            this.d = new TTAdNative.RewardVideoAdListener() { // from class: com.bytedance.msdk.adapter.pangle.PangleRewardLoader.PangleRewardVideo.1
                @Override // com.bytedance.sdk.openadsdk.TTAdNative.RewardVideoAdListener, com.bytedance.sdk.openadsdk.common.CommonListener
                public void onError(int i, String str) {
                    Logger.e("TTMediationSDK", "pangle_reward_onError code:" + i + "  message:" + str);
                    PangleRewardVideo.this.b = false;
                    PangleRewardLoader.this.notifyAdFailed(i, str);
                }

                @Override // com.bytedance.sdk.openadsdk.TTAdNative.RewardVideoAdListener
                public void onRewardVideoAdLoad(TTRewardVideoAd tTRewardVideoAd) {
                    Logger.e("TTMediationSDK", "pangle_reward_onRewardVideoAdLoad");
                    if (tTRewardVideoAd == null) {
                        PangleRewardLoader.this.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "load成功但返回广告是null");
                        return;
                    }
                    PangleRewardVideo.this.a = tTRewardVideoAd;
                    MediationValueSetBuilder create = MediationValueSetBuilder.create();
                    create.add(8033, true);
                    create.add(8059, PangleRewardVideo.this.a.getInteractionType());
                    PangleRewardVideo.this.mGMAd.call(8140, create.build(), Void.class);
                    Map<String, Object> mediaExtraInfo = PangleRewardVideo.this.a.getMediaExtraInfo();
                    if (PangleRewardLoader.this.isClientBidding() && mediaExtraInfo != null) {
                        double value = PangleAdapterUtils.getValue(mediaExtraInfo.get(InAppPurchaseMetaData.KEY_PRICE));
                        Logger.d("TTMediationSDK_ECMP", TTLogUtil.getTagThirdLevelById(PangleRewardLoader.this.getRitId(), PangleRewardLoader.this.getAdnId()) + "pangle reward 返回的 cpm价格：" + value);
                        PangleRewardVideo pangleRewardVideo = PangleRewardVideo.this;
                        if (value <= PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
                            value = 0.0d;
                        }
                        pangleRewardVideo.setCpm(value);
                    }
                    if (mediaExtraInfo != null) {
                        Object obj = mediaExtraInfo.get("materialMetaIsFromPreload");
                        if (obj instanceof Boolean) {
                            PangleRewardVideo.this.c = ((Boolean) obj).booleanValue();
                            Logger.d("TTMediationSDK", "pangle 激励 返回的adnPreload：" + PangleRewardVideo.this.c);
                        }
                    }
                    PangleRewardVideo.this.b = true;
                    PangleRewardVideo.this.a.setRewardPlayAgainInteractionListener(new TTRewardVideoAd.RewardAdInteractionListener() { // from class: com.bytedance.msdk.adapter.pangle.PangleRewardLoader.PangleRewardVideo.1.1
                        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
                        public void onAdClose() {
                            Logger.e("TTMediationSDK", "pangle_reward:onAdClose-----------2");
                            Bridge bridge = PangleRewardVideo.this.mGMAd;
                            if (bridge != null) {
                                bridge.call(8233, null, Void.class);
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
                        public void onAdShow() {
                            Logger.e("TTMediationSDK", "pangle_reward:onAdShow-----------2");
                            Bridge bridge = PangleRewardVideo.this.mGMAd;
                            if (bridge != null) {
                                bridge.call(8237, null, Void.class);
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
                        public void onAdVideoBarClick() {
                            Logger.e("TTMediationSDK", "pangle_reward:onAdVideoBarClick---------2");
                            Bridge bridge = PangleRewardVideo.this.mGMAd;
                            if (bridge != null) {
                                bridge.call(8232, null, Void.class);
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
                        public void onRewardArrived(boolean z, int i, Bundle bundle) {
                            if (PangleRewardVideo.this.c()) {
                                return;
                            }
                            Logger.e("TTMediationSDK", "pangle_reward:onRewardArrived-------------2");
                            if (PangleRewardVideo.this.mGMAd != null) {
                                MediationValueSetBuilder create2 = MediationValueSetBuilder.create();
                                create2.add(8017, z);
                                create2.add(8018, bundle != null ? bundle.getInt(TTRewardVideoAd.REWARD_EXTRA_KEY_REWARD_AMOUNT) : 0);
                                create2.add(8019, bundle != null ? bundle.getString(TTRewardVideoAd.REWARD_EXTRA_KEY_REWARD_NAME) : "");
                                HashMap hashMap = new HashMap();
                                hashMap.put("extraInfo", bundle);
                                hashMap.put("rewardType", Integer.valueOf(i));
                                create2.add(8020, hashMap);
                                PangleRewardVideo.this.mGMAd.call(8238, create2.build(), Void.class);
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
                        @Deprecated
                        public void onRewardVerify(boolean z, int i, String str, int i2, String str2) {
                            if (PangleRewardVideo.this.c()) {
                                Logger.e("TTMediationSDK", "pangle_reward:onRewardVerify-------------2");
                                if (PangleRewardVideo.this.mGMAd != null) {
                                    MediationValueSetBuilder create2 = MediationValueSetBuilder.create();
                                    create2.add(8017, z);
                                    create2.add(8018, i);
                                    create2.add(8019, str);
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("errorCode", Integer.valueOf(i2));
                                    hashMap.put("errorMsg", str2);
                                    create2.add(8020, hashMap);
                                    PangleRewardVideo.this.mGMAd.call(8238, create2.build(), Void.class);
                                }
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
                        public void onSkippedVideo() {
                            Logger.e("TTMediationSDK", "pangle_reward:onSkippedVideo-------------2");
                            Bridge bridge = PangleRewardVideo.this.mGMAd;
                            if (bridge != null) {
                                bridge.call(8236, null, Void.class);
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
                        public void onVideoComplete() {
                            Logger.e("TTMediationSDK", "pangle_reward:onVideoComplete----------2");
                            Bridge bridge = PangleRewardVideo.this.mGMAd;
                            if (bridge != null) {
                                bridge.call(8235, null, Void.class);
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
                        public void onVideoError() {
                            Logger.e("TTMediationSDK", "pangle_reward:onVideoError-----------2");
                            Bridge bridge = PangleRewardVideo.this.mGMAd;
                            if (bridge != null) {
                                bridge.call(8234, null, Void.class);
                            }
                        }
                    });
                    PangleRewardVideo.this.a.setRewardAdInteractionListener(new TTRewardVideoAd.RewardAdInteractionListener() { // from class: com.bytedance.msdk.adapter.pangle.PangleRewardLoader.PangleRewardVideo.1.2
                        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
                        public void onAdClose() {
                            Logger.e("TTMediationSDK", "pangle_reward:onAdClose");
                            Bridge bridge = PangleRewardVideo.this.mGMAd;
                            if (bridge != null) {
                                bridge.call(8116, null, Void.class);
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
                        public void onAdShow() {
                            Logger.e("TTMediationSDK", "pangle_reward:onAdShow");
                            Bridge bridge = PangleRewardVideo.this.mGMAd;
                            if (bridge != null) {
                                bridge.call(8230, null, Void.class);
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
                        public void onAdVideoBarClick() {
                            Logger.e("TTMediationSDK", "pangle_reward:onAdVideoBarClick");
                            Bridge bridge = PangleRewardVideo.this.mGMAd;
                            if (bridge != null) {
                                bridge.call(8115, null, Void.class);
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
                        public void onRewardArrived(boolean z, int i, Bundle bundle) {
                            if (PangleRewardVideo.this.c()) {
                                return;
                            }
                            Logger.e("TTMediationSDK", "pangle_reward:onRewardArrived");
                            if (PangleRewardVideo.this.mGMAd != null) {
                                MediationValueSetBuilder create2 = MediationValueSetBuilder.create();
                                create2.add(8017, z);
                                create2.add(8018, bundle != null ? bundle.getInt(TTRewardVideoAd.REWARD_EXTRA_KEY_REWARD_AMOUNT) : 0);
                                create2.add(8019, bundle != null ? bundle.getString(TTRewardVideoAd.REWARD_EXTRA_KEY_REWARD_NAME) : "");
                                HashMap hashMap = new HashMap();
                                hashMap.put("extraInfo", bundle);
                                hashMap.put("rewardType", Integer.valueOf(i));
                                create2.add(8020, hashMap);
                                PangleRewardVideo.this.mGMAd.call(8231, create2.build(), Void.class);
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
                        @Deprecated
                        public void onRewardVerify(boolean z, int i, String str, int i2, String str2) {
                            if (PangleRewardVideo.this.c()) {
                                Logger.e("TTMediationSDK", "pangle_reward:onRewardVerify");
                                if (PangleRewardVideo.this.mGMAd != null) {
                                    MediationValueSetBuilder create2 = MediationValueSetBuilder.create();
                                    create2.add(8017, z);
                                    create2.add(8018, i);
                                    create2.add(8019, str);
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("errorCode", Integer.valueOf(i2));
                                    hashMap.put("errorMsg", str2);
                                    create2.add(8020, hashMap);
                                    PangleRewardVideo.this.mGMAd.call(8231, create2.build(), Void.class);
                                }
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
                        public void onSkippedVideo() {
                            Logger.e("TTMediationSDK", "pangle_reward:onSkippedVideo");
                            Bridge bridge = PangleRewardVideo.this.mGMAd;
                            if (bridge != null) {
                                bridge.call(8119, null, Void.class);
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
                        public void onVideoComplete() {
                            Logger.e("TTMediationSDK", "pangle_reward:onVideoComplete");
                            Bridge bridge = PangleRewardVideo.this.mGMAd;
                            if (bridge != null) {
                                bridge.call(8118, null, Void.class);
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
                        public void onVideoError() {
                            Logger.e("TTMediationSDK", "pangle_reward:onVideoError");
                            Bridge bridge = PangleRewardVideo.this.mGMAd;
                            if (bridge != null) {
                                bridge.call(8117, null, Void.class);
                            }
                        }
                    });
                    PangleRewardVideo pangleRewardVideo2 = PangleRewardVideo.this;
                    PangleRewardLoader.this.notifyAdSuccess(pangleRewardVideo2, pangleRewardVideo2.mGMAd);
                }

                @Override // com.bytedance.sdk.openadsdk.TTAdNative.RewardVideoAdListener
                public void onRewardVideoCached() {
                    Logger.e("TTMediationSDK", "pangle_reward_onRewardVideoCached");
                }

                @Override // com.bytedance.sdk.openadsdk.TTAdNative.RewardVideoAdListener
                public void onRewardVideoCached(TTRewardVideoAd tTRewardVideoAd) {
                    Logger.e("TTMediationSDK", "pangle_reward_onRewardVideoCached 2");
                    PangleRewardVideo pangleRewardVideo = PangleRewardVideo.this;
                    PangleRewardLoader.this.notifyAdCache(pangleRewardVideo.mGMAd, 0, "");
                }
            };
        }

        private boolean a() {
            return this.c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0028, code lost:
            if (android.text.TextUtils.isEmpty(r1) == false) goto L5;
         */
        @com.bytedance.JProtect
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void b() {
            /*
                r6 = this;
                com.bytedance.sdk.openadsdk.TTAdManager r0 = com.bytedance.sdk.openadsdk.TTAdSdk.getAdManager()
                com.bytedance.msdk.adapter.pangle.PangleRewardLoader r1 = com.bytedance.msdk.adapter.pangle.PangleRewardLoader.this
                android.content.Context r1 = com.bytedance.msdk.adapter.pangle.PangleRewardLoader.c(r1)
                com.bytedance.sdk.openadsdk.TTAdNative r0 = r0.createAdNative(r1)
                com.bytedance.msdk.adapter.pangle.PangleRewardLoader r1 = com.bytedance.msdk.adapter.pangle.PangleRewardLoader.this
                com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet r1 = com.bytedance.msdk.adapter.pangle.PangleRewardLoader.a(r1)
                java.util.Map r1 = r1.getExtraObject()
                if (r1 == 0) goto L2b
                java.lang.String r2 = "pangle"
                java.lang.Object r1 = r1.get(r2)
                java.lang.String r1 = java.lang.String.valueOf(r1)
                boolean r2 = android.text.TextUtils.isEmpty(r1)
                if (r2 != 0) goto L2b
                goto L2d
            L2b:
                java.lang.String r1 = ""
            L2d:
                com.bytedance.msdk.adapter.pangle.PangleRewardLoader r2 = com.bytedance.msdk.adapter.pangle.PangleRewardLoader.this
                com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet r2 = com.bytedance.msdk.adapter.pangle.PangleRewardLoader.a(r2)
                com.bytedance.msdk.adapter.pangle.PangleRewardLoader r3 = com.bytedance.msdk.adapter.pangle.PangleRewardLoader.this
                java.lang.String r3 = r3.getAdnId()
                com.bytedance.msdk.adapter.pangle.PangleRewardLoader r4 = com.bytedance.msdk.adapter.pangle.PangleRewardLoader.this
                java.lang.String r4 = r4.getAdm()
                r5 = 0
                com.bytedance.sdk.openadsdk.AdSlot$Builder r2 = com.bytedance.msdk.adapter.pangle.PangleAdapterUtils.buildPangleAdSlot(r2, r3, r4, r5)
                com.bytedance.msdk.adapter.pangle.PangleRewardLoader r3 = com.bytedance.msdk.adapter.pangle.PangleRewardLoader.this
                com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet r3 = com.bytedance.msdk.adapter.pangle.PangleRewardLoader.a(r3)
                java.lang.String r3 = r3.getUserId()
                com.bytedance.sdk.openadsdk.AdSlot$Builder r3 = r2.setUserID(r3)
                com.bytedance.sdk.openadsdk.AdSlot$Builder r1 = r3.setMediaExtra(r1)
                r3 = 1080(0x438, float:1.513E-42)
                r4 = 1920(0x780, float:2.69E-42)
                com.bytedance.sdk.openadsdk.AdSlot$Builder r1 = r1.setImageAcceptedSize(r3, r4)
                com.bytedance.msdk.adapter.pangle.PangleRewardLoader r3 = com.bytedance.msdk.adapter.pangle.PangleRewardLoader.this
                com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet r3 = com.bytedance.msdk.adapter.pangle.PangleRewardLoader.a(r3)
                int r3 = r3.getOrientation()
                r1.setOrientation(r3)
                com.bytedance.msdk.adapter.pangle.PangleRewardLoader r1 = com.bytedance.msdk.adapter.pangle.PangleRewardLoader.this     // Catch: java.lang.Throwable -> La2
                com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet r1 = com.bytedance.msdk.adapter.pangle.PangleRewardLoader.a(r1)     // Catch: java.lang.Throwable -> La2
                java.lang.String r1 = r1.getRewardName()     // Catch: java.lang.Throwable -> La2
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> La2
                if (r1 != 0) goto L88
                com.bytedance.msdk.adapter.pangle.PangleRewardLoader r1 = com.bytedance.msdk.adapter.pangle.PangleRewardLoader.this     // Catch: java.lang.Throwable -> La2
                com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet r1 = com.bytedance.msdk.adapter.pangle.PangleRewardLoader.a(r1)     // Catch: java.lang.Throwable -> La2
                java.lang.String r1 = r1.getRewardName()     // Catch: java.lang.Throwable -> La2
                r2.setRewardName(r1)     // Catch: java.lang.Throwable -> La2
            L88:
                com.bytedance.msdk.adapter.pangle.PangleRewardLoader r1 = com.bytedance.msdk.adapter.pangle.PangleRewardLoader.this     // Catch: java.lang.Throwable -> La2
                com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet r1 = com.bytedance.msdk.adapter.pangle.PangleRewardLoader.a(r1)     // Catch: java.lang.Throwable -> La2
                int r1 = r1.getRewardAmount()     // Catch: java.lang.Throwable -> La2
                if (r1 <= 0) goto La6
                com.bytedance.msdk.adapter.pangle.PangleRewardLoader r1 = com.bytedance.msdk.adapter.pangle.PangleRewardLoader.this     // Catch: java.lang.Throwable -> La2
                com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet r1 = com.bytedance.msdk.adapter.pangle.PangleRewardLoader.a(r1)     // Catch: java.lang.Throwable -> La2
                int r1 = r1.getRewardAmount()     // Catch: java.lang.Throwable -> La2
                r2.setRewardAmount(r1)     // Catch: java.lang.Throwable -> La2
                goto La6
            La2:
                r1 = move-exception
                r1.printStackTrace()
            La6:
                com.bytedance.sdk.openadsdk.AdSlot r1 = r2.build()
                com.bytedance.sdk.openadsdk.TTAdNative$RewardVideoAdListener r2 = r6.d
                r0.loadRewardVideoAd(r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.msdk.adapter.pangle.PangleRewardLoader.PangleRewardVideo.b():void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean c() {
            return !"0.0".equals(PangleRewardLoader.this.a()) && PangleRewardLoader.VERSION_4400.compareTo(PangleRewardLoader.this.a()) > 0;
        }

        @Override // com.bykv.vk.openvk.api.proto.Caller
        public <T> T call(int i, ValueSet valueSet, Class<T> cls) {
            if (i == 8113) {
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
                    return (T) true;
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
                    return (T) Boolean.valueOf(a());
                }
            }
            return (T) MediationValueUtil.checkClassType(cls);
        }

        public long getAdId() {
            TTRewardVideoAd tTRewardVideoAd = this.a;
            if (tTRewardVideoAd != null) {
                return PangleAdapterUtils.getAdId(tTRewardVideoAd.getMediaExtraInfo());
            }
            return 0L;
        }

        public long getCreativeId() {
            TTRewardVideoAd tTRewardVideoAd = this.a;
            if (tTRewardVideoAd != null) {
                return PangleAdapterUtils.getCreativeId(tTRewardVideoAd.getMediaExtraInfo());
            }
            return 0L;
        }

        public Map<String, Object> getMediaExtraInfo() {
            Map<String, Object> mediaExtraInfo;
            TTRewardVideoAd tTRewardVideoAd = this.a;
            if (tTRewardVideoAd == null || (mediaExtraInfo = tTRewardVideoAd.getMediaExtraInfo()) == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(PangleAdapterUtils.MEDIA_EXTRA_COUPON, mediaExtraInfo.get(PangleAdapterUtils.MEDIA_EXTRA_COUPON));
            hashMap.put(PangleAdapterUtils.MEDIA_EXTRA_LIVE_ROOM, mediaExtraInfo.get(PangleAdapterUtils.MEDIA_EXTRA_LIVE_ROOM));
            hashMap.put(PangleAdapterUtils.MEDIA_EXTRA_PRODUCT, mediaExtraInfo.get(PangleAdapterUtils.MEDIA_EXTRA_PRODUCT));
            return hashMap;
        }

        public String getReqId() {
            TTRewardVideoAd tTRewardVideoAd = this.a;
            return tTRewardVideoAd != null ? PangleAdapterUtils.getReqId(tTRewardVideoAd.getMediaExtraInfo()) : "";
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public boolean hasDestroyed() {
            return this.a == null;
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public MediationConstant.AdIsReadyStatus isReadyStatus() {
            TTRewardVideoAd tTRewardVideoAd = this.a;
            return (tTRewardVideoAd == null || tTRewardVideoAd.getExpirationTimestamp() <= System.currentTimeMillis()) ? MediationConstant.AdIsReadyStatus.AD_IS_EXPIRED : MediationConstant.AdIsReadyStatus.AD_IS_READY;
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public void onDestroy() {
            TTRewardVideoAd tTRewardVideoAd = this.a;
            if (tTRewardVideoAd != null) {
                tTRewardVideoAd.setDownloadListener(null);
                this.a.setRewardAdInteractionListener(null);
                this.a = null;
            }
        }

        public void showAd(Activity activity, Map<TTAdConstant.GroMoreExtraKey, Object> map) {
            if (this.a != null) {
                TTAdConstant.RitScenes ritScenes = PangleAdapterUtils.getRitScenes(map);
                String customRitScenes = PangleAdapterUtils.getCustomRitScenes(map);
                if (ritScenes != null) {
                    this.a.showRewardVideoAd(activity, ritScenes, customRitScenes);
                } else {
                    this.a.showRewardVideoAd(activity);
                }
            }
        }

        @Override // com.bykv.vk.openvk.api.proto.Bridge
        public ValueSet values() {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a() {
        try {
            return TTAdSdk.getAdManager().getSDKVersion();
        } catch (Exception e) {
            return "0.0";
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl
    public void realLoader(Context context, MediationAdSlotValueSet mediationAdSlotValueSet) {
        if (context == null || mediationAdSlotValueSet == null) {
            notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "context is null or adSlotValueSet is null");
            return;
        }
        this.b = context;
        this.c = mediationAdSlotValueSet;
        this.d = getGMBridge();
        PangleRewardVideo pangleRewardVideo = new PangleRewardVideo();
        this.a = pangleRewardVideo;
        pangleRewardVideo.b();
    }
}

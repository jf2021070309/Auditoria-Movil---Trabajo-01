package com.bytedance.msdk.api.v2.slot;

import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.msdk.api.v2.slot.GMAdSlotBase;
import com.bytedance.msdk.api.v2.slot.paltform.GMAdSlotBaiduOption;
import com.bytedance.msdk.api.v2.slot.paltform.GMAdSlotGDTOption;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationNativeToBannerListener;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationSplashRequestInfo;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class GMAdSlotRewardVideo extends GMAdSlotBase {
    private String m;
    private int n;
    private Map<String, String> o;
    private String p;
    private int q;

    /* loaded from: classes.dex */
    public static class Builder extends GMAdSlotBase.Builder {
        private Map<String, String> m;
        private int o;
        private String k = "";
        private int l = 0;
        private String n = "";

        public GMAdSlotRewardVideo build() {
            return new GMAdSlotRewardVideo(this);
        }

        public Builder setBidNotify(boolean z) {
            this.i = z;
            return this;
        }

        public Builder setCustomData(Map<String, String> map) {
            this.m = map;
            return this;
        }

        @Deprecated
        public Builder setDownloadType(int i) {
            this.h = i;
            return this;
        }

        public Builder setExtraObject(String str, Object obj) {
            Map<String, Object> map = this.f;
            if (map != null) {
                map.put(str, obj);
            }
            return this;
        }

        public Builder setGMAdSlotBaiduOption(GMAdSlotBaiduOption gMAdSlotBaiduOption) {
            this.e = gMAdSlotBaiduOption;
            return this;
        }

        public Builder setGMAdSlotGDTOption(GMAdSlotGDTOption gMAdSlotGDTOption) {
            this.d = gMAdSlotGDTOption;
            return this;
        }

        public Builder setMuted(boolean z) {
            this.a = z;
            return this;
        }

        public Builder setOrientation(int i) {
            this.o = i;
            return this;
        }

        public Builder setRewardAmount(int i) {
            this.l = i;
            return this;
        }

        public Builder setRewardName(String str) {
            this.k = str;
            return this;
        }

        public Builder setScenarioId(String str) {
            this.j = str;
            return this;
        }

        @Deprecated
        public Builder setTestSlotId(String str) {
            this.g = str;
            return this;
        }

        public Builder setUseSurfaceView(boolean z) {
            this.c = z;
            return this;
        }

        public Builder setUserID(String str) {
            this.n = str;
            return this;
        }

        public Builder setVolume(float f) {
            this.b = f;
            return this;
        }
    }

    private GMAdSlotRewardVideo(Builder builder) {
        super(builder);
        this.m = builder.k;
        this.n = builder.l;
        this.o = builder.m;
        this.p = builder.n;
        this.q = builder.o;
        if (this.l == null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8089, getAdValueSet());
            this.l = create.build();
        }
    }

    private IMediationAdSlot a(final GMAdSlotRewardVideo gMAdSlotRewardVideo) {
        return new IMediationAdSlot() { // from class: com.bytedance.msdk.api.v2.slot.GMAdSlotRewardVideo.1
            @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
            public Map<String, Object> getExtraObject() {
                if (gMAdSlotRewardVideo != null) {
                    HashMap hashMap = new HashMap();
                    if (gMAdSlotRewardVideo.getParams() != null) {
                        hashMap.putAll(gMAdSlotRewardVideo.getParams());
                    }
                    if (gMAdSlotRewardVideo.getCustomData() != null) {
                        hashMap.putAll(gMAdSlotRewardVideo.getCustomData());
                    }
                    if (GMAdSlotRewardVideo.this.getGMAdSlotGDTOption() != null) {
                        if (!hashMap.containsKey(MediationConstant.KEY_GDT_MIN_VIDEO_DURATION)) {
                            hashMap.put(MediationConstant.KEY_GDT_MIN_VIDEO_DURATION, Integer.valueOf(GMAdSlotRewardVideo.this.getGMAdSlotGDTOption().getGDTMinVideoDuration()));
                        }
                        if (!hashMap.containsKey(MediationConstant.KEY_GDT_MAX_VIDEO_DURATION)) {
                            hashMap.put(MediationConstant.KEY_GDT_MAX_VIDEO_DURATION, Integer.valueOf(GMAdSlotRewardVideo.this.getGMAdSlotGDTOption().getGDTMaxVideoDuration()));
                        }
                        if (!hashMap.containsKey(MediationConstant.KEY_GDT_VIDEO_OPTION)) {
                            hashMap.put(MediationConstant.KEY_GDT_VIDEO_OPTION, GMAdSlotRewardVideo.this.getGMAdSlotGDTOption());
                        }
                        if (!hashMap.containsKey(MediationConstant.KEY_GDT_DOWN_APP_CONFIG_POLICY)) {
                            hashMap.put(MediationConstant.KEY_GDT_DOWN_APP_CONFIG_POLICY, Integer.valueOf(GMAdSlotRewardVideo.this.getGMAdSlotGDTOption().getDownAPPConfirmPolicy()));
                        }
                        if (hashMap.containsKey(MediationConstant.KEY_GDT_NATIVE_LOGO_PARAMS)) {
                            return hashMap;
                        }
                        hashMap.put(MediationConstant.KEY_GDT_NATIVE_LOGO_PARAMS, GMAdSlotRewardVideo.this.getGMAdSlotGDTOption().getNativeAdLogoParams());
                        return hashMap;
                    }
                    return hashMap;
                }
                return null;
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
            public MediationNativeToBannerListener getMediationNativeToBannerListener() {
                return null;
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
            public MediationSplashRequestInfo getMediationSplashRequestInfo() {
                return null;
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
            public int getRewardAmount() {
                GMAdSlotRewardVideo gMAdSlotRewardVideo2 = gMAdSlotRewardVideo;
                if (gMAdSlotRewardVideo2 != null) {
                    return gMAdSlotRewardVideo2.getRewardAmount();
                }
                return 0;
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
            public String getRewardName() {
                GMAdSlotRewardVideo gMAdSlotRewardVideo2 = gMAdSlotRewardVideo;
                if (gMAdSlotRewardVideo2 != null) {
                    return gMAdSlotRewardVideo2.getRewardName();
                }
                return null;
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
            public String getScenarioId() {
                GMAdSlotRewardVideo gMAdSlotRewardVideo2 = gMAdSlotRewardVideo;
                if (gMAdSlotRewardVideo2 != null) {
                    return gMAdSlotRewardVideo2.getScenarioId();
                }
                return null;
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
            public float getShakeViewHeight() {
                return 0.0f;
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
            public float getShakeViewWidth() {
                return 0.0f;
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
            public float getVolume() {
                GMAdSlotRewardVideo gMAdSlotRewardVideo2 = gMAdSlotRewardVideo;
                if (gMAdSlotRewardVideo2 != null) {
                    return gMAdSlotRewardVideo2.getVolume();
                }
                return 0.0f;
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
            public String getWxAppId() {
                return null;
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
            public boolean isAllowShowCloseBtn() {
                return false;
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
            public boolean isBidNotify() {
                GMAdSlotRewardVideo gMAdSlotRewardVideo2 = gMAdSlotRewardVideo;
                if (gMAdSlotRewardVideo2 != null) {
                    return gMAdSlotRewardVideo2.isBidNotify();
                }
                return false;
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
            public boolean isMuted() {
                GMAdSlotRewardVideo gMAdSlotRewardVideo2 = gMAdSlotRewardVideo;
                if (gMAdSlotRewardVideo2 != null) {
                    return gMAdSlotRewardVideo2.isMuted();
                }
                return false;
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
            public boolean isSplashPreLoad() {
                return false;
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
            public boolean isSplashShakeButton() {
                return false;
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
            public boolean isUseSurfaceView() {
                GMAdSlotRewardVideo gMAdSlotRewardVideo2 = gMAdSlotRewardVideo;
                if (gMAdSlotRewardVideo2 != null) {
                    return gMAdSlotRewardVideo2.isUseSurfaceView();
                }
                return false;
            }
        };
    }

    @Override // com.bytedance.msdk.api.v2.slot.GMAdSlotBase
    public ValueSet getAdValueSet() {
        MediationValueSetBuilder create = MediationValueSetBuilder.create();
        create.add(15, getUserID());
        create.add(16, getOrientation());
        create.add(8088, a(this));
        return create.build();
    }

    public Map<String, String> getCustomData() {
        return this.o;
    }

    public int getOrientation() {
        return this.q;
    }

    public int getRewardAmount() {
        return this.n;
    }

    public String getRewardName() {
        return this.m;
    }

    public String getUserID() {
        return this.p;
    }
}

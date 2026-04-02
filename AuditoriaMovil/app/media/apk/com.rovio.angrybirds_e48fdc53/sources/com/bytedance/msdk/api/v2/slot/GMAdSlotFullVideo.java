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
public class GMAdSlotFullVideo extends GMAdSlotBase {
    private String m;
    private int n;
    private String o;
    private int p;
    private Map<String, String> q;

    /* loaded from: classes.dex */
    public static class Builder extends GMAdSlotBase.Builder {
        private String k;
        private int l;
        private String m = "";
        private int n = 0;
        private Map<String, String> o;

        public GMAdSlotFullVideo build() {
            return new GMAdSlotFullVideo(this);
        }

        public Builder setBidNotify(boolean z) {
            this.i = z;
            return this;
        }

        public Builder setCustomData(Map<String, String> map) {
            this.o = map;
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
            this.l = i;
            return this;
        }

        public Builder setRewardAmount(int i) {
            this.n = i;
            return this;
        }

        public Builder setRewardName(String str) {
            this.m = str;
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
            this.k = str;
            return this;
        }

        public Builder setVolume(float f) {
            this.b = f;
            return this;
        }
    }

    private GMAdSlotFullVideo(Builder builder) {
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

    private IMediationAdSlot a(final GMAdSlotFullVideo gMAdSlotFullVideo) {
        return new IMediationAdSlot() { // from class: com.bytedance.msdk.api.v2.slot.GMAdSlotFullVideo.1
            @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
            public Map<String, Object> getExtraObject() {
                if (gMAdSlotFullVideo != null) {
                    HashMap hashMap = new HashMap();
                    if (gMAdSlotFullVideo.getParams() != null) {
                        hashMap.putAll(gMAdSlotFullVideo.getParams());
                    }
                    if (gMAdSlotFullVideo.getCustomData() != null) {
                        hashMap.putAll(gMAdSlotFullVideo.getCustomData());
                    }
                    if (GMAdSlotFullVideo.this.getGMAdSlotGDTOption() != null) {
                        if (!hashMap.containsKey(MediationConstant.KEY_GDT_MIN_VIDEO_DURATION)) {
                            hashMap.put(MediationConstant.KEY_GDT_MIN_VIDEO_DURATION, Integer.valueOf(GMAdSlotFullVideo.this.getGMAdSlotGDTOption().getGDTMinVideoDuration()));
                        }
                        if (!hashMap.containsKey(MediationConstant.KEY_GDT_MAX_VIDEO_DURATION)) {
                            hashMap.put(MediationConstant.KEY_GDT_MAX_VIDEO_DURATION, Integer.valueOf(GMAdSlotFullVideo.this.getGMAdSlotGDTOption().getGDTMaxVideoDuration()));
                        }
                        if (!hashMap.containsKey(MediationConstant.KEY_GDT_VIDEO_OPTION)) {
                            hashMap.put(MediationConstant.KEY_GDT_VIDEO_OPTION, GMAdSlotFullVideo.this.getGMAdSlotGDTOption());
                        }
                        if (!hashMap.containsKey(MediationConstant.KEY_GDT_DOWN_APP_CONFIG_POLICY)) {
                            hashMap.put(MediationConstant.KEY_GDT_DOWN_APP_CONFIG_POLICY, Integer.valueOf(GMAdSlotFullVideo.this.getGMAdSlotGDTOption().getDownAPPConfirmPolicy()));
                        }
                        if (hashMap.containsKey(MediationConstant.KEY_GDT_NATIVE_LOGO_PARAMS)) {
                            return hashMap;
                        }
                        hashMap.put(MediationConstant.KEY_GDT_NATIVE_LOGO_PARAMS, GMAdSlotFullVideo.this.getGMAdSlotGDTOption().getNativeAdLogoParams());
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
                GMAdSlotFullVideo gMAdSlotFullVideo2 = gMAdSlotFullVideo;
                if (gMAdSlotFullVideo2 != null) {
                    return gMAdSlotFullVideo2.getRewardAmount();
                }
                return 0;
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
            public String getRewardName() {
                GMAdSlotFullVideo gMAdSlotFullVideo2 = gMAdSlotFullVideo;
                if (gMAdSlotFullVideo2 != null) {
                    return gMAdSlotFullVideo2.getRewardName();
                }
                return null;
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
            public String getScenarioId() {
                GMAdSlotFullVideo gMAdSlotFullVideo2 = gMAdSlotFullVideo;
                if (gMAdSlotFullVideo2 != null) {
                    return gMAdSlotFullVideo2.getScenarioId();
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
                GMAdSlotFullVideo gMAdSlotFullVideo2 = gMAdSlotFullVideo;
                if (gMAdSlotFullVideo2 != null) {
                    return gMAdSlotFullVideo2.getVolume();
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
                GMAdSlotFullVideo gMAdSlotFullVideo2 = gMAdSlotFullVideo;
                if (gMAdSlotFullVideo2 != null) {
                    return gMAdSlotFullVideo2.isBidNotify();
                }
                return false;
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
            public boolean isMuted() {
                GMAdSlotFullVideo gMAdSlotFullVideo2 = gMAdSlotFullVideo;
                if (gMAdSlotFullVideo2 != null) {
                    return gMAdSlotFullVideo2.isMuted();
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
                GMAdSlotFullVideo gMAdSlotFullVideo2 = gMAdSlotFullVideo;
                if (gMAdSlotFullVideo2 != null) {
                    return gMAdSlotFullVideo2.isUseSurfaceView();
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
        return this.q;
    }

    public int getOrientation() {
        return this.n;
    }

    public int getRewardAmount() {
        return this.p;
    }

    public String getRewardName() {
        return this.o;
    }

    public String getUserID() {
        return this.m;
    }
}

package com.bytedance.msdk.api.v2.slot;

import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.msdk.adapter.util.UIUtils;
import com.bytedance.msdk.api.v2.slot.GMAdSlotBase;
import com.bytedance.msdk.api.v2.slot.GMAdSlotFullVideo;
import com.bytedance.msdk.api.v2.slot.GMAdSlotInterstitial;
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
public class GMAdSlotInterstitialFull extends GMAdSlotBase {
    private int m;
    private int n;
    private String o;
    private int p;
    private String q;
    private int r;
    private Map<String, String> s;

    /* loaded from: classes.dex */
    public static class Builder extends GMAdSlotBase.Builder {
        private int k = 640;
        private int l = 320;
        private String m;
        private int n;
        private String o;
        private int p;
        private Map<String, String> q;

        public GMAdSlotInterstitialFull build() {
            return new GMAdSlotInterstitialFull(this);
        }

        public Builder setBidNotify(boolean z) {
            this.i = z;
            return this;
        }

        public Builder setCustomData(Map<String, String> map) {
            this.q = map;
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

        public Builder setImageAdSize(int i, int i2) {
            this.k = i;
            this.l = i2;
            return this;
        }

        public Builder setMuted(boolean z) {
            this.a = z;
            return this;
        }

        public Builder setOrientation(int i) {
            this.n = i;
            return this;
        }

        public Builder setRewardAmount(int i) {
            this.p = i;
            return this;
        }

        public Builder setRewardName(String str) {
            this.o = str;
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
            this.m = str;
            return this;
        }

        public Builder setVolume(float f) {
            this.b = f;
            return this;
        }
    }

    private GMAdSlotInterstitialFull(Builder builder) {
        super(builder);
        this.m = builder.k;
        this.n = builder.l;
        this.o = builder.m;
        this.p = builder.n;
        this.q = builder.o;
        this.r = builder.p;
        this.s = builder.q;
        if (this.l == null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8089, getAdValueSet());
            this.l = create.build();
        }
    }

    private IMediationAdSlot a(final GMAdSlotInterstitialFull gMAdSlotInterstitialFull) {
        return new IMediationAdSlot() { // from class: com.bytedance.msdk.api.v2.slot.GMAdSlotInterstitialFull.1
            @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
            public Map<String, Object> getExtraObject() {
                if (gMAdSlotInterstitialFull != null) {
                    HashMap hashMap = new HashMap();
                    if (gMAdSlotInterstitialFull.getParams() != null) {
                        hashMap.putAll(gMAdSlotInterstitialFull.getParams());
                    }
                    if (gMAdSlotInterstitialFull.getCustomData() != null) {
                        hashMap.putAll(gMAdSlotInterstitialFull.getCustomData());
                    }
                    if (GMAdSlotInterstitialFull.this.getGMAdSlotGDTOption() != null) {
                        if (!hashMap.containsKey(MediationConstant.KEY_GDT_MIN_VIDEO_DURATION)) {
                            hashMap.put(MediationConstant.KEY_GDT_MIN_VIDEO_DURATION, Integer.valueOf(GMAdSlotInterstitialFull.this.getGMAdSlotGDTOption().getGDTMinVideoDuration()));
                        }
                        if (!hashMap.containsKey(MediationConstant.KEY_GDT_MAX_VIDEO_DURATION)) {
                            hashMap.put(MediationConstant.KEY_GDT_MAX_VIDEO_DURATION, Integer.valueOf(GMAdSlotInterstitialFull.this.getGMAdSlotGDTOption().getGDTMaxVideoDuration()));
                        }
                        if (!hashMap.containsKey(MediationConstant.KEY_GDT_VIDEO_OPTION)) {
                            hashMap.put(MediationConstant.KEY_GDT_VIDEO_OPTION, GMAdSlotInterstitialFull.this.getGMAdSlotGDTOption());
                        }
                        if (!hashMap.containsKey(MediationConstant.KEY_GDT_DOWN_APP_CONFIG_POLICY)) {
                            hashMap.put(MediationConstant.KEY_GDT_DOWN_APP_CONFIG_POLICY, Integer.valueOf(GMAdSlotInterstitialFull.this.getGMAdSlotGDTOption().getDownAPPConfirmPolicy()));
                        }
                        if (hashMap.containsKey(MediationConstant.KEY_GDT_NATIVE_LOGO_PARAMS)) {
                            return hashMap;
                        }
                        hashMap.put(MediationConstant.KEY_GDT_NATIVE_LOGO_PARAMS, GMAdSlotInterstitialFull.this.getGMAdSlotGDTOption().getNativeAdLogoParams());
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
                GMAdSlotInterstitialFull gMAdSlotInterstitialFull2 = gMAdSlotInterstitialFull;
                if (gMAdSlotInterstitialFull2 != null) {
                    return gMAdSlotInterstitialFull2.getRewardAmount();
                }
                return 0;
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
            public String getRewardName() {
                GMAdSlotInterstitialFull gMAdSlotInterstitialFull2 = gMAdSlotInterstitialFull;
                if (gMAdSlotInterstitialFull2 != null) {
                    return gMAdSlotInterstitialFull2.getRewardName();
                }
                return null;
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
            public String getScenarioId() {
                GMAdSlotInterstitialFull gMAdSlotInterstitialFull2 = gMAdSlotInterstitialFull;
                if (gMAdSlotInterstitialFull2 != null) {
                    return gMAdSlotInterstitialFull2.getScenarioId();
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
                GMAdSlotInterstitialFull gMAdSlotInterstitialFull2 = gMAdSlotInterstitialFull;
                if (gMAdSlotInterstitialFull2 != null) {
                    return gMAdSlotInterstitialFull2.getVolume();
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
                GMAdSlotInterstitialFull gMAdSlotInterstitialFull2 = gMAdSlotInterstitialFull;
                if (gMAdSlotInterstitialFull2 != null) {
                    return gMAdSlotInterstitialFull2.isBidNotify();
                }
                return false;
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
            public boolean isMuted() {
                GMAdSlotInterstitialFull gMAdSlotInterstitialFull2 = gMAdSlotInterstitialFull;
                if (gMAdSlotInterstitialFull2 != null) {
                    return gMAdSlotInterstitialFull2.isMuted();
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
                GMAdSlotInterstitialFull gMAdSlotInterstitialFull2 = gMAdSlotInterstitialFull;
                if (gMAdSlotInterstitialFull2 != null) {
                    return gMAdSlotInterstitialFull2.isUseSurfaceView();
                }
                return false;
            }
        };
    }

    @Override // com.bytedance.msdk.api.v2.slot.GMAdSlotBase
    public ValueSet getAdValueSet() {
        MediationValueSetBuilder create = MediationValueSetBuilder.create();
        create.add(15, getUserID());
        create.add(7, (int) UIUtils.dip2Px(a.d(), getWidth()));
        create.add(8, (int) UIUtils.dip2Px(a.d(), getHeight()));
        create.add(10, getWidth());
        create.add(9, getHeight());
        create.add(16, getOrientation());
        create.add(8088, a(this));
        return create.build();
    }

    public Map<String, String> getCustomData() {
        return this.s;
    }

    public GMAdSlotFullVideo getGMAdSlotFullVideo() {
        GMAdSlotFullVideo build = new GMAdSlotFullVideo.Builder().setUserID(this.o).setOrientation(this.p).setMuted(isMuted()).setVolume(getVolume()).setUseSurfaceView(isUseSurfaceView()).setGMAdSlotGDTOption(this.d).setGMAdSlotBaiduOption(this.e).setTestSlotId(getTestSlotId()).setDownloadType(getDownloadType()).setBidNotify(isBidNotify()).setRewardName(getRewardName()).setRewardAmount(getRewardAmount()).setCustomData(getCustomData()).build();
        if (build.getParams() != null && getParams() != null) {
            build.getParams().putAll(getParams());
        }
        return build;
    }

    public GMAdSlotInterstitial getGMAdSlotInterstitial() {
        GMAdSlotInterstitial build = new GMAdSlotInterstitial.Builder().setImageAdSize(getWidth(), getHeight()).setMuted(isMuted()).setVolume(getVolume()).setUseSurfaceView(isUseSurfaceView()).setGMAdSlotGDTOption(this.d).setGMAdSlotBaiduOption(this.e).setTestSlotId(getTestSlotId()).setDownloadType(getDownloadType()).setBidNotify(isBidNotify()).build();
        if (build.getParams() != null && getParams() != null) {
            build.getParams().putAll(getParams());
        }
        return build;
    }

    public int getHeight() {
        return this.n;
    }

    public int getOrientation() {
        return this.p;
    }

    public int getRewardAmount() {
        return this.r;
    }

    public String getRewardName() {
        return this.q;
    }

    public String getUserID() {
        return this.o;
    }

    public int getWidth() {
        return this.m;
    }
}

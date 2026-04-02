package com.bytedance.msdk.api.v2.slot;

import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.msdk.adapter.util.UIUtils;
import com.bytedance.msdk.api.AdmobNativeAdOptions;
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
public class GMAdSlotNative extends GMAdSlotBase {
    private int m;
    private int n;
    private int o;
    private int p;
    private String q;
    private AdmobNativeAdOptions r;
    private int s;
    private int t;

    /* loaded from: classes.dex */
    public static class Builder extends GMAdSlotBase.Builder {
        private int k = 640;
        private int l = 320;
        private int m = 80;
        private int n = 80;
        private int o = 1;
        private String p = "";
        private AdmobNativeAdOptions q;

        public GMAdSlotNative build() {
            return new GMAdSlotNative(this);
        }

        public Builder setAdCount(int i) {
            this.o = i;
            return this;
        }

        public Builder setAdmobNativeAdOptions(AdmobNativeAdOptions admobNativeAdOptions) {
            this.q = admobNativeAdOptions;
            return this;
        }

        public Builder setBidNotify(boolean z) {
            this.i = z;
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

        public Builder setScenarioId(String str) {
            this.j = str;
            return this;
        }

        public Builder setShakeViewSize(int i, int i2) {
            this.m = i;
            this.n = i2;
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
            this.p = str;
            return this;
        }

        public Builder setVolume(float f) {
            this.b = f;
            return this;
        }
    }

    private GMAdSlotNative(Builder builder) {
        super(builder);
        this.m = builder.k;
        this.n = builder.l;
        this.s = builder.m;
        this.t = builder.n;
        this.o = builder.o;
        this.q = builder.p;
        this.r = builder.q != null ? builder.q : new AdmobNativeAdOptions();
        if (this.l == null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8089, getAdValueSet());
            this.l = create.build();
        }
    }

    private IMediationAdSlot a(final GMAdSlotNative gMAdSlotNative) {
        return new IMediationAdSlot() { // from class: com.bytedance.msdk.api.v2.slot.GMAdSlotNative.1
            @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
            public Map<String, Object> getExtraObject() {
                if (gMAdSlotNative != null) {
                    HashMap hashMap = new HashMap();
                    if (gMAdSlotNative.getParams() != null) {
                        hashMap.putAll(gMAdSlotNative.getParams());
                    }
                    if (GMAdSlotNative.this.getAdmobNativeAdOptions() != null && !hashMap.containsKey(MediationConstant.KEY_ADMOB_NATIVE_OPTIONS)) {
                        hashMap.put(MediationConstant.KEY_ADMOB_NATIVE_OPTIONS, GMAdSlotNative.this.getAdmobNativeAdOptions());
                    }
                    if (GMAdSlotNative.this.getGMAdSlotGDTOption() != null) {
                        if (!hashMap.containsKey(MediationConstant.KEY_GDT_MIN_VIDEO_DURATION)) {
                            hashMap.put(MediationConstant.KEY_GDT_MIN_VIDEO_DURATION, Integer.valueOf(GMAdSlotNative.this.getGMAdSlotGDTOption().getGDTMinVideoDuration()));
                        }
                        if (!hashMap.containsKey(MediationConstant.KEY_GDT_MAX_VIDEO_DURATION)) {
                            hashMap.put(MediationConstant.KEY_GDT_MAX_VIDEO_DURATION, Integer.valueOf(GMAdSlotNative.this.getGMAdSlotGDTOption().getGDTMaxVideoDuration()));
                        }
                        if (!hashMap.containsKey(MediationConstant.KEY_GDT_VIDEO_OPTION)) {
                            hashMap.put(MediationConstant.KEY_GDT_VIDEO_OPTION, GMAdSlotNative.this.getGMAdSlotGDTOption());
                        }
                        if (!hashMap.containsKey(MediationConstant.KEY_GDT_DOWN_APP_CONFIG_POLICY)) {
                            hashMap.put(MediationConstant.KEY_GDT_DOWN_APP_CONFIG_POLICY, Integer.valueOf(GMAdSlotNative.this.getGMAdSlotGDTOption().getDownAPPConfirmPolicy()));
                        }
                        if (hashMap.containsKey(MediationConstant.KEY_GDT_NATIVE_LOGO_PARAMS)) {
                            return hashMap;
                        }
                        hashMap.put(MediationConstant.KEY_GDT_NATIVE_LOGO_PARAMS, GMAdSlotNative.this.getGMAdSlotGDTOption().getNativeAdLogoParams());
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
                return 0;
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
            public String getRewardName() {
                return null;
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
            public String getScenarioId() {
                GMAdSlotNative gMAdSlotNative2 = gMAdSlotNative;
                if (gMAdSlotNative2 != null) {
                    return gMAdSlotNative2.getScenarioId();
                }
                return null;
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
            public float getShakeViewHeight() {
                GMAdSlotNative gMAdSlotNative2 = gMAdSlotNative;
                if (gMAdSlotNative2 != null) {
                    return gMAdSlotNative2.getShakeViewHeight();
                }
                return 0.0f;
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
            public float getShakeViewWidth() {
                GMAdSlotNative gMAdSlotNative2 = gMAdSlotNative;
                if (gMAdSlotNative2 != null) {
                    return gMAdSlotNative2.getShakeViewWidth();
                }
                return 0.0f;
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
            public float getVolume() {
                GMAdSlotNative gMAdSlotNative2 = gMAdSlotNative;
                if (gMAdSlotNative2 != null) {
                    return gMAdSlotNative2.getVolume();
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
                GMAdSlotNative gMAdSlotNative2 = gMAdSlotNative;
                if (gMAdSlotNative2 != null) {
                    return gMAdSlotNative2.isBidNotify();
                }
                return false;
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
            public boolean isMuted() {
                GMAdSlotNative gMAdSlotNative2 = gMAdSlotNative;
                if (gMAdSlotNative2 != null) {
                    return gMAdSlotNative2.isMuted();
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
                GMAdSlotNative gMAdSlotNative2 = gMAdSlotNative;
                if (gMAdSlotNative2 != null) {
                    return gMAdSlotNative2.isUseSurfaceView();
                }
                return false;
            }
        };
    }

    public int getAdCount() {
        int i = this.o;
        if (i <= 0) {
            return 1;
        }
        if (i <= 3) {
            return i;
        }
        return 3;
    }

    public int getAdStyleType() {
        return this.p;
    }

    @Override // com.bytedance.msdk.api.v2.slot.GMAdSlotBase
    public ValueSet getAdValueSet() {
        MediationValueSetBuilder create = MediationValueSetBuilder.create();
        create.add(15, getUserID());
        create.add(13, getAdCount());
        create.add(7, (int) UIUtils.dip2Px(a.d(), getWidth()));
        create.add(8, (int) UIUtils.dip2Px(a.d(), getHeight()));
        create.add(10, getWidth());
        create.add(9, getHeight());
        create.add(8088, a(this));
        return create.build();
    }

    public AdmobNativeAdOptions getAdmobNativeAdOptions() {
        return this.r;
    }

    public int getHeight() {
        return this.n;
    }

    public int getRequestCount() {
        int netWorkNum = getNetWorkNum();
        if (netWorkNum > 3) {
            netWorkNum = 3;
        }
        if (netWorkNum <= 0) {
            netWorkNum = this.o;
            if (netWorkNum <= 0) {
                return 1;
            }
            if (netWorkNum > 3) {
                return 3;
            }
        }
        return netWorkNum;
    }

    public int getShakeViewHeight() {
        return this.t;
    }

    public int getShakeViewWidth() {
        return this.s;
    }

    public String getUserID() {
        return this.q;
    }

    public int getWidth() {
        return this.m;
    }
}

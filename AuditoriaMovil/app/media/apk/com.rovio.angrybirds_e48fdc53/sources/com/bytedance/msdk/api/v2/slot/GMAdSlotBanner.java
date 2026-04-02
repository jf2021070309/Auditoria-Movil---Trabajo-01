package com.bytedance.msdk.api.v2.slot;

import android.util.Log;
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
public class GMAdSlotBanner extends GMAdSlotBase {
    private int m;
    private int n;
    private int o;
    private boolean p;
    private String q;
    private AdmobNativeAdOptions r;

    /* loaded from: classes.dex */
    public static class Builder extends GMAdSlotBase.Builder {
        private int k = 640;
        private int l = 320;
        private int m = 3;
        private boolean n = false;
        private String o = "";
        private AdmobNativeAdOptions p;

        public GMAdSlotBanner build() {
            return new GMAdSlotBanner(this);
        }

        public Builder setAdmobNativeAdOptions(AdmobNativeAdOptions admobNativeAdOptions) {
            this.p = admobNativeAdOptions;
            return this;
        }

        public Builder setAllowShowCloseBtn(boolean z) {
            this.n = z;
            return this;
        }

        public Builder setBannerSize(int i) {
            this.m = i;
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

        @Deprecated
        public Builder setRefreshTime(int i) {
            Log.d("TTMediationSDK", "************ 注意：BannerBuilder.setRefreshTime接口已废弃，设置banner轮播时长不生效，需在平台配置轮播功能 ************");
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
            this.o = str;
            return this;
        }

        public Builder setVolume(float f) {
            this.b = f;
            return this;
        }
    }

    private GMAdSlotBanner(Builder builder) {
        super(builder);
        this.m = builder.k;
        this.n = builder.l;
        this.o = builder.m;
        this.p = builder.n;
        this.q = builder.o;
        this.r = builder.p != null ? builder.p : new AdmobNativeAdOptions();
        if (this.l == null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8089, getAdValueSet());
            this.l = create.build();
        }
    }

    private IMediationAdSlot a(final GMAdSlotBanner gMAdSlotBanner) {
        return new IMediationAdSlot() { // from class: com.bytedance.msdk.api.v2.slot.GMAdSlotBanner.1
            @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
            public Map<String, Object> getExtraObject() {
                if (gMAdSlotBanner != null) {
                    HashMap hashMap = new HashMap();
                    if (gMAdSlotBanner.getParams() != null) {
                        hashMap.putAll(gMAdSlotBanner.getParams());
                    }
                    if (GMAdSlotBanner.this.getAdmobNativeAdOptions() != null && !hashMap.containsKey(MediationConstant.KEY_ADMOB_NATIVE_OPTIONS)) {
                        hashMap.put(MediationConstant.KEY_ADMOB_NATIVE_OPTIONS, GMAdSlotBanner.this.getAdmobNativeAdOptions());
                    }
                    if (GMAdSlotBanner.this.getGMAdSlotGDTOption() != null) {
                        if (!hashMap.containsKey(MediationConstant.KEY_GDT_MIN_VIDEO_DURATION)) {
                            hashMap.put(MediationConstant.KEY_GDT_MIN_VIDEO_DURATION, Integer.valueOf(GMAdSlotBanner.this.getGMAdSlotGDTOption().getGDTMinVideoDuration()));
                        }
                        if (!hashMap.containsKey(MediationConstant.KEY_GDT_MAX_VIDEO_DURATION)) {
                            hashMap.put(MediationConstant.KEY_GDT_MAX_VIDEO_DURATION, Integer.valueOf(GMAdSlotBanner.this.getGMAdSlotGDTOption().getGDTMaxVideoDuration()));
                        }
                        if (!hashMap.containsKey(MediationConstant.KEY_GDT_VIDEO_OPTION)) {
                            hashMap.put(MediationConstant.KEY_GDT_VIDEO_OPTION, GMAdSlotBanner.this.getGMAdSlotGDTOption());
                        }
                        if (!hashMap.containsKey(MediationConstant.KEY_GDT_DOWN_APP_CONFIG_POLICY)) {
                            hashMap.put(MediationConstant.KEY_GDT_DOWN_APP_CONFIG_POLICY, Integer.valueOf(GMAdSlotBanner.this.getGMAdSlotGDTOption().getDownAPPConfirmPolicy()));
                        }
                        if (hashMap.containsKey(MediationConstant.KEY_GDT_NATIVE_LOGO_PARAMS)) {
                            return hashMap;
                        }
                        hashMap.put(MediationConstant.KEY_GDT_NATIVE_LOGO_PARAMS, GMAdSlotBanner.this.getGMAdSlotGDTOption().getNativeAdLogoParams());
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
                GMAdSlotBanner gMAdSlotBanner2 = gMAdSlotBanner;
                if (gMAdSlotBanner2 != null) {
                    return gMAdSlotBanner2.getScenarioId();
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
                GMAdSlotBanner gMAdSlotBanner2 = gMAdSlotBanner;
                if (gMAdSlotBanner2 != null) {
                    return gMAdSlotBanner2.getVolume();
                }
                return 0.0f;
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
            public String getWxAppId() {
                return null;
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
            public boolean isAllowShowCloseBtn() {
                GMAdSlotBanner gMAdSlotBanner2 = gMAdSlotBanner;
                if (gMAdSlotBanner2 != null) {
                    return gMAdSlotBanner2.isAllowShowCloseBtn();
                }
                return false;
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
            public boolean isBidNotify() {
                GMAdSlotBanner gMAdSlotBanner2 = gMAdSlotBanner;
                if (gMAdSlotBanner2 != null) {
                    return gMAdSlotBanner2.isBidNotify();
                }
                return false;
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
            public boolean isMuted() {
                GMAdSlotBanner gMAdSlotBanner2 = gMAdSlotBanner;
                if (gMAdSlotBanner2 != null) {
                    return gMAdSlotBanner2.isMuted();
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
                GMAdSlotBanner gMAdSlotBanner2 = gMAdSlotBanner;
                if (gMAdSlotBanner2 != null) {
                    return gMAdSlotBanner2.isUseSurfaceView();
                }
                return false;
            }
        };
    }

    @Override // com.bytedance.msdk.api.v2.slot.GMAdSlotBase
    public ValueSet getAdValueSet() {
        int i;
        MediationValueSetBuilder create = MediationValueSetBuilder.create();
        create.add(15, getUserID());
        int bannerSize = getBannerSize();
        int i2 = 320;
        if (bannerSize == 2) {
            i = 100;
        } else if (bannerSize == 3) {
            i = 250;
        } else if (bannerSize == 4) {
            i2 = 468;
            i = 60;
        } else if (bannerSize == 5) {
            i2 = 728;
            i = 90;
        } else if (bannerSize == 6 && getWidth() > 0 && getHeight() > 0) {
            i2 = getWidth();
            i = getHeight();
        } else {
            i = 50;
        }
        create.add(7, (int) UIUtils.dip2Px(a.d(), getWidth()));
        create.add(8, (int) UIUtils.dip2Px(a.d(), getHeight()));
        create.add(10, i2);
        create.add(9, i);
        create.add(8088, a(this));
        return create.build();
    }

    public AdmobNativeAdOptions getAdmobNativeAdOptions() {
        return this.r;
    }

    public int getBannerSize() {
        return this.o;
    }

    public int getHeight() {
        return this.n;
    }

    public String getUserID() {
        return this.q;
    }

    public int getWidth() {
        return this.m;
    }

    public boolean isAllowShowCloseBtn() {
        return this.p;
    }
}

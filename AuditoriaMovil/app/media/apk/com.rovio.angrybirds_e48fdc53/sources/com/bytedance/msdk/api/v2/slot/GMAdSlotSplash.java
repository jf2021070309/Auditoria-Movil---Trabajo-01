package com.bytedance.msdk.api.v2.slot;

import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.msdk.adapter.util.UIUtils;
import com.bytedance.msdk.api.v2.slot.GMAdSlotBase;
import com.bytedance.msdk.api.v2.slot.paltform.GMAdSlotBaiduOption;
import com.bytedance.msdk.api.v2.slot.paltform.GMAdSlotGDTOption;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationNativeToBannerListener;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationSplashRequestInfo;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import com.ss.android.socialbase.downloader.constants.DownloadErrorCode;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class GMAdSlotSplash extends GMAdSlotBase {
    private int m;
    private int n;
    private String o;
    private boolean p;
    private int q;
    @Deprecated
    private int r;
    private boolean s;
    private boolean t;

    /* loaded from: classes.dex */
    public static class Builder extends GMAdSlotBase.Builder {
        private String m;
        private boolean q;
        private boolean r;
        private int k = DownloadErrorCode.ERROR_TTNET_NOT_MODIFIED;
        private int l = 1920;
        private boolean n = false;
        private int o = 3000;
        @Deprecated
        private int p = 1;

        public GMAdSlotSplash build() {
            return new GMAdSlotSplash(this);
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

        public Builder setForceLoadBottom(boolean z) {
            this.q = z;
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

        @Deprecated
        public Builder setSplashButtonType(int i) {
            this.p = i;
            return this;
        }

        public Builder setSplashPreLoad(boolean z) {
            this.n = z;
            return this;
        }

        public Builder setSplashShakeButton(boolean z) {
            this.r = z;
            return this;
        }

        @Deprecated
        public Builder setTestSlotId(String str) {
            this.g = str;
            return this;
        }

        public Builder setTimeOut(int i) {
            this.o = i;
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

    private GMAdSlotSplash(Builder builder) {
        super(builder);
        this.m = builder.k;
        this.n = builder.l;
        this.o = builder.m;
        this.p = builder.n;
        this.q = builder.o;
        this.r = builder.p;
        this.s = builder.q;
        this.t = builder.r;
        if (this.l == null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8089, getAdValueSet());
            this.l = create.build();
        }
    }

    private IMediationAdSlot a(final GMAdSlotSplash gMAdSlotSplash) {
        return new IMediationAdSlot() { // from class: com.bytedance.msdk.api.v2.slot.GMAdSlotSplash.1
            @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
            public Map<String, Object> getExtraObject() {
                if (gMAdSlotSplash != null) {
                    HashMap hashMap = new HashMap();
                    if (gMAdSlotSplash.getParams() != null) {
                        hashMap.putAll(gMAdSlotSplash.getParams());
                    }
                    if (GMAdSlotSplash.this.getGMAdSlotGDTOption() != null) {
                        if (!hashMap.containsKey(MediationConstant.KEY_GDT_MIN_VIDEO_DURATION)) {
                            hashMap.put(MediationConstant.KEY_GDT_MIN_VIDEO_DURATION, Integer.valueOf(GMAdSlotSplash.this.getGMAdSlotGDTOption().getGDTMinVideoDuration()));
                        }
                        if (!hashMap.containsKey(MediationConstant.KEY_GDT_MAX_VIDEO_DURATION)) {
                            hashMap.put(MediationConstant.KEY_GDT_MAX_VIDEO_DURATION, Integer.valueOf(GMAdSlotSplash.this.getGMAdSlotGDTOption().getGDTMaxVideoDuration()));
                        }
                        if (!hashMap.containsKey(MediationConstant.KEY_GDT_VIDEO_OPTION)) {
                            hashMap.put(MediationConstant.KEY_GDT_VIDEO_OPTION, GMAdSlotSplash.this.getGMAdSlotGDTOption());
                        }
                        if (!hashMap.containsKey(MediationConstant.KEY_GDT_DOWN_APP_CONFIG_POLICY)) {
                            hashMap.put(MediationConstant.KEY_GDT_DOWN_APP_CONFIG_POLICY, Integer.valueOf(GMAdSlotSplash.this.getGMAdSlotGDTOption().getDownAPPConfirmPolicy()));
                        }
                        if (hashMap.containsKey(MediationConstant.KEY_GDT_NATIVE_LOGO_PARAMS)) {
                            return hashMap;
                        }
                        hashMap.put(MediationConstant.KEY_GDT_NATIVE_LOGO_PARAMS, GMAdSlotSplash.this.getGMAdSlotGDTOption().getNativeAdLogoParams());
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
                GMAdSlotSplash gMAdSlotSplash2 = gMAdSlotSplash;
                if (gMAdSlotSplash2 != null) {
                    return gMAdSlotSplash2.getScenarioId();
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
                GMAdSlotSplash gMAdSlotSplash2 = gMAdSlotSplash;
                if (gMAdSlotSplash2 != null) {
                    return gMAdSlotSplash2.getVolume();
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
                GMAdSlotSplash gMAdSlotSplash2 = gMAdSlotSplash;
                if (gMAdSlotSplash2 != null) {
                    return gMAdSlotSplash2.isBidNotify();
                }
                return false;
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
            public boolean isMuted() {
                GMAdSlotSplash gMAdSlotSplash2 = gMAdSlotSplash;
                if (gMAdSlotSplash2 != null) {
                    return gMAdSlotSplash2.isMuted();
                }
                return false;
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
            public boolean isSplashPreLoad() {
                GMAdSlotSplash gMAdSlotSplash2 = gMAdSlotSplash;
                if (gMAdSlotSplash2 != null) {
                    return gMAdSlotSplash2.isSplashPreLoad();
                }
                return false;
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
            public boolean isSplashShakeButton() {
                GMAdSlotSplash gMAdSlotSplash2 = gMAdSlotSplash;
                if (gMAdSlotSplash2 != null) {
                    return gMAdSlotSplash2.getSplashShakeButton();
                }
                return false;
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
            public boolean isUseSurfaceView() {
                GMAdSlotSplash gMAdSlotSplash2 = gMAdSlotSplash;
                if (gMAdSlotSplash2 != null) {
                    return gMAdSlotSplash2.isUseSurfaceView();
                }
                return false;
            }
        };
    }

    @Override // com.bytedance.msdk.api.v2.slot.GMAdSlotBase
    public ValueSet getAdValueSet() {
        MediationValueSetBuilder create = MediationValueSetBuilder.create();
        create.add(15, getUserID());
        create.add(7, getWidth());
        create.add(8, getHeight());
        create.add(10, UIUtils.px2dip(a.d(), getWidth()));
        create.add(9, UIUtils.px2dip(a.d(), getHeight()));
        create.add(17, getTimeOut());
        create.add(8088, a(this));
        return create.build();
    }

    public int getHeight() {
        return this.n;
    }

    @Deprecated
    public int getSplashButtonType() {
        return this.r;
    }

    public boolean getSplashShakeButton() {
        return this.t;
    }

    public int getTimeOut() {
        return this.q;
    }

    public String getUserID() {
        return this.o;
    }

    public int getWidth() {
        return this.m;
    }

    public boolean isForceLoadBottom() {
        return this.s;
    }

    public boolean isSplashPreLoad() {
        return this.p;
    }
}

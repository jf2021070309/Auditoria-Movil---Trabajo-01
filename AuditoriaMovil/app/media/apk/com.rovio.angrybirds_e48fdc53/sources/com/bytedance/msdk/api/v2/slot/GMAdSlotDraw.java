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
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class GMAdSlotDraw extends GMAdSlotBase {
    private int m;
    private int n;
    private int o;

    /* loaded from: classes.dex */
    public static class Builder extends GMAdSlotBase.Builder {
        private int k = 640;
        private int l = 320;
        private int m = 1;

        public GMAdSlotDraw build() {
            return new GMAdSlotDraw(this);
        }

        public Builder setAdCount(int i) {
            int i2 = 1;
            if (i >= 1) {
                i2 = 3;
                if (i <= 3) {
                    this.m = i;
                    return this;
                }
            }
            this.m = i2;
            return this;
        }

        public Builder setBidNotify(boolean z) {
            this.i = z;
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

        @Deprecated
        public Builder setTestSlotId(String str) {
            this.g = str;
            return this;
        }
    }

    private GMAdSlotDraw(Builder builder) {
        super(builder);
        this.m = builder.k;
        this.n = builder.l;
        this.o = builder.m;
        if (this.l == null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8089, getAdValueSet());
            this.l = create.build();
        }
    }

    private IMediationAdSlot a(final GMAdSlotDraw gMAdSlotDraw) {
        return new IMediationAdSlot() { // from class: com.bytedance.msdk.api.v2.slot.GMAdSlotDraw.1
            @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
            public Map<String, Object> getExtraObject() {
                if (gMAdSlotDraw != null) {
                    HashMap hashMap = new HashMap();
                    if (gMAdSlotDraw.getParams() != null) {
                        hashMap.putAll(gMAdSlotDraw.getParams());
                    }
                    if (GMAdSlotDraw.this.getGMAdSlotGDTOption() != null) {
                        if (!hashMap.containsKey(MediationConstant.KEY_GDT_MIN_VIDEO_DURATION)) {
                            hashMap.put(MediationConstant.KEY_GDT_MIN_VIDEO_DURATION, Integer.valueOf(GMAdSlotDraw.this.getGMAdSlotGDTOption().getGDTMinVideoDuration()));
                        }
                        if (!hashMap.containsKey(MediationConstant.KEY_GDT_MAX_VIDEO_DURATION)) {
                            hashMap.put(MediationConstant.KEY_GDT_MAX_VIDEO_DURATION, Integer.valueOf(GMAdSlotDraw.this.getGMAdSlotGDTOption().getGDTMaxVideoDuration()));
                        }
                        if (!hashMap.containsKey(MediationConstant.KEY_GDT_VIDEO_OPTION)) {
                            hashMap.put(MediationConstant.KEY_GDT_VIDEO_OPTION, GMAdSlotDraw.this.getGMAdSlotGDTOption());
                        }
                        if (!hashMap.containsKey(MediationConstant.KEY_GDT_DOWN_APP_CONFIG_POLICY)) {
                            hashMap.put(MediationConstant.KEY_GDT_DOWN_APP_CONFIG_POLICY, Integer.valueOf(GMAdSlotDraw.this.getGMAdSlotGDTOption().getDownAPPConfirmPolicy()));
                        }
                        if (hashMap.containsKey(MediationConstant.KEY_GDT_NATIVE_LOGO_PARAMS)) {
                            return hashMap;
                        }
                        hashMap.put(MediationConstant.KEY_GDT_NATIVE_LOGO_PARAMS, GMAdSlotDraw.this.getGMAdSlotGDTOption().getNativeAdLogoParams());
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
                GMAdSlotDraw gMAdSlotDraw2 = gMAdSlotDraw;
                if (gMAdSlotDraw2 != null) {
                    return gMAdSlotDraw2.getScenarioId();
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
                GMAdSlotDraw gMAdSlotDraw2 = gMAdSlotDraw;
                if (gMAdSlotDraw2 != null) {
                    return gMAdSlotDraw2.getVolume();
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
                GMAdSlotDraw gMAdSlotDraw2 = gMAdSlotDraw;
                if (gMAdSlotDraw2 != null) {
                    return gMAdSlotDraw2.isBidNotify();
                }
                return false;
            }

            @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot
            public boolean isMuted() {
                GMAdSlotDraw gMAdSlotDraw2 = gMAdSlotDraw;
                if (gMAdSlotDraw2 != null) {
                    return gMAdSlotDraw2.isMuted();
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
                GMAdSlotDraw gMAdSlotDraw2 = gMAdSlotDraw;
                if (gMAdSlotDraw2 != null) {
                    return gMAdSlotDraw2.isUseSurfaceView();
                }
                return false;
            }
        };
    }

    public int getAdCount() {
        return this.o;
    }

    @Override // com.bytedance.msdk.api.v2.slot.GMAdSlotBase
    public ValueSet getAdValueSet() {
        MediationValueSetBuilder create = MediationValueSetBuilder.create();
        create.add(13, getAdCount());
        create.add(7, (int) UIUtils.dip2Px(a.d(), getWidth()));
        create.add(8, (int) UIUtils.dip2Px(a.d(), getHeight()));
        create.add(10, getWidth());
        create.add(9, getHeight());
        create.add(8088, a(this));
        return create.build();
    }

    public int getHeight() {
        return this.n;
    }

    public int getWidth() {
        return this.m;
    }
}

package com.bytedance.msdk.api.v2;

import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.msdk.api.v2.GMBaiduOption;
import com.bytedance.msdk.api.v2.GMGdtOption;
import com.bytedance.msdk.api.v2.GMPangleOption;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import com.bytedance.sdk.openadsdk.mediation.init.MediationConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class GMAdConfig {
    private String a;
    private String b;
    private boolean c;
    private String d;
    private boolean e;
    private GMPangleOption f;
    private GMGdtOption g;
    private GMBaiduOption h;
    private GMConfigUserInfoForSegment i;
    private GMPrivacyConfig j;
    private Map<String, Object> k;
    private boolean l;
    private boolean m;
    private JSONObject n;
    private IGMLiveTokenInjectionAuth o;
    private Map<String, Object> p;
    private boolean q;

    /* loaded from: classes.dex */
    public static class Builder {
        private String a;
        private String b;
        private GMPangleOption f;
        private GMGdtOption g;
        private GMBaiduOption h;
        private GMConfigUserInfoForSegment i;
        private GMPrivacyConfig j;
        private Map<String, Object> k;
        private JSONObject n;
        private IGMLiveTokenInjectionAuth o;
        private Map<String, Object> p;
        private boolean q;
        private boolean c = false;
        private String d = "";
        private boolean e = false;
        private boolean l = false;
        private boolean m = false;

        public GMAdConfig build() {
            return new GMAdConfig(this);
        }

        public Builder injectionAuth(IGMLiveTokenInjectionAuth iGMLiveTokenInjectionAuth) {
            this.o = iGMLiveTokenInjectionAuth;
            return this;
        }

        public Builder setAppId(String str) {
            this.a = str;
            return this;
        }

        public Builder setAppName(String str) {
            this.b = str;
            return this;
        }

        public Builder setBaiduOption(GMBaiduOption gMBaiduOption) {
            this.h = gMBaiduOption;
            return this;
        }

        public Builder setConfigUserInfoForSegment(GMConfigUserInfoForSegment gMConfigUserInfoForSegment) {
            this.i = gMConfigUserInfoForSegment;
            return this;
        }

        public Builder setCustomLocalConfig(JSONObject jSONObject) {
            this.n = jSONObject;
            return this;
        }

        public Builder setDebug(boolean z) {
            this.c = z;
            return this;
        }

        public Builder setGdtOption(GMGdtOption gMGdtOption) {
            this.g = gMGdtOption;
            return this;
        }

        public Builder setGroMoreExtra(Map<String, Object> map) {
            this.p = map;
            return this;
        }

        public Builder setHttps(boolean z) {
            this.l = z;
            return this;
        }

        public Builder setIsOpenPangleCustom(boolean z) {
            this.m = z;
            return this;
        }

        public Builder setLocalExtra(Map<String, Object> map) {
            if (map != null && !map.isEmpty()) {
                HashMap hashMap = new HashMap();
                this.k = hashMap;
                hashMap.putAll(map);
            }
            return this;
        }

        public Builder setOpenAdnTest(boolean z) {
            this.e = z;
            return this;
        }

        public Builder setPangleOption(GMPangleOption gMPangleOption) {
            this.f = gMPangleOption;
            return this;
        }

        public Builder setPrivacyConfig(GMPrivacyConfig gMPrivacyConfig) {
            this.j = gMPrivacyConfig;
            return this;
        }

        public Builder setPublisherDid(String str) {
            this.d = str;
            return this;
        }

        public Builder setSupportMultiProcess(boolean z) {
            this.q = z;
            return this;
        }
    }

    private GMAdConfig(Builder builder) {
        this.j = new GMPrivacyConfig();
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
        this.e = builder.e;
        this.f = builder.f != null ? builder.f : new GMPangleOption.Builder().build();
        this.g = builder.g != null ? builder.g : new GMGdtOption.Builder().build();
        this.h = builder.h != null ? builder.h : new GMBaiduOption.Builder().build();
        this.i = builder.i != null ? builder.i : new GMConfigUserInfoForSegment();
        if (builder.j != null) {
            this.j = builder.j;
        }
        this.k = builder.k;
        this.l = builder.l;
        this.m = builder.m;
        this.n = builder.n;
        this.o = builder.o;
        this.p = builder.p;
        this.q = builder.q;
    }

    private MediationConfig a(GMAdConfig gMAdConfig) {
        MediationConfig.Builder builder = new MediationConfig.Builder();
        if (gMAdConfig != null) {
            if (gMAdConfig.getGMConfigUserInfoForSegment() != null) {
                builder.setMediationConfigUserInfoForSegment(gMAdConfig.getGMConfigUserInfoForSegment().getMediationConfigUserInfoForSegment());
            }
            builder.setPublisherDid(gMAdConfig.getPublisherDid());
            builder.setOpenAdnTest(gMAdConfig.isOpenAdnTest());
            HashMap hashMap = new HashMap();
            if (gMAdConfig.getLocalExtra() != null) {
                hashMap.putAll(gMAdConfig.getLocalExtra());
            }
            if (gMAdConfig.getGromoreExtra() != null) {
                hashMap.putAll(gMAdConfig.getGromoreExtra());
            }
            builder.setLocalExtra(hashMap);
            builder.setHttps(gMAdConfig.isHttps());
            builder.setCustomLocalConfig(gMAdConfig.getCutstomLocalConfig());
            if (gMAdConfig.getGMGdtOption() != null) {
                builder.setWxInstalled(gMAdConfig.getGMGdtOption().isWxInstalled());
                builder.setOpensdkVer(gMAdConfig.getGMGdtOption().getOpensdkVer());
                builder.setSupportH265(gMAdConfig.getGMGdtOption().isSupportH265());
                builder.setSupportSplashZoomout(gMAdConfig.getGMGdtOption().isSupportSplashZoomout());
            }
            if (gMAdConfig.getGMBaiduOption() != null) {
                builder.setWxAppId(gMAdConfig.getGMBaiduOption().getWxAppId());
            }
        }
        return builder.build();
    }

    public ValueSet geValueSet() {
        MediationValueSetBuilder create = MediationValueSetBuilder.create();
        GMPrivacyConfig gMPrivacyConfig = this.j;
        if (gMPrivacyConfig != null) {
            create.add(2, gMPrivacyConfig.getMediationCustomController());
            create.add(8086, a(this));
            create.add(1, isDebug());
        }
        return create.build();
    }

    public String getAppId() {
        return this.a;
    }

    public String getAppName() {
        return this.b;
    }

    public JSONObject getCutstomLocalConfig() {
        return this.n;
    }

    public GMBaiduOption getGMBaiduOption() {
        return this.h;
    }

    public GMConfigUserInfoForSegment getGMConfigUserInfoForSegment() {
        return this.i;
    }

    public GMGdtOption getGMGdtOption() {
        return this.g;
    }

    public GMPangleOption getGMPangleOption() {
        return this.f;
    }

    public IGMLiveTokenInjectionAuth getGmLiveTokenInjectionAuth() {
        return this.o;
    }

    public Map<String, Object> getGromoreExtra() {
        return this.p;
    }

    public Map<String, Object> getLocalExtra() {
        return this.k;
    }

    public GMPrivacyConfig getPrivacyConfig() {
        return this.j;
    }

    public String getPublisherDid() {
        return this.d;
    }

    public boolean getSupportMultiProcess() {
        return this.q;
    }

    public boolean isDebug() {
        return this.c;
    }

    public boolean isHttps() {
        return this.l;
    }

    public boolean isOpenAdnTest() {
        return this.e;
    }

    public boolean isOpenPangleCustom() {
        return this.m;
    }
}

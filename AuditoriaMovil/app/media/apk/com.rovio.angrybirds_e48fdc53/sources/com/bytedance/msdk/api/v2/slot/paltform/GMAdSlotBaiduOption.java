package com.bytedance.msdk.api.v2.slot.paltform;

import com.bytedance.msdk.api.BaiduExtraOptions;
import com.bytedance.msdk.api.BaiduNativeSmartOptStyleParams;
import com.bytedance.msdk.api.BaiduRequestParameters;
import com.bytedance.msdk.api.BaiduSplashParams;
/* loaded from: classes.dex */
public class GMAdSlotBaiduOption {
    public static final int DOWNLOAD_APP_CONFIRM_ALWAYS = 2;
    public static final int DOWNLOAD_APP_CONFIRM_CUSTOM_BY_APP = 4;
    public static final int DOWNLOAD_APP_CONFIRM_NEVER = 3;
    public static final int DOWNLOAD_APP_CONFIRM_ONLY_MOBILE = 1;
    private boolean a;
    private int b;
    private BaiduNativeSmartOptStyleParams c;
    private BaiduRequestParameters d;
    private BaiduSplashParams e;
    private boolean f;
    private boolean g;
    private String h;

    /* loaded from: classes.dex */
    public static final class Builder {
        private boolean a;
        private int b;
        private BaiduNativeSmartOptStyleParams c;
        private BaiduRequestParameters d;
        private BaiduSplashParams e;
        private boolean f;
        private boolean g;
        private String h;

        public final GMAdSlotBaiduOption build() {
            return new GMAdSlotBaiduOption(this);
        }

        public Builder setAppSid(String str) {
            this.h = str;
            return this;
        }

        public Builder setBaiduNativeSmartOptStyleParams(BaiduNativeSmartOptStyleParams baiduNativeSmartOptStyleParams) {
            this.c = baiduNativeSmartOptStyleParams;
            return this;
        }

        public Builder setBaiduRequestParameters(BaiduRequestParameters baiduRequestParameters) {
            this.d = baiduRequestParameters;
            return this;
        }

        public Builder setBaiduSplashParams(BaiduSplashParams baiduSplashParams) {
            this.e = baiduSplashParams;
            return this;
        }

        public Builder setCacheVideoOnlyWifi(boolean z) {
            this.a = z;
            return this;
        }

        public Builder setDownloadAppConfirmPolicy(int i) {
            this.b = i;
            return this;
        }

        public Builder setShowDialogOnSkip(boolean z) {
            this.f = z;
            return this;
        }

        public Builder setUseRewardCountdown(boolean z) {
            this.g = z;
            return this;
        }
    }

    private GMAdSlotBaiduOption(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
        this.e = builder.e;
        this.f = builder.f;
        this.g = builder.g;
        this.h = builder.h;
    }

    public String getAppSid() {
        return this.h;
    }

    public BaiduExtraOptions getBaiduExtra() {
        BaiduExtraOptions.Builder builder = new BaiduExtraOptions.Builder();
        builder.setCacheVideoOnlyWifi(isCacheVideoOnlyWifi());
        builder.setAppSid(getAppSid());
        builder.setBaiduNativeSmartOptStyleParams(getBaiduNativeSmartOptStyleParams());
        builder.setBaiduRequestParameters(getBaiduRequestParameters());
        builder.setBaiduSplashParams(getBaiduSplashParams());
        builder.setGDTExtraOption(getDownloadAppConfirmPolicy());
        builder.setShowDialogOnSkip(getShowDialogOnSkip());
        builder.setUseRewardCountdown(getUseRewardCountdown());
        return builder.build();
    }

    public BaiduNativeSmartOptStyleParams getBaiduNativeSmartOptStyleParams() {
        return this.c;
    }

    public BaiduRequestParameters getBaiduRequestParameters() {
        return this.d;
    }

    public BaiduSplashParams getBaiduSplashParams() {
        return this.e;
    }

    public int getDownloadAppConfirmPolicy() {
        return this.b;
    }

    public boolean getShowDialogOnSkip() {
        return this.f;
    }

    public boolean getUseRewardCountdown() {
        return this.g;
    }

    public boolean isCacheVideoOnlyWifi() {
        return this.a;
    }
}

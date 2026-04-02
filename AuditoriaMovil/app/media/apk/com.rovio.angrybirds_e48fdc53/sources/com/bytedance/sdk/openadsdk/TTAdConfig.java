package com.bytedance.sdk.openadsdk;

import com.bytedance.sdk.openadsdk.AdConfig;
import com.bytedance.sdk.openadsdk.live.ITTLiveTokenInjectionAuth;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class TTAdConfig implements AdConfig {
    private int bn;
    private int cu;
    private String dr;
    private String g;
    private String ge;
    private TTCustomController il;
    private boolean ll;
    private ITTLiveTokenInjectionAuth lp;
    private boolean o;
    private String q;
    private boolean rb;
    private boolean t;
    private Map<String, Object> v;
    private int[] wb;
    private int x;
    private boolean xu;
    private boolean yk;

    private TTAdConfig() {
        this.o = false;
        this.bn = 0;
        this.rb = true;
        this.xu = false;
        this.ll = false;
        this.t = true;
        this.yk = false;
        this.cu = 0;
        HashMap hashMap = new HashMap();
        this.v = hashMap;
        hashMap.put("_sdk_is_p_", true);
        this.v.put("_sdk_v_c_", 5305);
        this.v.put("_sdk_v_n_", "5.3.0.5");
        this.v.put("_sdk_p_n_", "com.byted.pangle");
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public ITTLiveTokenInjectionAuth getInjectionAuth() {
        return this.lp;
    }

    public void setInjectionAuth(ITTLiveTokenInjectionAuth iTTLiveTokenInjectionAuth) {
        this.lp = iTTLiveTokenInjectionAuth;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public String getAppId() {
        return this.dr;
    }

    public void setAppId(String str) {
        this.dr = str;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public String getAppName() {
        return this.ge;
    }

    public void setAppName(String str) {
        this.ge = str;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public boolean isPaid() {
        return this.o;
    }

    public void setPaid(boolean z) {
        this.o = z;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public String getKeywords() {
        return this.g;
    }

    public void setKeywords(String str) {
        this.g = str;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public String getData() {
        return this.q;
    }

    public void setData(String str) {
        this.q = str;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public int getTitleBarTheme() {
        return this.bn;
    }

    public void setTitleBarTheme(int i) {
        this.bn = i;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public boolean isAllowShowNotify() {
        return this.rb;
    }

    public void setAllowShowNotify(boolean z) {
        this.rb = z;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public boolean isDebug() {
        return this.xu;
    }

    public void setDebug(boolean z) {
        this.xu = z;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public boolean isAllowShowPageWhenScreenLock() {
        return this.ll;
    }

    public void setAllowShowPageWhenScreenLock(boolean z) {
        this.ll = z;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public int[] getDirectDownloadNetworkType() {
        return this.wb;
    }

    public void setDirectDownloadNetworkType(int... iArr) {
        this.wb = iArr;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public boolean isUseTextureView() {
        return this.t;
    }

    public void setUseTextureView(boolean z) {
        this.t = z;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public boolean isSupportMultiProcess() {
        return this.yk;
    }

    public void setSupportMultiProcess(boolean z) {
        this.yk = z;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    @Deprecated
    public String[] getNeedClearTaskReset() {
        return new String[0];
    }

    @Deprecated
    public void setNeedClearTaskReset(String... strArr) {
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    @Deprecated
    public boolean isAsyncInit() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public void setAgeGroup(int i) {
        this.v.put(TTAdConstant.KEY_AGE_GROUP, Integer.valueOf(i));
    }

    @Deprecated
    public void setAsyncInit(boolean z) {
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public TTCustomController getCustomController() {
        return this.il;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    @Deprecated
    public Object getExtra(String str) {
        return this.v.get(str);
    }

    public void setThemeStatus(int i) {
        this.x = i;
    }

    public int getThemeStatus() {
        return this.x;
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public Object removeExtra(String str) {
        return this.v.remove(str);
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    @Deprecated
    public void setExtra(String str, Object obj) {
        this.v.put(str, obj);
    }

    @Override // com.bytedance.sdk.openadsdk.AdConfig
    public AdConfig.SdkInfo getSdkInfo() {
        return new AdConfig.SdkInfo() { // from class: com.bytedance.sdk.openadsdk.TTAdConfig.1
            @Override // com.bytedance.sdk.openadsdk.AdConfig.SdkInfo
            public boolean isPlugin() {
                return true;
            }

            @Override // com.bytedance.sdk.openadsdk.AdConfig.SdkInfo
            public int sdkVersionCode() {
                return 5305;
            }

            @Override // com.bytedance.sdk.openadsdk.AdConfig.SdkInfo
            public String sdkVersionName() {
                return "5.3.0.5";
            }

            @Override // com.bytedance.sdk.openadsdk.AdConfig.SdkInfo
            public String pluginName() {
                return "com.byted.pangle";
            }
        };
    }

    public void setCustomController(TTCustomController tTCustomController) {
        this.il = tTCustomController;
    }

    /* loaded from: classes.dex */
    public static class Builder {
        private String[] cu;
        private String dr;
        private String g;
        private String ge;
        private ITTLiveTokenInjectionAuth i;
        private TTCustomController il;
        private String q;
        private int[] wb;
        private int x;
        private boolean o = false;
        private int bn = 0;
        private boolean rb = true;
        private boolean xu = false;
        private boolean ll = false;
        private boolean t = true;
        private boolean yk = false;
        private boolean v = false;
        private int lp = 2;

        /* renamed from: de  reason: collision with root package name */
        private int f6de = 0;

        public Builder injectionAuth(ITTLiveTokenInjectionAuth iTTLiveTokenInjectionAuth) {
            this.i = iTTLiveTokenInjectionAuth;
            return this;
        }

        public Builder appId(String str) {
            this.dr = str;
            return this;
        }

        public Builder appName(String str) {
            this.ge = str;
            return this;
        }

        public Builder paid(boolean z) {
            this.o = z;
            return this;
        }

        public Builder keywords(String str) {
            this.g = str;
            return this;
        }

        public Builder data(String str) {
            this.q = str;
            return this;
        }

        public Builder titleBarTheme(int i) {
            this.bn = i;
            return this;
        }

        public Builder allowShowNotify(boolean z) {
            this.rb = z;
            return this;
        }

        public Builder debug(boolean z) {
            this.xu = z;
            return this;
        }

        @Deprecated
        public Builder allowShowPageWhenScreenLock(boolean z) {
            this.ll = z;
            return this;
        }

        public Builder directDownloadNetworkType(int... iArr) {
            this.wb = iArr;
            return this;
        }

        public Builder useTextureView(boolean z) {
            this.t = z;
            return this;
        }

        public Builder supportMultiProcess(boolean z) {
            this.yk = z;
            return this;
        }

        public Builder needClearTaskReset(String... strArr) {
            this.cu = strArr;
            return this;
        }

        public Builder asyncInit(boolean z) {
            this.v = z;
            return this;
        }

        public Builder customController(TTCustomController tTCustomController) {
            this.il = tTCustomController;
            return this;
        }

        public Builder themeStatus(int i) {
            this.x = i;
            return this;
        }

        public Builder setPluginUpdateConfig(int i) {
            this.lp = i;
            return this;
        }

        public Builder setAgeGroup(int i) {
            this.f6de = i;
            return this;
        }

        public TTAdConfig build() {
            TTAdConfig tTAdConfig = new TTAdConfig();
            tTAdConfig.setAppId(this.dr);
            tTAdConfig.setAppName(this.ge);
            tTAdConfig.setPaid(this.o);
            tTAdConfig.setKeywords(this.g);
            tTAdConfig.setData(this.q);
            tTAdConfig.setTitleBarTheme(this.bn);
            tTAdConfig.setAllowShowNotify(this.rb);
            tTAdConfig.setDebug(this.xu);
            tTAdConfig.setAllowShowPageWhenScreenLock(this.ll);
            tTAdConfig.setDirectDownloadNetworkType(this.wb);
            tTAdConfig.setUseTextureView(this.t);
            tTAdConfig.setSupportMultiProcess(this.yk);
            tTAdConfig.setNeedClearTaskReset(this.cu);
            tTAdConfig.setAsyncInit(this.v);
            tTAdConfig.setCustomController(this.il);
            tTAdConfig.setThemeStatus(this.x);
            tTAdConfig.setExtra("plugin_update_conf", Integer.valueOf(this.lp));
            tTAdConfig.setExtra(TTAdConstant.KEY_AGE_GROUP, Integer.valueOf(this.f6de));
            tTAdConfig.setInjectionAuth(this.i);
            return tTAdConfig;
        }
    }
}

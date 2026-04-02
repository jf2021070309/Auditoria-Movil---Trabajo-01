package com.bytedance.msdk.api.v2;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class GMPangleOption {
    private boolean a;
    private int b;
    private boolean c;
    private boolean d;
    private int[] e;
    private boolean f;
    private String[] g;
    private String h;
    private Map<String, String> i;
    private String j;
    private int k;

    /* loaded from: classes.dex */
    public static class Builder {
        private boolean a = false;
        private int b = 0;
        private boolean c = true;
        private boolean d = false;
        private int[] e = {4, 3, 5};
        private boolean f = false;
        private String[] g = new String[0];
        private String h = "";
        private final Map<String, String> i = new HashMap();
        private String j = "";
        private int k = 2;

        public GMPangleOption build() {
            return new GMPangleOption(this);
        }

        public Builder setAllowShowNotify(boolean z) {
            this.c = z;
            return this;
        }

        public Builder setAllowShowPageWhenScreenLock(boolean z) {
            this.d = z;
            return this;
        }

        public Builder setData(String str) {
            this.h = str;
            return this;
        }

        public Builder setData(String str, String str2) {
            this.i.put(str, str2);
            return this;
        }

        public Builder setData(Map<String, String> map) {
            this.i.putAll(map);
            return this;
        }

        public Builder setDirectDownloadNetworkType(int... iArr) {
            this.e = iArr;
            return this;
        }

        public Builder setIsPaid(boolean z) {
            this.a = z;
            return this;
        }

        public Builder setIsUseTextureView(boolean z) {
            this.f = z;
            return this;
        }

        public Builder setKeywords(String str) {
            this.j = str;
            return this;
        }

        public Builder setNeedClearTaskReset(String... strArr) {
            this.g = strArr;
            return this;
        }

        public Builder setTitleBarTheme(int i) {
            this.b = i;
            return this;
        }
    }

    private GMPangleOption(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
        this.e = builder.e;
        this.f = builder.f;
        this.g = builder.g;
        this.h = builder.h;
        this.i = builder.i;
        this.j = builder.j;
        this.k = builder.k;
    }

    public String getData() {
        return this.h;
    }

    public int[] getDirectDownloadNetworkType() {
        return this.e;
    }

    public Map<String, String> getExtraData() {
        return this.i;
    }

    public String getKeywords() {
        return this.j;
    }

    public String[] getNeedClearTaskReset() {
        return this.g;
    }

    public int getPluginUpdateConfig() {
        return this.k;
    }

    public int getTitleBarTheme() {
        return this.b;
    }

    public boolean isAllowShowNotify() {
        return this.c;
    }

    public boolean isAllowShowPageWhenScreenLock() {
        return this.d;
    }

    public boolean isIsUseTextureView() {
        return this.f;
    }

    public boolean isPaid() {
        return this.a;
    }
}

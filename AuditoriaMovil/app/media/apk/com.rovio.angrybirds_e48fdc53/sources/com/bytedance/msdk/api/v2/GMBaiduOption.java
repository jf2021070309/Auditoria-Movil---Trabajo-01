package com.bytedance.msdk.api.v2;
/* loaded from: classes.dex */
public class GMBaiduOption {
    private String a;

    /* loaded from: classes.dex */
    public static class Builder {
        private String a;

        public GMBaiduOption build() {
            return new GMBaiduOption(this);
        }

        public Builder setWxAppId(String str) {
            this.a = str;
            return this;
        }
    }

    private GMBaiduOption(Builder builder) {
        this.a = builder.a;
    }

    public String getWxAppId() {
        return this.a;
    }
}

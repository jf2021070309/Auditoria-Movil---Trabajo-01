package com.bytedance.msdk.api.v2;
/* loaded from: classes.dex */
public class GMGdtOption {
    private boolean a;
    private String b;
    private boolean c;
    private boolean d;

    /* loaded from: classes.dex */
    public static class Builder {
        private boolean a = false;
        private String b = null;
        private boolean c = false;
        private boolean d = false;

        public GMGdtOption build() {
            return new GMGdtOption(this);
        }

        public Builder setOpensdkVer(String str) {
            this.b = str;
            return this;
        }

        public Builder setSupportH265(boolean z) {
            this.c = z;
            return this;
        }

        public Builder setSupportSplashZoomout(boolean z) {
            this.d = z;
            return this;
        }

        public Builder setWxInstalled(boolean z) {
            this.a = z;
            return this;
        }
    }

    private GMGdtOption(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
    }

    public String getOpensdkVer() {
        return this.b;
    }

    public boolean isSupportH265() {
        return this.c;
    }

    public boolean isSupportSplashZoomout() {
        return this.d;
    }

    public boolean isWxInstalled() {
        return this.a;
    }
}

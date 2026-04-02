package com.bytedance.msdk.api;

import android.widget.FrameLayout;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.b;
import java.util.Map;
@Deprecated
/* loaded from: classes.dex */
public class AdSlot extends b {
    public static final int AUTO_HEIGHT = -2;
    @Deprecated
    public static final String CUSTOM_DATA_KEY_ADMOB = "admob";
    @Deprecated
    public static final String CUSTOM_DATA_KEY_BAIDU = "baidu";
    @Deprecated
    public static final String CUSTOM_DATA_KEY_GDT = "gdt";
    @Deprecated
    public static final String CUSTOM_DATA_KEY_KLEVIN = "klevin";
    @Deprecated
    public static final String CUSTOM_DATA_KEY_KS = "ks";
    @Deprecated
    public static final String CUSTOM_DATA_KEY_MINTEGRAL = "mintegral";
    @Deprecated
    public static final String CUSTOM_DATA_KEY_PANGLE = "pangle";
    @Deprecated
    public static final String CUSTOM_DATA_KEY_SIGMOB = "sigmob";
    @Deprecated
    public static final String CUSTOM_DATA_KEY_UNITY = "unity";
    public static final int FULL_WIDTH = -1;
    public static final int POSITION_BOTTOM = 2;
    public static final int POSITION_FEED = 3;
    public static final int POSITION_FULL_SCREEN = 5;
    public static final int POSITION_MIDDLE = 4;
    public static final int POSITION_TOP = 1;
    public static final int TYPE_BANNER = 1;
    @Deprecated
    public static final int TYPE_CACHED_SPLASH = 4;
    public static final int TYPE_DRAW_FEED = 9;
    public static final int TYPE_EXPRESS_AD = 1;
    public static final int TYPE_FEED = 5;
    public static final int TYPE_FULL_SCREEN_VIDEO = 8;
    public static final int TYPE_INTERACTION_AD = 2;
    public static final int TYPE_INTERACTION_FULL = 10;
    public static final int TYPE_NATIVE_AD = 2;
    public static final int TYPE_REWARD_VIDEO = 7;
    public static final int TYPE_SPLASH = 3;
    private TTVideoOption A;
    private TTRequestExtraParams B;
    private AdmobNativeAdOptions C;
    private FrameLayout.LayoutParams D;
    private String E;
    private boolean F;
    @Deprecated
    private int G;
    @Deprecated
    private int H;
    private boolean I;
    private boolean J;
    private double K;
    private int L;
    private int M;
    private boolean N;
    private String O;
    private String P;
    private String k;
    private long l;
    private String m;
    private int n;
    private int o;
    private int p;
    private boolean q;
    private int r;
    private int s;
    private int t;
    private String u;
    private int v;
    private String w;
    private String x;
    private Map<String, String> y;
    private int z;

    /* loaded from: classes.dex */
    public static class Builder {
        @Deprecated
        private String e;
        @Deprecated
        private int f;
        @Deprecated
        private String g;
        @Deprecated
        private Map<String, String> h;
        @Deprecated
        private String i;
        @Deprecated
        private int j;
        @Deprecated
        private int k;
        @Deprecated
        private TTVideoOption l;
        @Deprecated
        private TTRequestExtraParams m;
        @Deprecated
        private AdmobNativeAdOptions o;
        @Deprecated
        private FrameLayout.LayoutParams p;
        @Deprecated
        private String q;
        private boolean r;
        @Deprecated
        private boolean u;
        @Deprecated
        private boolean v;
        @Deprecated
        private boolean w;
        private String x;
        @Deprecated
        private int a = 640;
        @Deprecated
        private int b = 320;
        @Deprecated
        private boolean c = true;
        @Deprecated
        private int d = 1;
        @Deprecated
        private int n = 3;
        @Deprecated
        private int s = 1;
        @Deprecated
        private int t = 0;

        public AdSlot build() {
            AdSlot adSlot = new AdSlot();
            adSlot.p = this.d;
            adSlot.q = this.c;
            adSlot.n = this.a;
            adSlot.o = this.b;
            adSlot.u = this.e;
            adSlot.v = this.f;
            adSlot.w = this.g;
            adSlot.y = this.h;
            adSlot.x = this.i;
            adSlot.z = this.j;
            adSlot.r = this.k;
            adSlot.A = this.l;
            adSlot.B = this.m;
            adSlot.C = this.o;
            adSlot.t = this.n;
            adSlot.D = this.p;
            adSlot.E = this.q;
            adSlot.F = this.r;
            adSlot.G = this.s;
            adSlot.H = this.t;
            adSlot.I = this.u;
            adSlot.J = this.v;
            adSlot.N = this.w;
            adSlot.O = this.x;
            return adSlot;
        }

        @Deprecated
        public Builder setAdCount(int i) {
            this.d = i;
            return this;
        }

        @Deprecated
        public Builder setAdType(int i) {
            this.k = i;
            return this;
        }

        @Deprecated
        public Builder setAdmobNativeAdOptions(AdmobNativeAdOptions admobNativeAdOptions) {
            this.o = admobNativeAdOptions;
            return this;
        }

        @Deprecated
        public Builder setBannerSize(int i) {
            this.n = i;
            return this;
        }

        @Deprecated
        public Builder setBidNotify(boolean z) {
            this.u = z;
            return this;
        }

        @Deprecated
        public Builder setCustomData(Map<String, String> map) {
            this.h = map;
            return this;
        }

        @Deprecated
        public Builder setDownloadType(int i) {
            this.t = i;
            return this;
        }

        @Deprecated
        public Builder setForceLoadBottom(boolean z) {
            this.v = z;
            return this;
        }

        public Builder setGdtNativeAdLogoParams(FrameLayout.LayoutParams layoutParams) {
            this.p = layoutParams;
            return this;
        }

        @Deprecated
        public Builder setImageAdSize(int i, int i2) {
            this.a = i;
            this.b = i2;
            return this;
        }

        @Deprecated
        public Builder setMediaExtra(String str) {
            this.g = str;
            return this;
        }

        @Deprecated
        public Builder setOrientation(int i) {
            this.j = i;
            return this;
        }

        @Deprecated
        public Builder setRewardAmount(int i) {
            this.f = i;
            return this;
        }

        @Deprecated
        public Builder setRewardName(String str) {
            this.e = str;
            return this;
        }

        public Builder setScenarioId(String str) {
            this.x = str;
            return this;
        }

        @Deprecated
        public Builder setSplashButtonType(int i) {
            this.s = i;
            return this;
        }

        @Deprecated
        public Builder setSplashShakeButton(boolean z) {
            this.w = z;
            return this;
        }

        @Deprecated
        public Builder setSupportDeepLink(boolean z) {
            this.c = z;
            return this;
        }

        @Deprecated
        public Builder setTTRequestExtraParams(TTRequestExtraParams tTRequestExtraParams) {
            this.m = tTRequestExtraParams;
            return this;
        }

        @Deprecated
        public Builder setTTVideoOption(TTVideoOption tTVideoOption) {
            this.l = tTVideoOption;
            return this;
        }

        @Deprecated
        public Builder setTestSlotId(String str) {
            this.q = str;
            return this;
        }

        @Deprecated
        public Builder setUserID(String str) {
            this.i = str;
            return this;
        }

        public Builder setV2Request(boolean z) {
            this.r = z;
            return this;
        }
    }

    private AdSlot() {
        this.s = 2;
        this.t = 3;
    }

    public int getAdCount() {
        int netWorkNum = getNetWorkNum();
        if (netWorkNum > 3) {
            netWorkNum = 3;
        }
        return netWorkNum > 0 ? netWorkNum : this.p;
    }

    public int getAdStyleType() {
        return this.s;
    }

    public int getAdType() {
        return this.r;
    }

    public String getAdUnitId() {
        return this.k;
    }

    public AdmobNativeAdOptions getAdmobNativeAdOptions() {
        return this.C;
    }

    public int getBannerSize() {
        return this.t;
    }

    @Deprecated
    public double getBidFloor() {
        return this.K;
    }

    public Map<String, String> getCustomData() {
        return this.y;
    }

    @Deprecated
    public int getDownloadType() {
        return this.H;
    }

    public FrameLayout.LayoutParams getGdtNativeAdLogoParams() {
        return this.D;
    }

    public int getImgAcceptedHeight() {
        return this.o;
    }

    public int getImgAcceptedWidth() {
        return this.n;
    }

    @Deprecated
    public String getMediaExtra() {
        return this.w;
    }

    public int getOrientation() {
        return this.z;
    }

    public int getParalleType() {
        return this.L;
    }

    public int getReqParallelNum() {
        return this.M;
    }

    public TTRequestExtraParams getReuestParam() {
        if (this.B == null) {
            this.B = new TTRequestExtraParams();
        }
        return this.B;
    }

    public int getRewardAmount() {
        return this.v;
    }

    public String getRewardName() {
        return this.u;
    }

    public String getScenarioId() {
        return this.O;
    }

    @Deprecated
    public int getSplashButtonType() {
        return this.G;
    }

    public boolean getSplashShakeButton() {
        return this.N;
    }

    public TTVideoOption getTTVideoOption() {
        return this.A;
    }

    @Deprecated
    public String getTestSlotId() {
        return this.E;
    }

    public String getUserID() {
        return this.x;
    }

    @Deprecated
    public String getVersion() {
        return this.m;
    }

    public String getWaterfallABTest() {
        return this.P;
    }

    @Deprecated
    public long getWaterfallId() {
        return this.l;
    }

    public boolean isBidNotify() {
        return this.I;
    }

    public boolean isForceLoadBottom() {
        return this.J;
    }

    public boolean isSupportDeepLink() {
        return this.q;
    }

    public boolean isV2Request() {
        return this.F;
    }

    public void setAdCount(int i) {
        this.p = i;
    }

    public void setAdType(int i) {
        this.r = i;
    }

    public void setAdUnitId(String str) {
        this.k = str;
    }

    @Deprecated
    public void setBidFloor(double d) {
        this.K = d;
    }

    public void setParalleType(int i) {
        this.L = i;
    }

    public void setReqParallelNum(int i) {
        this.M = i;
    }

    public void setScenarioId(String str) {
        this.O = str;
    }

    public void setSplashShakeButton(boolean z) {
        this.N = z;
    }

    public void setTTVideoOption(TTVideoOption tTVideoOption) {
        this.A = tTVideoOption;
    }

    @Deprecated
    public void setTestSlotId(String str) {
        this.E = str;
    }

    @Deprecated
    public void setVersion(String str) {
        this.m = str;
    }

    public void setWaterfallABTest(String str) {
        this.P = str;
    }

    @Deprecated
    public void setWaterfallId(long j) {
        this.l = j;
    }
}

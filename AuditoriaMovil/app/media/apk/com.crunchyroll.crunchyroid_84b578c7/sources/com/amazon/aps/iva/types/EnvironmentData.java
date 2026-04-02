package com.amazon.aps.iva.types;
/* loaded from: classes.dex */
public class EnvironmentData {
    private String appId;
    private CloseButtonSupport closeButtonSupport;
    private Dimensions creativeDimensions;
    private String deviceId;
    private Boolean fullscreen;
    private Boolean fullscreenAllowed;
    private Boolean muted;
    private NavigationSupport navigationSupport;
    private float nonLinearDuration;
    private String pubUUID;
    private String siteUrl;
    private String skipoffset;
    private SkippableState skippableState;
    private String useragent;
    private Boolean variableDurationAllowed;
    private String version;
    private Dimensions videoDimensions;
    private float volume;

    /* loaded from: classes.dex */
    public static class EnvironmentDataBuilder {
        private boolean appId$set;
        private String appId$value;
        private CloseButtonSupport closeButtonSupport;
        private Dimensions creativeDimensions;
        private boolean deviceId$set;
        private String deviceId$value;
        private boolean fullscreen$set;
        private Boolean fullscreen$value;
        private boolean fullscreenAllowed$set;
        private Boolean fullscreenAllowed$value;
        private boolean muted$set;
        private Boolean muted$value;
        private NavigationSupport navigationSupport;
        private boolean nonLinearDuration$set;
        private float nonLinearDuration$value;
        private boolean pubUUID$set;
        private String pubUUID$value;
        private boolean siteUrl$set;
        private String siteUrl$value;
        private boolean skipoffset$set;
        private String skipoffset$value;
        private boolean skippableState$set;
        private SkippableState skippableState$value;
        private boolean useragent$set;
        private String useragent$value;
        private boolean variableDurationAllowed$set;
        private Boolean variableDurationAllowed$value;
        private boolean version$set;
        private String version$value;
        private Dimensions videoDimensions;
        private boolean volume$set;
        private float volume$value;

        public EnvironmentDataBuilder appId(String str) {
            this.appId$value = str;
            this.appId$set = true;
            return this;
        }

        public EnvironmentData build() {
            Boolean bool = this.fullscreen$value;
            if (!this.fullscreen$set) {
                bool = EnvironmentData.access$000();
            }
            Boolean bool2 = bool;
            Boolean bool3 = this.fullscreenAllowed$value;
            if (!this.fullscreenAllowed$set) {
                bool3 = EnvironmentData.access$100();
            }
            Boolean bool4 = bool3;
            Boolean bool5 = this.variableDurationAllowed$value;
            if (!this.variableDurationAllowed$set) {
                bool5 = EnvironmentData.access$200();
            }
            Boolean bool6 = bool5;
            SkippableState skippableState = this.skippableState$value;
            if (!this.skippableState$set) {
                skippableState = EnvironmentData.access$300();
            }
            SkippableState skippableState2 = skippableState;
            String str = this.skipoffset$value;
            if (!this.skipoffset$set) {
                str = EnvironmentData.access$400();
            }
            String str2 = str;
            String str3 = this.version$value;
            if (!this.version$set) {
                str3 = EnvironmentData.access$500();
            }
            String str4 = str3;
            String str5 = this.siteUrl$value;
            if (!this.siteUrl$set) {
                str5 = EnvironmentData.access$600();
            }
            String str6 = str5;
            String str7 = this.appId$value;
            if (!this.appId$set) {
                str7 = EnvironmentData.access$700();
            }
            String str8 = str7;
            String str9 = this.pubUUID$value;
            if (!this.pubUUID$set) {
                str9 = EnvironmentData.access$800();
            }
            String str10 = str9;
            String str11 = this.useragent$value;
            if (!this.useragent$set) {
                str11 = EnvironmentData.access$900();
            }
            String str12 = str11;
            String str13 = this.deviceId$value;
            if (!this.deviceId$set) {
                str13 = EnvironmentData.access$1000();
            }
            String str14 = str13;
            Boolean bool7 = this.muted$value;
            if (!this.muted$set) {
                bool7 = EnvironmentData.access$1100();
            }
            Boolean bool8 = bool7;
            float f = this.volume$value;
            if (!this.volume$set) {
                f = EnvironmentData.access$1200();
            }
            float f2 = f;
            float f3 = this.nonLinearDuration$value;
            if (!this.nonLinearDuration$set) {
                f3 = EnvironmentData.access$1300();
            }
            return new EnvironmentData(this.videoDimensions, this.creativeDimensions, bool2, bool4, bool6, skippableState2, str2, str4, str6, str8, str10, str12, str14, bool8, f2, this.navigationSupport, this.closeButtonSupport, f3);
        }

        public EnvironmentDataBuilder closeButtonSupport(CloseButtonSupport closeButtonSupport) {
            this.closeButtonSupport = closeButtonSupport;
            return this;
        }

        public EnvironmentDataBuilder creativeDimensions(Dimensions dimensions) {
            this.creativeDimensions = dimensions;
            return this;
        }

        public EnvironmentDataBuilder deviceId(String str) {
            this.deviceId$value = str;
            this.deviceId$set = true;
            return this;
        }

        public EnvironmentDataBuilder fullscreen(Boolean bool) {
            this.fullscreen$value = bool;
            this.fullscreen$set = true;
            return this;
        }

        public EnvironmentDataBuilder fullscreenAllowed(Boolean bool) {
            this.fullscreenAllowed$value = bool;
            this.fullscreenAllowed$set = true;
            return this;
        }

        public EnvironmentDataBuilder muted(Boolean bool) {
            this.muted$value = bool;
            this.muted$set = true;
            return this;
        }

        public EnvironmentDataBuilder navigationSupport(NavigationSupport navigationSupport) {
            this.navigationSupport = navigationSupport;
            return this;
        }

        public EnvironmentDataBuilder nonLinearDuration(float f) {
            this.nonLinearDuration$value = f;
            this.nonLinearDuration$set = true;
            return this;
        }

        public EnvironmentDataBuilder pubUUID(String str) {
            this.pubUUID$value = str;
            this.pubUUID$set = true;
            return this;
        }

        public EnvironmentDataBuilder siteUrl(String str) {
            this.siteUrl$value = str;
            this.siteUrl$set = true;
            return this;
        }

        public EnvironmentDataBuilder skipoffset(String str) {
            this.skipoffset$value = str;
            this.skipoffset$set = true;
            return this;
        }

        public EnvironmentDataBuilder skippableState(SkippableState skippableState) {
            this.skippableState$value = skippableState;
            this.skippableState$set = true;
            return this;
        }

        public String toString() {
            return "EnvironmentData.EnvironmentDataBuilder(videoDimensions=" + this.videoDimensions + ", creativeDimensions=" + this.creativeDimensions + ", fullscreen$value=" + this.fullscreen$value + ", fullscreenAllowed$value=" + this.fullscreenAllowed$value + ", variableDurationAllowed$value=" + this.variableDurationAllowed$value + ", skippableState$value=" + this.skippableState$value + ", skipoffset$value=" + this.skipoffset$value + ", version$value=" + this.version$value + ", siteUrl$value=" + this.siteUrl$value + ", appId$value=" + this.appId$value + ", pubUUID$value=" + this.pubUUID$value + ", useragent$value=" + this.useragent$value + ", deviceId$value=" + this.deviceId$value + ", muted$value=" + this.muted$value + ", volume$value=" + this.volume$value + ", navigationSupport=" + this.navigationSupport + ", closeButtonSupport=" + this.closeButtonSupport + ", nonLinearDuration$value=" + this.nonLinearDuration$value + ")";
        }

        public EnvironmentDataBuilder useragent(String str) {
            this.useragent$value = str;
            this.useragent$set = true;
            return this;
        }

        public EnvironmentDataBuilder variableDurationAllowed(Boolean bool) {
            this.variableDurationAllowed$value = bool;
            this.variableDurationAllowed$set = true;
            return this;
        }

        public EnvironmentDataBuilder version(String str) {
            this.version$value = str;
            this.version$set = true;
            return this;
        }

        public EnvironmentDataBuilder videoDimensions(Dimensions dimensions) {
            this.videoDimensions = dimensions;
            return this;
        }

        public EnvironmentDataBuilder volume(float f) {
            this.volume$value = f;
            this.volume$set = true;
            return this;
        }
    }

    private static String $default$appId() {
        return "";
    }

    private static String $default$deviceId() {
        return "";
    }

    private static float $default$nonLinearDuration() {
        return 0.0f;
    }

    private static String $default$pubUUID() {
        return "";
    }

    private static String $default$siteUrl() {
        return "";
    }

    private static String $default$skipoffset() {
        return "";
    }

    private static String $default$useragent() {
        return "";
    }

    private static String $default$version() {
        return "1.0";
    }

    private static float $default$volume() {
        return 0.0f;
    }

    public EnvironmentData(Dimensions dimensions, Dimensions dimensions2, Boolean bool, Boolean bool2, Boolean bool3, SkippableState skippableState, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool4, float f, NavigationSupport navigationSupport, CloseButtonSupport closeButtonSupport, float f2) {
        this.videoDimensions = dimensions;
        this.creativeDimensions = dimensions2;
        this.fullscreen = bool;
        this.fullscreenAllowed = bool2;
        this.variableDurationAllowed = bool3;
        this.skippableState = skippableState;
        this.skipoffset = str;
        this.version = str2;
        this.siteUrl = str3;
        this.appId = str4;
        this.pubUUID = str5;
        this.useragent = str6;
        this.deviceId = str7;
        this.muted = bool4;
        this.volume = f;
        this.navigationSupport = navigationSupport;
        this.closeButtonSupport = closeButtonSupport;
        this.nonLinearDuration = f2;
    }

    public static /* synthetic */ Boolean access$000() {
        return Boolean.FALSE;
    }

    public static /* synthetic */ Boolean access$100() {
        return Boolean.FALSE;
    }

    public static /* synthetic */ String access$1000() {
        return $default$deviceId();
    }

    public static /* synthetic */ Boolean access$1100() {
        return Boolean.FALSE;
    }

    public static /* synthetic */ float access$1200() {
        return $default$volume();
    }

    public static /* synthetic */ float access$1300() {
        return $default$nonLinearDuration();
    }

    public static /* synthetic */ Boolean access$200() {
        return Boolean.FALSE;
    }

    public static /* synthetic */ SkippableState access$300() {
        return SkippableState.AD_HANDLES;
    }

    public static /* synthetic */ String access$400() {
        return $default$skipoffset();
    }

    public static /* synthetic */ String access$500() {
        return $default$version();
    }

    public static /* synthetic */ String access$600() {
        return $default$siteUrl();
    }

    public static /* synthetic */ String access$700() {
        return $default$appId();
    }

    public static /* synthetic */ String access$800() {
        return $default$pubUUID();
    }

    public static /* synthetic */ String access$900() {
        return $default$useragent();
    }

    public static EnvironmentDataBuilder builder(Dimensions dimensions, Dimensions dimensions2, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2) {
        return defaultBuilder().videoDimensions(dimensions).creativeDimensions(dimensions2).fullscreen(bool).fullscreenAllowed(bool2).variableDurationAllowed(bool3).appId(str).pubUUID(str2);
    }

    public static EnvironmentDataBuilder defaultBuilder() {
        return new EnvironmentDataBuilder();
    }

    public String getAppId() {
        return this.appId;
    }

    public CloseButtonSupport getCloseButtonSupport() {
        return this.closeButtonSupport;
    }

    public Dimensions getCreativeDimensions() {
        return this.creativeDimensions;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public Boolean getFullscreen() {
        return this.fullscreen;
    }

    public Boolean getFullscreenAllowed() {
        return this.fullscreenAllowed;
    }

    public Boolean getMuted() {
        return this.muted;
    }

    public NavigationSupport getNavigationSupport() {
        return this.navigationSupport;
    }

    public float getNonLinearDuration() {
        return this.nonLinearDuration;
    }

    public String getPubUUID() {
        return this.pubUUID;
    }

    public String getSiteUrl() {
        return this.siteUrl;
    }

    public String getSkipoffset() {
        return this.skipoffset;
    }

    public SkippableState getSkippableState() {
        return this.skippableState;
    }

    public String getUseragent() {
        return this.useragent;
    }

    public Boolean getVariableDurationAllowed() {
        return this.variableDurationAllowed;
    }

    public String getVersion() {
        return this.version;
    }

    public Dimensions getVideoDimensions() {
        return this.videoDimensions;
    }

    public float getVolume() {
        return this.volume;
    }

    public String toString() {
        return "EnvironmentData(videoDimensions=" + getVideoDimensions() + ", creativeDimensions=" + getCreativeDimensions() + ", fullscreen=" + getFullscreen() + ", fullscreenAllowed=" + getFullscreenAllowed() + ", variableDurationAllowed=" + getVariableDurationAllowed() + ", skippableState=" + getSkippableState() + ", skipoffset=" + getSkipoffset() + ", version=" + getVersion() + ", siteUrl=" + getSiteUrl() + ", appId=" + getAppId() + ", pubUUID=" + getPubUUID() + ", useragent=" + getUseragent() + ", deviceId=" + getDeviceId() + ", muted=" + getMuted() + ", volume=" + getVolume() + ", navigationSupport=" + getNavigationSupport() + ", closeButtonSupport=" + getCloseButtonSupport() + ", nonLinearDuration=" + getNonLinearDuration() + ")";
    }
}

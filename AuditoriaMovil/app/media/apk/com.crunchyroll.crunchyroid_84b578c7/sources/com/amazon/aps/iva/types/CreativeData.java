package com.amazon.aps.iva.types;

import lombok.NonNull;
/* loaded from: classes.dex */
public class CreativeData {
    private String adId;
    @NonNull
    private transient AdOverlayState adOverlayState;
    private String adParameters;
    private String adServingId;
    private String clickThruUri;
    private String creativeId;
    private String creativeUrl;
    private String errorUrl;
    private String impressionId;

    /* loaded from: classes.dex */
    public static class CreativeDataBuilder {
        private boolean adId$set;
        private String adId$value;
        private boolean adOverlayState$set;
        private AdOverlayState adOverlayState$value;
        private boolean adParameters$set;
        private String adParameters$value;
        private boolean adServingId$set;
        private String adServingId$value;
        private boolean clickThruUri$set;
        private String clickThruUri$value;
        private boolean creativeId$set;
        private String creativeId$value;
        private boolean creativeUrl$set;
        private String creativeUrl$value;
        private boolean errorUrl$set;
        private String errorUrl$value;
        private boolean impressionId$set;
        private String impressionId$value;

        public CreativeDataBuilder adId(String str) {
            this.adId$value = str;
            this.adId$set = true;
            return this;
        }

        public CreativeDataBuilder adOverlayState(@NonNull AdOverlayState adOverlayState) {
            if (adOverlayState != null) {
                this.adOverlayState$value = adOverlayState;
                this.adOverlayState$set = true;
                return this;
            }
            throw new NullPointerException("adOverlayState is marked non-null but is null");
        }

        public CreativeDataBuilder adParameters(String str) {
            this.adParameters$value = str;
            this.adParameters$set = true;
            return this;
        }

        public CreativeDataBuilder adServingId(String str) {
            this.adServingId$value = str;
            this.adServingId$set = true;
            return this;
        }

        public CreativeData build() {
            String str = this.adParameters$value;
            if (!this.adParameters$set) {
                str = CreativeData.access$000();
            }
            String str2 = str;
            String str3 = this.adId$value;
            if (!this.adId$set) {
                str3 = CreativeData.access$100();
            }
            String str4 = str3;
            String str5 = this.clickThruUri$value;
            if (!this.clickThruUri$set) {
                str5 = CreativeData.access$200();
            }
            String str6 = str5;
            String str7 = this.creativeId$value;
            if (!this.creativeId$set) {
                str7 = CreativeData.access$300();
            }
            String str8 = str7;
            String str9 = this.adServingId$value;
            if (!this.adServingId$set) {
                str9 = CreativeData.access$400();
            }
            String str10 = str9;
            String str11 = this.creativeUrl$value;
            if (!this.creativeUrl$set) {
                str11 = CreativeData.access$500();
            }
            String str12 = str11;
            String str13 = this.errorUrl$value;
            if (!this.errorUrl$set) {
                str13 = CreativeData.access$600();
            }
            String str14 = str13;
            String str15 = this.impressionId$value;
            if (!this.impressionId$set) {
                str15 = CreativeData.access$700();
            }
            String str16 = str15;
            AdOverlayState adOverlayState = this.adOverlayState$value;
            if (!this.adOverlayState$set) {
                adOverlayState = CreativeData.access$800();
            }
            return new CreativeData(str2, str4, str6, str8, str10, str12, str14, str16, adOverlayState);
        }

        public CreativeDataBuilder clickThruUri(String str) {
            this.clickThruUri$value = str;
            this.clickThruUri$set = true;
            return this;
        }

        public CreativeDataBuilder creativeId(String str) {
            this.creativeId$value = str;
            this.creativeId$set = true;
            return this;
        }

        public CreativeDataBuilder creativeUrl(String str) {
            this.creativeUrl$value = str;
            this.creativeUrl$set = true;
            return this;
        }

        public CreativeDataBuilder errorUrl(String str) {
            this.errorUrl$value = str;
            this.errorUrl$set = true;
            return this;
        }

        public CreativeDataBuilder impressionId(String str) {
            this.impressionId$value = str;
            this.impressionId$set = true;
            return this;
        }

        public String toString() {
            return "CreativeData.CreativeDataBuilder(adParameters$value=" + this.adParameters$value + ", adId$value=" + this.adId$value + ", clickThruUri$value=" + this.clickThruUri$value + ", creativeId$value=" + this.creativeId$value + ", adServingId$value=" + this.adServingId$value + ", creativeUrl$value=" + this.creativeUrl$value + ", errorUrl$value=" + this.errorUrl$value + ", impressionId$value=" + this.impressionId$value + ", adOverlayState$value=" + this.adOverlayState$value + ")";
        }
    }

    private static String $default$adId() {
        return "";
    }

    private static String $default$adParameters() {
        return "";
    }

    private static String $default$adServingId() {
        return "";
    }

    private static String $default$clickThruUri() {
        return "";
    }

    private static String $default$creativeId() {
        return "";
    }

    private static String $default$creativeUrl() {
        return "";
    }

    private static String $default$errorUrl() {
        return "";
    }

    private static String $default$impressionId() {
        return "";
    }

    public CreativeData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, @NonNull AdOverlayState adOverlayState) {
        if (adOverlayState != null) {
            this.adParameters = str;
            this.adId = str2;
            this.clickThruUri = str3;
            this.creativeId = str4;
            this.adServingId = str5;
            this.creativeUrl = str6;
            this.errorUrl = str7;
            this.impressionId = str8;
            this.adOverlayState = adOverlayState;
            return;
        }
        throw new NullPointerException("adOverlayState is marked non-null but is null");
    }

    public static /* synthetic */ String access$000() {
        return $default$adParameters();
    }

    public static /* synthetic */ String access$100() {
        return $default$adId();
    }

    public static /* synthetic */ String access$200() {
        return $default$clickThruUri();
    }

    public static /* synthetic */ String access$300() {
        return $default$creativeId();
    }

    public static /* synthetic */ String access$400() {
        return $default$adServingId();
    }

    public static /* synthetic */ String access$500() {
        return $default$creativeUrl();
    }

    public static /* synthetic */ String access$600() {
        return $default$errorUrl();
    }

    public static /* synthetic */ String access$700() {
        return $default$impressionId();
    }

    public static /* synthetic */ AdOverlayState access$800() {
        return AdOverlayState.UNINITIALIZED;
    }

    public static CreativeDataBuilder builder(String str) {
        return defaultBuilder().adParameters(str);
    }

    public static CreativeDataBuilder defaultBuilder() {
        return new CreativeDataBuilder();
    }

    public String getAdId() {
        return this.adId;
    }

    @NonNull
    public AdOverlayState getAdOverlayState() {
        return this.adOverlayState;
    }

    public String getAdParameters() {
        return this.adParameters;
    }

    public String getAdServingId() {
        return this.adServingId;
    }

    public String getClickThruUri() {
        return this.clickThruUri;
    }

    public String getCreativeId() {
        return this.creativeId;
    }

    public String getCreativeUrl() {
        return this.creativeUrl;
    }

    public String getErrorUrl() {
        return this.errorUrl;
    }

    public String getImpressionId() {
        return this.impressionId;
    }

    public void setAdId(String str) {
        this.adId = str;
    }

    public void setAdOverlayState(@NonNull AdOverlayState adOverlayState) {
        if (adOverlayState != null) {
            this.adOverlayState = adOverlayState;
            return;
        }
        throw new NullPointerException("adOverlayState is marked non-null but is null");
    }

    public void setAdParameters(String str) {
        this.adParameters = str;
    }

    public void setAdServingId(String str) {
        this.adServingId = str;
    }

    public void setClickThruUri(String str) {
        this.clickThruUri = str;
    }

    public void setCreativeId(String str) {
        this.creativeId = str;
    }

    public void setCreativeUrl(String str) {
        this.creativeUrl = str;
    }

    public void setErrorUrl(String str) {
        this.errorUrl = str;
    }

    public void setImpressionId(String str) {
        this.impressionId = str;
    }

    public String toString() {
        return "CreativeData(adParameters=" + getAdParameters() + ", adId=" + getAdId() + ", clickThruUri=" + getClickThruUri() + ", creativeId=" + getCreativeId() + ", adServingId=" + getAdServingId() + ", creativeUrl=" + getCreativeUrl() + ", errorUrl=" + getErrorUrl() + ", impressionId=" + getImpressionId() + ", adOverlayState=" + getAdOverlayState() + ")";
    }
}

package com.zipoapps.ads.config;

import ch.qos.logback.core.CoreConstants;
import e.a.d.a.a;
import h.o.c.f;
import h.o.c.j;
/* loaded from: classes.dex */
public final class AdManagerConfiguration {
    private final String banner;
    private final String exit_banner;
    private final String exit_native;
    private final String interstitial;

    /* renamed from: native  reason: not valid java name */
    private final String f1native;
    private final String rewarded;

    /* loaded from: classes.dex */
    public static final class Builder {
        private String banner;
        private String exit_banner;
        private String exit_native;
        private String interstitial;

        /* renamed from: native  reason: not valid java name */
        private String f2native;
        private String rewarded;

        public Builder() {
            this(null, null, null, null, null, null, 63, null);
        }

        public Builder(String str, String str2, String str3, String str4, String str5, String str6) {
            this.banner = str;
            this.interstitial = str2;
            this.f2native = str3;
            this.rewarded = str4;
            this.exit_banner = str5;
            this.exit_native = str6;
        }

        public /* synthetic */ Builder(String str, String str2, String str3, String str4, String str5, String str6, int i2, f fVar) {
            this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? null : str6);
        }

        private final String component1() {
            return this.banner;
        }

        private final String component2() {
            return this.interstitial;
        }

        private final String component3() {
            return this.f2native;
        }

        private final String component4() {
            return this.rewarded;
        }

        private final String component5() {
            return this.exit_banner;
        }

        private final String component6() {
            return this.exit_native;
        }

        public static /* synthetic */ Builder copy$default(Builder builder, String str, String str2, String str3, String str4, String str5, String str6, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = builder.banner;
            }
            if ((i2 & 2) != 0) {
                str2 = builder.interstitial;
            }
            String str7 = str2;
            if ((i2 & 4) != 0) {
                str3 = builder.f2native;
            }
            String str8 = str3;
            if ((i2 & 8) != 0) {
                str4 = builder.rewarded;
            }
            String str9 = str4;
            if ((i2 & 16) != 0) {
                str5 = builder.exit_banner;
            }
            String str10 = str5;
            if ((i2 & 32) != 0) {
                str6 = builder.exit_native;
            }
            return builder.copy(str, str7, str8, str9, str10, str6);
        }

        public final Builder bannerAd(String str) {
            j.e(str, "bannerId");
            this.banner = str;
            return this;
        }

        public final AdManagerConfiguration build() {
            String str = this.interstitial;
            if (str != null) {
                return new AdManagerConfiguration(this.banner, str, this.f2native, this.rewarded, this.exit_banner, this.exit_native);
            }
            throw new IllegalStateException("Interstitial Id is mandatory".toString());
        }

        public final Builder copy(String str, String str2, String str3, String str4, String str5, String str6) {
            return new Builder(str, str2, str3, str4, str5, str6);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Builder) {
                Builder builder = (Builder) obj;
                return j.a(this.banner, builder.banner) && j.a(this.interstitial, builder.interstitial) && j.a(this.f2native, builder.f2native) && j.a(this.rewarded, builder.rewarded) && j.a(this.exit_banner, builder.exit_banner) && j.a(this.exit_native, builder.exit_native);
            }
            return false;
        }

        public final Builder exitBannerAd(String str) {
            j.e(str, "bannerId");
            this.exit_banner = str;
            return this;
        }

        public final Builder exitNativeAd(String str) {
            j.e(str, "nativeId");
            this.exit_native = str;
            return this;
        }

        public int hashCode() {
            String str = this.banner;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.interstitial;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f2native;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.rewarded;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.exit_banner;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.exit_native;
            return hashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        public final Builder interstitialAd(String str) {
            j.e(str, "interstitialId");
            this.interstitial = str;
            return this;
        }

        public final Builder nativeAd(String str) {
            j.e(str, "nativeId");
            this.f2native = str;
            return this;
        }

        public final Builder rewardedAd(String str) {
            j.e(str, "rewardedId");
            this.rewarded = str;
            return this;
        }

        public String toString() {
            StringBuilder y = a.y("Builder(banner=");
            y.append((Object) this.banner);
            y.append(", interstitial=");
            y.append((Object) this.interstitial);
            y.append(", native=");
            y.append((Object) this.f2native);
            y.append(", rewarded=");
            y.append((Object) this.rewarded);
            y.append(", exit_banner=");
            y.append((Object) this.exit_banner);
            y.append(", exit_native=");
            y.append((Object) this.exit_native);
            y.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return y.toString();
        }
    }

    public AdManagerConfiguration(String str, String str2, String str3, String str4, String str5, String str6) {
        j.e(str2, "interstitial");
        this.banner = str;
        this.interstitial = str2;
        this.f1native = str3;
        this.rewarded = str4;
        this.exit_banner = str5;
        this.exit_native = str6;
    }

    public /* synthetic */ AdManagerConfiguration(String str, String str2, String str3, String str4, String str5, String str6, int i2, f fVar) {
        this((i2 & 1) != 0 ? null : str, str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? null : str6);
    }

    public static /* synthetic */ AdManagerConfiguration copy$default(AdManagerConfiguration adManagerConfiguration, String str, String str2, String str3, String str4, String str5, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = adManagerConfiguration.banner;
        }
        if ((i2 & 2) != 0) {
            str2 = adManagerConfiguration.interstitial;
        }
        String str7 = str2;
        if ((i2 & 4) != 0) {
            str3 = adManagerConfiguration.f1native;
        }
        String str8 = str3;
        if ((i2 & 8) != 0) {
            str4 = adManagerConfiguration.rewarded;
        }
        String str9 = str4;
        if ((i2 & 16) != 0) {
            str5 = adManagerConfiguration.exit_banner;
        }
        String str10 = str5;
        if ((i2 & 32) != 0) {
            str6 = adManagerConfiguration.exit_native;
        }
        return adManagerConfiguration.copy(str, str7, str8, str9, str10, str6);
    }

    public final String component1() {
        return this.banner;
    }

    public final String component2() {
        return this.interstitial;
    }

    public final String component3() {
        return this.f1native;
    }

    public final String component4() {
        return this.rewarded;
    }

    public final String component5() {
        return this.exit_banner;
    }

    public final String component6() {
        return this.exit_native;
    }

    public final AdManagerConfiguration copy(String str, String str2, String str3, String str4, String str5, String str6) {
        j.e(str2, "interstitial");
        return new AdManagerConfiguration(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdManagerConfiguration) {
            AdManagerConfiguration adManagerConfiguration = (AdManagerConfiguration) obj;
            return j.a(this.banner, adManagerConfiguration.banner) && j.a(this.interstitial, adManagerConfiguration.interstitial) && j.a(this.f1native, adManagerConfiguration.f1native) && j.a(this.rewarded, adManagerConfiguration.rewarded) && j.a(this.exit_banner, adManagerConfiguration.exit_banner) && j.a(this.exit_native, adManagerConfiguration.exit_native);
        }
        return false;
    }

    public final String getBanner() {
        return this.banner;
    }

    public final String getExit_banner() {
        return this.exit_banner;
    }

    public final String getExit_native() {
        return this.exit_native;
    }

    public final String getInterstitial() {
        return this.interstitial;
    }

    public final String getNative() {
        return this.f1native;
    }

    public final String getRewarded() {
        return this.rewarded;
    }

    public int hashCode() {
        String str = this.banner;
        int x = a.x(this.interstitial, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.f1native;
        int hashCode = (x + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.rewarded;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.exit_banner;
        int hashCode3 = (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.exit_native;
        return hashCode3 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder y = a.y("AdManagerConfiguration(banner=");
        y.append((Object) this.banner);
        y.append(", interstitial=");
        y.append(this.interstitial);
        y.append(", native=");
        y.append((Object) this.f1native);
        y.append(", rewarded=");
        y.append((Object) this.rewarded);
        y.append(", exit_banner=");
        y.append((Object) this.exit_banner);
        y.append(", exit_native=");
        y.append((Object) this.exit_native);
        y.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return y.toString();
    }
}

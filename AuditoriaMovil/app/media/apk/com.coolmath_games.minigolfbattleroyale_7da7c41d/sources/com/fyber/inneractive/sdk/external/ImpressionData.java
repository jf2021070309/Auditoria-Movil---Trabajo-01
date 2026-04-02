package com.fyber.inneractive.sdk.external;
/* loaded from: classes.dex */
public class ImpressionData {
    private Pricing a = new Pricing();
    private Video b;
    private String c;
    private Long d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;

    public Pricing getPricing() {
        return this.a;
    }

    public void setPricing(Pricing pricing) {
        this.a = pricing;
    }

    public Video getVideo() {
        return this.b;
    }

    public void setVideo(Video video) {
        this.b = video;
    }

    public String getDemandSource() {
        return this.c;
    }

    public void setDemandSource(String str) {
        this.c = str;
    }

    public Long getDemandId() {
        return this.d;
    }

    public void setDemandId(Long l) {
        this.d = l;
    }

    public String getCountry() {
        return this.e;
    }

    public void setCountry(String str) {
        this.e = str;
    }

    public String getImpressionId() {
        return this.f;
    }

    public void setImpressionId(String str) {
        this.f = str;
    }

    public String getCreativeId() {
        return this.g;
    }

    public void setCreativeId(String str) {
        this.g = str;
    }

    public String getCampaignId() {
        return this.h;
    }

    public void setCampaignId(String str) {
        this.h = str;
    }

    public String getAdvertiserDomain() {
        return this.i;
    }

    public void setAdvertiserDomain(String str) {
        this.i = str;
    }

    public void setDuration(long j) {
        this.b.b = j;
    }

    public void setCurrency(String str) {
        this.a.b = str;
    }

    public void setCpmValue(String str) {
        double d;
        try {
            d = Double.parseDouble(str);
        } catch (Exception unused) {
            d = 0.0d;
        }
        this.a.a = d;
    }

    /* loaded from: classes.dex */
    public static class Video {
        private boolean a;
        private long b;

        public Video(boolean z, long j) {
            this.a = z;
            this.b = j;
        }

        public boolean isSkippable() {
            return this.a;
        }

        public long getDuration() {
            return this.b;
        }

        public String toString() {
            return "Video{skippable=" + this.a + ", duration=" + this.b + '}';
        }
    }

    /* loaded from: classes.dex */
    public static class Pricing {
        private double a;
        private String b;

        public void setValue(double d) {
            this.a = d;
        }

        public double getValue() {
            return this.a;
        }

        public String getCurrency() {
            return this.b;
        }

        public String toString() {
            return "Pricing{value=" + this.a + ", currency='" + this.b + "'}";
        }
    }

    public String toString() {
        return "ImpressionData{pricing=" + this.a + ", video=" + this.b + ", demandSource='" + this.c + "', country='" + this.e + "', impressionId='" + this.f + "', creativeId='" + this.g + "', campaignId='" + this.h + "', advertiserDomain='" + this.i + "'}";
    }
}

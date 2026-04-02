package com.amazon.aps.iva.types;

import lombok.NonNull;
@NonNull
/* loaded from: classes.dex */
public class SimidCreative {
    private String pubProvidedAdId;
    private String simidCreativeData;

    /* loaded from: classes.dex */
    public static class SimidCreativeBuilder {
        private String pubProvidedAdId;
        private String simidCreativeData;

        public SimidCreative build() {
            return new SimidCreative(this.pubProvidedAdId, this.simidCreativeData);
        }

        public SimidCreativeBuilder pubProvidedAdId(String str) {
            this.pubProvidedAdId = str;
            return this;
        }

        public SimidCreativeBuilder simidCreativeData(String str) {
            this.simidCreativeData = str;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("SimidCreative.SimidCreativeBuilder(pubProvidedAdId=");
            sb.append(this.pubProvidedAdId);
            sb.append(", simidCreativeData=");
            return b.c(sb, this.simidCreativeData, ")");
        }
    }

    public SimidCreative(String str, String str2) {
        this.pubProvidedAdId = str;
        this.simidCreativeData = str2;
    }

    public static SimidCreativeBuilder builder() {
        return new SimidCreativeBuilder();
    }

    public String getPubProvidedAdId() {
        return this.pubProvidedAdId;
    }

    public String getSimidCreativeData() {
        return this.simidCreativeData;
    }

    public String toString() {
        return "SimidCreative(pubProvidedAdId=" + getPubProvidedAdId() + ", simidCreativeData=" + getSimidCreativeData() + ")";
    }
}

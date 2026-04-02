package com.amazon.aiondec.api.model.payload;

import lombok.Generated;
import lombok.NonNull;
/* loaded from: classes.dex */
public class StartAdsPayload extends Payload {
    @NonNull
    private String adsContextAsString;

    @Generated
    /* loaded from: classes.dex */
    public static class StartAdsPayloadBuilder {
        @Generated
        private String adsContextAsString;

        @Generated
        public StartAdsPayloadBuilder adsContextAsString(@NonNull String str) {
            if (str != null) {
                this.adsContextAsString = str;
                return this;
            }
            throw new NullPointerException("adsContextAsString is marked non-null but is null");
        }

        @Generated
        public StartAdsPayload build() {
            return new StartAdsPayload(this.adsContextAsString);
        }

        @Generated
        public String toString() {
            return b.c(new StringBuilder("StartAdsPayload.StartAdsPayloadBuilder(adsContextAsString="), this.adsContextAsString, ")");
        }
    }

    @Generated
    public StartAdsPayload(@NonNull String str) {
        if (str != null) {
            this.adsContextAsString = str;
            return;
        }
        throw new NullPointerException("adsContextAsString is marked non-null but is null");
    }

    @Generated
    public static StartAdsPayloadBuilder builder() {
        return new StartAdsPayloadBuilder();
    }

    @NonNull
    @Generated
    public String getAdsContextAsString() {
        return this.adsContextAsString;
    }

    @Generated
    public void setAdsContextAsString(@NonNull String str) {
        if (str != null) {
            this.adsContextAsString = str;
            return;
        }
        throw new NullPointerException("adsContextAsString is marked non-null but is null");
    }
}

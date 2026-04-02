package com.amazon.aiondec.api.model.payload;

import lombok.Generated;
import lombok.NonNull;
/* loaded from: classes.dex */
public class InvokeAlexaActionPayload extends Payload {
    @NonNull
    private String adsContextAsString;
    @NonNull
    private String alexaAction;
    @NonNull
    private String marketplaceId;

    @Generated
    /* loaded from: classes.dex */
    public static class InvokeAlexaActionPayloadBuilder {
        @Generated
        private String adsContextAsString;
        @Generated
        private String alexaAction;
        @Generated
        private String marketplaceId;

        @Generated
        public InvokeAlexaActionPayloadBuilder adsContextAsString(@NonNull String str) {
            if (str != null) {
                this.adsContextAsString = str;
                return this;
            }
            throw new NullPointerException("adsContextAsString is marked non-null but is null");
        }

        @Generated
        public InvokeAlexaActionPayloadBuilder alexaAction(@NonNull String str) {
            if (str != null) {
                this.alexaAction = str;
                return this;
            }
            throw new NullPointerException("alexaAction is marked non-null but is null");
        }

        @Generated
        public InvokeAlexaActionPayload build() {
            return new InvokeAlexaActionPayload(this.alexaAction, this.adsContextAsString, this.marketplaceId);
        }

        @Generated
        public InvokeAlexaActionPayloadBuilder marketplaceId(@NonNull String str) {
            if (str != null) {
                this.marketplaceId = str;
                return this;
            }
            throw new NullPointerException("marketplaceId is marked non-null but is null");
        }

        @Generated
        public String toString() {
            StringBuilder sb = new StringBuilder("InvokeAlexaActionPayload.InvokeAlexaActionPayloadBuilder(alexaAction=");
            sb.append(this.alexaAction);
            sb.append(", adsContextAsString=");
            sb.append(this.adsContextAsString);
            sb.append(", marketplaceId=");
            return b.c(sb, this.marketplaceId, ")");
        }
    }

    @Generated
    public InvokeAlexaActionPayload(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        if (str != null) {
            if (str2 != null) {
                if (str3 != null) {
                    this.alexaAction = str;
                    this.adsContextAsString = str2;
                    this.marketplaceId = str3;
                    return;
                }
                throw new NullPointerException("marketplaceId is marked non-null but is null");
            }
            throw new NullPointerException("adsContextAsString is marked non-null but is null");
        }
        throw new NullPointerException("alexaAction is marked non-null but is null");
    }

    @Generated
    public static InvokeAlexaActionPayloadBuilder builder() {
        return new InvokeAlexaActionPayloadBuilder();
    }

    @NonNull
    @Generated
    public String getAdsContextAsString() {
        return this.adsContextAsString;
    }

    @NonNull
    @Generated
    public String getAlexaAction() {
        return this.alexaAction;
    }

    @NonNull
    @Generated
    public String getMarketplaceId() {
        return this.marketplaceId;
    }

    @Generated
    public void setAdsContextAsString(@NonNull String str) {
        if (str != null) {
            this.adsContextAsString = str;
            return;
        }
        throw new NullPointerException("adsContextAsString is marked non-null but is null");
    }

    @Generated
    public void setAlexaAction(@NonNull String str) {
        if (str != null) {
            this.alexaAction = str;
            return;
        }
        throw new NullPointerException("alexaAction is marked non-null but is null");
    }

    @Generated
    public void setMarketplaceId(@NonNull String str) {
        if (str != null) {
            this.marketplaceId = str;
            return;
        }
        throw new NullPointerException("marketplaceId is marked non-null but is null");
    }
}

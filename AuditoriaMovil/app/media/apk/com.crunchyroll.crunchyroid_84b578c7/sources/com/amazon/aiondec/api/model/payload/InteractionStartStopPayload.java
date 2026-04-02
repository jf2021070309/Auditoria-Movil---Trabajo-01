package com.amazon.aiondec.api.model.payload;

import lombok.Generated;
/* loaded from: classes.dex */
public class InteractionStartStopPayload extends Payload {
    public final String adClientSessionId;
    public final String adExperienceType;

    @Generated
    /* loaded from: classes.dex */
    public static class InteractionStartStopPayloadBuilder {
        @Generated
        private String adClientSessionId;
        @Generated
        private String adExperienceType;

        @Generated
        public InteractionStartStopPayloadBuilder adClientSessionId(String str) {
            this.adClientSessionId = str;
            return this;
        }

        @Generated
        public InteractionStartStopPayloadBuilder adExperienceType(String str) {
            this.adExperienceType = str;
            return this;
        }

        @Generated
        public InteractionStartStopPayload build() {
            return new InteractionStartStopPayload(this.adClientSessionId, this.adExperienceType);
        }

        @Generated
        public String toString() {
            StringBuilder sb = new StringBuilder("InteractionStartStopPayload.InteractionStartStopPayloadBuilder(adClientSessionId=");
            sb.append(this.adClientSessionId);
            sb.append(", adExperienceType=");
            return b.c(sb, this.adExperienceType, ")");
        }
    }

    @Generated
    public InteractionStartStopPayload(String str, String str2) {
        this.adClientSessionId = str;
        this.adExperienceType = str2;
    }

    @Generated
    public static InteractionStartStopPayloadBuilder builder() {
        return new InteractionStartStopPayloadBuilder();
    }
}

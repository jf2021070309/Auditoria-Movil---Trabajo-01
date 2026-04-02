package com.amazon.aiondec.api.model.payload;

import lombok.Generated;
import lombok.NonNull;
/* loaded from: classes.dex */
public class RetrieveDeviceCapabilityPayload extends Payload {
    @NonNull
    private String interfaceVersion;

    @Generated
    /* loaded from: classes.dex */
    public static class RetrieveDeviceCapabilityPayloadBuilder {
        @Generated
        private String interfaceVersion;

        @Generated
        public RetrieveDeviceCapabilityPayload build() {
            return new RetrieveDeviceCapabilityPayload(this.interfaceVersion);
        }

        @Generated
        public RetrieveDeviceCapabilityPayloadBuilder interfaceVersion(@NonNull String str) {
            if (str != null) {
                this.interfaceVersion = str;
                return this;
            }
            throw new NullPointerException("interfaceVersion is marked non-null but is null");
        }

        @Generated
        public String toString() {
            return b.c(new StringBuilder("RetrieveDeviceCapabilityPayload.RetrieveDeviceCapabilityPayloadBuilder(interfaceVersion="), this.interfaceVersion, ")");
        }
    }

    @Generated
    public RetrieveDeviceCapabilityPayload(@NonNull String str) {
        if (str != null) {
            this.interfaceVersion = str;
            return;
        }
        throw new NullPointerException("interfaceVersion is marked non-null but is null");
    }

    @Generated
    public static RetrieveDeviceCapabilityPayloadBuilder builder() {
        return new RetrieveDeviceCapabilityPayloadBuilder();
    }

    @NonNull
    @Generated
    public String getInterfaceVersion() {
        return this.interfaceVersion;
    }

    @Generated
    public void setInterfaceVersion(@NonNull String str) {
        if (str != null) {
            this.interfaceVersion = str;
            return;
        }
        throw new NullPointerException("interfaceVersion is marked non-null but is null");
    }
}

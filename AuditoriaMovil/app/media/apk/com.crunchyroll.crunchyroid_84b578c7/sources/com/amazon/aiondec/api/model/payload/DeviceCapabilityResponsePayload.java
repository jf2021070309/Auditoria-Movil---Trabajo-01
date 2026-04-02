package com.amazon.aiondec.api.model.payload;

import com.amazon.aps.iva.oa.a;
import java.util.List;
import lombok.Generated;
import lombok.NonNull;
/* loaded from: classes.dex */
public class DeviceCapabilityResponsePayload extends Payload {
    @NonNull
    private List<Capability> capabilities;

    /* loaded from: classes.dex */
    public enum Capability {
        INTERACTIVE_ADS_ENABLED("INTERACTIVE_ADS_ENABLED");
        
        private final String type;

        Capability(String str) {
            this.type = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.type;
        }
    }

    @Generated
    /* loaded from: classes.dex */
    public static class DeviceCapabilityResponsePayloadBuilder {
        @Generated
        private List<Capability> capabilities;

        @Generated
        public DeviceCapabilityResponsePayload build() {
            return new DeviceCapabilityResponsePayload(this.capabilities);
        }

        @Generated
        public DeviceCapabilityResponsePayloadBuilder capabilities(@NonNull List<Capability> list) {
            if (list != null) {
                this.capabilities = list;
                return this;
            }
            throw new NullPointerException("capabilities is marked non-null but is null");
        }

        @Generated
        public String toString() {
            return a.b(new StringBuilder("DeviceCapabilityResponsePayload.DeviceCapabilityResponsePayloadBuilder(capabilities="), this.capabilities, ")");
        }
    }

    @Generated
    public DeviceCapabilityResponsePayload(@NonNull List<Capability> list) {
        if (list != null) {
            this.capabilities = list;
            return;
        }
        throw new NullPointerException("capabilities is marked non-null but is null");
    }

    @Generated
    public static DeviceCapabilityResponsePayloadBuilder builder() {
        return new DeviceCapabilityResponsePayloadBuilder();
    }

    @NonNull
    @Generated
    public List<Capability> getCapabilities() {
        return this.capabilities;
    }

    @Generated
    public void setCapabilities(@NonNull List<Capability> list) {
        if (list != null) {
            this.capabilities = list;
            return;
        }
        throw new NullPointerException("capabilities is marked non-null but is null");
    }
}

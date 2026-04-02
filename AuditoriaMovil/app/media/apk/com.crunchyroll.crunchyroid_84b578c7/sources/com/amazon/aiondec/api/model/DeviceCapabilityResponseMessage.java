package com.amazon.aiondec.api.model;

import com.amazon.aiondec.api.model.Message;
import com.amazon.aiondec.api.model.payload.DeviceCapabilityResponsePayload;
/* loaded from: classes.dex */
public class DeviceCapabilityResponseMessage extends Message<DeviceCapabilityResponsePayload> {
    public DeviceCapabilityResponseMessage(DeviceCapabilityResponsePayload deviceCapabilityResponsePayload) {
        super(Message.MessageType.RETRIEVE_DEVICE_CAPABILITIES_RESPONSE, deviceCapabilityResponsePayload);
    }
}

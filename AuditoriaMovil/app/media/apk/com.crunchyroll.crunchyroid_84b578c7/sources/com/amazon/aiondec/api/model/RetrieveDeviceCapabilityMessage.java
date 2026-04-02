package com.amazon.aiondec.api.model;

import com.amazon.aiondec.api.model.Message;
import com.amazon.aiondec.api.model.payload.RetrieveDeviceCapabilityPayload;
/* loaded from: classes.dex */
public class RetrieveDeviceCapabilityMessage extends Message<RetrieveDeviceCapabilityPayload> {
    public RetrieveDeviceCapabilityMessage(RetrieveDeviceCapabilityPayload retrieveDeviceCapabilityPayload) {
        super(Message.MessageType.RETRIEVE_DEVICE_CAPABILITIES, retrieveDeviceCapabilityPayload);
    }
}

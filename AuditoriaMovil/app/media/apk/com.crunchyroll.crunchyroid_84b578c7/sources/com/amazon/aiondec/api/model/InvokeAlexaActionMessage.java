package com.amazon.aiondec.api.model;

import com.amazon.aiondec.api.model.Message;
import com.amazon.aiondec.api.model.payload.InvokeAlexaActionPayload;
/* loaded from: classes.dex */
public class InvokeAlexaActionMessage extends Message<InvokeAlexaActionPayload> {
    public InvokeAlexaActionMessage(InvokeAlexaActionPayload invokeAlexaActionPayload) {
        super(Message.MessageType.INVOKE_ALEXA_ACTION, invokeAlexaActionPayload);
    }
}

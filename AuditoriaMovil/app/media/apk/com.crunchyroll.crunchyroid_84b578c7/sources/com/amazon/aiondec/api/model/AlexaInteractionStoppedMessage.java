package com.amazon.aiondec.api.model;

import com.amazon.aiondec.api.model.Message;
import com.amazon.aiondec.api.model.payload.InteractionStartStopPayload;
/* loaded from: classes.dex */
public class AlexaInteractionStoppedMessage extends Message<InteractionStartStopPayload> {
    public AlexaInteractionStoppedMessage(InteractionStartStopPayload interactionStartStopPayload) {
        super(Message.MessageType.ALEXA_INTERACTION_STOPPED, interactionStartStopPayload);
    }
}

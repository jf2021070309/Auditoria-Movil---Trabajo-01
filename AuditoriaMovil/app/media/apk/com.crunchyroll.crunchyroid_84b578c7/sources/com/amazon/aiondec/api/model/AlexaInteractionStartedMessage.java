package com.amazon.aiondec.api.model;

import com.amazon.aiondec.api.model.Message;
import com.amazon.aiondec.api.model.payload.InteractionStartStopPayload;
/* loaded from: classes.dex */
public class AlexaInteractionStartedMessage extends Message<InteractionStartStopPayload> {
    public AlexaInteractionStartedMessage(InteractionStartStopPayload interactionStartStopPayload) {
        super(Message.MessageType.ALEXA_INTERACTION_STARTED, interactionStartStopPayload);
    }
}

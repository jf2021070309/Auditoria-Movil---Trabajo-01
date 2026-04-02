package com.amazon.aiondec.api.model;

import java.io.Serializable;
import lombok.Generated;
import lombok.NonNull;
/* loaded from: classes.dex */
public abstract class Message<T> implements Serializable {
    @NonNull
    private T payload;
    @NonNull
    private MessageType type;

    /* loaded from: classes.dex */
    public enum MessageType {
        RETRIEVE_DEVICE_CAPABILITIES,
        START_ADS,
        INVOKE_ALEXA_ACTION,
        END_ADS,
        RETRIEVE_DEVICE_CAPABILITIES_RESPONSE,
        START_ADS_RESPONSE,
        ALEXA_INTERACTION_STARTED,
        ALEXA_INTERACTION_STOPPED
    }

    @Generated
    public Message(@NonNull MessageType messageType, @NonNull T t) {
        if (messageType != null) {
            if (t != null) {
                this.type = messageType;
                this.payload = t;
                return;
            }
            throw new NullPointerException("payload is marked non-null but is null");
        }
        throw new NullPointerException("type is marked non-null but is null");
    }

    @NonNull
    @Generated
    public T getPayload() {
        return this.payload;
    }

    @NonNull
    @Generated
    public MessageType getType() {
        return this.type;
    }

    @Generated
    public void setPayload(@NonNull T t) {
        if (t != null) {
            this.payload = t;
            return;
        }
        throw new NullPointerException("payload is marked non-null but is null");
    }

    @Generated
    public void setType(@NonNull MessageType messageType) {
        if (messageType != null) {
            this.type = messageType;
            return;
        }
        throw new NullPointerException("type is marked non-null but is null");
    }
}

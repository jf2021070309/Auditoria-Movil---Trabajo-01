package com.amazon.aiondec.api.model;

import com.amazon.aiondec.api.model.Message;
import com.amazon.aiondec.api.model.payload.EmptyPayload;
import lombok.Generated;
/* loaded from: classes.dex */
public class EndAdsMessage extends Message<EmptyPayload> {
    private String adClientSessionId;

    public EndAdsMessage(String str, EmptyPayload emptyPayload) {
        super(Message.MessageType.END_ADS, emptyPayload);
        this.adClientSessionId = str;
    }

    @Generated
    public String getAdClientSessionId() {
        return this.adClientSessionId;
    }

    @Generated
    public void setAdClientSessionId(String str) {
        this.adClientSessionId = str;
    }
}

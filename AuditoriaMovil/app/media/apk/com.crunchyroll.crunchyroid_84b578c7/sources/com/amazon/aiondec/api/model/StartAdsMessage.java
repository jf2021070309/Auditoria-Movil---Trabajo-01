package com.amazon.aiondec.api.model;

import com.amazon.aiondec.api.model.Message;
import com.amazon.aiondec.api.model.payload.StartAdsPayload;
import lombok.Generated;
/* loaded from: classes.dex */
public class StartAdsMessage extends Message<StartAdsPayload> {
    private String adClientSessionId;

    public StartAdsMessage(String str, StartAdsPayload startAdsPayload) {
        super(Message.MessageType.START_ADS, startAdsPayload);
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

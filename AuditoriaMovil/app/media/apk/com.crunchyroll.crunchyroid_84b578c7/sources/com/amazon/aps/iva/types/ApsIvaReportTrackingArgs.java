package com.amazon.aps.iva.types;

import java.net.URL;
import java.util.List;
/* loaded from: classes.dex */
public class ApsIvaReportTrackingArgs {
    private String messageId;
    private List<URL> trackingUrls;

    public String getMessageId() {
        return this.messageId;
    }

    public List<URL> getTrackingUrls() {
        return this.trackingUrls;
    }

    public void setMessageId(String str) {
        this.messageId = str;
    }

    public void setTrackingUrls(List<URL> list) {
        this.trackingUrls = list;
    }
}

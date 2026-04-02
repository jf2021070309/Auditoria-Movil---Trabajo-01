package com.kwad.sdk.core.network;
/* loaded from: classes.dex */
public class j extends com.kwad.sdk.core.response.a.a {
    public String apn;
    public int apo = 0;
    public String app;
    public String errorMsg;
    public String host;
    public int httpCode;
    public String url;

    @Override // com.kwad.sdk.core.response.a.a
    public String toString() {
        return toJson().toString();
    }
}

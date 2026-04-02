package com.kwad.sdk.core.network;

import java.util.Map;
/* loaded from: classes.dex */
public class NormalResultData extends BaseResultData {
    public int code;
    public String data;
    public Map<String, String> header;

    public void parseResponse(c cVar) {
        this.code = cVar.code;
        this.data = cVar.aoR;
        this.header = null;
    }
}

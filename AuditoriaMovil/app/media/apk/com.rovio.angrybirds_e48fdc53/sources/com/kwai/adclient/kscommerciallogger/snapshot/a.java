package com.kwai.adclient.kscommerciallogger.snapshot;

import org.json.JSONObject;
/* loaded from: classes3.dex */
public final class a extends c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public a(String str) {
        super(str, 0);
    }

    @Override // com.kwai.adclient.kscommerciallogger.snapshot.c
    public final synchronized d gc(String str) {
        return new b("empty");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.kwai.adclient.kscommerciallogger.snapshot.c
    public final JSONObject gd(String str) {
        return new JSONObject();
    }
}

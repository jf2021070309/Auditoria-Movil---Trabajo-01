package com.amazon.aps.iva.bw;

import okhttp3.Call;
import okhttp3.Request;
/* compiled from: DashDrmLicenseDownloader.kt */
/* loaded from: classes2.dex */
public final class c implements Call.Factory {
    public final /* synthetic */ d b;

    public c(d dVar) {
        this.b = dVar;
    }

    @Override // okhttp3.Call.Factory
    public final Call newCall(Request request) {
        com.amazon.aps.iva.yb0.j.f(request, "request");
        return this.b.a.newCall(request);
    }
}

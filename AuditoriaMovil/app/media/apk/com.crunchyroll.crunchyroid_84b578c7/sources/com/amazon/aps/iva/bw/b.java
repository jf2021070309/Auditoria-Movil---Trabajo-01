package com.amazon.aps.iva.bw;

import com.google.common.net.HttpHeaders;
import okhttp3.Call;
import okhttp3.Request;
/* compiled from: DashDrmLicenseDownloader.kt */
/* loaded from: classes2.dex */
public final class b implements Call.Factory {
    public final /* synthetic */ d b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public b(d dVar, String str, String str2) {
        this.b = dVar;
        this.c = str;
        this.d = str2;
    }

    @Override // okhttp3.Call.Factory
    public final Call newCall(Request request) {
        com.amazon.aps.iva.yb0.j.f(request, "request");
        return this.b.a.newCall(request.newBuilder().header("x-cr-video-token", this.c).header("x-cr-content-id", this.d).header(HttpHeaders.ACCEPT, "application/octet-stream").header(HttpHeaders.CONTENT_TYPE, "application/octet-stream").build());
    }
}

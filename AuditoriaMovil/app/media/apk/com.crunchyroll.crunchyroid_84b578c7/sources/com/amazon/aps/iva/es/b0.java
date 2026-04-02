package com.amazon.aps.iva.es;
/* compiled from: DownloadEvents.kt */
/* loaded from: classes2.dex */
public final class b0 extends a0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.amazon.aps.iva.ks.w wVar, com.amazon.aps.iva.ks.f fVar, com.amazon.aps.iva.ks.q qVar, com.amazon.aps.iva.ks.m mVar, String str) {
        super("Download Failed", new com.amazon.aps.iva.is.a[]{wVar, fVar, qVar, mVar, new p0("errorMessage", str)});
        com.amazon.aps.iva.yb0.j.f(wVar, "videoMedia");
        com.amazon.aps.iva.yb0.j.f(qVar, "resolution");
        com.amazon.aps.iva.yb0.j.f(mVar, "networkType");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.amazon.aps.iva.ks.w wVar, com.amazon.aps.iva.ks.m mVar) {
        super("Media Renewed", new com.amazon.aps.iva.is.a[]{wVar, mVar});
        com.amazon.aps.iva.yb0.j.f(mVar, "networkType");
    }
}

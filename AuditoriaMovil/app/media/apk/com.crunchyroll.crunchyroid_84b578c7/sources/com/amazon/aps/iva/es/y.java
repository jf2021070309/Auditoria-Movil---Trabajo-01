package com.amazon.aps.iva.es;
/* compiled from: DataMigrationConfirmationSelectedEvent.kt */
/* loaded from: classes2.dex */
public final class y extends i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.amazon.aps.iva.ks.a aVar, com.amazon.aps.iva.ks.g gVar, int i) {
        super("Mobile Subscription Preserved", aVar, gVar);
        if (i != 4) {
        } else {
            super("Subscription Cancel Selected", aVar, gVar);
        }
    }

    public y(com.amazon.aps.iva.ks.a aVar, com.amazon.aps.iva.ks.i iVar, com.amazon.aps.iva.ks.d dVar) {
        super("Feed Filtered", aVar, iVar, dVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.amazon.aps.iva.ks.a aVar, com.amazon.aps.iva.js.q0 q0Var, com.amazon.aps.iva.js.i iVar) {
        super("Data Migration Confirmation Selected", new p0("ctaSelected", q0Var), aVar, new p0("eventSource", iVar));
        com.amazon.aps.iva.yb0.j.f(q0Var, "watchDataMigrationCtaSelectedProperty");
    }

    public y(com.amazon.aps.iva.ks.a aVar, com.amazon.aps.iva.ks.g gVar) {
        super("3rd Party Store Selected", aVar, gVar, new p0("eventSource", null));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.amazon.aps.iva.ks.w wVar, String str, String str2, String str3, com.amazon.aps.iva.js.z zVar, String str4) {
        super("Video Problem Reported", wVar, new p0("issueId", str), new p0("issueTitle", str2), new p0("issueText", str3), new p0("playerSdk", "native"), new p0("castingDevice", str4), zVar);
        com.amazon.aps.iva.yb0.j.f(wVar, "videoMediaProperty");
        com.amazon.aps.iva.yb0.j.f(str, "issueId");
        com.amazon.aps.iva.yb0.j.f(str2, "issueTitle");
        com.amazon.aps.iva.yb0.j.f(str3, "issueText");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(String str) {
        super("Search Submitted", new p0("searchTerms", str));
        com.amazon.aps.iva.yb0.j.f(str, "searchTerms");
    }
}

package com.amazon.aps.iva.es;
/* compiled from: DataMigrationOptionSelectedEvent.kt */
/* loaded from: classes2.dex */
public final class z extends i {
    public z(com.amazon.aps.iva.ks.a aVar, com.amazon.aps.iva.ks.g gVar) {
        super("Subscription Checkout Cancelled", aVar, gVar);
    }

    public /* synthetic */ z(com.amazon.aps.iva.ks.a aVar, com.amazon.aps.iva.ks.u uVar, com.amazon.aps.iva.ks.g gVar, com.amazon.aps.iva.js.i iVar, int i) {
        this(aVar, uVar, (i & 4) != 0 ? null : gVar, (com.amazon.aps.iva.ks.e) null, (i & 16) != 0 ? null : iVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.amazon.aps.iva.js.s sVar, com.amazon.aps.iva.ks.a aVar, com.amazon.aps.iva.ks.w wVar, boolean z) {
        super("Player Orientation Changed", new p0("orientation", sVar), aVar, wVar, new p0("playerSdk", "native"), new p0("isFullScreen", Boolean.valueOf(z)));
        com.amazon.aps.iva.yb0.j.f(sVar, "orientationProperty");
        com.amazon.aps.iva.yb0.j.f(wVar, "videoMediaProperty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.amazon.aps.iva.ks.a aVar, com.amazon.aps.iva.js.r0 r0Var, com.amazon.aps.iva.js.i iVar) {
        super("Data Migration Option Selected", new p0("watchDataOption", r0Var), aVar, new p0("eventSource", iVar));
        com.amazon.aps.iva.yb0.j.f(r0Var, "watchDataMigrationOptionProperty");
    }

    public z(com.amazon.aps.iva.ks.a aVar, com.amazon.aps.iva.ks.i iVar, com.amazon.aps.iva.js.i0 i0Var, com.amazon.aps.iva.js.h0 h0Var) {
        super("Feed Sorted", aVar, iVar, new p0("sortType", i0Var), new p0("sortOrder", h0Var));
    }

    public z(com.amazon.aps.iva.ks.a aVar, com.amazon.aps.iva.ks.u uVar, com.amazon.aps.iva.ks.g gVar, com.amazon.aps.iva.ks.e eVar, com.amazon.aps.iva.js.i iVar) {
        super("Mobile Upsell Flow Entered", aVar, uVar, gVar, eVar, new p0("eventSource", iVar));
    }

    public z(com.amazon.aps.iva.ks.u uVar, com.amazon.aps.iva.ks.a aVar, com.amazon.aps.iva.ks.w wVar, com.amazon.aps.iva.js.i iVar) {
        super("Upsell Selected", new p0("eventSource", iVar), wVar, aVar, uVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.amazon.aps.iva.ks.w wVar, float f, float f2, com.amazon.aps.iva.js.z zVar) {
        super("Video Progress Bar Scrubbed", wVar, new p0("playheadStartTime", Float.valueOf(f)), new p0("playheadEndTime", Float.valueOf(f2)), new p0("playerSdk", "native"), zVar);
        com.amazon.aps.iva.yb0.j.f(wVar, "videoMediaProperty");
        com.amazon.aps.iva.yb0.j.f(zVar, "playbackSourceProperty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.amazon.aps.iva.ks.w wVar, float f, String str) {
        super("Segment Skipped", wVar, new p0("playheadTime", Float.valueOf(f)), new p0("segmentName", str), new p0("playerSdk", "native"));
        com.amazon.aps.iva.yb0.j.f(wVar, "videoMediaProperty");
    }
}

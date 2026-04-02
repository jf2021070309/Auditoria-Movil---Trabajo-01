package com.amazon.aps.iva.es;
/* compiled from: CastingDeviceConnectedEvent.kt */
/* loaded from: classes2.dex */
public final class q extends i {
    public q(com.amazon.aps.iva.ks.a aVar) {
        super("Send Again Navigated", aVar);
    }

    public q(com.amazon.aps.iva.ks.a aVar, Object obj) {
        super("Onboarding Skipped", aVar, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.amazon.aps.iva.js.a0 a0Var, String str, String str2, com.amazon.aps.iva.ks.w wVar) {
        super("Player Settings Modified", new p0("type", a0Var), new p0("oldValue", str), new p0("newValue", str2), new p0("playerSdk", "native"), wVar);
        com.amazon.aps.iva.yb0.j.f(a0Var, "playerSettingsTypeProperty");
        com.amazon.aps.iva.yb0.j.f(str2, "newValue");
        com.amazon.aps.iva.yb0.j.f(wVar, "videoMediaProperty");
    }

    public q(com.amazon.aps.iva.ks.a aVar, int i) {
        super("Flow Cancelled", aVar, new p0("flowName", "Mobile Cancellation"), new p0("flowContext", "User tapped the Close icon"), null);
    }

    public q(com.amazon.aps.iva.ks.a aVar, com.amazon.aps.iva.js.i iVar) {
        super("Upsell Skip Selected", aVar, new p0("eventSource", iVar));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.amazon.aps.iva.ks.a aVar, com.amazon.aps.iva.js.s0 s0Var, com.amazon.aps.iva.js.i iVar) {
        super("Data Migration State Displayed", new p0("dataTransferStatus", s0Var), aVar, new p0("eventSource", iVar));
        com.amazon.aps.iva.yb0.j.f(s0Var, "watchDataMigrationStateProperty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.amazon.aps.iva.ks.w wVar, Long l, Long l2, Long l3, Long l4, Long l5, Integer num, Long l6, String str, String str2, Float f, String str3, String str4, com.amazon.aps.iva.js.p0 p0Var) {
        super("Video Session Complete", wVar, new p0("initialStartupTime", l), new p0("ppAdStreamLoadTime", l2), new p0("ppManifestRequestTime", l3), new p0("ppTimeFromClickToVideoStart", l4), new p0("ppInitialBufferTime", l5), new p0("playbackStallCount", num), new p0("playbackStallDuration", l6), new p0("cdnAffinity", str), new p0("cdnInitialManifestUrl", str2), new p0("playbackReportedTotalBitrateAvg", f), new p0("sessionStartType", str3), new p0("streamType", str4), new p0("videoSessionType", p0Var), new p0("playerSdk", "native"));
        com.amazon.aps.iva.yb0.j.f(wVar, "videoMedia");
        com.amazon.aps.iva.yb0.j.f(str4, "streamType");
        com.amazon.aps.iva.yb0.j.f(p0Var, "videoSessionType");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(String str, String str2, String str3, String str4) {
        super("Casting Device Connected", new p0("castingDeviceID", str), new p0("castingDeviceModel", str2), new p0("castingDeviceVersion", str3), new p0("castingDeviceIP", str4));
        com.amazon.aps.iva.yb0.j.f(str, "castingDeviceId");
        com.amazon.aps.iva.yb0.j.f(str2, "castingDeviceModel");
        com.amazon.aps.iva.yb0.j.f(str3, "castingDeviceVersion");
    }
}

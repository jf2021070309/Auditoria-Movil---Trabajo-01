package com.amazon.aps.iva.es;
/* compiled from: BrowseSelectedEvent.kt */
/* loaded from: classes2.dex */
public final class k extends i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.amazon.aps.iva.ks.a aVar, int i) {
        super("Store Navigated", aVar);
        if (i != 8) {
        } else {
            super("Terms Selected", aVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.amazon.aps.iva.ks.w wVar, float f, float f2, float f3, com.amazon.aps.iva.js.z zVar) {
        super("Video Heartbeat", wVar, new p0("secondsViewed", Float.valueOf(f)), new p0("elapsedDelta", Float.valueOf(f2)), new p0("playheadTime", Float.valueOf(f3)), new p0("playerSdk", "native"), zVar);
        com.amazon.aps.iva.yb0.j.f(wVar, "videoMediaProperty");
        com.amazon.aps.iva.yb0.j.f(zVar, "playbackSource");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.amazon.aps.iva.js.w wVar) {
        super("Push Notification Permission Selected", new p0("permissionStatus", wVar));
        com.amazon.aps.iva.yb0.j.f(wVar, "permissionStatusProperty");
    }

    public k(com.amazon.aps.iva.ks.a aVar) {
        super("Browse Selected", new p0("channelName", ""), aVar, new p0("contentType", ""), new p0("sorting", "alphabetical"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.amazon.aps.iva.ks.a aVar, com.amazon.aps.iva.js.h hVar) {
        super("Email Verification CTA Displayed", aVar, new p0("emailVerificationStep", hVar));
        com.amazon.aps.iva.yb0.j.f(hVar, "step");
    }

    public k(com.amazon.aps.iva.ks.a aVar, String str) {
        super("Password Reset Failed", aVar, new p0("errorMessage", str));
    }

    public k(com.amazon.aps.iva.ks.e eVar) {
        super("Content Shared", eVar, new p0("sharedTarget", ""), new p0("wasCompleted", ""));
    }

    public k(com.amazon.aps.iva.ks.a aVar, com.amazon.aps.iva.ks.g gVar) {
        super("Login Selected", aVar, gVar);
    }

    public k(com.amazon.aps.iva.ks.s sVar) {
        super("Mobile Cancellation Flow Completed", sVar, null);
    }
}

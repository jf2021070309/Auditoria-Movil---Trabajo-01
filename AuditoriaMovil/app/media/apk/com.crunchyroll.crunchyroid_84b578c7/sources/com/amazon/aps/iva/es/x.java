package com.amazon.aps.iva.es;
/* compiled from: ContinueWatchingWidgetTappedEvent.kt */
/* loaded from: classes2.dex */
public final class x extends i {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(com.amazon.aps.iva.ks.a aVar, int i) {
        this(aVar, null, 2);
        if (i != 6) {
        } else {
            this(aVar, null, 6);
        }
    }

    public x(com.amazon.aps.iva.ks.a aVar, com.amazon.aps.iva.ks.e eVar) {
        super("Continue Watching Widget Tapped", aVar, eVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.amazon.aps.iva.ks.a aVar, com.amazon.aps.iva.ks.g gVar, int i) {
        super("Manage Membership Selected", aVar, gVar);
        if (i != 6) {
        } else {
            super("Subscription Cancel Confirmed", aVar, gVar);
        }
    }

    public x(com.amazon.aps.iva.ks.a aVar, com.amazon.aps.iva.ks.s sVar) {
        super("Mobile Downgrade Flow Entered", aVar, sVar, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(int i, com.amazon.aps.iva.ks.e eVar, String str, boolean z) {
        super("Search Panel Selected", new p0("channelName", ""), new p0("searchResultNumber", Integer.valueOf(i)), eVar, new p0("searchTerms", str), new p0("isRecentSearch", Boolean.valueOf(z)));
        com.amazon.aps.iva.yb0.j.f(str, "searchTerms");
    }

    public x(com.amazon.aps.iva.js.y yVar, com.amazon.aps.iva.ks.w wVar, com.amazon.aps.iva.ks.o oVar, com.amazon.aps.iva.js.z zVar) {
        super("Video Play Started From Beginning", yVar, wVar, oVar, zVar, new p0("playerSdk", "native"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.amazon.aps.iva.ks.a aVar, String str) {
        super("Third-Party App Disconnection Requested", aVar, new p0("platformName", str));
        com.amazon.aps.iva.yb0.j.f(str, "platform");
    }

    public x(com.amazon.aps.iva.ks.a aVar) {
        super("Password Reset Successful", aVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.amazon.aps.iva.ks.w wVar, float f, float f2, com.amazon.aps.iva.js.z zVar) {
        super("Fast Forward Selected", wVar, new p0("playheadStartTime", Float.valueOf(f)), new p0("playheadEndTime", Float.valueOf(f2)), new p0("playerSdk", "native"), zVar);
        com.amazon.aps.iva.yb0.j.f(wVar, "videoMediaProperty");
        com.amazon.aps.iva.yb0.j.f(zVar, "playbackSourceProperty");
    }
}

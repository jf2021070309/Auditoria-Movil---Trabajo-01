package com.amazon.aps.iva.es;
/* compiled from: CharacterSelectedEvent.kt */
/* loaded from: classes2.dex */
public final class r extends i {
    public r() {
        super("In-App Review Requested", new com.amazon.aps.iva.is.a[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.amazon.aps.iva.ks.a aVar, int i) {
        super("OTP Submitted for Verification", aVar);
        if (i != 6) {
        } else {
            super("Verify Email Link Requested", aVar);
        }
    }

    public r(com.amazon.aps.iva.ks.h hVar, com.amazon.aps.iva.ks.e eVar) {
        super("Deep Link Opened", hVar, eVar);
    }

    public r(com.amazon.aps.iva.ks.a aVar) {
        super("Character Selected", new p0("channelName", ""), aVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.amazon.aps.iva.ks.a aVar, com.amazon.aps.iva.ks.w wVar) {
        super("Player Settings Selected", new p0("playerSdk", "native"), aVar, wVar);
        com.amazon.aps.iva.yb0.j.f(wVar, "videoMediaProperty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String str, String str2, String str3) {
        super("Settings Modified", new p0("settingName", str), new p0("oldValue", str2), new p0("newValue", str3));
        com.amazon.aps.iva.yb0.j.f(str2, "oldValue");
        com.amazon.aps.iva.yb0.j.f(str3, "newValue");
    }
}

package com.amazon.aps.iva.es;

import com.google.android.gms.cast.MediaTrack;
import java.util.Arrays;
/* compiled from: BillingNotificationCtaSelectedEvent.kt */
/* loaded from: classes2.dex */
public final class j extends i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.amazon.aps.iva.ks.a aVar, int i) {
        super("Privacy Selected", aVar);
        if (i != 7) {
        } else {
            super("WhatsApp Navigated", aVar);
        }
    }

    public j() {
        super("Password Changed", new com.amazon.aps.iva.is.a[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, com.amazon.aps.iva.is.a... aVarArr) {
        super(str, (com.amazon.aps.iva.is.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        com.amazon.aps.iva.yb0.j.f(str, "screen");
        com.amazon.aps.iva.yb0.j.f(aVarArr, "properties");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(com.amazon.aps.iva.ls.a aVar, com.amazon.aps.iva.is.a... aVarArr) {
        this(aVar.toString(), (com.amazon.aps.iva.is.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        com.amazon.aps.iva.yb0.j.f(aVar, "screen");
        com.amazon.aps.iva.yb0.j.f(aVarArr, "properties");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.amazon.aps.iva.ks.a aVar, com.amazon.aps.iva.js.b bVar, com.amazon.aps.iva.ks.g gVar) {
        super("Billing Notification CTA Selected", new p0("billingNotificationAction", bVar), gVar, aVar);
        com.amazon.aps.iva.yb0.j.f(bVar, "billingNotificationActionProperty");
    }

    public j(com.amazon.aps.iva.ks.a aVar, com.amazon.aps.iva.js.i iVar) {
        super("Terms and Privacy Policy Confirmed", aVar, new p0("eventSource", iVar));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.amazon.aps.iva.ks.i iVar, String str, com.amazon.aps.iva.ls.a aVar, int i, int i2, int i3, String str2, String str3) {
        super("Container Viewed", iVar, new p0("channelID", str), new com.amazon.aps.iva.js.f0(aVar.toString()), new p0("rowNum", Integer.valueOf(i)), new p0("columnsPerRow", Integer.valueOf(i2)), new p0("isCollapsed", Boolean.FALSE), new p0("positionOfFeed", Integer.valueOf(i3)), new p0("sourceMediaID", str2), new p0("sourceMediaTitle", str3));
        com.amazon.aps.iva.yb0.j.f(str, "channelId");
        com.amazon.aps.iva.yb0.j.f(aVar, "screenName");
        com.amazon.aps.iva.yb0.j.f(str2, "sourceMediaId");
        com.amazon.aps.iva.yb0.j.f(str3, "sourceMediaTitle");
    }

    public j(com.amazon.aps.iva.ks.s sVar, com.amazon.aps.iva.ks.u uVar, com.amazon.aps.iva.js.r rVar, com.amazon.aps.iva.js.q qVar, com.amazon.aps.iva.ks.g gVar, com.amazon.aps.iva.js.i iVar, com.amazon.aps.iva.ks.j jVar) {
        super("Mobile Acquisition Flow Completed", sVar, uVar, rVar, qVar, gVar, new p0("eventSource", iVar), jVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, String str2, Long l, String str3, com.amazon.aps.iva.ks.w wVar) {
        super("Video Error", wVar, new p0("code", str), new p0(MediaTrack.ROLE_DESCRIPTION, str3), new p0("dumpId", str2), new p0("playheadTime", l), new p0("playerSdk", "native"));
        com.amazon.aps.iva.yb0.j.f(str, "errorCode");
    }
}

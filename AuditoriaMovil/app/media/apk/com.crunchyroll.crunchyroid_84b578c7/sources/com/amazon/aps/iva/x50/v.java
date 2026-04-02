package com.amazon.aps.iva.x50;
/* compiled from: UserActivityLogger.kt */
/* loaded from: classes2.dex */
public final class v implements u {
    public final com.amazon.aps.iva.y50.a a = com.amazon.aps.iva.y50.b.a;

    @Override // com.amazon.aps.iva.x50.u
    public final void a(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "contentId");
        this.a.log("Content: ".concat(str));
    }

    @Override // com.amazon.aps.iva.x60.c
    public final void b(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "activitiesHistory");
        this.a.a("Activity List History", str);
    }

    @Override // com.amazon.aps.iva.y60.b
    public final void c(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "action");
        this.a.log(str);
    }

    @Override // com.amazon.aps.iva.x60.c
    public final void d(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "activeFragmentsList");
        this.a.a("Current Attached Fragments", str);
    }
}

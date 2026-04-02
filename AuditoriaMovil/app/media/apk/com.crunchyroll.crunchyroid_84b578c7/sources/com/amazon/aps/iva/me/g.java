package com.amazon.aps.iva.me;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
/* compiled from: BillingNotificationLauncher.kt */
/* loaded from: classes.dex */
public final class g extends l implements com.amazon.aps.iva.xb0.l<androidx.fragment.app.h, q> {
    public static final g h = new g();

    public g() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(androidx.fragment.app.h hVar) {
        androidx.fragment.app.h hVar2 = hVar;
        com.amazon.aps.iva.yb0.j.f(hVar2, "activity");
        com.amazon.aps.iva.se.d.g.getClass();
        new com.amazon.aps.iva.se.d().show(hVar2.getSupportFragmentManager(), "on_hold_notification_dialog");
        return q.a;
    }
}

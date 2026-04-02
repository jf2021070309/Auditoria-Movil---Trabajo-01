package com.amazon.aps.iva.me;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
/* compiled from: BillingNotificationLauncher.kt */
/* loaded from: classes.dex */
public final class e extends l implements p<androidx.fragment.app.h, com.amazon.aps.iva.ue.g, q> {
    public static final e h = new e();

    public e() {
        super(2);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(androidx.fragment.app.h hVar, com.amazon.aps.iva.ue.g gVar) {
        androidx.fragment.app.h hVar2 = hVar;
        com.amazon.aps.iva.ue.g gVar2 = gVar;
        com.amazon.aps.iva.yb0.j.f(hVar2, "activity");
        com.amazon.aps.iva.yb0.j.f(gVar2, "input");
        com.amazon.aps.iva.ue.f.h.getClass();
        com.amazon.aps.iva.ue.f fVar = new com.amazon.aps.iva.ue.f();
        fVar.e.b(fVar, com.amazon.aps.iva.ue.f.i[0], gVar2);
        fVar.show(hVar2.getSupportFragmentManager(), "renew_notification_dialog");
        return q.a;
    }
}

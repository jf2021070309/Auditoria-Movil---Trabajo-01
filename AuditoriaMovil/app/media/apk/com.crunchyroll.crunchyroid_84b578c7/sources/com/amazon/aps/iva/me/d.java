package com.amazon.aps.iva.me;

import android.content.Context;
import android.content.Intent;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.billingnotifications.ingrace.InGraceNotificationActivity;
/* compiled from: BillingNotificationLauncher.kt */
/* loaded from: classes.dex */
public final class d extends l implements p<Context, com.amazon.aps.iva.qe.d, q> {
    public static final d h = new d();

    public d() {
        super(2);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(Context context, com.amazon.aps.iva.qe.d dVar) {
        Context context2 = context;
        com.amazon.aps.iva.qe.d dVar2 = dVar;
        com.amazon.aps.iva.yb0.j.f(context2, "context");
        com.amazon.aps.iva.yb0.j.f(dVar2, "input");
        int i = InGraceNotificationActivity.o;
        Intent intent = new Intent(context2, InGraceNotificationActivity.class);
        intent.putExtra("in_grace_input", dVar2);
        context2.startActivity(intent);
        return q.a;
    }
}

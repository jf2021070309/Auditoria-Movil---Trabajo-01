package com.amazon.aps.iva.me;

import android.content.Intent;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.billingnotifications.cancelled.CancellationCompleteActivity;
/* compiled from: BillingNotificationLauncher.kt */
/* loaded from: classes.dex */
public final class f extends l implements p<androidx.fragment.app.h, com.amazon.aps.iva.ne.e, q> {
    public static final f h = new f();

    public f() {
        super(2);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(androidx.fragment.app.h hVar, com.amazon.aps.iva.ne.e eVar) {
        androidx.fragment.app.h hVar2 = hVar;
        com.amazon.aps.iva.ne.e eVar2 = eVar;
        com.amazon.aps.iva.yb0.j.f(hVar2, "activity");
        com.amazon.aps.iva.yb0.j.f(eVar2, "input");
        int i = CancellationCompleteActivity.n;
        Intent intent = new Intent(hVar2, CancellationCompleteActivity.class);
        intent.putExtra("input", eVar2);
        hVar2.startActivity(intent);
        return q.a;
    }
}

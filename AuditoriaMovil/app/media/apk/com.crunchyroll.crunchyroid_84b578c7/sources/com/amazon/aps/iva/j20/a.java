package com.amazon.aps.iva.j20;

import android.content.Context;
import android.content.Intent;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.presentation.multitiersubscription.manage.ManageMembershipActivity;
/* compiled from: CancellationRescueSubscriptionPageRouter.kt */
/* loaded from: classes2.dex */
public final class a implements com.amazon.aps.iva.qh.a {
    public final Context a;

    public a(Context context) {
        this.a = context;
    }

    @Override // com.amazon.aps.iva.qh.a
    public final void a(com.amazon.aps.iva.sh.a aVar) {
        int i = ManageMembershipActivity.m;
        Context context = this.a;
        j.f(context, "context");
        Intent intent = new Intent(context, ManageMembershipActivity.class);
        intent.putExtra("manage_membership_input", aVar);
        context.startActivity(intent);
    }
}

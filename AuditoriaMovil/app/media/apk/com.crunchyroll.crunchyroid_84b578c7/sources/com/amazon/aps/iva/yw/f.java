package com.amazon.aps.iva.yw;

import android.content.Context;
import android.content.Intent;
import com.crunchyroll.billingnotifications.cancelled.CancellationCompleteActivity;
import com.ellation.crunchyroll.presentation.main.settings.SettingsBottomBarActivity;
/* compiled from: FeaturesProvider.kt */
/* loaded from: classes2.dex */
public final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ Context h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CancellationCompleteActivity cancellationCompleteActivity) {
        super(0);
        this.h = cancellationCompleteActivity;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        SettingsBottomBarActivity.a aVar = SettingsBottomBarActivity.B;
        com.amazon.aps.iva.cg.d0 d0Var = com.amazon.aps.iva.cg.d0.MEMBERSHIP_PLAN;
        aVar.getClass();
        Context context = this.h;
        com.amazon.aps.iva.yb0.j.f(context, "context");
        Intent intent = new Intent(context, SettingsBottomBarActivity.class);
        if (d0Var != null) {
            intent.putExtra("settings_deeplink_destination", d0Var);
        }
        intent.addFlags(131072);
        context.startActivity(intent);
        return com.amazon.aps.iva.kb0.q.a;
    }
}

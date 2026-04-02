package com.amazon.aps.iva.k20;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import com.ellation.crunchyroll.presentation.multitiersubscription.cancellation.rescue.CancellationRescueActivity;
/* compiled from: CancellationRescueFlowRouter.kt */
/* loaded from: classes2.dex */
public final class q extends com.amazon.aps.iva.i.a<k, Integer> {
    @Override // com.amazon.aps.iva.i.a
    public final Intent a(ComponentActivity componentActivity, Object obj) {
        k kVar = (k) obj;
        com.amazon.aps.iva.yb0.j.f(componentActivity, "context");
        com.amazon.aps.iva.yb0.j.f(kVar, "input");
        Intent intent = new Intent(componentActivity, CancellationRescueActivity.class);
        intent.putExtra("cancellation_rescue_input", kVar);
        return intent;
    }

    @Override // com.amazon.aps.iva.i.a
    public final Integer c(int i, Intent intent) {
        return Integer.valueOf(i);
    }
}

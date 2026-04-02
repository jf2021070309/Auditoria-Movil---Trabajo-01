package com.amazon.aps.iva.j30;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import com.ellation.crunchyroll.presentation.multitiersubscription.upsellv2.UpsellV2Activity;
/* compiled from: UpsellV2FlowRouter.kt */
/* loaded from: classes2.dex */
public final class y extends com.amazon.aps.iva.i.a<g, Integer> {
    public final com.amazon.aps.iva.vw.a a;

    public y(com.amazon.aps.iva.vw.a aVar) {
        this.a = aVar;
    }

    @Override // com.amazon.aps.iva.i.a
    public final Intent a(ComponentActivity componentActivity, Object obj) {
        g gVar = (g) obj;
        com.amazon.aps.iva.yb0.j.f(componentActivity, "context");
        com.amazon.aps.iva.yb0.j.f(gVar, "input");
        Intent intent = new Intent(componentActivity, UpsellV2Activity.class);
        intent.putExtra("ALLOW_SKIPPING_SUBSCRIPTION", gVar.a);
        intent.putExtra("CTA_BUTTON_TEXT", gVar.b);
        intent.putExtra("CTA_BUTTON_TEXT_WITH_INTO_OFFER", gVar.c);
        intent.putExtra("experiment", this.a);
        return intent;
    }

    @Override // com.amazon.aps.iva.i.a
    public final Integer c(int i, Intent intent) {
        return Integer.valueOf(i);
    }
}

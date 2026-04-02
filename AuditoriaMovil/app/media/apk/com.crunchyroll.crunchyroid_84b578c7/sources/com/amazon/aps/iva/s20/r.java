package com.amazon.aps.iva.s20;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import com.ellation.crunchyroll.presentation.multitiersubscription.extendedupgrade.UpgradeActivity;
/* compiled from: UpgrageFlowRouter.kt */
/* loaded from: classes2.dex */
public final class r extends com.amazon.aps.iva.i.a<String, Integer> {
    public final com.amazon.aps.iva.vw.a a;
    public final com.amazon.aps.iva.xh.a b;
    public final String c;
    public final com.amazon.aps.iva.js.i d;

    public r(com.amazon.aps.iva.vw.a aVar, com.amazon.aps.iva.xh.a aVar2, String str, com.amazon.aps.iva.js.i iVar) {
        com.amazon.aps.iva.yb0.j.f(aVar2, "successScreenType");
        com.amazon.aps.iva.yb0.j.f(iVar, "eventSourceProperty");
        this.a = aVar;
        this.b = aVar2;
        this.c = str;
        this.d = iVar;
    }

    @Override // com.amazon.aps.iva.i.a
    public final Intent a(ComponentActivity componentActivity, Object obj) {
        com.amazon.aps.iva.yb0.j.f(componentActivity, "context");
        Intent intent = new Intent(componentActivity, UpgradeActivity.class);
        intent.putExtra("experiment", this.a);
        intent.putExtra("UPGRADE_EXTRA_SUCCESS_SCREEN_TYPE", this.b);
        intent.putExtra("UPGRADE_EXTRA_REDIRECT_URL", this.c);
        intent.putExtra("UPGRADE_EXTRA_PRESELECTED_SKU", (String) obj);
        intent.putExtra("UPGRADE_EXTRA_EVENT_SOURCE_PROPERTY", this.d);
        return intent;
    }

    @Override // com.amazon.aps.iva.i.a
    public final Integer c(int i, Intent intent) {
        return Integer.valueOf(i);
    }
}

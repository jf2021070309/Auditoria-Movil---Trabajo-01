package com.amazon.aps.iva.vx;

import android.content.Intent;
/* compiled from: HomeFeedAnalytics.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class g extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<Intent, Boolean> {
    public g(k kVar) {
        super(1, kVar, j.class, "isFromBottomNavBar", "isFromBottomNavBar(Landroid/content/Intent;)Z", 0);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Boolean invoke(Intent intent) {
        Intent intent2 = intent;
        com.amazon.aps.iva.yb0.j.f(intent2, "p0");
        return Boolean.valueOf(((j) this.receiver).b(intent2));
    }
}

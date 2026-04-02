package com.amazon.aps.iva.k50;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
/* compiled from: SubscriptionPageRouter.kt */
/* loaded from: classes2.dex */
public final class m implements l {
    public final Context a;

    public m(Context context) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        this.a = context;
    }

    @Override // com.amazon.aps.iva.k50.l
    public final void a() {
        this.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions")));
    }
}

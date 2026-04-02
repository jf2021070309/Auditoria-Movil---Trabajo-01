package com.amazon.aps.iva.ix;

import android.app.Activity;
import com.amazon.aps.iva.vx.n;
/* compiled from: HomeFeedRoutersFactoryImpl.kt */
/* loaded from: classes2.dex */
public final class m implements n {
    public final com.amazon.aps.iva.ph.a a;

    public m(com.amazon.aps.iva.f20.j jVar) {
        this.a = jVar;
    }

    @Override // com.amazon.aps.iva.vx.n
    public final j a(Activity activity) {
        return new j(activity);
    }

    @Override // com.amazon.aps.iva.vx.n
    public final l b(Activity activity) {
        return new l(activity);
    }

    @Override // com.amazon.aps.iva.vx.n
    public final com.amazon.aps.iva.k50.f c(Activity activity) {
        return new com.amazon.aps.iva.k50.f(new l(activity), new j(activity));
    }

    @Override // com.amazon.aps.iva.vx.n
    public final com.amazon.aps.iva.k50.j createSubscriptionFlowRouter(com.amazon.aps.iva.k.c cVar) {
        return this.a.b(cVar);
    }

    @Override // com.amazon.aps.iva.vx.n
    public final k d(Activity activity) {
        return new k(activity);
    }

    @Override // com.amazon.aps.iva.vx.n
    public final com.amazon.aps.iva.ii.a e(Activity activity) {
        return new com.amazon.aps.iva.ii.a(activity);
    }
}

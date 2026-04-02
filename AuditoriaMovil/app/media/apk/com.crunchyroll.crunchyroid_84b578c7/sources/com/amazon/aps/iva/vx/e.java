package com.amazon.aps.iva.vx;

import com.amazon.aps.iva.k50.j;
import com.amazon.aps.iva.us.u;
import com.ellation.crunchyroll.feed.subscriptionbutton.FeedSubscriptionButton;
/* compiled from: FeedSubscriptionButtonPresenter.kt */
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.wy.b<com.amazon.aps.iva.ky.a> implements d {
    public final com.amazon.aps.iva.k50.j b;
    public final b c;
    public final com.amazon.aps.iva.xb0.a<Boolean> d;

    public e(FeedSubscriptionButton feedSubscriptionButton, com.amazon.aps.iva.k50.j jVar, c cVar, com.amazon.aps.iva.xb0.a aVar) {
        super(feedSubscriptionButton, new com.amazon.aps.iva.wy.j[0]);
        this.b = jVar;
        this.c = cVar;
        this.d = aVar;
    }

    @Override // com.amazon.aps.iva.vx.d
    public final void I(com.amazon.aps.iva.fs.b bVar) {
        u.a.a(this.c, bVar, null, 6);
        j.a.a(this.b, null, 3);
    }

    @Override // com.amazon.aps.iva.vx.d
    public final void a3() {
        com.amazon.aps.iva.ky.a view = getView();
        if (this.d.invoke().booleanValue()) {
            view.e2();
        } else {
            view.L0();
        }
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        com.amazon.aps.iva.ky.a view = getView();
        if (this.d.invoke().booleanValue()) {
            view.e2();
        } else {
            view.L0();
        }
    }
}

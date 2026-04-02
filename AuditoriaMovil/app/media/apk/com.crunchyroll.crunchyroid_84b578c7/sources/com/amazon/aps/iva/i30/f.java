package com.amazon.aps.iva.i30;

import com.amazon.aps.iva.wy.j;
import com.ellation.crunchyroll.presentation.multitiersubscription.success.downgrade.DowngradeSuccessActivity;
/* compiled from: DowngradeSuccessPresenter.kt */
/* loaded from: classes2.dex */
public final class f extends com.amazon.aps.iva.wy.b<g> implements e {
    public final a b;
    public final d c;

    public f(DowngradeSuccessActivity downgradeSuccessActivity, a aVar, d dVar) {
        super(downgradeSuccessActivity, new j[0]);
        this.b = aVar;
        this.c = dVar;
    }

    @Override // com.amazon.aps.iva.i30.e
    public final void c() {
        getView().close();
    }

    @Override // com.amazon.aps.iva.i30.e
    public final void m() {
        getView().close();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        String str = this.c.b;
        if (str != null) {
            getView().w2(str);
        }
        this.b.a();
    }
}

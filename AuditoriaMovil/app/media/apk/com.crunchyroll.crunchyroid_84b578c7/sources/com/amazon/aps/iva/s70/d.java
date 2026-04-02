package com.amazon.aps.iva.s70;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.wy.j;
import com.amazon.aps.iva.x50.k;
import com.amazon.aps.iva.xb0.l;
import com.ellation.widgets.searchtoolbar.SearchToolbarLayout;
/* compiled from: SearchToolbarPresenter.kt */
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.wy.b<e> implements a {
    public String b;
    public final k<String> c;
    public l<? super String, q> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, SearchToolbarLayout.a aVar) {
        super(eVar, new j[0]);
        com.amazon.aps.iva.yb0.j.f(eVar, "view");
        this.b = "";
        this.c = aVar.invoke(new b(this));
        this.d = c.h;
    }

    @Override // com.amazon.aps.iva.s70.a
    public final void F(String str) {
        boolean z;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        k<String> kVar = this.c;
        if (z) {
            kVar.setValue(str);
            getView().Nh();
            return;
        }
        kVar.cancel();
        this.b = "";
        this.d.invoke("");
        getView().Jg();
    }

    @Override // com.amazon.aps.iva.s70.a
    public final void J0() {
        this.b = "";
        getView().clearText();
    }

    @Override // com.amazon.aps.iva.s70.a
    public final void k3(l<? super String, q> lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "<set-?>");
        this.d = lVar;
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onDestroy() {
        this.c.cancel();
    }
}

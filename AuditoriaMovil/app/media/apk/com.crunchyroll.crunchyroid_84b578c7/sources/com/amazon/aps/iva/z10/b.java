package com.amazon.aps.iva.z10;

import com.amazon.aps.iva.wy.j;
import com.ellation.crunchyroll.presentation.main.lists.tabs.MyListsTabLayout;
/* compiled from: MyListsTabLayoutPresenter.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.wy.b<c> implements a {
    public final com.amazon.aps.iva.xb0.a<Boolean> b;

    public b(MyListsTabLayout myListsTabLayout, com.ellation.crunchyroll.presentation.main.lists.tabs.a aVar) {
        super(myListsTabLayout, new j[0]);
        this.b = aVar;
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        getView().t2();
        w0();
    }

    @Override // com.amazon.aps.iva.z10.a
    public final void w0() {
        if (this.b.invoke().booleanValue()) {
            getView().Ra();
        } else {
            getView().K3();
        }
    }
}

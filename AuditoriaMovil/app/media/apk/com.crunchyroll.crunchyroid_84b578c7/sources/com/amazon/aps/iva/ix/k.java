package com.amazon.aps.iva.ix;

import android.app.Activity;
import com.amazon.aps.iva.k50.o;
import com.ellation.crunchyroll.presentation.main.lists.MyListsBottomBarActivity;
/* compiled from: HomeFeedRoutersFactoryImpl.kt */
/* loaded from: classes2.dex */
public final class k implements o {
    public final /* synthetic */ Activity a;

    public k(Activity activity) {
        this.a = activity;
    }

    @Override // com.amazon.aps.iva.k50.o
    public final void a() {
        MyListsBottomBarActivity.a aVar = MyListsBottomBarActivity.w;
        com.amazon.aps.iva.y10.m mVar = com.amazon.aps.iva.y10.m.WATCHLIST;
        aVar.getClass();
        MyListsBottomBarActivity.a.a(this.a, mVar);
    }
}

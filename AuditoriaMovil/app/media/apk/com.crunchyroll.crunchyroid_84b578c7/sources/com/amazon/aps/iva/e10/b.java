package com.amazon.aps.iva.e10;

import com.amazon.aps.iva.wy.j;
import com.ellation.crunchyroll.presentation.downloads.activity.DownloadsActivity;
/* compiled from: DownloadsActivityPresenter.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.wy.b<c> implements a {
    public final com.amazon.aps.iva.uw.a b;

    public b(com.amazon.aps.iva.uw.a aVar, DownloadsActivity downloadsActivity) {
        super(downloadsActivity, new j[0]);
        this.b = aVar;
    }

    @Override // com.amazon.aps.iva.e10.a
    public final void a() {
        com.amazon.aps.iva.uw.a aVar = this.b;
        T d = aVar.a1().d();
        com.amazon.aps.iva.yb0.j.c(d);
        if (((Boolean) d).booleanValue()) {
            aVar.u();
        } else {
            getView().close();
        }
    }
}

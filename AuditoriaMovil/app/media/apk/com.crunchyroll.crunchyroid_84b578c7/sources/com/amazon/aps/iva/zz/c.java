package com.amazon.aps.iva.zz;

import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.wy.j;
/* compiled from: BrowseGenreFeedPresenter.kt */
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.wy.b<d> implements b {
    public final com.amazon.aps.iva.a00.b b;

    public c(a aVar, com.amazon.aps.iva.a00.b bVar) {
        super(aVar, new j[0]);
        this.b = bVar;
    }

    @Override // com.amazon.aps.iva.zz.b
    public final void T5(com.amazon.aps.iva.l10.a aVar, com.amazon.aps.iva.l10.a aVar2) {
        String str;
        boolean z;
        String str2 = null;
        if (aVar2 != null) {
            str = aVar2.c;
        } else {
            str = null;
        }
        if (str != null && !m.b0(str)) {
            z = false;
        } else {
            z = true;
        }
        String str3 = aVar.c;
        if (z) {
            getView().od(null, str3);
            return;
        }
        d view = getView();
        if (aVar2 != null) {
            str2 = aVar2.c;
        }
        view.od(str3, str2);
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        if (this.b != null) {
            getView().ld();
        }
    }
}

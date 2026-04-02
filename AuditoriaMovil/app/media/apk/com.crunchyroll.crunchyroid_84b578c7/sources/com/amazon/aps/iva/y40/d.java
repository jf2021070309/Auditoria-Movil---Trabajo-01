package com.amazon.aps.iva.y40;

import android.content.Context;
import com.amazon.aps.iva.mh.f;
import com.amazon.aps.iva.mh.i;
import com.amazon.aps.iva.mh.k;
import com.amazon.aps.iva.wy.h;
import com.amazon.aps.iva.x40.q;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.application.a;
/* compiled from: TermsUpdatedDialog.kt */
/* loaded from: classes2.dex */
public final class d implements h {
    public final Context b;
    public final k c;

    public d(Context context, q qVar) {
        j.f(context, "context");
        j.f(qVar, "lifecycleOwner");
        this.b = context;
        com.ellation.crunchyroll.application.a aVar = a.C0959a.a;
        if (aVar != null) {
            Object c = aVar.c().c(com.amazon.aps.iva.cx.b.class, "app_legal_links");
            if (c != null) {
                f fVar = new f(context, (com.amazon.aps.iva.cx.b) c);
                com.amazon.aps.iva.ls.a aVar2 = com.amazon.aps.iva.ls.a.TERMS_OF_USE;
                com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
                j.f(aVar2, "screen");
                k kVar = new k(fVar, new i(cVar, aVar2), this);
                this.c = kVar;
                com.ellation.crunchyroll.mvp.lifecycle.a.a(kVar, qVar);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.AppLegalLinksConfigImpl");
        }
        j.m("instance");
        throw null;
    }
}

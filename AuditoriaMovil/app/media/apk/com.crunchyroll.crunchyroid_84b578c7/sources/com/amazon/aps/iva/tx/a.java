package com.amazon.aps.iva.tx;

import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.o40.c;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yw.d0;
import com.ellation.crunchyroll.application.CrunchyrollApplication;
/* compiled from: WatchScreenInteractorFactoryImpl.kt */
/* loaded from: classes2.dex */
public final class a implements com.amazon.aps.iva.bp.c {
    public static final a a = new a();

    @Override // com.amazon.aps.iva.bp.c
    public final b a(com.amazon.aps.iva.ap.a aVar) {
        j.f(aVar, "contentInput");
        return new b(c.a.a(new com.amazon.aps.iva.o40.j(aVar.c, aVar.b, aVar.d), ((d0) com.ellation.crunchyroll.application.e.a()).l.y()));
    }

    @Override // com.amazon.aps.iva.bp.c
    public final b b(com.amazon.aps.iva.ap.a aVar, o oVar) {
        j.f(aVar, "contentInput");
        j.f(oVar, "lifecycleOwner");
        CrunchyrollApplication b = com.ellation.crunchyroll.application.e.b();
        return new b(b.l.a(new com.amazon.aps.iva.o40.j(aVar.c, aVar.b, aVar.d), oVar));
    }
}

package com.amazon.aps.iva.co;

import android.content.SharedPreferences;
import com.amazon.aps.iva.co.f;
import com.amazon.aps.iva.cx.s;
import com.ellation.crunchyroll.api.GsonHolder;
import com.ellation.crunchyroll.application.CrunchyrollApplication;
import com.google.gson.Gson;
/* compiled from: UserMigrationFeature.kt */
/* loaded from: classes2.dex */
public final class g implements f {
    public final e b = com.amazon.aps.iva.rx.b.a;
    public final com.amazon.aps.iva.fo.d c;
    public final com.amazon.aps.iva.fo.h d;
    public final com.amazon.aps.iva.eo.c e;
    public final com.amazon.aps.iva.ho.g f;

    public g() {
        com.amazon.aps.iva.fo.d dVar = new com.amazon.aps.iva.fo.d(com.amazon.aps.iva.ds.c.b);
        this.c = dVar;
        s sVar = com.amazon.aps.iva.rx.b.h;
        com.amazon.aps.iva.yb0.j.f(sVar, "userAccountMigrationConfig");
        com.amazon.aps.iva.fo.h hVar = new com.amazon.aps.iva.fo.h(dVar, sVar);
        this.d = hVar;
        com.amazon.aps.iva.fo.f fVar = new com.amazon.aps.iva.fo.f(hVar);
        CrunchyrollApplication crunchyrollApplication = com.amazon.aps.iva.rx.b.b;
        String str = com.amazon.aps.iva.rx.b.f;
        com.amazon.aps.iva.ts.a aVar = com.amazon.aps.iva.rx.b.g;
        Gson gsonHolder = GsonHolder.getInstance();
        com.amazon.aps.iva.yb0.j.f(crunchyrollApplication, "context");
        com.amazon.aps.iva.yb0.j.f(str, "environment");
        com.amazon.aps.iva.yb0.j.f(aVar, "config");
        com.amazon.aps.iva.yb0.j.f(gsonHolder, "gson");
        SharedPreferences sharedPreferences = crunchyrollApplication.getSharedPreferences("fun_user_store", 0);
        com.amazon.aps.iva.yb0.j.e(sharedPreferences, "context.getSharedPrefere…ser_store\", MODE_PRIVATE)");
        com.amazon.aps.iva.eo.c cVar = new com.amazon.aps.iva.eo.c(sharedPreferences, gsonHolder, aVar, fVar, str);
        this.e = cVar;
        this.f = new com.amazon.aps.iva.ho.g(cVar);
    }

    @Override // com.amazon.aps.iva.co.f
    public final boolean a() {
        if (this.b.g().isEnabled() && this.f.a() == com.amazon.aps.iva.ho.e.OWNERSHIP_VERIFICATION) {
            return true;
        }
        return false;
    }

    public final com.amazon.aps.iva.ho.d b(com.amazon.aps.iva.i60.b bVar, com.amazon.aps.iva.h.c cVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "context");
        s g = this.b.g();
        com.amazon.aps.iva.ho.b bVar2 = new com.amazon.aps.iva.ho.b(bVar, cVar);
        com.amazon.aps.iva.eo.b bVar3 = f.a.b;
        if (bVar3 != null) {
            com.amazon.aps.iva.yb0.j.f(g, "userAccountMigrationConfig");
            com.amazon.aps.iva.ho.g gVar = this.f;
            com.amazon.aps.iva.yb0.j.f(gVar, "migrationStatusProvider");
            return new com.amazon.aps.iva.ho.d(g, gVar, bVar2, bVar3);
        }
        com.amazon.aps.iva.yb0.j.m("funUserStore");
        throw null;
    }
}

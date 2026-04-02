package com.amazon.aps.iva.ch;

import android.app.Application;
import com.amazon.aps.iva.dh.h;
import com.amazon.aps.iva.dh.i;
import com.ellation.crunchyroll.application.CrunchyrollApplication;
import com.google.gson.Gson;
/* compiled from: InAppReviewFeatureImpl.kt */
/* loaded from: classes.dex */
public final class d implements c, b {
    public final a a;
    public final com.ellation.crunchyroll.application.d b;
    public final Application c;
    public final Gson d;
    public final com.amazon.aps.iva.xb0.a<Boolean> e;
    public final h f;
    public final com.amazon.aps.iva.dh.a g;

    public d(com.amazon.aps.iva.jx.a aVar, com.ellation.crunchyroll.application.d dVar, CrunchyrollApplication crunchyrollApplication, Gson gson, com.amazon.aps.iva.jx.b bVar) {
        com.amazon.aps.iva.dh.a iVar;
        this.a = aVar;
        this.b = dVar;
        this.c = crunchyrollApplication;
        this.d = gson;
        this.e = bVar;
        h hVar = new h(crunchyrollApplication);
        this.f = hVar;
        if (aVar.isEnabled()) {
            iVar = new com.amazon.aps.iva.dh.b(this, hVar);
        } else {
            iVar = new i();
        }
        this.g = iVar;
    }

    public final g a() {
        return new g(this.f, this.a, this.g.a());
    }

    @Override // com.amazon.aps.iva.ch.b
    public final com.amazon.aps.iva.xb0.a<Boolean> b() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.ch.b
    public final a c() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.ch.c
    public final com.amazon.aps.iva.dh.c d() {
        return this.g.d();
    }

    @Override // com.amazon.aps.iva.ch.b
    public final Application e() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.ch.b
    public final com.ellation.crunchyroll.application.d f() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.ch.b
    public final Gson g() {
        return this.d;
    }
}

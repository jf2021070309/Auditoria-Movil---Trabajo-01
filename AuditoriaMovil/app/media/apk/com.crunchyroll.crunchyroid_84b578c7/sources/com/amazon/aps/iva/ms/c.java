package com.amazon.aps.iva.ms;

import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.gy.t;
import com.amazon.aps.iva.ob0.g;
import com.amazon.aps.iva.se0.c2;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.se0.i;
import com.amazon.aps.iva.ys.m;
import com.ellation.crunchyroll.application.b;
import com.ellation.crunchyroll.application.c;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
/* compiled from: AppConfig.kt */
/* loaded from: classes2.dex */
public final class c implements a, g0 {
    public final com.amazon.aps.iva.ps.b b;
    public final f c;
    public final com.amazon.aps.iva.qs.a d;
    public final g e;
    public final Gson f;
    public final /* synthetic */ com.amazon.aps.iva.xe0.d g = z.j();
    public c2 h;
    public final e i;

    public c(t tVar, com.amazon.aps.iva.os.a aVar, com.amazon.aps.iva.os.b bVar, m mVar, com.amazon.aps.iva.qs.a aVar2, com.amazon.aps.iva.ye0.b bVar2, Gson gson) {
        this.b = bVar;
        this.c = mVar;
        this.d = aVar2;
        this.e = bVar2;
        this.f = gson;
        this.i = new e(new JsonObject(), aVar.a(), mVar.b());
    }

    @Override // com.amazon.aps.iva.ms.a
    public final void a(c.a aVar) {
        c2 c2Var = this.h;
        if (c2Var != null) {
            c2Var.a(null);
        }
        this.h = i.d(this, null, null, new b(this, aVar, null), 3);
    }

    @Override // com.amazon.aps.iva.ms.a
    public final JsonObject b() {
        return this.i.e;
    }

    @Override // com.amazon.aps.iva.ms.a
    public final Object c(Class cls, String str) {
        return this.f.fromJson(this.i.e.get(str), (Class<Object>) cls);
    }

    public final void d(b.C0960b c0960b) {
        e eVar = this.i;
        eVar.getClass();
        if (eVar.d) {
            c0960b.invoke();
            eVar.a();
            return;
        }
        eVar.c.add(c0960b);
    }

    @Override // com.amazon.aps.iva.se0.g0
    public final g getCoroutineContext() {
        return this.g.b;
    }
}

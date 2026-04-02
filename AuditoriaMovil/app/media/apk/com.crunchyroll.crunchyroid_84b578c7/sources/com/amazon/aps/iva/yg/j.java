package com.amazon.aps.iva.yg;

import android.app.Application;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.t50.c;
import com.google.gson.Gson;
import java.util.concurrent.TimeUnit;
/* compiled from: EmailVerificationStore.kt */
/* loaded from: classes.dex */
public final class j extends com.amazon.aps.iva.xe.c<k> implements h {
    public final com.amazon.aps.iva.t50.c c;
    public final g d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Application application, Gson gson, g gVar) {
        super(new i(application, gson));
        c.b bVar = c.b.a;
        com.amazon.aps.iva.yb0.j.f(application, "context");
        com.amazon.aps.iva.yb0.j.f(gson, "gson");
        com.amazon.aps.iva.yb0.j.f(gVar, "config");
        this.c = bVar;
        this.d = gVar;
    }

    @Override // com.amazon.aps.iva.yg.h
    public final void a() {
        m1(new k(TimeUnit.MINUTES.toMillis(this.d.a()) + this.c.a()));
    }

    @Override // com.amazon.aps.iva.yg.h
    public final void b() {
        m1(new k(TimeUnit.MINUTES.toMillis(this.d.b()) + this.c.a()));
    }

    @Override // com.amazon.aps.iva.yg.h
    public final void e() {
        m1(new k(this.c.a()));
    }

    @Override // com.amazon.aps.iva.yg.h
    public final k f() {
        return (k) x.v0(q());
    }
}

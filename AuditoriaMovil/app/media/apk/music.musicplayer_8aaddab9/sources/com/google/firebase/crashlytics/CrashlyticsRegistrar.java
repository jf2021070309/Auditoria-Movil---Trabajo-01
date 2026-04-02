package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import e.d.d.g;
import e.d.d.k.a.a;
import e.d.d.l.n;
import e.d.d.l.o;
import e.d.d.l.q;
import e.d.d.l.r;
import e.d.d.l.w;
import e.d.d.m.i;
import e.d.d.m.j.c;
import e.d.d.m.j.j.e0;
import e.d.d.m.j.j.i0;
import e.d.d.m.j.j.l;
import e.d.d.m.j.j.z;
import e.d.d.u.h;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
/* loaded from: classes2.dex */
public class CrashlyticsRegistrar implements r {
    @Override // e.d.d.l.r
    public List<n<?>> getComponents() {
        n.b a = n.a(i.class);
        a.a(new w(g.class, 1, 0));
        a.a(new w(h.class, 1, 0));
        a.a(new w(c.class, 0, 2));
        a.a(new w(a.class, 0, 2));
        a.c(new q() { // from class: e.d.d.m.d
            @Override // e.d.d.l.q
            public final Object a(o oVar) {
                Objects.requireNonNull(CrashlyticsRegistrar.this);
                e.d.d.g gVar = (e.d.d.g) oVar.a(e.d.d.g.class);
                e.d.d.t.a e2 = oVar.e(e.d.d.m.j.c.class);
                e.d.d.t.a e3 = oVar.e(e.d.d.k.a.a.class);
                gVar.a();
                Context context = gVar.f7040d;
                String packageName = context.getPackageName();
                e.d.d.m.j.f fVar = e.d.d.m.j.f.a;
                fVar.a(4);
                e.d.d.m.j.n.f fVar2 = new e.d.d.m.j.n.f(context);
                e0 e0Var = new e0(gVar);
                i0 i0Var = new i0(context, packageName, (e.d.d.u.h) oVar.a(e.d.d.u.h.class), e0Var);
                e.d.d.m.j.d dVar = new e.d.d.m.j.d(e2);
                e eVar = new e(e3);
                z zVar = new z(gVar, i0Var, dVar, e0Var, eVar.b(), eVar.a(), fVar2, c.i.g.h.a("Crashlytics Exception Handler"));
                String b2 = gVar.c().b();
                String f2 = l.f(context);
                fVar.a(3);
                try {
                    e.d.d.m.j.j.h a2 = e.d.d.m.j.j.h.a(context, i0Var, b2, f2, new e.d.d.m.j.e(context));
                    fVar.a(2);
                    ExecutorService a3 = c.i.g.h.a("com.google.firebase.crashlytics.startup");
                    e.d.d.m.j.p.e a4 = e.d.d.m.j.p.e.a(context, b2, i0Var, new e.d.d.m.j.m.b(), a2.f7168e, a2.f7169f, fVar2, e0Var);
                    a4.e(a3).continueWith(a3, new g());
                    Tasks.call(a3, new h(zVar.i(a2, a4), zVar, a4));
                    return new i(zVar);
                } catch (PackageManager.NameNotFoundException e4) {
                    if (e.d.d.m.j.f.a.a(6)) {
                        Log.e("FirebaseCrashlytics", "Error retrieving app package info.", e4);
                    }
                    return null;
                }
            }
        });
        a.d(2);
        return Arrays.asList(a.b(), e.d.b.d.a.t("fire-cls", "18.2.8"));
    }
}

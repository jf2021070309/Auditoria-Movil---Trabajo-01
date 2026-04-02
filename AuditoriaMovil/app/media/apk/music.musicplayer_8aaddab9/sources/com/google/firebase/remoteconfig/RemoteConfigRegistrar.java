package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import e.d.d.g;
import e.d.d.j.d.b;
import e.d.d.k.a.a;
import e.d.d.l.n;
import e.d.d.l.r;
import e.d.d.l.w;
import e.d.d.u.h;
import e.d.d.y.q;
import java.util.Arrays;
import java.util.List;
@Keep
/* loaded from: classes2.dex */
public class RemoteConfigRegistrar implements r {
    @Override // e.d.d.l.r
    public List<n<?>> getComponents() {
        n.b a = n.a(q.class);
        a.a(new w(Context.class, 1, 0));
        a.a(new w(g.class, 1, 0));
        a.a(new w(h.class, 1, 0));
        a.a(new w(b.class, 1, 0));
        a.a(new w(a.class, 0, 1));
        a.c(new e.d.d.l.q() { // from class: e.d.d.y.h
            @Override // e.d.d.l.q
            public final Object a(e.d.d.l.o oVar) {
                e.d.d.j.c cVar;
                Context context = (Context) oVar.a(Context.class);
                e.d.d.g gVar = (e.d.d.g) oVar.a(e.d.d.g.class);
                e.d.d.u.h hVar = (e.d.d.u.h) oVar.a(e.d.d.u.h.class);
                e.d.d.j.d.b bVar = (e.d.d.j.d.b) oVar.a(e.d.d.j.d.b.class);
                synchronized (bVar) {
                    if (!bVar.a.containsKey("frc")) {
                        bVar.a.put("frc", new e.d.d.j.c(bVar.f7065c, "frc"));
                    }
                    cVar = bVar.a.get("frc");
                }
                return new q(context, gVar, hVar, cVar, oVar.b(e.d.d.k.a.a.class));
            }
        });
        a.d(2);
        return Arrays.asList(a.b(), e.d.b.d.a.t("fire-rc", "21.0.1"));
    }
}

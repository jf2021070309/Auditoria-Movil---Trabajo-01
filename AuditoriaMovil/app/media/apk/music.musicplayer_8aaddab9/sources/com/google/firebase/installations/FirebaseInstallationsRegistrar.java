package com.google.firebase.installations;

import androidx.annotation.Keep;
import e.d.b.d.a;
import e.d.d.g;
import e.d.d.l.n;
import e.d.d.l.q;
import e.d.d.l.r;
import e.d.d.l.w;
import e.d.d.r.f;
import e.d.d.u.h;
import java.util.Arrays;
import java.util.List;
@Keep
/* loaded from: classes2.dex */
public class FirebaseInstallationsRegistrar implements r {
    @Override // e.d.d.l.r
    public List<n<?>> getComponents() {
        n.b a = n.a(h.class);
        a.a(new w(g.class, 1, 0));
        a.a(new w(f.class, 0, 1));
        a.a(new w(e.d.d.x.h.class, 0, 1));
        a.c(new q() { // from class: e.d.d.u.d
            @Override // e.d.d.l.q
            public final Object a(e.d.d.l.o oVar) {
                return new g((e.d.d.g) oVar.a(e.d.d.g.class), oVar.b(e.d.d.x.h.class), oVar.b(e.d.d.r.f.class));
            }
        });
        return Arrays.asList(a.b(), a.t("fire-installations", "17.0.0"));
    }
}

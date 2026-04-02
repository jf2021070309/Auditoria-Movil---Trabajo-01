package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import e.d.b.b.g;
import e.d.b.b.i.c;
import e.d.b.b.j.v;
import e.d.d.l.n;
import e.d.d.l.o;
import e.d.d.l.q;
import e.d.d.l.r;
import e.d.d.l.w;
import java.util.Collections;
import java.util.List;
@Keep
/* loaded from: classes2.dex */
public class TransportRegistrar implements r {
    @Override // e.d.d.l.r
    public List<n<?>> getComponents() {
        n.b a = n.a(g.class);
        a.a(new w(Context.class, 1, 0));
        a.c(new q() { // from class: e.d.d.n.a
            @Override // e.d.d.l.q
            public final Object a(o oVar) {
                v.b((Context) oVar.a(Context.class));
                return v.a().c(c.f6045e);
            }
        });
        return Collections.singletonList(a.b());
    }
}

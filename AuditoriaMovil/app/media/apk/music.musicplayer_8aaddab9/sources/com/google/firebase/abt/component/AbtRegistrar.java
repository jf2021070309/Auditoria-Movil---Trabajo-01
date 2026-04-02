package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import e.d.d.j.d.b;
import e.d.d.k.a.a;
import e.d.d.l.n;
import e.d.d.l.o;
import e.d.d.l.q;
import e.d.d.l.r;
import e.d.d.l.w;
import java.util.Arrays;
import java.util.List;
@Keep
/* loaded from: classes2.dex */
public class AbtRegistrar implements r {
    @Override // e.d.d.l.r
    public List<n<?>> getComponents() {
        n.b a = n.a(b.class);
        a.a(new w(Context.class, 1, 0));
        a.a(new w(a.class, 0, 1));
        a.c(new q() { // from class: e.d.d.j.d.a
            @Override // e.d.d.l.q
            public final Object a(o oVar) {
                return new b((Context) oVar.a(Context.class), oVar.b(e.d.d.k.a.a.class));
            }
        });
        return Arrays.asList(a.b(), e.d.b.d.a.t("fire-abt", "21.0.0"));
    }
}

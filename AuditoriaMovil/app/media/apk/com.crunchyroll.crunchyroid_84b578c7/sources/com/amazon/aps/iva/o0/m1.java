package com.amazon.aps.iva.o0;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
/* compiled from: Composer.kt */
/* loaded from: classes.dex */
public final class m1 {
    public final k1<Object> a;
    public final Object b;
    public final o0 c;
    public final z2 d;
    public final c e;
    public List<com.amazon.aps.iva.kb0.j<j2, com.amazon.aps.iva.p0.c<Object>>> f;
    public final c2 g;

    public m1(k1<Object> k1Var, Object obj, o0 o0Var, z2 z2Var, c cVar, List<com.amazon.aps.iva.kb0.j<j2, com.amazon.aps.iva.p0.c<Object>>> list, c2 c2Var) {
        com.amazon.aps.iva.yb0.j.f(k1Var, FirebaseAnalytics.Param.CONTENT);
        com.amazon.aps.iva.yb0.j.f(o0Var, "composition");
        com.amazon.aps.iva.yb0.j.f(z2Var, "slotTable");
        com.amazon.aps.iva.yb0.j.f(c2Var, "locals");
        this.a = k1Var;
        this.b = obj;
        this.c = o0Var;
        this.d = z2Var;
        this.e = cVar;
        this.f = list;
        this.g = c2Var;
    }
}

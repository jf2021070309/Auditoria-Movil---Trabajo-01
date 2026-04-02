package com.amazon.aps.iva.y3;

import android.content.Context;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.z3.d;
import com.amazon.aps.iva.z3.e;
import com.amazon.aps.iva.z3.i;
import com.amazon.aps.iva.z3.m;
import com.amazon.aps.iva.z3.q;
import com.crunchyroll.appwidgets.continuewatching.b;
import java.util.List;
/* compiled from: DataStoreDelegate.kt */
/* loaded from: classes.dex */
public final class c<T> implements com.amazon.aps.iva.bc0.b<Context, i<T>> {
    public final String a;
    public final m<T> b;
    public final l<Context, List<d<T>>> c;
    public final g0 d;
    public final Object e;
    public volatile q f;

    public c(l lVar, g0 g0Var) {
        b.a aVar = b.a.a;
        this.a = "continueWatching";
        this.b = aVar;
        this.c = lVar;
        this.d = g0Var;
        this.e = new Object();
    }

    @Override // com.amazon.aps.iva.bc0.b
    public final Object getValue(Context context, com.amazon.aps.iva.fc0.l lVar) {
        q qVar;
        Context context2 = context;
        j.f(context2, "thisRef");
        j.f(lVar, "property");
        q qVar2 = this.f;
        if (qVar2 == null) {
            synchronized (this.e) {
                if (this.f == null) {
                    Context applicationContext = context2.getApplicationContext();
                    m<T> mVar = this.b;
                    l<Context, List<d<T>>> lVar2 = this.c;
                    j.e(applicationContext, "applicationContext");
                    List<d<T>> invoke = lVar2.invoke(applicationContext);
                    g0 g0Var = this.d;
                    b bVar = new b(applicationContext, this);
                    j.f(mVar, "serializer");
                    j.f(invoke, "migrations");
                    j.f(g0Var, "scope");
                    this.f = new q(bVar, mVar, f1.J(new e(invoke, null)), new com.amazon.aps.iva.a4.a(), g0Var);
                }
                qVar = this.f;
                j.c(qVar);
            }
            return qVar;
        }
        return qVar2;
    }
}

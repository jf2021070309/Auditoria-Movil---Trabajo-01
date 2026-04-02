package com.amazon.aps.iva.c4;

import android.content.Context;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.z3.q;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
/* compiled from: PreferenceDataStoreDelegate.kt */
/* loaded from: classes.dex */
public final class c implements com.amazon.aps.iva.bc0.b<Context, com.amazon.aps.iva.z3.i<com.amazon.aps.iva.d4.d>> {
    public final String a;
    public final l<Context, List<com.amazon.aps.iva.z3.d<com.amazon.aps.iva.d4.d>>> b;
    public final g0 c;
    public final Object d;
    public volatile com.amazon.aps.iva.d4.b e;

    public c(String str, l lVar, g0 g0Var) {
        com.amazon.aps.iva.yb0.j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.a = str;
        this.b = lVar;
        this.c = g0Var;
        this.d = new Object();
    }

    @Override // com.amazon.aps.iva.bc0.b
    public final com.amazon.aps.iva.z3.i<com.amazon.aps.iva.d4.d> getValue(Context context, com.amazon.aps.iva.fc0.l lVar) {
        com.amazon.aps.iva.d4.b bVar;
        Context context2 = context;
        com.amazon.aps.iva.yb0.j.f(context2, "thisRef");
        com.amazon.aps.iva.yb0.j.f(lVar, "property");
        com.amazon.aps.iva.d4.b bVar2 = this.e;
        if (bVar2 == null) {
            synchronized (this.d) {
                if (this.e == null) {
                    Context applicationContext = context2.getApplicationContext();
                    l<Context, List<com.amazon.aps.iva.z3.d<com.amazon.aps.iva.d4.d>>> lVar2 = this.b;
                    com.amazon.aps.iva.yb0.j.e(applicationContext, "applicationContext");
                    List<com.amazon.aps.iva.z3.d<com.amazon.aps.iva.d4.d>> invoke = lVar2.invoke(applicationContext);
                    g0 g0Var = this.c;
                    b bVar3 = new b(applicationContext, this);
                    com.amazon.aps.iva.yb0.j.f(invoke, "migrations");
                    com.amazon.aps.iva.yb0.j.f(g0Var, "scope");
                    com.amazon.aps.iva.d4.f fVar = com.amazon.aps.iva.d4.f.a;
                    this.e = new com.amazon.aps.iva.d4.b(new q(new com.amazon.aps.iva.d4.c(bVar3), fVar, f1.J(new com.amazon.aps.iva.z3.e(invoke, null)), new com.amazon.aps.iva.a4.a(), g0Var));
                }
                bVar = this.e;
                com.amazon.aps.iva.yb0.j.c(bVar);
            }
            return bVar;
        }
        return bVar2;
    }
}

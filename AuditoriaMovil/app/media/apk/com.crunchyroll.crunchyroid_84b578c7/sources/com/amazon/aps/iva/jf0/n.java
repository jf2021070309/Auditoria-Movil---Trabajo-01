package com.amazon.aps.iva.jf0;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Method;
/* compiled from: KotlinExtensions.kt */
/* loaded from: classes4.dex */
public final class n implements d<Object> {
    public final /* synthetic */ com.amazon.aps.iva.se0.m a;

    public n(com.amazon.aps.iva.se0.n nVar) {
        this.a = nVar;
    }

    @Override // com.amazon.aps.iva.jf0.d
    public final void onFailure(b<Object> bVar, Throwable th) {
        com.amazon.aps.iva.yb0.j.g(bVar, "call");
        com.amazon.aps.iva.yb0.j.g(th, "t");
        this.a.resumeWith(com.amazon.aps.iva.ab.x.H(th));
    }

    @Override // com.amazon.aps.iva.jf0.d
    public final void onResponse(b<Object> bVar, a0<Object> a0Var) {
        com.amazon.aps.iva.yb0.j.g(bVar, "call");
        com.amazon.aps.iva.yb0.j.g(a0Var, "response");
        boolean a = a0Var.a();
        com.amazon.aps.iva.se0.m mVar = this.a;
        if (a) {
            Object obj = a0Var.b;
            if (obj == null) {
                Object tag = bVar.request().tag(k.class);
                if (tag != null) {
                    StringBuilder sb = new StringBuilder("Response from ");
                    Method method = ((k) tag).a;
                    com.amazon.aps.iva.yb0.j.b(method, FirebaseAnalytics.Param.METHOD);
                    Class<?> declaringClass = method.getDeclaringClass();
                    com.amazon.aps.iva.yb0.j.b(declaringClass, "method.declaringClass");
                    sb.append(declaringClass.getName());
                    sb.append('.');
                    sb.append(method.getName());
                    sb.append(" was null but response body type was declared as non-null");
                    mVar.resumeWith(com.amazon.aps.iva.ab.x.H(new com.amazon.aps.iva.kb0.c(sb.toString())));
                    return;
                }
                com.amazon.aps.iva.yb0.j.l();
                throw null;
            }
            mVar.resumeWith(obj);
            return;
        }
        mVar.resumeWith(com.amazon.aps.iva.ab.x.H(new i(a0Var)));
    }
}

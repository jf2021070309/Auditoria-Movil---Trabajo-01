package com.amazon.aps.iva.x0;

import com.amazon.aps.iva.o0.p3;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.o0.r1;
import com.amazon.aps.iva.o0.s3;
import com.amazon.aps.iva.o0.t2;
import com.amazon.aps.iva.o0.u0;
import com.amazon.aps.iva.o0.v0;
import com.amazon.aps.iva.y0.t;
/* compiled from: RememberSaveable.kt */
/* loaded from: classes.dex */
public final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<v0, u0> {
    public final /* synthetic */ i h;
    public final /* synthetic */ String i;
    public final /* synthetic */ p3<l<Object, Object>> j;
    public final /* synthetic */ p3<Object> k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, String str, q1 q1Var, q1 q1Var2) {
        super(1);
        this.h = iVar;
        this.i = str;
        this.j = q1Var;
        this.k = q1Var2;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final u0 invoke(v0 v0Var) {
        String str;
        com.amazon.aps.iva.yb0.j.f(v0Var, "$this$DisposableEffect");
        p3<l<Object, Object>> p3Var = this.j;
        p3<Object> p3Var2 = this.k;
        i iVar = this.h;
        c cVar = new c(p3Var, p3Var2, iVar);
        Object invoke = cVar.invoke();
        if (invoke != null && !iVar.a(invoke)) {
            if (invoke instanceof t) {
                t tVar = (t) invoke;
                if (tVar.b() != r1.a && tVar.b() != s3.a && tVar.b() != t2.a) {
                    str = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                } else {
                    str = "MutableState containing " + tVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                }
            } else {
                str = invoke + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
            }
            throw new IllegalArgumentException(str);
        }
        return new b(iVar.b(this.i, cVar));
    }
}

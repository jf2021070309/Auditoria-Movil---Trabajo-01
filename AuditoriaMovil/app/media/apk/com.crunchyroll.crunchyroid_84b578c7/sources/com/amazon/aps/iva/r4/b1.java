package com.amazon.aps.iva.r4;

import android.content.Context;
import java.io.File;
/* compiled from: WidgetLayout.kt */
/* loaded from: classes.dex */
public final class b1 implements com.amazon.aps.iva.z4.b<com.amazon.aps.iva.u4.e> {
    public static final b1 a = new b1();

    @Override // com.amazon.aps.iva.z4.b
    public final File a(Context context, String str) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(str, "fileKey");
        return com.amazon.aps.iva.e.w.y(context, str);
    }

    @Override // com.amazon.aps.iva.z4.b
    public final Object b(Context context, String str) {
        com.amazon.aps.iva.u4.k kVar = com.amazon.aps.iva.u4.k.a;
        a1 a1Var = new a1(context, str);
        com.amazon.aps.iva.lb0.z zVar = com.amazon.aps.iva.lb0.z.b;
        com.amazon.aps.iva.xe0.d i = com.amazon.aps.iva.e.z.i(com.amazon.aps.iva.se0.r0.b.plus(com.amazon.aps.iva.se0.i.a()));
        return new com.amazon.aps.iva.z3.q(a1Var, kVar, com.amazon.aps.iva.ee0.f1.J(new com.amazon.aps.iva.z3.e(zVar, null)), new com.amazon.aps.iva.a4.a(), i);
    }
}

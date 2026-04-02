package com.amazon.aps.iva.z4;

import android.content.Context;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.d4.f;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.se0.i;
import com.amazon.aps.iva.se0.r0;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.z3.e;
import com.amazon.aps.iva.z3.q;
import java.io.File;
/* compiled from: GlanceStateDefinition.kt */
/* loaded from: classes.dex */
public final class d implements b<com.amazon.aps.iva.d4.d> {
    public static final d a = new d();

    @Override // com.amazon.aps.iva.z4.b
    public final File a(Context context, String str) {
        j.f(context, "context");
        j.f(str, "fileKey");
        return x.a0(context, str);
    }

    @Override // com.amazon.aps.iva.z4.b
    public final Object b(Context context, String str) {
        c cVar = new c(context, str);
        z zVar = z.b;
        com.amazon.aps.iva.xe0.d i = com.amazon.aps.iva.e.z.i(r0.b.plus(i.a()));
        f fVar = f.a;
        return new com.amazon.aps.iva.d4.b(new q(new com.amazon.aps.iva.d4.c(cVar), fVar, f1.J(new e(zVar, null)), new com.amazon.aps.iva.a4.a(), i));
    }
}

package com.amazon.aps.iva.tc0;

import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.uc0.b0;
import com.amazon.aps.iva.uc0.r;
import com.amazon.aps.iva.xc0.q;
import com.amazon.aps.iva.yb0.j;
/* compiled from: ReflectJavaClassFinder.kt */
/* loaded from: classes4.dex */
public final class d implements q {
    public final ClassLoader a;

    public d(ClassLoader classLoader) {
        this.a = classLoader;
    }

    @Override // com.amazon.aps.iva.xc0.q
    public final void a(com.amazon.aps.iva.nd0.c cVar) {
        j.f(cVar, "packageFqName");
    }

    @Override // com.amazon.aps.iva.xc0.q
    public final b0 b(com.amazon.aps.iva.nd0.c cVar) {
        j.f(cVar, "fqName");
        return new b0(cVar);
    }

    @Override // com.amazon.aps.iva.xc0.q
    public final r c(q.a aVar) {
        com.amazon.aps.iva.nd0.b bVar = aVar.a;
        com.amazon.aps.iva.nd0.c h = bVar.h();
        j.e(h, "classId.packageFqName");
        String e0 = m.e0(bVar.i().b(), '.', '$');
        if (!h.d()) {
            e0 = h.b() + '.' + e0;
        }
        Class x = com.amazon.aps.iva.a60.b.x(this.a, e0);
        if (x != null) {
            return new r(x);
        }
        return null;
    }
}

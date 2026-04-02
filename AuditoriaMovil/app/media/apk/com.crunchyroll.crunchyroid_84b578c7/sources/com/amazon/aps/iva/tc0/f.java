package com.amazon.aps.iva.tc0;

import com.amazon.aps.iva.gd0.r;
import com.amazon.aps.iva.lc0.o;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.tc0.e;
import com.amazon.aps.iva.yb0.j;
import java.io.InputStream;
/* compiled from: ReflectKotlinClassFinder.kt */
/* loaded from: classes4.dex */
public final class f implements r {
    public final ClassLoader a;
    public final com.amazon.aps.iva.be0.d b = new com.amazon.aps.iva.be0.d();

    public f(ClassLoader classLoader) {
        this.a = classLoader;
    }

    @Override // com.amazon.aps.iva.gd0.r
    public final r.a.b a(com.amazon.aps.iva.ed0.g gVar, com.amazon.aps.iva.md0.e eVar) {
        e a;
        j.f(gVar, "javaClass");
        j.f(eVar, "jvmMetadataVersion");
        com.amazon.aps.iva.nd0.c c = gVar.c();
        if (c == null) {
            return null;
        }
        Class x = com.amazon.aps.iva.a60.b.x(this.a, c.b());
        if (x == null || (a = e.a.a(x)) == null) {
            return null;
        }
        return new r.a.b(a);
    }

    @Override // com.amazon.aps.iva.gd0.r
    public final r.a.b b(com.amazon.aps.iva.nd0.b bVar, com.amazon.aps.iva.md0.e eVar) {
        e a;
        j.f(bVar, "classId");
        j.f(eVar, "jvmMetadataVersion");
        String e0 = m.e0(bVar.i().b(), '.', '$');
        if (!bVar.h().d()) {
            e0 = bVar.h() + '.' + e0;
        }
        Class x = com.amazon.aps.iva.a60.b.x(this.a, e0);
        if (x != null && (a = e.a.a(x)) != null) {
            return new r.a.b(a);
        }
        return null;
    }

    @Override // com.amazon.aps.iva.ae0.v
    public final InputStream c(com.amazon.aps.iva.nd0.c cVar) {
        j.f(cVar, "packageFqName");
        if (!cVar.h(o.j)) {
            return null;
        }
        com.amazon.aps.iva.be0.a.q.getClass();
        String a = com.amazon.aps.iva.be0.a.a(cVar);
        this.b.getClass();
        return com.amazon.aps.iva.be0.d.a(a);
    }
}

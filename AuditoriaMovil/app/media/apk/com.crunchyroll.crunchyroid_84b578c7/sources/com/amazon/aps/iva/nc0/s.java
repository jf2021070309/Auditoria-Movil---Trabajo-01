package com.amazon.aps.iva.nc0;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.lb0.i0;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.lc0.o;
import com.amazon.aps.iva.pc0.h;
import com.amazon.aps.iva.sd0.x;
import java.util.List;
/* compiled from: JvmBuiltInsCustomizer.kt */
/* loaded from: classes4.dex */
public final class s extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.pc0.h> {
    public final /* synthetic */ k h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(k kVar) {
        super(0);
        this.h = kVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.pc0.h invoke() {
        com.amazon.aps.iva.lc0.k j = this.h.a.j();
        com.amazon.aps.iva.nd0.f fVar = com.amazon.aps.iva.pc0.g.a;
        com.amazon.aps.iva.yb0.j.f(j, "<this>");
        com.amazon.aps.iva.pc0.j jVar = new com.amazon.aps.iva.pc0.j(j, o.a.o, i0.U(new com.amazon.aps.iva.kb0.j(com.amazon.aps.iva.pc0.g.d, new x("")), new com.amazon.aps.iva.kb0.j(com.amazon.aps.iva.pc0.g.e, new com.amazon.aps.iva.sd0.b(z.b, new com.amazon.aps.iva.pc0.f(j)))));
        List J = f1.J(new com.amazon.aps.iva.pc0.j(j, o.a.m, i0.U(new com.amazon.aps.iva.kb0.j(com.amazon.aps.iva.pc0.g.a, new x("This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version")), new com.amazon.aps.iva.kb0.j(com.amazon.aps.iva.pc0.g.b, new com.amazon.aps.iva.sd0.a(jVar)), new com.amazon.aps.iva.kb0.j(com.amazon.aps.iva.pc0.g.c, new com.amazon.aps.iva.sd0.j(com.amazon.aps.iva.nd0.b.l(o.a.n), com.amazon.aps.iva.nd0.f.h("WARNING"))))));
        if (J.isEmpty()) {
            return h.a.a;
        }
        return new com.amazon.aps.iva.pc0.i(J);
    }
}

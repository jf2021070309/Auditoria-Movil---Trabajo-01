package com.amazon.aps.iva.k0;

import com.amazon.aps.iva.c2.a0;
import com.amazon.aps.iva.f1.z;
import com.amazon.aps.iva.h2.k;
import com.amazon.aps.iva.s1.c0;
import com.amazon.aps.iva.s1.e0;
import com.amazon.aps.iva.s1.f0;
import com.amazon.aps.iva.u1.r;
import com.amazon.aps.iva.u1.x;
import java.util.List;
/* compiled from: SelectableTextAnnotatedStringNode.kt */
/* loaded from: classes.dex */
public final class f extends com.amazon.aps.iva.u1.j implements x, com.amazon.aps.iva.u1.o, r {
    public final i q;
    public final o r;

    public f(com.amazon.aps.iva.c2.b bVar, a0 a0Var, k.a aVar, com.amazon.aps.iva.xb0.l lVar, int i, boolean z, int i2, int i3, List list, com.amazon.aps.iva.xb0.l lVar2, i iVar, z zVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "text");
        com.amazon.aps.iva.yb0.j.f(a0Var, "style");
        com.amazon.aps.iva.yb0.j.f(aVar, "fontFamilyResolver");
        this.q = iVar;
        o oVar = new o(bVar, a0Var, aVar, lVar, i, z, i2, i3, list, lVar2, iVar, zVar);
        t1(oVar);
        this.r = oVar;
        if (iVar != null) {
            return;
        }
        throw new IllegalArgumentException("Do not use SelectionCapableStaticTextModifier unless selectionController != null".toString());
    }

    @Override // com.amazon.aps.iva.u1.x
    public final int b(com.amazon.aps.iva.s1.m mVar, com.amazon.aps.iva.s1.l lVar, int i) {
        com.amazon.aps.iva.yb0.j.f(mVar, "<this>");
        o oVar = this.r;
        oVar.getClass();
        return oVar.b(mVar, lVar, i);
    }

    @Override // com.amazon.aps.iva.u1.x
    public final int c(com.amazon.aps.iva.s1.m mVar, com.amazon.aps.iva.s1.l lVar, int i) {
        com.amazon.aps.iva.yb0.j.f(mVar, "<this>");
        o oVar = this.r;
        oVar.getClass();
        return oVar.c(mVar, lVar, i);
    }

    @Override // com.amazon.aps.iva.u1.x
    public final int d(com.amazon.aps.iva.s1.m mVar, com.amazon.aps.iva.s1.l lVar, int i) {
        com.amazon.aps.iva.yb0.j.f(mVar, "<this>");
        o oVar = this.r;
        oVar.getClass();
        return oVar.d(mVar, lVar, i);
    }

    @Override // com.amazon.aps.iva.u1.x
    public final int e(com.amazon.aps.iva.s1.m mVar, com.amazon.aps.iva.s1.l lVar, int i) {
        com.amazon.aps.iva.yb0.j.f(mVar, "<this>");
        o oVar = this.r;
        oVar.getClass();
        return oVar.e(mVar, lVar, i);
    }

    @Override // com.amazon.aps.iva.u1.x
    public final e0 f(f0 f0Var, c0 c0Var, long j) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "$this$measure");
        o oVar = this.r;
        oVar.getClass();
        return oVar.f(f0Var, c0Var, j);
    }

    @Override // com.amazon.aps.iva.u1.o
    public final void w(com.amazon.aps.iva.h1.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
        o oVar = this.r;
        oVar.getClass();
        oVar.w(cVar);
    }

    @Override // com.amazon.aps.iva.u1.r
    public final void z(androidx.compose.ui.node.o oVar) {
        i iVar = this.q;
        if (iVar != null) {
            iVar.c = m.a(iVar.c, oVar, null, 2);
        }
    }
}

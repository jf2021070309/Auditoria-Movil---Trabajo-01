package androidx.compose.foundation;

import com.amazon.aps.iva.a0.r;
import com.amazon.aps.iva.a0.v;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.u1.f0;
import kotlin.Metadata;
/* compiled from: Clickable.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/CombinedClickableElement;", "Lcom/amazon/aps/iva/u1/f0;", "Landroidx/compose/foundation/i;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class CombinedClickableElement extends f0<i> {
    public final com.amazon.aps.iva.c0.l c;
    public final boolean d;
    public final String e;
    public final com.amazon.aps.iva.a2.i f;
    public final com.amazon.aps.iva.xb0.a<q> g;
    public final String h;
    public final com.amazon.aps.iva.xb0.a<q> i;
    public final com.amazon.aps.iva.xb0.a<q> j;

    public CombinedClickableElement() {
        throw null;
    }

    public CombinedClickableElement(com.amazon.aps.iva.c0.l lVar, boolean z, String str, com.amazon.aps.iva.a2.i iVar, com.amazon.aps.iva.xb0.a aVar, String str2, com.amazon.aps.iva.xb0.a aVar2, com.amazon.aps.iva.xb0.a aVar3) {
        this.c = lVar;
        this.d = z;
        this.e = str;
        this.f = iVar;
        this.g = aVar;
        this.h = str2;
        this.i = aVar2;
        this.j = aVar3;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!com.amazon.aps.iva.yb0.j.a(CombinedClickableElement.class, cls)) {
            return false;
        }
        com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type androidx.compose.foundation.CombinedClickableElement");
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.c, combinedClickableElement.c) && this.d == combinedClickableElement.d && com.amazon.aps.iva.yb0.j.a(this.e, combinedClickableElement.e) && com.amazon.aps.iva.yb0.j.a(this.f, combinedClickableElement.f) && com.amazon.aps.iva.yb0.j.a(this.g, combinedClickableElement.g) && com.amazon.aps.iva.yb0.j.a(this.h, combinedClickableElement.h) && com.amazon.aps.iva.yb0.j.a(this.i, combinedClickableElement.i) && com.amazon.aps.iva.yb0.j.a(this.j, combinedClickableElement.j)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int b = r.b(this.d, this.c.hashCode() * 31, 31);
        int i5 = 0;
        String str = this.e;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i6 = (b + i) * 31;
        com.amazon.aps.iva.a2.i iVar = this.f;
        if (iVar != null) {
            i2 = Integer.hashCode(iVar.a);
        } else {
            i2 = 0;
        }
        int hashCode = (this.g.hashCode() + ((i6 + i2) * 31)) * 31;
        String str2 = this.h;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (hashCode + i3) * 31;
        com.amazon.aps.iva.xb0.a<q> aVar = this.i;
        if (aVar != null) {
            i4 = aVar.hashCode();
        } else {
            i4 = 0;
        }
        int i8 = (i7 + i4) * 31;
        com.amazon.aps.iva.xb0.a<q> aVar2 = this.j;
        if (aVar2 != null) {
            i5 = aVar2.hashCode();
        }
        return i8 + i5;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final i l() {
        return new i(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final void p(i iVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        i iVar2 = iVar;
        com.amazon.aps.iva.yb0.j.f(iVar2, "node");
        com.amazon.aps.iva.c0.l lVar = this.c;
        com.amazon.aps.iva.yb0.j.f(lVar, "interactionSource");
        com.amazon.aps.iva.xb0.a<q> aVar = this.g;
        com.amazon.aps.iva.yb0.j.f(aVar, "onClick");
        boolean z7 = true;
        boolean z8 = false;
        if (iVar2.u == null) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.xb0.a<q> aVar2 = this.i;
        if (aVar2 == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            iVar2.u1();
        }
        iVar2.u = aVar2;
        boolean z9 = this.d;
        iVar2.w1(lVar, z9, aVar);
        v vVar = iVar2.v;
        vVar.o = z9;
        vVar.p = this.e;
        vVar.q = this.f;
        vVar.r = aVar;
        vVar.s = this.h;
        vVar.t = aVar2;
        j jVar = iVar2.w;
        jVar.getClass();
        jVar.s = aVar;
        jVar.r = lVar;
        if (jVar.q != z9) {
            jVar.q = z9;
            z3 = true;
        } else {
            z3 = false;
        }
        if (jVar.w == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (aVar2 == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z4 != z5) {
            z3 = true;
        }
        jVar.w = aVar2;
        if (jVar.x == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        com.amazon.aps.iva.xb0.a<q> aVar3 = this.j;
        if (aVar3 == null) {
            z8 = true;
        }
        if (z6 == z8) {
            z7 = z3;
        }
        jVar.x = aVar3;
        if (z7) {
            jVar.v.r0();
        }
    }
}

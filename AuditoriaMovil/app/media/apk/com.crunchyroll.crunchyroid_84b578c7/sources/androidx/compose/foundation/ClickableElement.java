package androidx.compose.foundation;

import com.amazon.aps.iva.a0.r;
import com.amazon.aps.iva.a0.v;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.u1.f0;
import kotlin.Metadata;
/* compiled from: Clickable.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ClickableElement;", "Lcom/amazon/aps/iva/u1/f0;", "Landroidx/compose/foundation/g;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ClickableElement extends f0<g> {
    public final com.amazon.aps.iva.c0.l c;
    public final boolean d;
    public final String e;
    public final com.amazon.aps.iva.a2.i f;
    public final com.amazon.aps.iva.xb0.a<q> g;

    public ClickableElement() {
        throw null;
    }

    public ClickableElement(com.amazon.aps.iva.c0.l lVar, boolean z, String str, com.amazon.aps.iva.a2.i iVar, com.amazon.aps.iva.xb0.a aVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "interactionSource");
        com.amazon.aps.iva.yb0.j.f(aVar, "onClick");
        this.c = lVar;
        this.d = z;
        this.e = str;
        this.f = iVar;
        this.g = aVar;
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
        if (!com.amazon.aps.iva.yb0.j.a(ClickableElement.class, cls)) {
            return false;
        }
        com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type androidx.compose.foundation.ClickableElement");
        ClickableElement clickableElement = (ClickableElement) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.c, clickableElement.c) && this.d == clickableElement.d && com.amazon.aps.iva.yb0.j.a(this.e, clickableElement.e) && com.amazon.aps.iva.yb0.j.a(this.f, clickableElement.f) && com.amazon.aps.iva.yb0.j.a(this.g, clickableElement.g)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final int hashCode() {
        int i;
        int b = r.b(this.d, this.c.hashCode() * 31, 31);
        int i2 = 0;
        String str = this.e;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (b + i) * 31;
        com.amazon.aps.iva.a2.i iVar = this.f;
        if (iVar != null) {
            i2 = Integer.hashCode(iVar.a);
        }
        return this.g.hashCode() + ((i3 + i2) * 31);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final g l() {
        return new g(this.c, this.d, this.e, this.f, this.g);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final void p(g gVar) {
        g gVar2 = gVar;
        com.amazon.aps.iva.yb0.j.f(gVar2, "node");
        com.amazon.aps.iva.c0.l lVar = this.c;
        com.amazon.aps.iva.yb0.j.f(lVar, "interactionSource");
        com.amazon.aps.iva.xb0.a<q> aVar = this.g;
        com.amazon.aps.iva.yb0.j.f(aVar, "onClick");
        boolean z = this.d;
        gVar2.w1(lVar, z, aVar);
        v vVar = gVar2.u;
        vVar.o = z;
        vVar.p = this.e;
        vVar.q = this.f;
        vVar.r = aVar;
        vVar.s = null;
        vVar.t = null;
        h hVar = gVar2.v;
        hVar.getClass();
        hVar.q = z;
        hVar.s = aVar;
        hVar.r = lVar;
    }
}

package androidx.compose.foundation;

import com.amazon.aps.iva.a0.o0;
import com.amazon.aps.iva.u1.f0;
import kotlin.Metadata;
/* compiled from: Hoverable.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/HoverableElement;", "Lcom/amazon/aps/iva/u1/f0;", "Lcom/amazon/aps/iva/a0/o0;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class HoverableElement extends f0<o0> {
    public final com.amazon.aps.iva.c0.l c;

    public HoverableElement(com.amazon.aps.iva.c0.l lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "interactionSource");
        this.c = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof HoverableElement) && com.amazon.aps.iva.yb0.j.a(((HoverableElement) obj).c, this.c)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final int hashCode() {
        return this.c.hashCode() * 31;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final o0 l() {
        return new o0(this.c);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final void p(o0 o0Var) {
        o0 o0Var2 = o0Var;
        com.amazon.aps.iva.yb0.j.f(o0Var2, "node");
        com.amazon.aps.iva.c0.l lVar = this.c;
        com.amazon.aps.iva.yb0.j.f(lVar, "interactionSource");
        if (!com.amazon.aps.iva.yb0.j.a(o0Var2.o, lVar)) {
            o0Var2.v1();
            o0Var2.o = lVar;
        }
    }
}

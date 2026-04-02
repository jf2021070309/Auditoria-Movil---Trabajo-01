package androidx.compose.foundation;

import com.amazon.aps.iva.a0.m0;
import com.amazon.aps.iva.b0.c;
import com.amazon.aps.iva.s1.q;
import com.amazon.aps.iva.u1.f0;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FocusedBounds.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/FocusedBoundsObserverElement;", "Lcom/amazon/aps/iva/u1/f0;", "Lcom/amazon/aps/iva/a0/m0;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FocusedBoundsObserverElement extends f0<m0> {
    public final com.amazon.aps.iva.xb0.l<q, com.amazon.aps.iva.kb0.q> c;

    public FocusedBoundsObserverElement(c.d dVar) {
        this.c = dVar;
    }

    public final boolean equals(Object obj) {
        FocusedBoundsObserverElement focusedBoundsObserverElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusedBoundsObserverElement) {
            focusedBoundsObserverElement = (FocusedBoundsObserverElement) obj;
        } else {
            focusedBoundsObserverElement = null;
        }
        if (focusedBoundsObserverElement == null) {
            return false;
        }
        return com.amazon.aps.iva.yb0.j.a(this.c, focusedBoundsObserverElement.c);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final m0 l() {
        return new m0(this.c);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final void p(m0 m0Var) {
        m0 m0Var2 = m0Var;
        com.amazon.aps.iva.yb0.j.f(m0Var2, "node");
        com.amazon.aps.iva.xb0.l<q, com.amazon.aps.iva.kb0.q> lVar = this.c;
        com.amazon.aps.iva.yb0.j.f(lVar, "<set-?>");
        m0Var2.o = lVar;
    }
}

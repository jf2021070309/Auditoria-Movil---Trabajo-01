package androidx.compose.foundation;

import com.amazon.aps.iva.a0.c0;
import com.amazon.aps.iva.a0.g0;
import com.amazon.aps.iva.u1.f0;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Focusable.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/FocusableElement;", "Lcom/amazon/aps/iva/u1/f0;", "Lcom/amazon/aps/iva/a0/g0;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FocusableElement extends f0<g0> {
    public final com.amazon.aps.iva.c0.l c;

    public FocusableElement(com.amazon.aps.iva.c0.l lVar) {
        this.c = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FocusableElement)) {
            return false;
        }
        if (com.amazon.aps.iva.yb0.j.a(this.c, ((FocusableElement) obj).c)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final int hashCode() {
        com.amazon.aps.iva.c0.l lVar = this.c;
        if (lVar != null) {
            return lVar.hashCode();
        }
        return 0;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final g0 l() {
        return new g0(this.c);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final void p(g0 g0Var) {
        com.amazon.aps.iva.c0.d dVar;
        g0 g0Var2 = g0Var;
        com.amazon.aps.iva.yb0.j.f(g0Var2, "node");
        c0 c0Var = g0Var2.s;
        com.amazon.aps.iva.c0.l lVar = c0Var.o;
        com.amazon.aps.iva.c0.l lVar2 = this.c;
        if (!com.amazon.aps.iva.yb0.j.a(lVar, lVar2)) {
            com.amazon.aps.iva.c0.l lVar3 = c0Var.o;
            if (lVar3 != null && (dVar = c0Var.p) != null) {
                lVar3.a(new com.amazon.aps.iva.c0.e(dVar));
            }
            c0Var.p = null;
            c0Var.o = lVar2;
        }
    }
}

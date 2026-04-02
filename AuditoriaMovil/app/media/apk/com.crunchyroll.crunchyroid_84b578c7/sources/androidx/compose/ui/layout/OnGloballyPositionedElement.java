package androidx.compose.ui.layout;

import com.amazon.aps.iva.s1.n0;
import com.amazon.aps.iva.s1.q;
import com.amazon.aps.iva.u1.f0;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnGloballyPositionedModifier.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/OnGloballyPositionedElement;", "Lcom/amazon/aps/iva/u1/f0;", "Lcom/amazon/aps/iva/s1/n0;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class OnGloballyPositionedElement extends f0<n0> {
    public final l<q, com.amazon.aps.iva.kb0.q> c;

    /* JADX WARN: Multi-variable type inference failed */
    public OnGloballyPositionedElement(l<? super q, com.amazon.aps.iva.kb0.q> lVar) {
        j.f(lVar, "onGloballyPositioned");
        this.c = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnGloballyPositionedElement)) {
            return false;
        }
        return j.a(this.c, ((OnGloballyPositionedElement) obj).c);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final n0 l() {
        return new n0(this.c);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final void p(n0 n0Var) {
        n0 n0Var2 = n0Var;
        j.f(n0Var2, "node");
        l<q, com.amazon.aps.iva.kb0.q> lVar = this.c;
        j.f(lVar, "<set-?>");
        n0Var2.o = lVar;
    }
}

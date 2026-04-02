package androidx.compose.ui.focus;

import com.amazon.aps.iva.a0.d0;
import com.amazon.aps.iva.d1.n;
import com.amazon.aps.iva.d1.q;
import com.amazon.aps.iva.u1.f0;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: FocusProperties.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusPropertiesElement;", "Lcom/amazon/aps/iva/u1/f0;", "Lcom/amazon/aps/iva/d1/q;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class FocusPropertiesElement extends f0<q> {
    public final l<n, com.amazon.aps.iva.kb0.q> c;

    public FocusPropertiesElement(d0 d0Var) {
        j.f(d0Var, "scope");
        this.c = d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof FocusPropertiesElement) && j.a(this.c, ((FocusPropertiesElement) obj).c)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final q l() {
        return new q(this.c);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final void p(q qVar) {
        q qVar2 = qVar;
        j.f(qVar2, "node");
        l<n, com.amazon.aps.iva.kb0.q> lVar = this.c;
        j.f(lVar, "<set-?>");
        qVar2.o = lVar;
    }

    public final String toString() {
        return "FocusPropertiesElement(scope=" + this.c + ')';
    }
}

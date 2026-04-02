package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.d;
import com.amazon.aps.iva.d0.o1;
import com.amazon.aps.iva.d0.q1;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.u1.f0;
import com.amazon.aps.iva.v1.v1;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Padding.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesElement;", "Lcom/amazon/aps/iva/u1/f0;", "Lcom/amazon/aps/iva/d0/q1;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PaddingValuesElement extends f0<q1> {
    public final o1 c;
    public final l<v1, q> d;

    public PaddingValuesElement(o1 o1Var, d.C0014d c0014d) {
        j.f(o1Var, "paddingValues");
        this.c = o1Var;
        this.d = c0014d;
    }

    public final boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement;
        if (obj instanceof PaddingValuesElement) {
            paddingValuesElement = (PaddingValuesElement) obj;
        } else {
            paddingValuesElement = null;
        }
        if (paddingValuesElement == null) {
            return false;
        }
        return j.a(this.c, paddingValuesElement.c);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final q1 l() {
        return new q1(this.c);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final void p(q1 q1Var) {
        q1 q1Var2 = q1Var;
        j.f(q1Var2, "node");
        o1 o1Var = this.c;
        j.f(o1Var, "<set-?>");
        q1Var2.o = o1Var;
    }
}

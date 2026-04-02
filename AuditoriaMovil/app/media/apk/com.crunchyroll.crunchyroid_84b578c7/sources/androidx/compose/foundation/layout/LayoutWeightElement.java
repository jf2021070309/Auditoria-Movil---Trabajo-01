package androidx.compose.foundation.layout;

import com.amazon.aps.iva.d0.e1;
import com.amazon.aps.iva.u1.f0;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: RowColumnImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/LayoutWeightElement;", "Lcom/amazon/aps/iva/u1/f0;", "Lcom/amazon/aps/iva/d0/e1;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LayoutWeightElement extends f0<e1> {
    public final float c = 1.0f;
    public final boolean d;

    public LayoutWeightElement(boolean z) {
        this.d = z;
    }

    public final boolean equals(Object obj) {
        LayoutWeightElement layoutWeightElement;
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj instanceof LayoutWeightElement) {
            layoutWeightElement = (LayoutWeightElement) obj;
        } else {
            layoutWeightElement = null;
        }
        if (layoutWeightElement == null) {
            return false;
        }
        if (this.c == layoutWeightElement.c) {
            z = true;
        } else {
            z = false;
        }
        if (z && this.d == layoutWeightElement.d) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final int hashCode() {
        return Boolean.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final e1 l() {
        return new e1(this.c, this.d);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final void p(e1 e1Var) {
        e1 e1Var2 = e1Var;
        j.f(e1Var2, "node");
        e1Var2.o = this.c;
        e1Var2.p = this.d;
    }
}

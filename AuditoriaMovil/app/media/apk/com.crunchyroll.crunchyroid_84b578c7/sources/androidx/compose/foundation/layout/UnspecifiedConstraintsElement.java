package androidx.compose.foundation.layout;

import com.amazon.aps.iva.d0.d2;
import com.amazon.aps.iva.u1.f0;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: Size.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;", "Lcom/amazon/aps/iva/u1/f0;", "Lcom/amazon/aps/iva/d0/d2;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class UnspecifiedConstraintsElement extends f0<d2> {
    public final float c;
    public final float d;

    public UnspecifiedConstraintsElement(float f, float f2) {
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        if (!com.amazon.aps.iva.o2.e.a(this.c, unspecifiedConstraintsElement.c) || !com.amazon.aps.iva.o2.e.a(this.d, unspecifiedConstraintsElement.d)) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final d2 l() {
        return new d2(this.c, this.d);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final void p(d2 d2Var) {
        d2 d2Var2 = d2Var;
        j.f(d2Var2, "node");
        d2Var2.o = this.c;
        d2Var2.p = this.d;
    }
}

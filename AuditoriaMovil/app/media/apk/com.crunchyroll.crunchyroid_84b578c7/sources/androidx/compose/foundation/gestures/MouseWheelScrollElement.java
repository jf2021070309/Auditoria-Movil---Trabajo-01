package androidx.compose.foundation.gestures;

import com.amazon.aps.iva.b0.e0;
import com.amazon.aps.iva.b0.j0;
import com.amazon.aps.iva.b0.v0;
import com.amazon.aps.iva.o0.p3;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.u1.f0;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: Scrollable.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/MouseWheelScrollElement;", "Lcom/amazon/aps/iva/u1/f0;", "Lcom/amazon/aps/iva/b0/e0;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class MouseWheelScrollElement extends f0<e0> {
    public final p3<v0> c;
    public final j0 d;

    public MouseWheelScrollElement(q1 q1Var) {
        i iVar = i.b;
        this.c = q1Var;
        this.d = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MouseWheelScrollElement)) {
            return false;
        }
        MouseWheelScrollElement mouseWheelScrollElement = (MouseWheelScrollElement) obj;
        if (j.a(this.c, mouseWheelScrollElement.c) && j.a(this.d, mouseWheelScrollElement.d)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final e0 l() {
        return new e0(this.c, this.d);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final void p(e0 e0Var) {
        e0 e0Var2 = e0Var;
        j.f(e0Var2, "node");
        p3<v0> p3Var = this.c;
        j.f(p3Var, "<set-?>");
        e0Var2.q = p3Var;
        j0 j0Var = this.d;
        j.f(j0Var, "<set-?>");
        e0Var2.r = j0Var;
    }
}

package androidx.compose.foundation;

import com.amazon.aps.iva.a0.c2;
import com.amazon.aps.iva.a0.d2;
import com.amazon.aps.iva.a0.r;
import com.amazon.aps.iva.u1.f0;
import kotlin.Metadata;
/* compiled from: Scroll.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ScrollingLayoutElement;", "Lcom/amazon/aps/iva/u1/f0;", "Lcom/amazon/aps/iva/a0/d2;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ScrollingLayoutElement extends f0<d2> {
    public final c2 c;
    public final boolean d;
    public final boolean e;

    public ScrollingLayoutElement(c2 c2Var, boolean z, boolean z2) {
        com.amazon.aps.iva.yb0.j.f(c2Var, "scrollState");
        this.c = c2Var;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        if (!com.amazon.aps.iva.yb0.j.a(this.c, scrollingLayoutElement.c) || this.d != scrollingLayoutElement.d || this.e != scrollingLayoutElement.e) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final int hashCode() {
        return Boolean.hashCode(this.e) + r.b(this.d, this.c.hashCode() * 31, 31);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final d2 l() {
        return new d2(this.c, this.d, this.e);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final void p(d2 d2Var) {
        d2 d2Var2 = d2Var;
        com.amazon.aps.iva.yb0.j.f(d2Var2, "node");
        c2 c2Var = this.c;
        com.amazon.aps.iva.yb0.j.f(c2Var, "<set-?>");
        d2Var2.o = c2Var;
        d2Var2.p = this.d;
        d2Var2.q = this.e;
    }
}

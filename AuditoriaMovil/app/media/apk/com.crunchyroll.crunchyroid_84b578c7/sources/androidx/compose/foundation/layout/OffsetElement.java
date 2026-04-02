package androidx.compose.foundation.layout;

import com.amazon.aps.iva.d0.j1;
import com.amazon.aps.iva.d0.l1;
import com.amazon.aps.iva.e4.t0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.u1.f0;
import com.amazon.aps.iva.v1.v1;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: Offset.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/OffsetElement;", "Lcom/amazon/aps/iva/u1/f0;", "Lcom/amazon/aps/iva/d0/l1;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class OffsetElement extends f0<l1> {
    public final float c;
    public final float d;
    public final boolean e;
    public final l<v1, q> f;

    public OffsetElement() {
        throw null;
    }

    public OffsetElement(float f, float f2, j1 j1Var) {
        this.c = f;
        this.d = f2;
        this.e = true;
        this.f = j1Var;
    }

    public final boolean equals(Object obj) {
        OffsetElement offsetElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetElement) {
            offsetElement = (OffsetElement) obj;
        } else {
            offsetElement = null;
        }
        if (offsetElement == null) {
            return false;
        }
        if (com.amazon.aps.iva.o2.e.a(this.c, offsetElement.c) && com.amazon.aps.iva.o2.e.a(this.d, offsetElement.d) && this.e == offsetElement.e) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final int hashCode() {
        return Boolean.hashCode(this.e) + t0.b(this.d, Float.hashCode(this.c) * 31, 31);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final l1 l() {
        return new l1(this.c, this.d, this.e);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final void p(l1 l1Var) {
        l1 l1Var2 = l1Var;
        j.f(l1Var2, "node");
        l1Var2.o = this.c;
        l1Var2.p = this.d;
        l1Var2.q = this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OffsetModifierElement(x=");
        sb.append((Object) com.amazon.aps.iva.o2.e.b(this.c));
        sb.append(", y=");
        sb.append((Object) com.amazon.aps.iva.o2.e.b(this.d));
        sb.append(", rtlAware=");
        return defpackage.a.b(sb, this.e, ')');
    }
}

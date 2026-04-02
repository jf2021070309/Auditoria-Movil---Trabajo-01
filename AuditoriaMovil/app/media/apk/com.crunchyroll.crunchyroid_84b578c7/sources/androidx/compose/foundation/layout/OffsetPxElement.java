package androidx.compose.foundation.layout;

import com.amazon.aps.iva.d0.k1;
import com.amazon.aps.iva.d0.m1;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o2.h;
import com.amazon.aps.iva.u1.f0;
import com.amazon.aps.iva.v1.v1;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Offset.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/OffsetPxElement;", "Lcom/amazon/aps/iva/u1/f0;", "Lcom/amazon/aps/iva/d0/m1;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class OffsetPxElement extends f0<m1> {
    public final l<com.amazon.aps.iva.o2.c, h> c;
    public final boolean d = true;
    public final l<v1, q> e;

    public OffsetPxElement(com.amazon.aps.iva.m0.m1 m1Var, k1 k1Var) {
        this.c = m1Var;
        this.e = k1Var;
    }

    public final boolean equals(Object obj) {
        OffsetPxElement offsetPxElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetPxElement) {
            offsetPxElement = (OffsetPxElement) obj;
        } else {
            offsetPxElement = null;
        }
        if (offsetPxElement == null) {
            return false;
        }
        if (j.a(this.c, offsetPxElement.c) && this.d == offsetPxElement.d) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final int hashCode() {
        return Boolean.hashCode(this.d) + (this.c.hashCode() * 31);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final m1 l() {
        return new m1(this.c, this.d);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final void p(m1 m1Var) {
        m1 m1Var2 = m1Var;
        j.f(m1Var2, "node");
        l<com.amazon.aps.iva.o2.c, h> lVar = this.c;
        j.f(lVar, "<set-?>");
        m1Var2.o = lVar;
        m1Var2.p = this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OffsetPxModifier(offset=");
        sb.append(this.c);
        sb.append(", rtlAware=");
        return defpackage.a.b(sb, this.d, ')');
    }
}

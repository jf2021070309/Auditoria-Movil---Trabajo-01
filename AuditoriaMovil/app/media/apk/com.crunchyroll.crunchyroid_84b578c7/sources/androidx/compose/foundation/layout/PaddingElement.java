package androidx.compose.foundation.layout;

import com.amazon.aps.iva.d0.n1;
import com.amazon.aps.iva.e4.t0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.u1.f0;
import com.amazon.aps.iva.v1.v1;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Padding.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/PaddingElement;", "Lcom/amazon/aps/iva/u1/f0;", "Lcom/amazon/aps/iva/d0/n1;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PaddingElement extends f0<n1> {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final boolean g;
    public final l<v1, q> h;

    public PaddingElement() {
        throw null;
    }

    public PaddingElement(float f, float f2, float f3, float f4, l lVar) {
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        boolean z = true;
        this.g = true;
        this.h = lVar;
        if ((f < 0.0f && !com.amazon.aps.iva.o2.e.a(f, Float.NaN)) || ((f2 < 0.0f && !com.amazon.aps.iva.o2.e.a(f2, Float.NaN)) || ((f3 < 0.0f && !com.amazon.aps.iva.o2.e.a(f3, Float.NaN)) || (f4 < 0.0f && !com.amazon.aps.iva.o2.e.a(f4, Float.NaN))))) {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException("Padding must be non-negative".toString());
        }
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement;
        if (obj instanceof PaddingElement) {
            paddingElement = (PaddingElement) obj;
        } else {
            paddingElement = null;
        }
        if (paddingElement == null || !com.amazon.aps.iva.o2.e.a(this.c, paddingElement.c) || !com.amazon.aps.iva.o2.e.a(this.d, paddingElement.d) || !com.amazon.aps.iva.o2.e.a(this.e, paddingElement.e) || !com.amazon.aps.iva.o2.e.a(this.f, paddingElement.f) || this.g != paddingElement.g) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final int hashCode() {
        return Boolean.hashCode(this.g) + t0.b(this.f, t0.b(this.e, t0.b(this.d, Float.hashCode(this.c) * 31, 31), 31), 31);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final n1 l() {
        return new n1(this.c, this.d, this.e, this.f, this.g);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final void p(n1 n1Var) {
        n1 n1Var2 = n1Var;
        j.f(n1Var2, "node");
        n1Var2.o = this.c;
        n1Var2.p = this.d;
        n1Var2.q = this.e;
        n1Var2.r = this.f;
        n1Var2.s = this.g;
    }
}

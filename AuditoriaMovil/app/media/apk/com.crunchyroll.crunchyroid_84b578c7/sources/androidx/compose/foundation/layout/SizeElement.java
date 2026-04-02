package androidx.compose.foundation.layout;

import com.amazon.aps.iva.d0.a2;
import com.amazon.aps.iva.e4.t0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.u1.f0;
import com.amazon.aps.iva.v1.t1;
import com.amazon.aps.iva.v1.v1;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Size.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/SizeElement;", "Lcom/amazon/aps/iva/u1/f0;", "Lcom/amazon/aps/iva/d0/a2;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SizeElement extends f0<a2> {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final boolean g;
    public final l<v1, q> h;

    public SizeElement() {
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SizeElement(float f, float f2, float f3, float f4, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, true);
        t1.a aVar = t1.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        if (com.amazon.aps.iva.o2.e.a(this.c, sizeElement.c) && com.amazon.aps.iva.o2.e.a(this.d, sizeElement.d) && com.amazon.aps.iva.o2.e.a(this.e, sizeElement.e) && com.amazon.aps.iva.o2.e.a(this.f, sizeElement.f) && this.g == sizeElement.g) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final int hashCode() {
        return Boolean.hashCode(this.g) + t0.b(this.f, t0.b(this.e, t0.b(this.d, Float.hashCode(this.c) * 31, 31), 31), 31);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final a2 l() {
        return new a2(this.c, this.d, this.e, this.f, this.g);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final void p(a2 a2Var) {
        a2 a2Var2 = a2Var;
        j.f(a2Var2, "node");
        a2Var2.o = this.c;
        a2Var2.p = this.d;
        a2Var2.q = this.e;
        a2Var2.r = this.f;
        a2Var2.s = this.g;
    }

    public SizeElement(float f, float f2, float f3, float f4, boolean z) {
        t1.a aVar = t1.a;
        j.f(aVar, "inspectorInfo");
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = z;
        this.h = aVar;
    }
}

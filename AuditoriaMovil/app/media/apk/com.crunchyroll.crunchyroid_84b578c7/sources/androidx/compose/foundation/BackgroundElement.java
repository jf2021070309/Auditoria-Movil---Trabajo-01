package androidx.compose.foundation;

import com.amazon.aps.iva.e4.t0;
import com.amazon.aps.iva.f1.j0;
import com.amazon.aps.iva.f1.s;
import com.amazon.aps.iva.f1.u0;
import com.amazon.aps.iva.f1.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.u1.f0;
import com.amazon.aps.iva.v1.t1;
import com.amazon.aps.iva.v1.v1;
import kotlin.Metadata;
/* compiled from: Background.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/BackgroundElement;", "Lcom/amazon/aps/iva/u1/f0;", "Lcom/amazon/aps/iva/a0/g;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class BackgroundElement extends f0<com.amazon.aps.iva.a0.g> {
    public final long c;
    public final s d;
    public final float e;
    public final u0 f;
    public final com.amazon.aps.iva.xb0.l<v1, q> g;

    public BackgroundElement() {
        throw null;
    }

    public BackgroundElement(long j, j0 j0Var, float f, u0 u0Var, int i) {
        t1.a aVar = t1.a;
        j = (i & 1) != 0 ? x.g : j;
        j0Var = (i & 2) != 0 ? null : j0Var;
        com.amazon.aps.iva.yb0.j.f(u0Var, "shape");
        com.amazon.aps.iva.yb0.j.f(aVar, "inspectorInfo");
        this.c = j;
        this.d = j0Var;
        this.e = f;
        this.f = u0Var;
        this.g = aVar;
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement;
        boolean z;
        if (obj instanceof BackgroundElement) {
            backgroundElement = (BackgroundElement) obj;
        } else {
            backgroundElement = null;
        }
        if (backgroundElement == null || !x.c(this.c, backgroundElement.c) || !com.amazon.aps.iva.yb0.j.a(this.d, backgroundElement.d)) {
            return false;
        }
        if (this.e == backgroundElement.e) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !com.amazon.aps.iva.yb0.j.a(this.f, backgroundElement.f)) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final int hashCode() {
        int i;
        int i2 = x.h;
        int hashCode = Long.hashCode(this.c) * 31;
        s sVar = this.d;
        if (sVar != null) {
            i = sVar.hashCode();
        } else {
            i = 0;
        }
        return this.f.hashCode() + t0.b(this.e, (hashCode + i) * 31, 31);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final com.amazon.aps.iva.a0.g l() {
        return new com.amazon.aps.iva.a0.g(this.c, this.d, this.e, this.f);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final void p(com.amazon.aps.iva.a0.g gVar) {
        com.amazon.aps.iva.a0.g gVar2 = gVar;
        com.amazon.aps.iva.yb0.j.f(gVar2, "node");
        gVar2.o = this.c;
        gVar2.p = this.d;
        gVar2.q = this.e;
        u0 u0Var = this.f;
        com.amazon.aps.iva.yb0.j.f(u0Var, "<set-?>");
        gVar2.r = u0Var;
    }
}

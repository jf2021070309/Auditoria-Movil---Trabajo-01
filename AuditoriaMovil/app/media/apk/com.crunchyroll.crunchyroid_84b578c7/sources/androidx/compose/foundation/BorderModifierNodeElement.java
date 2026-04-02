package androidx.compose.foundation;

import com.amazon.aps.iva.a0.o;
import com.amazon.aps.iva.f1.s;
import com.amazon.aps.iva.f1.u0;
import com.amazon.aps.iva.u1.f0;
import kotlin.Metadata;
/* compiled from: Border.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/BorderModifierNodeElement;", "Lcom/amazon/aps/iva/u1/f0;", "Lcom/amazon/aps/iva/a0/o;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BorderModifierNodeElement extends f0<o> {
    public final float c;
    public final s d;
    public final u0 e;

    public BorderModifierNodeElement(float f, s sVar, u0 u0Var) {
        com.amazon.aps.iva.yb0.j.f(sVar, "brush");
        com.amazon.aps.iva.yb0.j.f(u0Var, "shape");
        this.c = f;
        this.d = sVar;
        this.e = u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        if (com.amazon.aps.iva.o2.e.a(this.c, borderModifierNodeElement.c) && com.amazon.aps.iva.yb0.j.a(this.d, borderModifierNodeElement.d) && com.amazon.aps.iva.yb0.j.a(this.e, borderModifierNodeElement.e)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final int hashCode() {
        int hashCode = this.d.hashCode();
        return this.e.hashCode() + ((hashCode + (Float.hashCode(this.c) * 31)) * 31);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final o l() {
        return new o(this.c, this.d, this.e);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final void p(o oVar) {
        o oVar2 = oVar;
        com.amazon.aps.iva.yb0.j.f(oVar2, "node");
        float f = oVar2.r;
        float f2 = this.c;
        boolean a = com.amazon.aps.iva.o2.e.a(f, f2);
        com.amazon.aps.iva.c1.b bVar = oVar2.u;
        if (!a) {
            oVar2.r = f2;
            bVar.w0();
        }
        s sVar = this.d;
        com.amazon.aps.iva.yb0.j.f(sVar, "value");
        if (!com.amazon.aps.iva.yb0.j.a(oVar2.s, sVar)) {
            oVar2.s = sVar;
            bVar.w0();
        }
        u0 u0Var = this.e;
        com.amazon.aps.iva.yb0.j.f(u0Var, "value");
        if (!com.amazon.aps.iva.yb0.j.a(oVar2.t, u0Var)) {
            oVar2.t = u0Var;
            bVar.w0();
        }
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) com.amazon.aps.iva.o2.e.b(this.c)) + ", brush=" + this.d + ", shape=" + this.e + ')';
    }
}

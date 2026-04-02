package androidx.compose.ui.layout;

import com.amazon.aps.iva.s1.c0;
import com.amazon.aps.iva.s1.e0;
import com.amazon.aps.iva.s1.w;
import com.amazon.aps.iva.u1.f0;
import com.amazon.aps.iva.xb0.q;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: LayoutModifier.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutElement;", "Lcom/amazon/aps/iva/u1/f0;", "Lcom/amazon/aps/iva/s1/w;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class LayoutElement extends f0<w> {
    public final q<com.amazon.aps.iva.s1.f0, c0, com.amazon.aps.iva.o2.a, e0> c;

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutElement(q<? super com.amazon.aps.iva.s1.f0, ? super c0, ? super com.amazon.aps.iva.o2.a, ? extends e0> qVar) {
        j.f(qVar, "measure");
        this.c = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof LayoutElement) && j.a(this.c, ((LayoutElement) obj).c)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final w l() {
        return new w(this.c);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final void p(w wVar) {
        w wVar2 = wVar;
        j.f(wVar2, "node");
        q<com.amazon.aps.iva.s1.f0, c0, com.amazon.aps.iva.o2.a, e0> qVar = this.c;
        j.f(qVar, "<set-?>");
        wVar2.o = qVar;
    }

    public final String toString() {
        return "LayoutElement(measure=" + this.c + ')';
    }
}

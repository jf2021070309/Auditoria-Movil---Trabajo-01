package androidx.compose.ui.focus;

import com.amazon.aps.iva.d1.w;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.u1.f0;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: FocusChangedModifier.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusChangedElement;", "Lcom/amazon/aps/iva/u1/f0;", "Lcom/amazon/aps/iva/d1/c;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class FocusChangedElement extends f0<com.amazon.aps.iva.d1.c> {
    public final l<w, q> c;

    /* JADX WARN: Multi-variable type inference failed */
    public FocusChangedElement(l<? super w, q> lVar) {
        j.f(lVar, "onFocusChanged");
        this.c = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof FocusChangedElement) && j.a(this.c, ((FocusChangedElement) obj).c)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final com.amazon.aps.iva.d1.c l() {
        return new com.amazon.aps.iva.d1.c(this.c);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final void p(com.amazon.aps.iva.d1.c cVar) {
        com.amazon.aps.iva.d1.c cVar2 = cVar;
        j.f(cVar2, "node");
        l<w, q> lVar = this.c;
        j.f(lVar, "<set-?>");
        cVar2.o = lVar;
    }

    public final String toString() {
        return "FocusChangedElement(onFocusChanged=" + this.c + ')';
    }
}

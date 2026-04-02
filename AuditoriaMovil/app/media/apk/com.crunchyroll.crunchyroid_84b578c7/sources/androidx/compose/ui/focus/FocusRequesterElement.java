package androidx.compose.ui.focus;

import com.amazon.aps.iva.d1.r;
import com.amazon.aps.iva.d1.v;
import com.amazon.aps.iva.u1.f0;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: FocusRequesterModifier.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusRequesterElement;", "Lcom/amazon/aps/iva/u1/f0;", "Lcom/amazon/aps/iva/d1/v;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class FocusRequesterElement extends f0<v> {
    public final r c;

    public FocusRequesterElement(r rVar) {
        j.f(rVar, "focusRequester");
        this.c = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof FocusRequesterElement) && j.a(this.c, ((FocusRequesterElement) obj).c)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final v l() {
        return new v(this.c);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final void p(v vVar) {
        v vVar2 = vVar;
        j.f(vVar2, "node");
        vVar2.o.a.k(vVar2);
        r rVar = this.c;
        j.f(rVar, "<set-?>");
        vVar2.o = rVar;
        rVar.a.b(vVar2);
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.c + ')';
    }
}

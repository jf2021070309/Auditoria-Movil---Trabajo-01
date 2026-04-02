package androidx.compose.ui.draw;

import com.amazon.aps.iva.c1.j;
import com.amazon.aps.iva.h1.c;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.u1.f0;
import com.amazon.aps.iva.xb0.l;
import kotlin.Metadata;
/* compiled from: DrawModifier.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/DrawWithContentElement;", "Lcom/amazon/aps/iva/u1/f0;", "Lcom/amazon/aps/iva/c1/j;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class DrawWithContentElement extends f0<j> {
    public final l<c, q> c;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawWithContentElement(l<? super c, q> lVar) {
        this.c = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof DrawWithContentElement) && com.amazon.aps.iva.yb0.j.a(this.c, ((DrawWithContentElement) obj).c)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final j l() {
        return new j(this.c);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final void p(j jVar) {
        j jVar2 = jVar;
        com.amazon.aps.iva.yb0.j.f(jVar2, "node");
        l<c, q> lVar = this.c;
        com.amazon.aps.iva.yb0.j.f(lVar, "<set-?>");
        jVar2.o = lVar;
    }

    public final String toString() {
        return "DrawWithContentElement(onDraw=" + this.c + ')';
    }
}

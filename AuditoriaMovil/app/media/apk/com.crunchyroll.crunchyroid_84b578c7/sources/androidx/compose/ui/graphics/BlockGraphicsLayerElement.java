package androidx.compose.ui.graphics;

import androidx.compose.ui.node.o;
import com.amazon.aps.iva.f1.g0;
import com.amazon.aps.iva.f1.r;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.u1.f0;
import com.amazon.aps.iva.u1.i;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: GraphicsLayerModifier.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;", "Lcom/amazon/aps/iva/u1/f0;", "Lcom/amazon/aps/iva/f1/r;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class BlockGraphicsLayerElement extends f0<r> {
    public final l<g0, q> c;

    /* JADX WARN: Multi-variable type inference failed */
    public BlockGraphicsLayerElement(l<? super g0, q> lVar) {
        j.f(lVar, "block");
        this.c = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof BlockGraphicsLayerElement) && j.a(this.c, ((BlockGraphicsLayerElement) obj).c)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final r l() {
        return new r(this.c);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final void p(r rVar) {
        r rVar2 = rVar;
        j.f(rVar2, "node");
        l<g0, q> lVar = this.c;
        j.f(lVar, "<set-?>");
        rVar2.o = lVar;
        o oVar = i.d(rVar2, 2).j;
        if (oVar != null) {
            oVar.J1(rVar2.o, true);
        }
    }

    public final String toString() {
        return "BlockGraphicsLayerElement(block=" + this.c + ')';
    }
}

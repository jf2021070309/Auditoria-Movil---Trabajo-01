package androidx.compose.ui.draw;

import com.amazon.aps.iva.c1.f;
import com.amazon.aps.iva.h1.e;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.u1.f0;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DrawModifier.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/DrawBehindElement;", "Lcom/amazon/aps/iva/u1/f0;", "Lcom/amazon/aps/iva/c1/f;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DrawBehindElement extends f0<f> {
    public final l<e, q> c;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawBehindElement(l<? super e, q> lVar) {
        j.f(lVar, "onDraw");
        this.c = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof DrawBehindElement) && j.a(this.c, ((DrawBehindElement) obj).c)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final f l() {
        return new f(this.c);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final void p(f fVar) {
        f fVar2 = fVar;
        j.f(fVar2, "node");
        l<e, q> lVar = this.c;
        j.f(lVar, "<set-?>");
        fVar2.o = lVar;
    }

    public final String toString() {
        return "DrawBehindElement(onDraw=" + this.c + ')';
    }
}

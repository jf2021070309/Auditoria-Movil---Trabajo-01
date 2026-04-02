package androidx.compose.ui.draw;

import com.amazon.aps.iva.c1.d;
import com.amazon.aps.iva.c1.e;
import com.amazon.aps.iva.c1.i;
import com.amazon.aps.iva.u1.f0;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: DrawModifier.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/DrawWithCacheElement;", "Lcom/amazon/aps/iva/u1/f0;", "Lcom/amazon/aps/iva/c1/d;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class DrawWithCacheElement extends f0<d> {
    public final l<e, i> c;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawWithCacheElement(l<? super e, i> lVar) {
        j.f(lVar, "onBuildDrawCache");
        this.c = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof DrawWithCacheElement) && j.a(this.c, ((DrawWithCacheElement) obj).c)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final d l() {
        return new d(new e(), this.c);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final void p(d dVar) {
        d dVar2 = dVar;
        j.f(dVar2, "node");
        l<e, i> lVar = this.c;
        j.f(lVar, "value");
        dVar2.q = lVar;
        dVar2.w0();
    }

    public final String toString() {
        return "DrawWithCacheElement(onBuildDrawCache=" + this.c + ')';
    }
}

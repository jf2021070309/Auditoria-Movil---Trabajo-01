package androidx.compose.ui.semantics;

import com.amazon.aps.iva.a2.c0;
import com.amazon.aps.iva.a2.d;
import com.amazon.aps.iva.a2.n;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.u1.f0;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: SemanticsModifier.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/semantics/AppendedSemanticsElement;", "Lcom/amazon/aps/iva/u1/f0;", "Lcom/amazon/aps/iva/a2/d;", "Lcom/amazon/aps/iva/a2/n;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AppendedSemanticsElement extends f0<d> implements n {
    public final boolean c;
    public final l<c0, q> d;

    public AppendedSemanticsElement(l lVar, boolean z) {
        j.f(lVar, "properties");
        this.c = z;
        this.d = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        if (this.c == appendedSemanticsElement.c && j.a(this.d, appendedSemanticsElement.d)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // com.amazon.aps.iva.u1.f0
    public final int hashCode() {
        boolean z = this.c;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return this.d.hashCode() + (r0 * 31);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final d l() {
        return new d(this.c, this.d);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final void p(d dVar) {
        d dVar2 = dVar;
        j.f(dVar2, "node");
        dVar2.o = this.c;
        l<c0, q> lVar = this.d;
        j.f(lVar, "<set-?>");
        dVar2.q = lVar;
    }

    @Override // com.amazon.aps.iva.a2.n
    public final com.amazon.aps.iva.a2.l t() {
        com.amazon.aps.iva.a2.l lVar = new com.amazon.aps.iva.a2.l();
        lVar.c = this.c;
        this.d.invoke(lVar);
        return lVar;
    }

    public final String toString() {
        return "AppendedSemanticsElement(mergeDescendants=" + this.c + ", properties=" + this.d + ')';
    }
}

package androidx.compose.ui.input.nestedscroll;

import com.amazon.aps.iva.o1.b;
import com.amazon.aps.iva.o1.c;
import com.amazon.aps.iva.o1.d;
import com.amazon.aps.iva.u1.f0;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NestedScrollModifier.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;", "Lcom/amazon/aps/iva/u1/f0;", "Lcom/amazon/aps/iva/o1/c;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NestedScrollElement extends f0<c> {
    public final com.amazon.aps.iva.o1.a c;
    public final b d;

    public NestedScrollElement(com.amazon.aps.iva.o1.a aVar, b bVar) {
        j.f(aVar, "connection");
        this.c = aVar;
        this.d = bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        if (!j.a(nestedScrollElement.c, this.c) || !j.a(nestedScrollElement.d, this.d)) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final int hashCode() {
        int i;
        int hashCode = this.c.hashCode() * 31;
        b bVar = this.d;
        if (bVar != null) {
            i = bVar.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final c l() {
        return new c(this.c, this.d);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final void p(c cVar) {
        c cVar2 = cVar;
        j.f(cVar2, "node");
        com.amazon.aps.iva.o1.a aVar = this.c;
        j.f(aVar, "connection");
        cVar2.o = aVar;
        b bVar = cVar2.p;
        if (bVar.a == cVar2) {
            bVar.a = null;
        }
        b bVar2 = this.d;
        if (bVar2 == null) {
            cVar2.p = new b();
        } else if (!j.a(bVar2, bVar)) {
            cVar2.p = bVar2;
        }
        if (cVar2.n) {
            b bVar3 = cVar2.p;
            bVar3.a = cVar2;
            bVar3.b = new d(cVar2);
            cVar2.p.c = cVar2.i1();
        }
    }
}

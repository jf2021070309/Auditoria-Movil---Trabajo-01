package androidx.compose.foundation.layout;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.u1.f0;
import com.amazon.aps.iva.v1.t1;
import com.amazon.aps.iva.v1.v1;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Box.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/BoxChildDataElement;", "Lcom/amazon/aps/iva/u1/f0;", "Lcom/amazon/aps/iva/d0/e;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BoxChildDataElement extends f0<com.amazon.aps.iva.d0.e> {
    public final com.amazon.aps.iva.a1.a c;
    public final boolean d;
    public final l<v1, q> e;

    public BoxChildDataElement(com.amazon.aps.iva.a1.b bVar, boolean z) {
        t1.a aVar = t1.a;
        j.f(aVar, "inspectorInfo");
        this.c = bVar;
        this.d = z;
        this.e = aVar;
    }

    public final boolean equals(Object obj) {
        BoxChildDataElement boxChildDataElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof BoxChildDataElement) {
            boxChildDataElement = (BoxChildDataElement) obj;
        } else {
            boxChildDataElement = null;
        }
        if (boxChildDataElement == null) {
            return false;
        }
        if (j.a(this.c, boxChildDataElement.c) && this.d == boxChildDataElement.d) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final int hashCode() {
        return Boolean.hashCode(this.d) + (this.c.hashCode() * 31);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final com.amazon.aps.iva.d0.e l() {
        return new com.amazon.aps.iva.d0.e(this.c, this.d);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final void p(com.amazon.aps.iva.d0.e eVar) {
        com.amazon.aps.iva.d0.e eVar2 = eVar;
        j.f(eVar2, "node");
        com.amazon.aps.iva.a1.a aVar = this.c;
        j.f(aVar, "<set-?>");
        eVar2.o = aVar;
        eVar2.p = this.d;
    }
}

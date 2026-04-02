package androidx.compose.foundation.layout;

import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.b;
import com.amazon.aps.iva.d0.e2;
import com.amazon.aps.iva.u1.f0;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: RowColumnImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/VerticalAlignElement;", "Lcom/amazon/aps/iva/u1/f0;", "Lcom/amazon/aps/iva/d0/e2;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class VerticalAlignElement extends f0<e2> {
    public final a.c c;

    public VerticalAlignElement(b.C0098b c0098b) {
        this.c = c0098b;
    }

    public final boolean equals(Object obj) {
        VerticalAlignElement verticalAlignElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof VerticalAlignElement) {
            verticalAlignElement = (VerticalAlignElement) obj;
        } else {
            verticalAlignElement = null;
        }
        if (verticalAlignElement == null) {
            return false;
        }
        return j.a(this.c, verticalAlignElement.c);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final e2 l() {
        return new e2(this.c);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final void p(e2 e2Var) {
        e2 e2Var2 = e2Var;
        j.f(e2Var2, "node");
        a.c cVar = this.c;
        j.f(cVar, "<set-?>");
        e2Var2.o = cVar;
    }
}

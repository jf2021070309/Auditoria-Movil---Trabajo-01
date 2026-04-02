package androidx.compose.foundation.relocation;

import com.amazon.aps.iva.g0.d;
import com.amazon.aps.iva.g0.e;
import com.amazon.aps.iva.g0.g;
import com.amazon.aps.iva.u1.f0;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: BringIntoViewRequester.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;", "Lcom/amazon/aps/iva/u1/f0;", "Lcom/amazon/aps/iva/g0/g;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class BringIntoViewRequesterElement extends f0<g> {
    public final d c;

    public BringIntoViewRequesterElement(d dVar) {
        j.f(dVar, "requester");
        this.c = dVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BringIntoViewRequesterElement) {
                if (j.a(this.c, ((BringIntoViewRequesterElement) obj).c)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final g l() {
        return new g(this.c);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final void p(g gVar) {
        g gVar2 = gVar;
        j.f(gVar2, "node");
        d dVar = this.c;
        j.f(dVar, "requester");
        d dVar2 = gVar2.q;
        if (dVar2 instanceof e) {
            j.d(dVar2, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((e) dVar2).a.k(gVar2);
        }
        if (dVar instanceof e) {
            ((e) dVar).a.b(gVar2);
        }
        gVar2.q = dVar;
    }
}

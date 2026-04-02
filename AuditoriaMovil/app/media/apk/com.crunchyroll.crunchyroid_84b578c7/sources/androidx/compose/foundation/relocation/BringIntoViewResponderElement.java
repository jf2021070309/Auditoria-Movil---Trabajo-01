package androidx.compose.foundation.relocation;

import com.amazon.aps.iva.g0.h;
import com.amazon.aps.iva.g0.i;
import com.amazon.aps.iva.u1.f0;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BringIntoViewResponder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewResponderElement;", "Lcom/amazon/aps/iva/u1/f0;", "Lcom/amazon/aps/iva/g0/i;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BringIntoViewResponderElement extends f0<i> {
    public final h c;

    public BringIntoViewResponderElement(h hVar) {
        j.f(hVar, "responder");
        this.c = hVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BringIntoViewResponderElement) {
                if (j.a(this.c, ((BringIntoViewResponderElement) obj).c)) {
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
    public final i l() {
        return new i(this.c);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final void p(i iVar) {
        i iVar2 = iVar;
        j.f(iVar2, "node");
        h hVar = this.c;
        j.f(hVar, "<set-?>");
        iVar2.q = hVar;
    }
}

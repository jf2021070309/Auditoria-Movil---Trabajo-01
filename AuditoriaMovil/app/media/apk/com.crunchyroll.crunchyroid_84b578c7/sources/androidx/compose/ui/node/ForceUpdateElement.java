package androidx.compose.ui.node;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.u1.f0;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NodeChain.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/node/ForceUpdateElement;", "Lcom/amazon/aps/iva/u1/f0;", "Lcom/amazon/aps/iva/a1/f$c;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ForceUpdateElement extends f0<f.c> {
    public final f0<?> c;

    public ForceUpdateElement(f0<?> f0Var) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "original");
        this.c = f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ForceUpdateElement) && com.amazon.aps.iva.yb0.j.a(this.c, ((ForceUpdateElement) obj).c)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final f.c l() {
        throw new IllegalStateException("Shouldn't be called");
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final void p(f.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "node");
        throw new IllegalStateException("Shouldn't be called");
    }

    public final String toString() {
        return "ForceUpdateElement(original=" + this.c + ')';
    }
}

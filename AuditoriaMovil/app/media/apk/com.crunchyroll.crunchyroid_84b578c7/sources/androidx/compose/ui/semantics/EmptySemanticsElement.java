package androidx.compose.ui.semantics;

import com.amazon.aps.iva.a2.f;
import com.amazon.aps.iva.u1.f0;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: SemanticsModifier.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/semantics/EmptySemanticsElement;", "Lcom/amazon/aps/iva/u1/f0;", "Lcom/amazon/aps/iva/a2/f;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class EmptySemanticsElement extends f0<f> {
    public static final EmptySemanticsElement c = new EmptySemanticsElement();

    private EmptySemanticsElement() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final f l() {
        return new f();
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final void p(f fVar) {
        j.f(fVar, "node");
    }
}

package androidx.compose.ui.input.rotary;

import androidx.compose.ui.platform.AndroidComposeView;
import com.amazon.aps.iva.r1.b;
import com.amazon.aps.iva.r1.c;
import com.amazon.aps.iva.u1.f0;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RotaryInputModifier.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/rotary/RotaryInputElement;", "Lcom/amazon/aps/iva/u1/f0;", "Lcom/amazon/aps/iva/r1/b;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class RotaryInputElement extends f0<b> {
    public final l<c, Boolean> c;
    public final l<c, Boolean> d = null;

    public RotaryInputElement(AndroidComposeView.k kVar) {
        this.c = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        RotaryInputElement rotaryInputElement = (RotaryInputElement) obj;
        if (j.a(this.c, rotaryInputElement.c) && j.a(this.d, rotaryInputElement.d)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final int hashCode() {
        int hashCode;
        int i = 0;
        l<c, Boolean> lVar = this.c;
        if (lVar == null) {
            hashCode = 0;
        } else {
            hashCode = lVar.hashCode();
        }
        int i2 = hashCode * 31;
        l<c, Boolean> lVar2 = this.d;
        if (lVar2 != null) {
            i = lVar2.hashCode();
        }
        return i2 + i;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final b l() {
        return new b(this.c, this.d);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final void p(b bVar) {
        b bVar2 = bVar;
        j.f(bVar2, "node");
        bVar2.o = this.c;
        bVar2.p = this.d;
    }

    public final String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + this.c + ", onPreRotaryScrollEvent=" + this.d + ')';
    }
}

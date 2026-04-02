package androidx.compose.ui.input.key;

import com.amazon.aps.iva.n1.b;
import com.amazon.aps.iva.n1.e;
import com.amazon.aps.iva.u1.f0;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: KeyInputModifier.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/key/KeyInputElement;", "Lcom/amazon/aps/iva/u1/f0;", "Lcom/amazon/aps/iva/n1/e;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class KeyInputElement extends f0<e> {
    public final l<b, Boolean> c;
    public final l<b, Boolean> d;

    /* JADX WARN: Multi-variable type inference failed */
    public KeyInputElement(l<? super b, Boolean> lVar, l<? super b, Boolean> lVar2) {
        this.c = lVar;
        this.d = lVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        if (j.a(this.c, keyInputElement.c) && j.a(this.d, keyInputElement.d)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final int hashCode() {
        int hashCode;
        int i = 0;
        l<b, Boolean> lVar = this.c;
        if (lVar == null) {
            hashCode = 0;
        } else {
            hashCode = lVar.hashCode();
        }
        int i2 = hashCode * 31;
        l<b, Boolean> lVar2 = this.d;
        if (lVar2 != null) {
            i = lVar2.hashCode();
        }
        return i2 + i;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final e l() {
        return new e(this.c, this.d);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final void p(e eVar) {
        e eVar2 = eVar;
        j.f(eVar2, "node");
        eVar2.o = this.c;
        eVar2.p = this.d;
    }

    public final String toString() {
        return "KeyInputElement(onKeyEvent=" + this.c + ", onPreKeyEvent=" + this.d + ')';
    }
}

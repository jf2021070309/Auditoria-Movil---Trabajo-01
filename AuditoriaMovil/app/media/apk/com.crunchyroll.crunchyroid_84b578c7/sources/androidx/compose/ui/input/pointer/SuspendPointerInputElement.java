package androidx.compose.ui.input.pointer;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.p1.n0;
import com.amazon.aps.iva.u1.f0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import java.util.Arrays;
import kotlin.Metadata;
/* compiled from: SuspendingPointerInputFilter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;", "Lcom/amazon/aps/iva/u1/f0;", "Lcom/amazon/aps/iva/p1/n0;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SuspendPointerInputElement extends f0<n0> {
    public final Object c;
    public final Object d;
    public final Object[] e;
    public final p<com.amazon.aps.iva.p1.f0, d<? super q>, Object> f;

    public SuspendPointerInputElement() {
        throw null;
    }

    public SuspendPointerInputElement(Object obj, p pVar) {
        j.f(pVar, "pointerInputHandler");
        this.c = obj;
        this.d = null;
        this.e = null;
        this.f = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        if (!j.a(this.c, suspendPointerInputElement.c) || !j.a(this.d, suspendPointerInputElement.d)) {
            return false;
        }
        Object[] objArr = this.e;
        if (objArr != null) {
            Object[] objArr2 = suspendPointerInputElement.e;
            if (objArr2 == null || !Arrays.equals(objArr, objArr2)) {
                return false;
            }
        } else if (suspendPointerInputElement.e != null) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        Object obj = this.c;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        Object obj2 = this.d;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        Object[] objArr = this.e;
        if (objArr != null) {
            i3 = Arrays.hashCode(objArr);
        }
        return i5 + i3;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final n0 l() {
        return new n0(this.f);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final void p(n0 n0Var) {
        n0 n0Var2 = n0Var;
        j.f(n0Var2, "node");
        p<com.amazon.aps.iva.p1.f0, d<? super q>, Object> pVar = this.f;
        j.f(pVar, "value");
        n0Var2.r0();
        n0Var2.o = pVar;
    }
}

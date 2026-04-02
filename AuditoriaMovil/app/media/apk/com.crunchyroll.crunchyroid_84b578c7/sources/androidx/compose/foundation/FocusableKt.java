package androidx.compose.foundation;

import androidx.compose.ui.focus.FocusTargetNode;
import com.amazon.aps.iva.a0.b0;
import com.amazon.aps.iva.a0.e0;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.u1.f0;
import com.amazon.aps.iva.v1.s1;
import com.amazon.aps.iva.v1.t1;
/* compiled from: Focusable.kt */
/* loaded from: classes.dex */
public final class FocusableKt {
    public static final s1 a = new s1(t1.a);
    public static final FocusableKt$FocusableInNonTouchModeElement$1 b = new f0<b0>() { // from class: androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return false;
        }

        @Override // com.amazon.aps.iva.u1.f0
        public final int hashCode() {
            return System.identityHashCode(this);
        }

        @Override // com.amazon.aps.iva.u1.f0
        public final b0 l() {
            return new b0();
        }

        @Override // com.amazon.aps.iva.u1.f0
        public final void p(b0 b0Var) {
            com.amazon.aps.iva.yb0.j.f(b0Var, "node");
        }
    };

    public static final com.amazon.aps.iva.a1.f a(com.amazon.aps.iva.c0.l lVar, com.amazon.aps.iva.a1.f fVar, boolean z) {
        com.amazon.aps.iva.a1.f fVar2;
        com.amazon.aps.iva.yb0.j.f(fVar, "<this>");
        if (z) {
            fVar2 = new FocusableElement(lVar).o(FocusTargetNode.FocusTargetElement.c);
        } else {
            fVar2 = f.a.c;
        }
        return fVar.o(fVar2);
    }

    public static final com.amazon.aps.iva.a1.f b(com.amazon.aps.iva.c0.l lVar, com.amazon.aps.iva.a1.f fVar, boolean z) {
        com.amazon.aps.iva.yb0.j.f(fVar, "<this>");
        e0 e0Var = new e0(z, lVar);
        int i = com.amazon.aps.iva.a1.f.a;
        f.a aVar = f.a.c;
        FocusableKt$FocusableInNonTouchModeElement$1 focusableKt$FocusableInNonTouchModeElement$1 = b;
        com.amazon.aps.iva.yb0.j.f(focusableKt$FocusableInNonTouchModeElement$1, "other");
        return t1.a(fVar, e0Var, a(lVar, focusableKt$FocusableInNonTouchModeElement$1, z));
    }
}

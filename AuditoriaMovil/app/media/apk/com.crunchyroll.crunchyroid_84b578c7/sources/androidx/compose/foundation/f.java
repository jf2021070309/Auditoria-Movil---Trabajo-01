package androidx.compose.foundation;

import com.amazon.aps.iva.a0.q0;
import com.amazon.aps.iva.a0.s;
import com.amazon.aps.iva.a0.s0;
import com.amazon.aps.iva.a0.t0;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.q3;
import com.amazon.aps.iva.v1.t1;
/* compiled from: Clickable.kt */
/* loaded from: classes.dex */
public final class f {
    public static final com.amazon.aps.iva.a1.f a(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.c0.l lVar, q0 q0Var, boolean z, String str, com.amazon.aps.iva.a2.i iVar, com.amazon.aps.iva.xb0.a<q> aVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, "$this$clickable");
        com.amazon.aps.iva.yb0.j.f(lVar, "interactionSource");
        com.amazon.aps.iva.yb0.j.f(aVar, "onClick");
        t1.a aVar2 = t1.a;
        q3 q3Var = s0.a;
        com.amazon.aps.iva.a1.f fVar2 = f.a.c;
        com.amazon.aps.iva.a1.f a = com.amazon.aps.iva.a1.e.a(fVar2, aVar2, new t0(q0Var, lVar));
        com.amazon.aps.iva.yb0.j.f(a, "<this>");
        if (z) {
            fVar2 = new HoverableElement(lVar);
        }
        return t1.a(fVar, aVar2, FocusableKt.b(lVar, a.o(fVar2), z).o(new ClickableElement(lVar, z, str, iVar, aVar)));
    }

    public static /* synthetic */ com.amazon.aps.iva.a1.f b(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.c0.l lVar, q0 q0Var, boolean z, com.amazon.aps.iva.a2.i iVar, com.amazon.aps.iva.xb0.a aVar, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            iVar = null;
        }
        return a(fVar, lVar, q0Var, z2, null, iVar, aVar);
    }

    public static com.amazon.aps.iva.a1.f c(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.xb0.a aVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, "$this$clickable");
        com.amazon.aps.iva.yb0.j.f(aVar, "onClick");
        return com.amazon.aps.iva.a1.e.a(fVar, t1.a, new s(true, null, null, aVar));
    }

    public static com.amazon.aps.iva.a1.f d(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.xb0.a aVar, com.amazon.aps.iva.xb0.a aVar2) {
        com.amazon.aps.iva.yb0.j.f(fVar, "$this$combinedClickable");
        com.amazon.aps.iva.yb0.j.f(aVar2, "onClick");
        return com.amazon.aps.iva.a1.e.a(fVar, t1.a, new d(null, null, null, aVar, null, aVar2, true));
    }
}

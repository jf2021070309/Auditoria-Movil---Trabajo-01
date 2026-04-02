package androidx.compose.foundation;

import com.amazon.aps.iva.f1.j0;
import com.amazon.aps.iva.f1.p0;
import com.amazon.aps.iva.f1.u0;
import com.amazon.aps.iva.v1.t1;
/* compiled from: Background.kt */
/* loaded from: classes.dex */
public final class c {
    public static com.amazon.aps.iva.a1.f a(com.amazon.aps.iva.a1.f fVar, j0 j0Var) {
        p0.a aVar = p0.a;
        com.amazon.aps.iva.yb0.j.f(fVar, "<this>");
        t1.a aVar2 = t1.a;
        return fVar.o(new BackgroundElement(0L, j0Var, 1.0f, aVar, 1));
    }

    public static final com.amazon.aps.iva.a1.f b(com.amazon.aps.iva.a1.f fVar, long j, u0 u0Var) {
        com.amazon.aps.iva.yb0.j.f(fVar, "$this$background");
        com.amazon.aps.iva.yb0.j.f(u0Var, "shape");
        t1.a aVar = t1.a;
        return fVar.o(new BackgroundElement(j, null, 1.0f, u0Var, 2));
    }

    public static /* synthetic */ com.amazon.aps.iva.a1.f c(com.amazon.aps.iva.a1.f fVar, long j) {
        return b(fVar, j, p0.a);
    }
}

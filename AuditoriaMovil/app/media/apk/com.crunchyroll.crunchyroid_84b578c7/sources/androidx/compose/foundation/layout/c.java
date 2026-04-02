package androidx.compose.foundation.layout;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.d0.j1;
import com.amazon.aps.iva.d0.k1;
import com.amazon.aps.iva.m0.m1;
import com.amazon.aps.iva.yb0.j;
/* compiled from: Offset.kt */
/* loaded from: classes.dex */
public final class c {
    public static final f a(f fVar, m1 m1Var) {
        j.f(fVar, "<this>");
        return fVar.o(new OffsetPxElement(m1Var, new k1(m1Var)));
    }

    public static f b(f fVar, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        j.f(fVar, "$this$offset");
        return fVar.o(new OffsetElement(f, f2, new j1(f, f2)));
    }
}

package androidx.compose.ui.layout;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.s1.c0;
import com.amazon.aps.iva.s1.s;
import com.amazon.aps.iva.yb0.j;
/* compiled from: LayoutId.kt */
/* loaded from: classes.dex */
public final class a {
    public static final Object a(c0 c0Var) {
        s sVar;
        j.f(c0Var, "<this>");
        Object b = c0Var.b();
        if (b instanceof s) {
            sVar = (s) b;
        } else {
            sVar = null;
        }
        if (sVar == null) {
            return null;
        }
        return sVar.x0();
    }

    public static final f b(f fVar, String str) {
        j.f(fVar, "<this>");
        return fVar.o(new LayoutIdElement(str));
    }
}

package androidx.compose.ui.draw;

import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.f1.y;
import com.amazon.aps.iva.i1.c;
import com.amazon.aps.iva.s1.f;
import com.amazon.aps.iva.yb0.j;
/* compiled from: PainterModifier.kt */
/* loaded from: classes.dex */
public final class b {
    public static f a(f fVar, c cVar, com.amazon.aps.iva.a1.a aVar, com.amazon.aps.iva.s1.f fVar2, float f, y yVar, int i) {
        boolean z;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            aVar = a.C0097a.e;
        }
        com.amazon.aps.iva.a1.a aVar2 = aVar;
        if ((i & 8) != 0) {
            fVar2 = f.a.d;
        }
        com.amazon.aps.iva.s1.f fVar3 = fVar2;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 32) != 0) {
            yVar = null;
        }
        j.f(fVar, "<this>");
        j.f(cVar, "painter");
        j.f(aVar2, "alignment");
        j.f(fVar3, "contentScale");
        return fVar.o(new PainterElement(cVar, z2, aVar2, fVar3, f2, yVar));
    }
}

package androidx.compose.foundation.layout;

import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.d0.h;
import com.amazon.aps.iva.v1.t1;
import com.amazon.aps.iva.yb0.j;
/* compiled from: Box.kt */
/* loaded from: classes.dex */
public final class b implements h {
    public static final b a = new b();

    @Override // com.amazon.aps.iva.d0.h
    public final f c(f fVar, com.amazon.aps.iva.a1.b bVar) {
        j.f(fVar, "<this>");
        t1.a aVar = t1.a;
        return fVar.o(new BoxChildDataElement(bVar, false));
    }

    public final f d() {
        com.amazon.aps.iva.a1.b bVar = a.C0097a.e;
        t1.a aVar = t1.a;
        return new BoxChildDataElement(bVar, true);
    }
}

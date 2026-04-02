package e.d.e;

import java.io.IOException;
/* loaded from: classes2.dex */
public class f extends z<Number> {
    public f(j jVar) {
    }

    @Override // e.d.e.z
    public Number a(e.d.e.e0.a aVar) throws IOException {
        if (aVar.g0() == e.d.e.e0.b.NULL) {
            aVar.a0();
            return null;
        }
        return Float.valueOf((float) aVar.I());
    }

    @Override // e.d.e.z
    public void b(e.d.e.e0.c cVar, Number number) throws IOException {
        Number number2 = number;
        if (number2 == null) {
            cVar.y();
            return;
        }
        j.a(number2.floatValue());
        cVar.Q(number2);
    }
}

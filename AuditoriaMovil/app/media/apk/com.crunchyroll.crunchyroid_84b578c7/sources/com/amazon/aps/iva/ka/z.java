package com.amazon.aps.iva.ka;

import android.graphics.PointF;
import com.amazon.aps.iva.la.c;
import java.io.IOException;
/* compiled from: PointFParser.java */
/* loaded from: classes.dex */
public final class z implements l0<PointF> {
    public static final z a = new z();

    @Override // com.amazon.aps.iva.ka.l0
    public final PointF a(com.amazon.aps.iva.la.c cVar, float f) throws IOException {
        c.b t = cVar.t();
        if (t == c.b.BEGIN_ARRAY) {
            return s.b(cVar, f);
        }
        if (t == c.b.BEGIN_OBJECT) {
            return s.b(cVar, f);
        }
        if (t == c.b.NUMBER) {
            PointF pointF = new PointF(((float) cVar.n()) * f, ((float) cVar.n()) * f);
            while (cVar.k()) {
                cVar.A();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + t);
    }
}

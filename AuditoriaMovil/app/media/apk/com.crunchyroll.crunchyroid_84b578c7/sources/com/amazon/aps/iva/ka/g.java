package com.amazon.aps.iva.ka;

import android.graphics.Color;
import com.amazon.aps.iva.la.c;
import java.io.IOException;
/* compiled from: ColorParser.java */
/* loaded from: classes.dex */
public final class g implements l0<Integer> {
    public static final g a = new g();

    @Override // com.amazon.aps.iva.ka.l0
    public final Integer a(com.amazon.aps.iva.la.c cVar, float f) throws IOException {
        boolean z;
        double d;
        if (cVar.t() == c.b.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            cVar.a();
        }
        double n = cVar.n();
        double n2 = cVar.n();
        double n3 = cVar.n();
        if (cVar.t() == c.b.NUMBER) {
            d = cVar.n();
        } else {
            d = 1.0d;
        }
        if (z) {
            cVar.f();
        }
        if (n <= 1.0d && n2 <= 1.0d && n3 <= 1.0d) {
            n *= 255.0d;
            n2 *= 255.0d;
            n3 *= 255.0d;
            if (d <= 1.0d) {
                d *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) d, (int) n, (int) n2, (int) n3));
    }
}

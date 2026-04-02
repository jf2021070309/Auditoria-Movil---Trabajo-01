package k.b0;

import h.o.c.j;
import k.d;
/* loaded from: classes2.dex */
public final class a {
    public static final byte[] a;

    static {
        j.e("0123456789abcdef", "<this>");
        byte[] bytes = "0123456789abcdef".getBytes(h.t.a.a);
        j.d(bytes, "(this as java.lang.String).getBytes(charset)");
        a = bytes;
    }

    public static final String a(d dVar, long j2) {
        j.e(dVar, "<this>");
        if (j2 > 0) {
            long j3 = j2 - 1;
            if (dVar.r(j3) == ((byte) 13)) {
                String I = dVar.I(j3, h.t.a.a);
                dVar.skip(2L);
                return I;
            }
        }
        String I2 = dVar.I(j2, h.t.a.a);
        dVar.skip(1L);
        return I2;
    }
}

package com.amazon.aps.iva.ka;

import android.graphics.PointF;
import com.amazon.aps.iva.fa.b;
import com.amazon.aps.iva.la.c;
import java.io.IOException;
/* compiled from: DocumentDataParser.java */
/* loaded from: classes.dex */
public final class i implements l0<com.amazon.aps.iva.fa.b> {
    public static final i a = new i();
    public static final c.a b = c.a.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // com.amazon.aps.iva.ka.l0
    public final com.amazon.aps.iva.fa.b a(com.amazon.aps.iva.la.c cVar, float f) throws IOException {
        b.a aVar = b.a.CENTER;
        cVar.c();
        b.a aVar2 = aVar;
        String str = null;
        String str2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = true;
        while (cVar.k()) {
            switch (cVar.x(b)) {
                case 0:
                    str = cVar.s();
                    break;
                case 1:
                    str2 = cVar.s();
                    break;
                case 2:
                    f2 = (float) cVar.n();
                    break;
                case 3:
                    int p = cVar.p();
                    aVar2 = b.a.CENTER;
                    if (p <= aVar2.ordinal() && p >= 0) {
                        aVar2 = b.a.values()[p];
                        break;
                    }
                    break;
                case 4:
                    i = cVar.p();
                    break;
                case 5:
                    f3 = (float) cVar.n();
                    break;
                case 6:
                    f4 = (float) cVar.n();
                    break;
                case 7:
                    i2 = s.a(cVar);
                    break;
                case 8:
                    i3 = s.a(cVar);
                    break;
                case 9:
                    f5 = (float) cVar.n();
                    break;
                case 10:
                    z = cVar.m();
                    break;
                case 11:
                    cVar.a();
                    PointF pointF3 = new PointF(((float) cVar.n()) * f, ((float) cVar.n()) * f);
                    cVar.f();
                    pointF = pointF3;
                    break;
                case 12:
                    cVar.a();
                    PointF pointF4 = new PointF(((float) cVar.n()) * f, ((float) cVar.n()) * f);
                    cVar.f();
                    pointF2 = pointF4;
                    break;
                default:
                    cVar.y();
                    cVar.A();
                    break;
            }
        }
        cVar.h();
        return new com.amazon.aps.iva.fa.b(str, str2, f2, aVar2, i, f3, f4, i2, i3, f5, z, pointF, pointF2);
    }
}

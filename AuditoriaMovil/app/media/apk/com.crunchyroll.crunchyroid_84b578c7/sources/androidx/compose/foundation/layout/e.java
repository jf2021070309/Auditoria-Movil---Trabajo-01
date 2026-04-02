package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.WrapContentElement;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.b;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.d0.r;
import com.amazon.aps.iva.m0.x2;
import com.amazon.aps.iva.v1.t1;
import com.amazon.aps.iva.yb0.j;
/* compiled from: Size.kt */
/* loaded from: classes.dex */
public final class e {
    public static final FillElement a = new FillElement(r.Horizontal, 1.0f, "fillMaxWidth");
    public static final FillElement b = new FillElement(r.Vertical, 1.0f, "fillMaxHeight");
    public static final FillElement c = new FillElement(r.Both, 1.0f, "fillMaxSize");
    public static final WrapContentElement d = WrapContentElement.a.c(a.C0097a.n, false);
    public static final WrapContentElement e = WrapContentElement.a.c(a.C0097a.m, false);
    public static final WrapContentElement f = WrapContentElement.a.a(a.C0097a.k, false);
    public static final WrapContentElement g = WrapContentElement.a.a(a.C0097a.j, false);
    public static final WrapContentElement h = WrapContentElement.a.b(a.C0097a.e, false);
    public static final WrapContentElement i = WrapContentElement.a.b(a.C0097a.a, false);

    public static final f a(f fVar, float f2, float f3) {
        j.f(fVar, "$this$defaultMinSize");
        return fVar.o(new UnspecifiedConstraintsElement(f2, f3));
    }

    public static /* synthetic */ f b(f fVar, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return a(fVar, f2, f3);
    }

    public static f c(f fVar) {
        j.f(fVar, "<this>");
        return fVar.o(b);
    }

    public static f d(f fVar) {
        j.f(fVar, "<this>");
        return fVar.o(c);
    }

    public static f e(f fVar) {
        j.f(fVar, "<this>");
        return fVar.o(a);
    }

    public static final f f(f fVar, float f2) {
        j.f(fVar, "$this$height");
        t1.a aVar = t1.a;
        return fVar.o(new SizeElement(0.0f, f2, 0.0f, f2, 5));
    }

    public static final f g(f fVar, float f2, float f3) {
        j.f(fVar, "$this$heightIn");
        t1.a aVar = t1.a;
        return fVar.o(new SizeElement(0.0f, f2, 0.0f, f3, 5));
    }

    public static final f i(f fVar) {
        float f2 = x2.c;
        j.f(fVar, "$this$requiredSize");
        t1.a aVar = t1.a;
        return fVar.o(new SizeElement(f2, f2, f2, f2, false));
    }

    public static final f j(f fVar, float f2) {
        j.f(fVar, "$this$size");
        t1.a aVar = t1.a;
        return fVar.o(new SizeElement(f2, f2, f2, f2, true));
    }

    public static final f k(f fVar, float f2, float f3) {
        j.f(fVar, "$this$size");
        t1.a aVar = t1.a;
        return fVar.o(new SizeElement(f2, f3, f2, f3, true));
    }

    public static final f l(f fVar, float f2) {
        j.f(fVar, "$this$width");
        t1.a aVar = t1.a;
        return fVar.o(new SizeElement(f2, 0.0f, f2, 0.0f, 10));
    }

    public static f m(f fVar, float f2, float f3, int i2) {
        float f4;
        float f5;
        if ((i2 & 1) != 0) {
            f4 = Float.NaN;
        } else {
            f4 = f2;
        }
        if ((i2 & 2) != 0) {
            f5 = Float.NaN;
        } else {
            f5 = f3;
        }
        j.f(fVar, "$this$widthIn");
        t1.a aVar = t1.a;
        return fVar.o(new SizeElement(f4, 0.0f, f5, 0.0f, 10));
    }

    public static f n(f fVar) {
        WrapContentElement a2;
        b.C0098b c0098b = a.C0097a.k;
        j.f(fVar, "<this>");
        if (j.a(c0098b, c0098b)) {
            a2 = f;
        } else if (j.a(c0098b, a.C0097a.j)) {
            a2 = g;
        } else {
            a2 = WrapContentElement.a.a(c0098b, false);
        }
        return fVar.o(a2);
    }

    public static f o(f fVar, com.amazon.aps.iva.a1.b bVar, int i2) {
        WrapContentElement b2;
        int i3 = i2 & 1;
        com.amazon.aps.iva.a1.b bVar2 = a.C0097a.e;
        if (i3 != 0) {
            bVar = bVar2;
        }
        j.f(fVar, "<this>");
        j.f(bVar, "align");
        if (j.a(bVar, bVar2)) {
            b2 = h;
        } else if (j.a(bVar, a.C0097a.a)) {
            b2 = i;
        } else {
            b2 = WrapContentElement.a.b(bVar, false);
        }
        return fVar.o(b2);
    }

    public static f p(f fVar) {
        WrapContentElement c2;
        b.a aVar = a.C0097a.n;
        j.f(fVar, "<this>");
        if (j.a(aVar, aVar)) {
            c2 = d;
        } else if (j.a(aVar, a.C0097a.m)) {
            c2 = e;
        } else {
            c2 = WrapContentElement.a.c(aVar, false);
        }
        return fVar.o(c2);
    }
}

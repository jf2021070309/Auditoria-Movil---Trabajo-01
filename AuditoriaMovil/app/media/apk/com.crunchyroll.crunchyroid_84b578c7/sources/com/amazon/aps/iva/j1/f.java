package com.amazon.aps.iva.j1;

import com.amazon.aps.iva.e4.t0;
import com.amazon.aps.iva.q.c0;
/* compiled from: PathNode.kt */
/* loaded from: classes.dex */
public abstract class f {
    public final boolean a;
    public final boolean b;

    /* compiled from: PathNode.kt */
    /* loaded from: classes.dex */
    public static final class a extends f {
        public final float c;
        public final float d;
        public final float e;
        public final boolean f;
        public final boolean g;
        public final float h;
        public final float i;

        public a(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            super(false, false, 3);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = z;
            this.g = z2;
            this.h = f4;
            this.i = f5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (Float.compare(this.c, aVar.c) == 0 && Float.compare(this.d, aVar.d) == 0 && Float.compare(this.e, aVar.e) == 0 && this.f == aVar.f && this.g == aVar.g && Float.compare(this.h, aVar.h) == 0 && Float.compare(this.i, aVar.i) == 0) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int b = t0.b(this.e, t0.b(this.d, Float.hashCode(this.c) * 31, 31), 31);
            int i = 1;
            boolean z = this.f;
            int i2 = z;
            if (z != 0) {
                i2 = 1;
            }
            int i3 = (b + i2) * 31;
            boolean z2 = this.g;
            if (!z2) {
                i = z2 ? 1 : 0;
            }
            return Float.hashCode(this.i) + t0.b(this.h, (i3 + i) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ArcTo(horizontalEllipseRadius=");
            sb.append(this.c);
            sb.append(", verticalEllipseRadius=");
            sb.append(this.d);
            sb.append(", theta=");
            sb.append(this.e);
            sb.append(", isMoreThanHalf=");
            sb.append(this.f);
            sb.append(", isPositiveArc=");
            sb.append(this.g);
            sb.append(", arcStartX=");
            sb.append(this.h);
            sb.append(", arcStartY=");
            return c0.b(sb, this.i, ')');
        }
    }

    /* compiled from: PathNode.kt */
    /* loaded from: classes.dex */
    public static final class b extends f {
        public static final b c = new b();

        public b() {
            super(false, false, 3);
        }
    }

    /* compiled from: PathNode.kt */
    /* loaded from: classes.dex */
    public static final class c extends f {
        public final float c;
        public final float d;
        public final float e;
        public final float f;
        public final float g;
        public final float h;

        public c(float f, float f2, float f3, float f4, float f5, float f6) {
            super(true, false, 2);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
            this.g = f5;
            this.h = f6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (Float.compare(this.c, cVar.c) == 0 && Float.compare(this.d, cVar.d) == 0 && Float.compare(this.e, cVar.e) == 0 && Float.compare(this.f, cVar.f) == 0 && Float.compare(this.g, cVar.g) == 0 && Float.compare(this.h, cVar.h) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(this.h) + t0.b(this.g, t0.b(this.f, t0.b(this.e, t0.b(this.d, Float.hashCode(this.c) * 31, 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CurveTo(x1=");
            sb.append(this.c);
            sb.append(", y1=");
            sb.append(this.d);
            sb.append(", x2=");
            sb.append(this.e);
            sb.append(", y2=");
            sb.append(this.f);
            sb.append(", x3=");
            sb.append(this.g);
            sb.append(", y3=");
            return c0.b(sb, this.h, ')');
        }
    }

    /* compiled from: PathNode.kt */
    /* loaded from: classes.dex */
    public static final class d extends f {
        public final float c;

        public d(float f) {
            super(false, false, 3);
            this.c = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && Float.compare(this.c, ((d) obj).c) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(this.c);
        }

        public final String toString() {
            return c0.b(new StringBuilder("HorizontalTo(x="), this.c, ')');
        }
    }

    /* compiled from: PathNode.kt */
    /* loaded from: classes.dex */
    public static final class e extends f {
        public final float c;
        public final float d;

        public e(float f, float f2) {
            super(false, false, 3);
            this.c = f;
            this.d = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (Float.compare(this.c, eVar.c) == 0 && Float.compare(this.d, eVar.d) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LineTo(x=");
            sb.append(this.c);
            sb.append(", y=");
            return c0.b(sb, this.d, ')');
        }
    }

    /* compiled from: PathNode.kt */
    /* renamed from: com.amazon.aps.iva.j1.f$f  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0395f extends f {
        public final float c;
        public final float d;

        public C0395f(float f, float f2) {
            super(false, false, 3);
            this.c = f;
            this.d = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0395f)) {
                return false;
            }
            C0395f c0395f = (C0395f) obj;
            if (Float.compare(this.c, c0395f.c) == 0 && Float.compare(this.d, c0395f.d) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MoveTo(x=");
            sb.append(this.c);
            sb.append(", y=");
            return c0.b(sb, this.d, ')');
        }
    }

    /* compiled from: PathNode.kt */
    /* loaded from: classes.dex */
    public static final class g extends f {
        public final float c;
        public final float d;
        public final float e;
        public final float f;

        public g(float f, float f2, float f3, float f4) {
            super(false, true, 1);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            if (Float.compare(this.c, gVar.c) == 0 && Float.compare(this.d, gVar.d) == 0 && Float.compare(this.e, gVar.e) == 0 && Float.compare(this.f, gVar.f) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(this.f) + t0.b(this.e, t0.b(this.d, Float.hashCode(this.c) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("QuadTo(x1=");
            sb.append(this.c);
            sb.append(", y1=");
            sb.append(this.d);
            sb.append(", x2=");
            sb.append(this.e);
            sb.append(", y2=");
            return c0.b(sb, this.f, ')');
        }
    }

    /* compiled from: PathNode.kt */
    /* loaded from: classes.dex */
    public static final class h extends f {
        public final float c;
        public final float d;
        public final float e;
        public final float f;

        public h(float f, float f2, float f3, float f4) {
            super(true, false, 2);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            if (Float.compare(this.c, hVar.c) == 0 && Float.compare(this.d, hVar.d) == 0 && Float.compare(this.e, hVar.e) == 0 && Float.compare(this.f, hVar.f) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(this.f) + t0.b(this.e, t0.b(this.d, Float.hashCode(this.c) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ReflectiveCurveTo(x1=");
            sb.append(this.c);
            sb.append(", y1=");
            sb.append(this.d);
            sb.append(", x2=");
            sb.append(this.e);
            sb.append(", y2=");
            return c0.b(sb, this.f, ')');
        }
    }

    /* compiled from: PathNode.kt */
    /* loaded from: classes.dex */
    public static final class i extends f {
        public final float c;
        public final float d;

        public i(float f, float f2) {
            super(false, true, 1);
            this.c = f;
            this.d = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (Float.compare(this.c, iVar.c) == 0 && Float.compare(this.d, iVar.d) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ReflectiveQuadTo(x=");
            sb.append(this.c);
            sb.append(", y=");
            return c0.b(sb, this.d, ')');
        }
    }

    /* compiled from: PathNode.kt */
    /* loaded from: classes.dex */
    public static final class j extends f {
        public final float c;
        public final float d;
        public final float e;
        public final boolean f;
        public final boolean g;
        public final float h;
        public final float i;

        public j(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            super(false, false, 3);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = z;
            this.g = z2;
            this.h = f4;
            this.i = f5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            if (Float.compare(this.c, jVar.c) == 0 && Float.compare(this.d, jVar.d) == 0 && Float.compare(this.e, jVar.e) == 0 && this.f == jVar.f && this.g == jVar.g && Float.compare(this.h, jVar.h) == 0 && Float.compare(this.i, jVar.i) == 0) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int b = t0.b(this.e, t0.b(this.d, Float.hashCode(this.c) * 31, 31), 31);
            int i = 1;
            boolean z = this.f;
            int i2 = z;
            if (z != 0) {
                i2 = 1;
            }
            int i3 = (b + i2) * 31;
            boolean z2 = this.g;
            if (!z2) {
                i = z2 ? 1 : 0;
            }
            return Float.hashCode(this.i) + t0.b(this.h, (i3 + i) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
            sb.append(this.c);
            sb.append(", verticalEllipseRadius=");
            sb.append(this.d);
            sb.append(", theta=");
            sb.append(this.e);
            sb.append(", isMoreThanHalf=");
            sb.append(this.f);
            sb.append(", isPositiveArc=");
            sb.append(this.g);
            sb.append(", arcStartDx=");
            sb.append(this.h);
            sb.append(", arcStartDy=");
            return c0.b(sb, this.i, ')');
        }
    }

    /* compiled from: PathNode.kt */
    /* loaded from: classes.dex */
    public static final class k extends f {
        public final float c;
        public final float d;
        public final float e;
        public final float f;
        public final float g;
        public final float h;

        public k(float f, float f2, float f3, float f4, float f5, float f6) {
            super(true, false, 2);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
            this.g = f5;
            this.h = f6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            if (Float.compare(this.c, kVar.c) == 0 && Float.compare(this.d, kVar.d) == 0 && Float.compare(this.e, kVar.e) == 0 && Float.compare(this.f, kVar.f) == 0 && Float.compare(this.g, kVar.g) == 0 && Float.compare(this.h, kVar.h) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(this.h) + t0.b(this.g, t0.b(this.f, t0.b(this.e, t0.b(this.d, Float.hashCode(this.c) * 31, 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
            sb.append(this.c);
            sb.append(", dy1=");
            sb.append(this.d);
            sb.append(", dx2=");
            sb.append(this.e);
            sb.append(", dy2=");
            sb.append(this.f);
            sb.append(", dx3=");
            sb.append(this.g);
            sb.append(", dy3=");
            return c0.b(sb, this.h, ')');
        }
    }

    /* compiled from: PathNode.kt */
    /* loaded from: classes.dex */
    public static final class l extends f {
        public final float c;

        public l(float f) {
            super(false, false, 3);
            this.c = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof l) && Float.compare(this.c, ((l) obj).c) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(this.c);
        }

        public final String toString() {
            return c0.b(new StringBuilder("RelativeHorizontalTo(dx="), this.c, ')');
        }
    }

    /* compiled from: PathNode.kt */
    /* loaded from: classes.dex */
    public static final class m extends f {
        public final float c;
        public final float d;

        public m(float f, float f2) {
            super(false, false, 3);
            this.c = f;
            this.d = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            if (Float.compare(this.c, mVar.c) == 0 && Float.compare(this.d, mVar.d) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeLineTo(dx=");
            sb.append(this.c);
            sb.append(", dy=");
            return c0.b(sb, this.d, ')');
        }
    }

    /* compiled from: PathNode.kt */
    /* loaded from: classes.dex */
    public static final class n extends f {
        public final float c;
        public final float d;

        public n(float f, float f2) {
            super(false, false, 3);
            this.c = f;
            this.d = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            if (Float.compare(this.c, nVar.c) == 0 && Float.compare(this.d, nVar.d) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeMoveTo(dx=");
            sb.append(this.c);
            sb.append(", dy=");
            return c0.b(sb, this.d, ')');
        }
    }

    /* compiled from: PathNode.kt */
    /* loaded from: classes.dex */
    public static final class o extends f {
        public final float c;
        public final float d;
        public final float e;
        public final float f;

        public o(float f, float f2, float f3, float f4) {
            super(false, true, 1);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            if (Float.compare(this.c, oVar.c) == 0 && Float.compare(this.d, oVar.d) == 0 && Float.compare(this.e, oVar.e) == 0 && Float.compare(this.f, oVar.f) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(this.f) + t0.b(this.e, t0.b(this.d, Float.hashCode(this.c) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeQuadTo(dx1=");
            sb.append(this.c);
            sb.append(", dy1=");
            sb.append(this.d);
            sb.append(", dx2=");
            sb.append(this.e);
            sb.append(", dy2=");
            return c0.b(sb, this.f, ')');
        }
    }

    /* compiled from: PathNode.kt */
    /* loaded from: classes.dex */
    public static final class p extends f {
        public final float c;
        public final float d;
        public final float e;
        public final float f;

        public p(float f, float f2, float f3, float f4) {
            super(true, false, 2);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            if (Float.compare(this.c, pVar.c) == 0 && Float.compare(this.d, pVar.d) == 0 && Float.compare(this.e, pVar.e) == 0 && Float.compare(this.f, pVar.f) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(this.f) + t0.b(this.e, t0.b(this.d, Float.hashCode(this.c) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
            sb.append(this.c);
            sb.append(", dy1=");
            sb.append(this.d);
            sb.append(", dx2=");
            sb.append(this.e);
            sb.append(", dy2=");
            return c0.b(sb, this.f, ')');
        }
    }

    /* compiled from: PathNode.kt */
    /* loaded from: classes.dex */
    public static final class q extends f {
        public final float c;
        public final float d;

        public q(float f, float f2) {
            super(false, true, 1);
            this.c = f;
            this.d = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            if (Float.compare(this.c, qVar.c) == 0 && Float.compare(this.d, qVar.d) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeReflectiveQuadTo(dx=");
            sb.append(this.c);
            sb.append(", dy=");
            return c0.b(sb, this.d, ')');
        }
    }

    /* compiled from: PathNode.kt */
    /* loaded from: classes.dex */
    public static final class r extends f {
        public final float c;

        public r(float f) {
            super(false, false, 3);
            this.c = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof r) && Float.compare(this.c, ((r) obj).c) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(this.c);
        }

        public final String toString() {
            return c0.b(new StringBuilder("RelativeVerticalTo(dy="), this.c, ')');
        }
    }

    /* compiled from: PathNode.kt */
    /* loaded from: classes.dex */
    public static final class s extends f {
        public final float c;

        public s(float f) {
            super(false, false, 3);
            this.c = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof s) && Float.compare(this.c, ((s) obj).c) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(this.c);
        }

        public final String toString() {
            return c0.b(new StringBuilder("VerticalTo(y="), this.c, ')');
        }
    }

    public f(boolean z, boolean z2, int i2) {
        z = (i2 & 1) != 0 ? false : z;
        z2 = (i2 & 2) != 0 ? false : z2;
        this.a = z;
        this.b = z2;
    }
}

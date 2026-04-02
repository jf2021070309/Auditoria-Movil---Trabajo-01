package androidx.compose.foundation.layout;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.d0.o1;
import com.amazon.aps.iva.d0.p1;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.v1.p2;
import com.amazon.aps.iva.v1.v1;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: Padding.kt */
/* loaded from: classes.dex */
public final class d {

    /* compiled from: Padding.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<v1, q> {
        public final /* synthetic */ float h;
        public final /* synthetic */ float i;
        public final /* synthetic */ float j;
        public final /* synthetic */ float k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f, float f2, float f3, float f4) {
            super(1);
            this.h = f;
            this.i = f2;
            this.j = f3;
            this.k = f4;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(v1 v1Var) {
            v1 v1Var2 = v1Var;
            j.f(v1Var2, "$this$$receiver");
            com.amazon.aps.iva.o2.e eVar = new com.amazon.aps.iva.o2.e(this.h);
            p2 p2Var = v1Var2.a;
            p2Var.b(eVar, "start");
            p2Var.b(new com.amazon.aps.iva.o2.e(this.i), "top");
            p2Var.b(new com.amazon.aps.iva.o2.e(this.j), "end");
            p2Var.b(new com.amazon.aps.iva.o2.e(this.k), "bottom");
            return q.a;
        }
    }

    /* compiled from: Padding.kt */
    /* loaded from: classes.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<v1, q> {
        public final /* synthetic */ float h;
        public final /* synthetic */ float i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f, float f2) {
            super(1);
            this.h = f;
            this.i = f2;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(v1 v1Var) {
            v1 v1Var2 = v1Var;
            j.f(v1Var2, "$this$$receiver");
            com.amazon.aps.iva.o2.e eVar = new com.amazon.aps.iva.o2.e(this.h);
            p2 p2Var = v1Var2.a;
            p2Var.b(eVar, "horizontal");
            p2Var.b(new com.amazon.aps.iva.o2.e(this.i), "vertical");
            return q.a;
        }
    }

    /* compiled from: Padding.kt */
    /* loaded from: classes.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.l<v1, q> {
        public c(float f) {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(v1 v1Var) {
            j.f(v1Var, "$this$$receiver");
            return q.a;
        }
    }

    /* compiled from: Padding.kt */
    /* renamed from: androidx.compose.foundation.layout.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0014d extends l implements com.amazon.aps.iva.xb0.l<v1, q> {
        public final /* synthetic */ o1 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0014d(o1 o1Var) {
            super(1);
            this.h = o1Var;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(v1 v1Var) {
            v1 v1Var2 = v1Var;
            j.f(v1Var2, "$this$$receiver");
            v1Var2.a.b(this.h, "paddingValues");
            return q.a;
        }
    }

    public static p1 a(float f, int i) {
        float f2;
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        } else {
            f2 = 0.0f;
        }
        return new p1(f, f2, f, f2);
    }

    public static final float b(o1 o1Var, com.amazon.aps.iva.o2.l lVar) {
        j.f(o1Var, "<this>");
        j.f(lVar, "layoutDirection");
        if (lVar == com.amazon.aps.iva.o2.l.Ltr) {
            return o1Var.c(lVar);
        }
        return o1Var.b(lVar);
    }

    public static final float c(o1 o1Var, com.amazon.aps.iva.o2.l lVar) {
        j.f(o1Var, "<this>");
        j.f(lVar, "layoutDirection");
        if (lVar == com.amazon.aps.iva.o2.l.Ltr) {
            return o1Var.b(lVar);
        }
        return o1Var.c(lVar);
    }

    public static final f d(f fVar, o1 o1Var) {
        j.f(fVar, "<this>");
        j.f(o1Var, "paddingValues");
        return fVar.o(new PaddingValuesElement(o1Var, new C0014d(o1Var)));
    }

    public static final f e(f fVar, float f) {
        j.f(fVar, "$this$padding");
        return fVar.o(new PaddingElement(f, f, f, f, new c(f)));
    }

    public static final f f(f fVar, float f, float f2) {
        j.f(fVar, "$this$padding");
        return fVar.o(new PaddingElement(f, f2, f, f2, new b(f, f2)));
    }

    public static f g(f fVar, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        return f(fVar, f, f2);
    }

    public static final f h(f fVar, float f, float f2, float f3, float f4) {
        j.f(fVar, "$this$padding");
        return fVar.o(new PaddingElement(f, f2, f3, f4, new a(f, f2, f3, f4)));
    }

    public static f i(f fVar, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        if ((i & 4) != 0) {
            f3 = 0;
        }
        if ((i & 8) != 0) {
            f4 = 0;
        }
        return h(fVar, f, f2, f3, f4);
    }
}

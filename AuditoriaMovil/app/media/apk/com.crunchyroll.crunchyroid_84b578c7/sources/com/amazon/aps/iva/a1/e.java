package com.amazon.aps.iva.a1;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.v1.v1;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.xb0.q;
import com.amazon.aps.iva.yb0.h0;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: ComposedModifier.kt */
/* loaded from: classes.dex */
public final class e {

    /* compiled from: ComposedModifier.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<f.b, Boolean> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(f.b bVar) {
            f.b bVar2 = bVar;
            j.f(bVar2, "it");
            return Boolean.valueOf(!(bVar2 instanceof d));
        }
    }

    /* compiled from: ComposedModifier.kt */
    /* loaded from: classes.dex */
    public static final class b extends l implements p<f, f.b, f> {
        public final /* synthetic */ i h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i iVar) {
            super(2);
            this.h = iVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final f invoke(f fVar, f.b bVar) {
            f fVar2 = fVar;
            f.b bVar2 = bVar;
            j.f(fVar2, "acc");
            j.f(bVar2, "element");
            if (bVar2 instanceof d) {
                q<f, i, Integer, f> qVar = ((d) bVar2).d;
                j.d(qVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                h0.e(3, qVar);
                int i = f.a;
                f.a aVar = f.a.c;
                i iVar = this.h;
                bVar2 = e.c(iVar, qVar.invoke(aVar, iVar, 0));
            }
            return fVar2.o(bVar2);
        }
    }

    public static final f a(f fVar, com.amazon.aps.iva.xb0.l<? super v1, com.amazon.aps.iva.kb0.q> lVar, q<? super f, ? super i, ? super Integer, ? extends f> qVar) {
        j.f(fVar, "<this>");
        j.f(lVar, "inspectorInfo");
        j.f(qVar, "factory");
        return fVar.o(new d(lVar, qVar));
    }

    public static final f c(i iVar, f fVar) {
        j.f(iVar, "<this>");
        j.f(fVar, "modifier");
        if (fVar.g(a.h)) {
            return fVar;
        }
        iVar.s(1219399079);
        int i = f.a;
        f fVar2 = (f) fVar.a(f.a.c, new b(iVar));
        iVar.G();
        return fVar2;
    }
}

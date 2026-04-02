package com.amazon.aps.iva.fs;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.js.b0;
import com.amazon.aps.iva.s1.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: AnalyticsClickedState.kt */
/* loaded from: classes2.dex */
public final class a {

    /* compiled from: AnalyticsClickedState.kt */
    /* renamed from: com.amazon.aps.iva.fs.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0280a extends l implements com.amazon.aps.iva.xb0.l<q, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<b0, com.amazon.aps.iva.kb0.q> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0280a(com.amazon.aps.iva.xb0.l<? super b0, com.amazon.aps.iva.kb0.q> lVar) {
            super(1);
            this.h = lVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(q qVar) {
            q qVar2 = qVar;
            j.f(qVar2, "coordinates");
            this.h.invoke(com.amazon.aps.iva.ff0.b.z(com.amazon.aps.iva.ff0.b.n((((int) (qVar2.a() >> 32)) / 2) + ((int) com.amazon.aps.iva.e1.c.c(com.amazon.aps.iva.gd0.j.h(qVar2))), ((int) (com.amazon.aps.iva.gd0.j.f(qVar2).a() >> 32)) / 2), com.amazon.aps.iva.ff0.b.n((com.amazon.aps.iva.o2.j.b(qVar2.a()) / 2) + ((int) com.amazon.aps.iva.e1.c.d(com.amazon.aps.iva.gd0.j.h(qVar2))), com.amazon.aps.iva.o2.j.b(com.amazon.aps.iva.gd0.j.f(qVar2).a()) / 2)));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public static final f a(f fVar, com.amazon.aps.iva.xb0.l<? super b0, com.amazon.aps.iva.kb0.q> lVar) {
        j.f(fVar, "<this>");
        return androidx.compose.ui.layout.c.a(fVar, new C0280a(lVar));
    }
}

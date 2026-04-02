package com.ellation.crunchyroll.cast.expanded;

import androidx.compose.foundation.c;
import androidx.compose.foundation.layout.e;
import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.ao.a;
import com.amazon.aps.iva.cq.b;
import com.amazon.aps.iva.d0.b2;
import com.amazon.aps.iva.f1.p0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.c2;
import com.amazon.aps.iva.o0.d;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.x2;
import com.amazon.aps.iva.s1.d0;
import com.amazon.aps.iva.s1.u;
import com.amazon.aps.iva.u1.e;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import kotlin.Metadata;
/* compiled from: CastControllerActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/amazon/aps/iva/kb0/q;", "invoke", "(Lcom/amazon/aps/iva/o0/i;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CastControllerActivity$showOverlay$1 extends l implements p<i, Integer, q> {
    final /* synthetic */ com.amazon.aps.iva.xb0.q<f, i, Integer, q> $overlay;

    /* compiled from: CastControllerActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/amazon/aps/iva/kb0/q;", "invoke", "(Lcom/amazon/aps/iva/o0/i;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: com.ellation.crunchyroll.cast.expanded.CastControllerActivity$showOverlay$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends l implements p<i, Integer, q> {
        final /* synthetic */ com.amazon.aps.iva.xb0.q<f, i, Integer, q> $overlay;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(com.amazon.aps.iva.xb0.q<? super f, ? super i, ? super Integer, q> qVar) {
            super(2);
            this.$overlay = qVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public /* bridge */ /* synthetic */ q invoke(i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return q.a;
        }

        public final void invoke(i iVar, int i) {
            f b;
            if ((i & 11) == 2 && iVar.h()) {
                iVar.A();
                return;
            }
            e0.b bVar = e0.a;
            f.a aVar = f.a.c;
            b = c.b(e.d(aVar), a.A, p0.a);
            com.amazon.aps.iva.xb0.q<f, i, Integer, q> qVar = this.$overlay;
            iVar.s(733328855);
            d0 c = com.amazon.aps.iva.d0.f.c(a.C0097a.a, false, iVar);
            iVar.s(-1323940314);
            int S = b.S(iVar);
            c2 l = iVar.l();
            com.amazon.aps.iva.u1.e.o0.getClass();
            e.a aVar2 = e.a.b;
            com.amazon.aps.iva.v0.a a = u.a(b);
            if (iVar.j() instanceof d) {
                iVar.z();
                if (iVar.e()) {
                    iVar.w(aVar2);
                } else {
                    iVar.m();
                }
                b.k0(iVar, c, e.a.e);
                b.k0(iVar, l, e.a.d);
                e.a.C0752a c0752a = e.a.f;
                if (iVar.e() || !j.a(iVar.t(), Integer.valueOf(S))) {
                    b2.c(S, iVar, S, c0752a);
                }
                com.amazon.aps.iva.b8.i.c(0, a, new x2(iVar), iVar, 2058660585);
                qVar.invoke(androidx.compose.foundation.layout.b.a.c(aVar, a.C0097a.e), iVar, 0);
                iVar.G();
                iVar.o();
                iVar.G();
                iVar.G();
                return;
            }
            b.W();
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CastControllerActivity$showOverlay$1(com.amazon.aps.iva.xb0.q<? super f, ? super i, ? super Integer, q> qVar) {
        super(2);
        this.$overlay = qVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public /* bridge */ /* synthetic */ q invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return q.a;
    }

    public final void invoke(i iVar, int i) {
        if ((i & 11) == 2 && iVar.h()) {
            iVar.A();
            return;
        }
        e0.b bVar = e0.a;
        com.amazon.aps.iva.ao.c.a(com.amazon.aps.iva.v0.b.b(iVar, -1428599503, new AnonymousClass1(this.$overlay)), iVar, 6);
    }
}

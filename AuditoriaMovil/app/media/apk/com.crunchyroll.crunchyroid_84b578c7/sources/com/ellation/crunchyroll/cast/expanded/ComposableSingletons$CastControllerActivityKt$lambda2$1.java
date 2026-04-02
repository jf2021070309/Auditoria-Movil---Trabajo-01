package com.ellation.crunchyroll.cast.expanded;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.xb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import kotlin.Metadata;
/* compiled from: CastControllerActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/amazon/aps/iva/a1/f;", "modifier", "Lcom/amazon/aps/iva/kb0/q;", "invoke", "(Lcom/amazon/aps/iva/a1/f;Lcom/amazon/aps/iva/o0/i;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: com.ellation.crunchyroll.cast.expanded.ComposableSingletons$CastControllerActivityKt$lambda-2$1  reason: invalid class name */
/* loaded from: classes2.dex */
public final class ComposableSingletons$CastControllerActivityKt$lambda2$1 extends l implements q<f, i, Integer, com.amazon.aps.iva.kb0.q> {
    public static final ComposableSingletons$CastControllerActivityKt$lambda2$1 INSTANCE = new ComposableSingletons$CastControllerActivityKt$lambda2$1();

    public ComposableSingletons$CastControllerActivityKt$lambda2$1() {
        super(3);
    }

    @Override // com.amazon.aps.iva.xb0.q
    public /* bridge */ /* synthetic */ com.amazon.aps.iva.kb0.q invoke(f fVar, i iVar, Integer num) {
        invoke(fVar, iVar, num.intValue());
        return com.amazon.aps.iva.kb0.q.a;
    }

    public final void invoke(f fVar, i iVar, int i) {
        j.f(fVar, "modifier");
        if ((i & 14) == 0) {
            i |= iVar.H(fVar) ? 4 : 2;
        }
        if ((i & 91) == 18 && iVar.h()) {
            iVar.A();
            return;
        }
        e0.b bVar = e0.a;
        com.amazon.aps.iva.nf.j.a(null, fVar, iVar, i & 14, 2);
    }
}

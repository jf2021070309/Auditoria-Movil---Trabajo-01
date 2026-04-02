package com.amazon.aps.iva.q10;

import android.content.Context;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.q10.e;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.model.Panel;
import java.util.List;
/* compiled from: SubgenreCarouselAdapter.kt */
/* loaded from: classes2.dex */
public final class b extends l implements p<i, Integer, q> {
    public final /* synthetic */ d h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, int i) {
        super(2);
        this.h = dVar;
        this.i = i;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(i iVar, Integer num) {
        boolean a;
        float f;
        float f2;
        i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            d dVar = this.h;
            List<e> list = dVar.a;
            int i = this.i;
            e eVar = list.get(i);
            boolean z = eVar instanceof e.c;
            f.a aVar = f.a.c;
            if (z) {
                iVar2.s(2116601347);
                if (k.n((Context) iVar2.i(androidx.compose.ui.platform.d.b)).c()) {
                    f2 = 160;
                } else {
                    f2 = 140;
                }
                com.amazon.aps.iva.wz.a.a(((e.c) eVar).a, new a(dVar, eVar, i), dVar.b, androidx.compose.foundation.layout.e.l(aVar, f2), dVar.e, iVar2, 33280 | Panel.$stable, 0);
                iVar2.G();
            } else if (eVar instanceof e.d) {
                iVar2.s(2116601884);
                f.a(dVar.c, null, iVar2, 0, 2);
                iVar2.G();
            } else {
                if (eVar instanceof e.b) {
                    a = true;
                } else {
                    a = j.a(eVar, e.a.a);
                }
                if (a) {
                    iVar2.s(2116602034);
                    if (k.n((Context) iVar2.i(androidx.compose.ui.platform.d.b)).c()) {
                        f = 160;
                    } else {
                        f = 140;
                    }
                    com.amazon.aps.iva.wz.b.a(androidx.compose.foundation.layout.e.l(aVar, f), iVar2, 0, 0);
                    iVar2.G();
                } else {
                    iVar2.s(2116602302);
                    iVar2.G();
                }
            }
        }
        return q.a;
    }
}

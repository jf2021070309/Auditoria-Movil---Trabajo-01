package com.amazon.aps.iva.ol;

import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.i5.d0;
import com.amazon.aps.iva.i5.f0;
import com.amazon.aps.iva.i5.u;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.lb0.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PlayerAudioSettingsViewModel.kt */
/* loaded from: classes2.dex */
public final class j extends f0 implements f {
    public final com.amazon.aps.iva.kh.e b;
    public final com.amazon.aps.iva.tl.c c;
    public final com.amazon.aps.iva.xb0.a<Boolean> d;
    public final v<List<com.amazon.aps.iva.nl.a>> e;
    public final u f;

    public j(com.amazon.aps.iva.cj.h hVar, com.amazon.aps.iva.kh.e eVar, com.amazon.aps.iva.tl.b bVar, com.amazon.aps.iva.xb0.a aVar) {
        com.amazon.aps.iva.yb0.j.f(eVar, "optionsProvider");
        com.amazon.aps.iva.yb0.j.f(bVar, "settingsMonitor");
        com.amazon.aps.iva.yb0.j.f(aVar, "isPremiumUser");
        this.b = eVar;
        this.c = bVar;
        this.d = aVar;
        androidx.lifecycle.c b = com.amazon.aps.iva.i5.j.b(new h(com.amazon.aps.iva.dg.b.m(new i(hVar.getState())), this), w.D(this).getCoroutineContext());
        this.e = b;
        this.f = d0.b(b, g.h);
    }

    @Override // com.amazon.aps.iva.nl.q
    public final LiveData A7() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.nl.q
    public final LiveData<com.amazon.aps.iva.nl.a> O5() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.nl.q
    public final void m2(com.amazon.aps.iva.nl.a aVar) {
        ArrayList arrayList;
        com.amazon.aps.iva.yb0.j.f(aVar, "option");
        v<List<com.amazon.aps.iva.nl.a>> vVar = this.e;
        List<com.amazon.aps.iva.nl.a> d = vVar.d();
        Object obj = null;
        if (d != null) {
            List<com.amazon.aps.iva.nl.a> list = d;
            arrayList = new ArrayList(r.Y(list));
            for (com.amazon.aps.iva.nl.a aVar2 : list) {
                boolean a = com.amazon.aps.iva.yb0.j.a(aVar2.a, aVar.a);
                boolean z = aVar2.c;
                boolean z2 = aVar2.e;
                String str = aVar2.a;
                com.amazon.aps.iva.yb0.j.f(str, "mediaId");
                String str2 = aVar2.b;
                com.amazon.aps.iva.yb0.j.f(str2, "text");
                arrayList.add(new com.amazon.aps.iva.nl.a(str, str2, z, a, z2));
            }
        } else {
            arrayList = null;
        }
        vVar.k(arrayList);
        List<com.amazon.aps.iva.nl.a> d2 = vVar.d();
        if (d2 != null) {
            Iterator it = d2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((com.amazon.aps.iva.nl.a) next).d) {
                    obj = next;
                    break;
                }
            }
            com.amazon.aps.iva.nl.a aVar3 = (com.amazon.aps.iva.nl.a) obj;
            if (aVar3 != null) {
                this.c.d().k(new com.amazon.aps.iva.ez.d<>(aVar3));
            }
        }
    }
}

package com.amazon.aps.iva.o40;

import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.ellation.crunchyroll.extension.LifecycleExtensionsKt;
import java.util.LinkedHashMap;
/* compiled from: ShowContentInteractorPool.kt */
/* loaded from: classes2.dex */
public final class k {
    public final l<j, c> a;
    public final LinkedHashMap b = new LinkedHashMap();

    /* compiled from: ShowContentInteractorPool.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ j i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j jVar) {
            super(0);
            this.i = jVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            LinkedHashMap linkedHashMap = k.this.b;
            j jVar = this.i;
            d dVar = (d) linkedHashMap.get(jVar);
            if (dVar != null) {
                int i = dVar.b - 1;
                dVar.b = i;
                if (i == 0) {
                    linkedHashMap.remove(jVar);
                }
            }
            return q.a;
        }
    }

    public k(e eVar) {
        this.a = eVar;
    }

    public final c a(j jVar, o oVar) {
        com.amazon.aps.iva.yb0.j.f(oVar, "lifecycleOwner");
        LinkedHashMap linkedHashMap = this.b;
        Object obj = linkedHashMap.get(jVar);
        if (obj == null) {
            obj = new d(this.a.invoke(jVar));
            linkedHashMap.put(jVar, obj);
        }
        d dVar = (d) obj;
        dVar.b++;
        LifecycleExtensionsKt.b(oVar.getLifecycle(), new a(jVar));
        return dVar.a;
    }
}

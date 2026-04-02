package com.amazon.aps.iva.c4;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.d4.d;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.xb0.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: SharedPreferencesMigration.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1", f = "SharedPreferencesMigration.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class i extends com.amazon.aps.iva.qb0.i implements p<com.amazon.aps.iva.d4.d, com.amazon.aps.iva.ob0.d<? super Boolean>, Object> {
    public /* synthetic */ Object h;
    public final /* synthetic */ Set<String> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Set<String> set, com.amazon.aps.iva.ob0.d<? super i> dVar) {
        super(2, dVar);
        this.i = set;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        i iVar = new i(this.i, dVar);
        iVar.h = obj;
        return iVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.d4.d dVar, com.amazon.aps.iva.ob0.d<? super Boolean> dVar2) {
        return ((i) create(dVar, dVar2)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        x.i0(obj);
        Set<d.a<?>> keySet = ((com.amazon.aps.iva.d4.d) this.h).a().keySet();
        ArrayList arrayList = new ArrayList(r.Y(keySet));
        Iterator<T> it = keySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((d.a) it.next()).a);
        }
        LinkedHashSet linkedHashSet = j.a;
        boolean z = true;
        Set<String> set = this.i;
        if (set != linkedHashSet) {
            Set<String> set2 = set;
            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                for (String str : set2) {
                    if (Boolean.valueOf(!arrayList.contains(str)).booleanValue()) {
                        break;
                    }
                }
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

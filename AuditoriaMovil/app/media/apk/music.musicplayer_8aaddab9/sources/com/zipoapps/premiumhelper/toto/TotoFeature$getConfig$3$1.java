package com.zipoapps.premiumhelper.toto;

import android.content.Context;
import android.content.SharedPreferences;
import com.zipoapps.premiumhelper.toto.PostConfigWorker;
import e.j.d.i;
import e.j.d.w;
import e.j.d.y.b;
import e.j.d.y.e.a;
import h.l.c;
import h.o.b.l;
import h.o.c.j;
import h.o.c.k;
import h.t.g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import m.a0;
/* loaded from: classes2.dex */
public final class TotoFeature$getConfig$3$1 extends k implements l<a0<Map<String, ? extends Map<String, ? extends Integer>>>, h.k> {
    public final /* synthetic */ TotoFeature this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotoFeature$getConfig$3$1(TotoFeature totoFeature) {
        super(1);
        this.this$0 = totoFeature;
    }

    @Override // h.o.b.l
    public /* bridge */ /* synthetic */ h.k invoke(a0<Map<String, ? extends Map<String, ? extends Integer>>> a0Var) {
        invoke2((a0<Map<String, Map<String, Integer>>>) a0Var);
        return h.k.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(a0<Map<String, Map<String, Integer>>> a0Var) {
        b bVar;
        i iVar;
        Context context;
        Context context2;
        j.e(a0Var, "result");
        Map<String, Map<String, Integer>> map = a0Var.f9842b;
        if (map != null) {
            String c2 = a0Var.a.f9211f.c("x-country");
            if (c2 == null) {
                c2 = "";
            }
            bVar = this.this$0.configuration;
            List<WeightedValueParameter> asWeightedParamsList = WeightedValueParameterKt.asWeightedParamsList(map);
            Objects.requireNonNull(bVar);
            j.e(asWeightedParamsList, "config");
            j.e(c2, "country");
            a aVar = bVar.M;
            Objects.requireNonNull(aVar);
            j.e(asWeightedParamsList, "config");
            j.e(c2, "country");
            ArrayList arrayList = new ArrayList(w.s(asWeightedParamsList, 10));
            for (WeightedValueParameter weightedValueParameter : asWeightedParamsList) {
                arrayList.add(weightedValueParameter.getName());
            }
            j.e(arrayList, "<this>");
            HashSet hashSet = new HashSet(w.b0(w.s(arrayList, 12)));
            c.i(arrayList, hashSet);
            Set<String> keySet = aVar.f8902b.getAll().keySet();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : keySet) {
                if (!j.a((String) obj, "x-country")) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                String str = (String) next;
                j.d(str, "it");
                if (!g.b(str, "_hash", false, 2)) {
                    arrayList3.add(next);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (!hashSet.contains((String) next2)) {
                    arrayList4.add(next2);
                }
            }
            List<String> j2 = c.j(arrayList4);
            boolean z = !j2.isEmpty();
            SharedPreferences.Editor edit = aVar.f8902b.edit();
            edit.putString("x-country", c2);
            for (String str2 : j2) {
                edit.remove(str2);
                edit.remove(aVar.d(str2));
            }
            edit.apply();
            ArrayList arrayList5 = new ArrayList();
            for (Object obj2 : asWeightedParamsList) {
                String name = ((WeightedValueParameter) obj2).getName();
                String str3 = b.z.a;
                if (!(name == null ? str3 == null : name.equalsIgnoreCase(str3))) {
                    arrayList5.add(obj2);
                }
            }
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                WeightedValueParameter weightedValueParameter2 = (WeightedValueParameter) it3.next();
                int hash = weightedValueParameter2.hash();
                String name2 = weightedValueParameter2.getName();
                Integer valueOf = aVar.f8902b.contains(aVar.d(name2)) ? Integer.valueOf(aVar.f8902b.getInt(aVar.d(name2), -1)) : null;
                if (valueOf == null || hash != valueOf.intValue()) {
                    String pickRandomValue = weightedValueParameter2.pickRandomValue();
                    String name3 = weightedValueParameter2.getName();
                    int hash2 = weightedValueParameter2.hash();
                    SharedPreferences.Editor edit2 = aVar.f8902b.edit();
                    edit2.putString(name3, pickRandomValue);
                    edit2.putInt(aVar.d(name3), hash2);
                    edit2.apply();
                    z = true;
                }
            }
            if (z) {
                PostConfigWorker.Companion companion = PostConfigWorker.Companion;
                context2 = this.this$0.context;
                companion.scheduleNow(context2);
                return;
            }
            iVar = this.this$0.preferences;
            if (((Boolean) iVar.b("post_config_sent", Boolean.FALSE)).booleanValue()) {
                return;
            }
            PostConfigWorker.Companion companion2 = PostConfigWorker.Companion;
            context = this.this$0.context;
            companion2.scheduleNow(context);
        }
    }
}

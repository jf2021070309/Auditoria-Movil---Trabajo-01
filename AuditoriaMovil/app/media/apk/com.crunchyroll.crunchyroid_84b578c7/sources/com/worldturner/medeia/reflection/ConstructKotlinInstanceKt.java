package com.worldturner.medeia.reflection;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.fc0.d;
import com.amazon.aps.iva.fc0.g;
import com.amazon.aps.iva.fc0.k;
import com.amazon.aps.iva.lb0.i0;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lb0.t;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.yb0.e0;
import com.amazon.aps.iva.yb0.j;
import com.worldturner.medeia.parser.JsonTokenData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: constructKotlinInstance.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a0\u0010\b\u001a\u00020\u00042\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u0006\u001aD\u0010\b\u001a\u00020\u00042\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\n0\t2\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\f"}, d2 = {"Lcom/amazon/aps/iva/fc0/d;", "kotlinClass", "", "", "", "kotlinArguments", "Lcom/worldturner/medeia/parser/JsonTokenData;", "lastToken", "constructKotlinInstance", "", "Lcom/amazon/aps/iva/fc0/g;", "kotlinConstructors", "medeia-validator-core"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class ConstructKotlinInstanceKt {
    public static final Object constructKotlinInstance(d<?> dVar, Map<String, ? extends Object> map, JsonTokenData jsonTokenData) {
        j.g(dVar, "kotlinClass");
        j.g(map, "kotlinArguments");
        j.g(jsonTokenData, "lastToken");
        return constructKotlinInstance(dVar, dVar.e(), map, jsonTokenData);
    }

    public static final Object constructKotlinInstance(d<?> dVar, Collection<? extends g<? extends Object>> collection, Map<String, ? extends Object> map, JsonTokenData jsonTokenData) {
        String str;
        com.amazon.aps.iva.kb0.j jVar;
        j.g(dVar, "kotlinClass");
        j.g(collection, "kotlinConstructors");
        j.g(map, "kotlinArguments");
        j.g(jsonTokenData, "lastToken");
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            List<k> parameters = ((g) obj).getParameters();
            ArrayList arrayList2 = new ArrayList(r.Y(parameters));
            for (k kVar : parameters) {
                arrayList2.add(kVar.getName());
            }
            Set<String> keySet = map.keySet();
            j.f(keySet, "<this>");
            Set b1 = x.b1(keySet);
            b1.removeAll(t.f0(arrayList2));
            if (b1.isEmpty()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            ArrayList arrayList4 = new ArrayList();
            Iterator<T> it2 = gVar.getParameters().iterator();
            while (true) {
                if (it2.hasNext()) {
                    k kVar2 = (k) it2.next();
                    if (map.containsKey(kVar2.getName())) {
                        jVar = new com.amazon.aps.iva.kb0.j(kVar2, ConvertTypeKt.convertType(map.get(kVar2.getName()), kVar2.getType()));
                    } else {
                        jVar = null;
                        if (!kVar2.l()) {
                            break;
                        }
                    }
                    if (jVar != null) {
                        arrayList4.add(jVar);
                    }
                } else {
                    jVar = new com.amazon.aps.iva.kb0.j(gVar, i0.Z(arrayList4));
                    break;
                }
            }
            if (jVar != null) {
                arrayList3.add(jVar);
            }
        }
        if (!arrayList3.isEmpty()) {
            com.amazon.aps.iva.kb0.j jVar2 = (com.amazon.aps.iva.kb0.j) x.t0(x.T0(arrayList3, new Comparator<T>() { // from class: com.worldturner.medeia.reflection.ConstructKotlinInstanceKt$constructKotlinInstance$$inlined$sortedBy$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    com.amazon.aps.iva.kb0.j jVar3 = (com.amazon.aps.iva.kb0.j) t;
                    com.amazon.aps.iva.kb0.j jVar4 = (com.amazon.aps.iva.kb0.j) t2;
                    return f1.t(Integer.valueOf(((g) jVar3.b).getParameters().size() - ((Map) jVar3.c).size()), Integer.valueOf(((g) jVar4.b).getParameters().size() - ((Map) jVar4.c).size()));
                }
            }));
            try {
                return ((g) jVar2.b).callBy((Map) jVar2.c);
            } catch (IllegalArgumentException e) {
                Map map2 = (Map) jVar2.c;
                ArrayList arrayList5 = new ArrayList(map2.size());
                for (Map.Entry entry : map2.entrySet()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(((k) entry.getKey()).getName());
                    sb.append(": ");
                    Object value = entry.getValue();
                    if (value == null || (str = e0.a(value.getClass()).j()) == null) {
                        str = "null";
                    }
                    sb.append(str);
                    arrayList5.add(sb.toString());
                }
                throw new IllegalArgumentException("Error during reflective construction of " + dVar + ", provided parameters: " + arrayList5 + " at " + jsonTokenData, e);
            }
        }
        throw new IllegalArgumentException("No kotlinConstructors found for " + dVar + " that can accept just " + map.keySet() + " at " + jsonTokenData);
    }
}

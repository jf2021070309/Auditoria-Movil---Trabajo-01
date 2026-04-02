package com.worldturner.medeia.parser.type;

import com.amazon.aps.iva.fc0.d;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.fc0.n;
import com.amazon.aps.iva.ic0.h;
import com.amazon.aps.iva.ic0.n;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.lb0.i0;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.yb0.e0;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: ObjectType.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a5\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00050\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aG\u0010\n\u001a\u0004\u0018\u00010\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u001c\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00050\u00032\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "value", "", "", "Lcom/amazon/aps/iva/fc0/n;", "prepareProperties", "(Ljava/lang/Object;)Ljava/util/Map;", "kotlinProperties", "kotlinPropertyName", "reflectProperty", "(Ljava/lang/Object;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Object;", "medeia-validator-core"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class ObjectTypeKt {
    public static final <T> Map<String, n<T, ?>> prepareProperties(T t) {
        boolean z;
        j.g(t, "value");
        d a = e0.a(t.getClass());
        j.f(a, "<this>");
        com.amazon.aps.iva.ic0.n<T>.a invoke = ((com.amazon.aps.iva.ic0.n) a).d.invoke();
        invoke.getClass();
        l<Object> lVar = n.a.n[14];
        Object invoke2 = invoke.l.invoke();
        j.e(invoke2, "<get-allNonStaticMembers>(...)");
        ArrayList arrayList = new ArrayList();
        for (T t2 : (Collection) invoke2) {
            h hVar = (h) t2;
            boolean z2 = false;
            if (hVar.o().M() != null) {
                z = true;
            } else {
                z = false;
            }
            if ((!z) && (hVar instanceof com.amazon.aps.iva.fc0.n)) {
                z2 = true;
            }
            if (z2) {
                arrayList.add(t2);
            }
        }
        ArrayList arrayList2 = new ArrayList(r.Y(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.amazon.aps.iva.fc0.n nVar = (com.amazon.aps.iva.fc0.n) it.next();
            arrayList2.add(new com.amazon.aps.iva.kb0.j(nVar.getName(), nVar));
        }
        return i0.Z(arrayList2);
    }

    public static final <T> Object reflectProperty(T t, Map<String, ? extends com.amazon.aps.iva.fc0.n<T, ?>> map, String str) {
        j.g(t, "value");
        j.g(map, "kotlinProperties");
        j.g(str, "kotlinPropertyName");
        com.amazon.aps.iva.fc0.n<T, ?> nVar = map.get(str);
        if (nVar != null) {
            return nVar.get(t);
        }
        StringBuilder c = q.c("Can't find property '", str, "' on object of type ");
        c.append(e0.a(t.getClass()));
        throw new IllegalArgumentException(c.toString());
    }
}

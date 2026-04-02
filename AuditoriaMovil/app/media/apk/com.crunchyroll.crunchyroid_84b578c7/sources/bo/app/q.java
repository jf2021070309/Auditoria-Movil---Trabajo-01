package bo.app;

import com.braze.enums.BrazeDateFormat;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class q {

    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ List b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List list) {
            super(0);
            this.b = list;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Removing non-string keys from map. Removed keys: " + this.b;
        }
    }

    public static final Map a(Map map) {
        com.amazon.aps.iva.yb0.j.f(map, "<this>");
        Set keySet = map.keySet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : keySet) {
            if (obj instanceof String) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = arrayList2;
        if (!arrayList3.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, map, BrazeLogger.Priority.W, (Throwable) null, new a(arrayList3), 2, (Object) null);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() instanceof String) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object value = entry2.getValue();
            if ((value instanceof Date) || (value instanceof Map) || (value instanceof Long) || (value instanceof Integer) || (value instanceof Double) || (value instanceof Boolean) || (value instanceof String) || (value instanceof com.amazon.aps.iva.if0.c) || (value instanceof com.amazon.aps.iva.if0.a) || value == null) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(com.amazon.aps.iva.aq.k.w(linkedHashMap2.size()));
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            Object key = entry3.getKey();
            Object value2 = entry3.getValue();
            if (value2 instanceof Date) {
                value2 = DateTimeUtils.formatDate$default((Date) value2, BrazeDateFormat.LONG, null, 2, null);
            } else if (value2 instanceof com.amazon.aps.iva.if0.a) {
                value2 = a((com.amazon.aps.iva.if0.a) value2);
            } else if (value2 instanceof Map) {
                value2 = a((Map) value2);
            }
            linkedHashMap3.put(key, value2);
        }
        return linkedHashMap3;
    }

    public static final com.amazon.aps.iva.if0.a a(com.amazon.aps.iva.if0.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "<this>");
        com.amazon.aps.iva.if0.a aVar2 = new com.amazon.aps.iva.if0.a();
        int e = aVar.e();
        for (int i = 0; i < e; i++) {
            Object obj = aVar.get(i);
            if (obj instanceof Date) {
                aVar2.put(DateTimeUtils.formatDate$default((Date) obj, BrazeDateFormat.LONG, null, 2, null));
            } else if (obj instanceof com.amazon.aps.iva.if0.a) {
                aVar2.put(a((com.amazon.aps.iva.if0.a) obj));
            } else if (obj instanceof Map) {
                aVar2.put(a((Map) obj));
            } else {
                aVar2.put(obj);
            }
        }
        return aVar2;
    }
}

package com.amazon.aps.iva.ta0;

import com.amazon.aps.iva.if0.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Pattern;
/* loaded from: classes4.dex */
public abstract class b {
    public static final com.amazon.aps.iva.sa0.a a = new com.amazon.aps.iva.sa0.a("39.0.0.0");
    public static final com.amazon.aps.iva.sa0.a b = new com.amazon.aps.iva.sa0.a("61.0.3163.98");
    public static final Pattern c = Pattern.compile("^(https?://)?(qa-)?[a-z]+\\.truex\\.com");

    public static ArrayList a(com.amazon.aps.iva.if0.a aVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < aVar.e(); i++) {
            Object obj = aVar.get(i);
            if (obj instanceof com.amazon.aps.iva.if0.a) {
                obj = a((com.amazon.aps.iva.if0.a) obj);
            } else if (obj instanceof c) {
                obj = b((c) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static HashMap b(c cVar) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = cVar.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = cVar.get(next);
            if (obj instanceof com.amazon.aps.iva.if0.a) {
                obj = a((com.amazon.aps.iva.if0.a) obj);
            } else if (obj instanceof c) {
                obj = b((c) obj);
            }
            hashMap.put(next, obj);
        }
        return hashMap;
    }
}

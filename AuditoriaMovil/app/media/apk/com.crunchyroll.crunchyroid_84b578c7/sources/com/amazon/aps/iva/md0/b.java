package com.amazon.aps.iva.md0;

import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.q.c0;
import com.amazon.aps.iva.yb0.j;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: ClassMapperLite.kt */
/* loaded from: classes4.dex */
public final class b {
    public static final String a = x.B0(f1.K('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
    public static final LinkedHashMap b;

    static {
        int i;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List K = f1.K("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int p = k.p(0, K.size() - 1, 2);
        if (p >= 0) {
            int i2 = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                String str = a;
                sb.append(str);
                sb.append('/');
                sb.append((String) K.get(i2));
                linkedHashMap.put(sb.toString(), K.get(i2 + 1));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append('/');
                linkedHashMap.put(defpackage.b.c(sb2, (String) K.get(i2), "Array"), "[" + ((String) K.get(i)));
                if (i2 == p) {
                    break;
                }
                i2 += 2;
            }
        }
        linkedHashMap.put(a + "/Unit", "V");
        a("Any", "java/lang/Object", linkedHashMap);
        a("Nothing", "java/lang/Void", linkedHashMap);
        a("Annotation", "java/lang/annotation/Annotation", linkedHashMap);
        for (String str2 : f1.K("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            a(str2, "java/lang/" + str2, linkedHashMap);
        }
        for (String str3 : f1.K("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            a(com.amazon.aps.iva.oa.a.a("collections/", str3), "java/util/" + str3, linkedHashMap);
            a("collections/Mutable" + str3, "java/util/" + str3, linkedHashMap);
        }
        a("collections/Iterable", "java/lang/Iterable", linkedHashMap);
        a("collections/MutableIterable", "java/lang/Iterable", linkedHashMap);
        a("collections/Map.Entry", "java/util/Map$Entry", linkedHashMap);
        a("collections/MutableMap.MutableEntry", "java/util/Map$Entry", linkedHashMap);
        for (int i3 = 0; i3 < 23; i3++) {
            String a2 = c0.a("Function", i3);
            StringBuilder sb3 = new StringBuilder();
            String str4 = a;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i3);
            a(a2, sb3.toString(), linkedHashMap);
            a("reflect/KFunction" + i3, str4 + "/reflect/KFunction", linkedHashMap);
        }
        for (String str5 : f1.K("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            a(com.amazon.aps.iva.c80.a.f(str5, ".Companion"), com.amazon.aps.iva.ab.f.a(new StringBuilder(), a, "/jvm/internal/", str5, "CompanionObject"), linkedHashMap);
        }
        b = linkedHashMap;
    }

    public static final void a(String str, String str2, LinkedHashMap linkedHashMap) {
        linkedHashMap.put(a + '/' + str, "L" + str2 + ';');
    }

    public static final String b(String str) {
        j.f(str, "classId");
        String str2 = (String) b.get(str);
        if (str2 == null) {
            return "L" + m.e0(str, '.', '$') + ';';
        }
        return str2;
    }
}

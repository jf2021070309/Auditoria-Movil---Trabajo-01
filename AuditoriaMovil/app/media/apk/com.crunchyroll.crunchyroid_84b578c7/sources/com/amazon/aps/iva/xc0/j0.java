package com.amazon.aps.iva.xc0;

import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.lb0.m0;
import com.amazon.aps.iva.o0.t1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: SpecialGenericSignatures.kt */
/* loaded from: classes4.dex */
public class j0 {
    public static final a a = new a();
    public static final ArrayList b;
    public static final ArrayList c;
    public static final Map<a.C0850a, c> d;
    public static final LinkedHashMap e;
    public static final Set<com.amazon.aps.iva.nd0.f> f;
    public static final Set<String> g;
    public static final a.C0850a h;
    public static final Map<a.C0850a, com.amazon.aps.iva.nd0.f> i;
    public static final LinkedHashMap j;
    public static final ArrayList k;
    public static final LinkedHashMap l;

    /* compiled from: SpecialGenericSignatures.kt */
    /* loaded from: classes4.dex */
    public static final class a {

        /* compiled from: SpecialGenericSignatures.kt */
        /* renamed from: com.amazon.aps.iva.xc0.j0$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0850a {
            public final com.amazon.aps.iva.nd0.f a;
            public final String b;

            public C0850a(com.amazon.aps.iva.nd0.f fVar, String str) {
                com.amazon.aps.iva.yb0.j.f(str, "signature");
                this.a = fVar;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0850a)) {
                    return false;
                }
                C0850a c0850a = (C0850a) obj;
                if (com.amazon.aps.iva.yb0.j.a(this.a, c0850a.a) && com.amazon.aps.iva.yb0.j.a(this.b, c0850a.b)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("NameAndSignature(name=");
                sb.append(this.a);
                sb.append(", signature=");
                return t1.b(sb, this.b, ')');
            }
        }

        public static final C0850a a(a aVar, String str, String str2, String str3, String str4) {
            aVar.getClass();
            com.amazon.aps.iva.nd0.f h = com.amazon.aps.iva.nd0.f.h(str2);
            String str5 = str2 + '(' + str3 + ')' + str4;
            com.amazon.aps.iva.yb0.j.f(str, "internalName");
            com.amazon.aps.iva.yb0.j.f(str5, "jvmDescriptor");
            return new C0850a(h, str + '.' + str5);
        }
    }

    /* compiled from: SpecialGenericSignatures.kt */
    /* loaded from: classes4.dex */
    public enum b {
        ONE_COLLECTION_PARAMETER("Ljava/util/Collection<+Ljava/lang/Object;>;", false),
        OBJECT_PARAMETER_NON_GENERIC(null, true),
        OBJECT_PARAMETER_GENERIC("Ljava/lang/Object;", true);
        
        private final boolean isObjectReplacedWithTypeParameter;
        private final String valueParametersSignature;

        b(String str, boolean z) {
            this.valueParametersSignature = str;
            this.isObjectReplacedWithTypeParameter = z;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SpecialGenericSignatures.kt */
    /* loaded from: classes4.dex */
    public static final class c {
        private final Object defaultValue;
        public static final c NULL = new c("NULL", 0, null);
        public static final c INDEX = new c("INDEX", 1, -1);
        public static final c FALSE = new c("FALSE", 2, Boolean.FALSE);
        public static final c MAP_GET_OR_DEFAULT = new a();
        private static final /* synthetic */ c[] $VALUES = $values();

        /* compiled from: SpecialGenericSignatures.kt */
        /* loaded from: classes4.dex */
        public static final class a extends c {
            public a() {
                super("MAP_GET_OR_DEFAULT", 3, null, null);
            }
        }

        private static final /* synthetic */ c[] $values() {
            return new c[]{NULL, INDEX, FALSE, MAP_GET_OR_DEFAULT};
        }

        public /* synthetic */ c(String str, int i, Object obj, com.amazon.aps.iva.yb0.e eVar) {
            this(str, i, obj);
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }

        private c(String str, int i, Object obj) {
            this.defaultValue = obj;
        }
    }

    static {
        Set<String> I = l1.I("containsAll", "removeAll", "retainAll");
        ArrayList<a.C0850a> arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(I));
        for (String str : I) {
            a aVar = a;
            String desc = com.amazon.aps.iva.vd0.c.BOOLEAN.getDesc();
            com.amazon.aps.iva.yb0.j.e(desc, "BOOLEAN.desc");
            arrayList.add(a.a(aVar, "java/util/Collection", str, "Ljava/util/Collection;", desc));
        }
        b = arrayList;
        ArrayList arrayList2 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(arrayList));
        for (a.C0850a c0850a : arrayList) {
            arrayList2.add(c0850a.b);
        }
        c = arrayList2;
        ArrayList<a.C0850a> arrayList3 = b;
        ArrayList arrayList4 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(arrayList3));
        for (a.C0850a c0850a2 : arrayList3) {
            arrayList4.add(c0850a2.a.b());
        }
        a aVar2 = a;
        String concat = "java/util/".concat("Collection");
        com.amazon.aps.iva.vd0.c cVar = com.amazon.aps.iva.vd0.c.BOOLEAN;
        String desc2 = cVar.getDesc();
        com.amazon.aps.iva.yb0.j.e(desc2, "BOOLEAN.desc");
        a.C0850a a2 = a.a(aVar2, concat, "contains", "Ljava/lang/Object;", desc2);
        c cVar2 = c.FALSE;
        com.amazon.aps.iva.kb0.j jVar = new com.amazon.aps.iva.kb0.j(a2, cVar2);
        String concat2 = "java/util/".concat("Collection");
        String desc3 = cVar.getDesc();
        com.amazon.aps.iva.yb0.j.e(desc3, "BOOLEAN.desc");
        com.amazon.aps.iva.kb0.j jVar2 = new com.amazon.aps.iva.kb0.j(a.a(aVar2, concat2, "remove", "Ljava/lang/Object;", desc3), cVar2);
        String concat3 = "java/util/".concat("Map");
        String desc4 = cVar.getDesc();
        com.amazon.aps.iva.yb0.j.e(desc4, "BOOLEAN.desc");
        com.amazon.aps.iva.kb0.j jVar3 = new com.amazon.aps.iva.kb0.j(a.a(aVar2, concat3, "containsKey", "Ljava/lang/Object;", desc4), cVar2);
        String concat4 = "java/util/".concat("Map");
        String desc5 = cVar.getDesc();
        com.amazon.aps.iva.yb0.j.e(desc5, "BOOLEAN.desc");
        com.amazon.aps.iva.kb0.j jVar4 = new com.amazon.aps.iva.kb0.j(a.a(aVar2, concat4, "containsValue", "Ljava/lang/Object;", desc5), cVar2);
        String concat5 = "java/util/".concat("Map");
        String desc6 = cVar.getDesc();
        com.amazon.aps.iva.yb0.j.e(desc6, "BOOLEAN.desc");
        com.amazon.aps.iva.kb0.j jVar5 = new com.amazon.aps.iva.kb0.j(a.a(aVar2, concat5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", desc6), cVar2);
        com.amazon.aps.iva.kb0.j jVar6 = new com.amazon.aps.iva.kb0.j(a.a(aVar2, "java/util/".concat("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), c.MAP_GET_OR_DEFAULT);
        a.C0850a a3 = a.a(aVar2, "java/util/".concat("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        c cVar3 = c.NULL;
        com.amazon.aps.iva.kb0.j jVar7 = new com.amazon.aps.iva.kb0.j(a3, cVar3);
        com.amazon.aps.iva.kb0.j jVar8 = new com.amazon.aps.iva.kb0.j(a.a(aVar2, "java/util/".concat("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), cVar3);
        String concat6 = "java/util/".concat("List");
        com.amazon.aps.iva.vd0.c cVar4 = com.amazon.aps.iva.vd0.c.INT;
        String desc7 = cVar4.getDesc();
        com.amazon.aps.iva.yb0.j.e(desc7, "INT.desc");
        a.C0850a a4 = a.a(aVar2, concat6, "indexOf", "Ljava/lang/Object;", desc7);
        c cVar5 = c.INDEX;
        com.amazon.aps.iva.kb0.j jVar9 = new com.amazon.aps.iva.kb0.j(a4, cVar5);
        String concat7 = "java/util/".concat("List");
        String desc8 = cVar4.getDesc();
        com.amazon.aps.iva.yb0.j.e(desc8, "INT.desc");
        Map<a.C0850a, c> U = com.amazon.aps.iva.lb0.i0.U(jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9, new com.amazon.aps.iva.kb0.j(a.a(aVar2, concat7, "lastIndexOf", "Ljava/lang/Object;", desc8), cVar5));
        d = U;
        LinkedHashMap linkedHashMap = new LinkedHashMap(com.amazon.aps.iva.aq.k.w(U.size()));
        Iterator<T> it = U.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(((a.C0850a) entry.getKey()).b, entry.getValue());
        }
        e = linkedHashMap;
        LinkedHashSet<a.C0850a> Q = m0.Q(d.keySet(), b);
        ArrayList arrayList5 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(Q));
        for (a.C0850a c0850a3 : Q) {
            arrayList5.add(c0850a3.a);
        }
        f = com.amazon.aps.iva.lb0.x.c1(arrayList5);
        ArrayList arrayList6 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(Q));
        for (a.C0850a c0850a4 : Q) {
            arrayList6.add(c0850a4.b);
        }
        g = com.amazon.aps.iva.lb0.x.c1(arrayList6);
        a aVar3 = a;
        com.amazon.aps.iva.vd0.c cVar6 = com.amazon.aps.iva.vd0.c.INT;
        String desc9 = cVar6.getDesc();
        com.amazon.aps.iva.yb0.j.e(desc9, "INT.desc");
        a.C0850a a5 = a.a(aVar3, "java/util/List", "removeAt", desc9, "Ljava/lang/Object;");
        h = a5;
        String concat8 = "java/lang/".concat("Number");
        String desc10 = com.amazon.aps.iva.vd0.c.BYTE.getDesc();
        com.amazon.aps.iva.yb0.j.e(desc10, "BYTE.desc");
        com.amazon.aps.iva.kb0.j jVar10 = new com.amazon.aps.iva.kb0.j(a.a(aVar3, concat8, "toByte", "", desc10), com.amazon.aps.iva.nd0.f.h("byteValue"));
        String concat9 = "java/lang/".concat("Number");
        String desc11 = com.amazon.aps.iva.vd0.c.SHORT.getDesc();
        com.amazon.aps.iva.yb0.j.e(desc11, "SHORT.desc");
        com.amazon.aps.iva.kb0.j jVar11 = new com.amazon.aps.iva.kb0.j(a.a(aVar3, concat9, "toShort", "", desc11), com.amazon.aps.iva.nd0.f.h("shortValue"));
        String concat10 = "java/lang/".concat("Number");
        String desc12 = cVar6.getDesc();
        com.amazon.aps.iva.yb0.j.e(desc12, "INT.desc");
        com.amazon.aps.iva.kb0.j jVar12 = new com.amazon.aps.iva.kb0.j(a.a(aVar3, concat10, "toInt", "", desc12), com.amazon.aps.iva.nd0.f.h("intValue"));
        String concat11 = "java/lang/".concat("Number");
        String desc13 = com.amazon.aps.iva.vd0.c.LONG.getDesc();
        com.amazon.aps.iva.yb0.j.e(desc13, "LONG.desc");
        com.amazon.aps.iva.kb0.j jVar13 = new com.amazon.aps.iva.kb0.j(a.a(aVar3, concat11, "toLong", "", desc13), com.amazon.aps.iva.nd0.f.h("longValue"));
        String concat12 = "java/lang/".concat("Number");
        String desc14 = com.amazon.aps.iva.vd0.c.FLOAT.getDesc();
        com.amazon.aps.iva.yb0.j.e(desc14, "FLOAT.desc");
        com.amazon.aps.iva.kb0.j jVar14 = new com.amazon.aps.iva.kb0.j(a.a(aVar3, concat12, "toFloat", "", desc14), com.amazon.aps.iva.nd0.f.h("floatValue"));
        String concat13 = "java/lang/".concat("Number");
        String desc15 = com.amazon.aps.iva.vd0.c.DOUBLE.getDesc();
        com.amazon.aps.iva.yb0.j.e(desc15, "DOUBLE.desc");
        com.amazon.aps.iva.kb0.j jVar15 = new com.amazon.aps.iva.kb0.j(a.a(aVar3, concat13, "toDouble", "", desc15), com.amazon.aps.iva.nd0.f.h("doubleValue"));
        com.amazon.aps.iva.kb0.j jVar16 = new com.amazon.aps.iva.kb0.j(a5, com.amazon.aps.iva.nd0.f.h("remove"));
        String concat14 = "java/lang/".concat("CharSequence");
        String desc16 = cVar6.getDesc();
        com.amazon.aps.iva.yb0.j.e(desc16, "INT.desc");
        String desc17 = com.amazon.aps.iva.vd0.c.CHAR.getDesc();
        com.amazon.aps.iva.yb0.j.e(desc17, "CHAR.desc");
        Map<a.C0850a, com.amazon.aps.iva.nd0.f> U2 = com.amazon.aps.iva.lb0.i0.U(jVar10, jVar11, jVar12, jVar13, jVar14, jVar15, jVar16, new com.amazon.aps.iva.kb0.j(a.a(aVar3, concat14, "get", desc16, desc17), com.amazon.aps.iva.nd0.f.h("charAt")));
        i = U2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(com.amazon.aps.iva.aq.k.w(U2.size()));
        Iterator<T> it2 = U2.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            linkedHashMap2.put(((a.C0850a) entry2.getKey()).b, entry2.getValue());
        }
        j = linkedHashMap2;
        Set<a.C0850a> keySet = i.keySet();
        ArrayList arrayList7 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(keySet));
        for (a.C0850a c0850a5 : keySet) {
            arrayList7.add(c0850a5.a);
        }
        k = arrayList7;
        Set<Map.Entry<a.C0850a, com.amazon.aps.iva.nd0.f>> entrySet = i.entrySet();
        ArrayList arrayList8 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(entrySet));
        Iterator<T> it3 = entrySet.iterator();
        while (it3.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it3.next();
            arrayList8.add(new com.amazon.aps.iva.kb0.j(((a.C0850a) entry3.getKey()).a, entry3.getValue()));
        }
        int w = com.amazon.aps.iva.aq.k.w(com.amazon.aps.iva.lb0.r.Y(arrayList8));
        if (w < 16) {
            w = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(w);
        Iterator it4 = arrayList8.iterator();
        while (it4.hasNext()) {
            com.amazon.aps.iva.kb0.j jVar17 = (com.amazon.aps.iva.kb0.j) it4.next();
            linkedHashMap3.put((com.amazon.aps.iva.nd0.f) jVar17.c, (com.amazon.aps.iva.nd0.f) jVar17.b);
        }
        l = linkedHashMap3;
    }
}

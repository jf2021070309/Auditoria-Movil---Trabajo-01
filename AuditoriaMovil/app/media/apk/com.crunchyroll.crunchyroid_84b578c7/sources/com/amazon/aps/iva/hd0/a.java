package com.amazon.aps.iva.hd0;

import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.yb0.j;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: KotlinClassHeader.kt */
/* loaded from: classes4.dex */
public final class a {
    public final EnumC0334a a;
    public final com.amazon.aps.iva.md0.e b;
    public final String[] c;
    public final String[] d;
    public final String[] e;
    public final String f;
    public final int g;

    /* compiled from: KotlinClassHeader.kt */
    /* renamed from: com.amazon.aps.iva.hd0.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public enum EnumC0334a {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);
        
        public static final C0335a Companion = new C0335a();
        private static final Map<Integer, EnumC0334a> entryById;
        private final int id;

        /* compiled from: KotlinClassHeader.kt */
        /* renamed from: com.amazon.aps.iva.hd0.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0335a {
        }

        static {
            int i;
            EnumC0334a[] values = values();
            int w = k.w(values.length);
            LinkedHashMap linkedHashMap = new LinkedHashMap(w < 16 ? 16 : w);
            for (EnumC0334a enumC0334a : values) {
                linkedHashMap.put(Integer.valueOf(enumC0334a.id), enumC0334a);
            }
            entryById = linkedHashMap;
        }

        EnumC0334a(int i) {
            this.id = i;
        }

        public static final EnumC0334a getById(int i) {
            Companion.getClass();
            EnumC0334a enumC0334a = (EnumC0334a) entryById.get(Integer.valueOf(i));
            if (enumC0334a == null) {
                return UNKNOWN;
            }
            return enumC0334a;
        }
    }

    public a(EnumC0334a enumC0334a, com.amazon.aps.iva.md0.e eVar, String[] strArr, String[] strArr2, String[] strArr3, String str, int i) {
        j.f(enumC0334a, "kind");
        this.a = enumC0334a;
        this.b = eVar;
        this.c = strArr;
        this.d = strArr2;
        this.e = strArr3;
        this.f = str;
        this.g = i;
    }

    public final String toString() {
        return this.a + " version=" + this.b;
    }
}

package com.amazon.aps.iva.r8;

import android.database.Cursor;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
/* compiled from: TableInfo.java */
/* loaded from: classes.dex */
public final class c {
    public final String a;
    public final Map<String, a> b;
    public final Set<b> c;
    public final Set<d> d;

    /* compiled from: TableInfo.java */
    /* loaded from: classes.dex */
    public static class a {
        public final String a;
        public final String b;
        public final int c;
        public final boolean d;
        public final int e;
        public final String f;
        public final int g;

        public a(int i, int i2, String str, String str2, String str3, boolean z) {
            this.a = str;
            this.b = str2;
            this.d = z;
            this.e = i;
            int i3 = 5;
            if (str2 != null) {
                String upperCase = str2.toUpperCase(Locale.US);
                if (upperCase.contains("INT")) {
                    i3 = 3;
                } else if (!upperCase.contains("CHAR") && !upperCase.contains("CLOB") && !upperCase.contains("TEXT")) {
                    if (!upperCase.contains("BLOB")) {
                        i3 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
                    }
                } else {
                    i3 = 2;
                }
            }
            this.c = i3;
            this.f = str3;
            this.g = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.e != aVar.e || !this.a.equals(aVar.a) || this.d != aVar.d) {
                return false;
            }
            String str = this.f;
            int i = this.g;
            int i2 = aVar.g;
            String str2 = aVar.f;
            if (i == 1 && i2 == 2 && str != null && !str.equals(str2)) {
                return false;
            }
            if (i == 2 && i2 == 1 && str2 != null && !str2.equals(str)) {
                return false;
            }
            if ((i == 0 || i != i2 || (str == null ? str2 == null : str.equals(str2))) && this.c == aVar.c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i;
            int hashCode = ((this.a.hashCode() * 31) + this.c) * 31;
            if (this.d) {
                i = 1231;
            } else {
                i = 1237;
            }
            return ((hashCode + i) * 31) + this.e;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Column{name='");
            sb.append(this.a);
            sb.append("', type='");
            sb.append(this.b);
            sb.append("', affinity='");
            sb.append(this.c);
            sb.append("', notNull=");
            sb.append(this.d);
            sb.append(", primaryKeyPosition=");
            sb.append(this.e);
            sb.append(", defaultValue='");
            return defpackage.b.c(sb, this.f, "'}");
        }
    }

    /* compiled from: TableInfo.java */
    /* loaded from: classes.dex */
    public static class b {
        public final String a;
        public final String b;
        public final String c;
        public final List<String> d;
        public final List<String> e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = Collections.unmodifiableList(list);
            this.e = Collections.unmodifiableList(list2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (!this.a.equals(bVar.a) || !this.b.equals(bVar.b) || !this.c.equals(bVar.c) || !this.d.equals(bVar.d)) {
                return false;
            }
            return this.e.equals(bVar.e);
        }

        public final int hashCode() {
            int b = com.amazon.aps.iva.c80.a.b(this.c, com.amazon.aps.iva.c80.a.b(this.b, this.a.hashCode() * 31, 31), 31);
            return this.e.hashCode() + ((this.d.hashCode() + b) * 31);
        }

        public final String toString() {
            return "ForeignKey{referenceTable='" + this.a + "', onDelete='" + this.b + "', onUpdate='" + this.c + "', columnNames=" + this.d + ", referenceColumnNames=" + this.e + '}';
        }
    }

    /* compiled from: TableInfo.java */
    /* renamed from: com.amazon.aps.iva.r8.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0671c implements Comparable<C0671c> {
        public final int b;
        public final int c;
        public final String d;
        public final String e;

        public C0671c(int i, int i2, String str, String str2) {
            this.b = i;
            this.c = i2;
            this.d = str;
            this.e = str2;
        }

        @Override // java.lang.Comparable
        public final int compareTo(C0671c c0671c) {
            C0671c c0671c2 = c0671c;
            int i = this.b - c0671c2.b;
            if (i == 0) {
                return this.c - c0671c2.c;
            }
            return i;
        }
    }

    /* compiled from: TableInfo.java */
    /* loaded from: classes.dex */
    public static class d {
        public final String a;
        public final boolean b;
        public final List<String> c;

        public d(String str, List list, boolean z) {
            this.a = str;
            this.b = z;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.b != dVar.b || !this.c.equals(dVar.c)) {
                return false;
            }
            String str = this.a;
            boolean startsWith = str.startsWith("index_");
            String str2 = dVar.a;
            if (startsWith) {
                return str2.startsWith("index_");
            }
            return str.equals(str2);
        }

        public final int hashCode() {
            int hashCode;
            String str = this.a;
            if (str.startsWith("index_")) {
                hashCode = -1184239155;
            } else {
                hashCode = str.hashCode();
            }
            return this.c.hashCode() + (((hashCode * 31) + (this.b ? 1 : 0)) * 31);
        }

        public final String toString() {
            return "Index{name='" + this.a + "', unique=" + this.b + ", columns=" + this.c + '}';
        }
    }

    public c(String str, HashMap hashMap, HashSet hashSet, HashSet hashSet2) {
        Set<d> unmodifiableSet;
        this.a = str;
        this.b = Collections.unmodifiableMap(hashMap);
        this.c = Collections.unmodifiableSet(hashSet);
        if (hashSet2 == null) {
            unmodifiableSet = null;
        } else {
            unmodifiableSet = Collections.unmodifiableSet(hashSet2);
        }
        this.d = unmodifiableSet;
    }

    public static c a(com.amazon.aps.iva.v8.a aVar, String str) {
        HashSet hashSet;
        boolean z;
        int i;
        int i2;
        ArrayList arrayList;
        int i3;
        boolean z2;
        Cursor i4 = aVar.i("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (i4.getColumnCount() > 0) {
                int columnIndex = i4.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
                int columnIndex2 = i4.getColumnIndex("type");
                int columnIndex3 = i4.getColumnIndex("notnull");
                int columnIndex4 = i4.getColumnIndex("pk");
                int columnIndex5 = i4.getColumnIndex("dflt_value");
                while (i4.moveToNext()) {
                    String string = i4.getString(columnIndex);
                    String string2 = i4.getString(columnIndex2);
                    if (i4.getInt(columnIndex3) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    hashMap.put(string, new a(i4.getInt(columnIndex4), 2, string, string2, i4.getString(columnIndex5), z2));
                }
            }
            i4.close();
            HashSet hashSet2 = new HashSet();
            i4 = aVar.i("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = i4.getColumnIndex("id");
                int columnIndex7 = i4.getColumnIndex("seq");
                int columnIndex8 = i4.getColumnIndex("table");
                int columnIndex9 = i4.getColumnIndex("on_delete");
                int columnIndex10 = i4.getColumnIndex("on_update");
                ArrayList b2 = b(i4);
                int count = i4.getCount();
                int i5 = 0;
                while (i5 < count) {
                    i4.moveToPosition(i5);
                    if (i4.getInt(columnIndex7) != 0) {
                        i = columnIndex6;
                        i2 = columnIndex7;
                        arrayList = b2;
                        i3 = count;
                    } else {
                        int i6 = i4.getInt(columnIndex6);
                        i = columnIndex6;
                        ArrayList arrayList2 = new ArrayList();
                        i2 = columnIndex7;
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = b2.iterator();
                        while (it.hasNext()) {
                            ArrayList arrayList4 = b2;
                            C0671c c0671c = (C0671c) it.next();
                            int i7 = count;
                            if (c0671c.b == i6) {
                                arrayList2.add(c0671c.d);
                                arrayList3.add(c0671c.e);
                            }
                            b2 = arrayList4;
                            count = i7;
                        }
                        arrayList = b2;
                        i3 = count;
                        hashSet2.add(new b(i4.getString(columnIndex8), i4.getString(columnIndex9), i4.getString(columnIndex10), arrayList2, arrayList3));
                    }
                    i5++;
                    columnIndex6 = i;
                    columnIndex7 = i2;
                    b2 = arrayList;
                    count = i3;
                }
                i4.close();
                i4 = aVar.i("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = i4.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
                    int columnIndex12 = i4.getColumnIndex("origin");
                    int columnIndex13 = i4.getColumnIndex("unique");
                    if (columnIndex11 != -1 && columnIndex12 != -1 && columnIndex13 != -1) {
                        hashSet = new HashSet();
                        while (i4.moveToNext()) {
                            if ("c".equals(i4.getString(columnIndex12))) {
                                String string3 = i4.getString(columnIndex11);
                                if (i4.getInt(columnIndex13) == 1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                d c = c(aVar, string3, z);
                                if (c != null) {
                                    hashSet.add(c);
                                }
                            }
                        }
                        return new c(str, hashMap, hashSet2, hashSet);
                    }
                    i4.close();
                    hashSet = null;
                    return new c(str, hashMap, hashSet2, hashSet);
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public static ArrayList b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new C0671c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static d c(com.amazon.aps.iva.v8.a aVar, String str, boolean z) {
        Cursor i = aVar.i("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = i.getColumnIndex("seqno");
            int columnIndex2 = i.getColumnIndex("cid");
            int columnIndex3 = i.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (i.moveToNext()) {
                    if (i.getInt(columnIndex2) >= 0) {
                        int i2 = i.getInt(columnIndex);
                        treeMap.put(Integer.valueOf(i2), i.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                return new d(str, arrayList, z);
            }
            i.close();
            return null;
        } finally {
            i.close();
        }
    }

    public final boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        String str = cVar.a;
        String str2 = this.a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        Map<String, a> map = cVar.b;
        Map<String, a> map2 = this.b;
        if (map2 == null ? map != null : !map2.equals(map)) {
            return false;
        }
        Set<b> set2 = cVar.c;
        Set<b> set3 = this.c;
        if (set3 == null ? set2 != null : !set3.equals(set2)) {
            return false;
        }
        Set<d> set4 = this.d;
        if (set4 == null || (set = cVar.d) == null) {
            return true;
        }
        return set4.equals(set);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        String str = this.a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        Map<String, a> map = this.b;
        if (map != null) {
            i2 = map.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        Set<b> set = this.c;
        if (set != null) {
            i3 = set.hashCode();
        }
        return i5 + i3;
    }

    public final String toString() {
        return "TableInfo{name='" + this.a + "', columns=" + this.b + ", foreignKeys=" + this.c + ", indices=" + this.d + '}';
    }
}

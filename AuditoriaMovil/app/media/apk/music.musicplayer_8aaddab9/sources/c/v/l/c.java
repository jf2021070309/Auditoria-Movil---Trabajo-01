package c.v.l;

import android.database.Cursor;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import com.google.ads.mediation.facebook.FacebookAdapter;
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
/* loaded from: classes.dex */
public class c {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, a> f2809b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<b> f2810c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<d> f2811d;

    /* loaded from: classes.dex */
    public static class a {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final String f2812b;

        /* renamed from: c  reason: collision with root package name */
        public final int f2813c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f2814d;

        /* renamed from: e  reason: collision with root package name */
        public final int f2815e;

        /* renamed from: f  reason: collision with root package name */
        public final String f2816f;

        /* renamed from: g  reason: collision with root package name */
        public final int f2817g;

        public a(String str, String str2, boolean z, int i2, String str3, int i3) {
            this.a = str;
            this.f2812b = str2;
            this.f2814d = z;
            this.f2815e = i2;
            int i4 = 5;
            if (str2 != null) {
                String upperCase = str2.toUpperCase(Locale.US);
                if (upperCase.contains("INT")) {
                    i4 = 3;
                } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                    i4 = 2;
                } else if (!upperCase.contains("BLOB")) {
                    i4 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
                }
            }
            this.f2813c = i4;
            this.f2816f = str3;
            this.f2817g = i3;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (Build.VERSION.SDK_INT < 20) {
                if ((this.f2815e > 0) != (aVar.f2815e > 0)) {
                    return false;
                }
            } else if (this.f2815e != aVar.f2815e) {
                return false;
            }
            if (this.a.equals(aVar.a) && this.f2814d == aVar.f2814d) {
                if (this.f2817g != 1 || aVar.f2817g != 2 || (str3 = this.f2816f) == null || str3.equals(aVar.f2816f)) {
                    if (this.f2817g != 2 || aVar.f2817g != 1 || (str2 = aVar.f2816f) == null || str2.equals(this.f2816f)) {
                        int i2 = this.f2817g;
                        return (i2 == 0 || i2 != aVar.f2817g || ((str = this.f2816f) == null ? aVar.f2816f == null : str.equals(aVar.f2816f))) && this.f2813c == aVar.f2813c;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.a.hashCode() * 31) + this.f2813c) * 31) + (this.f2814d ? 1231 : 1237)) * 31) + this.f2815e;
        }

        public String toString() {
            StringBuilder y = e.a.d.a.a.y("Column{name='");
            e.a.d.a.a.J(y, this.a, CoreConstants.SINGLE_QUOTE_CHAR, ", type='");
            e.a.d.a.a.J(y, this.f2812b, CoreConstants.SINGLE_QUOTE_CHAR, ", affinity='");
            y.append(this.f2813c);
            y.append(CoreConstants.SINGLE_QUOTE_CHAR);
            y.append(", notNull=");
            y.append(this.f2814d);
            y.append(", primaryKeyPosition=");
            y.append(this.f2815e);
            y.append(", defaultValue='");
            y.append(this.f2816f);
            y.append(CoreConstants.SINGLE_QUOTE_CHAR);
            y.append('}');
            return y.toString();
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final String f2818b;

        /* renamed from: c  reason: collision with root package name */
        public final String f2819c;

        /* renamed from: d  reason: collision with root package name */
        public final List<String> f2820d;

        /* renamed from: e  reason: collision with root package name */
        public final List<String> f2821e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.a = str;
            this.f2818b = str2;
            this.f2819c = str3;
            this.f2820d = Collections.unmodifiableList(list);
            this.f2821e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a.equals(bVar.a) && this.f2818b.equals(bVar.f2818b) && this.f2819c.equals(bVar.f2819c) && this.f2820d.equals(bVar.f2820d)) {
                return this.f2821e.equals(bVar.f2821e);
            }
            return false;
        }

        public int hashCode() {
            int x = e.a.d.a.a.x(this.f2819c, e.a.d.a.a.x(this.f2818b, this.a.hashCode() * 31, 31), 31);
            return this.f2821e.hashCode() + ((this.f2820d.hashCode() + x) * 31);
        }

        public String toString() {
            StringBuilder y = e.a.d.a.a.y("ForeignKey{referenceTable='");
            e.a.d.a.a.J(y, this.a, CoreConstants.SINGLE_QUOTE_CHAR, ", onDelete='");
            e.a.d.a.a.J(y, this.f2818b, CoreConstants.SINGLE_QUOTE_CHAR, ", onUpdate='");
            e.a.d.a.a.J(y, this.f2819c, CoreConstants.SINGLE_QUOTE_CHAR, ", columnNames=");
            y.append(this.f2820d);
            y.append(", referenceColumnNames=");
            y.append(this.f2821e);
            y.append('}');
            return y.toString();
        }
    }

    /* renamed from: c.v.l.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0056c implements Comparable<C0056c> {
        public final int a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2822b;

        /* renamed from: c  reason: collision with root package name */
        public final String f2823c;

        /* renamed from: d  reason: collision with root package name */
        public final String f2824d;

        public C0056c(int i2, int i3, String str, String str2) {
            this.a = i2;
            this.f2822b = i3;
            this.f2823c = str;
            this.f2824d = str2;
        }

        @Override // java.lang.Comparable
        public int compareTo(C0056c c0056c) {
            C0056c c0056c2 = c0056c;
            int i2 = this.a - c0056c2.a;
            return i2 == 0 ? this.f2822b - c0056c2.f2822b : i2;
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f2825b;

        /* renamed from: c  reason: collision with root package name */
        public final List<String> f2826c;

        public d(String str, boolean z, List<String> list) {
            this.a = str;
            this.f2825b = z;
            this.f2826c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f2825b == dVar.f2825b && this.f2826c.equals(dVar.f2826c)) {
                return this.a.startsWith("index_") ? dVar.a.startsWith("index_") : this.a.equals(dVar.a);
            }
            return false;
        }

        public int hashCode() {
            return this.f2826c.hashCode() + ((((this.a.startsWith("index_") ? -1184239155 : this.a.hashCode()) * 31) + (this.f2825b ? 1 : 0)) * 31);
        }

        public String toString() {
            StringBuilder y = e.a.d.a.a.y("Index{name='");
            e.a.d.a.a.J(y, this.a, CoreConstants.SINGLE_QUOTE_CHAR, ", unique=");
            y.append(this.f2825b);
            y.append(", columns=");
            y.append(this.f2826c);
            y.append('}');
            return y.toString();
        }
    }

    public c(String str, Map<String, a> map, Set<b> set, Set<d> set2) {
        this.a = str;
        this.f2809b = Collections.unmodifiableMap(map);
        this.f2810c = Collections.unmodifiableSet(set);
        this.f2811d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    public static c a(c.x.a.b bVar, String str) {
        int i2;
        int i3;
        List<C0056c> list;
        int i4;
        c.x.a.f.a aVar = (c.x.a.f.a) bVar;
        Cursor h2 = aVar.h(e.a.d.a.a.l("PRAGMA table_info(`", str, "`)"));
        HashMap hashMap = new HashMap();
        try {
            if (h2.getColumnCount() > 0) {
                int columnIndex = h2.getColumnIndex("name");
                int columnIndex2 = h2.getColumnIndex("type");
                int columnIndex3 = h2.getColumnIndex("notnull");
                int columnIndex4 = h2.getColumnIndex("pk");
                int columnIndex5 = h2.getColumnIndex("dflt_value");
                while (h2.moveToNext()) {
                    String string = h2.getString(columnIndex);
                    int i5 = columnIndex;
                    hashMap.put(string, new a(string, h2.getString(columnIndex2), h2.getInt(columnIndex3) != 0, h2.getInt(columnIndex4), h2.getString(columnIndex5), 2));
                    columnIndex = i5;
                }
            }
            h2.close();
            HashSet hashSet = new HashSet();
            h2 = aVar.h("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = h2.getColumnIndex(FacebookAdapter.KEY_ID);
                int columnIndex7 = h2.getColumnIndex("seq");
                int columnIndex8 = h2.getColumnIndex("table");
                int columnIndex9 = h2.getColumnIndex("on_delete");
                int columnIndex10 = h2.getColumnIndex("on_update");
                List<C0056c> b2 = b(h2);
                int count = h2.getCount();
                int i6 = 0;
                while (i6 < count) {
                    h2.moveToPosition(i6);
                    if (h2.getInt(columnIndex7) != 0) {
                        i2 = columnIndex6;
                        i3 = columnIndex7;
                        list = b2;
                        i4 = count;
                    } else {
                        int i7 = h2.getInt(columnIndex6);
                        i2 = columnIndex6;
                        ArrayList arrayList = new ArrayList();
                        i3 = columnIndex7;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = ((ArrayList) b2).iterator();
                        while (it.hasNext()) {
                            List<C0056c> list2 = b2;
                            C0056c c0056c = (C0056c) it.next();
                            int i8 = count;
                            if (c0056c.a == i7) {
                                arrayList.add(c0056c.f2823c);
                                arrayList2.add(c0056c.f2824d);
                            }
                            b2 = list2;
                            count = i8;
                        }
                        list = b2;
                        i4 = count;
                        hashSet.add(new b(h2.getString(columnIndex8), h2.getString(columnIndex9), h2.getString(columnIndex10), arrayList, arrayList2));
                    }
                    i6++;
                    columnIndex6 = i2;
                    columnIndex7 = i3;
                    b2 = list;
                    count = i4;
                }
                h2.close();
                h2 = aVar.h("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = h2.getColumnIndex("name");
                    int columnIndex12 = h2.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
                    int columnIndex13 = h2.getColumnIndex("unique");
                    HashSet hashSet2 = null;
                    if (columnIndex11 != -1 && columnIndex12 != -1 && columnIndex13 != -1) {
                        HashSet hashSet3 = new HashSet();
                        while (h2.moveToNext()) {
                            if ("c".equals(h2.getString(columnIndex12))) {
                                d c2 = c(aVar, h2.getString(columnIndex11), h2.getInt(columnIndex13) == 1);
                                if (c2 != null) {
                                    hashSet3.add(c2);
                                }
                            }
                        }
                        h2.close();
                        hashSet2 = hashSet3;
                        return new c(str, hashMap, hashSet, hashSet2);
                    }
                    return new c(str, hashMap, hashSet, hashSet2);
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public static List<C0056c> b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(FacebookAdapter.KEY_ID);
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < count; i2++) {
            cursor.moveToPosition(i2);
            arrayList.add(new C0056c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static d c(c.x.a.b bVar, String str, boolean z) {
        Cursor h2 = ((c.x.a.f.a) bVar).h(e.a.d.a.a.l("PRAGMA index_xinfo(`", str, "`)"));
        try {
            int columnIndex = h2.getColumnIndex("seqno");
            int columnIndex2 = h2.getColumnIndex("cid");
            int columnIndex3 = h2.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (h2.moveToNext()) {
                    if (h2.getInt(columnIndex2) >= 0) {
                        int i2 = h2.getInt(columnIndex);
                        treeMap.put(Integer.valueOf(i2), h2.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                return new d(str, z, arrayList);
            }
            return null;
        } finally {
            h2.close();
        }
    }

    public boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        String str = this.a;
        if (str == null ? cVar.a == null : str.equals(cVar.a)) {
            Map<String, a> map = this.f2809b;
            if (map == null ? cVar.f2809b == null : map.equals(cVar.f2809b)) {
                Set<b> set2 = this.f2810c;
                if (set2 == null ? cVar.f2810c == null : set2.equals(cVar.f2810c)) {
                    Set<d> set3 = this.f2811d;
                    if (set3 == null || (set = cVar.f2811d) == null) {
                        return true;
                    }
                    return set3.equals(set);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, a> map = this.f2809b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<b> set = this.f2810c;
        return hashCode2 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("TableInfo{name='");
        e.a.d.a.a.J(y, this.a, CoreConstants.SINGLE_QUOTE_CHAR, ", columns=");
        y.append(this.f2809b);
        y.append(", foreignKeys=");
        y.append(this.f2810c);
        y.append(", indices=");
        y.append(this.f2811d);
        y.append('}');
        return y.toString();
    }
}

package com.amazon.aps.iva.j6;

import android.net.Uri;
import com.amazon.aps.iva.q5.p0;
import com.amazon.aps.iva.q5.r;
import com.amazon.aps.iva.q5.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: HlsMultivariantPlaylist.java */
/* loaded from: classes.dex */
public final class e extends f {
    public static final e n = new e("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());
    public final List<Uri> d;
    public final List<b> e;
    public final List<a> f;
    public final List<a> g;
    public final List<a> h;
    public final List<a> i;
    public final v j;
    public final List<v> k;
    public final Map<String, String> l;
    public final List<r> m;

    /* compiled from: HlsMultivariantPlaylist.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final Uri a;
        public final v b;
        public final String c;

        public a(Uri uri, v vVar, String str) {
            this.a = uri;
            this.b = vVar;
            this.c = str;
        }
    }

    /* compiled from: HlsMultivariantPlaylist.java */
    /* loaded from: classes.dex */
    public static final class b {
        public final Uri a;
        public final v b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;

        public b(Uri uri, v vVar, String str, String str2, String str3, String str4) {
            this.a = uri;
            this.b = vVar;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
        }
    }

    public e(String str, List<String> list, List<b> list2, List<a> list3, List<a> list4, List<a> list5, List<a> list6, v vVar, List<v> list7, boolean z, Map<String, String> map, List<r> list8) {
        super(str, list, z);
        List<v> list9;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list2.size(); i++) {
            Uri uri = list2.get(i).a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        b(list6, arrayList);
        this.d = Collections.unmodifiableList(arrayList);
        this.e = Collections.unmodifiableList(list2);
        this.f = Collections.unmodifiableList(list3);
        this.g = Collections.unmodifiableList(list4);
        this.h = Collections.unmodifiableList(list5);
        this.i = Collections.unmodifiableList(list6);
        this.j = vVar;
        if (list7 != null) {
            list9 = Collections.unmodifiableList(list7);
        } else {
            list9 = null;
        }
        this.k = list9;
        this.l = Collections.unmodifiableMap(map);
        this.m = Collections.unmodifiableList(list8);
    }

    public static void b(List list, ArrayList arrayList) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = ((a) list.get(i)).a;
            if (uri != null && !arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList c(int i, List list, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            int i3 = 0;
            while (true) {
                if (i3 < list2.size()) {
                    p0 p0Var = (p0) list2.get(i3);
                    if (p0Var.c == i && p0Var.d == i2) {
                        arrayList.add(obj);
                        break;
                    }
                    i3++;
                }
            }
        }
        return arrayList;
    }

    @Override // com.amazon.aps.iva.m6.q
    public final f a(List list) {
        return new e(this.a, this.b, c(0, this.e, list), Collections.emptyList(), c(1, this.g, list), c(2, this.h, list), Collections.emptyList(), this.j, this.k, this.c, this.l, this.m);
    }
}

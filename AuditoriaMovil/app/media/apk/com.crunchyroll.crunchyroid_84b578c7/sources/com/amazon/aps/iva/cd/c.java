package com.amazon.aps.iva.cd;

import com.amazon.aps.iva.kc.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: ResourceDecoderRegistry.java */
/* loaded from: classes.dex */
public final class c {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();

    /* compiled from: ResourceDecoderRegistry.java */
    /* loaded from: classes.dex */
    public static class a<T, R> {
        public final Class<T> a;
        public final Class<R> b;
        public final j<T, R> c;

        public a(Class<T> cls, Class<R> cls2, j<T, R> jVar) {
            this.a = cls;
            this.b = cls2;
            this.c = jVar;
        }
    }

    public final synchronized List<a<?, ?>> a(String str) {
        List<a<?, ?>> list;
        if (!this.a.contains(str)) {
            this.a.add(str);
        }
        list = (List) this.b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.b.put(str, list);
        }
        return list;
    }

    public final synchronized ArrayList b(Class cls, Class cls2) {
        ArrayList arrayList;
        boolean z;
        arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.a.isAssignableFrom(cls) && cls2.isAssignableFrom(aVar.b)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && !arrayList.contains(aVar.b)) {
                        arrayList.add(aVar.b);
                    }
                }
            }
        }
        return arrayList;
    }
}

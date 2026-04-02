package com.amazon.aps.iva.zc;

import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: TranscoderRegistry.java */
/* loaded from: classes.dex */
public final class d {
    public final ArrayList a = new ArrayList();

    /* compiled from: TranscoderRegistry.java */
    /* loaded from: classes.dex */
    public static final class a<Z, R> {
        public final Class<Z> a;
        public final Class<R> b;
        public final c<Z, R> c;

        public a(Class<Z> cls, Class<R> cls2, c<Z, R> cVar) {
            this.a = cls;
            this.b = cls2;
            this.c = cVar;
        }
    }

    public final synchronized ArrayList a(Class cls, Class cls2) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.a.isAssignableFrom(cls) && cls2.isAssignableFrom(aVar.b)) {
                z = true;
            } else {
                z = false;
            }
            if (z && !arrayList.contains(aVar.b)) {
                arrayList.add(aVar.b);
            }
        }
        return arrayList;
    }
}

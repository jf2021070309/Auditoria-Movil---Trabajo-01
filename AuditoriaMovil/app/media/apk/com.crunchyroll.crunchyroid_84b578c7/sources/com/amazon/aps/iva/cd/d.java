package com.amazon.aps.iva.cd;

import com.amazon.aps.iva.kc.k;
import java.util.ArrayList;
/* compiled from: ResourceEncoderRegistry.java */
/* loaded from: classes.dex */
public final class d {
    public final ArrayList a = new ArrayList();

    /* compiled from: ResourceEncoderRegistry.java */
    /* loaded from: classes.dex */
    public static final class a<T> {
        public final Class<T> a;
        public final k<T> b;

        public a(Class<T> cls, k<T> kVar) {
            this.a = cls;
            this.b = kVar;
        }
    }

    public final synchronized <Z> k<Z> a(Class<Z> cls) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            a aVar = (a) this.a.get(i);
            if (aVar.a.isAssignableFrom(cls)) {
                return (k<Z>) aVar.b;
            }
        }
        return null;
    }
}

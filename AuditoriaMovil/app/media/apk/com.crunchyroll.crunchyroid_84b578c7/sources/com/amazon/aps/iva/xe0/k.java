package com.amazon.aps.iva.xe0;

import com.amazon.aps.iva.se0.t1;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.internal.MainDispatcherFactory;
/* compiled from: MainDispatchers.kt */
/* loaded from: classes4.dex */
public final class k {
    public static final t1 a;

    static {
        String str;
        Object next;
        t1 b;
        int i = t.a;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        List<? extends MainDispatcherFactory> f0 = com.amazon.aps.iva.ne0.s.f0(com.amazon.aps.iva.ne0.k.O(ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator()));
        Iterator it = f0.iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                int c = ((MainDispatcherFactory) next).c();
                do {
                    Object next2 = it.next();
                    int c2 = ((MainDispatcherFactory) next2).c();
                    if (c < c2) {
                        next = next2;
                        c = c2;
                    }
                } while (it.hasNext());
            }
        }
        MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) next;
        if (mainDispatcherFactory != null && (b = mainDispatcherFactory.b(f0)) != null) {
            a = b;
            return;
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}

package i.a.i2;

import e.j.d.w;
import i.a.p1;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.internal.MainDispatcherFactory;
/* loaded from: classes2.dex */
public final class l {
    public static final l a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f9077b;

    /* renamed from: c  reason: collision with root package name */
    public static final p1 f9078c;

    static {
        l lVar = new l();
        a = lVar;
        String A0 = w.A0("kotlinx.coroutines.fast.service.loader");
        f9077b = A0 == null ? true : Boolean.parseBoolean(A0);
        f9078c = lVar.a();
    }

    public final p1 a() {
        Object obj;
        List<? extends MainDispatcherFactory> H0 = w.H0(w.g(defpackage.a.b()));
        Iterator it = H0.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int loadPriority = ((MainDispatcherFactory) next).getLoadPriority();
                do {
                    Object next2 = it.next();
                    int loadPriority2 = ((MainDispatcherFactory) next2).getLoadPriority();
                    if (loadPriority < loadPriority2) {
                        next = next2;
                        loadPriority = loadPriority2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) obj;
        if (mainDispatcherFactory != null) {
            return mainDispatcherFactory.createDispatcher(H0);
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}

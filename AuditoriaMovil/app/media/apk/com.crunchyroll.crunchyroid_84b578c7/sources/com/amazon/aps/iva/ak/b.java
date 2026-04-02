package com.amazon.aps.iva.ak;

import com.amazon.aps.iva.zj.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
/* compiled from: KeepSessionAliveUseCase.kt */
/* loaded from: classes.dex */
public final class b {
    public final Object a;

    public b(e eVar) {
        this.a = eVar;
    }

    public final void a(Object obj) {
        ((ArrayList) this.a).add(obj);
    }

    public final void b(Object obj) {
        if (obj == null) {
            return;
        }
        boolean z = obj instanceof Object[];
        Object obj2 = this.a;
        if (z) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ((ArrayList) obj2).ensureCapacity(((ArrayList) obj2).size() + objArr.length);
                Collections.addAll((ArrayList) obj2, objArr);
            }
        } else if (obj instanceof Collection) {
            ((ArrayList) obj2).addAll((Collection) obj);
        } else if (obj instanceof Iterable) {
            for (Object obj3 : (Iterable) obj) {
                ((ArrayList) obj2).add(obj3);
            }
        } else if (obj instanceof Iterator) {
            Iterator it = (Iterator) obj;
            while (it.hasNext()) {
                ((ArrayList) obj2).add(it.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public final int c() {
        return ((ArrayList) this.a).size();
    }

    public final Object[] d(Object[] objArr) {
        return ((ArrayList) this.a).toArray(objArr);
    }

    public b(int i) {
        this.a = new ArrayList(i);
    }
}

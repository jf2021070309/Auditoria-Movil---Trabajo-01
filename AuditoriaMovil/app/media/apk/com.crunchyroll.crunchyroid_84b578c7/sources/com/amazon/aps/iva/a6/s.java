package com.amazon.aps.iva.a6;

import com.amazon.aps.iva.o6.v;
import com.google.common.base.Supplier;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements Supplier {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return (v.a) obj;
            default:
                try {
                    return (v.a) ((Class) obj).getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
        }
    }
}

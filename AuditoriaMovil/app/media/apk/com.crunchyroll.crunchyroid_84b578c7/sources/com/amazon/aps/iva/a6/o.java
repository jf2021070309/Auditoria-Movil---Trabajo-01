package com.amazon.aps.iva.a6;

import android.content.Context;
import com.google.common.base.Supplier;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Supplier {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return new k((Context) obj);
            default:
                return Boolean.valueOf(((q0) obj).A);
        }
    }
}

package com.amazon.aps.iva.b8;

import com.google.common.base.Supplier;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.Striped;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e2 implements Supplier {
    public final /* synthetic */ int b;

    public /* synthetic */ e2(int i) {
        this.b = i;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        Lock lambda$lazyWeakLock$0;
        switch (this.b) {
            case 0:
                return MoreExecutors.listeningDecorator(Executors.newSingleThreadExecutor());
            default:
                lambda$lazyWeakLock$0 = Striped.lambda$lazyWeakLock$0();
                return lambda$lazyWeakLock$0;
        }
    }
}

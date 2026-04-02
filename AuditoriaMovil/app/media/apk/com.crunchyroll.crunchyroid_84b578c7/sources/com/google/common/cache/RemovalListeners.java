package com.google.common.cache;

import com.amazon.aps.iva.n4.d;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.cache.RemovalListeners;
import com.google.common.cache.RemovalNotification;
import java.util.concurrent.Executor;
@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes3.dex */
public final class RemovalListeners {
    private RemovalListeners() {
    }

    public static /* synthetic */ void a(RemovalListener removalListener, RemovalNotification removalNotification) {
        removalListener.onRemoval(removalNotification);
    }

    public static <K, V> RemovalListener<K, V> asynchronous(final RemovalListener<K, V> removalListener, final Executor executor) {
        Preconditions.checkNotNull(removalListener);
        Preconditions.checkNotNull(executor);
        return new RemovalListener() { // from class: com.amazon.aps.iva.e90.a
            @Override // com.google.common.cache.RemovalListener
            public final void onRemoval(RemovalNotification removalNotification) {
                RemovalListeners.lambda$asynchronous$1(executor, removalListener, removalNotification);
            }
        };
    }

    public static /* synthetic */ void lambda$asynchronous$1(Executor executor, RemovalListener removalListener, RemovalNotification removalNotification) {
        executor.execute(new d(11, removalListener, removalNotification));
    }
}

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes2.dex */
public abstract class UnregisterListenerMethod<A extends Api.AnyClient, L> {
    private final ListenerHolder.ListenerKey<L> zajk;

    /* JADX INFO: Access modifiers changed from: protected */
    public UnregisterListenerMethod(ListenerHolder.ListenerKey<L> listenerKey) {
        this.zajk = listenerKey;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void unregisterListener(A a, TaskCompletionSource<Boolean> taskCompletionSource);

    public ListenerHolder.ListenerKey<L> getListenerKey() {
        return this.zajk;
    }
}

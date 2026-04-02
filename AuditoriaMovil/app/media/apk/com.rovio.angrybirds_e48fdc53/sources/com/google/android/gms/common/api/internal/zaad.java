package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [TResult] */
/* loaded from: classes2.dex */
public final class zaad<TResult> implements OnCompleteListener<TResult> {
    private final /* synthetic */ zaab zafm;
    private final /* synthetic */ TaskCompletionSource zafn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zaad(zaab zaabVar, TaskCompletionSource taskCompletionSource) {
        this.zafm = zaabVar;
        this.zafn = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task<TResult> task) {
        Map map;
        map = this.zafm.zafk;
        map.remove(this.zafn);
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final /* synthetic */ class zzfig implements Continuation {
    static final Continuation zza = new zzfig();

    private zzfig() {
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        return Boolean.valueOf(task.isSuccessful());
    }
}

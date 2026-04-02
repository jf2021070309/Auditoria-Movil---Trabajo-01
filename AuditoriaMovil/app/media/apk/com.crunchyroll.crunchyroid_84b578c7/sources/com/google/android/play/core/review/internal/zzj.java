package com.google.android.play.core.review.internal;

import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes3.dex */
public abstract class zzj implements Runnable {
    private final TaskCompletionSource zza;

    public zzj() {
        this.zza = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zza();
        } catch (Exception e) {
            zzc(e);
        }
    }

    public abstract void zza();

    public final TaskCompletionSource zzb() {
        return this.zza;
    }

    public final void zzc(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.zza;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public zzj(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }
}

package com.google.firebase.iid;

import android.content.Intent;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: com.google.firebase:firebase-iid@@20.1.6 */
/* loaded from: classes4.dex */
final class zzbg {
    final Intent zza;
    private final TaskCompletionSource<Void> zzb = new TaskCompletionSource<>();

    public zzbg(Intent intent) {
        this.zza = intent;
    }

    public final Task<Void> zza() {
        return this.zzb.getTask();
    }

    public final void zzb() {
        this.zzb.trySetResult(null);
    }

    public final /* synthetic */ void zzc() {
        new StringBuilder(String.valueOf(this.zza.getAction()).length() + 61);
        zzb();
    }
}

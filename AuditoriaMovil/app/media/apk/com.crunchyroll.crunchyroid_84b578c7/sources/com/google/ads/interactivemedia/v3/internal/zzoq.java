package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzoq extends zznz {
    final /* synthetic */ TaskCompletionSource zza;

    public zzoq(zzor zzorVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzoa
    public final void zzb(int i) {
        this.zza.trySetException(new zzol(i));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzoa
    public final void zzc(zzoi zzoiVar) {
        this.zza.trySetResult(zzoiVar.zza());
    }
}

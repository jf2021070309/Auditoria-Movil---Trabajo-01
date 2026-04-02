package com.google.ads.interactivemedia.v3.internal;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzop extends zzob {
    final /* synthetic */ TaskCompletionSource zza;

    public zzop(zzor zzorVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzoc
    public final void zzb(int i) {
        this.zza.trySetException(new zzol(i));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzoc
    public final void zzc(Bundle bundle) {
        this.zza.trySetResult(bundle.getString("newToken"));
    }
}

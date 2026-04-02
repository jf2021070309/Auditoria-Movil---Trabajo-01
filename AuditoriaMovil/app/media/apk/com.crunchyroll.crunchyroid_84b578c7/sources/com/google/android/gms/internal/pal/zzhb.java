package com.google.android.gms.internal.pal;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzhb extends zzgs {
    final /* synthetic */ TaskCompletionSource zza;

    public zzhb(zzhc zzhcVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.pal.zzgt
    public final void zzb(int i) {
        this.zza.trySetException(new zzgy(i));
    }

    @Override // com.google.android.gms.internal.pal.zzgt
    public final void zzc(Bundle bundle) {
        this.zza.trySetResult(bundle.getString("newToken"));
    }
}

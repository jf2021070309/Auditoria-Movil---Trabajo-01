package com.google.ads.interactivemedia.v3.internal;

import android.graphics.Bitmap;
import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzgz implements zzuz {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ String zzb;

    public zzgz(zzha zzhaVar, TaskCompletionSource taskCompletionSource, String str) {
        this.zza = taskCompletionSource;
        this.zzb = str;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzuz
    public final void zza(Throwable th) {
        this.zza.setException(new Exception("Failed to load image from: ".concat(String.valueOf(this.zzb)), th));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzuz
    public final /* synthetic */ void zzb(Object obj) {
        this.zza.trySetResult((Bitmap) obj);
    }
}

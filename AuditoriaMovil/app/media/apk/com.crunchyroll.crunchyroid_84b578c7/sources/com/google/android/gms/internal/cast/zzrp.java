package com.google.android.gms.internal.cast;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Future;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
public class zzrp extends zzrq {
    private final ListenableFuture zza;

    public zzrp(ListenableFuture listenableFuture) {
        this.zza = listenableFuture;
    }

    @Override // com.google.android.gms.internal.cast.zzro, com.google.android.gms.internal.cast.zzfi
    public final /* synthetic */ Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.cast.zzrq, com.google.android.gms.internal.cast.zzro
    public final /* synthetic */ Future zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.cast.zzrq
    public final ListenableFuture zzc() {
        return this.zza;
    }
}

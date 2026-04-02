package com.google.ads.interactivemedia.v3.internal;

import android.annotation.TargetApi;
import android.content.Context;
import com.google.ads.interactivemedia.v3.impl.data.NetworkRequestData;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
@TargetApi(19)
/* loaded from: classes2.dex */
public final class zzgc {
    private final zzga zza;
    private final zzfr zzb;
    private final zzvr zzc;

    public zzgc(Context context, zzfr zzfrVar, ExecutorService executorService, zzga zzgaVar) {
        this.zzc = zzvw.zza(executorService);
        this.zza = zzgaVar;
        this.zzb = zzfrVar;
    }

    public final /* synthetic */ com.google.ads.interactivemedia.v3.impl.data.zzbj zzb(NetworkRequestData networkRequestData) throws Exception {
        return this.zza.zza(networkRequestData);
    }

    public final void zzc(zzfe zzfeVar, String str, final NetworkRequestData networkRequestData) {
        zzfe zzfeVar2 = zzfe.activate;
        if (zzfeVar.ordinal() != 35) {
            zzhd.zzc("Unexpected network request of type".concat(String.valueOf(zzfeVar)));
        } else {
            zzvd.zzd(this.zzc.zza(new Callable() { // from class: com.google.ads.interactivemedia.v3.internal.zzfv
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzgc.this.zzb(networkRequestData);
                }
            }), new zzfw(this, str), this.zzc);
        }
    }
}

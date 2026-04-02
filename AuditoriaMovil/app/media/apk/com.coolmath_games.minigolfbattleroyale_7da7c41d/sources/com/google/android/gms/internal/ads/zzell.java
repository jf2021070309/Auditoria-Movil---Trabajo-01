package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzell implements zzddn {
    private final AtomicReference<zzbgw> zza = new AtomicReference<>();

    public final void zza(zzbgw zzbgwVar) {
        this.zza.set(zzbgwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzddn
    public final void zzo(final zzbdn zzbdnVar) {
        zzexc.zza(this.zza, new zzexb(zzbdnVar) { // from class: com.google.android.gms.internal.ads.zzelk
            private final zzbdn zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzbdnVar;
            }

            @Override // com.google.android.gms.internal.ads.zzexb
            public final void zza(Object obj) {
                ((zzbgw) obj).zze(this.zza);
            }
        });
    }
}

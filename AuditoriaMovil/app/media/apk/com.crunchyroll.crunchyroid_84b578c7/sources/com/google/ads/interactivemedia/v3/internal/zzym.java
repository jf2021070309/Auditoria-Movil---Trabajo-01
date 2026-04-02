package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzym extends zzxi {
    final /* synthetic */ boolean zza;
    final /* synthetic */ boolean zzb = true;
    final /* synthetic */ zzwm zzc;
    final /* synthetic */ zzact zzd;
    final /* synthetic */ zzyn zze;
    private zzxi zzf;

    public zzym(zzyn zzynVar, boolean z, boolean z2, zzwm zzwmVar, zzact zzactVar) {
        this.zze = zzynVar;
        this.zza = z;
        this.zzc = zzwmVar;
        this.zzd = zzactVar;
    }

    private final zzxi zza() {
        zzxi zzxiVar = this.zzf;
        if (zzxiVar != null) {
            return zzxiVar;
        }
        zzxi zzb = this.zzc.zzb(this.zze, this.zzd);
        this.zzf = zzb;
        return zzb;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final Object read(zzacv zzacvVar) throws IOException {
        if (this.zza) {
            zzacvVar.zzp();
            return null;
        }
        return zza().read(zzacvVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final void write(zzacx zzacxVar, Object obj) throws IOException {
        zzacxVar.zzf();
    }
}

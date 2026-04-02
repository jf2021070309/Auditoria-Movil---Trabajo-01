package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzffi implements zzffc {
    private final zzffm zza;
    private final zzffk zzb;
    private final zzfez zzc;

    public zzffi(zzfez zzfezVar, zzffm zzffmVar, zzffk zzffkVar, byte[] bArr) {
        this.zzc = zzfezVar;
        this.zza = zzffmVar;
        this.zzb = zzffkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzffc
    public final void zza(zzffb zzffbVar) {
        this.zzc.zza(zzb(zzffbVar));
    }

    @Override // com.google.android.gms.internal.ads.zzffc
    public final String zzb(zzffb zzffbVar) {
        zzffm zzffmVar = this.zza;
        Map<String, String> zzj = zzffbVar.zzj();
        this.zzb.zza(zzj);
        return zzffmVar.zza(zzj);
    }
}

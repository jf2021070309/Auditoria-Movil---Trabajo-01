package com.google.ads.interactivemedia.v3.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzaak implements zzxj {
    private final zzact zza;
    private final boolean zzb;
    private final zzwy zzc;
    private final zzwq zzd;

    public zzaak(Object obj, zzact zzactVar, boolean z, Class cls) {
        zzwy zzwyVar;
        if (obj instanceof zzwy) {
            zzwyVar = (zzwy) obj;
        } else {
            zzwyVar = null;
        }
        this.zzc = zzwyVar;
        zzwq zzwqVar = obj instanceof zzwq ? (zzwq) obj : null;
        this.zzd = zzwqVar;
        boolean z2 = true;
        if (zzwyVar == null && zzwqVar == null) {
            z2 = false;
        }
        zzxm.zza(z2);
        this.zza = zzactVar;
        this.zzb = z;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxj
    public final zzxi zza(zzwm zzwmVar, zzact zzactVar) {
        if (!this.zza.equals(zzactVar) && (!this.zzb || this.zza.zzd() != zzactVar.zzc())) {
            return null;
        }
        return new zzaal(this.zzc, this.zzd, zzwmVar, zzactVar, this, true);
    }
}

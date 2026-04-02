package com.google.ads.interactivemedia.v3.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzjf implements zzpr {
    final /* synthetic */ zzoy zza;

    public zzjf(zzoy zzoyVar) {
        this.zza = zzoyVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzpr
    public final void zza(int i, long j) {
        this.zza.zzd(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzpr
    public final void zzb(int i, long j, String str) {
        this.zza.zze(i, System.currentTimeMillis() - j, str);
    }
}

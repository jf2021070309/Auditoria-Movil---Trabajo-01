package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
final class zzfoy extends zzfpb {
    final /* synthetic */ zzfoz zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfoy(zzfoz zzfozVar, zzfpd zzfpdVar, CharSequence charSequence) {
        super(zzfpdVar, charSequence);
        this.zza = zzfozVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpb
    public final int zzd(int i) {
        int i2 = i + 4000;
        if (i2 < ((zzfpb) this).zzb.length()) {
            return i2;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzfpb
    public final int zzc(int i) {
        return i;
    }
}

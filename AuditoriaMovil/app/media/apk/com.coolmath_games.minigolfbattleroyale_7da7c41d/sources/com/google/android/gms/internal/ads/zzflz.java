package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
final class zzflz extends zzfme {
    final /* synthetic */ zzfma zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzflz(zzfma zzfmaVar, zzfmg zzfmgVar, CharSequence charSequence) {
        super(zzfmgVar, charSequence);
        this.zza = zzfmaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfme
    final int zzc(int i) {
        zzflk zzflkVar = this.zza.zza;
        CharSequence charSequence = this.zzb;
        int length = charSequence.length();
        zzflx.zzf(i, length, FirebaseAnalytics.Param.INDEX);
        while (i < length) {
            if (zzflkVar.zza(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzfme
    final int zzd(int i) {
        return i + 1;
    }
}

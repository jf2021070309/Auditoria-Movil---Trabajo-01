package com.google.android.gms.internal.atv_ads_framework;

import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: com.google.android.tv:tv-ads@@1.0.0-alpha02 */
/* loaded from: classes3.dex */
final class zzo extends zzq {
    final /* synthetic */ zzp zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzo(zzp zzpVar, zzr zzrVar, CharSequence charSequence) {
        super(zzrVar, charSequence);
        this.zza = zzpVar;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzq
    public final int zzc(int i) {
        return i + 1;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzq
    public final int zzd(int i) {
        CharSequence charSequence = ((zzq) this).zzb;
        int length = charSequence.length();
        zzn.zzb(i, length, FirebaseAnalytics.Param.INDEX);
        while (i < length) {
            if (charSequence.charAt(i) != ':') {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }
}

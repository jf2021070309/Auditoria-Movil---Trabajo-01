package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
final class zzfow extends zzfpb {
    final /* synthetic */ zzfox zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfow(zzfox zzfoxVar, zzfpd zzfpdVar, CharSequence charSequence) {
        super(zzfpdVar, charSequence);
        this.zza = zzfoxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpb
    public final int zzc(int i) {
        return i + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfpb
    public final int zzd(int i) {
        zzfob zzfobVar = this.zza.zza;
        CharSequence charSequence = ((zzfpb) this).zzb;
        int length = charSequence.length();
        zzfoq.zzb(i, length, FirebaseAnalytics.Param.INDEX);
        while (i < length) {
            if (!zzfobVar.zzb(charSequence.charAt(i))) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }
}

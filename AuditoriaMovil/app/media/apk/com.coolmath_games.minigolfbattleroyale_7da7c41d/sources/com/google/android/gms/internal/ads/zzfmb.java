package com.google.android.gms.internal.ads;

import com.google.android.gms.games.GamesStatusCodes;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
final class zzfmb extends zzfme {
    final /* synthetic */ zzfmc zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfmb(zzfmc zzfmcVar, zzfmg zzfmgVar, CharSequence charSequence) {
        super(zzfmgVar, charSequence);
        this.zza = zzfmcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfme
    public final int zzc(int i) {
        int i2 = i + GamesStatusCodes.STATUS_SNAPSHOT_NOT_FOUND;
        if (i2 < this.zzb.length()) {
            return i2;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzfme
    public final int zzd(int i) {
        return i;
    }
}

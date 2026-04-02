package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzfmb extends zzfme {
    public final /* synthetic */ zzfmc zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfmb(zzfmc zzfmcVar, zzfmg zzfmgVar, CharSequence charSequence) {
        super(zzfmgVar, charSequence);
        this.zza = zzfmcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfme
    public final int zzc(int i2) {
        int i3 = i2 + 4000;
        if (i3 < ((zzfme) this).zzb.length()) {
            return i3;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzfme
    public final int zzd(int i2) {
        return i2;
    }
}

package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzflz extends zzfme {
    public final /* synthetic */ zzfma zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzflz(zzfma zzfmaVar, zzfmg zzfmgVar, CharSequence charSequence) {
        super(zzfmgVar, charSequence);
        this.zza = zzfmaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfme
    public final int zzc(int i2) {
        zzflk zzflkVar = this.zza.zza;
        CharSequence charSequence = ((zzfme) this).zzb;
        int length = charSequence.length();
        zzflx.zzf(i2, length, "index");
        while (i2 < length) {
            if (zzflkVar.zza(charSequence.charAt(i2))) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzfme
    public final int zzd(int i2) {
        return i2 + 1;
    }
}

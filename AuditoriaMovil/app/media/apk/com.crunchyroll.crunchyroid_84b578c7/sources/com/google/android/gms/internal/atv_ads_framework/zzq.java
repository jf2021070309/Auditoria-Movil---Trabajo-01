package com.google.android.gms.internal.atv_ads_framework;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.tv:tv-ads@@1.0.0-alpha02 */
/* loaded from: classes3.dex */
public abstract class zzq extends zze {
    final CharSequence zzb;
    final zzk zzc;
    int zzd = 0;
    int zze;

    public zzq(zzr zzrVar, CharSequence charSequence) {
        zzk zzkVar;
        zzkVar = zzrVar.zza;
        this.zzc = zzkVar;
        this.zze = Integer.MAX_VALUE;
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zze
    public final /* bridge */ /* synthetic */ Object zza() {
        int zzc;
        int i = this.zzd;
        while (true) {
            int i2 = this.zzd;
            if (i2 != -1) {
                int zzd = zzd(i2);
                if (zzd == -1) {
                    zzd = this.zzb.length();
                    this.zzd = -1;
                    zzc = -1;
                } else {
                    zzc = zzc(zzd);
                    this.zzd = zzc;
                }
                if (zzc == i) {
                    int i3 = zzc + 1;
                    this.zzd = i3;
                    if (i3 > this.zzb.length()) {
                        this.zzd = -1;
                    }
                } else {
                    if (i < zzd) {
                        this.zzb.charAt(i);
                    }
                    if (i < zzd) {
                        this.zzb.charAt(zzd - 1);
                    }
                    int i4 = this.zze;
                    if (i4 == 1) {
                        zzd = this.zzb.length();
                        this.zzd = -1;
                        if (zzd > i) {
                            this.zzb.charAt(zzd - 1);
                        }
                    } else {
                        this.zze = i4 - 1;
                    }
                    return this.zzb.subSequence(i, zzd).toString();
                }
            } else {
                zzb();
                return null;
            }
        }
    }

    public abstract int zzc(int i);

    public abstract int zzd(int i);
}

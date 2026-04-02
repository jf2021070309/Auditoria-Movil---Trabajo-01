package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public abstract class zzfme extends zzfle<String> {
    public final CharSequence zzb;
    public final zzflk zzc;
    public int zzd = 0;
    public int zze;

    public zzfme(zzfmg zzfmgVar, CharSequence charSequence) {
        zzflk zzflkVar;
        zzflkVar = zzfmgVar.zza;
        this.zzc = zzflkVar;
        this.zze = Integer.MAX_VALUE;
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.ads.zzfle
    @CheckForNull
    public final /* bridge */ /* synthetic */ String zza() {
        int zzd;
        int i2 = this.zzd;
        while (true) {
            int i3 = this.zzd;
            if (i3 == -1) {
                zzb();
                return null;
            }
            int zzc = zzc(i3);
            if (zzc == -1) {
                zzc = this.zzb.length();
                this.zzd = -1;
                zzd = -1;
            } else {
                zzd = zzd(zzc);
                this.zzd = zzd;
            }
            if (zzd != i2) {
                if (i2 < zzc) {
                    this.zzb.charAt(i2);
                }
                if (i2 < zzc) {
                    this.zzb.charAt(zzc - 1);
                }
                int i4 = this.zze;
                if (i4 == 1) {
                    zzc = this.zzb.length();
                    this.zzd = -1;
                    if (zzc > i2) {
                        this.zzb.charAt(zzc - 1);
                    }
                } else {
                    this.zze = i4 - 1;
                }
                return this.zzb.subSequence(i2, zzc).toString();
            }
            int i5 = zzd + 1;
            this.zzd = i5;
            if (i5 > this.zzb.length()) {
                this.zzd = -1;
            }
        }
    }

    public abstract int zzc(int i2);

    public abstract int zzd(int i2);
}

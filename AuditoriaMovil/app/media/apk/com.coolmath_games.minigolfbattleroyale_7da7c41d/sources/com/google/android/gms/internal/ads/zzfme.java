package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
abstract class zzfme extends zzfle<String> {
    final CharSequence zzb;
    final zzflk zzc;
    int zzd = 0;
    int zze;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzfme(zzfmg zzfmgVar, CharSequence charSequence) {
        zzflk zzflkVar;
        zzflkVar = zzfmgVar.zza;
        this.zzc = zzflkVar;
        this.zze = Integer.MAX_VALUE;
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.ads.zzfle
    @CheckForNull
    protected final /* bridge */ /* synthetic */ String zza() {
        int zzd;
        int i = this.zzd;
        while (true) {
            int i2 = this.zzd;
            if (i2 == -1) {
                zzb();
                return null;
            }
            int zzc = zzc(i2);
            if (zzc == -1) {
                zzc = this.zzb.length();
                this.zzd = -1;
                zzd = -1;
            } else {
                zzd = zzd(zzc);
                this.zzd = zzd;
            }
            if (zzd == i) {
                int i3 = zzd + 1;
                this.zzd = i3;
                if (i3 > this.zzb.length()) {
                    this.zzd = -1;
                }
            } else {
                if (i < zzc) {
                    this.zzb.charAt(i);
                }
                if (i < zzc) {
                    this.zzb.charAt(zzc - 1);
                }
                int i4 = this.zze;
                if (i4 == 1) {
                    zzc = this.zzb.length();
                    this.zzd = -1;
                    if (zzc > i) {
                        this.zzb.charAt(zzc - 1);
                    }
                } else {
                    this.zze = i4 - 1;
                }
                return this.zzb.subSequence(i, zzc).toString();
            }
        }
    }

    abstract int zzc(int i);

    abstract int zzd(int i);
}

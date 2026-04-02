package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzuv implements zznu {
    public static final zzoa zza = zzur.zza;
    private zznx zzb;
    private zzox zzc;
    private zzut zzd;
    private int zze = -1;
    private long zzf = -1;

    @Override // com.google.android.gms.internal.ads.zznu
    public final boolean zza(zznv zznvVar) throws IOException {
        return zzuy.zza(zznvVar) != null;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzb(zznx zznxVar) {
        this.zzb = zznxVar;
        this.zzc = zznxVar.zzB(0, 1);
        zznxVar.zzC();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
        if (r15 != 65534) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    @Override // com.google.android.gms.internal.ads.zznu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(com.google.android.gms.internal.ads.zznv r14, com.google.android.gms.internal.ads.zzoq r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuv.zzc(com.google.android.gms.internal.ads.zznv, com.google.android.gms.internal.ads.zzoq):int");
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzd(long j, long j2) {
        zzut zzutVar = this.zzd;
        if (zzutVar != null) {
            zzutVar.zza(j2);
        }
    }
}

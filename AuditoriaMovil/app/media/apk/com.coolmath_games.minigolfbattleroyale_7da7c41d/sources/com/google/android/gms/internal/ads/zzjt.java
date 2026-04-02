package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzjt extends zzjx {
    public static final /* synthetic */ int zza = 0;
    private static final zzfpw<Integer> zzb = zzfpw.zzc(zzjh.zza);
    private static final zzfpw<Integer> zzc = zzfpw.zzc(zzji.zza);
    private final AtomicReference<zzjn> zzd;
    private final zzjd zze;

    @Deprecated
    public zzjt() {
        zzjn zzjnVar = zzjn.zzA;
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean zzf(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String zzg(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int zzh(zzafv zzafvVar, String str, boolean z) {
        if (TextUtils.isEmpty(str) || !str.equals(zzafvVar.zzc)) {
            String zzg = zzg(str);
            String zzg2 = zzg(zzafvVar.zzc);
            if (zzg2 == null || zzg == null) {
                return (z && zzg2 == null) ? 1 : 0;
            } else if (zzg2.startsWith(zzg) || zzg.startsWith(zzg2)) {
                return 3;
            } else {
                return zzamq.zzu(zzg2, "-")[0].equals(zzamq.zzu(zzg, "-")[0]) ? 2 : 0;
            }
        }
        return 4;
    }

    public final zzjn zzc() {
        return this.zzd.get();
    }

    public final void zzd(zzjo zzjoVar) {
        zzjn zzjnVar = new zzjn(zzjoVar);
        if (this.zzd.getAndSet(zzjnVar).equals(zzjnVar)) {
            return;
        }
        zzl();
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0312 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d3  */
    @Override // com.google.android.gms.internal.ads.zzjx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final android.util.Pair<com.google.android.gms.internal.ads.zzahx[], com.google.android.gms.internal.ads.zzjg[]> zze(com.google.android.gms.internal.ads.zzjw r28, int[][][] r29, int[] r30, com.google.android.gms.internal.ads.zzhf r31, com.google.android.gms.internal.ads.zzaiq r32) throws com.google.android.gms.internal.ads.zzaeg {
        /*
            Method dump skipped, instructions count: 1259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjt.zze(com.google.android.gms.internal.ads.zzjw, int[][][], int[], com.google.android.gms.internal.ads.zzhf, com.google.android.gms.internal.ads.zzaiq):android.util.Pair");
    }

    public zzjt(Context context) {
        zzjd zzjdVar = new zzjd();
        zzjn zzc2 = zzjn.zzc(context);
        this.zze = zzjdVar;
        this.zzd = new AtomicReference<>(zzc2);
    }
}

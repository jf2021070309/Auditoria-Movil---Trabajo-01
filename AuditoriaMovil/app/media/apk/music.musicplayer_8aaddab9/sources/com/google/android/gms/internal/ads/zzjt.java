package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
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

    public zzjt(Context context) {
        zzjd zzjdVar = new zzjd();
        zzjn zzc2 = zzjn.zzc(context);
        this.zze = zzjdVar;
        this.zzd = new AtomicReference<>(zzc2);
    }

    public static boolean zzf(int i2, boolean z) {
        int i3 = i2 & 7;
        return i3 == 4 || (z && i3 == 3);
    }

    public static String zzg(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

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

    /* JADX WARN: Removed duplicated region for block: B:156:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    @Override // com.google.android.gms.internal.ads.zzjx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair<com.google.android.gms.internal.ads.zzahx[], com.google.android.gms.internal.ads.zzjg[]> zze(com.google.android.gms.internal.ads.zzjw r28, int[][][] r29, int[] r30, com.google.android.gms.internal.ads.zzhf r31, com.google.android.gms.internal.ads.zzaiq r32) throws com.google.android.gms.internal.ads.zzaeg {
        /*
            Method dump skipped, instructions count: 1209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjt.zze(com.google.android.gms.internal.ads.zzjw, int[][][], int[], com.google.android.gms.internal.ads.zzhf, com.google.android.gms.internal.ads.zzaiq):android.util.Pair");
    }
}

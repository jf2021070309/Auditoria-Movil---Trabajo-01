package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.amazon.aps.iva.q.c0;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.File;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzqb {
    @VisibleForTesting
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final int zzd;

    public zzqb(Context context, int i) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzqc.zza(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzqc.zza(dir2, true);
        this.zza = dir2;
        this.zzd = i;
    }

    private final File zzd() {
        File file = new File(this.zzb, Integer.toString(this.zzd - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zze() {
        return c0.a("FBAMTD", this.zzd - 1);
    }

    private final String zzf() {
        return c0.a("LATMTD", this.zzd - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zza(com.google.ads.interactivemedia.v3.internal.zzmm r8, com.google.ads.interactivemedia.v3.internal.zzqh r9) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzqb.zza(com.google.ads.interactivemedia.v3.internal.zzmm, com.google.ads.interactivemedia.v3.internal.zzqh):boolean");
    }

    @VisibleForTesting
    public final zzmp zzb(int i) {
        String string;
        if (i == 1) {
            string = this.zzc.getString(zzf(), null);
        } else {
            string = this.zzc.getString(zze(), null);
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] stringToBytes = Hex.stringToBytes(string);
            zzadr zzadrVar = zzadr.zzb;
            zzmp zzg = zzmp.zzg(zzadr.zzs(stringToBytes, 0, stringToBytes.length));
            String zzk = zzg.zzk();
            File zzb = zzqc.zzb(zzk, "pcam.jar", zzd());
            if (!zzb.exists()) {
                zzb = zzqc.zzb(zzk, "pcam", zzd());
            }
            File zzb2 = zzqc.zzb(zzk, "pcbc", zzd());
            if (zzb.exists()) {
                if (zzb2.exists()) {
                    return zzg;
                }
            }
        } catch (zzafc unused) {
        }
        return null;
    }

    public final zzqa zzc(int i) {
        zzmp zzb = zzb(1);
        if (zzb == null) {
            return null;
        }
        String zzk = zzb.zzk();
        File zzb2 = zzqc.zzb(zzk, "pcam.jar", zzd());
        if (!zzb2.exists()) {
            zzb2 = zzqc.zzb(zzk, "pcam", zzd());
        }
        return new zzqa(zzb, zzb2, zzqc.zzb(zzk, "pcbc", zzd()), zzqc.zzb(zzk, "pcopt", zzd()));
    }
}

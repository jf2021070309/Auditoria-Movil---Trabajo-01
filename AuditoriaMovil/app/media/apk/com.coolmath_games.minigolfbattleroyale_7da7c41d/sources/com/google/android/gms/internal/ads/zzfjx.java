package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import java.io.File;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfjx {
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final int zzd;

    public zzfjx(Context context, int i) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfjy.zzd(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfjy.zzd(dir2, true);
        this.zza = dir2;
        this.zzd = i;
    }

    static String zzb(zzadi zzadiVar) {
        return Hex.bytesToStringLowercase(zzadiVar.zzan().zzz());
    }

    private final File zze() {
        File file = new File(this.zzb, Integer.toString(this.zzd - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zzf() {
        int i = this.zzd;
        StringBuilder sb = new StringBuilder(17);
        sb.append("FBAMTD");
        sb.append(i - 1);
        return sb.toString();
    }

    private final String zzg() {
        int i = this.zzd;
        StringBuilder sb = new StringBuilder(17);
        sb.append("LATMTD");
        sb.append(i - 1);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zza(com.google.android.gms.internal.ads.zzadf r8, com.google.android.gms.internal.ads.zzfkd r9) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfjx.zza(com.google.android.gms.internal.ads.zzadf, com.google.android.gms.internal.ads.zzfkd):boolean");
    }

    public final zzfjw zzc(int i) {
        zzadi zzd = zzd(1);
        if (zzd == null) {
            return null;
        }
        String zza = zzd.zza();
        File zza2 = zzfjy.zza(zza, "pcam.jar", zze());
        if (!zza2.exists()) {
            zza2 = zzfjy.zza(zza, "pcam", zze());
        }
        return new zzfjw(zzd, zza2, zzfjy.zza(zza, "pcbc", zze()), zzfjy.zza(zza, "pcopt", zze()));
    }

    final zzadi zzd(int i) {
        String string;
        if (i == 1) {
            string = this.zzc.getString(zzg(), null);
        } else {
            string = this.zzc.getString(zzf(), null);
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            zzadi zzg = zzadi.zzg(zzgex.zzt(Hex.stringToBytes(string)));
            String zza = zzg.zza();
            File zza2 = zzfjy.zza(zza, "pcam.jar", zze());
            if (!zza2.exists()) {
                zza2 = zzfjy.zza(zza, "pcam", zze());
            }
            File zza3 = zzfjy.zza(zza, "pcbc", zze());
            if (zza2.exists()) {
                if (zza3.exists()) {
                    return zzg;
                }
            }
        } catch (zzggm unused) {
        }
        return null;
    }
}

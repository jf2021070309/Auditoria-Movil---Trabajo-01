package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class zzcjc {
    private final Context zza;
    private final String zzb;
    private final zzcgz zzc;
    private final zzbjx zzd;
    private final zzbka zze;
    private final com.google.android.gms.ads.internal.util.zzbi zzf;
    private final long[] zzg;
    private final String[] zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private zzcii zzn;
    private boolean zzo;
    private boolean zzp;
    private long zzq;

    public zzcjc(Context context, zzcgz zzcgzVar, String str, zzbka zzbkaVar, zzbjx zzbjxVar) {
        com.google.android.gms.ads.internal.util.zzbg zzbgVar = new com.google.android.gms.ads.internal.util.zzbg();
        zzbgVar.zzd("min_1", Double.MIN_VALUE, 1.0d);
        zzbgVar.zzd("1_5", 1.0d, 5.0d);
        zzbgVar.zzd("5_10", 5.0d, 10.0d);
        zzbgVar.zzd("10_20", 10.0d, 20.0d);
        zzbgVar.zzd("20_30", 20.0d, 30.0d);
        zzbgVar.zzd("30_max", 30.0d, Double.MAX_VALUE);
        this.zzf = zzbgVar.zze();
        this.zzi = false;
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzq = -1L;
        this.zza = context;
        this.zzc = zzcgzVar;
        this.zzb = str;
        this.zze = zzbkaVar;
        this.zzd = zzbjxVar;
        String str2 = (String) zzbet.zzc().zzc(zzbjl.zzv);
        if (str2 == null) {
            this.zzh = new String[0];
            this.zzg = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        int length = split.length;
        this.zzh = new String[length];
        this.zzg = new long[length];
        for (int i2 = 0; i2 < split.length; i2++) {
            try {
                this.zzg[i2] = Long.parseLong(split[i2]);
            } catch (NumberFormatException e2) {
                zzcgt.zzj("Unable to parse frame hash target time number.", e2);
                this.zzg[i2] = -1;
            }
        }
    }

    public final void zza(zzcii zzciiVar) {
        zzbjs.zza(this.zze, this.zzd, "vpc2");
        this.zzi = true;
        this.zze.zzd("vpn", zzciiVar.zzd());
        this.zzn = zzciiVar;
    }

    public final void zzb() {
        if (!this.zzi || this.zzj) {
            return;
        }
        zzbjs.zza(this.zze, this.zzd, "vfr2");
        this.zzj = true;
    }

    public final void zzc() {
        if (!zzbll.zza.zze().booleanValue() || this.zzo) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString("request", this.zzb);
        bundle.putString("player", this.zzn.zzd());
        for (com.google.android.gms.ads.internal.util.zzbf zzbfVar : this.zzf.zzb()) {
            String valueOf = String.valueOf(zzbfVar.zza);
            bundle.putString(valueOf.length() != 0 ? "fps_c_".concat(valueOf) : new String("fps_c_"), Integer.toString(zzbfVar.zze));
            String valueOf2 = String.valueOf(zzbfVar.zza);
            bundle.putString(valueOf2.length() != 0 ? "fps_p_".concat(valueOf2) : new String("fps_p_"), Double.toString(zzbfVar.zzd));
        }
        int i2 = 0;
        while (true) {
            long[] jArr = this.zzg;
            if (i2 >= jArr.length) {
                com.google.android.gms.ads.internal.zzt.zzc().zzn(this.zza, this.zzc.zza, "gmob-apps", bundle, true);
                this.zzo = true;
                return;
            }
            String str = this.zzh[i2];
            if (str != null) {
                bundle.putString("fh_".concat(Long.valueOf(jArr[i2]).toString()), str);
            }
            i2++;
        }
    }

    public final void zzd(zzcii zzciiVar) {
        if (this.zzk && !this.zzl) {
            if (com.google.android.gms.ads.internal.util.zze.zzc() && !this.zzl) {
                com.google.android.gms.ads.internal.util.zze.zza("VideoMetricsMixin first frame");
            }
            zzbjs.zza(this.zze, this.zzd, "vff2");
            this.zzl = true;
        }
        long nanoTime = com.google.android.gms.ads.internal.zzt.zzj().nanoTime();
        if (this.zzm && this.zzp && this.zzq != -1) {
            long nanos = TimeUnit.SECONDS.toNanos(1L);
            long j2 = this.zzq;
            com.google.android.gms.ads.internal.util.zzbi zzbiVar = this.zzf;
            double d2 = nanos;
            double d3 = nanoTime - j2;
            Double.isNaN(d2);
            Double.isNaN(d3);
            zzbiVar.zza(d2 / d3);
        }
        this.zzp = this.zzm;
        this.zzq = nanoTime;
        long longValue = ((Long) zzbet.zzc().zzc(zzbjl.zzw)).longValue();
        long zzk = zzciiVar.zzk();
        int i2 = 0;
        while (true) {
            String[] strArr = this.zzh;
            if (i2 >= strArr.length) {
                return;
            }
            if (strArr[i2] == null && longValue > Math.abs(zzk - this.zzg[i2])) {
                String[] strArr2 = this.zzh;
                int i3 = 8;
                Bitmap bitmap = zzciiVar.getBitmap(8, 8);
                long j3 = 63;
                long j4 = 0;
                int i4 = 0;
                while (i4 < i3) {
                    int i5 = 0;
                    while (i5 < i3) {
                        int pixel = bitmap.getPixel(i5, i4);
                        j4 |= (Color.green(pixel) + (Color.red(pixel) + Color.blue(pixel)) > 128 ? 1L : 0L) << ((int) j3);
                        i5++;
                        j3--;
                        i3 = 8;
                    }
                    i4++;
                    i3 = 8;
                }
                strArr2[i2] = String.format("%016X", Long.valueOf(j4));
                return;
            }
            i2++;
        }
    }

    public final void zze() {
        this.zzm = true;
        if (!this.zzj || this.zzk) {
            return;
        }
        zzbjs.zza(this.zze, this.zzd, "vfp2");
        this.zzk = true;
    }

    public final void zzf() {
        this.zzm = false;
    }
}

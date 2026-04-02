package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzaan {
    protected volatile Boolean zzb;
    private final zzabr zzc;
    private static final ConditionVariable zzd = new ConditionVariable();
    protected static volatile zzfkk zza = null;
    private static volatile Random zze = null;

    public zzaan(zzabr zzabrVar) {
        this.zzc = zzabrVar;
        zzabrVar.zze().execute(new zzaam(this));
    }

    public static final int zzd() {
        try {
            return Build.VERSION.SDK_INT >= 21 ? ThreadLocalRandom.current().nextInt() : zze().nextInt();
        } catch (RuntimeException unused) {
            return zze().nextInt();
        }
    }

    private static Random zze() {
        if (zze == null) {
            synchronized (zzaan.class) {
                if (zze == null) {
                    zze = new Random();
                }
            }
        }
        return zze;
    }

    public final void zzc(int i, int i2, long j, String str, Exception exc) {
        try {
            zzd.block();
            if (!this.zzb.booleanValue() || zza == null) {
                return;
            }
            zzxv zza2 = zzxz.zza();
            zza2.zza(this.zzc.zza.getPackageName());
            zza2.zzb(j);
            if (str != null) {
                zza2.zze(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                zzged.zzc(exc, new PrintWriter(stringWriter));
                zza2.zzc(stringWriter.toString());
                zza2.zzd(exc.getClass().getName());
            }
            zzfki zza3 = zza.zza(zza2.zzah().zzao());
            zza3.zzc(i);
            if (i2 != -1) {
                zza3.zzb(i2);
            }
            zza3.zza();
        } catch (Exception unused) {
        }
    }
}

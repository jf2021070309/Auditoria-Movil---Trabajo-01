package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
/* loaded from: classes.dex */
public final class zzaan {
    public volatile Boolean zzb;
    private final zzabr zzc;
    private static final ConditionVariable zzd = new ConditionVariable();
    public static volatile zzfkk zza = null;
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

    public final void zzc(int i2, int i3, long j2, String str, Exception exc) {
        try {
            zzd.block();
            if (!this.zzb.booleanValue() || zza == null) {
                return;
            }
            zzxv zza2 = zzxz.zza();
            zza2.zza(this.zzc.zza.getPackageName());
            zza2.zzb(j2);
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
            zza3.zzc(i2);
            if (i3 != -1) {
                zza3.zzb(i3);
            }
            zza3.zza();
        } catch (Exception unused) {
        }
    }
}

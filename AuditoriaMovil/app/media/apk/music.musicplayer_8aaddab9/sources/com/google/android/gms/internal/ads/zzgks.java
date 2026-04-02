package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public abstract class zzgks {
    public static zzgks zzb(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new zzgkn(cls.getSimpleName()) : new zzgkp(cls.getSimpleName());
    }

    public abstract void zza(String str);
}

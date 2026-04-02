package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public abstract class zzgks {
    public static zzgks zzb(Class cls) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            return new zzgkn(cls.getSimpleName());
        }
        return new zzgkp(cls.getSimpleName());
    }

    public abstract void zza(String str);
}

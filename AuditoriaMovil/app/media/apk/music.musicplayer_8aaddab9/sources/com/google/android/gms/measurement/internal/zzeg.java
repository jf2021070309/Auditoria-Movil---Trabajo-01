package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import e.a.d.a.a;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public final class zzeg {
    public static final AtomicReference<String[]> zza = new AtomicReference<>();
    public static final AtomicReference<String[]> zzb = new AtomicReference<>();
    public static final AtomicReference<String[]> zzc = new AtomicReference<>();
    private final zzef zzd;

    public zzeg(zzef zzefVar) {
        this.zzd = zzefVar;
    }

    private static final String zzg(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (zzkz.zzak(str, strArr[i2])) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i2];
                    if (str2 == null) {
                        str2 = strArr2[i2] + "(" + strArr[i2] + ")";
                        strArr3[i2] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String zza(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder y = a.y("[");
        for (Object obj : objArr) {
            String zzb2 = obj instanceof Bundle ? zzb((Bundle) obj) : String.valueOf(obj);
            if (zzb2 != null) {
                if (y.length() != 1) {
                    y.append(", ");
                }
                y.append(zzb2);
            }
        }
        y.append("]");
        return y.toString();
    }

    public final String zzb(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (this.zzd.zza()) {
            StringBuilder y = a.y("Bundle[{");
            for (String str : bundle.keySet()) {
                if (y.length() != 8) {
                    y.append(", ");
                }
                y.append(zze(str));
                y.append("=");
                Object obj = bundle.get(str);
                y.append(obj instanceof Bundle ? zza(new Object[]{obj}) : obj instanceof Object[] ? zza((Object[]) obj) : obj instanceof ArrayList ? zza(((ArrayList) obj).toArray()) : String.valueOf(obj));
            }
            y.append("}]");
            return y.toString();
        }
        return bundle.toString();
    }

    public final String zzc(zzat zzatVar) {
        if (this.zzd.zza()) {
            StringBuilder y = a.y("origin=");
            y.append(zzatVar.zzc);
            y.append(",name=");
            y.append(zzd(zzatVar.zza));
            y.append(",params=");
            zzar zzarVar = zzatVar.zzb;
            y.append(zzarVar == null ? null : !this.zzd.zza() ? zzarVar.toString() : zzb(zzarVar.zzc()));
            return y.toString();
        }
        return zzatVar.toString();
    }

    public final String zzd(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, zzgs.zzc, zzgs.zza, zza);
    }

    public final String zze(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, zzgt.zzb, zzgt.zza, zzb);
    }

    public final String zzf(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : str.startsWith("_exp_") ? a.l("experiment_id(", str, ")") : zzg(str, zzgu.zzb, zzgu.zza, zzc);
    }
}

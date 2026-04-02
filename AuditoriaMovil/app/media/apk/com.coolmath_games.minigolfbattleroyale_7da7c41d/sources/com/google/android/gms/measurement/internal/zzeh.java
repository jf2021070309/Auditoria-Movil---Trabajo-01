package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
/* loaded from: classes2.dex */
public final class zzeh extends zzgo {
    protected static final AtomicReference<String[]> zza = new AtomicReference<>();
    protected static final AtomicReference<String[]> zzb = new AtomicReference<>();
    protected static final AtomicReference<String[]> zzc = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeh(zzfu zzfuVar) {
        super(zzfuVar);
    }

    private static final String zzi(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (zzku.zzS(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i];
                    if (str2 == null) {
                        str2 = strArr2[i] + "(" + strArr[i] + ")";
                        strArr3[i] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    @Override // com.google.android.gms.measurement.internal.zzgo
    protected final boolean zza() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzb() {
        this.zzs.zzat();
        return this.zzs.zzq() && Log.isLoggable(this.zzs.zzau().zzn(), 3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String zzc(String str) {
        if (str == null) {
            return null;
        }
        return !zzb() ? str : zzi(str, zzgr.zzc, zzgr.zza, zza);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String zzd(String str) {
        if (str == null) {
            return null;
        }
        return !zzb() ? str : zzi(str, zzgs.zzb, zzgs.zza, zzb);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String zze(String str) {
        if (str == null) {
            return null;
        }
        if (zzb()) {
            if (str.startsWith("_exp_")) {
                return "experiment_id(" + str + ")";
            }
            return zzi(str, zzgt.zzb, zzgt.zza, zzc);
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String zzf(Bundle bundle) {
        String valueOf;
        if (bundle == null) {
            return null;
        }
        if (!zzb()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(zzd(str));
            sb.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                valueOf = zzh(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                valueOf = zzh((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                valueOf = zzh(((ArrayList) obj).toArray());
            } else {
                valueOf = String.valueOf(obj);
            }
            sb.append(valueOf);
        }
        sb.append("}]");
        return sb.toString();
    }

    protected final String zzh(Object[] objArr) {
        String valueOf;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            if (obj instanceof Bundle) {
                valueOf = zzf((Bundle) obj);
            } else {
                valueOf = String.valueOf(obj);
            }
            if (valueOf != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(valueOf);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

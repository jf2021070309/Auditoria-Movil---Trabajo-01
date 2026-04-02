package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import e.a.d.a.a;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
/* loaded from: classes.dex */
public final class zzel extends zzgp {
    private char zza;
    private long zzb;
    private String zzc;
    private final zzej zzd;
    private final zzej zze;
    private final zzej zzf;
    private final zzej zzg;
    private final zzej zzh;
    private final zzej zzi;
    private final zzej zzj;
    private final zzej zzk;
    private final zzej zzl;

    public zzel(zzfv zzfvVar) {
        super(zzfvVar);
        this.zza = (char) 0;
        this.zzb = -1L;
        this.zzd = new zzej(this, 6, false, false);
        this.zze = new zzej(this, 6, true, false);
        this.zzf = new zzej(this, 6, false, true);
        this.zzg = new zzej(this, 5, false, false);
        this.zzh = new zzej(this, 5, true, false);
        this.zzi = new zzej(this, 5, false, true);
        this.zzj = new zzej(this, 4, false, false);
        this.zzk = new zzej(this, 3, false, false);
        this.zzl = new zzej(this, 2, false, false);
    }

    public static Object zzn(String str) {
        if (str == null) {
            return null;
        }
        return new zzek(str);
    }

    public static String zzo(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String zzp = zzp(z, obj);
        String zzp2 = zzp(z, obj2);
        String zzp3 = zzp(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(zzp)) {
            sb.append(str2);
            sb.append(zzp);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(zzp2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(zzp2);
        }
        if (!TextUtils.isEmpty(zzp3)) {
            sb.append(str3);
            sb.append(zzp3);
        }
        return sb.toString();
    }

    @VisibleForTesting
    public static String zzp(boolean z, Object obj) {
        String str;
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i2 = 0;
        if (obj instanceof Long) {
            if (z) {
                Long l2 = (Long) obj;
                if (Math.abs(l2.longValue()) < 100) {
                    return obj.toString();
                }
                String str2 = obj.toString().charAt(0) == '-' ? "-" : "";
                String valueOf = String.valueOf(Math.abs(l2.longValue()));
                long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
                long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
                StringBuilder sb = new StringBuilder(str2.length() + str2.length() + 43);
                a.K(sb, str2, round, "...");
                sb.append(str2);
                sb.append(round2);
                return sb.toString();
            }
            return obj.toString();
        } else if (obj instanceof Boolean) {
            return obj.toString();
        } else {
            if (!(obj instanceof Throwable)) {
                if (!(obj instanceof zzek)) {
                    return z ? "-" : obj.toString();
                }
                str = ((zzek) obj).zza;
                return str;
            }
            Throwable th = (Throwable) obj;
            StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
            String zzy = zzy(zzfv.class.getCanonicalName());
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i2];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && zzy(className).equals(zzy)) {
                    sb2.append(": ");
                    sb2.append(stackTraceElement);
                    break;
                }
                i2++;
            }
            return sb2.toString();
        }
    }

    private static String zzy(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    public final zzej zzc() {
        return this.zzk;
    }

    public final zzej zzd() {
        return this.zzd;
    }

    public final zzej zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.measurement.internal.zzgp
    public final boolean zzf() {
        return false;
    }

    public final zzej zzh() {
        return this.zze;
    }

    public final zzej zzi() {
        return this.zzj;
    }

    public final zzej zzj() {
        return this.zzl;
    }

    public final zzej zzk() {
        return this.zzg;
    }

    public final zzej zzl() {
        return this.zzi;
    }

    public final zzej zzm() {
        return this.zzh;
    }

    @VisibleForTesting
    @EnsuresNonNull({"logTagDoNotUseDirectly"})
    public final String zzq() {
        String str;
        synchronized (this) {
            if (this.zzc == null) {
                if (this.zzs.zzy() != null) {
                    this.zzc = this.zzs.zzy();
                } else {
                    this.zzc = this.zzs.zzf().zzn();
                }
            }
            Preconditions.checkNotNull(this.zzc);
            str = this.zzc;
        }
        return str;
    }

    public final void zzt(int i2, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(zzq(), i2)) {
            Log.println(i2, zzq(), zzo(false, str, obj, obj2, obj3));
        }
        if (z2 || i2 < 5) {
            return;
        }
        Preconditions.checkNotNull(str);
        zzfs zzo = this.zzs.zzo();
        if (zzo == null) {
            Log.println(6, zzq(), "Scheduler not set. Not logging error/warn");
        } else if (zzo.zzx()) {
            zzo.zzp(new zzei(this, i2 >= 9 ? 8 : i2, str, obj, obj2, obj3));
        } else {
            Log.println(6, zzq(), "Scheduler not initialized. Not logging error/warn");
        }
    }
}

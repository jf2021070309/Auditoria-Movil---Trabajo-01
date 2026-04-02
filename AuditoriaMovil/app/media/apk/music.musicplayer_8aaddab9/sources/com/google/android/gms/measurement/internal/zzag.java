package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
/* loaded from: classes2.dex */
public final class zzag {
    public static final zzag zza = new zzag(null, null);
    private final Boolean zzb;
    private final Boolean zzc;

    public zzag(Boolean bool, Boolean bool2) {
        this.zzb = bool;
        this.zzc = bool2;
    }

    public static zzag zza(Bundle bundle) {
        return bundle == null ? zza : new zzag(zzo(bundle.getString("ad_storage")), zzo(bundle.getString("analytics_storage")));
    }

    public static zzag zzb(String str) {
        Boolean bool;
        if (str != null) {
            Boolean zzp = str.length() >= 3 ? zzp(str.charAt(2)) : null;
            bool = str.length() >= 4 ? zzp(str.charAt(3)) : null;
            r0 = zzp;
        } else {
            bool = null;
        }
        return new zzag(r0, bool);
    }

    public static Boolean zzg(Boolean bool, Boolean bool2) {
        if (bool == null) {
            return bool2;
        }
        if (bool2 == null) {
            return bool;
        }
        boolean z = false;
        if (bool.booleanValue() && bool2.booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static String zzh(Bundle bundle) {
        String string = bundle.getString("ad_storage");
        if (string == null || zzo(string) != null) {
            String string2 = bundle.getString("analytics_storage");
            if (string2 == null || zzo(string2) != null) {
                return null;
            }
            return string2;
        }
        return string;
    }

    public static boolean zzl(int i2, int i3) {
        return i2 <= i3;
    }

    public static final int zzn(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    private static Boolean zzo(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    private static Boolean zzp(char c2) {
        if (c2 != '0') {
            if (c2 != '1') {
                return null;
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    private static final char zzq(Boolean bool) {
        return bool == null ? CoreConstants.DASH_CHAR : bool.booleanValue() ? '1' : '0';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzag) {
            zzag zzagVar = (zzag) obj;
            return zzn(this.zzb) == zzn(zzagVar.zzb) && zzn(this.zzc) == zzn(zzagVar.zzc);
        }
        return false;
    }

    public final int hashCode() {
        return zzn(this.zzc) + ((zzn(this.zzb) + 527) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConsentSettings: ");
        sb.append("adStorage=");
        Boolean bool = this.zzb;
        if (bool == null) {
            sb.append("uninitialized");
        } else {
            sb.append(true != bool.booleanValue() ? "denied" : "granted");
        }
        sb.append(", analyticsStorage=");
        Boolean bool2 = this.zzc;
        if (bool2 == null) {
            sb.append("uninitialized");
        } else {
            sb.append(true == bool2.booleanValue() ? "granted" : "denied");
        }
        return sb.toString();
    }

    public final zzag zzc(zzag zzagVar) {
        return new zzag(zzg(this.zzb, zzagVar.zzb), zzg(this.zzc, zzagVar.zzc));
    }

    public final zzag zzd(zzag zzagVar) {
        Boolean bool = this.zzb;
        if (bool == null) {
            bool = zzagVar.zzb;
        }
        Boolean bool2 = this.zzc;
        if (bool2 == null) {
            bool2 = zzagVar.zzc;
        }
        return new zzag(bool, bool2);
    }

    public final Boolean zze() {
        return this.zzb;
    }

    public final Boolean zzf() {
        return this.zzc;
    }

    public final String zzi() {
        return "G1" + zzq(this.zzb) + zzq(this.zzc);
    }

    public final boolean zzj() {
        Boolean bool = this.zzb;
        return bool == null || bool.booleanValue();
    }

    public final boolean zzk() {
        Boolean bool = this.zzc;
        return bool == null || bool.booleanValue();
    }

    public final boolean zzm(zzag zzagVar) {
        Boolean bool = this.zzb;
        Boolean bool2 = Boolean.FALSE;
        if (bool != bool2 || zzagVar.zzb == bool2) {
            return this.zzc == bool2 && zzagVar.zzc != bool2;
        }
        return true;
    }
}

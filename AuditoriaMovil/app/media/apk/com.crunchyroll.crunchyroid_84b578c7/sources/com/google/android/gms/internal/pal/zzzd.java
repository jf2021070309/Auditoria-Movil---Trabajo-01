package com.google.android.gms.internal.pal;

import java.math.BigInteger;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzzd extends zzyy {
    private final Object zza;

    public zzzd(Boolean bool) {
        this.zza = bool;
    }

    private static boolean zzh(zzzd zzzdVar) {
        Object obj = zzzdVar.zza;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        if (!(number instanceof BigInteger) && !(number instanceof Long) && !(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzzd.class != obj.getClass()) {
            return false;
        }
        zzzd zzzdVar = (zzzd) obj;
        if (zzh(this) && zzh(zzzdVar)) {
            if (zzb().longValue() == zzzdVar.zzb().longValue()) {
                return true;
            }
            return false;
        }
        Object obj2 = this.zza;
        if ((obj2 instanceof Number) && (zzzdVar.zza instanceof Number)) {
            double doubleValue = zzb().doubleValue();
            double doubleValue2 = zzzdVar.zzb().doubleValue();
            if (doubleValue == doubleValue2) {
                return true;
            }
            if (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2)) {
                return true;
            }
            return false;
        }
        return obj2.equals(zzzdVar.zza);
    }

    public final int hashCode() {
        long doubleToLongBits;
        if (zzh(this)) {
            doubleToLongBits = zzb().longValue();
        } else {
            Object obj = this.zza;
            if (obj instanceof Number) {
                doubleToLongBits = Double.doubleToLongBits(zzb().doubleValue());
            } else {
                return obj.hashCode();
            }
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    @Override // com.google.android.gms.internal.pal.zzyy
    public final int zza() {
        if (this.zza instanceof Number) {
            return zzb().intValue();
        }
        return Integer.parseInt(zzd());
    }

    public final Number zzb() {
        Object obj = this.zza;
        if (obj instanceof String) {
            return new zzzj((String) obj);
        }
        return (Number) obj;
    }

    public final boolean zzc() {
        Object obj = this.zza;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return Boolean.parseBoolean(zzd());
    }

    @Override // com.google.android.gms.internal.pal.zzyy
    public final String zzd() {
        Object obj = this.zza;
        if (!(obj instanceof Number)) {
            if (obj instanceof Boolean) {
                return ((Boolean) obj).toString();
            }
            return (String) obj;
        }
        return zzb().toString();
    }

    public final boolean zze() {
        return this.zza instanceof Boolean;
    }

    public final boolean zzg() {
        return this.zza instanceof Number;
    }

    public zzzd(Number number) {
        this.zza = number;
    }

    public zzzd(String str) {
        str.getClass();
        this.zza = str;
    }
}

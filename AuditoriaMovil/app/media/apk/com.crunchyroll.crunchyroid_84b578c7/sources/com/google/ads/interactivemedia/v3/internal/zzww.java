package com.google.ads.interactivemedia.v3.internal;

import java.math.BigInteger;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzww extends zzwr {
    private final Object zza;

    public zzww(Boolean bool) {
        this.zza = bool;
    }

    private static boolean zzg(zzww zzwwVar) {
        Object obj = zzwwVar.zza;
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
        if (obj == null || zzww.class != obj.getClass()) {
            return false;
        }
        zzww zzwwVar = (zzww) obj;
        if (this.zza == null) {
            if (zzwwVar.zza == null) {
                return true;
            }
            return false;
        } else if (zzg(this) && zzg(zzwwVar)) {
            if (!(this.zza instanceof BigInteger) && !(zzwwVar.zza instanceof BigInteger)) {
                if (zza().longValue() == zzwwVar.zza().longValue()) {
                    return true;
                }
                return false;
            }
            return zzc().equals(zzwwVar.zzc());
        } else {
            Object obj2 = this.zza;
            if ((obj2 instanceof Number) && (zzwwVar.zza instanceof Number)) {
                double doubleValue = zza().doubleValue();
                double doubleValue2 = zzwwVar.zza().doubleValue();
                if (doubleValue == doubleValue2) {
                    return true;
                }
                if (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2)) {
                    return true;
                }
                return false;
            }
            return obj2.equals(zzwwVar.zza);
        }
    }

    public final int hashCode() {
        long doubleToLongBits;
        if (this.zza == null) {
            return 31;
        }
        if (zzg(this)) {
            doubleToLongBits = zza().longValue();
        } else {
            Object obj = this.zza;
            if (obj instanceof Number) {
                doubleToLongBits = Double.doubleToLongBits(zza().doubleValue());
            } else {
                return obj.hashCode();
            }
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public final Number zza() {
        Object obj = this.zza;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new zzyq((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final String zzb() {
        Object obj = this.zza;
        if (!(obj instanceof String)) {
            if (!(obj instanceof Number)) {
                if (obj instanceof Boolean) {
                    return ((Boolean) obj).toString();
                }
                throw new AssertionError("Unexpected value type: ".concat(String.valueOf(obj.getClass())));
            }
            return zza().toString();
        }
        return (String) obj;
    }

    public final BigInteger zzc() {
        Object obj = this.zza;
        if (obj instanceof BigInteger) {
            return (BigInteger) obj;
        }
        if (zzg(this)) {
            return BigInteger.valueOf(zza().longValue());
        }
        return new BigInteger(zzb());
    }

    public final boolean zzd() {
        Object obj = this.zza;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return Boolean.parseBoolean(zzb());
    }

    public final boolean zze() {
        return this.zza instanceof Boolean;
    }

    public final boolean zzf() {
        return this.zza instanceof Number;
    }

    public zzww(Number number) {
        this.zza = number;
    }

    public zzww(String str) {
        str.getClass();
        this.zza = str;
    }
}

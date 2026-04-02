package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class zzgkt {
    public static final zzgkt zzj = new zzgkt(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final zzgkt zzk = new zzgkt(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final zzgkt zzl = new zzgkt(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final zzgkt zzm = new zzgkt(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double zza;
    public final double zzb;
    public final double zzc;
    public final double zzd;
    public final double zze;
    public final double zzf;
    public final double zzg;
    public final double zzh;
    public final double zzi;

    public zzgkt(double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
        this.zza = d6;
        this.zzb = d7;
        this.zzc = d8;
        this.zzd = d2;
        this.zze = d3;
        this.zzf = d4;
        this.zzg = d5;
        this.zzh = d9;
        this.zzi = d10;
    }

    public static zzgkt zza(ByteBuffer byteBuffer) {
        double zze = zzxo.zze(byteBuffer);
        double zze2 = zzxo.zze(byteBuffer);
        double zzf = zzxo.zzf(byteBuffer);
        return new zzgkt(zze, zze2, zzxo.zze(byteBuffer), zzxo.zze(byteBuffer), zzf, zzxo.zzf(byteBuffer), zzxo.zzf(byteBuffer), zzxo.zze(byteBuffer), zzxo.zze(byteBuffer));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzgkt.class != obj.getClass()) {
            return false;
        }
        zzgkt zzgktVar = (zzgkt) obj;
        return Double.compare(zzgktVar.zzd, this.zzd) == 0 && Double.compare(zzgktVar.zze, this.zze) == 0 && Double.compare(zzgktVar.zzf, this.zzf) == 0 && Double.compare(zzgktVar.zzg, this.zzg) == 0 && Double.compare(zzgktVar.zzh, this.zzh) == 0 && Double.compare(zzgktVar.zzi, this.zzi) == 0 && Double.compare(zzgktVar.zza, this.zza) == 0 && Double.compare(zzgktVar.zzb, this.zzb) == 0 && Double.compare(zzgktVar.zzc, this.zzc) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.zza);
        long doubleToLongBits2 = Double.doubleToLongBits(this.zzb);
        long doubleToLongBits3 = Double.doubleToLongBits(this.zzc);
        long doubleToLongBits4 = Double.doubleToLongBits(this.zzd);
        long doubleToLongBits5 = Double.doubleToLongBits(this.zze);
        long doubleToLongBits6 = Double.doubleToLongBits(this.zzf);
        long doubleToLongBits7 = Double.doubleToLongBits(this.zzg);
        long doubleToLongBits8 = Double.doubleToLongBits(this.zzh);
        long doubleToLongBits9 = Double.doubleToLongBits(this.zzi);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3))) * 31) + ((int) ((doubleToLongBits4 >>> 32) ^ doubleToLongBits4))) * 31) + ((int) ((doubleToLongBits5 >>> 32) ^ doubleToLongBits5))) * 31) + ((int) ((doubleToLongBits6 >>> 32) ^ doubleToLongBits6))) * 31) + ((int) ((doubleToLongBits7 >>> 32) ^ doubleToLongBits7))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(zzj)) {
            return "Rotate 0°";
        }
        if (equals(zzk)) {
            return "Rotate 90°";
        }
        if (equals(zzl)) {
            return "Rotate 180°";
        }
        if (equals(zzm)) {
            return "Rotate 270°";
        }
        double d2 = this.zza;
        double d3 = this.zzb;
        double d4 = this.zzc;
        double d5 = this.zzd;
        double d6 = this.zze;
        double d7 = this.zzf;
        double d8 = this.zzg;
        double d9 = this.zzh;
        double d10 = this.zzi;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d2);
        sb.append(", v=");
        sb.append(d3);
        sb.append(", w=");
        sb.append(d4);
        sb.append(", a=");
        sb.append(d5);
        sb.append(", b=");
        sb.append(d6);
        sb.append(", c=");
        sb.append(d7);
        sb.append(", d=");
        sb.append(d8);
        sb.append(", tx=");
        sb.append(d9);
        sb.append(", ty=");
        sb.append(d10);
        sb.append("}");
        return sb.toString();
    }
}

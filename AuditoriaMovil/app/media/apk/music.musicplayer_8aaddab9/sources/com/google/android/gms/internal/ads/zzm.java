package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import e.a.d.a.a;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;
/* loaded from: classes.dex */
public final class zzm implements Parcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new zzl();
    public final UUID zza;
    public final String zzb;
    public final String zzc;
    public final byte[] zzd;
    private int zze;

    public zzm(Parcel parcel) {
        this.zza = new UUID(parcel.readLong(), parcel.readLong());
        this.zzb = parcel.readString();
        String readString = parcel.readString();
        int i2 = zzamq.zza;
        this.zzc = readString;
        this.zzd = parcel.createByteArray();
    }

    public zzm(UUID uuid, String str, String str2, byte[] bArr) {
        Objects.requireNonNull(uuid);
        this.zza = uuid;
        this.zzb = null;
        this.zzc = str2;
        this.zzd = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzm) {
            if (obj == this) {
                return true;
            }
            zzm zzmVar = (zzm) obj;
            return zzamq.zzc(this.zzb, zzmVar.zzb) && zzamq.zzc(this.zzc, zzmVar.zzc) && zzamq.zzc(this.zza, zzmVar.zza) && Arrays.equals(this.zzd, zzmVar.zzd);
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zze;
        if (i2 == 0) {
            int hashCode = this.zza.hashCode() * 31;
            String str = this.zzb;
            int x = a.x(this.zzc, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31) + Arrays.hashCode(this.zzd);
            this.zze = x;
            return x;
        }
        return i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.zza.getMostSignificantBits());
        parcel.writeLong(this.zza.getLeastSignificantBits());
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeByteArray(this.zzd);
    }
}

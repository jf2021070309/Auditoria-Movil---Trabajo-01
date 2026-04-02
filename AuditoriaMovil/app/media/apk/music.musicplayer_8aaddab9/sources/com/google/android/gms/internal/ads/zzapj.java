package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import e.a.d.a.a;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;
/* loaded from: classes.dex */
public final class zzapj implements Parcelable {
    public static final Parcelable.Creator<zzapj> CREATOR = new zzapi();
    public final String zza;
    public final byte[] zzb;
    public final boolean zzc;
    private int zzd;
    private final UUID zze;

    public zzapj(Parcel parcel) {
        this.zze = new UUID(parcel.readLong(), parcel.readLong());
        this.zza = parcel.readString();
        this.zzb = parcel.createByteArray();
        this.zzc = parcel.readByte() != 0;
    }

    public zzapj(UUID uuid, String str, byte[] bArr, boolean z) {
        Objects.requireNonNull(uuid);
        this.zze = uuid;
        this.zza = str;
        Objects.requireNonNull(bArr);
        this.zzb = bArr;
        this.zzc = false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzapj) {
            if (obj == this) {
                return true;
            }
            zzapj zzapjVar = (zzapj) obj;
            return this.zza.equals(zzapjVar.zza) && zzave.zza(this.zze, zzapjVar.zze) && Arrays.equals(this.zzb, zzapjVar.zzb);
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zzd;
        if (i2 == 0) {
            int x = a.x(this.zza, this.zze.hashCode() * 31, 31) + Arrays.hashCode(this.zzb);
            this.zzd = x;
            return x;
        }
        return i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.zze.getMostSignificantBits());
        parcel.writeLong(this.zze.getLeastSignificantBits());
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
        parcel.writeByte(this.zzc ? (byte) 1 : (byte) 0);
    }
}

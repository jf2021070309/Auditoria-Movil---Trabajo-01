package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzapj implements Parcelable {
    public static final Parcelable.Creator<zzapj> CREATOR = new zzapi();
    public final String zza;
    public final byte[] zzb;
    public final boolean zzc;
    private int zzd;
    private final UUID zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzapj(Parcel parcel) {
        this.zze = new UUID(parcel.readLong(), parcel.readLong());
        this.zza = parcel.readString();
        this.zzb = parcel.createByteArray();
        this.zzc = parcel.readByte() != 0;
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
        int i = this.zzd;
        if (i == 0) {
            int hashCode = (((this.zze.hashCode() * 31) + this.zza.hashCode()) * 31) + Arrays.hashCode(this.zzb);
            this.zzd = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.zze.getMostSignificantBits());
        parcel.writeLong(this.zze.getLeastSignificantBits());
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
        parcel.writeByte(this.zzc ? (byte) 1 : (byte) 0);
    }

    public zzapj(UUID uuid, String str, byte[] bArr, boolean z) {
        if (uuid == null) {
            throw null;
        }
        this.zze = uuid;
        this.zza = str;
        if (bArr == null) {
            throw null;
        }
        this.zzb = bArr;
        this.zzc = false;
    }
}

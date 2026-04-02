package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzm implements Parcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new zzl();
    public final UUID zza;
    public final String zzb;
    public final String zzc;
    public final byte[] zzd;
    private int zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzm(Parcel parcel) {
        this.zza = new UUID(parcel.readLong(), parcel.readLong());
        this.zzb = parcel.readString();
        String readString = parcel.readString();
        int i = zzamq.zza;
        this.zzc = readString;
        this.zzd = parcel.createByteArray();
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
        int i = this.zze;
        if (i == 0) {
            int hashCode = this.zza.hashCode() * 31;
            String str = this.zzb;
            int hashCode2 = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.zzc.hashCode()) * 31) + Arrays.hashCode(this.zzd);
            this.zze = hashCode2;
            return hashCode2;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.zza.getMostSignificantBits());
        parcel.writeLong(this.zza.getLeastSignificantBits());
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    public zzm(UUID uuid, String str, String str2, byte[] bArr) {
        if (uuid == null) {
            throw null;
        }
        this.zza = uuid;
        this.zzb = null;
        this.zzc = str2;
        this.zzd = bArr;
    }
}

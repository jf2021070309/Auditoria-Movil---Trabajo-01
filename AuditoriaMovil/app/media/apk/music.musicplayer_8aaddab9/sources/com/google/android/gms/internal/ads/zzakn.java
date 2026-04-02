package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import e.a.d.a.a;
/* loaded from: classes.dex */
public final class zzakn implements zzaiu {
    public static final Parcelable.Creator<zzakn> CREATOR = new zzakl();
    public final long zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;

    public zzakn(long j2, long j3, long j4, long j5, long j6) {
        this.zza = j2;
        this.zzb = j3;
        this.zzc = j4;
        this.zzd = j5;
        this.zze = j6;
    }

    public /* synthetic */ zzakn(Parcel parcel, zzakm zzakmVar) {
        this.zza = parcel.readLong();
        this.zzb = parcel.readLong();
        this.zzc = parcel.readLong();
        this.zzd = parcel.readLong();
        this.zze = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzakn.class == obj.getClass()) {
            zzakn zzaknVar = (zzakn) obj;
            if (this.zza == zzaknVar.zza && this.zzb == zzaknVar.zzb && this.zzc == zzaknVar.zzc && this.zzd == zzaknVar.zzd && this.zze == zzaknVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.zza;
        long j3 = this.zzb;
        long j4 = this.zzc;
        long j5 = this.zzd;
        long j6 = this.zze;
        return ((((((((((int) (j2 ^ (j2 >>> 32))) + 527) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) ((j4 >>> 32) ^ j4))) * 31) + ((int) ((j5 >>> 32) ^ j5))) * 31) + ((int) ((j6 >>> 32) ^ j6));
    }

    public final String toString() {
        long j2 = this.zza;
        long j3 = this.zzb;
        long j4 = this.zzc;
        long j5 = this.zzd;
        long j6 = this.zze;
        StringBuilder sb = new StringBuilder(218);
        sb.append("Motion photo metadata: photoStartPosition=");
        sb.append(j2);
        sb.append(", photoSize=");
        sb.append(j3);
        a.K(sb, ", photoPresentationTimestampUs=", j4, ", videoStartPosition=");
        sb.append(j5);
        sb.append(", videoSize=");
        sb.append(j6);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.zza);
        parcel.writeLong(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeLong(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzaiu
    public final void zza(zzagm zzagmVar) {
    }
}

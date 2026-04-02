package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzaiz implements zzaiu {
    public static final Parcelable.Creator<zzaiz> CREATOR;
    private static final zzafv zzf;
    private static final zzafv zzg;
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final byte[] zze;
    private int zzh;

    static {
        zzaft zzaftVar = new zzaft();
        zzaftVar.zzN("application/id3");
        zzf = zzaftVar.zzah();
        zzaft zzaftVar2 = new zzaft();
        zzaftVar2.zzN("application/x-scte35");
        zzg = zzaftVar2.zzah();
        CREATOR = new zzaiy();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaiz(Parcel parcel) {
        String readString = parcel.readString();
        int i = zzamq.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readLong();
        this.zzd = parcel.readLong();
        this.zze = (byte[]) zzamq.zzd(parcel.createByteArray());
    }

    public zzaiz(String str, String str2, long j, long j2, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaiz zzaizVar = (zzaiz) obj;
            if (this.zzc == zzaizVar.zzc && this.zzd == zzaizVar.zzd && zzamq.zzc(this.zza, zzaizVar.zza) && zzamq.zzc(this.zzb, zzaizVar.zzb) && Arrays.equals(this.zze, zzaizVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzh;
        if (i == 0) {
            String str = this.zza;
            int hashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String str2 = this.zzb;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            long j = this.zzc;
            long j2 = this.zzd;
            int hashCode3 = ((((((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + Arrays.hashCode(this.zze);
            this.zzh = hashCode3;
            return hashCode3;
        }
        return i;
    }

    public final String toString() {
        String str = this.zza;
        long j = this.zzd;
        long j2 = this.zzc;
        String str2 = this.zzb;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 79 + String.valueOf(str2).length());
        sb.append("EMSG: scheme=");
        sb.append(str);
        sb.append(", id=");
        sb.append(j);
        sb.append(", durationMs=");
        sb.append(j2);
        sb.append(", value=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeByteArray(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzaiu
    public final void zza(zzagm zzagmVar) {
    }
}

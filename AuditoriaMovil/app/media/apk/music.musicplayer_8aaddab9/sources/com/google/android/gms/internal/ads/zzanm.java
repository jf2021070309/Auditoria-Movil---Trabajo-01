package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import e.a.d.a.a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class zzanm implements Parcelable {
    public static final Parcelable.Creator<zzanm> CREATOR = new zzanl();
    private int zzA;
    public final String zza;
    public final int zzb;
    public final String zzc;
    public final zzaru zzd;
    public final String zze;
    public final String zzf;
    public final int zzg;
    public final List<byte[]> zzh;
    public final zzapk zzi;
    public final int zzj;
    public final int zzk;
    public final float zzl;
    public final int zzm;
    public final float zzn;
    public final int zzo;
    public final byte[] zzp;
    public final zzavh zzq;
    public final int zzr;
    public final int zzs;
    public final int zzt;
    public final int zzu;
    public final int zzv;
    public final long zzw;
    public final int zzx;
    public final String zzy;
    public final int zzz;

    public zzanm(Parcel parcel) {
        this.zza = parcel.readString();
        this.zze = parcel.readString();
        this.zzf = parcel.readString();
        this.zzc = parcel.readString();
        this.zzb = parcel.readInt();
        this.zzg = parcel.readInt();
        this.zzj = parcel.readInt();
        this.zzk = parcel.readInt();
        this.zzl = parcel.readFloat();
        this.zzm = parcel.readInt();
        this.zzn = parcel.readFloat();
        this.zzp = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.zzo = parcel.readInt();
        this.zzq = (zzavh) parcel.readParcelable(zzavh.class.getClassLoader());
        this.zzr = parcel.readInt();
        this.zzs = parcel.readInt();
        this.zzt = parcel.readInt();
        this.zzu = parcel.readInt();
        this.zzv = parcel.readInt();
        this.zzx = parcel.readInt();
        this.zzy = parcel.readString();
        this.zzz = parcel.readInt();
        this.zzw = parcel.readLong();
        int readInt = parcel.readInt();
        this.zzh = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            this.zzh.add(parcel.createByteArray());
        }
        this.zzi = (zzapk) parcel.readParcelable(zzapk.class.getClassLoader());
        this.zzd = (zzaru) parcel.readParcelable(zzaru.class.getClassLoader());
    }

    public zzanm(String str, String str2, String str3, String str4, int i2, int i3, int i4, int i5, float f2, int i6, float f3, byte[] bArr, int i7, zzavh zzavhVar, int i8, int i9, int i10, int i11, int i12, int i13, String str5, int i14, long j2, List<byte[]> list, zzapk zzapkVar, zzaru zzaruVar) {
        this.zza = str;
        this.zze = str2;
        this.zzf = str3;
        this.zzc = str4;
        this.zzb = i2;
        this.zzg = i3;
        this.zzj = i4;
        this.zzk = i5;
        this.zzl = f2;
        this.zzm = i6;
        this.zzn = f3;
        this.zzp = bArr;
        this.zzo = i7;
        this.zzq = zzavhVar;
        this.zzr = i8;
        this.zzs = i9;
        this.zzt = i10;
        this.zzu = i11;
        this.zzv = i12;
        this.zzx = i13;
        this.zzy = str5;
        this.zzz = i14;
        this.zzw = j2;
        this.zzh = list == null ? Collections.emptyList() : list;
        this.zzi = zzapkVar;
        this.zzd = zzaruVar;
    }

    public static zzanm zza(String str, String str2, String str3, int i2, int i3, int i4, int i5, float f2, List<byte[]> list, int i6, float f3, byte[] bArr, int i7, zzavh zzavhVar, zzapk zzapkVar) {
        return new zzanm(str, null, str2, null, -1, i3, i4, i5, -1.0f, i6, f3, bArr, i7, zzavhVar, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, zzapkVar, null);
    }

    public static zzanm zzb(String str, String str2, String str3, int i2, int i3, int i4, int i5, List<byte[]> list, zzapk zzapkVar, int i6, String str4) {
        return zzc(str, str2, null, -1, -1, i4, i5, -1, -1, -1, null, zzapkVar, 0, str4, null);
    }

    public static zzanm zzc(String str, String str2, String str3, int i2, int i3, int i4, int i5, int i6, int i7, int i8, List<byte[]> list, zzapk zzapkVar, int i9, String str4, zzaru zzaruVar) {
        return new zzanm(str, null, str2, null, -1, i3, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i4, i5, i6, -1, -1, i9, str4, -1, Long.MAX_VALUE, list, zzapkVar, null);
    }

    public static zzanm zzd(String str, String str2, String str3, int i2, int i3, String str4, int i4, zzapk zzapkVar, long j2, List<byte[]> list) {
        return new zzanm(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i3, str4, -1, j2, list, zzapkVar, null);
    }

    public static zzanm zze(String str, String str2, String str3, int i2, List<byte[]> list, String str4, zzapk zzapkVar) {
        return new zzanm(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, str4, -1, Long.MAX_VALUE, list, zzapkVar, null);
    }

    public static zzanm zzf(String str, String str2, String str3, int i2, zzapk zzapkVar) {
        return new zzanm(str, null, "application/x-camera-motion", null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, zzapkVar, null);
    }

    @TargetApi(16)
    private static void zzm(MediaFormat mediaFormat, String str, int i2) {
        if (i2 != -1) {
            mediaFormat.setInteger(str, i2);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzanm.class == obj.getClass()) {
            zzanm zzanmVar = (zzanm) obj;
            if (this.zzb == zzanmVar.zzb && this.zzg == zzanmVar.zzg && this.zzj == zzanmVar.zzj && this.zzk == zzanmVar.zzk && this.zzl == zzanmVar.zzl && this.zzm == zzanmVar.zzm && this.zzn == zzanmVar.zzn && this.zzo == zzanmVar.zzo && this.zzr == zzanmVar.zzr && this.zzs == zzanmVar.zzs && this.zzt == zzanmVar.zzt && this.zzu == zzanmVar.zzu && this.zzv == zzanmVar.zzv && this.zzw == zzanmVar.zzw && this.zzx == zzanmVar.zzx && zzave.zza(this.zza, zzanmVar.zza) && zzave.zza(this.zzy, zzanmVar.zzy) && this.zzz == zzanmVar.zzz && zzave.zza(this.zze, zzanmVar.zze) && zzave.zza(this.zzf, zzanmVar.zzf) && zzave.zza(this.zzc, zzanmVar.zzc) && zzave.zza(this.zzi, zzanmVar.zzi) && zzave.zza(this.zzd, zzanmVar.zzd) && zzave.zza(this.zzq, zzanmVar.zzq) && Arrays.equals(this.zzp, zzanmVar.zzp) && this.zzh.size() == zzanmVar.zzh.size()) {
                for (int i2 = 0; i2 < this.zzh.size(); i2++) {
                    if (!Arrays.equals(this.zzh.get(i2), zzanmVar.zzh.get(i2))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zzA;
        if (i2 == 0) {
            String str = this.zza;
            int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
            String str2 = this.zze;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.zzf;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.zzc;
            int hashCode4 = (((((((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.zzb) * 31) + this.zzj) * 31) + this.zzk) * 31) + this.zzr) * 31) + this.zzs) * 31;
            String str5 = this.zzy;
            int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.zzz) * 31;
            zzapk zzapkVar = this.zzi;
            int hashCode6 = (hashCode5 + (zzapkVar == null ? 0 : zzapkVar.hashCode())) * 31;
            zzaru zzaruVar = this.zzd;
            int hashCode7 = hashCode6 + (zzaruVar != null ? zzaruVar.hashCode() : 0);
            this.zzA = hashCode7;
            return hashCode7;
        }
        return i2;
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zze;
        String str3 = this.zzf;
        int i2 = this.zzb;
        String str4 = this.zzy;
        int i3 = this.zzj;
        int i4 = this.zzk;
        float f2 = this.zzl;
        int i5 = this.zzr;
        int i6 = this.zzs;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 100 + length2 + String.valueOf(str3).length() + String.valueOf(str4).length());
        a.M(sb, "Format(", str, ", ", str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(str4);
        sb.append(", [");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(", ");
        sb.append(f2);
        sb.append("], [");
        sb.append(i5);
        sb.append(", ");
        sb.append(i6);
        sb.append("])");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zze);
        parcel.writeString(this.zzf);
        parcel.writeString(this.zzc);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzg);
        parcel.writeInt(this.zzj);
        parcel.writeInt(this.zzk);
        parcel.writeFloat(this.zzl);
        parcel.writeInt(this.zzm);
        parcel.writeFloat(this.zzn);
        parcel.writeInt(this.zzp != null ? 1 : 0);
        byte[] bArr = this.zzp;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.zzo);
        parcel.writeParcelable(this.zzq, i2);
        parcel.writeInt(this.zzr);
        parcel.writeInt(this.zzs);
        parcel.writeInt(this.zzt);
        parcel.writeInt(this.zzu);
        parcel.writeInt(this.zzv);
        parcel.writeInt(this.zzx);
        parcel.writeString(this.zzy);
        parcel.writeInt(this.zzz);
        parcel.writeLong(this.zzw);
        int size = this.zzh.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeByteArray(this.zzh.get(i3));
        }
        parcel.writeParcelable(this.zzi, 0);
        parcel.writeParcelable(this.zzd, 0);
    }

    public final zzanm zzg(int i2) {
        return new zzanm(this.zza, this.zze, this.zzf, this.zzc, this.zzb, i2, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, this.zzv, this.zzx, this.zzy, this.zzz, this.zzw, this.zzh, this.zzi, this.zzd);
    }

    public final zzanm zzh(int i2, int i3) {
        return new zzanm(this.zza, this.zze, this.zzf, this.zzc, this.zzb, this.zzg, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, i2, i3, this.zzx, this.zzy, this.zzz, this.zzw, this.zzh, this.zzi, this.zzd);
    }

    public final zzanm zzi(zzapk zzapkVar) {
        return new zzanm(this.zza, this.zze, this.zzf, this.zzc, this.zzb, this.zzg, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, this.zzv, this.zzx, this.zzy, this.zzz, this.zzw, this.zzh, zzapkVar, this.zzd);
    }

    public final zzanm zzj(zzaru zzaruVar) {
        return new zzanm(this.zza, this.zze, this.zzf, this.zzc, this.zzb, this.zzg, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, this.zzv, this.zzx, this.zzy, this.zzz, this.zzw, this.zzh, this.zzi, zzaruVar);
    }

    public final int zzk() {
        int i2;
        int i3 = this.zzj;
        if (i3 == -1 || (i2 = this.zzk) == -1) {
            return -1;
        }
        return i3 * i2;
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(16)
    public final MediaFormat zzl() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.zzf);
        String str = this.zzy;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        zzm(mediaFormat, "max-input-size", this.zzg);
        zzm(mediaFormat, "width", this.zzj);
        zzm(mediaFormat, "height", this.zzk);
        float f2 = this.zzl;
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        zzm(mediaFormat, "rotation-degrees", this.zzm);
        zzm(mediaFormat, "channel-count", this.zzr);
        zzm(mediaFormat, "sample-rate", this.zzs);
        zzm(mediaFormat, "encoder-delay", this.zzu);
        zzm(mediaFormat, "encoder-padding", this.zzv);
        for (int i2 = 0; i2 < this.zzh.size(); i2++) {
            mediaFormat.setByteBuffer(a.R(15, "csd-", i2), ByteBuffer.wrap(this.zzh.get(i2)));
        }
        zzavh zzavhVar = this.zzq;
        if (zzavhVar != null) {
            zzm(mediaFormat, "color-transfer", zzavhVar.zzc);
            zzm(mediaFormat, "color-standard", zzavhVar.zza);
            zzm(mediaFormat, "color-range", zzavhVar.zzb);
            byte[] bArr = zzavhVar.zzd;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }
}

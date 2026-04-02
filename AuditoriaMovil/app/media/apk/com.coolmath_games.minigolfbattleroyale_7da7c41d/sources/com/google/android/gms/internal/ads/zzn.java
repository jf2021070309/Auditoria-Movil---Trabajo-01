package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzn implements Comparator<zzm>, Parcelable {
    public static final Parcelable.Creator<zzn> CREATOR = new zzk();
    public final String zza;
    private final zzm[] zzb;
    private int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzn(Parcel parcel) {
        this.zza = parcel.readString();
        zzm[] zzmVarArr = (zzm[]) zzamq.zzd((zzm[]) parcel.createTypedArray(zzm.CREATOR));
        this.zzb = zzmVarArr;
        int length = zzmVarArr.length;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzm zzmVar, zzm zzmVar2) {
        zzm zzmVar3 = zzmVar;
        zzm zzmVar4 = zzmVar2;
        if (zzadx.zza.equals(zzmVar3.zza)) {
            return !zzadx.zza.equals(zzmVar4.zza) ? 1 : 0;
        }
        return zzmVar3.zza.compareTo(zzmVar4.zza);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzn zznVar = (zzn) obj;
            if (zzamq.zzc(this.zza, zznVar.zza) && Arrays.equals(this.zzb, zznVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeTypedArray(this.zzb, 0);
    }

    public final zzn zza(String str) {
        return zzamq.zzc(this.zza, str) ? this : new zzn(str, false, this.zzb);
    }

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            String str = this.zza;
            int hashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.zzb);
            this.zzc = hashCode;
            return hashCode;
        }
        return i;
    }

    private zzn(String str, boolean z, zzm... zzmVarArr) {
        this.zza = str;
        zzmVarArr = z ? (zzm[]) zzmVarArr.clone() : zzmVarArr;
        this.zzb = zzmVarArr;
        int length = zzmVarArr.length;
        Arrays.sort(zzmVarArr, this);
    }

    public zzn(String str, zzm... zzmVarArr) {
        this(null, true, zzmVarArr);
    }

    public zzn(List<zzm> list) {
        this(null, false, (zzm[]) list.toArray(new zzm[0]));
    }
}

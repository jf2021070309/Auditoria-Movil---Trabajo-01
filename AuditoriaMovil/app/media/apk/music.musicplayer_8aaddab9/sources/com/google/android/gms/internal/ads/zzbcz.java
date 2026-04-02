package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "AdErrorParcelCreator")
/* loaded from: classes.dex */
public final class zzbcz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbcz> CREATOR = new zzbda();
    @SafeParcelable.Field(id = 1)
    public final int zza;
    @SafeParcelable.Field(id = 2)
    public final String zzb;
    @SafeParcelable.Field(id = 3)
    public final String zzc;
    @SafeParcelable.Field(id = 4)
    public zzbcz zzd;
    @SafeParcelable.Field(id = 5, type = "android.os.IBinder")
    public IBinder zze;

    @SafeParcelable.Constructor
    public zzbcz(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) zzbcz zzbczVar, @SafeParcelable.Param(id = 5) IBinder iBinder) {
        this.zza = i2;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzbczVar;
        this.zze = iBinder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i2, false);
        SafeParcelWriter.writeIBinder(parcel, 5, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final AdError zza() {
        zzbcz zzbczVar = this.zzd;
        return new AdError(this.zza, this.zzb, this.zzc, zzbczVar == null ? null : new AdError(zzbczVar.zza, zzbczVar.zzb, zzbczVar.zzc));
    }

    public final LoadAdError zzb() {
        zzbcz zzbczVar = this.zzd;
        zzbgz zzbgzVar = null;
        AdError adError = zzbczVar == null ? null : new AdError(zzbczVar.zza, zzbczVar.zzb, zzbczVar.zzc);
        int i2 = this.zza;
        String str = this.zzb;
        String str2 = this.zzc;
        IBinder iBinder = this.zze;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            zzbgzVar = queryLocalInterface instanceof zzbgz ? (zzbgz) queryLocalInterface : new zzbgx(iBinder);
        }
        return new LoadAdError(i2, str, str2, adError, ResponseInfo.zzb(zzbgzVar));
    }
}

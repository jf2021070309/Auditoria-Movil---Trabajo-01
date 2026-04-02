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
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbcz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbcz> CREATOR = new zzbda();
    public final int zza;
    public final String zzb;
    public final String zzc;
    public zzbcz zzd;
    public IBinder zze;

    public zzbcz(int i, String str, String str2, zzbcz zzbczVar, IBinder iBinder) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzbczVar;
        this.zze = iBinder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
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
        int i = this.zza;
        String str = this.zzb;
        String str2 = this.zzc;
        IBinder iBinder = this.zze;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            if (queryLocalInterface instanceof zzbgz) {
                zzbgzVar = (zzbgz) queryLocalInterface;
            } else {
                zzbgzVar = new zzbgx(iBinder);
            }
        }
        return new LoadAdError(i, str, str2, adError, ResponseInfo.zzb(zzbgzVar));
    }
}

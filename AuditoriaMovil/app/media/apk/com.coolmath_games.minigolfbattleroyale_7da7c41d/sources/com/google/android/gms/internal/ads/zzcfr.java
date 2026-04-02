package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzcfr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcfr> CREATOR = new zzcfs();
    @Deprecated
    public final String zza;
    public final String zzb;
    @Deprecated
    public final zzbdl zzc;
    public final zzbdg zzd;

    public zzcfr(String str, String str2, zzbdl zzbdlVar, zzbdg zzbdgVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzbdlVar;
        this.zzd = zzbdgVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

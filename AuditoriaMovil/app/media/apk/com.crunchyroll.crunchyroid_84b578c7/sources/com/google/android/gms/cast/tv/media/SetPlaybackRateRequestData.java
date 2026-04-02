package com.google.android.gms.cast.tv.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
@SafeParcelable.Class(creator = "SetPlaybackRateRequestDataCreator")
/* loaded from: classes2.dex */
public class SetPlaybackRateRequestData extends AbstractSafeParcelable implements zzw {
    @SafeParcelable.Field(id = 1)
    Bundle zza;
    zza zzb;
    @SafeParcelable.Field(getter = "getPlaybackRate", id = 2)
    private Double zzd;
    @SafeParcelable.Field(getter = "getRelativePlaybackRate", id = 3)
    private Double zze;
    private static final Logger zzc = new Logger("SetPlbkRateReq");
    public static final Parcelable.Creator<SetPlaybackRateRequestData> CREATOR = new zzy();

    @SafeParcelable.Constructor
    public SetPlaybackRateRequestData(@SafeParcelable.Param(id = 1) Bundle bundle, @SafeParcelable.Param(id = 2) Double d, @SafeParcelable.Param(id = 3) Double d2) {
        this(new zza(bundle), d, d2);
    }

    public static SetPlaybackRateRequestData zza(c cVar) {
        Double d;
        Double d2 = null;
        if (cVar.has("playbackRate")) {
            d = Double.valueOf(cVar.optDouble("playbackRate"));
        } else {
            d = null;
        }
        if (cVar.has("relativePlaybackRate")) {
            d2 = Double.valueOf(cVar.optDouble("relativePlaybackRate"));
        }
        return new SetPlaybackRateRequestData(zza.zzb(cVar), d, d2);
    }

    @Override // com.google.android.gms.cast.RequestData
    public c getCustomData() {
        return this.zzb.getCustomData();
    }

    public Double getPlaybackRate() {
        return this.zzd;
    }

    public Double getRelativePlaybackRate() {
        return this.zze;
    }

    @Override // com.google.android.gms.cast.RequestData
    public final long getRequestId() {
        return this.zzb.getRequestId();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        this.zza = this.zzb.zza();
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 1, this.zza, false);
        SafeParcelWriter.writeDoubleObject(parcel, 2, getPlaybackRate(), false);
        SafeParcelWriter.writeDoubleObject(parcel, 3, getRelativePlaybackRate(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final void zzb(com.google.android.gms.internal.cast_tv.zzl zzlVar) {
        this.zzb.zzd(zzlVar);
    }

    @Override // com.google.android.gms.cast.tv.media.zzw
    public final com.google.android.gms.internal.cast_tv.zzl zzc() {
        return this.zzb.zzc();
    }

    public final void zzd(Double d) {
        this.zzd = d;
    }

    public final void zze(Double d) {
        this.zze = null;
    }

    private SetPlaybackRateRequestData(zza zzaVar, Double d, Double d2) {
        this.zzb = zzaVar;
        this.zzd = d;
        this.zze = d2;
    }
}

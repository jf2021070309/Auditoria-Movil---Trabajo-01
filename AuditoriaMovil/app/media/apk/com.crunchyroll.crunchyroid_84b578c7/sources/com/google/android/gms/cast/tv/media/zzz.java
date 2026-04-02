package com.google.android.gms.cast.tv.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
@SafeParcelable.Class(creator = "SimpleRequestDataCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class zzz extends AbstractSafeParcelable implements zzw {
    public static final Parcelable.Creator<zzz> CREATOR = new zzaa();
    @SafeParcelable.Field(id = 2)
    Bundle zza;
    final zza zzb;

    @SafeParcelable.Constructor
    public zzz(@SafeParcelable.Param(id = 2) Bundle bundle) {
        this.zzb = new zza(bundle);
    }

    public static zzz zza(c cVar) {
        return new zzz(zza.zzb(cVar));
    }

    @Override // com.google.android.gms.cast.RequestData
    public final c getCustomData() {
        return this.zzb.getCustomData();
    }

    @Override // com.google.android.gms.cast.RequestData
    public final long getRequestId() {
        return this.zzb.getRequestId();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.zza = this.zzb.zza();
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final void zzb(com.google.android.gms.internal.cast_tv.zzl zzlVar) {
        this.zzb.zzd(zzlVar);
    }

    @Override // com.google.android.gms.cast.tv.media.zzw
    public final com.google.android.gms.internal.cast_tv.zzl zzc() {
        return this.zzb.zzc();
    }

    private zzz(zza zzaVar) {
        this.zzb = zzaVar;
    }
}

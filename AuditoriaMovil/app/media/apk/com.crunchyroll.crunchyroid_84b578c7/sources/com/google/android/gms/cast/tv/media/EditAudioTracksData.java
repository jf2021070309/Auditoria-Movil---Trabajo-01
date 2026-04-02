package com.google.android.gms.cast.tv.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
@SafeParcelable.Class(creator = "EditAudioTracksDataCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public class EditAudioTracksData extends AbstractSafeParcelable implements zzw {
    public static final Parcelable.Creator<EditAudioTracksData> CREATOR = new zzb();
    @SafeParcelable.Field(id = 2)
    Bundle zza;
    final zza zzb;
    @SafeParcelable.Field(getter = "getLanguage", id = 3)
    private final String zzc;
    @SafeParcelable.Field(getter = "getIsSuggestedLanguage", id = 4)
    private final Boolean zzd;

    public EditAudioTracksData(zza zzaVar, String str, Boolean bool) {
        this.zzb = zzaVar;
        this.zzc = str;
        this.zzd = bool;
    }

    public static EditAudioTracksData zza(c cVar) {
        String str;
        Boolean bool = null;
        if (cVar.has("language")) {
            str = cVar.optString("language");
        } else {
            str = null;
        }
        if (cVar.has("isSuggestedLanguage")) {
            bool = Boolean.valueOf(cVar.optBoolean("isSuggestedLanguage"));
        }
        return new EditAudioTracksData(zza.zzb(cVar), str, bool);
    }

    @Override // com.google.android.gms.cast.RequestData
    public c getCustomData() {
        return this.zzb.getCustomData();
    }

    public Boolean getIsSuggestedLanguage() {
        return this.zzd;
    }

    public String getLanguage() {
        return this.zzc;
    }

    @Override // com.google.android.gms.cast.RequestData
    public final long getRequestId() {
        return this.zzb.getRequestId();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        this.zza = this.zzb.zza();
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, getLanguage(), false);
        SafeParcelWriter.writeBooleanObject(parcel, 4, getIsSuggestedLanguage(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final void zzb(com.google.android.gms.internal.cast_tv.zzl zzlVar) {
        this.zzb.zzd(zzlVar);
    }

    @Override // com.google.android.gms.cast.tv.media.zzw
    public final com.google.android.gms.internal.cast_tv.zzl zzc() {
        return this.zzb.zzc();
    }
}

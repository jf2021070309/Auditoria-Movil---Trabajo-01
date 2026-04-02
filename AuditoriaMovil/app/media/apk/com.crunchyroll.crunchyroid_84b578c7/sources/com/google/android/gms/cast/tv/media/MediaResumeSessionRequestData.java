package com.google.android.gms.cast.tv.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.cast.SessionState;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.JsonUtils;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
@SafeParcelable.Class(creator = "MediaResumeSessionRequestDataCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public class MediaResumeSessionRequestData extends AbstractSafeParcelable implements zzw {
    @SafeParcelable.Field(id = 2)
    Bundle zza;
    zza zzb;
    @SafeParcelable.Field(getter = "getSessionState", id = 3)
    private final SessionState zzd;
    private static final Logger zzc = new Logger("ResumeSessionReq");
    public static final Parcelable.Creator<MediaResumeSessionRequestData> CREATOR = new zzk();

    @SafeParcelable.Constructor
    public MediaResumeSessionRequestData(@SafeParcelable.Param(id = 2) Bundle bundle, @SafeParcelable.Param(id = 3) SessionState sessionState) {
        this(new zza(bundle), sessionState);
    }

    public static MediaResumeSessionRequestData zza(c cVar) throws com.google.android.gms.internal.cast_tv.zzv {
        c optJSONObject = cVar.optJSONObject("sessionState");
        if (optJSONObject != null) {
            return new MediaResumeSessionRequestData(zza.zzb(cVar), SessionState.fromJson(optJSONObject));
        }
        throw new com.google.android.gms.internal.cast_tv.zzv("Invalid MediaResumeSessionRequestData: no sessionState");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaResumeSessionRequestData)) {
            return false;
        }
        MediaResumeSessionRequestData mediaResumeSessionRequestData = (MediaResumeSessionRequestData) obj;
        if (JsonUtils.areJsonValuesEquivalent(getCustomData(), mediaResumeSessionRequestData.getCustomData()) && Objects.equal(this.zzd, mediaResumeSessionRequestData.zzd) && this.zzb.getRequestId() == mediaResumeSessionRequestData.zzb.getRequestId()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.cast.RequestData
    public c getCustomData() {
        return this.zzb.getCustomData();
    }

    @Override // com.google.android.gms.cast.RequestData
    public final long getRequestId() {
        return this.zzb.getRequestId();
    }

    public SessionState getSessionState() {
        return this.zzd;
    }

    public int hashCode() {
        return Objects.hashCode(this.zzd, String.valueOf(getCustomData()), Long.valueOf(this.zzb.getRequestId()));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        this.zza = this.zzb.zza();
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, this.zza, false);
        SafeParcelWriter.writeParcelable(parcel, 3, getSessionState(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final c zzb() {
        c cVar = new c();
        try {
            SessionState sessionState = this.zzd;
            if (sessionState != null) {
                cVar.put("sessionState", sessionState.toJson());
            }
            cVar.put("requestId", this.zzb.getRequestId());
            cVar.putOpt("customData", getCustomData());
        } catch (b e) {
            zzc.e("Failed to transform MediaResumeSessionRequestData into JSON", e);
        }
        return cVar;
    }

    @Override // com.google.android.gms.cast.tv.media.zzw
    public final com.google.android.gms.internal.cast_tv.zzl zzc() {
        return this.zzb.zzc();
    }

    private MediaResumeSessionRequestData(zza zzaVar, SessionState sessionState) {
        this.zzb = zzaVar;
        this.zzd = sessionState;
    }
}

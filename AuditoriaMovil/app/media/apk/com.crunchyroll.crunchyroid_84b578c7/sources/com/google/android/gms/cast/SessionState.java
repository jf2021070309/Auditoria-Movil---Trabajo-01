package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.JsonUtils;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
@SafeParcelable.Class(creator = "SessionStateCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public class SessionState extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SessionState> CREATOR = new zzdr();
    @SafeParcelable.Field(id = 3)
    String zza;
    @SafeParcelable.Field(getter = "getLoadRequestData", id = 2)
    private final MediaLoadRequestData zzb;
    private final c zzc;

    /* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
    /* loaded from: classes2.dex */
    public static class Builder {
        private MediaLoadRequestData zza;
        private c zzb;

        public SessionState build() {
            return new SessionState(this.zza, this.zzb);
        }

        public Builder setCustomData(c cVar) {
            this.zzb = cVar;
            return this;
        }

        public Builder setLoadRequestData(MediaLoadRequestData mediaLoadRequestData) {
            this.zza = mediaLoadRequestData;
            return this;
        }
    }

    public SessionState(MediaLoadRequestData mediaLoadRequestData, c cVar) {
        this.zzb = mediaLoadRequestData;
        this.zzc = cVar;
    }

    @KeepForSdk
    public static SessionState fromJson(c cVar) {
        MediaLoadRequestData mediaLoadRequestData;
        c optJSONObject = cVar.optJSONObject("loadRequestData");
        if (optJSONObject != null) {
            mediaLoadRequestData = MediaLoadRequestData.fromJson(optJSONObject);
        } else {
            mediaLoadRequestData = null;
        }
        return new SessionState(mediaLoadRequestData, cVar.optJSONObject("customData"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionState)) {
            return false;
        }
        SessionState sessionState = (SessionState) obj;
        if (!JsonUtils.areJsonValuesEquivalent(this.zzc, sessionState.zzc)) {
            return false;
        }
        return Objects.equal(this.zzb, sessionState.zzb);
    }

    public c getCustomData() {
        return this.zzc;
    }

    public MediaLoadRequestData getLoadRequestData() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(this.zzb, String.valueOf(this.zzc));
    }

    @KeepForSdk
    public c toJson() {
        try {
            c cVar = new c();
            MediaLoadRequestData mediaLoadRequestData = this.zzb;
            if (mediaLoadRequestData != null) {
                cVar.put("loadRequestData", mediaLoadRequestData.toJson());
            }
            cVar.put("customData", this.zzc);
            return cVar;
        } catch (b unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        String cVar;
        c cVar2 = this.zzc;
        if (cVar2 == null) {
            cVar = null;
        } else {
            cVar = cVar2.toString();
        }
        this.zza = cVar;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getLoadRequestData(), i, false);
        SafeParcelWriter.writeString(parcel, 3, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

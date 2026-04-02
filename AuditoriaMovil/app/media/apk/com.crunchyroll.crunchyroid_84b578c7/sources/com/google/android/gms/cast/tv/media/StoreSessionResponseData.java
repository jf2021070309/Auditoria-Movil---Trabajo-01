package com.google.android.gms.cast.tv.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.cast.SessionState;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.JsonUtils;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
@SafeParcelable.Class(creator = "StoreSessionResponseDataCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public class StoreSessionResponseData extends AbstractSafeParcelable implements zzw {
    public static final Parcelable.Creator<StoreSessionResponseData> CREATOR = new zzad();
    @SafeParcelable.Field(id = 2)
    Bundle zza;
    zza zzb;
    @SafeParcelable.Field(getter = "getSessionState", id = 3)
    private final SessionState zzc;

    /* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
    /* loaded from: classes2.dex */
    public static class Builder {
        private SessionState zza;
        private c zzb;

        public StoreSessionResponseData build() {
            return new StoreSessionResponseData(new zza(0L, this.zzb, null), this.zza);
        }

        public Builder setCustomData(c cVar) {
            this.zzb = cVar;
            return this;
        }

        public Builder setSessionState(SessionState sessionState) {
            this.zza = sessionState;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreSessionResponseData)) {
            return false;
        }
        StoreSessionResponseData storeSessionResponseData = (StoreSessionResponseData) obj;
        if (!JsonUtils.areJsonValuesEquivalent(getCustomData(), storeSessionResponseData.getCustomData())) {
            return false;
        }
        return Objects.equal(this.zzc, storeSessionResponseData.zzc);
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
        return this.zzc;
    }

    public int hashCode() {
        return Objects.hashCode(this.zzc, String.valueOf(getCustomData()));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        this.zza = this.zzb.zza();
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, this.zza, false);
        SafeParcelWriter.writeParcelable(parcel, 3, getSessionState(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final c zza() {
        c cVar = new c();
        try {
            cVar.putOpt("requestId", Long.valueOf(this.zzb.getRequestId()));
            cVar.putOpt("customData", getCustomData());
            SessionState sessionState = this.zzc;
            if (sessionState != null) {
                cVar.putOpt("sessionState", sessionState.toJson());
            }
        } catch (b unused) {
        }
        return cVar;
    }

    public final void zzb(long j) {
        this.zzb.zze(j);
    }

    @Override // com.google.android.gms.cast.tv.media.zzw
    public final com.google.android.gms.internal.cast_tv.zzl zzc() {
        return this.zzb.zzc();
    }

    @SafeParcelable.Constructor
    public StoreSessionResponseData(@SafeParcelable.Param(id = 2) Bundle bundle, @SafeParcelable.Param(id = 3) SessionState sessionState) {
        this(new zza(bundle), sessionState);
    }

    private StoreSessionResponseData(zza zzaVar, SessionState sessionState) {
        this.zzb = zzaVar;
        this.zzc = sessionState;
    }
}

package com.google.android.gms.cast.tv.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
@SafeParcelable.Class(creator = "UserActionRequestDataCreator")
/* loaded from: classes2.dex */
public class UserActionRequestData extends AbstractSafeParcelable implements zzw {
    public static final Parcelable.Creator<UserActionRequestData> CREATOR = new zzae();
    @SafeParcelable.Field(id = 1)
    Bundle zza;
    zza zzb;
    @SafeParcelable.Field(getter = "getUserAction", id = 2)
    private final String zzc;
    @SafeParcelable.Field(getter = "getUserActionContext", id = 3)
    private final String zzd;

    @SafeParcelable.Constructor
    public UserActionRequestData(@SafeParcelable.Param(id = 1) Bundle bundle, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2) {
        this(new zza(bundle), str, str2);
    }

    public static UserActionRequestData zza(c cVar) {
        String str;
        Preconditions.checkArgument("USER_ACTION".equals(cVar.optString("type")), "The message type is not of type USER_ACTION");
        String optString = cVar.optString("userAction");
        if (cVar.has("userActionContext")) {
            str = cVar.optString("userActionContext");
        } else {
            str = null;
        }
        return new UserActionRequestData(zza.zzb(cVar), optString, str);
    }

    @Override // com.google.android.gms.cast.RequestData
    public c getCustomData() {
        return this.zzb.getCustomData();
    }

    @Override // com.google.android.gms.cast.RequestData
    public final long getRequestId() {
        return this.zzb.getRequestId();
    }

    public String getUserAction() {
        return this.zzc;
    }

    public String getUserActionContext() {
        return this.zzd;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        this.zza = this.zzb.zza();
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, getUserAction(), false);
        SafeParcelWriter.writeString(parcel, 3, getUserActionContext(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.android.gms.cast.tv.media.zzw
    public final com.google.android.gms.internal.cast_tv.zzl zzc() {
        return this.zzb.zzc();
    }

    private UserActionRequestData(zza zzaVar, String str, String str2) {
        this.zzb = zzaVar;
        this.zzc = str;
        this.zzd = str2;
    }
}

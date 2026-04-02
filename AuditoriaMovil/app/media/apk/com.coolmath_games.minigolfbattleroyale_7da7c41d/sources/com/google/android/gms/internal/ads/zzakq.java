package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzakq implements zzaiu {
    public static final Parcelable.Creator<zzakq> CREATOR = new zzako();
    public final float zza;
    public final int zzb;

    public zzakq(float f, int i) {
        this.zza = f;
        this.zzb = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzakq(Parcel parcel, zzakp zzakpVar) {
        this.zza = parcel.readFloat();
        this.zzb = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzakq zzakqVar = (zzakq) obj;
            if (this.zza == zzakqVar.zza && this.zzb == zzakqVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.zza).hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb;
    }

    public final String toString() {
        float f = this.zza;
        int i = this.zzb;
        StringBuilder sb = new StringBuilder(73);
        sb.append("smta: captureFrameRate=");
        sb.append(f);
        sb.append(", svcTemporalLayerCount=");
        sb.append(i);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.zza);
        parcel.writeInt(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzaiu
    public final void zza(zzagm zzagmVar) {
    }
}

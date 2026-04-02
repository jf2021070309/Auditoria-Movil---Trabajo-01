package com.google.android.gms.internal.pal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
@SafeParcelable.Class(creator = "GassResponseParcelCreator")
/* loaded from: classes3.dex */
public final class zzhk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzhk> CREATOR = new zzhl();
    @SafeParcelable.VersionField(id = 1)
    public final int zza;
    @SafeParcelable.Field(getter = "getAfmaSignalsAsBytes", id = 2, type = "byte[]")
    private zzaf zzb = null;
    private byte[] zzc;

    @SafeParcelable.Constructor
    public zzhk(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) byte[] bArr) {
        this.zza = i;
        this.zzc = bArr;
        zzb();
    }

    private final void zzb() {
        zzaf zzafVar = this.zzb;
        if (zzafVar == null && this.zzc != null) {
            return;
        }
        if (zzafVar != null && this.zzc == null) {
            return;
        }
        if (zzafVar != null && this.zzc != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        }
        if (zzafVar == null && this.zzc == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        }
        throw new IllegalStateException("Impossible");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        byte[] bArr = this.zzc;
        if (bArr == null) {
            bArr = this.zzb.zzas();
        }
        SafeParcelWriter.writeByteArray(parcel, 2, bArr, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzaf zza() {
        if (this.zzb == null) {
            try {
                this.zzb = zzaf.zzd(this.zzc, zzacm.zza());
                this.zzc = null;
            } catch (zzadi | NullPointerException e) {
                throw new IllegalStateException(e);
            }
        }
        zzb();
        return this.zzb;
    }
}

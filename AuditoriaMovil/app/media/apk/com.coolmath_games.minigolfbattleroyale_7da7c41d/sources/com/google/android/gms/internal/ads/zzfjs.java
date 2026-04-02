package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfjs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfjs> CREATOR = new zzfjt();
    public final int zza;
    private zzyz zzb = null;
    private byte[] zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfjs(int i, byte[] bArr) {
        this.zza = i;
        this.zzc = bArr;
        zzb();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        byte[] bArr = this.zzc;
        if (bArr == null) {
            bArr = this.zzb.zzao();
        }
        SafeParcelWriter.writeByteArray(parcel, 2, bArr, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzyz zza() {
        if (this.zzb == null) {
            try {
                this.zzb = zzyz.zzh(this.zzc, zzgfm.zza());
                this.zzc = null;
            } catch (zzggm | NullPointerException e) {
                throw new IllegalStateException(e);
            }
        }
        zzb();
        return this.zzb;
    }

    private final void zzb() {
        zzyz zzyzVar = this.zzb;
        if (zzyzVar != null || this.zzc == null) {
            if (zzyzVar == null || this.zzc != null) {
                if (zzyzVar == null || this.zzc == null) {
                    if (zzyzVar != null || this.zzc != null) {
                        throw new IllegalStateException("Impossible");
                    }
                    throw new IllegalStateException("Invalid internal representation - empty");
                }
                throw new IllegalStateException("Invalid internal representation - full");
            }
        }
    }
}

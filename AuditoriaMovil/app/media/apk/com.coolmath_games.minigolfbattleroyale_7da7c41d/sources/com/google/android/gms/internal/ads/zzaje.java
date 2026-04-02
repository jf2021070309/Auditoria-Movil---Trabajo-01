package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.internal.ShareConstants;
import com.ironsource.mediationsdk.logger.IronSourceError;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzaje implements zzaiu {
    public static final Parcelable.Creator<zzaje> CREATOR = new zzajd();
    public final String zza;
    public final String zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaje(Parcel parcel) {
        String readString = parcel.readString();
        int i = zzamq.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
    }

    public zzaje(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
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
            zzaje zzajeVar = (zzaje) obj;
            if (this.zza.equals(zzajeVar.zza) && this.zzb.equals(zzajeVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length());
        sb.append("VC: ");
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzaiu
    public final void zza(zzagm zzagmVar) {
        char c;
        String str = this.zza;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 79833656:
                if (str.equals(ShareConstants.TITLE)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 428414940:
                if (str.equals(ShareConstants.DESCRIPTION)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            zzagmVar.zzs(this.zzb);
        } else if (c == 1) {
            zzagmVar.zzt(this.zzb);
        } else if (c == 2) {
            zzagmVar.zzu(this.zzb);
        } else if (c == 3) {
            zzagmVar.zzv(this.zzb);
        } else if (c != 4) {
        } else {
            zzagmVar.zzw(this.zzb);
        }
    }
}

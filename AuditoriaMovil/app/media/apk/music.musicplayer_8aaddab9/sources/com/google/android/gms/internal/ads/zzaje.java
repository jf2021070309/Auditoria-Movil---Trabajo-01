package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import e.a.d.a.a;
/* loaded from: classes.dex */
public final class zzaje implements zzaiu {
    public static final Parcelable.Creator<zzaje> CREATOR = new zzajd();
    public final String zza;
    public final String zzb;

    public zzaje(Parcel parcel) {
        String readString = parcel.readString();
        int i2 = zzamq.zza;
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
        if (obj != null && zzaje.class == obj.getClass()) {
            zzaje zzajeVar = (zzaje) obj;
            if (this.zza.equals(zzajeVar.zza) && this.zzb.equals(zzajeVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() + a.x(this.zza, 527, 31);
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        return a.t(new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length()), "VC: ", str, "=", str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzaiu
    public final void zza(zzagm zzagmVar) {
        char c2;
        String str = this.zza;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            zzagmVar.zzs(this.zzb);
        } else if (c2 == 1) {
            zzagmVar.zzt(this.zzb);
        } else if (c2 == 2) {
            zzagmVar.zzu(this.zzb);
        } else if (c2 == 3) {
            zzagmVar.zzv(this.zzb);
        } else if (c2 != 4) {
        } else {
            zzagmVar.zzw(this.zzb);
        }
    }
}

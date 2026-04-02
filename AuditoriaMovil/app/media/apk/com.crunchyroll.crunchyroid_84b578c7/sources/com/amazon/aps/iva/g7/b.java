package com.amazon.aps.iva.g7;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.q5.d0;
import com.amazon.aps.iva.q5.f0;
import com.amazon.aps.iva.t5.g0;
import com.google.android.gms.cast.tv.cac.UserActionContext;
/* compiled from: VorbisComment.java */
@Deprecated
/* loaded from: classes.dex */
public class b implements f0.b {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public final String b;
    public final String c;

    /* compiled from: VorbisComment.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i) {
            return new b[i];
        }
    }

    public b(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.b.equals(bVar.b) && this.c.equals(bVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + com.amazon.aps.iva.c80.a.b(this.b, 527, 31);
    }

    public final String toString() {
        return "VC: " + this.b + "=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.amazon.aps.iva.q5.f0.b
    public final void y(d0.a aVar) {
        char c;
        String str = this.b;
        str.getClass();
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals(UserActionContext.ALBUM)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c = 2;
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
                if (str.equals(UserActionContext.ARTIST)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        String str2 = this.c;
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c == 4) {
                            aVar.b = str2;
                            return;
                        }
                        return;
                    }
                    aVar.d = str2;
                    return;
                }
                aVar.g = str2;
                return;
            }
            aVar.a = str2;
            return;
        }
        aVar.c = str2;
    }

    public b(Parcel parcel) {
        String readString = parcel.readString();
        int i = g0.a;
        this.b = readString;
        this.c = parcel.readString();
    }
}

package com.ss.android.downloadlib.dr.ge;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes3.dex */
public class ge implements Parcelable {
    public static final Parcelable.Creator<ge> CREATOR = new Parcelable.Creator<ge>() { // from class: com.ss.android.downloadlib.dr.ge.ge.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: dr */
        public ge createFromParcel(Parcel parcel) {
            return new ge(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: dr */
        public ge[] newArray(int i) {
            return new ge[i];
        }
    };
    public String bn;
    public int dr;
    public int g;
    public int ge;
    public String o;
    public String q;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ge() {
        this.o = "";
        this.q = "";
        this.bn = "";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.dr);
        parcel.writeInt(this.ge);
        parcel.writeString(this.o);
        parcel.writeString(this.q);
        parcel.writeString(this.bn);
        parcel.writeInt(this.g);
    }

    protected ge(Parcel parcel) {
        this.o = "";
        this.q = "";
        this.bn = "";
        this.dr = parcel.readInt();
        this.ge = parcel.readInt();
        this.o = parcel.readString();
        this.q = parcel.readString();
        this.bn = parcel.readString();
        this.g = parcel.readInt();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ge geVar = (ge) obj;
        if (this.dr != geVar.dr || this.ge != geVar.ge) {
            return false;
        }
        String str = this.o;
        if (str != null) {
            return str.equals(geVar.o);
        }
        if (geVar.o == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = ((this.dr * 31) + this.ge) * 31;
        String str = this.o;
        return i + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "";
    }
}

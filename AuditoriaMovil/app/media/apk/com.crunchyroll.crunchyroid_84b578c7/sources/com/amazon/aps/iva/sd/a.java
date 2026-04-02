package com.amazon.aps.iva.sd;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.b8.l1;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.ui.labels.MaturityRatingType;
/* compiled from: ContinueWatchingUiModel.kt */
/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0703a();
    public final String b;
    public final String c;
    public final String d;
    public final f e;
    public final t f;
    public final String g;
    public final String h;
    public final String i;
    public final MaturityRatingType j;

    /* compiled from: ContinueWatchingUiModel.kt */
    /* renamed from: com.amazon.aps.iva.sd.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0703a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            j.f(parcel, "parcel");
            return new a(parcel.readString(), parcel.readString(), parcel.readString(), f.CREATOR.createFromParcel(parcel), t.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), MaturityRatingType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i) {
            return new a[i];
        }
    }

    public a(String str, String str2, String str3, f fVar, t tVar, String str4, String str5, String str6, MaturityRatingType maturityRatingType) {
        j.f(str, "id");
        j.f(str2, "title");
        j.f(str3, "imagePath");
        j.f(fVar, "watchProgressUiModel");
        j.f(tVar, "resourceType");
        j.f(str4, "episodeNumber");
        j.f(str5, "seasonTitle");
        j.f(str6, "seasonNumber");
        j.f(maturityRatingType, "rating");
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = fVar;
        this.f = tVar;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = maturityRatingType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (j.a(this.b, aVar.b) && j.a(this.c, aVar.c) && j.a(this.d, aVar.d) && j.a(this.e, aVar.e) && this.f == aVar.f && j.a(this.g, aVar.g) && j.a(this.h, aVar.h) && j.a(this.i, aVar.i) && this.j == aVar.j) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b = com.amazon.aps.iva.c80.a.b(this.d, com.amazon.aps.iva.c80.a.b(this.c, this.b.hashCode() * 31, 31), 31);
        return this.j.hashCode() + com.amazon.aps.iva.c80.a.b(this.i, com.amazon.aps.iva.c80.a.b(this.h, com.amazon.aps.iva.c80.a.b(this.g, l1.a(this.f, (this.e.hashCode() + b) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "ContinueWatchingUiModel(id=" + this.b + ", title=" + this.c + ", imagePath=" + this.d + ", watchProgressUiModel=" + this.e + ", resourceType=" + this.f + ", episodeNumber=" + this.g + ", seasonTitle=" + this.h + ", seasonNumber=" + this.i + ", rating=" + this.j + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        j.f(parcel, "out");
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        this.e.writeToParcel(parcel, i);
        parcel.writeString(this.f.name());
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j.name());
    }
}

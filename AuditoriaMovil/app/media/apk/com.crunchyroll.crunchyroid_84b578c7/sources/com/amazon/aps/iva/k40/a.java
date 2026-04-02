package com.amazon.aps.iva.k40;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.yb0.j;
/* compiled from: SelectedHeaderViewModel.kt */
/* loaded from: classes2.dex */
public final class a extends com.amazon.aps.iva.ez.d<com.amazon.aps.iva.y30.c> implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0432a();
    public final com.amazon.aps.iva.y30.c d;

    /* compiled from: SelectedHeaderViewModel.kt */
    /* renamed from: com.amazon.aps.iva.k40.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0432a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            j.f(parcel, "parcel");
            return new a(com.amazon.aps.iva.y30.c.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i) {
            return new a[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.amazon.aps.iva.y30.c cVar) {
        super(cVar);
        j.f(cVar, "preferenceHeader");
        this.d = cVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        j.f(parcel, "out");
        parcel.writeString(this.d.name());
    }
}

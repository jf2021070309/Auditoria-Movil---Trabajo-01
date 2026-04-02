package com.amazon.aps.iva.l7;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.g7.b;
/* compiled from: VorbisComment.java */
/* loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new C0471a();

    /* compiled from: VorbisComment.java */
    /* renamed from: com.amazon.aps.iva.l7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0471a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i) {
            return new a[i];
        }
    }
}

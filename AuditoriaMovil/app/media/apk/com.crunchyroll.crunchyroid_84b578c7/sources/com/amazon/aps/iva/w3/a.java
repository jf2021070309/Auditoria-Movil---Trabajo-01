package com.amazon.aps.iva.w3;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: AbsSavedState.java */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public abstract class a implements Parcelable {
    private final Parcelable mSuperState;
    public static final a EMPTY_STATE = new C0817a();
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* compiled from: AbsSavedState.java */
    /* renamed from: com.amazon.aps.iva.w3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0817a extends a {
        public C0817a() {
            super((C0817a) null);
        }
    }

    public /* synthetic */ a(C0817a c0817a) {
        this();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Parcelable getSuperState() {
        return this.mSuperState;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mSuperState, i);
    }

    private a() {
        this.mSuperState = null;
    }

    /* compiled from: AbsSavedState.java */
    /* loaded from: classes.dex */
    public class b implements Parcelable.ClassLoaderCreator<a> {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable(null) == null) {
                return a.EMPTY_STATE;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new a[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.EMPTY_STATE;
            }
            throw new IllegalStateException("superState must be null");
        }
    }

    public a(Parcelable parcelable) {
        if (parcelable != null) {
            this.mSuperState = parcelable == EMPTY_STATE ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public a(Parcel parcel) {
        this(parcel, null);
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.mSuperState = readParcelable == null ? EMPTY_STATE : readParcelable;
    }
}

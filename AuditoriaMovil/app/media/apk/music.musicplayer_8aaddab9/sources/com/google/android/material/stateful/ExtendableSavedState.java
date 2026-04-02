package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import c.f.h;
/* loaded from: classes2.dex */
public class ExtendableSavedState extends AbsSavedState {
    public static final Parcelable.Creator<ExtendableSavedState> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    public final h<String, Bundle> f4668c;

    /* loaded from: classes2.dex */
    public static class a implements Parcelable.ClassLoaderCreator<ExtendableSavedState> {
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new ExtendableSavedState(parcel, null, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public ExtendableSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new ExtendableSavedState(parcel, classLoader, null);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i2) {
            return new ExtendableSavedState[i2];
        }
    }

    public ExtendableSavedState(Parcel parcel, ClassLoader classLoader, a aVar) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f4668c = new h<>(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            this.f4668c.put(strArr[i2], bundleArr[i2]);
        }
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("ExtendableSavedState{");
        y.append(Integer.toHexString(System.identityHashCode(this)));
        y.append(" states=");
        y.append(this.f4668c);
        y.append("}");
        return y.toString();
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f369b, i2);
        int i3 = this.f4668c.f1665g;
        parcel.writeInt(i3);
        String[] strArr = new String[i3];
        Bundle[] bundleArr = new Bundle[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            strArr[i4] = this.f4668c.h(i4);
            bundleArr[i4] = this.f4668c.l(i4);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}

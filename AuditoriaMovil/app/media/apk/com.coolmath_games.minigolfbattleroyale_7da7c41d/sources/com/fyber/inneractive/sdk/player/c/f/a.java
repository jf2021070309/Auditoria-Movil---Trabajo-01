package com.fyber.inneractive.sdk.player.c.f;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.fyber.inneractive.sdk.player.c.f.a.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ a[] newArray(int i) {
            return new a[0];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }
    };
    public final InterfaceC0060a[] a;

    /* renamed from: com.fyber.inneractive.sdk.player.c.f.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0060a extends Parcelable {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public a(List<? extends InterfaceC0060a> list) {
        InterfaceC0060a[] interfaceC0060aArr = new InterfaceC0060a[list.size()];
        this.a = interfaceC0060aArr;
        list.toArray(interfaceC0060aArr);
    }

    a(Parcel parcel) {
        this.a = new InterfaceC0060a[parcel.readInt()];
        int i = 0;
        while (true) {
            InterfaceC0060a[] interfaceC0060aArr = this.a;
            if (i >= interfaceC0060aArr.length) {
                return;
            }
            interfaceC0060aArr[i] = (InterfaceC0060a) parcel.readParcelable(InterfaceC0060a.class.getClassLoader());
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((a) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.length);
        for (InterfaceC0060a interfaceC0060a : this.a) {
            parcel.writeParcelable(interfaceC0060a, 0);
        }
    }
}

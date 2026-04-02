package com.kwad.framework.filedownloader.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.kwad.sdk.utils.ao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() { // from class: com.kwad.framework.filedownloader.d.b.1
        private static b b(Parcel parcel) {
            return new b(parcel);
        }

        private static b[] bx(int i) {
            return new b[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ b createFromParcel(Parcel parcel) {
            return b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ b[] newArray(int i) {
            return bx(i);
        }
    };
    private HashMap<String, List<String>> ael;

    public b() {
    }

    protected b(Parcel parcel) {
        this.ael = parcel.readHashMap(String.class.getClassLoader());
    }

    public final void bi(String str) {
        HashMap<String, List<String>> hashMap = this.ael;
        if (hashMap == null) {
            return;
        }
        hashMap.remove(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void o(String str, String str2) {
        ao.fF(str);
        ao.fF(str2);
        if (this.ael == null) {
            this.ael = new HashMap<>();
        }
        List<String> list = this.ael.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.ael.put(str, list);
        }
        if (list.contains(str2)) {
            return;
        }
        list.add(str2);
    }

    public final String toString() {
        return this.ael.toString();
    }

    public final HashMap<String, List<String>> vo() {
        return this.ael;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.ael);
    }
}

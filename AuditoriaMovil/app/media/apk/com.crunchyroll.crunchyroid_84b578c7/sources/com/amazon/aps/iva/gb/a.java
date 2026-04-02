package com.amazon.aps.iva.gb;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedList;
import java.util.NavigableSet;
import java.util.TreeSet;
/* compiled from: CacheParcelableContainer.java */
/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0298a();
    public final NavigableSet<Integer> b;
    public final NavigableSet<Integer> c;

    /* compiled from: CacheParcelableContainer.java */
    /* renamed from: com.amazon.aps.iva.gb.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0298a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i) {
            return new a[i];
        }
    }

    public a(NavigableSet<Integer> navigableSet, NavigableSet<Integer> navigableSet2) {
        this.b = new TreeSet();
        this.c = new TreeSet();
        this.b = navigableSet;
        this.c = navigableSet2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        LinkedList linkedList = new LinkedList(this.b);
        LinkedList linkedList2 = new LinkedList(this.c);
        parcel.writeList(linkedList);
        parcel.writeList(linkedList2);
    }

    public a(Parcel parcel) {
        this.b = new TreeSet();
        this.c = new TreeSet();
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        parcel.readList(linkedList, Integer.class.getClassLoader());
        parcel.readList(linkedList2, Integer.class.getClassLoader());
        this.b = new TreeSet(linkedList);
        this.c = new TreeSet(linkedList2);
    }
}

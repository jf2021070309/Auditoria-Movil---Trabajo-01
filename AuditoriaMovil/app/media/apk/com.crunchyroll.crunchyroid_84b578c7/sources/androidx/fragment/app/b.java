package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.r;
import java.util.ArrayList;
/* compiled from: BackStackRecordState.java */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public final int[] b;
    public final ArrayList<String> c;
    public final int[] d;
    public final int[] e;
    public final int f;
    public final String g;
    public final int h;
    public final int i;
    public final CharSequence j;
    public final int k;
    public final CharSequence l;
    public final ArrayList<String> m;
    public final ArrayList<String> n;
    public final boolean o;

    /* compiled from: BackStackRecordState.java */
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

    public b(androidx.fragment.app.a aVar) {
        int size = aVar.c.size();
        this.b = new int[size * 6];
        if (aVar.i) {
            this.c = new ArrayList<>(size);
            this.d = new int[size];
            this.e = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                r.a aVar2 = aVar.c.get(i);
                int i3 = i2 + 1;
                this.b[i2] = aVar2.a;
                ArrayList<String> arrayList = this.c;
                Fragment fragment = aVar2.b;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.b;
                int i4 = i3 + 1;
                iArr[i3] = aVar2.c ? 1 : 0;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.d;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.e;
                int i7 = i6 + 1;
                iArr[i6] = aVar2.f;
                iArr[i7] = aVar2.g;
                this.d[i] = aVar2.h.ordinal();
                this.e[i] = aVar2.i.ordinal();
                i++;
                i2 = i7 + 1;
            }
            this.f = aVar.h;
            this.g = aVar.k;
            this.h = aVar.u;
            this.i = aVar.l;
            this.j = aVar.m;
            this.k = aVar.n;
            this.l = aVar.o;
            this.m = aVar.p;
            this.n = aVar.q;
            this.o = aVar.r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.b);
        parcel.writeStringList(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeIntArray(this.e);
        parcel.writeInt(this.f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        TextUtils.writeToParcel(this.j, parcel, 0);
        parcel.writeInt(this.k);
        TextUtils.writeToParcel(this.l, parcel, 0);
        parcel.writeStringList(this.m);
        parcel.writeStringList(this.n);
        parcel.writeInt(this.o ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.b = parcel.createIntArray();
        this.c = parcel.createStringArrayList();
        this.d = parcel.createIntArray();
        this.e = parcel.createIntArray();
        this.f = parcel.readInt();
        this.g = parcel.readString();
        this.h = parcel.readInt();
        this.i = parcel.readInt();
        this.j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.k = parcel.readInt();
        this.l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.m = parcel.createStringArrayList();
        this.n = parcel.createStringArrayList();
        this.o = parcel.readInt() != 0;
    }
}

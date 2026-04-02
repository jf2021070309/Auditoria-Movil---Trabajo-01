package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
/* compiled from: FragmentManagerState.java */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();
    public ArrayList<String> b;
    public ArrayList<String> c;
    public b[] d;
    public int e;
    public String f;
    public final ArrayList<String> g;
    public final ArrayList<com.amazon.aps.iva.n4.b> h;
    public ArrayList<FragmentManager.m> i;

    /* compiled from: FragmentManagerState.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<m> {
        @Override // android.os.Parcelable.Creator
        public final m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final m[] newArray(int i) {
            return new m[i];
        }
    }

    public m() {
        this.f = null;
        this.g = new ArrayList<>();
        this.h = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.b);
        parcel.writeStringList(this.c);
        parcel.writeTypedArray(this.d, i);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeStringList(this.g);
        parcel.writeTypedList(this.h);
        parcel.writeTypedList(this.i);
    }

    public m(Parcel parcel) {
        this.f = null;
        this.g = new ArrayList<>();
        this.h = new ArrayList<>();
        this.b = parcel.createStringArrayList();
        this.c = parcel.createStringArrayList();
        this.d = (b[]) parcel.createTypedArray(b.CREATOR);
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.createStringArrayList();
        this.h = parcel.createTypedArrayList(com.amazon.aps.iva.n4.b.CREATOR);
        this.i = parcel.createTypedArrayList(FragmentManager.m.CREATOR);
    }
}

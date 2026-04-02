package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new a();
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f429b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f430c;

    /* renamed from: d  reason: collision with root package name */
    public final int f431d;

    /* renamed from: e  reason: collision with root package name */
    public final int f432e;

    /* renamed from: f  reason: collision with root package name */
    public final String f433f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f434g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f435h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f436i;

    /* renamed from: j  reason: collision with root package name */
    public final Bundle f437j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f438k;

    /* renamed from: l  reason: collision with root package name */
    public final int f439l;

    /* renamed from: m  reason: collision with root package name */
    public Bundle f440m;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<FragmentState> {
        @Override // android.os.Parcelable.Creator
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public FragmentState[] newArray(int i2) {
            return new FragmentState[i2];
        }
    }

    public FragmentState(Parcel parcel) {
        this.a = parcel.readString();
        this.f429b = parcel.readString();
        this.f430c = parcel.readInt() != 0;
        this.f431d = parcel.readInt();
        this.f432e = parcel.readInt();
        this.f433f = parcel.readString();
        this.f434g = parcel.readInt() != 0;
        this.f435h = parcel.readInt() != 0;
        this.f436i = parcel.readInt() != 0;
        this.f437j = parcel.readBundle();
        this.f438k = parcel.readInt() != 0;
        this.f440m = parcel.readBundle();
        this.f439l = parcel.readInt();
    }

    public FragmentState(Fragment fragment) {
        this.a = fragment.getClass().getName();
        this.f429b = fragment.mWho;
        this.f430c = fragment.mFromLayout;
        this.f431d = fragment.mFragmentId;
        this.f432e = fragment.mContainerId;
        this.f433f = fragment.mTag;
        this.f434g = fragment.mRetainInstance;
        this.f435h = fragment.mRemoving;
        this.f436i = fragment.mDetached;
        this.f437j = fragment.mArguments;
        this.f438k = fragment.mHidden;
        this.f439l = fragment.mMaxState.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder v = e.a.d.a.a.v(128, "FragmentState{");
        v.append(this.a);
        v.append(" (");
        v.append(this.f429b);
        v.append(")}:");
        if (this.f430c) {
            v.append(" fromLayout");
        }
        if (this.f432e != 0) {
            v.append(" id=0x");
            v.append(Integer.toHexString(this.f432e));
        }
        String str = this.f433f;
        if (str != null && !str.isEmpty()) {
            v.append(" tag=");
            v.append(this.f433f);
        }
        if (this.f434g) {
            v.append(" retainInstance");
        }
        if (this.f435h) {
            v.append(" removing");
        }
        if (this.f436i) {
            v.append(" detached");
        }
        if (this.f438k) {
            v.append(" hidden");
        }
        return v.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.a);
        parcel.writeString(this.f429b);
        parcel.writeInt(this.f430c ? 1 : 0);
        parcel.writeInt(this.f431d);
        parcel.writeInt(this.f432e);
        parcel.writeString(this.f433f);
        parcel.writeInt(this.f434g ? 1 : 0);
        parcel.writeInt(this.f435h ? 1 : 0);
        parcel.writeInt(this.f436i ? 1 : 0);
        parcel.writeBundle(this.f437j);
        parcel.writeInt(this.f438k ? 1 : 0);
        parcel.writeBundle(this.f440m);
        parcel.writeInt(this.f439l);
    }
}

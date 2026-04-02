package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new a();
    public ArrayList<FragmentState> a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<String> f419b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<String> f420c;

    /* renamed from: d  reason: collision with root package name */
    public BackStackRecordState[] f421d;

    /* renamed from: e  reason: collision with root package name */
    public int f422e;

    /* renamed from: f  reason: collision with root package name */
    public String f423f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<String> f424g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<BackStackState> f425h;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<String> f426i;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList<Bundle> f427j;

    /* renamed from: k  reason: collision with root package name */
    public ArrayList<FragmentManager.LaunchedFragmentInfo> f428k;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<FragmentManagerState> {
        @Override // android.os.Parcelable.Creator
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public FragmentManagerState[] newArray(int i2) {
            return new FragmentManagerState[i2];
        }
    }

    public FragmentManagerState() {
        this.f423f = null;
        this.f424g = new ArrayList<>();
        this.f425h = new ArrayList<>();
        this.f426i = new ArrayList<>();
        this.f427j = new ArrayList<>();
    }

    public FragmentManagerState(Parcel parcel) {
        this.f423f = null;
        this.f424g = new ArrayList<>();
        this.f425h = new ArrayList<>();
        this.f426i = new ArrayList<>();
        this.f427j = new ArrayList<>();
        this.a = parcel.createTypedArrayList(FragmentState.CREATOR);
        this.f419b = parcel.createStringArrayList();
        this.f420c = parcel.createStringArrayList();
        this.f421d = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
        this.f422e = parcel.readInt();
        this.f423f = parcel.readString();
        this.f424g = parcel.createStringArrayList();
        this.f425h = parcel.createTypedArrayList(BackStackState.CREATOR);
        this.f426i = parcel.createStringArrayList();
        this.f427j = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f428k = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeTypedList(this.a);
        parcel.writeStringList(this.f419b);
        parcel.writeStringList(this.f420c);
        parcel.writeTypedArray(this.f421d, i2);
        parcel.writeInt(this.f422e);
        parcel.writeString(this.f423f);
        parcel.writeStringList(this.f424g);
        parcel.writeTypedList(this.f425h);
        parcel.writeStringList(this.f426i);
        parcel.writeTypedList(this.f427j);
        parcel.writeTypedList(this.f428k);
    }
}

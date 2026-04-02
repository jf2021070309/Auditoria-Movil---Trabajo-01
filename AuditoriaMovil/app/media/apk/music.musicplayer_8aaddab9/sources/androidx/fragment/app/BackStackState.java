package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new a();
    public final List<String> a;

    /* renamed from: b  reason: collision with root package name */
    public final List<BackStackRecordState> f383b;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<BackStackState> {
        @Override // android.os.Parcelable.Creator
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public BackStackState[] newArray(int i2) {
            return new BackStackState[i2];
        }
    }

    public BackStackState(Parcel parcel) {
        this.a = parcel.createStringArrayList();
        this.f383b = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeStringList(this.a);
        parcel.writeTypedList(this.f383b);
    }
}

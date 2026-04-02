package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class ActivityResult implements Parcelable {
    public static final Parcelable.Creator<ActivityResult> CREATOR = new a();
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final Intent f92b;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<ActivityResult> {
        @Override // android.os.Parcelable.Creator
        public ActivityResult createFromParcel(Parcel parcel) {
            return new ActivityResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ActivityResult[] newArray(int i2) {
            return new ActivityResult[i2];
        }
    }

    public ActivityResult(int i2, Intent intent) {
        this.a = i2;
        this.f92b = intent;
    }

    public ActivityResult(Parcel parcel) {
        this.a = parcel.readInt();
        this.f92b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("ActivityResult{resultCode=");
        int i2 = this.a;
        y.append(i2 != -1 ? i2 != 0 ? String.valueOf(i2) : "RESULT_CANCELED" : "RESULT_OK");
        y.append(", data=");
        y.append(this.f92b);
        y.append('}');
        return y.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.f92b == null ? 0 : 1);
        Intent intent = this.f92b;
        if (intent != null) {
            intent.writeToParcel(parcel, i2);
        }
    }
}

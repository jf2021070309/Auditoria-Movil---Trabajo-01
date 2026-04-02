package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new a();
    public final IntentSender a;

    /* renamed from: b  reason: collision with root package name */
    public final Intent f109b;

    /* renamed from: c  reason: collision with root package name */
    public final int f110c;

    /* renamed from: d  reason: collision with root package name */
    public final int f111d;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<IntentSenderRequest> {
        @Override // android.os.Parcelable.Creator
        public IntentSenderRequest createFromParcel(Parcel parcel) {
            return new IntentSenderRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public IntentSenderRequest[] newArray(int i2) {
            return new IntentSenderRequest[i2];
        }
    }

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i2, int i3) {
        this.a = intentSender;
        this.f109b = intent;
        this.f110c = i2;
        this.f111d = i3;
    }

    public IntentSenderRequest(Parcel parcel) {
        this.a = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f109b = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f110c = parcel.readInt();
        this.f111d = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.a, i2);
        parcel.writeParcelable(this.f109b, i2);
        parcel.writeInt(this.f110c);
        parcel.writeInt(this.f111d);
    }
}

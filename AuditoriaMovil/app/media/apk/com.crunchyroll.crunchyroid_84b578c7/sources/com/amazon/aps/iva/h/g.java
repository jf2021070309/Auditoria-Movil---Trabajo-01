package com.amazon.aps.iva.h;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.yb0.j;
/* compiled from: IntentSenderRequest.kt */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();
    public final IntentSender b;
    public final Intent c;
    public final int d;
    public final int e;

    /* compiled from: IntentSenderRequest.kt */
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            j.f(parcel, "inParcel");
            Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
            j.c(readParcelable);
            return new g((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i) {
            return new g[i];
        }
    }

    public g(IntentSender intentSender, Intent intent, int i, int i2) {
        j.f(intentSender, "intentSender");
        this.b = intentSender;
        this.c = intent;
        this.d = i;
        this.e = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        j.f(parcel, "dest");
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
    }
}

package com.amazon.aps.iva.g8;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.g;
/* compiled from: NavBackStackEntryState.kt */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();
    public final String b;
    public final int c;
    public final Bundle d;
    public final Bundle e;

    /* compiled from: NavBackStackEntryState.kt */
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            com.amazon.aps.iva.yb0.j.f(parcel, "inParcel");
            return new g(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i) {
            return new g[i];
        }
    }

    public g(f fVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, "entry");
        this.b = fVar.g;
        this.c = fVar.c.h;
        this.d = fVar.g();
        Bundle bundle = new Bundle();
        this.e = bundle;
        fVar.j.c(bundle);
    }

    public final f a(Context context, g0 g0Var, g.b bVar, t tVar) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(bVar, "hostLifecycleState");
        Bundle bundle = this.d;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        Bundle bundle2 = this.e;
        String str = this.b;
        com.amazon.aps.iva.yb0.j.f(str, "id");
        return new f(context, g0Var, bundle, bVar, tVar, str, bundle2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        com.amazon.aps.iva.yb0.j.f(parcel, "parcel");
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeBundle(this.d);
        parcel.writeBundle(this.e);
    }

    public g(Parcel parcel) {
        com.amazon.aps.iva.yb0.j.f(parcel, "inParcel");
        String readString = parcel.readString();
        com.amazon.aps.iva.yb0.j.c(readString);
        this.b = readString;
        this.c = parcel.readInt();
        this.d = parcel.readBundle(g.class.getClassLoader());
        Bundle readBundle = parcel.readBundle(g.class.getClassLoader());
        com.amazon.aps.iva.yb0.j.c(readBundle);
        this.e = readBundle;
    }
}

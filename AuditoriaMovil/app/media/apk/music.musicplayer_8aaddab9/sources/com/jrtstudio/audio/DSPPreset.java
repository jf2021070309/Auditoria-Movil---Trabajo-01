package com.jrtstudio.audio;

import android.os.Parcel;
import android.os.Parcelable;
import c.i.g.b;
import java.util.Objects;
/* loaded from: classes.dex */
public class DSPPreset implements Parcelable {
    public static final Parcelable.Creator<DSPPreset> CREATOR = new a();
    public double a;

    /* renamed from: b  reason: collision with root package name */
    public short f4873b;

    /* renamed from: c  reason: collision with root package name */
    public int f4874c;

    /* renamed from: d  reason: collision with root package name */
    public Double[] f4875d;

    /* renamed from: e  reason: collision with root package name */
    public String f4876e;

    /* renamed from: f  reason: collision with root package name */
    public int f4877f;

    /* renamed from: g  reason: collision with root package name */
    public int f4878g;

    /* renamed from: h  reason: collision with root package name */
    public double f4879h;

    /* renamed from: i  reason: collision with root package name */
    public int f4880i;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<DSPPreset> {
        @Override // android.os.Parcelable.Creator
        public DSPPreset createFromParcel(Parcel parcel) {
            return new DSPPreset(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public DSPPreset[] newArray(int i2) {
            return new DSPPreset[i2];
        }
    }

    public DSPPreset(Parcel parcel) {
        Double valueOf = Double.valueOf(0.0d);
        this.a = 0.0d;
        this.f4873b = (short) 0;
        this.f4874c = 0;
        this.f4875d = new Double[]{valueOf, valueOf, valueOf, valueOf, valueOf, valueOf, valueOf, valueOf, valueOf, valueOf};
        this.f4876e = "";
        this.f4877f = 10;
        this.f4878g = 0;
        this.f4879h = 0.0d;
        this.f4880i = -1;
        this.f4874c = parcel.readInt();
        this.f4878g = parcel.readInt();
        this.f4877f = parcel.readInt();
        this.f4879h = parcel.readDouble();
        int readInt = parcel.readInt();
        double[] dArr = new double[readInt];
        parcel.readDoubleArray(dArr);
        this.f4875d = new Double[readInt];
        int i2 = 0;
        for (int i3 = 0; i3 < readInt; i3++) {
            this.f4875d[i2] = Double.valueOf(dArr[i3]);
            i2++;
        }
        this.a = parcel.readDouble();
        this.f4880i = parcel.readInt();
        this.f4873b = (short) parcel.readInt();
        this.f4876e = parcel.readString();
    }

    public double b() {
        Objects.requireNonNull(b.f2069b);
        double d2 = this.f4873b;
        Double.isNaN(d2);
        Double.isNaN(d2);
        Double.isNaN(d2);
        double d3 = (d2 / 1000.0d) * 12.0d;
        double doubleValue = this.f4875d[0].doubleValue();
        if (this.f4877f == 10) {
            doubleValue = Math.max(doubleValue, this.f4875d[1].doubleValue());
        }
        double d4 = d3 + doubleValue;
        double d5 = this.f4879h;
        double d6 = d4 + d5;
        if (d6 > 17.0d) {
            this.f4879h = Math.max(d5 - (d6 - 17.0d), -12.0d);
        }
        return this.f4879h;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f4874c);
        parcel.writeInt(this.f4878g);
        parcel.writeInt(this.f4877f);
        parcel.writeDouble(this.f4879h);
        parcel.writeInt(this.f4875d.length);
        Double[] dArr = this.f4875d;
        double[] dArr2 = new double[dArr.length];
        int i3 = 0;
        for (Double d2 : dArr) {
            dArr2[i3] = d2.doubleValue();
            i3++;
        }
        parcel.writeDoubleArray(dArr2);
        parcel.writeDouble(this.a);
        parcel.writeInt(this.f4880i);
        parcel.writeInt(this.f4873b);
        parcel.writeString(this.f4876e);
    }
}

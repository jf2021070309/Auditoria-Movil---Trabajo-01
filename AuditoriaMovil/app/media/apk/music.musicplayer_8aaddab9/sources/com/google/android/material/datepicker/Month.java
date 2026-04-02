package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import e.d.b.d.m.w;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
/* loaded from: classes2.dex */
public final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new a();
    public final Calendar a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4638b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4639c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4640d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4641e;

    /* renamed from: f  reason: collision with root package name */
    public final long f4642f;

    /* renamed from: g  reason: collision with root package name */
    public String f4643g;

    /* loaded from: classes2.dex */
    public static class a implements Parcelable.Creator<Month> {
        @Override // android.os.Parcelable.Creator
        public Month createFromParcel(Parcel parcel) {
            return Month.c(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public Month[] newArray(int i2) {
            return new Month[i2];
        }
    }

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar b2 = w.b(calendar);
        this.a = b2;
        this.f4638b = b2.get(2);
        this.f4639c = b2.get(1);
        this.f4640d = b2.getMaximum(7);
        this.f4641e = b2.getActualMaximum(5);
        this.f4642f = b2.getTimeInMillis();
    }

    public static Month c(int i2, int i3) {
        Calendar e2 = w.e();
        e2.set(1, i2);
        e2.set(2, i3);
        return new Month(e2);
    }

    public static Month d(long j2) {
        Calendar e2 = w.e();
        e2.setTimeInMillis(j2);
        return new Month(e2);
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(Month month) {
        return this.a.compareTo(month.a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        int firstDayOfWeek = this.a.get(7) - this.a.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f4640d : firstDayOfWeek;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Month) {
            Month month = (Month) obj;
            return this.f4638b == month.f4638b && this.f4639c == month.f4639c;
        }
        return false;
    }

    public String g(Context context) {
        if (this.f4643g == null) {
            long timeInMillis = this.a.getTimeInMillis();
            this.f4643g = DateUtils.formatDateTime(context, timeInMillis - TimeZone.getDefault().getOffset(timeInMillis), 36);
        }
        return this.f4643g;
    }

    public Month h(int i2) {
        Calendar b2 = w.b(this.a);
        b2.add(2, i2);
        return new Month(b2);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4638b), Integer.valueOf(this.f4639c)});
    }

    public int i(Month month) {
        if (this.a instanceof GregorianCalendar) {
            return (month.f4638b - this.f4638b) + ((month.f4639c - this.f4639c) * 12);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f4639c);
        parcel.writeInt(this.f4638b);
    }
}

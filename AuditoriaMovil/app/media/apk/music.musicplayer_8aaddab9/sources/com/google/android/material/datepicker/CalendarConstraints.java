package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.AdError;
import e.d.b.d.m.w;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new a();
    public final Month a;

    /* renamed from: b  reason: collision with root package name */
    public final Month f4627b;

    /* renamed from: c  reason: collision with root package name */
    public final DateValidator f4628c;

    /* renamed from: d  reason: collision with root package name */
    public Month f4629d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4630e;

    /* renamed from: f  reason: collision with root package name */
    public final int f4631f;

    /* loaded from: classes2.dex */
    public interface DateValidator extends Parcelable {
        boolean z(long j2);
    }

    /* loaded from: classes2.dex */
    public static class a implements Parcelable.Creator<CalendarConstraints> {
        @Override // android.os.Parcelable.Creator
        public CalendarConstraints createFromParcel(Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        public CalendarConstraints[] newArray(int i2) {
            return new CalendarConstraints[i2];
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public static final long a = w.a(Month.c(1900, 0).f4642f);

        /* renamed from: b  reason: collision with root package name */
        public static final long f4632b = w.a(Month.c(AdError.BROKEN_MEDIA_ERROR_CODE, 11).f4642f);

        /* renamed from: c  reason: collision with root package name */
        public long f4633c;

        /* renamed from: d  reason: collision with root package name */
        public long f4634d;

        /* renamed from: e  reason: collision with root package name */
        public Long f4635e;

        /* renamed from: f  reason: collision with root package name */
        public DateValidator f4636f;

        public b(CalendarConstraints calendarConstraints) {
            this.f4633c = a;
            this.f4634d = f4632b;
            this.f4636f = new DateValidatorPointForward(Long.MIN_VALUE);
            this.f4633c = calendarConstraints.a.f4642f;
            this.f4634d = calendarConstraints.f4627b.f4642f;
            this.f4635e = Long.valueOf(calendarConstraints.f4629d.f4642f);
            this.f4636f = calendarConstraints.f4628c;
        }
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, a aVar) {
        this.a = month;
        this.f4627b = month2;
        this.f4629d = month3;
        this.f4628c = dateValidator;
        if (month3 != null && month.a.compareTo(month3.a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.a.compareTo(month2.a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.f4631f = month.i(month2) + 1;
        this.f4630e = (month2.f4639c - month.f4639c) + 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CalendarConstraints) {
            CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
            return this.a.equals(calendarConstraints.a) && this.f4627b.equals(calendarConstraints.f4627b) && Objects.equals(this.f4629d, calendarConstraints.f4629d) && this.f4628c.equals(calendarConstraints.f4628c);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.f4627b, this.f4629d, this.f4628c});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.a, 0);
        parcel.writeParcelable(this.f4627b, 0);
        parcel.writeParcelable(this.f4629d, 0);
        parcel.writeParcelable(this.f4628c, 0);
    }
}

package com.braze.support;

import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.braze.enums.BrazeDateFormat;
import com.braze.support.BrazeLogger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000.\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0006\u0010\u0004\u001a\u00020\u0000\u001a\u0012\u0010\t\u001a\u00020\b*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006\u001a\u001e\u0010\f\u001a\u00020\u0005*\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007\u001a\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006\u001a>\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u000eH\u0007\u001a\n\u0010\u0015\u001a\u00020\b*\u00020\u0000\u001a\n\u0010\u0016\u001a\u00020\u0000*\u00020\b\"\u001c\u0010\u0018\u001a\n \u0017*\u0004\u0018\u00010\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"", "nowInSeconds", "", "nowInSecondsPrecise", "nowInMilliseconds", "", "Lcom/braze/enums/BrazeDateFormat;", "dateFormat", "Ljava/util/Date;", "parseDate", "Ljava/util/TimeZone;", "timeZone", "formatDate", "formatDateNow", "", "year", "month", "day", "hours", "minutes", "seconds", "createDate", "getTimeFromEpochInSeconds", "kotlin.jvm.PlatformType", "UTC_TIME_ZONE", "Ljava/util/TimeZone;", "android-sdk-base_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DateTimeUtils {
    private static final TimeZone UTC_TIME_ZONE = TimeZone.getTimeZone("UTC");

    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return defpackage.b.c(new StringBuilder("Exception parsing date "), this.b, ". Returning null");
        }
    }

    public static final Date createDate(int i, int i2, int i3, int i4, int i5, int i6) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(i, i2, i3, i4, i5, i6);
        gregorianCalendar.setTimeZone(UTC_TIME_ZONE);
        Date time = gregorianCalendar.getTime();
        j.e(time, "calendar.time");
        return time;
    }

    public static /* synthetic */ Date createDate$default(int i, int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
        int i8;
        int i9;
        int i10;
        if ((i7 & 8) != 0) {
            i8 = 0;
        } else {
            i8 = i4;
        }
        if ((i7 & 16) != 0) {
            i9 = 0;
        } else {
            i9 = i5;
        }
        if ((i7 & 32) != 0) {
            i10 = 0;
        } else {
            i10 = i6;
        }
        return createDate(i, i2, i3, i8, i9, i10);
    }

    public static final String formatDate(Date date, BrazeDateFormat brazeDateFormat, TimeZone timeZone) {
        j.f(date, "<this>");
        j.f(brazeDateFormat, "dateFormat");
        j.f(timeZone, "timeZone");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(brazeDateFormat.getFormat(), Locale.US);
        simpleDateFormat.setTimeZone(timeZone);
        String format = simpleDateFormat.format(date);
        j.e(format, "simpleDateFormat.format(this)");
        return format;
    }

    public static /* synthetic */ String formatDate$default(Date date, BrazeDateFormat brazeDateFormat, TimeZone timeZone, int i, Object obj) {
        if ((i & 2) != 0) {
            timeZone = UTC_TIME_ZONE;
            j.e(timeZone, "UTC_TIME_ZONE");
        }
        return formatDate(date, brazeDateFormat, timeZone);
    }

    public static final String formatDateNow(BrazeDateFormat brazeDateFormat) {
        j.f(brazeDateFormat, "dateFormat");
        Date createDate = createDate(nowInSeconds());
        TimeZone timeZone = TimeZone.getDefault();
        j.e(timeZone, "getDefault()");
        return formatDate(createDate, brazeDateFormat, timeZone);
    }

    public static final long getTimeFromEpochInSeconds(Date date) {
        j.f(date, "<this>");
        return TimeUnit.MILLISECONDS.toSeconds(date.getTime());
    }

    public static final long nowInMilliseconds() {
        return System.currentTimeMillis();
    }

    public static final long nowInSeconds() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }

    public static final double nowInSecondsPrecise() {
        return System.currentTimeMillis() / 1000.0d;
    }

    public static final Date parseDate(String str, BrazeDateFormat brazeDateFormat) {
        j.f(str, "<this>");
        j.f(brazeDateFormat, "dateFormat");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(brazeDateFormat.getFormat(), Locale.US);
        simpleDateFormat.setTimeZone(UTC_TIME_ZONE);
        try {
            Date parse = simpleDateFormat.parse(str);
            j.c(parse);
            return parse;
        } catch (Exception e) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            brazeLogger.brazelog(brazeLogger.getBrazeLogTag("DateTimeUtils"), BrazeLogger.Priority.E, (Throwable) e, (com.amazon.aps.iva.xb0.a<String>) new a(str));
            throw e;
        }
    }

    public static final Date createDate(long j) {
        return new Date(j * 1000);
    }
}

package androidx.leanback.widget.picker;

import com.google.android.material.timepicker.TimeModel;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Locale;
/* compiled from: PickerUtility.java */
/* loaded from: classes.dex */
public final class a {

    /* compiled from: PickerUtility.java */
    /* renamed from: androidx.leanback.widget.picker.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0031a {
        public final Locale a;
        public final String[] b;

        public C0031a(Locale locale) {
            this.a = locale;
            this.b = DateFormatSymbols.getInstance(locale).getShortMonths();
            Calendar calendar = Calendar.getInstance(locale);
            int minimum = calendar.getMinimum(5);
            int maximum = calendar.getMaximum(5);
            String[] strArr = new String[(maximum - minimum) + 1];
            for (int i = minimum; i <= maximum; i++) {
                strArr[i - minimum] = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i));
            }
        }
    }

    public static Calendar a(Calendar calendar, Locale locale) {
        if (calendar == null) {
            return Calendar.getInstance(locale);
        }
        long timeInMillis = calendar.getTimeInMillis();
        Calendar calendar2 = Calendar.getInstance(locale);
        calendar2.setTimeInMillis(timeInMillis);
        return calendar2;
    }
}

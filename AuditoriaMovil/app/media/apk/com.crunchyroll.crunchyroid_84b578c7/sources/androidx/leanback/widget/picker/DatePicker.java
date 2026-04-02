package androidx.leanback.widget.picker;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import androidx.leanback.widget.picker.a;
import com.amazon.aps.iva.g5.b;
import com.amazon.aps.iva.g5.c;
import com.google.android.material.timepicker.TimeModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
/* loaded from: classes.dex */
public class DatePicker extends b {
    public static final int[] D = {5, 2, 1};
    public Calendar A;
    public Calendar B;
    public Calendar C;
    public String q;
    public c r;
    public c s;
    public c t;
    public int u;
    public int v;
    public int w;
    public final SimpleDateFormat x;
    public a.C0031a y;
    public Calendar z;

    public DatePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z;
        boolean z2;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        this.x = simpleDateFormat;
        Locale locale = Locale.getDefault();
        getContext().getResources();
        this.y = new a.C0031a(locale);
        this.C = a.a(this.C, locale);
        this.z = a.a(this.z, this.y.a);
        this.A = a.a(this.A, this.y.a);
        this.B = a.a(this.B, this.y.a);
        c cVar = this.r;
        if (cVar != null) {
            cVar.d = this.y.b;
            b(this.u, cVar);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.amazon.aps.iva.d5.a.d);
        String string = obtainStyledAttributes.getString(0);
        String string2 = obtainStyledAttributes.getString(1);
        this.C.clear();
        if (!TextUtils.isEmpty(string)) {
            try {
                this.C.setTime(simpleDateFormat.parse(string));
                z2 = true;
            } catch (ParseException unused) {
                z2 = false;
            }
            if (!z2) {
                this.C.set(1900, 0, 1);
            }
        } else {
            this.C.set(1900, 0, 1);
        }
        this.z.setTimeInMillis(this.C.getTimeInMillis());
        this.C.clear();
        if (!TextUtils.isEmpty(string2)) {
            try {
                this.C.setTime(this.x.parse(string2));
                z = true;
            } catch (ParseException unused2) {
                z = false;
            }
            if (!z) {
                this.C.set(2100, 0, 1);
            }
        } else {
            this.C.set(2100, 0, 1);
        }
        this.A.setTimeInMillis(this.C.getTimeInMillis());
        String string3 = obtainStyledAttributes.getString(2);
        setDatePickerFormat(TextUtils.isEmpty(string3) ? new String(DateFormat.getDateFormatOrder(context)) : string3);
    }

    @Override // com.amazon.aps.iva.g5.b
    public final void a(int i, int i2) {
        c cVar;
        this.C.setTimeInMillis(this.B.getTimeInMillis());
        ArrayList<c> arrayList = this.d;
        if (arrayList == null) {
            cVar = null;
        } else {
            cVar = arrayList.get(i);
        }
        int i3 = cVar.a;
        if (i == this.v) {
            this.C.add(5, i2 - i3);
        } else if (i == this.u) {
            this.C.add(2, i2 - i3);
        } else if (i == this.w) {
            this.C.add(1, i2 - i3);
        } else {
            throw new IllegalArgumentException();
        }
        this.B.set(this.C.get(1), this.C.get(2), this.C.get(5));
        if (this.B.before(this.z)) {
            this.B.setTimeInMillis(this.z.getTimeInMillis());
        } else if (this.B.after(this.A)) {
            this.B.setTimeInMillis(this.A.getTimeInMillis());
        }
        post(new com.amazon.aps.iva.g5.a(this));
    }

    public long getDate() {
        return this.B.getTimeInMillis();
    }

    public String getDatePickerFormat() {
        return this.q;
    }

    public long getMaxDate() {
        return this.A.getTimeInMillis();
    }

    public long getMinDate() {
        return this.z.getTimeInMillis();
    }

    public void setDatePickerFormat(String str) {
        if (TextUtils.isEmpty(str)) {
            str = new String(DateFormat.getDateFormatOrder(getContext()));
        }
        if (TextUtils.equals(this.q, str)) {
            return;
        }
        this.q = str;
        String bestDateTimePattern = DateFormat.getBestDateTimePattern(this.y.a, str);
        if (TextUtils.isEmpty(bestDateTimePattern)) {
            bestDateTimePattern = "MM/dd/yyyy";
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        char[] cArr = {'Y', 'y', 'M', 'm', 'D', 'd'};
        int i = 0;
        boolean z = false;
        char c = 0;
        while (true) {
            boolean z2 = true;
            if (i >= bestDateTimePattern.length()) {
                break;
            }
            char charAt = bestDateTimePattern.charAt(i);
            if (charAt != ' ') {
                if (charAt == '\'') {
                    if (!z) {
                        sb.setLength(0);
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    if (z) {
                        sb.append(charAt);
                    } else {
                        int i2 = 0;
                        while (true) {
                            if (i2 < 6) {
                                if (charAt == cArr[i2]) {
                                    break;
                                }
                                i2++;
                            } else {
                                z2 = false;
                                break;
                            }
                        }
                        if (z2) {
                            if (charAt != c) {
                                arrayList.add(sb.toString());
                                sb.setLength(0);
                            }
                        } else {
                            sb.append(charAt);
                        }
                    }
                    c = charAt;
                }
            }
            i++;
        }
        arrayList.add(sb.toString());
        if (arrayList.size() == str.length() + 1) {
            setSeparators(arrayList);
            this.s = null;
            this.r = null;
            this.t = null;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            String upperCase = str.toUpperCase();
            ArrayList arrayList2 = new ArrayList(3);
            for (int i3 = 0; i3 < upperCase.length(); i3++) {
                char charAt2 = upperCase.charAt(i3);
                if (charAt2 != 'D') {
                    if (charAt2 != 'M') {
                        if (charAt2 == 'Y') {
                            if (this.t == null) {
                                c cVar = new c();
                                this.t = cVar;
                                arrayList2.add(cVar);
                                this.w = i3;
                                this.t.e = TimeModel.NUMBER_FORMAT;
                            } else {
                                throw new IllegalArgumentException("datePicker format error");
                            }
                        } else {
                            throw new IllegalArgumentException("datePicker format error");
                        }
                    } else if (this.r == null) {
                        c cVar2 = new c();
                        this.r = cVar2;
                        arrayList2.add(cVar2);
                        this.r.d = this.y.b;
                        this.u = i3;
                    } else {
                        throw new IllegalArgumentException("datePicker format error");
                    }
                } else if (this.s == null) {
                    c cVar3 = new c();
                    this.s = cVar3;
                    arrayList2.add(cVar3);
                    this.s.e = TimeModel.ZERO_LEADING_NUMBER_FORMAT;
                    this.v = i3;
                } else {
                    throw new IllegalArgumentException("datePicker format error");
                }
            }
            setColumns(arrayList2);
            post(new com.amazon.aps.iva.g5.a(this));
            return;
        }
        throw new IllegalStateException("Separators size: " + arrayList.size() + " must equal the size of datePickerFormat: " + str.length() + " + 1");
    }

    public void setMaxDate(long j) {
        this.C.setTimeInMillis(j);
        if (this.C.get(1) == this.A.get(1) && this.C.get(6) != this.A.get(6)) {
            return;
        }
        this.A.setTimeInMillis(j);
        if (this.B.after(this.A)) {
            this.B.setTimeInMillis(this.A.getTimeInMillis());
        }
        post(new com.amazon.aps.iva.g5.a(this));
    }

    public void setMinDate(long j) {
        this.C.setTimeInMillis(j);
        if (this.C.get(1) == this.z.get(1) && this.C.get(6) != this.z.get(6)) {
            return;
        }
        this.z.setTimeInMillis(j);
        if (this.B.before(this.z)) {
            this.B.setTimeInMillis(this.z.getTimeInMillis());
        }
        post(new com.amazon.aps.iva.g5.a(this));
    }
}

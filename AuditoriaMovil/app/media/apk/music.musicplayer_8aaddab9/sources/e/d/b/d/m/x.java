package e.d.b.d.m;

import android.view.View;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.Month;
import e.d.b.d.m.d;
/* loaded from: classes2.dex */
public class x implements View.OnClickListener {
    public final /* synthetic */ int a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ y f6466b;

    public x(y yVar, int i2) {
        this.f6466b = yVar;
        this.a = i2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Month c2 = Month.c(this.a, this.f6466b.f6467d.f6422f.f4638b);
        CalendarConstraints calendarConstraints = this.f6466b.f6467d.f6421e;
        if (c2.compareTo(calendarConstraints.a) < 0) {
            c2 = calendarConstraints.a;
        } else if (c2.compareTo(calendarConstraints.f4627b) > 0) {
            c2 = calendarConstraints.f4627b;
        }
        this.f6466b.f6467d.e(c2);
        this.f6466b.f6467d.f(d.e.DAY);
    }
}

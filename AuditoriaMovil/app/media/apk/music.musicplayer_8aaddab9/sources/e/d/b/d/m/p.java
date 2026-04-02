package e.d.b.d.m;

import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.google.android.material.datepicker.Month;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
/* loaded from: classes2.dex */
public class p extends BaseAdapter {
    public static final int a = w.e().getMaximum(4);

    /* renamed from: b  reason: collision with root package name */
    public final Month f6453b;

    /* renamed from: c  reason: collision with root package name */
    public final DateSelector<?> f6454c;

    /* renamed from: d  reason: collision with root package name */
    public Collection<Long> f6455d;

    /* renamed from: e  reason: collision with root package name */
    public b f6456e;

    /* renamed from: f  reason: collision with root package name */
    public final CalendarConstraints f6457f;

    public p(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints) {
        this.f6453b = month;
        this.f6454c = dateSelector;
        this.f6457f = calendarConstraints;
        this.f6455d = dateSelector.I();
    }

    public int a(int i2) {
        return b() + (i2 - 1);
    }

    public int b() {
        return this.f6453b.e();
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public Long getItem(int i2) {
        if (i2 < this.f6453b.e() || i2 > d()) {
            return null;
        }
        Month month = this.f6453b;
        Calendar b2 = w.b(month.a);
        b2.set(5, (i2 - month.e()) + 1);
        return Long.valueOf(b2.getTimeInMillis());
    }

    public int d() {
        return (this.f6453b.e() + this.f6453b.f4641e) - 1;
    }

    public final void e(TextView textView, long j2) {
        a aVar;
        if (textView == null) {
            return;
        }
        boolean z = false;
        if (this.f6457f.f4628c.z(j2)) {
            textView.setEnabled(true);
            Iterator<Long> it = this.f6454c.I().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (w.a(j2) == w.a(it.next().longValue())) {
                    z = true;
                    break;
                }
            }
            aVar = z ? this.f6456e.f6408b : w.d().getTimeInMillis() == j2 ? this.f6456e.f6409c : this.f6456e.a;
        } else {
            textView.setEnabled(false);
            aVar = this.f6456e.f6413g;
        }
        aVar.b(textView);
    }

    public final void f(MaterialCalendarGridView materialCalendarGridView, long j2) {
        if (Month.d(j2).equals(this.f6453b)) {
            Calendar b2 = w.b(this.f6453b.a);
            b2.setTimeInMillis(j2);
            e((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter2().a(b2.get(5)) - materialCalendarGridView.getFirstVisiblePosition()), j2);
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return b() + this.f6453b.f4641e;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2 / this.f6453b.f4640d;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0119  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.d.b.d.m.p.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }
}

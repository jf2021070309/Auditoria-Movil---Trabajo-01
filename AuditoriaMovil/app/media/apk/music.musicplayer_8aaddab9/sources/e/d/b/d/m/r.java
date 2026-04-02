package e.d.b.d.m;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c.i.k.c0;
import c.i.k.d0;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.google.android.material.datepicker.Month;
import e.d.b.d.m.d;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public class r extends RecyclerView.e<a> {

    /* renamed from: d  reason: collision with root package name */
    public final Context f6459d;

    /* renamed from: e  reason: collision with root package name */
    public final CalendarConstraints f6460e;

    /* renamed from: f  reason: collision with root package name */
    public final DateSelector<?> f6461f;

    /* renamed from: g  reason: collision with root package name */
    public final d.f f6462g;

    /* renamed from: h  reason: collision with root package name */
    public final int f6463h;

    /* loaded from: classes2.dex */
    public static class a extends RecyclerView.a0 {
        public final TextView u;
        public final MaterialCalendarGridView v;

        public a(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.u = textView;
            AtomicInteger atomicInteger = d0.a;
            new c0(R.id.tag_accessibility_heading, Boolean.class, 28).e(textView, Boolean.TRUE);
            this.v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public r(Context context, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, d.f fVar) {
        Month month = calendarConstraints.a;
        Month month2 = calendarConstraints.f4627b;
        Month month3 = calendarConstraints.f4629d;
        if (month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        int i2 = p.a;
        int i3 = d.f6418b;
        int dimensionPixelSize = i2 * context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
        int dimensionPixelSize2 = l.d(context) ? context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0;
        this.f6459d = context;
        this.f6463h = dimensionPixelSize + dimensionPixelSize2;
        this.f6460e = calendarConstraints;
        this.f6461f = dateSelector;
        this.f6462g = fVar;
        i(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int b() {
        return this.f6460e.f4631f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public long c(int i2) {
        return this.f6460e.a.h(i2).a.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void f(a aVar, int i2) {
        a aVar2 = aVar;
        Month h2 = this.f6460e.a.h(i2);
        aVar2.u.setText(h2.g(aVar2.f527b.getContext()));
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar2.v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter2() == null || !h2.equals(materialCalendarGridView.getAdapter2().f6453b)) {
            p pVar = new p(h2, this.f6461f, this.f6460e);
            materialCalendarGridView.setNumColumns(h2.f4640d);
            materialCalendarGridView.setAdapter((ListAdapter) pVar);
        } else {
            materialCalendarGridView.invalidate();
            p adapter2 = materialCalendarGridView.getAdapter2();
            for (Long l2 : adapter2.f6455d) {
                adapter2.f(materialCalendarGridView, l2.longValue());
            }
            DateSelector<?> dateSelector = adapter2.f6454c;
            if (dateSelector != null) {
                for (Long l3 : dateSelector.I()) {
                    adapter2.f(materialCalendarGridView, l3.longValue());
                }
                adapter2.f6455d = adapter2.f6454c.I();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new q(this, materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public a h(ViewGroup viewGroup, int i2) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (l.d(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.n(-1, this.f6463h));
            return new a(linearLayout, true);
        }
        return new a(linearLayout, false);
    }

    public Month j(int i2) {
        return this.f6460e.a.h(i2);
    }

    public int k(Month month) {
        return this.f6460e.a.i(month);
    }
}

package e.d.b.d.m;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.Locale;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public class y extends RecyclerView.e<a> {

    /* renamed from: d  reason: collision with root package name */
    public final d<?> f6467d;

    /* loaded from: classes2.dex */
    public static class a extends RecyclerView.a0 {
        public final TextView u;

        public a(TextView textView) {
            super(textView);
            this.u = textView;
        }
    }

    public y(d<?> dVar) {
        this.f6467d = dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int b() {
        return this.f6467d.f6421e.f4630e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void f(a aVar, int i2) {
        a aVar2 = aVar;
        int i3 = this.f6467d.f6421e.a.f4639c + i2;
        String string = aVar2.u.getContext().getString(R.string.mtrl_picker_navigate_to_year_description);
        aVar2.u.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i3)));
        aVar2.u.setContentDescription(String.format(string, Integer.valueOf(i3)));
        b bVar = this.f6467d.f6424h;
        Calendar d2 = w.d();
        e.d.b.d.m.a aVar3 = d2.get(1) == i3 ? bVar.f6412f : bVar.f6410d;
        for (Long l2 : this.f6467d.f6420d.I()) {
            d2.setTimeInMillis(l2.longValue());
            if (d2.get(1) == i3) {
                aVar3 = bVar.f6411e;
            }
        }
        aVar3.b(aVar2.u);
        aVar2.u.setOnClickListener(new x(this, i3));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public a h(ViewGroup viewGroup, int i2) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }

    public int j(int i2) {
        return i2 - this.f6467d.f6421e.a.f4639c;
    }
}

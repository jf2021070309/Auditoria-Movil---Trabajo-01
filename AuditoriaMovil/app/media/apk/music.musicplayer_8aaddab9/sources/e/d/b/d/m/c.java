package e.d.b.d.m;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public class c extends BaseAdapter {
    public static final int a;

    /* renamed from: b  reason: collision with root package name */
    public final Calendar f6415b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6416c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6417d;

    static {
        a = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public c() {
        Calendar e2 = w.e();
        this.f6415b = e2;
        this.f6416c = e2.getMaximum(7);
        this.f6417d = e2.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f6416c;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i2) {
        int i3 = this.f6416c;
        if (i2 >= i3) {
            return null;
        }
        int i4 = i2 + this.f6417d;
        if (i4 > i3) {
            i4 -= i3;
        }
        return Integer.valueOf(i4);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public View getView(int i2, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        Calendar calendar = this.f6415b;
        int i3 = i2 + this.f6417d;
        int i4 = this.f6416c;
        if (i3 > i4) {
            i3 -= i4;
        }
        calendar.set(7, i3);
        textView.setText(this.f6415b.getDisplayName(7, a, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), this.f6415b.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}

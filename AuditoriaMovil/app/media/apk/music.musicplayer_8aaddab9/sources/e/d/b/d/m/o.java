package e.d.b.d.m;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import java.util.Iterator;
/* loaded from: classes2.dex */
public final class o<S> extends t<S> {

    /* renamed from: b  reason: collision with root package name */
    public int f6450b;

    /* renamed from: c  reason: collision with root package name */
    public DateSelector<S> f6451c;

    /* renamed from: d  reason: collision with root package name */
    public CalendarConstraints f6452d;

    /* loaded from: classes2.dex */
    public class a extends s<S> {
        public a() {
        }

        @Override // e.d.b.d.m.s
        public void a(S s) {
            Iterator<s<S>> it = o.this.a.iterator();
            while (it.hasNext()) {
                it.next().a(s);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f6450b = bundle.getInt("THEME_RES_ID_KEY");
        this.f6451c = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f6452d = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f6451c.u(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f6450b)), viewGroup, bundle, this.f6452d, new a());
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f6450b);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f6451c);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f6452d);
    }
}

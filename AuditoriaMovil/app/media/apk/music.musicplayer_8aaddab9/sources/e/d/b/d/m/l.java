package e.d.b.d.m;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import c.i.k.d0;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.Month;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public final class l<S> extends c.m.b.n {
    public static final /* synthetic */ int a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashSet<n<? super S>> f6437b = new LinkedHashSet<>();

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashSet<View.OnClickListener> f6438c = new LinkedHashSet<>();

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnCancelListener> f6439d = new LinkedHashSet<>();

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnDismissListener> f6440e = new LinkedHashSet<>();

    /* renamed from: f  reason: collision with root package name */
    public int f6441f;

    /* renamed from: g  reason: collision with root package name */
    public DateSelector<S> f6442g;

    /* renamed from: h  reason: collision with root package name */
    public t<S> f6443h;

    /* renamed from: i  reason: collision with root package name */
    public CalendarConstraints f6444i;

    /* renamed from: j  reason: collision with root package name */
    public d<S> f6445j;

    /* renamed from: k  reason: collision with root package name */
    public int f6446k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f6447l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f6448m;

    /* renamed from: n  reason: collision with root package name */
    public int f6449n;
    public TextView o;
    public CheckableImageButton p;
    public e.d.b.d.w.g q;
    public Button r;

    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator<n<? super S>> it = l.this.f6437b.iterator();
            while (it.hasNext()) {
                it.next().a((S) l.this.b().K());
            }
            l.this.dismiss();
        }
    }

    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator<View.OnClickListener> it = l.this.f6438c.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
            l.this.dismiss();
        }
    }

    /* loaded from: classes2.dex */
    public class c extends s<S> {
        public c() {
        }

        @Override // e.d.b.d.m.s
        public void a(S s) {
            l lVar = l.this;
            int i2 = l.a;
            lVar.g();
            l lVar2 = l.this;
            lVar2.r.setEnabled(lVar2.b().B());
        }
    }

    public static int c(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar d2 = w.d();
        d2.set(5, 1);
        Calendar b2 = w.b(d2);
        b2.get(2);
        b2.get(1);
        int maximum = b2.getMaximum(7);
        b2.getActualMaximum(5);
        b2.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean d(Context context) {
        return e(context, 16843277);
    }

    public static boolean e(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(e.d.b.d.a.b0(context, R.attr.materialCalendarStyle, d.class.getCanonicalName()), new int[]{i2});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    public final DateSelector<S> b() {
        if (this.f6442g == null) {
            this.f6442g = (DateSelector) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f6442g;
    }

    public final void f() {
        t<S> tVar;
        Context requireContext = requireContext();
        int i2 = this.f6441f;
        if (i2 == 0) {
            i2 = b().y(requireContext);
        }
        DateSelector<S> b2 = b();
        CalendarConstraints calendarConstraints = this.f6444i;
        d<S> dVar = new d<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i2);
        bundle.putParcelable("GRID_SELECTOR_KEY", b2);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.f4629d);
        dVar.setArguments(bundle);
        this.f6445j = dVar;
        if (this.p.isChecked()) {
            DateSelector<S> b3 = b();
            CalendarConstraints calendarConstraints2 = this.f6444i;
            tVar = new o<>();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i2);
            bundle2.putParcelable("DATE_SELECTOR_KEY", b3);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints2);
            tVar.setArguments(bundle2);
        } else {
            tVar = this.f6445j;
        }
        this.f6443h = tVar;
        g();
        c.m.b.d dVar2 = new c.m.b.d(getChildFragmentManager());
        dVar2.e(R.id.mtrl_calendar_frame, this.f6443h);
        dVar2.i();
        this.f6443h.b(new c());
    }

    public final void g() {
        String a2 = b().a(getContext());
        this.o.setContentDescription(String.format(getString(R.string.mtrl_picker_announce_current_selection), a2));
        this.o.setText(a2);
    }

    public final void h(CheckableImageButton checkableImageButton) {
        this.p.setContentDescription(this.p.isChecked() ? checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    @Override // c.m.b.n, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f6439d.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // c.m.b.n, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f6441f = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f6442g = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f6444i = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f6446k = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f6447l = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f6449n = bundle.getInt("INPUT_MODE_KEY");
    }

    @Override // c.m.b.n
    public final Dialog onCreateDialog(Bundle bundle) {
        Context requireContext = requireContext();
        Context requireContext2 = requireContext();
        int i2 = this.f6441f;
        if (i2 == 0) {
            i2 = b().y(requireContext2);
        }
        Dialog dialog = new Dialog(requireContext, i2);
        Context context = dialog.getContext();
        this.f6448m = d(context);
        int b0 = e.d.b.d.a.b0(context, R.attr.colorSurface, l.class.getCanonicalName());
        e.d.b.d.w.g gVar = new e.d.b.d.w.g(e.d.b.d.w.j.b(context, null, R.attr.materialCalendarStyle, 2131887110).a());
        this.q = gVar;
        gVar.f6591c.f6603b = new e.d.b.d.o.a(context);
        gVar.x();
        this.q.q(ColorStateList.valueOf(b0));
        this.q.p(d0.l(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.f6448m ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.f6448m) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(c(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(c(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.o = textView;
        AtomicInteger atomicInteger = d0.a;
        d0.f.f(textView, 1);
        this.p = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        CharSequence charSequence = this.f6447l;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f6446k);
        }
        this.p.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.p;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, c.b.d.a.a.b(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], c.b.d.a.a.b(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.p.setChecked(this.f6449n != 0);
        d0.A(this.p, null);
        h(this.p);
        this.p.setOnClickListener(new m(this));
        this.r = (Button) inflate.findViewById(R.id.confirm_button);
        if (b().B()) {
            this.r.setEnabled(true);
        } else {
            this.r.setEnabled(false);
        }
        this.r.setTag("CONFIRM_BUTTON_TAG");
        this.r.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        button.setOnClickListener(new b());
        return inflate;
    }

    @Override // c.m.b.n, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f6440e.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // c.m.b.n, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f6441f);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f6442g);
        CalendarConstraints.b bVar = new CalendarConstraints.b(this.f6444i);
        Month month = this.f6445j.f6422f;
        if (month != null) {
            bVar.f4635e = Long.valueOf(month.f4642f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f4636f);
        Month d2 = Month.d(bVar.f4633c);
        Month d3 = Month.d(bVar.f4634d);
        CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l2 = bVar.f4635e;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new CalendarConstraints(d2, d3, dateValidator, l2 == null ? null : Month.d(l2.longValue()), null));
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f6446k);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f6447l);
    }

    @Override // c.m.b.n, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f6448m) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.q);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.q, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new e.d.b.d.n.a(requireDialog(), rect));
        }
        f();
    }

    @Override // c.m.b.n, androidx.fragment.app.Fragment
    public void onStop() {
        this.f6443h.a.clear();
        super.onStop();
    }
}

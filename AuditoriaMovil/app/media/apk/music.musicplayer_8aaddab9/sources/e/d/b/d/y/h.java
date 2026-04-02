package e.d.b.d.y;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import c.i.k.d0;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import e.d.b.d.w.g;
import e.d.b.d.w.j;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public class h extends m {

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f6689e;

    /* renamed from: f  reason: collision with root package name */
    public final TextWatcher f6690f;

    /* renamed from: g  reason: collision with root package name */
    public final View.OnFocusChangeListener f6691g;

    /* renamed from: h  reason: collision with root package name */
    public final TextInputLayout.e f6692h;

    /* renamed from: i  reason: collision with root package name */
    public final TextInputLayout.f f6693i;
    @SuppressLint({"ClickableViewAccessibility"})

    /* renamed from: j  reason: collision with root package name */
    public final TextInputLayout.g f6694j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f6695k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f6696l;

    /* renamed from: m  reason: collision with root package name */
    public long f6697m;

    /* renamed from: n  reason: collision with root package name */
    public StateListDrawable f6698n;
    public e.d.b.d.w.g o;
    public AccessibilityManager p;
    public ValueAnimator q;
    public ValueAnimator r;

    /* loaded from: classes2.dex */
    public class a extends e.d.b.d.r.j {

        /* renamed from: e.d.b.d.y.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0147a implements Runnable {
            public final /* synthetic */ AutoCompleteTextView a;

            public RunnableC0147a(AutoCompleteTextView autoCompleteTextView) {
                this.a = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean isPopupShowing = this.a.isPopupShowing();
                h.f(h.this, isPopupShowing);
                h.this.f6695k = isPopupShowing;
            }
        }

        public a() {
        }

        @Override // e.d.b.d.r.j, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView d2 = h.d(h.this.a.getEditText());
            if (h.this.p.isTouchExplorationEnabled() && h.e(d2) && !h.this.f6704c.hasFocus()) {
                d2.dismissDropDown();
            }
            d2.post(new RunnableC0147a(d2));
        }
    }

    /* loaded from: classes2.dex */
    public class b implements View.OnFocusChangeListener {
        public b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            h.this.a.setEndIconActivated(z);
            if (z) {
                return;
            }
            h.f(h.this, false);
            h.this.f6695k = false;
        }
    }

    /* loaded from: classes2.dex */
    public class c extends TextInputLayout.e {
        public c(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.e, c.i.k.e
        public void d(View view, c.i.k.k0.b bVar) {
            boolean z;
            super.d(view, bVar);
            if (!h.e(h.this.a.getEditText())) {
                bVar.f2193b.setClassName(Spinner.class.getName());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                z = bVar.f2193b.isShowingHintText();
            } else {
                Bundle f2 = bVar.f();
                z = f2 != null && (f2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4) == 4;
            }
            if (z) {
                bVar.k(null);
            }
        }

        @Override // c.i.k.e
        public void e(View view, AccessibilityEvent accessibilityEvent) {
            this.f2148b.onPopulateAccessibilityEvent(view, accessibilityEvent);
            AutoCompleteTextView d2 = h.d(h.this.a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && h.this.p.isTouchExplorationEnabled() && !h.e(h.this.a.getEditText())) {
                h.g(h.this, d2);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class d implements TextInputLayout.f {
        public d() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            LayerDrawable layerDrawable;
            AutoCompleteTextView d2 = h.d(textInputLayout.getEditText());
            h hVar = h.this;
            Objects.requireNonNull(hVar);
            boolean z = h.f6689e;
            if (z) {
                int boxBackgroundMode = hVar.a.getBoxBackgroundMode();
                if (boxBackgroundMode == 2) {
                    d2.setDropDownBackgroundDrawable(hVar.o);
                } else if (boxBackgroundMode == 1) {
                    d2.setDropDownBackgroundDrawable(hVar.f6698n);
                }
            }
            h hVar2 = h.this;
            Objects.requireNonNull(hVar2);
            if (!(d2.getKeyListener() != null)) {
                int boxBackgroundMode2 = hVar2.a.getBoxBackgroundMode();
                e.d.b.d.w.g boxBackground = hVar2.a.getBoxBackground();
                int B = e.d.b.d.a.B(d2, R.attr.colorControlHighlight);
                int[][] iArr = {new int[]{16842919}, new int[0]};
                if (boxBackgroundMode2 == 2) {
                    int B2 = e.d.b.d.a.B(d2, R.attr.colorSurface);
                    e.d.b.d.w.g gVar = new e.d.b.d.w.g(boxBackground.f6591c.a);
                    int P = e.d.b.d.a.P(B, B2, 0.1f);
                    gVar.q(new ColorStateList(iArr, new int[]{P, 0}));
                    if (z) {
                        gVar.setTint(B2);
                        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{P, B2});
                        e.d.b.d.w.g gVar2 = new e.d.b.d.w.g(boxBackground.f6591c.a);
                        gVar2.setTint(-1);
                        layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar, gVar2), boxBackground});
                    } else {
                        layerDrawable = new LayerDrawable(new Drawable[]{gVar, boxBackground});
                    }
                    AtomicInteger atomicInteger = d0.a;
                    d0.c.q(d2, layerDrawable);
                } else if (boxBackgroundMode2 == 1) {
                    int boxBackgroundColor = hVar2.a.getBoxBackgroundColor();
                    int[] iArr2 = {e.d.b.d.a.P(B, boxBackgroundColor, 0.1f), boxBackgroundColor};
                    if (z) {
                        RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, iArr2), boxBackground, boxBackground);
                        AtomicInteger atomicInteger2 = d0.a;
                        d0.c.q(d2, rippleDrawable);
                    } else {
                        e.d.b.d.w.g gVar3 = new e.d.b.d.w.g(boxBackground.f6591c.a);
                        gVar3.q(new ColorStateList(iArr, iArr2));
                        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{boxBackground, gVar3});
                        AtomicInteger atomicInteger3 = d0.a;
                        int f2 = d0.d.f(d2);
                        int paddingTop = d2.getPaddingTop();
                        int e2 = d0.d.e(d2);
                        int paddingBottom = d2.getPaddingBottom();
                        d0.c.q(d2, layerDrawable2);
                        d0.d.k(d2, f2, paddingTop, e2, paddingBottom);
                    }
                }
            }
            h hVar3 = h.this;
            Objects.requireNonNull(hVar3);
            d2.setOnTouchListener(new j(hVar3, d2));
            d2.setOnFocusChangeListener(hVar3.f6691g);
            if (z) {
                d2.setOnDismissListener(new k(hVar3));
            }
            d2.setThreshold(0);
            d2.removeTextChangedListener(h.this.f6690f);
            d2.addTextChangedListener(h.this.f6690f);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!(d2.getKeyListener() != null)) {
                CheckableImageButton checkableImageButton = h.this.f6704c;
                AtomicInteger atomicInteger4 = d0.a;
                d0.c.s(checkableImageButton, 2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(h.this.f6692h);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* loaded from: classes2.dex */
    public class e implements TextInputLayout.g {

        /* loaded from: classes2.dex */
        public class a implements Runnable {
            public final /* synthetic */ AutoCompleteTextView a;

            public a(AutoCompleteTextView autoCompleteTextView) {
                this.a = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.a.removeTextChangedListener(h.this.f6690f);
            }
        }

        public e() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i2) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView == null || i2 != 3) {
                return;
            }
            autoCompleteTextView.post(new a(autoCompleteTextView));
            if (autoCompleteTextView.getOnFocusChangeListener() == h.this.f6691g) {
                autoCompleteTextView.setOnFocusChangeListener(null);
            }
            autoCompleteTextView.setOnTouchListener(null);
            if (h.f6689e) {
                autoCompleteTextView.setOnDismissListener(null);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h.g(h.this, (AutoCompleteTextView) h.this.a.getEditText());
        }
    }

    static {
        f6689e = Build.VERSION.SDK_INT >= 21;
    }

    public h(TextInputLayout textInputLayout, int i2) {
        super(textInputLayout, i2);
        this.f6690f = new a();
        this.f6691g = new b();
        this.f6692h = new c(this.a);
        this.f6693i = new d();
        this.f6694j = new e();
        this.f6695k = false;
        this.f6696l = false;
        this.f6697m = Long.MAX_VALUE;
    }

    public static AutoCompleteTextView d(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    public static boolean e(EditText editText) {
        return editText.getKeyListener() != null;
    }

    public static void f(h hVar, boolean z) {
        if (hVar.f6696l != z) {
            hVar.f6696l = z;
            hVar.r.cancel();
            hVar.q.start();
        }
    }

    public static void g(h hVar, AutoCompleteTextView autoCompleteTextView) {
        Objects.requireNonNull(hVar);
        if (autoCompleteTextView == null) {
            return;
        }
        if (hVar.i()) {
            hVar.f6695k = false;
        }
        if (hVar.f6695k) {
            hVar.f6695k = false;
            return;
        }
        if (f6689e) {
            boolean z = hVar.f6696l;
            boolean z2 = !z;
            if (z != z2) {
                hVar.f6696l = z2;
                hVar.r.cancel();
                hVar.q.start();
            }
        } else {
            hVar.f6696l = !hVar.f6696l;
            hVar.f6704c.toggle();
        }
        if (!hVar.f6696l) {
            autoCompleteTextView.dismissDropDown();
            return;
        }
        autoCompleteTextView.requestFocus();
        autoCompleteTextView.showDropDown();
    }

    @Override // e.d.b.d.y.m
    public void a() {
        float dimensionPixelOffset = this.f6703b.getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = this.f6703b.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f6703b.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        e.d.b.d.w.g h2 = h(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        e.d.b.d.w.g h3 = h(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.o = h2;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f6698n = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, h2);
        this.f6698n.addState(new int[0], h3);
        int i2 = this.f6705d;
        if (i2 == 0) {
            i2 = f6689e ? R.drawable.mtrl_dropdown_arrow : R.drawable.mtrl_ic_arrow_drop_down;
        }
        this.a.setEndIconDrawable(i2);
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.exposed_dropdown_menu_content_description));
        this.a.setEndIconOnClickListener(new f());
        this.a.a(this.f6693i);
        this.a.n0.add(this.f6694j);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = e.d.b.d.c.a.a;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(67);
        ofFloat.addUpdateListener(new i(this));
        this.r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(50);
        ofFloat2.addUpdateListener(new i(this));
        this.q = ofFloat2;
        ofFloat2.addListener(new l(this));
        this.p = (AccessibilityManager) this.f6703b.getSystemService("accessibility");
    }

    @Override // e.d.b.d.y.m
    public boolean b(int i2) {
        return i2 != 0;
    }

    public final e.d.b.d.w.g h(float f2, float f3, float f4, int i2) {
        j.b bVar = new j.b();
        bVar.f6630e = new e.d.b.d.w.a(f2);
        bVar.f6631f = new e.d.b.d.w.a(f2);
        bVar.f6633h = new e.d.b.d.w.a(f3);
        bVar.f6632g = new e.d.b.d.w.a(f3);
        e.d.b.d.w.j a2 = bVar.a();
        Context context = this.f6703b;
        String str = e.d.b.d.w.g.a;
        int b0 = e.d.b.d.a.b0(context, R.attr.colorSurface, e.d.b.d.w.g.class.getSimpleName());
        e.d.b.d.w.g gVar = new e.d.b.d.w.g();
        gVar.f6591c.f6603b = new e.d.b.d.o.a(context);
        gVar.x();
        gVar.q(ColorStateList.valueOf(b0));
        g.b bVar2 = gVar.f6591c;
        if (bVar2.o != f4) {
            bVar2.o = f4;
            gVar.x();
        }
        gVar.f6591c.a = a2;
        gVar.invalidateSelf();
        g.b bVar3 = gVar.f6591c;
        if (bVar3.f6610i == null) {
            bVar3.f6610i = new Rect();
        }
        gVar.f6591c.f6610i.set(0, i2, 0, i2);
        gVar.invalidateSelf();
        return gVar;
    }

    public final boolean i() {
        long currentTimeMillis = System.currentTimeMillis() - this.f6697m;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }
}

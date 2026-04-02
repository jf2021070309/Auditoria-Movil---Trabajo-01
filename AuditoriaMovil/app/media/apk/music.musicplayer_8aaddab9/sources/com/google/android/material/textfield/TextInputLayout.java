package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.customview.view.AbsSavedState;
import c.b.i.e0;
import c.i.k.d0;
import ch.qos.logback.classic.pattern.ThrowableProxyConverter;
import com.google.android.material.internal.CheckableImageButton;
import e.d.b.d.w.j;
import e.d.b.d.y.h;
import e.d.b.d.y.m;
import e.d.b.d.y.n;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout {
    public CharSequence A;
    public ColorStateList A0;
    public final TextView B;
    public int B0;
    public boolean C;
    public int C0;
    public CharSequence D;
    public int D0;
    public boolean E;
    public ColorStateList E0;
    public e.d.b.d.w.g F;
    public int F0;
    public e.d.b.d.w.g G;
    public int G0;
    public j H;
    public int H0;
    public final int I;
    public int I0;
    public int J;
    public int J0;
    public int K;
    public boolean K0;
    public int L;
    public final e.d.b.d.r.c L0;
    public int M;
    public boolean M0;
    public int N;
    public boolean N0;
    public int O;
    public ValueAnimator O0;
    public int P;
    public boolean P0;
    public boolean Q0;
    public final Rect U;
    public final Rect V;
    public final RectF W;
    public final FrameLayout a;
    public Typeface a0;

    /* renamed from: b  reason: collision with root package name */
    public final LinearLayout f4671b;
    public final CheckableImageButton b0;

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f4672c;
    public ColorStateList c0;

    /* renamed from: d  reason: collision with root package name */
    public final FrameLayout f4673d;
    public boolean d0;

    /* renamed from: e  reason: collision with root package name */
    public EditText f4674e;
    public PorterDuff.Mode e0;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f4675f;
    public boolean f0;

    /* renamed from: g  reason: collision with root package name */
    public int f4676g;
    public Drawable g0;

    /* renamed from: h  reason: collision with root package name */
    public int f4677h;
    public int h0;

    /* renamed from: i  reason: collision with root package name */
    public final n f4678i;
    public View.OnLongClickListener i0;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4679j;
    public final LinkedHashSet<f> j0;

    /* renamed from: k  reason: collision with root package name */
    public int f4680k;
    public int k0;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4681l;
    public final SparseArray<m> l0;

    /* renamed from: m  reason: collision with root package name */
    public TextView f4682m;
    public final CheckableImageButton m0;

    /* renamed from: n  reason: collision with root package name */
    public int f4683n;
    public final LinkedHashSet<g> n0;
    public int o;
    public ColorStateList o0;
    public CharSequence p;
    public boolean p0;
    public boolean q;
    public PorterDuff.Mode q0;
    public TextView r;
    public boolean r0;
    public ColorStateList s;
    public Drawable s0;
    public int t;
    public int t0;
    public c.z.c u;
    public Drawable u0;
    public c.z.c v;
    public View.OnLongClickListener v0;
    public ColorStateList w;
    public View.OnLongClickListener w0;
    public ColorStateList x;
    public final CheckableImageButton x0;
    public CharSequence y;
    public ColorStateList y0;
    public final TextView z;
    public ColorStateList z0;

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f4684c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f4685d;

        /* renamed from: e  reason: collision with root package name */
        public CharSequence f4686e;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f4687f;

        /* renamed from: g  reason: collision with root package name */
        public CharSequence f4688g;

        /* loaded from: classes2.dex */
        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4684c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f4685d = parcel.readInt() == 1;
            this.f4686e = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f4687f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f4688g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder y = e.a.d.a.a.y("TextInputLayout.SavedState{");
            y.append(Integer.toHexString(System.identityHashCode(this)));
            y.append(" error=");
            y.append((Object) this.f4684c);
            y.append(" hint=");
            y.append((Object) this.f4686e);
            y.append(" helperText=");
            y.append((Object) this.f4687f);
            y.append(" placeholderText=");
            y.append((Object) this.f4688g);
            y.append("}");
            return y.toString();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f369b, i2);
            TextUtils.writeToParcel(this.f4684c, parcel, i2);
            parcel.writeInt(this.f4685d ? 1 : 0);
            TextUtils.writeToParcel(this.f4686e, parcel, i2);
            TextUtils.writeToParcel(this.f4687f, parcel, i2);
            TextUtils.writeToParcel(this.f4688g, parcel, i2);
        }
    }

    /* loaded from: classes2.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.A(!textInputLayout.Q0, false);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f4679j) {
                textInputLayout2.v(editable.length());
            }
            TextInputLayout textInputLayout3 = TextInputLayout.this;
            if (textInputLayout3.q) {
                textInputLayout3.B(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.m0.performClick();
            TextInputLayout.this.m0.jumpDrawablesToCurrentState();
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f4674e.requestLayout();
        }
    }

    /* loaded from: classes2.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.L0.n(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: classes2.dex */
    public static class e extends c.i.k.e {

        /* renamed from: d  reason: collision with root package name */
        public final TextInputLayout f4689d;

        public e(TextInputLayout textInputLayout) {
            this.f4689d = textInputLayout;
        }

        @Override // c.i.k.e
        public void d(View view, c.i.k.k0.b bVar) {
            this.f2148b.onInitializeAccessibilityNodeInfo(view, bVar.f2193b);
            EditText editText = this.f4689d.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f4689d.getHint();
            CharSequence error = this.f4689d.getError();
            CharSequence placeholderText = this.f4689d.getPlaceholderText();
            int counterMaxLength = this.f4689d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f4689d.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !this.f4689d.K0;
            boolean z4 = !TextUtils.isEmpty(error);
            boolean z5 = z4 || !TextUtils.isEmpty(counterOverflowDescription);
            String charSequence = z2 ? hint.toString() : "";
            if (z) {
                bVar.f2193b.setText(text);
            } else if (!TextUtils.isEmpty(charSequence)) {
                bVar.f2193b.setText(charSequence);
                if (z3 && placeholderText != null) {
                    bVar.f2193b.setText(charSequence + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                bVar.f2193b.setText(placeholderText);
            }
            if (!TextUtils.isEmpty(charSequence)) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 26) {
                    bVar.k(charSequence);
                } else {
                    if (z) {
                        charSequence = ((Object) text) + ", " + charSequence;
                    }
                    bVar.f2193b.setText(charSequence);
                }
                boolean z6 = !z;
                if (i2 >= 26) {
                    bVar.f2193b.setShowingHintText(z6);
                } else {
                    bVar.h(4, z6);
                }
            }
            counterMaxLength = (text == null || text.length() != counterMaxLength) ? -1 : -1;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 21) {
                bVar.f2193b.setMaxTextLength(counterMaxLength);
            }
            if (z5) {
                if (!z4) {
                    error = counterOverflowDescription;
                }
                if (i3 >= 21) {
                    bVar.f2193b.setError(error);
                }
            }
            if (editText != null) {
                editText.setLabelFor(R.id.textinput_helper_text);
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    /* loaded from: classes2.dex */
    public interface g {
        void a(TextInputLayout textInputLayout, int i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0585  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TextInputLayout(android.content.Context r31, android.util.AttributeSet r32) {
        /*
            Method dump skipped, instructions count: 1596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private m getEndIconDelegate() {
        m mVar = this.l0.get(this.k0);
        return mVar != null ? mVar : this.l0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.x0.getVisibility() == 0) {
            return this.x0;
        }
        if (k() && m()) {
            return this.m0;
        }
        return null;
    }

    public static void p(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                p((ViewGroup) childAt, z);
            }
        }
    }

    public static void s(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        AtomicInteger atomicInteger = d0.a;
        boolean a2 = d0.b.a(checkableImageButton);
        boolean z = false;
        boolean z2 = onLongClickListener != null;
        z = (a2 || z2) ? true : true;
        checkableImageButton.setFocusable(z);
        checkableImageButton.setClickable(a2);
        checkableImageButton.setPressable(a2);
        checkableImageButton.setLongClickable(z2);
        d0.c.s(checkableImageButton, z ? 1 : 2);
    }

    private void setEditText(EditText editText) {
        if (this.f4674e != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (this.k0 != 3) {
            boolean z = editText instanceof TextInputEditText;
        }
        this.f4674e = editText;
        setMinWidth(this.f4676g);
        setMaxWidth(this.f4677h);
        n();
        setTextInputAccessibilityDelegate(new e(this));
        this.L0.p(this.f4674e.getTypeface());
        e.d.b.d.r.c cVar = this.L0;
        float textSize = this.f4674e.getTextSize();
        if (cVar.f6518j != textSize) {
            cVar.f6518j = textSize;
            cVar.j();
        }
        int gravity = this.f4674e.getGravity();
        this.L0.m((gravity & (-113)) | 48);
        e.d.b.d.r.c cVar2 = this.L0;
        if (cVar2.f6516h != gravity) {
            cVar2.f6516h = gravity;
            cVar2.j();
        }
        this.f4674e.addTextChangedListener(new a());
        if (this.z0 == null) {
            this.z0 = this.f4674e.getHintTextColors();
        }
        if (this.C) {
            if (TextUtils.isEmpty(this.D)) {
                CharSequence hint = this.f4674e.getHint();
                this.f4675f = hint;
                setHint(hint);
                this.f4674e.setHint((CharSequence) null);
            }
            this.E = true;
        }
        if (this.f4682m != null) {
            v(this.f4674e.getText().length());
        }
        y();
        this.f4678i.b();
        this.f4671b.bringToFront();
        this.f4672c.bringToFront();
        this.f4673d.bringToFront();
        this.x0.bringToFront();
        Iterator<f> it = this.j0.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
        C();
        F();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        A(false, true);
    }

    private void setErrorIconVisible(boolean z) {
        this.x0.setVisibility(z ? 0 : 8);
        this.f4673d.setVisibility(z ? 8 : 0);
        F();
        if (k()) {
            return;
        }
        x();
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.D)) {
            return;
        }
        this.D = charSequence;
        e.d.b.d.r.c cVar = this.L0;
        if (charSequence == null || !TextUtils.equals(cVar.x, charSequence)) {
            cVar.x = charSequence;
            cVar.y = null;
            Bitmap bitmap = cVar.A;
            if (bitmap != null) {
                bitmap.recycle();
                cVar.A = null;
            }
            cVar.j();
        }
        if (this.K0) {
            return;
        }
        o();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.q == z) {
            return;
        }
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
            this.r = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_placeholder);
            c.z.c cVar = new c.z.c();
            cVar.f2887f = 87L;
            TimeInterpolator timeInterpolator = e.d.b.d.c.a.a;
            cVar.f2888g = timeInterpolator;
            this.u = cVar;
            cVar.f2886e = 67L;
            c.z.c cVar2 = new c.z.c();
            cVar2.f2887f = 87L;
            cVar2.f2888g = timeInterpolator;
            this.v = cVar2;
            TextView textView = this.r;
            AtomicInteger atomicInteger = d0.a;
            d0.f.f(textView, 1);
            setPlaceholderTextAppearance(this.t);
            setPlaceholderTextColor(this.s);
            TextView textView2 = this.r;
            if (textView2 != null) {
                this.a.addView(textView2);
                this.r.setVisibility(0);
            }
        } else {
            TextView textView3 = this.r;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            this.r = null;
        }
        this.q = z;
    }

    public final void A(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f4674e;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f4674e;
        boolean z4 = editText2 != null && editText2.hasFocus();
        boolean e2 = this.f4678i.e();
        ColorStateList colorStateList2 = this.z0;
        if (colorStateList2 != null) {
            e.d.b.d.r.c cVar = this.L0;
            if (cVar.f6521m != colorStateList2) {
                cVar.f6521m = colorStateList2;
                cVar.j();
            }
            e.d.b.d.r.c cVar2 = this.L0;
            ColorStateList colorStateList3 = this.z0;
            if (cVar2.f6520l != colorStateList3) {
                cVar2.f6520l = colorStateList3;
                cVar2.j();
            }
        }
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.z0;
            int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(new int[]{-16842910}, this.J0) : this.J0;
            this.L0.l(ColorStateList.valueOf(colorForState));
            e.d.b.d.r.c cVar3 = this.L0;
            ColorStateList valueOf = ColorStateList.valueOf(colorForState);
            if (cVar3.f6520l != valueOf) {
                cVar3.f6520l = valueOf;
                cVar3.j();
            }
        } else if (e2) {
            e.d.b.d.r.c cVar4 = this.L0;
            TextView textView2 = this.f4678i.f6716l;
            cVar4.l(textView2 != null ? textView2.getTextColors() : null);
        } else if (this.f4681l && (textView = this.f4682m) != null) {
            this.L0.l(textView.getTextColors());
        } else if (z4 && (colorStateList = this.A0) != null) {
            e.d.b.d.r.c cVar5 = this.L0;
            if (cVar5.f6521m != colorStateList) {
                cVar5.f6521m = colorStateList;
                cVar5.j();
            }
        }
        if (z3 || !this.M0 || (isEnabled() && z4)) {
            if (z2 || this.K0) {
                ValueAnimator valueAnimator = this.O0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.O0.cancel();
                }
                if (z && this.N0) {
                    b(1.0f);
                } else {
                    this.L0.n(1.0f);
                }
                this.K0 = false;
                if (h()) {
                    o();
                }
                EditText editText3 = this.f4674e;
                B(editText3 != null ? editText3.getText().length() : 0);
                D();
                G();
            }
        } else if (z2 || !this.K0) {
            ValueAnimator valueAnimator2 = this.O0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.O0.cancel();
            }
            if (z && this.N0) {
                b(0.0f);
            } else {
                this.L0.n(0.0f);
            }
            if (h() && (!((e.d.b.d.y.g) this.F).A.isEmpty()) && h()) {
                ((e.d.b.d.y.g) this.F).y(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.K0 = true;
            l();
            D();
            G();
        }
    }

    public final void B(int i2) {
        if (i2 != 0 || this.K0) {
            l();
            return;
        }
        TextView textView = this.r;
        if (textView == null || !this.q) {
            return;
        }
        textView.setText(this.p);
        c.z.m.a(this.a, this.u);
        this.r.setVisibility(0);
        this.r.bringToFront();
    }

    public final void C() {
        if (this.f4674e == null) {
            return;
        }
        int i2 = 0;
        if (!(this.b0.getVisibility() == 0)) {
            EditText editText = this.f4674e;
            AtomicInteger atomicInteger = d0.a;
            i2 = d0.d.f(editText);
        }
        TextView textView = this.z;
        int compoundPaddingTop = this.f4674e.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = this.f4674e.getCompoundPaddingBottom();
        AtomicInteger atomicInteger2 = d0.a;
        d0.d.k(textView, i2, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void D() {
        this.z.setVisibility((this.y == null || this.K0) ? 8 : 0);
        x();
    }

    public final void E(boolean z, boolean z2) {
        int defaultColor = this.E0.getDefaultColor();
        int colorForState = this.E0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.E0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.O = colorForState2;
        } else if (z2) {
            this.O = colorForState;
        } else {
            this.O = defaultColor;
        }
    }

    public final void F() {
        if (this.f4674e == null) {
            return;
        }
        int i2 = 0;
        if (!m()) {
            if (!(this.x0.getVisibility() == 0)) {
                EditText editText = this.f4674e;
                AtomicInteger atomicInteger = d0.a;
                i2 = d0.d.e(editText);
            }
        }
        TextView textView = this.B;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = this.f4674e.getPaddingTop();
        int paddingBottom = this.f4674e.getPaddingBottom();
        AtomicInteger atomicInteger2 = d0.a;
        d0.d.k(textView, dimensionPixelSize, paddingTop, i2, paddingBottom);
    }

    public final void G() {
        int visibility = this.B.getVisibility();
        boolean z = (this.A == null || this.K0) ? false : true;
        this.B.setVisibility(z ? 0 : 8);
        if (visibility != this.B.getVisibility()) {
            getEndIconDelegate().c(z);
        }
        x();
    }

    public void H() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.F == null || this.J == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.f4674e) != null && editText2.hasFocus());
        boolean z3 = isHovered() || ((editText = this.f4674e) != null && editText.isHovered());
        if (!isEnabled()) {
            this.O = this.J0;
        } else if (this.f4678i.e()) {
            if (this.E0 != null) {
                E(z2, z3);
            } else {
                this.O = this.f4678i.g();
            }
        } else if (!this.f4681l || (textView = this.f4682m) == null) {
            if (z2) {
                this.O = this.D0;
            } else if (z3) {
                this.O = this.C0;
            } else {
                this.O = this.B0;
            }
        } else if (this.E0 != null) {
            E(z2, z3);
        } else {
            this.O = textView.getCurrentTextColor();
        }
        if (getErrorIconDrawable() != null) {
            n nVar = this.f4678i;
            if (nVar.f6715k && nVar.e()) {
                z = true;
            }
        }
        setErrorIconVisible(z);
        r(this.x0, this.y0);
        r(this.b0, this.c0);
        q();
        m endIconDelegate = getEndIconDelegate();
        Objects.requireNonNull(endIconDelegate);
        if (endIconDelegate instanceof h) {
            if (!this.f4678i.e() || getEndIconDrawable() == null) {
                d();
            } else {
                Drawable mutate = c.i.a.q0(getEndIconDrawable()).mutate();
                c.i.a.i0(mutate, this.f4678i.g());
                this.m0.setImageDrawable(mutate);
            }
        }
        int i2 = this.L;
        if (z2 && isEnabled()) {
            this.L = this.N;
        } else {
            this.L = this.M;
        }
        if (this.L != i2 && this.J == 2 && h() && !this.K0) {
            if (h()) {
                ((e.d.b.d.y.g) this.F).y(0.0f, 0.0f, 0.0f, 0.0f);
            }
            o();
        }
        if (this.J == 1) {
            if (!isEnabled()) {
                this.P = this.G0;
            } else if (z3 && !z2) {
                this.P = this.I0;
            } else if (z2) {
                this.P = this.H0;
            } else {
                this.P = this.F0;
            }
        }
        c();
    }

    public void a(f fVar) {
        this.j0.add(fVar);
        if (this.f4674e != null) {
            fVar.a(this);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i2, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.a.addView(view, layoutParams2);
        this.a.setLayoutParams(layoutParams);
        z();
        setEditText((EditText) view);
    }

    public void b(float f2) {
        if (this.L0.f6511c == f2) {
            return;
        }
        if (this.O0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.O0 = valueAnimator;
            valueAnimator.setInterpolator(e.d.b.d.c.a.f6327b);
            this.O0.setDuration(167L);
            this.O0.addUpdateListener(new d());
        }
        this.O0.setFloatValues(this.L0.f6511c, f2);
        this.O0.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r6 = this;
            e.d.b.d.w.g r0 = r6.F
            if (r0 != 0) goto L5
            return
        L5:
            e.d.b.d.w.j r1 = r6.H
            r0.setShapeAppearanceModel(r1)
            int r0 = r6.J
            r1 = 2
            r2 = -1
            r3 = 0
            r4 = 1
            if (r0 != r1) goto L21
            int r0 = r6.L
            if (r0 <= r2) goto L1c
            int r0 = r6.O
            if (r0 == 0) goto L1c
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            if (r0 == 0) goto L21
            r0 = 1
            goto L22
        L21:
            r0 = 0
        L22:
            if (r0 == 0) goto L2e
            e.d.b.d.w.g r0 = r6.F
            int r1 = r6.L
            float r1 = (float) r1
            int r5 = r6.O
            r0.s(r1, r5)
        L2e:
            int r0 = r6.P
            int r1 = r6.J
            if (r1 != r4) goto L45
            r0 = 2130968837(0x7f040105, float:1.7546339E38)
            android.content.Context r1 = r6.getContext()
            int r0 = e.d.b.d.a.A(r1, r0, r3)
            int r1 = r6.P
            int r0 = c.i.e.b.b(r1, r0)
        L45:
            r6.P = r0
            e.d.b.d.w.g r1 = r6.F
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.q(r0)
            int r0 = r6.k0
            r1 = 3
            if (r0 != r1) goto L5e
            android.widget.EditText r0 = r6.f4674e
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            r0.invalidateSelf()
        L5e:
            e.d.b.d.w.g r0 = r6.G
            if (r0 != 0) goto L63
            goto L7a
        L63:
            int r1 = r6.L
            if (r1 <= r2) goto L6c
            int r1 = r6.O
            if (r1 == 0) goto L6c
            r3 = 1
        L6c:
            if (r3 == 0) goto L77
            int r1 = r6.O
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.q(r1)
        L77:
            r6.invalidate()
        L7a:
            r6.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.c():void");
    }

    public final void d() {
        e(this.m0, this.p0, this.o0, this.r0, this.q0);
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i2) {
        EditText editText = this.f4674e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
            return;
        }
        if (this.f4675f != null) {
            boolean z = this.E;
            this.E = false;
            CharSequence hint = editText.getHint();
            this.f4674e.setHint(this.f4675f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i2);
                return;
            } finally {
                this.f4674e.setHint(hint);
                this.E = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i2);
        onProvideAutofillVirtualStructure(viewStructure, i2);
        viewStructure.setChildCount(this.a.getChildCount());
        for (int i3 = 0; i3 < this.a.getChildCount(); i3++) {
            View childAt = this.a.getChildAt(i3);
            ViewStructure newChild = viewStructure.newChild(i3);
            childAt.dispatchProvideAutofillStructure(newChild, i2);
            if (childAt == this.f4674e) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.Q0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.Q0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.C) {
            e.d.b.d.r.c cVar = this.L0;
            Objects.requireNonNull(cVar);
            int save = canvas.save();
            if (cVar.y != null && cVar.f6510b) {
                cVar.O.getLineLeft(0);
                cVar.F.setTextSize(cVar.C);
                float f2 = cVar.r;
                float f3 = cVar.s;
                float f4 = cVar.B;
                if (f4 != 1.0f) {
                    canvas.scale(f4, f4, f2, f3);
                }
                canvas.translate(f2, f3);
                cVar.O.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        e.d.b.d.w.g gVar = this.G;
        if (gVar != null) {
            Rect bounds = gVar.getBounds();
            bounds.top = bounds.bottom - this.L;
            this.G.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        boolean z2;
        if (this.P0) {
            return;
        }
        boolean z3 = true;
        this.P0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        e.d.b.d.r.c cVar = this.L0;
        if (cVar != null) {
            cVar.D = drawableState;
            ColorStateList colorStateList2 = cVar.f6521m;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = cVar.f6520l) != null && colorStateList.isStateful())) {
                cVar.j();
                z2 = true;
            } else {
                z2 = false;
            }
            z = z2 | false;
        } else {
            z = false;
        }
        if (this.f4674e != null) {
            AtomicInteger atomicInteger = d0.a;
            A((d0.f.c(this) && isEnabled()) ? false : false, false);
        }
        y();
        H();
        if (z) {
            invalidate();
        }
        this.P0 = false;
    }

    public final void e(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = c.i.a.q0(drawable).mutate();
            if (z) {
                c.i.a.j0(drawable, colorStateList);
            }
            if (z2) {
                c.i.a.k0(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public final void f() {
        e(this.b0, this.d0, this.c0, this.f0, this.e0);
    }

    public final int g() {
        float e2;
        if (this.C) {
            int i2 = this.J;
            if (i2 == 0 || i2 == 1) {
                e2 = this.L0.e();
            } else if (i2 != 2) {
                return 0;
            } else {
                e2 = this.L0.e() / 2.0f;
            }
            return (int) e2;
        }
        return 0;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f4674e;
        if (editText != null) {
            return g() + getPaddingTop() + editText.getBaseline();
        }
        return super.getBaseline();
    }

    public e.d.b.d.w.g getBoxBackground() {
        int i2 = this.J;
        if (i2 == 1 || i2 == 2) {
            return this.F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.P;
    }

    public int getBoxBackgroundMode() {
        return this.J;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.K;
    }

    public float getBoxCornerRadiusBottomEnd() {
        e.d.b.d.w.g gVar = this.F;
        return gVar.f6591c.a.f6622h.a(gVar.i());
    }

    public float getBoxCornerRadiusBottomStart() {
        e.d.b.d.w.g gVar = this.F;
        return gVar.f6591c.a.f6621g.a(gVar.i());
    }

    public float getBoxCornerRadiusTopEnd() {
        e.d.b.d.w.g gVar = this.F;
        return gVar.f6591c.a.f6620f.a(gVar.i());
    }

    public float getBoxCornerRadiusTopStart() {
        return this.F.m();
    }

    public int getBoxStrokeColor() {
        return this.D0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.E0;
    }

    public int getBoxStrokeWidth() {
        return this.M;
    }

    public int getBoxStrokeWidthFocused() {
        return this.N;
    }

    public int getCounterMaxLength() {
        return this.f4680k;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f4679j && this.f4681l && (textView = this.f4682m) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.w;
    }

    public ColorStateList getCounterTextColor() {
        return this.w;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.z0;
    }

    public EditText getEditText() {
        return this.f4674e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.m0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.m0.getDrawable();
    }

    public int getEndIconMode() {
        return this.k0;
    }

    public CheckableImageButton getEndIconView() {
        return this.m0;
    }

    public CharSequence getError() {
        n nVar = this.f4678i;
        if (nVar.f6715k) {
            return nVar.f6714j;
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f4678i.f6717m;
    }

    public int getErrorCurrentTextColors() {
        return this.f4678i.g();
    }

    public Drawable getErrorIconDrawable() {
        return this.x0.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        return this.f4678i.g();
    }

    public CharSequence getHelperText() {
        n nVar = this.f4678i;
        if (nVar.q) {
            return nVar.p;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        TextView textView = this.f4678i.r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.C) {
            return this.D;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.L0.e();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.L0.f();
    }

    public ColorStateList getHintTextColor() {
        return this.A0;
    }

    public int getMaxWidth() {
        return this.f4677h;
    }

    public int getMinWidth() {
        return this.f4676g;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.m0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.m0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.q) {
            return this.p;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.t;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.s;
    }

    public CharSequence getPrefixText() {
        return this.y;
    }

    public ColorStateList getPrefixTextColor() {
        return this.z.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.z;
    }

    public CharSequence getStartIconContentDescription() {
        return this.b0.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.b0.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.A;
    }

    public ColorStateList getSuffixTextColor() {
        return this.B.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.B;
    }

    public Typeface getTypeface() {
        return this.a0;
    }

    public final boolean h() {
        return this.C && !TextUtils.isEmpty(this.D) && (this.F instanceof e.d.b.d.y.g);
    }

    public final int i(int i2, boolean z) {
        int compoundPaddingLeft = this.f4674e.getCompoundPaddingLeft() + i2;
        return (this.y == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - this.z.getMeasuredWidth()) + this.z.getPaddingLeft();
    }

    public final int j(int i2, boolean z) {
        int compoundPaddingRight = i2 - this.f4674e.getCompoundPaddingRight();
        return (this.y == null || !z) ? compoundPaddingRight : compoundPaddingRight + (this.z.getMeasuredWidth() - this.z.getPaddingRight());
    }

    public final boolean k() {
        return this.k0 != 0;
    }

    public final void l() {
        TextView textView = this.r;
        if (textView == null || !this.q) {
            return;
        }
        textView.setText((CharSequence) null);
        c.z.m.a(this.a, this.v);
        this.r.setVisibility(4);
    }

    public boolean m() {
        return this.f4673d.getVisibility() == 0 && this.m0.getVisibility() == 0;
    }

    public final void n() {
        int i2 = this.J;
        if (i2 == 0) {
            this.F = null;
            this.G = null;
        } else if (i2 == 1) {
            this.F = new e.d.b.d.w.g(this.H);
            this.G = new e.d.b.d.w.g();
        } else if (i2 != 2) {
            throw new IllegalArgumentException(e.a.d.a.a.p(new StringBuilder(), this.J, " is illegal; only @BoxBackgroundMode constants are supported."));
        } else {
            if (!this.C || (this.F instanceof e.d.b.d.y.g)) {
                this.F = new e.d.b.d.w.g(this.H);
            } else {
                this.F = new e.d.b.d.y.g(this.H);
            }
            this.G = null;
        }
        EditText editText = this.f4674e;
        if ((editText == null || this.F == null || editText.getBackground() != null || this.J == 0) ? false : true) {
            EditText editText2 = this.f4674e;
            e.d.b.d.w.g gVar = this.F;
            AtomicInteger atomicInteger = d0.a;
            d0.c.q(editText2, gVar);
        }
        H();
        if (this.J == 1) {
            if (e.d.b.d.a.M(getContext())) {
                this.K = getResources().getDimensionPixelSize(R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (e.d.b.d.a.L(getContext())) {
                this.K = getResources().getDimensionPixelSize(R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f4674e != null && this.J == 1) {
            if (e.d.b.d.a.M(getContext())) {
                EditText editText3 = this.f4674e;
                AtomicInteger atomicInteger2 = d0.a;
                d0.d.k(editText3, d0.d.f(editText3), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_top), d0.d.e(this.f4674e), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (e.d.b.d.a.L(getContext())) {
                EditText editText4 = this.f4674e;
                AtomicInteger atomicInteger3 = d0.a;
                d0.d.k(editText4, d0.d.f(editText4), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_top), d0.d.e(this.f4674e), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.J != 0) {
            z();
        }
    }

    public final void o() {
        float f2;
        float f3;
        float f4;
        float f5;
        int i2;
        int i3;
        if (h()) {
            RectF rectF = this.W;
            e.d.b.d.r.c cVar = this.L0;
            int width = this.f4674e.getWidth();
            int gravity = this.f4674e.getGravity();
            boolean b2 = cVar.b(cVar.x);
            cVar.z = b2;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    Rect rect = cVar.f6514f;
                    if (b2) {
                        i3 = rect.left;
                        f4 = i3;
                    } else {
                        f2 = rect.right;
                        f3 = cVar.P;
                    }
                } else {
                    Rect rect2 = cVar.f6514f;
                    if (b2) {
                        f2 = rect2.right;
                        f3 = cVar.P;
                    } else {
                        i3 = rect2.left;
                        f4 = i3;
                    }
                }
                rectF.left = f4;
                Rect rect3 = cVar.f6514f;
                float f6 = rect3.top;
                rectF.top = f6;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f5 = (width / 2.0f) + (cVar.P / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (b2) {
                        f5 = cVar.P + f4;
                    } else {
                        i2 = rect3.right;
                        f5 = i2;
                    }
                } else if (b2) {
                    i2 = rect3.right;
                    f5 = i2;
                } else {
                    f5 = cVar.P + f4;
                }
                rectF.right = f5;
                rectF.bottom = cVar.e() + f6;
                float f7 = rectF.left;
                float f8 = this.I;
                rectF.left = f7 - f8;
                rectF.right += f8;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.L);
                e.d.b.d.y.g gVar = (e.d.b.d.y.g) this.F;
                Objects.requireNonNull(gVar);
                gVar.y(rectF.left, rectF.top, rectF.right, rectF.bottom);
            }
            f2 = width / 2.0f;
            f3 = cVar.P / 2.0f;
            f4 = f2 - f3;
            rectF.left = f4;
            Rect rect32 = cVar.f6514f;
            float f62 = rect32.top;
            rectF.top = f62;
            if (gravity != 17) {
            }
            f5 = (width / 2.0f) + (cVar.P / 2.0f);
            rectF.right = f5;
            rectF.bottom = cVar.e() + f62;
            float f72 = rectF.left;
            float f82 = this.I;
            rectF.left = f72 - f82;
            rectF.right += f82;
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.L);
            e.d.b.d.y.g gVar2 = (e.d.b.d.y.g) this.F;
            Objects.requireNonNull(gVar2);
            gVar2.y(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        EditText editText = this.f4674e;
        if (editText != null) {
            Rect rect = this.U;
            e.d.b.d.r.d.a(this, editText, rect);
            e.d.b.d.w.g gVar = this.G;
            if (gVar != null) {
                int i6 = rect.bottom;
                gVar.setBounds(rect.left, i6 - this.N, rect.right, i6);
            }
            if (this.C) {
                e.d.b.d.r.c cVar = this.L0;
                float textSize = this.f4674e.getTextSize();
                if (cVar.f6518j != textSize) {
                    cVar.f6518j = textSize;
                    cVar.j();
                }
                int gravity = this.f4674e.getGravity();
                this.L0.m((gravity & (-113)) | 48);
                e.d.b.d.r.c cVar2 = this.L0;
                if (cVar2.f6516h != gravity) {
                    cVar2.f6516h = gravity;
                    cVar2.j();
                }
                e.d.b.d.r.c cVar3 = this.L0;
                if (this.f4674e == null) {
                    throw new IllegalStateException();
                }
                Rect rect2 = this.V;
                AtomicInteger atomicInteger = d0.a;
                boolean z2 = false;
                boolean z3 = d0.d.d(this) == 1;
                rect2.bottom = rect.bottom;
                int i7 = this.J;
                if (i7 == 1) {
                    rect2.left = i(rect.left, z3);
                    rect2.top = rect.top + this.K;
                    rect2.right = j(rect.right, z3);
                } else if (i7 != 2) {
                    rect2.left = i(rect.left, z3);
                    rect2.top = getPaddingTop();
                    rect2.right = j(rect.right, z3);
                } else {
                    rect2.left = this.f4674e.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - g();
                    rect2.right = rect.right - this.f4674e.getPaddingRight();
                }
                Objects.requireNonNull(cVar3);
                int i8 = rect2.left;
                int i9 = rect2.top;
                int i10 = rect2.right;
                int i11 = rect2.bottom;
                if (!e.d.b.d.r.c.k(cVar3.f6514f, i8, i9, i10, i11)) {
                    cVar3.f6514f.set(i8, i9, i10, i11);
                    cVar3.E = true;
                    cVar3.i();
                }
                e.d.b.d.r.c cVar4 = this.L0;
                if (this.f4674e == null) {
                    throw new IllegalStateException();
                }
                Rect rect3 = this.V;
                TextPaint textPaint = cVar4.G;
                textPaint.setTextSize(cVar4.f6518j);
                textPaint.setTypeface(cVar4.u);
                if (Build.VERSION.SDK_INT >= 21) {
                    textPaint.setLetterSpacing(0.0f);
                }
                float f2 = -cVar4.G.ascent();
                rect3.left = this.f4674e.getCompoundPaddingLeft() + rect.left;
                rect3.top = this.J == 1 && this.f4674e.getMinLines() <= 1 ? (int) (rect.centerY() - (f2 / 2.0f)) : rect.top + this.f4674e.getCompoundPaddingTop();
                rect3.right = rect.right - this.f4674e.getCompoundPaddingRight();
                if (this.J == 1 && this.f4674e.getMinLines() <= 1) {
                    z2 = true;
                }
                int compoundPaddingBottom = z2 ? (int) (rect3.top + f2) : rect.bottom - this.f4674e.getCompoundPaddingBottom();
                rect3.bottom = compoundPaddingBottom;
                int i12 = rect3.left;
                int i13 = rect3.top;
                int i14 = rect3.right;
                if (!e.d.b.d.r.c.k(cVar4.f6513e, i12, i13, i14, compoundPaddingBottom)) {
                    cVar4.f6513e.set(i12, i13, i14, compoundPaddingBottom);
                    cVar4.E = true;
                    cVar4.i();
                }
                this.L0.j();
                if (!h() || this.K0) {
                    return;
                }
                o();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        EditText editText;
        int max;
        super.onMeasure(i2, i3);
        boolean z = false;
        if (this.f4674e != null && this.f4674e.getMeasuredHeight() < (max = Math.max(this.f4672c.getMeasuredHeight(), this.f4671b.getMeasuredHeight()))) {
            this.f4674e.setMinimumHeight(max);
            z = true;
        }
        boolean x = x();
        if (z || x) {
            this.f4674e.post(new c());
        }
        if (this.r != null && (editText = this.f4674e) != null) {
            this.r.setGravity(editText.getGravity());
            this.r.setPadding(this.f4674e.getCompoundPaddingLeft(), this.f4674e.getCompoundPaddingTop(), this.f4674e.getCompoundPaddingRight(), this.f4674e.getCompoundPaddingBottom());
        }
        C();
        F();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f369b);
        setError(savedState.f4684c);
        if (savedState.f4685d) {
            this.m0.post(new b());
        }
        setHint(savedState.f4686e);
        setHelperText(savedState.f4687f);
        setPlaceholderText(savedState.f4688g);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f4678i.e()) {
            savedState.f4684c = getError();
        }
        savedState.f4685d = k() && this.m0.isChecked();
        savedState.f4686e = getHint();
        savedState.f4687f = getHelperText();
        savedState.f4688g = getPlaceholderText();
        return savedState;
    }

    public void q() {
        r(this.m0, this.o0);
    }

    public final void r(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
        Drawable mutate = c.i.a.q0(drawable).mutate();
        c.i.a.j0(mutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    public void setBoxBackgroundColor(int i2) {
        if (this.P != i2) {
            this.P = i2;
            this.F0 = i2;
            this.H0 = i2;
            this.I0 = i2;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i2) {
        setBoxBackgroundColor(c.i.d.a.b(getContext(), i2));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.F0 = defaultColor;
        this.P = defaultColor;
        this.G0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.H0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.I0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i2) {
        if (i2 == this.J) {
            return;
        }
        this.J = i2;
        if (this.f4674e != null) {
            n();
        }
    }

    public void setBoxCollapsedPaddingTop(int i2) {
        this.K = i2;
    }

    public void setBoxStrokeColor(int i2) {
        if (this.D0 != i2) {
            this.D0 = i2;
            H();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.B0 = colorStateList.getDefaultColor();
            this.J0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.C0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.D0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.D0 != colorStateList.getDefaultColor()) {
            this.D0 = colorStateList.getDefaultColor();
        }
        H();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.E0 != colorStateList) {
            this.E0 = colorStateList;
            H();
        }
    }

    public void setBoxStrokeWidth(int i2) {
        this.M = i2;
        H();
    }

    public void setBoxStrokeWidthFocused(int i2) {
        this.N = i2;
        H();
    }

    public void setBoxStrokeWidthFocusedResource(int i2) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i2));
    }

    public void setBoxStrokeWidthResource(int i2) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i2));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f4679j != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
                this.f4682m = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_counter);
                Typeface typeface = this.a0;
                if (typeface != null) {
                    this.f4682m.setTypeface(typeface);
                }
                this.f4682m.setMaxLines(1);
                this.f4678i.a(this.f4682m, 2);
                ((ViewGroup.MarginLayoutParams) this.f4682m.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                w();
                u();
            } else {
                this.f4678i.j(this.f4682m, 2);
                this.f4682m = null;
            }
            this.f4679j = z;
        }
    }

    public void setCounterMaxLength(int i2) {
        if (this.f4680k != i2) {
            if (i2 > 0) {
                this.f4680k = i2;
            } else {
                this.f4680k = -1;
            }
            if (this.f4679j) {
                u();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i2) {
        if (this.f4683n != i2) {
            this.f4683n = i2;
            w();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.x != colorStateList) {
            this.x = colorStateList;
            w();
        }
    }

    public void setCounterTextAppearance(int i2) {
        if (this.o != i2) {
            this.o = i2;
            w();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.w != colorStateList) {
            this.w = colorStateList;
            w();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.z0 = colorStateList;
        this.A0 = colorStateList;
        if (this.f4674e != null) {
            A(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        p(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.m0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.m0.setCheckable(z);
    }

    public void setEndIconContentDescription(int i2) {
        setEndIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.m0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i2) {
        setEndIconDrawable(i2 != 0 ? c.b.d.a.a.b(getContext(), i2) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.m0.setImageDrawable(drawable);
        if (drawable != null) {
            d();
            q();
        }
    }

    public void setEndIconMode(int i2) {
        int i3 = this.k0;
        this.k0 = i2;
        Iterator<g> it = this.n0.iterator();
        while (it.hasNext()) {
            it.next().a(this, i3);
        }
        setEndIconVisible(i2 != 0);
        if (getEndIconDelegate().b(this.J)) {
            getEndIconDelegate().a();
            d();
            return;
        }
        StringBuilder y = e.a.d.a.a.y("The current box background mode ");
        y.append(this.J);
        y.append(" is not supported by the end icon mode ");
        y.append(i2);
        throw new IllegalStateException(y.toString());
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.m0;
        View.OnLongClickListener onLongClickListener = this.v0;
        checkableImageButton.setOnClickListener(onClickListener);
        s(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.v0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.m0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        s(checkableImageButton, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.o0 != colorStateList) {
            this.o0 = colorStateList;
            this.p0 = true;
            d();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.q0 != mode) {
            this.q0 = mode;
            this.r0 = true;
            d();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (m() != z) {
            this.m0.setVisibility(z ? 0 : 8);
            F();
            x();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f4678i.f6715k) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f4678i.i();
            return;
        }
        n nVar = this.f4678i;
        nVar.c();
        nVar.f6714j = charSequence;
        nVar.f6716l.setText(charSequence);
        int i2 = nVar.f6712h;
        if (i2 != 1) {
            nVar.f6713i = 1;
        }
        nVar.l(i2, nVar.f6713i, nVar.k(nVar.f6716l, charSequence));
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        n nVar = this.f4678i;
        nVar.f6717m = charSequence;
        TextView textView = nVar.f6716l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        n nVar = this.f4678i;
        if (nVar.f6715k == z) {
            return;
        }
        nVar.c();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(nVar.a, null);
            nVar.f6716l = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_error);
            nVar.f6716l.setTextAlignment(5);
            Typeface typeface = nVar.u;
            if (typeface != null) {
                nVar.f6716l.setTypeface(typeface);
            }
            int i2 = nVar.f6718n;
            nVar.f6718n = i2;
            TextView textView = nVar.f6716l;
            if (textView != null) {
                nVar.f6706b.t(textView, i2);
            }
            ColorStateList colorStateList = nVar.o;
            nVar.o = colorStateList;
            TextView textView2 = nVar.f6716l;
            if (textView2 != null && colorStateList != null) {
                textView2.setTextColor(colorStateList);
            }
            CharSequence charSequence = nVar.f6717m;
            nVar.f6717m = charSequence;
            TextView textView3 = nVar.f6716l;
            if (textView3 != null) {
                textView3.setContentDescription(charSequence);
            }
            nVar.f6716l.setVisibility(4);
            TextView textView4 = nVar.f6716l;
            AtomicInteger atomicInteger = d0.a;
            d0.f.f(textView4, 1);
            nVar.a(nVar.f6716l, 0);
        } else {
            nVar.i();
            nVar.j(nVar.f6716l, 0);
            nVar.f6716l = null;
            nVar.f6706b.y();
            nVar.f6706b.H();
        }
        nVar.f6715k = z;
    }

    public void setErrorIconDrawable(int i2) {
        setErrorIconDrawable(i2 != 0 ? c.b.d.a.a.b(getContext(), i2) : null);
        r(this.x0, this.y0);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.x0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f4678i.f6715k);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.x0;
        View.OnLongClickListener onLongClickListener = this.w0;
        checkableImageButton.setOnClickListener(onClickListener);
        s(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.w0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.x0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        s(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.y0 = colorStateList;
        Drawable drawable = this.x0.getDrawable();
        if (drawable != null) {
            drawable = c.i.a.q0(drawable).mutate();
            c.i.a.j0(drawable, colorStateList);
        }
        if (this.x0.getDrawable() != drawable) {
            this.x0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.x0.getDrawable();
        if (drawable != null) {
            drawable = c.i.a.q0(drawable).mutate();
            c.i.a.k0(drawable, mode);
        }
        if (this.x0.getDrawable() != drawable) {
            this.x0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i2) {
        n nVar = this.f4678i;
        nVar.f6718n = i2;
        TextView textView = nVar.f6716l;
        if (textView != null) {
            nVar.f6706b.t(textView, i2);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        n nVar = this.f4678i;
        nVar.o = colorStateList;
        TextView textView = nVar.f6716l;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.M0 != z) {
            this.M0 = z;
            A(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (this.f4678i.q) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!this.f4678i.q) {
            setHelperTextEnabled(true);
        }
        n nVar = this.f4678i;
        nVar.c();
        nVar.p = charSequence;
        nVar.r.setText(charSequence);
        int i2 = nVar.f6712h;
        if (i2 != 2) {
            nVar.f6713i = 2;
        }
        nVar.l(i2, nVar.f6713i, nVar.k(nVar.r, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        n nVar = this.f4678i;
        nVar.t = colorStateList;
        TextView textView = nVar.r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        n nVar = this.f4678i;
        if (nVar.q == z) {
            return;
        }
        nVar.c();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(nVar.a, null);
            nVar.r = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_helper_text);
            nVar.r.setTextAlignment(5);
            Typeface typeface = nVar.u;
            if (typeface != null) {
                nVar.r.setTypeface(typeface);
            }
            nVar.r.setVisibility(4);
            TextView textView = nVar.r;
            AtomicInteger atomicInteger = d0.a;
            d0.f.f(textView, 1);
            int i2 = nVar.s;
            nVar.s = i2;
            TextView textView2 = nVar.r;
            if (textView2 != null) {
                c.i.a.h0(textView2, i2);
            }
            ColorStateList colorStateList = nVar.t;
            nVar.t = colorStateList;
            TextView textView3 = nVar.r;
            if (textView3 != null && colorStateList != null) {
                textView3.setTextColor(colorStateList);
            }
            nVar.a(nVar.r, 1);
        } else {
            nVar.c();
            int i3 = nVar.f6712h;
            if (i3 == 2) {
                nVar.f6713i = 0;
            }
            nVar.l(i3, nVar.f6713i, nVar.k(nVar.r, null));
            nVar.j(nVar.r, 1);
            nVar.r = null;
            nVar.f6706b.y();
            nVar.f6706b.H();
        }
        nVar.q = z;
    }

    public void setHelperTextTextAppearance(int i2) {
        n nVar = this.f4678i;
        nVar.s = i2;
        TextView textView = nVar.r;
        if (textView != null) {
            c.i.a.h0(textView, i2);
        }
    }

    public void setHint(int i2) {
        setHint(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setHint(CharSequence charSequence) {
        if (this.C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(ThrowableProxyConverter.BUILDER_CAPACITY);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.N0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.C) {
            this.C = z;
            if (z) {
                CharSequence hint = this.f4674e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.D)) {
                        setHint(hint);
                    }
                    this.f4674e.setHint((CharSequence) null);
                }
                this.E = true;
            } else {
                this.E = false;
                if (!TextUtils.isEmpty(this.D) && TextUtils.isEmpty(this.f4674e.getHint())) {
                    this.f4674e.setHint(this.D);
                }
                setHintInternal(null);
            }
            if (this.f4674e != null) {
                z();
            }
        }
    }

    public void setHintTextAppearance(int i2) {
        e.d.b.d.r.c cVar = this.L0;
        e.d.b.d.t.b bVar = new e.d.b.d.t.b(cVar.a.getContext(), i2);
        ColorStateList colorStateList = bVar.f6567j;
        if (colorStateList != null) {
            cVar.f6521m = colorStateList;
        }
        float f2 = bVar.f6568k;
        if (f2 != 0.0f) {
            cVar.f6519k = f2;
        }
        ColorStateList colorStateList2 = bVar.a;
        if (colorStateList2 != null) {
            cVar.M = colorStateList2;
        }
        cVar.K = bVar.f6562e;
        cVar.L = bVar.f6563f;
        cVar.J = bVar.f6564g;
        cVar.N = bVar.f6566i;
        e.d.b.d.t.a aVar = cVar.w;
        if (aVar != null) {
            aVar.f6558c = true;
        }
        e.d.b.d.r.b bVar2 = new e.d.b.d.r.b(cVar);
        bVar.a();
        cVar.w = new e.d.b.d.t.a(bVar2, bVar.f6571n);
        bVar.c(cVar.a.getContext(), cVar.w);
        cVar.j();
        this.A0 = this.L0.f6521m;
        if (this.f4674e != null) {
            A(false, false);
            z();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.A0 != colorStateList) {
            if (this.z0 == null) {
                e.d.b.d.r.c cVar = this.L0;
                if (cVar.f6521m != colorStateList) {
                    cVar.f6521m = colorStateList;
                    cVar.j();
                }
            }
            this.A0 = colorStateList;
            if (this.f4674e != null) {
                A(false, false);
            }
        }
    }

    public void setMaxWidth(int i2) {
        this.f4677h = i2;
        EditText editText = this.f4674e;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMaxWidth(i2);
    }

    public void setMaxWidthResource(int i2) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    public void setMinWidth(int i2) {
        this.f4676g = i2;
        EditText editText = this.f4674e;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMinWidth(i2);
    }

    public void setMinWidthResource(int i2) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i2) {
        setPasswordVisibilityToggleContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.m0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i2) {
        setPasswordVisibilityToggleDrawable(i2 != 0 ? c.b.d.a.a.b(getContext(), i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.m0.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.k0 != 1) {
            setEndIconMode(1);
        } else if (z) {
        } else {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.o0 = colorStateList;
        this.p0 = true;
        d();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.q0 = mode;
        this.r0 = true;
        d();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.q && TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.q) {
                setPlaceholderTextEnabled(true);
            }
            this.p = charSequence;
        }
        EditText editText = this.f4674e;
        B(editText != null ? editText.getText().length() : 0);
    }

    public void setPlaceholderTextAppearance(int i2) {
        this.t = i2;
        TextView textView = this.r;
        if (textView != null) {
            c.i.a.h0(textView, i2);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.s != colorStateList) {
            this.s = colorStateList;
            TextView textView = this.r;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.y = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.z.setText(charSequence);
        D();
    }

    public void setPrefixTextAppearance(int i2) {
        c.i.a.h0(this.z, i2);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.z.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.b0.setCheckable(z);
    }

    public void setStartIconContentDescription(int i2) {
        setStartIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.b0.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i2) {
        setStartIconDrawable(i2 != 0 ? c.b.d.a.a.b(getContext(), i2) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.b0.setImageDrawable(drawable);
        if (drawable != null) {
            f();
            setStartIconVisible(true);
            r(this.b0, this.c0);
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        setStartIconContentDescription((CharSequence) null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.b0;
        View.OnLongClickListener onLongClickListener = this.i0;
        checkableImageButton.setOnClickListener(onClickListener);
        s(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.i0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.b0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        s(checkableImageButton, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.c0 != colorStateList) {
            this.c0 = colorStateList;
            this.d0 = true;
            f();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.e0 != mode) {
            this.e0 = mode;
            this.f0 = true;
            f();
        }
    }

    public void setStartIconVisible(boolean z) {
        if ((this.b0.getVisibility() == 0) != z) {
            this.b0.setVisibility(z ? 0 : 8);
            C();
            x();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.A = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.B.setText(charSequence);
        G();
    }

    public void setSuffixTextAppearance(int i2) {
        c.i.a.h0(this.B, i2);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.B.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f4674e;
        if (editText != null) {
            d0.A(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.a0) {
            this.a0 = typeface;
            this.L0.p(typeface);
            n nVar = this.f4678i;
            if (typeface != nVar.u) {
                nVar.u = typeface;
                TextView textView = nVar.f6716l;
                if (textView != null) {
                    textView.setTypeface(typeface);
                }
                TextView textView2 = nVar.r;
                if (textView2 != null) {
                    textView2.setTypeface(typeface);
                }
            }
            TextView textView3 = this.f4682m;
            if (textView3 != null) {
                textView3.setTypeface(typeface);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r3.getTextColors().getDefaultColor() == (-65281)) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t(android.widget.TextView r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            c.i.a.h0(r3, r4)     // Catch: java.lang.Exception -> L1b
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L1b
            r1 = 23
            if (r4 < r1) goto L18
            android.content.res.ColorStateList r4 = r3.getTextColors()     // Catch: java.lang.Exception -> L1b
            int r4 = r4.getDefaultColor()     // Catch: java.lang.Exception -> L1b
            r1 = -65281(0xffffffffffff00ff, float:NaN)
            if (r4 != r1) goto L18
            goto L1c
        L18:
            r4 = 0
            r0 = 0
            goto L1c
        L1b:
        L1c:
            if (r0 == 0) goto L32
            r4 = 2131886519(0x7f1201b7, float:1.940762E38)
            c.i.a.h0(r3, r4)
            android.content.Context r4 = r2.getContext()
            r0 = 2131099773(0x7f06007d, float:1.7811909E38)
            int r4 = c.i.d.a.b(r4, r0)
            r3.setTextColor(r4)
        L32:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.t(android.widget.TextView, int):void");
    }

    public final void u() {
        if (this.f4682m != null) {
            EditText editText = this.f4674e;
            v(editText == null ? 0 : editText.getText().length());
        }
    }

    public void v(int i2) {
        boolean z = this.f4681l;
        int i3 = this.f4680k;
        if (i3 == -1) {
            this.f4682m.setText(String.valueOf(i2));
            this.f4682m.setContentDescription(null);
            this.f4681l = false;
        } else {
            this.f4681l = i2 > i3;
            Context context = getContext();
            this.f4682m.setContentDescription(context.getString(this.f4681l ? R.string.character_counter_overflowed_content_description : R.string.character_counter_content_description, Integer.valueOf(i2), Integer.valueOf(this.f4680k)));
            if (z != this.f4681l) {
                w();
            }
            c.i.i.a c2 = c.i.i.a.c();
            TextView textView = this.f4682m;
            String string = getContext().getString(R.string.character_counter_pattern, Integer.valueOf(i2), Integer.valueOf(this.f4680k));
            textView.setText(string != null ? c2.d(string, c2.f2108h, true).toString() : null);
        }
        if (this.f4674e == null || z == this.f4681l) {
            return;
        }
        A(false, false);
        H();
        y();
    }

    public final void w() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f4682m;
        if (textView != null) {
            t(textView, this.f4681l ? this.f4683n : this.o);
            if (!this.f4681l && (colorStateList2 = this.w) != null) {
                this.f4682m.setTextColor(colorStateList2);
            }
            if (!this.f4681l || (colorStateList = this.x) == null) {
                return;
            }
            this.f4682m.setTextColor(colorStateList);
        }
    }

    public final boolean x() {
        boolean z;
        if (this.f4674e == null) {
            return false;
        }
        boolean z2 = true;
        if (!(getStartIconDrawable() == null && this.y == null) && this.f4671b.getMeasuredWidth() > 0) {
            int measuredWidth = this.f4671b.getMeasuredWidth() - this.f4674e.getPaddingLeft();
            if (this.g0 == null || this.h0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.g0 = colorDrawable;
                this.h0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] compoundDrawablesRelative = this.f4674e.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative[0];
            Drawable drawable2 = this.g0;
            if (drawable != drawable2) {
                this.f4674e.setCompoundDrawablesRelative(drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.g0 != null) {
                Drawable[] compoundDrawablesRelative2 = this.f4674e.getCompoundDrawablesRelative();
                this.f4674e.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.g0 = null;
                z = true;
            }
            z = false;
        }
        if ((this.x0.getVisibility() == 0 || ((k() && m()) || this.A != null)) && this.f4672c.getMeasuredWidth() > 0) {
            int measuredWidth2 = this.B.getMeasuredWidth() - this.f4674e.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = ((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams()).getMarginStart() + endIconToUpdateDummyDrawable.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative3 = this.f4674e.getCompoundDrawablesRelative();
            Drawable drawable3 = this.s0;
            if (drawable3 == null || this.t0 == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.s0 = colorDrawable2;
                    this.t0 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = compoundDrawablesRelative3[2];
                Drawable drawable5 = this.s0;
                if (drawable4 != drawable5) {
                    this.u0 = compoundDrawablesRelative3[2];
                    this.f4674e.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable5, compoundDrawablesRelative3[3]);
                } else {
                    z2 = z;
                }
            } else {
                this.t0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                this.f4674e.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.s0, compoundDrawablesRelative3[3]);
            }
        } else if (this.s0 == null) {
            return z;
        } else {
            Drawable[] compoundDrawablesRelative4 = this.f4674e.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.s0) {
                this.f4674e.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.u0, compoundDrawablesRelative4[3]);
            } else {
                z2 = z;
            }
            this.s0 = null;
        }
        return z2;
    }

    public void y() {
        Drawable background;
        TextView textView;
        EditText editText = this.f4674e;
        if (editText == null || this.J != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (e0.a(background)) {
            background = background.mutate();
        }
        if (this.f4678i.e()) {
            background.setColorFilter(c.b.i.j.c(this.f4678i.g(), PorterDuff.Mode.SRC_IN));
        } else if (this.f4681l && (textView = this.f4682m) != null) {
            background.setColorFilter(c.b.i.j.c(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            c.i.a.l(background);
            this.f4674e.refreshDrawableState();
        }
    }

    public final void z() {
        if (this.J != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.a.getLayoutParams();
            int g2 = g();
            if (g2 != layoutParams.topMargin) {
                layoutParams.topMargin = g2;
                this.a.requestLayout();
            }
        }
    }
}

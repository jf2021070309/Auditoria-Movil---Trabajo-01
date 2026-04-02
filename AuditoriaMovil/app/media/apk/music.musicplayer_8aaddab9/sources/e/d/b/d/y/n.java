package e.d.b.d.y;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import c.i.k.d0;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public final class n {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final TextInputLayout f6706b;

    /* renamed from: c  reason: collision with root package name */
    public LinearLayout f6707c;

    /* renamed from: d  reason: collision with root package name */
    public int f6708d;

    /* renamed from: e  reason: collision with root package name */
    public FrameLayout f6709e;

    /* renamed from: f  reason: collision with root package name */
    public Animator f6710f;

    /* renamed from: g  reason: collision with root package name */
    public final float f6711g;

    /* renamed from: h  reason: collision with root package name */
    public int f6712h;

    /* renamed from: i  reason: collision with root package name */
    public int f6713i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f6714j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f6715k;

    /* renamed from: l  reason: collision with root package name */
    public TextView f6716l;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f6717m;

    /* renamed from: n  reason: collision with root package name */
    public int f6718n;
    public ColorStateList o;
    public CharSequence p;
    public boolean q;
    public TextView r;
    public int s;
    public ColorStateList t;
    public Typeface u;

    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ int a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ TextView f6719b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f6720c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ TextView f6721d;

        public a(int i2, TextView textView, int i3, TextView textView2) {
            this.a = i2;
            this.f6719b = textView;
            this.f6720c = i3;
            this.f6721d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            TextView textView;
            n nVar = n.this;
            nVar.f6712h = this.a;
            nVar.f6710f = null;
            TextView textView2 = this.f6719b;
            if (textView2 != null) {
                textView2.setVisibility(4);
                if (this.f6720c == 1 && (textView = n.this.f6716l) != null) {
                    textView.setText((CharSequence) null);
                }
            }
            TextView textView3 = this.f6721d;
            if (textView3 != null) {
                textView3.setTranslationY(0.0f);
                this.f6721d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f6721d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public n(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.a = context;
        this.f6706b = textInputLayout;
        this.f6711g = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
    }

    public void a(TextView textView, int i2) {
        if (this.f6707c == null && this.f6709e == null) {
            LinearLayout linearLayout = new LinearLayout(this.a);
            this.f6707c = linearLayout;
            linearLayout.setOrientation(0);
            this.f6706b.addView(this.f6707c, -1, -2);
            this.f6709e = new FrameLayout(this.a);
            this.f6707c.addView(this.f6709e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f6706b.getEditText() != null) {
                b();
            }
        }
        if (i2 == 0 || i2 == 1) {
            this.f6709e.setVisibility(0);
            this.f6709e.addView(textView);
        } else {
            this.f6707c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f6707c.setVisibility(0);
        this.f6708d++;
    }

    public void b() {
        if ((this.f6707c == null || this.f6706b.getEditText() == null) ? false : true) {
            EditText editText = this.f6706b.getEditText();
            boolean L = e.d.b.d.a.L(this.a);
            LinearLayout linearLayout = this.f6707c;
            AtomicInteger atomicInteger = d0.a;
            d0.d.k(linearLayout, h(L, R.dimen.material_helper_text_font_1_3_padding_horizontal, d0.d.f(editText)), h(L, R.dimen.material_helper_text_font_1_3_padding_top, this.a.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top)), h(L, R.dimen.material_helper_text_font_1_3_padding_horizontal, d0.d.e(editText)), 0);
        }
    }

    public void c() {
        Animator animator = this.f6710f;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d(List<Animator> list, boolean z, TextView textView, int i2, int i3, int i4) {
        if (textView == null || !z) {
            return;
        }
        if (i2 == i4 || i2 == i3) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, i4 == i2 ? 1.0f : 0.0f);
            ofFloat.setDuration(167L);
            ofFloat.setInterpolator(e.d.b.d.c.a.a);
            list.add(ofFloat);
            if (i4 == i2) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.f6711g, 0.0f);
                ofFloat2.setDuration(217L);
                ofFloat2.setInterpolator(e.d.b.d.c.a.f6329d);
                list.add(ofFloat2);
            }
        }
    }

    public boolean e() {
        return (this.f6713i != 1 || this.f6716l == null || TextUtils.isEmpty(this.f6714j)) ? false : true;
    }

    public final TextView f(int i2) {
        if (i2 != 1) {
            if (i2 != 2) {
                return null;
            }
            return this.r;
        }
        return this.f6716l;
    }

    public int g() {
        TextView textView = this.f6716l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public final int h(boolean z, int i2, int i3) {
        return z ? this.a.getResources().getDimensionPixelSize(i2) : i3;
    }

    public void i() {
        this.f6714j = null;
        c();
        if (this.f6712h == 1) {
            if (!this.q || TextUtils.isEmpty(this.p)) {
                this.f6713i = 0;
            } else {
                this.f6713i = 2;
            }
        }
        l(this.f6712h, this.f6713i, k(this.f6716l, null));
    }

    public void j(TextView textView, int i2) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f6707c;
        if (linearLayout == null) {
            return;
        }
        if (!(i2 == 0 || i2 == 1) || (frameLayout = this.f6709e) == null) {
            linearLayout.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i3 = this.f6708d - 1;
        this.f6708d = i3;
        LinearLayout linearLayout2 = this.f6707c;
        if (i3 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean k(TextView textView, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f6706b;
        AtomicInteger atomicInteger = d0.a;
        return d0.f.c(textInputLayout) && this.f6706b.isEnabled() && !(this.f6713i == this.f6712h && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    public final void l(int i2, int i3, boolean z) {
        TextView f2;
        TextView f3;
        if (i2 == i3) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f6710f = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.q, this.r, 2, i2, i3);
            d(arrayList, this.f6715k, this.f6716l, 1, i2, i3);
            e.d.b.d.a.V(animatorSet, arrayList);
            animatorSet.addListener(new a(i3, f(i2), i2, f(i3)));
            animatorSet.start();
        } else if (i2 != i3) {
            if (i3 != 0 && (f3 = f(i3)) != null) {
                f3.setVisibility(0);
                f3.setAlpha(1.0f);
            }
            if (i2 != 0 && (f2 = f(i2)) != null) {
                f2.setVisibility(4);
                if (i2 == 1) {
                    f2.setText((CharSequence) null);
                }
            }
            this.f6712h = i3;
        }
        this.f6706b.y();
        this.f6706b.A(z, false);
        this.f6706b.H();
    }
}

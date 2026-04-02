package androidx.leanback.widget;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.amazon.aps.iva.e4.t0;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.crunchyroll.crunchyroid.R;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class SearchOrbView extends FrameLayout implements View.OnClickListener {
    public View.OnClickListener b;
    public final View c;
    public final View d;
    public final ImageView e;
    public Drawable f;
    public c g;
    public final float h;
    public final int i;
    public final int j;
    public final float k;
    public final float l;
    public ValueAnimator m;
    public boolean n;
    public boolean o;
    public final ArgbEvaluator p;
    public final a q;
    public ValueAnimator r;
    public final b s;

    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            SearchOrbView.this.setOrbViewColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* loaded from: classes.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            SearchOrbView.this.setSearchOrbZ(valueAnimator.getAnimatedFraction());
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public final int a;
        public final int b;
        public final int c;

        public c(int i, int i2, int i3) {
            this.a = i;
            if (i2 == i) {
                i2 = Color.argb((int) ((Color.alpha(i) * 0.85f) + 38.25f), (int) ((Color.red(i) * 0.85f) + 38.25f), (int) ((Color.green(i) * 0.85f) + 38.25f), (int) ((Color.blue(i) * 0.85f) + 38.25f));
            }
            this.b = i2;
            this.c = i3;
        }
    }

    public SearchOrbView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchOrbViewStyle);
    }

    public final void a(boolean z) {
        float f;
        if (z) {
            f = this.h;
        } else {
            f = 1.0f;
        }
        ViewPropertyAnimator scaleY = this.c.animate().scaleX(f).scaleY(f);
        long j = this.j;
        scaleY.setDuration(j).start();
        if (this.r == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.r = ofFloat;
            ofFloat.addUpdateListener(this.s);
        }
        if (z) {
            this.r.start();
        } else {
            this.r.reverse();
        }
        this.r.setDuration(j);
        this.n = z;
        b();
    }

    public final void b() {
        ValueAnimator valueAnimator = this.m;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.m = null;
        }
        if (this.n && this.o) {
            ValueAnimator ofObject = ValueAnimator.ofObject(this.p, Integer.valueOf(this.g.a), Integer.valueOf(this.g.b), Integer.valueOf(this.g.a));
            this.m = ofObject;
            ofObject.setRepeatCount(-1);
            this.m.setDuration(this.i * 2);
            this.m.addUpdateListener(this.q);
            this.m.start();
        }
    }

    public float getFocusedZoom() {
        return this.h;
    }

    public int getLayoutResourceId() {
        return R.layout.lb_search_orb;
    }

    public int getOrbColor() {
        return this.g.a;
    }

    public c getOrbColors() {
        return this.g;
    }

    public Drawable getOrbIcon() {
        return this.f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.o = true;
        b();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListener = this.b;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.o = false;
        b();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        a(z);
    }

    public void setOnOrbClickedListener(View.OnClickListener onClickListener) {
        this.b = onClickListener;
    }

    public void setOrbColor(int i) {
        setOrbColors(new c(i, i, 0));
    }

    public void setOrbColors(c cVar) {
        this.g = cVar;
        this.e.setColorFilter(cVar.c);
        if (this.m == null) {
            setOrbViewColor(this.g.a);
            return;
        }
        this.n = true;
        b();
    }

    public void setOrbIcon(Drawable drawable) {
        this.f = drawable;
        this.e.setImageDrawable(drawable);
    }

    public void setOrbViewColor(int i) {
        View view = this.d;
        if (view.getBackground() instanceof GradientDrawable) {
            ((GradientDrawable) view.getBackground()).setColor(i);
        }
    }

    public void setSearchOrbZ(float f) {
        float f2 = this.l;
        float f3 = this.k;
        float a2 = t0.a(f2, f3, f, f3);
        WeakHashMap<View, r0> weakHashMap = g0.a;
        g0.i.x(this.d, a2);
    }

    public SearchOrbView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.p = new ArgbEvaluator();
        this.q = new a();
        this.s = new b();
        Resources resources = context.getResources();
        View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(getLayoutResourceId(), (ViewGroup) this, true);
        this.c = inflate;
        this.d = inflate.findViewById(R.id.search_orb);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.icon);
        this.e = imageView;
        this.h = context.getResources().getFraction(R.fraction.lb_search_orb_focused_zoom, 1, 1);
        this.i = context.getResources().getInteger(R.integer.lb_search_orb_pulse_duration_ms);
        this.j = context.getResources().getInteger(R.integer.lb_search_orb_scale_duration_ms);
        float dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.lb_search_orb_focused_z);
        this.l = dimensionPixelSize;
        this.k = context.getResources().getDimensionPixelSize(R.dimen.lb_search_orb_unfocused_z);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.amazon.aps.iva.d5.a.g, i, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(2);
        setOrbIcon(drawable == null ? resources.getDrawable(R.drawable.lb_ic_in_app_search) : drawable);
        int color = obtainStyledAttributes.getColor(1, resources.getColor(R.color.lb_default_search_color));
        setOrbColors(new c(color, obtainStyledAttributes.getColor(0, color), obtainStyledAttributes.getColor(3, 0)));
        obtainStyledAttributes.recycle();
        setFocusable(true);
        setClipChildren(false);
        setOnClickListener(this);
        setSoundEffectsEnabled(false);
        setSearchOrbZ(0.0f);
        WeakHashMap<View, r0> weakHashMap = g0.a;
        g0.i.x(imageView, dimensionPixelSize);
    }
}

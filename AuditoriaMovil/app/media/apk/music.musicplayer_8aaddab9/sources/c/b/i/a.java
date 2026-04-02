package c.b.i;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import ch.qos.logback.classic.Level;
import music.musicplayer.R;
/* loaded from: classes.dex */
public abstract class a extends ViewGroup {
    public final C0020a a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f1061b;

    /* renamed from: c  reason: collision with root package name */
    public ActionMenuView f1062c;

    /* renamed from: d  reason: collision with root package name */
    public c f1063d;

    /* renamed from: e  reason: collision with root package name */
    public int f1064e;

    /* renamed from: f  reason: collision with root package name */
    public c.i.k.f0 f1065f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1066g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1067h;

    /* renamed from: c.b.i.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0020a implements c.i.k.g0 {
        public boolean a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f1068b;

        public C0020a() {
        }

        @Override // c.i.k.g0
        public void a(View view) {
            this.a = true;
        }

        @Override // c.i.k.g0
        public void b(View view) {
            if (this.a) {
                return;
            }
            a aVar = a.this;
            aVar.f1065f = null;
            a.super.setVisibility(this.f1068b);
        }

        @Override // c.i.k.g0
        public void c(View view) {
            a.super.setVisibility(0);
            this.a = false;
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.a = new C0020a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f1061b = context;
        } else {
            this.f1061b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public int c(View view, int i2, int i3, int i4) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Level.ALL_INT), i3);
        return Math.max(0, (i2 - view.getMeasuredWidth()) - i4);
    }

    public int d(View view, int i2, int i3, int i4, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = ((i4 - measuredHeight) / 2) + i3;
        if (z) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
        } else {
            view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public c.i.k.f0 e(int i2, long j2) {
        c.i.k.f0 f0Var = this.f1065f;
        if (f0Var != null) {
            f0Var.b();
        }
        if (i2 != 0) {
            c.i.k.f0 b2 = c.i.k.d0.b(this);
            b2.a(0.0f);
            b2.c(j2);
            C0020a c0020a = this.a;
            a.this.f1065f = b2;
            c0020a.f1068b = i2;
            View view = b2.a.get();
            if (view != null) {
                b2.e(view, c0020a);
            }
            return b2;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        c.i.k.f0 b3 = c.i.k.d0.b(this);
        b3.a(1.0f);
        b3.c(j2);
        C0020a c0020a2 = this.a;
        a.this.f1065f = b3;
        c0020a2.f1068b = i2;
        View view2 = b3.a.get();
        if (view2 != null) {
            b3.e(view2, c0020a2);
        }
        return b3;
    }

    public int getAnimatedVisibility() {
        return this.f1065f != null ? this.a.f1068b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1064e;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, c.b.b.a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.f1063d;
        if (cVar != null) {
            Configuration configuration2 = cVar.f962b.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            cVar.p = (configuration2.smallestScreenWidthDp > 600 || i2 > 600 || (i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960)) ? 5 : (i2 >= 500 || (i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640)) ? 4 : i2 >= 360 ? 3 : 2;
            c.b.h.i.g gVar = cVar.f963c;
            if (gVar != null) {
                gVar.q(true);
            }
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1067h = false;
        }
        if (!this.f1067h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1067h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1067h = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1066g = false;
        }
        if (!this.f1066g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1066g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1066g = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i2);

    @Override // android.view.View
    public void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            c.i.k.f0 f0Var = this.f1065f;
            if (f0Var != null) {
                f0Var.b();
            }
            super.setVisibility(i2);
        }
    }
}

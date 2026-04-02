package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import c.b.b;
import c.b.h.i.g;
import c.b.h.i.n;
import c.b.i.c;
import c.b.i.g1;
import c.i.k.d0;
import ch.qos.logback.classic.Level;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class ActionBarContextView extends c.b.i.a {

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f172i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f173j;

    /* renamed from: k  reason: collision with root package name */
    public View f174k;

    /* renamed from: l  reason: collision with root package name */
    public View f175l;

    /* renamed from: m  reason: collision with root package name */
    public View f176m;

    /* renamed from: n  reason: collision with root package name */
    public LinearLayout f177n;
    public TextView o;
    public TextView p;
    public int q;
    public int r;
    public boolean s;
    public int t;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ c.b.h.a a;

        public a(ActionBarContextView actionBarContextView, c.b.h.a aVar) {
            this.a = aVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.a.c();
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f773d, R.attr.actionModeStyle, 0);
        Drawable drawable = (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : c.b.d.a.a.b(context, resourceId);
        AtomicInteger atomicInteger = d0.a;
        d0.c.q(this, drawable);
        this.q = obtainStyledAttributes.getResourceId(5, 0);
        this.r = obtainStyledAttributes.getResourceId(4, 0);
        this.f1064e = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.t = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public void f(c.b.h.a aVar) {
        View view = this.f174k;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.t, (ViewGroup) this, false);
            this.f174k = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f174k);
        }
        View findViewById = this.f174k.findViewById(R.id.action_mode_close_button);
        this.f175l = findViewById;
        findViewById.setOnClickListener(new a(this, aVar));
        g gVar = (g) aVar.e();
        c cVar = this.f1063d;
        if (cVar != null) {
            cVar.a();
        }
        c cVar2 = new c(getContext());
        this.f1063d = cVar2;
        cVar2.f1090l = true;
        cVar2.f1091m = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        gVar.b(this.f1063d, this.f1061b);
        c cVar3 = this.f1063d;
        n nVar = cVar3.f968h;
        if (nVar == null) {
            n nVar2 = (n) cVar3.f964d.inflate(cVar3.f966f, (ViewGroup) this, false);
            cVar3.f968h = nVar2;
            nVar2.b(cVar3.f963c);
            cVar3.c(true);
        }
        n nVar3 = cVar3.f968h;
        if (nVar != nVar3) {
            ((ActionMenuView) nVar3).setPresenter(cVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) nVar3;
        this.f1062c = actionMenuView;
        AtomicInteger atomicInteger = d0.a;
        d0.c.q(actionMenuView, null);
        addView(this.f1062c, layoutParams);
    }

    public final void g() {
        if (this.f177n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f177n = linearLayout;
            this.o = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.p = (TextView) this.f177n.findViewById(R.id.action_bar_subtitle);
            if (this.q != 0) {
                this.o.setTextAppearance(getContext(), this.q);
            }
            if (this.r != 0) {
                this.p.setTextAppearance(getContext(), this.r);
            }
        }
        this.o.setText(this.f172i);
        this.p.setText(this.f173j);
        boolean z = !TextUtils.isEmpty(this.f172i);
        boolean z2 = !TextUtils.isEmpty(this.f173j);
        int i2 = 0;
        this.p.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f177n;
        if (!z && !z2) {
            i2 = 8;
        }
        linearLayout2.setVisibility(i2);
        if (this.f177n.getParent() == null) {
            addView(this.f177n);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // c.b.i.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // c.b.i.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f173j;
    }

    public CharSequence getTitle() {
        return this.f172i;
    }

    public void h() {
        removeAllViews();
        this.f176m = null;
        this.f1062c = null;
        this.f1063d = null;
        View view = this.f175l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f1063d;
        if (cVar != null) {
            cVar.k();
            this.f1063d.l();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(getClass().getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.f172i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean a2 = g1.a(this);
        int paddingRight = a2 ? (i4 - i2) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        View view = this.f174k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f174k.getLayoutParams();
            int i6 = a2 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = a2 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i8 = a2 ? paddingRight - i6 : paddingRight + i6;
            int d2 = i8 + d(this.f174k, i8, paddingTop, paddingTop2, a2);
            paddingRight = a2 ? d2 - i7 : d2 + i7;
        }
        int i9 = paddingRight;
        LinearLayout linearLayout = this.f177n;
        if (linearLayout != null && this.f176m == null && linearLayout.getVisibility() != 8) {
            i9 += d(this.f177n, i9, paddingTop, paddingTop2, a2);
        }
        int i10 = i9;
        View view2 = this.f176m;
        if (view2 != null) {
            d(view2, i10, paddingTop, paddingTop2, a2);
        }
        int paddingLeft = a2 ? getPaddingLeft() : (i4 - i2) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1062c;
        if (actionMenuView != null) {
            d(actionMenuView, paddingLeft, paddingTop, paddingTop2, !a2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i3) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        } else {
            int size = View.MeasureSpec.getSize(i2);
            int i4 = this.f1064e;
            if (i4 <= 0) {
                i4 = View.MeasureSpec.getSize(i3);
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i4 - paddingBottom;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, Level.ALL_INT);
            View view = this.f174k;
            if (view != null) {
                int c2 = c(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f174k.getLayoutParams();
                paddingLeft = c2 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f1062c;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = c(this.f1062c, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f177n;
            if (linearLayout != null && this.f176m == null) {
                if (this.s) {
                    this.f177n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f177n.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f177n.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f176m;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i6 = layoutParams.width;
                int i7 = i6 != -2 ? 1073741824 : Level.ALL_INT;
                if (i6 >= 0) {
                    paddingLeft = Math.min(i6, paddingLeft);
                }
                int i8 = layoutParams.height;
                int i9 = i8 == -2 ? Level.ALL_INT : 1073741824;
                if (i8 >= 0) {
                    i5 = Math.min(i8, i5);
                }
                this.f176m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), View.MeasureSpec.makeMeasureSpec(i5, i9));
            }
            if (this.f1064e > 0) {
                setMeasuredDimension(size, i4);
                return;
            }
            int childCount = getChildCount();
            int i10 = 0;
            for (int i11 = 0; i11 < childCount; i11++) {
                int measuredHeight = getChildAt(i11).getMeasuredHeight() + paddingBottom;
                if (measuredHeight > i10) {
                    i10 = measuredHeight;
                }
            }
            setMeasuredDimension(size, i10);
        }
    }

    @Override // c.b.i.a
    public void setContentHeight(int i2) {
        this.f1064e = i2;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f176m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f176m = view;
        if (view != null && (linearLayout = this.f177n) != null) {
            removeView(linearLayout);
            this.f177n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f173j = charSequence;
        g();
    }

    public void setTitle(CharSequence charSequence) {
        this.f172i = charSequence;
        g();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.s) {
            requestLayout();
        }
        this.s = z;
    }

    @Override // c.b.i.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i2) {
        super.setVisibility(i2);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}

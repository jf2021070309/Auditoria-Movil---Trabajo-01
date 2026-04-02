package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.a;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.amazon.aps.iva.q.m1;
import com.crunchyroll.crunchyroid.R;
import com.google.common.primitives.Ints;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class ActionBarContextView extends com.amazon.aps.iva.q.a {
    public CharSequence j;
    public CharSequence k;
    public View l;
    public View m;
    public View n;
    public LinearLayout o;
    public TextView p;
    public TextView q;
    public final int r;
    public final int s;
    public boolean t;
    public final int u;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ com.amazon.aps.iva.o.a b;

        public a(com.amazon.aps.iva.o.a aVar) {
            this.b = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.b.a();
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        Drawable drawable;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.amazon.aps.iva.j.a.d, R.attr.actionModeStyle, 0);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = com.amazon.aps.iva.l.a.a(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        WeakHashMap<View, r0> weakHashMap = g0.a;
        g0.d.q(this, drawable);
        this.r = obtainStyledAttributes.getResourceId(5, 0);
        this.s = obtainStyledAttributes.getResourceId(4, 0);
        this.f = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.u = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public final void f(com.amazon.aps.iva.o.a aVar) {
        View view = this.l;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.u, (ViewGroup) this, false);
            this.l = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.l);
        }
        View findViewById = this.l.findViewById(R.id.action_mode_close_button);
        this.m = findViewById;
        findViewById.setOnClickListener(new a(aVar));
        f c = aVar.c();
        androidx.appcompat.widget.a aVar2 = this.e;
        if (aVar2 != null) {
            aVar2.b();
            a.C0007a c0007a = aVar2.v;
            if (c0007a != null && c0007a.b()) {
                c0007a.j.dismiss();
            }
        }
        androidx.appcompat.widget.a aVar3 = new androidx.appcompat.widget.a(getContext());
        this.e = aVar3;
        aVar3.n = true;
        aVar3.o = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c.addMenuPresenter(this.e, this.c);
        androidx.appcompat.widget.a aVar4 = this.e;
        k kVar = aVar4.i;
        if (kVar == null) {
            k kVar2 = (k) aVar4.e.inflate(aVar4.g, (ViewGroup) this, false);
            aVar4.i = kVar2;
            kVar2.initialize(aVar4.d);
            aVar4.updateMenuView(true);
        }
        k kVar3 = aVar4.i;
        if (kVar != kVar3) {
            ((ActionMenuView) kVar3).setPresenter(aVar4);
        }
        ActionMenuView actionMenuView = (ActionMenuView) kVar3;
        this.d = actionMenuView;
        WeakHashMap<View, r0> weakHashMap = g0.a;
        g0.d.q(actionMenuView, null);
        addView(this.d, layoutParams);
    }

    public final void g() {
        int i;
        if (this.o == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.o = linearLayout;
            this.p = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.q = (TextView) this.o.findViewById(R.id.action_bar_subtitle);
            int i2 = this.r;
            if (i2 != 0) {
                this.p.setTextAppearance(getContext(), i2);
            }
            int i3 = this.s;
            if (i3 != 0) {
                this.q.setTextAppearance(getContext(), i3);
            }
        }
        this.p.setText(this.j);
        this.q.setText(this.k);
        boolean z = !TextUtils.isEmpty(this.j);
        boolean z2 = !TextUtils.isEmpty(this.k);
        TextView textView = this.q;
        int i4 = 0;
        if (z2) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        LinearLayout linearLayout2 = this.o;
        if (!z && !z2) {
            i4 = 8;
        }
        linearLayout2.setVisibility(i4);
        if (this.o.getParent() == null) {
            addView(this.o);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // com.amazon.aps.iva.q.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // com.amazon.aps.iva.q.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.k;
    }

    public CharSequence getTitle() {
        return this.j;
    }

    public final void h() {
        removeAllViews();
        this.n = null;
        this.d = null;
        this.e = null;
        View view = this.m;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.a aVar = this.e;
        if (aVar != null) {
            aVar.b();
            a.C0007a c0007a = this.e.v;
            if (c0007a != null && c0007a.b()) {
                c0007a.j.dismiss();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int paddingRight;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean a2 = m1.a(this);
        if (a2) {
            paddingLeft = (i3 - i) - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.l;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.l.getLayoutParams();
            if (a2) {
                i5 = marginLayoutParams.rightMargin;
            } else {
                i5 = marginLayoutParams.leftMargin;
            }
            if (a2) {
                i6 = marginLayoutParams.leftMargin;
            } else {
                i6 = marginLayoutParams.rightMargin;
            }
            if (a2) {
                i7 = paddingLeft - i5;
            } else {
                i7 = paddingLeft + i5;
            }
            int d = com.amazon.aps.iva.q.a.d(i7, paddingTop, paddingTop2, this.l, a2) + i7;
            if (a2) {
                i8 = d - i6;
            } else {
                i8 = d + i6;
            }
            paddingLeft = i8;
        }
        LinearLayout linearLayout = this.o;
        if (linearLayout != null && this.n == null && linearLayout.getVisibility() != 8) {
            paddingLeft += com.amazon.aps.iva.q.a.d(paddingLeft, paddingTop, paddingTop2, this.o, a2);
        }
        View view2 = this.n;
        if (view2 != null) {
            com.amazon.aps.iva.q.a.d(paddingLeft, paddingTop, paddingTop2, view2, a2);
        }
        if (a2) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = (i3 - i) - getPaddingRight();
        }
        ActionMenuView actionMenuView = this.d;
        if (actionMenuView != null) {
            com.amazon.aps.iva.q.a.d(paddingRight, paddingTop, paddingTop2, actionMenuView, !a2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int mode = View.MeasureSpec.getMode(i);
        int i5 = Ints.MAX_POWER_OF_TWO;
        if (mode == 1073741824) {
            if (View.MeasureSpec.getMode(i2) != 0) {
                int size = View.MeasureSpec.getSize(i);
                int i6 = this.f;
                if (i6 <= 0) {
                    i6 = View.MeasureSpec.getSize(i2);
                }
                int paddingBottom = getPaddingBottom() + getPaddingTop();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                int i7 = i6 - paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
                View view = this.l;
                if (view != null) {
                    int c = com.amazon.aps.iva.q.a.c(view, paddingLeft, makeMeasureSpec);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.l.getLayoutParams();
                    paddingLeft = c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
                }
                ActionMenuView actionMenuView = this.d;
                if (actionMenuView != null && actionMenuView.getParent() == this) {
                    paddingLeft = com.amazon.aps.iva.q.a.c(this.d, paddingLeft, makeMeasureSpec);
                }
                LinearLayout linearLayout = this.o;
                if (linearLayout != null && this.n == null) {
                    if (this.t) {
                        this.o.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                        int measuredWidth = this.o.getMeasuredWidth();
                        if (measuredWidth <= paddingLeft) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            paddingLeft -= measuredWidth;
                        }
                        LinearLayout linearLayout2 = this.o;
                        if (z) {
                            i4 = 0;
                        } else {
                            i4 = 8;
                        }
                        linearLayout2.setVisibility(i4);
                    } else {
                        paddingLeft = com.amazon.aps.iva.q.a.c(linearLayout, paddingLeft, makeMeasureSpec);
                    }
                }
                View view2 = this.n;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    int i8 = layoutParams.width;
                    if (i8 != -2) {
                        i3 = 1073741824;
                    } else {
                        i3 = Integer.MIN_VALUE;
                    }
                    if (i8 >= 0) {
                        paddingLeft = Math.min(i8, paddingLeft);
                    }
                    int i9 = layoutParams.height;
                    if (i9 == -2) {
                        i5 = Integer.MIN_VALUE;
                    }
                    if (i9 >= 0) {
                        i7 = Math.min(i9, i7);
                    }
                    this.n.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i3), View.MeasureSpec.makeMeasureSpec(i7, i5));
                }
                if (this.f <= 0) {
                    int childCount = getChildCount();
                    int i10 = 0;
                    for (int i11 = 0; i11 < childCount; i11++) {
                        int measuredHeight = getChildAt(i11).getMeasuredHeight() + paddingBottom;
                        if (measuredHeight > i10) {
                            i10 = measuredHeight;
                        }
                    }
                    setMeasuredDimension(size, i10);
                    return;
                }
                setMeasuredDimension(size, i6);
                return;
            }
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
    }

    @Override // com.amazon.aps.iva.q.a
    public void setContentHeight(int i) {
        this.f = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.n;
        if (view2 != null) {
            removeView(view2);
        }
        this.n = view;
        if (view != null && (linearLayout = this.o) != null) {
            removeView(linearLayout);
            this.o = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.k = charSequence;
        g();
    }

    public void setTitle(CharSequence charSequence) {
        this.j = charSequence;
        g();
        g0.o(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.t) {
            requestLayout();
        }
        this.t = z;
    }

    @Override // com.amazon.aps.iva.q.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}

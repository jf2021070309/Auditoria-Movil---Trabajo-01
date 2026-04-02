package com.me.game.pm_tools;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
/* loaded from: classes5.dex */
public class t0 extends LinearLayout implements f0<Integer> {
    public View a;
    public f0<Integer> b;
    public boolean c;

    /* loaded from: classes5.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            t0.this.setSelectView(this.a);
        }
    }

    public t0(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
    }

    @Override // com.me.game.pm_tools.f0
    /* renamed from: b */
    public void a(View view, int i, Integer num) {
        f0<Integer> f0Var = this.b;
        if (f0Var != null) {
            f0Var.a(view, i, num);
        }
    }

    public void c() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            childAt.setSelected(false);
            childAt.setOnClickListener(new a(i));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        c();
    }

    public void setHasSplit(boolean z) {
        this.c = z;
    }

    public void setOnItemClickListener(f0<Integer> f0Var) {
        this.b = f0Var;
    }

    public void setSelectView(int i) {
        int i2 = 0;
        while (i2 < getChildCount()) {
            getChildAt(i2).setSelected(i2 == i);
            i2++;
        }
        View childAt = getChildAt(i);
        if (childAt == null || childAt.equals(this.a)) {
            return;
        }
        this.a = childAt;
        a(childAt, i, Integer.valueOf(i));
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
    }

    public t0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

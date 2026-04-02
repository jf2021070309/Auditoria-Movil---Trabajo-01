package com.me.game.pm_tools;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
/* loaded from: classes5.dex */
public class n0 extends LinearLayout implements d0 {
    private TextView a;
    private ImageView b;
    private m c;

    public n0(Context context) {
        super(context);
        setLayoutDirection(3);
        setTextDirection(5);
    }

    @Override // com.me.game.pm_tools.d0
    public void a() {
    }

    public void b(Context context, FrameLayout frameLayout) {
        r0 r0Var = new r0(context);
        this.a = r0Var;
        r0Var.setTextSize(11.0f);
        this.a.setTextColor(-6383153);
        this.a.setGravity(17);
        this.a.setCompoundDrawablePadding(u.f().a(7.0f));
        this.a.setTextAlignment(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        frameLayout.addView(this.a, layoutParams);
    }

    public void c(Context context, FrameLayout frameLayout) {
        int a = u.f().a(32.0f);
        m mVar = new m();
        this.c = mVar;
        mVar.setCallback(this);
        this.c.p(a);
        this.c.q(true);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setImageDrawable(this.c);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a, a);
        layoutParams.gravity = 17;
        frameLayout.addView(this.b, layoutParams);
    }

    public void d() {
        TextView textView = this.a;
        if (textView != null) {
            textView.setVisibility(4);
            this.a.setClickable(false);
        }
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setVisibility(0);
            this.c.q(true);
        }
    }

    public void setLoadingViewClickListener(View.OnClickListener onClickListener) {
        TextView textView = this.a;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        }
    }
}

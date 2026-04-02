package com.me.game.pm_tools;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
/* loaded from: classes5.dex */
public class p0 extends o0 {
    public Drawable i;
    public Drawable j;

    public p0(Context context) {
        super(context);
    }

    private void o(Context context, LinearLayout linearLayout) {
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(80);
        linearLayout2.setBackground(h0.b().a("icon_bg3_bottom.png"));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, u.f().a(160.0f));
        linearLayout2.setPadding(u.f().a(65.0f), 0, u.f().a(65.0f), 0);
        linearLayout.addView(linearLayout2, layoutParams);
        f(context, linearLayout2);
        e(context, linearLayout2, 15, 11, 40);
        k(context, linearLayout2, i0.h, 11, 13);
    }

    private void q(Context context, FrameLayout frameLayout) {
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(h0.b().a("icon_bg3_phone.png"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(u.f().a(160.0f), u.f().a(235.0f));
        layoutParams.gravity = 17;
        frameLayout.addView(imageView, layoutParams);
    }

    private void r(Context context, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(context);
        l(context, linearLayout, true);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        layoutParams.leftMargin = u.f().a(21.0f);
        layoutParams.rightMargin = u.f().a(21.0f);
        layoutParams.bottomMargin = u.f().a(55.0f);
        frameLayout.addView(linearLayout, layoutParams);
    }

    public static p0 s(Context context) {
        return new p0(context);
    }

    @Override // com.me.game.pm_tools.o0
    public void b(Context context, LinearLayout linearLayout) {
        FrameLayout frameLayout = new FrameLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = -u.f().a(5.0f);
        linearLayout.addView(frameLayout, layoutParams);
        q(context, frameLayout);
        r(context, frameLayout);
        o(context, linearLayout);
    }

    @Override // com.me.game.pm_tools.o0
    public void d(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        addView(linearLayout, new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setPadding(0, u.f().a(72.0f), 0, u.f().a(24.0f));
        h(context, linearLayout);
        p(context, linearLayout);
        b(context, linearLayout);
        this.i = h0.b().a("icon_bg3.png");
        this.j = h0.b().a("icon_bg3_text.png");
    }

    @Override // com.me.game.pm_tools.o0
    public void f(Context context, LinearLayout linearLayout) {
        TextView textView = new TextView(context);
        textView.setTextColor(i0.g);
        textView.setTextSize(12.0f);
        textView.setText(l0.c().d().b);
        textView.setGravity(17);
        int a = u.f().a(7.0f);
        textView.setPadding(a, a, a, a);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(u.f().a(4.0f));
        gradientDrawable.setColors(new int[]{-1250305, -1250305});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        textView.setBackground(gradientDrawable);
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(h0.b().a("icon_arrow_bottom.png"));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        linearLayout.addView(imageView, layoutParams);
    }

    @Override // com.me.game.pm_tools.o0
    public void h(Context context, LinearLayout linearLayout) {
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(17);
        linearLayout2.setPadding(u.f().a(20.0f), 0, u.f().a(20.0f), 0);
        linearLayout.addView(linearLayout2);
        i(context, linearLayout2, 63, 12, 24);
        m(context, linearLayout2, 12, -1711276033, 15, 0);
        j(context, linearLayout2, 14, 0);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.i;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.i != null) {
            try {
                this.i.setBounds(0, 0, getWidth(), (getWidth() * this.i.getIntrinsicHeight()) / this.i.getIntrinsicWidth());
            } catch (Exception unused) {
            }
        }
        if (this.j != null) {
            try {
                this.j.setBounds(0, 0, getWidth(), (getWidth() * this.j.getIntrinsicHeight()) / this.j.getIntrinsicWidth());
            } catch (Exception unused2) {
            }
        }
    }

    public void p(Context context, LinearLayout linearLayout) {
        linearLayout.addView(new View(context), new LinearLayout.LayoutParams(0, 0, 1.0f));
    }
}

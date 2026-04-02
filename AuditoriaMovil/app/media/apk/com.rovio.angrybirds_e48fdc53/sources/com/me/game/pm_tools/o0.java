package com.me.game.pm_tools;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
/* loaded from: classes5.dex */
public class o0 extends FrameLayout {
    public static final String d = "icon_youtube.png";
    public static final String e = "icon_tiktok.png";
    public static final String f = "icon_telegram.png";
    public static final String g = "icon_discord.png";
    public static final String h = "icon_twitter.png";
    public f0<String> a;
    public View.OnClickListener b;
    public View.OnClickListener c;

    /* loaded from: classes5.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            View.OnClickListener onClickListener = o0.this.c;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* loaded from: classes5.dex */
    public class b implements f0<Integer> {
        public final /* synthetic */ String[] a;

        public b(String[] strArr) {
            this.a = strArr;
        }

        @Override // com.me.game.pm_tools.f0
        /* renamed from: b */
        public void a(View view, int i, Integer num) {
            f0<String> f0Var = o0.this.a;
            if (f0Var != null) {
                f0Var.a(view, i, this.a[i / 2]);
            }
        }
    }

    /* loaded from: classes5.dex */
    public class c extends RectShape {
        public final /* synthetic */ RectF a;
        public final /* synthetic */ boolean b;

        public c(RectF rectF, boolean z) {
            this.a = rectF;
            this.b = z;
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            this.a.set(rect());
            int a = u.f().a(1.0f);
            RectF rectF = this.a;
            float f = a;
            rectF.left = f;
            rectF.top = f;
            rectF.right -= f;
            rectF.bottom -= f;
            if (this.b) {
                paint.setColor(-1);
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
            } else {
                paint.setColor(-1776412);
                paint.setStyle(Paint.Style.STROKE);
            }
            paint.setStrokeWidth(u.f().a(1.0f));
            RectF rectF2 = this.a;
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, this.a.height() / 2.0f, paint);
        }
    }

    /* loaded from: classes5.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            View.OnClickListener onClickListener = o0.this.b;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    public o0(Context context) {
        super(context);
        setBackground(new l(-1).d(u.f().a(13.0f)));
        d(context);
        setWillNotDraw(false);
    }

    public static o0 n(Context context) {
        return new o0(context);
    }

    public LinearLayout a(Context context, LinearLayout linearLayout, int i) {
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        int a2 = u.f().a(i);
        int a3 = u.f().a(20.0f);
        linearLayout2.setPadding(a3, a2, a3, 0);
        linearLayout2.setBackgroundColor(-1);
        linearLayout.addView(linearLayout2);
        return linearLayout2;
    }

    public void b(Context context, LinearLayout linearLayout) {
        LinearLayout a2 = a(context, linearLayout, 11);
        m(context, a2, 11, -8224116, 0, 10);
        l(context, a2, false);
        e(context, a2, 14, 12, 35);
        k(context, a2, -14540234, 10, 10);
    }

    public void c(Context context) {
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(h0.b().a("icon_close.png"));
        int a2 = u.f().a(10.0f);
        imageView.setPadding(a2, a2, a2, a2);
        imageView.setOnClickListener(new a());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(u.f().a(34.0f), u.f().a(34.0f));
        layoutParams.gravity = 8388613;
        addView(imageView, layoutParams);
    }

    public void d(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        addView(linearLayout, new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, 0, 0, u.f().a(11.0f));
        h(context, linearLayout);
        b(context, linearLayout);
        c(context);
    }

    public void e(Context context, LinearLayout linearLayout, int i, int i2, int i3) {
        s0 s0Var = new s0(context);
        s0Var.setTextSize(i);
        s0Var.setCircle(true);
        s0Var.setTextColor(-1);
        s0Var.setGravity(17);
        s0Var.setTextAlignment(1);
        s0Var.setColorStateList(i0.l);
        if (com.me.game.pm_tools.b.d.c()) {
            s0Var.setText("OK");
        } else {
            s0Var.setText(l0.c().d().e);
        }
        s0Var.setOnClickListener(new d());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, u.f().a(i3));
        layoutParams.topMargin = u.f().a(i2);
        linearLayout.addView(s0Var, layoutParams);
    }

    public void f(Context context, LinearLayout linearLayout) {
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(h0.b().a("icon_arrow_top.png"));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = u.f().a(5.0f);
        layoutParams.setMarginStart(u.f().a(50.0f));
        linearLayout.addView(imageView, layoutParams);
        TextView textView = new TextView(context);
        textView.setTextColor(-16713985);
        textView.setTextSize(12.0f);
        textView.setText(l0.c().d().b);
        textView.setGravity(17);
        int a2 = u.f().a(12.0f);
        textView.setPadding(a2, a2, a2, a2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(u.f().a(8.0f));
        gradientDrawable.setColors(new int[]{-12702498, -12702498});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        textView.setBackground(gradientDrawable);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = u.f().a(22.0f);
        layoutParams2.rightMargin = u.f().a(22.0f);
        layoutParams2.bottomMargin = u.f().a(12.0f);
        linearLayout.addView(textView, layoutParams2);
    }

    public void g(Context context, LinearLayout linearLayout, int i, int i2, int i3) {
        TextView textView = new TextView(context);
        textView.setTextColor(i);
        textView.setTextSize(10.0f);
        textView.setText(l0.c().d().c);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = u.f().a(i2);
        linearLayout.addView(textView, layoutParams);
        t0 t0Var = new t0(context);
        int a2 = u.f().a(i3);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(u.f().a(130.0f), a2);
        layoutParams2.topMargin = u.f().a(10.0f);
        layoutParams2.gravity = 3;
        linearLayout.addView(t0Var, layoutParams2);
        String[] strArr = {"icon_youtube.png", "icon_tiktok.png", "icon_telegram.png", "icon_discord.png"};
        t0Var.setOnItemClickListener(new b(strArr));
        for (int i4 = 0; i4 < 4; i4++) {
            String str = strArr[i4];
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(h0.b().a(str));
            t0Var.addView(imageView, new LinearLayout.LayoutParams(a2, a2));
            if (i4 < 3) {
                t0Var.addView(new ImageView(context), new LinearLayout.LayoutParams(0, 0, 1.0f));
            }
        }
        t0Var.c();
    }

    public void h(Context context, LinearLayout linearLayout) {
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(0, u.f().a(18.0f), 0, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i0.g);
        gradientDrawable.setCornerRadii(new float[]{u.f().a(13.0f), u.f().a(13.0f), u.f().a(13.0f), u.f().a(13.0f), 0.0f, 0.0f, 0.0f, 0.0f});
        linearLayout2.setBackground(gradientDrawable);
        linearLayout.addView(linearLayout2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setPadding(u.f().a(20.0f), 0, u.f().a(20.0f), 0);
        linearLayout2.addView(linearLayout3);
        i(context, linearLayout3, 49, 12, 18);
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(1);
        linearLayout4.setGravity(17);
        linearLayout4.setPadding(u.f().a(15.0f), 0, 0, 0);
        g(context, linearLayout4, -2130706433, 0, 20);
        linearLayout3.addView(linearLayout4, new LinearLayout.LayoutParams(-1, u.f().a(50.0f)));
        j(context, linearLayout2, 10, 12);
    }

    public void i(Context context, LinearLayout linearLayout, int i, int i2, int i3) {
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setGravity(17);
        linearLayout.addView(linearLayout2, new FrameLayout.LayoutParams(-2, -2));
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(h0.b().a("icon_logo.png"));
        float f2 = i;
        imageView.setMinimumWidth(u.f().a(f2));
        imageView.setMinimumHeight(u.f().a(f2));
        linearLayout2.addView(imageView, new FrameLayout.LayoutParams(imageView.getMinimumWidth(), imageView.getMinimumHeight()));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setPadding(u.f().a(11.0f), 0, 0, 0);
        linearLayout3.setGravity(17);
        linearLayout3.setOrientation(1);
        linearLayout2.addView(linearLayout3);
        TextView textView = new TextView(context);
        textView.setText("Modded By");
        textView.setTextSize(i2);
        textView.setTextColor(-1);
        linearLayout3.addView(textView);
        TextView textView2 = new TextView(context);
        textView2.setText("PlayMods");
        textView2.getPaint().setFakeBoldText(true);
        textView2.setPadding(0, u.f().a(5.0f), 0, 0);
        textView2.setTextSize(i3);
        textView2.setTextColor(-1);
        linearLayout3.addView(textView2);
    }

    public void j(Context context, LinearLayout linearLayout, int i, int i2) {
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = u.f().a(i);
        layoutParams.bottomMargin = u.f().a(i2);
        linearLayout.addView(linearLayout2, layoutParams);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(h0.b().a("icon_flag_left_new.png"));
        linearLayout2.addView(imageView, new LinearLayout.LayoutParams(-2, -2));
        TextView textView = new TextView(context);
        int a2 = u.f().a(8.0f);
        textView.setPadding(a2, 0, a2, 0);
        textView.setTextColor(-1);
        textView.setTextSize(12.0f);
        textView.setText(l0.c().d().a);
        textView.setGravity(17);
        linearLayout2.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(h0.b().a("icon_flag_right_new.png"));
        linearLayout2.addView(imageView2, new LinearLayout.LayoutParams(-2, -2));
    }

    public void k(Context context, LinearLayout linearLayout, int i, int i2, int i3) {
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = u.f().a(i3);
        linearLayout.addView(linearLayout2, layoutParams);
        TextView textView = new TextView(context);
        textView.setText(l0.c().d().f);
        textView.setTextColor(i);
        float f2 = i2;
        textView.setTextSize(f2);
        linearLayout2.addView(textView);
        TextView textView2 = new TextView(context);
        textView2.setText("playmods.net");
        textView2.setTextColor(i0.g);
        textView2.setTextSize(f2);
        linearLayout2.addView(textView2);
    }

    public void l(Context context, LinearLayout linearLayout, boolean z) {
        RectF rectF = new RectF();
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setBackground(new ShapeDrawable(new c(rectF, z)));
        int a2 = u.f().a(6.0f);
        int a3 = u.f().a(10.0f);
        linearLayout2.setGravity(17);
        linearLayout2.setPadding(a2, a3, a3, a3);
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        imageView.setBackgroundDrawable(h0.b().a("icon_google.png"));
        linearLayout2.addView(imageView);
        q0 q0Var = new q0(context);
        q0Var.setTextColor(-14540234);
        q0Var.setTextSize(12.0f);
        int a4 = u.f().a(9.0f);
        q0Var.setPadding(a4, 0, a4, 0);
        q0Var.setSingleLine();
        q0Var.getPaint().setFakeBoldText(true);
        q0Var.setText(l0.c().d().a());
        linearLayout2.addView(q0Var, new LinearLayout.LayoutParams(0, -2, 1.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setBackgroundDrawable(h0.b().a("icon_search.png"));
        linearLayout2.addView(imageView2);
    }

    public void m(Context context, LinearLayout linearLayout, int i, int i2, int i3, int i4) {
        String str = l0.c().d().h;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(i);
        textView.setTextColor(i2);
        textView.setGravity(17);
        textView.setPadding(0, u.f().a(i3), 0, u.f().a(i4));
        linearLayout.addView(textView);
    }

    public void setCloseListener(View.OnClickListener onClickListener) {
        this.c = onClickListener;
    }

    public void setOnDownClickListener(View.OnClickListener onClickListener) {
        this.b = onClickListener;
    }

    public void setOnItemClickListener(f0<String> f0Var) {
        this.a = f0Var;
    }
}

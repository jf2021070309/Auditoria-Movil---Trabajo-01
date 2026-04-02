package com.facebook.ads.internal.view;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.support.v4.graphics.ColorUtils;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import com.facebook.ads.internal.view.component.CircularProgressView;
/* loaded from: classes2.dex */
public class g extends LinearLayout implements com.facebook.ads.internal.view.e.a.b {
    private static final float c = Resources.getSystem().getDisplayMetrics().density;
    private static final int d = (int) (40.0f * c);
    private static final int e = (int) (44.0f * c);
    private static final int f = (int) (10.0f * c);
    private static final int g = (int) (16.0f * c);
    private static final int h = g - f;
    private static final int i = (g * 2) - f;
    private final com.facebook.ads.internal.view.e.b.o a;
    private final com.facebook.ads.internal.view.e.b.c b;
    private final ImageView j;
    private final FrameLayout k;
    private final ImageView l;
    private final CircularProgressView m;
    private final com.facebook.ads.internal.view.c.c n;
    private final PopupMenu o;
    private a p;
    private com.facebook.ads.internal.view.e.b q;
    private int r;
    private boolean s;
    private boolean t;
    private PopupMenu.OnDismissListener u;

    /* loaded from: classes2.dex */
    public interface a {
        void a();
    }

    public g(Context context) {
        super(context);
        this.a = new com.facebook.ads.internal.view.e.b.o() { // from class: com.facebook.ads.internal.view.g.1
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.n nVar) {
                if (g.this.q == null || g.this.r == 0 || !g.this.m.isShown()) {
                    return;
                }
                float currentPosition = g.this.q.getCurrentPosition() / Math.min(g.this.r * 1000.0f, g.this.q.getDuration());
                g.this.m.setProgressWithAnimation(100.0f * currentPosition);
                if (currentPosition >= 1.0f) {
                    g.this.a(true);
                    g.this.q.getEventBus().b(g.this.a, g.this.b);
                }
            }
        };
        this.b = new com.facebook.ads.internal.view.e.b.c() { // from class: com.facebook.ads.internal.view.g.2
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.b bVar) {
                if (g.this.q == null || g.this.r == 0 || !g.this.m.isShown() || g.this.t) {
                    return;
                }
                g.this.a(true);
                g.this.q.getEventBus().b(g.this.a, g.this.b);
            }
        };
        this.r = 0;
        this.s = false;
        this.t = false;
        setGravity(16);
        if (Build.VERSION.SDK_INT >= 14) {
            this.u = new PopupMenu.OnDismissListener() { // from class: com.facebook.ads.internal.view.g.3
                @Override // android.widget.PopupMenu.OnDismissListener
                public void onDismiss(PopupMenu popupMenu) {
                    g.this.s = false;
                }
            };
        }
        this.l = new ImageView(context);
        this.l.setPadding(f, f, f, f);
        this.l.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.l.setImageBitmap(com.facebook.ads.internal.q.b.c.a(com.facebook.ads.internal.q.b.b.INTERSTITIAL_CLOSE));
        this.l.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.internal.view.g.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (g.this.p == null || !g.this.t) {
                    return;
                }
                g.this.p.a();
            }
        });
        this.m = new CircularProgressView(context);
        this.m.setPadding(f, f, f, f);
        this.m.setProgress(0.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(h, h, i, h);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(e, e);
        this.k = new FrameLayout(context);
        this.k.setLayoutTransition(new LayoutTransition());
        this.k.addView(this.l, layoutParams2);
        this.k.addView(this.m, layoutParams2);
        addView(this.k, layoutParams);
        this.n = new com.facebook.ads.internal.view.c.c(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2);
        layoutParams3.gravity = 17;
        layoutParams3.weight = 1.0f;
        addView(this.n, layoutParams3);
        this.j = new ImageView(context);
        this.j.setPadding(f, f, f, f);
        this.j.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.j.setImageBitmap(com.facebook.ads.internal.q.b.c.a(com.facebook.ads.internal.q.b.b.INTERSTITIAL_AD_CHOICES));
        this.j.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.internal.view.g.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                g.this.o.show();
                g.this.s = true;
            }
        });
        this.o = new PopupMenu(context, this.j);
        this.o.getMenu().add("Ad Choices");
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(d, d);
        layoutParams4.setMargins(0, g / 2, g / 2, g / 2);
        addView(this.j, layoutParams4);
    }

    public void a(com.facebook.ads.internal.adapters.j jVar, boolean z) {
        int a2 = jVar.a(z);
        this.n.a(jVar.g(z), a2);
        this.j.setColorFilter(a2);
        this.l.setColorFilter(a2);
        this.m.a(ColorUtils.setAlphaComponent(a2, 77), a2);
        if (!z) {
            com.facebook.ads.internal.q.a.v.a(this, 0);
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-1778384896, 0});
        gradientDrawable.setCornerRadius(0.0f);
        com.facebook.ads.internal.q.a.v.a(this, gradientDrawable);
    }

    @Override // com.facebook.ads.internal.view.e.a.b
    public void a(com.facebook.ads.internal.view.e.b bVar) {
        this.q = bVar;
        this.q.getEventBus().a(this.a, this.b);
    }

    public void a(String str, String str2, String str3, final String str4, final String str5, int i2) {
        this.r = i2;
        this.n.a(str, str2, str3);
        this.o.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: com.facebook.ads.internal.view.g.6
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public boolean onMenuItemClick(MenuItem menuItem) {
                g.this.s = false;
                if (TextUtils.isEmpty(str4)) {
                    return true;
                }
                com.facebook.ads.internal.q.c.g.a(new com.facebook.ads.internal.q.c.g(), g.this.getContext(), Uri.parse(str4), str5);
                return true;
            }
        });
        if (Build.VERSION.SDK_INT >= 14) {
            this.o.setOnDismissListener(this.u);
        }
        a(this.r <= 0);
    }

    public void a(boolean z) {
        this.t = z;
        this.k.setVisibility(0);
        this.m.setVisibility(z ? 4 : 0);
        this.l.setVisibility(z ? 0 : 4);
    }

    public boolean a() {
        return this.t;
    }

    public void b() {
        this.t = false;
        this.k.setVisibility(4);
        this.m.setVisibility(4);
        this.l.setVisibility(4);
    }

    @Override // com.facebook.ads.internal.view.e.a.b
    public void b(com.facebook.ads.internal.view.e.b bVar) {
        if (this.q != null) {
            this.q.getEventBus().b(this.a, this.b);
            this.q = null;
        }
    }

    public void c() {
        this.n.setVisibility(4);
    }

    public void d() {
        if (Build.VERSION.SDK_INT >= 14) {
            this.o.setOnDismissListener(null);
        }
        this.o.dismiss();
        if (Build.VERSION.SDK_INT >= 14) {
            this.o.setOnDismissListener(this.u);
        }
    }

    public void e() {
        if (!this.s || Build.VERSION.SDK_INT < 14) {
            return;
        }
        this.o.show();
    }

    public void setToolbarListener(a aVar) {
        this.p = aVar;
    }
}

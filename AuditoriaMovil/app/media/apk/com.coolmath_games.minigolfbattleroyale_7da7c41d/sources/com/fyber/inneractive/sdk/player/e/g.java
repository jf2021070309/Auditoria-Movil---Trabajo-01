package com.fyber.inneractive.sdk.player.e;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.ui.IAsmoothProgressBar;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.ak;
import com.fyber.inneractive.videokit.R;
/* loaded from: classes.dex */
public abstract class g extends a {
    ak A;
    public int B;
    public int C;
    public Runnable D;
    private boolean E;
    private ak F;
    protected ImageView i;
    protected ViewGroup j;
    protected TextView k;
    protected Button l;
    public TextView m;
    protected TextView n;
    protected View o;
    protected int p;
    protected int q;
    boolean r;
    public ImageView s;
    public ImageView t;
    public IAsmoothProgressBar u;
    protected View v;
    protected View w;
    protected ViewGroup x;
    protected View y;
    ak z;

    public abstract void d();

    static /* synthetic */ Runnable c(g gVar) {
        gVar.D = null;
        return null;
    }

    static /* synthetic */ int d(g gVar) {
        gVar.C = 0;
        return 0;
    }

    public g(Context context) {
        this(context, (byte) 0);
    }

    private g(Context context, byte b) {
        this(context, (char) 0);
    }

    private g(Context context, char c) {
        super(context);
        this.p = -1;
        this.q = -1;
        this.r = false;
        this.E = false;
        this.z = new ak(0, 0);
        this.F = new ak(0, 0);
        IAlog.b("%sctor called", IAlog.a(this));
        LayoutInflater.from(context).inflate(R.layout.ia_video_view, (ViewGroup) this, true);
        setBackgroundColor(getResources().getColor(R.color.ia_video_background_color));
        this.i = (ImageView) findViewById(R.id.ia_iv_last_frame);
        this.j = (ViewGroup) findViewById(R.id.ia_texture_view_host);
        this.s = (ImageView) findViewById(R.id.ia_iv_mute_button);
        this.k = (TextView) findViewById(R.id.ia_tv_call_to_action);
        this.t = (ImageView) findViewById(R.id.ia_iv_expand_collapse_button);
        this.m = (TextView) findViewById(R.id.ia_tv_remaining_time);
        this.u = (IAsmoothProgressBar) findViewById(R.id.ia_video_progressbar);
        this.w = findViewById(R.id.ia_default_endcard_video_overlay);
        this.x = (ViewGroup) findViewById(R.id.ia_endcard_video_overlay);
        this.v = findViewById(R.id.ia_paused_video_overlay);
        this.y = findViewById(R.id.ia_buffering_overlay);
        this.n = (TextView) findViewById(R.id.ia_tv_skip);
        this.l = (Button) findViewById(R.id.ia_b_end_card_call_to_action);
        a(this.s, 1);
        a(this.k, 3);
        a(this.l, 8);
        a(this.t, 5);
        a(this.j, 7);
        a(this.n, 6);
        a(this.v, 9);
        a(findViewById(R.id.ia_default_endcard_video_overlay), -1);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
    }

    public ViewGroup getTextureHost() {
        return this.j;
    }

    public final void a(int i, int i2, boolean z) {
        this.p = i;
        this.q = i2;
        this.r = z;
    }

    public final void a(boolean z) {
        ImageView imageView;
        ImageView imageView2;
        if (this.i != null) {
            ViewGroup viewGroup = this.x;
            int i = 0;
            if (viewGroup != null && viewGroup.getVisibility() == 0) {
                IAlog.b("end card is visible and requested to show last frame image with value of %s", Boolean.valueOf(z));
                imageView2 = this.i;
            } else {
                imageView = this.i;
                if (!z) {
                    imageView2 = imageView;
                }
                imageView.setVisibility(i);
            }
            i = 8;
            imageView = imageView2;
            imageView.setVisibility(i);
        }
    }

    public final void f() {
        ViewGroup viewGroup = this.j;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
    }

    public final void b(boolean z) {
        ImageView imageView = this.s;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 4);
        }
    }

    public void setMuteButtonState(boolean z) {
        this.s.setSelected(z);
    }

    public final void a(boolean z, boolean z2) {
        TextView textView = this.k;
        if (textView != null) {
            textView.setAllCaps(z2);
            this.k.setText(R.string.ia_video_install_now_text);
            this.k.setVisibility(z ? 0 : 4);
        }
    }

    public final void c(boolean z) {
        IAsmoothProgressBar iAsmoothProgressBar = this.u;
        if (iAsmoothProgressBar != null) {
            iAsmoothProgressBar.setVisibility(z ? 0 : 4);
        }
    }

    public final void d(boolean z) {
        TextView textView = this.m;
        if (textView != null) {
            textView.setVisibility(z ? 0 : 4);
        }
    }

    public final void g() {
        ImageView imageView = this.t;
        if (imageView != null) {
            imageView.setVisibility(0);
            this.t.setSelected(true);
        }
    }

    public final void e(boolean z) {
        TextView textView = this.n;
        if (textView != null) {
            textView.setVisibility(z ? 0 : 4);
        }
    }

    public void setSkipText(String str) {
        TextView textView = this.n;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void h() {
        TextView textView = this.n;
        if (textView != null) {
            textView.setEnabled(true);
        }
    }

    public final boolean i() {
        TextView textView = this.n;
        return textView != null && textView.getVisibility() == 0 && this.n.isEnabled();
    }

    public final void f(boolean z) {
        View view = this.v;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public final void a(View view) {
        this.o = view;
        if (view == null || this.x == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            ((ViewGroup) parent).removeView(view);
        }
        this.x.setVisibility(0);
        this.x.addView(view, 0);
        if (view instanceof com.fyber.inneractive.sdk.m.c) {
            return;
        }
        a(view, 4);
    }

    public final void b(boolean z, boolean z2) {
        View view = this.w;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
            this.l.setAllCaps(z2);
            this.l.setText(R.string.ia_video_install_now_text);
            UnitDisplayType h = this.c.g().h();
            if (h.equals(UnitDisplayType.LANDSCAPE) || h.equals(UnitDisplayType.MRECT)) {
                this.l.setBackgroundResource(R.drawable.bg_green_medium);
                this.l.setTextSize(0, getResources().getDimension(R.dimen.ia_video_overlay_text_large));
            } else {
                this.l.setBackgroundResource(R.drawable.bg_green);
                this.l.setTextSize(0, getResources().getDimension(R.dimen.ia_video_overlay_text_large_plus));
            }
            this.l.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Bitmap bitmap) {
        if (bitmap != null) {
            ak akVar = new ak(0, 0);
            a(akVar, bitmap.getWidth(), bitmap.getHeight(), this.z.a, this.z.b);
            ImageView imageView = this.i;
            if (imageView != null) {
                imageView.getLayoutParams().width = akVar.a;
                this.i.getLayoutParams().height = akVar.b;
            }
        }
    }

    public void setLastFrameBitmapBlurred(Bitmap bitmap) {
        if (this.i == null || bitmap == null) {
            return;
        }
        com.fyber.inneractive.sdk.util.b bVar = new com.fyber.inneractive.sdk.util.b();
        bVar.c = 20;
        bVar.d = 1;
        bVar.a = bitmap.getWidth();
        bVar.b = bitmap.getHeight();
        this.i.setImageBitmap(com.fyber.inneractive.sdk.util.a.a(getContext(), bitmap, bVar));
    }

    public final void g(boolean z) {
        View view = this.y;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public int getVideoWidth() {
        return this.p;
    }

    public int getVideoHeight() {
        return this.q;
    }

    public void setRemainingTime(String str) {
        TextView textView = this.m;
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.e.a, com.fyber.inneractive.sdk.player.e.e
    public final void a() {
        super.a();
        IAlog.b("%sdestroyed called", IAlog.a(this));
        Runnable runnable = this.D;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.D = null;
        }
        ViewGroup viewGroup = this.j;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
    }

    private void a(final View view, final int i) {
        if (view != null) {
            final int[] iArr = new int[2];
            final GestureDetector gestureDetector = new GestureDetector(view.getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.fyber.inneractive.sdk.player.e.g.2
                @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                public final boolean onDown(MotionEvent motionEvent) {
                    return true;
                }

                @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                public final boolean onSingleTapUp(MotionEvent motionEvent) {
                    return true;
                }

                @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
                public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 0) {
                        view.getRootView().getLocationOnScreen(iArr);
                        g.this.a.a(motionEvent.getRawX() - iArr[0], motionEvent.getRawY() - iArr[1]);
                    }
                    if (g.this.g != null) {
                        g.this.g.a(i, g.this.a);
                    }
                    return true;
                }
            });
            view.setOnTouchListener(new View.OnTouchListener() { // from class: com.fyber.inneractive.sdk.player.e.g.3
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return gestureDetector.onTouchEvent(motionEvent);
                }
            });
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        a(this.F, size, size2);
        if (this.F.a > 0 && this.F.b > 0) {
            i = View.MeasureSpec.makeMeasureSpec(this.F.a, 1073741824);
            i2 = View.MeasureSpec.makeMeasureSpec(this.F.b, 1073741824);
        } else {
            this.F.a = size;
            this.F.b = size2;
        }
        if (!this.z.equals(this.F)) {
            ak akVar = this.z;
            ak akVar2 = this.F;
            akVar.a = akVar2.a;
            akVar.b = akVar2.b;
            d();
        }
        super.onMeasure(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(ak akVar, int i, int i2, int i3, int i4) {
        if (i > 0 && i2 > 0) {
            float f = i;
            float f2 = i2;
            float f3 = f / f2;
            if (this.d == UnitDisplayType.SQUARE) {
                i3 = (int) (i4 * f3);
            } else {
                if (Math.abs(f3 - 1.7777778f) >= 0.1f) {
                    Math.abs(f3 - 1.3333334f);
                }
                float min = Math.min(i3 / f, 10.0f);
                float f4 = i4;
                float f5 = min * f2;
                if (f4 > f5) {
                    i3 = (int) (min * f);
                    i4 = (int) f5;
                } else {
                    float min2 = Math.min(f4 / f2, 10.0f);
                    i4 = (int) (min2 * f2);
                    i3 = (int) (f * min2);
                }
            }
        }
        akVar.a = i3;
        akVar.b = i4;
    }

    public View getEndCardView() {
        return this.o;
    }

    @Override // com.fyber.inneractive.sdk.player.e.e
    public final boolean e() {
        return this.w.getVisibility() == 0 || this.x.getChildCount() > 0;
    }

    public void setLastFrameBitmap(final Bitmap bitmap) {
        IAlog.b("%ssetLastFrameBitmap - %s", IAlog.a(this), bitmap);
        ImageView imageView = this.i;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
        if (this.z.a == 0 || this.z.b == 0) {
            a(false);
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.fyber.inneractive.sdk.player.e.g.1
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    if (g.this.getWidth() <= 0 || g.this.getHeight() <= 0) {
                        return;
                    }
                    g.this.a(true);
                    g.this.removeOnLayoutChangeListener(this);
                    g.this.a(bitmap);
                }
            });
            return;
        }
        a(bitmap);
    }
}

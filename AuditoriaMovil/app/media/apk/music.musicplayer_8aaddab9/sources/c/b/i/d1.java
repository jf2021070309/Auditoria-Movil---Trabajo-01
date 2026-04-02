package c.b.i;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import c.i.k.d0;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class d1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static d1 a;

    /* renamed from: b  reason: collision with root package name */
    public static d1 f1115b;

    /* renamed from: c  reason: collision with root package name */
    public final View f1116c;

    /* renamed from: d  reason: collision with root package name */
    public final CharSequence f1117d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1118e;

    /* renamed from: f  reason: collision with root package name */
    public final Runnable f1119f = new a();

    /* renamed from: g  reason: collision with root package name */
    public final Runnable f1120g = new b();

    /* renamed from: h  reason: collision with root package name */
    public int f1121h;

    /* renamed from: i  reason: collision with root package name */
    public int f1122i;

    /* renamed from: j  reason: collision with root package name */
    public e1 f1123j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1124k;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d1.this.d(false);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d1.this.b();
        }
    }

    public d1(View view, CharSequence charSequence) {
        this.f1116c = view;
        this.f1117d = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = c.i.k.e0.a;
        this.f1118e = Build.VERSION.SDK_INT >= 28 ? viewConfiguration.getScaledHoverSlop() : viewConfiguration.getScaledTouchSlop() / 2;
        a();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void c(d1 d1Var) {
        d1 d1Var2 = a;
        if (d1Var2 != null) {
            d1Var2.f1116c.removeCallbacks(d1Var2.f1119f);
        }
        a = d1Var;
        if (d1Var != null) {
            d1Var.f1116c.postDelayed(d1Var.f1119f, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        this.f1121h = Integer.MAX_VALUE;
        this.f1122i = Integer.MAX_VALUE;
    }

    public void b() {
        if (f1115b == this) {
            f1115b = null;
            e1 e1Var = this.f1123j;
            if (e1Var != null) {
                e1Var.a();
                this.f1123j = null;
                a();
                this.f1116c.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (a == this) {
            c(null);
        }
        this.f1116c.removeCallbacks(this.f1120g);
    }

    public void d(boolean z) {
        int height;
        int i2;
        long j2;
        int longPressTimeout;
        long j3;
        View view = this.f1116c;
        AtomicInteger atomicInteger = c.i.k.d0.a;
        if (d0.f.b(view)) {
            c(null);
            d1 d1Var = f1115b;
            if (d1Var != null) {
                d1Var.b();
            }
            f1115b = this;
            this.f1124k = z;
            e1 e1Var = new e1(this.f1116c.getContext());
            this.f1123j = e1Var;
            View view2 = this.f1116c;
            int i3 = this.f1121h;
            int i4 = this.f1122i;
            boolean z2 = this.f1124k;
            CharSequence charSequence = this.f1117d;
            if (e1Var.f1133b.getParent() != null) {
                e1Var.a();
            }
            e1Var.f1134c.setText(charSequence);
            WindowManager.LayoutParams layoutParams = e1Var.f1135d;
            layoutParams.token = view2.getApplicationWindowToken();
            int dimensionPixelOffset = e1Var.a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view2.getWidth() < dimensionPixelOffset) {
                i3 = view2.getWidth() / 2;
            }
            if (view2.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = e1Var.a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i4 + dimensionPixelOffset2;
                i2 = i4 - dimensionPixelOffset2;
            } else {
                height = view2.getHeight();
                i2 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = e1Var.a.getResources().getDimensionPixelOffset(z2 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view2.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context = view2.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else if (context instanceof Activity) {
                        rootView = ((Activity) context).getWindow().getDecorView();
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                rootView.getWindowVisibleDisplayFrame(e1Var.f1136e);
                Rect rect = e1Var.f1136e;
                if (rect.left < 0 && rect.top < 0) {
                    Resources resources = e1Var.a.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    e1Var.f1136e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(e1Var.f1138g);
                view2.getLocationOnScreen(e1Var.f1137f);
                int[] iArr = e1Var.f1137f;
                int i5 = iArr[0];
                int[] iArr2 = e1Var.f1138g;
                iArr[0] = i5 - iArr2[0];
                iArr[1] = iArr[1] - iArr2[1];
                layoutParams.x = (iArr[0] + i3) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                e1Var.f1133b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = e1Var.f1133b.getMeasuredHeight();
                int[] iArr3 = e1Var.f1137f;
                int i6 = ((iArr3[1] + i2) - dimensionPixelOffset3) - measuredHeight;
                int i7 = iArr3[1] + height + dimensionPixelOffset3;
                if (z2) {
                    if (i6 >= 0) {
                        layoutParams.y = i6;
                    } else {
                        layoutParams.y = i7;
                    }
                } else if (measuredHeight + i7 <= e1Var.f1136e.height()) {
                    layoutParams.y = i7;
                } else {
                    layoutParams.y = i6;
                }
            }
            ((WindowManager) e1Var.a.getSystemService("window")).addView(e1Var.f1133b, e1Var.f1135d);
            this.f1116c.addOnAttachStateChangeListener(this);
            if (this.f1124k) {
                j3 = 2500;
            } else {
                if ((d0.c.g(this.f1116c) & 1) == 1) {
                    j2 = 3000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                } else {
                    j2 = 15000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                }
                j3 = j2 - longPressTimeout;
            }
            this.f1116c.removeCallbacks(this.f1120g);
            this.f1116c.postDelayed(this.f1120g, j3);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        boolean z;
        if (this.f1123j == null || !this.f1124k) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1116c.getContext().getSystemService("accessibility");
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action != 7) {
                if (action == 10) {
                    a();
                    b();
                }
            } else if (this.f1116c.isEnabled() && this.f1123j == null) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (Math.abs(x - this.f1121h) > this.f1118e || Math.abs(y - this.f1122i) > this.f1118e) {
                    this.f1121h = x;
                    this.f1122i = y;
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    c(this);
                }
            }
            return false;
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f1121h = view.getWidth() / 2;
        this.f1122i = view.getHeight() / 2;
        d(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}

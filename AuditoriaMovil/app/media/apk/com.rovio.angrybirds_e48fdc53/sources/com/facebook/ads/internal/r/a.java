package com.facebook.ads.internal.r;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.facebook.ads.internal.q.a.r;
import com.facebook.ads.internal.q.a.v;
import com.facebook.ads.internal.q.a.w;
import com.facebook.ads.internal.q.a.x;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Vector;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class a {
    private static final String a = a.class.getSimpleName();
    private final View b;
    private final int c;
    private final int d;
    private final Handler e;
    private final WeakReference<AbstractC0116a> f;
    private final boolean g;
    private Runnable h;
    private int i;
    private int j;
    private boolean k;
    private com.facebook.ads.internal.r.b l;
    private Map<String, Integer> m;
    private long n;
    private int o;

    /* renamed from: com.facebook.ads.internal.r.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC0116a {
        public abstract void a();

        public void b() {
        }
    }

    /* loaded from: classes2.dex */
    private static final class b extends w<a> {
        b(a aVar) {
            super(aVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            a a = a();
            if (a == null) {
                return;
            }
            View view = a.b;
            AbstractC0116a abstractC0116a = (AbstractC0116a) a.f.get();
            if (view == null || abstractC0116a == null) {
                return;
            }
            com.facebook.ads.internal.r.b a2 = a.a(view, a.c);
            if (a2.a()) {
                a.d(a);
            } else {
                a.o = 0;
            }
            boolean z = a.o > a.d;
            boolean z2 = a.l != null && a.l.a();
            if (z || !a2.a()) {
                a.l = a2;
            }
            String valueOf = String.valueOf(a2.b());
            synchronized (a) {
                a.m.put(valueOf, Integer.valueOf((a.m.containsKey(valueOf) ? ((Integer) a.m.get(valueOf)).intValue() : 0) + 1));
            }
            if (z && !z2) {
                a.n = System.currentTimeMillis();
                abstractC0116a.a();
                if (!a.g) {
                    return;
                }
            } else if (!z && z2) {
                abstractC0116a.b();
            }
            if (a.k || a.h == null) {
                return;
            }
            a.e.postDelayed(a.h, a.j);
        }
    }

    public a(View view, int i, int i2, boolean z, AbstractC0116a abstractC0116a) {
        this.e = new Handler();
        this.i = 0;
        this.j = 1000;
        this.k = true;
        this.l = new com.facebook.ads.internal.r.b(c.UNKNOWN);
        this.m = new HashMap();
        this.n = 0L;
        this.o = 0;
        this.b = view;
        if (view.getId() == -1) {
            v.a(view);
        }
        this.c = i;
        this.f = new WeakReference<>(abstractC0116a);
        this.g = z;
        this.d = i2 < 0 ? 0 : i2;
    }

    public a(View view, int i, AbstractC0116a abstractC0116a) {
        this(view, i, 0, false, abstractC0116a);
    }

    public a(View view, int i, boolean z, AbstractC0116a abstractC0116a) {
        this(view, i, 0, z, abstractC0116a);
    }

    private static int a(Vector<Rect> vector) {
        int size = vector.size();
        int[] iArr = new int[size * 2];
        int[] iArr2 = new int[size * 2];
        boolean[][] zArr = (boolean[][]) Array.newInstance(Boolean.TYPE, size * 2, size * 2);
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Rect elementAt = vector.elementAt(i3);
            int i4 = i2 + 1;
            iArr[i2] = elementAt.left;
            int i5 = i + 1;
            iArr2[i] = elementAt.bottom;
            i2 = i4 + 1;
            iArr[i4] = elementAt.right;
            i = i5 + 1;
            iArr2[i5] = elementAt.top;
        }
        Arrays.sort(iArr);
        Arrays.sort(iArr2);
        for (int i6 = 0; i6 < size; i6++) {
            Rect elementAt2 = vector.elementAt(i6);
            int a2 = a(iArr, elementAt2.left);
            int a3 = a(iArr, elementAt2.right);
            int a4 = a(iArr2, elementAt2.top);
            int a5 = a(iArr2, elementAt2.bottom);
            for (int i7 = a2 + 1; i7 <= a3; i7++) {
                for (int i8 = a4 + 1; i8 <= a5; i8++) {
                    zArr[i7][i8] = true;
                }
            }
        }
        int i9 = 0;
        int i10 = 0;
        while (i9 < size * 2) {
            int i11 = i10;
            for (int i12 = 0; i12 < size * 2; i12++) {
                i11 += zArr[i9][i12] ? (iArr[i9] - iArr[i9 - 1]) * (iArr2[i12] - iArr2[i12 - 1]) : 0;
            }
            i9++;
            i10 = i11;
        }
        return i10;
    }

    private static int a(int[] iArr, int i) {
        int i2;
        int i3 = 0;
        int length = iArr.length;
        while (i3 < length) {
            int i4 = ((length - i3) / 2) + i3;
            if (iArr[i4] == i) {
                return i4;
            }
            if (iArr[i4] > i) {
                i2 = i3;
            } else {
                int i5 = length;
                i2 = i4 + 1;
                i4 = i5;
            }
            i3 = i2;
            length = i4;
        }
        return -1;
    }

    public static com.facebook.ads.internal.r.b a(View view, int i) {
        DisplayMetrics displayMetrics;
        if (view == null) {
            a(null, false, "adView is null.");
            return new com.facebook.ads.internal.r.b(c.AD_IS_NULL);
        } else if (view.getParent() == null) {
            a(view, false, "adView has no parent.");
            return new com.facebook.ads.internal.r.b(c.INVALID_PARENT);
        } else if (!view.isShown()) {
            a(view, false, "adView parent is not set to VISIBLE.");
            return new com.facebook.ads.internal.r.b(c.INVALID_PARENT);
        } else if (view.getWindowVisibility() != 0) {
            a(view, false, "adView window is not set to VISIBLE.");
            return new com.facebook.ads.internal.r.b(c.INVALID_WINDOW);
        } else if (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
            a(view, false, "adView has invisible dimensions (w=" + view.getMeasuredWidth() + ", h=" + view.getMeasuredHeight());
            return new com.facebook.ads.internal.r.b(c.INVALID_DIMENSIONS);
        } else if (view.getAlpha() < 0.9f) {
            a(view, false, "adView is too transparent.");
            return new com.facebook.ads.internal.r.b(c.AD_IS_TRANSPARENT);
        } else {
            int width = view.getWidth();
            int height = view.getHeight();
            int[] iArr = new int[2];
            try {
                view.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                if (view.getGlobalVisibleRect(rect)) {
                    Context context = view.getContext();
                    if (Build.VERSION.SDK_INT >= 17) {
                        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
                        displayMetrics = new DisplayMetrics();
                        defaultDisplay.getRealMetrics(displayMetrics);
                    } else {
                        displayMetrics = context.getResources().getDisplayMetrics();
                    }
                    float f = 0.0f;
                    if (com.facebook.ads.internal.l.a.p(context)) {
                        Rect rect2 = new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
                        if (rect2.intersect(iArr[0], iArr[1], iArr[0] + width, iArr[1] + height)) {
                            f = ((rect2.width() * rect2.height()) * 1.0f) / (width * height);
                        }
                    } else {
                        Vector<Rect> a2 = a(view);
                        int a3 = a(a2);
                        a2.add(rect);
                        f = ((a(a2) - a3) * 1.0f) / (view.getMeasuredHeight() * view.getMeasuredWidth());
                    }
                    boolean n = com.facebook.ads.internal.l.a.n(context);
                    float o = com.facebook.ads.internal.l.a.o(context) / 100.0f;
                    if (n) {
                        if (f < o) {
                            a(view, false, String.format(Locale.US, "adView visible area is too small [%.2f%% visible, current threshold %.2f%%]", Float.valueOf(f), Float.valueOf(o)));
                            return new com.facebook.ads.internal.r.b(c.AD_INSUFFICIENT_VISIBLE_AREA, f);
                        }
                    } else if (iArr[0] < 0 || displayMetrics.widthPixels - iArr[0] < width) {
                        a(view, false, "adView is not fully on screen horizontally.");
                        return new com.facebook.ads.internal.r.b(c.AD_OFFSCREEN_HORIZONTALLY, f);
                    } else {
                        int i2 = (int) ((height * (100.0d - i)) / 100.0d);
                        if (iArr[1] < 0 && Math.abs(iArr[1]) > i2) {
                            a(view, false, "adView is not visible from the top.");
                            return new com.facebook.ads.internal.r.b(c.AD_OFFSCREEN_TOP, f);
                        } else if ((height + iArr[1]) - displayMetrics.heightPixels > i2) {
                            a(view, false, "adView is not visible from the bottom.");
                            return new com.facebook.ads.internal.r.b(c.AD_OFFSCREEN_BOTTOM, f);
                        }
                    }
                    if (!com.facebook.ads.internal.q.e.a.b(context)) {
                        a(view, false, "Screen is not interactive.");
                        return new com.facebook.ads.internal.r.b(c.SCREEN_NOT_INTERACTIVE, f);
                    }
                    Map<String, String> a4 = com.facebook.ads.internal.q.e.b.a(context);
                    if (x.b(a4)) {
                        a(view, false, "Keyguard is obstructing view.");
                        return new com.facebook.ads.internal.r.b(c.AD_IS_OBSTRUCTED_BY_KEYGUARD, f);
                    } else if (com.facebook.ads.internal.l.a.c(context) && x.a(a4)) {
                        a(view, false, "Ad is on top of the Lockscreen.");
                        return new com.facebook.ads.internal.r.b(c.AD_IN_LOCKSCREEN, f, a4);
                    } else {
                        Float a5 = com.facebook.ads.internal.l.a.q(context) ? d.a(view) : null;
                        if (a5 != null) {
                            if (a5.floatValue() == -1.0f) {
                                a(view, false, "adView is not in the top activity");
                                return new com.facebook.ads.internal.r.b(c.AD_IS_NOT_IN_ACTIVITY);
                            } else if (a5.floatValue() == 0.0f) {
                                a(view, false, "adView is not visible");
                                return new com.facebook.ads.internal.r.b(c.AD_IS_NOT_VISIBLE);
                            }
                        }
                        if (!com.facebook.ads.internal.l.a.r(context) || a5 == null || a5.floatValue() >= o) {
                            a(view, true, "adView is visible.");
                            return new com.facebook.ads.internal.r.b(c.IS_VIEWABLE, f, a4);
                        }
                        a(view, false, String.format(Locale.US, "adView visible area is too small [%.2f%% visible, current threshold %.2f%%]", a5, Float.valueOf(o)));
                        return new com.facebook.ads.internal.r.b(c.AD_INSUFFICIENT_VISIBLE_AREA, f, a4);
                    }
                }
                return new com.facebook.ads.internal.r.b(c.AD_IS_NOT_VISIBLE);
            } catch (NullPointerException e) {
                a(view, false, "Cannot get location on screen.");
                return new com.facebook.ads.internal.r.b(c.INVALID_DIMENSIONS);
            }
        }
    }

    private static Vector<Rect> a(View view) {
        Vector<Rect> vector = new Vector<>();
        if (!(view.getParent() instanceof ViewGroup)) {
            return vector;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int indexOfChild = viewGroup.indexOfChild(view);
        while (true) {
            indexOfChild++;
            if (indexOfChild >= viewGroup.getChildCount()) {
                vector.addAll(a(viewGroup));
                return vector;
            }
            vector.addAll(b(viewGroup.getChildAt(indexOfChild)));
        }
    }

    private static void a(View view, boolean z, String str) {
    }

    private static Vector<Rect> b(View view) {
        Vector<Rect> vector = new Vector<>();
        if (!view.isShown() || (Build.VERSION.SDK_INT >= 11 && view.getAlpha() <= 0.0f)) {
            return vector;
        }
        if (!(view instanceof ViewGroup) || !c(view)) {
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect)) {
                vector.add(rect);
            }
            return vector;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            vector.addAll(b(viewGroup.getChildAt(i)));
        }
        return vector;
    }

    private static boolean c(View view) {
        return view.getBackground() == null || (Build.VERSION.SDK_INT >= 19 && view.getBackground().getAlpha() <= 0);
    }

    static /* synthetic */ int d(a aVar) {
        int i = aVar.o;
        aVar.o = i + 1;
        return i;
    }

    public synchronized void a() {
        if (this.h != null) {
            b();
        }
        this.h = new b(this);
        this.e.postDelayed(this.h, this.i);
        this.k = false;
        this.o = 0;
        this.l = new com.facebook.ads.internal.r.b(c.UNKNOWN);
        this.m = new HashMap();
    }

    public void a(int i) {
        this.i = i;
    }

    public synchronized void a(Map<String, String> map) {
        map.put("vrc", String.valueOf(this.l.b()));
        map.put("vp", String.valueOf(this.l.c()));
        map.put("vh", new JSONObject(this.m).toString());
        map.put("vt", r.a(this.n));
        map.putAll(this.l.d());
    }

    public synchronized void b() {
        this.e.removeCallbacks(this.h);
        this.h = null;
        this.k = true;
        this.o = 0;
    }

    public void b(int i) {
        this.j = i;
    }

    public synchronized String c() {
        return c.values()[this.l.b()].toString() + String.format(" (%.1f%%)", Float.valueOf(this.l.c() * 100.0f));
    }
}

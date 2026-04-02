package c.i.k;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import c.i.k.d0;
import c.i.k.e;
import c.i.k.g;
import c.i.k.j0;
import c.i.k.k0.b;
import ch.qos.logback.classic.pattern.ThrowableProxyConverter;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class d0 {

    /* renamed from: b  reason: collision with root package name */
    public static WeakHashMap<View, String> f2133b;

    /* renamed from: d  reason: collision with root package name */
    public static Field f2135d;

    /* renamed from: f  reason: collision with root package name */
    public static ThreadLocal<Rect> f2137f;
    public static final AtomicInteger a = new AtomicInteger(1);

    /* renamed from: c  reason: collision with root package name */
    public static WeakHashMap<View, f0> f2134c = null;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f2136e = false;

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f2138g = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: h  reason: collision with root package name */
    public static final w f2139h = new w() { // from class: c.i.k.c
        @Override // c.i.k.w
        public final g a(g gVar) {
            AtomicInteger atomicInteger = d0.a;
            return gVar;
        }
    };

    /* loaded from: classes.dex */
    public static abstract class a<T> {
        public final int a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<T> f2140b;

        /* renamed from: c  reason: collision with root package name */
        public final int f2141c;

        /* renamed from: d  reason: collision with root package name */
        public final int f2142d;

        public a(int i2, Class<T> cls, int i3) {
            this.a = i2;
            this.f2140b = cls;
            this.f2142d = 0;
            this.f2141c = i3;
        }

        public a(int i2, Class<T> cls, int i3, int i4) {
            this.a = i2;
            this.f2140b = cls;
            this.f2142d = i3;
            this.f2141c = i4;
        }

        public boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        public abstract T b(View view);

        public abstract void c(View view, T t);

        public T d(View view) {
            if (Build.VERSION.SDK_INT >= this.f2141c) {
                return b(view);
            }
            T t = (T) view.getTag(this.a);
            if (this.f2140b.isInstance(t)) {
                return t;
            }
            return null;
        }

        public void e(View view, T t) {
            if (Build.VERSION.SDK_INT >= this.f2141c) {
                c(view, t);
            } else if (f(d(view), t)) {
                c.i.k.e g2 = d0.g(view);
                if (g2 == null) {
                    g2 = new c.i.k.e();
                }
                d0.A(view, g2);
                view.setTag(this.a, t);
                d0.q(view, this.f2142d);
            }
        }

        public abstract boolean f(T t, T t2);
    }

    /* loaded from: classes.dex */
    public static class b {
        public static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        public static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        public static int c(View view) {
            return view.getImportantForAccessibility();
        }

        public static int d(View view) {
            return view.getMinimumHeight();
        }

        public static int e(View view) {
            return view.getMinimumWidth();
        }

        public static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        public static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        public static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        public static boolean i(View view) {
            return view.hasTransientState();
        }

        public static boolean j(View view, int i2, Bundle bundle) {
            return view.performAccessibilityAction(i2, bundle);
        }

        public static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        public static void l(View view, int i2, int i3, int i4, int i5) {
            view.postInvalidateOnAnimation(i2, i3, i4, i5);
        }

        public static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        public static void n(View view, Runnable runnable, long j2) {
            view.postOnAnimationDelayed(runnable, j2);
        }

        public static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        public static void p(View view) {
            view.requestFitSystemWindows();
        }

        public static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        public static void r(View view, boolean z) {
            view.setHasTransientState(z);
        }

        public static void s(View view, int i2) {
            view.setImportantForAccessibility(i2);
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static int a() {
            return View.generateViewId();
        }

        public static Display b(View view) {
            return view.getDisplay();
        }

        public static int c(View view) {
            return view.getLabelFor();
        }

        public static int d(View view) {
            return view.getLayoutDirection();
        }

        public static int e(View view) {
            return view.getPaddingEnd();
        }

        public static int f(View view) {
            return view.getPaddingStart();
        }

        public static boolean g(View view) {
            return view.isPaddingRelative();
        }

        public static void h(View view, int i2) {
            view.setLabelFor(i2);
        }

        public static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        public static void j(View view, int i2) {
            view.setLayoutDirection(i2);
        }

        public static void k(View view, int i2, int i3, int i4, int i5) {
            view.setPaddingRelative(i2, i3, i4, i5);
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public static Rect a(View view) {
            return view.getClipBounds();
        }

        public static boolean b(View view) {
            return view.isInLayout();
        }

        public static void c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* loaded from: classes.dex */
    public static class f {
        public static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        public static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        public static boolean c(View view) {
            return view.isLaidOut();
        }

        public static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        public static void e(ViewParent viewParent, View view, View view2, int i2) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i2);
        }

        public static void f(View view, int i2) {
            view.setAccessibilityLiveRegion(i2);
        }

        public static void g(AccessibilityEvent accessibilityEvent, int i2) {
            accessibilityEvent.setContentChangeTypes(i2);
        }
    }

    /* loaded from: classes.dex */
    public static class g {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* loaded from: classes.dex */
    public static class h {

        /* loaded from: classes.dex */
        public class a implements View.OnApplyWindowInsetsListener {
            public j0 a = null;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ View f2143b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ u f2144c;

            public a(View view, u uVar) {
                this.f2143b = view;
                this.f2144c = uVar;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                j0 k2 = j0.k(windowInsets, view);
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 30) {
                    h.a(windowInsets, this.f2143b);
                    if (k2.equals(this.a)) {
                        return this.f2144c.a(view, k2).i();
                    }
                }
                this.a = k2;
                j0 a = this.f2144c.a(view, k2);
                if (i2 >= 30) {
                    return a.i();
                }
                d0.y(view);
                return a.i();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static j0 b(View view, j0 j0Var, Rect rect) {
            WindowInsets i2 = j0Var.i();
            if (i2 != null) {
                return j0.k(view.computeSystemWindowInsets(i2, rect), view);
            }
            rect.setEmpty();
            return j0Var;
        }

        public static boolean c(View view, float f2, float f3, boolean z) {
            return view.dispatchNestedFling(f2, f3, z);
        }

        public static boolean d(View view, float f2, float f3) {
            return view.dispatchNestedPreFling(f2, f3);
        }

        public static boolean e(View view, int i2, int i3, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i2, i3, iArr, iArr2);
        }

        public static boolean f(View view, int i2, int i3, int i4, int i5, int[] iArr) {
            return view.dispatchNestedScroll(i2, i3, i4, i5, iArr);
        }

        public static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        public static float i(View view) {
            return view.getElevation();
        }

        public static j0 j(View view) {
            if (j0.a.f2167d && view.isAttachedToWindow()) {
                try {
                    Object obj = j0.a.a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) j0.a.f2165b.get(obj);
                        Rect rect2 = (Rect) j0.a.f2166c.get(obj);
                        if (rect == null || rect2 == null) {
                            return null;
                        }
                        int i2 = Build.VERSION.SDK_INT;
                        j0.e dVar = i2 >= 30 ? new j0.d() : i2 >= 29 ? new j0.c() : i2 >= 20 ? new j0.b() : new j0.e();
                        dVar.c(c.i.e.c.b(rect.left, rect.top, rect.right, rect.bottom));
                        dVar.d(c.i.e.c.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
                        j0 b2 = dVar.b();
                        b2.f2164b.q(b2);
                        b2.f2164b.d(view.getRootView());
                        return b2;
                    }
                    return null;
                } catch (IllegalAccessException e2) {
                    StringBuilder y = e.a.d.a.a.y("Failed to get insets from AttachInfo. ");
                    y.append(e2.getMessage());
                    Log.w("WindowInsetsCompat", y.toString(), e2);
                    return null;
                }
            }
            return null;
        }

        public static String k(View view) {
            return view.getTransitionName();
        }

        public static float l(View view) {
            return view.getTranslationZ();
        }

        public static float m(View view) {
            return view.getZ();
        }

        public static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        public static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        public static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void s(View view, float f2) {
            view.setElevation(f2);
        }

        public static void t(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        public static void u(View view, u uVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, uVar);
            }
            if (uVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, uVar));
            }
        }

        public static void v(View view, String str) {
            view.setTransitionName(str);
        }

        public static void w(View view, float f2) {
            view.setTranslationZ(f2);
        }

        public static void x(View view, float f2) {
            view.setZ(f2);
        }

        public static boolean y(View view, int i2) {
            return view.startNestedScroll(i2);
        }

        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* loaded from: classes.dex */
    public static class i {
        public static j0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            j0 k2 = j0.k(rootWindowInsets, null);
            k2.f2164b.q(k2);
            k2.f2164b.d(view.getRootView());
            return k2;
        }

        public static int b(View view) {
            return view.getScrollIndicators();
        }

        public static void c(View view, int i2) {
            view.setScrollIndicators(i2);
        }

        public static void d(View view, int i2, int i3) {
            view.setScrollIndicators(i2, i3);
        }
    }

    /* loaded from: classes.dex */
    public static class j {
        public static void a(View view, Collection<View> collection, int i2) {
            view.addKeyboardNavigationClusters(collection, i2);
        }

        public static int b(View view) {
            return view.getImportantForAutofill();
        }

        public static int c(View view) {
            return view.getNextClusterForwardId();
        }

        public static boolean d(View view) {
            return view.hasExplicitFocusable();
        }

        public static boolean e(View view) {
            return view.isFocusedByDefault();
        }

        public static boolean f(View view) {
            return view.isImportantForAutofill();
        }

        public static boolean g(View view) {
            return view.isKeyboardNavigationCluster();
        }

        public static View h(View view, View view2, int i2) {
            return view.keyboardNavigationClusterSearch(view2, i2);
        }

        public static boolean i(View view) {
            return view.restoreDefaultFocus();
        }

        public static void j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        public static void k(View view, boolean z) {
            view.setFocusedByDefault(z);
        }

        public static void l(View view, int i2) {
            view.setImportantForAutofill(i2);
        }

        public static void m(View view, boolean z) {
            view.setKeyboardNavigationCluster(z);
        }

        public static void n(View view, int i2) {
            view.setNextClusterForwardId(i2);
        }

        public static void o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* loaded from: classes.dex */
    public static class k {
        public static void a(View view, final p pVar) {
            c.f.h hVar = (c.f.h) view.getTag(R.id.tag_unhandled_key_listeners);
            if (hVar == null) {
                hVar = new c.f.h();
                view.setTag(R.id.tag_unhandled_key_listeners, hVar);
            }
            Objects.requireNonNull(pVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: c.i.k.d
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return d0.p.this.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            hVar.put(pVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void e(View view, p pVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            c.f.h hVar = (c.f.h) view.getTag(R.id.tag_unhandled_key_listeners);
            if (hVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) hVar.getOrDefault(pVar, null)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static <T> T f(View view, int i2) {
            return (T) view.requireViewById(i2);
        }

        public static void g(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    /* loaded from: classes.dex */
    public static class l {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static List<Rect> b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        public static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i2, i3);
        }

        public static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* loaded from: classes.dex */
    public static class m {
        public static CharSequence a(View view) {
            return view.getStateDescription();
        }

        public static void b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* loaded from: classes.dex */
    public static final class n {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static c.i.k.g b(View view, c.i.k.g gVar) {
            ContentInfo c2 = gVar.a.c();
            ContentInfo performReceiveContent = view.performReceiveContent(c2);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == c2 ? gVar : new c.i.k.g(new g.d(performReceiveContent));
        }

        public static void c(View view, String[] strArr, v vVar) {
            if (vVar == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new o(vVar));
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class o implements OnReceiveContentListener {
        public final v a;

        public o(v vVar) {
            this.a = vVar;
        }

        @Override // android.view.OnReceiveContentListener
        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            c.i.k.g gVar = new c.i.k.g(new g.d(contentInfo));
            c.i.k.g a = this.a.a(view, gVar);
            if (a == null) {
                return null;
            }
            return a == gVar ? contentInfo : a.a.c();
        }
    }

    /* loaded from: classes.dex */
    public interface p {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    /* loaded from: classes.dex */
    public static class q {
        public static final ArrayList<WeakReference<View>> a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        public WeakHashMap<View, Boolean> f2145b = null;

        /* renamed from: c  reason: collision with root package name */
        public SparseArray<WeakReference<View>> f2146c = null;

        /* renamed from: d  reason: collision with root package name */
        public WeakReference<KeyEvent> f2147d = null;

        public final View a(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f2145b;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View a2 = a(viewGroup.getChildAt(childCount), keyEvent);
                        if (a2 != null) {
                            return a2;
                        }
                    }
                }
                if (b(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        public final boolean b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((p) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
    }

    static {
        new WeakHashMap();
    }

    public static void A(View view, c.i.k.e eVar) {
        if (eVar == null && (h(view) instanceof e.a)) {
            eVar = new c.i.k.e();
        }
        view.setAccessibilityDelegate(eVar == null ? null : eVar.f2149c);
    }

    public static void B(View view, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            h.s(view, f2);
        }
    }

    public static void C(View view, u uVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            h.u(view, uVar);
        }
    }

    public static void D(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            h.v(view, str);
            return;
        }
        if (f2133b == null) {
            f2133b = new WeakHashMap<>();
        }
        f2133b.put(view, str);
    }

    public static void E(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static void a(View view, b.a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            c.i.k.e g2 = g(view);
            if (g2 == null) {
                g2 = new c.i.k.e();
            }
            A(view, g2);
            w(aVar.a(), view);
            j(view).add(aVar);
            q(view, 0);
        }
    }

    public static f0 b(View view) {
        if (f2134c == null) {
            f2134c = new WeakHashMap<>();
        }
        f0 f0Var = f2134c.get(view);
        if (f0Var == null) {
            f0 f0Var2 = new f0(view);
            f2134c.put(view, f0Var2);
            return f0Var2;
        }
        return f0Var;
    }

    public static void c(View view, int i2) {
        view.offsetLeftAndRight(i2);
        if (view.getVisibility() == 0) {
            float translationY = view.getTranslationY();
            view.setTranslationY(1.0f + translationY);
            view.setTranslationY(translationY);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                E((View) parent);
            }
        }
    }

    public static void d(View view, int i2) {
        view.offsetTopAndBottom(i2);
        if (view.getVisibility() == 0) {
            float translationY = view.getTranslationY();
            view.setTranslationY(1.0f + translationY);
            view.setTranslationY(translationY);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                E((View) parent);
            }
        }
    }

    public static j0 e(View view, j0 j0Var) {
        WindowInsets i2;
        if (Build.VERSION.SDK_INT >= 21 && (i2 = j0Var.i()) != null) {
            WindowInsets a2 = g.a(view, i2);
            if (!a2.equals(i2)) {
                return j0.k(a2, view);
            }
        }
        return j0Var;
    }

    public static boolean f(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = q.a;
        q qVar = (q) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (qVar == null) {
            qVar = new q();
            view.setTag(R.id.tag_unhandled_key_event_manager, qVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = qVar.f2145b;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = q.a;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (qVar.f2145b == null) {
                        qVar.f2145b = new WeakHashMap<>();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList<WeakReference<View>> arrayList3 = q.a;
                        View view2 = arrayList3.get(size).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            qVar.f2145b.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                qVar.f2145b.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View a2 = qVar.a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (qVar.f2146c == null) {
                    qVar.f2146c = new SparseArray<>();
                }
                qVar.f2146c.put(keyCode, new WeakReference<>(a2));
            }
        }
        return a2 != null;
    }

    public static c.i.k.e g(View view) {
        View.AccessibilityDelegate h2 = h(view);
        if (h2 == null) {
            return null;
        }
        return h2 instanceof e.a ? ((e.a) h2).a : new c.i.k.e(h2);
    }

    public static View.AccessibilityDelegate h(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return l.a(view);
        }
        if (f2136e) {
            return null;
        }
        if (f2135d == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f2135d = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f2136e = true;
                return null;
            }
        }
        try {
            Object obj = f2135d.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f2136e = true;
            return null;
        }
    }

    public static CharSequence i(View view) {
        return new a0(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28).d(view);
    }

    public static List<b.a> j(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(R.id.tag_accessibility_actions, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static ColorStateList k(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return h.g(view);
        }
        if (view instanceof y) {
            return ((y) view).getSupportBackgroundTintList();
        }
        return null;
    }

    public static float l(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return h.i(view);
        }
        return 0.0f;
    }

    public static Rect m() {
        if (f2137f == null) {
            f2137f = new ThreadLocal<>();
        }
        Rect rect = f2137f.get();
        if (rect == null) {
            rect = new Rect();
            f2137f.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static String[] n(View view) {
        return Build.VERSION.SDK_INT >= 31 ? n.a(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static j0 o(View view) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            return i.a(view);
        }
        if (i2 >= 21) {
            return h.j(view);
        }
        return null;
    }

    public static String p(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return h.k(view);
        }
        WeakHashMap<View, String> weakHashMap = f2133b;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    public static void q(View view, int i2) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = i(view) != null && view.getVisibility() == 0;
            if (f.a(view) != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : ThrowableProxyConverter.BUILDER_CAPACITY);
                f.g(obtain, i2);
                if (z) {
                    obtain.getText().add(i(view));
                    if (c.c(view) == 0) {
                        c.s(view, 1);
                    }
                    ViewParent parent = view.getParent();
                    while (true) {
                        if (!(parent instanceof View)) {
                            break;
                        } else if (c.c((View) parent) == 4) {
                            c.s(view, 2);
                            break;
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i2 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                f.g(obtain2, i2);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(i(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    f.e(view.getParent(), view, view, i2);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e2);
                }
            }
        }
    }

    public static void r(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            view.offsetLeftAndRight(i2);
        } else if (i3 < 21) {
            c(view, i2);
        } else {
            Rect m2 = m();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                m2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !m2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            c(view, i2);
            if (z && m2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(m2);
            }
        }
    }

    public static void s(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            view.offsetTopAndBottom(i2);
        } else if (i3 < 21) {
            d(view, i2);
        } else {
            Rect m2 = m();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                m2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !m2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            d(view, i2);
            if (z && m2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(m2);
            }
        }
    }

    public static j0 t(View view, j0 j0Var) {
        WindowInsets i2;
        if (Build.VERSION.SDK_INT >= 21 && (i2 = j0Var.i()) != null) {
            WindowInsets b2 = g.b(view, i2);
            if (!b2.equals(i2)) {
                return j0.k(b2, view);
            }
        }
        return j0Var;
    }

    public static c.i.k.g u(View view, c.i.k.g gVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            String str = "performReceiveContent: " + gVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]";
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return n.b(view, gVar);
        }
        v vVar = (v) view.getTag(R.id.tag_on_receive_content_listener);
        if (vVar == null) {
            return (view instanceof w ? (w) view : f2139h).a(gVar);
        }
        c.i.k.g a2 = vVar.a(view, gVar);
        if (a2 == null) {
            return null;
        }
        return (view instanceof w ? (w) view : f2139h).a(a2);
    }

    public static void v(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            w(i2, view);
            q(view, 0);
        }
    }

    public static void w(int i2, View view) {
        List<b.a> j2 = j(view);
        for (int i3 = 0; i3 < j2.size(); i3++) {
            if (j2.get(i3).a() == i2) {
                j2.remove(i3);
                return;
            }
        }
    }

    public static void x(View view, b.a aVar, CharSequence charSequence, c.i.k.k0.d dVar) {
        a(view, new b.a(null, aVar.f2204j, null, dVar, aVar.f2205k));
    }

    public static void y(View view) {
        if (Build.VERSION.SDK_INT >= 20) {
            g.c(view);
        } else {
            c.p(view);
        }
    }

    public static void z(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            l.c(view, context, iArr, attributeSet, typedArray, i2, i3);
        }
    }
}

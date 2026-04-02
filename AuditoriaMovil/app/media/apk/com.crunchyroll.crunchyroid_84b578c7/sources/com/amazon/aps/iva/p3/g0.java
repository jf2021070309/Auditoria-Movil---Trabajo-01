package com.amazon.aps.iva.p3;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
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
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.animation.PathInterpolator;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import com.amazon.aps.iva.p3.a;
import com.amazon.aps.iva.p3.c;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.v0;
import com.amazon.aps.iva.p3.w0;
import com.amazon.aps.iva.q3.l;
import com.crunchyroll.crunchyroid.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ViewCompat.java */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public final class g0 {
    public static WeakHashMap<View, r0> a;
    public static Field b;
    public static boolean c;
    public static final int[] d;
    public static final b0 e;
    public static final a f;

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static abstract class b<T> {
        public final int a;
        public final Class<T> b;
        public final int c;
        public final int d;

        public b(int i, Class<T> cls, int i2, int i3) {
            this.a = i;
            this.b = cls;
            this.d = i2;
            this.c = i3;
        }

        public static boolean a(Boolean bool, Boolean bool2) {
            boolean z;
            boolean z2;
            if (bool != null && bool.booleanValue()) {
                z = true;
            } else {
                z = false;
            }
            if (bool2 != null && bool2.booleanValue()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z == z2) {
                return true;
            }
            return false;
        }

        public abstract T b(View view);

        public abstract void c(View view, T t);

        public final T d(View view) {
            boolean z;
            if (Build.VERSION.SDK_INT >= this.c) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return b(view);
            }
            T t = (T) view.getTag(this.a);
            if (this.b.isInstance(t)) {
                return t;
            }
            return null;
        }

        public final void e(View view, T t) {
            boolean z;
            com.amazon.aps.iva.p3.a aVar;
            if (Build.VERSION.SDK_INT >= this.c) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c(view, t);
            } else if (f(d(view), t)) {
                View.AccessibilityDelegate d = g0.d(view);
                if (d == null) {
                    aVar = null;
                } else if (d instanceof a.C0597a) {
                    aVar = ((a.C0597a) d).a;
                } else {
                    aVar = new com.amazon.aps.iva.p3.a(d);
                }
                if (aVar == null) {
                    aVar = new com.amazon.aps.iva.p3.a();
                }
                g0.n(view, aVar);
                view.setTag(this.a, t);
                g0.i(this.d, view);
            }
        }

        public abstract boolean f(T t, T t2);
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class c {
        public static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class d {
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

        public static boolean j(View view, int i, Bundle bundle) {
            return view.performAccessibilityAction(i, bundle);
        }

        public static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        public static void l(View view, int i, int i2, int i3, int i4) {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        }

        public static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        public static void n(View view, Runnable runnable, long j) {
            view.postOnAnimationDelayed(runnable, j);
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

        public static void s(View view, int i) {
            view.setImportantForAccessibility(i);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class e {
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

        public static void h(View view, int i) {
            view.setLabelFor(i);
        }

        public static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        public static void j(View view, int i) {
            view.setLayoutDirection(i);
        }

        public static void k(View view, int i, int i2, int i3, int i4) {
            view.setPaddingRelative(i, i2, i3, i4);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class f {
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

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class g {
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

        public static void e(ViewParent viewParent, View view, View view2, int i) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
        }

        public static void f(View view, int i) {
            view.setAccessibilityLiveRegion(i);
        }

        public static void g(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class h {
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

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class i {

        /* compiled from: ViewCompat.java */
        /* loaded from: classes.dex */
        public class a implements View.OnApplyWindowInsetsListener {
            public w0 a = null;
            public final /* synthetic */ View b;
            public final /* synthetic */ u c;

            public a(View view, u uVar) {
                this.b = view;
                this.c = uVar;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                w0 h = w0.h(view, windowInsets);
                int i = Build.VERSION.SDK_INT;
                u uVar = this.c;
                if (i < 30) {
                    i.a(windowInsets, this.b);
                    if (h.equals(this.a)) {
                        return uVar.onApplyWindowInsets(view, h).g();
                    }
                }
                this.a = h;
                w0 onApplyWindowInsets = uVar.onApplyWindowInsets(view, h);
                if (i >= 30) {
                    return onApplyWindowInsets.g();
                }
                WeakHashMap<View, r0> weakHashMap = g0.a;
                h.c(view);
                return onApplyWindowInsets.g();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static w0 b(View view, w0 w0Var, Rect rect) {
            WindowInsets g = w0Var.g();
            if (g != null) {
                return w0.h(view, view.computeSystemWindowInsets(g, rect));
            }
            rect.setEmpty();
            return w0Var;
        }

        public static boolean c(View view, float f, float f2, boolean z) {
            return view.dispatchNestedFling(f, f2, z);
        }

        public static boolean d(View view, float f, float f2) {
            return view.dispatchNestedPreFling(f, f2);
        }

        public static boolean e(View view, int i, int i2, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }

        public static boolean f(View view, int i, int i2, int i3, int i4, int[] iArr) {
            return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
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

        public static w0 j(View view) {
            w0.e bVar;
            if (w0.a.d && view.isAttachedToWindow()) {
                try {
                    Object obj = w0.a.a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) w0.a.b.get(obj);
                        Rect rect2 = (Rect) w0.a.c.get(obj);
                        if (rect != null && rect2 != null) {
                            int i = Build.VERSION.SDK_INT;
                            if (i >= 30) {
                                bVar = new w0.d();
                            } else if (i >= 29) {
                                bVar = new w0.c();
                            } else {
                                bVar = new w0.b();
                            }
                            bVar.e(com.amazon.aps.iva.g3.f.b(rect.left, rect.top, rect.right, rect.bottom));
                            bVar.g(com.amazon.aps.iva.g3.f.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
                            w0 b = bVar.b();
                            b.a.r(b);
                            b.a.d(view.getRootView());
                            return b;
                        }
                    }
                } catch (IllegalAccessException e) {
                    e.getMessage();
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

        public static void s(View view, float f) {
            view.setElevation(f);
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

        public static void w(View view, float f) {
            view.setTranslationZ(f);
        }

        public static void x(View view, float f) {
            view.setZ(f);
        }

        public static boolean y(View view, int i) {
            return view.startNestedScroll(i);
        }

        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class j {
        public static w0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            w0 h = w0.h(null, rootWindowInsets);
            w0.k kVar = h.a;
            kVar.r(h);
            kVar.d(view.getRootView());
            return h;
        }

        public static int b(View view) {
            return view.getScrollIndicators();
        }

        public static void c(View view, int i) {
            view.setScrollIndicators(i);
        }

        public static void d(View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class k {
        public static void a(View view) {
            view.cancelDragAndDrop();
        }

        public static void b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        public static void c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        public static void d(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        public static boolean e(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i);
        }

        public static void f(View view, View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class l {
        public static void a(View view, Collection<View> collection, int i) {
            view.addKeyboardNavigationClusters(collection, i);
        }

        public static AutofillId b(View view) {
            return view.getAutofillId();
        }

        public static int c(View view) {
            return view.getImportantForAutofill();
        }

        public static int d(View view) {
            return view.getNextClusterForwardId();
        }

        public static boolean e(View view) {
            return view.hasExplicitFocusable();
        }

        public static boolean f(View view) {
            return view.isFocusedByDefault();
        }

        public static boolean g(View view) {
            return view.isImportantForAutofill();
        }

        public static boolean h(View view) {
            return view.isKeyboardNavigationCluster();
        }

        public static View i(View view, View view2, int i) {
            return view.keyboardNavigationClusterSearch(view2, i);
        }

        public static boolean j(View view) {
            return view.restoreDefaultFocus();
        }

        public static void k(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        public static void l(View view, boolean z) {
            view.setFocusedByDefault(z);
        }

        public static void m(View view, int i) {
            view.setImportantForAutofill(i);
        }

        public static void n(View view, boolean z) {
            view.setKeyboardNavigationCluster(z);
        }

        public static void o(View view, int i) {
            view.setNextClusterForwardId(i);
        }

        public static void p(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class m {
        public static void a(View view, final r rVar) {
            com.amazon.aps.iva.x.h hVar = (com.amazon.aps.iva.x.h) view.getTag(R.id.tag_unhandled_key_listeners);
            if (hVar == null) {
                hVar = new com.amazon.aps.iva.x.h();
                view.setTag(R.id.tag_unhandled_key_listeners, hVar);
            }
            Objects.requireNonNull(rVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: com.amazon.aps.iva.p3.h0
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return g0.r.this.a();
                }
            };
            hVar.put(rVar, onUnhandledKeyEventListener);
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

        public static void e(View view, r rVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            com.amazon.aps.iva.x.h hVar = (com.amazon.aps.iva.x.h) view.getTag(R.id.tag_unhandled_key_listeners);
            if (hVar != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) hVar.getOrDefault(rVar, null)) != null) {
                view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
            }
        }

        public static <T> T f(View view, int i) {
            return (T) view.requireViewById(i);
        }

        public static void g(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, AutofillId autofillId) {
            view.setAutofillId(autofillId);
        }

        public static void j(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class n {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static ContentCaptureSession b(View view) {
            return view.getContentCaptureSession();
        }

        public static List<Rect> c(View view) {
            return view.getSystemGestureExclusionRects();
        }

        public static void d(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }

        public static void e(View view, ContentCaptureSession contentCaptureSession) {
            view.setContentCaptureSession(contentCaptureSession);
        }

        public static void f(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class o {
        public static int a(View view) {
            return view.getImportantForContentCapture();
        }

        public static CharSequence b(View view) {
            return view.getStateDescription();
        }

        public static y0 c(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return new y0(windowInsetsController);
            }
            return null;
        }

        public static boolean d(View view) {
            return view.isImportantForContentCapture();
        }

        public static void e(View view, int i) {
            view.setImportantForContentCapture(i);
        }

        public static void f(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static final class p {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static com.amazon.aps.iva.p3.c b(View view, com.amazon.aps.iva.p3.c cVar) {
            ContentInfo b = cVar.a.b();
            Objects.requireNonNull(b);
            ContentInfo c = com.amazon.aps.iva.b6.o0.c(b);
            ContentInfo performReceiveContent = view.performReceiveContent(c);
            if (performReceiveContent == null) {
                return null;
            }
            if (performReceiveContent == c) {
                return cVar;
            }
            return new com.amazon.aps.iva.p3.c(new c.d(performReceiveContent));
        }

        public static void c(View view, String[] strArr, v vVar) {
            if (vVar == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new q(vVar));
            }
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static final class q implements OnReceiveContentListener {
        public final v a;

        public q(v vVar) {
            this.a = vVar;
        }

        public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            com.amazon.aps.iva.p3.c cVar = new com.amazon.aps.iva.p3.c(new c.d(contentInfo));
            com.amazon.aps.iva.p3.c a = this.a.a(view, cVar);
            if (a == null) {
                return null;
            }
            if (a == cVar) {
                return contentInfo;
            }
            ContentInfo b = a.a.b();
            Objects.requireNonNull(b);
            return com.amazon.aps.iva.b6.o0.c(b);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public interface r {
        boolean a();
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class s {
        public static final ArrayList<WeakReference<View>> d = new ArrayList<>();
        public WeakHashMap<View, Boolean> a = null;
        public SparseArray<WeakReference<View>> b = null;
        public WeakReference<KeyEvent> c = null;

        public static boolean b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((r) arrayList.get(size)).a()) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        public final View a(View view, KeyEvent keyEvent) {
            View a;
            WeakHashMap<View, Boolean> weakHashMap = this.a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    do {
                        childCount--;
                        if (childCount >= 0) {
                            a = a(viewGroup.getChildAt(childCount), keyEvent);
                        }
                    } while (a == null);
                    return a;
                }
                if (b(view, keyEvent)) {
                    return view;
                }
                return null;
            }
            return null;
        }
    }

    static {
        new AtomicInteger(1);
        a = null;
        c = false;
        d = new int[]{R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        e = new b0();
        f = new a();
    }

    public static r0 a(View view) {
        if (a == null) {
            a = new WeakHashMap<>();
        }
        r0 r0Var = a.get(view);
        if (r0Var == null) {
            r0 r0Var2 = new r0(view);
            a.put(view, r0Var2);
            return r0Var2;
        }
        return r0Var;
    }

    public static void b(View view, w0 w0Var) {
        WindowInsets g2 = w0Var.g();
        if (g2 != null) {
            WindowInsets a2 = h.a(view, g2);
            if (!a2.equals(g2)) {
                w0.h(view, a2);
            }
        }
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = s.d;
        s sVar = (s) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (sVar == null) {
            sVar = new s();
            view.setTag(R.id.tag_unhandled_key_event_manager, sVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = sVar.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = s.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (sVar.a == null) {
                        sVar.a = new WeakHashMap<>();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList<WeakReference<View>> arrayList3 = s.d;
                        View view2 = arrayList3.get(size).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            sVar.a.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                sVar.a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View a2 = sVar.a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (sVar.b == null) {
                    sVar.b = new SparseArray<>();
                }
                sVar.b.put(keyCode, new WeakReference<>(a2));
            }
        }
        if (a2 == null) {
            return false;
        }
        return true;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return n.a(view);
        }
        if (c) {
            return null;
        }
        if (b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                c = true;
                return null;
            }
        }
        try {
            Object obj = b.get(view);
            if (!(obj instanceof View.AccessibilityDelegate)) {
                return null;
            }
            return (View.AccessibilityDelegate) obj;
        } catch (Throwable unused2) {
            c = true;
            return null;
        }
    }

    public static CharSequence e(View view) {
        boolean z;
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            tag = m.b(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(R.id.tag_accessibility_actions, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static String[] g(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return p.a(view);
        }
        return (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    @Deprecated
    public static y0 h(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return o.c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window == null) {
                    return null;
                }
                return new y0(window, view);
            }
        }
        return null;
    }

    public static void i(int i2, View view) {
        boolean z;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (!accessibilityManager.isEnabled()) {
            return;
        }
        if (e(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        int i3 = 32;
        if (g.a(view) == 0 && !z) {
            if (i2 == 32) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain);
                obtain.setEventType(32);
                g.g(obtain, i2);
                obtain.setSource(view);
                view.onPopulateAccessibilityEvent(obtain);
                obtain.getText().add(e(view));
                accessibilityManager.sendAccessibilityEvent(obtain);
                return;
            } else if (view.getParent() != null) {
                try {
                    g.e(view.getParent(), view, view, i2);
                    return;
                } catch (AbstractMethodError unused) {
                    view.getParent().getClass();
                    return;
                }
            } else {
                return;
            }
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
        if (!z) {
            i3 = 2048;
        }
        obtain2.setEventType(i3);
        g.g(obtain2, i2);
        if (z) {
            obtain2.getText().add(e(view));
            if (d.c(view) == 0) {
                d.s(view, 1);
            }
        }
        view.sendAccessibilityEventUnchecked(obtain2);
    }

    public static com.amazon.aps.iva.p3.c j(View view, com.amazon.aps.iva.p3.c cVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(cVar);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return p.b(view, cVar);
        }
        v vVar = (v) view.getTag(R.id.tag_on_receive_content_listener);
        w wVar = e;
        if (vVar != null) {
            com.amazon.aps.iva.p3.c a2 = vVar.a(view, cVar);
            if (a2 == null) {
                return null;
            }
            if (view instanceof w) {
                wVar = (w) view;
            }
            return wVar.onReceiveContent(a2);
        }
        if (view instanceof w) {
            wVar = (w) view;
        }
        return wVar.onReceiveContent(cVar);
    }

    public static void k(int i2, View view) {
        ArrayList f2 = f(view);
        for (int i3 = 0; i3 < f2.size(); i3++) {
            if (((l.a) f2.get(i3)).a() == i2) {
                f2.remove(i3);
                return;
            }
        }
    }

    public static void l(View view, l.a aVar, String str, com.amazon.aps.iva.q3.p pVar) {
        com.amazon.aps.iva.p3.a aVar2;
        if (pVar == null && str == null) {
            k(aVar.a(), view);
            i(0, view);
            return;
        }
        l.a aVar3 = new l.a(null, aVar.b, str, pVar, aVar.c);
        View.AccessibilityDelegate d2 = d(view);
        if (d2 == null) {
            aVar2 = null;
        } else if (d2 instanceof a.C0597a) {
            aVar2 = ((a.C0597a) d2).a;
        } else {
            aVar2 = new com.amazon.aps.iva.p3.a(d2);
        }
        if (aVar2 == null) {
            aVar2 = new com.amazon.aps.iva.p3.a();
        }
        n(view, aVar2);
        k(aVar3.a(), view);
        f(view).add(aVar3);
        i(0, view);
    }

    public static void m(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            n.d(view, context, iArr, attributeSet, typedArray, i2, 0);
        }
    }

    public static void n(View view, com.amazon.aps.iva.p3.a aVar) {
        View.AccessibilityDelegate bridge;
        if (aVar == null && (d(view) instanceof a.C0597a)) {
            aVar = new com.amazon.aps.iva.p3.a();
        }
        if (d.c(view) == 0) {
            d.s(view, 1);
        }
        if (aVar == null) {
            bridge = null;
        } else {
            bridge = aVar.getBridge();
        }
        view.setAccessibilityDelegate(bridge);
    }

    public static void o(View view, CharSequence charSequence) {
        boolean z;
        new d0().e(view, charSequence);
        a aVar = f;
        if (charSequence != null) {
            WeakHashMap<View, Boolean> weakHashMap = aVar.b;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z));
            view.addOnAttachStateChangeListener(aVar);
            if (g.b(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
                return;
            }
            return;
        }
        aVar.b.remove(view);
        view.removeOnAttachStateChangeListener(aVar);
        d.o(view.getViewTreeObserver(), aVar);
    }

    public static void p(View view, v0.b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            com.amazon.aps.iva.f8.j.d(view, new v0.d.a(bVar));
            return;
        }
        PathInterpolator pathInterpolator = v0.c.e;
        Object tag = view.getTag(R.id.tag_on_apply_window_listener);
        View.OnApplyWindowInsetsListener aVar = new v0.c.a(view, bVar);
        view.setTag(R.id.tag_window_insets_animation_callback, aVar);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(aVar);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
        public final WeakHashMap<View, Boolean> b = new WeakHashMap<>();

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            boolean z;
            int i;
            if (Build.VERSION.SDK_INT < 28) {
                WeakHashMap<View, Boolean> weakHashMap = this.b;
                for (Map.Entry<View, Boolean> entry : weakHashMap.entrySet()) {
                    View key = entry.getKey();
                    boolean booleanValue = entry.getValue().booleanValue();
                    if (key.isShown() && key.getWindowVisibility() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (booleanValue != z) {
                        if (z) {
                            i = 16;
                        } else {
                            i = 32;
                        }
                        g0.i(i, key);
                        weakHashMap.put(key, Boolean.valueOf(z));
                    }
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}

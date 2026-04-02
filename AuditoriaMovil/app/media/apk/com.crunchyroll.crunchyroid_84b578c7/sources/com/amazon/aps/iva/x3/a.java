package com.amazon.aps.iva.x3;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.amazon.aps.iva.q3.l;
import com.amazon.aps.iva.q3.m;
import com.amazon.aps.iva.q3.o;
import com.amazon.aps.iva.x.i;
import com.amazon.aps.iva.x3.b;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
/* compiled from: ExploreByTouchHelper.java */
/* loaded from: classes.dex */
public abstract class a extends com.amazon.aps.iva.p3.a {
    private static final String DEFAULT_CLASS_NAME = "android.view.View";
    public static final int HOST_ID = -1;
    public static final int INVALID_ID = Integer.MIN_VALUE;
    private static final Rect INVALID_PARENT_BOUNDS = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    private static final b.a<l> NODE_ADAPTER = new C0838a();
    private static final b.InterfaceC0839b<i<l>, l> SPARSE_VALUES_ADAPTER = new b();
    private final View mHost;
    private final AccessibilityManager mManager;
    private c mNodeProvider;
    private final Rect mTempScreenRect = new Rect();
    private final Rect mTempParentRect = new Rect();
    private final Rect mTempVisibleRect = new Rect();
    private final int[] mTempGlobalRect = new int[2];
    int mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
    int mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
    private int mHoveredVirtualViewId = Integer.MIN_VALUE;

    /* compiled from: ExploreByTouchHelper.java */
    /* renamed from: com.amazon.aps.iva.x3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0838a implements b.a<l> {
    }

    /* compiled from: ExploreByTouchHelper.java */
    /* loaded from: classes.dex */
    public class b implements b.InterfaceC0839b<i<l>, l> {
    }

    /* compiled from: ExploreByTouchHelper.java */
    /* loaded from: classes.dex */
    public class c extends m {
        public c() {
        }

        @Override // com.amazon.aps.iva.q3.m
        public final l a(int i) {
            return new l(AccessibilityNodeInfo.obtain(a.this.obtainAccessibilityNodeInfo(i).a));
        }

        @Override // com.amazon.aps.iva.q3.m
        public final l b(int i) {
            int i2;
            a aVar = a.this;
            if (i == 2) {
                i2 = aVar.mAccessibilityFocusedVirtualViewId;
            } else {
                i2 = aVar.mKeyboardFocusedVirtualViewId;
            }
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return a(i2);
        }

        @Override // com.amazon.aps.iva.q3.m
        public final boolean c(int i, int i2, Bundle bundle) {
            return a.this.performAction(i, i2, bundle);
        }
    }

    public a(View view) {
        if (view != null) {
            this.mHost = view;
            this.mManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            WeakHashMap<View, r0> weakHashMap = g0.a;
            if (g0.d.c(view) == 0) {
                g0.d.s(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    private boolean clearAccessibilityFocus(int i) {
        if (this.mAccessibilityFocusedVirtualViewId == i) {
            this.mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
            this.mHost.invalidate();
            sendEventForVirtualView(i, Cast.MAX_MESSAGE_LENGTH);
            return true;
        }
        return false;
    }

    private boolean clickKeyboardFocusedVirtualView() {
        int i = this.mKeyboardFocusedVirtualViewId;
        if (i != Integer.MIN_VALUE && onPerformActionForVirtualView(i, 16, null)) {
            return true;
        }
        return false;
    }

    private AccessibilityEvent createEvent(int i, int i2) {
        if (i != -1) {
            return createEventForChild(i, i2);
        }
        return createEventForHost(i2);
    }

    private AccessibilityEvent createEventForChild(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        l obtainAccessibilityNodeInfo = obtainAccessibilityNodeInfo(i);
        obtain.getText().add(obtainAccessibilityNodeInfo.g());
        AccessibilityNodeInfo accessibilityNodeInfo = obtainAccessibilityNodeInfo.a;
        obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
        obtain.setScrollable(accessibilityNodeInfo.isScrollable());
        obtain.setPassword(accessibilityNodeInfo.isPassword());
        obtain.setEnabled(accessibilityNodeInfo.isEnabled());
        obtain.setChecked(accessibilityNodeInfo.isChecked());
        onPopulateEventForVirtualView(i, obtain);
        if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain.setClassName(accessibilityNodeInfo.getClassName());
        o.a(obtain, this.mHost, i);
        obtain.setPackageName(this.mHost.getContext().getPackageName());
        return obtain;
    }

    private AccessibilityEvent createEventForHost(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        this.mHost.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    private l createNodeForChild(int i) {
        boolean z;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        l lVar = new l(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        lVar.h(DEFAULT_CLASS_NAME);
        Rect rect = INVALID_PARENT_BOUNDS;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        View view = this.mHost;
        lVar.b = -1;
        obtain.setParent(view);
        onPopulateNodeForVirtualView(i, lVar);
        if (lVar.g() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        lVar.f(this.mTempParentRect);
        if (!this.mTempParentRect.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) == 0) {
                if ((actions & 128) == 0) {
                    obtain.setPackageName(this.mHost.getContext().getPackageName());
                    View view2 = this.mHost;
                    lVar.c = i;
                    obtain.setSource(view2, i);
                    if (this.mAccessibilityFocusedVirtualViewId == i) {
                        obtain.setAccessibilityFocused(true);
                        lVar.a(128);
                    } else {
                        obtain.setAccessibilityFocused(false);
                        lVar.a(64);
                    }
                    if (this.mKeyboardFocusedVirtualViewId == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        lVar.a(2);
                    } else if (obtain.isFocusable()) {
                        lVar.a(1);
                    }
                    obtain.setFocused(z);
                    this.mHost.getLocationOnScreen(this.mTempGlobalRect);
                    obtain.getBoundsInScreen(this.mTempScreenRect);
                    if (this.mTempScreenRect.equals(rect)) {
                        lVar.f(this.mTempScreenRect);
                        if (lVar.b != -1) {
                            l lVar2 = new l(AccessibilityNodeInfo.obtain());
                            for (int i2 = lVar.b; i2 != -1; i2 = lVar2.b) {
                                View view3 = this.mHost;
                                lVar2.b = -1;
                                AccessibilityNodeInfo accessibilityNodeInfo = lVar2.a;
                                accessibilityNodeInfo.setParent(view3, -1);
                                accessibilityNodeInfo.setBoundsInParent(INVALID_PARENT_BOUNDS);
                                onPopulateNodeForVirtualView(i2, lVar2);
                                lVar2.f(this.mTempParentRect);
                                Rect rect2 = this.mTempScreenRect;
                                Rect rect3 = this.mTempParentRect;
                                rect2.offset(rect3.left, rect3.top);
                            }
                        }
                        this.mTempScreenRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
                    }
                    if (this.mHost.getLocalVisibleRect(this.mTempVisibleRect)) {
                        this.mTempVisibleRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
                        if (this.mTempScreenRect.intersect(this.mTempVisibleRect)) {
                            Rect rect4 = this.mTempScreenRect;
                            AccessibilityNodeInfo accessibilityNodeInfo2 = lVar.a;
                            accessibilityNodeInfo2.setBoundsInScreen(rect4);
                            if (isVisibleToUser(this.mTempScreenRect)) {
                                accessibilityNodeInfo2.setVisibleToUser(true);
                            }
                        }
                    }
                    return lVar;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    private l createNodeForHost() {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.mHost);
        l lVar = new l(obtain);
        View view = this.mHost;
        WeakHashMap<View, r0> weakHashMap = g0.a;
        view.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            lVar.a.addChild(this.mHost, ((Integer) arrayList.get(i)).intValue());
        }
        return lVar;
    }

    private i<l> getAllNodes() {
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        i<l> iVar = new i<>();
        for (int i = 0; i < arrayList.size(); i++) {
            iVar.f(((Integer) arrayList.get(i)).intValue(), createNodeForChild(((Integer) arrayList.get(i)).intValue()));
        }
        return iVar;
    }

    private void getBoundsInParent(int i, Rect rect) {
        obtainAccessibilityNodeInfo(i).f(rect);
    }

    private static Rect guessPreviouslyFocusedRect(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        rect.set(0, -1, width, -1);
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    rect.set(-1, 0, -1, height);
                }
            } else {
                rect.set(0, height, width, height);
            }
        } else {
            rect.set(width, 0, width, height);
        }
        return rect;
    }

    private boolean isVisibleToUser(Rect rect) {
        if (rect == null || rect.isEmpty() || this.mHost.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.mHost.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        if (parent == null) {
            return false;
        }
        return true;
    }

    private static int keyToDirection(int i) {
        if (i != 19) {
            if (i != 21) {
                if (i != 22) {
                    return 130;
                }
                return 66;
            }
            return 17;
        }
        return 33;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f1, code lost:
        if (r13 < ((r18 * r18) + ((r17 * 13) * r17))) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean moveFocus(int r21, android.graphics.Rect r22) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.x3.a.moveFocus(int, android.graphics.Rect):boolean");
    }

    private boolean performActionForChild(int i, int i2, Bundle bundle) {
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 64) {
                    if (i2 != 128) {
                        return onPerformActionForVirtualView(i, i2, bundle);
                    }
                    return clearAccessibilityFocus(i);
                }
                return requestAccessibilityFocus(i);
            }
            return clearKeyboardFocusForVirtualView(i);
        }
        return requestKeyboardFocusForVirtualView(i);
    }

    private boolean performActionForHost(int i, Bundle bundle) {
        View view = this.mHost;
        WeakHashMap<View, r0> weakHashMap = g0.a;
        return g0.d.j(view, i, bundle);
    }

    private boolean requestAccessibilityFocus(int i) {
        int i2;
        if (!this.mManager.isEnabled() || !this.mManager.isTouchExplorationEnabled() || (i2 = this.mAccessibilityFocusedVirtualViewId) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            clearAccessibilityFocus(i2);
        }
        this.mAccessibilityFocusedVirtualViewId = i;
        this.mHost.invalidate();
        sendEventForVirtualView(i, 32768);
        return true;
    }

    private void updateHoveredVirtualView(int i) {
        int i2 = this.mHoveredVirtualViewId;
        if (i2 == i) {
            return;
        }
        this.mHoveredVirtualViewId = i;
        sendEventForVirtualView(i, 128);
        sendEventForVirtualView(i2, 256);
    }

    public final boolean clearKeyboardFocusForVirtualView(int i) {
        if (this.mKeyboardFocusedVirtualViewId != i) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
        onVirtualViewKeyboardFocusChanged(i, false);
        sendEventForVirtualView(i, 8);
        return true;
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!this.mManager.isEnabled() || !this.mManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7 && action != 9) {
            if (action != 10 || this.mHoveredVirtualViewId == Integer.MIN_VALUE) {
                return false;
            }
            updateHoveredVirtualView(Integer.MIN_VALUE);
            return true;
        }
        int virtualViewAt = getVirtualViewAt(motionEvent.getX(), motionEvent.getY());
        updateHoveredVirtualView(virtualViewAt);
        if (virtualViewAt == Integer.MIN_VALUE) {
            return false;
        }
        return true;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int keyToDirection = keyToDirection(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z = false;
                        while (i < repeatCount && moveFocus(keyToDirection, null)) {
                            i++;
                            z = true;
                        }
                        return z;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            clickKeyboardFocusedVirtualView();
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return moveFocus(2, null);
        } else {
            if (!keyEvent.hasModifiers(1)) {
                return false;
            }
            return moveFocus(1, null);
        }
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.mAccessibilityFocusedVirtualViewId;
    }

    @Override // com.amazon.aps.iva.p3.a
    public m getAccessibilityNodeProvider(View view) {
        if (this.mNodeProvider == null) {
            this.mNodeProvider = new c();
        }
        return this.mNodeProvider;
    }

    @Deprecated
    public int getFocusedVirtualView() {
        return getAccessibilityFocusedVirtualViewId();
    }

    public final int getKeyboardFocusedVirtualViewId() {
        return this.mKeyboardFocusedVirtualViewId;
    }

    public abstract int getVirtualViewAt(float f, float f2);

    public abstract void getVisibleVirtualViews(List<Integer> list);

    public final void invalidateRoot() {
        invalidateVirtualView(-1, 1);
    }

    public final void invalidateVirtualView(int i) {
        invalidateVirtualView(i, 0);
    }

    public l obtainAccessibilityNodeInfo(int i) {
        if (i == -1) {
            return createNodeForHost();
        }
        return createNodeForChild(i);
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int i2 = this.mKeyboardFocusedVirtualViewId;
        if (i2 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i2);
        }
        if (z) {
            moveFocus(i, rect);
        }
    }

    @Override // com.amazon.aps.iva.p3.a
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        onPopulateEventForHost(accessibilityEvent);
    }

    @Override // com.amazon.aps.iva.p3.a
    public void onInitializeAccessibilityNodeInfo(View view, l lVar) {
        super.onInitializeAccessibilityNodeInfo(view, lVar);
        onPopulateNodeForHost(lVar);
    }

    public abstract boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle);

    public abstract void onPopulateNodeForVirtualView(int i, l lVar);

    public boolean performAction(int i, int i2, Bundle bundle) {
        if (i != -1) {
            return performActionForChild(i, i2, bundle);
        }
        return performActionForHost(i2, bundle);
    }

    public final boolean requestKeyboardFocusForVirtualView(int i) {
        int i2;
        if ((!this.mHost.isFocused() && !this.mHost.requestFocus()) || (i2 = this.mKeyboardFocusedVirtualViewId) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = i;
        onVirtualViewKeyboardFocusChanged(i, true);
        sendEventForVirtualView(i, 8);
        return true;
    }

    public final boolean sendEventForVirtualView(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.mHost, createEvent(i, i2));
    }

    public final void invalidateVirtualView(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return;
        }
        AccessibilityEvent createEvent = createEvent(i, 2048);
        com.amazon.aps.iva.q3.b.b(createEvent, i2);
        parent.requestSendAccessibilityEvent(this.mHost, createEvent);
    }

    public void onPopulateEventForHost(AccessibilityEvent accessibilityEvent) {
    }

    public void onPopulateNodeForHost(l lVar) {
    }

    public void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityEvent) {
    }

    public void onVirtualViewKeyboardFocusChanged(int i, boolean z) {
    }
}

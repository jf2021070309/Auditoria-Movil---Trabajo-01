package c.k.a;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import c.f.i;
import c.i.k.d0;
import ch.qos.logback.classic.Level;
import ch.qos.logback.core.util.FileUtil;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public abstract class a extends c.i.k.e {

    /* renamed from: d  reason: collision with root package name */
    public static final Rect f2255d = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Level.ALL_INT, Level.ALL_INT);

    /* renamed from: e  reason: collision with root package name */
    public static final c.k.a.b<c.i.k.k0.b> f2256e = new C0044a();

    /* renamed from: f  reason: collision with root package name */
    public static final c.k.a.c<i<c.i.k.k0.b>, c.i.k.k0.b> f2257f = new b();

    /* renamed from: k  reason: collision with root package name */
    public final AccessibilityManager f2262k;

    /* renamed from: l  reason: collision with root package name */
    public final View f2263l;

    /* renamed from: m  reason: collision with root package name */
    public c f2264m;

    /* renamed from: g  reason: collision with root package name */
    public final Rect f2258g = new Rect();

    /* renamed from: h  reason: collision with root package name */
    public final Rect f2259h = new Rect();

    /* renamed from: i  reason: collision with root package name */
    public final Rect f2260i = new Rect();

    /* renamed from: j  reason: collision with root package name */
    public final int[] f2261j = new int[2];

    /* renamed from: n  reason: collision with root package name */
    public int f2265n = Level.ALL_INT;
    public int o = Level.ALL_INT;
    public int p = Level.ALL_INT;

    /* renamed from: c.k.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0044a implements c.k.a.b<c.i.k.k0.b> {
        public void a(Object obj, Rect rect) {
            ((c.i.k.k0.b) obj).f2193b.getBoundsInParent(rect);
        }
    }

    /* loaded from: classes.dex */
    public class b implements c.k.a.c<i<c.i.k.k0.b>, c.i.k.k0.b> {
    }

    /* loaded from: classes.dex */
    public class c extends c.i.k.k0.c {
        public c() {
        }

        @Override // c.i.k.k0.c
        public c.i.k.k0.b a(int i2) {
            return new c.i.k.k0.b(AccessibilityNodeInfo.obtain(a.this.o(i2).f2193b));
        }

        @Override // c.i.k.k0.c
        public c.i.k.k0.b b(int i2) {
            int i3 = i2 == 2 ? a.this.f2265n : a.this.o;
            if (i3 == Integer.MIN_VALUE) {
                return null;
            }
            return new c.i.k.k0.b(AccessibilityNodeInfo.obtain(a.this.o(i3).f2193b));
        }

        @Override // c.i.k.k0.c
        public boolean c(int i2, int i3, Bundle bundle) {
            int i4;
            a aVar = a.this;
            if (i2 == -1) {
                View view = aVar.f2263l;
                AtomicInteger atomicInteger = d0.a;
                return d0.c.j(view, i3, bundle);
            }
            boolean z = true;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 64) {
                        return i3 != 128 ? aVar.p(i2, i3, bundle) : aVar.j(i2);
                    }
                    if (aVar.f2262k.isEnabled() && aVar.f2262k.isTouchExplorationEnabled() && (i4 = aVar.f2265n) != i2) {
                        if (i4 != Integer.MIN_VALUE) {
                            aVar.j(i4);
                        }
                        aVar.f2265n = i2;
                        aVar.f2263l.invalidate();
                        aVar.s(i2, FileUtil.BUF_SIZE);
                    } else {
                        z = false;
                    }
                    return z;
                }
                return aVar.k(i2);
            }
            return aVar.r(i2);
        }
    }

    public a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f2263l = view;
        this.f2262k = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        AtomicInteger atomicInteger = d0.a;
        if (d0.c.c(view) == 0) {
            d0.c.s(view, 1);
        }
    }

    @Override // c.i.k.e
    public c.i.k.k0.c b(View view) {
        if (this.f2264m == null) {
            this.f2264m = new c();
        }
        return this.f2264m;
    }

    @Override // c.i.k.e
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f2148b.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // c.i.k.e
    public void d(View view, c.i.k.k0.b bVar) {
        this.f2148b.onInitializeAccessibilityNodeInfo(view, bVar.f2193b);
        Chip.b bVar2 = (Chip.b) this;
        bVar.f2193b.setCheckable(Chip.this.f());
        bVar.f2193b.setClickable(Chip.this.isClickable());
        bVar.f2193b.setClassName(Chip.this.getAccessibilityClassName());
        CharSequence text = Chip.this.getText();
        if (Build.VERSION.SDK_INT >= 23) {
            bVar.f2193b.setText(text);
        } else {
            bVar.f2193b.setContentDescription(text);
        }
    }

    public final boolean j(int i2) {
        if (this.f2265n == i2) {
            this.f2265n = Level.ALL_INT;
            this.f2263l.invalidate();
            s(i2, 65536);
            return true;
        }
        return false;
    }

    public final boolean k(int i2) {
        if (this.o != i2) {
            return false;
        }
        this.o = Level.ALL_INT;
        Chip.b bVar = (Chip.b) this;
        if (i2 == 1) {
            Chip chip = Chip.this;
            chip.o = false;
            chip.refreshDrawableState();
        }
        s(i2, 8);
        return true;
    }

    public final c.i.k.k0.b l(int i2) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        c.i.k.k0.b bVar = new c.i.k.k0.b(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        obtain.setClassName("android.view.View");
        Rect rect = f2255d;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        View view = this.f2263l;
        bVar.f2194c = -1;
        obtain.setParent(view);
        q(i2, bVar);
        if (bVar.g() == null && bVar.e() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        obtain.getBoundsInParent(this.f2259h);
        if (this.f2259h.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = obtain.getActions();
        if ((actions & 64) == 0) {
            if ((actions & 128) == 0) {
                obtain.setPackageName(this.f2263l.getContext().getPackageName());
                View view2 = this.f2263l;
                bVar.f2195d = i2;
                obtain.setSource(view2, i2);
                boolean z = false;
                if (this.f2265n == i2) {
                    obtain.setAccessibilityFocused(true);
                    obtain.addAction(128);
                } else {
                    obtain.setAccessibilityFocused(false);
                    obtain.addAction(64);
                }
                boolean z2 = this.o == i2;
                if (z2) {
                    obtain.addAction(2);
                } else if (obtain.isFocusable()) {
                    obtain.addAction(1);
                }
                obtain.setFocused(z2);
                this.f2263l.getLocationOnScreen(this.f2261j);
                obtain.getBoundsInScreen(this.f2258g);
                if (this.f2258g.equals(rect)) {
                    obtain.getBoundsInParent(this.f2258g);
                    if (bVar.f2194c != -1) {
                        c.i.k.k0.b bVar2 = new c.i.k.k0.b(AccessibilityNodeInfo.obtain());
                        for (int i3 = bVar.f2194c; i3 != -1; i3 = bVar2.f2194c) {
                            View view3 = this.f2263l;
                            bVar2.f2194c = -1;
                            bVar2.f2193b.setParent(view3, -1);
                            bVar2.f2193b.setBoundsInParent(f2255d);
                            q(i3, bVar2);
                            bVar2.f2193b.getBoundsInParent(this.f2259h);
                            Rect rect2 = this.f2258g;
                            Rect rect3 = this.f2259h;
                            rect2.offset(rect3.left, rect3.top);
                        }
                        bVar2.f2193b.recycle();
                    }
                    this.f2258g.offset(this.f2261j[0] - this.f2263l.getScrollX(), this.f2261j[1] - this.f2263l.getScrollY());
                }
                if (this.f2263l.getLocalVisibleRect(this.f2260i)) {
                    this.f2260i.offset(this.f2261j[0] - this.f2263l.getScrollX(), this.f2261j[1] - this.f2263l.getScrollY());
                    if (this.f2258g.intersect(this.f2260i)) {
                        bVar.f2193b.setBoundsInScreen(this.f2258g);
                        Rect rect4 = this.f2258g;
                        if (rect4 != null && !rect4.isEmpty() && this.f2263l.getWindowVisibility() == 0) {
                            ViewParent parent = this.f2263l.getParent();
                            while (true) {
                                if (parent instanceof View) {
                                    View view4 = (View) parent;
                                    if (view4.getAlpha() <= 0.0f || view4.getVisibility() != 0) {
                                        break;
                                    }
                                    parent = view4.getParent();
                                } else if (parent != null) {
                                    z = true;
                                }
                            }
                        }
                        if (z) {
                            bVar.f2193b.setVisibleToUser(true);
                        }
                    }
                }
                return bVar;
            }
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
    }

    public abstract void m(List<Integer> list);

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0143, code lost:
        if (r13 < ((r17 * r17) + ((r12 * 13) * r12))) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n(int r20, android.graphics.Rect r21) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.k.a.a.n(int, android.graphics.Rect):boolean");
    }

    public c.i.k.k0.b o(int i2) {
        if (i2 == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.f2263l);
            c.i.k.k0.b bVar = new c.i.k.k0.b(obtain);
            View view = this.f2263l;
            AtomicInteger atomicInteger = d0.a;
            view.onInitializeAccessibilityNodeInfo(obtain);
            ArrayList arrayList = new ArrayList();
            m(arrayList);
            if (obtain.getChildCount() <= 0 || arrayList.size() <= 0) {
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    bVar.f2193b.addChild(this.f2263l, ((Integer) arrayList.get(i3)).intValue());
                }
                return bVar;
            }
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        return l(i2);
    }

    public abstract boolean p(int i2, int i3, Bundle bundle);

    public abstract void q(int i2, c.i.k.k0.b bVar);

    public final boolean r(int i2) {
        int i3;
        if ((this.f2263l.isFocused() || this.f2263l.requestFocus()) && (i3 = this.o) != i2) {
            if (i3 != Integer.MIN_VALUE) {
                k(i3);
            }
            if (i2 == Integer.MIN_VALUE) {
                return false;
            }
            this.o = i2;
            Chip.b bVar = (Chip.b) this;
            if (i2 == 1) {
                Chip chip = Chip.this;
                chip.o = true;
                chip.refreshDrawableState();
            }
            s(i2, 8);
            return true;
        }
        return false;
    }

    public final boolean s(int i2, int i3) {
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i2 == Integer.MIN_VALUE || !this.f2262k.isEnabled() || (parent = this.f2263l.getParent()) == null) {
            return false;
        }
        if (i2 != -1) {
            obtain = AccessibilityEvent.obtain(i3);
            c.i.k.k0.b o = o(i2);
            obtain.getText().add(o.g());
            obtain.setContentDescription(o.e());
            obtain.setScrollable(o.f2193b.isScrollable());
            obtain.setPassword(o.f2193b.isPassword());
            obtain.setEnabled(o.f2193b.isEnabled());
            obtain.setChecked(o.f2193b.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(o.f2193b.getClassName());
            obtain.setSource(this.f2263l, i2);
            obtain.setPackageName(this.f2263l.getContext().getPackageName());
        } else {
            obtain = AccessibilityEvent.obtain(i3);
            this.f2263l.onInitializeAccessibilityEvent(obtain);
        }
        return parent.requestSendAccessibilityEvent(this.f2263l, obtain);
    }
}

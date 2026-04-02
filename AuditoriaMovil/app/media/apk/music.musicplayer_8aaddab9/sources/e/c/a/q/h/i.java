package e.c.a.q.h;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import music.musicplayer.R;
@Deprecated
/* loaded from: classes.dex */
public abstract class i<T extends View, Z> extends e.c.a.q.h.a<Z> {
    public final T a;

    /* renamed from: b  reason: collision with root package name */
    public final a f6011b;

    /* loaded from: classes.dex */
    public static final class a {
        public static Integer a;

        /* renamed from: b  reason: collision with root package name */
        public final View f6012b;

        /* renamed from: c  reason: collision with root package name */
        public final List<g> f6013c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public ViewTreeObserver$OnPreDrawListenerC0130a f6014d;

        /* renamed from: e.c.a.q.h.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class ViewTreeObserver$OnPreDrawListenerC0130a implements ViewTreeObserver.OnPreDrawListener {
            public final WeakReference<a> a;

            public ViewTreeObserver$OnPreDrawListenerC0130a(a aVar) {
                this.a = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    String str = "OnGlobalLayoutListener called attachStateListener=" + this;
                }
                a aVar = this.a.get();
                if (aVar == null || aVar.f6013c.isEmpty()) {
                    return true;
                }
                int d2 = aVar.d();
                int c2 = aVar.c();
                if (aVar.e(d2, c2)) {
                    Iterator it = new ArrayList(aVar.f6013c).iterator();
                    while (it.hasNext()) {
                        ((g) it.next()).a(d2, c2);
                    }
                    aVar.a();
                    return true;
                }
                return true;
            }
        }

        public a(View view) {
            this.f6012b = view;
        }

        public void a() {
            ViewTreeObserver viewTreeObserver = this.f6012b.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f6014d);
            }
            this.f6014d = null;
            this.f6013c.clear();
        }

        public final int b(int i2, int i3, int i4) {
            int i5 = i3 - i4;
            if (i5 > 0) {
                return i5;
            }
            int i6 = i2 - i4;
            if (i6 > 0) {
                return i6;
            }
            if (this.f6012b.isLayoutRequested() || i3 != -2) {
                return 0;
            }
            Log.isLoggable("ViewTarget", 4);
            Context context = this.f6012b.getContext();
            if (a == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                Objects.requireNonNull(windowManager, "Argument must not be null");
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                a = Integer.valueOf(Math.max(point.x, point.y));
            }
            return a.intValue();
        }

        public final int c() {
            int paddingBottom = this.f6012b.getPaddingBottom() + this.f6012b.getPaddingTop();
            ViewGroup.LayoutParams layoutParams = this.f6012b.getLayoutParams();
            return b(this.f6012b.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingBottom);
        }

        public final int d() {
            int paddingRight = this.f6012b.getPaddingRight() + this.f6012b.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = this.f6012b.getLayoutParams();
            return b(this.f6012b.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        }

        public final boolean e(int i2, int i3) {
            if (i2 > 0 || i2 == Integer.MIN_VALUE) {
                if (i3 > 0 || i3 == Integer.MIN_VALUE) {
                    return true;
                }
            }
            return false;
        }
    }

    public i(T t) {
        Objects.requireNonNull(t, "Argument must not be null");
        this.a = t;
        this.f6011b = new a(t);
    }

    @Override // e.c.a.q.h.h
    public void a(g gVar) {
        this.f6011b.f6013c.remove(gVar);
    }

    @Override // e.c.a.q.h.h
    public void c(e.c.a.q.b bVar) {
        this.a.setTag(R.id.glide_custom_view_target_tag, bVar);
    }

    @Override // e.c.a.q.h.h
    public e.c.a.q.b f() {
        Object tag = this.a.getTag(R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof e.c.a.q.b) {
                return (e.c.a.q.b) tag;
            }
            throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    @Override // e.c.a.q.h.h
    public void h(g gVar) {
        a aVar = this.f6011b;
        int d2 = aVar.d();
        int c2 = aVar.c();
        if (aVar.e(d2, c2)) {
            ((e.c.a.q.g) gVar).a(d2, c2);
            return;
        }
        if (!aVar.f6013c.contains(gVar)) {
            aVar.f6013c.add(gVar);
        }
        if (aVar.f6014d == null) {
            ViewTreeObserver viewTreeObserver = aVar.f6012b.getViewTreeObserver();
            a.ViewTreeObserver$OnPreDrawListenerC0130a viewTreeObserver$OnPreDrawListenerC0130a = new a.ViewTreeObserver$OnPreDrawListenerC0130a(aVar);
            aVar.f6014d = viewTreeObserver$OnPreDrawListenerC0130a;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC0130a);
        }
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("Target for: ");
        y.append(this.a);
        return y.toString();
    }
}

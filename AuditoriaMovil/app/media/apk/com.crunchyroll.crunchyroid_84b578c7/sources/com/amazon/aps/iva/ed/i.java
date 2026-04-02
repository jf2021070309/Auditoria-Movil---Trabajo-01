package com.amazon.aps.iva.ed;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ViewTarget.java */
@Deprecated
/* loaded from: classes.dex */
public abstract class i<T extends View, Z> extends com.amazon.aps.iva.ed.a<Z> {
    private static final String TAG = "ViewTarget";
    private static boolean isTagUsedAtLeastOnce = false;
    private static int tagId = 2131428309;
    private View.OnAttachStateChangeListener attachStateListener;
    private boolean isAttachStateListenerAdded;
    private boolean isClearedByUs;
    private final b sizeDeterminer;
    protected final T view;

    /* compiled from: ViewTarget.java */
    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            i.this.resumeMyRequest();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            i.this.pauseMyRequest();
        }
    }

    /* compiled from: ViewTarget.java */
    /* loaded from: classes.dex */
    public static final class b {
        public static Integer e;
        public final View a;
        public final ArrayList b = new ArrayList();
        public boolean c;
        public a d;

        /* compiled from: ViewTarget.java */
        /* loaded from: classes.dex */
        public static final class a implements ViewTreeObserver.OnPreDrawListener {
            public final WeakReference<b> b;

            public a(b bVar) {
                this.b = new WeakReference<>(bVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                boolean z;
                boolean z2;
                Log.isLoggable(i.TAG, 2);
                b bVar = this.b.get();
                if (bVar != null) {
                    ArrayList arrayList = bVar.b;
                    if (!arrayList.isEmpty()) {
                        int c = bVar.c();
                        int b = bVar.b();
                        boolean z3 = false;
                        if (c <= 0 && c != Integer.MIN_VALUE) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            if (b <= 0 && b != Integer.MIN_VALUE) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (z2) {
                                z3 = true;
                            }
                        }
                        if (z3) {
                            Iterator it = new ArrayList(arrayList).iterator();
                            while (it.hasNext()) {
                                ((g) it.next()).b(c, b);
                            }
                            ViewTreeObserver viewTreeObserver = bVar.a.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.removeOnPreDrawListener(bVar.d);
                            }
                            bVar.d = null;
                            arrayList.clear();
                        }
                    }
                }
                return true;
            }
        }

        public b(View view) {
            this.a = view;
        }

        public final int a(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            boolean z = this.c;
            View view = this.a;
            if (z && view.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (view.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            Log.isLoggable(i.TAG, 4);
            Context context = view.getContext();
            if (e == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                defpackage.i.l(windowManager);
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return e.intValue();
        }

        public final int b() {
            int i;
            View view = this.a;
            int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                i = layoutParams.height;
            } else {
                i = 0;
            }
            return a(view.getHeight(), i, paddingBottom);
        }

        public final int c() {
            int i;
            View view = this.a;
            int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                i = layoutParams.width;
            } else {
                i = 0;
            }
            return a(view.getWidth(), i, paddingRight);
        }
    }

    public i(T t) {
        defpackage.i.l(t);
        this.view = t;
        this.sizeDeterminer = new b(t);
    }

    private Object getTag() {
        return this.view.getTag(tagId);
    }

    private void maybeAddAttachStateListener() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.attachStateListener;
        if (onAttachStateChangeListener != null && !this.isAttachStateListenerAdded) {
            this.view.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.isAttachStateListenerAdded = true;
        }
    }

    private void maybeRemoveAttachStateListener() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.attachStateListener;
        if (onAttachStateChangeListener != null && this.isAttachStateListenerAdded) {
            this.view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.isAttachStateListenerAdded = false;
        }
    }

    private void setTag(Object obj) {
        isTagUsedAtLeastOnce = true;
        this.view.setTag(tagId, obj);
    }

    @Deprecated
    public static void setTagId(int i) {
        if (!isTagUsedAtLeastOnce) {
            tagId = i;
            return;
        }
        throw new IllegalArgumentException("You cannot set the tag id more than once or change the tag id after the first request has been made");
    }

    public final i<T, Z> clearOnDetach() {
        if (this.attachStateListener != null) {
            return this;
        }
        this.attachStateListener = new a();
        maybeAddAttachStateListener();
        return this;
    }

    @Override // com.amazon.aps.iva.ed.a, com.amazon.aps.iva.ed.h
    public com.amazon.aps.iva.dd.d getRequest() {
        Object tag = getTag();
        if (tag != null) {
            if (tag instanceof com.amazon.aps.iva.dd.d) {
                return (com.amazon.aps.iva.dd.d) tag;
            }
            throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    @Override // com.amazon.aps.iva.ed.h
    public void getSize(g gVar) {
        boolean z;
        boolean z2;
        b bVar = this.sizeDeterminer;
        int c = bVar.c();
        int b2 = bVar.b();
        boolean z3 = false;
        if (c <= 0 && c != Integer.MIN_VALUE) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (b2 <= 0 && b2 != Integer.MIN_VALUE) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                z3 = true;
            }
        }
        if (z3) {
            gVar.b(c, b2);
            return;
        }
        ArrayList arrayList = bVar.b;
        if (!arrayList.contains(gVar)) {
            arrayList.add(gVar);
        }
        if (bVar.d == null) {
            ViewTreeObserver viewTreeObserver = bVar.a.getViewTreeObserver();
            b.a aVar = new b.a(bVar);
            bVar.d = aVar;
            viewTreeObserver.addOnPreDrawListener(aVar);
        }
    }

    public T getView() {
        return this.view;
    }

    @Override // com.amazon.aps.iva.ed.a, com.amazon.aps.iva.ed.h
    public void onLoadCleared(Drawable drawable) {
        super.onLoadCleared(drawable);
        b bVar = this.sizeDeterminer;
        ViewTreeObserver viewTreeObserver = bVar.a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(bVar.d);
        }
        bVar.d = null;
        bVar.b.clear();
        if (!this.isClearedByUs) {
            maybeRemoveAttachStateListener();
        }
    }

    @Override // com.amazon.aps.iva.ed.a, com.amazon.aps.iva.ed.h
    public void onLoadStarted(Drawable drawable) {
        super.onLoadStarted(drawable);
        maybeAddAttachStateListener();
    }

    public void pauseMyRequest() {
        com.amazon.aps.iva.dd.d request = getRequest();
        if (request != null) {
            this.isClearedByUs = true;
            request.clear();
            this.isClearedByUs = false;
        }
    }

    @Override // com.amazon.aps.iva.ed.h
    public void removeCallback(g gVar) {
        this.sizeDeterminer.b.remove(gVar);
    }

    public void resumeMyRequest() {
        com.amazon.aps.iva.dd.d request = getRequest();
        if (request != null && request.d()) {
            request.j();
        }
    }

    @Override // com.amazon.aps.iva.ed.a, com.amazon.aps.iva.ed.h
    public void setRequest(com.amazon.aps.iva.dd.d dVar) {
        setTag(dVar);
    }

    public String toString() {
        return "Target for: " + this.view;
    }

    public final i<T, Z> waitForLayout() {
        this.sizeDeterminer.c = true;
        return this;
    }

    @Deprecated
    public i(T t, boolean z) {
        this(t);
        if (z) {
            waitForLayout();
        }
    }
}

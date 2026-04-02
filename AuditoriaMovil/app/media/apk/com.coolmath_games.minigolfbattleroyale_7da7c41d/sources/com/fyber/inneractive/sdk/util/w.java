package com.fyber.inneractive.sdk.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import android.view.ViewTreeObserver;
import com.fyber.inneractive.sdk.util.j;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class w {
    public static String a = "IAVisibilityTracker";
    public Map<Context, Pair<ViewTreeObserver, ViewTreeObserver.OnPreDrawListener>> b;
    public WeakHashMap<Context, WeakHashMap<View, b>> c;
    j<Rect> d;
    j<HashSet<View>> e;

    /* loaded from: classes.dex */
    public interface b {
        void a(float f, Rect rect);
    }

    /* synthetic */ w(byte b2) {
        this();
    }

    /* loaded from: classes.dex */
    private static class a {
        private static w a = new w((byte) 0);
    }

    private w() {
        this.c = new WeakHashMap<>();
        this.b = new WeakHashMap();
        this.d = new j<>(16, new j.a<Rect>() { // from class: com.fyber.inneractive.sdk.util.w.1
            @Override // com.fyber.inneractive.sdk.util.j.a
            public final /* synthetic */ Rect a() {
                return new Rect();
            }
        });
        this.e = new j<>(16, new j.a<HashSet<View>>() { // from class: com.fyber.inneractive.sdk.util.w.2
            @Override // com.fyber.inneractive.sdk.util.j.a
            public final /* synthetic */ HashSet<View> a() {
                return new HashSet<>();
            }
        });
    }

    public static w a() {
        return a.a;
    }

    public final void a(final Context context, View view, b bVar) {
        View rootView;
        ViewTreeObserver viewTreeObserver;
        IAlog.b("%strackView called with context: %s view: %s", c(), context, view);
        if (context == null) {
            throw new IllegalStateException("View must be attached to an Activity context");
        }
        WeakHashMap<View, b> weakHashMap = this.c.get(context);
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap<>();
            this.c.put(context, weakHashMap);
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (activity.getWindow() != null) {
                    rootView = activity.getWindow().getDecorView();
                    viewTreeObserver = rootView.getViewTreeObserver();
                    if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.fyber.inneractive.sdk.util.w.3
                            @Override // android.view.ViewTreeObserver.OnPreDrawListener
                            public final boolean onPreDraw() {
                                w.a(w.this, context);
                                return true;
                            }
                        };
                        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
                        this.b.put(context, new Pair<>(viewTreeObserver, onPreDrawListener));
                    }
                }
            }
            rootView = view.getRootView();
            viewTreeObserver = rootView.getViewTreeObserver();
            if (viewTreeObserver != null) {
                ViewTreeObserver.OnPreDrawListener onPreDrawListener2 = new ViewTreeObserver.OnPreDrawListener() { // from class: com.fyber.inneractive.sdk.util.w.3
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public final boolean onPreDraw() {
                        w.a(w.this, context);
                        return true;
                    }
                };
                viewTreeObserver.addOnPreDrawListener(onPreDrawListener2);
                this.b.put(context, new Pair<>(viewTreeObserver, onPreDrawListener2));
            }
        }
        weakHashMap.put(view, bVar);
        b();
    }

    public final void a(View view) {
        IAlog.b("%sunTrackView called with view", c());
        if (view == null) {
            IAlog.b("%sunTrackView called with a null view!", c());
            return;
        }
        Context context = view.getContext();
        if (context == null) {
            IAlog.b("%sview.getContext() returned null!", c());
            return;
        }
        WeakHashMap<View, b> weakHashMap = this.c.get(context);
        if (weakHashMap != null) {
            a(context, weakHashMap, view);
        } else {
            for (Context context2 : new HashSet(this.c.keySet())) {
                a(context2, this.c.get(context2), view);
            }
        }
        b();
    }

    private void a(Context context, Map<View, b> map, View view) {
        if (map.remove(view) != null) {
            if (IAlog.a <= 2) {
                IAlog.a("removeViewFromContext found view for removal!", new Object[0]);
            }
            if (map.isEmpty()) {
                this.c.remove(context);
                Pair<ViewTreeObserver, ViewTreeObserver.OnPreDrawListener> pair = this.b.get(context);
                if (pair != null) {
                    if (((ViewTreeObserver) pair.first).isAlive()) {
                        ((ViewTreeObserver) pair.first).removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) pair.second);
                    }
                    this.b.remove(context);
                }
            }
        }
    }

    private void b() {
        for (Context context : this.c.keySet()) {
            IAlog.b("%stracking context: %s", c(), context);
            Iterator<View> it = this.c.get(context).keySet().iterator();
            while (it.hasNext()) {
                IAlog.b("%stracking view: %s", c(), it.next());
            }
        }
    }

    private static String c() {
        return a + ": ";
    }

    static /* synthetic */ void a(w wVar, Context context) {
        WeakHashMap<View, b> weakHashMap;
        if (context == null || (weakHashMap = wVar.c.get(context)) == null) {
            return;
        }
        HashSet<View> a2 = wVar.e.a();
        a2.addAll(weakHashMap.keySet());
        Iterator<View> it = a2.iterator();
        while (it.hasNext()) {
            View next = it.next();
            b bVar = weakHashMap.get(next);
            float f = 0.0f;
            Rect a3 = wVar.d.a();
            if (next != null && next.getParent() != null && next.isShown() && next.getGlobalVisibleRect(a3)) {
                f = (a3.height() * a3.width()) / (next.getHeight() * next.getWidth());
            }
            bVar.a(f, a3);
            wVar.d.a(a3);
        }
        a2.clear();
        wVar.e.a(a2);
    }
}

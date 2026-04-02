package com.amazon.aps.iva.k;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.amazon.aps.iva.a9.k0;
import com.amazon.aps.iva.k.x;
import com.amazon.aps.iva.k3.j;
import com.amazon.aps.iva.o.a;
import com.amazon.aps.iva.o.e;
import com.amazon.aps.iva.p3.g;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.amazon.aps.iva.q.h0;
import com.amazon.aps.iva.q.l1;
import com.amazon.aps.iva.q.m1;
import com.amazon.aps.iva.q.u0;
import com.crunchyroll.crunchyroid.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import okhttp3.internal.ws.WebSocketProtocol;
/* compiled from: AppCompatDelegateImpl.java */
/* loaded from: classes.dex */
public final class g extends com.amazon.aps.iva.k.f implements f.a, LayoutInflater.Factory2 {
    public static final com.amazon.aps.iva.x.h<String, Integer> D0 = new com.amazon.aps.iva.x.h<>();
    public static final int[] E0 = {16842836};
    public static final boolean F0 = !"robolectric".equals(Build.FINGERPRINT);
    public static final boolean G0 = true;
    public r A0;
    public boolean B;
    public OnBackInvokedDispatcher B0;
    public ViewGroup C;
    public OnBackInvokedCallback C0;
    public TextView D;
    public View E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public m[] N;
    public m O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public Configuration T;
    public final int U;
    public int V;
    public int W;
    public boolean X;
    public k Y;
    public i Z;
    public final Object k;
    public boolean k0;
    public final Context l;
    public Window m;
    public h n;
    public final com.amazon.aps.iva.k.d o;
    public com.amazon.aps.iva.k.a p;
    public com.amazon.aps.iva.o.f q;
    public CharSequence r;
    public h0 s;
    public d t;
    public n u;
    public com.amazon.aps.iva.o.a v;
    public int v0;
    public ActionBarContextView w;
    public PopupWindow x;
    public boolean x0;
    public com.amazon.aps.iva.k.j y;
    public Rect y0;
    public Rect z0;
    public r0 z = null;
    public final boolean A = true;
    public final a w0 = new a();

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            g gVar = g.this;
            if ((gVar.v0 & 1) != 0) {
                gVar.K(0);
            }
            if ((gVar.v0 & 4096) != 0) {
                gVar.K(108);
            }
            gVar.k0 = false;
            gVar.v0 = 0;
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class b implements com.amazon.aps.iva.k.b {
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public interface c {
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public final class d implements j.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean a(androidx.appcompat.view.menu.f fVar) {
            Window.Callback P = g.this.P();
            if (P != null) {
                P.onMenuOpened(108, fVar);
                return true;
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void onCloseMenu(androidx.appcompat.view.menu.f fVar, boolean z) {
            g.this.G(fVar);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class e implements a.InterfaceC0549a {
        public final a.InterfaceC0549a a;

        /* compiled from: AppCompatDelegateImpl.java */
        /* loaded from: classes.dex */
        public class a extends k0 {
            public a() {
            }

            @Override // com.amazon.aps.iva.p3.s0
            public final void onAnimationEnd() {
                e eVar = e.this;
                g.this.w.setVisibility(8);
                g gVar = g.this;
                PopupWindow popupWindow = gVar.x;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (gVar.w.getParent() instanceof View) {
                    WeakHashMap<View, r0> weakHashMap = g0.a;
                    g0.h.c((View) gVar.w.getParent());
                }
                gVar.w.h();
                gVar.z.d(null);
                gVar.z = null;
                ViewGroup viewGroup = gVar.C;
                WeakHashMap<View, r0> weakHashMap2 = g0.a;
                g0.h.c(viewGroup);
            }
        }

        public e(a.InterfaceC0549a interfaceC0549a) {
            this.a = interfaceC0549a;
        }

        @Override // com.amazon.aps.iva.o.a.InterfaceC0549a
        public final void a(com.amazon.aps.iva.o.a aVar) {
            this.a.a(aVar);
            g gVar = g.this;
            if (gVar.x != null) {
                gVar.m.getDecorView().removeCallbacks(gVar.y);
            }
            if (gVar.w != null) {
                r0 r0Var = gVar.z;
                if (r0Var != null) {
                    r0Var.b();
                }
                r0 a2 = g0.a(gVar.w);
                a2.a(0.0f);
                gVar.z = a2;
                a2.d(new a());
            }
            com.amazon.aps.iva.k.d dVar = gVar.o;
            if (dVar != null) {
                dVar.onSupportActionModeFinished(gVar.v);
            }
            gVar.v = null;
            ViewGroup viewGroup = gVar.C;
            WeakHashMap<View, r0> weakHashMap = g0.a;
            g0.h.c(viewGroup);
            gVar.X();
        }

        @Override // com.amazon.aps.iva.o.a.InterfaceC0549a
        public final boolean b(com.amazon.aps.iva.o.a aVar, androidx.appcompat.view.menu.f fVar) {
            return this.a.b(aVar, fVar);
        }

        @Override // com.amazon.aps.iva.o.a.InterfaceC0549a
        public final boolean c(com.amazon.aps.iva.o.a aVar, MenuItem menuItem) {
            return this.a.c(aVar, menuItem);
        }

        @Override // com.amazon.aps.iva.o.a.InterfaceC0549a
        public final boolean d(com.amazon.aps.iva.o.a aVar, androidx.appcompat.view.menu.f fVar) {
            ViewGroup viewGroup = g.this.C;
            WeakHashMap<View, r0> weakHashMap = g0.a;
            g0.h.c(viewGroup);
            return this.a.d(aVar, fVar);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public static class f {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (!locales.equals(locales2)) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }

        public static com.amazon.aps.iva.k3.j b(Configuration configuration) {
            return com.amazon.aps.iva.k3.j.a(configuration.getLocales().toLanguageTags());
        }

        public static void c(com.amazon.aps.iva.k3.j jVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(jVar.a.a()));
        }

        public static void d(Configuration configuration, com.amazon.aps.iva.k3.j jVar) {
            configuration.setLocales(LocaleList.forLanguageTags(jVar.a.a()));
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: com.amazon.aps.iva.k.g$g  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0428g {
        public static OnBackInvokedDispatcher a(Activity activity) {
            OnBackInvokedDispatcher onBackInvokedDispatcher;
            onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            return onBackInvokedDispatcher;
        }

        public static OnBackInvokedCallback b(Object obj, g gVar) {
            Objects.requireNonNull(gVar);
            com.amazon.aps.iva.e.s sVar = new com.amazon.aps.iva.e.s(gVar, 1);
            com.amazon.aps.iva.d2.b.b(obj).registerOnBackInvokedCallback(1000000, sVar);
            return sVar;
        }

        public static void c(Object obj, Object obj2) {
            com.amazon.aps.iva.d2.b.b(obj).unregisterOnBackInvokedCallback(com.amazon.aps.iva.d2.a.a(obj2));
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class h extends com.amazon.aps.iva.o.h {
        public c c;
        public boolean d;
        public boolean e;
        public boolean f;

        public h(Window.Callback callback) {
            super(callback);
        }

        public final void a(Window.Callback callback) {
            try {
                this.d = true;
                callback.onContentChanged();
            } finally {
                this.d = false;
            }
        }

        @Override // com.amazon.aps.iva.o.h, android.view.Window.Callback
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.e) {
                return this.b.dispatchKeyEvent(keyEvent);
            }
            if (!g.this.J(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
            if (r6 != false) goto L7;
         */
        /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
        @Override // com.amazon.aps.iva.o.h, android.view.Window.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r6) {
            /*
                r5 = this;
                boolean r0 = super.dispatchKeyShortcutEvent(r6)
                r1 = 1
                if (r0 != 0) goto L4f
                int r0 = r6.getKeyCode()
                com.amazon.aps.iva.k.g r2 = com.amazon.aps.iva.k.g.this
                r2.Q()
                com.amazon.aps.iva.k.a r3 = r2.p
                r4 = 0
                if (r3 == 0) goto L1c
                boolean r0 = r3.i(r0, r6)
                if (r0 == 0) goto L1c
                goto L48
            L1c:
                com.amazon.aps.iva.k.g$m r0 = r2.O
                if (r0 == 0) goto L31
                int r3 = r6.getKeyCode()
                boolean r0 = r2.U(r0, r3, r6)
                if (r0 == 0) goto L31
                com.amazon.aps.iva.k.g$m r6 = r2.O
                if (r6 == 0) goto L48
                r6.l = r1
                goto L48
            L31:
                com.amazon.aps.iva.k.g$m r0 = r2.O
                if (r0 != 0) goto L4a
                com.amazon.aps.iva.k.g$m r0 = r2.O(r4)
                r2.V(r0, r6)
                int r3 = r6.getKeyCode()
                boolean r6 = r2.U(r0, r3, r6)
                r0.k = r4
                if (r6 == 0) goto L4a
            L48:
                r6 = r1
                goto L4b
            L4a:
                r6 = r4
            L4b:
                if (r6 == 0) goto L4e
                goto L4f
            L4e:
                r1 = r4
            L4f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.k.g.h.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
        }

        @Override // com.amazon.aps.iva.o.h, android.view.Window.Callback
        public final void onContentChanged() {
            if (this.d) {
                this.b.onContentChanged();
            }
        }

        @Override // com.amazon.aps.iva.o.h, android.view.Window.Callback
        public final boolean onCreatePanelMenu(int i, Menu menu) {
            if (i == 0 && !(menu instanceof androidx.appcompat.view.menu.f)) {
                return false;
            }
            return super.onCreatePanelMenu(i, menu);
        }

        @Override // com.amazon.aps.iva.o.h, android.view.Window.Callback
        public final View onCreatePanelView(int i) {
            View view;
            c cVar = this.c;
            if (cVar != null) {
                x.e eVar = (x.e) cVar;
                if (i == 0) {
                    view = new View(x.this.a.getContext());
                } else {
                    view = null;
                }
                if (view != null) {
                    return view;
                }
            }
            return super.onCreatePanelView(i);
        }

        @Override // com.amazon.aps.iva.o.h, android.view.Window.Callback
        public final boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            g gVar = g.this;
            if (i == 108) {
                gVar.Q();
                com.amazon.aps.iva.k.a aVar = gVar.p;
                if (aVar != null) {
                    aVar.c(true);
                }
            } else {
                gVar.getClass();
            }
            return true;
        }

        @Override // com.amazon.aps.iva.o.h, android.view.Window.Callback
        public final void onPanelClosed(int i, Menu menu) {
            if (this.f) {
                this.b.onPanelClosed(i, menu);
                return;
            }
            super.onPanelClosed(i, menu);
            g gVar = g.this;
            if (i == 108) {
                gVar.Q();
                com.amazon.aps.iva.k.a aVar = gVar.p;
                if (aVar != null) {
                    aVar.c(false);
                }
            } else if (i == 0) {
                m O = gVar.O(i);
                if (O.m) {
                    gVar.H(O, false);
                }
            } else {
                gVar.getClass();
            }
        }

        @Override // com.amazon.aps.iva.o.h, android.view.Window.Callback
        public final boolean onPreparePanel(int i, View view, Menu menu) {
            androidx.appcompat.view.menu.f fVar;
            if (menu instanceof androidx.appcompat.view.menu.f) {
                fVar = (androidx.appcompat.view.menu.f) menu;
            } else {
                fVar = null;
            }
            if (i == 0 && fVar == null) {
                return false;
            }
            if (fVar != null) {
                fVar.setOverrideVisibleItems(true);
            }
            c cVar = this.c;
            if (cVar != null) {
                x.e eVar = (x.e) cVar;
                if (i == 0) {
                    x xVar = x.this;
                    if (!xVar.d) {
                        xVar.a.m = true;
                        xVar.d = true;
                    }
                }
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (fVar != null) {
                fVar.setOverrideVisibleItems(false);
            }
            return onPreparePanel;
        }

        @Override // com.amazon.aps.iva.o.h, android.view.Window.Callback
        public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            androidx.appcompat.view.menu.f fVar = g.this.O(0).h;
            if (fVar != null) {
                super.onProvideKeyboardShortcuts(list, fVar, i);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i);
            }
        }

        @Override // com.amazon.aps.iva.o.h, android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // com.amazon.aps.iva.o.h, android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            g gVar = g.this;
            if (gVar.A && i == 0) {
                e.a aVar = new e.a(gVar.l, callback);
                com.amazon.aps.iva.o.a B = gVar.B(aVar);
                if (B != null) {
                    return aVar.e(B);
                }
                return null;
            }
            return super.onWindowStartingActionMode(callback, i);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class i extends j {
        public final PowerManager c;

        public i(Context context) {
            super();
            this.c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // com.amazon.aps.iva.k.g.j
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // com.amazon.aps.iva.k.g.j
        public final int c() {
            if (this.c.isPowerSaveMode()) {
                return 2;
            }
            return 1;
        }

        @Override // com.amazon.aps.iva.k.g.j
        public final void d() {
            g.this.C(true, true);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public abstract class j {
        public a a;

        /* compiled from: AppCompatDelegateImpl.java */
        /* loaded from: classes.dex */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                j.this.d();
            }
        }

        public j() {
        }

        public final void a() {
            a aVar = this.a;
            if (aVar != null) {
                try {
                    g.this.l.unregisterReceiver(aVar);
                } catch (IllegalArgumentException unused) {
                }
                this.a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public final void e() {
            a();
            IntentFilter b = b();
            if (b != null && b.countActions() != 0) {
                if (this.a == null) {
                    this.a = new a();
                }
                g.this.l.registerReceiver(this.a, b);
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class k extends j {
        public final z c;

        public k(z zVar) {
            super();
            this.c = zVar;
        }

        @Override // com.amazon.aps.iva.k.g.j
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00da  */
        @Override // com.amazon.aps.iva.k.g.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int c() {
            /*
                Method dump skipped, instructions count: 241
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.k.g.k.c():int");
        }

        @Override // com.amazon.aps.iva.k.g.j
        public final void d() {
            g.this.C(true, true);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class l extends ContentFrameLayout {
        public l(com.amazon.aps.iva.o.c cVar) {
            super(cVar, null);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (!g.this.J(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }

        @Override // android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            boolean z;
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x >= -5 && y >= -5 && x <= getWidth() + 5 && y <= getHeight() + 5) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    g gVar = g.this;
                    gVar.H(gVar.O(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public final void setBackgroundResource(int i) {
            setBackgroundDrawable(com.amazon.aps.iva.l.a.a(getContext(), i));
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public static final class m {
        public final int a;
        public int b;
        public int c;
        public int d;
        public l e;
        public View f;
        public View g;
        public androidx.appcompat.view.menu.f h;
        public androidx.appcompat.view.menu.d i;
        public com.amazon.aps.iva.o.c j;
        public boolean k;
        public boolean l;
        public boolean m;
        public boolean n = false;
        public boolean o;
        public Bundle p;

        public m(int i) {
            this.a = i;
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public final class n implements j.a {
        public n() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean a(androidx.appcompat.view.menu.f fVar) {
            Window.Callback P;
            if (fVar == fVar.getRootMenu()) {
                g gVar = g.this;
                if (gVar.H && (P = gVar.P()) != null && !gVar.S) {
                    P.onMenuOpened(108, fVar);
                    return true;
                }
                return true;
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void onCloseMenu(androidx.appcompat.view.menu.f fVar, boolean z) {
            boolean z2;
            int i;
            m mVar;
            androidx.appcompat.view.menu.f rootMenu = fVar.getRootMenu();
            int i2 = 0;
            if (rootMenu != fVar) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                fVar = rootMenu;
            }
            g gVar = g.this;
            m[] mVarArr = gVar.N;
            if (mVarArr != null) {
                i = mVarArr.length;
            } else {
                i = 0;
            }
            while (true) {
                if (i2 < i) {
                    mVar = mVarArr[i2];
                    if (mVar != null && mVar.h == fVar) {
                        break;
                    }
                    i2++;
                } else {
                    mVar = null;
                    break;
                }
            }
            if (mVar != null) {
                if (z2) {
                    gVar.F(mVar.a, mVar, rootMenu);
                    gVar.H(mVar, true);
                    return;
                }
                gVar.H(mVar, z);
            }
        }
    }

    public g(Context context, Window window, com.amazon.aps.iva.k.d dVar, Object obj) {
        com.amazon.aps.iva.x.h<String, Integer> hVar;
        Integer orDefault;
        com.amazon.aps.iva.k.c cVar;
        this.U = -100;
        this.l = context;
        this.o = dVar;
        this.k = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (context instanceof com.amazon.aps.iva.k.c) {
                    cVar = (com.amazon.aps.iva.k.c) context;
                    break;
                } else if (!(context instanceof ContextWrapper)) {
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            cVar = null;
            if (cVar != null) {
                this.U = cVar.getDelegate().f();
            }
        }
        if (this.U == -100 && (orDefault = (hVar = D0).getOrDefault(this.k.getClass().getName(), null)) != null) {
            this.U = orDefault.intValue();
            hVar.remove(this.k.getClass().getName());
        }
        if (window != null) {
            D(window);
        }
        com.amazon.aps.iva.q.j.d();
    }

    public static com.amazon.aps.iva.k3.j E(Context context) {
        com.amazon.aps.iva.k3.j jVar;
        com.amazon.aps.iva.k3.j jVar2;
        Locale locale;
        if (Build.VERSION.SDK_INT >= 33 || (jVar = com.amazon.aps.iva.k.f.d) == null) {
            return null;
        }
        com.amazon.aps.iva.k3.j b2 = f.b(context.getApplicationContext().getResources().getConfiguration());
        if (jVar.b()) {
            jVar2 = com.amazon.aps.iva.k3.j.b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i2 = 0;
            while (true) {
                com.amazon.aps.iva.k3.k kVar = jVar.a;
                if (i2 >= b2.a.size() + kVar.size()) {
                    break;
                }
                if (i2 < kVar.size()) {
                    locale = kVar.get(i2);
                } else {
                    locale = b2.a.get(i2 - kVar.size());
                }
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i2++;
            }
            jVar2 = new com.amazon.aps.iva.k3.j(new com.amazon.aps.iva.k3.l(j.b.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        if (!jVar2.b()) {
            return jVar2;
        }
        return b2;
    }

    public static Configuration I(Context context, int i2, com.amazon.aps.iva.k3.j jVar, Configuration configuration, boolean z) {
        int i3;
        if (i2 != 1) {
            if (i2 != 2) {
                if (z) {
                    i3 = 0;
                } else {
                    i3 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
                }
            } else {
                i3 = 32;
            }
        } else {
            i3 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        if (jVar != null) {
            f.d(configuration2, jVar);
        }
        return configuration2;
    }

    @Override // com.amazon.aps.iva.k.f
    public final void A(CharSequence charSequence) {
        this.r = charSequence;
        h0 h0Var = this.s;
        if (h0Var != null) {
            h0Var.setWindowTitle(charSequence);
            return;
        }
        com.amazon.aps.iva.k.a aVar = this.p;
        if (aVar != null) {
            aVar.t(charSequence);
            return;
        }
        TextView textView = this.D;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x013c, code lost:
        if (com.amazon.aps.iva.p3.g0.g.c(r9) != false) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0049  */
    @Override // com.amazon.aps.iva.k.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.o.a B(com.amazon.aps.iva.o.a.InterfaceC0549a r9) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.k.g.B(com.amazon.aps.iva.o.a$a):com.amazon.aps.iva.o.a");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0167 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean C(boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.k.g.C(boolean, boolean):boolean");
    }

    public final void D(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.m == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof h)) {
                h hVar = new h(callback);
                this.n = hVar;
                window.setCallback(hVar);
                Context context = this.l;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, E0);
                if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                    com.amazon.aps.iva.q.j a2 = com.amazon.aps.iva.q.j.a();
                    synchronized (a2) {
                        drawable = a2.a.f(context, resourceId, true);
                    }
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.m = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.B0) == null) {
                    if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.C0) != null) {
                        C0428g.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.C0 = null;
                    }
                    Object obj = this.k;
                    if (obj instanceof Activity) {
                        Activity activity = (Activity) obj;
                        if (activity.getWindow() != null) {
                            this.B0 = C0428g.a(activity);
                            X();
                            return;
                        }
                    }
                    this.B0 = null;
                    X();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public final void F(int i2, m mVar, androidx.appcompat.view.menu.f fVar) {
        if (fVar == null) {
            if (mVar == null && i2 >= 0) {
                m[] mVarArr = this.N;
                if (i2 < mVarArr.length) {
                    mVar = mVarArr[i2];
                }
            }
            if (mVar != null) {
                fVar = mVar.h;
            }
        }
        if ((mVar == null || mVar.m) && !this.S) {
            h hVar = this.n;
            Window.Callback callback = this.m.getCallback();
            hVar.getClass();
            try {
                hVar.f = true;
                callback.onPanelClosed(i2, fVar);
            } finally {
                hVar.f = false;
            }
        }
    }

    public final void G(androidx.appcompat.view.menu.f fVar) {
        if (this.M) {
            return;
        }
        this.M = true;
        this.s.i();
        Window.Callback P = P();
        if (P != null && !this.S) {
            P.onPanelClosed(108, fVar);
        }
        this.M = false;
    }

    public final void H(m mVar, boolean z) {
        l lVar;
        h0 h0Var;
        if (z && mVar.a == 0 && (h0Var = this.s) != null && h0Var.d()) {
            G(mVar.h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.l.getSystemService("window");
        if (windowManager != null && mVar.m && (lVar = mVar.e) != null) {
            windowManager.removeView(lVar);
            if (z) {
                F(mVar.a, mVar, null);
            }
        }
        mVar.k = false;
        mVar.l = false;
        mVar.m = false;
        mVar.f = null;
        mVar.n = true;
        if (this.O == mVar) {
            this.O = null;
        }
        if (mVar.a == 0) {
            X();
        }
    }

    public final boolean J(KeyEvent keyEvent) {
        View decorView;
        boolean z;
        boolean z2;
        boolean z3;
        AudioManager audioManager;
        Object obj = this.k;
        boolean z4 = true;
        if (((obj instanceof g.a) || (obj instanceof o)) && (decorView = this.m.getDecorView()) != null && com.amazon.aps.iva.p3.g.a(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82) {
            h hVar = this.n;
            Window.Callback callback = this.m.getCallback();
            hVar.getClass();
            try {
                hVar.e = true;
                if (callback.dispatchKeyEvent(keyEvent)) {
                    return true;
                }
            } finally {
                hVar.e = false;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (keyEvent.getRepeatCount() != 0) {
                        return true;
                    }
                    m O = O(0);
                    if (O.m) {
                        return true;
                    }
                    V(O, keyEvent);
                    return true;
                }
            } else {
                if ((keyEvent.getFlags() & 128) == 0) {
                    z4 = false;
                }
                this.P = z4;
            }
        } else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.v != null) {
                    return true;
                }
                m O2 = O(0);
                h0 h0Var = this.s;
                Context context = this.l;
                if (h0Var != null && h0Var.a() && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    if (!this.s.d()) {
                        if (!this.S && V(O2, keyEvent)) {
                            z2 = this.s.c();
                        }
                        z2 = false;
                    } else {
                        z2 = this.s.b();
                    }
                } else {
                    boolean z5 = O2.m;
                    if (!z5 && !O2.l) {
                        if (O2.k) {
                            if (O2.o) {
                                O2.k = false;
                                z3 = V(O2, keyEvent);
                            } else {
                                z3 = true;
                            }
                            if (z3) {
                                T(O2, keyEvent);
                                z2 = true;
                            }
                        }
                        z2 = false;
                    } else {
                        H(O2, true);
                        z2 = z5;
                    }
                }
                if (!z2 || (audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio")) == null) {
                    return true;
                }
                audioManager.playSoundEffect(0);
                return true;
            }
        } else if (S()) {
            return true;
        }
        return false;
    }

    public final void K(int i2) {
        m O = O(i2);
        if (O.h != null) {
            Bundle bundle = new Bundle();
            O.h.saveActionViewStates(bundle);
            if (bundle.size() > 0) {
                O.p = bundle;
            }
            O.h.stopDispatchingItemsChanged();
            O.h.clear();
        }
        O.o = true;
        O.n = true;
        if ((i2 == 108 || i2 == 0) && this.s != null) {
            m O2 = O(0);
            O2.k = false;
            V(O2, null);
        }
    }

    public final void L() {
        ViewGroup viewGroup;
        CharSequence charSequence;
        Context context;
        if (!this.B) {
            int[] iArr = com.amazon.aps.iva.j.a.j;
            Context context2 = this.l;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            if (obtainStyledAttributes.hasValue(117)) {
                if (obtainStyledAttributes.getBoolean(WebSocketProtocol.PAYLOAD_SHORT, false)) {
                    u(1);
                } else if (obtainStyledAttributes.getBoolean(117, false)) {
                    u(108);
                }
                if (obtainStyledAttributes.getBoolean(118, false)) {
                    u(109);
                }
                if (obtainStyledAttributes.getBoolean(119, false)) {
                    u(10);
                }
                this.K = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                M();
                this.m.getDecorView();
                LayoutInflater from = LayoutInflater.from(context2);
                if (!this.L) {
                    if (this.K) {
                        viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
                        this.I = false;
                        this.H = false;
                    } else if (this.H) {
                        TypedValue typedValue = new TypedValue();
                        context2.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            context = new com.amazon.aps.iva.o.c(context2, typedValue.resourceId);
                        } else {
                            context = context2;
                        }
                        viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
                        h0 h0Var = (h0) viewGroup.findViewById(R.id.decor_content_parent);
                        this.s = h0Var;
                        h0Var.setWindowCallback(P());
                        if (this.I) {
                            this.s.h(109);
                        }
                        if (this.F) {
                            this.s.h(2);
                        }
                        if (this.G) {
                            this.s.h(5);
                        }
                    } else {
                        viewGroup = null;
                    }
                } else {
                    viewGroup = this.J ? (ViewGroup) from.inflate(R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(R.layout.abc_screen_simple, (ViewGroup) null);
                }
                if (viewGroup != null) {
                    com.amazon.aps.iva.k.h hVar = new com.amazon.aps.iva.k.h(this);
                    WeakHashMap<View, r0> weakHashMap = g0.a;
                    g0.i.u(viewGroup, hVar);
                    if (this.s == null) {
                        this.D = (TextView) viewGroup.findViewById(R.id.title);
                    }
                    Method method = m1.a;
                    try {
                        Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                        if (!method2.isAccessible()) {
                            method2.setAccessible(true);
                        }
                        method2.invoke(viewGroup, new Object[0]);
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.m.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground(null);
                        }
                    }
                    this.m.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new com.amazon.aps.iva.k.i(this));
                    this.C = viewGroup;
                    Object obj = this.k;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.r;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        h0 h0Var2 = this.s;
                        if (h0Var2 != null) {
                            h0Var2.setWindowTitle(charSequence);
                        } else {
                            com.amazon.aps.iva.k.a aVar = this.p;
                            if (aVar != null) {
                                aVar.t(charSequence);
                            } else {
                                TextView textView = this.D;
                                if (textView != null) {
                                    textView.setText(charSequence);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.C.findViewById(16908290);
                    View decorView = this.m.getDecorView();
                    contentFrameLayout2.h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    WeakHashMap<View, r0> weakHashMap2 = g0.a;
                    if (g0.g.c(contentFrameLayout2)) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(iArr);
                    obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(122)) {
                        obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(123)) {
                        obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(120)) {
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.B = true;
                    m O = O(0);
                    if (!this.S && O.h == null) {
                        this.v0 |= 4096;
                        if (!this.k0) {
                            g0.d.m(this.m.getDecorView(), this.w0);
                            this.k0 = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
                sb.append(this.H);
                sb.append(", windowActionBarOverlay: ");
                sb.append(this.I);
                sb.append(", android:windowIsFloating: ");
                sb.append(this.K);
                sb.append(", windowActionModeOverlay: ");
                sb.append(this.J);
                sb.append(", windowNoTitle: ");
                throw new IllegalArgumentException(com.amazon.aps.iva.e4.e.c(sb, this.L, " }"));
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void M() {
        if (this.m == null) {
            Object obj = this.k;
            if (obj instanceof Activity) {
                D(((Activity) obj).getWindow());
            }
        }
        if (this.m != null) {
            return;
        }
        throw new IllegalStateException("We have not been given a Window");
    }

    public final j N(Context context) {
        if (this.Y == null) {
            if (z.d == null) {
                Context applicationContext = context.getApplicationContext();
                z.d = new z(applicationContext, (LocationManager) applicationContext.getSystemService(FirebaseAnalytics.Param.LOCATION));
            }
            this.Y = new k(z.d);
        }
        return this.Y;
    }

    public final m O(int i2) {
        m[] mVarArr = this.N;
        if (mVarArr == null || mVarArr.length <= i2) {
            m[] mVarArr2 = new m[i2 + 1];
            if (mVarArr != null) {
                System.arraycopy(mVarArr, 0, mVarArr2, 0, mVarArr.length);
            }
            this.N = mVarArr2;
            mVarArr = mVarArr2;
        }
        m mVar = mVarArr[i2];
        if (mVar == null) {
            m mVar2 = new m(i2);
            mVarArr[i2] = mVar2;
            return mVar2;
        }
        return mVar;
    }

    public final Window.Callback P() {
        return this.m.getCallback();
    }

    public final void Q() {
        L();
        if (this.H && this.p == null) {
            Object obj = this.k;
            if (obj instanceof Activity) {
                this.p = new a0((Activity) obj, this.I);
            } else if (obj instanceof Dialog) {
                this.p = new a0((Dialog) obj);
            }
            com.amazon.aps.iva.k.a aVar = this.p;
            if (aVar != null) {
                aVar.l(this.x0);
            }
        }
    }

    public final int R(int i2, Context context) {
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 != 0) {
                if (i2 != 1 && i2 != 2) {
                    if (i2 == 3) {
                        if (this.Z == null) {
                            this.Z = new i(context);
                        }
                        return this.Z.c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
                return i2;
            } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                return N(context).c();
            }
        }
        return i2;
    }

    public final boolean S() {
        boolean z = this.P;
        this.P = false;
        m O = O(0);
        if (O.m) {
            if (!z) {
                H(O, true);
            }
            return true;
        }
        com.amazon.aps.iva.o.a aVar = this.v;
        if (aVar != null) {
            aVar.a();
            return true;
        }
        Q();
        com.amazon.aps.iva.k.a aVar2 = this.p;
        if (aVar2 == null || !aVar2.b()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0152, code lost:
        if (r2 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0176, code lost:
        if (r2.g.getCount() > 0) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T(com.amazon.aps.iva.k.g.m r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.k.g.T(com.amazon.aps.iva.k.g$m, android.view.KeyEvent):void");
    }

    public final boolean U(m mVar, int i2, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.f fVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((!mVar.k && !V(mVar, keyEvent)) || (fVar = mVar.h) == null) {
            return false;
        }
        return fVar.performShortcut(i2, keyEvent, 1);
    }

    public final boolean V(m mVar, KeyEvent keyEvent) {
        boolean z;
        h0 h0Var;
        h0 h0Var2;
        Resources.Theme theme;
        int i2;
        boolean z2;
        h0 h0Var3;
        h0 h0Var4;
        if (this.S) {
            return false;
        }
        if (mVar.k) {
            return true;
        }
        m mVar2 = this.O;
        if (mVar2 != null && mVar2 != mVar) {
            H(mVar2, false);
        }
        Window.Callback P = P();
        int i3 = mVar.a;
        if (P != null) {
            mVar.g = P.onCreatePanelView(i3);
        }
        if (i3 != 0 && i3 != 108) {
            z = false;
        } else {
            z = true;
        }
        if (z && (h0Var4 = this.s) != null) {
            h0Var4.e();
        }
        if (mVar.g == null && (!z || !(this.p instanceof x))) {
            androidx.appcompat.view.menu.f fVar = mVar.h;
            if (fVar == null || mVar.o) {
                if (fVar == null) {
                    Context context = this.l;
                    if ((i3 == 0 || i3 == 108) && this.s != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            com.amazon.aps.iva.o.c cVar = new com.amazon.aps.iva.o.c(context, 0);
                            cVar.getTheme().setTo(theme);
                            context = cVar;
                        }
                    }
                    androidx.appcompat.view.menu.f fVar2 = new androidx.appcompat.view.menu.f(context);
                    fVar2.setCallback(this);
                    androidx.appcompat.view.menu.f fVar3 = mVar.h;
                    if (fVar2 != fVar3) {
                        if (fVar3 != null) {
                            fVar3.removeMenuPresenter(mVar.i);
                        }
                        mVar.h = fVar2;
                        androidx.appcompat.view.menu.d dVar = mVar.i;
                        if (dVar != null) {
                            fVar2.addMenuPresenter(dVar);
                        }
                    }
                    if (mVar.h == null) {
                        return false;
                    }
                }
                if (z && (h0Var2 = this.s) != null) {
                    if (this.t == null) {
                        this.t = new d();
                    }
                    h0Var2.f(mVar.h, this.t);
                }
                mVar.h.stopDispatchingItemsChanged();
                if (!P.onCreatePanelMenu(i3, mVar.h)) {
                    androidx.appcompat.view.menu.f fVar4 = mVar.h;
                    if (fVar4 != null) {
                        if (fVar4 != null) {
                            fVar4.removeMenuPresenter(mVar.i);
                        }
                        mVar.h = null;
                    }
                    if (z && (h0Var = this.s) != null) {
                        h0Var.f(null, this.t);
                    }
                    return false;
                }
                mVar.o = false;
            }
            mVar.h.stopDispatchingItemsChanged();
            Bundle bundle = mVar.p;
            if (bundle != null) {
                mVar.h.restoreActionViewStates(bundle);
                mVar.p = null;
            }
            if (!P.onPreparePanel(0, mVar.g, mVar.h)) {
                if (z && (h0Var3 = this.s) != null) {
                    h0Var3.f(null, this.t);
                }
                mVar.h.startDispatchingItemsChanged();
                return false;
            }
            if (keyEvent != null) {
                i2 = keyEvent.getDeviceId();
            } else {
                i2 = -1;
            }
            if (KeyCharacterMap.load(i2).getKeyboardType() != 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            mVar.h.setQwertyMode(z2);
            mVar.h.startDispatchingItemsChanged();
        }
        mVar.k = true;
        mVar.l = false;
        this.O = mVar;
        return true;
    }

    public final void W() {
        if (!this.B) {
            return;
        }
        throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }

    public final void X() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.B0 != null && (O(0).m || this.v != null)) {
                z = true;
            }
            if (z && this.C0 == null) {
                this.C0 = C0428g.b(this.B0, this);
            } else if (!z && (onBackInvokedCallback = this.C0) != null) {
                C0428g.c(this.B0, onBackInvokedCallback);
            }
        }
    }

    @Override // com.amazon.aps.iva.k.f
    public final void a(View view, ViewGroup.LayoutParams layoutParams) {
        L();
        ((ViewGroup) this.C.findViewById(16908290)).addView(view, layoutParams);
        this.n.a(this.m.getCallback());
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x01d6  */
    @Override // com.amazon.aps.iva.k.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.Context b(final android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.k.g.b(android.content.Context):android.content.Context");
    }

    @Override // com.amazon.aps.iva.k.f
    public final <T extends View> T c(int i2) {
        L();
        return (T) this.m.findViewById(i2);
    }

    @Override // com.amazon.aps.iva.k.f
    public final Context d() {
        return this.l;
    }

    @Override // com.amazon.aps.iva.k.f
    public final com.amazon.aps.iva.k.b e() {
        return new b();
    }

    @Override // com.amazon.aps.iva.k.f
    public final int f() {
        return this.U;
    }

    @Override // com.amazon.aps.iva.k.f
    public final MenuInflater g() {
        Context context;
        if (this.q == null) {
            Q();
            com.amazon.aps.iva.k.a aVar = this.p;
            if (aVar != null) {
                context = aVar.e();
            } else {
                context = this.l;
            }
            this.q = new com.amazon.aps.iva.o.f(context);
        }
        return this.q;
    }

    @Override // com.amazon.aps.iva.k.f
    public final com.amazon.aps.iva.k.a h() {
        Q();
        return this.p;
    }

    @Override // com.amazon.aps.iva.k.f
    public final void i() {
        LayoutInflater from = LayoutInflater.from(this.l);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            boolean z = from.getFactory2() instanceof g;
        }
    }

    @Override // com.amazon.aps.iva.k.f
    public final void j() {
        if (this.p != null) {
            Q();
            if (!this.p.f()) {
                this.v0 |= 1;
                if (!this.k0) {
                    View decorView = this.m.getDecorView();
                    WeakHashMap<View, r0> weakHashMap = g0.a;
                    g0.d.m(decorView, this.w0);
                    this.k0 = true;
                }
            }
        }
    }

    @Override // com.amazon.aps.iva.k.f
    public final void l(Configuration configuration) {
        if (this.H && this.B) {
            Q();
            com.amazon.aps.iva.k.a aVar = this.p;
            if (aVar != null) {
                aVar.g();
            }
        }
        com.amazon.aps.iva.q.j a2 = com.amazon.aps.iva.q.j.a();
        Context context = this.l;
        synchronized (a2) {
            u0 u0Var = a2.a;
            synchronized (u0Var) {
                com.amazon.aps.iva.x.f<WeakReference<Drawable.ConstantState>> fVar = u0Var.b.get(context);
                if (fVar != null) {
                    fVar.a();
                }
            }
        }
        this.T = new Configuration(this.l.getResources().getConfiguration());
        C(false, false);
    }

    @Override // com.amazon.aps.iva.k.f
    public final void m(Bundle bundle) {
        String str;
        this.Q = true;
        C(false, true);
        M();
        Object obj = this.k;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = com.amazon.aps.iva.c3.l.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                com.amazon.aps.iva.k.a aVar = this.p;
                if (aVar == null) {
                    this.x0 = true;
                } else {
                    aVar.l(true);
                }
            }
            synchronized (com.amazon.aps.iva.k.f.i) {
                com.amazon.aps.iva.k.f.t(this);
                com.amazon.aps.iva.k.f.h.add(new WeakReference<>(this));
            }
        }
        this.T = new Configuration(this.l.getResources().getConfiguration());
        this.R = true;
    }

    @Override // com.amazon.aps.iva.k.f
    public final void n() {
        Object obj = this.k;
        boolean z = obj instanceof Activity;
        if (z) {
            synchronized (com.amazon.aps.iva.k.f.i) {
                com.amazon.aps.iva.k.f.t(this);
            }
        }
        if (this.k0) {
            this.m.getDecorView().removeCallbacks(this.w0);
        }
        this.S = true;
        com.amazon.aps.iva.x.h<String, Integer> hVar = D0;
        int i2 = this.U;
        if (i2 != -100 && z && ((Activity) obj).isChangingConfigurations()) {
            hVar.put(obj.getClass().getName(), Integer.valueOf(i2));
        } else {
            hVar.remove(obj.getClass().getName());
        }
        com.amazon.aps.iva.k.a aVar = this.p;
        if (aVar != null) {
            aVar.h();
        }
        k kVar = this.Y;
        if (kVar != null) {
            kVar.a();
        }
        i iVar = this.Z;
        if (iVar != null) {
            iVar.a();
        }
    }

    @Override // com.amazon.aps.iva.k.f
    public final void o(Bundle bundle) {
        L();
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (this.A0 == null) {
            int[] iArr = com.amazon.aps.iva.j.a.j;
            Context context2 = this.l;
            String string = context2.obtainStyledAttributes(iArr).getString(116);
            if (string == null) {
                this.A0 = new r();
            } else {
                try {
                    this.A0 = (r) context2.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable unused) {
                    this.A0 = new r();
                }
            }
        }
        r rVar = this.A0;
        int i2 = l1.a;
        return rVar.createView(view, str, context, attributeSet, false, false, true, false);
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final boolean onMenuItemSelected(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        int i2;
        int i3;
        m mVar;
        Window.Callback P = P();
        if (P != null && !this.S) {
            androidx.appcompat.view.menu.f rootMenu = fVar.getRootMenu();
            m[] mVarArr = this.N;
            if (mVarArr != null) {
                i2 = mVarArr.length;
                i3 = 0;
            } else {
                i2 = 0;
                i3 = 0;
            }
            while (true) {
                if (i3 < i2) {
                    mVar = mVarArr[i3];
                    if (mVar != null && mVar.h == rootMenu) {
                        break;
                    }
                    i3++;
                } else {
                    mVar = null;
                    break;
                }
            }
            if (mVar != null) {
                return P.onMenuItemSelected(mVar.a, menuItem);
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final void onMenuModeChange(androidx.appcompat.view.menu.f fVar) {
        h0 h0Var = this.s;
        if (h0Var != null && h0Var.a() && (!ViewConfiguration.get(this.l).hasPermanentMenuKey() || this.s.g())) {
            Window.Callback P = P();
            if (this.s.d()) {
                this.s.b();
                if (!this.S) {
                    P.onPanelClosed(108, O(0).h);
                    return;
                }
                return;
            } else if (P != null && !this.S) {
                if (this.k0 && (1 & this.v0) != 0) {
                    View decorView = this.m.getDecorView();
                    a aVar = this.w0;
                    decorView.removeCallbacks(aVar);
                    aVar.run();
                }
                m O = O(0);
                androidx.appcompat.view.menu.f fVar2 = O.h;
                if (fVar2 != null && !O.o && P.onPreparePanel(0, O.g, fVar2)) {
                    P.onMenuOpened(108, O.h);
                    this.s.c();
                    return;
                }
                return;
            } else {
                return;
            }
        }
        m O2 = O(0);
        O2.n = true;
        H(O2, false);
        T(O2, null);
    }

    @Override // com.amazon.aps.iva.k.f
    public final void p() {
        Q();
        com.amazon.aps.iva.k.a aVar = this.p;
        if (aVar != null) {
            aVar.q(true);
        }
    }

    @Override // com.amazon.aps.iva.k.f
    public final void r() {
        C(true, false);
    }

    @Override // com.amazon.aps.iva.k.f
    public final void s() {
        Q();
        com.amazon.aps.iva.k.a aVar = this.p;
        if (aVar != null) {
            aVar.q(false);
        }
    }

    @Override // com.amazon.aps.iva.k.f
    public final boolean u(int i2) {
        if (i2 == 8) {
            i2 = 108;
        } else if (i2 == 9) {
            i2 = 109;
        }
        if (this.L && i2 == 108) {
            return false;
        }
        if (this.H && i2 == 1) {
            this.H = false;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 5) {
                    if (i2 != 10) {
                        if (i2 != 108) {
                            if (i2 != 109) {
                                return this.m.requestFeature(i2);
                            }
                            W();
                            this.I = true;
                            return true;
                        }
                        W();
                        this.H = true;
                        return true;
                    }
                    W();
                    this.J = true;
                    return true;
                }
                W();
                this.G = true;
                return true;
            }
            W();
            this.F = true;
            return true;
        }
        W();
        this.L = true;
        return true;
    }

    @Override // com.amazon.aps.iva.k.f
    public final void v(int i2) {
        L();
        ViewGroup viewGroup = (ViewGroup) this.C.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.l).inflate(i2, viewGroup);
        this.n.a(this.m.getCallback());
    }

    @Override // com.amazon.aps.iva.k.f
    public final void w(View view) {
        L();
        ViewGroup viewGroup = (ViewGroup) this.C.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.n.a(this.m.getCallback());
    }

    @Override // com.amazon.aps.iva.k.f
    public final void x(View view, ViewGroup.LayoutParams layoutParams) {
        L();
        ViewGroup viewGroup = (ViewGroup) this.C.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.n.a(this.m.getCallback());
    }

    @Override // com.amazon.aps.iva.k.f
    public final void y(Toolbar toolbar) {
        CharSequence charSequence;
        Object obj = this.k;
        if (!(obj instanceof Activity)) {
            return;
        }
        Q();
        com.amazon.aps.iva.k.a aVar = this.p;
        if (!(aVar instanceof a0)) {
            this.q = null;
            if (aVar != null) {
                aVar.h();
            }
            this.p = null;
            if (toolbar != null) {
                if (obj instanceof Activity) {
                    charSequence = ((Activity) obj).getTitle();
                } else {
                    charSequence = this.r;
                }
                x xVar = new x(toolbar, charSequence, this.n);
                this.p = xVar;
                this.n.c = xVar.c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.n.c = null;
            }
            j();
            return;
        }
        throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
    }

    @Override // com.amazon.aps.iva.k.f
    public final void z(int i2) {
        this.V = i2;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // com.amazon.aps.iva.k.f
    public final void q(Bundle bundle) {
    }
}

package c.b.c;

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
import android.os.Build;
import android.os.Bundle;
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
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import c.b.h.a;
import c.b.h.i.g;
import c.b.h.i.m;
import c.b.i.a1;
import c.b.i.c0;
import c.b.i.g0;
import c.b.i.g1;
import c.b.i.q0;
import c.i.k.d0;
import c.i.k.f0;
import c.i.k.h0;
import c.i.k.j0;
import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.rolling.helper.Compressor;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class o extends n implements g.a, LayoutInflater.Factory2 {

    /* renamed from: d  reason: collision with root package name */
    public static final c.f.h<String, Integer> f821d = new c.f.h<>();

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f822e;

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f823f;

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f824g;

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f825h;

    /* renamed from: i  reason: collision with root package name */
    public static boolean f826i;
    public boolean A;
    public ViewGroup B;
    public TextView C;
    public View D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public j[] M;
    public j N;
    public boolean O;
    public boolean P;
    public boolean U;
    public boolean V;
    public boolean W;
    public int X;
    public int Y;
    public boolean Z;
    public boolean a0;
    public g b0;
    public g c0;
    public boolean d0;
    public int e0;
    public boolean g0;
    public Rect h0;
    public Rect i0;

    /* renamed from: j  reason: collision with root package name */
    public final Object f827j;
    public w j0;

    /* renamed from: k  reason: collision with root package name */
    public final Context f828k;
    public x k0;

    /* renamed from: l  reason: collision with root package name */
    public Window f829l;

    /* renamed from: m  reason: collision with root package name */
    public e f830m;

    /* renamed from: n  reason: collision with root package name */
    public final m f831n;
    public c.b.c.a o;
    public MenuInflater p;
    public CharSequence q;
    public c0 r;
    public c s;
    public k t;
    public c.b.h.a u;
    public ActionBarContextView v;
    public PopupWindow w;
    public Runnable x;
    public f0 y = null;
    public boolean z = true;
    public final Runnable f0 = new b();

    /* loaded from: classes.dex */
    public class a implements Thread.UncaughtExceptionHandler {
        public final /* synthetic */ Thread.UncaughtExceptionHandler a;

        public a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.a = uncaughtExceptionHandler;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            String message;
            boolean z = false;
            if ((th instanceof Resources.NotFoundException) && (message = th.getMessage()) != null && (message.contains("drawable") || message.contains("Drawable"))) {
                z = true;
            }
            if (!z) {
                this.a.uncaughtException(thread, th);
                return;
            }
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
            notFoundException.initCause(th.getCause());
            notFoundException.setStackTrace(th.getStackTrace());
            this.a.uncaughtException(thread, notFoundException);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o oVar = o.this;
            if ((oVar.e0 & 1) != 0) {
                oVar.I(0);
            }
            o oVar2 = o.this;
            if ((oVar2.e0 & 4096) != 0) {
                oVar2.I(108);
            }
            o oVar3 = o.this;
            oVar3.d0 = false;
            oVar3.e0 = 0;
        }
    }

    /* loaded from: classes.dex */
    public final class c implements m.a {
        public c() {
        }

        @Override // c.b.h.i.m.a
        public void b(c.b.h.i.g gVar, boolean z) {
            o.this.E(gVar);
        }

        @Override // c.b.h.i.m.a
        public boolean c(c.b.h.i.g gVar) {
            Window.Callback P = o.this.P();
            if (P != null) {
                P.onMenuOpened(108, gVar);
                return true;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class d implements a.InterfaceC0018a {
        public a.InterfaceC0018a a;

        /* loaded from: classes.dex */
        public class a extends h0 {
            public a() {
            }

            @Override // c.i.k.g0
            public void b(View view) {
                o.this.v.setVisibility(8);
                o oVar = o.this;
                PopupWindow popupWindow = oVar.w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (oVar.v.getParent() instanceof View) {
                    d0.y((View) o.this.v.getParent());
                }
                o.this.v.h();
                o.this.y.d(null);
                o oVar2 = o.this;
                oVar2.y = null;
                d0.y(oVar2.B);
            }
        }

        public d(a.InterfaceC0018a interfaceC0018a) {
            this.a = interfaceC0018a;
        }

        @Override // c.b.h.a.InterfaceC0018a
        public void a(c.b.h.a aVar) {
            this.a.a(aVar);
            o oVar = o.this;
            if (oVar.w != null) {
                oVar.f829l.getDecorView().removeCallbacks(o.this.x);
            }
            o oVar2 = o.this;
            if (oVar2.v != null) {
                oVar2.J();
                o oVar3 = o.this;
                f0 b2 = d0.b(oVar3.v);
                b2.a(0.0f);
                oVar3.y = b2;
                f0 f0Var = o.this.y;
                a aVar2 = new a();
                View view = f0Var.a.get();
                if (view != null) {
                    f0Var.e(view, aVar2);
                }
            }
            o oVar4 = o.this;
            m mVar = oVar4.f831n;
            if (mVar != null) {
                mVar.e(oVar4.u);
            }
            o oVar5 = o.this;
            oVar5.u = null;
            d0.y(oVar5.B);
        }

        @Override // c.b.h.a.InterfaceC0018a
        public boolean b(c.b.h.a aVar, Menu menu) {
            return this.a.b(aVar, menu);
        }

        @Override // c.b.h.a.InterfaceC0018a
        public boolean c(c.b.h.a aVar, Menu menu) {
            d0.y(o.this.B);
            return this.a.c(aVar, menu);
        }

        @Override // c.b.h.a.InterfaceC0018a
        public boolean d(c.b.h.a aVar, MenuItem menuItem) {
            return this.a.d(aVar, menuItem);
        }
    }

    /* loaded from: classes.dex */
    public class e extends c.b.h.h {
        public e(Window.Callback callback) {
            super(callback);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final android.view.ActionMode a(android.view.ActionMode.Callback r10) {
            /*
                Method dump skipped, instructions count: 445
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: c.b.c.o.e.a(android.view.ActionMode$Callback):android.view.ActionMode");
        }

        @Override // c.b.h.h, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return o.this.H(keyEvent) || this.a.dispatchKeyEvent(keyEvent);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
            if (r6 != false) goto L7;
         */
        /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        @Override // c.b.h.h, android.view.Window.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r6) {
            /*
                r5 = this;
                android.view.Window$Callback r0 = r5.a
                boolean r0 = r0.dispatchKeyShortcutEvent(r6)
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L4f
                c.b.c.o r0 = c.b.c.o.this
                int r3 = r6.getKeyCode()
                r0.Q()
                c.b.c.a r4 = r0.o
                if (r4 == 0) goto L1f
                boolean r3 = r4.j(r3, r6)
                if (r3 == 0) goto L1f
            L1d:
                r6 = 1
                goto L4d
            L1f:
                c.b.c.o$j r3 = r0.N
                if (r3 == 0) goto L34
                int r4 = r6.getKeyCode()
                boolean r3 = r0.U(r3, r4, r6, r2)
                if (r3 == 0) goto L34
                c.b.c.o$j r6 = r0.N
                if (r6 == 0) goto L1d
                r6.f850l = r2
                goto L1d
            L34:
                c.b.c.o$j r3 = r0.N
                if (r3 != 0) goto L4c
                c.b.c.o$j r3 = r0.O(r1)
                r0.V(r3, r6)
                int r4 = r6.getKeyCode()
                boolean r6 = r0.U(r3, r4, r6, r2)
                r3.f849k = r1
                if (r6 == 0) goto L4c
                goto L1d
            L4c:
                r6 = 0
            L4d:
                if (r6 == 0) goto L50
            L4f:
                r1 = 1
            L50:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: c.b.c.o.e.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
        }

        @Override // c.b.h.h, android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // c.b.h.h, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i2, Menu menu) {
            if (i2 != 0 || (menu instanceof c.b.h.i.g)) {
                return this.a.onCreatePanelMenu(i2, menu);
            }
            return false;
        }

        @Override // c.b.h.h, android.view.Window.Callback
        public boolean onMenuOpened(int i2, Menu menu) {
            this.a.onMenuOpened(i2, menu);
            o oVar = o.this;
            Objects.requireNonNull(oVar);
            if (i2 == 108) {
                oVar.Q();
                c.b.c.a aVar = oVar.o;
                if (aVar != null) {
                    aVar.c(true);
                }
            }
            return true;
        }

        @Override // c.b.h.h, android.view.Window.Callback
        public void onPanelClosed(int i2, Menu menu) {
            this.a.onPanelClosed(i2, menu);
            o oVar = o.this;
            Objects.requireNonNull(oVar);
            if (i2 == 108) {
                oVar.Q();
                c.b.c.a aVar = oVar.o;
                if (aVar != null) {
                    aVar.c(false);
                }
            } else if (i2 == 0) {
                j O = oVar.O(i2);
                if (O.f851m) {
                    oVar.F(O, false);
                }
            }
        }

        @Override // android.view.Window.Callback
        public boolean onPreparePanel(int i2, View view, Menu menu) {
            c.b.h.i.g gVar = menu instanceof c.b.h.i.g ? (c.b.h.i.g) menu : null;
            if (i2 == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.y = true;
            }
            boolean onPreparePanel = this.a.onPreparePanel(i2, view, menu);
            if (gVar != null) {
                gVar.y = false;
            }
            return onPreparePanel;
        }

        @Override // c.b.h.h, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i2) {
            c.b.h.i.g gVar = o.this.O(0).f846h;
            if (gVar != null) {
                this.a.onProvideKeyboardShortcuts(list, gVar, i2);
            } else {
                this.a.onProvideKeyboardShortcuts(list, menu, i2);
            }
        }

        @Override // c.b.h.h, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return o.this.z ? a(callback) : this.a.onWindowStartingActionMode(callback);
        }

        @Override // c.b.h.h, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
            return (o.this.z && i2 == 0) ? a(callback) : this.a.onWindowStartingActionMode(callback, i2);
        }
    }

    /* loaded from: classes.dex */
    public class f extends g {

        /* renamed from: c  reason: collision with root package name */
        public final PowerManager f834c;

        public f(Context context) {
            super();
            this.f834c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // c.b.c.o.g
        public IntentFilter b() {
            if (Build.VERSION.SDK_INT >= 21) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            }
            return null;
        }

        @Override // c.b.c.o.g
        public int c() {
            return (Build.VERSION.SDK_INT < 21 || !this.f834c.isPowerSaveMode()) ? 1 : 2;
        }

        @Override // c.b.c.o.g
        public void d() {
            o.this.d();
        }
    }

    /* loaded from: classes.dex */
    public abstract class g {
        public BroadcastReceiver a;

        /* loaded from: classes.dex */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                g.this.d();
            }
        }

        public g() {
        }

        public void a() {
            BroadcastReceiver broadcastReceiver = this.a;
            if (broadcastReceiver != null) {
                try {
                    o.this.f828k.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public void e() {
            a();
            IntentFilter b2 = b();
            if (b2 == null || b2.countActions() == 0) {
                return;
            }
            if (this.a == null) {
                this.a = new a();
            }
            o.this.f828k.registerReceiver(this.a, b2);
        }
    }

    /* loaded from: classes.dex */
    public class h extends g {

        /* renamed from: c  reason: collision with root package name */
        public final a0 f837c;

        public h(a0 a0Var) {
            super();
            this.f837c = a0Var;
        }

        @Override // c.b.c.o.g
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00e7  */
        @Override // c.b.c.o.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int c() {
            /*
                Method dump skipped, instructions count: 254
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: c.b.c.o.h.c():int");
        }

        @Override // c.b.c.o.g
        public void d() {
            o.this.d();
        }
    }

    /* loaded from: classes.dex */
    public class i extends ContentFrameLayout {
        public i(Context context) {
            super(context, null);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return o.this.H(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                    o oVar = o.this;
                    oVar.F(oVar.O(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i2) {
            setBackgroundDrawable(c.b.d.a.a.b(getContext(), i2));
        }
    }

    /* loaded from: classes.dex */
    public static final class j {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public int f840b;

        /* renamed from: c  reason: collision with root package name */
        public int f841c;

        /* renamed from: d  reason: collision with root package name */
        public int f842d;

        /* renamed from: e  reason: collision with root package name */
        public ViewGroup f843e;

        /* renamed from: f  reason: collision with root package name */
        public View f844f;

        /* renamed from: g  reason: collision with root package name */
        public View f845g;

        /* renamed from: h  reason: collision with root package name */
        public c.b.h.i.g f846h;

        /* renamed from: i  reason: collision with root package name */
        public c.b.h.i.e f847i;

        /* renamed from: j  reason: collision with root package name */
        public Context f848j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f849k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f850l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f851m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f852n;
        public boolean o = false;
        public boolean p;
        public Bundle q;

        public j(int i2) {
            this.a = i2;
        }

        public void a(c.b.h.i.g gVar) {
            c.b.h.i.e eVar;
            c.b.h.i.g gVar2 = this.f846h;
            if (gVar == gVar2) {
                return;
            }
            if (gVar2 != null) {
                gVar2.u(this.f847i);
            }
            this.f846h = gVar;
            if (gVar == null || (eVar = this.f847i) == null) {
                return;
            }
            gVar.b(eVar, gVar.f1000b);
        }
    }

    /* loaded from: classes.dex */
    public final class k implements m.a {
        public k() {
        }

        @Override // c.b.h.i.m.a
        public void b(c.b.h.i.g gVar, boolean z) {
            c.b.h.i.g k2 = gVar.k();
            boolean z2 = k2 != gVar;
            o oVar = o.this;
            if (z2) {
                gVar = k2;
            }
            j M = oVar.M(gVar);
            if (M != null) {
                if (!z2) {
                    o.this.F(M, z);
                    return;
                }
                o.this.D(M.a, M, k2);
                o.this.F(M, true);
            }
        }

        @Override // c.b.h.i.m.a
        public boolean c(c.b.h.i.g gVar) {
            Window.Callback P;
            if (gVar == gVar.k()) {
                o oVar = o.this;
                if (!oVar.G || (P = oVar.P()) == null || o.this.W) {
                    return true;
                }
                P.onMenuOpened(108, gVar);
                return true;
            }
            return true;
        }
    }

    static {
        boolean z = Build.VERSION.SDK_INT < 21;
        f822e = z;
        f823f = new int[]{16842836};
        f824g = !"robolectric".equals(Build.FINGERPRINT);
        f825h = true;
        if (!z || f826i) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        f826i = true;
    }

    public o(Context context, Window window, m mVar, Object obj) {
        c.f.h<String, Integer> hVar;
        Integer orDefault;
        l lVar;
        this.X = -100;
        this.f828k = context;
        this.f831n = mVar;
        this.f827j = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof l)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    lVar = (l) context;
                    break;
                }
            }
            lVar = null;
            if (lVar != null) {
                this.X = lVar.t().g();
            }
        }
        if (this.X == -100 && (orDefault = (hVar = f821d).getOrDefault(this.f827j.getClass().getName(), null)) != null) {
            this.X = orDefault.intValue();
            hVar.remove(this.f827j.getClass().getName());
        }
        if (window != null) {
            C(window);
        }
        c.b.i.j.e();
    }

    @Override // c.b.c.n
    public final void A(CharSequence charSequence) {
        this.q = charSequence;
        c0 c0Var = this.r;
        if (c0Var != null) {
            c0Var.setWindowTitle(charSequence);
            return;
        }
        c.b.c.a aVar = this.o;
        if (aVar != null) {
            aVar.r(charSequence);
            return;
        }
        TextView textView = this.C;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean B(boolean r13) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.c.o.B(boolean):boolean");
    }

    public final void C(Window window) {
        if (this.f829l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof e) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        e eVar = new e(callback);
        this.f830m = eVar;
        window.setCallback(eVar);
        a1 p = a1.p(this.f828k, null, f823f);
        Drawable h2 = p.h(0);
        if (h2 != null) {
            window.setBackgroundDrawable(h2);
        }
        p.f1083b.recycle();
        this.f829l = window;
    }

    public void D(int i2, j jVar, Menu menu) {
        if (menu == null && jVar != null) {
            menu = jVar.f846h;
        }
        if ((jVar == null || jVar.f851m) && !this.W) {
            this.f830m.a.onPanelClosed(i2, menu);
        }
    }

    public void E(c.b.h.i.g gVar) {
        if (this.L) {
            return;
        }
        this.L = true;
        this.r.j();
        Window.Callback P = P();
        if (P != null && !this.W) {
            P.onPanelClosed(108, gVar);
        }
        this.L = false;
    }

    public void F(j jVar, boolean z) {
        ViewGroup viewGroup;
        c0 c0Var;
        if (z && jVar.a == 0 && (c0Var = this.r) != null && c0Var.b()) {
            E(jVar.f846h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f828k.getSystemService("window");
        if (windowManager != null && jVar.f851m && (viewGroup = jVar.f843e) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                D(jVar.a, jVar, null);
            }
        }
        jVar.f849k = false;
        jVar.f850l = false;
        jVar.f851m = false;
        jVar.f844f = null;
        jVar.o = true;
        if (this.N == jVar) {
            this.N = null;
        }
    }

    public final Configuration G(Context context, int i2, Configuration configuration) {
        int i3 = i2 != 1 ? i2 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean H(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.c.o.H(android.view.KeyEvent):boolean");
    }

    public void I(int i2) {
        j O = O(i2);
        if (O.f846h != null) {
            Bundle bundle = new Bundle();
            O.f846h.w(bundle);
            if (bundle.size() > 0) {
                O.q = bundle;
            }
            O.f846h.z();
            O.f846h.clear();
        }
        O.p = true;
        O.o = true;
        if ((i2 == 108 || i2 == 0) && this.r != null) {
            j O2 = O(0);
            O2.f849k = false;
            V(O2, null);
        }
    }

    public void J() {
        f0 f0Var = this.y;
        if (f0Var != null) {
            f0Var.b();
        }
    }

    public final void K() {
        ViewGroup viewGroup;
        if (this.A) {
            return;
        }
        TypedArray obtainStyledAttributes = this.f828k.obtainStyledAttributes(c.b.b.f779j);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(126, false)) {
            u(1);
        } else if (obtainStyledAttributes.getBoolean(117, false)) {
            u(108);
        }
        if (obtainStyledAttributes.getBoolean(118, false)) {
            u(FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD);
        }
        if (obtainStyledAttributes.getBoolean(119, false)) {
            u(10);
        }
        this.J = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        L();
        this.f829l.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.f828k);
        if (this.K) {
            viewGroup = this.I ? (ViewGroup) from.inflate(R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.J) {
            viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.H = false;
            this.G = false;
        } else if (this.G) {
            TypedValue typedValue = new TypedValue();
            this.f828k.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new c.b.h.c(this.f828k, typedValue.resourceId) : this.f828k).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
            c0 c0Var = (c0) viewGroup.findViewById(R.id.decor_content_parent);
            this.r = c0Var;
            c0Var.setWindowCallback(P());
            if (this.H) {
                this.r.i(FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD);
            }
            if (this.E) {
                this.r.i(2);
            }
            if (this.F) {
                this.r.i(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder y = e.a.d.a.a.y("AppCompat does not support the current theme features: { windowActionBar: ");
            y.append(this.G);
            y.append(", windowActionBarOverlay: ");
            y.append(this.H);
            y.append(", android:windowIsFloating: ");
            y.append(this.J);
            y.append(", windowActionModeOverlay: ");
            y.append(this.I);
            y.append(", windowNoTitle: ");
            y.append(this.K);
            y.append(" }");
            throw new IllegalArgumentException(y.toString());
        }
        if (Build.VERSION.SDK_INT >= 21) {
            d0.C(viewGroup, new p(this));
        } else if (viewGroup instanceof g0) {
            ((g0) viewGroup).setOnFitSystemWindowsListener(new q(this));
        }
        if (this.r == null) {
            this.C = (TextView) viewGroup.findViewById(R.id.title);
        }
        Method method = g1.a;
        try {
            Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(viewGroup, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f829l.findViewById(16908290);
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
        this.f829l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new r(this));
        this.B = viewGroup;
        Object obj = this.f827j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.q;
        if (!TextUtils.isEmpty(title)) {
            c0 c0Var2 = this.r;
            if (c0Var2 != null) {
                c0Var2.setWindowTitle(title);
            } else {
                c.b.c.a aVar = this.o;
                if (aVar != null) {
                    aVar.r(title);
                } else {
                    TextView textView = this.C;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.B.findViewById(16908290);
        View decorView = this.f829l.getDecorView();
        contentFrameLayout2.f219g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        AtomicInteger atomicInteger = d0.a;
        if (d0.f.c(contentFrameLayout2)) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray obtainStyledAttributes2 = this.f828k.obtainStyledAttributes(c.b.b.f779j);
        obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (obtainStyledAttributes2.hasValue(122)) {
            obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (obtainStyledAttributes2.hasValue(123)) {
            obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (obtainStyledAttributes2.hasValue(SyslogConstants.LOG_CLOCK)) {
            obtainStyledAttributes2.getValue(SyslogConstants.LOG_CLOCK, contentFrameLayout2.getFixedHeightMajor());
        }
        if (obtainStyledAttributes2.hasValue(121)) {
            obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.A = true;
        j O = O(0);
        if (this.W || O.f846h != null) {
            return;
        }
        R(108);
    }

    public final void L() {
        if (this.f829l == null) {
            Object obj = this.f827j;
            if (obj instanceof Activity) {
                C(((Activity) obj).getWindow());
            }
        }
        if (this.f829l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public j M(Menu menu) {
        j[] jVarArr = this.M;
        int length = jVarArr != null ? jVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            j jVar = jVarArr[i2];
            if (jVar != null && jVar.f846h == menu) {
                return jVar;
            }
        }
        return null;
    }

    public final g N(Context context) {
        if (this.b0 == null) {
            if (a0.a == null) {
                Context applicationContext = context.getApplicationContext();
                a0.a = new a0(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.b0 = new h(a0.a);
        }
        return this.b0;
    }

    public j O(int i2) {
        j[] jVarArr = this.M;
        if (jVarArr == null || jVarArr.length <= i2) {
            j[] jVarArr2 = new j[i2 + 1];
            if (jVarArr != null) {
                System.arraycopy(jVarArr, 0, jVarArr2, 0, jVarArr.length);
            }
            this.M = jVarArr2;
            jVarArr = jVarArr2;
        }
        j jVar = jVarArr[i2];
        if (jVar == null) {
            j jVar2 = new j(i2);
            jVarArr[i2] = jVar2;
            return jVar2;
        }
        return jVar;
    }

    public final Window.Callback P() {
        return this.f829l.getCallback();
    }

    public final void Q() {
        K();
        if (this.G && this.o == null) {
            Object obj = this.f827j;
            if (obj instanceof Activity) {
                this.o = new b0((Activity) this.f827j, this.H);
            } else if (obj instanceof Dialog) {
                this.o = new b0((Dialog) this.f827j);
            }
            c.b.c.a aVar = this.o;
            if (aVar != null) {
                aVar.n(this.g0);
            }
        }
    }

    public final void R(int i2) {
        this.e0 = (1 << i2) | this.e0;
        if (this.d0) {
            return;
        }
        View decorView = this.f829l.getDecorView();
        Runnable runnable = this.f0;
        AtomicInteger atomicInteger = d0.a;
        d0.c.m(decorView, runnable);
        this.d0 = true;
    }

    public int S(Context context, int i2) {
        if (i2 != -100) {
            if (i2 != -1) {
                if (i2 == 0) {
                    if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                        return N(context).c();
                    }
                    return -1;
                } else if (i2 != 1 && i2 != 2) {
                    if (i2 == 3) {
                        if (this.c0 == null) {
                            this.c0 = new f(context);
                        }
                        return this.c0.c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            }
            return i2;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0157, code lost:
        if (r14 != null) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T(c.b.c.o.j r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.c.o.T(c.b.c.o$j, android.view.KeyEvent):void");
    }

    public final boolean U(j jVar, int i2, KeyEvent keyEvent, int i3) {
        c.b.h.i.g gVar;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((jVar.f849k || V(jVar, keyEvent)) && (gVar = jVar.f846h) != null) {
            z = gVar.performShortcut(i2, keyEvent, i3);
        }
        if (z && (i3 & 1) == 0 && this.r == null) {
            F(jVar, true);
        }
        return z;
    }

    public final boolean V(j jVar, KeyEvent keyEvent) {
        c0 c0Var;
        c0 c0Var2;
        Resources.Theme theme;
        c0 c0Var3;
        c0 c0Var4;
        if (this.W) {
            return false;
        }
        if (jVar.f849k) {
            return true;
        }
        j jVar2 = this.N;
        if (jVar2 != null && jVar2 != jVar) {
            F(jVar2, false);
        }
        Window.Callback P = P();
        if (P != null) {
            jVar.f845g = P.onCreatePanelView(jVar.a);
        }
        int i2 = jVar.a;
        boolean z = i2 == 0 || i2 == 108;
        if (z && (c0Var4 = this.r) != null) {
            c0Var4.c();
        }
        if (jVar.f845g == null && (!z || !(this.o instanceof y))) {
            c.b.h.i.g gVar = jVar.f846h;
            if (gVar == null || jVar.p) {
                if (gVar == null) {
                    Context context = this.f828k;
                    int i3 = jVar.a;
                    if ((i3 == 0 || i3 == 108) && this.r != null) {
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
                            c.b.h.c cVar = new c.b.h.c(context, 0);
                            cVar.getTheme().setTo(theme);
                            context = cVar;
                        }
                    }
                    c.b.h.i.g gVar2 = new c.b.h.i.g(context);
                    gVar2.f1004f = this;
                    jVar.a(gVar2);
                    if (jVar.f846h == null) {
                        return false;
                    }
                }
                if (z && (c0Var2 = this.r) != null) {
                    if (this.s == null) {
                        this.s = new c();
                    }
                    c0Var2.a(jVar.f846h, this.s);
                }
                jVar.f846h.z();
                if (!P.onCreatePanelMenu(jVar.a, jVar.f846h)) {
                    jVar.a(null);
                    if (z && (c0Var = this.r) != null) {
                        c0Var.a(null, this.s);
                    }
                    return false;
                }
                jVar.p = false;
            }
            jVar.f846h.z();
            Bundle bundle = jVar.q;
            if (bundle != null) {
                jVar.f846h.v(bundle);
                jVar.q = null;
            }
            if (!P.onPreparePanel(0, jVar.f845g, jVar.f846h)) {
                if (z && (c0Var3 = this.r) != null) {
                    c0Var3.a(null, this.s);
                }
                jVar.f846h.y();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            jVar.f852n = z2;
            jVar.f846h.setQwertyMode(z2);
            jVar.f846h.y();
        }
        jVar.f849k = true;
        jVar.f850l = false;
        this.N = jVar;
        return true;
    }

    public final boolean W() {
        ViewGroup viewGroup;
        if (this.A && (viewGroup = this.B) != null) {
            AtomicInteger atomicInteger = d0.a;
            if (d0.f.c(viewGroup)) {
                return true;
            }
        }
        return false;
    }

    public final void X() {
        if (this.A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final int Y(j0 j0Var, Rect rect) {
        boolean z;
        boolean z2;
        int e2 = j0Var != null ? j0Var.e() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.v.getLayoutParams();
            if (this.v.isShown()) {
                if (this.h0 == null) {
                    this.h0 = new Rect();
                    this.i0 = new Rect();
                }
                Rect rect2 = this.h0;
                Rect rect3 = this.i0;
                if (j0Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(j0Var.c(), j0Var.e(), j0Var.d(), j0Var.b());
                }
                ViewGroup viewGroup = this.B;
                Method method = g1.a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect2, rect3);
                    } catch (Exception unused) {
                    }
                }
                int i2 = rect2.top;
                int i3 = rect2.left;
                int i4 = rect2.right;
                j0 o = d0.o(this.B);
                int c2 = o == null ? 0 : o.c();
                int d2 = o == null ? 0 : o.d();
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z2 = true;
                }
                if (i2 <= 0 || this.D != null) {
                    View view = this.D;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i5 = marginLayoutParams2.height;
                        int i6 = marginLayoutParams.topMargin;
                        if (i5 != i6 || marginLayoutParams2.leftMargin != c2 || marginLayoutParams2.rightMargin != d2) {
                            marginLayoutParams2.height = i6;
                            marginLayoutParams2.leftMargin = c2;
                            marginLayoutParams2.rightMargin = d2;
                            this.D.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f828k);
                    this.D = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = c2;
                    layoutParams.rightMargin = d2;
                    this.B.addView(this.D, -1, layoutParams);
                }
                View view3 = this.D;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    View view4 = this.D;
                    AtomicInteger atomicInteger = d0.a;
                    view4.setBackgroundColor((d0.c.g(view4) & Compressor.BUFFER_SIZE) != 0 ? c.i.d.a.b(this.f828k, R.color.abc_decor_view_status_guard_light) : c.i.d.a.b(this.f828k, R.color.abc_decor_view_status_guard));
                }
                if (!this.I && z) {
                    e2 = 0;
                }
                r5 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                r5 = false;
            }
            if (r5) {
                this.v.setLayoutParams(marginLayoutParams);
            }
        }
        View view5 = this.D;
        if (view5 != null) {
            view5.setVisibility(z ? 0 : 8);
        }
        return e2;
    }

    @Override // c.b.h.i.g.a
    public boolean a(c.b.h.i.g gVar, MenuItem menuItem) {
        j M;
        Window.Callback P = P();
        if (P == null || this.W || (M = M(gVar.k())) == null) {
            return false;
        }
        return P.onMenuItemSelected(M.a, menuItem);
    }

    @Override // c.b.h.i.g.a
    public void b(c.b.h.i.g gVar) {
        c0 c0Var = this.r;
        if (c0Var == null || !c0Var.d() || (ViewConfiguration.get(this.f828k).hasPermanentMenuKey() && !this.r.f())) {
            j O = O(0);
            O.o = true;
            F(O, false);
            T(O, null);
            return;
        }
        Window.Callback P = P();
        if (this.r.b()) {
            this.r.g();
            if (this.W) {
                return;
            }
            P.onPanelClosed(108, O(0).f846h);
        } else if (P == null || this.W) {
        } else {
            if (this.d0 && (1 & this.e0) != 0) {
                this.f829l.getDecorView().removeCallbacks(this.f0);
                this.f0.run();
            }
            j O2 = O(0);
            c.b.h.i.g gVar2 = O2.f846h;
            if (gVar2 == null || O2.p || !P.onPreparePanel(0, O2.f845g, gVar2)) {
                return;
            }
            P.onMenuOpened(108, O2.f846h);
            this.r.h();
        }
    }

    @Override // c.b.c.n
    public void c(View view, ViewGroup.LayoutParams layoutParams) {
        K();
        ((ViewGroup) this.B.findViewById(16908290)).addView(view, layoutParams);
        this.f830m.a.onContentChanged();
    }

    @Override // c.b.c.n
    public boolean d() {
        return B(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x019f  */
    @Override // c.b.c.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.content.Context e(android.content.Context r10) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.c.o.e(android.content.Context):android.content.Context");
    }

    @Override // c.b.c.n
    public <T extends View> T f(int i2) {
        K();
        return (T) this.f829l.findViewById(i2);
    }

    @Override // c.b.c.n
    public int g() {
        return this.X;
    }

    @Override // c.b.c.n
    public MenuInflater h() {
        if (this.p == null) {
            Q();
            c.b.c.a aVar = this.o;
            this.p = new c.b.h.f(aVar != null ? aVar.e() : this.f828k);
        }
        return this.p;
    }

    @Override // c.b.c.n
    public c.b.c.a i() {
        Q();
        return this.o;
    }

    @Override // c.b.c.n
    public void j() {
        LayoutInflater from = LayoutInflater.from(this.f828k);
        if (from.getFactory() == null) {
            c.i.a.Y(from, this);
        } else {
            boolean z = from.getFactory2() instanceof o;
        }
    }

    @Override // c.b.c.n
    public void k() {
        Q();
        c.b.c.a aVar = this.o;
        if (aVar == null || !aVar.g()) {
            R(0);
        }
    }

    @Override // c.b.c.n
    public void l(Configuration configuration) {
        if (this.G && this.A) {
            Q();
            c.b.c.a aVar = this.o;
            if (aVar != null) {
                aVar.h(configuration);
            }
        }
        c.b.i.j a2 = c.b.i.j.a();
        Context context = this.f828k;
        synchronized (a2) {
            q0 q0Var = a2.f1184c;
            synchronized (q0Var) {
                c.f.e<WeakReference<Drawable.ConstantState>> eVar = q0Var.f1224g.get(context);
                if (eVar != null) {
                    eVar.b();
                }
            }
        }
        B(false);
    }

    @Override // c.b.c.n
    public void m(Bundle bundle) {
        this.P = true;
        B(false);
        L();
        Object obj = this.f827j;
        if (obj instanceof Activity) {
            String str = null;
            try {
                Activity activity = (Activity) obj;
                try {
                    str = c.i.a.D(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                c.b.c.a aVar = this.o;
                if (aVar == null) {
                    this.g0 = true;
                } else {
                    aVar.n(true);
                }
            }
            synchronized (n.f820c) {
                n.t(this);
                n.f819b.add(new WeakReference<>(this));
            }
        }
        this.U = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // c.b.c.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f827j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = c.b.c.n.f820c
            monitor-enter(r0)
            c.b.c.n.t(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.d0
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f829l
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f0
            r0.removeCallbacks(r1)
        L20:
            r0 = 0
            r3.V = r0
            r0 = 1
            r3.W = r0
            int r0 = r3.X
            r1 = -100
            if (r0 == r1) goto L50
            java.lang.Object r0 = r3.f827j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L50
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L50
            c.f.h<java.lang.String, java.lang.Integer> r0 = c.b.c.o.f821d
            java.lang.Object r1 = r3.f827j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.X
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5f
        L50:
            c.f.h<java.lang.String, java.lang.Integer> r0 = c.b.c.o.f821d
            java.lang.Object r1 = r3.f827j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5f:
            c.b.c.a r0 = r3.o
            if (r0 == 0) goto L66
            r0.i()
        L66:
            c.b.c.o$g r0 = r3.b0
            if (r0 == 0) goto L6d
            r0.a()
        L6d:
            c.b.c.o$g r0 = r3.c0
            if (r0 == 0) goto L74
            r0.a()
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.c.o.n():void");
    }

    @Override // c.b.c.n
    public void o(Bundle bundle) {
        K();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01c0, code lost:
        if (r13.equals("TextView") == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bc, code lost:
        if (((org.xmlpull.v1.XmlPullParser) r15).getDepth() > 1) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x026d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02aa A[Catch: all -> 0x02b6, Exception -> 0x02be, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x02be, all -> 0x02b6, blocks: (B:166:0x027d, B:169:0x028c, B:171:0x0291, B:176:0x02aa), top: B:202:0x027d }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x008b A[EDGE_INSN: B:203:0x008b->B:34:0x008b ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086 A[LOOP:0: B:20:0x0060->B:32:0x0086, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0156  */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.View r12, java.lang.String r13, android.content.Context r14, android.util.AttributeSet r15) {
        /*
            Method dump skipped, instructions count: 844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.c.o.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // c.b.c.n
    public void p() {
        Q();
        c.b.c.a aVar = this.o;
        if (aVar != null) {
            aVar.p(true);
        }
    }

    @Override // c.b.c.n
    public void q(Bundle bundle) {
    }

    @Override // c.b.c.n
    public void r() {
        this.V = true;
        d();
    }

    @Override // c.b.c.n
    public void s() {
        this.V = false;
        Q();
        c.b.c.a aVar = this.o;
        if (aVar != null) {
            aVar.p(false);
        }
    }

    @Override // c.b.c.n
    public boolean u(int i2) {
        if (i2 == 8) {
            i2 = 108;
        } else if (i2 == 9) {
            i2 = FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD;
        }
        if (this.K && i2 == 108) {
            return false;
        }
        if (this.G && i2 == 1) {
            this.G = false;
        }
        if (i2 == 1) {
            X();
            this.K = true;
            return true;
        } else if (i2 == 2) {
            X();
            this.E = true;
            return true;
        } else if (i2 == 5) {
            X();
            this.F = true;
            return true;
        } else if (i2 == 10) {
            X();
            this.I = true;
            return true;
        } else if (i2 == 108) {
            X();
            this.G = true;
            return true;
        } else if (i2 != 109) {
            return this.f829l.requestFeature(i2);
        } else {
            X();
            this.H = true;
            return true;
        }
    }

    @Override // c.b.c.n
    public void v(int i2) {
        K();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f828k).inflate(i2, viewGroup);
        this.f830m.a.onContentChanged();
    }

    @Override // c.b.c.n
    public void w(View view) {
        K();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f830m.a.onContentChanged();
    }

    @Override // c.b.c.n
    public void x(View view, ViewGroup.LayoutParams layoutParams) {
        K();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f830m.a.onContentChanged();
    }

    @Override // c.b.c.n
    public void y(Toolbar toolbar) {
        if (this.f827j instanceof Activity) {
            Q();
            c.b.c.a aVar = this.o;
            if (aVar instanceof b0) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.p = null;
            if (aVar != null) {
                aVar.i();
            }
            if (toolbar != null) {
                Object obj = this.f827j;
                y yVar = new y(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : this.q, this.f830m);
                this.o = yVar;
                this.f829l.setCallback(yVar.f862c);
            } else {
                this.o = null;
                this.f829l.setCallback(this.f830m);
            }
            k();
        }
    }

    @Override // c.b.c.n
    public void z(int i2) {
        this.Y = i2;
    }
}

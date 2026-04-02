package com.fyber.inneractive.sdk.m;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.URLUtil;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.h.af;
import com.fyber.inneractive.sdk.h.r;
import com.fyber.inneractive.sdk.m.a;
import com.fyber.inneractive.sdk.m.d.c;
import com.fyber.inneractive.sdk.mraid.aa;
import com.fyber.inneractive.sdk.mraid.ab;
import com.fyber.inneractive.sdk.mraid.f;
import com.fyber.inneractive.sdk.mraid.s;
import com.fyber.inneractive.sdk.mraid.t;
import com.fyber.inneractive.sdk.mraid.v;
import com.fyber.inneractive.sdk.mraid.x;
import com.fyber.inneractive.sdk.mraid.y;
import com.fyber.inneractive.sdk.ui.IAcloseButton;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.aj;
import com.fyber.inneractive.sdk.util.m;
import com.fyber.inneractive.sdk.util.q;
import com.fyber.inneractive.sdk.util.u;
import com.google.android.gms.drive.DriveFile;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.net.URI;
import java.net.URLDecoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class d<T extends c> extends com.fyber.inneractive.sdk.m.a<T> {
    private static final String[] a = {"yyyy-MM-dd'T'HH:mm:ssZZZZZ", "yyyy-MM-dd'T'HH:mmZZZZZ"};
    protected int A;
    protected int B;
    protected int C;
    protected int D;
    protected Orientation E;
    private final int F;
    private final int G;
    private ViewGroup H;
    private com.fyber.inneractive.sdk.m.c I;
    private boolean J;
    private int K;
    private d<T>.f L;
    private IAcloseButton M;
    private int N;
    private FrameLayout O;
    private FrameLayout P;
    private RelativeLayout Q;
    private int R;
    private int S;
    protected aa u;
    protected EnumC0045d v;
    public boolean w;
    protected float x;
    public int y;
    public int z;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes.dex */
    public static final class a {
        public static final int a = 1;
        public static final int b = 2;
        private static final /* synthetic */ int[] c = {1, 2};
    }

    /* loaded from: classes.dex */
    public interface c extends l {
        void a();

        void a(InneractiveUnitController.AdDisplayError adDisplayError);

        void a(boolean z);

        void a(boolean z, Orientation orientation);

        boolean a(String str);

        void c();

        void d();

        void e();
    }

    /* renamed from: com.fyber.inneractive.sdk.m.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0045d {
        INLINE,
        INTERSTITIAL
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes.dex */
    public static final class e {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        private static final /* synthetic */ int[] d = {1, 2, 3};
    }

    public static void u() {
    }

    public void a(String str) {
    }

    public void setResizeProperties() {
    }

    /* loaded from: classes.dex */
    public static abstract class h implements c {
        @Override // com.fyber.inneractive.sdk.m.d.c
        public void a() {
        }

        @Override // com.fyber.inneractive.sdk.m.l
        public void a(String str, String str2) {
        }

        @Override // com.fyber.inneractive.sdk.m.d.c
        public void a(boolean z) {
        }

        @Override // com.fyber.inneractive.sdk.m.d.c
        public boolean a(String str) {
            return false;
        }

        @Override // com.fyber.inneractive.sdk.m.l
        public final void b(boolean z) {
        }

        @Override // com.fyber.inneractive.sdk.m.d.c
        public void c() {
        }

        @Override // com.fyber.inneractive.sdk.m.d.c
        public void d() {
        }

        @Override // com.fyber.inneractive.sdk.m.d.c
        public void e() {
        }

        @Override // com.fyber.inneractive.sdk.m.l
        public u.a a(String str, aj ajVar) {
            return new u.a(u.c.FAILED, new Exception("Internal error"), "null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class g implements a.InterfaceC0044a {
        com.fyber.inneractive.sdk.mraid.a a;
        aj b;

        g(com.fyber.inneractive.sdk.mraid.a aVar, aj ajVar) {
            this.a = aVar;
            this.b = ajVar;
        }

        @Override // com.fyber.inneractive.sdk.m.a.InterfaceC0044a
        public final String a() {
            return this.a.a;
        }

        @Override // com.fyber.inneractive.sdk.m.a.InterfaceC0044a
        public final String b() {
            return this.a.a();
        }

        @Override // com.fyber.inneractive.sdk.m.a.InterfaceC0044a
        public final void c() {
            this.a.d();
        }

        @Override // com.fyber.inneractive.sdk.m.a.InterfaceC0044a
        public final void d() {
            com.fyber.inneractive.sdk.mraid.a aVar = this.a;
            if (aVar != null) {
                aVar.c();
            }
        }

        public final String toString() {
            return "action = " + this.a.a + " url = " + this.a.a();
        }
    }

    public d(Context context, boolean z, EnumC0045d enumC0045d, int i, int i2) {
        super(context, z);
        this.u = aa.HIDDEN;
        this.J = false;
        this.y = -1;
        this.z = -1;
        this.A = -1;
        this.B = -1;
        this.C = -1;
        this.D = -1;
        this.E = Orientation.NONE;
        this.v = enumC0045d;
        this.F = i;
        this.G = i2;
    }

    @Override // com.fyber.inneractive.sdk.m.a
    public boolean a(String str, aj ajVar) {
        if ("mraid".equals(Uri.parse(str).getScheme())) {
            a(URI.create(str), ajVar);
            return true;
        }
        return false;
    }

    public final u.a c(String str, aj ajVar) {
        if (this.g != 0) {
            return ((c) this.g).a(str, ajVar);
        }
        return new u.a(u.c.FAILED, new Exception("No webview listener available"), v() == null ? "null" : v().getClass().getName());
    }

    private boolean a(URI uri, aj ajVar) {
        String[] split;
        int i;
        String host = uri.getHost();
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String rawQuery = uri.getRawQuery();
            if (rawQuery != null && rawQuery.length() > 0) {
                for (String str : rawQuery.split("&")) {
                    int indexOf = str.indexOf("=");
                    linkedHashMap.put(indexOf > 0 ? URLDecoder.decode(str.substring(0, indexOf), "UTF-8") : str, (indexOf <= 0 || str.length() <= (i = indexOf + 1)) ? null : URLDecoder.decode(str.substring(i), "UTF-8"));
                }
            }
            com.fyber.inneractive.sdk.mraid.b a2 = com.fyber.inneractive.sdk.mraid.f.a(host, linkedHashMap, this, ajVar);
            if (a2 != null) {
                if (!(a2 instanceof com.fyber.inneractive.sdk.mraid.e) || this.v != EnumC0045d.INTERSTITIAL) {
                    a2.a = host;
                    IAlog.a("Processing MRaid command: %s", host);
                    if (a2 instanceof com.fyber.inneractive.sdk.mraid.a) {
                        a(new g((com.fyber.inneractive.sdk.mraid.a) a2, ajVar));
                    } else {
                        if (a2.b()) {
                            m();
                        }
                        a2.d();
                    }
                }
                return true;
            }
            if (this.c != null) {
                this.c.a("window.mraidbridge.nativeCallComplete('" + host + "');");
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.m.a
    public final void j() {
        super.j();
        this.u = aa.LOADING;
        Context v = v();
        this.K = v instanceof Activity ? ((Activity) v).getRequestedOrientation() : -1;
        this.P = new FrameLayout(v());
        this.Q = new RelativeLayout(v());
        FrameLayout frameLayout = new FrameLayout(v());
        frameLayout.setBackgroundColor(-858993460);
        this.O = frameLayout;
        b(v);
        this.c.setOnKeyListener(new View.OnKeyListener() { // from class: com.fyber.inneractive.sdk.m.d.1
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (i == 4 && d.this.q()) {
                    IAlog.a("back button pressed while ad is expanded, ad will be collapsed.", new Object[0]);
                    d.this.s();
                    return true;
                }
                return false;
            }
        });
    }

    public void setAdDefaultSize(int i, int i2) {
        this.R = i;
        this.S = i2;
        this.C = i;
        this.D = i2;
    }

    public final void b(Context context) {
        int i;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (Build.VERSION.SDK_INT >= 17) {
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        } else {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        }
        this.x = displayMetrics.density;
        int i2 = 0;
        if (context instanceof Activity) {
            Window window = ((Activity) context).getWindow();
            Rect rect = new Rect();
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            i2 = rect.top;
            i = window.findViewById(16908290).getTop() - i2;
        } else {
            i = 0;
        }
        int i3 = displayMetrics.widthPixels;
        int i4 = displayMetrics.heightPixels;
        double d = i3;
        this.y = (int) ((160.0d / displayMetrics.densityDpi) * d);
        this.z = (int) (i4 * (160.0d / displayMetrics.densityDpi));
        int i5 = (displayMetrics.heightPixels - i2) - i;
        if (e().getScaleX() != 1.0f && e().getScaleY() != 1.0f) {
            this.y = e().getWidthDp();
            this.z = e().getHeightDp();
            int b2 = (com.fyber.inneractive.sdk.util.l.b(e().getHeightDp()) - i2) - i;
            this.A = this.y;
            this.B = (int) (b2 * (160.0d / displayMetrics.densityDpi));
            return;
        }
        this.A = (int) (d * (160.0d / displayMetrics.densityDpi));
        this.B = (int) (i5 * (160.0d / displayMetrics.densityDpi));
    }

    @Override // com.fyber.inneractive.sdk.m.a
    public final void b(boolean z) {
        b();
        com.fyber.inneractive.sdk.m.c cVar = this.I;
        if (cVar != null && cVar.getParent() != null && (this.I.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.I.getParent()).removeView(this.I);
            this.I = null;
        }
        z();
        this.b = false;
        super.b(z);
    }

    private void b() {
        try {
            if (this.L != null) {
                IAlog.b("%sunregistering orientation broadcast receiver", IAlog.a(this));
                d<T>.f fVar = this.L;
                try {
                    IAlog.b("%sunregister screen broadcast receiver called", IAlog.a(d.this));
                    if (fVar.a != null) {
                        IAlog.b("%sunregistering broadcast receiver", IAlog.a(d.this));
                        fVar.a.unregisterReceiver(fVar);
                        fVar.a = null;
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (IllegalArgumentException e2) {
            if (!e2.getMessage().contains("Receiver not registered")) {
                throw e2;
            }
        }
        this.L = null;
    }

    public void a() {
        String arrayList;
        ArrayList arrayList2 = new ArrayList();
        if (e().getScaleX() != 1.0f && e().getScaleY() != 1.0f) {
            arrayList2.add(x.a(e().getWidthDp(), e().getHeightDp()));
            arrayList2.add(v.a(e().getWidthDp(), e().getHeightDp()));
        } else {
            arrayList2.add(x.a(this.y, this.z));
            arrayList2.add(v.a(this.A, this.B));
        }
        arrayList2.add(com.fyber.inneractive.sdk.mraid.u.a(com.fyber.inneractive.sdk.util.l.a(e() != null ? e().getWidth() : this.A), com.fyber.inneractive.sdk.util.l.a(e() != null ? e().getHeight() : this.B)));
        if (this.c != null) {
            if (arrayList2.toString().length() >= 2) {
                String str = "{" + arrayList.substring(1, arrayList.length() - 1) + "}";
                this.c.a("window.mraidbridge.fireChangeEvent(" + str + ");");
                IAlog.a("Fire changes: %s", str);
            }
        }
        aa aaVar = aa.DEFAULT;
        this.u = aaVar;
        a(y.a(aaVar));
    }

    public final boolean q() {
        return this.u == aa.EXPANDED;
    }

    public final boolean r() {
        return this.u == aa.RESIZED;
    }

    public final void s() {
        this.J = false;
        if (this.u != aa.EXPANDED && this.u != aa.RESIZED) {
            if (this.u == aa.DEFAULT) {
                if (this.c != null) {
                    this.c.setVisibility(4);
                }
                aa aaVar = aa.HIDDEN;
                this.u = aaVar;
                a(y.a(aaVar));
            }
        } else {
            e(false);
            if (this.c != null) {
                if (this.u == aa.EXPANDED) {
                    z();
                    ViewGroup viewGroup = (ViewGroup) this.O.getParent();
                    if (viewGroup != null) {
                        viewGroup.addView(this.c, this.N, new FrameLayout.LayoutParams(this.R, this.S, 17));
                        viewGroup.removeView(this.O);
                        viewGroup.invalidate();
                        this.c.requestLayout();
                    }
                    this.C = this.R;
                    this.D = this.S;
                } else if (this.u == aa.RESIZED) {
                    this.C = this.R;
                    this.D = this.S;
                    this.c.setLayoutParams(new FrameLayout.LayoutParams(this.R, this.S, 17));
                }
            }
            this.u = aa.DEFAULT;
            d(false);
            a(y.a(this.u));
        }
        if (this.g != 0) {
            ((c) this.g).e();
        }
    }

    public final void a(String str, int i, int i2, boolean z, boolean z2) {
        if (this.c == null || this.F == a.b || this.u != aa.DEFAULT) {
            return;
        }
        if (str != null && !URLUtil.isValidUrl(str)) {
            a(f.a.EXPAND, "URL passed to expand() was invalid.");
            return;
        }
        int i3 = 0;
        try {
            ViewGroup viewGroup = (ViewGroup) this.c.getRootView().findViewById(16908290);
            this.H = viewGroup;
            if (viewGroup == null) {
                IAlog.d("Couldn't find content in the view tree", new Object[0]);
                a(f.a.RESIZE, "Ad can be resized only if it's state is default or resized.");
                return;
            }
            c(z);
            d(z2);
            if (this.D >= 0) {
                this.D = com.fyber.inneractive.sdk.util.l.b(i2);
            }
            if (this.C >= 0) {
                this.C = com.fyber.inneractive.sdk.util.l.b(i);
            }
            com.fyber.inneractive.sdk.m.c cVar = this.c;
            if (str != null) {
                com.fyber.inneractive.sdk.m.c cVar2 = new com.fyber.inneractive.sdk.m.c(v());
                this.I = cVar2;
                cVar2.setId(R.id.inneractive_webview_mraid);
                this.I.loadUrl(str);
                this.I.setWebChromeClient(this.d);
                this.I.setWebViewClient(this.e);
                cVar = this.I;
                cVar.setOnKeyListener(new View.OnKeyListener() { // from class: com.fyber.inneractive.sdk.m.d.3
                    @Override // android.view.View.OnKeyListener
                    public final boolean onKey(View view, int i4, KeyEvent keyEvent) {
                        if (i4 == 4 && d.this.q()) {
                            IAlog.a("back button pressed while ad is expanded, ad will be collapsed.", new Object[0]);
                            d.this.s();
                            return true;
                        }
                        return false;
                    }
                });
            } else {
                ViewGroup viewGroup2 = (ViewGroup) this.c.getParent();
                if (viewGroup2 != null) {
                    int childCount = viewGroup2.getChildCount();
                    while (i3 < childCount && viewGroup2.getChildAt(i3) != this.c) {
                        i3++;
                    }
                    this.N = i3;
                    q.a(this.O);
                    viewGroup2.addView(this.O, i3, new ViewGroup.LayoutParams(this.c.getWidth(), this.c.getHeight()));
                    viewGroup2.removeView(this.c);
                }
            }
            float f2 = this.x;
            int i4 = (int) ((50.0f * f2) + 0.5f);
            if (i2 >= 0 && i >= 0) {
                i = (int) (i * f2);
                i2 = (int) (i2 * f2);
                if (i < i4) {
                    i = i4;
                }
                if (i2 < i4) {
                    i2 = i4;
                }
            }
            View view = new View(v());
            view.setBackgroundColor(v().getResources().getColor(R.color.ia_mraid_expanded_dimmed_bk));
            view.setOnTouchListener(new View.OnTouchListener() { // from class: com.fyber.inneractive.sdk.m.d.7
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return true;
                }
            });
            this.Q.addView(view, new RelativeLayout.LayoutParams(-1, -1));
            q.a(cVar);
            this.P.addView(cVar, new RelativeLayout.LayoutParams(-1, -1));
            q.a(this.P);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i2);
            layoutParams.addRule(13);
            this.Q.addView(this.P, layoutParams);
            q.a(this.Q);
            this.H.addView(this.Q, new ViewGroup.LayoutParams(-1, -1));
            if (cVar != null && !cVar.hasFocus()) {
                cVar.requestFocus();
            }
            if (this.G == e.a || (!this.w && this.G != e.b)) {
                e(true);
            }
            aa aaVar = aa.EXPANDED;
            this.u = aaVar;
            a(y.a(aaVar));
            int i5 = this.C;
            if (i5 != -1 && this.D != -1) {
                a(s.a(com.fyber.inneractive.sdk.util.l.a(i5), com.fyber.inneractive.sdk.util.l.a(this.D)));
            }
            if (this.g != 0) {
                ((c) this.g).c();
            }
        } catch (Exception unused) {
            IAlog.d("Couldn't find content in the view tree", new Object[0]);
            a(f.a.RESIZE, "Ad can be resized only if it's state is default or resized.");
        }
    }

    public final void a(int i, int i2, int i3, int i4, boolean z) {
        if (this.c == null) {
            return;
        }
        try {
            ViewGroup viewGroup = (ViewGroup) this.c.getRootView().findViewById(16908290);
            this.H = viewGroup;
            if (viewGroup == null) {
                IAlog.d("Couldn't find content in the view tree", new Object[0]);
                a(f.a.RESIZE, "Ad can be resized only if it's state is default or resized.");
            } else if (this.F == a.b) {
            } else {
                if (this.u != aa.DEFAULT && this.u != aa.RESIZED) {
                    a(f.a.RESIZE, "Ad can be resized only if it's state is default or resized.");
                } else if (i < 0 && i2 < 0) {
                    a(f.a.RESIZE, "Creative size passed to resize() was invalid.");
                } else {
                    c(false);
                    if (this.G == e.a || (!this.w && this.G != e.b)) {
                        e(true);
                    }
                    d(false);
                    this.D = com.fyber.inneractive.sdk.util.l.b(i2);
                    this.C = com.fyber.inneractive.sdk.util.l.b(i);
                    if (!z) {
                        int i5 = (i3 + i) - this.y;
                        if (i5 > 0) {
                            i3 -= i5;
                        }
                        if (i3 < 0) {
                            i3 = 0;
                        }
                        int i6 = (i4 + i2) - this.z;
                        if (i6 > 0) {
                            i4 -= i6;
                        }
                        if (i4 < 0) {
                            i4 = 0;
                        }
                    }
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(com.fyber.inneractive.sdk.util.l.b(i), com.fyber.inneractive.sdk.util.l.b(i2));
                    layoutParams.leftMargin = i3;
                    layoutParams.topMargin = i4;
                    if (i3 == 0 && i4 == 0) {
                        layoutParams.gravity = 17;
                    }
                    this.c.setLayoutParams(layoutParams);
                    if (this.u != aa.RESIZED) {
                        aa aaVar = aa.RESIZED;
                        this.u = aaVar;
                        a(y.a(aaVar));
                        int i7 = this.C;
                        if (i7 != -1 && this.D != -1) {
                            a(s.a(com.fyber.inneractive.sdk.util.l.a(i7), com.fyber.inneractive.sdk.util.l.a(this.D)));
                        }
                    }
                    if (this.g != 0) {
                        ((c) this.g).d();
                    }
                }
            }
        } catch (Exception unused) {
            IAlog.d("Couldn't find content in the view tree", new Object[0]);
            a(f.a.RESIZE, "Ad can be resized only if it's state is default or resized.");
        }
    }

    public final void d(final String str) {
        m.a().post(new Runnable() { // from class: com.fyber.inneractive.sdk.m.d.4
            @Override // java.lang.Runnable
            public final void run() {
                Toast.makeText(com.fyber.inneractive.sdk.util.l.p(), str, 0).show();
            }
        });
    }

    public final void t() {
        a(v.a(this.A, this.B));
    }

    public final void a(Map<String, String> map) {
        boolean z;
        HashMap hashMap;
        boolean z2;
        Context v = v();
        if (!com.fyber.inneractive.sdk.util.k.m()) {
            z = false;
            IAlog.b("createCalendarEvent supported for devices post-ICS", new Object[0]);
            a(f.a.CREATE_CALENDAR_EVENT, "Action is unsupported on this device (need Android version Ice Cream Sandwich or above)");
        } else {
            try {
                hashMap = new HashMap();
            } catch (ActivityNotFoundException unused) {
                z = false;
                IAlog.b("There is no calendar app installed!", new Object[0]);
                a(f.a.CREATE_CALENDAR_EVENT, "Action is unsupported on this device - no calendar app installed");
            } catch (IllegalArgumentException e2) {
                z = false;
                IAlog.b("invalid parameters for create calendar ", e2.getMessage());
                a(f.a.CREATE_CALENDAR_EVENT, e2.getMessage());
            } catch (Exception unused2) {
                z = false;
                IAlog.b("Failed to create calendar event.", new Object[0]);
                a(f.a.CREATE_CALENDAR_EVENT, "could not create calendar event");
            }
            if (!map.containsKey("description") || !map.containsKey("start")) {
                throw new IllegalArgumentException("Missing start and description fields");
            }
            hashMap.put("title", map.get("description"));
            if (map.containsKey("start") && map.get("start") != null) {
                Date f2 = f(map.get("start"));
                if (f2 != null) {
                    hashMap.put("beginTime", Long.valueOf(f2.getTime()));
                    if (map.containsKey("end") && map.get("end") != null) {
                        Date f3 = f(map.get("end"));
                        if (f3 != null) {
                            hashMap.put(SDKConstants.PARAM_END_TIME, Long.valueOf(f3.getTime()));
                        } else {
                            throw new IllegalArgumentException("Invalid calendar event: end time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
                        }
                    }
                    if (map.containsKey(FirebaseAnalytics.Param.LOCATION)) {
                        hashMap.put("eventLocation", map.get(FirebaseAnalytics.Param.LOCATION));
                    }
                    if (map.containsKey("summary")) {
                        hashMap.put("description", map.get("summary"));
                    }
                    if (map.containsKey("transparency")) {
                        hashMap.put("availability", Integer.valueOf("transparent".equals(map.get("transparency")) ? 1 : 0));
                    }
                    StringBuilder sb = new StringBuilder();
                    if (map.containsKey("frequency")) {
                        String str = map.get("frequency");
                        int parseInt = map.containsKey("interval") ? Integer.parseInt(map.get("interval")) : -1;
                        if ("daily".equals(str)) {
                            sb.append("FREQ=DAILY;");
                            if (parseInt != -1) {
                                sb.append("INTERVAL=" + parseInt + ";");
                            }
                        } else if ("weekly".equals(str)) {
                            sb.append("FREQ=WEEKLY;");
                            if (parseInt != -1) {
                                sb.append("INTERVAL=" + parseInt + ";");
                            }
                            if (map.containsKey("daysInWeek")) {
                                String g2 = g(map.get("daysInWeek"));
                                if (g2 == null) {
                                    throw new IllegalArgumentException("invalid ");
                                }
                                sb.append("BYDAY=" + g2 + ";");
                            }
                        } else if ("monthly".equals(str)) {
                            sb.append("FREQ=MONTHLY;");
                            if (parseInt != -1) {
                                sb.append("INTERVAL=" + parseInt + ";");
                            }
                            if (map.containsKey("daysInMonth")) {
                                String h2 = h(map.get("daysInMonth"));
                                if (h2 == null) {
                                    throw new IllegalArgumentException();
                                }
                                sb.append("BYMONTHDAY=" + h2 + ";");
                            }
                        } else {
                            throw new IllegalArgumentException("frequency is only supported for daily, weekly, and monthly.");
                        }
                    }
                    String sb2 = sb.toString();
                    if (!TextUtils.isEmpty(sb2)) {
                        hashMap.put("rrule", sb2);
                    }
                    Intent type = new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.item/event");
                    for (String str2 : hashMap.keySet()) {
                        Object obj = hashMap.get(str2);
                        if (obj instanceof Long) {
                            type.putExtra(str2, ((Long) obj).longValue());
                        } else if (obj instanceof Integer) {
                            type.putExtra(str2, ((Integer) obj).intValue());
                        } else {
                            type.putExtra(str2, (String) obj);
                        }
                    }
                    type.setFlags(DriveFile.MODE_READ_ONLY);
                    v.startActivity(type);
                    z2 = true;
                    if (z2 || this.g == 0) {
                    }
                    ((c) this.g).a();
                    return;
                }
                throw new IllegalArgumentException("Invalid calendar event: start time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
            }
            throw new IllegalArgumentException("Invalid calendar event: start is null.");
        }
        z2 = z;
        if (z2) {
        }
    }

    private static Date f(String str) {
        Date date = null;
        for (int i = 0; i < a.length; i++) {
            try {
                date = new SimpleDateFormat(a[i], Locale.getDefault()).parse(str);
            } catch (ParseException unused) {
            }
            if (date != null) {
                break;
            }
        }
        return date;
    }

    private static String g(String str) throws IllegalArgumentException {
        String str2;
        StringBuilder sb = new StringBuilder();
        boolean[] zArr = new boolean[7];
        String[] split = str.split(",");
        for (String str3 : split) {
            int parseInt = Integer.parseInt(str3);
            if (parseInt == 7) {
                parseInt = 0;
            }
            if (!zArr[parseInt]) {
                StringBuilder sb2 = new StringBuilder();
                switch (parseInt) {
                    case 0:
                        str2 = "SU";
                        break;
                    case 1:
                        str2 = "MO";
                        break;
                    case 2:
                        str2 = "TU";
                        break;
                    case 3:
                        str2 = "WE";
                        break;
                    case 4:
                        str2 = "TH";
                        break;
                    case 5:
                        str2 = "FR";
                        break;
                    case 6:
                        str2 = "SA";
                        break;
                    default:
                        throw new IllegalArgumentException("invalid day of week " + parseInt);
                }
                sb2.append(str2);
                sb2.append(",");
                sb.append(sb2.toString());
                zArr[parseInt] = true;
            }
        }
        if (split.length == 0) {
            throw new IllegalArgumentException("must have at least 1 day of the week if specifying repeating weekly");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    private static String h(String str) throws IllegalArgumentException {
        StringBuilder sb = new StringBuilder();
        boolean[] zArr = new boolean[63];
        String[] split = str.split(",");
        for (String str2 : split) {
            int parseInt = Integer.parseInt(str2);
            int i = parseInt + 31;
            if (!zArr[i]) {
                StringBuilder sb2 = new StringBuilder();
                if (parseInt != 0 && parseInt >= -31 && parseInt <= 31) {
                    sb2.append(String.valueOf(parseInt));
                    sb2.append(",");
                    sb.append(sb2.toString());
                    zArr[i] = true;
                } else {
                    throw new IllegalArgumentException("invalid day of month " + parseInt);
                }
            }
        }
        if (split.length == 0) {
            throw new IllegalArgumentException("must have at least 1 day of the month if specifying repeating weekly");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    private void d(boolean z) {
        try {
            Activity activity = (Activity) v();
            if (activity != null) {
                if (z && activity.getResources() != null && activity.getResources().getConfiguration() != null) {
                    activity.setRequestedOrientation(activity.getResources().getConfiguration().orientation);
                } else {
                    activity.setRequestedOrientation(this.K);
                }
            }
        } catch (Exception unused) {
            IAlog.b("Failed to modify the device orientation.", new Object[0]);
        }
    }

    public void setOrientationProperties(boolean z, String str) {
        if ("portrait".equals(str)) {
            this.E = Orientation.PORTRAIT;
        } else if ("landscape".equals(str)) {
            this.E = Orientation.LANDSCAPE;
        } else {
            this.E = Orientation.NONE;
        }
        if (this.g != 0) {
            ((c) this.g).a(z, this.E);
        }
    }

    private void e(boolean z) {
        if (this.H == null) {
            return;
        }
        if (z) {
            int b2 = com.fyber.inneractive.sdk.util.l.b(35);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(b2, b2);
            layoutParams.addRule(10);
            layoutParams.addRule(11);
            layoutParams.rightMargin = com.fyber.inneractive.sdk.util.l.b(10);
            layoutParams.topMargin = com.fyber.inneractive.sdk.util.l.b(10);
            if (this.M == null) {
                IAcloseButton iAcloseButton = new IAcloseButton(v(), b2);
                this.M = iAcloseButton;
                iAcloseButton.setOnClickListener(new View.OnClickListener() { // from class: com.fyber.inneractive.sdk.m.d.8
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        d.this.s();
                    }
                });
            }
            q.a(this.M);
            this.Q.addView(this.M, layoutParams);
        } else {
            this.Q.removeView(this.M);
        }
        if (this.g != 0) {
            ((c) this.g).a(z);
        }
        this.w = !z;
    }

    public final void c(boolean z) {
        this.w = z;
        if (this.g != 0) {
            ((c) this.g).a(this.w);
        }
    }

    public final Context v() {
        if (this.c != null) {
            return this.c.getContext();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements MediaScannerConnection.MediaScannerConnectionClient {
        private final String b;
        private final String c;
        private MediaScannerConnection d;

        /* synthetic */ b(d dVar, String str, byte b) {
            this(str);
        }

        private b(String str) {
            this.b = str;
            this.c = null;
        }

        @Override // android.media.MediaScannerConnection.MediaScannerConnectionClient
        public final void onMediaScannerConnected() {
            MediaScannerConnection mediaScannerConnection = this.d;
            if (mediaScannerConnection != null) {
                mediaScannerConnection.scanFile(this.b, this.c);
            }
        }

        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
        public final void onScanCompleted(String str, Uri uri) {
            MediaScannerConnection mediaScannerConnection = this.d;
            if (mediaScannerConnection != null) {
                mediaScannerConnection.disconnect();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f extends BroadcastReceiver {
        Context a;
        private int c = -1;

        f() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            int r;
            if ((this.a != null) && "android.intent.action.CONFIGURATION_CHANGED".equals(intent.getAction()) && (r = com.fyber.inneractive.sdk.util.l.r()) != this.c) {
                this.c = r;
                d.b(d.this, context);
            }
        }
    }

    public final void a(t tVar) {
        if (this.c != null) {
            String str = "{" + tVar.toString() + "}";
            this.c.a("window.mraidbridge.fireChangeEvent(" + str + ");");
            IAlog.a("Fire changes: %s", str);
        }
    }

    public final void w() {
        if (this.c != null) {
            this.c.a("window.mraidbridge.fireReadyEvent();");
        }
    }

    @Override // com.fyber.inneractive.sdk.m.c.a
    public final void p() {
        b();
    }

    public final int x() {
        return this.C;
    }

    public final int y() {
        return this.D;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.m.a
    public final aj k() {
        com.fyber.inneractive.sdk.m.c cVar;
        if (this.u == aa.EXPANDED && (cVar = this.I) != null) {
            return cVar.getLastClickedLocation();
        }
        return super.k();
    }

    private void z() {
        FrameLayout frameLayout = this.P;
        if (frameLayout == null || this.Q == null) {
            return;
        }
        frameLayout.removeAllViewsInLayout();
        this.Q.removeAllViewsInLayout();
        ViewGroup viewGroup = this.H;
        if (viewGroup != null) {
            viewGroup.removeView(this.Q);
        }
    }

    @Override // com.fyber.inneractive.sdk.m.a, com.fyber.inneractive.sdk.m.b
    public boolean a(WebView webView, String str) {
        IAlog.b("%shandle url for: %s webView = %s", IAlog.a(this), str, webView);
        if (this.u == aa.EXPANDED && !TextUtils.isEmpty(str) && webView.equals(this.I) && !this.J) {
            this.J = true;
            return false;
        }
        return super.a(webView, str);
    }

    public final void e(String str) {
        new File(Environment.getExternalStorageDirectory(), "Pictures").mkdirs();
        IAConfigManager.h().a(new af(new r<String>() { // from class: com.fyber.inneractive.sdk.m.d.5
            @Override // com.fyber.inneractive.sdk.h.r
            public final /* synthetic */ void a(String str2, Exception exc, boolean z) {
                String str3 = str2;
                if (exc == null) {
                    d.a(d.this, str3);
                } else {
                    m.a().post(new Runnable() { // from class: com.fyber.inneractive.sdk.m.d.5.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            d.this.d("Image failed to download.");
                            d.this.a(f.a.STORE_PICTURE, "Error downloading and saving image file.");
                            IAlog.b("failed to download and save the image file.", new Object[0]);
                        }
                    });
                }
            }
        }, str));
    }

    public final void a(f.a aVar, String str) {
        String str2 = aVar.q;
        if (this.c != null) {
            com.fyber.inneractive.sdk.m.c cVar = this.c;
            cVar.a("window.mraidbridge.fireErrorEvent('" + str2 + "', '" + str + "');");
        }
    }

    @Override // com.fyber.inneractive.sdk.m.a, com.fyber.inneractive.sdk.m.c.a
    public void a(boolean z) {
        a(new ab(z));
        super.a(z);
    }

    @Override // com.fyber.inneractive.sdk.m.c.a
    public final void o() {
        if (this.L == null) {
            try {
                IAlog.b("%sregistering orientation broadcast receiver", IAlog.a(this));
                d<T>.f fVar = new f();
                this.L = fVar;
                Context v = v();
                IAlog.b("%sregister screen broadcast receiver", IAlog.a(d.this));
                fVar.a = v;
                v.registerReceiver(fVar, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
            } catch (Exception e2) {
                IAlog.d("%sfailed registering orientation broadcast recevier", IAlog.a(this));
                if (IAlog.a >= 3) {
                    e2.printStackTrace();
                }
            }
        }
    }

    static /* synthetic */ void a(d dVar, String str) {
        if (dVar.v() != null) {
            b bVar = new b(dVar, str, (byte) 0);
            MediaScannerConnection mediaScannerConnection = new MediaScannerConnection(dVar.v().getApplicationContext(), bVar);
            bVar.d = mediaScannerConnection;
            mediaScannerConnection.connect();
        }
    }

    static /* synthetic */ void b(d dVar, final Context context) {
        if (dVar.c != null) {
            dVar.c.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.fyber.inneractive.sdk.m.d.2
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    if (d.this.c != null) {
                        d.this.c.getViewTreeObserver().removeOnPreDrawListener(this);
                        d.this.b(context);
                        d dVar2 = d.this;
                        dVar2.a(x.a(dVar2.y, d.this.z));
                        d dVar3 = d.this;
                        dVar3.a(v.a(dVar3.A, d.this.B));
                        d dVar4 = d.this;
                        dVar4.a(com.fyber.inneractive.sdk.mraid.u.a(dVar4.A, d.this.B));
                        if (d.this.C > 0 && d.this.D > 0) {
                            d dVar5 = d.this;
                            dVar5.a(s.a(com.fyber.inneractive.sdk.util.l.a(dVar5.C), com.fyber.inneractive.sdk.util.l.a(d.this.D)));
                            return false;
                        } else if (d.this.e() == null || d.this.e().getWidth() <= 0 || d.this.e().getHeight() <= 0) {
                            return false;
                        } else {
                            d dVar6 = d.this;
                            dVar6.a(s.a(com.fyber.inneractive.sdk.util.l.a(dVar6.e().getWidth()), com.fyber.inneractive.sdk.util.l.a(d.this.e().getHeight())));
                            return false;
                        }
                    }
                    return false;
                }
            });
        }
    }
}

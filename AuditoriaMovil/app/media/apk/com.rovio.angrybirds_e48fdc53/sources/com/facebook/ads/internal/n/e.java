package com.facebook.ads.internal.n;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.ads.internal.DisplayAdController;
import com.facebook.ads.internal.adapters.AdAdapter;
import com.facebook.ads.internal.adapters.aa;
import com.facebook.ads.internal.adapters.ab;
import com.facebook.ads.internal.adapters.ac;
import com.facebook.ads.internal.j.a;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.q.a.s;
import com.facebook.ads.internal.r.a;
import com.facebook.ads.internal.view.w;
import com.facebook.ads.internal.view.x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
/* loaded from: classes2.dex */
public class e {
    private static final com.facebook.ads.internal.protocol.d b = com.facebook.ads.internal.protocol.d.ADS;
    private static final String c = e.class.getSimpleName();
    private static WeakHashMap<View, WeakReference<e>> d = new WeakHashMap<>();
    @Deprecated
    private boolean A;
    private long B;
    private com.facebook.ads.internal.view.b.c C;
    private View D;
    private String E;
    private boolean F;
    protected ab a;
    private final Context e;
    private final String f;
    private final String g;
    private final com.facebook.ads.internal.d.b h;
    private com.facebook.ads.internal.n.b i;
    private final d j;
    private DisplayAdController k;
    private volatile boolean l;
    private com.facebook.ads.internal.h.d m;
    private View n;
    private final List<View> o;
    private View.OnTouchListener p;
    private com.facebook.ads.internal.r.a q;
    private a.AbstractC0116a r;
    private final s s;
    private aa t;
    private a u;
    private b v;
    private x w;
    private i x;
    private boolean y;
    private boolean z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener {
        private a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!e.this.s.d()) {
                Log.e("FBAudienceNetworkLog", "No touch data recorded, please ensure touch events reach the ad View by returning false if you intercept the event.");
            }
            int l = com.facebook.ads.internal.l.a.l(e.this.e);
            if (l >= 0 && e.this.s.c() < l) {
                if (e.this.s.b()) {
                    Log.e("FBAudienceNetworkLog", "Clicks happened too fast.");
                    return;
                } else {
                    Log.e("FBAudienceNetworkLog", "Ad cannot be clicked before it is viewed.");
                    return;
                }
            }
            HashMap hashMap = new HashMap();
            hashMap.put("touch", com.facebook.ads.internal.q.a.j.a(e.this.s.e()));
            if (e.this.x != null) {
                hashMap.put("nti", String.valueOf(e.this.x.c()));
            }
            if (e.this.y) {
                hashMap.put("nhs", String.valueOf(e.this.y));
            }
            e.this.q.a(hashMap);
            if (e.this.a != null) {
                e.this.a.b(hashMap);
            }
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (e.this.n == null || e.this.C == null) {
                return false;
            }
            e.this.C.setBounds(0, 0, e.this.n.getWidth(), e.this.n.getHeight());
            e.this.C.a(e.this.C.a() ? false : true);
            return true;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            e.this.s.a(motionEvent, e.this.n, view);
            return e.this.p != null && e.this.p.onTouch(view, motionEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class b extends BroadcastReceiver {
        private boolean b;

        private b() {
        }

        public void a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.facebook.ads.native.impression:" + e.this.g);
            intentFilter.addAction("com.facebook.ads.native.click:" + e.this.g);
            LocalBroadcastManager.getInstance(e.this.e).registerReceiver(this, intentFilter);
            this.b = true;
        }

        public void b() {
            if (this.b) {
                try {
                    LocalBroadcastManager.getInstance(e.this.e).unregisterReceiver(this);
                } catch (Exception e) {
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String str = intent.getAction().split(":")[0];
            if ("com.facebook.ads.native.impression".equals(str) && e.this.t != null) {
                e.this.t.a();
            } else if (!"com.facebook.ads.native.click".equals(str) || e.this.a == null) {
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("mil", String.valueOf(true));
                e.this.a.b(hashMap);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class c extends com.facebook.ads.internal.adapters.c {
        private c() {
        }

        @Override // com.facebook.ads.internal.adapters.c
        public void a() {
            if (e.this.i != null) {
                e.this.i.c();
            }
        }

        @Override // com.facebook.ads.internal.adapters.c
        public void b() {
        }

        @Override // com.facebook.ads.internal.adapters.c
        public boolean c() {
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public interface d {
        boolean a(View view);
    }

    public e(Context context, ab abVar, com.facebook.ads.internal.h.d dVar, d dVar2) {
        this(context, null, dVar2);
        this.a = abVar;
        this.m = dVar;
        this.l = true;
        this.D = new View(context);
    }

    public e(Context context, String str, d dVar) {
        this.g = UUID.randomUUID().toString();
        this.o = new ArrayList();
        this.s = new s();
        this.z = false;
        this.F = false;
        this.e = context;
        this.f = str;
        this.j = dVar;
        this.h = new com.facebook.ads.internal.d.b(context);
        this.D = new View(context);
    }

    public e(e eVar) {
        this(eVar.e, null, eVar.j);
        this.m = eVar.m;
        this.a = eVar.a;
        this.l = true;
        this.D = new View(this.e);
    }

    private int G() {
        if (this.m != null) {
            return this.m.g();
        }
        if (this.k == null || this.k.a() == null) {
            return 0;
        }
        return this.k.a().g();
    }

    private int H() {
        if (this.m != null) {
            return this.m.h();
        }
        if (this.a != null) {
            return this.a.j();
        }
        if (this.k == null || this.k.a() == null) {
            return 0;
        }
        return this.k.a().h();
    }

    private int I() {
        if (this.m != null) {
            return this.m.i();
        }
        if (this.a != null) {
            return this.a.k();
        }
        if (this.k == null || this.k.a() == null) {
            return 1000;
        }
        return this.k.a().i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean J() {
        return z() == j.DEFAULT ? this.A : z() == j.ON;
    }

    private void K() {
        for (View view : this.o) {
            view.setOnClickListener(null);
            view.setOnTouchListener(null);
            view.setOnLongClickListener(null);
        }
        this.o.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        if (this.a == null || !this.a.d()) {
            return;
        }
        this.v = new b();
        this.v.a();
        this.t = new aa(this.e, new com.facebook.ads.internal.adapters.c() { // from class: com.facebook.ads.internal.n.e.4
            @Override // com.facebook.ads.internal.adapters.c
            public boolean c() {
                return true;
            }
        }, this.q, this.a);
    }

    public static void a(f fVar, ImageView imageView) {
        if (fVar == null || imageView == null) {
            return;
        }
        new com.facebook.ads.internal.view.b.d(imageView).a(fVar.c(), fVar.b()).a(fVar.a());
    }

    private void a(List<View> list, View view) {
        if (this.j == null || !this.j.a(view)) {
            list.add(view);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    a(list, viewGroup.getChildAt(i));
                }
            }
        }
    }

    private void b(View view) {
        this.o.add(view);
        view.setOnClickListener(this.u);
        view.setOnTouchListener(this.u);
        if (com.facebook.ads.internal.l.a.b(view.getContext())) {
            view.setOnLongClickListener(this.u);
        }
    }

    public List<e> A() {
        if (f()) {
            return this.a.B();
        }
        return null;
    }

    public String B() {
        if (f()) {
            return this.a.c();
        }
        return null;
    }

    public void C() {
        this.D.performClick();
    }

    public void D() {
        if (this.n == null) {
            return;
        }
        if (!d.containsKey(this.n) || d.get(this.n).get() != this) {
            throw new IllegalStateException("View not registered with this NativeAd");
        }
        if ((this.n instanceof ViewGroup) && this.w != null) {
            ((ViewGroup) this.n).removeView(this.w);
            this.w = null;
        }
        if (this.a != null) {
            this.a.b_();
        }
        if (this.C != null && com.facebook.ads.internal.l.a.b(this.e)) {
            this.C.b();
            this.n.getOverlay().remove(this.C);
        }
        d.remove(this.n);
        K();
        this.n = null;
        if (this.q != null) {
            this.q.b();
            this.q = null;
        }
        this.t = null;
    }

    public void E() {
        if (this.F) {
            this.t = new aa(this.e, new c() { // from class: com.facebook.ads.internal.n.e.5
                @Override // com.facebook.ads.internal.adapters.c
                public boolean d() {
                    return true;
                }

                @Override // com.facebook.ads.internal.adapters.c
                public String e() {
                    return e.this.E;
                }
            }, this.q, this.a);
        }
    }

    public void F() {
        if (this.t == null) {
            return;
        }
        this.t.a();
    }

    public ab a() {
        return this.a;
    }

    public void a(View.OnTouchListener onTouchListener) {
        this.p = onTouchListener;
    }

    public void a(View view) {
        ArrayList arrayList = new ArrayList();
        a(arrayList, view);
        a(view, arrayList);
    }

    public void a(View view, List<View> list) {
        if (view == null) {
            throw new IllegalArgumentException("Must provide a View");
        }
        if (list == null || list.size() == 0) {
            throw new IllegalArgumentException("Invalid set of clickable views");
        }
        if (!f()) {
            Log.e(c, "Ad not loaded");
            return;
        }
        if (this.n != null) {
            Log.w(c, "Native Ad was already registered with a View. Auto unregistering and proceeding.");
            D();
        }
        if (d.containsKey(view)) {
            Log.w(c, "View already registered with a NativeAd. Auto unregistering and proceeding.");
            d.get(view).get().D();
        }
        this.u = new a();
        this.n = view;
        if (view instanceof ViewGroup) {
            this.w = new x(view.getContext(), new w() { // from class: com.facebook.ads.internal.n.e.2
                @Override // com.facebook.ads.internal.view.w
                public void a(int i) {
                    if (e.this.a != null) {
                        e.this.a.a(i);
                    }
                }
            });
            ((ViewGroup) view).addView(this.w);
        }
        ArrayList<View> arrayList = new ArrayList(list);
        if (this.D != null) {
            arrayList.add(this.D);
        }
        for (View view2 : arrayList) {
            b(view2);
        }
        this.a.a(view, arrayList);
        int d2 = d();
        this.r = new a.AbstractC0116a() { // from class: com.facebook.ads.internal.n.e.3
            @Override // com.facebook.ads.internal.r.a.AbstractC0116a
            public void a() {
                e.this.s.a();
                e.this.q.b();
                if (e.this.t == null) {
                    if (e.this.q != null) {
                        e.this.q.b();
                        e.this.q = null;
                        return;
                    }
                    return;
                }
                e.this.t.a(e.this.n);
                e.this.t.a(e.this.x);
                e.this.t.a(e.this.y);
                e.this.t.b(e.this.z);
                e.this.t.c(e.this.J());
                e.this.t.a();
            }
        };
        this.q = new com.facebook.ads.internal.r.a(this.n, d2, G(), true, this.r);
        this.q.a(H());
        this.q.b(I());
        this.q.a();
        this.t = new aa(this.e, new c(), this.q, this.a);
        this.t.a(arrayList);
        d.put(view, new WeakReference<>(this));
        if (com.facebook.ads.internal.l.a.b(this.e)) {
            this.C = new com.facebook.ads.internal.view.b.c();
            this.C.a(this.f);
            this.C.b(this.e.getPackageName());
            this.C.a(this.q);
            if (this.a.D() > 0) {
                this.C.a(this.a.D(), this.a.C());
            }
            if (this.m != null) {
                this.C.a(this.m.a());
            } else if (this.k != null && this.k.a() != null) {
                this.C.a(this.k.a().a());
            }
            this.n.getOverlay().add(this.C);
        }
    }

    public void a(ac acVar) {
        if (this.a == null) {
            return;
        }
        this.a.a(acVar);
    }

    public void a(com.facebook.ads.internal.n.b bVar) {
        this.i = bVar;
    }

    public void a(i iVar) {
        this.x = iVar;
    }

    public void a(String str) {
        this.F = true;
        this.E = str;
    }

    public void a(final Set<com.facebook.ads.internal.n.d> set, String str) {
        if (this.l) {
            throw new IllegalStateException("loadAd cannot be called more than once");
        }
        this.B = System.currentTimeMillis();
        this.l = true;
        this.k = new DisplayAdController(this.e, this.f, com.facebook.ads.internal.protocol.f.NATIVE_UNKNOWN, AdPlacementType.NATIVE, null, b, 1, true);
        this.k.a(new com.facebook.ads.internal.adapters.a() { // from class: com.facebook.ads.internal.n.e.1
            @Override // com.facebook.ads.internal.adapters.a
            public void a() {
                if (e.this.i != null) {
                    e.this.i.b();
                }
            }

            @Override // com.facebook.ads.internal.adapters.a
            public void a(AdAdapter adAdapter) {
                if (e.this.k != null) {
                    e.this.k.b();
                }
            }

            @Override // com.facebook.ads.internal.adapters.a
            public void a(final ab abVar) {
                com.facebook.ads.internal.j.b.a(com.facebook.ads.internal.j.a.a(a.b.LOADING_AD, AdPlacementType.NATIVE.toString(), System.currentTimeMillis() - e.this.B, null));
                if (abVar == null) {
                    return;
                }
                if (set.contains(com.facebook.ads.internal.n.d.ICON) && abVar.l() != null) {
                    e.this.h.a(abVar.l().a(), abVar.l().c(), abVar.l().b());
                }
                if (set.contains(com.facebook.ads.internal.n.d.IMAGE)) {
                    if (abVar.m() != null) {
                        e.this.h.a(abVar.m().a(), abVar.m().c(), abVar.m().b());
                    }
                    if (abVar.B() != null) {
                        for (e eVar : abVar.B()) {
                            if (eVar.j() != null) {
                                e.this.h.a(eVar.j().a(), eVar.j().c(), eVar.j().b());
                            }
                        }
                    }
                }
                if (set.contains(com.facebook.ads.internal.n.d.VIDEO) && !TextUtils.isEmpty(abVar.x())) {
                    e.this.h.a(abVar.x());
                }
                e.this.h.a(new com.facebook.ads.internal.d.a() { // from class: com.facebook.ads.internal.n.e.1.1
                    private void c() {
                        e.this.a = abVar;
                        e.this.L();
                        e.this.E();
                        if (e.this.i != null) {
                            e.this.i.a();
                        }
                    }

                    @Override // com.facebook.ads.internal.d.a
                    public void a() {
                        c();
                    }

                    @Override // com.facebook.ads.internal.d.a
                    public void b() {
                        c();
                    }
                });
                if (e.this.i == null || abVar.B() == null) {
                    return;
                }
                ac acVar = new ac() { // from class: com.facebook.ads.internal.n.e.1.2
                    @Override // com.facebook.ads.internal.adapters.ac
                    public void a(ab abVar2) {
                    }

                    @Override // com.facebook.ads.internal.adapters.ac
                    public void a(ab abVar2, com.facebook.ads.internal.protocol.a aVar) {
                    }

                    @Override // com.facebook.ads.internal.adapters.ac
                    public void b(ab abVar2) {
                    }

                    @Override // com.facebook.ads.internal.adapters.ac
                    public void c(ab abVar2) {
                        if (e.this.i != null) {
                            e.this.i.b();
                        }
                    }
                };
                for (e eVar2 : abVar.B()) {
                    eVar2.a(acVar);
                }
            }

            @Override // com.facebook.ads.internal.adapters.a
            public void a(com.facebook.ads.internal.protocol.a aVar) {
                if (e.this.i != null) {
                    e.this.i.a(aVar);
                }
            }

            @Override // com.facebook.ads.internal.adapters.a
            public void b() {
                throw new IllegalStateException("Native ads manager their own impressions.");
            }
        });
        this.k.a(str);
    }

    public void a(boolean z) {
        this.A = z;
    }

    public com.facebook.ads.internal.n.c b() {
        if (!f() || this.a == null) {
            return null;
        }
        return this.a.E();
    }

    public void b(String str) {
        if (this.a == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("eil", String.valueOf(true));
        hashMap.put("eil_source", str);
        this.a.b(hashMap);
    }

    public void b(boolean z) {
        this.y = z;
    }

    public void c() {
        if (this.v != null) {
            this.v.b();
            this.v = null;
        }
        if (this.k != null) {
            this.k.b(true);
            this.k = null;
        }
    }

    public void c(boolean z) {
        this.z = z;
    }

    public int d() {
        if (this.m != null) {
            return this.m.f();
        }
        if (this.k == null || this.k.a() == null) {
            return 1;
        }
        return this.k.a().f();
    }

    public String e() {
        return this.f;
    }

    public boolean f() {
        return this.a != null && this.a.c_();
    }

    public boolean g() {
        return f() && this.a.g();
    }

    public boolean h() {
        return this.a != null && this.a.a_();
    }

    public f i() {
        if (f()) {
            return this.a.l();
        }
        return null;
    }

    public f j() {
        if (f()) {
            return this.a.m();
        }
        return null;
    }

    public h k() {
        if (f()) {
            return this.a.n();
        }
        return null;
    }

    public String l() {
        if (f()) {
            return this.a.o();
        }
        return null;
    }

    public String m() {
        if (f()) {
            return this.a.p();
        }
        return null;
    }

    public String n() {
        if (f()) {
            return this.a.q();
        }
        return null;
    }

    public String o() {
        if (f()) {
            return this.a.G();
        }
        return null;
    }

    public String p() {
        if (f()) {
            return this.a.r();
        }
        return null;
    }

    public String q() {
        if (f()) {
            return this.a.s();
        }
        return null;
    }

    public g r() {
        if (f()) {
            return this.a.t();
        }
        return null;
    }

    public String s() {
        if (f()) {
            return this.g;
        }
        return null;
    }

    public f t() {
        if (f()) {
            return this.a.u();
        }
        return null;
    }

    public String u() {
        if (f()) {
            return this.a.v();
        }
        return null;
    }

    public String v() {
        if (f()) {
            return this.a.w();
        }
        return null;
    }

    public String w() {
        if (!f() || TextUtils.isEmpty(this.a.x())) {
            return null;
        }
        return this.h.b(this.a.x());
    }

    public String x() {
        if (f()) {
            return this.a.y();
        }
        return null;
    }

    public String y() {
        if (f()) {
            return this.a.A();
        }
        return null;
    }

    public j z() {
        return !f() ? j.DEFAULT : this.a.z();
    }
}

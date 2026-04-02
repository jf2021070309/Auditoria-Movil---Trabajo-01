package com.adcolony.sdk;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.VideoView;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class aa extends FrameLayout {
    boolean a;
    boolean b;
    Context c;
    VideoView d;
    private HashMap<Integer, r> e;
    private HashMap<Integer, p> f;
    private HashMap<Integer, ao> g;
    private HashMap<Integer, s> h;
    private HashMap<Integer, ae> i;
    private HashMap<Integer, al> j;
    private HashMap<Integer, aq> k;
    private HashMap<Integer, Boolean> l;
    private HashMap<Integer, View> m;
    private int n;
    private int o;
    private int p;
    private int q;
    private String r;
    private float s;
    private double t;
    private long u;
    private ArrayList<f> v;
    private ArrayList<String> w;
    private boolean x;
    private boolean y;
    private boolean z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aa(Context context, String str) {
        super(context);
        this.s = 0.0f;
        this.t = PangleAdapterUtils.CPM_DEFLAUT_VALUE;
        this.u = 0L;
        this.c = context;
        this.r = str;
        setBackgroundColor(-16777216);
    }

    boolean a(d dVar) {
        JSONObject b = dVar.b();
        return as.c(b, "container_id") == this.p && as.b(b, "ad_session_id").equals(this.r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(d dVar) {
        this.e = new HashMap<>();
        this.f = new HashMap<>();
        this.g = new HashMap<>();
        this.h = new HashMap<>();
        this.i = new HashMap<>();
        this.j = new HashMap<>();
        this.k = new HashMap<>();
        this.l = new HashMap<>();
        this.m = new HashMap<>();
        this.v = new ArrayList<>();
        this.w = new ArrayList<>();
        JSONObject b = dVar.b();
        this.p = as.c(b, "id");
        this.n = as.c(b, "width");
        this.o = as.c(b, "height");
        this.q = as.c(b, "module_id");
        this.b = as.d(b, "viewability_enabled");
        this.x = this.p == 1;
        af a = a.a();
        if (this.n == 0 && this.o == 0) {
            this.n = a.a.l();
            this.o = a.b().getMultiWindowEnabled() ? a.a.m() - q.b(a.c()) : a.a.m();
        } else {
            setLayoutParams(new FrameLayout.LayoutParams(this.n, this.o));
        }
        this.v.add(a.a("VideoView.create", new f() { // from class: com.adcolony.sdk.aa.1
            @Override // com.adcolony.sdk.f
            public void a(d dVar2) {
                if (aa.this.a(dVar2)) {
                    aa.this.g(dVar2);
                }
            }
        }, true));
        this.v.add(a.a("VideoView.destroy", new f() { // from class: com.adcolony.sdk.aa.12
            @Override // com.adcolony.sdk.f
            public void a(d dVar2) {
                if (aa.this.a(dVar2)) {
                    aa.this.h(dVar2);
                }
            }
        }, true));
        this.v.add(a.a("WebView.create", new f() { // from class: com.adcolony.sdk.aa.13
            @Override // com.adcolony.sdk.f
            public void a(d dVar2) {
                if (aa.this.a(dVar2)) {
                    aa.this.i(dVar2);
                }
            }
        }, true));
        this.v.add(a.a("WebView.destroy", new f() { // from class: com.adcolony.sdk.aa.14
            @Override // com.adcolony.sdk.f
            public void a(d dVar2) {
                if (aa.this.a(dVar2)) {
                    aa.this.j(dVar2);
                }
            }
        }, true));
        this.v.add(a.a("RenderView.create", new f() { // from class: com.adcolony.sdk.aa.2
            @Override // com.adcolony.sdk.f
            public void a(d dVar2) {
                if (aa.this.a(dVar2)) {
                    aa.this.m(dVar2);
                }
            }
        }, true));
        this.v.add(a.a("RenderView.destroy", new f() { // from class: com.adcolony.sdk.aa.3
            @Override // com.adcolony.sdk.f
            public void a(d dVar2) {
                if (aa.this.a(dVar2)) {
                    aa.this.n(dVar2);
                }
            }
        }, true));
        this.v.add(a.a("TextView.create", new f() { // from class: com.adcolony.sdk.aa.4
            @Override // com.adcolony.sdk.f
            public void a(d dVar2) {
                if (aa.this.a(dVar2)) {
                    aa.this.k(dVar2);
                }
            }
        }, true));
        this.v.add(a.a("TextView.destroy", new f() { // from class: com.adcolony.sdk.aa.5
            @Override // com.adcolony.sdk.f
            public void a(d dVar2) {
                if (aa.this.a(dVar2)) {
                    aa.this.l(dVar2);
                }
            }
        }, true));
        this.v.add(a.a("ImageView.create", new f() { // from class: com.adcolony.sdk.aa.6
            @Override // com.adcolony.sdk.f
            public void a(d dVar2) {
                if (aa.this.a(dVar2)) {
                    aa.this.e(dVar2);
                }
            }
        }, true));
        this.v.add(a.a("ImageView.destroy", new f() { // from class: com.adcolony.sdk.aa.7
            @Override // com.adcolony.sdk.f
            public void a(d dVar2) {
                if (aa.this.a(dVar2)) {
                    aa.this.f(dVar2);
                }
            }
        }, true));
        this.v.add(a.a("ColorView.create", new f() { // from class: com.adcolony.sdk.aa.8
            @Override // com.adcolony.sdk.f
            public void a(d dVar2) {
                if (aa.this.a(dVar2)) {
                    aa.this.c(dVar2);
                }
            }
        }, true));
        this.v.add(a.a("ColorView.destroy", new f() { // from class: com.adcolony.sdk.aa.9
            @Override // com.adcolony.sdk.f
            public void a(d dVar2) {
                if (aa.this.a(dVar2)) {
                    aa.this.d(dVar2);
                }
            }
        }, true));
        this.w.add("VideoView.create");
        this.w.add("VideoView.destroy");
        this.w.add("WebView.create");
        this.w.add("WebView.destroy");
        this.w.add("RenderView.create");
        this.w.add("RenderView.destroy");
        this.w.add("TextView.create");
        this.w.add("TextView.destroy");
        this.w.add("ImageView.create");
        this.w.add("ImageView.destroy");
        this.w.add("ColorView.create");
        this.w.add("ColorView.destroy");
        this.d = new VideoView(this.c);
        this.d.setVisibility(8);
        addView(this.d);
        if (this.b) {
            d(as.d(dVar.b(), "advanced_viewability"));
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action != 0 && action != 1 && action != 3 && action != 2 && action != 5 && action != 6) {
            return false;
        }
        af a = a.a();
        ab j = a.j();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        JSONObject a2 = as.a();
        as.b(a2, "view_id", -1);
        as.a(a2, "ad_session_id", this.r);
        as.b(a2, "container_x", x);
        as.b(a2, "container_y", y);
        as.b(a2, "view_x", x);
        as.b(a2, "view_y", y);
        as.b(a2, "id", this.p);
        switch (action) {
            case 0:
                new d("AdContainer.on_touch_began", this.q, a2).a();
                break;
            case 1:
                if (!this.x) {
                    a.a(j.d().get(this.r));
                }
                new d("AdContainer.on_touch_ended", this.q, a2).a();
                break;
            case 2:
                new d("AdContainer.on_touch_moved", this.q, a2).a();
                break;
            case 3:
                new d("AdContainer.on_touch_cancelled", this.q, a2).a();
                break;
            case 5:
                int action2 = (motionEvent.getAction() & 65280) >> 8;
                as.b(a2, "container_x", (int) motionEvent.getX(action2));
                as.b(a2, "container_y", (int) motionEvent.getY(action2));
                as.b(a2, "view_x", (int) motionEvent.getX(action2));
                as.b(a2, "view_y", (int) motionEvent.getY(action2));
                new d("AdContainer.on_touch_began", this.q, a2).a();
                break;
            case 6:
                int action3 = (motionEvent.getAction() & 65280) >> 8;
                as.b(a2, "container_x", (int) motionEvent.getX(action3));
                as.b(a2, "container_y", (int) motionEvent.getY(action3));
                as.b(a2, "view_x", (int) motionEvent.getX(action3));
                as.b(a2, "view_y", (int) motionEvent.getY(action3));
                as.b(a2, "x", (int) motionEvent.getX(action3));
                as.b(a2, "y", (int) motionEvent.getY(action3));
                if (!this.x) {
                    a.a(j.d().get(this.r));
                }
                new d("AdContainer.on_touch_ended", this.q, a2).a();
                break;
        }
        return true;
    }

    void c(d dVar) {
        int c = as.c(dVar.b(), "id");
        ae aeVar = new ae(this.c, dVar, c, this);
        aeVar.a();
        this.i.put(Integer.valueOf(c), aeVar);
        this.m.put(Integer.valueOf(c), aeVar);
    }

    boolean d(d dVar) {
        int c = as.c(dVar.b(), "id");
        View remove = this.m.remove(Integer.valueOf(c));
        ae remove2 = this.i.remove(Integer.valueOf(c));
        if (remove == null || remove2 == null) {
            a.a().j().a(dVar.c(), "" + c);
            return false;
        }
        removeView(remove2);
        return true;
    }

    void e(d dVar) {
        int c = as.c(dVar.b(), "id");
        aq aqVar = new aq(this.c, dVar, c, this);
        aqVar.a();
        this.k.put(Integer.valueOf(c), aqVar);
        this.m.put(Integer.valueOf(c), aqVar);
    }

    boolean f(d dVar) {
        int c = as.c(dVar.b(), "id");
        View remove = this.m.remove(Integer.valueOf(c));
        aq remove2 = this.k.remove(Integer.valueOf(c));
        if (remove == null || remove2 == null) {
            a.a().j().a(dVar.c(), "" + c);
            return false;
        }
        removeView(remove2);
        return true;
    }

    void g(d dVar) {
        int c = as.c(dVar.b(), "id");
        r rVar = new r(this.c, dVar, c, this);
        rVar.b();
        this.e.put(Integer.valueOf(c), rVar);
        this.m.put(Integer.valueOf(c), rVar);
    }

    boolean h(d dVar) {
        int c = as.c(dVar.b(), "id");
        View remove = this.m.remove(Integer.valueOf(c));
        r remove2 = this.e.remove(Integer.valueOf(c));
        if (remove == null || remove2 == null) {
            a.a().j().a(dVar.c(), "" + c);
            return false;
        }
        if (remove2.h()) {
            remove2.d();
        }
        remove2.a();
        removeView(remove2);
        return true;
    }

    boolean i(d dVar) {
        s sVar;
        JSONObject b = dVar.b();
        int c = as.c(b, "id");
        boolean d = as.d(b, "is_module");
        af a = a.a();
        if (d) {
            sVar = a.u().get(Integer.valueOf(as.c(b, "module_id")));
            if (sVar == null) {
                au.g.b("Module WebView created with invalid id");
                return false;
            }
            sVar.a(dVar, c, this);
        } else {
            sVar = new s(this.c, dVar, c, a.n().d(), this);
        }
        this.h.put(Integer.valueOf(c), sVar);
        this.m.put(Integer.valueOf(c), sVar);
        JSONObject a2 = as.a();
        as.b(a2, "module_id", sVar.a());
        dVar.a(a2).a();
        return true;
    }

    boolean j(d dVar) {
        int c = as.c(dVar.b(), "id");
        af a = a.a();
        View remove = this.m.remove(Integer.valueOf(c));
        s remove2 = this.h.remove(Integer.valueOf(c));
        if (remove2 == null || remove == null) {
            a.j().a(dVar.c(), "" + c);
            return false;
        }
        a.n().a(remove2.a());
        removeView(remove2);
        return true;
    }

    void k(d dVar) {
        JSONObject b = dVar.b();
        int c = as.c(b, "id");
        if (as.d(b, "editable")) {
            al alVar = new al(this.c, dVar, c, this);
            alVar.a();
            this.j.put(Integer.valueOf(c), alVar);
            this.m.put(Integer.valueOf(c), alVar);
            this.l.put(Integer.valueOf(c), true);
        } else if (!as.d(b, "button")) {
            p pVar = new p(this.c, dVar, c, this);
            pVar.a();
            this.f.put(Integer.valueOf(c), pVar);
            this.m.put(Integer.valueOf(c), pVar);
            this.l.put(Integer.valueOf(c), false);
        } else {
            p pVar2 = new p(this.c, 16974145, dVar, c, this);
            pVar2.a();
            this.f.put(Integer.valueOf(c), pVar2);
            this.m.put(Integer.valueOf(c), pVar2);
            this.l.put(Integer.valueOf(c), false);
        }
    }

    boolean l(d dVar) {
        p remove;
        int c = as.c(dVar.b(), "id");
        View remove2 = this.m.remove(Integer.valueOf(c));
        if (this.l.remove(Integer.valueOf(this.p)).booleanValue()) {
            remove = this.j.remove(Integer.valueOf(c));
        } else {
            remove = this.f.remove(Integer.valueOf(c));
        }
        if (remove2 == null || remove == null) {
            a.a().j().a(dVar.c(), "" + c);
            return false;
        }
        removeView(remove);
        return true;
    }

    void m(d dVar) {
        int c = as.c(dVar.b(), "id");
        ao aoVar = new ao(this.c, dVar, c, this);
        aoVar.a();
        this.g.put(Integer.valueOf(c), aoVar);
        this.m.put(Integer.valueOf(c), aoVar);
    }

    boolean n(d dVar) {
        int c = as.c(dVar.b(), "id");
        View remove = this.m.remove(Integer.valueOf(c));
        ao remove2 = this.g.remove(Integer.valueOf(c));
        if (remove == null || remove2 == null) {
            a.a().j().a(dVar.c(), "" + c);
            return false;
        }
        remove2.b();
        removeView(remove2);
        return true;
    }

    private void d(final boolean z) {
        final Runnable runnable = new Runnable() { // from class: com.adcolony.sdk.aa.10
            @Override // java.lang.Runnable
            public void run() {
                if (aa.this.u == 0) {
                    aa.this.u = System.currentTimeMillis();
                }
                float a = z.a((View) aa.this.getParent(), a.c(), true, z, true);
                double b = q.b(q.a((Context) a.c()));
                long currentTimeMillis = System.currentTimeMillis();
                if (aa.this.u + 200 < currentTimeMillis) {
                    aa.this.u = currentTimeMillis;
                    if (aa.this.s != a || aa.this.t != b) {
                        aa.this.a(a, b);
                    }
                    aa.this.s = a;
                    aa.this.t = b;
                }
            }
        };
        new Thread(new Runnable() { // from class: com.adcolony.sdk.aa.11
            @Override // java.lang.Runnable
            public void run() {
                while (!aa.this.a) {
                    q.a(runnable);
                    try {
                        Thread.sleep(200L);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(float f, double d) {
        JSONObject a = as.a();
        as.b(a, "id", this.p);
        as.a(a, "ad_session_id", this.r);
        as.a(a, "exposure", f);
        as.a(a, "volume", d);
        new d("AdContainer.on_exposure_change", this.q, a).a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a() {
        return this.r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HashMap<Integer, r> d() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HashMap<Integer, p> e() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HashMap<Integer, ao> f() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HashMap<Integer, s> g() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HashMap<Integer, al> h() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HashMap<Integer, aq> i() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HashMap<Integer, Boolean> j() {
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HashMap<Integer, View> k() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList<f> l() {
        return this.v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList<String> m() {
        return this.w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int n() {
        return this.o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        this.o = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int o() {
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(int i) {
        this.n = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean p() {
        return this.x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        this.x = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean q() {
        return this.z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(boolean z) {
        this.z = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean r() {
        return this.y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(boolean z) {
        this.y = z;
    }
}

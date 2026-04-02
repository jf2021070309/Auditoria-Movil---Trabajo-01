package com.iab.omid.library.applovin.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.applovin.c.a;
import com.iab.omid.library.applovin.d.d;
import com.iab.omid.library.applovin.d.f;
import com.iab.omid.library.applovin.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class TreeWalker implements a.InterfaceC0098a {
    private static TreeWalker a = new TreeWalker();

    /* renamed from: b  reason: collision with root package name */
    private static Handler f4813b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    private static Handler f4814c = null;

    /* renamed from: l  reason: collision with root package name */
    private static final Runnable f4815l = new Runnable() { // from class: com.iab.omid.library.applovin.walking.TreeWalker.2
        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.getInstance().h();
        }
    };

    /* renamed from: m  reason: collision with root package name */
    private static final Runnable f4816m = new Runnable() { // from class: com.iab.omid.library.applovin.walking.TreeWalker.3
        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.f4814c != null) {
                TreeWalker.f4814c.post(TreeWalker.f4815l);
                TreeWalker.f4814c.postDelayed(TreeWalker.f4816m, 200L);
            }
        }
    };

    /* renamed from: e  reason: collision with root package name */
    private int f4818e;

    /* renamed from: k  reason: collision with root package name */
    private long f4824k;

    /* renamed from: d  reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f4817d = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private boolean f4819f = false;

    /* renamed from: g  reason: collision with root package name */
    private final List<com.iab.omid.library.applovin.e.a> f4820g = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private a f4822i = new a();

    /* renamed from: h  reason: collision with root package name */
    private com.iab.omid.library.applovin.c.b f4821h = new com.iab.omid.library.applovin.c.b();

    /* renamed from: j  reason: collision with root package name */
    private b f4823j = new b(new com.iab.omid.library.applovin.walking.a.c());

    /* loaded from: classes2.dex */
    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i2, long j2);
    }

    /* loaded from: classes2.dex */
    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i2, long j2);
    }

    private void a(long j2) {
        if (this.f4817d.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f4817d) {
                treeWalkerTimeLogger.onTreeProcessed(this.f4818e, TimeUnit.NANOSECONDS.toMillis(j2));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f4818e, j2);
                }
            }
        }
    }

    private void a(View view, com.iab.omid.library.applovin.c.a aVar, JSONObject jSONObject, c cVar, boolean z) {
        aVar.a(view, jSONObject, this, cVar == c.PARENT_VIEW, z);
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.applovin.c.a b2 = this.f4821h.b();
        String a2 = this.f4822i.a(str);
        if (a2 != null) {
            JSONObject a3 = b2.a(view);
            com.iab.omid.library.applovin.d.b.a(a3, str);
            com.iab.omid.library.applovin.d.b.b(a3, a2);
            com.iab.omid.library.applovin.d.b.a(jSONObject, a3);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        String a2 = this.f4822i.a(view);
        if (a2 != null) {
            com.iab.omid.library.applovin.d.b.a(jSONObject, a2);
            com.iab.omid.library.applovin.d.b.a(jSONObject, Boolean.valueOf(this.f4822i.d(view)));
            this.f4822i.e();
            return true;
        }
        return false;
    }

    private boolean b(View view, JSONObject jSONObject) {
        a.C0099a b2 = this.f4822i.b(view);
        if (b2 != null) {
            com.iab.omid.library.applovin.d.b.a(jSONObject, b2);
            return true;
        }
        return false;
    }

    public static TreeWalker getInstance() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        i();
        d();
        j();
    }

    private void i() {
        this.f4818e = 0;
        this.f4820g.clear();
        this.f4819f = false;
        Iterator<com.iab.omid.library.applovin.adsession.a> it = com.iab.omid.library.applovin.b.a.a().c().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().b()) {
                this.f4819f = true;
                break;
            }
        }
        this.f4824k = d.a();
    }

    private void j() {
        a(d.a() - this.f4824k);
    }

    private void k() {
        if (f4814c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f4814c = handler;
            handler.post(f4815l);
            f4814c.postDelayed(f4816m, 200L);
        }
    }

    private void l() {
        Handler handler = f4814c;
        if (handler != null) {
            handler.removeCallbacks(f4816m);
            f4814c = null;
        }
    }

    public void a() {
        k();
    }

    @Override // com.iab.omid.library.applovin.c.a.InterfaceC0098a
    public void a(View view, com.iab.omid.library.applovin.c.a aVar, JSONObject jSONObject, boolean z) {
        c c2;
        if (f.d(view) && (c2 = this.f4822i.c(view)) != c.UNDERLYING_VIEW) {
            JSONObject a2 = aVar.a(view);
            com.iab.omid.library.applovin.d.b.a(jSONObject, a2);
            if (!a(view, a2)) {
                boolean z2 = z || b(view, a2);
                if (this.f4819f && c2 == c.OBSTRUCTION_VIEW && !z2) {
                    this.f4820g.add(new com.iab.omid.library.applovin.e.a(view));
                }
                a(view, aVar, a2, c2, z2);
            }
            this.f4818e++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f4817d.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f4817d.add(treeWalkerTimeLogger);
    }

    public void b() {
        c();
        this.f4817d.clear();
        f4813b.post(new Runnable() { // from class: com.iab.omid.library.applovin.walking.TreeWalker.1
            @Override // java.lang.Runnable
            public void run() {
                TreeWalker.this.f4823j.a();
            }
        });
    }

    public void c() {
        l();
    }

    public void d() {
        this.f4822i.c();
        long a2 = d.a();
        com.iab.omid.library.applovin.c.a a3 = this.f4821h.a();
        if (this.f4822i.b().size() > 0) {
            Iterator<String> it = this.f4822i.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a4 = a3.a(null);
                a(next, this.f4822i.b(next), a4);
                com.iab.omid.library.applovin.d.b.a(a4);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f4823j.b(a4, hashSet, a2);
            }
        }
        if (this.f4822i.a().size() > 0) {
            JSONObject a5 = a3.a(null);
            a(null, a3, a5, c.PARENT_VIEW, false);
            com.iab.omid.library.applovin.d.b.a(a5);
            this.f4823j.a(a5, this.f4822i.a(), a2);
            if (this.f4819f) {
                for (com.iab.omid.library.applovin.adsession.a aVar : com.iab.omid.library.applovin.b.a.a().c()) {
                    aVar.a(this.f4820g);
                }
            }
        } else {
            this.f4823j.a();
        }
        this.f4822i.d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f4817d.contains(treeWalkerTimeLogger)) {
            this.f4817d.remove(treeWalkerTimeLogger);
        }
    }
}

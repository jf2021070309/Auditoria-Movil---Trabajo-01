package com.iab.omid.library.applovin.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.applovin.d.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes2.dex */
public class a {
    private final HashMap<View, String> a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<View, C0099a> f4825b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, View> f4826c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final HashSet<View> f4827d = new HashSet<>();

    /* renamed from: e  reason: collision with root package name */
    private final HashSet<String> f4828e = new HashSet<>();

    /* renamed from: f  reason: collision with root package name */
    private final HashSet<String> f4829f = new HashSet<>();

    /* renamed from: g  reason: collision with root package name */
    private final HashMap<String, String> f4830g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private final Map<View, Boolean> f4831h = new WeakHashMap();

    /* renamed from: i  reason: collision with root package name */
    private boolean f4832i;

    /* renamed from: com.iab.omid.library.applovin.walking.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0099a {
        private final com.iab.omid.library.applovin.b.c a;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList<String> f4835b = new ArrayList<>();

        public C0099a(com.iab.omid.library.applovin.b.c cVar, String str) {
            this.a = cVar;
            a(str);
        }

        public com.iab.omid.library.applovin.b.c a() {
            return this.a;
        }

        public void a(String str) {
            this.f4835b.add(str);
        }

        public ArrayList<String> b() {
            return this.f4835b;
        }
    }

    private void a(com.iab.omid.library.applovin.adsession.a aVar) {
        for (com.iab.omid.library.applovin.b.c cVar : aVar.a()) {
            a(cVar, aVar);
        }
    }

    private void a(com.iab.omid.library.applovin.b.c cVar, com.iab.omid.library.applovin.adsession.a aVar) {
        View view = cVar.a().get();
        if (view == null) {
            return;
        }
        C0099a c0099a = this.f4825b.get(view);
        if (c0099a != null) {
            c0099a.a(aVar.getAdSessionId());
        } else {
            this.f4825b.put(view, new C0099a(cVar, aVar.getAdSessionId()));
        }
    }

    private String e(View view) {
        if (view.isAttachedToWindow()) {
            if (f(view).booleanValue()) {
                return "noWindowFocus";
            }
            HashSet hashSet = new HashSet();
            while (view != null) {
                String e2 = f.e(view);
                if (e2 != null) {
                    return e2;
                }
                hashSet.add(view);
                ViewParent parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            this.f4827d.addAll(hashSet);
            return null;
        }
        return "notAttached";
    }

    private Boolean f(View view) {
        if (view.hasWindowFocus()) {
            this.f4831h.remove(view);
            return Boolean.FALSE;
        } else if (this.f4831h.containsKey(view)) {
            return this.f4831h.get(view);
        } else {
            Map<View, Boolean> map = this.f4831h;
            Boolean bool = Boolean.FALSE;
            map.put(view, bool);
            return bool;
        }
    }

    public String a(View view) {
        if (this.a.size() == 0) {
            return null;
        }
        String str = this.a.get(view);
        if (str != null) {
            this.a.remove(view);
        }
        return str;
    }

    public String a(String str) {
        return this.f4830g.get(str);
    }

    public HashSet<String> a() {
        return this.f4828e;
    }

    public View b(String str) {
        return this.f4826c.get(str);
    }

    public C0099a b(View view) {
        C0099a c0099a = this.f4825b.get(view);
        if (c0099a != null) {
            this.f4825b.remove(view);
        }
        return c0099a;
    }

    public HashSet<String> b() {
        return this.f4829f;
    }

    public c c(View view) {
        return this.f4827d.contains(view) ? c.PARENT_VIEW : this.f4832i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void c() {
        com.iab.omid.library.applovin.b.a a = com.iab.omid.library.applovin.b.a.a();
        if (a != null) {
            for (com.iab.omid.library.applovin.adsession.a aVar : a.c()) {
                View e2 = aVar.e();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (e2 != null) {
                        String e3 = e(e2);
                        if (e3 == null) {
                            this.f4828e.add(adSessionId);
                            this.a.put(e2, adSessionId);
                            a(aVar);
                        } else if (e3 != "noWindowFocus") {
                            this.f4829f.add(adSessionId);
                            this.f4826c.put(adSessionId, e2);
                            this.f4830g.put(adSessionId, e3);
                        }
                    } else {
                        this.f4829f.add(adSessionId);
                        this.f4830g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void d() {
        this.a.clear();
        this.f4825b.clear();
        this.f4826c.clear();
        this.f4827d.clear();
        this.f4828e.clear();
        this.f4829f.clear();
        this.f4830g.clear();
        this.f4832i = false;
    }

    public boolean d(View view) {
        if (this.f4831h.containsKey(view)) {
            this.f4831h.put(view, Boolean.TRUE);
            return false;
        }
        return true;
    }

    public void e() {
        this.f4832i = true;
    }
}

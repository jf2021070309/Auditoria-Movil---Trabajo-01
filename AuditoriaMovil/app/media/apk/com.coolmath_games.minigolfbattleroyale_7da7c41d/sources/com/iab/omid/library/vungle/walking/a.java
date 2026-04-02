package com.iab.omid.library.vungle.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.vungle.d.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
/* loaded from: classes2.dex */
public class a {
    private final HashMap<View, String> a = new HashMap<>();
    private final HashMap<View, C0077a> b = new HashMap<>();
    private final HashMap<String, View> c = new HashMap<>();
    private final HashSet<View> d = new HashSet<>();
    private final HashSet<String> e = new HashSet<>();
    private final HashSet<String> f = new HashSet<>();
    private final HashMap<String, String> g = new HashMap<>();
    private boolean h;

    /* renamed from: com.iab.omid.library.vungle.walking.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0077a {
        private final com.iab.omid.library.vungle.b.c a;
        private final ArrayList<String> b = new ArrayList<>();

        public C0077a(com.iab.omid.library.vungle.b.c cVar, String str) {
            this.a = cVar;
            a(str);
        }

        public com.iab.omid.library.vungle.b.c a() {
            return this.a;
        }

        public void a(String str) {
            this.b.add(str);
        }

        public ArrayList<String> b() {
            return this.b;
        }
    }

    private void a(com.iab.omid.library.vungle.adsession.a aVar) {
        for (com.iab.omid.library.vungle.b.c cVar : aVar.a()) {
            a(cVar, aVar);
        }
    }

    private void a(com.iab.omid.library.vungle.b.c cVar, com.iab.omid.library.vungle.adsession.a aVar) {
        View view = (View) cVar.a().get();
        if (view == null) {
            return;
        }
        C0077a c0077a = this.b.get(view);
        if (c0077a != null) {
            c0077a.a(aVar.getAdSessionId());
        } else {
            this.b.put(view, new C0077a(cVar, aVar.getAdSessionId()));
        }
    }

    private String d(View view) {
        if (view.hasWindowFocus()) {
            HashSet hashSet = new HashSet();
            while (view != null) {
                String e = f.e(view);
                if (e != null) {
                    return e;
                }
                hashSet.add(view);
                ViewParent parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            this.d.addAll(hashSet);
            return null;
        }
        return "noWindowFocus";
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
        return this.g.get(str);
    }

    public HashSet<String> a() {
        return this.e;
    }

    public View b(String str) {
        return this.c.get(str);
    }

    public C0077a b(View view) {
        C0077a c0077a = this.b.get(view);
        if (c0077a != null) {
            this.b.remove(view);
        }
        return c0077a;
    }

    public HashSet<String> b() {
        return this.f;
    }

    public c c(View view) {
        return this.d.contains(view) ? c.PARENT_VIEW : this.h ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void c() {
        com.iab.omid.library.vungle.b.a a = com.iab.omid.library.vungle.b.a.a();
        if (a != null) {
            for (com.iab.omid.library.vungle.adsession.a aVar : a.c()) {
                View d = aVar.d();
                if (aVar.e()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (d != null) {
                        String d2 = d(d);
                        if (d2 == null) {
                            this.e.add(adSessionId);
                            this.a.put(d, adSessionId);
                            a(aVar);
                        } else {
                            this.f.add(adSessionId);
                            this.c.put(adSessionId, d);
                            this.g.put(adSessionId, d2);
                        }
                    } else {
                        this.f.add(adSessionId);
                        this.g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void d() {
        this.a.clear();
        this.b.clear();
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.h = false;
    }

    public void e() {
        this.h = true;
    }
}

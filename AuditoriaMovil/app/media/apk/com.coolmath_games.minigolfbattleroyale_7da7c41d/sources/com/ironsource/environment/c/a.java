package com.ironsource.environment.c;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.appevents.integrity.IntegrityManager;
import com.ironsource.environment.a;
import com.ironsource.environment.h;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public final class a {
    public ConcurrentHashMap<String, Object> a;
    AtomicBoolean b;
    AtomicBoolean c;

    /* renamed from: com.ironsource.environment.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0083a {
        public static volatile a a = new a((byte) 0);
    }

    private a() {
        this.b = new AtomicBoolean(false);
        this.c = new AtomicBoolean(false);
        this.a = new ConcurrentHashMap<>();
    }

    /* synthetic */ a(byte b) {
        this();
    }

    private void a(String str) {
        try {
            this.a.remove(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void b(final Context context) {
        if (this.b.get()) {
            return;
        }
        try {
            this.b.set(true);
            new Thread(new Runnable() { // from class: com.ironsource.environment.c.a.2
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        a aVar = a.this;
                        Context context2 = context;
                        if (context2 != null) {
                            try {
                                String[] a = h.a(context2);
                                String str = a[0];
                                Boolean valueOf = Boolean.valueOf(a[1]);
                                if (!TextUtils.isEmpty(str)) {
                                    aVar.a("gaid", str);
                                    aVar.a("lat", valueOf);
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    a.this.b.set(false);
                }
            }).start();
        } catch (Exception e) {
            e.printStackTrace();
            this.b.set(false);
        }
    }

    private boolean b(String str) {
        try {
            return this.a.containsKey(str);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void a(Context context) {
        if (context == null) {
            return;
        }
        b(context);
        String C = h.C(context);
        if (!TextUtils.isEmpty(C)) {
            a("asid", C);
        } else if (b("asid")) {
            a("asid");
        }
        String language = context.getResources().getConfiguration().locale.getLanguage();
        if (!TextUtils.isEmpty(language)) {
            a("lang", language.toUpperCase());
        }
        String c = h.c();
        if (!TextUtils.isEmpty(c)) {
            a("tz", c);
        }
        String a = com.ironsource.c.a.a(context);
        if (!TextUtils.isEmpty(a) && !a.equals(IntegrityManager.INTEGRITY_TYPE_NONE)) {
            a("connt", a);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            a("vpn", Boolean.valueOf(com.ironsource.c.a.c(context)));
        }
        String k = h.k(context);
        if (!TextUtils.isEmpty(k)) {
            a("icc", k);
        }
        a("vol", Float.valueOf(h.m(context)));
        a("dfs", String.valueOf(h.p()));
        a("scrnw", Integer.valueOf(h.k()));
        a("scrnh", Integer.valueOf(h.l()));
        a("ltime", String.valueOf(h.a()));
        a("tzoff", String.valueOf(h.b()));
        a("mcc", Integer.valueOf(a.AnonymousClass1.c(context)));
        a("mnc", Integer.valueOf(a.AnonymousClass1.d(context)));
        a("sdcrd", Boolean.valueOf(h.d()));
        a("chrg", Boolean.valueOf(h.f(context)));
        a("chrgt", Integer.valueOf(h.g(context)));
        a("apm", Boolean.valueOf(h.h(context)));
        a("owp", Boolean.valueOf(h.i(context)));
        a("rt", Boolean.valueOf(h.j()));
        a("sscl", String.valueOf(h.o()));
        a("bat", Integer.valueOf(h.w(context)));
        a("lpm", Boolean.valueOf(h.x(context)));
        a("apor", h.o(context));
        a("ua", h.r());
    }

    public void a(String str, Object obj) {
        if (str == null || obj == null) {
            return;
        }
        try {
            if (obj instanceof Boolean) {
                obj = Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
            }
            this.a.put(str, obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

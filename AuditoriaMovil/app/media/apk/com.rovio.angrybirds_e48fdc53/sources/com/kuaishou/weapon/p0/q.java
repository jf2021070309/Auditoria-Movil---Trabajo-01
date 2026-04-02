package com.kuaishou.weapon.p0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes.dex */
public class q {
    public static final int a = 3;
    private static q b = null;
    private static final String g = "1";
    private volatile boolean c = false;
    private Cdo d;
    private Context e;
    private t f;

    private q(Context context) {
        this.e = context;
        this.d = Cdo.a(context);
        this.f = t.a(context);
    }

    public static synchronized q a(Context context) {
        q qVar;
        synchronized (q.class) {
            try {
                if (b == null) {
                    b = new q(context);
                }
                qVar = b;
            } catch (Exception e) {
                return null;
            }
        }
        return qVar;
    }

    private synchronized boolean a(int i, String str, String str2, boolean z, PackageInfo packageInfo) {
        if (z) {
            if (this.f.c(i) != 1) {
                return false;
            }
        }
        s a2 = this.f.a(i);
        if (a2 == null) {
            this.f.b(i, -1);
            return false;
        } else if (!dm.a(new File(a2.e))) {
            this.f.b(i, -1);
            return false;
        } else {
            if (packageInfo != null) {
                a2.r = packageInfo;
            }
            r a3 = r.a(this.e.getApplicationContext(), true);
            if (!a3.a(a2, false)) {
                this.f.b(i, -1);
                a3.a(a2.e);
                return false;
            }
            s c = a3.c(a2.e);
            c.b = 1;
            c.p = 1;
            this.f.a(c);
            return true;
        }
    }

    private static void d() {
        try {
            Cdo a2 = Cdo.a();
            if (a2 != null) {
                a2.b("W_S_V", "1");
            }
        } catch (Exception e) {
        }
    }

    public void a() {
        d();
        b();
    }

    public void a(final String str) {
        try {
            n.a().a(new Runnable() { // from class: com.kuaishou.weapon.p0.q.1
                @Override // java.lang.Runnable
                public void run() {
                    final r a2;
                    try {
                        if (TextUtils.isEmpty(str) || (a2 = r.a(q.this.e.getApplicationContext(), true)) == null) {
                            return;
                        }
                        final s d = a2.d(str);
                        if (d == null) {
                            s b2 = q.this.f.b(str);
                            if (b2 != null) {
                                q.this.a(str, b2.e);
                                return;
                            }
                            return;
                        }
                        new Timer().schedule(new TimerTask() { // from class: com.kuaishou.weapon.p0.q.1.1
                            @Override // java.util.TimerTask, java.lang.Runnable
                            public void run() {
                                a2.b(str);
                                q.this.f.a(str);
                                File file = new File(d.e);
                                if (file.exists()) {
                                    file.delete();
                                }
                            }
                        }, TTAdConstant.AD_MAX_EVENT_TIME);
                        a2.b(str);
                        q.this.f.a(str);
                        File file = new File(d.e);
                        if (file.exists()) {
                            file.delete();
                        }
                    } catch (Throwable th) {
                    }
                }
            });
        } catch (Throwable th) {
        }
    }

    public void a(String str, String str2) {
        this.f.a(str);
        File file = new File(str2);
        if (file.exists()) {
            file.delete();
        }
    }

    public synchronized boolean a(int i, String str, PackageInfo packageInfo) {
        return a(i, str, null, false, packageInfo);
    }

    public boolean a(s sVar, String str, String str2) {
        r a2;
        if (sVar == null) {
            return false;
        }
        File file = new File(sVar.e);
        if (dm.a(file)) {
            try {
                if (!this.f.b(sVar.a)) {
                    this.f.a(sVar);
                }
                a2 = r.a(this.e.getApplicationContext(), true);
                this.f.a(sVar.a, 1);
                b(sVar.c);
            } catch (Throwable th) {
            }
            if (!a2.a(sVar, true)) {
                file.delete();
                a(sVar.a, sVar.d, null, true, null);
                this.f.a(sVar.a, 0);
                return false;
            }
            sVar = a2.c(sVar.e);
            if (sVar == null) {
                this.f.a(sVar.a, 0);
                return false;
            }
            try {
                s a3 = this.f.a(sVar.a);
                File file2 = null;
                if (a3 != null && !a3.d.equals(sVar.d)) {
                    file2 = new File(a3.e);
                }
                sVar.b = 1;
                sVar.p = 1;
                if (this.f.a(sVar) > 0 && file2 != null && file2.exists()) {
                    file2.delete();
                }
                this.f.a(sVar.a, 0);
                return true;
            } catch (Throwable th2) {
                return false;
            }
        }
        return false;
    }

    public synchronized void b() {
        try {
            if (this.c) {
                return;
            }
            this.c = true;
            for (s sVar : this.f.a()) {
                String str = null;
                try {
                    str = this.e.getFilesDir().getCanonicalPath();
                } catch (Throwable th) {
                }
                if (str != null) {
                    sVar.m = str + bh.j + sVar.a;
                    StringBuilder sb = new StringBuilder();
                    sb.append(sVar.m);
                    sb.append("/lib");
                    dm.c(sb.toString());
                    dm.c(sVar.m);
                }
            }
            this.f.b();
            if (this.d.b(Cdo.d)) {
                this.f.c();
            } else {
                this.d.a(Cdo.d, Boolean.TRUE, true);
            }
            n.a().a(new u(this.e, 1, false));
        } catch (Throwable th2) {
        }
    }

    public void b(String str) {
        r a2;
        try {
            if (TextUtils.isEmpty(str) || (a2 = r.a()) == null) {
                return;
            }
            a2.b(str);
        } catch (Throwable th) {
        }
    }

    public void c() {
        for (s sVar : this.f.a()) {
            r a2 = r.a();
            if ((a2 != null ? a2.d(sVar.c) : null) == null) {
                a(sVar.a, sVar.d, (PackageInfo) null);
            }
        }
    }
}

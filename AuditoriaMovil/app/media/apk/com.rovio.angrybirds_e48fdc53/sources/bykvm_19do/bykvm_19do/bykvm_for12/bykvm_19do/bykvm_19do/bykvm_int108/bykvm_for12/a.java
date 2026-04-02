package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_for12;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Address;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.a;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.f;
import com.facebook.share.internal.ShareConstants;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class a implements f.a {
    private static a n;
    private final boolean a;
    private final Context i;
    private bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.a k;
    private int l;
    private volatile boolean b = false;
    private boolean c = true;
    private boolean d = false;
    private long e = 0;
    private long f = 0;
    private ThreadPoolExecutor g = null;
    private AtomicBoolean h = new AtomicBoolean(false);
    private volatile boolean j = false;
    final bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.f m = new bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.f(Looper.getMainLooper(), this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_for12.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0027a implements Runnable {
        RunnableC0027a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        final /* synthetic */ boolean a;

        b(boolean z) {
            this.a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.c(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.a {
        final /* synthetic */ int a;

        c(int i) {
            this.a = i;
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.a
        public void a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_if122.b bVar, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.b bVar2) {
            JSONObject jSONObject;
            if (bVar2 != null && bVar2.e()) {
                String str = null;
                try {
                    jSONObject = new JSONObject(bVar2.a());
                } catch (Exception e) {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    try {
                        str = jSONObject.getString(ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
                    } catch (Exception e2) {
                    }
                    if ("success".equals(str)) {
                        try {
                            if (a.this.a(jSONObject)) {
                                a.this.b(101);
                            } else {
                                a.this.a(this.a + 1);
                            }
                            return;
                        } catch (Exception e3) {
                            return;
                        }
                    }
                }
            }
            a.this.a(this.a + 1);
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.a
        public void a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_if122.b bVar, IOException iOException) {
            a.this.a(this.a + 1);
        }
    }

    public a(Context context, int i) {
        this.i = context;
        this.a = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_19do.bykvm_19do.a.b(context);
        this.l = i;
    }

    private a(Context context, boolean z) {
        this.i = context;
        this.a = z;
    }

    public static a a(Context context) {
        a aVar;
        synchronized (a.class) {
            if (n == null) {
                n = new a(context.getApplicationContext(), bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_19do.bykvm_19do.a.b(context));
            }
            aVar = n;
        }
        return aVar;
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return "https://" + str + "/get_domains/v4/";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        String[] a = a();
        if (a != null && a.length > i) {
            String str = a[i];
            if (!TextUtils.isEmpty(str)) {
                try {
                    String a2 = a(str);
                    if (TextUtils.isEmpty(a2)) {
                        b(102);
                    } else {
                        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_if122.a a3 = h().a();
                        a3.b(a2);
                        a(a3);
                        a3.a(new c(i));
                    }
                    return;
                } catch (Throwable th) {
                    bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.b.a("AppConfig", "try app config exception: " + th);
                    return;
                }
            }
        }
        b(102);
    }

    private void a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_if122.a aVar) {
        if (aVar == null) {
            return;
        }
        Address a = h.a().a(this.l).b() != null ? h.a().a(this.l).b().a(this.i) : null;
        if (a != null && a.hasLatitude() && a.hasLongitude()) {
            aVar.b("latitude", a.getLatitude() + "");
            aVar.b("longitude", a.getLongitude() + "");
            String locality = a.getLocality();
            if (!TextUtils.isEmpty(locality)) {
                aVar.b("city", Uri.encode(locality));
            }
        }
        if (this.b) {
            aVar.b("force", "1");
        }
        try {
            aVar.b("abi", Build.VERSION.SDK_INT < 21 ? Build.CPU_ABI : Build.SUPPORTED_ABIS[0]);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (h.a().a(this.l).b() != null) {
            aVar.b("aid", h.a().a(this.l).b().e() + "");
            aVar.b("device_platform", h.a().a(this.l).b().d());
            aVar.b("channel", h.a().a(this.l).b().f());
            aVar.b("version_code", h.a().a(this.l).b().b() + "");
            aVar.b("custom_info_1", h.a().a(this.l).b().c());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Object obj) throws Exception {
        JSONObject jSONObject;
        if (obj instanceof String) {
            String str = (String) obj;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            jSONObject = new JSONObject(str);
            if (!"success".equals(jSONObject.getString("Gromore-message"))) {
                return false;
            }
        } else {
            jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
        }
        if (jSONObject != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(ShareConstants.WEB_DIALOG_PARAM_DATA);
            synchronized (this) {
                SharedPreferences.Editor edit = this.i.getSharedPreferences("m_ss_app_config", 0).edit();
                edit.putLong("last_refresh_time", System.currentTimeMillis());
                edit.apply();
            }
            if (h.a().a(this.l).d() != null) {
                h.a().a(this.l).d().a(jSONObject2);
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.f fVar = this.m;
        if (fVar != null) {
            fVar.sendEmptyMessage(i);
        }
    }

    public static void d(boolean z) {
    }

    private void e(boolean z) {
        if (this.d) {
            return;
        }
        if (this.c) {
            this.c = false;
            this.e = 0L;
            this.f = 0L;
        }
        long j = z ? 360000L : 43200000L;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.e <= j || currentTimeMillis - this.f <= 120000) {
            return;
        }
        boolean a = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.e.a(this.i);
        if (!this.j || a) {
            a(a);
        }
    }

    private boolean g() {
        String[] a = a();
        if (a != null && a.length != 0) {
            a(0);
        }
        return false;
    }

    private bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.a h() {
        if (this.k == null) {
            this.k = new a.b().a(10L, TimeUnit.SECONDS).b(10L, TimeUnit.SECONDS).c(10L, TimeUnit.SECONDS).a();
        }
        return this.k;
    }

    public boolean a(boolean z) {
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.b.a("TNCManager_GroMore", "Gromore-doRefresh: updating state " + this.h.get());
        if (this.h.compareAndSet(false, true)) {
            if (z) {
                this.f = System.currentTimeMillis();
            }
            b().execute(new b(z));
            return true;
        }
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.b.a("TNCManager_GroMore", "Gromore-doRefresh, already running（mConfigUpdating：" + this.h.get() + ")");
        return false;
    }

    public String[] a() {
        String[] a = h.a().a(this.l).b() != null ? h.a().a(this.l).b().a() : null;
        return (a == null || a.length <= 0) ? new String[0] : a;
    }

    public ThreadPoolExecutor b() {
        if (this.g == null) {
            synchronized (a.class) {
                if (this.g == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                    this.g = threadPoolExecutor;
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
            }
        }
        return this.g;
    }

    public void b(boolean z) {
        synchronized (this) {
            if (this.a) {
                e(z);
            } else if (this.e <= 0) {
                try {
                    b().execute(new RunnableC0027a());
                } catch (Throwable th) {
                }
            }
        }
    }

    void c() {
        synchronized (this) {
            if (System.currentTimeMillis() - this.e > 3600000) {
                this.e = System.currentTimeMillis();
                try {
                    if (h.a().a(this.l).d() != null) {
                        h.a().a(this.l).d().c();
                    }
                } catch (Exception e) {
                }
            }
        }
    }

    void c(boolean z) {
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.b.a("TNCManager_GroMore", "Gromore-doRefresh, actual request");
        d();
        this.d = true;
        if (!z) {
            this.m.sendEmptyMessage(102);
            return;
        }
        try {
            g();
        } catch (Exception e) {
            this.h.set(false);
        }
    }

    public void d() {
        synchronized (this) {
            if (!this.j) {
                this.j = true;
                long j = this.i.getSharedPreferences("m_ss_app_config", 0).getLong("last_refresh_time", 0L);
                long currentTimeMillis = System.currentTimeMillis();
                if (j > currentTimeMillis) {
                    j = currentTimeMillis;
                }
                this.e = j;
                try {
                    if (h.a().a(this.l).d() != null) {
                        h.a().a(this.l).d().b();
                    }
                } catch (Exception e) {
                }
            }
        }
    }

    public void e() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        try {
            if (this.a) {
                d();
            } else {
                c();
            }
        } catch (Throwable th) {
        }
    }

    public void f() {
        b(false);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.f.a
    public void handleMsg(Message message) {
        int i = message.what;
        if (i == 101) {
            this.d = false;
            this.e = System.currentTimeMillis();
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.b.a("TNCManager_GroMore", "Gromore-doRefresh, succ");
            if (this.c) {
                f();
            }
        } else if (i != 102) {
            return;
        } else {
            this.d = false;
            if (this.c) {
                f();
            }
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.b.a("TNCManager_GroMore", "Gromore-doRefresh, error");
        }
        this.h.set(false);
    }
}

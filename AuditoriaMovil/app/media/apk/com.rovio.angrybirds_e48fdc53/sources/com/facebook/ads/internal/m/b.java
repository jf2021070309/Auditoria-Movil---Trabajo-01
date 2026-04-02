package com.facebook.ads.internal.m;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.ads.internal.p.a.n;
import com.facebook.ads.internal.p.a.p;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.facebook.share.internal.ShareConstants;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class b {
    private static final String a = b.class.getSimpleName();
    private static final String b = com.facebook.ads.internal.o.d.b();
    private final a c;
    private final ConnectivityManager e;
    private final com.facebook.ads.internal.p.a.a f;
    private final long h;
    private final long i;
    private volatile boolean k;
    private int l;
    private long m;
    private final Runnable j = new Runnable() { // from class: com.facebook.ads.internal.m.b.1
        /* JADX WARN: Type inference failed for: r0v5, types: [com.facebook.ads.internal.m.b$1$1] */
        @Override // java.lang.Runnable
        public void run() {
            b.this.k = false;
            if (b.this.d.getQueue().isEmpty()) {
                new AsyncTask<Void, Void, Void>() { // from class: com.facebook.ads.internal.m.b.1.1
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // android.os.AsyncTask
                    /* renamed from: a */
                    public Void doInBackground(Void... voidArr) {
                        b.b(b.this);
                        if (b.this.m > 0) {
                            try {
                                Thread.sleep(b.this.m);
                            } catch (InterruptedException e) {
                            }
                        }
                        b.this.d();
                        return null;
                    }
                }.executeOnExecutor(b.this.d, new Void[0]);
            }
        }
    };
    private final ThreadPoolExecutor d = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    private final Handler g = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface a {
        JSONObject a();

        boolean a(JSONArray jSONArray);

        void b();

        void b(JSONArray jSONArray);

        boolean c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context, a aVar) {
        this.c = aVar;
        this.e = (ConnectivityManager) context.getSystemService("connectivity");
        this.f = com.facebook.ads.internal.q.c.d.b(context);
        this.h = com.facebook.ads.internal.l.a.h(context);
        this.i = com.facebook.ads.internal.l.a.i(context);
    }

    private void a(long j) {
        this.g.postDelayed(this.j, j);
    }

    static /* synthetic */ int b(b bVar) {
        int i = bVar.l + 1;
        bVar.l = i;
        return i;
    }

    private void c() {
        if (this.l >= 5) {
            e();
            b();
            return;
        }
        if (this.l == 1) {
            this.m = 2000L;
        } else {
            this.m *= 2;
        }
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        try {
            NetworkInfo activeNetworkInfo = this.e.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
                a(this.i);
                return;
            }
            JSONObject a2 = this.c.a();
            if (a2 == null) {
                e();
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("attempt", String.valueOf(this.l));
            a2.put(ShareConstants.WEB_DIALOG_PARAM_DATA, jSONObject);
            p pVar = new p();
            pVar.put(MessengerShareContentUtility.ATTACHMENT_PAYLOAD, a2.toString());
            n b2 = this.f.b(b, pVar);
            String e = b2 != null ? b2.e() : null;
            if (TextUtils.isEmpty(e)) {
                if (a2.has(com.umeng.analytics.pro.d.ar)) {
                    this.c.b(a2.getJSONArray(com.umeng.analytics.pro.d.ar));
                }
                c();
            } else if (b2.a() != 200) {
                if (a2.has(com.umeng.analytics.pro.d.ar)) {
                    this.c.b(a2.getJSONArray(com.umeng.analytics.pro.d.ar));
                }
                c();
            } else if (!this.c.a(new JSONArray(e))) {
                c();
            } else if (this.c.c()) {
                c();
            } else {
                e();
            }
        } catch (Exception e2) {
            c();
        }
    }

    private void e() {
        this.l = 0;
        this.m = 0L;
        if (this.d.getQueue().size() == 0) {
            this.c.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.k = true;
        this.g.removeCallbacks(this.j);
        a(this.h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        if (this.k) {
            return;
        }
        this.k = true;
        this.g.removeCallbacks(this.j);
        a(this.i);
    }
}

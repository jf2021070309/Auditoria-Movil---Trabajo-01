package e.d.d.u;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import e.d.d.u.i;
import e.d.d.u.q.a;
import e.d.d.u.q.c;
import e.d.d.u.q.d;
import e.d.d.u.r.b;
import e.d.d.u.r.d;
import e.d.d.u.r.f;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class g implements h {
    public static final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadFactory f7575b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final e.d.d.g f7576c;

    /* renamed from: d  reason: collision with root package name */
    public final e.d.d.u.r.c f7577d;

    /* renamed from: e  reason: collision with root package name */
    public final e.d.d.u.q.c f7578e;

    /* renamed from: f  reason: collision with root package name */
    public final o f7579f;

    /* renamed from: g  reason: collision with root package name */
    public final e.d.d.u.q.b f7580g;

    /* renamed from: h  reason: collision with root package name */
    public final m f7581h;

    /* renamed from: i  reason: collision with root package name */
    public final Object f7582i;

    /* renamed from: j  reason: collision with root package name */
    public final ExecutorService f7583j;

    /* renamed from: k  reason: collision with root package name */
    public final ExecutorService f7584k;

    /* renamed from: l  reason: collision with root package name */
    public String f7585l;

    /* renamed from: m  reason: collision with root package name */
    public Set<e.d.d.u.p.a> f7586m;

    /* renamed from: n  reason: collision with root package name */
    public final List<n> f7587n;

    /* loaded from: classes2.dex */
    public class a implements ThreadFactory {
        public final AtomicInteger a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.a.getAndIncrement())));
        }
    }

    public g(e.d.d.g gVar, e.d.d.t.b<e.d.d.x.h> bVar, e.d.d.t.b<e.d.d.r.f> bVar2) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadFactory threadFactory = f7575b;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, timeUnit, linkedBlockingQueue, threadFactory);
        gVar.a();
        e.d.d.u.r.c cVar = new e.d.d.u.r.c(gVar.f7040d, bVar, bVar2);
        e.d.d.u.q.c cVar2 = new e.d.d.u.q.c(gVar);
        o c2 = o.c();
        e.d.d.u.q.b bVar3 = new e.d.d.u.q.b(gVar);
        m mVar = new m();
        this.f7582i = new Object();
        this.f7586m = new HashSet();
        this.f7587n = new ArrayList();
        this.f7576c = gVar;
        this.f7577d = cVar;
        this.f7578e = cVar2;
        this.f7579f = c2;
        this.f7580g = bVar3;
        this.f7581h = mVar;
        this.f7583j = threadPoolExecutor;
        this.f7584k = new ThreadPoolExecutor(0, 1, 30L, timeUnit, new LinkedBlockingQueue(), threadFactory);
    }

    public static g f(e.d.d.g gVar) {
        Preconditions.checkArgument(true, "Null is not a valid value of FirebaseApp.");
        gVar.a();
        return (g) gVar.f7043g.a(h.class);
    }

    @Override // e.d.d.u.h
    public Task<l> a(final boolean z) {
        h();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        j jVar = new j(this.f7579f, taskCompletionSource);
        synchronized (this.f7582i) {
            this.f7587n.add(jVar);
        }
        Task<l> task = taskCompletionSource.getTask();
        this.f7583j.execute(new Runnable() { // from class: e.d.d.u.c
            @Override // java.lang.Runnable
            public final void run() {
                g.this.b(z);
            }
        });
        return task;
    }

    public final void b(final boolean z) {
        e.d.d.u.q.d b2;
        synchronized (a) {
            e.d.d.g gVar = this.f7576c;
            gVar.a();
            f a2 = f.a(gVar.f7040d, "generatefid.lock");
            b2 = this.f7578e.b();
            if (b2.i()) {
                String i2 = i(b2);
                e.d.d.u.q.c cVar = this.f7578e;
                a.b bVar = (a.b) b2.k();
                bVar.a = i2;
                bVar.b(c.a.UNREGISTERED);
                b2 = bVar.a();
                cVar.a(b2);
            }
            if (a2 != null) {
                a2.b();
            }
        }
        if (z) {
            a.b bVar2 = (a.b) b2.k();
            bVar2.f7601c = null;
            b2 = bVar2.a();
        }
        l(b2);
        this.f7584k.execute(new Runnable() { // from class: e.d.d.u.a
            /* JADX WARN: Removed duplicated region for block: B:83:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 236
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: e.d.d.u.a.run():void");
            }
        });
    }

    public final e.d.d.u.q.d c(e.d.d.u.q.d dVar) throws i {
        int responseCode;
        e.d.d.u.r.f f2;
        e.d.d.u.r.c cVar = this.f7577d;
        String d2 = d();
        e.d.d.u.q.a aVar = (e.d.d.u.q.a) dVar;
        String str = aVar.f7593b;
        String g2 = g();
        String str2 = aVar.f7596e;
        if (cVar.f7621f.a()) {
            URL a2 = cVar.a(String.format("projects/%s/installations/%s/authTokens:generate", g2, str));
            for (int i2 = 0; i2 <= 1; i2++) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection c2 = cVar.c(a2, d2);
                try {
                    c2.setRequestMethod("POST");
                    c2.addRequestProperty("Authorization", "FIS_v2 " + str2);
                    c2.setDoOutput(true);
                    cVar.h(c2);
                    responseCode = c2.getResponseCode();
                    cVar.f7621f.b(responseCode);
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    c2.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
                if (responseCode >= 200 && responseCode < 300) {
                    f2 = cVar.f(c2);
                } else {
                    e.d.d.u.r.c.b(c2, null, d2, g2);
                    if (responseCode != 401 && responseCode != 404) {
                        if (responseCode == 429) {
                            throw new i("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", i.a.TOO_MANY_REQUESTS);
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                            b.C0166b c0166b = (b.C0166b) e.d.d.u.r.f.a();
                            c0166b.f7616c = f.b.BAD_CONFIG;
                            f2 = c0166b.a();
                        } else {
                            c2.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                    }
                    b.C0166b c0166b2 = (b.C0166b) e.d.d.u.r.f.a();
                    c0166b2.f7616c = f.b.AUTH_ERROR;
                    f2 = c0166b2.a();
                }
                c2.disconnect();
                TrafficStats.clearThreadStatsTag();
                e.d.d.u.r.b bVar = (e.d.d.u.r.b) f2;
                int ordinal = bVar.f7614c.ordinal();
                if (ordinal == 0) {
                    String str3 = bVar.a;
                    long j2 = bVar.f7613b;
                    long b2 = this.f7579f.b();
                    a.b bVar2 = (a.b) dVar.k();
                    bVar2.f7601c = str3;
                    bVar2.f7603e = Long.valueOf(j2);
                    bVar2.f7604f = Long.valueOf(b2);
                    return bVar2.a();
                } else if (ordinal == 1) {
                    a.b bVar3 = (a.b) dVar.k();
                    bVar3.f7605g = "BAD CONFIG";
                    bVar3.b(c.a.REGISTER_ERROR);
                    return bVar3.a();
                } else if (ordinal == 2) {
                    synchronized (this) {
                        this.f7585l = null;
                    }
                    d.a k2 = dVar.k();
                    k2.b(c.a.NOT_GENERATED);
                    return k2.a();
                } else {
                    throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
                }
            }
            throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
        }
        throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
    }

    public String d() {
        e.d.d.g gVar = this.f7576c;
        gVar.a();
        return gVar.f7042f.a;
    }

    public String e() {
        e.d.d.g gVar = this.f7576c;
        gVar.a();
        return gVar.f7042f.f7049b;
    }

    public String g() {
        e.d.d.g gVar = this.f7576c;
        gVar.a();
        return gVar.f7042f.f7054g;
    }

    @Override // e.d.d.u.h
    public Task<String> getId() {
        String str;
        h();
        synchronized (this) {
            str = this.f7585l;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        k kVar = new k(taskCompletionSource);
        synchronized (this.f7582i) {
            this.f7587n.add(kVar);
        }
        Task<String> task = taskCompletionSource.getTask();
        this.f7583j.execute(new Runnable() { // from class: e.d.d.u.b
            @Override // java.lang.Runnable
            public final void run() {
                g.this.b(false);
            }
        });
        return task;
    }

    public final void h() {
        Preconditions.checkNotEmpty(e(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(g(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(d(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        String e2 = e();
        Pattern pattern = o.f7590b;
        Preconditions.checkArgument(e2.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(o.f7590b.matcher(d()).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public final String i(e.d.d.u.q.d dVar) {
        String string;
        e.d.d.g gVar = this.f7576c;
        gVar.a();
        if (gVar.f7041e.equals("CHIME_ANDROID_SDK") || this.f7576c.j()) {
            if (((e.d.d.u.q.a) dVar).f7594c == c.a.ATTEMPT_MIGRATION) {
                e.d.d.u.q.b bVar = this.f7580g;
                synchronized (bVar.f7606b) {
                    synchronized (bVar.f7606b) {
                        string = bVar.f7606b.getString("|S|id", null);
                    }
                    if (string == null) {
                        string = bVar.a();
                    }
                }
                return TextUtils.isEmpty(string) ? this.f7581h.a() : string;
            }
        }
        return this.f7581h.a();
    }

    public final e.d.d.u.q.d j(e.d.d.u.q.d dVar) throws i {
        int responseCode;
        e.d.d.u.r.d e2;
        e.d.d.u.q.a aVar = (e.d.d.u.q.a) dVar;
        String str = aVar.f7593b;
        String str2 = null;
        if (str != null && str.length() == 11) {
            e.d.d.u.q.b bVar = this.f7580g;
            synchronized (bVar.f7606b) {
                String[] strArr = e.d.d.u.q.b.a;
                int length = strArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    String str3 = strArr[i2];
                    String str4 = bVar.f7607c;
                    String string = bVar.f7606b.getString("|T|" + str4 + "|" + str3, null);
                    if (string == null || string.isEmpty()) {
                        i2++;
                    } else if (string.startsWith("{")) {
                        try {
                            str2 = new JSONObject(string).getString("token");
                        } catch (JSONException unused) {
                        }
                    } else {
                        str2 = string;
                    }
                }
            }
        }
        e.d.d.u.r.c cVar = this.f7577d;
        String d2 = d();
        String str5 = aVar.f7593b;
        String g2 = g();
        String e3 = e();
        if (cVar.f7621f.a()) {
            URL a2 = cVar.a(String.format("projects/%s/installations", g2));
            for (int i3 = 0; i3 <= 1; i3++) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection c2 = cVar.c(a2, d2);
                try {
                    c2.setRequestMethod("POST");
                    c2.setDoOutput(true);
                    if (str2 != null) {
                        c2.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                    }
                    cVar.g(c2, str5, e3);
                    responseCode = c2.getResponseCode();
                    cVar.f7621f.b(responseCode);
                } catch (IOException | AssertionError unused2) {
                } catch (Throwable th) {
                    c2.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
                if (responseCode >= 200 && responseCode < 300) {
                    e2 = cVar.e(c2);
                    c2.disconnect();
                    TrafficStats.clearThreadStatsTag();
                } else {
                    e.d.d.u.r.c.b(c2, e3, d2, g2);
                    if (responseCode == 429) {
                        throw new i("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", i.a.TOO_MANY_REQUESTS);
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        e.d.d.u.r.a aVar2 = new e.d.d.u.r.a(null, null, null, null, d.a.BAD_CONFIG, null);
                        c2.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        e2 = aVar2;
                    } else {
                        c2.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                }
                e.d.d.u.r.a aVar3 = (e.d.d.u.r.a) e2;
                int ordinal = aVar3.f7612e.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        a.b bVar2 = (a.b) dVar.k();
                        bVar2.f7605g = "BAD CONFIG";
                        bVar2.b(c.a.REGISTER_ERROR);
                        return bVar2.a();
                    }
                    throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
                }
                String str6 = aVar3.f7609b;
                String str7 = aVar3.f7610c;
                long b2 = this.f7579f.b();
                String c3 = aVar3.f7611d.c();
                long d3 = aVar3.f7611d.d();
                a.b bVar3 = (a.b) dVar.k();
                bVar3.a = str6;
                bVar3.b(c.a.REGISTERED);
                bVar3.f7601c = c3;
                bVar3.f7602d = str7;
                bVar3.f7603e = Long.valueOf(d3);
                bVar3.f7604f = Long.valueOf(b2);
                return bVar3.a();
            }
            throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
        }
        throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
    }

    public final void k(Exception exc) {
        synchronized (this.f7582i) {
            Iterator<n> it = this.f7587n.iterator();
            while (it.hasNext()) {
                if (it.next().a(exc)) {
                    it.remove();
                }
            }
        }
    }

    public final void l(e.d.d.u.q.d dVar) {
        synchronized (this.f7582i) {
            Iterator<n> it = this.f7587n.iterator();
            while (it.hasNext()) {
                if (it.next().b(dVar)) {
                    it.remove();
                }
            }
        }
    }
}

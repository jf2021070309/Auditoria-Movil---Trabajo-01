package e.d.d;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import e.d.d.l.b0;
import e.d.d.l.n;
import e.d.d.l.p;
import e.d.d.l.r;
import e.d.d.l.s;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.GuardedBy;
import org.slf4j.Marker;
/* loaded from: classes.dex */
public class g {
    public static final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final Executor f7038b = new d(null);
    @GuardedBy("LOCK")

    /* renamed from: c  reason: collision with root package name */
    public static final Map<String, g> f7039c = new c.f.a();

    /* renamed from: d  reason: collision with root package name */
    public final Context f7040d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7041e;

    /* renamed from: f  reason: collision with root package name */
    public final i f7042f;

    /* renamed from: g  reason: collision with root package name */
    public final s f7043g;

    /* renamed from: j  reason: collision with root package name */
    public final b0<e.d.d.v.a> f7046j;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicBoolean f7044h = new AtomicBoolean(false);

    /* renamed from: i  reason: collision with root package name */
    public final AtomicBoolean f7045i = new AtomicBoolean();

    /* renamed from: k  reason: collision with root package name */
    public final List<b> f7047k = new CopyOnWriteArrayList();

    @KeepForSdk
    /* loaded from: classes.dex */
    public interface b {
        @KeepForSdk
        void onBackgroundStateChanged(boolean z);
    }

    @TargetApi(14)
    /* loaded from: classes.dex */
    public static class c implements BackgroundDetector.BackgroundStateChangeListener {
        public static AtomicReference<c> a = new AtomicReference<>();

        public static void a(Context context) {
            if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (a.get() == null) {
                    c cVar = new c();
                    if (a.compareAndSet(null, cVar)) {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector.getInstance().addListener(cVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z) {
            Object obj = g.a;
            synchronized (g.a) {
                Iterator it = new ArrayList(g.f7039c.values()).iterator();
                while (it.hasNext()) {
                    g gVar = (g) it.next();
                    if (gVar.f7044h.get()) {
                        gVar.m(z);
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d implements Executor {
        public static final Handler a = new Handler(Looper.getMainLooper());

        public d(a aVar) {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.post(runnable);
        }
    }

    @TargetApi(24)
    /* loaded from: classes.dex */
    public static class e extends BroadcastReceiver {
        public static AtomicReference<e> a = new AtomicReference<>();

        /* renamed from: b  reason: collision with root package name */
        public final Context f7048b;

        public e(Context context) {
            this.f7048b = context;
        }

        public static void a(Context context) {
            if (a.get() == null) {
                e eVar = new e(context);
                if (a.compareAndSet(null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Object obj = g.a;
            synchronized (g.a) {
                for (g gVar : g.f7039c.values()) {
                    gVar.e();
                }
            }
            this.f7048b.unregisterReceiver(this);
        }
    }

    public g(final Context context, String str, i iVar) {
        new CopyOnWriteArrayList();
        this.f7040d = (Context) Preconditions.checkNotNull(context);
        this.f7041e = Preconditions.checkNotEmpty(str);
        this.f7042f = (i) Preconditions.checkNotNull(iVar);
        List<e.d.d.t.b<r>> a2 = p.b(context, ComponentDiscoveryService.class).a();
        s.a f2 = s.f(f7038b);
        f2.c(a2);
        f2.b(new FirebaseCommonRegistrar());
        f2.a(n.h(context, Context.class, new Class[0]));
        f2.a(n.h(this, g.class, new Class[0]));
        f2.a(n.h(iVar, i.class, new Class[0]));
        this.f7043g = f2.d();
        this.f7046j = new b0<>(new e.d.d.t.b() { // from class: e.d.d.a
            @Override // e.d.d.t.b
            public final Object get() {
                return g.this.l(context);
            }
        });
    }

    public static g b() {
        g gVar;
        synchronized (a) {
            gVar = f7039c.get("[DEFAULT]");
            if (gVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return gVar;
    }

    public static g f(Context context) {
        synchronized (a) {
            if (f7039c.containsKey("[DEFAULT]")) {
                return b();
            }
            i a2 = i.a(context);
            if (a2 == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return g(context, a2);
        }
    }

    public static g g(Context context, i iVar) {
        return h(context, iVar, "[DEFAULT]");
    }

    public static g h(Context context, i iVar, String str) {
        g gVar;
        c.a(context);
        String trim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (a) {
            Map<String, g> map = f7039c;
            boolean z = !map.containsKey(trim);
            Preconditions.checkState(z, "FirebaseApp name " + trim + " already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            gVar = new g(context, trim, iVar);
            map.put(trim, gVar);
        }
        gVar.e();
        return gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ e.d.d.v.a l(Context context) {
        return new e.d.d.v.a(context, d(), (e.d.d.q.c) this.f7043g.a(e.d.d.q.c.class));
    }

    public final void a() {
        Preconditions.checkState(!this.f7045i.get(), "FirebaseApp was deleted");
    }

    public i c() {
        a();
        return this.f7042f;
    }

    @KeepForSdk
    public String d() {
        StringBuilder sb = new StringBuilder();
        a();
        sb.append(Base64Utils.encodeUrlSafeNoPadding(this.f7041e.getBytes(Charset.defaultCharset())));
        sb.append(Marker.ANY_NON_NULL_MARKER);
        sb.append(Base64Utils.encodeUrlSafeNoPadding(c().b().getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    public final void e() {
        HashMap hashMap;
        if (!(Build.VERSION.SDK_INT >= 24 ? ((UserManager) this.f7040d.getSystemService(UserManager.class)).isUserUnlocked() : true)) {
            a();
            e.a(this.f7040d);
            return;
        }
        a();
        s sVar = this.f7043g;
        boolean j2 = j();
        if (sVar.f7122f.compareAndSet(null, Boolean.valueOf(j2))) {
            synchronized (sVar) {
                hashMap = new HashMap(sVar.a);
            }
            sVar.h(hashMap, j2);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            String str = this.f7041e;
            g gVar = (g) obj;
            gVar.a();
            return str.equals(gVar.f7041e);
        }
        return false;
    }

    public int hashCode() {
        return this.f7041e.hashCode();
    }

    @KeepForSdk
    public boolean i() {
        a();
        return this.f7046j.get().a();
    }

    @KeepForSdk
    public boolean j() {
        a();
        return "[DEFAULT]".equals(this.f7041e);
    }

    public final void m(boolean z) {
        for (b bVar : this.f7047k) {
            bVar.onBackgroundStateChanged(z);
        }
    }

    public String toString() {
        return Objects.toStringHelper(this).add("name", this.f7041e).add("options", this.f7042f).toString();
    }
}

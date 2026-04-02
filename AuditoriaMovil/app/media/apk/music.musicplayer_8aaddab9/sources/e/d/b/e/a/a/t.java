package e.d.b.e.a.a;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public final class t {
    public final e.d.b.e.a.c.e a;

    /* renamed from: b  reason: collision with root package name */
    public final IntentFilter f6941b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f6942c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<e.d.b.e.a.d.a<StateT>> f6943d;

    /* renamed from: e  reason: collision with root package name */
    public e.d.b.e.a.d.b f6944e;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f6945f;

    /* renamed from: g  reason: collision with root package name */
    public final h1 f6946g;

    /* renamed from: h  reason: collision with root package name */
    public final q0 f6947h;

    /* renamed from: i  reason: collision with root package name */
    public final e.d.b.e.a.c.b0<e3> f6948i;

    /* renamed from: j  reason: collision with root package name */
    public final i0 f6949j;

    /* renamed from: k  reason: collision with root package name */
    public final t0 f6950k;

    /* renamed from: l  reason: collision with root package name */
    public final e.d.b.e.a.b.c f6951l;

    /* renamed from: m  reason: collision with root package name */
    public final e.d.b.e.a.c.b0<Executor> f6952m;

    /* renamed from: n  reason: collision with root package name */
    public final e.d.b.e.a.c.b0<Executor> f6953n;
    public final Handler o;

    public t(Context context, h1 h1Var, q0 q0Var, e.d.b.e.a.c.b0<e3> b0Var, t0 t0Var, i0 i0Var, e.d.b.e.a.b.c cVar, e.d.b.e.a.c.b0<Executor> b0Var2, e.d.b.e.a.c.b0<Executor> b0Var3) {
        e.d.b.e.a.c.e eVar = new e.d.b.e.a.c.e("AssetPackServiceListenerRegistry");
        IntentFilter intentFilter = new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE");
        this.f6943d = new HashSet();
        this.f6944e = null;
        this.f6945f = false;
        this.a = eVar;
        this.f6941b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.f6942c = applicationContext != null ? applicationContext : context;
        this.o = new Handler(Looper.getMainLooper());
        this.f6946g = h1Var;
        this.f6947h = q0Var;
        this.f6948i = b0Var;
        this.f6950k = t0Var;
        this.f6949j = i0Var;
        this.f6951l = cVar;
        this.f6952m = b0Var2;
        this.f6953n = b0Var3;
    }

    public final void a(Context context, Intent intent) {
        final Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (bundleExtra == null) {
            this.a.a(6, "Empty bundle received from broadcast.", new Object[0]);
            return;
        }
        ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("pack_names");
        if (stringArrayList == null || stringArrayList.size() != 1) {
            this.a.a(6, "Corrupt bundle received from broadcast.", new Object[0]);
            return;
        }
        Bundle bundleExtra2 = intent.getBundleExtra("com.google.android.play.core.FLAGS");
        if (bundleExtra2 != null) {
            e.d.b.e.a.b.c cVar = this.f6951l;
            synchronized (cVar) {
                for (String str : bundleExtra2.keySet()) {
                    Object obj = bundleExtra2.get(str);
                    if (obj != null && cVar.a.get(str) == null) {
                        cVar.a.put(str, obj);
                    }
                }
            }
        }
        final AssetPackState a = AssetPackState.a(bundleExtra, stringArrayList.get(0), this.f6950k, v.a);
        this.a.a(3, "ListenerRegistryBroadcastReceiver.onReceive: %s", new Object[]{a});
        if (((PendingIntent) bundleExtra.getParcelable("confirmation_intent")) != null) {
            Objects.requireNonNull(this.f6949j);
        }
        this.f6953n.a().execute(new Runnable(this, bundleExtra, a) { // from class: e.d.b.e.a.a.r
            public final t a;

            /* renamed from: b  reason: collision with root package name */
            public final Bundle f6909b;

            /* renamed from: c  reason: collision with root package name */
            public final AssetPackState f6910c;

            {
                this.a = this;
                this.f6909b = bundleExtra;
                this.f6910c = a;
            }

            @Override // java.lang.Runnable
            public final void run() {
                t tVar = this.a;
                final Bundle bundle = this.f6909b;
                AssetPackState assetPackState = this.f6910c;
                final h1 h1Var = tVar.f6946g;
                if (((Boolean) h1Var.a(new g1(h1Var, bundle) { // from class: e.d.b.e.a.a.x0
                    public final h1 a;

                    /* renamed from: b  reason: collision with root package name */
                    public final Bundle f6973b;

                    {
                        this.a = h1Var;
                        this.f6973b = bundle;
                    }

                    @Override // e.d.b.e.a.a.g1
                    public final Object a() {
                        h1 h1Var2 = this.a;
                        Bundle bundle2 = this.f6973b;
                        Objects.requireNonNull(h1Var2);
                        int i2 = bundle2.getInt("session_id");
                        if (i2 != 0) {
                            Map<Integer, e1> map = h1Var2.f6814f;
                            Integer valueOf = Integer.valueOf(i2);
                            if (map.containsKey(valueOf)) {
                                e1 e1Var = h1Var2.f6814f.get(valueOf);
                                if (e1Var.f6773c.f6755c == 6) {
                                    return Boolean.FALSE;
                                }
                                return Boolean.valueOf(!e.d.b.d.a.j(e1Var.f6773c.f6755c, bundle2.getInt(e.d.b.d.a.c("status", h1.c(bundle2)))));
                            }
                        }
                        return Boolean.TRUE;
                    }
                })).booleanValue()) {
                    tVar.o.post(new q(tVar, assetPackState));
                    tVar.f6948i.a().a();
                }
            }
        });
        this.f6952m.a().execute(new Runnable(this, bundleExtra) { // from class: e.d.b.e.a.a.s
            public final t a;

            /* renamed from: b  reason: collision with root package name */
            public final Bundle f6926b;

            {
                this.a = this;
                this.f6926b = bundleExtra;
            }

            @Override // java.lang.Runnable
            public final void run() {
                t tVar = this.a;
                final Bundle bundle = this.f6926b;
                final h1 h1Var = tVar.f6946g;
                if (!((Boolean) h1Var.a(new g1(h1Var, bundle) { // from class: e.d.b.e.a.a.w0
                    public final h1 a;

                    /* renamed from: b  reason: collision with root package name */
                    public final Bundle f6967b;

                    {
                        this.a = h1Var;
                        this.f6967b = bundle;
                    }

                    @Override // e.d.b.e.a.a.g1
                    public final Object a() {
                        f1 f1Var;
                        h1 h1Var2 = this.a;
                        Bundle bundle2 = this.f6967b;
                        Objects.requireNonNull(h1Var2);
                        int i2 = bundle2.getInt("session_id");
                        if (i2 == 0) {
                            return Boolean.FALSE;
                        }
                        Map<Integer, e1> map = h1Var2.f6814f;
                        Integer valueOf = Integer.valueOf(i2);
                        boolean z = false;
                        if (map.containsKey(valueOf)) {
                            e1 b2 = h1Var2.b(i2);
                            int i3 = bundle2.getInt(e.d.b.d.a.c("status", b2.f6773c.a));
                            if (e.d.b.d.a.j(b2.f6773c.f6755c, i3)) {
                                h1.a.a(3, "Found stale update for session %s with status %d.", new Object[]{valueOf, Integer.valueOf(b2.f6773c.f6755c)});
                                d1 d1Var = b2.f6773c;
                                String str2 = d1Var.a;
                                int i4 = d1Var.f6755c;
                                if (i4 == 4) {
                                    h1Var2.f6811c.a().b(i2, str2);
                                } else if (i4 == 5) {
                                    h1Var2.f6811c.a().a(i2);
                                } else if (i4 == 6) {
                                    h1Var2.f6811c.a().a(Arrays.asList(str2));
                                }
                            } else {
                                b2.f6773c.f6755c = i3;
                                if (e.d.b.d.a.m(i3)) {
                                    h1Var2.a(new b1(h1Var2, i2));
                                    h1Var2.f6812d.a(b2.f6773c.a);
                                } else {
                                    List<f1> list = b2.f6773c.f6757e;
                                    int size = list.size();
                                    for (int i5 = 0; i5 < size; i5++) {
                                        f1 f1Var2 = list.get(i5);
                                        ArrayList parcelableArrayList = bundle2.getParcelableArrayList(e.d.b.d.a.d("chunk_intents", b2.f6773c.a, f1Var2.a));
                                        if (parcelableArrayList != null) {
                                            for (int i6 = 0; i6 < parcelableArrayList.size(); i6++) {
                                                if (parcelableArrayList.get(i6) != null && ((Intent) parcelableArrayList.get(i6)).getData() != null) {
                                                    f1Var2.f6783d.get(i6).a = true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            String c2 = h1.c(bundle2);
                            long j2 = bundle2.getLong(e.d.b.d.a.c("pack_version", c2));
                            int i7 = bundle2.getInt(e.d.b.d.a.c("status", c2));
                            long j3 = bundle2.getLong(e.d.b.d.a.c("total_bytes_to_download", c2));
                            List<String> stringArrayList2 = bundle2.getStringArrayList(e.d.b.d.a.c("slice_ids", c2));
                            ArrayList arrayList = new ArrayList();
                            if (stringArrayList2 == null) {
                                stringArrayList2 = Collections.emptyList();
                            }
                            for (String str3 : stringArrayList2) {
                                List<Intent> parcelableArrayList2 = bundle2.getParcelableArrayList(e.d.b.d.a.d("chunk_intents", c2, str3));
                                ArrayList arrayList2 = new ArrayList();
                                if (parcelableArrayList2 == null) {
                                    parcelableArrayList2 = Collections.emptyList();
                                }
                                for (Intent intent2 : parcelableArrayList2) {
                                    if (intent2 != null) {
                                        z = true;
                                    }
                                    arrayList2.add(new c1(z));
                                    z = false;
                                }
                                String string = bundle2.getString(e.d.b.d.a.d("uncompressed_hash_sha256", c2, str3));
                                long j4 = bundle2.getLong(e.d.b.d.a.d("uncompressed_size", c2, str3));
                                int i8 = bundle2.getInt(e.d.b.d.a.d("patch_format", c2, str3), 0);
                                if (i8 != 0) {
                                    f1Var = new f1(str3, string, j4, arrayList2, 0, i8);
                                    z = false;
                                } else {
                                    z = false;
                                    f1Var = new f1(str3, string, j4, arrayList2, bundle2.getInt(e.d.b.d.a.d("compression_format", c2, str3), 0), 0);
                                }
                                arrayList.add(f1Var);
                            }
                            h1Var2.f6814f.put(Integer.valueOf(i2), new e1(i2, bundle2.getInt("app_version_code"), new d1(c2, j2, i7, j3, arrayList)));
                        }
                        return Boolean.TRUE;
                    }
                })).booleanValue()) {
                    return;
                }
                q0 q0Var = tVar.f6947h;
                Objects.requireNonNull(q0Var);
                e.d.b.e.a.c.e eVar = q0.a;
                eVar.a(3, "Run extractor loop", new Object[0]);
                if (!q0Var.f6899j.compareAndSet(false, true)) {
                    eVar.a(5, "runLoop already looping; return", new Object[0]);
                    return;
                }
                while (true) {
                    j1 j1Var = null;
                    try {
                        j1Var = q0Var.f6898i.a();
                    } catch (p0 e2) {
                        q0.a.a(6, "Error while getting next extraction task: %s", new Object[]{e2.getMessage()});
                        if (e2.a >= 0) {
                            q0Var.f6897h.a().a(e2.a);
                            q0Var.a(e2.a, e2);
                        }
                    }
                    if (j1Var == null) {
                        q0Var.f6899j.set(false);
                        return;
                    }
                    try {
                        if (j1Var instanceof m0) {
                            q0Var.f6892c.a((m0) j1Var);
                        } else if (j1Var instanceof j2) {
                            q0Var.f6893d.a((j2) j1Var);
                        } else if (j1Var instanceof t1) {
                            q0Var.f6894e.a((t1) j1Var);
                        } else if (j1Var instanceof w1) {
                            q0Var.f6895f.a((w1) j1Var);
                        } else if (j1Var instanceof c2) {
                            q0Var.f6896g.a((c2) j1Var);
                        } else {
                            q0.a.a(6, "Unknown task type: %s", new Object[]{j1Var.getClass().getName()});
                        }
                    } catch (Exception e3) {
                        q0.a.a(6, "Error during extraction task: %s", new Object[]{e3.getMessage()});
                        q0Var.f6897h.a().a(j1Var.a);
                        q0Var.a(j1Var.a, e3);
                    }
                }
            }
        });
    }

    public final void b() {
        e.d.b.e.a.d.b bVar;
        if ((this.f6945f || !this.f6943d.isEmpty()) && this.f6944e == null) {
            e.d.b.e.a.d.b bVar2 = new e.d.b.e.a.d.b(this);
            this.f6944e = bVar2;
            this.f6942c.registerReceiver(bVar2, this.f6941b);
        }
        if (this.f6945f || !this.f6943d.isEmpty() || (bVar = this.f6944e) == null) {
            return;
        }
        this.f6942c.unregisterReceiver(bVar);
        this.f6944e = null;
    }
}

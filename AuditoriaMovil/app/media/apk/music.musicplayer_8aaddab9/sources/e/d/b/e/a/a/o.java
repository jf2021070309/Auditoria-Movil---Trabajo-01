package e.d.b.e.a.a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public final class o implements e3 {
    public static final e.d.b.e.a.c.e a = new e.d.b.e.a.c.e("AssetPackServiceImpl");

    /* renamed from: b  reason: collision with root package name */
    public static final Intent f6873b = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");

    /* renamed from: c  reason: collision with root package name */
    public final String f6874c;

    /* renamed from: d  reason: collision with root package name */
    public final t0 f6875d;

    /* renamed from: e  reason: collision with root package name */
    public e.d.b.e.a.c.o<e.d.b.e.a.c.k0> f6876e;

    /* renamed from: f  reason: collision with root package name */
    public e.d.b.e.a.c.o<e.d.b.e.a.c.k0> f6877f;

    /* renamed from: g  reason: collision with root package name */
    public final AtomicBoolean f6878g = new AtomicBoolean();

    public o(Context context, t0 t0Var) {
        this.f6874c = context.getPackageName();
        this.f6875d = t0Var;
        if (e.d.b.e.a.c.q.a(context)) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = applicationContext != null ? applicationContext : context;
            e.d.b.e.a.c.e eVar = a;
            Intent intent = f6873b;
            this.f6876e = new e.d.b.e.a.c.o<>(context2, eVar, "AssetPackService", intent, f3.a);
            Context applicationContext2 = context.getApplicationContext();
            this.f6877f = new e.d.b.e.a.c.o<>(applicationContext2 != null ? applicationContext2 : context, eVar, "AssetPackService-keepAlive", intent, g3.a);
        }
        a.a(3, "AssetPackService initiated.", new Object[0]);
    }

    public static /* synthetic */ Bundle g(Map map) {
        Bundle j2 = j();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        j2.putParcelableArrayList("installed_asset_module", arrayList);
        return j2;
    }

    public static Bundle h(int i2, String str, String str2, int i3) {
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", i2);
        bundle.putString("module_name", str);
        bundle.putString("slice_id", str2);
        bundle.putInt("chunk_number", i3);
        return bundle;
    }

    public static <T> e.d.b.e.a.g.r<T> i() {
        a.a(6, "onError(%d)", new Object[]{-11});
        a aVar = new a(-11);
        e.d.b.e.a.g.r<T> rVar = new e.d.b.e.a.g.r<>();
        rVar.a(aVar);
        return rVar;
    }

    public static Bundle j() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 10800);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        bundle.putIntegerArrayList("supported_patch_formats", new ArrayList<>());
        return bundle;
    }

    @Override // e.d.b.e.a.a.e3
    public final synchronized void a() {
        if (this.f6877f == null) {
            a.a(5, "Keep alive connection manager is not initialized.", new Object[0]);
            return;
        }
        e.d.b.e.a.c.e eVar = a;
        eVar.a(4, "keepAlive", new Object[0]);
        if (!this.f6878g.compareAndSet(false, true)) {
            eVar.a(4, "Service is already kept alive.", new Object[0]);
            return;
        }
        e.d.b.e.a.g.n nVar = new e.d.b.e.a.g.n();
        this.f6877f.b(new i(this, nVar, nVar));
    }

    @Override // e.d.b.e.a.a.e3
    public final void a(int i2) {
        if (this.f6876e == null) {
            throw new p0("The Play Store app is not installed or is an unofficial version.", i2);
        }
        a.a(4, "notifySessionFailed", new Object[0]);
        e.d.b.e.a.g.n nVar = new e.d.b.e.a.g.n();
        this.f6876e.b(new g(this, nVar, i2, nVar));
    }

    @Override // e.d.b.e.a.a.e3
    public final void a(List<String> list) {
        if (this.f6876e == null) {
            return;
        }
        a.a(4, "cancelDownloads(%s)", new Object[]{list});
        e.d.b.e.a.g.n nVar = new e.d.b.e.a.g.n();
        this.f6876e.b(new c(this, nVar, list, nVar));
    }

    @Override // e.d.b.e.a.a.e3
    public final void b(int i2, String str) {
        f(i2, str, 10);
    }

    @Override // e.d.b.e.a.a.e3
    public final e.d.b.e.a.g.r<List<String>> c(Map<String, Long> map) {
        if (this.f6876e == null) {
            return i();
        }
        a.a(4, "syncPacks", new Object[0]);
        e.d.b.e.a.g.n nVar = new e.d.b.e.a.g.n();
        this.f6876e.b(new d(this, nVar, map, nVar));
        return nVar.a;
    }

    @Override // e.d.b.e.a.a.e3
    public final e.d.b.e.a.g.r<ParcelFileDescriptor> d(int i2, String str, String str2, int i3) {
        if (this.f6876e == null) {
            return i();
        }
        a.a(4, "getChunkFileDescriptor(%s, %s, %d, session=%d)", new Object[]{str, str2, Integer.valueOf(i3), Integer.valueOf(i2)});
        e.d.b.e.a.g.n nVar = new e.d.b.e.a.g.n();
        this.f6876e.b(new h(this, nVar, i2, str, str2, i3, nVar));
        return nVar.a;
    }

    @Override // e.d.b.e.a.a.e3
    public final void e(int i2, String str, String str2, int i3) {
        if (this.f6876e == null) {
            throw new p0("The Play Store app is not installed or is an unofficial version.", i2);
        }
        a.a(4, "notifyChunkTransferred", new Object[0]);
        e.d.b.e.a.g.n nVar = new e.d.b.e.a.g.n();
        this.f6876e.b(new e(this, nVar, i2, str, str2, i3, nVar));
    }

    public final void f(int i2, String str, int i3) {
        if (this.f6876e == null) {
            throw new p0("The Play Store app is not installed or is an unofficial version.", i2);
        }
        a.a(4, "notifyModuleCompleted", new Object[0]);
        e.d.b.e.a.g.n nVar = new e.d.b.e.a.g.n();
        this.f6876e.b(new f(this, nVar, i2, str, nVar, i3));
    }
}

package com.qq.e.comm.managers.plugin;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.qq.e.comm.constants.Sig;
import com.qq.e.comm.managers.status.SDKStatus;
import com.qq.e.comm.pi.POFactory;
import com.qq.e.comm.util.GDTLogger;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class PM {
    private static final Map<Class<?>, String> q = new b();
    private final Context b;
    private String c;
    private File d;
    private volatile int e;
    private DexClassLoader f;
    private RandomAccessFile g;
    private FileLock h;
    private boolean i;
    private final f j;
    private volatile POFactory k;
    private int l;
    private Future<Boolean> m;
    private boolean o;
    private String p;
    final ExecutorService a = Executors.newSingleThreadExecutor();
    private boolean n = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Callable<Boolean> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        public Boolean call() throws Exception {
            long currentTimeMillis = System.currentTimeMillis();
            if (!PM.this.i) {
                PM pm = PM.this;
                pm.i = pm.tryLockUpdate();
            }
            if (PM.b(PM.this)) {
                PM.c(PM.this);
            }
            PM.this.l = (int) (System.currentTimeMillis() - currentTimeMillis);
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes3.dex */
    static class b extends HashMap<Class<?>, String> {
        b() {
            put(POFactory.class, "com.qq.e.comm.plugin.POFactoryImpl");
        }
    }

    public PM(Context context, f fVar) {
        this.b = context.getApplicationContext();
        this.j = fVar;
        com.qq.e.comm.managers.plugin.b.a(context);
        d();
    }

    private JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            int pluginVersion = getPluginVersion();
            if (pluginVersion > 10000) {
                jSONObject.put("vas", this.p);
            }
            jSONObject.put("pv", pluginVersion);
            jSONObject.put("sig", this.c);
            jSONObject.put("appId", com.qq.e.comm.managers.b.b().a());
            jSONObject.put("pn", com.qq.e.comm.managers.plugin.b.a(this.b));
            jSONObject.put("ict", this.l);
            jSONObject.put("mup", this.i);
        } catch (JSONException e) {
        }
        return jSONObject;
    }

    private boolean b() {
        if (this.i) {
            try {
                Context context = this.b;
                com.qq.e.comm.managers.plugin.b.a(context, h.e(context), h.f(this.b));
                this.c = Sig.ASSET_PLUGIN_SIG;
                this.d = h.e(this.b);
                this.e = SDKStatus.getBuildInPluginVersion();
                return true;
            } catch (Throwable th) {
                GDTLogger.e("插件初始化失败 ");
                com.qq.e.comm.managers.plugin.a.a(th, th.getMessage());
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
        if (r5.b() != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static boolean b(com.qq.e.comm.managers.plugin.PM r5) {
        /*
            java.lang.String r0 = "TimeStap_AFTER_PLUGIN_INIT:"
            if (r5 == 0) goto L6d
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r2.<init>()     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = "TimeStap_BEFORE_PLUGIN_INIT:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L31
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L31
            r2.append(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L31
            com.qq.e.comm.util.GDTLogger.d(r2)     // Catch: java.lang.Throwable -> L31
            boolean r2 = r5.c()     // Catch: java.lang.Throwable -> L31
            if (r2 != 0) goto L29
            boolean r5 = r5.b()     // Catch: java.lang.Throwable -> L31
            if (r5 == 0) goto L2b
        L29:
            r5 = 1
            r1 = r5
        L2b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            goto L43
        L31:
            r5 = move-exception
            java.lang.String r2 = "插件加载出现异常"
            com.qq.e.comm.util.GDTLogger.e(r2, r5)     // Catch: java.lang.Throwable -> L55
            java.lang.String r2 = r5.getMessage()     // Catch: java.lang.Throwable -> L55
            com.qq.e.comm.managers.plugin.a.a(r5, r2)     // Catch: java.lang.Throwable -> L55
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
        L43:
            r5.append(r0)
            long r2 = java.lang.System.currentTimeMillis()
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            com.qq.e.comm.util.GDTLogger.d(r5)
            return r1
        L55:
            r5 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            long r2 = java.lang.System.currentTimeMillis()
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.qq.e.comm.util.GDTLogger.d(r0)
            throw r5
        L6d:
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qq.e.comm.managers.plugin.PM.b(com.qq.e.comm.managers.plugin.PM):boolean");
    }

    static void c(PM pm) {
        if (pm == null) {
            throw null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("PluginFile:\t");
        File file = pm.d;
        sb.append(file == null ? "null" : file.getAbsolutePath());
        GDTLogger.d(sb.toString());
        if (pm.c == null || pm.d == null) {
            pm.f = null;
            return;
        }
        try {
            pm.f = new DexClassLoader(pm.d.getAbsolutePath(), h.a(pm.b).getAbsolutePath(), null, pm.getClass().getClassLoader());
            f fVar = pm.j;
            if (fVar != null) {
                fVar.a();
            }
        } catch (Throwable th) {
            GDTLogger.e("插件ClassLoader构造发生异常", th);
            f fVar2 = pm.j;
            if (fVar2 != null) {
                fVar2.b();
            }
            com.qq.e.comm.managers.plugin.a.a(th, th.getMessage());
        }
    }

    private boolean c() {
        if (this.o) {
            return false;
        }
        if (this.i) {
            g gVar = new g(h.c(this.b), h.d(this.b));
            if (gVar.a()) {
                boolean a2 = gVar.a(h.e(this.b), h.f(this.b));
                GDTLogger.d("NextExist,Updated=" + a2);
            }
        }
        g gVar2 = new g(h.e(this.b), h.f(this.b));
        if (gVar2.a()) {
            if (gVar2.c() >= SDKStatus.getBuildInPluginVersion()) {
                this.c = gVar2.b();
                this.e = gVar2.c();
                this.d = h.e(this.b);
                this.p = gVar2.d();
                this.n = true;
                return true;
            }
            GDTLogger.d("last updated plugin version =" + this.e + ";asset plugin version=" + SDKStatus.getBuildInPluginVersion());
            return false;
        }
        return false;
    }

    private void d() {
        this.n = false;
        SharedPreferences sharedPreferences = this.b.getSharedPreferences("start_crash", 0);
        if (sharedPreferences.getInt("crash_count", 0) >= 2) {
            this.o = true;
            sharedPreferences.edit().remove("crash_count").commit();
            GDTLogger.e("加载本地插件");
        }
        this.m = this.a.submit(new a());
    }

    public <T> T getFactory(Class<T> cls) throws e {
        Future<Boolean> future = this.m;
        if (future != null) {
            try {
                future.get();
            } catch (InterruptedException e) {
            } catch (ExecutionException e2) {
            }
        }
        GDTLogger.d("GetFactoryInstaceforInterface:" + cls);
        ClassLoader classLoader = Sig.ASSET_PLUGIN_SIG == null ? PM.class.getClassLoader() : this.f;
        StringBuilder sb = new StringBuilder();
        sb.append("PluginClassLoader is parent");
        sb.append(PM.class.getClassLoader() == classLoader);
        GDTLogger.d(sb.toString());
        if (classLoader == null) {
            throw new e("Fail to init GDTADPLugin,PluginClassLoader == null;while loading factory impl for:" + cls);
        }
        try {
            String str = q.get(cls);
            if (TextUtils.isEmpty(str)) {
                throw new e("factory  implemention name is not specified for interface:" + cls.getName());
            }
            Class<?> loadClass = classLoader.loadClass(str);
            T cast = cls.cast(loadClass.getDeclaredMethod("getInstance", Context.class, JSONObject.class).invoke(loadClass, this.b, a()));
            GDTLogger.d("ServiceDelegateFactory =" + cast);
            return cast;
        } catch (Throwable th) {
            throw new e("Fail to getfactory implement instance for interface:" + cls.getName(), th);
        }
    }

    public POFactory getPOFactory() throws e {
        if (this.k == null) {
            synchronized (this) {
                if (this.k == null) {
                    try {
                        this.k = (POFactory) getFactory(POFactory.class);
                    } catch (e e) {
                        if (!this.n) {
                            throw e;
                        }
                        GDTLogger.e("插件加载错误，回退到内置版本");
                        this.o = true;
                        d();
                        this.k = (POFactory) getFactory(POFactory.class);
                    }
                }
            }
        }
        return this.k;
    }

    public int getPluginVersion() {
        Future<Boolean> future = this.m;
        if (future != null) {
            try {
                future.get();
            } catch (InterruptedException e) {
            } catch (ExecutionException e2) {
            }
        }
        return this.e;
    }

    public boolean tryLockUpdate() {
        try {
            File b2 = h.b(this.b);
            if (!b2.exists()) {
                b2.createNewFile();
                h.a("lock", b2);
            }
            if (b2.exists()) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(b2, "rw");
                this.g = randomAccessFile;
                FileLock tryLock = randomAccessFile.getChannel().tryLock();
                this.h = tryLock;
                if (tryLock != null) {
                    this.g.writeByte(37);
                    return true;
                }
                return false;
            }
            return false;
        } catch (Throwable th) {
            return false;
        }
    }
}

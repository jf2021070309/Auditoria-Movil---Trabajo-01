package e.c.a;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.GeneratedAppGlideModule;
import com.bumptech.glide.load.ImageHeaderParser;
import e.c.a.m.o;
import e.c.a.m.r.k;
import e.c.a.m.r.m;
import e.c.a.m.s.d0.j;
import e.c.a.m.s.e0.a;
import e.c.a.m.t.a;
import e.c.a.m.t.b;
import e.c.a.m.t.d;
import e.c.a.m.t.e;
import e.c.a.m.t.f;
import e.c.a.m.t.k;
import e.c.a.m.t.s;
import e.c.a.m.t.u;
import e.c.a.m.t.v;
import e.c.a.m.t.w;
import e.c.a.m.t.x;
import e.c.a.m.t.y.a;
import e.c.a.m.t.y.b;
import e.c.a.m.t.y.c;
import e.c.a.m.t.y.d;
import e.c.a.m.t.y.e;
import e.c.a.m.t.y.f;
import e.c.a.m.u.c.a0;
import e.c.a.m.u.c.b0;
import e.c.a.m.u.c.k;
import e.c.a.m.u.c.m;
import e.c.a.m.u.c.p;
import e.c.a.m.u.c.t;
import e.c.a.m.u.c.v;
import e.c.a.m.u.c.x;
import e.c.a.m.u.c.y;
import e.c.a.m.u.d.a;
import e.c.a.n.l;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class b implements ComponentCallbacks2 {
    public static volatile b a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile boolean f5436b;

    /* renamed from: c  reason: collision with root package name */
    public final e.c.a.m.s.c0.d f5437c;

    /* renamed from: d  reason: collision with root package name */
    public final e.c.a.m.s.d0.i f5438d;

    /* renamed from: e  reason: collision with root package name */
    public final d f5439e;

    /* renamed from: f  reason: collision with root package name */
    public final g f5440f;

    /* renamed from: g  reason: collision with root package name */
    public final e.c.a.m.s.c0.b f5441g;

    /* renamed from: h  reason: collision with root package name */
    public final l f5442h;

    /* renamed from: i  reason: collision with root package name */
    public final e.c.a.n.d f5443i;

    /* renamed from: j  reason: collision with root package name */
    public final List<i> f5444j = new ArrayList();

    /* loaded from: classes.dex */
    public interface a {
    }

    public b(Context context, e.c.a.m.s.l lVar, e.c.a.m.s.d0.i iVar, e.c.a.m.s.c0.d dVar, e.c.a.m.s.c0.b bVar, l lVar2, e.c.a.n.d dVar2, int i2, a aVar, Map<Class<?>, j<?, ?>> map, List<e.c.a.q.d<Object>> list, boolean z, boolean z2) {
        o gVar;
        o yVar;
        e.c.a.m.u.e.d dVar3;
        e eVar = e.NORMAL;
        this.f5437c = dVar;
        this.f5441g = bVar;
        this.f5438d = iVar;
        this.f5442h = lVar2;
        this.f5443i = dVar2;
        Resources resources = context.getResources();
        g gVar2 = new g();
        this.f5440f = gVar2;
        k kVar = new k();
        e.c.a.p.b bVar2 = gVar2.f5473g;
        synchronized (bVar2) {
            bVar2.a.add(kVar);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 27) {
            p pVar = new p();
            e.c.a.p.b bVar3 = gVar2.f5473g;
            synchronized (bVar3) {
                bVar3.a.add(pVar);
            }
        }
        List<ImageHeaderParser> e2 = gVar2.e();
        e.c.a.m.u.g.a aVar2 = new e.c.a.m.u.g.a(context, e2, dVar, bVar);
        b0 b0Var = new b0(dVar, new b0.g());
        m mVar = new m(gVar2.e(), resources.getDisplayMetrics(), dVar, bVar);
        if (!z2 || i3 < 28) {
            gVar = new e.c.a.m.u.c.g(mVar);
            yVar = new y(mVar, bVar);
        } else {
            yVar = new t();
            gVar = new e.c.a.m.u.c.h();
        }
        e.c.a.m.u.e.d dVar4 = new e.c.a.m.u.e.d(context);
        s.c cVar = new s.c(resources);
        s.d dVar5 = new s.d(resources);
        s.b bVar4 = new s.b(resources);
        s.a aVar3 = new s.a(resources);
        e.c.a.m.u.c.c cVar2 = new e.c.a.m.u.c.c(bVar);
        e.c.a.m.u.h.a aVar4 = new e.c.a.m.u.h.a();
        e.c.a.m.u.h.d dVar6 = new e.c.a.m.u.h.d();
        ContentResolver contentResolver = context.getContentResolver();
        gVar2.a(ByteBuffer.class, new e.c.a.m.t.c());
        gVar2.a(InputStream.class, new e.c.a.m.t.t(bVar));
        gVar2.d("Bitmap", ByteBuffer.class, Bitmap.class, gVar);
        gVar2.d("Bitmap", InputStream.class, Bitmap.class, yVar);
        if (e.c.a.m.r.m.c()) {
            dVar3 = dVar4;
            gVar2.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new v(mVar));
        } else {
            dVar3 = dVar4;
        }
        gVar2.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, b0Var);
        gVar2.d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new b0(dVar, new b0.c(null)));
        v.a<?> aVar5 = v.a.a;
        gVar2.c(Bitmap.class, Bitmap.class, aVar5);
        gVar2.d("Bitmap", Bitmap.class, Bitmap.class, new a0());
        gVar2.b(Bitmap.class, cVar2);
        gVar2.d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new e.c.a.m.u.c.a(resources, gVar));
        gVar2.d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new e.c.a.m.u.c.a(resources, yVar));
        gVar2.d("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new e.c.a.m.u.c.a(resources, b0Var));
        gVar2.b(BitmapDrawable.class, new e.c.a.m.u.c.b(dVar, cVar2));
        gVar2.d("Gif", InputStream.class, e.c.a.m.u.g.c.class, new e.c.a.m.u.g.j(e2, aVar2, bVar));
        gVar2.d("Gif", ByteBuffer.class, e.c.a.m.u.g.c.class, aVar2);
        gVar2.b(e.c.a.m.u.g.c.class, new e.c.a.m.u.g.d());
        gVar2.c(e.c.a.l.a.class, e.c.a.l.a.class, aVar5);
        gVar2.d("Bitmap", e.c.a.l.a.class, Bitmap.class, new e.c.a.m.u.g.h(dVar));
        e.c.a.m.u.e.d dVar7 = dVar3;
        gVar2.d("legacy_append", Uri.class, Drawable.class, dVar7);
        gVar2.d("legacy_append", Uri.class, Bitmap.class, new x(dVar7, dVar));
        gVar2.g(new a.C0127a());
        gVar2.c(File.class, ByteBuffer.class, new d.b());
        gVar2.c(File.class, InputStream.class, new f.e());
        gVar2.d("legacy_append", File.class, File.class, new e.c.a.m.u.f.a());
        gVar2.c(File.class, ParcelFileDescriptor.class, new f.b());
        gVar2.c(File.class, File.class, aVar5);
        gVar2.g(new k.a(bVar));
        if (e.c.a.m.r.m.c()) {
            gVar2.g(new m.a());
        }
        Class cls = Integer.TYPE;
        gVar2.c(cls, InputStream.class, cVar);
        gVar2.c(cls, ParcelFileDescriptor.class, bVar4);
        gVar2.c(Integer.class, InputStream.class, cVar);
        gVar2.c(Integer.class, ParcelFileDescriptor.class, bVar4);
        gVar2.c(Integer.class, Uri.class, dVar5);
        gVar2.c(cls, AssetFileDescriptor.class, aVar3);
        gVar2.c(Integer.class, AssetFileDescriptor.class, aVar3);
        gVar2.c(cls, Uri.class, dVar5);
        gVar2.c(String.class, InputStream.class, new e.c());
        gVar2.c(Uri.class, InputStream.class, new e.c());
        gVar2.c(String.class, InputStream.class, new u.c());
        gVar2.c(String.class, ParcelFileDescriptor.class, new u.b());
        gVar2.c(String.class, AssetFileDescriptor.class, new u.a());
        gVar2.c(Uri.class, InputStream.class, new b.a());
        gVar2.c(Uri.class, InputStream.class, new a.c(context.getAssets()));
        gVar2.c(Uri.class, ParcelFileDescriptor.class, new a.b(context.getAssets()));
        gVar2.c(Uri.class, InputStream.class, new c.a(context));
        gVar2.c(Uri.class, InputStream.class, new d.a(context));
        if (i3 >= 29) {
            gVar2.c(Uri.class, InputStream.class, new e.c(context));
            gVar2.c(Uri.class, ParcelFileDescriptor.class, new e.b(context));
        }
        gVar2.c(Uri.class, InputStream.class, new w.d(contentResolver));
        gVar2.c(Uri.class, ParcelFileDescriptor.class, new w.b(contentResolver));
        gVar2.c(Uri.class, AssetFileDescriptor.class, new w.a(contentResolver));
        gVar2.c(Uri.class, InputStream.class, new x.a());
        gVar2.c(URL.class, InputStream.class, new f.a());
        gVar2.c(Uri.class, File.class, new k.a(context));
        gVar2.c(e.c.a.m.t.g.class, InputStream.class, new a.C0124a());
        gVar2.c(byte[].class, ByteBuffer.class, new b.a());
        gVar2.c(byte[].class, InputStream.class, new b.d());
        gVar2.c(Uri.class, Uri.class, aVar5);
        gVar2.c(Drawable.class, Drawable.class, aVar5);
        gVar2.d("legacy_append", Drawable.class, Drawable.class, new e.c.a.m.u.e.e());
        gVar2.h(Bitmap.class, BitmapDrawable.class, new e.c.a.m.u.h.b(resources));
        gVar2.h(Bitmap.class, byte[].class, aVar4);
        gVar2.h(Drawable.class, byte[].class, new e.c.a.m.u.h.c(dVar, aVar4, dVar6));
        gVar2.h(e.c.a.m.u.g.c.class, byte[].class, dVar6);
        if (i3 >= 23) {
            b0 b0Var2 = new b0(dVar, new b0.d());
            gVar2.d("legacy_append", ByteBuffer.class, Bitmap.class, b0Var2);
            gVar2.d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new e.c.a.m.u.c.a(resources, b0Var2));
        }
        this.f5439e = new d(context, bVar, gVar2, new e.c.a.q.h.f(), aVar, map, list, lVar, z, i2);
    }

    public static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (f5436b) {
            throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
        }
        f5436b = true;
        c cVar = new c();
        Context applicationContext = context.getApplicationContext();
        Collections.emptyList();
        Log.isLoggable("ManifestParser", 3);
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                Log.isLoggable("ManifestParser", 3);
            } else {
                if (Log.isLoggable("ManifestParser", 2)) {
                    String str = "Got app info metadata: " + applicationInfo.metaData;
                }
                for (String str2 : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str2))) {
                        arrayList.add(e.c.a.o.e.a(str2));
                        Log.isLoggable("ManifestParser", 3);
                    }
                }
                Log.isLoggable("ManifestParser", 3);
            }
            if (generatedAppGlideModule != null && !generatedAppGlideModule.c().isEmpty()) {
                Set<Class<?>> c2 = generatedAppGlideModule.c();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    e.c.a.o.c cVar2 = (e.c.a.o.c) it.next();
                    if (c2.contains(cVar2.getClass())) {
                        if (Log.isLoggable("Glide", 3)) {
                            String str3 = "AppGlideModule excludes manifest GlideModule: " + cVar2;
                        }
                        it.remove();
                    }
                }
            }
            if (Log.isLoggable("Glide", 3)) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    StringBuilder y = e.a.d.a.a.y("Discovered GlideModule from manifest: ");
                    y.append(((e.c.a.o.c) it2.next()).getClass());
                    y.toString();
                }
            }
            cVar.f5455l = null;
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((e.c.a.o.c) it3.next()).a(applicationContext, cVar);
            }
            if (cVar.f5449f == null) {
                int a2 = e.c.a.m.s.e0.a.a();
                if (TextUtils.isEmpty("source")) {
                    throw new IllegalArgumentException(e.a.d.a.a.k("Name must be non-null and non-empty, but given: ", "source"));
                }
                cVar.f5449f = new e.c.a.m.s.e0.a(new ThreadPoolExecutor(a2, a2, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.ThreadFactoryC0116a("source", a.b.f5660b, false)));
            }
            if (cVar.f5450g == null) {
                int i2 = e.c.a.m.s.e0.a.f5656b;
                if (TextUtils.isEmpty("disk-cache")) {
                    throw new IllegalArgumentException(e.a.d.a.a.k("Name must be non-null and non-empty, but given: ", "disk-cache"));
                }
                cVar.f5450g = new e.c.a.m.s.e0.a(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.ThreadFactoryC0116a("disk-cache", a.b.f5660b, true)));
            }
            if (cVar.f5456m == null) {
                int i3 = e.c.a.m.s.e0.a.a() >= 4 ? 2 : 1;
                if (TextUtils.isEmpty("animation")) {
                    throw new IllegalArgumentException(e.a.d.a.a.k("Name must be non-null and non-empty, but given: ", "animation"));
                }
                cVar.f5456m = new e.c.a.m.s.e0.a(new ThreadPoolExecutor(i3, i3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.ThreadFactoryC0116a("animation", a.b.f5660b, true)));
            }
            if (cVar.f5452i == null) {
                cVar.f5452i = new e.c.a.m.s.d0.j(new j.a(applicationContext));
            }
            if (cVar.f5453j == null) {
                cVar.f5453j = new e.c.a.n.f();
            }
            if (cVar.f5446c == null) {
                int i4 = cVar.f5452i.a;
                if (i4 > 0) {
                    cVar.f5446c = new e.c.a.m.s.c0.j(i4);
                } else {
                    cVar.f5446c = new e.c.a.m.s.c0.e();
                }
            }
            if (cVar.f5447d == null) {
                cVar.f5447d = new e.c.a.m.s.c0.i(cVar.f5452i.f5647d);
            }
            if (cVar.f5448e == null) {
                cVar.f5448e = new e.c.a.m.s.d0.h(cVar.f5452i.f5645b);
            }
            if (cVar.f5451h == null) {
                cVar.f5451h = new e.c.a.m.s.d0.g(applicationContext);
            }
            if (cVar.f5445b == null) {
                cVar.f5445b = new e.c.a.m.s.l(cVar.f5448e, cVar.f5451h, cVar.f5450g, cVar.f5449f, new e.c.a.m.s.e0.a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, e.c.a.m.s.e0.a.a, TimeUnit.MILLISECONDS, new SynchronousQueue(), new a.ThreadFactoryC0116a("source-unlimited", a.b.f5660b, false))), cVar.f5456m, false);
            }
            List<e.c.a.q.d<Object>> list = cVar.f5457n;
            if (list == null) {
                cVar.f5457n = Collections.emptyList();
            } else {
                cVar.f5457n = Collections.unmodifiableList(list);
            }
            b bVar = new b(applicationContext, cVar.f5445b, cVar.f5448e, cVar.f5446c, cVar.f5447d, new l(cVar.f5455l), cVar.f5453j, 4, cVar.f5454k, cVar.a, cVar.f5457n, false, false);
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                e.c.a.o.c cVar3 = (e.c.a.o.c) it4.next();
                try {
                    cVar3.b(applicationContext, bVar, bVar.f5440f);
                } catch (AbstractMethodError e2) {
                    StringBuilder y2 = e.a.d.a.a.y("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ");
                    y2.append(cVar3.getClass().getName());
                    throw new IllegalStateException(y2.toString(), e2);
                }
            }
            applicationContext.registerComponentCallbacks(bVar);
            a = bVar;
            f5436b = false;
        } catch (PackageManager.NameNotFoundException e3) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e3);
        }
    }

    public static b b(Context context) {
        if (a == null) {
            GeneratedAppGlideModule generatedAppGlideModule = null;
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
            } catch (IllegalAccessException e2) {
                c(e2);
                throw null;
            } catch (InstantiationException e3) {
                c(e3);
                throw null;
            } catch (NoSuchMethodException e4) {
                c(e4);
                throw null;
            } catch (InvocationTargetException e5) {
                c(e5);
                throw null;
            }
            synchronized (b.class) {
                if (a == null) {
                    a(context, generatedAppGlideModule);
                }
            }
        }
        return a;
    }

    public static void c(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public static i d(c.m.b.o oVar) {
        return b(oVar).f5442h.e(oVar);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        e.c.a.s.j.a();
        ((e.c.a.s.g) this.f5438d).e(0L);
        this.f5437c.b();
        this.f5441g.b();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
        long j2;
        e.c.a.s.j.a();
        for (i iVar : this.f5444j) {
            Objects.requireNonNull(iVar);
        }
        e.c.a.m.s.d0.h hVar = (e.c.a.m.s.d0.h) this.f5438d;
        Objects.requireNonNull(hVar);
        if (i2 >= 40) {
            hVar.e(0L);
        } else if (i2 >= 20 || i2 == 15) {
            synchronized (hVar) {
                j2 = hVar.f6027b;
            }
            hVar.e(j2 / 2);
        }
        this.f5437c.a(i2);
        this.f5441g.a(i2);
    }
}

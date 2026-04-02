package com.bumptech.glide;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.amazon.aps.iva.cd.a;
import com.amazon.aps.iva.h6.r;
import com.amazon.aps.iva.kc.j;
import com.amazon.aps.iva.nc.t;
import com.amazon.aps.iva.rc.a;
import com.amazon.aps.iva.rc.b;
import com.amazon.aps.iva.rc.c;
import com.amazon.aps.iva.rc.d;
import com.amazon.aps.iva.rc.e;
import com.amazon.aps.iva.rc.f;
import com.amazon.aps.iva.rc.k;
import com.amazon.aps.iva.rc.p;
import com.amazon.aps.iva.rc.t;
import com.amazon.aps.iva.rc.u;
import com.amazon.aps.iva.rc.v;
import com.amazon.aps.iva.rc.w;
import com.amazon.aps.iva.rc.x;
import com.amazon.aps.iva.rc.y;
import com.amazon.aps.iva.sc.a;
import com.amazon.aps.iva.sc.b;
import com.amazon.aps.iva.sc.c;
import com.amazon.aps.iva.sc.d;
import com.amazon.aps.iva.sc.e;
import com.amazon.aps.iva.se0.j0;
import com.amazon.aps.iva.uc.b0;
import com.amazon.aps.iva.uc.d0;
import com.amazon.aps.iva.uc.g;
import com.amazon.aps.iva.uc.h;
import com.amazon.aps.iva.uc.l;
import com.amazon.aps.iva.uc.n;
import com.amazon.aps.iva.uc.q;
import com.amazon.aps.iva.uc.u;
import com.amazon.aps.iva.uc.w;
import com.amazon.aps.iva.uc.y;
import com.amazon.aps.iva.uc.z;
import com.amazon.aps.iva.vc.a;
import com.amazon.aps.iva.wc.d;
import com.amazon.aps.iva.wc.i;
import com.bumptech.glide.b;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.c;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.List;
/* compiled from: RegistryFactory.java */
/* loaded from: classes.dex */
public final class e {
    public static com.amazon.aps.iva.ec.d a(a aVar, List<com.amazon.aps.iva.bd.c> list, com.amazon.aps.iva.bd.a aVar2) {
        j gVar;
        j zVar;
        int i;
        com.amazon.aps.iva.oc.c cVar = aVar.b;
        c cVar2 = aVar.d;
        Context applicationContext = cVar2.getApplicationContext();
        d dVar = cVar2.h;
        com.amazon.aps.iva.ec.d dVar2 = new com.amazon.aps.iva.ec.d();
        l lVar = new l();
        com.amazon.aps.iva.p0.e eVar = dVar2.g;
        synchronized (eVar) {
            ((List) eVar.b).add(lVar);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 27) {
            q qVar = new q();
            com.amazon.aps.iva.p0.e eVar2 = dVar2.g;
            synchronized (eVar2) {
                ((List) eVar2.b).add(qVar);
            }
        }
        Resources resources = applicationContext.getResources();
        List<ImageHeaderParser> d = dVar2.d();
        com.amazon.aps.iva.oc.b bVar = aVar.e;
        com.amazon.aps.iva.yc.a aVar3 = new com.amazon.aps.iva.yc.a(applicationContext, d, cVar, bVar);
        j d0Var = new d0(cVar, new d0.g());
        n nVar = new n(dVar2.d(), resources.getDisplayMetrics(), cVar, bVar);
        if (i2 >= 28 && dVar.a.containsKey(b.C0943b.class)) {
            zVar = new u();
            gVar = new h();
        } else {
            gVar = new g(nVar);
            zVar = new z(nVar, bVar);
        }
        if (i2 >= 28) {
            i = i2;
            dVar2.a(new d.c(new com.amazon.aps.iva.wc.d(d, bVar)), InputStream.class, Drawable.class, "Animation");
            dVar2.a(new d.b(new com.amazon.aps.iva.wc.d(d, bVar)), ByteBuffer.class, Drawable.class, "Animation");
        } else {
            i = i2;
        }
        i iVar = new i(applicationContext);
        com.amazon.aps.iva.uc.b bVar2 = new com.amazon.aps.iva.uc.b(bVar);
        com.amazon.aps.iva.zc.a aVar4 = new com.amazon.aps.iva.zc.a();
        com.amazon.aps.iva.hb.d dVar3 = new com.amazon.aps.iva.hb.d(4);
        ContentResolver contentResolver = applicationContext.getContentResolver();
        j0 j0Var = new j0(4);
        com.amazon.aps.iva.cd.a aVar5 = dVar2.b;
        synchronized (aVar5) {
            aVar5.a.add(new a.C0168a(ByteBuffer.class, j0Var));
        }
        r rVar = new r(bVar);
        com.amazon.aps.iva.cd.a aVar6 = dVar2.b;
        synchronized (aVar6) {
            aVar6.a.add(new a.C0168a(InputStream.class, rVar));
        }
        dVar2.a(gVar, ByteBuffer.class, Bitmap.class, "Bitmap");
        dVar2.a(zVar, InputStream.class, Bitmap.class, "Bitmap");
        String str = Build.FINGERPRINT;
        if (!"robolectric".equals(str)) {
            dVar2.a(new w(nVar), ParcelFileDescriptor.class, Bitmap.class, "Bitmap");
        }
        dVar2.a(new d0(cVar, new d0.c()), AssetFileDescriptor.class, Bitmap.class, "Bitmap");
        dVar2.a(d0Var, ParcelFileDescriptor.class, Bitmap.class, "Bitmap");
        p pVar = w.a.a;
        dVar2.c(Bitmap.class, Bitmap.class, pVar);
        dVar2.a(new b0(), Bitmap.class, Bitmap.class, "Bitmap");
        dVar2.b(Bitmap.class, bVar2);
        dVar2.a(new com.amazon.aps.iva.uc.a(resources, gVar), ByteBuffer.class, BitmapDrawable.class, "BitmapDrawable");
        dVar2.a(new com.amazon.aps.iva.uc.a(resources, zVar), InputStream.class, BitmapDrawable.class, "BitmapDrawable");
        dVar2.a(new com.amazon.aps.iva.uc.a(resources, d0Var), ParcelFileDescriptor.class, BitmapDrawable.class, "BitmapDrawable");
        dVar2.b(BitmapDrawable.class, new t(cVar, bVar2));
        dVar2.a(new com.amazon.aps.iva.yc.i(d, aVar3, bVar), InputStream.class, com.amazon.aps.iva.yc.c.class, "Animation");
        dVar2.a(aVar3, ByteBuffer.class, com.amazon.aps.iva.yc.c.class, "Animation");
        dVar2.b(com.amazon.aps.iva.yc.c.class, new com.amazon.aps.iva.ab.t());
        dVar2.c(com.amazon.aps.iva.gc.a.class, com.amazon.aps.iva.gc.a.class, pVar);
        dVar2.a(new com.amazon.aps.iva.yc.g(cVar), com.amazon.aps.iva.gc.a.class, Bitmap.class, "Bitmap");
        dVar2.a(iVar, Uri.class, Drawable.class, "legacy_append");
        dVar2.a(new y(iVar, cVar), Uri.class, Bitmap.class, "legacy_append");
        dVar2.g(new a.C0795a());
        dVar2.c(File.class, ByteBuffer.class, new c.b());
        dVar2.c(File.class, InputStream.class, new f.e());
        dVar2.a(new com.amazon.aps.iva.xc.a(), File.class, File.class, "legacy_append");
        dVar2.c(File.class, ParcelFileDescriptor.class, new f.b());
        dVar2.c(File.class, File.class, pVar);
        dVar2.g(new c.a(bVar));
        if (!"robolectric".equals(str)) {
            dVar2.g(new ParcelFileDescriptorRewinder.a());
        }
        p cVar3 = new e.c(applicationContext);
        p aVar7 = new e.a(applicationContext);
        p bVar3 = new e.b(applicationContext);
        Class cls = Integer.TYPE;
        dVar2.c(cls, InputStream.class, cVar3);
        dVar2.c(Integer.class, InputStream.class, cVar3);
        dVar2.c(cls, AssetFileDescriptor.class, aVar7);
        dVar2.c(Integer.class, AssetFileDescriptor.class, aVar7);
        dVar2.c(cls, Drawable.class, bVar3);
        dVar2.c(Integer.class, Drawable.class, bVar3);
        dVar2.c(Uri.class, InputStream.class, new u.b(applicationContext));
        dVar2.c(Uri.class, AssetFileDescriptor.class, new u.a(applicationContext));
        p cVar4 = new t.c(resources);
        p aVar8 = new t.a(resources);
        p bVar4 = new t.b(resources);
        dVar2.c(Integer.class, Uri.class, cVar4);
        dVar2.c(cls, Uri.class, cVar4);
        dVar2.c(Integer.class, AssetFileDescriptor.class, aVar8);
        dVar2.c(cls, AssetFileDescriptor.class, aVar8);
        dVar2.c(Integer.class, InputStream.class, bVar4);
        dVar2.c(cls, InputStream.class, bVar4);
        dVar2.c(String.class, InputStream.class, new d.c());
        dVar2.c(Uri.class, InputStream.class, new d.c());
        dVar2.c(String.class, InputStream.class, new v.c());
        dVar2.c(String.class, ParcelFileDescriptor.class, new v.b());
        dVar2.c(String.class, AssetFileDescriptor.class, new v.a());
        dVar2.c(Uri.class, InputStream.class, new a.c(applicationContext.getAssets()));
        dVar2.c(Uri.class, AssetFileDescriptor.class, new a.b(applicationContext.getAssets()));
        dVar2.c(Uri.class, InputStream.class, new b.a(applicationContext));
        dVar2.c(Uri.class, InputStream.class, new c.a(applicationContext));
        if (i >= 29) {
            dVar2.c(Uri.class, InputStream.class, new d.c(applicationContext));
            dVar2.c(Uri.class, ParcelFileDescriptor.class, new d.b(applicationContext));
        }
        dVar2.c(Uri.class, InputStream.class, new x.d(contentResolver));
        dVar2.c(Uri.class, ParcelFileDescriptor.class, new x.b(contentResolver));
        dVar2.c(Uri.class, AssetFileDescriptor.class, new x.a(contentResolver));
        dVar2.c(Uri.class, InputStream.class, new y.a());
        dVar2.c(URL.class, InputStream.class, new e.a());
        dVar2.c(Uri.class, File.class, new k.a(applicationContext));
        dVar2.c(com.amazon.aps.iva.rc.g.class, InputStream.class, new a.C0701a());
        dVar2.c(byte[].class, ByteBuffer.class, new b.a());
        dVar2.c(byte[].class, InputStream.class, new b.d());
        dVar2.c(Uri.class, Uri.class, pVar);
        dVar2.c(Drawable.class, Drawable.class, pVar);
        dVar2.a(new com.amazon.aps.iva.wc.j(), Drawable.class, Drawable.class, "legacy_append");
        dVar2.h(Bitmap.class, BitmapDrawable.class, new com.amazon.aps.iva.p0.e(resources));
        dVar2.h(Bitmap.class, byte[].class, aVar4);
        dVar2.h(Drawable.class, byte[].class, new com.amazon.aps.iva.zc.b(cVar, aVar4, dVar3));
        dVar2.h(com.amazon.aps.iva.yc.c.class, byte[].class, dVar3);
        j d0Var2 = new d0(cVar, new d0.d());
        dVar2.a(d0Var2, ByteBuffer.class, Bitmap.class, "legacy_append");
        dVar2.a(new com.amazon.aps.iva.uc.a(resources, d0Var2), ByteBuffer.class, BitmapDrawable.class, "legacy_append");
        for (com.amazon.aps.iva.bd.c cVar5 : list) {
            try {
                cVar5.registerComponents(applicationContext, aVar, dVar2);
            } catch (AbstractMethodError e) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(cVar5.getClass().getName()), e);
            }
        }
        if (aVar2 != null) {
            aVar2.registerComponents(applicationContext, aVar, dVar2);
        }
        return dVar2;
    }
}

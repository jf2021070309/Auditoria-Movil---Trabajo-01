package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import com.amazon.aps.iva.ec.g;
import com.amazon.aps.iva.hd.i;
import com.amazon.aps.iva.hd.l;
import com.amazon.aps.iva.nc.m;
import com.amazon.aps.iva.pc.h;
import com.bumptech.glide.b;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: Glide.java */
/* loaded from: classes.dex */
public final class a implements ComponentCallbacks2 {
    public static volatile a i;
    public static volatile boolean j;
    public final com.amazon.aps.iva.oc.c b;
    public final h c;
    public final c d;
    public final com.amazon.aps.iva.oc.b e;
    public final com.bumptech.glide.manager.b f;
    public final com.amazon.aps.iva.ad.b g;
    public final ArrayList h = new ArrayList();

    /* compiled from: Glide.java */
    /* renamed from: com.bumptech.glide.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0942a {
    }

    public a(Context context, m mVar, h hVar, com.amazon.aps.iva.oc.c cVar, com.amazon.aps.iva.oc.b bVar, com.bumptech.glide.manager.b bVar2, com.amazon.aps.iva.ad.b bVar3, int i2, b.a aVar, com.amazon.aps.iva.x.a aVar2, List list, ArrayList arrayList, com.amazon.aps.iva.bd.a aVar3, d dVar) {
        com.amazon.aps.iva.ec.b bVar4 = com.amazon.aps.iva.ec.b.LOW;
        this.b = cVar;
        this.e = bVar;
        this.c = hVar;
        this.f = bVar2;
        this.g = bVar3;
        this.d = new c(context, bVar, new com.amazon.aps.iva.ec.e(this, arrayList, aVar3), new com.amazon.aps.iva.hb.e(5), aVar, aVar2, list, mVar, dVar, i2);
    }

    public static a a(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (i == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                Log.isLoggable("Glide", 5);
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
            } catch (InstantiationException e2) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e2);
            } catch (NoSuchMethodException e3) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e3);
            } catch (InvocationTargetException e4) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
            }
            synchronized (a.class) {
                if (i == null) {
                    if (!j) {
                        j = true;
                        c(context, generatedAppGlideModule);
                        j = false;
                    } else {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                }
            }
        }
        return i;
    }

    public static com.bumptech.glide.manager.b b(Context context) {
        if (context != null) {
            return a(context).f;
        }
        throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00da A[LOOP:3: B:42:0x00d4->B:44:0x00da, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0236  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(android.content.Context r26, com.bumptech.glide.GeneratedAppGlideModule r27) {
        /*
            Method dump skipped, instructions count: 715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.a.c(android.content.Context, com.bumptech.glide.GeneratedAppGlideModule):void");
    }

    public final void d(g gVar) {
        synchronized (this.h) {
            if (this.h.contains(gVar)) {
                this.h.remove(gVar);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        l.a();
        ((i) this.c).e(0L);
        this.b.b();
        this.e.b();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        long j2;
        l.a();
        synchronized (this.h) {
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                ((g) it.next()).getClass();
            }
        }
        com.amazon.aps.iva.pc.g gVar = (com.amazon.aps.iva.pc.g) this.c;
        gVar.getClass();
        if (i2 >= 40) {
            gVar.e(0L);
        } else if (i2 >= 20 || i2 == 15) {
            synchronized (gVar) {
                j2 = gVar.b;
            }
            gVar.e(j2 / 2);
        }
        this.b.a(i2);
        this.e.a(i2);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}

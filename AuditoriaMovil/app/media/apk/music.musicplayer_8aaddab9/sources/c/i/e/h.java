package c.i.e;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import c.i.e.k;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class h extends f {

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f2050g;

    /* renamed from: h  reason: collision with root package name */
    public final Constructor<?> f2051h;

    /* renamed from: i  reason: collision with root package name */
    public final Method f2052i;

    /* renamed from: j  reason: collision with root package name */
    public final Method f2053j;

    /* renamed from: k  reason: collision with root package name */
    public final Method f2054k;

    /* renamed from: l  reason: collision with root package name */
    public final Method f2055l;

    /* renamed from: m  reason: collision with root package name */
    public final Method f2056m;

    public h() {
        Method method;
        Method method2;
        Constructor<?> constructor;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            method3 = q(cls2);
            method4 = r(cls2);
            method5 = cls2.getMethod("freeze", new Class[0]);
            method2 = cls2.getMethod("abortCreation", new Class[0]);
            method = s(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            StringBuilder y = e.a.d.a.a.y("Unable to collect necessary methods for class ");
            y.append(e2.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", y.toString(), e2);
            method = null;
            method2 = null;
            constructor = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f2050g = cls;
        this.f2051h = constructor;
        this.f2052i = method3;
        this.f2053j = method4;
        this.f2054k = method5;
        this.f2055l = method2;
        this.f2056m = method;
    }

    private Object p() {
        try {
            return this.f2051h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // c.i.e.f, c.i.e.k
    public Typeface a(Context context, c.i.d.c.f fVar, Resources resources, int i2) {
        c.i.d.c.g[] gVarArr;
        if (o()) {
            Object p = p();
            if (p == null) {
                return null;
            }
            for (c.i.d.c.g gVar : fVar.a) {
                if (!l(context, p, gVar.a, gVar.f2011e, gVar.f2008b, gVar.f2009c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(gVar.f2010d))) {
                    k(p);
                    return null;
                }
            }
            if (n(p)) {
                return m(p);
            }
            return null;
        }
        return super.a(context, fVar, resources, i2);
    }

    @Override // c.i.e.f, c.i.e.k
    public Typeface b(Context context, CancellationSignal cancellationSignal, c.i.h.l[] lVarArr, int i2) {
        Typeface m2;
        boolean z;
        if (lVarArr.length < 1) {
            return null;
        }
        if (!o()) {
            c.i.h.l lVar = (c.i.h.l) k.e(lVarArr, i2, new k.a(this));
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(lVar.a, "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(lVar.f2095c).setItalic(lVar.f2096d).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (c.i.h.l lVar2 : lVarArr) {
            if (lVar2.f2097e == 0) {
                Uri uri = lVar2.a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, c.i.a.P(context, cancellationSignal, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object p = p();
        if (p == null) {
            return null;
        }
        boolean z2 = false;
        for (c.i.h.l lVar3 : lVarArr) {
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(lVar3.a);
            if (byteBuffer != null) {
                try {
                    z = ((Boolean) this.f2053j.invoke(p, byteBuffer, Integer.valueOf(lVar3.f2094b), null, Integer.valueOf(lVar3.f2095c), Integer.valueOf(lVar3.f2096d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    z = false;
                }
                if (!z) {
                    k(p);
                    return null;
                }
                z2 = true;
            }
        }
        if (!z2) {
            k(p);
            return null;
        } else if (n(p) && (m2 = m(p)) != null) {
            return Typeface.create(m2, i2);
        } else {
            return null;
        }
    }

    @Override // c.i.e.k
    public Typeface d(Context context, Resources resources, int i2, String str, int i3) {
        if (o()) {
            Object p = p();
            if (p == null) {
                return null;
            }
            if (!l(context, p, str, 0, -1, -1, null)) {
                k(p);
                return null;
            } else if (n(p)) {
                return m(p);
            } else {
                return null;
            }
        }
        return super.d(context, resources, i2, str, i3);
    }

    public final void k(Object obj) {
        try {
            this.f2055l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean l(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f2052i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface m(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f2050g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f2056m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean n(Object obj) {
        try {
            return ((Boolean) this.f2054k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean o() {
        if (this.f2052i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f2052i != null;
    }

    public Method q(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public Method r(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public Method s(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}

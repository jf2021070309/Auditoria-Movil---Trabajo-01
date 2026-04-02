package com.amazon.aps.iva.g3;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.amazon.aps.iva.f3.d;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: TypefaceCompatApi26Impl.java */
/* loaded from: classes.dex */
public class k extends j {
    public final Class<?> f;
    public final Constructor<?> g;
    public final Method h;
    public final Method i;
    public final Method j;
    public final Method k;
    public final Method l;

    public k() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = k(cls);
            method3 = l(cls);
            method4 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            method5 = m(cls);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f = cls;
        this.g = constructor;
        this.h = method2;
        this.i = method3;
        this.j = method4;
        this.k = method;
        this.l = method5;
    }

    public static Method k(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public static Method l(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    @Override // com.amazon.aps.iva.g3.j, com.amazon.aps.iva.g3.o
    public final Typeface a(Context context, d.c cVar, Resources resources, int i) {
        boolean z;
        Object obj;
        d.C0238d[] c0238dArr;
        if (this.h != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return super.a(context, cVar, resources, i);
        }
        try {
            obj = this.g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (d.C0238d c0238d : cVar.a) {
            if (!h(context, obj, c0238d.a, c0238d.e, c0238d.b, c0238d.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c0238d.d))) {
                try {
                    this.k.invoke(obj, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
                return null;
            }
        }
        if (!j(obj)) {
            return null;
        }
        return i(obj);
    }

    @Override // com.amazon.aps.iva.g3.o
    public final Typeface b(Context context, com.amazon.aps.iva.m3.l[] lVarArr, int i) {
        boolean z;
        Object obj;
        Typeface i2;
        boolean z2;
        if (lVarArr.length < 1) {
            return null;
        }
        if (this.h != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            com.amazon.aps.iva.m3.l e = e(i, lVarArr);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(e.a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(e.c).setItalic(e.d).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (com.amazon.aps.iva.m3.l lVar : lVarArr) {
            if (lVar.e == 0) {
                Uri uri = lVar.a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, p.e(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        try {
            obj = this.g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused2) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        int length = lVarArr.length;
        int i3 = 0;
        boolean z3 = false;
        while (true) {
            Method method = this.k;
            if (i3 < length) {
                com.amazon.aps.iva.m3.l lVar2 = lVarArr[i3];
                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(lVar2.a);
                if (byteBuffer != null) {
                    try {
                        z2 = ((Boolean) this.i.invoke(obj, byteBuffer, Integer.valueOf(lVar2.b), null, Integer.valueOf(lVar2.c), Integer.valueOf(lVar2.d ? 1 : 0))).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException unused3) {
                        z2 = false;
                    }
                    if (!z2) {
                        try {
                            method.invoke(obj, new Object[0]);
                            return null;
                        } catch (IllegalAccessException | InvocationTargetException unused4) {
                            return null;
                        }
                    }
                    z3 = true;
                }
                i3++;
                z3 = z3;
            } else if (!z3) {
                try {
                    method.invoke(obj, new Object[0]);
                    return null;
                } catch (IllegalAccessException | InvocationTargetException unused5) {
                    return null;
                }
            } else if (!j(obj) || (i2 = i(obj)) == null) {
                return null;
            } else {
                return Typeface.create(i2, i);
            }
        }
    }

    @Override // com.amazon.aps.iva.g3.o
    public final Typeface c(Context context, Resources resources, int i, String str, int i2) {
        boolean z;
        Object obj;
        if (this.h != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return super.c(context, resources, i, str, i2);
        }
        try {
            obj = this.g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        if (!h(context, obj, str, 0, -1, -1, null)) {
            try {
                this.k.invoke(obj, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
            return null;
        } else if (!j(obj)) {
            return null;
        } else {
            return i(obj);
        }
    }

    public final boolean h(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface i(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.l.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean j(Object obj) {
        try {
            return ((Boolean) this.j.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method m(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}

package c.i.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
/* loaded from: classes.dex */
public class g extends k {

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?> f2046b;

    /* renamed from: c  reason: collision with root package name */
    public static final Constructor<?> f2047c;

    /* renamed from: d  reason: collision with root package name */
    public static final Method f2048d;

    /* renamed from: e  reason: collision with root package name */
    public static final Method f2049e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            method = null;
            method2 = null;
        }
        f2047c = constructor;
        f2046b = cls;
        f2048d = method2;
        f2049e = method;
    }

    public static boolean h(Object obj, ByteBuffer byteBuffer, int i2, int i3, boolean z) {
        try {
            return ((Boolean) f2048d.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface i(Object obj) {
        try {
            Object newInstance = Array.newInstance(f2046b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f2049e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // c.i.e.k
    public Typeface a(Context context, c.i.d.c.f fVar, Resources resources, int i2) {
        Object obj;
        c.i.d.c.g[] gVarArr;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = f2047c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (c.i.d.c.g gVar : fVar.a) {
            int i3 = gVar.f2012f;
            File G = c.i.a.G(context);
            if (G != null) {
                try {
                    if (c.i.a.n(G, resources, i3)) {
                        try {
                            fileInputStream = new FileInputStream(G);
                        } catch (IOException unused2) {
                            mappedByteBuffer = null;
                        }
                        try {
                            FileChannel channel = fileInputStream.getChannel();
                            mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                            fileInputStream.close();
                            if (mappedByteBuffer != null || !h(obj, mappedByteBuffer, gVar.f2011e, gVar.f2008b, gVar.f2009c)) {
                                return null;
                            }
                        } finally {
                            break;
                        }
                    }
                } finally {
                    G.delete();
                }
            }
            mappedByteBuffer = null;
            if (mappedByteBuffer != null) {
                return null;
            }
        }
        return i(obj);
    }

    @Override // c.i.e.k
    public Typeface b(Context context, CancellationSignal cancellationSignal, c.i.h.l[] lVarArr, int i2) {
        Object obj;
        try {
            obj = f2047c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        c.f.h hVar = new c.f.h();
        for (c.i.h.l lVar : lVarArr) {
            Uri uri = lVar.a;
            ByteBuffer byteBuffer = (ByteBuffer) hVar.get(uri);
            if (byteBuffer == null) {
                byteBuffer = c.i.a.P(context, cancellationSignal, uri);
                hVar.put(uri, byteBuffer);
            }
            if (byteBuffer == null || !h(obj, byteBuffer, lVar.f2094b, lVar.f2095c, lVar.f2096d)) {
                return null;
            }
        }
        Typeface i3 = i(obj);
        if (i3 == null) {
            return null;
        }
        return Typeface.create(i3, i2);
    }
}

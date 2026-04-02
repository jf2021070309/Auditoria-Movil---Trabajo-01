package c.i.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import c.i.e.k;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class f extends k {

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f2041b;

    /* renamed from: c  reason: collision with root package name */
    public static Constructor<?> f2042c;

    /* renamed from: d  reason: collision with root package name */
    public static Method f2043d;

    /* renamed from: e  reason: collision with root package name */
    public static Method f2044e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f2045f;

    public static boolean h(Object obj, String str, int i2, boolean z) {
        j();
        try {
            return ((Boolean) f2043d.invoke(obj, str, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void j() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f2045f) {
            return;
        }
        f2045f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        f2042c = constructor;
        f2041b = cls;
        f2043d = method2;
        f2044e = method;
    }

    @Override // c.i.e.k
    public Typeface a(Context context, c.i.d.c.f fVar, Resources resources, int i2) {
        c.i.d.c.g[] gVarArr;
        j();
        try {
            Object newInstance = f2042c.newInstance(new Object[0]);
            for (c.i.d.c.g gVar : fVar.a) {
                File G = c.i.a.G(context);
                if (G == null) {
                    return null;
                }
                try {
                    if (!c.i.a.n(G, resources, gVar.f2012f)) {
                        return null;
                    }
                    if (!h(newInstance, G.getPath(), gVar.f2008b, gVar.f2009c)) {
                        return null;
                    }
                    G.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    G.delete();
                }
            }
            j();
            try {
                Object newInstance2 = Array.newInstance(f2041b, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f2044e.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // c.i.e.k
    public Typeface b(Context context, CancellationSignal cancellationSignal, c.i.h.l[] lVarArr, int i2) {
        if (lVarArr.length < 1) {
            return null;
        }
        c.i.h.l lVar = (c.i.h.l) k.e(lVarArr, i2, new k.a(this));
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(lVar.a, "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            File i3 = i(openFileDescriptor);
            if (i3 != null && i3.canRead()) {
                Typeface createFromFile = Typeface.createFromFile(i3);
                openFileDescriptor.close();
                return createFromFile;
            }
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            Typeface c2 = c(context, fileInputStream);
            fileInputStream.close();
            openFileDescriptor.close();
            return c2;
        } catch (IOException unused) {
            return null;
        }
    }

    public final File i(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
            return null;
        } catch (ErrnoException unused) {
            return null;
        }
    }
}

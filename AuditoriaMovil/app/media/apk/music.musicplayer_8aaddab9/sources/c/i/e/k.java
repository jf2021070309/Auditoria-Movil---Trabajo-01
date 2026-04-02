package c.i.e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class k {
    @SuppressLint({"BanConcurrentHashMap"})
    public ConcurrentHashMap<Long, c.i.d.c.f> a = new ConcurrentHashMap<>();

    /* loaded from: classes.dex */
    public class a implements b<c.i.h.l> {
        public a(k kVar) {
        }

        @Override // c.i.e.k.b
        public int a(c.i.h.l lVar) {
            return lVar.f2095c;
        }

        @Override // c.i.e.k.b
        public boolean b(c.i.h.l lVar) {
            return lVar.f2096d;
        }
    }

    /* loaded from: classes.dex */
    public interface b<T> {
        int a(T t);

        boolean b(T t);
    }

    public static <T> T e(T[] tArr, int i2, b<T> bVar) {
        int i3 = (i2 & 1) == 0 ? 400 : 700;
        boolean z = (i2 & 2) != 0;
        T t = null;
        int i4 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(bVar.a(t2) - i3) * 2) + (bVar.b(t2) == z ? 0 : 1);
            if (t == null || i4 > abs) {
                t = t2;
                i4 = abs;
            }
        }
        return t;
    }

    public static long g(Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0L;
        } catch (NoSuchFieldException e3) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e3);
            return 0L;
        }
    }

    public Typeface a(Context context, c.i.d.c.f fVar, Resources resources, int i2) {
        c.i.d.c.g gVar = (c.i.d.c.g) e(fVar.a, i2, new l(this));
        if (gVar == null) {
            return null;
        }
        Typeface b2 = e.b(context, resources, gVar.f2012f, gVar.a, i2);
        long g2 = g(b2);
        if (g2 != 0) {
            this.a.put(Long.valueOf(g2), fVar);
        }
        return b2;
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, c.i.h.l[] lVarArr, int i2) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (lVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(f(lVarArr, i2).a);
            try {
                Typeface c2 = c(context, inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return c2;
            } catch (IOException unused2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (IOException unused5) {
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public Typeface c(Context context, InputStream inputStream) {
        File G = c.i.a.G(context);
        if (G == null) {
            return null;
        }
        try {
            if (c.i.a.o(G, inputStream)) {
                return Typeface.createFromFile(G.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            G.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i2, String str, int i3) {
        File G = c.i.a.G(context);
        if (G == null) {
            return null;
        }
        try {
            if (c.i.a.n(G, resources, i2)) {
                return Typeface.createFromFile(G.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            G.delete();
        }
    }

    public c.i.h.l f(c.i.h.l[] lVarArr, int i2) {
        return (c.i.h.l) e(lVarArr, i2, new a(this));
    }
}

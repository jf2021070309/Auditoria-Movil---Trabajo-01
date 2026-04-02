package com.kwad.library.b.a;

import android.app.Activity;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.PathClassLoader;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public final class a extends PathClassLoader {
    private static final List<ClassLoader> afm = new CopyOnWriteArrayList();
    private final BaseDexClassLoader afl;

    public a(BaseDexClassLoader baseDexClassLoader) {
        super("", baseDexClassLoader);
        this.afl = baseDexClassLoader;
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    protected final Class<?> findClass(String str) {
        Class<?> loadClass;
        Class<?> loadClass2;
        Class<?> cls = null;
        try {
            loadClass2 = this.afl.loadClass(str);
        } catch (Throwable th) {
            th = th;
        }
        if (Activity.class.isAssignableFrom(loadClass2)) {
            return loadClass2;
        }
        th = null;
        cls = loadClass2;
        if (cls == null) {
            for (ClassLoader classLoader : afm) {
                try {
                    loadClass = classLoader.loadClass(str);
                } catch (Throwable th2) {
                }
                if (loadClass != null) {
                    return loadClass;
                }
            }
            if (th instanceof ClassNotFoundException) {
                throw th;
            }
            throw new ClassNotFoundException(str, th);
        }
        return cls;
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public final String findLibrary(String str) {
        return this.afl.findLibrary(str);
    }

    @Override // java.lang.ClassLoader
    public final URL getResource(String str) {
        return this.afl.getResource(str);
    }

    @Override // java.lang.ClassLoader
    public final InputStream getResourceAsStream(String str) {
        return this.afl.getResourceAsStream(str);
    }

    @Override // java.lang.ClassLoader
    public final Enumeration<URL> getResources(String str) {
        return this.afl.getResources(str);
    }

    @Override // java.lang.ClassLoader
    public final Class<?> loadClass(String str) {
        return findClass(str);
    }

    @Override // dalvik.system.BaseDexClassLoader
    public final String toString() {
        return this.afl.toString();
    }
}

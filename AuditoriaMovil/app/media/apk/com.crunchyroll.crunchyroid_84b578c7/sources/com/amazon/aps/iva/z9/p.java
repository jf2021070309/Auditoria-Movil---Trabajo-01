package com.amazon.aps.iva.z9;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import com.amazon.aps.iva.b8.g2;
import com.amazon.aps.iva.ef0.x;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
/* compiled from: LottieCompositionFactory.java */
/* loaded from: classes.dex */
public final class p {
    public static final HashMap a = new HashMap();
    public static final HashSet b = new HashSet();
    public static final byte[] c = {80, 75, 3, 4};

    public static j0<h> a(final String str, Callable<i0<h>> callable) {
        h hVar;
        if (str == null) {
            hVar = null;
        } else {
            hVar = com.amazon.aps.iva.fa.g.b.a.get(str);
        }
        if (hVar != null) {
            return new j0<>(new g2(hVar, 1), false);
        }
        HashMap hashMap = a;
        if (str != null && hashMap.containsKey(str)) {
            return (j0) hashMap.get(str);
        }
        j0<h> j0Var = new j0<>(callable, false);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            j0Var.b(new f0() { // from class: com.amazon.aps.iva.z9.k
                @Override // com.amazon.aps.iva.z9.f0
                public final void a(Object obj) {
                    h hVar2 = (h) obj;
                    HashMap hashMap2 = p.a;
                    hashMap2.remove(str);
                    atomicBoolean.set(true);
                    if (hashMap2.size() == 0) {
                        p.i(true);
                    }
                }
            });
            j0Var.a(new f0() { // from class: com.amazon.aps.iva.z9.l
                @Override // com.amazon.aps.iva.z9.f0
                public final void a(Object obj) {
                    Throwable th = (Throwable) obj;
                    HashMap hashMap2 = p.a;
                    hashMap2.remove(str);
                    atomicBoolean.set(true);
                    if (hashMap2.size() == 0) {
                        p.i(true);
                    }
                }
            });
            if (!atomicBoolean.get()) {
                hashMap.put(str, j0Var);
                if (hashMap.size() == 1) {
                    i(false);
                }
            }
        }
        return j0Var;
    }

    public static i0<h> b(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return c(context.getAssets().open(str), str2);
            }
            return g(context, new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new i0<>(e);
        }
    }

    public static i0<h> c(InputStream inputStream, String str) {
        try {
            com.amazon.aps.iva.ef0.x b2 = com.amazon.aps.iva.ef0.r.b(com.amazon.aps.iva.ef0.r.f(inputStream));
            String[] strArr = com.amazon.aps.iva.la.c.f;
            return d(new com.amazon.aps.iva.la.d(b2), str, true);
        } finally {
            com.amazon.aps.iva.ma.g.b(inputStream);
        }
    }

    public static i0 d(com.amazon.aps.iva.la.d dVar, String str, boolean z) {
        try {
            try {
                h a2 = com.amazon.aps.iva.ka.w.a(dVar);
                if (str != null) {
                    com.amazon.aps.iva.fa.g.b.a.put(str, a2);
                }
                i0 i0Var = new i0(a2);
                if (z) {
                    com.amazon.aps.iva.ma.g.b(dVar);
                }
                return i0Var;
            } catch (Exception e) {
                i0 i0Var2 = new i0(e);
                if (z) {
                    com.amazon.aps.iva.ma.g.b(dVar);
                }
                return i0Var2;
            }
        } catch (Throwable th) {
            if (z) {
                com.amazon.aps.iva.ma.g.b(dVar);
            }
            throw th;
        }
    }

    public static j0<h> e(Context context, final int i, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return a(str, new Callable() { // from class: com.amazon.aps.iva.z9.o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return p.f(context2, i, str);
            }
        });
    }

    public static i0<h> f(Context context, int i, String str) {
        Boolean bool;
        try {
            com.amazon.aps.iva.ef0.x b2 = com.amazon.aps.iva.ef0.r.b(com.amazon.aps.iva.ef0.r.f(context.getResources().openRawResource(i)));
            try {
                com.amazon.aps.iva.ef0.x peek = b2.peek();
                byte[] bArr = c;
                int length = bArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        if (peek.readByte() != bArr[i2]) {
                            bool = Boolean.FALSE;
                            break;
                        }
                        i2++;
                    } else {
                        peek.close();
                        bool = Boolean.TRUE;
                        break;
                    }
                }
            } catch (Exception unused) {
                com.amazon.aps.iva.ma.c.a.getClass();
                bool = Boolean.FALSE;
            } catch (NoSuchMethodError unused2) {
                bool = Boolean.FALSE;
            }
            if (bool.booleanValue()) {
                return g(context, new ZipInputStream(new x.a()), str);
            }
            return c(new x.a(), str);
        } catch (Resources.NotFoundException e) {
            return new i0<>(e);
        }
    }

    public static i0<h> g(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return h(context, zipInputStream, str);
        } finally {
            com.amazon.aps.iva.ma.g.b(zipInputStream);
        }
    }

    public static i0<h> h(Context context, ZipInputStream zipInputStream, String str) {
        e0 e0Var;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            h hVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    com.amazon.aps.iva.ef0.x b2 = com.amazon.aps.iva.ef0.r.b(com.amazon.aps.iva.ef0.r.f(zipInputStream));
                    String[] strArr = com.amazon.aps.iva.la.c.f;
                    hVar = (h) d(new com.amazon.aps.iva.la.d(b2), null, false).a;
                } else {
                    if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                        if (!name.contains(".ttf") && !name.contains(".otf")) {
                            zipInputStream.closeEntry();
                        }
                        String[] split = name.split("/");
                        String str2 = split[split.length - 1];
                        String str3 = str2.split("\\.")[0];
                        File file = new File(context.getCacheDir(), str2);
                        new FileOutputStream(file);
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int read = zipInputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, read);
                            }
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            Typeface createFromFile = Typeface.createFromFile(file);
                            if (!file.delete()) {
                                com.amazon.aps.iva.ma.c.b("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                            }
                            hashMap2.put(str3, createFromFile);
                        } finally {
                        }
                    }
                    String[] split2 = name.split("/");
                    hashMap.put(split2[split2.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (hVar == null) {
                return new i0<>(new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                String str4 = (String) entry.getKey();
                Iterator<e0> it = hVar.d.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        e0Var = it.next();
                        if (e0Var.c.equals(str4)) {
                            break;
                        }
                    } else {
                        e0Var = null;
                        break;
                    }
                }
                if (e0Var != null) {
                    e0Var.d = com.amazon.aps.iva.ma.g.e((Bitmap) entry.getValue(), e0Var.a, e0Var.b);
                }
            }
            for (Map.Entry entry2 : hashMap2.entrySet()) {
                boolean z = false;
                for (com.amazon.aps.iva.fa.c cVar : hVar.e.values()) {
                    if (cVar.a.equals(entry2.getKey())) {
                        cVar.d = (Typeface) entry2.getValue();
                        z = true;
                    }
                }
                if (!z) {
                    com.amazon.aps.iva.ma.c.b("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
                }
            }
            if (hashMap.isEmpty()) {
                for (Map.Entry<String, e0> entry3 : hVar.d.entrySet()) {
                    e0 value = entry3.getValue();
                    if (value == null) {
                        return null;
                    }
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    String str5 = value.c;
                    if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                        try {
                            byte[] decode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                            value.d = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                        } catch (IllegalArgumentException e) {
                            com.amazon.aps.iva.ma.c.c("data URL did not have correct base64 format.", e);
                            return null;
                        }
                    }
                }
            }
            for (Map.Entry<String, e0> entry4 : hVar.d.entrySet()) {
                if (entry4.getValue().d == null) {
                    return new i0<>(new IllegalStateException("There is no image for " + entry4.getValue().c));
                }
            }
            if (str != null) {
                com.amazon.aps.iva.fa.g.b.a.put(str, hVar);
            }
            return new i0<>(hVar);
        } catch (IOException e2) {
            return new i0<>(e2);
        }
    }

    public static void i(boolean z) {
        ArrayList arrayList = new ArrayList(b);
        for (int i = 0; i < arrayList.size(); i++) {
            ((k0) arrayList.get(i)).a();
        }
    }

    public static String j(int i, Context context) {
        boolean z;
        String str;
        StringBuilder sb = new StringBuilder("rawRes");
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = "_night_";
        } else {
            str = "_day_";
        }
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }
}

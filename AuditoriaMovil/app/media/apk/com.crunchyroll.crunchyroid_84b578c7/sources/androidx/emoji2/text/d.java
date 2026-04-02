package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.inputmethod.EditorInfo;
import androidx.emoji2.text.EmojiCompatInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: EmojiCompat.java */
/* loaded from: classes.dex */
public final class d {
    public static final Object j = new Object();
    public static volatile d k;
    public final ReentrantReadWriteLock a;
    public final com.amazon.aps.iva.x.b b;
    public volatile int c;
    public final Handler d;
    public final a e;
    public final h f;
    public final C0028d g;
    public final int h;
    public final androidx.emoji2.text.b i;

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static final class a extends b {
        public volatile androidx.emoji2.text.f b;
        public volatile androidx.emoji2.text.h c;
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        public final d a;

        public b(d dVar) {
            this.a = dVar;
        }
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static abstract class c {
        public final h a;
        public int b = 0;
        public final androidx.emoji2.text.b c = new androidx.emoji2.text.b();

        public c(h hVar) {
            this.a = hVar;
        }
    }

    /* compiled from: EmojiCompat.java */
    /* renamed from: androidx.emoji2.text.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0028d implements j {
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public interface e {
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static class g implements Runnable {
        public final ArrayList b;
        public final int c;

        public g(List list, int i, Throwable th) {
            if (list != null) {
                this.b = new ArrayList(list);
                this.c = i;
                return;
            }
            throw new NullPointerException("initCallbacks cannot be null");
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            int i = 0;
            if (this.c != 1) {
                while (i < size) {
                    ((f) arrayList.get(i)).a();
                    i++;
                }
                return;
            }
            while (i < size) {
                ((f) arrayList.get(i)).b();
                i++;
            }
        }
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public interface h {
        void a(i iVar);
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static abstract class i {
        public abstract void a(Throwable th);

        public abstract void b(androidx.emoji2.text.h hVar);
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public interface j {
    }

    public d(EmojiCompatInitializer.a aVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        h hVar = aVar.a;
        this.f = hVar;
        int i2 = aVar.b;
        this.h = i2;
        this.i = aVar.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new com.amazon.aps.iva.x.b();
        this.g = new C0028d();
        a aVar2 = new a(this);
        this.e = aVar2;
        reentrantReadWriteLock.writeLock().lock();
        if (i2 == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                hVar.a(new androidx.emoji2.text.c(aVar2));
            } catch (Throwable th2) {
                e(th2);
            }
        }
    }

    public static d a() {
        d dVar;
        boolean z;
        synchronized (j) {
            dVar = k;
            if (dVar != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
            }
        }
        return dVar;
    }

    public static boolean c() {
        if (k != null) {
            return true;
        }
        return false;
    }

    public final int b() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void d() {
        boolean z;
        boolean z2 = true;
        if (this.h == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (b() != 1) {
                z2 = false;
            }
            if (z2) {
                return;
            }
            this.a.writeLock().lock();
            try {
                if (this.c == 0) {
                    return;
                }
                this.c = 0;
                this.a.writeLock().unlock();
                a aVar = this.e;
                d dVar = aVar.a;
                try {
                    dVar.f.a(new androidx.emoji2.text.c(aVar));
                    return;
                } catch (Throwable th) {
                    dVar.e(th);
                    return;
                }
            } finally {
                this.a.writeLock().unlock();
            }
        }
        throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
    }

    public final void e(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new g(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public final void f() {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 1;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new g(arrayList, this.c, null));
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x008e A[Catch: all -> 0x00dd, TryCatch #0 {all -> 0x00dd, blocks: (B:32:0x005a, B:35:0x005f, B:37:0x0063, B:39:0x0070, B:42:0x0080, B:44:0x0088, B:46:0x008b, B:48:0x008e, B:50:0x009a, B:51:0x009d, B:54:0x00ac, B:57:0x00b3, B:59:0x00c6, B:40:0x0076), top: B:79:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c6 A[Catch: all -> 0x00dd, TRY_LEAVE, TryCatch #0 {all -> 0x00dd, blocks: (B:32:0x005a, B:35:0x005f, B:37:0x0063, B:39:0x0070, B:42:0x0080, B:44:0x0088, B:46:0x008b, B:48:0x008e, B:50:0x009a, B:51:0x009d, B:54:0x00ac, B:57:0x00b3, B:59:0x00c6, B:40:0x0076), top: B:79:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence g(int r11, int r12, java.lang.CharSequence r13) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.d.g(int, int, java.lang.CharSequence):java.lang.CharSequence");
    }

    public final CharSequence h(CharSequence charSequence) {
        int length;
        if (charSequence == null) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        return g(0, length, charSequence);
    }

    public final void i(f fVar) {
        if (fVar != null) {
            this.a.writeLock().lock();
            try {
                if (this.c != 1 && this.c != 2) {
                    this.b.add(fVar);
                    return;
                }
                this.d.post(new g(Arrays.asList(fVar), this.c, null));
                return;
            } finally {
                this.a.writeLock().unlock();
            }
        }
        throw new NullPointerException("initCallback cannot be null");
    }

    public final void j(EditorInfo editorInfo) {
        int i2;
        boolean z = true;
        if (b() != 1) {
            z = false;
        }
        if (z && editorInfo != null) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            a aVar = this.e;
            aVar.getClass();
            Bundle bundle = editorInfo.extras;
            com.amazon.aps.iva.j4.b bVar = aVar.c.a;
            int a2 = bVar.a(4);
            if (a2 != 0) {
                i2 = bVar.b.getInt(a2 + bVar.a);
            } else {
                i2 = 0;
            }
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i2);
            Bundle bundle2 = editorInfo.extras;
            aVar.a.getClass();
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static abstract class f {
        public void a() {
        }

        public void b() {
        }
    }
}

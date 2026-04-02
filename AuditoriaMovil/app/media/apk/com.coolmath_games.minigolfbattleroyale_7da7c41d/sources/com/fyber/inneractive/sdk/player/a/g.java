package com.fyber.inneractive.sdk.player.a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.a.a.f;
import com.fyber.inneractive.sdk.config.a.s;
import com.fyber.inneractive.sdk.h.o;
import com.fyber.inneractive.sdk.player.a.b;
import com.fyber.inneractive.sdk.player.a.c;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.ag;
import com.fyber.inneractive.sdk.util.ah;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.UByte;
/* loaded from: classes.dex */
public final class g implements ah {
    com.fyber.inneractive.sdk.player.a.c b;
    c.d c;
    com.fyber.inneractive.sdk.player.a.b d;
    final String e;
    com.fyber.inneractive.sdk.player.a.a f;
    e g;
    b h;
    Handler i;
    String k;
    public d o;
    final s p;
    String a = "MediaDownloader-" + hashCode();
    final Object j = new Object();
    private volatile boolean r = false;
    boolean l = false;
    boolean m = false;
    boolean n = false;
    private String s = null;
    private HandlerThread q = new HandlerThread(String.format("MediaDownloader-%s-A", d()));

    /* loaded from: classes.dex */
    public interface d {
        void a(File file);

        boolean b(File file);
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(com.fyber.inneractive.sdk.player.a.a aVar, Exception exc);
    }

    private g(com.fyber.inneractive.sdk.player.a.c cVar, String str, com.fyber.inneractive.sdk.player.a.b bVar, int i, s sVar) {
        this.b = cVar;
        this.e = str;
        this.k = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(this.e).toLowerCase(Locale.US));
        this.d = bVar;
        this.p = sVar;
        this.h = new b(String.format("MediaDownloader-%s-A", d()), i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g a(com.fyber.inneractive.sdk.player.a.c cVar, String str, int i, s sVar, e eVar) {
        com.fyber.inneractive.sdk.player.a.b iVar;
        int i2 = 0;
        boolean a2 = IAConfigManager.c().a.a("validateHasVideoTracks", false);
        com.fyber.inneractive.sdk.config.a.a.f fVar = sVar == null ? null : (com.fyber.inneractive.sdk.config.a.a.f) sVar.a(com.fyber.inneractive.sdk.config.a.a.f.class);
        if (fVar != null) {
            int[] iArr = AnonymousClass6.a;
            f.b bVar = f.b.LEGACY;
            String a3 = fVar.a("v_type", f.b.LEGACY.d);
            f.b[] values = f.b.values();
            int length = values.length;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                f.b bVar2 = values[i2];
                if (TextUtils.equals(bVar2.d, a3.toLowerCase(Locale.US))) {
                    bVar = bVar2;
                    break;
                }
                i2++;
            }
            int i3 = iArr[bVar.ordinal()];
            if (i3 == 1) {
                iVar = new j();
            } else if (i3 == 2) {
                iVar = new h();
            } else {
                iVar = new i(a2);
            }
        } else {
            iVar = new i(a2);
        }
        g gVar = new g(cVar, str, iVar, i, sVar);
        gVar.g = eVar;
        return gVar;
    }

    /* renamed from: com.fyber.inneractive.sdk.player.a.g$6  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[f.b.values().length];
            a = iArr;
            try {
                iArr[f.b.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[f.b.EXTRACTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[f.b.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public final void a() {
        this.n = true;
        HandlerThread handlerThread = this.q;
        if (handlerThread != null) {
            handlerThread.start();
            ag agVar = new ag(this.q.getLooper(), this);
            this.i = agVar;
            agVar.post(new Runnable() { // from class: com.fyber.inneractive.sdk.player.a.g.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        g.this.c = g.this.b.a(g.this.d());
                        if (g.this.c == null) {
                            c.a c2 = g.this.b.c(g.this.d());
                            if (c2 == null) {
                                g.this.l = true;
                            }
                            if (c2 != null) {
                                IAlog.a("%s | start | got an editor for %s", g.this.a, g.this.d());
                                c2.b();
                            }
                        }
                    } catch (IOException e2) {
                        IAlog.a(String.format("%s | Exception raised starting a new caching process for %s", g.this.a, g.this.d()), e2, new Object[0]);
                        o.a("Exception raised starting a new caching process", e2.getMessage(), null, null);
                    }
                    if (g.this.c != null || g.this.l) {
                        g.a(g.this, true);
                    } else if (g.this.h != null) {
                        g.this.h.start();
                    }
                }
            });
        }
    }

    final void b() {
        com.fyber.inneractive.sdk.util.m.a().post(new Runnable() { // from class: com.fyber.inneractive.sdk.player.a.g.3
            @Override // java.lang.Runnable
            public final void run() {
                if (g.this.g != null) {
                    g.this.g.a(g.this.f, null);
                }
            }
        });
    }

    private void a(final Exception exc) {
        com.fyber.inneractive.sdk.util.m.a().post(new Runnable() { // from class: com.fyber.inneractive.sdk.player.a.g.4
            @Override // java.lang.Runnable
            public final void run() {
                if (g.this.g != null) {
                    g.this.g.a(g.this.f, exc);
                }
            }
        });
    }

    final void a(boolean z) {
        b bVar = this.h;
        if (bVar != null) {
            bVar.a.compareAndSet(false, true);
            this.h = null;
        }
        HandlerThread handlerThread = this.q;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        this.i = null;
        if (z) {
            try {
                this.b.d(d());
            } catch (IOException e2) {
                IAlog.a("failed to remove cache key", e2, new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends Thread {
        AtomicBoolean a;
        private InputStream c;
        private boolean d;
        private boolean e;
        private long f;
        private long g;
        private c.a h;
        private int i;
        private int j;
        private int k;
        private int l;

        b(String str, int i) {
            super(str);
            this.a = new AtomicBoolean(false);
            this.d = false;
            this.e = false;
            this.f = -1L;
            this.g = 0L;
            this.i = i;
            this.j = g.this.p != null ? ((com.fyber.inneractive.sdk.config.a.a.f) g.this.p.a(com.fyber.inneractive.sdk.config.a.a.f.class)).a("dl_retries", 10) : 10;
            this.k = g.this.p != null ? ((com.fyber.inneractive.sdk.config.a.a.f) g.this.p.a(com.fyber.inneractive.sdk.config.a.a.f.class)).a("dl_retry_delay", 500) : 500;
            this.l = g.this.p != null ? ((com.fyber.inneractive.sdk.config.a.a.f) g.this.p.a(com.fyber.inneractive.sdk.config.a.a.f.class)).a("second_checkpoint", 25) : 25;
        }

        /* JADX WARN: Code restructure failed: missing block: B:78:0x020f, code lost:
            if (r15 == null) goto L68;
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 547
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.a.g.b.run():void");
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x013b  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x01f6 A[EDGE_INSN: B:81:0x01f6->B:77:0x01f6 ?: BREAK  , SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private java.net.HttpURLConnection a(java.io.OutputStream r18, java.net.URL r19, java.nio.ByteBuffer r20, long r21, int r23) throws java.io.IOException, com.fyber.inneractive.sdk.player.a.g.a {
            /*
                Method dump skipped, instructions count: 540
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.a.g.b.a(java.io.OutputStream, java.net.URL, java.nio.ByteBuffer, long, int):java.net.HttpURLConnection");
        }
    }

    public final String d() {
        if (this.s == null) {
            this.s = a(this.e);
        }
        return this.s;
    }

    private static String a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b2 : digest) {
                stringBuffer.append(Integer.toHexString((b2 & UByte.MAX_VALUE) | 256).substring(1));
            }
            return stringBuffer.toString();
        } catch (NullPointerException unused) {
            return "";
        } catch (NoSuchAlgorithmException unused2) {
            return b(str);
        }
    }

    private static String b(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b2 : digest) {
                stringBuffer.append(Integer.toHexString((b2 & UByte.MAX_VALUE) | 256).substring(1));
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException unused) {
            return str.replaceAll("\\W+", "");
        }
    }

    @Override // com.fyber.inneractive.sdk.util.ah
    public final void a(Message message) {
        if (message.what == 4 && !this.f.h) {
            synchronized (this.j) {
                IAlog.a("%s | reading from cache 1 - %s", this.a, d());
                int a2 = this.d.a(this.f);
                if (a2 == b.a.c) {
                    a(new a("Failed cache validation"));
                    a(true);
                } else if (a2 == b.a.b) {
                    this.r = true;
                } else {
                    this.f.h = true;
                    a(this.f);
                    this.f.a(this.d.a());
                    b();
                }
            }
        } else if (message.what == 1) {
            if (message.obj instanceof Exception) {
                a((Exception) message.obj);
            } else {
                a(new a("download failed"));
            }
            a(false);
        } else if (message.what == 2) {
            if (this.r) {
                synchronized (this.j) {
                    IAlog.a("%s | reading from cache 2 - %s", this.a, d());
                    if (this.d.a(this.f) == b.a.c) {
                        a(new a("Failed cache validation after downloading complete file"));
                        a(true);
                    } else {
                        a(this.f);
                        this.f.a(this.d.a());
                        b();
                    }
                }
            } else {
                com.fyber.inneractive.sdk.util.m.a().post(new Runnable() { // from class: com.fyber.inneractive.sdk.player.a.g.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.this.a(false);
                    }
                });
            }
            IAlog.a("%s | Download success for cache key %s", this.a, d());
        }
    }

    final void a(com.fyber.inneractive.sdk.player.a.a aVar) {
        d dVar;
        if (aVar == null || (dVar = this.o) == null || dVar.b(aVar.a())) {
            return;
        }
        this.o.a(aVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a extends Exception {
        public a() {
        }

        public a(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends a {
        public c() {
        }

        public c(String str) {
            super(str);
        }
    }

    public final void c() {
        a(this.n);
    }

    static /* synthetic */ void a(g gVar, boolean z) {
        Runnable runnable = new Runnable() { // from class: com.fyber.inneractive.sdk.player.a.g.2
            /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 228
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.a.g.AnonymousClass2.run():void");
            }
        };
        Handler handler = gVar.i;
        if (handler != null) {
            if (z) {
                handler.postAtFrontOfQueue(runnable);
            } else {
                handler.postDelayed(runnable, 4L);
            }
        }
    }
}

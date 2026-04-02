package com.ironsource.sdk.k;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import androidx.core.view.PointerIconCompat;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.Callable;
/* loaded from: classes2.dex */
public final class b {
    private static b c;
    public com.ironsource.sdk.k.a a = new com.ironsource.sdk.k.a();
    public final String b;
    private Thread d;

    /* loaded from: classes2.dex */
    static class a implements Callable<C0095b> {
        private String a;
        private String b;
        private String c;
        private long d;
        private String e;

        a(String str, String str2, String str3, long j, String str4) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = j;
            this.e = str4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:129:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:131:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x007b A[Catch: all -> 0x0077, TRY_LEAVE, TryCatch #15 {all -> 0x0077, blocks: (B:17:0x0073, B:21:0x007b), top: B:131:0x0073 }] */
        /* JADX WARN: Removed duplicated region for block: B:69:0x00f9 A[Catch: all -> 0x00f5, TRY_LEAVE, TryCatch #14 {all -> 0x00f5, blocks: (B:65:0x00f1, B:69:0x00f9), top: B:129:0x00f1 }] */
        /* JADX WARN: Type inference failed for: r3v0, types: [java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r3v3, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r3v5 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private com.ironsource.sdk.k.b.C0095b a(java.lang.String r9, int r10) {
            /*
                Method dump skipped, instructions count: 355
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.k.b.a.a(java.lang.String, int):com.ironsource.sdk.k.b$b");
        }

        private static byte[] a(InputStream inputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr, 0, 8192);
                if (read == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public final C0095b call() {
            int i;
            int i2;
            if (this.d == 0) {
                this.d = 1L;
            }
            C0095b c0095b = null;
            for (int i3 = 0; i3 < this.d && ((i2 = (c0095b = a(this.a, i3)).b) == 1008 || i2 == 1009); i3++) {
            }
            if (c0095b != null && c0095b.c != null) {
                String str = this.b + File.separator + this.c;
                String str2 = this.e + File.separator + "tmp_" + this.c;
                try {
                    if (IronSourceStorageUtils.saveFile(c0095b.c, str2) == 0) {
                        c0095b.b = 1006;
                    } else if (!IronSourceStorageUtils.renameFile(str2, str)) {
                        c0095b.b = 1020;
                    }
                } catch (FileNotFoundException unused) {
                    i = PointerIconCompat.TYPE_ZOOM_IN;
                    c0095b.b = i;
                } catch (Error e) {
                    if (!TextUtils.isEmpty(e.getMessage())) {
                        Logger.i("DownloadManager", e.getMessage());
                    }
                    i = PointerIconCompat.TYPE_ZOOM_OUT;
                    c0095b.b = i;
                } catch (Exception e2) {
                    if (!TextUtils.isEmpty(e2.getMessage())) {
                        Logger.i("DownloadManager", e2.getMessage());
                    }
                    c0095b.b = PointerIconCompat.TYPE_VERTICAL_TEXT;
                }
            }
            return c0095b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.sdk.k.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0095b {
        public String a;
        int b;
        byte[] c;

        C0095b() {
        }
    }

    /* loaded from: classes2.dex */
    static class c implements Runnable {
        private final String b;
        private Handler c;
        private String d;
        private String e;
        private String f;
        private final long a = 3;
        private long g = 3;

        c(com.ironsource.sdk.h.c cVar, String str, Handler handler, String str2) {
            this.d = str;
            this.e = cVar.getParent();
            this.f = cVar.getName();
            this.c = handler;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i;
            com.ironsource.sdk.h.c cVar = new com.ironsource.sdk.h.c(this.e, this.f);
            Message message = new Message();
            message.obj = cVar;
            String makeDir = IronSourceStorageUtils.makeDir(cVar.getParent());
            if (makeDir == null) {
                i = 1020;
            } else {
                C0095b call = new a(this.d, makeDir, cVar.getName(), this.g, this.b).call();
                i = call.b == 200 ? PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW : call.b;
            }
            message.what = i;
            this.c.sendMessage(message);
        }
    }

    private b(String str) {
        this.b = str;
        IronSourceStorageUtils.deleteFolder(c());
        IronSourceStorageUtils.makeDir(c());
    }

    public static synchronized b a(String str) {
        b bVar;
        synchronized (b.class) {
            if (c == null) {
                c = new b(str);
            }
            bVar = c;
        }
        return bVar;
    }

    private String c() {
        return IronSourceStorageUtils.buildAbsolutePathToDirInCache(this.b, "temp");
    }

    public final synchronized void a() {
        c = null;
        if (this.a != null) {
            this.a.a = null;
            this.a = null;
        }
    }

    public final void a(com.ironsource.sdk.h.c cVar, String str) {
        Thread thread = new Thread(new c(cVar, str, this.a, c()));
        this.d = thread;
        thread.start();
    }

    public final void a(com.ironsource.sdk.h.c cVar, String str, Handler handler) {
        new Thread(new c(cVar, str, handler, c())).start();
    }

    public final boolean b() {
        Thread thread = this.d;
        return thread != null && thread.isAlive();
    }
}

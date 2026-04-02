package com.kwad.sdk.a.a;

import android.content.Context;
import com.kwad.sdk.KsAdSDKImpl;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.ak;
import com.kwad.sdk.utils.av;
import com.kwad.sdk.utils.aw;
import com.kwad.sdk.utils.g;
import com.kwad.sdk.utils.q;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.Stack;
/* loaded from: classes.dex */
public class b {
    private static volatile b ahH;
    private Stack<AdTemplate> ahF = new Stack<>();
    private File ahG;
    private boolean mHasInit;

    /* loaded from: classes.dex */
    public interface a {
        void gD();

        void xX();
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void ag(AdTemplate adTemplate) {
        ObjectOutputStream objectOutputStream;
        Throwable th;
        Exception e;
        boolean z = false;
        Iterator<AdTemplate> it = this.ahF.iterator();
        while (it.hasNext()) {
            if (com.kwad.sdk.core.response.b.d.cu(it.next()) == com.kwad.sdk.core.response.b.d.cu(adTemplate)) {
                it.remove();
                z = true;
            }
        }
        if (!z) {
            return;
        }
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(this.ahG));
            try {
                try {
                    objectOutputStream.writeObject(this.ahF);
                    com.kwad.sdk.crash.utils.b.closeQuietly(objectOutputStream);
                } catch (Exception e2) {
                    e = e2;
                    com.kwad.sdk.core.e.c.d("InstallTipsDataManager", " removeApkDownloadedData e" + e);
                    com.kwad.sdk.crash.utils.b.closeQuietly(objectOutputStream);
                }
            } catch (Throwable th2) {
                th = th2;
                com.kwad.sdk.crash.utils.b.closeQuietly(objectOutputStream);
                throw th;
            }
        } catch (Exception e3) {
            objectOutputStream = null;
            e = e3;
        } catch (Throwable th3) {
            objectOutputStream = null;
            th = th3;
            com.kwad.sdk.crash.utils.b.closeQuietly(objectOutputStream);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void ah(AdTemplate adTemplate) {
        ObjectOutputStream objectOutputStream;
        Throwable th;
        Exception e;
        this.ahF.add(adTemplate);
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(xU()));
            try {
                try {
                    objectOutputStream.writeObject(this.ahF);
                    com.kwad.sdk.crash.utils.b.closeQuietly(objectOutputStream);
                } catch (Exception e2) {
                    e = e2;
                    com.kwad.sdk.core.e.c.printStackTrace(e);
                    com.kwad.sdk.crash.utils.b.closeQuietly(objectOutputStream);
                }
            } catch (Throwable th2) {
                th = th2;
                com.kwad.sdk.crash.utils.b.closeQuietly(objectOutputStream);
                throw th;
            }
        } catch (Exception e3) {
            objectOutputStream = null;
            e = e3;
        } catch (Throwable th3) {
            objectOutputStream = null;
            th = th3;
            com.kwad.sdk.crash.utils.b.closeQuietly(objectOutputStream);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static File ak(AdTemplate adTemplate) {
        File file = new File(com.kwad.sdk.core.download.a.B(com.kwad.sdk.core.response.b.d.ck(adTemplate)));
        if (q.L(file)) {
            return file;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized File xU() {
        File file = this.ahG;
        if (file != null) {
            return file;
        }
        Context context = KsAdSDKImpl.get().getContext();
        if (context == null) {
            return null;
        }
        String cP = av.cP(context);
        File file2 = new File(cP);
        if (!file2.exists()) {
            file2.mkdir();
        }
        File file3 = new File(cP + File.separator + "uninstall_ad");
        this.ahG = file3;
        if (!file3.exists()) {
            try {
                this.ahG.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return this.ahG;
    }

    public static b xV() {
        if (ahH == null) {
            synchronized (b.class) {
                if (ahH == null) {
                    ahH = new b();
                }
            }
        }
        return ahH;
    }

    public final synchronized void a(final a aVar) {
        if (this.mHasInit) {
            return;
        }
        this.mHasInit = true;
        g.execute(new aw() { // from class: com.kwad.sdk.a.a.b.1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:66:0x0115 A[Catch: all -> 0x0123, TryCatch #0 {all -> 0x0123, blocks: (B:3:0x0002, B:6:0x0009, B:9:0x0010, B:34:0x00b4, B:49:0x00f0, B:64:0x0111, B:66:0x0115, B:68:0x0119, B:69:0x011c, B:61:0x010a, B:63:0x010e, B:45:0x00d9, B:72:0x011f, B:73:0x0122), top: B:77:0x0002 }] */
            /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
            @Override // com.kwad.sdk.utils.aw
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void doTask() {
                /*
                    Method dump skipped, instructions count: 296
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.kwad.sdk.a.a.b.AnonymousClass1.doTask():void");
            }
        });
    }

    public final void ai(final AdTemplate adTemplate) {
        if (adTemplate == null) {
            return;
        }
        g.execute(new Runnable() { // from class: com.kwad.sdk.a.a.b.2
            @Override // java.lang.Runnable
            public final void run() {
                b.this.ah(adTemplate);
            }
        });
    }

    public final void aj(final AdTemplate adTemplate) {
        if (adTemplate == null) {
            return;
        }
        g.execute(new Runnable() { // from class: com.kwad.sdk.a.a.b.3
            @Override // java.lang.Runnable
            public final void run() {
                b.this.ag(adTemplate);
            }
        });
    }

    public final synchronized AdTemplate xW() {
        AdTemplate adTemplate;
        adTemplate = null;
        Stack stack = (Stack) this.ahF.clone();
        while (true) {
            if (stack.isEmpty()) {
                break;
            }
            AdTemplate adTemplate2 = (AdTemplate) stack.pop();
            if (adTemplate2 != null) {
                String str = com.kwad.sdk.core.response.b.d.ck(adTemplate2).adBaseInfo.appPackageName;
                Context context = KsAdSDKImpl.get().getContext();
                File ak = ak(adTemplate2);
                if (ak != null && ak.exists() && ak.lastModified() + 604800000 > System.currentTimeMillis() && !ak.ak(context, str)) {
                    adTemplate = adTemplate2;
                    break;
                }
            }
        }
        return adTemplate;
    }
}

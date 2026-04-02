package com.kwad.sdk.core.diskcache.b;

import com.kwad.sdk.core.diskcache.a.a;
import com.kwad.sdk.core.network.a.a;
import com.kwad.sdk.utils.g;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
/* loaded from: classes.dex */
public final class b {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static File a(com.kwad.sdk.core.diskcache.a.a aVar, String str) {
        try {
            a.c cz = aVar.cz(str);
            if (cz != null) {
                return cz.bW(0);
            }
            return null;
        } catch (IOException e) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(final com.kwad.sdk.core.diskcache.a.a aVar, final String str, final String str2) {
        g.execute(new Runnable() { // from class: com.kwad.sdk.core.diskcache.b.b.1
            @Override // java.lang.Runnable
            public final void run() {
                OutputStream outputStream = null;
                try {
                    a.C0249a cA = com.kwad.sdk.core.diskcache.a.a.this.cA(str2);
                    if (cA != null) {
                        outputStream = cA.bT(0);
                        if (b.a(str, outputStream, new a.C0256a())) {
                            cA.commit();
                        } else {
                            cA.abort();
                        }
                        com.kwad.sdk.core.diskcache.a.a.this.flush();
                    }
                } catch (IOException e) {
                } finally {
                    com.kwad.sdk.crash.utils.b.closeQuietly(outputStream);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(com.kwad.sdk.core.diskcache.a.a aVar, String str, String str2, a.C0256a c0256a) {
        boolean z = false;
        OutputStream outputStream = null;
        try {
            try {
                a.C0249a cA = aVar.cA(str2);
                if (cA != null) {
                    outputStream = cA.bT(0);
                    if (a(str, outputStream, c0256a)) {
                        cA.commit();
                        z = true;
                    } else {
                        cA.abort();
                    }
                    aVar.flush();
                }
            } catch (IOException e) {
                c0256a.msg = e.getMessage();
            }
            return z;
        } finally {
            com.kwad.sdk.crash.utils.b.closeQuietly(outputStream);
        }
    }

    public static boolean a(String str, OutputStream outputStream, a.C0256a c0256a) {
        return com.kwad.sdk.core.network.a.a.a(str, outputStream, c0256a, -1);
    }
}

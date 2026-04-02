package com.amazon.aps.iva.i9;

import android.content.Context;
import android.content.res.Resources;
import android.webkit.WebResourceResponse;
import com.amazon.aps.iva.j9.u;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPInputStream;
/* compiled from: WebViewAssetLoader.java */
/* loaded from: classes.dex */
public final class f {
    public final List<d> a;

    /* compiled from: WebViewAssetLoader.java */
    /* loaded from: classes.dex */
    public static final class a implements c {
        public final u a;

        public a(Context context) {
            this.a = new u(context);
        }

        @Override // com.amazon.aps.iva.i9.f.c
        public final WebResourceResponse a(String str) {
            String str2;
            try {
                u uVar = this.a;
                uVar.getClass();
                if (str.length() > 1 && str.charAt(0) == '/') {
                    str2 = str.substring(1);
                } else {
                    str2 = str;
                }
                InputStream open = uVar.a.getAssets().open(str2, 2);
                if (str2.endsWith(".svgz")) {
                    open = new GZIPInputStream(open);
                }
                return new WebResourceResponse(u.b(str), null, open);
            } catch (IOException unused) {
                return new WebResourceResponse(null, null, null);
            }
        }
    }

    /* compiled from: WebViewAssetLoader.java */
    /* loaded from: classes.dex */
    public static final class b implements c {
        public static final String[] b = {"app_webview/", "databases/", "lib/", "shared_prefs/", "code_cache/"};
        public final File a;

        public b(Context context, File file) {
            try {
                this.a = new File(u.a(file));
                if (b(context)) {
                    return;
                }
                throw new IllegalArgumentException("The given directory \"" + file + "\" doesn't exist under an allowed app internal storage directory");
            } catch (IOException e) {
                throw new IllegalArgumentException("Failed to resolve the canonical path for the given directory: " + file.getPath(), e);
            }
        }

        @Override // com.amazon.aps.iva.i9.f.c
        public final WebResourceResponse a(String str) {
            File file;
            File file2 = this.a;
            try {
                String a = u.a(file2);
                String canonicalPath = new File(file2, str).getCanonicalPath();
                if (canonicalPath.startsWith(a)) {
                    file = new File(canonicalPath);
                } else {
                    file = null;
                }
            } catch (IOException unused) {
            }
            if (file != null) {
                InputStream fileInputStream = new FileInputStream(file);
                if (file.getPath().endsWith(".svgz")) {
                    fileInputStream = new GZIPInputStream(fileInputStream);
                }
                return new WebResourceResponse(u.b(str), null, fileInputStream);
            }
            String.format("The requested file: %s is outside the mounted directory: %s", str, file2);
            return new WebResourceResponse(null, null, null);
        }

        public final boolean b(Context context) throws IOException {
            String a = u.a(this.a);
            String a2 = u.a(context.getCacheDir());
            String a3 = u.a(com.amazon.aps.iva.j9.d.e(context));
            if ((!a.startsWith(a2) && !a.startsWith(a3)) || a.equals(a2) || a.equals(a3)) {
                return false;
            }
            String[] strArr = b;
            for (int i = 0; i < 5; i++) {
                if (a.startsWith(a3 + strArr[i])) {
                    return false;
                }
            }
            return true;
        }
    }

    /* compiled from: WebViewAssetLoader.java */
    /* loaded from: classes.dex */
    public interface c {
        WebResourceResponse a(String str);
    }

    /* compiled from: WebViewAssetLoader.java */
    /* loaded from: classes.dex */
    public static class d {
        public final boolean a;
        public final String b;
        public final String c;
        public final c d;

        public d(String str, c cVar) {
            if (!str.isEmpty() && str.charAt(0) == '/') {
                if (str.endsWith("/")) {
                    this.b = "appassets.androidplatform.net";
                    this.c = str;
                    this.a = false;
                    this.d = cVar;
                    return;
                }
                throw new IllegalArgumentException("Path should end with a slash '/'");
            }
            throw new IllegalArgumentException("Path should start with a slash '/'.");
        }
    }

    /* compiled from: WebViewAssetLoader.java */
    /* loaded from: classes.dex */
    public static final class e implements c {
        public final u a;

        public e(Context context) {
            this.a = new u(context);
        }

        @Override // com.amazon.aps.iva.i9.f.c
        public final WebResourceResponse a(String str) {
            try {
                return new WebResourceResponse(u.b(str), null, this.a.c(str));
            } catch (Resources.NotFoundException | IOException unused) {
                return new WebResourceResponse(null, null, null);
            }
        }
    }

    public f(ArrayList arrayList) {
        this.a = arrayList;
    }
}

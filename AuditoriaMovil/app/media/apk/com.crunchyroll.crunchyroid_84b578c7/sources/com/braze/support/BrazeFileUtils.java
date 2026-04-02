package com.braze.support;

import android.content.res.AssetManager;
import android.net.Uri;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.yb0.l;
import com.braze.support.BrazeLogger;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0004\u001a\n\u0010\u0007\u001a\u00020\u0005*\u00020\u0004\u001aH\u0010\u0010\u001a \u0012\u0004\u0012\u00020\u0000\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000ej\u0002`\u000f0\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u001a\u0012\u0010\u0013\u001a\u00020\b*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b\"\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Ljava/io/File;", "fileOrDirectory", "Lcom/amazon/aps/iva/kb0/q;", "deleteFileOrDirectory", "Landroid/net/Uri;", "", "isRemoteUri", "isLocalUri", "", "downloadDirectoryAbsolutePath", "remoteFileUrl", "outputFilename", "extension", "Lcom/amazon/aps/iva/kb0/j;", "", "Lcom/braze/communication/HttpHeaders;", "downloadFileToPath", "Landroid/content/res/AssetManager;", "assetPath", "getAssetFileStringContents", "TAG", "Ljava/lang/String;", "", "REMOTE_SCHEMES", "Ljava/util/List;", "android-sdk-base_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BrazeFileUtils {
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("BrazeFileUtils");
    public static final List<String> REMOTE_SCHEMES = f1.K("http", "https", "ftp", "ftps", "about", "javascript");

    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ File b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File file) {
            super(0);
            this.b = file;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Could not recursively delete " + this.b.getName();
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "SDK is offline. File not downloaded for url: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends l implements com.amazon.aps.iva.xb0.a {
        public static final e b = new e();

        public e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Download directory null or blank. File not downloaded.";
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends l implements com.amazon.aps.iva.xb0.a {
        public static final f b = new f();

        public f() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Zip file url null or blank. File not downloaded.";
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends l implements com.amazon.aps.iva.xb0.a {
        public static final g b = new g();

        public g() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Output filename null or blank. File not downloaded.";
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ int b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(int i, String str) {
            super(0);
            this.b = i;
            this.c = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            StringBuilder sb = new StringBuilder("HTTP response code was ");
            sb.append(this.b);
            sb.append(". File with url ");
            return defpackage.b.c(sb, this.c, " could not be downloaded.");
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Exception during download of file from url : " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends l implements com.amazon.aps.iva.xb0.a {
        public static final j b = new j();

        public j() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Null or blank Uri scheme.";
        }
    }

    public static final void deleteFileOrDirectory(File file) {
        com.amazon.aps.iva.yb0.j.f(file, "fileOrDirectory");
        if (!com.amazon.aps.iva.vb0.f.L(file)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, (com.amazon.aps.iva.xb0.a) new a(file), 4, (Object) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049 A[Catch: all -> 0x00df, Exception -> 0x00e1, TryCatch #6 {Exception -> 0x00e1, blocks: (B:11:0x0033, B:13:0x003d, B:19:0x0049, B:20:0x0058), top: B:64:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070 A[Catch: all -> 0x00da, Exception -> 0x00dc, TRY_LEAVE, TryCatch #8 {Exception -> 0x00dc, all -> 0x00da, blocks: (B:21:0x0068, B:23:0x0070, B:27:0x0084, B:38:0x00a7, B:39:0x00aa, B:40:0x00ab, B:41:0x00d9), top: B:67:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ab A[Catch: all -> 0x00da, Exception -> 0x00dc, TryCatch #8 {Exception -> 0x00dc, all -> 0x00da, blocks: (B:21:0x0068, B:23:0x0070, B:27:0x0084, B:38:0x00a7, B:39:0x00aa, B:40:0x00ab, B:41:0x00d9), top: B:67:0x0068 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.amazon.aps.iva.kb0.j<java.io.File, java.util.Map<java.lang.String, java.lang.String>> downloadFileToPath(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.support.BrazeFileUtils.downloadFileToPath(java.lang.String, java.lang.String, java.lang.String, java.lang.String):com.amazon.aps.iva.kb0.j");
    }

    public static /* synthetic */ com.amazon.aps.iva.kb0.j downloadFileToPath$default(String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str4 = null;
        }
        return downloadFileToPath(str, str2, str3, str4);
    }

    public static final String getAssetFileStringContents(AssetManager assetManager, String str) {
        BufferedReader bufferedReader;
        com.amazon.aps.iva.yb0.j.f(assetManager, "<this>");
        com.amazon.aps.iva.yb0.j.f(str, "assetPath");
        InputStream open = assetManager.open(str);
        com.amazon.aps.iva.yb0.j.e(open, "this.open(assetPath)");
        InputStreamReader inputStreamReader = new InputStreamReader(open, com.amazon.aps.iva.oe0.a.b);
        if (inputStreamReader instanceof BufferedReader) {
            bufferedReader = (BufferedReader) inputStreamReader;
        } else {
            bufferedReader = new BufferedReader(inputStreamReader, 8192);
        }
        try {
            String y = k.y(bufferedReader);
            com.amazon.aps.iva.a60.b.k(bufferedReader, null);
            return y;
        } finally {
        }
    }

    public static final boolean isLocalUri(Uri uri) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(uri, "<this>");
        String scheme = uri.getScheme();
        if (scheme != null && !m.b0(scheme)) {
            z = false;
        } else {
            z = true;
        }
        if (!z && !com.amazon.aps.iva.yb0.j.a(scheme, "file")) {
            return false;
        }
        return true;
    }

    public static final boolean isRemoteUri(Uri uri) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(uri, "<this>");
        String scheme = uri.getScheme();
        if (scheme != null && !m.b0(scheme)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, (com.amazon.aps.iva.xb0.a) j.b, 4, (Object) null);
            return false;
        }
        return REMOTE_SCHEMES.contains(scheme);
    }
}

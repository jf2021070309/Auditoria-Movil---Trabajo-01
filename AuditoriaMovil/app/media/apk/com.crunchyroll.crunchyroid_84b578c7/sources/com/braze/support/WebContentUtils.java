package com.braze.support;

import android.content.Context;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.o0.t1;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.oe0.q;
import com.amazon.aps.iva.yb0.d0;
import com.braze.support.BrazeLogger;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0007J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0007J$\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000fH\u0007J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0007¨\u0006\u0017"}, d2 = {"Lcom/braze/support/WebContentUtils;", "", "Ljava/io/File;", "localDirectory", "", "remoteZipUrl", "getLocalHtmlUrlFromRemoteUrl", "unpackDirectory", "zipFile", "", "unpackZipIntoDirectory", "Landroid/content/Context;", "context", "getHtmlInAppMessageAssetCacheDirectory", "originalString", "", "remoteToLocalAssetMap", "replacePrefetchedUrlsWithLocalAssets", "intendedParentDirectory", "childFilePath", "validateChildFileExistsUnderParent", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class WebContentUtils {
    public static final WebContentUtils INSTANCE = new WebContentUtils();

    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final a b = new a();

        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Remote zip url is empty. No local URL will be created.";
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2) {
            super(0);
            this.b = str;
            this.c = str2;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Starting download of url: " + this.b + " to " + this.c;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Could not download zip file to local storage. " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2) {
            super(0);
            this.b = str;
            this.c = str2;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Html content zip downloaded. " + this.b + " to " + this.c;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final e b = new e();

        public e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Error during the zip unpack.";
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return t1.b(new StringBuilder("Html content zip unpacked to to "), this.b, '.');
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ d0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(d0 d0Var) {
            super(0);
            this.b = d0Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Cannot find local asset file at path: " + ((String) this.b.b);
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;
        final /* synthetic */ d0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, d0 d0Var) {
            super(0);
            this.b = str;
            this.c = d0Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            StringBuilder sb = new StringBuilder("Replacing remote url \"");
            sb.append(this.b);
            sb.append("\" with local uri \"");
            return t1.b(sb, (String) this.c.b, '\"');
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final i b = new i();

        public i() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Unpack directory is blank. Zip file not unpacked.";
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ d0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(d0 d0Var) {
            super(0);
            this.b = d0Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Error creating parent directory " + ((String) this.b.b);
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ d0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(d0 d0Var) {
            super(0);
            this.b = d0Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Error unpacking zipEntry " + ((String) this.b.b);
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ File b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(File file, String str) {
            super(0);
            this.b = file;
            this.c = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            StringBuilder sb = new StringBuilder("Error during unpack of zip file ");
            sb.append(this.b.getAbsolutePath());
            sb.append(" to ");
            return t1.b(sb, this.c, '.');
        }
    }

    private WebContentUtils() {
    }

    public static final File getHtmlInAppMessageAssetCacheDirectory(Context context) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        return new File(context.getCacheDir().getPath() + "/braze-html-inapp-messages");
    }

    public static final String getLocalHtmlUrlFromRemoteUrl(File file, String str) {
        com.amazon.aps.iva.yb0.j.f(file, "localDirectory");
        com.amazon.aps.iva.yb0.j.f(str, "remoteZipUrl");
        if (m.b0(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.W, (Throwable) null, a.b, 2, (Object) null);
            return null;
        }
        String absolutePath = file.getAbsolutePath();
        String valueOf = String.valueOf(IntentUtils.getRequestCode());
        String str2 = absolutePath + '/' + valueOf;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        WebContentUtils webContentUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, webContentUtils, (BrazeLogger.Priority) null, (Throwable) null, new b(str, str2), 3, (Object) null);
        try {
            BrazeLogger.brazelog$default(brazeLogger, webContentUtils, (BrazeLogger.Priority) null, (Throwable) null, new d(str, str2), 3, (Object) null);
            if (!unpackZipIntoDirectory(str2, BrazeFileUtils.downloadFileToPath(str2, str, valueOf, ".zip").b)) {
                BrazeLogger.brazelog$default(brazeLogger, webContentUtils, BrazeLogger.Priority.W, (Throwable) null, e.b, 2, (Object) null);
                BrazeFileUtils.deleteFileOrDirectory(new File(str2));
                return null;
            }
            BrazeLogger.brazelog$default(brazeLogger, webContentUtils, (BrazeLogger.Priority) null, (Throwable) null, new f(str2), 3, (Object) null);
            return str2;
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, e2, new c(str));
            BrazeFileUtils.deleteFileOrDirectory(new File(str2));
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    public static final String replacePrefetchedUrlsWithLocalAssets(String str, Map<String, String> map) {
        T t;
        com.amazon.aps.iva.yb0.j.f(str, "originalString");
        com.amazon.aps.iva.yb0.j.f(map, "remoteToLocalAssetMap");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            d0 d0Var = new d0();
            d0Var.b = entry.getValue();
            if (!new File((String) d0Var.b).exists()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.W, (Throwable) null, new g(d0Var), 2, (Object) null);
            } else {
                if (m.h0((String) d0Var.b, "file://", false)) {
                    t = (String) d0Var.b;
                } else {
                    t = "file://" + ((String) d0Var.b);
                }
                d0Var.b = t;
                String key = entry.getKey();
                if (q.i0(str, key, false)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new h(key, d0Var), 3, (Object) null);
                    str = m.f0(str, key, (String) d0Var.b);
                }
            }
        }
        return str;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [T, java.lang.Object, java.lang.String] */
    public static final boolean unpackZipIntoDirectory(String str, File file) {
        com.amazon.aps.iva.yb0.j.f(str, "unpackDirectory");
        com.amazon.aps.iva.yb0.j.f(file, "zipFile");
        if (m.b0(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.I, (Throwable) null, i.b, 2, (Object) null);
            return false;
        }
        new File(str).mkdirs();
        try {
            d0 d0Var = new d0();
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file));
            for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                ?? name = nextEntry.getName();
                com.amazon.aps.iva.yb0.j.e(name, "zipEntry.name");
                d0Var.b = name;
                Locale locale = Locale.US;
                com.amazon.aps.iva.yb0.j.e(locale, "US");
                String lowerCase = name.toLowerCase(locale);
                com.amazon.aps.iva.yb0.j.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!m.h0(lowerCase, "__macosx", false)) {
                    try {
                        String validateChildFileExistsUnderParent = validateChildFileExistsUnderParent(str, str + '/' + ((String) d0Var.b));
                        if (nextEntry.isDirectory()) {
                            new File(validateChildFileExistsUnderParent).mkdirs();
                        } else {
                            try {
                                File parentFile = new File(validateChildFileExistsUnderParent).getParentFile();
                                if (parentFile != null) {
                                    parentFile.mkdirs();
                                }
                            } catch (Exception e2) {
                                BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, e2, new j(d0Var));
                            }
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(validateChildFileExistsUnderParent));
                            try {
                                x.E(zipInputStream, bufferedOutputStream);
                                com.amazon.aps.iva.a60.b.k(bufferedOutputStream, null);
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                    break;
                                } catch (Throwable th2) {
                                    com.amazon.aps.iva.a60.b.k(bufferedOutputStream, th);
                                    throw th2;
                                    break;
                                }
                            }
                        }
                    } catch (Exception e3) {
                        BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, e3, new k(d0Var));
                    }
                }
                zipInputStream.closeEntry();
            }
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            com.amazon.aps.iva.a60.b.k(zipInputStream, null);
            return true;
        } catch (Throwable th3) {
            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, th3, new l(file, str));
            return false;
        }
    }

    public static final String validateChildFileExistsUnderParent(String str, String str2) {
        com.amazon.aps.iva.yb0.j.f(str, "intendedParentDirectory");
        com.amazon.aps.iva.yb0.j.f(str2, "childFilePath");
        String canonicalPath = new File(str).getCanonicalPath();
        String canonicalPath2 = new File(str2).getCanonicalPath();
        com.amazon.aps.iva.yb0.j.e(canonicalPath2, "childFileCanonicalPath");
        com.amazon.aps.iva.yb0.j.e(canonicalPath, "parentCanonicalPath");
        if (m.h0(canonicalPath2, canonicalPath, false)) {
            return canonicalPath2;
        }
        throw new IllegalStateException(com.amazon.aps.iva.n4.a.a(com.amazon.aps.iva.n4.a.b("Invalid file with original path: ", str2, " with canonical path: ", canonicalPath2, " does not exist under intended parent with  path: "), str, " and canonical path: ", canonicalPath));
    }
}

package com.facebook.internal;

import android.net.Uri;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FileLruCache;
import com.facebook.internal.Logger;
import com.facebook.share.internal.ShareConstants;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Charsets;
/* compiled from: UrlRedirectCache.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007J\b\u0010\r\u001a\u00020\tH\u0007J\b\u0010\u000e\u001a\u00020\u0007H\u0007J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/facebook/internal/UrlRedirectCache;", "", "()V", "redirectContentTag", "", ViewHierarchyConstants.TAG_KEY, "urlRedirectFileLruCache", "Lcom/facebook/internal/FileLruCache;", "cacheUriRedirect", "", "fromUri", "Landroid/net/Uri;", "toUri", "clearCache", "getCache", "getRedirectedUri", ShareConstants.MEDIA_URI, "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class UrlRedirectCache {
    public static final UrlRedirectCache INSTANCE = new UrlRedirectCache();
    private static final String redirectContentTag;
    private static final String tag;
    private static FileLruCache urlRedirectFileLruCache;

    static {
        String simpleName = Reflection.getOrCreateKotlinClass(UrlRedirectCache.class).getSimpleName();
        if (simpleName == null) {
            simpleName = "UrlRedirectCache";
        }
        tag = simpleName;
        redirectContentTag = tag + "_Redirect";
    }

    private UrlRedirectCache() {
    }

    @JvmStatic
    public static final synchronized FileLruCache getCache() throws IOException {
        FileLruCache fileLruCache;
        synchronized (UrlRedirectCache.class) {
            fileLruCache = urlRedirectFileLruCache;
            if (fileLruCache == null) {
                fileLruCache = new FileLruCache(tag, new FileLruCache.Limits());
            }
            urlRedirectFileLruCache = fileLruCache;
        }
        return fileLruCache;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1, r10) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
        r1 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
        com.facebook.internal.Logger.Companion.log(com.facebook.LoggingBehavior.CACHE, 6, com.facebook.internal.UrlRedirectCache.tag, "A loop detected in UrlRedirectCache");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
        com.facebook.internal.Utility.closeQuietly(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
        return null;
     */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.net.Uri getRedirectedUri(android.net.Uri r10) {
        /*
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            java.lang.String r10 = r10.toString()
            java.lang.String r1 = "uri.toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r1)
            r1 = r0
            java.io.InputStreamReader r1 = (java.io.InputStreamReader) r1
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r2.add(r10)
            com.facebook.internal.FileLruCache r3 = getCache()     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L98
            java.lang.String r4 = com.facebook.internal.UrlRedirectCache.redirectContentTag     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L98
            java.io.InputStream r4 = r3.get(r10, r4)     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L98
            r5 = 0
            r6 = r5
        L24:
            if (r4 == 0) goto L84
            r6 = 1
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L98
            r7.<init>(r4)     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L98
            r1 = 128(0x80, float:1.794E-43)
            char[] r4 = new char[r1]     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L81
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L81
            r8.<init>()     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L81
            int r9 = r7.read(r4, r5, r1)     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L81
        L39:
            if (r9 <= 0) goto L43
            r8.append(r4, r5, r9)     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L81
            int r9 = r7.read(r4, r5, r1)     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L81
            goto L39
        L43:
            r1 = r7
            java.io.Closeable r1 = (java.io.Closeable) r1     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L81
            com.facebook.internal.Utility.closeQuietly(r1)     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L81
            java.lang.String r1 = r8.toString()     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L81
            java.lang.String r4 = "urlBuilder.toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L81
            boolean r4 = r2.contains(r1)     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L81
            if (r4 == 0) goto L72
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r10)     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L81
            if (r1 == 0) goto L60
            r1 = r7
            goto L84
        L60:
            com.facebook.internal.Logger$Companion r10 = com.facebook.internal.Logger.Companion     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L81
            com.facebook.LoggingBehavior r1 = com.facebook.LoggingBehavior.CACHE     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L81
            r2 = 6
            java.lang.String r3 = com.facebook.internal.UrlRedirectCache.tag     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L81
            java.lang.String r4 = "A loop detected in UrlRedirectCache"
            r10.log(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L81
            java.io.Closeable r7 = (java.io.Closeable) r7
            com.facebook.internal.Utility.closeQuietly(r7)
            return r0
        L72:
            r2.add(r1)     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L81
            java.lang.String r10 = com.facebook.internal.UrlRedirectCache.redirectContentTag     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L81
            java.io.InputStream r4 = r3.get(r1, r10)     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L81
            r10 = r1
            r1 = r7
            goto L24
        L7e:
            r10 = move-exception
            r1 = r7
            goto Lba
        L81:
            r10 = move-exception
            r1 = r7
            goto L99
        L84:
            if (r6 == 0) goto L90
            android.net.Uri r10 = android.net.Uri.parse(r10)     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L98
            java.io.Closeable r1 = (java.io.Closeable) r1
            com.facebook.internal.Utility.closeQuietly(r1)
            return r10
        L90:
            java.io.Closeable r1 = (java.io.Closeable) r1
            com.facebook.internal.Utility.closeQuietly(r1)
            goto Lb9
        L96:
            r10 = move-exception
            goto Lba
        L98:
            r10 = move-exception
        L99:
            com.facebook.internal.Logger$Companion r2 = com.facebook.internal.Logger.Companion     // Catch: java.lang.Throwable -> L96
            com.facebook.LoggingBehavior r3 = com.facebook.LoggingBehavior.CACHE     // Catch: java.lang.Throwable -> L96
            r4 = 4
            java.lang.String r5 = com.facebook.internal.UrlRedirectCache.tag     // Catch: java.lang.Throwable -> L96
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L96
            r6.<init>()     // Catch: java.lang.Throwable -> L96
            java.lang.String r7 = "IOException when accessing cache: "
            r6.append(r7)     // Catch: java.lang.Throwable -> L96
            java.lang.String r10 = r10.getMessage()     // Catch: java.lang.Throwable -> L96
            r6.append(r10)     // Catch: java.lang.Throwable -> L96
            java.lang.String r10 = r6.toString()     // Catch: java.lang.Throwable -> L96
            r2.log(r3, r4, r5, r10)     // Catch: java.lang.Throwable -> L96
            goto L90
        Lb9:
            return r0
        Lba:
            java.io.Closeable r1 = (java.io.Closeable) r1
            com.facebook.internal.Utility.closeQuietly(r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.UrlRedirectCache.getRedirectedUri(android.net.Uri):android.net.Uri");
    }

    @JvmStatic
    public static final void cacheUriRedirect(Uri uri, Uri uri2) {
        String uri3;
        Charset charset;
        if (uri == null || uri2 == null) {
            return;
        }
        OutputStream outputStream = null;
        try {
            try {
                FileLruCache cache = getCache();
                String uri4 = uri.toString();
                Intrinsics.checkNotNullExpressionValue(uri4, "fromUri.toString()");
                outputStream = cache.openPutStream(uri4, redirectContentTag);
                uri3 = uri2.toString();
                Intrinsics.checkNotNullExpressionValue(uri3, "toUri.toString()");
                charset = Charsets.UTF_8;
            } catch (IOException e) {
                Logger.Companion.log(LoggingBehavior.CACHE, 4, tag, "IOException when accessing cache: " + e.getMessage());
            }
            if (uri3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = uri3.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        } finally {
            Utility.closeQuietly(outputStream);
        }
    }

    @JvmStatic
    public static final void clearCache() {
        try {
            getCache().clearCache();
        } catch (IOException e) {
            Logger.Companion companion = Logger.Companion;
            LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
            String str = tag;
            companion.log(loggingBehavior, 5, str, "clearCache failed " + e.getMessage());
        }
    }
}

package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.core.rolling.RolloverFailure;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.util.FileUtil;
import java.io.File;
import java.util.concurrent.Future;
import java.util.zip.ZipEntry;
/* loaded from: classes.dex */
public class Compressor extends ContextAwareBase {
    public static final int BUFFER_SIZE = 8192;
    public final CompressionMode compressionMode;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final String f2926b;

        /* renamed from: c  reason: collision with root package name */
        public final String f2927c;

        public a(String str, String str2, String str3) {
            this.a = str;
            this.f2926b = str2;
            this.f2927c = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            Compressor.this.compress(this.a, this.f2926b, this.f2927c);
        }
    }

    public Compressor(CompressionMode compressionMode) {
        this.compressionMode = compressionMode;
    }

    public static String computeFileNameStrWithoutCompSuffix(String str, CompressionMode compressionMode) {
        int i2;
        int length = str.length();
        int ordinal = compressionMode.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    throw new IllegalStateException("Execution should not reach this point");
                }
                if (!str.endsWith(".zip")) {
                    return str;
                }
                i2 = length - 4;
            } else if (str.endsWith(".gz")) {
                i2 = length - 3;
            }
            return str.substring(0, i2);
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0117 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.zip.GZIPOutputStream] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.zip.GZIPOutputStream] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.zip.GZIPOutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void gzCompress(java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.qos.logback.core.rolling.helper.Compressor.gzCompress(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:16|(4:17|18|19|20)|(6:22|23|(2:24|(1:26)(1:27))|28|29|30)|31|32|33|(2:35|36)(1:37)) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0122 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0129 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.zip.ZipOutputStream] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.zip.ZipOutputStream] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.zip.ZipOutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void zipCompress(java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.qos.logback.core.rolling.helper.Compressor.zipCompress(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public Future<?> asyncCompress(String str, String str2, String str3) throws RolloverFailure {
        return this.context.getScheduledExecutorService().submit(new a(str, str2, str3));
    }

    public void compress(String str, String str2, String str3) {
        int ordinal = this.compressionMode.ordinal();
        if (ordinal == 0) {
            throw new UnsupportedOperationException("compress method called in NONE compression mode");
        }
        if (ordinal == 1) {
            gzCompress(str, str2);
        } else if (ordinal != 2) {
        } else {
            zipCompress(str, str2, str3);
        }
    }

    public ZipEntry computeZipEntry(File file) {
        return computeZipEntry(file.getName());
    }

    public ZipEntry computeZipEntry(String str) {
        return new ZipEntry(computeFileNameStrWithoutCompSuffix(str, this.compressionMode));
    }

    public void createMissingTargetDirsIfNecessary(File file) {
        if (FileUtil.createMissingParentDirectories(file)) {
            return;
        }
        StringBuilder y = e.a.d.a.a.y("Failed to create parent directories for [");
        y.append(file.getAbsolutePath());
        y.append("]");
        addError(y.toString());
    }

    public String toString() {
        return getClass().getName();
    }
}

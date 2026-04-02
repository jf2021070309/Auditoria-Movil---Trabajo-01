package c.s;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
/* loaded from: classes.dex */
public final class d implements Closeable {
    public final File a;

    /* renamed from: b  reason: collision with root package name */
    public final long f2504b;

    /* renamed from: c  reason: collision with root package name */
    public final File f2505c;

    /* renamed from: d  reason: collision with root package name */
    public final RandomAccessFile f2506d;

    /* renamed from: e  reason: collision with root package name */
    public final FileChannel f2507e;

    /* renamed from: f  reason: collision with root package name */
    public final FileLock f2508f;

    /* loaded from: classes.dex */
    public static class a extends File {
        public long a;

        public a(File file, String str) {
            super(file, str);
            this.a = -1L;
        }
    }

    public d(File file, File file2) throws IOException {
        file.getPath();
        file2.getPath();
        this.a = file;
        this.f2505c = file2;
        this.f2504b = i(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f2506d = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f2507e = channel;
            try {
                file3.getPath();
                this.f2508f = channel.lock();
                file3.getPath();
            } catch (IOException e2) {
                e = e2;
                a(this.f2507e);
                throw e;
            } catch (Error e3) {
                e = e3;
                a(this.f2507e);
                throw e;
            } catch (RuntimeException e4) {
                e = e4;
                a(this.f2507e);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e5) {
            a(this.f2506d);
            throw e5;
        }
    }

    public static void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e2) {
            Log.w("MultiDex", "Failed to close resource", e2);
        }
    }

    public static void f(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException, FileNotFoundException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile(e.a.d.a.a.k("tmp-", str), ".zip", file.getParentFile());
        createTempFile.getPath();
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            ZipEntry zipEntry2 = new ZipEntry("classes.dex");
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[16384];
            for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                zipOutputStream.write(bArr, 0, read);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            if (!createTempFile.setReadOnly()) {
                throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
            }
            file.getPath();
            if (createTempFile.renameTo(file)) {
                return;
            }
            throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
        } finally {
            a(inputStream);
            createTempFile.delete();
        }
    }

    public static long h(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    public static long i(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            e b2 = c.i.g.b.b(randomAccessFile);
            CRC32 crc32 = new CRC32();
            long j2 = b2.f2509b;
            randomAccessFile.seek(b2.a);
            byte[] bArr = new byte[16384];
            int read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j2));
            while (read != -1) {
                crc32.update(bArr, 0, read);
                j2 -= read;
                if (j2 == 0) {
                    break;
                }
                read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j2));
            }
            long value = crc32.getValue();
            randomAccessFile.close();
            return value == -1 ? value - 1 : value;
        } catch (Throwable th) {
            randomAccessFile.close();
            throw th;
        }
    }

    public static void v(Context context, String str, long j2, long j3, List<a> list) {
        SharedPreferences.Editor edit = context.getSharedPreferences("multidex.version", 4).edit();
        edit.putLong(str + "timestamp", j2);
        edit.putLong(e.a.d.a.a.r(new StringBuilder(), str, "crc"), j3);
        edit.putInt(str + "dex.number", list.size() + 1);
        int i2 = 2;
        for (a aVar : list) {
            edit.putLong(str + "dex.crc." + i2, aVar.a);
            edit.putLong(str + "dex.time." + i2, aVar.lastModified());
            i2++;
        }
        edit.commit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f2508f.release();
        this.f2507e.close();
        this.f2506d.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<? extends java.io.File> m(android.content.Context r15, java.lang.String r16, boolean r17) throws java.io.IOException {
        /*
            r14 = this;
            r1 = r14
            r3 = r16
            java.io.File r0 = r1.a
            r0.getPath()
            java.nio.channels.FileLock r0 = r1.f2508f
            boolean r0 = r0.isValid()
            if (r0 == 0) goto L98
            if (r17 != 0) goto L7f
            java.io.File r0 = r1.a
            long r4 = r1.f2504b
            r2 = 4
            java.lang.String r6 = "multidex.version"
            r7 = r15
            android.content.SharedPreferences r2 = r15.getSharedPreferences(r6, r2)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            java.lang.String r8 = "timestamp"
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            r8 = -1
            long r10 = r2.getLong(r6, r8)
            long r12 = h(r0)
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 != 0) goto L59
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r6 = "crc"
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            long r8 = r2.getLong(r0, r8)
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 == 0) goto L57
            goto L59
        L57:
            r0 = 0
            goto L5a
        L59:
            r0 = 1
        L5a:
            if (r0 != 0) goto L80
            java.util.List r0 = r14.r(r15, r16)     // Catch: java.io.IOException -> L61
            goto L94
        L61:
            r0 = move-exception
            r2 = r0
            java.lang.String r0 = "MultiDex"
            java.lang.String r4 = "Failed to reload existing extracted secondary dex files, falling back to fresh extraction"
            android.util.Log.w(r0, r4, r2)
            java.util.List r0 = r14.u()
            java.io.File r2 = r1.a
            long r4 = h(r2)
            long r8 = r1.f2504b
            r2 = r15
            r3 = r16
            r6 = r8
            r8 = r0
            v(r2, r3, r4, r6, r8)
            goto L94
        L7f:
            r7 = r15
        L80:
            java.util.List r0 = r14.u()
            java.io.File r2 = r1.a
            long r4 = h(r2)
            long r8 = r1.f2504b
            r2 = r15
            r3 = r16
            r6 = r8
            r8 = r0
            v(r2, r3, r4, r6, r8)
        L94:
            r0.size()
            return r0
        L98:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "MultiDexExtractor was closed"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.s.d.m(android.content.Context, java.lang.String, boolean):java.util.List");
    }

    public final List<a> r(Context context, String str) throws IOException {
        String str2 = this.a.getName() + ".classes";
        SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
        int i2 = sharedPreferences.getInt(str + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i2 + (-1));
        int i3 = 2;
        while (i3 <= i2) {
            a aVar = new a(this.f2505c, e.a.d.a.a.f(str2, i3, ".zip"));
            if (!aVar.isFile()) {
                StringBuilder y = e.a.d.a.a.y("Missing extracted secondary dex file '");
                y.append(aVar.getPath());
                y.append("'");
                throw new IOException(y.toString());
            }
            aVar.a = i(aVar);
            long j2 = sharedPreferences.getLong(str + "dex.crc." + i3, -1L);
            long j3 = sharedPreferences.getLong(str + "dex.time." + i3, -1L);
            long lastModified = aVar.lastModified();
            if (j3 == lastModified) {
                String str3 = str2;
                SharedPreferences sharedPreferences2 = sharedPreferences;
                if (j2 == aVar.a) {
                    arrayList.add(aVar);
                    i3++;
                    sharedPreferences = sharedPreferences2;
                    str2 = str3;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid extracted dex: ");
            sb.append(aVar);
            sb.append(" (key \"");
            sb.append(str);
            sb.append("\"), expected modification time: ");
            sb.append(j3);
            e.a.d.a.a.K(sb, ", modification time: ", lastModified, ", expected crc: ");
            sb.append(j2);
            sb.append(", file crc: ");
            sb.append(aVar.a);
            throw new IOException(sb.toString());
        }
        return arrayList;
    }

    public final List<a> u() throws IOException {
        String str = this.a.getName() + ".classes";
        File[] listFiles = this.f2505c.listFiles(new c(this));
        if (listFiles == null) {
            StringBuilder y = e.a.d.a.a.y("Failed to list secondary dex dir content (");
            y.append(this.f2505c.getPath());
            y.append(").");
            Log.w("MultiDex", y.toString());
        } else {
            for (File file : listFiles) {
                file.getPath();
                file.length();
                if (file.delete()) {
                    file.getPath();
                } else {
                    StringBuilder y2 = e.a.d.a.a.y("Failed to delete old file ");
                    y2.append(file.getPath());
                    Log.w("MultiDex", y2.toString());
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.a);
        int i2 = 2;
        try {
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            while (entry != null) {
                a aVar = new a(this.f2505c, str + i2 + ".zip");
                arrayList.add(aVar);
                String str2 = "Extraction is needed for file " + aVar;
                int i3 = 0;
                boolean z = false;
                while (i3 < 3 && !z) {
                    i3++;
                    f(zipFile, entry, aVar, str);
                    try {
                        aVar.a = i(aVar);
                        z = true;
                    } catch (IOException e2) {
                        Log.w("MultiDex", "Failed to read crc from " + aVar.getAbsolutePath(), e2);
                        z = false;
                    }
                    aVar.getAbsolutePath();
                    aVar.length();
                    if (!z) {
                        aVar.delete();
                        if (aVar.exists()) {
                            Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + aVar.getPath() + "'");
                        }
                    }
                }
                if (!z) {
                    throw new IOException("Could not create zip file " + aVar.getAbsolutePath() + " for secondary dex (" + i2 + ")");
                }
                i2++;
                entry = zipFile.getEntry("classes" + i2 + ".dex");
            }
            return arrayList;
        } finally {
            try {
                zipFile.close();
            } catch (IOException e3) {
                Log.w("MultiDex", "Failed to close resource", e3);
            }
        }
    }
}

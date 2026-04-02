package com.amazon.aps.iva.vp;

import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.tp.k;
import com.amazon.aps.iva.tp.l;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.JsonParseException;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
/* compiled from: BatchFileHandler.kt */
/* loaded from: classes2.dex */
public final class e implements l {
    public final com.amazon.aps.iva.iq.a a;
    public final com.amazon.aps.iva.xb0.l<byte[], byte[]> b;
    public final com.amazon.aps.iva.xb0.l<byte[], com.amazon.aps.iva.tp.a> c;

    /* compiled from: BatchFileHandler.kt */
    /* loaded from: classes2.dex */
    public static final class a extends IOException {
        public a() {
            super("Meta size is bigger than limit of 255 bytes, cannot write data.");
        }
    }

    public e(com.amazon.aps.iva.iq.a aVar) {
        j.f(aVar, "internalLogger");
        c cVar = c.h;
        j.f(cVar, "metaGenerator");
        d dVar = d.h;
        j.f(dVar, "metaParser");
        this.a = aVar;
        this.b = cVar;
        this.c = dVar;
    }

    @Override // com.amazon.aps.iva.tp.l
    public final boolean a(File file, boolean z, byte[] bArr) {
        com.amazon.aps.iva.iq.a aVar = this.a;
        j.f(file, "file");
        try {
            e(file, z, bArr);
            return true;
        } catch (IOException e) {
            String format = String.format(Locale.US, "Unable to write data to file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
            j.e(format, "format(locale, this, *args)");
            l1.z(aVar, format, e, 4);
            return false;
        } catch (SecurityException e2) {
            String format2 = String.format(Locale.US, "Unable to write data to file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
            j.e(format2, "format(locale, this, *args)");
            l1.z(aVar, format2, e2, 4);
            return false;
        }
    }

    @Override // com.amazon.aps.iva.tp.l
    public final boolean b(File file, File file2) {
        j.f(file, "srcDir");
        j.f(file2, "destDir");
        boolean b = com.amazon.aps.iva.tp.b.b(file);
        com.amazon.aps.iva.iq.a aVar = this.a;
        if (!b) {
            String format = String.format(Locale.US, "Unable to move files; source directory does not exist: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
            j.e(format, "format(locale, this, *args)");
            com.amazon.aps.iva.iq.a.b(aVar, format);
            return true;
        }
        Boolean bool = Boolean.FALSE;
        com.amazon.aps.iva.tp.e eVar = com.amazon.aps.iva.tp.e.h;
        if (!((Boolean) com.amazon.aps.iva.tp.b.f(file, bool, eVar)).booleanValue()) {
            String format2 = String.format(Locale.US, "Unable to move files; file is not a directory: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
            j.e(format2, "format(locale, this, *args)");
            l1.z(aVar, format2, null, 6);
            return false;
        }
        if (!com.amazon.aps.iva.tp.b.b(file2)) {
            if (!com.amazon.aps.iva.tp.b.d(file2)) {
                String format3 = String.format(Locale.US, "Unable to move files; could not create directory: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
                j.e(format3, "format(locale, this, *args)");
                l1.z(aVar, format3, null, 6);
                return false;
            }
        } else if (!((Boolean) com.amazon.aps.iva.tp.b.f(file2, bool, eVar)).booleanValue()) {
            String format4 = String.format(Locale.US, "Unable to move files; file is not a directory: %s", Arrays.copyOf(new Object[]{file2.getPath()}, 1));
            j.e(format4, "format(locale, this, *args)");
            l1.z(aVar, format4, null, 6);
            return false;
        }
        File[] fileArr = (File[]) com.amazon.aps.iva.tp.b.f(file, null, com.amazon.aps.iva.tp.g.h);
        if (fileArr == null) {
            fileArr = new File[0];
        }
        int length = fileArr.length;
        int i = 0;
        while (i < length) {
            File file3 = fileArr[i];
            i++;
            if (!((Boolean) com.amazon.aps.iva.tp.b.f(file3, Boolean.FALSE, new k(new File(file2, file3.getName())))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.amazon.aps.iva.tp.l
    public final List<byte[]> c(File file) {
        com.amazon.aps.iva.iq.a aVar = this.a;
        z zVar = z.b;
        try {
            return g(file);
        } catch (IOException e) {
            String format = String.format(Locale.US, "Unable to read data from file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
            j.e(format, "format(locale, this, *args)");
            l1.z(aVar, format, e, 4);
            return zVar;
        } catch (SecurityException e2) {
            String format2 = String.format(Locale.US, "Unable to read data from file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
            j.e(format2, "format(locale, this, *args)");
            l1.z(aVar, format2, e2, 4);
            return zVar;
        }
    }

    public final boolean d(int i, int i2, String str) {
        if (i != i2) {
            com.amazon.aps.iva.iq.a.a(this.a, "Number of bytes read for operation='" + str + "' doesn't match with expected: expected=" + i + ", actual=" + i2, null, 6);
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.tp.l
    public final boolean delete(File file) {
        com.amazon.aps.iva.iq.a aVar = this.a;
        j.f(file, "target");
        try {
            return com.amazon.aps.iva.vb0.f.L(file);
        } catch (FileNotFoundException e) {
            String format = String.format(Locale.US, "Unable to delete file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
            j.e(format, "format(locale, this, *args)");
            l1.z(aVar, format, e, 4);
            return false;
        } catch (SecurityException e2) {
            String format2 = String.format(Locale.US, "Unable to delete file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
            j.e(format2, "format(locale, this, *args)");
            l1.z(aVar, format2, e2, 4);
            return false;
        }
    }

    public final void e(File file, boolean z, byte[] bArr) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file, z);
        try {
            FileLock lock = fileOutputStream.getChannel().lock();
            j.e(lock, "outputStream.channel.lock()");
            byte[] invoke = this.b.invoke(bArr);
            if (invoke.length <= 255) {
                byte[] bArr2 = new byte[invoke.length + 2];
                bArr2[0] = 1;
                bArr2[1] = (byte) invoke.length;
                com.amazon.aps.iva.aq.j.n(invoke, bArr2, 2, invoke.length);
                fileOutputStream.write(bArr2);
                fileOutputStream.write(bArr);
                q qVar = q.a;
                lock.release();
                com.amazon.aps.iva.a60.b.k(fileOutputStream, null);
                return;
            }
            throw new a();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                com.amazon.aps.iva.a60.b.k(fileOutputStream, th);
                throw th2;
            }
        }
    }

    public final com.amazon.aps.iva.kb0.j f(BufferedInputStream bufferedInputStream) {
        int read = bufferedInputStream.read();
        com.amazon.aps.iva.iq.a aVar = this.a;
        if (read < 0) {
            com.amazon.aps.iva.iq.a.a(aVar, "Cannot read version byte, because EOF reached.", null, 6);
            return null;
        }
        int read2 = bufferedInputStream.read();
        if (read2 < 0) {
            com.amazon.aps.iva.iq.a.a(aVar, "Cannot read meta size byte, because EOF reached.", null, 6);
            return null;
        }
        byte[] bArr = new byte[read2];
        int read3 = bufferedInputStream.read(bArr, 0, read2);
        if (!d(read2, read3, "read meta")) {
            return null;
        }
        try {
            return new com.amazon.aps.iva.kb0.j(this.c.invoke(bArr), Integer.valueOf(read3 + 2));
        } catch (JsonParseException e) {
            com.amazon.aps.iva.iq.a.a(aVar, "Failed to parse meta bytes, stopping file read.", e, 4);
            return null;
        }
    }

    public final ArrayList g(File file) throws IOException {
        BufferedInputStream bufferedInputStream;
        int c = (int) com.amazon.aps.iva.tp.b.c(file);
        ArrayList arrayList = new ArrayList();
        FileInputStream fileInputStream = new FileInputStream(file);
        if (fileInputStream instanceof BufferedInputStream) {
            bufferedInputStream = (BufferedInputStream) fileInputStream;
        } else {
            bufferedInputStream = new BufferedInputStream(fileInputStream, 8192);
        }
        while (c > 0) {
            try {
                com.amazon.aps.iva.kb0.j f = f(bufferedInputStream);
                if (f == null) {
                    break;
                }
                com.amazon.aps.iva.tp.a aVar = (com.amazon.aps.iva.tp.a) f.b;
                int intValue = ((Number) f.c).intValue();
                int i = aVar.a;
                byte[] bArr = new byte[i];
                int read = bufferedInputStream.read(bArr, 0, i);
                if (!d(aVar.a, read, "read event")) {
                    break;
                }
                arrayList.add(bArr);
                c -= intValue + read;
            } finally {
            }
        }
        q qVar = q.a;
        com.amazon.aps.iva.a60.b.k(bufferedInputStream, null);
        if (c != 0) {
            String format = String.format(Locale.US, "File %s is probably corrupted, not all content was read.", Arrays.copyOf(new Object[]{file.getPath()}, 1));
            j.e(format, "format(locale, this, *args)");
            com.amazon.aps.iva.iq.a.a(com.amazon.aps.iva.dq.c.b, format, null, 6);
            l1.z(this.a, format, null, 6);
        }
        return arrayList;
    }
}

package e.d.b.e.a.a;

import ch.qos.logback.core.rolling.helper.Compressor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Objects;
import java.util.Properties;
/* loaded from: classes2.dex */
public final class g2 {
    public static final e.d.b.e.a.c.e a = new e.d.b.e.a.c.e("SliceMetadataManager");

    /* renamed from: c  reason: collision with root package name */
    public final z f6794c;

    /* renamed from: d  reason: collision with root package name */
    public final String f6795d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6796e;

    /* renamed from: f  reason: collision with root package name */
    public final long f6797f;

    /* renamed from: g  reason: collision with root package name */
    public final String f6798g;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f6793b = new byte[Compressor.BUFFER_SIZE];

    /* renamed from: h  reason: collision with root package name */
    public int f6799h = -1;

    public g2(z zVar, String str, int i2, long j2, String str2) {
        this.f6794c = zVar;
        this.f6795d = str;
        this.f6796e = i2;
        this.f6797f = j2;
        this.f6798g = str2;
    }

    public final f2 a() throws IOException {
        File i2 = this.f6794c.i(this.f6795d, this.f6796e, this.f6797f, this.f6798g);
        if (i2.exists()) {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(i2);
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") == null || properties.getProperty("previousChunk") == null) {
                    throw new p0("Slice checkpoint file corrupt.");
                }
                try {
                    int parseInt = Integer.parseInt(properties.getProperty("fileStatus"));
                    String property = properties.getProperty("fileName");
                    long parseLong = Long.parseLong(properties.getProperty("fileOffset", "-1"));
                    long parseLong2 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                    int parseInt2 = Integer.parseInt(properties.getProperty("previousChunk"));
                    this.f6799h = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                    return new f2(parseInt, property, parseLong, parseLong2, parseInt2);
                } catch (NumberFormatException e2) {
                    throw new p0("Slice checkpoint file corrupt.", e2);
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    e.d.b.e.a.c.a0.a.a(th, th2);
                }
                throw th;
            }
        }
        throw new p0("Slice checkpoint file does not exist.");
    }

    public final void b(int i2) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "3");
        properties.put("fileOffset", String.valueOf(i().length()));
        properties.put("previousChunk", String.valueOf(i2));
        properties.put("metadataFileCounter", String.valueOf(this.f6799h));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                e.d.b.e.a.c.a0.a.a(th, th2);
            }
            throw th;
        }
    }

    public final void c(long j2, byte[] bArr, int i2, int i3) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(i(), "rw");
        try {
            randomAccessFile.seek(j2);
            randomAccessFile.write(bArr, i2, i3);
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                e.d.b.e.a.c.a0.a.a(th, th2);
            }
            throw th;
        }
    }

    public final void d(InputStream inputStream, long j2) throws IOException {
        int read;
        RandomAccessFile randomAccessFile = new RandomAccessFile(i(), "rw");
        try {
            randomAccessFile.seek(j2);
            do {
                read = inputStream.read(this.f6793b);
                if (read > 0) {
                    randomAccessFile.write(this.f6793b, 0, read);
                }
            } while (read == this.f6793b.length);
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                e.d.b.e.a.c.a0.a.a(th, th2);
            }
            throw th;
        }
    }

    public final void e(String str, long j2, long j3, int i2) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "1");
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j2));
        properties.put("remainingBytes", String.valueOf(j3));
        properties.put("previousChunk", String.valueOf(i2));
        properties.put("metadataFileCounter", String.valueOf(this.f6799h));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                e.d.b.e.a.c.a0.a.a(th, th2);
            }
            throw th;
        }
    }

    public final void f(byte[] bArr) throws IOException {
        this.f6799h++;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(n(), String.format("%s-LFH.dat", Integer.valueOf(this.f6799h))));
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (IOException e2) {
            throw new p0("Could not write metadata file.", e2);
        }
    }

    public final void g(byte[] bArr, int i2) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "2");
        properties.put("previousChunk", String.valueOf(i2));
        properties.put("metadataFileCounter", String.valueOf(this.f6799h));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            z zVar = this.f6794c;
            String str = this.f6795d;
            int i3 = this.f6796e;
            long j2 = this.f6797f;
            String str2 = this.f6798g;
            Objects.requireNonNull(zVar);
            File file = new File(zVar.n(str, i3, j2, str2), "checkpoint_ext.dat");
            if (file.exists()) {
                file.delete();
            }
            fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } finally {
                try {
                    fileOutputStream.close();
                } catch (Throwable th) {
                    e.d.b.e.a.c.a0.a.a(th, th);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void h(byte[] bArr, InputStream inputStream) throws IOException {
        this.f6799h++;
        FileOutputStream fileOutputStream = new FileOutputStream(i());
        try {
            fileOutputStream.write(bArr);
            int read = inputStream.read(this.f6793b);
            while (read > 0) {
                fileOutputStream.write(this.f6793b, 0, read);
                read = inputStream.read(this.f6793b);
            }
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                e.d.b.e.a.c.a0.a.a(th, th2);
            }
            throw th;
        }
    }

    public final File i() {
        return new File(n(), String.format("%s-NAM.dat", Integer.valueOf(this.f6799h)));
    }

    public final void j(int i2) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i2));
        properties.put("metadataFileCounter", String.valueOf(this.f6799h));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                e.d.b.e.a.c.a0.a.a(th, th2);
            }
            throw th;
        }
    }

    public final void k(byte[] bArr, int i2) throws IOException {
        this.f6799h++;
        FileOutputStream fileOutputStream = new FileOutputStream(i());
        try {
            fileOutputStream.write(bArr, 0, i2);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                e.d.b.e.a.c.a0.a.a(th, th2);
            }
            throw th;
        }
    }

    public final int l() throws IOException {
        File i2 = this.f6794c.i(this.f6795d, this.f6796e, this.f6797f, this.f6798g);
        if (i2.exists()) {
            FileInputStream fileInputStream = new FileInputStream(i2);
            try {
                Properties properties = new Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
                    return -1;
                }
                if (properties.getProperty("previousChunk") != null) {
                    return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
                }
                throw new p0("Slice checkpoint file corrupt.");
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    e.d.b.e.a.c.a0.a.a(th, th2);
                }
                throw th;
            }
        }
        return 0;
    }

    public final boolean m() {
        File i2 = this.f6794c.i(this.f6795d, this.f6796e, this.f6797f, this.f6798g);
        if (i2.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(i2);
                Properties properties = new Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") != null) {
                    return Integer.parseInt(properties.getProperty("fileStatus")) == 4;
                }
                a.a(6, "Slice checkpoint file corrupt while checking if extraction finished.", new Object[0]);
                return false;
            } catch (IOException e2) {
                a.a(6, "Could not read checkpoint while checking if extraction finished. %s", new Object[]{e2});
                return false;
            }
        }
        return false;
    }

    public final File n() {
        File n2 = this.f6794c.n(this.f6795d, this.f6796e, this.f6797f, this.f6798g);
        if (!n2.exists()) {
            n2.mkdirs();
        }
        return n2;
    }

    public final File o() throws IOException {
        File i2 = this.f6794c.i(this.f6795d, this.f6796e, this.f6797f, this.f6798g);
        i2.getParentFile().mkdirs();
        i2.createNewFile();
        return i2;
    }
}

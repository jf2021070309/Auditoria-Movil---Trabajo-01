package c.v;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
/* loaded from: classes.dex */
public class i implements c.x.a.c {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2796b;

    /* renamed from: c  reason: collision with root package name */
    public final File f2797c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2798d;

    /* renamed from: e  reason: collision with root package name */
    public final c.x.a.c f2799e;

    /* renamed from: f  reason: collision with root package name */
    public a f2800f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2801g;

    @Override // c.x.a.c
    public synchronized c.x.a.b A() {
        if (!this.f2801g) {
            f();
            this.f2801g = true;
        }
        return this.f2799e.A();
    }

    public final void a(File file) throws IOException {
        ReadableByteChannel channel;
        if (this.f2796b != null) {
            channel = Channels.newChannel(this.a.getAssets().open(this.f2796b));
        } else if (this.f2797c == null) {
            throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
        } else {
            channel = new FileInputStream(this.f2797c).getChannel();
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.a.getCacheDir());
        createTempFile.deleteOnExit();
        FileChannel channel2 = new FileOutputStream(createTempFile).getChannel();
        try {
            if (Build.VERSION.SDK_INT <= 23) {
                InputStream newInputStream = Channels.newInputStream(channel);
                OutputStream newOutputStream = Channels.newOutputStream(channel2);
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = newInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    newOutputStream.write(bArr, 0, read);
                }
            } else {
                channel2.transferFrom(channel, 0L, Long.MAX_VALUE);
            }
            channel2.force(false);
            channel.close();
            channel2.close();
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                StringBuilder y = e.a.d.a.a.y("Failed to create directories for ");
                y.append(file.getAbsolutePath());
                throw new IOException(y.toString());
            } else if (createTempFile.renameTo(file)) {
            } else {
                StringBuilder y2 = e.a.d.a.a.y("Failed to move intermediate file (");
                y2.append(createTempFile.getAbsolutePath());
                y2.append(") to destination (");
                y2.append(file.getAbsolutePath());
                y2.append(").");
                throw new IOException(y2.toString());
            }
        } catch (Throwable th) {
            channel.close();
            channel2.close();
            throw th;
        }
    }

    @Override // c.x.a.c, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f2799e.close();
        this.f2801g = false;
    }

    public final void f() {
        String databaseName = this.f2799e.getDatabaseName();
        File databasePath = this.a.getDatabasePath(databaseName);
        c.v.l.a aVar = new c.v.l.a(databaseName, this.a.getFilesDir(), this.f2800f == null);
        try {
            aVar.f2806c.lock();
            if (aVar.f2807d) {
                try {
                    FileChannel channel = new FileOutputStream(aVar.f2805b).getChannel();
                    aVar.f2808e = channel;
                    channel.lock();
                } catch (IOException e2) {
                    throw new IllegalStateException("Unable to grab copy lock.", e2);
                }
            }
            if (!databasePath.exists()) {
                try {
                    a(databasePath);
                    aVar.a();
                    return;
                } catch (IOException e3) {
                    throw new RuntimeException("Unable to copy database file.", e3);
                }
            } else if (this.f2800f == null) {
                aVar.a();
                return;
            } else {
                try {
                    int b2 = c.v.l.b.b(databasePath);
                    int i2 = this.f2798d;
                    if (b2 == i2) {
                        aVar.a();
                        return;
                    } else if (this.f2800f.a(b2, i2)) {
                        aVar.a();
                        return;
                    } else {
                        if (this.a.deleteDatabase(databaseName)) {
                            try {
                                a(databasePath);
                            } catch (IOException e4) {
                                Log.w("ROOM", "Unable to copy database file.", e4);
                            }
                        } else {
                            Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                        }
                        aVar.a();
                        return;
                    }
                } catch (IOException e5) {
                    Log.w("ROOM", "Unable to read database version.", e5);
                    aVar.a();
                    return;
                }
            }
        } catch (Throwable th) {
            aVar.a();
            throw th;
        }
        aVar.a();
        throw th;
    }

    @Override // c.x.a.c
    public String getDatabaseName() {
        return this.f2799e.getDatabaseName();
    }

    @Override // c.x.a.c
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.f2799e.setWriteAheadLoggingEnabled(z);
    }
}

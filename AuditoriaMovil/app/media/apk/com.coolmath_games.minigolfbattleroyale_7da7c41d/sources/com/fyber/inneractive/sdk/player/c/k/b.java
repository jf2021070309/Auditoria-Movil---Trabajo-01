package com.fyber.inneractive.sdk.player.c.k;

import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
/* loaded from: classes.dex */
public final class b {
    public final File a;
    public final File b;

    public b(File file) {
        this.a = file;
        this.b = new File(file.getPath() + ".bak");
    }

    public final OutputStream a() throws IOException {
        if (this.a.exists()) {
            if (!this.b.exists()) {
                if (!this.a.renameTo(this.b)) {
                    Log.w("AtomicFile", "Couldn't rename file " + this.a + " to backup file " + this.b);
                }
            } else {
                this.a.delete();
            }
        }
        try {
            return new a(this.a);
        } catch (FileNotFoundException unused) {
            if (!this.a.getParentFile().mkdirs()) {
                throw new IOException("Couldn't create directory " + this.a);
            }
            try {
                return new a(this.a);
            } catch (FileNotFoundException unused2) {
                throw new IOException("Couldn't create " + this.a);
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class a extends OutputStream {
        private final FileOutputStream a;
        private boolean b = false;

        public a(File file) throws FileNotFoundException {
            this.a = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.b) {
                return;
            }
            this.b = true;
            flush();
            try {
                this.a.getFD().sync();
            } catch (IOException e) {
                Log.w("AtomicFile", "Failed to sync file descriptor:", e);
            }
            this.a.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() throws IOException {
            this.a.flush();
        }

        @Override // java.io.OutputStream
        public final void write(int i) throws IOException {
            this.a.write(i);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) throws IOException {
            this.a.write(bArr);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) throws IOException {
            this.a.write(bArr, i, i2);
        }
    }
}

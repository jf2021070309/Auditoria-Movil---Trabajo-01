package com.amazon.aps.iva.t5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
/* compiled from: AtomicFile.java */
/* loaded from: classes.dex */
public final class a {
    public final File a;
    public final File b;

    /* compiled from: AtomicFile.java */
    /* renamed from: com.amazon.aps.iva.t5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0731a extends OutputStream {
        public final FileOutputStream b;
        public boolean c = false;

        public C0731a(File file) throws FileNotFoundException {
            this.b = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            FileOutputStream fileOutputStream = this.b;
            if (this.c) {
                return;
            }
            this.c = true;
            flush();
            try {
                fileOutputStream.getFD().sync();
            } catch (IOException e) {
                p.h("Failed to sync file descriptor:", e);
            }
            fileOutputStream.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() throws IOException {
            this.b.flush();
        }

        @Override // java.io.OutputStream
        public final void write(int i) throws IOException {
            this.b.write(i);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) throws IOException {
            this.b.write(bArr);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) throws IOException {
            this.b.write(bArr, i, i2);
        }
    }

    public a(File file) {
        this.a = file;
        this.b = new File(file.getPath() + ".bak");
    }

    public final C0731a a() throws IOException {
        File file = this.a;
        if (file.exists()) {
            File file2 = this.b;
            if (!file2.exists()) {
                if (!file.renameTo(file2)) {
                    file.toString();
                    file2.toString();
                    p.g();
                }
            } else {
                file.delete();
            }
        }
        try {
            return new C0731a(file);
        } catch (FileNotFoundException e) {
            File parentFile = file.getParentFile();
            if (parentFile != null && parentFile.mkdirs()) {
                try {
                    return new C0731a(file);
                } catch (FileNotFoundException e2) {
                    throw new IOException("Couldn't create " + file, e2);
                }
            }
            throw new IOException("Couldn't create " + file, e);
        }
    }
}

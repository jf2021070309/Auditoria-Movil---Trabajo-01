package ch.qos.logback.core.joran.spi;

import java.io.IOException;
import java.io.OutputStream;
@Deprecated
/* loaded from: classes.dex */
public enum ConsoleTarget {
    SystemOut("System.out", new OutputStream() { // from class: ch.qos.logback.core.joran.spi.ConsoleTarget.a
        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            System.out.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i2) throws IOException {
            System.out.write(i2);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            System.out.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i2, int i3) throws IOException {
            System.out.write(bArr, i2, i3);
        }
    }),
    SystemErr("System.err", new OutputStream() { // from class: ch.qos.logback.core.joran.spi.ConsoleTarget.b
        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            System.err.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i2) throws IOException {
            System.err.write(i2);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            System.err.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i2, int i3) throws IOException {
            System.err.write(bArr, i2, i3);
        }
    });
    
    private final String name;
    private final OutputStream stream;

    ConsoleTarget(String str, OutputStream outputStream) {
        this.name = str;
        this.stream = outputStream;
    }

    public static ConsoleTarget findByName(String str) {
        ConsoleTarget[] values = values();
        for (int i2 = 0; i2 < 2; i2++) {
            ConsoleTarget consoleTarget = values[i2];
            if (consoleTarget.name.equalsIgnoreCase(str)) {
                return consoleTarget;
            }
        }
        return null;
    }

    public String getName() {
        return this.name;
    }

    public OutputStream getStream() {
        return this.stream;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }
}

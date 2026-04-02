package ch.qos.logback.core.recovery;

import e.a.d.a.a;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
/* loaded from: classes.dex */
public class ResilientFileOutputStream extends ResilientOutputStreamBase {
    private File file;
    private FileOutputStream fos;

    public ResilientFileOutputStream(File file, boolean z, long j2) throws FileNotFoundException {
        this.file = file;
        this.fos = new FileOutputStream(file, z);
        this.os = new BufferedOutputStream(this.fos, (int) j2);
        this.presumedClean = true;
    }

    public FileChannel getChannel() {
        if (this.os == null) {
            return null;
        }
        return this.fos.getChannel();
    }

    @Override // ch.qos.logback.core.recovery.ResilientOutputStreamBase
    public String getDescription() {
        StringBuilder y = a.y("file [");
        y.append(this.file);
        y.append("]");
        return y.toString();
    }

    public File getFile() {
        return this.file;
    }

    @Override // ch.qos.logback.core.recovery.ResilientOutputStreamBase
    public OutputStream openNewOutputStream() throws IOException {
        this.fos = new FileOutputStream(this.file, true);
        return new BufferedOutputStream(this.fos);
    }

    public String toString() {
        StringBuilder y = a.y("c.q.l.c.recovery.ResilientFileOutputStream@");
        y.append(System.identityHashCode(this));
        return y.toString();
    }
}

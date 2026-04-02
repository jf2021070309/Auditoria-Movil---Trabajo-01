package ch.qos.logback.core;

import ch.qos.logback.core.recovery.ResilientFileOutputStream;
import ch.qos.logback.core.util.ContextUtil;
import ch.qos.logback.core.util.EnvUtil;
import ch.qos.logback.core.util.FileSize;
import ch.qos.logback.core.util.FileUtil;
import e.a.d.a.a;
import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Map;
/* loaded from: classes.dex */
public class FileAppender<E> extends OutputStreamAppender<E> {
    public static String COLLISION_WITH_EARLIER_APPENDER_URL = "http://logback.qos.ch/codes.html#earlier_fa_collision";
    public static final long DEFAULT_BUFFER_SIZE = 8192;
    public boolean append = true;
    public String fileName = null;
    private boolean prudent = false;
    private boolean initialized = false;
    private boolean lazyInit = false;
    private FileSize bufferSize = new FileSize(DEFAULT_BUFFER_SIZE);

    private String getAbsoluteFilePath(String str) {
        return (!EnvUtil.isAndroidOS() || new File(str).isAbsolute()) ? str : FileUtil.prefixRelativePath(this.context.getProperty(CoreConstants.DATA_DIR_KEY), str);
    }

    private void safeWrite(E e2) throws IOException {
        ResilientFileOutputStream resilientFileOutputStream = (ResilientFileOutputStream) getOutputStream();
        FileChannel channel = resilientFileOutputStream.getChannel();
        if (channel == null) {
            return;
        }
        boolean interrupted = Thread.interrupted();
        FileLock fileLock = null;
        try {
            try {
                fileLock = channel.lock();
                long position = channel.position();
                long size = channel.size();
                if (size != position) {
                    channel.position(size);
                }
                super.writeOut(e2);
                if (fileLock != null && fileLock.isValid()) {
                    fileLock.release();
                }
                if (!interrupted) {
                    return;
                }
            } catch (IOException e3) {
                resilientFileOutputStream.postIOFailure(e3);
                if (fileLock != null && fileLock.isValid()) {
                    fileLock.release();
                }
                if (!interrupted) {
                    return;
                }
            }
            Thread.currentThread().interrupt();
        } catch (Throwable th) {
            if (fileLock != null && fileLock.isValid()) {
                fileLock.release();
            }
            if (interrupted) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }
    }

    public void addErrorForCollision(String str, String str2, String str3) {
        addError("'" + str + "' option has the same value \"" + str2 + "\" as that given for appender [" + str3 + "] defined earlier.");
    }

    public boolean checkForFileCollisionInPreviousFileAppenders() {
        Map map;
        boolean z = false;
        if (this.fileName == null || (map = (Map) this.context.getObject(CoreConstants.FA_FILENAME_COLLISION_MAP)) == null) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (this.fileName.equals(entry.getValue())) {
                addErrorForCollision("File", (String) entry.getValue(), (String) entry.getKey());
                z = true;
            }
        }
        if (this.name != null) {
            map.put(getName(), this.fileName);
        }
        return z;
    }

    public String getFile() {
        return this.fileName;
    }

    public boolean getLazy() {
        return this.lazyInit;
    }

    public boolean isAppend() {
        return this.append;
    }

    public boolean isPrudent() {
        return this.prudent;
    }

    public boolean openFile(String str) throws IOException {
        String absoluteFilePath = getAbsoluteFilePath(str);
        this.lock.lock();
        try {
            File file = new File(absoluteFilePath);
            if (!FileUtil.createMissingParentDirectories(file)) {
                addError("Failed to create parent directories for [" + file.getAbsolutePath() + "]");
            }
            ResilientFileOutputStream resilientFileOutputStream = new ResilientFileOutputStream(file, this.append, this.bufferSize.getSize());
            resilientFileOutputStream.setContext(this.context);
            setOutputStream(resilientFileOutputStream);
            return true;
        } finally {
            this.lock.unlock();
        }
    }

    public final String rawFileProperty() {
        return this.fileName;
    }

    public void setAppend(boolean z) {
        this.append = z;
    }

    public void setBufferSize(FileSize fileSize) {
        StringBuilder y = a.y("Setting bufferSize to [");
        y.append(fileSize.toString());
        y.append("]");
        addInfo(y.toString());
        this.bufferSize = fileSize;
    }

    public void setFile(String str) {
        this.fileName = str == null ? null : str.trim();
    }

    public void setLazy(boolean z) {
        this.lazyInit = z;
    }

    public void setPrudent(boolean z) {
        this.prudent = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // ch.qos.logback.core.OutputStreamAppender, ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void start() {
        /*
            r5 = this;
            java.lang.String r0 = r5.getFile()
            java.lang.String r1 = "]"
            r2 = 1
            if (r0 == 0) goto L71
            java.lang.String r0 = r5.getAbsoluteFilePath(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "File property is set to ["
            r3.append(r4)
            r3.append(r0)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r5.addInfo(r1)
            boolean r1 = r5.prudent
            if (r1 == 0) goto L36
            boolean r1 = r5.isAppend()
            if (r1 != 0) goto L36
            r5.setAppend(r2)
            java.lang.String r1 = "Setting \"Append\" property to true on account of \"Prudent\" mode"
            r5.addWarn(r1)
        L36:
            boolean r1 = r5.lazyInit
            if (r1 != 0) goto L67
            boolean r1 = r5.checkForFileCollisionInPreviousFileAppenders()
            if (r1 == 0) goto L48
            java.lang.String r0 = "Collisions detected with FileAppender/RollingAppender instances defined earlier. Aborting."
            r5.addError(r0)
            java.lang.String r0 = ch.qos.logback.core.FileAppender.COLLISION_WITH_EARLIER_APPENDER_URL
            goto L7d
        L48:
            r5.openFile(r0)     // Catch: java.io.IOException -> L4c
            goto L6f
        L4c:
            r1 = move-exception
            java.lang.String r3 = "openFile("
            java.lang.String r4 = ","
            java.lang.StringBuilder r0 = e.a.d.a.a.B(r3, r0, r4)
            boolean r3 = r5.append
            r0.append(r3)
            java.lang.String r3 = ") failed"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r5.addError(r0, r1)
            goto L80
        L67:
            ch.qos.logback.core.NOPOutputStream r0 = new ch.qos.logback.core.NOPOutputStream
            r0.<init>()
            r5.setOutputStream(r0)
        L6f:
            r2 = 0
            goto L80
        L71:
            java.lang.String r0 = "\"File\" property not set for appender named ["
            java.lang.StringBuilder r0 = e.a.d.a.a.y(r0)
            java.lang.String r3 = r5.name
            java.lang.String r0 = e.a.d.a.a.r(r0, r3, r1)
        L7d:
            r5.addError(r0)
        L80:
            if (r2 != 0) goto L85
            super.start()
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.qos.logback.core.FileAppender.start():void");
    }

    @Override // ch.qos.logback.core.OutputStreamAppender, ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        super.stop();
        Map<String, String> filenameCollisionMap = ContextUtil.getFilenameCollisionMap(this.context);
        if (filenameCollisionMap == null || getName() == null) {
            return;
        }
        filenameCollisionMap.remove(getName());
    }

    @Override // ch.qos.logback.core.OutputStreamAppender
    public void subAppend(E e2) {
        if (!this.initialized && this.lazyInit) {
            this.initialized = true;
            if (checkForFileCollisionInPreviousFileAppenders()) {
                addError("Collisions detected with FileAppender/RollingAppender instances defined earlier. Aborting.");
                addError(COLLISION_WITH_EARLIER_APPENDER_URL);
            } else {
                try {
                    openFile(getFile());
                    super.start();
                } catch (IOException e3) {
                    this.started = false;
                    StringBuilder y = a.y("openFile(");
                    y.append(this.fileName);
                    y.append(",");
                    y.append(this.append);
                    y.append(") failed");
                    addError(y.toString(), e3);
                }
            }
        }
        super.subAppend(e2);
    }

    @Override // ch.qos.logback.core.OutputStreamAppender
    public void writeOut(E e2) throws IOException {
        if (this.prudent) {
            safeWrite(e2);
        } else {
            super.writeOut(e2);
        }
    }
}

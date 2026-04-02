package ch.qos.logback.core;

import ch.qos.logback.core.encoder.Encoder;
import ch.qos.logback.core.encoder.LayoutWrappingEncoder;
import ch.qos.logback.core.spi.DeferredProcessingAware;
import ch.qos.logback.core.status.ErrorStatus;
import e.a.d.a.a;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public class OutputStreamAppender<E> extends UnsynchronizedAppenderBase<E> {
    public Encoder<E> encoder;
    private OutputStream outputStream;
    public final ReentrantLock lock = new ReentrantLock(false);
    private boolean immediateFlush = true;

    private void writeBytes(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return;
        }
        this.lock.lock();
        try {
            this.outputStream.write(bArr);
            if (this.immediateFlush) {
                this.outputStream.flush();
            }
        } finally {
            this.lock.unlock();
        }
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase
    public void append(E e2) {
        if (isStarted()) {
            subAppend(e2);
        }
    }

    public void closeOutputStream() {
        if (this.outputStream != null) {
            try {
                encoderClose();
                this.outputStream.close();
                this.outputStream = null;
            } catch (IOException e2) {
                addStatus(new ErrorStatus("Could not close output stream for OutputStreamAppender.", this, e2));
            }
        }
    }

    public void encoderClose() {
        Encoder<E> encoder = this.encoder;
        if (encoder == null || this.outputStream == null) {
            return;
        }
        try {
            writeBytes(encoder.footerBytes());
        } catch (IOException e2) {
            this.started = false;
            addStatus(new ErrorStatus(a.r(a.y("Failed to write footer for appender named ["), this.name, "]."), this, e2));
        }
    }

    public void encoderInit() {
        Encoder<E> encoder = this.encoder;
        if (encoder == null || this.outputStream == null) {
            return;
        }
        try {
            writeBytes(encoder.headerBytes());
        } catch (IOException e2) {
            this.started = false;
            addStatus(new ErrorStatus(a.r(a.y("Failed to initialize encoder for appender named ["), this.name, "]."), this, e2));
        }
    }

    public Encoder<E> getEncoder() {
        return this.encoder;
    }

    public OutputStream getOutputStream() {
        return this.outputStream;
    }

    public boolean isImmediateFlush() {
        return this.immediateFlush;
    }

    public void setEncoder(Encoder<E> encoder) {
        this.encoder = encoder;
    }

    public void setImmediateFlush(boolean z) {
        this.immediateFlush = z;
    }

    public void setLayout(Layout<E> layout) {
        addWarn("This appender no longer admits a layout as a sub-component, set an encoder instead.");
        addWarn("To ensure compatibility, wrapping your layout in LayoutWrappingEncoder.");
        addWarn("See also http://logback.qos.ch/codes.html#layoutInsteadOfEncoder for details");
        LayoutWrappingEncoder layoutWrappingEncoder = new LayoutWrappingEncoder();
        layoutWrappingEncoder.setLayout(layout);
        layoutWrappingEncoder.setContext(this.context);
        this.encoder = layoutWrappingEncoder;
    }

    public void setOutputStream(OutputStream outputStream) {
        this.lock.lock();
        try {
            closeOutputStream();
            this.outputStream = outputStream;
            if (this.encoder == null) {
                addWarn("Encoder has not been set. Cannot invoke its init method.");
            } else {
                encoderInit();
            }
        } finally {
            this.lock.unlock();
        }
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        int i2;
        if (this.encoder == null) {
            addStatus(new ErrorStatus(a.r(a.y("No encoder set for the appender named \""), this.name, "\"."), this));
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (this.outputStream == null) {
            addStatus(new ErrorStatus(a.r(a.y("No output stream set for the appender named \""), this.name, "\"."), this));
            i2++;
        }
        if (i2 == 0) {
            super.start();
        }
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.lock.lock();
        try {
            closeOutputStream();
            super.stop();
        } finally {
            this.lock.unlock();
        }
    }

    public void subAppend(E e2) {
        if (isStarted()) {
            try {
                if (e2 instanceof DeferredProcessingAware) {
                    ((DeferredProcessingAware) e2).prepareForDeferredProcessing();
                }
                writeBytes(this.encoder.encode(e2));
            } catch (IOException e3) {
                this.started = false;
                addStatus(new ErrorStatus("IO failure in appender", this, e3));
            }
        }
    }

    public void writeOut(E e2) throws IOException {
        writeBytes(this.encoder.encode(e2));
    }
}

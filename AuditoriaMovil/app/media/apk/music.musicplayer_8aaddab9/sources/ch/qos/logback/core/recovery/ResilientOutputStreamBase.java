package ch.qos.logback.core.recovery;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.status.ErrorStatus;
import ch.qos.logback.core.status.InfoStatus;
import ch.qos.logback.core.status.Status;
import ch.qos.logback.core.status.StatusManager;
import e.a.d.a.a;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
/* loaded from: classes.dex */
public abstract class ResilientOutputStreamBase extends OutputStream {
    public static final int STATUS_COUNT_LIMIT = 8;
    private Context context;
    public OutputStream os;
    private RecoveryCoordinator recoveryCoordinator;
    private int noContextWarning = 0;
    private int statusCount = 0;
    public boolean presumedClean = true;

    private boolean isPresumedInError() {
        return (this.recoveryCoordinator == null || this.presumedClean) ? false : true;
    }

    private void postSuccessfulWrite() {
        if (this.recoveryCoordinator != null) {
            this.recoveryCoordinator = null;
            this.statusCount = 0;
            StringBuilder y = a.y("Recovered from IO failure on ");
            y.append(getDescription());
            addStatus(new InfoStatus(y.toString(), this));
        }
    }

    public void addStatus(Status status) {
        Context context = this.context;
        if (context != null) {
            StatusManager statusManager = context.getStatusManager();
            if (statusManager != null) {
                statusManager.add(status);
                return;
            }
            return;
        }
        int i2 = this.noContextWarning;
        this.noContextWarning = i2 + 1;
        if (i2 == 0) {
            PrintStream printStream = System.out;
            printStream.println("LOGBACK: No context given for " + this);
        }
    }

    public void addStatusIfCountNotOverLimit(Status status) {
        int i2 = this.statusCount + 1;
        this.statusCount = i2;
        if (i2 < 8) {
            addStatus(status);
        }
        if (this.statusCount == 8) {
            addStatus(status);
            StringBuilder y = a.y("Will supress future messages regarding ");
            y.append(getDescription());
            addStatus(new InfoStatus(y.toString(), this));
        }
    }

    public void attemptRecovery() {
        try {
            close();
        } catch (IOException unused) {
        }
        StringBuilder y = a.y("Attempting to recover from IO failure on ");
        y.append(getDescription());
        addStatusIfCountNotOverLimit(new InfoStatus(y.toString(), this));
        try {
            this.os = openNewOutputStream();
            this.presumedClean = true;
        } catch (IOException e2) {
            StringBuilder y2 = a.y("Failed to open ");
            y2.append(getDescription());
            addStatusIfCountNotOverLimit(new ErrorStatus(y2.toString(), this, e2));
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        OutputStream outputStream = this.os;
        if (outputStream != null) {
            outputStream.close();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        OutputStream outputStream = this.os;
        if (outputStream != null) {
            try {
                outputStream.flush();
                postSuccessfulWrite();
            } catch (IOException e2) {
                postIOFailure(e2);
            }
        }
    }

    public Context getContext() {
        return this.context;
    }

    public abstract String getDescription();

    public abstract OutputStream openNewOutputStream() throws IOException;

    public void postIOFailure(IOException iOException) {
        StringBuilder y = a.y("IO failure while writing to ");
        y.append(getDescription());
        addStatusIfCountNotOverLimit(new ErrorStatus(y.toString(), this, iOException));
        this.presumedClean = false;
        if (this.recoveryCoordinator == null) {
            this.recoveryCoordinator = new RecoveryCoordinator();
        }
    }

    public void setContext(Context context) {
        this.context = context;
    }

    @Override // java.io.OutputStream
    public void write(int i2) {
        if (isPresumedInError()) {
            if (this.recoveryCoordinator.isTooSoon()) {
                return;
            }
            attemptRecovery();
            return;
        }
        try {
            this.os.write(i2);
            postSuccessfulWrite();
        } catch (IOException e2) {
            postIOFailure(e2);
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i2, int i3) {
        if (isPresumedInError()) {
            if (this.recoveryCoordinator.isTooSoon()) {
                return;
            }
            attemptRecovery();
            return;
        }
        try {
            this.os.write(bArr, i2, i3);
            postSuccessfulWrite();
        } catch (IOException e2) {
            postIOFailure(e2);
        }
    }
}

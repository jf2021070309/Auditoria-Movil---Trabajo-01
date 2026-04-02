package com.google.zxing;
/* loaded from: classes4.dex */
public abstract class ReaderException extends Exception {
    protected static final StackTraceElement[] NO_TRACE;
    protected static boolean isStackTrace;

    static {
        boolean z;
        if (System.getProperty("surefire.test.class.path") != null) {
            z = true;
        } else {
            z = false;
        }
        isStackTrace = z;
        NO_TRACE = new StackTraceElement[0];
    }

    public ReaderException() {
    }

    public static void setStackTrace(boolean z) {
        isStackTrace = z;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }

    public ReaderException(Throwable th) {
        super(th);
    }
}

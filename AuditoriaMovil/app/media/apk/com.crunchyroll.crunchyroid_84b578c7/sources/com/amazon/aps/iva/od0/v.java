package com.amazon.aps.iva.od0;
/* compiled from: UninitializedMessageException.java */
/* loaded from: classes4.dex */
public final class v extends RuntimeException {
    public final /* synthetic */ int b = 0;
    public final com.amazon.aps.iva.ob0.g c;

    public v(com.amazon.aps.iva.ob0.g gVar) {
        this.c = gVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.b) {
            case 1:
                setStackTrace(new StackTraceElement[0]);
                return this;
            default:
                return super.fillInStackTrace();
        }
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        switch (this.b) {
            case 1:
                return this.c.toString();
            default:
                return super.getLocalizedMessage();
        }
    }

    public v() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.c = null;
    }
}

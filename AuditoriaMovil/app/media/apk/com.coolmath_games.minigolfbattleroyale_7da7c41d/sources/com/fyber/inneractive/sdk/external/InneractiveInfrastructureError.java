package com.fyber.inneractive.sdk.external;
/* loaded from: classes.dex */
public class InneractiveInfrastructureError extends InneractiveError {
    private final InneractiveErrorCode a;
    private Throwable b;

    public InneractiveInfrastructureError(InneractiveErrorCode inneractiveErrorCode) {
        this.a = inneractiveErrorCode;
    }

    public InneractiveInfrastructureError(InneractiveErrorCode inneractiveErrorCode, Throwable th) {
        this(inneractiveErrorCode);
        this.b = th;
    }

    public void setCause(Throwable th) {
        this.b = th;
    }

    public InneractiveErrorCode getErrorCode() {
        return this.a;
    }

    public Throwable getCause() {
        return this.b;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveError
    public String description() {
        StringBuilder sb = new StringBuilder();
        InneractiveErrorCode inneractiveErrorCode = this.a;
        if (inneractiveErrorCode != null) {
            sb.append(inneractiveErrorCode);
        }
        if (this.b != null) {
            sb.append(": ");
            sb.append(this.b);
        }
        return sb.toString();
    }
}

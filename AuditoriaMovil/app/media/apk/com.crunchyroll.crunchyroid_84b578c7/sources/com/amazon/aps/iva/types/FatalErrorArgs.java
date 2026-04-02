package com.amazon.aps.iva.types;
/* loaded from: classes.dex */
public class FatalErrorArgs {
    private int errorCode;
    private String errorMessage;

    /* loaded from: classes.dex */
    public static class FatalErrorArgsBuilder {
        private int errorCode;
        private String errorMessage;

        public FatalErrorArgs build() {
            return new FatalErrorArgs(this.errorCode, this.errorMessage);
        }

        public FatalErrorArgsBuilder errorCode(int i) {
            this.errorCode = i;
            return this;
        }

        public FatalErrorArgsBuilder errorMessage(String str) {
            this.errorMessage = str;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("FatalErrorArgs.FatalErrorArgsBuilder(errorCode=");
            sb.append(this.errorCode);
            sb.append(", errorMessage=");
            return b.c(sb, this.errorMessage, ")");
        }
    }

    public FatalErrorArgs(int i, String str) {
        this.errorCode = i;
        this.errorMessage = str;
    }

    public static FatalErrorArgsBuilder builder() {
        return new FatalErrorArgsBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof FatalErrorArgs;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FatalErrorArgs)) {
            return false;
        }
        FatalErrorArgs fatalErrorArgs = (FatalErrorArgs) obj;
        if (!fatalErrorArgs.canEqual(this) || getErrorCode() != fatalErrorArgs.getErrorCode()) {
            return false;
        }
        String errorMessage = getErrorMessage();
        String errorMessage2 = fatalErrorArgs.getErrorMessage();
        if (errorMessage != null ? errorMessage.equals(errorMessage2) : errorMessage2 == null) {
            return true;
        }
        return false;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public int hashCode() {
        int hashCode;
        String errorMessage = getErrorMessage();
        int errorCode = (getErrorCode() + 59) * 59;
        if (errorMessage == null) {
            hashCode = 43;
        } else {
            hashCode = errorMessage.hashCode();
        }
        return errorCode + hashCode;
    }

    public String toString() {
        return "FatalErrorArgs(errorCode=" + getErrorCode() + ", errorMessage=" + getErrorMessage() + ")";
    }
}

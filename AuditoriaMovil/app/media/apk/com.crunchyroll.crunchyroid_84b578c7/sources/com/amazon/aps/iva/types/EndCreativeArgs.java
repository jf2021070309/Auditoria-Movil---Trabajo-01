package com.amazon.aps.iva.types;

import com.google.gson.annotations.SerializedName;
/* loaded from: classes.dex */
public class EndCreativeArgs {
    @SerializedName("code")
    private int endCreativeCode;
    @SerializedName("message")
    private String endCreativeMessage;

    /* loaded from: classes.dex */
    public static class EndCreativeArgsBuilder {
        private boolean endCreativeCode$set;
        private int endCreativeCode$value;
        private String endCreativeMessage;

        public EndCreativeArgs build() {
            int i = this.endCreativeCode$value;
            if (!this.endCreativeCode$set) {
                i = EndCreativeArgs.access$000();
            }
            return new EndCreativeArgs(i, this.endCreativeMessage);
        }

        public EndCreativeArgsBuilder endCreativeCode(int i) {
            this.endCreativeCode$value = i;
            this.endCreativeCode$set = true;
            return this;
        }

        public EndCreativeArgsBuilder endCreativeMessage(String str) {
            this.endCreativeMessage = str;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("EndCreativeArgs.EndCreativeArgsBuilder(endCreativeCode$value=");
            sb.append(this.endCreativeCode$value);
            sb.append(", endCreativeMessage=");
            return b.c(sb, this.endCreativeMessage, ")");
        }
    }

    private static int $default$endCreativeCode() {
        return -1;
    }

    public EndCreativeArgs(int i, String str) {
        this.endCreativeCode = i;
        this.endCreativeMessage = str;
    }

    public static /* synthetic */ int access$000() {
        return $default$endCreativeCode();
    }

    public static EndCreativeArgsBuilder builder() {
        return new EndCreativeArgsBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof EndCreativeArgs;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EndCreativeArgs)) {
            return false;
        }
        EndCreativeArgs endCreativeArgs = (EndCreativeArgs) obj;
        if (!endCreativeArgs.canEqual(this) || getEndCreativeCode() != endCreativeArgs.getEndCreativeCode()) {
            return false;
        }
        String endCreativeMessage = getEndCreativeMessage();
        String endCreativeMessage2 = endCreativeArgs.getEndCreativeMessage();
        if (endCreativeMessage != null ? endCreativeMessage.equals(endCreativeMessage2) : endCreativeMessage2 == null) {
            return true;
        }
        return false;
    }

    public int getEndCreativeCode() {
        return this.endCreativeCode;
    }

    public String getEndCreativeMessage() {
        return this.endCreativeMessage;
    }

    public int hashCode() {
        int hashCode;
        String endCreativeMessage = getEndCreativeMessage();
        int endCreativeCode = (getEndCreativeCode() + 59) * 59;
        if (endCreativeMessage == null) {
            hashCode = 43;
        } else {
            hashCode = endCreativeMessage.hashCode();
        }
        return endCreativeCode + hashCode;
    }

    public String toString() {
        return "EndCreativeArgs(endCreativeCode=" + getEndCreativeCode() + ", endCreativeMessage=" + getEndCreativeMessage() + ")";
    }
}

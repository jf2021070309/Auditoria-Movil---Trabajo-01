package com.amazon.aps.iva.br;

import com.amazon.aps.iva.b8.i;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
/* compiled from: NdkCrashLog.kt */
/* loaded from: classes2.dex */
public final class c {
    public final int a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;

    /* compiled from: NdkCrashLog.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static c a(String str) throws JsonParseException, IllegalStateException {
            JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
            int asInt = asJsonObject.get("signal").getAsInt();
            long asLong = asJsonObject.get("timestamp").getAsLong();
            String asString = asJsonObject.get("signal_name").getAsString();
            j.e(asString, "jsonObject.get(SIGNAL_NAME_KEY_NAME).asString");
            String asString2 = asJsonObject.get("message").getAsString();
            j.e(asString2, "jsonObject.get(MESSAGE_KEY_NAME).asString");
            String asString3 = asJsonObject.get("stacktrace").getAsString();
            j.e(asString3, "jsonObject.get(STACKTRACE_KEY_NAME).asString");
            return new c(asInt, asLong, asString, asString2, asString3);
        }
    }

    public c(int i, long j, String str, String str2, String str3) {
        this.a = i;
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.a == cVar.a && this.b == cVar.b && j.a(this.c, cVar.c) && j.a(this.d, cVar.d) && j.a(this.e, cVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + com.amazon.aps.iva.c80.a.b(this.d, com.amazon.aps.iva.c80.a.b(this.c, i.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NdkCrashLog(signal=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", signalName=");
        sb.append(this.c);
        sb.append(", message=");
        sb.append(this.d);
        sb.append(", stacktrace=");
        return defpackage.b.c(sb, this.e, ")");
    }
}

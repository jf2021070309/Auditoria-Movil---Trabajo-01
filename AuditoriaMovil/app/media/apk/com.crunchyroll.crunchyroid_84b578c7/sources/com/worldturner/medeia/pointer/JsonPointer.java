package com.worldturner.medeia.pointer;

import com.amazon.aps.iva.kb0.o;
import com.amazon.aps.iva.o0.t1;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.oe0.q;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: JsonPointer.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\b\u0010\b\u001a\u0004\u0018\u00010\u0000J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/worldturner/medeia/pointer/JsonPointer;", "", "Lcom/amazon/aps/iva/kb0/q;", "validate", "", "toString", "first", "firstName", "tail", "childPointer", "relativize", "other", "", "equals", "", "hashCode", "text", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "bypassValidation", "<init>", "(Ljava/lang/String;Z)V", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class JsonPointer {
    private final String text;

    public JsonPointer(String str, boolean z) {
        j.g(str, "text");
        this.text = str;
        if (z) {
            return;
        }
        validate();
    }

    private final void validate() {
        boolean z;
        int i = 0;
        if (this.text.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        if (this.text.charAt(0) == '/') {
            while (i < this.text.length()) {
                if (this.text.charAt(i) == '~') {
                    i++;
                    if (i < this.text.length()) {
                        char charAt = this.text.charAt(i);
                        if (charAt != '0' && charAt != '1') {
                            StringBuilder sb = new StringBuilder("Invalid ~ followed by ");
                            sb.append(this.text.charAt(i));
                            sb.append(" at index ");
                            sb.append(i);
                            sb.append(" - \"");
                            throw new IllegalArgumentException(t1.b(sb, this.text, '\"'));
                        }
                    } else {
                        throw new IllegalArgumentException(t1.b(new StringBuilder("Invalid ~ at end of pointer - \""), this.text, '\"'));
                    }
                }
                i++;
            }
            return;
        }
        throw new IllegalArgumentException(t1.b(new StringBuilder("Needs to start with a / - \""), this.text, '\"'));
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (true ^ j.a(JsonPointer.class, cls)) {
            return false;
        }
        if (obj != null) {
            return j.a(this.text, ((JsonPointer) obj).text);
        }
        throw new o("null cannot be cast to non-null type com.worldturner.medeia.pointer.JsonPointer");
    }

    public final String first() {
        String str = this.text;
        return JsonPointerKt.substringBefore(str, '/', str, 1);
    }

    public final String firstName() {
        String first = first();
        if (q.G0(first, '/')) {
            return JsonPointerKt.access$decodeJsonPointerElement(first, 1);
        }
        return JsonPointerKt.access$decodeJsonPointerElement(first, 0);
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode();
    }

    public final JsonPointer relativize(JsonPointer jsonPointer) {
        j.g(jsonPointer, "childPointer");
        String jsonPointer2 = jsonPointer.toString();
        if (m.h0(jsonPointer2, this.text, false)) {
            String substring = jsonPointer2.substring(this.text.length());
            j.b(substring, "(this as java.lang.String).substring(startIndex)");
            return new JsonPointer(substring, true);
        }
        return jsonPointer;
    }

    public final JsonPointer tail() {
        String substringFrom = JsonPointerKt.substringFrom(this.text, '/', "", 1);
        if (j.a(substringFrom, "")) {
            return null;
        }
        return new JsonPointer(substringFrom, true);
    }

    public String toString() {
        return this.text;
    }

    public /* synthetic */ JsonPointer(String str, boolean z, int i, e eVar) {
        this(str, (i & 2) != 0 ? false : z);
    }
}

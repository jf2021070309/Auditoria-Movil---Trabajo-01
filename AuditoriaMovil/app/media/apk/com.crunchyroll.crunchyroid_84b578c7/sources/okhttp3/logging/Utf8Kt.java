package okhttp3.logging;

import com.amazon.aps.iva.ef0.e;
import com.amazon.aps.iva.yb0.j;
import java.io.EOFException;
import kotlin.Metadata;
/* compiled from: utf8.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, d2 = {"Lcom/amazon/aps/iva/ef0/e;", "", "isProbablyUtf8", "okhttp-logging-interceptor"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class Utf8Kt {
    public static final boolean isProbablyUtf8(e eVar) {
        long j;
        j.f(eVar, "<this>");
        try {
            e eVar2 = new e();
            long j2 = eVar.c;
            if (j2 > 64) {
                j = 64;
            } else {
                j = j2;
            }
            eVar.h(0L, eVar2, j);
            for (int i = 0; i < 16; i++) {
                if (!eVar2.Y()) {
                    int C = eVar2.C();
                    if (Character.isISOControl(C) && !Character.isWhitespace(C)) {
                        return false;
                    }
                } else {
                    return true;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}

package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.bykvm_19do;

import android.util.Base64;
import java.nio.charset.Charset;
/* loaded from: classes.dex */
public class a implements c {
    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.bykvm_19do.c
    public <T> String a(T t) {
        return Base64.encodeToString(t.toString().getBytes(Charset.forName("UTF-8")), 0);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.bykvm_19do.c
    public <T> T b(T t) {
        return (T) new String(Base64.decode(t.toString().getBytes(Charset.forName("UTF-8")), 0), Charset.forName("UTF-8"));
    }
}

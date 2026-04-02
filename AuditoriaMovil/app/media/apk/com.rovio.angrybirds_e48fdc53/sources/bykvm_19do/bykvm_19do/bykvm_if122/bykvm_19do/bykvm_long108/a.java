package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_long108;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class a {
    private static final Map<String, InterfaceC0047a> a = Collections.synchronizedMap(new HashMap());

    /* renamed from: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_long108.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0047a {
        void a();

        void a(String str);
    }

    public static void a(String str) {
        InterfaceC0047a b;
        if (TextUtils.isEmpty(str) || (b = b(str)) == null) {
            return;
        }
        b.a();
    }

    public static void a(String str, String str2) {
        InterfaceC0047a b;
        if (TextUtils.isEmpty(str) || (b = b(str)) == null) {
            return;
        }
        b.a(str2);
    }

    private static InterfaceC0047a b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return a.remove(str);
    }
}

package com.amazon.aps.iva.ka0;

import com.amazon.aps.iva.n4.f0;
import java.util.Hashtable;
import java.util.Map;
/* loaded from: classes4.dex */
public interface e {

    /* loaded from: classes4.dex */
    public interface a {
        void c(Map map, boolean z);
    }

    @Deprecated
    /* loaded from: classes4.dex */
    public interface b {
    }

    default void a(String str, String str2, String str3, Hashtable<String, String> hashtable, a aVar) {
        b(str, str2, str3, hashtable, new f0(aVar, 9));
    }

    void b(String str, String str2, String str3, Hashtable hashtable, f0 f0Var);
}

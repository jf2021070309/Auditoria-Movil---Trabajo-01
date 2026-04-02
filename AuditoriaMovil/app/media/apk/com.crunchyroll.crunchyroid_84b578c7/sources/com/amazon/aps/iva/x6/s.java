package com.amazon.aps.iva.x6;

import android.net.Uri;
import java.util.List;
import java.util.Map;
/* compiled from: ExtractorsFactory.java */
/* loaded from: classes.dex */
public interface s {
    public static final r a = new s() { // from class: com.amazon.aps.iva.x6.r
        public final /* synthetic */ int b = 0;

        @Override // com.amazon.aps.iva.x6.s
        public final n[] b() {
            switch (this.b) {
                case 0:
                    return new n[0];
                case 1:
                    return new n[]{new com.amazon.aps.iva.n7.d()};
                default:
                    return new n[]{new com.amazon.aps.iva.z7.e(0)};
            }
        }
    };

    default n[] a(Uri uri, Map<String, List<String>> map) {
        return b();
    }

    n[] b();
}

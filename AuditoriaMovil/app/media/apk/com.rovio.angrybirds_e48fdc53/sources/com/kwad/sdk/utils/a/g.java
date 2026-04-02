package com.kwad.sdk.utils.a;

import com.kwad.sdk.utils.a.c;
import java.util.LinkedHashSet;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class g implements c.b<Set<String>> {
    static final g aLH = new g();

    private g() {
    }

    private static byte[] e(Set<String> set) {
        if (set.isEmpty()) {
            return new byte[0];
        }
        int size = set.size();
        int[] iArr = new int[size];
        String[] strArr = new String[size];
        int i = 0;
        int i2 = 0;
        for (String str : set) {
            if (str == null) {
                i += 5;
                iArr[i2] = -1;
            } else {
                int fT = b.fT(str);
                strArr[i2] = str;
                iArr[i2] = fT;
                i += b.dh(fT) + fT;
            }
            i2++;
        }
        b bVar = new b(i);
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = iArr[i3];
            bVar.dg(i4);
            if (i4 >= 0) {
                bVar.fS(strArr[i3]);
            }
        }
        return bVar.aKO;
    }

    private static Set<String> h(byte[] bArr, int i, int i2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (i2 > 0) {
            b bVar = new b(bArr, i);
            int i3 = i + i2;
            while (bVar.position < i3) {
                linkedHashSet.add(bVar.getString(bVar.Ke()));
            }
            if (bVar.position != i3) {
                throw new IllegalArgumentException("Invalid String set");
            }
        }
        return linkedHashSet;
    }

    @Override // com.kwad.sdk.utils.a.c.b
    public final String Ky() {
        return "StringSet";
    }

    @Override // com.kwad.sdk.utils.a.c.b
    public final /* synthetic */ Set<String> g(byte[] bArr, int i, int i2) {
        return h(bArr, i, i2);
    }

    @Override // com.kwad.sdk.utils.a.c.b
    public final /* synthetic */ byte[] o(Set<String> set) {
        return e(set);
    }
}

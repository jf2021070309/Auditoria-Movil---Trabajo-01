package com.amazon.aps.iva.ga0;

import com.amazon.aps.iva.a0.r;
import java.util.ArrayList;
/* loaded from: classes4.dex */
public final class h extends c {
    public static final ArrayList<String> d;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        d = arrayList;
        r.e(arrayList, "xseid", "ivwseid", "iviep", "xdrty");
    }

    public final String f() {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder("CustomerViewData: ");
        String str4 = "";
        if (a("xdrty") == null) {
            str = "";
        } else {
            str = "\n    viewDrmType: " + a("xdrty");
        }
        sb.append(str);
        if (a("xseid") == null) {
            str2 = "";
        } else {
            str2 = "\n    viewSessionId: " + a("xseid");
        }
        sb.append(str2);
        if (a("ivwseid") == null) {
            str3 = "";
        } else {
            str3 = "\n    internalViewSessionId: " + a("ivwseid");
        }
        sb.append(str3);
        if (a("iviep") != null) {
            str4 = "\n    getInternalVideoExperiments: " + a("iviep");
        }
        sb.append(str4);
        return sb.toString();
    }

    @Override // com.amazon.aps.iva.ga0.c
    public final void d() {
    }
}

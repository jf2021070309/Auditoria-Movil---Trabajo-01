package com.amazon.aps.iva.ga0;

import com.amazon.aps.iva.a0.r;
import java.util.ArrayList;
/* loaded from: classes4.dex */
public final class f extends c {
    public static final ArrayList<String> d;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        d = arrayList;
        r.e(arrayList, "dcnva", "fnm", "wty", "piiti");
        r.e(arrayList, "pnm", "pve", "ake", "ypyid");
        arrayList.add("uusid");
    }

    public final String f() {
        String str;
        String str2;
        String str3;
        Long valueOf;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        StringBuilder sb = new StringBuilder("CustomerPlayerData: ");
        String str10 = "";
        if (a("dcnva") == null) {
            str = "";
        } else {
            str = "\n    adConfigVariant: " + a("dcnva");
        }
        sb.append(str);
        if (a("fnm") == null) {
            str2 = "";
        } else {
            str2 = "\n    experimentName: " + a("fnm");
        }
        sb.append(str2);
        if (a("wty") == null) {
            str3 = "";
        } else {
            str3 = "\n    pageType: " + a("wty");
        }
        sb.append(str3);
        String a = a("piiti");
        Long l = null;
        if (a == null) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(Long.parseLong(a));
        }
        if (valueOf == null) {
            str4 = "";
        } else {
            StringBuilder sb2 = new StringBuilder("\n    playerInitTime: ");
            String a2 = a("piiti");
            if (a2 != null) {
                l = Long.valueOf(Long.parseLong(a2));
            }
            sb2.append(l);
            str4 = sb2.toString();
        }
        sb.append(str4);
        if (a("pnm") == null) {
            str5 = "";
        } else {
            str5 = "\n    playerName: " + a("pnm");
        }
        sb.append(str5);
        if (a("pve") == null) {
            str6 = "";
        } else {
            str6 = "\n    playerVersion: " + a("pve");
        }
        sb.append(str6);
        if (a("ake") == null) {
            str7 = "";
        } else {
            str7 = "\n    environmentKey: " + a("ake");
        }
        sb.append(str7);
        if (a("ake") == null) {
            str8 = "";
        } else {
            str8 = "\n    propertyKey: " + a("ake");
        }
        sb.append(str8);
        if (a("ypyid") == null) {
            str9 = "";
        } else {
            str9 = "\n    subPropertyId: " + a("ypyid");
        }
        sb.append(str9);
        if (a("uusid") != null) {
            str10 = "\n    viewerUserId: " + a("uusid");
        }
        sb.append(str10);
        return sb.toString();
    }

    @Override // com.amazon.aps.iva.ga0.c
    public final void d() {
    }
}

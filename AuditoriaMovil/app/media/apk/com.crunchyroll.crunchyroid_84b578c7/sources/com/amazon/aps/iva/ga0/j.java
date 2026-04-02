package com.amazon.aps.iva.ga0;

import com.amazon.aps.iva.a0.r;
import java.util.ArrayList;
/* loaded from: classes4.dex */
public final class j extends c {
    public static final ArrayList<String> d;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        d = arrayList;
        r.e(arrayList, "debug", "mapve", "memve", "mem");
        r.e(arrayList, "mvrid", "sex", "sid", "sst");
    }

    public final String f() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Long valueOf;
        String str6;
        String str7;
        Long valueOf2;
        Long valueOf3;
        StringBuilder sb = new StringBuilder("EnvironmentData: ");
        String str8 = "";
        if (a("debug") == null) {
            str = "";
        } else {
            str = "\n    debug: " + a("debug");
        }
        sb.append(str);
        if (a("mapve") == null) {
            str2 = "";
        } else {
            str2 = "\n    muxApiVersion: " + a("mapve");
        }
        sb.append(str2);
        if (a("mem") == null) {
            str3 = "";
        } else {
            str3 = "\n    muxEmbed: " + a("mem");
        }
        sb.append(str3);
        if (a("memve") == null) {
            str4 = "";
        } else {
            str4 = "\n    muxEmbedVersion: " + a("memve");
        }
        sb.append(str4);
        if (a("mvrid") == null) {
            str5 = "";
        } else {
            str5 = "\n    getMuxViewerId: " + a("mvrid");
        }
        sb.append(str5);
        String a = a("sex");
        Long l = null;
        if (a == null) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(Long.parseLong(a));
        }
        if (valueOf == null) {
            str6 = "";
        } else {
            StringBuilder sb2 = new StringBuilder("\n    sessionExpires: ");
            String a2 = a("sex");
            if (a2 == null) {
                valueOf3 = null;
            } else {
                valueOf3 = Long.valueOf(Long.parseLong(a2));
            }
            sb2.append(valueOf3);
            str6 = sb2.toString();
        }
        sb.append(str6);
        if (a("sid") == null) {
            str7 = "";
        } else {
            str7 = "\n    sessionId: " + a("sid");
        }
        sb.append(str7);
        String a3 = a("sst");
        if (a3 == null) {
            valueOf2 = null;
        } else {
            valueOf2 = Long.valueOf(Long.parseLong(a3));
        }
        if (valueOf2 != null) {
            StringBuilder sb3 = new StringBuilder("\n    sessionStart: ");
            String a4 = a("sst");
            if (a4 != null) {
                l = Long.valueOf(Long.parseLong(a4));
            }
            sb3.append(l);
            str8 = sb3.toString();
        }
        sb.append(str8);
        return sb.toString();
    }

    @Override // com.amazon.aps.iva.ga0.c
    public final void d() {
    }
}

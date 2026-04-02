package com.amazon.aps.iva.ga0;

import com.amazon.aps.iva.a0.r;
import java.util.ArrayList;
/* loaded from: classes4.dex */
public final class n extends c {
    public static final ArrayList<String> d;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        d = arrayList;
        r.e(arrayList, "vpour", "vsobi", "vsofp", "vsodm");
        r.e(arrayList, "vsodu", "vsoht", "vsohonm", "vsoisli");
        r.e(arrayList, "vsomity", "vsour", "vsowd", "vhb");
        r.e(arrayList, "vpthb", "vpttgdu", "vtgdu", "vtt");
    }

    public final String f() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        Long valueOf;
        String str12;
        Long valueOf2;
        String str13;
        Long valueOf3;
        String str14;
        Long valueOf4;
        Long valueOf5;
        Long valueOf6;
        Long valueOf7;
        StringBuilder sb = new StringBuilder("VideoData: ");
        String str15 = "";
        if (a("vpour") == null) {
            str = "";
        } else {
            str = "\n    videoPosterUrl: " + a("vpour");
        }
        sb.append(str);
        if (g() == null) {
            str2 = "";
        } else {
            str2 = "\n    videoSourceAdvertisedBitrate: " + g();
        }
        sb.append(str2);
        if (h() == null) {
            str3 = "";
        } else {
            str3 = "\n    videoSourceAdvertisedFramerate: " + h();
        }
        sb.append(str3);
        if (a("vsodm") == null) {
            str4 = "";
        } else {
            str4 = "\n    videoSourceDomain: " + a("vsodm");
        }
        sb.append(str4);
        if (i() == null) {
            str5 = "";
        } else {
            str5 = "\n    videoSourceDuration: " + i();
        }
        sb.append(str5);
        if (j() == null) {
            str6 = "";
        } else {
            str6 = "\n    videoSourceHeight: " + j();
        }
        sb.append(str6);
        if (a("vsohonm") == null) {
            str7 = "";
        } else {
            str7 = "\n    videoSourceHostName: " + a("vsohonm");
        }
        sb.append(str7);
        if (a("vsoisli") == null) {
            str8 = "";
        } else {
            str8 = "\n    videoSourceIsLive: " + a("vsoisli");
        }
        sb.append(str8);
        if (a("vsomity") == null) {
            str9 = "";
        } else {
            str9 = "\n    videoSourceMimeType: " + a("vsomity");
        }
        sb.append(str9);
        if (a("vsour") == null) {
            str10 = "";
        } else {
            str10 = "\n    videoSourceUrl: " + a("vsour");
        }
        sb.append(str10);
        if (k() == null) {
            str11 = "";
        } else {
            str11 = "\n    videoSourceWidth: " + k();
        }
        sb.append(str11);
        String a = a("vhb");
        Long l = null;
        if (a == null) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(Long.parseLong(a));
        }
        if (valueOf == null) {
            str12 = "";
        } else {
            StringBuilder sb2 = new StringBuilder("\n    videoHoldback: ");
            String a2 = a("vhb");
            if (a2 == null) {
                valueOf7 = null;
            } else {
                valueOf7 = Long.valueOf(Long.parseLong(a2));
            }
            sb2.append(valueOf7);
            str12 = sb2.toString();
        }
        sb.append(str12);
        String a3 = a("vpthb");
        if (a3 == null) {
            valueOf2 = null;
        } else {
            valueOf2 = Long.valueOf(Long.parseLong(a3));
        }
        if (valueOf2 == null) {
            str13 = "";
        } else {
            StringBuilder sb3 = new StringBuilder("\n    videoPartHoldback: ");
            String a4 = a("vpthb");
            if (a4 == null) {
                valueOf6 = null;
            } else {
                valueOf6 = Long.valueOf(Long.parseLong(a4));
            }
            sb3.append(valueOf6);
            str13 = sb3.toString();
        }
        sb.append(str13);
        String a5 = a("vpttgdu");
        if (a5 == null) {
            valueOf3 = null;
        } else {
            valueOf3 = Long.valueOf(Long.parseLong(a5));
        }
        if (valueOf3 == null) {
            str14 = "";
        } else {
            StringBuilder sb4 = new StringBuilder("\n    videoPartTargetDuration: ");
            String a6 = a("vpttgdu");
            if (a6 == null) {
                valueOf5 = null;
            } else {
                valueOf5 = Long.valueOf(Long.parseLong(a6));
            }
            sb4.append(valueOf5);
            str14 = sb4.toString();
        }
        sb.append(str14);
        String a7 = a("vtgdu");
        if (a7 == null) {
            valueOf4 = null;
        } else {
            valueOf4 = Long.valueOf(Long.parseLong(a7));
        }
        if (valueOf4 != null) {
            StringBuilder sb5 = new StringBuilder("\n    videoTargetDuration: ");
            String a8 = a("vtgdu");
            if (a8 != null) {
                l = Long.valueOf(Long.parseLong(a8));
            }
            sb5.append(l);
            str15 = sb5.toString();
        }
        sb.append(str15);
        return sb.toString();
    }

    public final Integer g() {
        String a = a("vsobi");
        if (a == null) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(a));
    }

    public final Float h() {
        String a = a("vsofp");
        if (a == null) {
            return null;
        }
        return Float.valueOf(Float.parseFloat(a));
    }

    public final Long i() {
        String a = a("vsodu");
        if (a == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(a));
    }

    public final Integer j() {
        String a = a("vsoht");
        if (a == null) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(a));
    }

    public final Integer k() {
        String a = a("vsowd");
        if (a == null) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(a));
    }

    @Override // com.amazon.aps.iva.ga0.c
    public final void d() {
    }
}

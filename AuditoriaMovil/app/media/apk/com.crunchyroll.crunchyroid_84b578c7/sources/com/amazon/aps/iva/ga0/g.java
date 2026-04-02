package com.amazon.aps.iva.ga0;

import com.amazon.aps.iva.a0.r;
import java.util.ArrayList;
/* loaded from: classes4.dex */
public final class g extends c {
    public static final ArrayList<String> d;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        d = arrayList;
        r.e(arrayList, "vdn", "vctty", "vdu", "vecva");
        r.e(arrayList, "vid", "visli", "vlacd", "vpd");
        r.e(arrayList, "vsr", "vsmty", "vtt", "vvaid");
        arrayList.add("vvanm");
        arrayList.add("vsour");
        arrayList.add("viep");
    }

    public final String f() {
        String str;
        String str2;
        Long valueOf;
        String str3;
        String str4;
        Boolean valueOf2;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        Long valueOf3;
        StringBuilder sb = new StringBuilder("CustomerVideoData: ");
        String str14 = "";
        if (a("vdn") == null) {
            str = "";
        } else {
            str = "\n    videoCdn: " + a("vdn");
        }
        sb.append(str);
        if (a("vctty") == null) {
            str2 = "";
        } else {
            str2 = "\n    videoContentType: " + a("vctty");
        }
        sb.append(str2);
        String a = a("vdu");
        Boolean bool = null;
        if (a == null) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(Long.parseLong(a));
        }
        if (valueOf == null) {
            str3 = "";
        } else {
            StringBuilder sb2 = new StringBuilder("\n    videoDuration: ");
            String a2 = a("vdu");
            if (a2 == null) {
                valueOf3 = null;
            } else {
                valueOf3 = Long.valueOf(Long.parseLong(a2));
            }
            sb2.append(valueOf3);
            str3 = sb2.toString();
        }
        sb.append(str3);
        if (a("vecva") == null) {
            str4 = "";
        } else {
            str4 = "\n    videoEncodingVariant: " + a("vecva");
        }
        sb.append(str4);
        String a3 = a("visli");
        if (a3 == null) {
            valueOf2 = null;
        } else {
            valueOf2 = Boolean.valueOf(Boolean.parseBoolean(a3));
        }
        if (valueOf2 == null) {
            str5 = "";
        } else {
            StringBuilder sb3 = new StringBuilder("\n    videoIsLive: ");
            String a4 = a("visli");
            if (a4 != null) {
                bool = Boolean.valueOf(Boolean.parseBoolean(a4));
            }
            sb3.append(bool);
            str5 = sb3.toString();
        }
        sb.append(str5);
        if (a("vlacd") == null) {
            str6 = "";
        } else {
            str6 = "\n    videoLanguageCode: " + a("vlacd");
        }
        sb.append(str6);
        if (a("vpd") == null) {
            str7 = "";
        } else {
            str7 = "\n    videoProducer: " + a("vpd");
        }
        sb.append(str7);
        if (a("vsr") == null) {
            str8 = "";
        } else {
            str8 = "\n    videoSeries: " + a("vsr");
        }
        sb.append(str8);
        if (a("vsmty") == null) {
            str9 = "";
        } else {
            str9 = "\n    videoStreamType: " + a("vsmty");
        }
        sb.append(str9);
        if (a("vtt") == null) {
            str10 = "";
        } else {
            str10 = "\n    videoTitle: " + a("vtt");
        }
        sb.append(str10);
        if (a("vvaid") == null) {
            str11 = "";
        } else {
            str11 = "\n    videoVariantId: " + a("vvaid");
        }
        sb.append(str11);
        if (a("vvanm") == null) {
            str12 = "";
        } else {
            str12 = "\n    videoVariantName: " + a("vvanm");
        }
        sb.append(str12);
        if (a("vsour") == null) {
            str13 = "";
        } else {
            str13 = "\n    videoSourceUrl: " + a("vsour");
        }
        sb.append(str13);
        if (a("viep") != null) {
            str14 = "\n    videoExperiments: " + a("viep");
        }
        sb.append(str14);
        return sb.toString();
    }

    @Override // com.amazon.aps.iva.ga0.c
    public final void d() {
    }
}

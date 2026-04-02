package com.amazon.aps.iva.ga0;

import com.amazon.aps.iva.a0.r;
import java.util.ArrayList;
/* loaded from: classes4.dex */
public final class k extends c {
    public static final ArrayList<String> d;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        d = arrayList;
        r.e(arrayList, "wloti", "wur", "pauon", "percd");
        r.e(arrayList, "perme", "pht", "pinid", "pisfs");
        r.e(arrayList, "pispa", "placd", "ploti", "pmxpinm");
        r.e(arrayList, "pmxpive", "pphti", "ppron", "psqno");
        r.e(arrayList, "pswnm", "pswve", "psuti", "pvwco");
        r.e(arrayList, "pwd", "ppgti", "pmfnepgti", "percz");
    }

    public final String f() {
        Long valueOf;
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
        Long valueOf2;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        Integer valueOf3;
        String str16;
        String str17;
        String str18;
        Long valueOf4;
        String str19;
        Integer valueOf5;
        String str20;
        String str21;
        Long valueOf6;
        String str22;
        Long valueOf7;
        Long valueOf8;
        Integer valueOf9;
        Long valueOf10;
        Integer valueOf11;
        Long valueOf12;
        Long valueOf13;
        StringBuilder sb = new StringBuilder("PlayerData: ");
        String a = a("wloti");
        Long l = null;
        if (a == null) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(Long.parseLong(a));
        }
        String str23 = "";
        if (valueOf == null) {
            str = "";
        } else {
            StringBuilder sb2 = new StringBuilder("\n    pageLoadTime: ");
            String a2 = a("wloti");
            if (a2 == null) {
                valueOf13 = null;
            } else {
                valueOf13 = Long.valueOf(Long.parseLong(a2));
            }
            sb2.append(valueOf13);
            str = sb2.toString();
        }
        sb.append(str);
        if (a("wur") == null) {
            str2 = "";
        } else {
            str2 = "\n    pageUrl: " + a("wur");
        }
        sb.append(str2);
        if (a("pauon") == null) {
            str3 = "";
        } else {
            str3 = "\n    getPlayerAutoplayOn: " + a("pauon");
        }
        sb.append(str3);
        if (a("percd") == null) {
            str4 = "";
        } else {
            str4 = "\n    playerErrorCode: " + a("percd");
        }
        sb.append(str4);
        if (a("perme") == null) {
            str5 = "";
        } else {
            str5 = "\n    playerErrorMessage: " + a("perme");
        }
        sb.append(str5);
        if (g() == null) {
            str6 = "";
        } else {
            str6 = "\n    playerHeight: " + g();
        }
        sb.append(str6);
        if (a("pinid") == null) {
            str7 = "";
        } else {
            str7 = "\n    playerInstanceId: " + a("pinid");
        }
        sb.append(str7);
        if (a("pisfs") == null) {
            str8 = "";
        } else {
            str8 = "\n    playerFullScreen: " + a("pisfs");
        }
        sb.append(str8);
        if (h() == null) {
            str9 = "";
        } else {
            str9 = "\n    playerIsPaused: " + h();
        }
        sb.append(str9);
        if (a("placd") == null) {
            str10 = "";
        } else {
            str10 = "\n    playerLayoutCode: " + a("placd");
        }
        sb.append(str10);
        String a3 = a("ploti");
        if (a3 == null) {
            valueOf2 = null;
        } else {
            valueOf2 = Long.valueOf(Long.parseLong(a3));
        }
        if (valueOf2 == null) {
            str11 = "";
        } else {
            StringBuilder sb3 = new StringBuilder("\n    playerLoadTime: ");
            String a4 = a("ploti");
            if (a4 == null) {
                valueOf12 = null;
            } else {
                valueOf12 = Long.valueOf(Long.parseLong(a4));
            }
            sb3.append(valueOf12);
            str11 = sb3.toString();
        }
        sb.append(str11);
        if (a("pmxpinm") == null) {
            str12 = "";
        } else {
            str12 = "\n    playerMuxPluginName: " + a("pmxpinm");
        }
        sb.append(str12);
        if (a("pmxpive") == null) {
            str13 = "";
        } else {
            str13 = "\n    playerMuxPluginVersion: " + a("pmxpive");
        }
        sb.append(str13);
        if (i() == null) {
            str14 = "";
        } else {
            str14 = "\n    playerPlayheadTime: " + i();
        }
        sb.append(str14);
        if (a("ppron") == null) {
            str15 = "";
        } else {
            str15 = "\n    playerPreloadOn: " + a("ppron");
        }
        sb.append(str15);
        String a5 = a("psqno");
        if (a5 == null) {
            valueOf3 = null;
        } else {
            valueOf3 = Integer.valueOf(Integer.parseInt(a5));
        }
        if (valueOf3 == null) {
            str16 = "";
        } else {
            StringBuilder sb4 = new StringBuilder("\n    playerSequenceNumber: ");
            String a6 = a("psqno");
            if (a6 == null) {
                valueOf11 = null;
            } else {
                valueOf11 = Integer.valueOf(Integer.parseInt(a6));
            }
            sb4.append(valueOf11);
            str16 = sb4.toString();
        }
        sb.append(str16);
        if (a("pswnm") == null) {
            str17 = "";
        } else {
            str17 = "\n    playerSoftwareName: " + a("pswnm");
        }
        sb.append(str17);
        if (a("pswve") == null) {
            str18 = "";
        } else {
            str18 = "\n    playerSoftwareVersion: " + a("pswve");
        }
        sb.append(str18);
        String a7 = a("psuti");
        if (a7 == null) {
            valueOf4 = null;
        } else {
            valueOf4 = Long.valueOf(Long.parseLong(a7));
        }
        if (valueOf4 == null) {
            str19 = "";
        } else {
            StringBuilder sb5 = new StringBuilder("\n    playerStartupTime: ");
            String a8 = a("psuti");
            if (a8 == null) {
                valueOf10 = null;
            } else {
                valueOf10 = Long.valueOf(Long.parseLong(a8));
            }
            sb5.append(valueOf10);
            str19 = sb5.toString();
        }
        sb.append(str19);
        String a9 = a("pvwco");
        if (a9 == null) {
            valueOf5 = null;
        } else {
            valueOf5 = Integer.valueOf(Integer.parseInt(a9));
        }
        if (valueOf5 == null) {
            str20 = "";
        } else {
            StringBuilder sb6 = new StringBuilder("\n    playerViewCount: ");
            String a10 = a("pvwco");
            if (a10 == null) {
                valueOf9 = null;
            } else {
                valueOf9 = Integer.valueOf(Integer.parseInt(a10));
            }
            sb6.append(valueOf9);
            str20 = sb6.toString();
        }
        sb.append(str20);
        if (j() == null) {
            str21 = "";
        } else {
            str21 = "\n    playerWidth: " + j();
        }
        sb.append(str21);
        String a11 = a("ppgti");
        if (a11 == null) {
            valueOf6 = null;
        } else {
            valueOf6 = Long.valueOf(Long.parseLong(a11));
        }
        if (valueOf6 == null) {
            str22 = "";
        } else {
            StringBuilder sb7 = new StringBuilder("\n    playerProgramTime: ");
            String a12 = a("ppgti");
            if (a12 == null) {
                valueOf8 = null;
            } else {
                valueOf8 = Long.valueOf(Long.parseLong(a12));
            }
            sb7.append(valueOf8);
            str22 = sb7.toString();
        }
        sb.append(str22);
        String a13 = a("pmfnepgti");
        if (a13 == null) {
            valueOf7 = null;
        } else {
            valueOf7 = Long.valueOf(Long.parseLong(a13));
        }
        if (valueOf7 != null) {
            StringBuilder sb8 = new StringBuilder("\n    playerManifestNewestProgramTime: ");
            String a14 = a("pmfnepgti");
            if (a14 != null) {
                l = Long.valueOf(Long.parseLong(a14));
            }
            sb8.append(l);
            str23 = sb8.toString();
        }
        sb.append(str23);
        return sb.toString();
    }

    public final Integer g() {
        String a = a("pht");
        if (a == null) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(a));
    }

    public final Boolean h() {
        String a = a("pispa");
        if (a == null) {
            return null;
        }
        return Boolean.valueOf(Boolean.parseBoolean(a));
    }

    public final Long i() {
        String a = a("pphti");
        if (a == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(a));
    }

    public final Integer j() {
        String a = a("pwd");
        if (a == null) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(a));
    }

    public final void k(Integer num) {
        if (num != null) {
            b("pht", num.toString());
        }
    }

    public final void l(Integer num) {
        if (num != null) {
            b("pwd", num.toString());
        }
    }

    @Override // com.amazon.aps.iva.ga0.c
    public final void d() {
    }
}

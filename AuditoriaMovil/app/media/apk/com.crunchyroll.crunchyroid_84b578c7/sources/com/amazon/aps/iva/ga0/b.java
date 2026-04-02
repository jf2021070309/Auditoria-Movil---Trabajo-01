package com.amazon.aps.iva.ga0;

import com.amazon.aps.iva.a0.r;
import java.util.ArrayList;
import java.util.Hashtable;
/* loaded from: classes4.dex */
public final class b extends c {
    public static final ArrayList<String> d;

    /* loaded from: classes4.dex */
    public static class a {
        public int a;
        public int b;
        public float c;
        public long d;
        public String e;
        public String f;
        public String g;
    }

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        d = arrayList;
        r.e(arrayList, "qeety", "qst", "qrpst", "qrpen");
        r.e(arrayList, "qlt", "qth", "qbyld", "qty");
        r.e(arrayList, "qrphe", "qhn", "qmddu", "qcule");
        r.e(arrayList, "qmdstti", "qviwd", "qviht", "qer");
        r.e(arrayList, "qur", "qerte", "qercd", "qlbbi");
        arrayList.add("qrfls");
        arrayList.add("qcb");
        arrayList.add("qid");
    }

    public final String f() {
        String str;
        String str2;
        String str3;
        String str4;
        Long valueOf;
        String str5;
        Long valueOf2;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        Integer valueOf3;
        String str12;
        Long valueOf4;
        String str13;
        Integer valueOf5;
        String str14;
        Integer valueOf6;
        String str15;
        String str16;
        String str17;
        Integer valueOf7;
        String str18;
        Integer valueOf8;
        String str19;
        Integer valueOf9;
        Integer valueOf10;
        Integer valueOf11;
        Long valueOf12;
        Integer valueOf13;
        Long valueOf14;
        Long valueOf15;
        StringBuilder sb = new StringBuilder("BandwidthMetricData: ");
        String str20 = "";
        if (a("qeety") == null) {
            str = "";
        } else {
            str = "\n    requestEventType: " + a("qeety");
        }
        sb.append(str);
        if (m() == null) {
            str2 = "";
        } else {
            str2 = "\n    requestStart: " + m();
        }
        sb.append(str2);
        if (l() == null) {
            str3 = "";
        } else {
            str3 = "\n    requestResponseStart: " + l();
        }
        sb.append(str3);
        if (j() == null) {
            str4 = "";
        } else {
            str4 = "\n    requestResponseEnd: " + j();
        }
        sb.append(str4);
        String a2 = a("qlt");
        Integer num = null;
        if (a2 == null) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(Long.parseLong(a2));
        }
        if (valueOf == null) {
            str5 = "";
        } else {
            StringBuilder sb2 = new StringBuilder("\n    requestResponseLatency: ");
            String a3 = a("qlt");
            if (a3 == null) {
                valueOf15 = null;
            } else {
                valueOf15 = Long.valueOf(Long.parseLong(a3));
            }
            sb2.append(valueOf15);
            str5 = sb2.toString();
        }
        sb.append(str5);
        String a4 = a("qth");
        if (a4 == null) {
            valueOf2 = null;
        } else {
            valueOf2 = Long.valueOf(Long.parseLong(a4));
        }
        if (valueOf2 == null) {
            str6 = "";
        } else {
            StringBuilder sb3 = new StringBuilder("\n    requestResponseThroughput: ");
            String a5 = a("qth");
            if (a5 == null) {
                valueOf14 = null;
            } else {
                valueOf14 = Long.valueOf(Long.parseLong(a5));
            }
            sb3.append(valueOf14);
            str6 = sb3.toString();
        }
        sb.append(str6);
        if (g() == null) {
            str7 = "";
        } else {
            str7 = "\n    requestBytesLoaded: " + g();
        }
        sb.append(str7);
        if (a("qty") == null) {
            str8 = "";
        } else {
            str8 = "\n    requestType: " + a("qty");
        }
        sb.append(str8);
        if (k().keySet().size() <= 0) {
            str9 = "";
        } else {
            str9 = "\n    requestResponseHeaders: " + k().keySet();
        }
        sb.append(str9);
        if (a("qhn") == null) {
            str10 = "";
        } else {
            str10 = "\n    requestHostName: " + a("qhn");
        }
        sb.append(str10);
        if (h() == null) {
            str11 = "";
        } else {
            str11 = "\n    requestMediaDuration: " + h();
        }
        sb.append(str11);
        String a6 = a("qcule");
        if (a6 == null) {
            valueOf3 = null;
        } else {
            valueOf3 = Integer.valueOf(Integer.parseInt(a6));
        }
        if (valueOf3 == null) {
            str12 = "";
        } else {
            StringBuilder sb4 = new StringBuilder("\n    requestCurrentLevel: ");
            String a7 = a("qcule");
            if (a7 == null) {
                valueOf13 = null;
            } else {
                valueOf13 = Integer.valueOf(Integer.parseInt(a7));
            }
            sb4.append(valueOf13);
            str12 = sb4.toString();
        }
        sb.append(str12);
        String a8 = a("qmdstti");
        if (a8 == null) {
            valueOf4 = null;
        } else {
            valueOf4 = Long.valueOf(Long.parseLong(a8));
        }
        if (valueOf4 == null) {
            str13 = "";
        } else {
            StringBuilder sb5 = new StringBuilder("\n    requestMediaStartTime: ");
            String a9 = a("qmdstti");
            if (a9 == null) {
                valueOf12 = null;
            } else {
                valueOf12 = Long.valueOf(Long.parseLong(a9));
            }
            sb5.append(valueOf12);
            str13 = sb5.toString();
        }
        sb.append(str13);
        String a10 = a("qviwd");
        if (a10 == null) {
            valueOf5 = null;
        } else {
            valueOf5 = Integer.valueOf(Integer.parseInt(a10));
        }
        if (valueOf5 == null) {
            str14 = "";
        } else {
            StringBuilder sb6 = new StringBuilder("\n    requestVideoWidth: ");
            String a11 = a("qviwd");
            if (a11 == null) {
                valueOf11 = null;
            } else {
                valueOf11 = Integer.valueOf(Integer.parseInt(a11));
            }
            sb6.append(valueOf11);
            str14 = sb6.toString();
        }
        sb.append(str14);
        String a12 = a("qviht");
        if (a12 == null) {
            valueOf6 = null;
        } else {
            valueOf6 = Integer.valueOf(Integer.parseInt(a12));
        }
        if (valueOf6 == null) {
            str15 = "";
        } else {
            StringBuilder sb7 = new StringBuilder("\n    requestVideoHeight: ");
            String a13 = a("qviht");
            if (a13 == null) {
                valueOf10 = null;
            } else {
                valueOf10 = Integer.valueOf(Integer.parseInt(a13));
            }
            sb7.append(valueOf10);
            str15 = sb7.toString();
        }
        sb.append(str15);
        if (a("qer") == null) {
            str16 = "";
        } else {
            str16 = "\n    requestError: " + a("qer");
        }
        sb.append(str16);
        if (a("qerte") == null) {
            str17 = "";
        } else {
            str17 = "\n    requestErrorText: " + a("qerte");
        }
        sb.append(str17);
        String a14 = a("qercd");
        if (a14 == null) {
            valueOf7 = null;
        } else {
            valueOf7 = Integer.valueOf(Integer.parseInt(a14));
        }
        if (valueOf7 == null) {
            str18 = "";
        } else {
            StringBuilder sb8 = new StringBuilder("\n    requestErrorCode: ");
            String a15 = a("qercd");
            if (a15 == null) {
                valueOf9 = null;
            } else {
                valueOf9 = Integer.valueOf(Integer.parseInt(a15));
            }
            sb8.append(valueOf9);
            str18 = sb8.toString();
        }
        sb.append(str18);
        String a16 = a("qlbbi");
        if (a16 == null) {
            valueOf8 = null;
        } else {
            valueOf8 = Integer.valueOf(Integer.parseInt(a16));
        }
        if (valueOf8 == null) {
            str19 = "";
        } else {
            StringBuilder sb9 = new StringBuilder("\n    requestLabeledBitrate: ");
            String a17 = a("qlbbi");
            if (a17 != null) {
                num = Integer.valueOf(Integer.parseInt(a17));
            }
            sb9.append(num);
            str19 = sb9.toString();
        }
        sb.append(str19);
        i();
        sb.append("\n    requestRenditionLists: " + i());
        if (a("qcb") != null) {
            str20 = "\n    requestCancel: " + a("qcb");
        }
        sb.append(str20);
        return sb.toString();
    }

    public final Long g() {
        String a2 = a("qbyld");
        if (a2 == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(a2));
    }

    public final Long h() {
        String a2 = a("qmddu");
        if (a2 == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(a2));
    }

    public final ArrayList i() {
        ArrayList arrayList = new ArrayList();
        if (this.a.has("qrfls")) {
            com.amazon.aps.iva.if0.a jSONArray = new com.amazon.aps.iva.if0.c(this.a.getJSONObject("qrfls").toString()).getJSONArray("media");
            for (int i = 0; jSONArray != null && i < jSONArray.e(); i++) {
                com.amazon.aps.iva.if0.c cVar = (com.amazon.aps.iva.if0.c) jSONArray.get(i);
                a aVar = new a();
                aVar.a = cVar.getInt("width");
                aVar.b = cVar.getInt("height");
                aVar.d = cVar.getLong("bitrate");
                aVar.g = cVar.getString("attrs");
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    public final Long j() {
        String a2 = a("qrpen");
        if (a2 == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(a2));
    }

    public final Hashtable<String, String> k() {
        Hashtable<String, String> hashtable = new Hashtable<>();
        com.amazon.aps.iva.if0.c jSONObject = this.a.getJSONObject("qrphe");
        if (jSONObject != null) {
            com.amazon.aps.iva.if0.a names = jSONObject.names();
            for (int i = 0; i < names.e(); i++) {
                String str = (String) names.get(i);
                hashtable.put(str, jSONObject.getString(str));
            }
        }
        return hashtable;
    }

    public final Long l() {
        String a2 = a("qrpst");
        if (a2 == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(a2));
    }

    public final Long m() {
        String a2 = a("qst");
        if (a2 == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(a2));
    }

    @Override // com.amazon.aps.iva.ga0.c
    public final void d() {
    }
}

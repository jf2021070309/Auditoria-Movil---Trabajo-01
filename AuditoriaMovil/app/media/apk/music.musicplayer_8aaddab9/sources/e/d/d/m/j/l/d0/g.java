package e.d.d.m.j.l.d0;

import android.util.Base64;
import android.util.JsonReader;
import ch.qos.logback.core.joran.action.Action;
import com.applovin.sdk.AppLovinEventTypes;
import e.d.d.m.j.l.a0;
import e.d.d.m.j.l.b;
import e.d.d.m.j.l.b0;
import e.d.d.m.j.l.c;
import e.d.d.m.j.l.g;
import e.d.d.m.j.l.h;
import e.d.d.m.j.l.j;
import e.d.d.m.j.l.k;
import e.d.d.m.j.l.l;
import e.d.d.m.j.l.m;
import e.d.d.m.j.l.n;
import e.d.d.m.j.l.o;
import e.d.d.m.j.l.p;
import e.d.d.m.j.l.q;
import e.d.d.m.j.l.s;
import e.d.d.m.j.l.t;
import e.d.d.m.j.l.u;
import e.d.d.m.j.l.v;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Objects;
/* loaded from: classes2.dex */
public class g {
    public static final e.d.d.p.a a;

    /* loaded from: classes2.dex */
    public interface a<T> {
        T a(JsonReader jsonReader) throws IOException;
    }

    static {
        e.d.d.p.j.e eVar = new e.d.d.p.j.e();
        ((e.d.d.m.j.l.a) e.d.d.m.j.l.a.a).configure(eVar);
        eVar.f7545e = true;
        a = new e.d.d.p.j.d(eVar);
    }

    public static <T> b0<T> a(JsonReader jsonReader, a<T> aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.a(jsonReader));
        }
        jsonReader.endArray();
        return new b0<>(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [e.d.d.m.j.l.a0$e$d$a$b$b] */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3, types: [e.d.d.m.j.l.a0$e$d$a$b$b] */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [e.d.d.m.j.l.a0$e$d$a$b$c] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v6 */
    public static a0.e.d b(JsonReader jsonReader) throws IOException {
        char c2;
        String str;
        char c3;
        char c4;
        char c5;
        char c6;
        char c7;
        k.b bVar = new k.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            m mVar = null;
            if (c2 == 0) {
                s.b bVar2 = new s.b();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    nextName2.hashCode();
                    switch (nextName2.hashCode()) {
                        case -1708606089:
                            if (nextName2.equals("batteryLevel")) {
                                c7 = 0;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case -1455558134:
                            if (nextName2.equals("batteryVelocity")) {
                                c7 = 1;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case -1439500848:
                            if (nextName2.equals("orientation")) {
                                c7 = 2;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 279795450:
                            if (nextName2.equals("diskUsed")) {
                                c7 = 3;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 976541947:
                            if (nextName2.equals("ramUsed")) {
                                c7 = 4;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 1516795582:
                            if (nextName2.equals("proximityOn")) {
                                c7 = 5;
                                break;
                            }
                            c7 = 65535;
                            break;
                        default:
                            c7 = 65535;
                            break;
                    }
                    if (c7 == 0) {
                        bVar2.a = Double.valueOf(jsonReader.nextDouble());
                    } else if (c7 == 1) {
                        bVar2.f7472b = Integer.valueOf(jsonReader.nextInt());
                    } else if (c7 == 2) {
                        bVar2.f7474d = Integer.valueOf(jsonReader.nextInt());
                    } else if (c7 == 3) {
                        bVar2.f7476f = Long.valueOf(jsonReader.nextLong());
                    } else if (c7 == 4) {
                        bVar2.f7475e = Long.valueOf(jsonReader.nextLong());
                    } else if (c7 != 5) {
                        jsonReader.skipValue();
                    } else {
                        bVar2.f7473c = Boolean.valueOf(jsonReader.nextBoolean());
                    }
                }
                jsonReader.endObject();
                bVar.c(bVar2.a());
            } else if (c2 == 1) {
                jsonReader.beginObject();
                Integer num = null;
                b0 b0Var = null;
                b0 b0Var2 = null;
                Boolean bool = null;
                Long l2 = null;
                while (jsonReader.hasNext()) {
                    String nextName3 = jsonReader.nextName();
                    nextName3.hashCode();
                    switch (nextName3.hashCode()) {
                        case -1332194002:
                            if (nextName3.equals("background")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -1090974952:
                            if (nextName3.equals("execution")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -80231855:
                            if (nextName3.equals("internalKeys")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 555169704:
                            if (nextName3.equals("customAttributes")) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 928737948:
                            if (nextName3.equals("uiOrientation")) {
                                c3 = 4;
                                break;
                            }
                            c3 = 65535;
                            break;
                        default:
                            c3 = 65535;
                            break;
                    }
                    if (c3 == 0) {
                        bool = Boolean.valueOf(jsonReader.nextBoolean());
                    } else if (c3 != 1) {
                        if (c3 == 2) {
                            b0Var2 = a(jsonReader, new a() { // from class: e.d.d.m.j.l.d0.f
                                @Override // e.d.d.m.j.l.d0.g.a
                                public final Object a(JsonReader jsonReader2) {
                                    e.d.d.p.a aVar = g.a;
                                    jsonReader2.beginObject();
                                    String str2 = null;
                                    String str3 = null;
                                    while (jsonReader2.hasNext()) {
                                        String nextName4 = jsonReader2.nextName();
                                        nextName4.hashCode();
                                        if (nextName4.equals(Action.KEY_ATTRIBUTE)) {
                                            str2 = jsonReader2.nextString();
                                            Objects.requireNonNull(str2, "Null key");
                                        } else if (nextName4.equals("value")) {
                                            str3 = jsonReader2.nextString();
                                            Objects.requireNonNull(str3, "Null value");
                                        } else {
                                            jsonReader2.skipValue();
                                        }
                                    }
                                    jsonReader2.endObject();
                                    String str4 = str2 == null ? " key" : "";
                                    if (str3 == null) {
                                        str4 = e.a.d.a.a.k(str4, " value");
                                    }
                                    if (str4.isEmpty()) {
                                        return new e.d.d.m.j.l.d(str2, str3, null);
                                    }
                                    throw new IllegalStateException(e.a.d.a.a.k("Missing required properties:", str4));
                                }
                            });
                        } else if (c3 == 3) {
                            b0Var = a(jsonReader, new a() { // from class: e.d.d.m.j.l.d0.f
                                @Override // e.d.d.m.j.l.d0.g.a
                                public final Object a(JsonReader jsonReader2) {
                                    e.d.d.p.a aVar = g.a;
                                    jsonReader2.beginObject();
                                    String str2 = null;
                                    String str3 = null;
                                    while (jsonReader2.hasNext()) {
                                        String nextName4 = jsonReader2.nextName();
                                        nextName4.hashCode();
                                        if (nextName4.equals(Action.KEY_ATTRIBUTE)) {
                                            str2 = jsonReader2.nextString();
                                            Objects.requireNonNull(str2, "Null key");
                                        } else if (nextName4.equals("value")) {
                                            str3 = jsonReader2.nextString();
                                            Objects.requireNonNull(str3, "Null value");
                                        } else {
                                            jsonReader2.skipValue();
                                        }
                                    }
                                    jsonReader2.endObject();
                                    String str4 = str2 == null ? " key" : "";
                                    if (str3 == null) {
                                        str4 = e.a.d.a.a.k(str4, " value");
                                    }
                                    if (str4.isEmpty()) {
                                        return new e.d.d.m.j.l.d(str2, str3, null);
                                    }
                                    throw new IllegalStateException(e.a.d.a.a.k("Missing required properties:", str4));
                                }
                            });
                        } else if (c3 != 4) {
                            jsonReader.skipValue();
                        } else {
                            num = Integer.valueOf(jsonReader.nextInt());
                        }
                        l2 = l2;
                    } else {
                        jsonReader.beginObject();
                        b0 b0Var3 = l2;
                        ?? r19 = b0Var3;
                        a0.a aVar = r19;
                        p pVar = aVar;
                        b0 b0Var4 = pVar;
                        while (jsonReader.hasNext()) {
                            String nextName4 = jsonReader.nextName();
                            nextName4.hashCode();
                            switch (nextName4.hashCode()) {
                                case -1375141843:
                                    if (nextName4.equals("appExitInfo")) {
                                        c4 = 0;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case -1337936983:
                                    if (nextName4.equals("threads")) {
                                        c4 = 1;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case -902467928:
                                    if (nextName4.equals("signal")) {
                                        c4 = 2;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case 937615455:
                                    if (nextName4.equals("binaries")) {
                                        c4 = 3;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case 1481625679:
                                    if (nextName4.equals("exception")) {
                                        c4 = 4;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                default:
                                    c4 = 65535;
                                    break;
                            }
                            if (c4 == 0) {
                                c.b bVar3 = new c.b();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.hashCode();
                                    switch (nextName5.hashCode()) {
                                        case 110987:
                                            if (nextName5.equals("pid")) {
                                                c5 = 0;
                                                break;
                                            }
                                            c5 = 65535;
                                            break;
                                        case 111312:
                                            if (nextName5.equals("pss")) {
                                                c5 = 1;
                                                break;
                                            }
                                            c5 = 65535;
                                            break;
                                        case 113234:
                                            if (nextName5.equals("rss")) {
                                                c5 = 2;
                                                break;
                                            }
                                            c5 = 65535;
                                            break;
                                        case 55126294:
                                            if (nextName5.equals("timestamp")) {
                                                c5 = 3;
                                                break;
                                            }
                                            c5 = 65535;
                                            break;
                                        case 202325402:
                                            if (nextName5.equals("processName")) {
                                                c5 = 4;
                                                break;
                                            }
                                            c5 = 65535;
                                            break;
                                        case 722137681:
                                            if (nextName5.equals("reasonCode")) {
                                                c5 = 5;
                                                break;
                                            }
                                            c5 = 65535;
                                            break;
                                        case 723857505:
                                            if (nextName5.equals("traceFile")) {
                                                c5 = 6;
                                                break;
                                            }
                                            c5 = 65535;
                                            break;
                                        case 2125650548:
                                            if (nextName5.equals("importance")) {
                                                c5 = 7;
                                                break;
                                            }
                                            c5 = 65535;
                                            break;
                                        default:
                                            c5 = 65535;
                                            break;
                                    }
                                    switch (c5) {
                                        case 0:
                                            bVar3.a = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case 1:
                                            bVar3.f7379e = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case 2:
                                            bVar3.f7380f = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case 3:
                                            bVar3.f7381g = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case 4:
                                            String nextString = jsonReader.nextString();
                                            Objects.requireNonNull(nextString, "Null processName");
                                            bVar3.f7376b = nextString;
                                            break;
                                        case 5:
                                            bVar3.f7377c = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case 6:
                                            bVar3.f7382h = jsonReader.nextString();
                                            break;
                                        case 7:
                                            bVar3.f7378d = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                aVar = bVar3.a();
                                pVar = pVar;
                            } else if (c4 == 1) {
                                b0Var3 = a(jsonReader, new a() { // from class: e.d.d.m.j.l.d0.c
                                    @Override // e.d.d.m.j.l.d0.g.a
                                    public final Object a(JsonReader jsonReader2) {
                                        e.d.d.p.a aVar2 = g.a;
                                        jsonReader2.beginObject();
                                        String str2 = null;
                                        Integer num2 = null;
                                        b0 b0Var5 = null;
                                        while (jsonReader2.hasNext()) {
                                            String nextName6 = jsonReader2.nextName();
                                            nextName6.hashCode();
                                            nextName6.hashCode();
                                            char c8 = 65535;
                                            switch (nextName6.hashCode()) {
                                                case -1266514778:
                                                    if (nextName6.equals("frames")) {
                                                        c8 = 0;
                                                        break;
                                                    }
                                                    break;
                                                case 3373707:
                                                    if (nextName6.equals("name")) {
                                                        c8 = 1;
                                                        break;
                                                    }
                                                    break;
                                                case 2125650548:
                                                    if (nextName6.equals("importance")) {
                                                        c8 = 2;
                                                        break;
                                                    }
                                                    break;
                                            }
                                            switch (c8) {
                                                case 0:
                                                    b0Var5 = g.a(jsonReader2, b.a);
                                                    break;
                                                case 1:
                                                    str2 = jsonReader2.nextString();
                                                    Objects.requireNonNull(str2, "Null name");
                                                    break;
                                                case 2:
                                                    num2 = Integer.valueOf(jsonReader2.nextInt());
                                                    break;
                                                default:
                                                    jsonReader2.skipValue();
                                                    break;
                                            }
                                        }
                                        jsonReader2.endObject();
                                        String str3 = str2 == null ? " name" : "";
                                        if (num2 == null) {
                                            str3 = e.a.d.a.a.k(str3, " importance");
                                        }
                                        if (b0Var5 == null) {
                                            str3 = e.a.d.a.a.k(str3, " frames");
                                        }
                                        if (str3.isEmpty()) {
                                            return new q(str2, num2.intValue(), b0Var5, null);
                                        }
                                        throw new IllegalStateException(e.a.d.a.a.k("Missing required properties:", str3));
                                    }
                                });
                                pVar = pVar;
                            } else if (c4 == 2) {
                                jsonReader.beginObject();
                                String str2 = l2;
                                String str3 = str2;
                                while (jsonReader.hasNext()) {
                                    String nextName6 = jsonReader.nextName();
                                    nextName6.hashCode();
                                    int hashCode = nextName6.hashCode();
                                    if (hashCode == -1147692044) {
                                        if (nextName6.equals("address")) {
                                            c6 = 0;
                                        }
                                        c6 = 65535;
                                    } else if (hashCode != 3059181) {
                                        if (hashCode == 3373707 && nextName6.equals("name")) {
                                            c6 = 2;
                                        }
                                        c6 = 65535;
                                    } else {
                                        if (nextName6.equals("code")) {
                                            c6 = 1;
                                        }
                                        c6 = 65535;
                                    }
                                    if (c6 == 0) {
                                        l2 = Long.valueOf(jsonReader.nextLong());
                                    } else if (c6 == 1) {
                                        String nextString2 = jsonReader.nextString();
                                        Objects.requireNonNull(nextString2, "Null code");
                                        str3 = nextString2;
                                    } else if (c6 != 2) {
                                        jsonReader.skipValue();
                                    } else {
                                        String nextString3 = jsonReader.nextString();
                                        Objects.requireNonNull(nextString3, "Null name");
                                        str2 = nextString3;
                                    }
                                }
                                jsonReader.endObject();
                                String str4 = str2 == null ? " name" : "";
                                if (str3 == null) {
                                    str4 = e.a.d.a.a.k(str4, " code");
                                }
                                if (l2 == 0) {
                                    str4 = e.a.d.a.a.k(str4, " address");
                                }
                                if (!str4.isEmpty()) {
                                    throw new IllegalStateException(e.a.d.a.a.k("Missing required properties:", str4));
                                }
                                pVar = new p(str2, str3, l2.longValue(), null);
                            } else if (c4 == 3) {
                                b0Var4 = a(jsonReader, new a() { // from class: e.d.d.m.j.l.d0.e
                                    @Override // e.d.d.m.j.l.d0.g.a
                                    public final Object a(JsonReader jsonReader2) {
                                        e.d.d.p.a aVar2 = g.a;
                                        jsonReader2.beginObject();
                                        Long l3 = null;
                                        Long l4 = null;
                                        String str5 = null;
                                        String str6 = null;
                                        while (jsonReader2.hasNext()) {
                                            String nextName7 = jsonReader2.nextName();
                                            nextName7.hashCode();
                                            nextName7.hashCode();
                                            char c8 = 65535;
                                            switch (nextName7.hashCode()) {
                                                case 3373707:
                                                    if (nextName7.equals("name")) {
                                                        c8 = 0;
                                                        break;
                                                    }
                                                    break;
                                                case 3530753:
                                                    if (nextName7.equals("size")) {
                                                        c8 = 1;
                                                        break;
                                                    }
                                                    break;
                                                case 3601339:
                                                    if (nextName7.equals("uuid")) {
                                                        c8 = 2;
                                                        break;
                                                    }
                                                    break;
                                                case 1153765347:
                                                    if (nextName7.equals("baseAddress")) {
                                                        c8 = 3;
                                                        break;
                                                    }
                                                    break;
                                            }
                                            switch (c8) {
                                                case 0:
                                                    str5 = jsonReader2.nextString();
                                                    Objects.requireNonNull(str5, "Null name");
                                                    break;
                                                case 1:
                                                    l4 = Long.valueOf(jsonReader2.nextLong());
                                                    break;
                                                case 2:
                                                    str6 = new String(Base64.decode(jsonReader2.nextString(), 2), a0.a);
                                                    break;
                                                case 3:
                                                    l3 = Long.valueOf(jsonReader2.nextLong());
                                                    break;
                                                default:
                                                    jsonReader2.skipValue();
                                                    break;
                                            }
                                        }
                                        jsonReader2.endObject();
                                        String str7 = l3 == null ? " baseAddress" : "";
                                        if (l4 == null) {
                                            str7 = e.a.d.a.a.k(str7, " size");
                                        }
                                        if (str5 == null) {
                                            str7 = e.a.d.a.a.k(str7, " name");
                                        }
                                        if (str7.isEmpty()) {
                                            return new n(l3.longValue(), l4.longValue(), str5, str6, null);
                                        }
                                        throw new IllegalStateException(e.a.d.a.a.k("Missing required properties:", str7));
                                    }
                                });
                            } else if (c4 != 4) {
                                jsonReader.skipValue();
                            } else {
                                r19 = c(jsonReader);
                            }
                            l2 = 0;
                        }
                        jsonReader.endObject();
                        String str5 = pVar == 0 ? " signal" : "";
                        if (b0Var4 == null) {
                            str5 = e.a.d.a.a.k(str5, " binaries");
                        }
                        if (!str5.isEmpty()) {
                            throw new IllegalStateException(e.a.d.a.a.k("Missing required properties:", str5));
                        }
                        mVar = new m(b0Var3, r19, aVar, pVar, b0Var4, null);
                    }
                    l2 = 0;
                    l2 = l2;
                }
                jsonReader.endObject();
                str = mVar == null ? " execution" : "";
                if (num == null) {
                    str = e.a.d.a.a.k(str, " uiOrientation");
                }
                if (!str.isEmpty()) {
                    throw new IllegalStateException(e.a.d.a.a.k("Missing required properties:", str));
                }
                bVar.b(new l(mVar, b0Var, b0Var2, bool, num.intValue(), null));
            } else if (c2 == 2) {
                jsonReader.beginObject();
                String str6 = null;
                while (jsonReader.hasNext()) {
                    String nextName7 = jsonReader.nextName();
                    nextName7.hashCode();
                    if (nextName7.equals(AppLovinEventTypes.USER_VIEWED_CONTENT)) {
                        str6 = jsonReader.nextString();
                        Objects.requireNonNull(str6, "Null content");
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                str = str6 == null ? " content" : "";
                if (!str.isEmpty()) {
                    throw new IllegalStateException(e.a.d.a.a.k("Missing required properties:", str));
                }
                bVar.f7435e = new t(str6, null);
            } else if (c2 == 3) {
                bVar.e(jsonReader.nextString());
            } else if (c2 != 4) {
                jsonReader.skipValue();
            } else {
                bVar.d(jsonReader.nextLong());
            }
        }
        jsonReader.endObject();
        return bVar.a();
    }

    public static a0.e.d.a.b.AbstractC0155b c(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        Integer num = null;
        String str = null;
        String str2 = null;
        b0 b0Var = null;
        a0.e.d.a.b.AbstractC0155b abstractC0155b = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            nextName.hashCode();
            char c2 = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -934964668:
                    if (nextName.equals("reason")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c2 = 4;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    b0Var = a(jsonReader, b.a);
                    break;
                case 1:
                    str2 = jsonReader.nextString();
                    break;
                case 2:
                    str = jsonReader.nextString();
                    Objects.requireNonNull(str, "Null type");
                    break;
                case 3:
                    abstractC0155b = c(jsonReader);
                    break;
                case 4:
                    num = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        String str3 = str == null ? " type" : "";
        if (b0Var == null) {
            str3 = e.a.d.a.a.k(str3, " frames");
        }
        if (num == null) {
            str3 = e.a.d.a.a.k(str3, " overflowCount");
        }
        if (str3.isEmpty()) {
            return new o(str, str2, b0Var, abstractC0155b, num.intValue(), null);
        }
        throw new IllegalStateException(e.a.d.a.a.k("Missing required properties:", str3));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static a0 d(JsonReader jsonReader) throws IOException {
        char c2;
        char c3;
        String str;
        char c4;
        char c5;
        String str2;
        char c6;
        Charset charset = a0.a;
        b.C0161b c0161b = new b.C0161b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            String str3 = "";
            switch (c2) {
                case 0:
                    jsonReader.beginObject();
                    String str4 = null;
                    b0 b0Var = null;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.hashCode();
                        if (nextName2.equals("files")) {
                            b0Var = a(jsonReader, new a() { // from class: e.d.d.m.j.l.d0.d
                                @Override // e.d.d.m.j.l.d0.g.a
                                public final Object a(JsonReader jsonReader2) {
                                    e.d.d.p.a aVar = g.a;
                                    jsonReader2.beginObject();
                                    String str5 = null;
                                    byte[] bArr = null;
                                    while (jsonReader2.hasNext()) {
                                        String nextName3 = jsonReader2.nextName();
                                        nextName3.hashCode();
                                        if (nextName3.equals("filename")) {
                                            str5 = jsonReader2.nextString();
                                            Objects.requireNonNull(str5, "Null filename");
                                        } else if (nextName3.equals("contents")) {
                                            bArr = Base64.decode(jsonReader2.nextString(), 2);
                                            Objects.requireNonNull(bArr, "Null contents");
                                        } else {
                                            jsonReader2.skipValue();
                                        }
                                    }
                                    jsonReader2.endObject();
                                    String str6 = str5 == null ? " filename" : "";
                                    if (bArr == null) {
                                        str6 = e.a.d.a.a.k(str6, " contents");
                                    }
                                    if (str6.isEmpty()) {
                                        return new e.d.d.m.j.l.f(str5, bArr, null);
                                    }
                                    throw new IllegalStateException(e.a.d.a.a.k("Missing required properties:", str6));
                                }
                            });
                        } else if (nextName2.equals("orgId")) {
                            str4 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    String str5 = b0Var == null ? " files" : "";
                    if (str5.isEmpty()) {
                        c0161b.f7368h = new e.d.d.m.j.l.e(b0Var, str4, null);
                        break;
                    } else {
                        throw new IllegalStateException(e.a.d.a.a.k("Missing required properties:", str5));
                    }
                case 1:
                    String nextString = jsonReader.nextString();
                    Objects.requireNonNull(nextString, "Null sdkVersion");
                    c0161b.a = nextString;
                    break;
                case 2:
                    String nextString2 = jsonReader.nextString();
                    Objects.requireNonNull(nextString2, "Null buildVersion");
                    c0161b.f7365e = nextString2;
                    break;
                case 3:
                    String nextString3 = jsonReader.nextString();
                    Objects.requireNonNull(nextString3, "Null gmpAppId");
                    c0161b.f7362b = nextString3;
                    break;
                case 4:
                    String nextString4 = jsonReader.nextString();
                    Objects.requireNonNull(nextString4, "Null installationUuid");
                    c0161b.f7364d = nextString4;
                    break;
                case 5:
                    c0161b.f7363c = Integer.valueOf(jsonReader.nextInt());
                    break;
                case 6:
                    String nextString5 = jsonReader.nextString();
                    Objects.requireNonNull(nextString5, "Null displayVersion");
                    c0161b.f7366f = nextString5;
                    break;
                case 7:
                    g.b bVar = new g.b();
                    bVar.b(false);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.hashCode();
                        switch (nextName3.hashCode()) {
                            case -2128794476:
                                if (nextName3.equals("startedAt")) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1618432855:
                                if (nextName3.equals("identifier")) {
                                    c3 = 1;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1606742899:
                                if (nextName3.equals("endedAt")) {
                                    c3 = 2;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1335157162:
                                if (nextName3.equals("device")) {
                                    c3 = 3;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1291329255:
                                if (nextName3.equals("events")) {
                                    c3 = 4;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 3556:
                                if (nextName3.equals("os")) {
                                    c3 = 5;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 96801:
                                if (nextName3.equals("app")) {
                                    c3 = 6;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 3599307:
                                if (nextName3.equals("user")) {
                                    c3 = 7;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 286956243:
                                if (nextName3.equals("generator")) {
                                    c3 = '\b';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1025385094:
                                if (nextName3.equals("crashed")) {
                                    c3 = '\t';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 2047016109:
                                if (nextName3.equals("generatorType")) {
                                    c3 = '\n';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            default:
                                c3 = 65535;
                                break;
                        }
                        switch (c3) {
                            case 0:
                                str = str3;
                                bVar.f7397c = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 1:
                                str = str3;
                                bVar.f7396b = new String(Base64.decode(jsonReader.nextString(), 2), a0.a);
                                break;
                            case 2:
                                str = str3;
                                bVar.f7398d = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 3:
                                str = str3;
                                j.b bVar2 = new j.b();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName4 = jsonReader.nextName();
                                    nextName4.hashCode();
                                    switch (nextName4.hashCode()) {
                                        case -1981332476:
                                            if (nextName4.equals("simulator")) {
                                                c4 = 0;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -1969347631:
                                            if (nextName4.equals("manufacturer")) {
                                                c4 = 1;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 112670:
                                            if (nextName4.equals("ram")) {
                                                c4 = 2;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 3002454:
                                            if (nextName4.equals("arch")) {
                                                c4 = 3;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 81784169:
                                            if (nextName4.equals("diskSpace")) {
                                                c4 = 4;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 94848180:
                                            if (nextName4.equals("cores")) {
                                                c4 = 5;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 104069929:
                                            if (nextName4.equals("model")) {
                                                c4 = 6;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 109757585:
                                            if (nextName4.equals("state")) {
                                                c4 = 7;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 2078953423:
                                            if (nextName4.equals("modelClass")) {
                                                c4 = '\b';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        default:
                                            c4 = 65535;
                                            break;
                                    }
                                    switch (c4) {
                                        case 0:
                                            bVar2.f7424f = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case 1:
                                            String nextString6 = jsonReader.nextString();
                                            Objects.requireNonNull(nextString6, "Null manufacturer");
                                            bVar2.f7426h = nextString6;
                                            break;
                                        case 2:
                                            bVar2.f7422d = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case 3:
                                            bVar2.a = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case 4:
                                            bVar2.f7423e = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case 5:
                                            bVar2.f7421c = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case 6:
                                            String nextString7 = jsonReader.nextString();
                                            Objects.requireNonNull(nextString7, "Null model");
                                            bVar2.f7420b = nextString7;
                                            break;
                                        case 7:
                                            bVar2.f7425g = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case '\b':
                                            String nextString8 = jsonReader.nextString();
                                            Objects.requireNonNull(nextString8, "Null modelClass");
                                            bVar2.f7427i = nextString8;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                bVar.f7403i = bVar2.a();
                                break;
                            case 4:
                                str = str3;
                                bVar.f7404j = a(jsonReader, new a() { // from class: e.d.d.m.j.l.d0.a
                                    @Override // e.d.d.m.j.l.d0.g.a
                                    public final Object a(JsonReader jsonReader2) {
                                        return g.b(jsonReader2);
                                    }
                                });
                                break;
                            case 5:
                                str = str3;
                                jsonReader.beginObject();
                                Boolean bool = null;
                                Integer num = null;
                                String str6 = null;
                                String str7 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.hashCode();
                                    switch (nextName5.hashCode()) {
                                        case -911706486:
                                            if (nextName5.equals("buildVersion")) {
                                                c5 = 0;
                                                break;
                                            }
                                            c5 = 65535;
                                            break;
                                        case -293026577:
                                            if (nextName5.equals("jailbroken")) {
                                                c5 = 1;
                                                break;
                                            }
                                            c5 = 65535;
                                            break;
                                        case 351608024:
                                            if (nextName5.equals("version")) {
                                                c5 = 2;
                                                break;
                                            }
                                            c5 = 65535;
                                            break;
                                        case 1874684019:
                                            if (nextName5.equals("platform")) {
                                                c5 = 3;
                                                break;
                                            }
                                            c5 = 65535;
                                            break;
                                        default:
                                            c5 = 65535;
                                            break;
                                    }
                                    if (c5 == 0) {
                                        String nextString9 = jsonReader.nextString();
                                        Objects.requireNonNull(nextString9, "Null buildVersion");
                                        str7 = nextString9;
                                    } else if (c5 == 1) {
                                        bool = Boolean.valueOf(jsonReader.nextBoolean());
                                    } else if (c5 == 2) {
                                        String nextString10 = jsonReader.nextString();
                                        Objects.requireNonNull(nextString10, "Null version");
                                        str6 = nextString10;
                                    } else if (c5 != 3) {
                                        jsonReader.skipValue();
                                    } else {
                                        num = Integer.valueOf(jsonReader.nextInt());
                                    }
                                }
                                jsonReader.endObject();
                                String str8 = num == null ? " platform" : str;
                                if (str6 == null) {
                                    str8 = e.a.d.a.a.k(str8, " version");
                                }
                                if (str7 == null) {
                                    str8 = e.a.d.a.a.k(str8, " buildVersion");
                                }
                                if (bool == null) {
                                    str8 = e.a.d.a.a.k(str8, " jailbroken");
                                }
                                if (str8.isEmpty()) {
                                    bVar.f7402h = new u(num.intValue(), str6, str7, bool.booleanValue(), null);
                                    break;
                                } else {
                                    throw new IllegalStateException(e.a.d.a.a.k("Missing required properties:", str8));
                                }
                            case 6:
                                jsonReader.beginObject();
                                String str9 = null;
                                String str10 = null;
                                String str11 = null;
                                String str12 = null;
                                String str13 = null;
                                String str14 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName6 = jsonReader.nextName();
                                    nextName6.hashCode();
                                    switch (nextName6.hashCode()) {
                                        case -1618432855:
                                            str2 = str3;
                                            if (nextName6.equals("identifier")) {
                                                c6 = 0;
                                                break;
                                            }
                                            c6 = 65535;
                                            break;
                                        case -519438642:
                                            str2 = str3;
                                            if (nextName6.equals("developmentPlatform")) {
                                                c6 = 1;
                                                break;
                                            }
                                            c6 = 65535;
                                            break;
                                        case 213652010:
                                            str2 = str3;
                                            if (nextName6.equals("developmentPlatformVersion")) {
                                                c6 = 2;
                                                break;
                                            }
                                            c6 = 65535;
                                            break;
                                        case 351608024:
                                            if (nextName6.equals("version")) {
                                                c6 = 3;
                                                str2 = str3;
                                                break;
                                            }
                                            str2 = str3;
                                            c6 = 65535;
                                            break;
                                        case 719853845:
                                            if (nextName6.equals("installationUuid")) {
                                                c6 = 4;
                                                str2 = str3;
                                                break;
                                            }
                                            str2 = str3;
                                            c6 = 65535;
                                            break;
                                        case 1975623094:
                                            if (nextName6.equals("displayVersion")) {
                                                c6 = 5;
                                                str2 = str3;
                                                break;
                                            }
                                            str2 = str3;
                                            c6 = 65535;
                                            break;
                                        default:
                                            str2 = str3;
                                            c6 = 65535;
                                            break;
                                    }
                                    if (c6 == 0) {
                                        String nextString11 = jsonReader.nextString();
                                        Objects.requireNonNull(nextString11, "Null identifier");
                                        str9 = nextString11;
                                    } else if (c6 == 1) {
                                        str13 = jsonReader.nextString();
                                    } else if (c6 == 2) {
                                        str14 = jsonReader.nextString();
                                    } else if (c6 == 3) {
                                        String nextString12 = jsonReader.nextString();
                                        Objects.requireNonNull(nextString12, "Null version");
                                        str10 = nextString12;
                                    } else if (c6 == 4) {
                                        str12 = jsonReader.nextString();
                                    } else if (c6 != 5) {
                                        jsonReader.skipValue();
                                    } else {
                                        str11 = jsonReader.nextString();
                                    }
                                    str3 = str2;
                                }
                                str = str3;
                                jsonReader.endObject();
                                String str15 = str9 == null ? " identifier" : str;
                                if (str10 == null) {
                                    str15 = e.a.d.a.a.k(str15, " version");
                                }
                                if (str15.isEmpty()) {
                                    bVar.f7400f = new h(str9, str10, str11, null, str12, str13, str14, null);
                                    break;
                                } else {
                                    throw new IllegalStateException(e.a.d.a.a.k("Missing required properties:", str15));
                                }
                            case 7:
                                jsonReader.beginObject();
                                String str16 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName7 = jsonReader.nextName();
                                    nextName7.hashCode();
                                    if (nextName7.equals("identifier")) {
                                        str16 = jsonReader.nextString();
                                        Objects.requireNonNull(str16, "Null identifier");
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                String str17 = str16 == null ? " identifier" : str3;
                                if (str17.isEmpty()) {
                                    bVar.f7401g = new v(str16, null);
                                    str = str3;
                                    break;
                                } else {
                                    throw new IllegalStateException(e.a.d.a.a.k("Missing required properties:", str17));
                                }
                            case '\b':
                                String nextString13 = jsonReader.nextString();
                                Objects.requireNonNull(nextString13, "Null generator");
                                bVar.a = nextString13;
                                str = str3;
                                break;
                            case '\t':
                                bVar.b(jsonReader.nextBoolean());
                                str = str3;
                                break;
                            case '\n':
                                bVar.f7405k = Integer.valueOf(jsonReader.nextInt());
                                str = str3;
                                break;
                            default:
                                str = str3;
                                jsonReader.skipValue();
                                break;
                        }
                        str3 = str;
                    }
                    jsonReader.endObject();
                    c0161b.f7367g = bVar.a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c0161b.a();
    }

    public a0 e(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            a0 d2 = d(jsonReader);
            jsonReader.close();
            return d2;
        } catch (IllegalStateException e2) {
            throw new IOException(e2);
        }
    }

    public String f(a0 a0Var) {
        e.d.d.p.j.d dVar = (e.d.d.p.j.d) a;
        Objects.requireNonNull(dVar);
        StringWriter stringWriter = new StringWriter();
        try {
            dVar.a(a0Var, stringWriter);
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }
}

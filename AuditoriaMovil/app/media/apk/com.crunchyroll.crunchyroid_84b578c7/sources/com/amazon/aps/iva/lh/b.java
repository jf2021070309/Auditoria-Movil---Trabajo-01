package com.amazon.aps.iva.lh;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.jh.g;
import com.amazon.aps.iva.jh.h;
import com.amazon.aps.iva.jh.i;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.oe0.q;
import com.amazon.aps.iva.yb0.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
/* compiled from: PreferredSubtitlesOptionsProvider.kt */
/* loaded from: classes.dex */
public final class b implements a {
    public final i a;
    public final g b;
    public final com.amazon.aps.iva.p60.f c;

    public b(i iVar, h hVar, com.amazon.aps.iva.p60.g gVar) {
        this.a = iVar;
        this.b = hVar;
        this.c = gVar;
    }

    public static void e(String str, int i, ArrayList arrayList) {
        Object obj;
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (j.a(((com.amazon.aps.iva.jh.f) obj).a(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        com.amazon.aps.iva.jh.f fVar = (com.amazon.aps.iva.jh.f) obj;
        if (fVar != null) {
            arrayList.remove(fVar);
            arrayList.add(i, fVar);
        }
    }

    @Override // com.amazon.aps.iva.lh.a
    public final boolean a() {
        ArrayList options = getOptions();
        if (!options.isEmpty()) {
            Iterator it = options.iterator();
            while (it.hasNext()) {
                if (j.a(((com.amazon.aps.iva.jh.f) it.next()).a(), "off")) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.amazon.aps.iva.lh.a
    public final String b(String str) {
        Object obj;
        String a;
        Iterator it = getOptions().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (j.a(((com.amazon.aps.iva.jh.f) obj).a(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        com.amazon.aps.iva.jh.f fVar = (com.amazon.aps.iva.jh.f) obj;
        if (fVar == null || (a = fVar.a()) == null) {
            return "en-US";
        }
        return a;
    }

    @Override // com.amazon.aps.iva.lh.a
    public final ArrayList c(ArrayList arrayList) {
        Object obj;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = getOptions().iterator();
        while (it.hasNext()) {
            com.amazon.aps.iva.jh.f fVar = (com.amazon.aps.iva.jh.f) it.next();
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (j.a(((com.amazon.aps.iva.jh.f) obj).a(), fVar.a())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            com.amazon.aps.iva.jh.f fVar2 = (com.amazon.aps.iva.jh.f) obj;
            if (fVar2 != null) {
                arrayList2.add(fVar2);
            }
        }
        return arrayList2;
    }

    @Override // com.amazon.aps.iva.lh.a
    public final String d(String str) {
        Object obj;
        String obj2;
        j.f(str, "language");
        Iterator it = getOptions().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (j.a(((com.amazon.aps.iva.jh.f) obj).a(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        com.amazon.aps.iva.jh.f fVar = (com.amazon.aps.iva.jh.f) obj;
        if (fVar == null || (obj2 = this.b.a(fVar).toString()) == null) {
            return "";
        }
        return obj2;
    }

    @Override // com.amazon.aps.iva.lh.a
    public final ArrayList getOptions() {
        Object obj;
        ArrayList Z0 = x.Z0(this.a.read());
        String languageTag = this.c.a().toLanguageTag();
        Iterator it = Z0.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (j.a(((com.amazon.aps.iva.jh.f) obj).a(), languageTag)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        com.amazon.aps.iva.jh.f fVar = (com.amazon.aps.iva.jh.f) obj;
        if (fVar != null) {
            e(fVar.a(), 0, Z0);
            Locale locale = Locale.US;
            if (!j.a(languageTag, locale.toLanguageTag())) {
                String languageTag2 = locale.toLanguageTag();
                j.e(languageTag2, "US.toLanguageTag()");
                e(languageTag2, 1, Z0);
            }
        } else {
            String languageTag3 = Locale.US.toLanguageTag();
            j.e(languageTag3, "US.toLanguageTag()");
            e(languageTag3, 0, Z0);
        }
        return x.L0(f1.J(com.amazon.aps.iva.jh.d.c), Z0);
    }

    @Override // com.amazon.aps.iva.lh.a
    public final String getTitleForLanguage(String str) {
        Object obj;
        String obj2;
        j.f(str, "language");
        Iterator it = getOptions().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (j.a(((com.amazon.aps.iva.jh.f) obj).a(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        com.amazon.aps.iva.jh.f fVar = (com.amazon.aps.iva.jh.f) obj;
        if (fVar == null || (obj2 = this.b.b(fVar).toString()) == null) {
            return "";
        }
        return obj2;
    }

    @Override // com.amazon.aps.iva.lh.a
    public final String getTruncatedTitleForLanguage(String str) {
        Object obj;
        String obj2;
        j.f(str, "language");
        Iterator it = getOptions().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (j.a(((com.amazon.aps.iva.jh.f) obj).a(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        com.amazon.aps.iva.jh.f fVar = (com.amazon.aps.iva.jh.f) obj;
        if (fVar == null || (obj2 = q.O0(q.M0(this.b.b(fVar).toString(), "(")).toString()) == null) {
            return "";
        }
        return obj2;
    }
}

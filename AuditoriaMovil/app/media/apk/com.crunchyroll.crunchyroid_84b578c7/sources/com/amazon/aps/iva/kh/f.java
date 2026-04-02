package com.amazon.aps.iva.kh;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.jh.g;
import com.amazon.aps.iva.jh.h;
import com.amazon.aps.iva.jh.i;
import com.amazon.aps.iva.jh.l;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.oe0.q;
import com.amazon.aps.iva.yb0.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
/* compiled from: AudioLanguageOptionsProvider.kt */
/* loaded from: classes.dex */
public final class f implements e {
    public final i a;
    public final g b;
    public final com.amazon.aps.iva.p60.f c;
    public final l d;

    public f(i iVar, h hVar, com.amazon.aps.iva.p60.g gVar) {
        this.a = iVar;
        this.b = hVar;
        this.c = gVar;
        String languageTag = Locale.JAPAN.toLanguageTag();
        j.e(languageTag, "JAPAN.toLanguageTag()");
        this.d = new l(languageTag, "");
    }

    @Override // com.amazon.aps.iva.kh.e
    public final List<com.amazon.aps.iva.jh.f> getOptions() {
        Object obj;
        List J = f1.J(this.d);
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
            Z0.remove(fVar);
            Z0.add(0, fVar);
        }
        return x.L0(Z0, J);
    }

    @Override // com.amazon.aps.iva.kh.e
    public final String getSupportedAudioLanguageTag(String str) {
        Object obj;
        String a;
        j.f(str, "systemLanguageTag");
        Iterator it = ((ArrayList) getOptions()).iterator();
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

    @Override // com.amazon.aps.iva.kh.e
    public final String getTitleForLanguage(String str) {
        Object obj;
        String obj2;
        j.f(str, "language");
        Iterator it = ((ArrayList) getOptions()).iterator();
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
            String displayLanguage = new Locale((String) x.t0(q.E0(str, new String[]{"-"}))).getDisplayLanguage();
            j.e(displayLanguage, "Locale(language.split(\"-….first()).displayLanguage");
            return displayLanguage;
        }
        return obj2;
    }

    @Override // com.amazon.aps.iva.kh.e
    public final String getTruncatedTitleForLanguage(String str) {
        Object obj;
        String obj2;
        j.f(str, "language");
        Iterator it = ((ArrayList) getOptions()).iterator();
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
            String displayLanguage = new Locale((String) x.t0(q.E0(str, new String[]{"-"}))).getDisplayLanguage();
            j.e(displayLanguage, "Locale(language.split(\"-….first()).displayLanguage");
            return displayLanguage;
        }
        return obj2;
    }
}

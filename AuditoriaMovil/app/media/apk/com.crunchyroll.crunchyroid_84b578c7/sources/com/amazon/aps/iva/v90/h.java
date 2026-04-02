package com.amazon.aps.iva.v90;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.icu.text.PluralRules;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.yb0.e0;
import com.amazon.aps.iva.yb0.v;
import java.util.LinkedHashMap;
import java.util.Locale;
/* compiled from: ResourcesUtil.kt */
/* loaded from: classes4.dex */
public final class h {
    public static final /* synthetic */ l[] c = {e0.c(new v(e0.a(h.class), "repository", "getRepository()Lcom/jcminarro/philology/PhilologyRepository;"))};
    public final m a = com.amazon.aps.iva.kb0.f.b(new a());
    public final Resources b;

    /* compiled from: ResourcesUtil.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<e> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final e invoke() {
            LinkedHashMap linkedHashMap = com.amazon.aps.iva.v90.a.a;
            Configuration configuration = h.this.b.getConfiguration();
            com.amazon.aps.iva.yb0.j.b(configuration, "configuration");
            Locale locale = configuration.getLocales().get(0);
            com.amazon.aps.iva.yb0.j.b(locale, "configuration.locales[0]");
            LinkedHashMap linkedHashMap2 = com.amazon.aps.iva.v90.a.a;
            e eVar = (e) linkedHashMap2.get(locale);
            if (eVar == null) {
                eVar = com.amazon.aps.iva.v90.a.b.a(locale);
                if (eVar != null) {
                    linkedHashMap2.put(locale, eVar);
                } else {
                    eVar = null;
                }
            }
            if (eVar == null) {
                return d.a;
            }
            return eVar;
        }
    }

    public h(Resources resources) {
        this.b = resources;
    }

    public final CharSequence a(int i, int i2) throws Resources.NotFoundException {
        l lVar = c[0];
        Resources resources = this.b;
        String resourceEntryName = resources.getResourceEntryName(i);
        com.amazon.aps.iva.yb0.j.b(resourceEntryName, "baseResources.getResourceEntryName(id)");
        Configuration configuration = resources.getConfiguration();
        com.amazon.aps.iva.yb0.j.b(configuration, "configuration");
        Locale locale = configuration.getLocales().get(0);
        com.amazon.aps.iva.yb0.j.b(locale, "configuration.locales[0]");
        String select = PluralRules.forLocale(locale).select(i2);
        com.amazon.aps.iva.yb0.j.b(select, "PluralRules.forLocale(ba…).select(this.toDouble())");
        CharSequence a2 = ((e) this.a.getValue()).a(resourceEntryName, select);
        if (a2 == null) {
            CharSequence quantityText = resources.getQuantityText(i, i2);
            com.amazon.aps.iva.yb0.j.b(quantityText, "baseResources.getQuantityText(id, quantity)");
            return quantityText;
        }
        return a2;
    }

    public final CharSequence b(int i) throws Resources.NotFoundException {
        l lVar = c[0];
        Resources resources = this.b;
        String resourceEntryName = resources.getResourceEntryName(i);
        com.amazon.aps.iva.yb0.j.b(resourceEntryName, "baseResources.getResourceEntryName(id)");
        CharSequence text = ((e) this.a.getValue()).getText(resourceEntryName);
        if (text == null) {
            CharSequence text2 = resources.getText(i);
            com.amazon.aps.iva.yb0.j.b(text2, "baseResources.getText(id)");
            return text2;
        }
        return text;
    }

    public final CharSequence[] c(int i) {
        l lVar = c[0];
        Resources resources = this.b;
        String resourceEntryName = resources.getResourceEntryName(i);
        com.amazon.aps.iva.yb0.j.b(resourceEntryName, "baseResources.getResourceEntryName(id)");
        CharSequence[] b = ((e) this.a.getValue()).b(resourceEntryName);
        if (b == null) {
            CharSequence[] textArray = resources.getTextArray(i);
            com.amazon.aps.iva.yb0.j.b(textArray, "baseResources.getTextArray(id)");
            return textArray;
        }
        return b;
    }
}

package com.ellation.crunchyroll.ui.labels.medialanguague;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.jh.e;
import com.amazon.aps.iva.jh.f;
import com.amazon.aps.iva.jh.i;
import com.amazon.aps.iva.jh.l;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.yb0.j;
import java.util.List;
import kotlin.Metadata;
/* compiled from: TestDoubleMediaLanguageService.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0016R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ellation/crunchyroll/ui/labels/medialanguague/FakeAudioLanguageOptionsStore;", "Lcom/amazon/aps/iva/jh/i;", "", "optionsJson", "Lcom/amazon/aps/iva/kb0/q;", "store", "fallbackOptionsJson", "storeFallbacks", "", "Lcom/amazon/aps/iva/jh/f;", "read", "Lcom/amazon/aps/iva/jh/e;", "readFallback", "Lcom/amazon/aps/iva/jh/l;", "options", "Ljava/util/List;", "<init>", "()V", "widgets_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class FakeAudioLanguageOptionsStore implements i {
    private final List<l> options = f1.K(new l("ja-JP", "Japanese"), new l("en-US", "English"), new l("de-DE", "Deutsch"), new l("es-419", "Español (América Latina)"), new l("es-ES", "Español (España)"), new l("fr-FR", "Français"), new l("it-IT", "Italiano"), new l("pt-BR", "Português (Brasil)"), new l("pt-PT", "Português (Portugal)"), new l("ru-RU", "Русский"), new l("ar-SA", "العربية"), new l("hi-IN", "Hindi"));

    @Override // com.amazon.aps.iva.jh.i
    public List<f> read() {
        return this.options;
    }

    @Override // com.amazon.aps.iva.jh.i
    public List<e> readFallback() {
        return z.b;
    }

    @Override // com.amazon.aps.iva.jh.i
    public void store(String str) {
        j.f(str, "optionsJson");
    }

    @Override // com.amazon.aps.iva.jh.i
    public void storeFallbacks(String str) {
        j.f(str, "fallbackOptionsJson");
    }
}

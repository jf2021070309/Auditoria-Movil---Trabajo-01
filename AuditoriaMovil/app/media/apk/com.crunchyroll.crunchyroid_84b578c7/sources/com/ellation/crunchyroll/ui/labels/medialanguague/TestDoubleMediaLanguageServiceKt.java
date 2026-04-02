package com.ellation.crunchyroll.ui.labels.medialanguague;

import android.content.Context;
import com.amazon.aps.iva.jh.h;
import com.amazon.aps.iva.kh.f;
import com.amazon.aps.iva.lh.b;
import com.amazon.aps.iva.p60.f;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.ui.labels.medialanguague.MediaLanguageService;
import com.google.gson.Gson;
import kotlin.Metadata;
/* compiled from: TestDoubleMediaLanguageService.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¨\u0006\t"}, d2 = {"Lcom/ellation/crunchyroll/ui/labels/medialanguague/MediaLanguageService$Companion;", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "", "dubPref", "subPref", "Lcom/amazon/aps/iva/kb0/q;", "testInit", "widgets_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class TestDoubleMediaLanguageServiceKt {
    public static final void testInit(MediaLanguageService.Companion companion, Context context, a<String> aVar, a<String> aVar2) {
        j.f(companion, "<this>");
        j.f(context, "context");
        j.f(aVar, "dubPref");
        j.f(aVar2, "subPref");
        companion.init(context, aVar, aVar2, new f(new FakeAudioLanguageOptionsStore(), new h(context), f.a.a(context, new Gson())), new b(new FakeSubLanguageOptionsStore(), new h(context), f.a.a(context, new Gson())));
    }

    public static /* synthetic */ void testInit$default(MediaLanguageService.Companion companion, Context context, a aVar, a aVar2, int i, Object obj) {
        if ((i & 2) != 0) {
            aVar = TestDoubleMediaLanguageServiceKt$testInit$1.INSTANCE;
        }
        if ((i & 4) != 0) {
            aVar2 = TestDoubleMediaLanguageServiceKt$testInit$2.INSTANCE;
        }
        testInit(companion, context, aVar, aVar2);
    }
}

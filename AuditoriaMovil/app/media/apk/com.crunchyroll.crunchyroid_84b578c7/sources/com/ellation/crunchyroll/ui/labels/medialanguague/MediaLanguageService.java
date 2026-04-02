package com.ellation.crunchyroll.ui.labels.medialanguague;

import android.annotation.SuppressLint;
import android.content.Context;
import com.amazon.aps.iva.kh.e;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.LabeledContent;
import kotlin.Metadata;
/* compiled from: MediaLanguageService.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/ellation/crunchyroll/ui/labels/medialanguague/MediaLanguageService;", "", "getLanguageModel", "Lcom/ellation/crunchyroll/ui/labels/medialanguague/MediaLanguageModel;", "labeledContent", "Lcom/ellation/crunchyroll/model/LabeledContent;", "useEpisodeData", "", "Companion", "widgets_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface MediaLanguageService {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: MediaLanguageService.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J:\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nR\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/ellation/crunchyroll/ui/labels/medialanguague/MediaLanguageService$Companion;", "", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "", "dubPref", "subPref", "Lcom/amazon/aps/iva/kh/e;", "audioProvider", "Lcom/amazon/aps/iva/lh/a;", "subtitlesProvider", "Lcom/amazon/aps/iva/kb0/q;", "init", "Lcom/ellation/crunchyroll/ui/labels/medialanguague/MediaLanguageServiceImpl;", "instance", "Lcom/ellation/crunchyroll/ui/labels/medialanguague/MediaLanguageServiceImpl;", "getInstance", "()Lcom/ellation/crunchyroll/ui/labels/medialanguague/MediaLanguageServiceImpl;", "setInstance", "(Lcom/ellation/crunchyroll/ui/labels/medialanguague/MediaLanguageServiceImpl;)V", "<init>", "()V", "widgets_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        @SuppressLint({"StaticFieldLeak"})
        public static MediaLanguageServiceImpl instance;

        private Companion() {
        }

        public final MediaLanguageServiceImpl getInstance() {
            MediaLanguageServiceImpl mediaLanguageServiceImpl = instance;
            if (mediaLanguageServiceImpl != null) {
                return mediaLanguageServiceImpl;
            }
            j.m("instance");
            throw null;
        }

        public final void init(Context context, a<String> aVar, a<String> aVar2, e eVar, com.amazon.aps.iva.lh.a aVar3) {
            j.f(context, "context");
            j.f(aVar, "dubPref");
            j.f(aVar2, "subPref");
            j.f(eVar, "audioProvider");
            j.f(aVar3, "subtitlesProvider");
            setInstance(new MediaLanguageServiceImpl(context, aVar, aVar2, eVar, aVar3));
        }

        public final void setInstance(MediaLanguageServiceImpl mediaLanguageServiceImpl) {
            j.f(mediaLanguageServiceImpl, "<set-?>");
            instance = mediaLanguageServiceImpl;
        }
    }

    /* compiled from: MediaLanguageService.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ MediaLanguageModel getLanguageModel$default(MediaLanguageService mediaLanguageService, LabeledContent labeledContent, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = false;
                }
                return mediaLanguageService.getLanguageModel(labeledContent, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLanguageModel");
        }
    }

    MediaLanguageModel getLanguageModel(LabeledContent labeledContent, boolean z);
}

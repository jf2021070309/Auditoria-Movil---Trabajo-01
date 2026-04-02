package com.ellation.crunchyroll.ui.labels.medialanguague;

import android.content.Context;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.jh.f;
import com.amazon.aps.iva.kh.e;
import com.amazon.aps.iva.lb0.i0;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lb0.s;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.ui.labels.medialanguague.MediaLanguageModel;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: MediaLanguageService.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b-\u0010.J\u001e\u0010\u0007\u001a\u00020\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J,\u0010\n\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J\u001e\u0010\f\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J\u001e\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0002J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0002J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0018\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0006H\u0016R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010)¨\u0006/"}, d2 = {"Lcom/ellation/crunchyroll/ui/labels/medialanguague/MediaLanguageServiceImpl;", "Lcom/ellation/crunchyroll/ui/labels/medialanguague/MediaLanguageService;", "", "", "audioLocales", "originalAudio", "", "audioLocalesIsNotEmptyOrOnlyOriginal", "subLocales", "Lcom/ellation/crunchyroll/ui/labels/medialanguague/MediaLanguageModel;", "contentIsDubbedAndSubbed", "availableAudioLocales", "contentIsDubbed", "subtitleLocales", "contentIsSubbed", "language", "getProperSubtitleLanguage", "getProperAudioLanguage", "Lcom/amazon/aps/iva/jh/f;", "options", "audioLocale", "", "getSortedList", "Lcom/ellation/crunchyroll/model/LabeledContent;", "labeledContent", "useEpisodeData", "getLanguageModel", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lkotlin/Function0;", "dubPref", "Lcom/amazon/aps/iva/xb0/a;", "subPref", "Lcom/amazon/aps/iva/kh/e;", "audioProvider", "Lcom/amazon/aps/iva/kh/e;", "Lcom/amazon/aps/iva/lh/a;", "subtitlesProvider", "Lcom/amazon/aps/iva/lh/a;", "getPreferredAudioLanguage", "()Ljava/lang/String;", "preferredAudioLanguage", "getPreferredSubtitleLanguage", "preferredSubtitleLanguage", "<init>", "(Landroid/content/Context;Lcom/amazon/aps/iva/xb0/a;Lcom/amazon/aps/iva/xb0/a;Lcom/amazon/aps/iva/kh/e;Lcom/amazon/aps/iva/lh/a;)V", "widgets_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class MediaLanguageServiceImpl implements MediaLanguageService {
    public static final int $stable = 8;
    private final e audioProvider;
    private final Context context;
    private final a<String> dubPref;
    private final a<String> subPref;
    private final com.amazon.aps.iva.lh.a subtitlesProvider;

    public MediaLanguageServiceImpl(Context context, a<String> aVar, a<String> aVar2, e eVar, com.amazon.aps.iva.lh.a aVar3) {
        j.f(context, "context");
        j.f(aVar, "dubPref");
        j.f(aVar2, "subPref");
        j.f(eVar, "audioProvider");
        j.f(aVar3, "subtitlesProvider");
        this.context = context;
        this.dubPref = aVar;
        this.subPref = aVar2;
        this.audioProvider = eVar;
        this.subtitlesProvider = aVar3;
    }

    private final boolean audioLocalesIsNotEmptyOrOnlyOriginal(List<String> list, String str) {
        if ((!list.isEmpty()) && list.size() != 1 && !j.a(x.t0(list), str)) {
            return true;
        }
        return false;
    }

    private final MediaLanguageModel contentIsDubbed(List<String> list, String str) {
        boolean contains = list.contains(getPreferredAudioLanguage());
        if (!list.isEmpty()) {
            if (contains) {
                String string = this.context.getString(R.string.dubbed_label_title);
                j.e(string, "context.getString(R.string.dubbed_label_title)");
                return new MediaLanguageModel.PreferredDub(string);
            }
            String string2 = this.context.getString(R.string.fallback_dubbed_label_title_language, getProperAudioLanguage((String) x.t0(list)));
            j.e(string2, "context.getString(\n     …())\n                    )");
            return new MediaLanguageModel.FallbackDub(string2);
        }
        return new MediaLanguageModel.Default(getProperAudioLanguage(str));
    }

    private final MediaLanguageModel contentIsDubbedAndSubbed(List<String> list, List<String> list2, String str) {
        MediaLanguageModel fallbackDub;
        boolean contains = list.contains(getPreferredAudioLanguage());
        boolean contains2 = list2.contains(getPreferredSubtitleLanguage());
        List<String> list3 = list;
        if ((!list3.isEmpty()) && (!list2.isEmpty())) {
            if (contains && contains2) {
                String string = this.context.getString(R.string.subbed_dubbed_label_title);
                j.e(string, "context.getString(R.stri…ubbed_dubbed_label_title)");
                return new MediaLanguageModel.PreferredDubAndSub(string);
            } else if (contains && !contains2) {
                String string2 = this.context.getString(R.string.preferred_dubbed_fallback_subbed_label_title_language, getProperSubtitleLanguage((String) x.t0(list2)));
                j.e(string2, "context.getString(\n     …                        )");
                return new MediaLanguageModel.PreferredDubFallbackSub(string2);
            } else if (!contains && contains2) {
                String string3 = this.context.getString(R.string.fallback_dubbed_preferred_sub_label_title_language, getProperAudioLanguage((String) x.t0(list)));
                j.e(string3, "context.getString(\n     …                        )");
                fallbackDub = new MediaLanguageModel.FallbackDubPreferredSub(string3);
            } else {
                String string4 = this.context.getString(R.string.fallback_dubbed_fallback_subbed_label_title_language, getProperAudioLanguage((String) x.t0(list)), getProperSubtitleLanguage((String) x.t0(list2)));
                j.e(string4, "context.getString(\n     …                        )");
                return new MediaLanguageModel.FallbackDubAndSub(string4);
            }
        } else if (!list3.isEmpty()) {
            if (contains) {
                String string5 = this.context.getString(R.string.dubbed_label_title);
                j.e(string5, "context.getString(R.string.dubbed_label_title)");
                return new MediaLanguageModel.PreferredDub(string5);
            }
            String string6 = this.context.getString(R.string.fallback_dubbed_label_title_language, getProperAudioLanguage((String) x.t0(list)));
            j.e(string6, "context.getString(\n     …                        )");
            fallbackDub = new MediaLanguageModel.FallbackDub(string6);
        } else if (!list2.isEmpty()) {
            if (contains2) {
                String string7 = this.context.getString(R.string.subbed_label_title);
                j.e(string7, "context.getString(R.string.subbed_label_title)");
                return new MediaLanguageModel.PreferredSub(string7);
            }
            String string8 = this.context.getString(R.string.fallback_subbed_label_title_language, getProperSubtitleLanguage((String) x.t0(list2)));
            j.e(string8, "context.getString(\n     …                        )");
            return new MediaLanguageModel.FallbackSub(string8);
        } else {
            return new MediaLanguageModel.Default(getProperAudioLanguage(str));
        }
        return fallbackDub;
    }

    private final MediaLanguageModel contentIsSubbed(List<String> list, String str) {
        boolean contains = list.contains(getPreferredSubtitleLanguage());
        if (!list.isEmpty()) {
            if (contains) {
                String string = this.context.getString(R.string.subbed_label_title);
                j.e(string, "context.getString(R.string.subbed_label_title)");
                return new MediaLanguageModel.PreferredSub(string);
            }
            String string2 = this.context.getString(R.string.fallback_subbed_label_title_language, getProperSubtitleLanguage((String) x.t0(list)));
            j.e(string2, "context.getString(\n     …())\n                    )");
            return new MediaLanguageModel.FallbackSub(string2);
        }
        return new MediaLanguageModel.Default(getProperAudioLanguage(str));
    }

    private final String getPreferredAudioLanguage() {
        return this.dubPref.invoke();
    }

    private final String getPreferredSubtitleLanguage() {
        return this.subPref.invoke();
    }

    private final String getProperAudioLanguage(String str) {
        return this.audioProvider.getTruncatedTitleForLanguage(str);
    }

    private final String getProperSubtitleLanguage(String str) {
        return this.subtitlesProvider.getTruncatedTitleForLanguage(str);
    }

    private final List<String> getSortedList(List<? extends f> list, List<String> list2) {
        List<? extends f> list3 = list;
        ArrayList arrayList = new ArrayList(r.Y(list3));
        int i = 0;
        for (Object obj : list3) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new com.amazon.aps.iva.kb0.j(((f) obj).a(), Integer.valueOf(i)));
                i = i2;
            } else {
                f1.S();
                throw null;
            }
        }
        final Map Z = i0.Z(arrayList);
        ArrayList Z0 = x.Z0(list2);
        if (Z0.size() > 1) {
            s.a0(Z0, new Comparator() { // from class: com.ellation.crunchyroll.ui.labels.medialanguague.MediaLanguageServiceImpl$getSortedList$lambda$3$$inlined$sortBy$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return f1.t((Integer) Z.get((String) t), (Integer) Z.get((String) t2));
                }
            });
        }
        String languageTag = Locale.JAPAN.toLanguageTag();
        if (Z0.contains(languageTag)) {
            Z0.remove(languageTag);
            j.e(languageTag, "jaJP");
            Z0.add(languageTag);
        }
        return Z0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    @Override // com.ellation.crunchyroll.ui.labels.medialanguague.MediaLanguageService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.ellation.crunchyroll.ui.labels.medialanguague.MediaLanguageModel getLanguageModel(com.ellation.crunchyroll.model.LabeledContent r7, boolean r8) {
        /*
            r6 = this;
            java.lang.String r0 = "labeledContent"
            com.amazon.aps.iva.yb0.j.f(r7, r0)
            java.lang.String r0 = r7.getOriginalAudio()
            if (r0 != 0) goto L11
            java.util.Locale r0 = java.util.Locale.JAPAN
            java.lang.String r0 = r0.toLanguageTag()
        L11:
            if (r8 == 0) goto L34
            boolean r8 = r7 instanceof com.ellation.crunchyroll.model.Panel
            if (r8 == 0) goto L28
            r8 = r7
            com.ellation.crunchyroll.model.Panel r8 = (com.ellation.crunchyroll.model.Panel) r8
            java.lang.String r8 = r8.getEpisodeAudioLocale()
            if (r8 == 0) goto L25
            java.util.List r8 = com.amazon.aps.iva.ee0.f1.J(r8)
            goto L42
        L25:
            com.amazon.aps.iva.lb0.z r8 = com.amazon.aps.iva.lb0.z.b
            goto L42
        L28:
            r8 = r7
            com.ellation.crunchyroll.model.Episode r8 = (com.ellation.crunchyroll.model.Episode) r8
            java.lang.String r8 = r8.getAudioLocale()
            java.util.List r8 = com.amazon.aps.iva.ee0.f1.J(r8)
            goto L42
        L34:
            com.amazon.aps.iva.kh.e r8 = r6.audioProvider
            java.util.List r8 = r8.getOptions()
            java.util.List r1 = r7.getAvailableAudioLocales()
            java.util.List r8 = r6.getSortedList(r8, r1)
        L42:
            com.amazon.aps.iva.lh.a r1 = r6.subtitlesProvider
            java.util.ArrayList r1 = r1.getOptions()
            java.util.List r2 = r7.getAvailableSubtitleLocales()
            java.util.List r1 = r6.getSortedList(r1, r2)
            boolean r2 = r7.isDubbed()
            r3 = 0
            r4 = 1
            java.lang.String r5 = "originalAudio"
            if (r2 != 0) goto L66
            com.amazon.aps.iva.yb0.j.e(r0, r5)
            boolean r2 = r6.audioLocalesIsNotEmptyOrOnlyOriginal(r8, r0)
            if (r2 == 0) goto L64
            goto L66
        L64:
            r2 = r3
            goto L67
        L66:
            r2 = r4
        L67:
            boolean r7 = r7.isSubbed()
            if (r7 != 0) goto L77
            r7 = r1
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            r7 = r7 ^ r4
            if (r7 == 0) goto L78
        L77:
            r3 = r4
        L78:
            if (r2 == 0) goto L84
            if (r3 == 0) goto L84
            com.amazon.aps.iva.yb0.j.e(r0, r5)
            com.ellation.crunchyroll.ui.labels.medialanguague.MediaLanguageModel r7 = r6.contentIsDubbedAndSubbed(r8, r1, r0)
            goto La4
        L84:
            if (r2 == 0) goto L8e
            com.amazon.aps.iva.yb0.j.e(r0, r5)
            com.ellation.crunchyroll.ui.labels.medialanguague.MediaLanguageModel r7 = r6.contentIsDubbed(r8, r0)
            goto La4
        L8e:
            if (r3 == 0) goto L98
            com.amazon.aps.iva.yb0.j.e(r0, r5)
            com.ellation.crunchyroll.ui.labels.medialanguague.MediaLanguageModel r7 = r6.contentIsSubbed(r1, r0)
            goto La4
        L98:
            com.ellation.crunchyroll.ui.labels.medialanguague.MediaLanguageModel$Default r7 = new com.ellation.crunchyroll.ui.labels.medialanguague.MediaLanguageModel$Default
            com.amazon.aps.iva.yb0.j.e(r0, r5)
            java.lang.String r8 = r6.getProperAudioLanguage(r0)
            r7.<init>(r8)
        La4:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.ui.labels.medialanguague.MediaLanguageServiceImpl.getLanguageModel(com.ellation.crunchyroll.model.LabeledContent, boolean):com.ellation.crunchyroll.ui.labels.medialanguague.MediaLanguageModel");
    }
}

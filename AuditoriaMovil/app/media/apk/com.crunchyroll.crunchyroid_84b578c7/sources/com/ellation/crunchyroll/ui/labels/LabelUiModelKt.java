package com.ellation.crunchyroll.ui.labels;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.pe0.a;
import com.amazon.aps.iva.qe0.h;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.LabeledContent;
import com.ellation.crunchyroll.model.maturityrating.ExtendedMaturityRating;
import com.ellation.crunchyroll.ui.labels.medialanguague.MediaLanguageModel;
import com.ellation.crunchyroll.ui.labels.medialanguague.MediaLanguageService;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import kotlin.Metadata;
import org.apache.commons.codec.binary.BaseNCodec;
/* compiled from: LabelUiModel.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u001a\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0000H\u0002\u001a\f\u0010\u0007\u001a\u00020\u0005*\u00020\u0000H\u0002\u001a\f\u0010\b\u001a\u00020\u0005*\u00020\u0000H\u0002\u001a\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¨\u0006\r"}, d2 = {"Lcom/ellation/crunchyroll/model/LabeledContent;", "", "useEpisodeData", "Lcom/ellation/crunchyroll/ui/labels/LabelUiModel;", "toLabelUiModel", "Lcom/ellation/crunchyroll/ui/labels/MaturityRatingType;", "mapMaturityRating", "mapBrazilMaturityRating", "mapNewZealandMaturityRating", "Lcom/amazon/aps/iva/x50/t;", "resourceType", "Lcom/ellation/crunchyroll/ui/labels/LabelContentType;", "mapResourceType", "widgets_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class LabelUiModelKt {

    /* compiled from: LabelUiModel.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.SERIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.MOVIE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t.MOVIE_LISTING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[t.EPISODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final MaturityRatingType mapBrazilMaturityRating(LabeledContent labeledContent) {
        String str;
        ExtendedMaturityRating extendedMaturityRating = labeledContent.getExtendedMaturityRating();
        if (extendedMaturityRating != null) {
            str = extendedMaturityRating.getRating();
        } else {
            str = null;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case BaseNCodec.MIME_CHUNK_SIZE /* 76 */:
                    if (str.equals("L")) {
                        return MaturityRatingType.BRAZIL_RATING_L;
                    }
                    break;
                case 1567:
                    if (str.equals("10")) {
                        return MaturityRatingType.BRAZIL_RATING_10;
                    }
                    break;
                case 1569:
                    if (str.equals("12")) {
                        return MaturityRatingType.BRAZIL_RATING_12;
                    }
                    break;
                case 1571:
                    if (str.equals("14")) {
                        return MaturityRatingType.BRAZIL_RATING_14;
                    }
                    break;
                case 1573:
                    if (str.equals("16")) {
                        return MaturityRatingType.BRAZIL_RATING_16;
                    }
                    break;
                case 1575:
                    if (str.equals("18")) {
                        return MaturityRatingType.BRAZIL_RATING_18;
                    }
                    break;
                case 2091:
                    if (str.equals("AL")) {
                        return MaturityRatingType.BRAZIL_RATING_AL;
                    }
                    break;
                case 64032:
                    if (str.equals("A10")) {
                        return MaturityRatingType.BRAZIL_RATING_A10;
                    }
                    break;
                case 64034:
                    if (str.equals("A12")) {
                        return MaturityRatingType.BRAZIL_RATING_A12;
                    }
                    break;
                case 64036:
                    if (str.equals("A14")) {
                        return MaturityRatingType.BRAZIL_RATING_A14;
                    }
                    break;
                case 64038:
                    if (str.equals("A16")) {
                        return MaturityRatingType.BRAZIL_RATING_A16;
                    }
                    break;
                case 64040:
                    if (str.equals("A18")) {
                        return MaturityRatingType.BRAZIL_RATING_A18;
                    }
                    break;
            }
        }
        return MaturityRatingType.UNDEFINED;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (r0.equals("cr-br-movies") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
        if (r0.equals("cr-br-tv") != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
        return mapBrazilMaturityRating(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final com.ellation.crunchyroll.ui.labels.MaturityRatingType mapMaturityRating(com.ellation.crunchyroll.model.LabeledContent r3) {
        /*
            com.ellation.crunchyroll.model.maturityrating.ExtendedMaturityRating r0 = r3.getExtendedMaturityRating()
            if (r0 == 0) goto Lb
            java.lang.String r0 = r0.getSystem()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L46
            int r1 = r0.hashCode()
            r2 = 217995841(0xcfe5a41, float:3.9189216E-31)
            if (r1 == r2) goto L39
            r2 = 229316421(0xdab1745, float:1.0544291E-30)
            if (r1 == r2) goto L2b
            r2 = 1236794242(0x49b7fb82, float:1507184.2)
            if (r1 == r2) goto L22
            goto L46
        L22:
            java.lang.String r1 = "cr-br-movies"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L41
            goto L46
        L2b:
            java.lang.String r1 = "cr-nz-tv"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L34
            goto L46
        L34:
            com.ellation.crunchyroll.ui.labels.MaturityRatingType r3 = mapNewZealandMaturityRating(r3)
            goto L48
        L39:
            java.lang.String r1 = "cr-br-tv"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L46
        L41:
            com.ellation.crunchyroll.ui.labels.MaturityRatingType r3 = mapBrazilMaturityRating(r3)
            goto L48
        L46:
            com.ellation.crunchyroll.ui.labels.MaturityRatingType r3 = com.ellation.crunchyroll.ui.labels.MaturityRatingType.UNDEFINED
        L48:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.ui.labels.LabelUiModelKt.mapMaturityRating(com.ellation.crunchyroll.model.LabeledContent):com.ellation.crunchyroll.ui.labels.MaturityRatingType");
    }

    private static final MaturityRatingType mapNewZealandMaturityRating(LabeledContent labeledContent) {
        String str;
        ExtendedMaturityRating extendedMaturityRating = labeledContent.getExtendedMaturityRating();
        if (extendedMaturityRating != null) {
            str = extendedMaturityRating.getRating();
        } else {
            str = null;
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 71) {
                if (hashCode != 77) {
                    if (hashCode != 1570) {
                        if (hashCode != 1573) {
                            if (hashCode != 1575) {
                                if (hashCode == 2551 && str.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_PG)) {
                                    return MaturityRatingType.NEW_ZEALAND_PG;
                                }
                            } else if (str.equals("18")) {
                                return MaturityRatingType.NEW_ZEALAND_18;
                            }
                        } else if (str.equals("16")) {
                            return MaturityRatingType.NEW_ZEALAND_16;
                        }
                    } else if (str.equals("13")) {
                        return MaturityRatingType.NEW_ZEALAND_13;
                    }
                } else if (str.equals("M")) {
                    return MaturityRatingType.NEW_ZEALAND_M;
                }
            } else if (str.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_G)) {
                return MaturityRatingType.NEW_ZEALAND_G;
            }
        }
        return MaturityRatingType.UNDEFINED;
    }

    private static final LabelContentType mapResourceType(t tVar) {
        int i = WhenMappings.$EnumSwitchMapping$0[tVar.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i != 4) {
                    return LabelContentType.OTHER;
                }
                return LabelContentType.EPISODE;
            }
            return LabelContentType.MOVIE;
        }
        return LabelContentType.SERIES;
    }

    public static final LabelUiModel toLabelUiModel(LabeledContent labeledContent, boolean z) {
        a aVar;
        j.f(labeledContent, "<this>");
        LabelContentType mapResourceType = mapResourceType(labeledContent.getResourceType());
        boolean isMature = labeledContent.isMature();
        boolean isMatureBlocked = labeledContent.isMatureBlocked();
        MaturityRatingType mapMaturityRating = mapMaturityRating(labeledContent);
        boolean isDubbed = labeledContent.isDubbed();
        MediaLanguageModel languageModel = MediaLanguageService.Companion.getInstance().getLanguageModel(labeledContent, z);
        List<String> contentDescriptors = labeledContent.getContentDescriptors();
        if (contentDescriptors == null || (aVar = x.m0(contentDescriptors)) == null) {
            aVar = h.c;
        }
        return new LabelUiModel(mapResourceType, isMature, isMatureBlocked, isDubbed, mapMaturityRating, aVar, languageModel, labeledContent.getOriginalAudio());
    }

    public static /* synthetic */ LabelUiModel toLabelUiModel$default(LabeledContent labeledContent, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toLabelUiModel(labeledContent, z);
    }
}

package com.ellation.crunchyroll.ui.labels;

import com.amazon.aps.iva.yb0.e;
import com.crunchyroll.crunchyroid.R;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum BRAZIL_RATING_L uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: LabelUiModel.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B%\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!¨\u0006\""}, d2 = {"Lcom/ellation/crunchyroll/ui/labels/MaturityRatingType;", "", "ratingText", "", "ratingIcon", "", "contentDescriptionTextRes", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Integer;)V", "getContentDescriptionTextRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRatingIcon", "()I", "getRatingText", "()Ljava/lang/String;", "BRAZIL_RATING_L", "BRAZIL_RATING_AL", "BRAZIL_RATING_10", "BRAZIL_RATING_A10", "BRAZIL_RATING_12", "BRAZIL_RATING_A12", "BRAZIL_RATING_14", "BRAZIL_RATING_A14", "BRAZIL_RATING_16", "BRAZIL_RATING_A16", "BRAZIL_RATING_18", "BRAZIL_RATING_A18", "NEW_ZEALAND_G", "NEW_ZEALAND_PG", "NEW_ZEALAND_M", "NEW_ZEALAND_13", "NEW_ZEALAND_16", "NEW_ZEALAND_18", "UNDEFINED", "widgets_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MaturityRatingType {
    private static final /* synthetic */ MaturityRatingType[] $VALUES;
    public static final MaturityRatingType BRAZIL_RATING_10;
    public static final MaturityRatingType BRAZIL_RATING_12;
    public static final MaturityRatingType BRAZIL_RATING_14;
    public static final MaturityRatingType BRAZIL_RATING_16;
    public static final MaturityRatingType BRAZIL_RATING_18;
    public static final MaturityRatingType BRAZIL_RATING_A10;
    public static final MaturityRatingType BRAZIL_RATING_A12;
    public static final MaturityRatingType BRAZIL_RATING_A14;
    public static final MaturityRatingType BRAZIL_RATING_A16;
    public static final MaturityRatingType BRAZIL_RATING_A18;
    public static final MaturityRatingType BRAZIL_RATING_AL;
    public static final MaturityRatingType BRAZIL_RATING_L;
    public static final MaturityRatingType NEW_ZEALAND_13;
    public static final MaturityRatingType NEW_ZEALAND_16;
    public static final MaturityRatingType NEW_ZEALAND_18;
    public static final MaturityRatingType NEW_ZEALAND_G;
    public static final MaturityRatingType NEW_ZEALAND_M;
    public static final MaturityRatingType NEW_ZEALAND_PG;
    public static final MaturityRatingType UNDEFINED;
    private final Integer contentDescriptionTextRes;
    private final int ratingIcon;
    private final String ratingText;

    private static final /* synthetic */ MaturityRatingType[] $values() {
        return new MaturityRatingType[]{BRAZIL_RATING_L, BRAZIL_RATING_AL, BRAZIL_RATING_10, BRAZIL_RATING_A10, BRAZIL_RATING_12, BRAZIL_RATING_A12, BRAZIL_RATING_14, BRAZIL_RATING_A14, BRAZIL_RATING_16, BRAZIL_RATING_A16, BRAZIL_RATING_18, BRAZIL_RATING_A18, NEW_ZEALAND_G, NEW_ZEALAND_PG, NEW_ZEALAND_M, NEW_ZEALAND_13, NEW_ZEALAND_16, NEW_ZEALAND_18, UNDEFINED};
    }

    static {
        Integer valueOf = Integer.valueOf((int) R.string.desc_maturity_rating_l);
        BRAZIL_RATING_L = new MaturityRatingType("BRAZIL_RATING_L", 0, "L", R.drawable.ic_br_content_rating_l, valueOf);
        BRAZIL_RATING_AL = new MaturityRatingType("BRAZIL_RATING_AL", 1, "AL", R.drawable.ic_br_content_rating_al, valueOf);
        BRAZIL_RATING_10 = new MaturityRatingType("BRAZIL_RATING_10", 2, "10", R.drawable.ic_br_content_rating_10, null, 4, null);
        BRAZIL_RATING_A10 = new MaturityRatingType("BRAZIL_RATING_A10", 3, "A10", R.drawable.ic_br_content_rating_a10, null, 4, null);
        BRAZIL_RATING_12 = new MaturityRatingType("BRAZIL_RATING_12", 4, "12", R.drawable.ic_br_content_rating_12, null, 4, null);
        BRAZIL_RATING_A12 = new MaturityRatingType("BRAZIL_RATING_A12", 5, "A12", R.drawable.ic_br_content_rating_a12, null, 4, null);
        BRAZIL_RATING_14 = new MaturityRatingType("BRAZIL_RATING_14", 6, "14", R.drawable.ic_br_content_rating_14, null, 4, null);
        BRAZIL_RATING_A14 = new MaturityRatingType("BRAZIL_RATING_A14", 7, "A14", R.drawable.ic_br_content_rating_a14, null, 4, null);
        BRAZIL_RATING_16 = new MaturityRatingType("BRAZIL_RATING_16", 8, "16", R.drawable.ic_br_content_rating_16, null, 4, null);
        BRAZIL_RATING_A16 = new MaturityRatingType("BRAZIL_RATING_A16", 9, "A16", R.drawable.ic_br_content_rating_a16, null, 4, null);
        BRAZIL_RATING_18 = new MaturityRatingType("BRAZIL_RATING_18", 10, "18", R.drawable.ic_br_content_rating_18, null, 4, null);
        BRAZIL_RATING_A18 = new MaturityRatingType("BRAZIL_RATING_A18", 11, "A18", R.drawable.ic_br_content_rating_a18, null, 4, null);
        NEW_ZEALAND_G = new MaturityRatingType("NEW_ZEALAND_G", 12, RequestConfiguration.MAX_AD_CONTENT_RATING_G, R.drawable.ic_nz_content_rating_g, null, 4, null);
        NEW_ZEALAND_PG = new MaturityRatingType("NEW_ZEALAND_PG", 13, RequestConfiguration.MAX_AD_CONTENT_RATING_PG, R.drawable.ic_nz_content_rating_pg, null, 4, null);
        NEW_ZEALAND_M = new MaturityRatingType("NEW_ZEALAND_M", 14, "M", R.drawable.ic_nz_content_rating_m, null, 4, null);
        NEW_ZEALAND_13 = new MaturityRatingType("NEW_ZEALAND_13", 15, "13", R.drawable.ic_nz_content_rating_13, null, 4, null);
        NEW_ZEALAND_16 = new MaturityRatingType("NEW_ZEALAND_16", 16, "16", R.drawable.ic_nz_content_rating_16, null, 4, null);
        NEW_ZEALAND_18 = new MaturityRatingType("NEW_ZEALAND_18", 17, "18", R.drawable.ic_nz_content_rating_18, null, 4, null);
        UNDEFINED = new MaturityRatingType("UNDEFINED", 18, "", 0, 0);
        $VALUES = $values();
    }

    private MaturityRatingType(String str, int i, String str2, int i2, Integer num) {
        this.ratingText = str2;
        this.ratingIcon = i2;
        this.contentDescriptionTextRes = num;
    }

    public static MaturityRatingType valueOf(String str) {
        return (MaturityRatingType) Enum.valueOf(MaturityRatingType.class, str);
    }

    public static MaturityRatingType[] values() {
        return (MaturityRatingType[]) $VALUES.clone();
    }

    public final Integer getContentDescriptionTextRes() {
        return this.contentDescriptionTextRes;
    }

    public final int getRatingIcon() {
        return this.ratingIcon;
    }

    public final String getRatingText() {
        return this.ratingText;
    }

    public /* synthetic */ MaturityRatingType(String str, int i, String str2, int i2, Integer num, int i3, e eVar) {
        this(str, i, str2, i2, (i3 & 4) != 0 ? null : num);
    }
}

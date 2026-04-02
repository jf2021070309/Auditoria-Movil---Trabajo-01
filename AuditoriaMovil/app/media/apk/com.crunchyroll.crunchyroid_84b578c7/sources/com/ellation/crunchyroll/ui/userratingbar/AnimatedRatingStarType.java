package com.ellation.crunchyroll.ui.userratingbar;

import com.amazon.aps.iva.yb0.e;
import kotlin.Metadata;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum NOT_RATED uses external variables
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
/* compiled from: AnimatedRatingStarType.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/ellation/crunchyroll/ui/userratingbar/AnimatedRatingStarType;", "", "markerStart", "Lcom/ellation/crunchyroll/ui/userratingbar/AnimatedRatingStarMarker;", "markerEnd", "speed", "", "(Ljava/lang/String;ILcom/ellation/crunchyroll/ui/userratingbar/AnimatedRatingStarMarker;Lcom/ellation/crunchyroll/ui/userratingbar/AnimatedRatingStarMarker;F)V", "getMarkerEnd", "()Lcom/ellation/crunchyroll/ui/userratingbar/AnimatedRatingStarMarker;", "getMarkerStart", "getSpeed", "()F", "NOT_RATED", "ANIMATE_FROM_START_TO_SCALE", "ANIMATE_FROM_SCALE_TO_END", "RATED", "SCALED", "ANIMATE_FROM_SCALE_TO_START", "widgets_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AnimatedRatingStarType {
    private static final /* synthetic */ AnimatedRatingStarType[] $VALUES;
    public static final AnimatedRatingStarType ANIMATE_FROM_SCALE_TO_END;
    public static final AnimatedRatingStarType ANIMATE_FROM_SCALE_TO_START;
    public static final AnimatedRatingStarType ANIMATE_FROM_START_TO_SCALE;
    public static final AnimatedRatingStarType NOT_RATED;
    public static final AnimatedRatingStarType RATED;
    public static final AnimatedRatingStarType SCALED;
    private final AnimatedRatingStarMarker markerEnd;
    private final AnimatedRatingStarMarker markerStart;
    private final float speed;

    private static final /* synthetic */ AnimatedRatingStarType[] $values() {
        return new AnimatedRatingStarType[]{NOT_RATED, ANIMATE_FROM_START_TO_SCALE, ANIMATE_FROM_SCALE_TO_END, RATED, SCALED, ANIMATE_FROM_SCALE_TO_START};
    }

    static {
        AnimatedRatingStarMarker animatedRatingStarMarker = AnimatedRatingStarMarker.START;
        NOT_RATED = new AnimatedRatingStarType("NOT_RATED", 0, animatedRatingStarMarker, animatedRatingStarMarker, 0.0f, 4, null);
        AnimatedRatingStarMarker animatedRatingStarMarker2 = AnimatedRatingStarMarker.SCALE;
        ANIMATE_FROM_START_TO_SCALE = new AnimatedRatingStarType("ANIMATE_FROM_START_TO_SCALE", 1, animatedRatingStarMarker, animatedRatingStarMarker2, 0.0f, 4, null);
        AnimatedRatingStarMarker animatedRatingStarMarker3 = AnimatedRatingStarMarker.END;
        ANIMATE_FROM_SCALE_TO_END = new AnimatedRatingStarType("ANIMATE_FROM_SCALE_TO_END", 2, animatedRatingStarMarker2, animatedRatingStarMarker3, 0.0f, 4, null);
        RATED = new AnimatedRatingStarType("RATED", 3, animatedRatingStarMarker3, animatedRatingStarMarker3, 0.0f, 4, null);
        SCALED = new AnimatedRatingStarType("SCALED", 4, animatedRatingStarMarker2, animatedRatingStarMarker2, 0.0f, 4, null);
        ANIMATE_FROM_SCALE_TO_START = new AnimatedRatingStarType("ANIMATE_FROM_SCALE_TO_START", 5, animatedRatingStarMarker, animatedRatingStarMarker2, -1.0f);
        $VALUES = $values();
    }

    private AnimatedRatingStarType(String str, int i, AnimatedRatingStarMarker animatedRatingStarMarker, AnimatedRatingStarMarker animatedRatingStarMarker2, float f) {
        this.markerStart = animatedRatingStarMarker;
        this.markerEnd = animatedRatingStarMarker2;
        this.speed = f;
    }

    public static AnimatedRatingStarType valueOf(String str) {
        return (AnimatedRatingStarType) Enum.valueOf(AnimatedRatingStarType.class, str);
    }

    public static AnimatedRatingStarType[] values() {
        return (AnimatedRatingStarType[]) $VALUES.clone();
    }

    public final AnimatedRatingStarMarker getMarkerEnd() {
        return this.markerEnd;
    }

    public final AnimatedRatingStarMarker getMarkerStart() {
        return this.markerStart;
    }

    public final float getSpeed() {
        return this.speed;
    }

    public /* synthetic */ AnimatedRatingStarType(String str, int i, AnimatedRatingStarMarker animatedRatingStarMarker, AnimatedRatingStarMarker animatedRatingStarMarker2, float f, int i2, e eVar) {
        this(str, i, animatedRatingStarMarker, animatedRatingStarMarker2, (i2 & 4) != 0 ? 1.0f : f);
    }
}

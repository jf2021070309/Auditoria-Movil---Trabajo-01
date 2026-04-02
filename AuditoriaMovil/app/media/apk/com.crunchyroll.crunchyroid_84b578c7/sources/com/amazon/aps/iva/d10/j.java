package com.amazon.aps.iva.d10;

import com.crunchyroll.crunchyroid.R;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum IN_PROGRESS uses external variables
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
/* compiled from: DownloadsPanel.kt */
/* loaded from: classes2.dex */
public final class j {
    private static final /* synthetic */ j[] $VALUES;
    public static final j COMPLETED_EPISODES;
    public static final j COMPLETED_MOVIES;
    public static final j EXPIRED;
    public static final j FAILED;
    public static final j IN_PROGRESS;
    public static final j PAUSED;
    public static final j WAITING;
    private final int label;
    private final long labelColor;

    private static final /* synthetic */ j[] $values() {
        return new j[]{IN_PROGRESS, WAITING, PAUSED, EXPIRED, FAILED, COMPLETED_EPISODES, COMPLETED_MOVIES};
    }

    static {
        int i = com.amazon.aps.iva.ao.a.C;
        long j = com.amazon.aps.iva.ao.a.m;
        IN_PROGRESS = new j("IN_PROGRESS", 0, R.string.syncing, j);
        WAITING = new j("WAITING", 1, R.string.waiting, j);
        PAUSED = new j("PAUSED", 2, R.string.paused, j);
        long j2 = com.amazon.aps.iva.ao.a.e;
        EXPIRED = new j("EXPIRED", 3, R.string.expired, j2);
        FAILED = new j("FAILED", 4, R.string.failed, j2);
        long j3 = com.amazon.aps.iva.ao.a.j;
        COMPLETED_EPISODES = new j("COMPLETED_EPISODES", 5, R.plurals.completed_episodes, j3);
        COMPLETED_MOVIES = new j("COMPLETED_MOVIES", 6, R.plurals.completed_videos, j3);
        $VALUES = $values();
    }

    private j(String str, int i, int i2, long j) {
        this.label = i2;
        this.labelColor = j;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }

    public final int getLabel() {
        return this.label;
    }

    /* renamed from: getLabelColor-0d7_KjU  reason: not valid java name */
    public final long m9getLabelColor0d7_KjU() {
        return this.labelColor;
    }
}

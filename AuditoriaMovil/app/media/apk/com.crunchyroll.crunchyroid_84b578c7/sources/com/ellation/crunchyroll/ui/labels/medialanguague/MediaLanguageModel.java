package com.ellation.crunchyroll.ui.labels.medialanguague;

import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: MediaLanguageModel.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0007\b\t\n\u000b\f\r\u000e\u000fB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\t\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/ellation/crunchyroll/ui/labels/medialanguague/MediaLanguageModel;", "", "displayText", "", "(Ljava/lang/String;)V", "getDisplayText", "()Ljava/lang/String;", "Default", "FallbackDub", "FallbackDubAndSub", "FallbackDubPreferredSub", "FallbackSub", "PreferredDub", "PreferredDubAndSub", "PreferredDubFallbackSub", "PreferredSub", "Lcom/ellation/crunchyroll/ui/labels/medialanguague/MediaLanguageModel$Default;", "Lcom/ellation/crunchyroll/ui/labels/medialanguague/MediaLanguageModel$FallbackDub;", "Lcom/ellation/crunchyroll/ui/labels/medialanguague/MediaLanguageModel$FallbackDubAndSub;", "Lcom/ellation/crunchyroll/ui/labels/medialanguague/MediaLanguageModel$FallbackDubPreferredSub;", "Lcom/ellation/crunchyroll/ui/labels/medialanguague/MediaLanguageModel$FallbackSub;", "Lcom/ellation/crunchyroll/ui/labels/medialanguague/MediaLanguageModel$PreferredDub;", "Lcom/ellation/crunchyroll/ui/labels/medialanguague/MediaLanguageModel$PreferredDubAndSub;", "Lcom/ellation/crunchyroll/ui/labels/medialanguague/MediaLanguageModel$PreferredDubFallbackSub;", "Lcom/ellation/crunchyroll/ui/labels/medialanguague/MediaLanguageModel$PreferredSub;", "widgets_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class MediaLanguageModel {
    public static final int $stable = 0;
    private final String displayText;

    /* compiled from: MediaLanguageModel.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ellation/crunchyroll/ui/labels/medialanguague/MediaLanguageModel$Default;", "Lcom/ellation/crunchyroll/ui/labels/medialanguague/MediaLanguageModel;", "label", "", "(Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "widgets_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Default extends MediaLanguageModel {
        public static final int $stable = 0;
        private final String label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Default(String str) {
            super(str, null);
            j.f(str, "label");
            this.label = str;
        }

        public static /* synthetic */ Default copy$default(Default r0, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = r0.label;
            }
            return r0.copy(str);
        }

        public final String component1() {
            return this.label;
        }

        public final Default copy(String str) {
            j.f(str, "label");
            return new Default(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Default) && j.a(this.label, ((Default) obj).label)) {
                return true;
            }
            return false;
        }

        public final String getLabel() {
            return this.label;
        }

        public int hashCode() {
            return this.label.hashCode();
        }

        public String toString() {
            return e.e("Default(label=", this.label, ")");
        }
    }

    /* compiled from: MediaLanguageModel.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ellation/crunchyroll/ui/labels/medialanguague/MediaLanguageModel$FallbackDub;", "Lcom/ellation/crunchyroll/ui/labels/medialanguague/MediaLanguageModel;", "label", "", "(Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "widgets_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class FallbackDub extends MediaLanguageModel {
        public static final int $stable = 0;
        private final String label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FallbackDub(String str) {
            super(str, null);
            j.f(str, "label");
            this.label = str;
        }

        public static /* synthetic */ FallbackDub copy$default(FallbackDub fallbackDub, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fallbackDub.label;
            }
            return fallbackDub.copy(str);
        }

        public final String component1() {
            return this.label;
        }

        public final FallbackDub copy(String str) {
            j.f(str, "label");
            return new FallbackDub(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof FallbackDub) && j.a(this.label, ((FallbackDub) obj).label)) {
                return true;
            }
            return false;
        }

        public final String getLabel() {
            return this.label;
        }

        public int hashCode() {
            return this.label.hashCode();
        }

        public String toString() {
            return e.e("FallbackDub(label=", this.label, ")");
        }
    }

    /* compiled from: MediaLanguageModel.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ellation/crunchyroll/ui/labels/medialanguague/MediaLanguageModel$FallbackDubAndSub;", "Lcom/ellation/crunchyroll/ui/labels/medialanguague/MediaLanguageModel;", "label", "", "(Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "widgets_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class FallbackDubAndSub extends MediaLanguageModel {
        public static final int $stable = 0;
        private final String label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FallbackDubAndSub(String str) {
            super(str, null);
            j.f(str, "label");
            this.label = str;
        }

        public static /* synthetic */ FallbackDubAndSub copy$default(FallbackDubAndSub fallbackDubAndSub, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fallbackDubAndSub.label;
            }
            return fallbackDubAndSub.copy(str);
        }

        public final String component1() {
            return this.label;
        }

        public final FallbackDubAndSub copy(String str) {
            j.f(str, "label");
            return new FallbackDubAndSub(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof FallbackDubAndSub) && j.a(this.label, ((FallbackDubAndSub) obj).label)) {
                return true;
            }
            return false;
        }

        public final String getLabel() {
            return this.label;
        }

        public int hashCode() {
            return this.label.hashCode();
        }

        public String toString() {
            return e.e("FallbackDubAndSub(label=", this.label, ")");
        }
    }

    /* compiled from: MediaLanguageModel.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ellation/crunchyroll/ui/labels/medialanguague/MediaLanguageModel$FallbackDubPreferredSub;", "Lcom/ellation/crunchyroll/ui/labels/medialanguague/MediaLanguageModel;", "label", "", "(Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "widgets_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class FallbackDubPreferredSub extends MediaLanguageModel {
        public static final int $stable = 0;
        private final String label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FallbackDubPreferredSub(String str) {
            super(str, null);
            j.f(str, "label");
            this.label = str;
        }

        public static /* synthetic */ FallbackDubPreferredSub copy$default(FallbackDubPreferredSub fallbackDubPreferredSub, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fallbackDubPreferredSub.label;
            }
            return fallbackDubPreferredSub.copy(str);
        }

        public final String component1() {
            return this.label;
        }

        public final FallbackDubPreferredSub copy(String str) {
            j.f(str, "label");
            return new FallbackDubPreferredSub(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof FallbackDubPreferredSub) && j.a(this.label, ((FallbackDubPreferredSub) obj).label)) {
                return true;
            }
            return false;
        }

        public final String getLabel() {
            return this.label;
        }

        public int hashCode() {
            return this.label.hashCode();
        }

        public String toString() {
            return e.e("FallbackDubPreferredSub(label=", this.label, ")");
        }
    }

    /* compiled from: MediaLanguageModel.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ellation/crunchyroll/ui/labels/medialanguague/MediaLanguageModel$FallbackSub;", "Lcom/ellation/crunchyroll/ui/labels/medialanguague/MediaLanguageModel;", "label", "", "(Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "widgets_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class FallbackSub extends MediaLanguageModel {
        public static final int $stable = 0;
        private final String label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FallbackSub(String str) {
            super(str, null);
            j.f(str, "label");
            this.label = str;
        }

        public static /* synthetic */ FallbackSub copy$default(FallbackSub fallbackSub, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fallbackSub.label;
            }
            return fallbackSub.copy(str);
        }

        public final String component1() {
            return this.label;
        }

        public final FallbackSub copy(String str) {
            j.f(str, "label");
            return new FallbackSub(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof FallbackSub) && j.a(this.label, ((FallbackSub) obj).label)) {
                return true;
            }
            return false;
        }

        public final String getLabel() {
            return this.label;
        }

        public int hashCode() {
            return this.label.hashCode();
        }

        public String toString() {
            return e.e("FallbackSub(label=", this.label, ")");
        }
    }

    /* compiled from: MediaLanguageModel.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ellation/crunchyroll/ui/labels/medialanguague/MediaLanguageModel$PreferredDub;", "Lcom/ellation/crunchyroll/ui/labels/medialanguague/MediaLanguageModel;", "label", "", "(Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "widgets_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class PreferredDub extends MediaLanguageModel {
        public static final int $stable = 0;
        private final String label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PreferredDub(String str) {
            super(str, null);
            j.f(str, "label");
            this.label = str;
        }

        public static /* synthetic */ PreferredDub copy$default(PreferredDub preferredDub, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = preferredDub.label;
            }
            return preferredDub.copy(str);
        }

        public final String component1() {
            return this.label;
        }

        public final PreferredDub copy(String str) {
            j.f(str, "label");
            return new PreferredDub(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof PreferredDub) && j.a(this.label, ((PreferredDub) obj).label)) {
                return true;
            }
            return false;
        }

        public final String getLabel() {
            return this.label;
        }

        public int hashCode() {
            return this.label.hashCode();
        }

        public String toString() {
            return e.e("PreferredDub(label=", this.label, ")");
        }
    }

    /* compiled from: MediaLanguageModel.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ellation/crunchyroll/ui/labels/medialanguague/MediaLanguageModel$PreferredDubAndSub;", "Lcom/ellation/crunchyroll/ui/labels/medialanguague/MediaLanguageModel;", "label", "", "(Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "widgets_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class PreferredDubAndSub extends MediaLanguageModel {
        public static final int $stable = 0;
        private final String label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PreferredDubAndSub(String str) {
            super(str, null);
            j.f(str, "label");
            this.label = str;
        }

        public static /* synthetic */ PreferredDubAndSub copy$default(PreferredDubAndSub preferredDubAndSub, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = preferredDubAndSub.label;
            }
            return preferredDubAndSub.copy(str);
        }

        public final String component1() {
            return this.label;
        }

        public final PreferredDubAndSub copy(String str) {
            j.f(str, "label");
            return new PreferredDubAndSub(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof PreferredDubAndSub) && j.a(this.label, ((PreferredDubAndSub) obj).label)) {
                return true;
            }
            return false;
        }

        public final String getLabel() {
            return this.label;
        }

        public int hashCode() {
            return this.label.hashCode();
        }

        public String toString() {
            return e.e("PreferredDubAndSub(label=", this.label, ")");
        }
    }

    /* compiled from: MediaLanguageModel.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ellation/crunchyroll/ui/labels/medialanguague/MediaLanguageModel$PreferredDubFallbackSub;", "Lcom/ellation/crunchyroll/ui/labels/medialanguague/MediaLanguageModel;", "label", "", "(Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "widgets_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class PreferredDubFallbackSub extends MediaLanguageModel {
        public static final int $stable = 0;
        private final String label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PreferredDubFallbackSub(String str) {
            super(str, null);
            j.f(str, "label");
            this.label = str;
        }

        public static /* synthetic */ PreferredDubFallbackSub copy$default(PreferredDubFallbackSub preferredDubFallbackSub, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = preferredDubFallbackSub.label;
            }
            return preferredDubFallbackSub.copy(str);
        }

        public final String component1() {
            return this.label;
        }

        public final PreferredDubFallbackSub copy(String str) {
            j.f(str, "label");
            return new PreferredDubFallbackSub(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof PreferredDubFallbackSub) && j.a(this.label, ((PreferredDubFallbackSub) obj).label)) {
                return true;
            }
            return false;
        }

        public final String getLabel() {
            return this.label;
        }

        public int hashCode() {
            return this.label.hashCode();
        }

        public String toString() {
            return e.e("PreferredDubFallbackSub(label=", this.label, ")");
        }
    }

    /* compiled from: MediaLanguageModel.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ellation/crunchyroll/ui/labels/medialanguague/MediaLanguageModel$PreferredSub;", "Lcom/ellation/crunchyroll/ui/labels/medialanguague/MediaLanguageModel;", "label", "", "(Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "widgets_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class PreferredSub extends MediaLanguageModel {
        public static final int $stable = 0;
        private final String label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PreferredSub(String str) {
            super(str, null);
            j.f(str, "label");
            this.label = str;
        }

        public static /* synthetic */ PreferredSub copy$default(PreferredSub preferredSub, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = preferredSub.label;
            }
            return preferredSub.copy(str);
        }

        public final String component1() {
            return this.label;
        }

        public final PreferredSub copy(String str) {
            j.f(str, "label");
            return new PreferredSub(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof PreferredSub) && j.a(this.label, ((PreferredSub) obj).label)) {
                return true;
            }
            return false;
        }

        public final String getLabel() {
            return this.label;
        }

        public int hashCode() {
            return this.label.hashCode();
        }

        public String toString() {
            return e.e("PreferredSub(label=", this.label, ")");
        }
    }

    public /* synthetic */ MediaLanguageModel(String str, e eVar) {
        this(str);
    }

    public final String getDisplayText() {
        return this.displayText;
    }

    private MediaLanguageModel(String str) {
        this.displayText = str;
    }
}

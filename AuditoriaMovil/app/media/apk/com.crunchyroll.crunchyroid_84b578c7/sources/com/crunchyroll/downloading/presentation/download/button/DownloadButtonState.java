package com.crunchyroll.downloading.presentation.download.button;

import com.amazon.aps.iva.rg.b;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import kotlin.Metadata;
/* compiled from: DownloadButtonState.kt */
/* loaded from: classes.dex */
public abstract class DownloadButtonState {
    public final String a;
    public final int b;

    /* compiled from: DownloadButtonState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/crunchyroll/downloading/presentation/download/button/DownloadButtonState$Expired;", "Lcom/crunchyroll/downloading/presentation/download/button/DownloadButtonState;", "downloading-api_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Expired extends DownloadButtonState {
        public final String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Expired(String str) {
            super(str, R.drawable.ic_download_expired);
            j.f(str, "id");
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Expired) && j.a(this.c, ((Expired) obj).c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return b.c(new StringBuilder("Expired(id="), this.c, ")");
        }
    }

    /* compiled from: DownloadButtonState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/crunchyroll/downloading/presentation/download/button/DownloadButtonState$Failed;", "Lcom/crunchyroll/downloading/presentation/download/button/DownloadButtonState;", "downloading-api_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Failed extends DownloadButtonState {
        public final String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(String str) {
            super(str, R.drawable.ic_download_failed);
            j.f(str, "id");
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Failed) && j.a(this.c, ((Failed) obj).c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return b.c(new StringBuilder("Failed(id="), this.c, ")");
        }
    }

    /* compiled from: DownloadButtonState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/crunchyroll/downloading/presentation/download/button/DownloadButtonState$Finished;", "Lcom/crunchyroll/downloading/presentation/download/button/DownloadButtonState;", "downloading-api_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Finished extends DownloadButtonState {
        public final String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Finished(String str) {
            super(str, R.drawable.ic_download_synced);
            j.f(str, "id");
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Finished) && j.a(this.c, ((Finished) obj).c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return b.c(new StringBuilder("Finished(id="), this.c, ")");
        }
    }

    /* compiled from: DownloadButtonState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/crunchyroll/downloading/presentation/download/button/DownloadButtonState$InProgress;", "Lcom/crunchyroll/downloading/presentation/download/button/DownloadButtonState;", "Lcom/amazon/aps/iva/rg/b;", "downloading-api_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class InProgress extends DownloadButtonState implements b {
        public final String c;
        public final Integer d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InProgress(String str, Integer num) {
            super(str, R.drawable.ic_download_syncing);
            j.f(str, "id");
            this.c = str;
            this.d = num;
        }

        @Override // com.amazon.aps.iva.rg.b
        public final Integer a() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InProgress)) {
                return false;
            }
            InProgress inProgress = (InProgress) obj;
            if (j.a(this.c, inProgress.c) && j.a(this.d, inProgress.d)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2 = this.c.hashCode() * 31;
            Integer num = this.d;
            if (num == null) {
                hashCode = 0;
            } else {
                hashCode = num.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public final String toString() {
            return "InProgress(id=" + this.c + ", progress=" + this.d + ")";
        }
    }

    /* compiled from: DownloadButtonState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/crunchyroll/downloading/presentation/download/button/DownloadButtonState$Inactive;", "Lcom/crunchyroll/downloading/presentation/download/button/DownloadButtonState;", "downloading-api_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Inactive extends DownloadButtonState {
        public final String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Inactive(String str) {
            super(str, R.drawable.ic_download_arrow_inactive);
            j.f(str, "id");
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Inactive) && j.a(this.c, ((Inactive) obj).c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return b.c(new StringBuilder("Inactive(id="), this.c, ")");
        }
    }

    /* compiled from: DownloadButtonState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/crunchyroll/downloading/presentation/download/button/DownloadButtonState$Manage;", "Lcom/crunchyroll/downloading/presentation/download/button/DownloadButtonState;", "downloading-api_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Manage extends DownloadButtonState {
        public final String c;

        public Manage() {
            super("", R.drawable.ic_download_manage);
            this.c = "";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Manage) && j.a(this.c, ((Manage) obj).c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return b.c(new StringBuilder("Manage(id="), this.c, ")");
        }
    }

    /* compiled from: DownloadButtonState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/crunchyroll/downloading/presentation/download/button/DownloadButtonState$NotStarted;", "Lcom/crunchyroll/downloading/presentation/download/button/DownloadButtonState;", "()V", "downloading-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class NotStarted extends DownloadButtonState {
        public static final NotStarted c = new NotStarted();

        private NotStarted() {
            super("", R.drawable.ic_download_active);
        }
    }

    /* compiled from: DownloadButtonState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/crunchyroll/downloading/presentation/download/button/DownloadButtonState$Paused;", "Lcom/crunchyroll/downloading/presentation/download/button/DownloadButtonState;", "Lcom/amazon/aps/iva/rg/b;", "downloading-api_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Paused extends DownloadButtonState implements b {
        public final String c;
        public final Integer d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Paused(String str, Integer num) {
            super(str, R.drawable.ic_download_paused);
            j.f(str, "id");
            this.c = str;
            this.d = num;
        }

        @Override // com.amazon.aps.iva.rg.b
        public final Integer a() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Paused)) {
                return false;
            }
            Paused paused = (Paused) obj;
            if (j.a(this.c, paused.c) && j.a(this.d, paused.d)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2 = this.c.hashCode() * 31;
            Integer num = this.d;
            if (num == null) {
                hashCode = 0;
            } else {
                hashCode = num.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public final String toString() {
            return "Paused(id=" + this.c + ", progress=" + this.d + ")";
        }
    }

    /* compiled from: DownloadButtonState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/crunchyroll/downloading/presentation/download/button/DownloadButtonState$Waiting;", "Lcom/crunchyroll/downloading/presentation/download/button/DownloadButtonState;", "Lcom/amazon/aps/iva/rg/b;", "downloading-api_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Waiting extends DownloadButtonState implements b {
        public final String c;
        public final Integer d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Waiting(String str, Integer num) {
            super(str, R.drawable.ic_download_waiting);
            j.f(str, "id");
            this.c = str;
            this.d = num;
        }

        @Override // com.amazon.aps.iva.rg.b
        public final Integer a() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Waiting)) {
                return false;
            }
            Waiting waiting = (Waiting) obj;
            if (j.a(this.c, waiting.c) && j.a(this.d, waiting.d)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2 = this.c.hashCode() * 31;
            Integer num = this.d;
            if (num == null) {
                hashCode = 0;
            } else {
                hashCode = num.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public final String toString() {
            return "Waiting(id=" + this.c + ", progress=" + this.d + ")";
        }
    }

    public DownloadButtonState(String str, int i) {
        this.a = str;
        this.b = i;
    }
}

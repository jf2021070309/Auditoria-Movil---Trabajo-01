package com.amazon.aps.iva.x00;

import com.amazon.aps.iva.kb0.h;
import com.crunchyroll.downloading.presentation.download.button.DownloadButtonState;
import com.ellation.crunchyroll.downloading.e0;
/* compiled from: DownloadButtonStateProvider.kt */
/* loaded from: classes2.dex */
public final class f {

    /* compiled from: DownloadButtonStateProvider.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[e0.b.values().length];
            try {
                iArr[e0.b.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e0.b.INFO_LOADED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e0.b.STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e0.b.PAUSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[e0.b.IN_PROGRESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[e0.b.COMPLETED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[e0.b.FAILED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[e0.b.EXPIRED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            a = iArr;
        }
    }

    public static DownloadButtonState a(e0 e0Var) {
        switch (a.a[e0Var.g().ordinal()]) {
            case 1:
            case 2:
            case 3:
                return new DownloadButtonState.Waiting(e0Var.e(), null);
            case 4:
                return new DownloadButtonState.Paused(e0Var.e(), Integer.valueOf((int) e0Var.f()));
            case 5:
                if (e0Var.f() <= 0.0d) {
                    return new DownloadButtonState.Waiting(e0Var.e(), null);
                }
                return new DownloadButtonState.InProgress(e0Var.e(), Integer.valueOf((int) e0Var.f()));
            case 6:
                return new DownloadButtonState.Finished(e0Var.e());
            case 7:
                return new DownloadButtonState.Failed(e0Var.e());
            case 8:
                return new DownloadButtonState.Expired(e0Var.e());
            default:
                throw new h();
        }
    }
}

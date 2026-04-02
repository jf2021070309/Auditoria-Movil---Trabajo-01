package com.amazon.aps.iva.ll;

import androidx.fragment.app.Fragment;
import com.crunchyroll.crunchyroid.R;
/* compiled from: PlayerSettingsScreen.kt */
/* loaded from: classes2.dex */
public enum l {
    AUTO_PLAY(R.string.key_auto_play, R.string.autoplay),
    AUDIO(R.string.key_audio, R.string.audio),
    SUBTITLES(R.string.key_subtitles, R.string.subtitles),
    QUALITY(R.string.key_quality, R.string.quality),
    REPORT_A_PROBLEM(R.string.key_report_a_problem, R.string.report_a_problem);
    
    private final int keyId;
    private final int nameResId;

    /* compiled from: PlayerSettingsScreen.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.AUDIO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.SUBTITLES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.QUALITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[l.REPORT_A_PROBLEM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    l(int i, int i2) {
        this.keyId = i;
        this.nameResId = i2;
    }

    public final Fragment getFragment() {
        int i = a.a[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        com.amazon.aps.iva.tl.k.k.getClass();
                        return new com.amazon.aps.iva.tl.k();
                    }
                    throw new IllegalArgumentException("There wasn't defined a fragment for " + this);
                }
                com.amazon.aps.iva.sl.h.h.getClass();
                return new com.amazon.aps.iva.sl.h();
            }
            com.amazon.aps.iva.wl.j.h.getClass();
            return new com.amazon.aps.iva.wl.j();
        }
        return new com.amazon.aps.iva.nl.e();
    }

    public final int getKeyId() {
        return this.keyId;
    }

    public final int getNameResId() {
        return this.nameResId;
    }

    /* synthetic */ l(int i, int i2, int i3, com.amazon.aps.iva.yb0.e eVar) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}

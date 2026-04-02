package com.amazon.aps.iva.y30;

import com.ellation.crunchyroll.presentation.main.settings.SettingsBottomBarActivity;
/* compiled from: SettingsFragmentFactory.kt */
/* loaded from: classes2.dex */
public final class j {
    public final com.amazon.aps.iva.xb0.a<Boolean> a;
    public final com.amazon.aps.iva.xb0.a<Boolean> b;
    public final com.amazon.aps.iva.me.j c;

    /* compiled from: SettingsFragmentFactory.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.CHANGE_EMAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.CHANGE_PASSWORD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.MEMBERSHIP_PLAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.NOTIFICATIONS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c.CONNECTED_APPS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[c.PREFERRED_SUBTITLE_CC_LANGUAGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[c.PREFERRED_AUDIO_LANGUAGE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[c.DO_NOT_SELL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[c.ACCOUNT_DELETE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[c.SYNC_QUALITY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[c.PERSISTENT_MESSAGE_CENTER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[c.MATURITY_RESTRICTIONS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            a = iArr;
        }
    }

    public j(SettingsBottomBarActivity.b bVar, SettingsBottomBarActivity.c cVar, com.amazon.aps.iva.cx.d dVar) {
        this.a = bVar;
        this.b = cVar;
        this.c = dVar;
    }
}

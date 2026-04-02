package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.util.aj;
import com.vungle.warren.ui.JavascriptBridge;
import java.util.Map;
/* loaded from: classes.dex */
public final class f {
    protected static f a = new f();

    /* loaded from: classes.dex */
    public enum a {
        CLOSE(JavascriptBridge.MraidHandler.CLOSE_ACTION),
        EXPAND("expand"),
        USECUSTOMCLOSE("usecustomclose"),
        OPEN("open"),
        RESIZE("resize"),
        GET_RESIZE_PROPERTIES("getResizeProperties"),
        SET_RESIZE_PROPERTIES("setResizeProperties"),
        SET_ORIENTATION_PROPERTIES("setOrientationProperties"),
        PLAY_VIDEO("playVideo"),
        STORE_PICTURE("storePicture"),
        GET_CURRENT_POSITION("getCurrentPosition"),
        GET_DEFAULT_POSITION("getDefaultPosition"),
        GET_MAX_SIZE("getMaxSize"),
        GET_SCREEN_SIZE("getScreenSize"),
        CREATE_CALENDAR_EVENT("createCalendarEvent"),
        UNSPECIFIED("");
        
        public String q;

        a(String str) {
            this.q = str;
        }

        static /* synthetic */ a a(String str) {
            a[] values;
            for (a aVar : values()) {
                if (aVar.q.equals(str)) {
                    return aVar;
                }
            }
            return UNSPECIFIED;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.mraid.f$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a.values().length];
            a = iArr;
            try {
                iArr[a.CLOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[a.EXPAND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[a.USECUSTOMCLOSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[a.OPEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[a.RESIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[a.GET_RESIZE_PROPERTIES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[a.SET_RESIZE_PROPERTIES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[a.SET_ORIENTATION_PROPERTIES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[a.PLAY_VIDEO.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[a.STORE_PICTURE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[a.GET_CURRENT_POSITION.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[a.GET_DEFAULT_POSITION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[a.GET_MAX_SIZE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[a.GET_SCREEN_SIZE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[a.CREATE_CALENDAR_EVENT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[a.UNSPECIFIED.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public static b a(String str, Map<String, String> map, com.fyber.inneractive.sdk.m.d dVar, aj ajVar) {
        switch (AnonymousClass1.a[a.a(str).ordinal()]) {
            case 1:
                return new c(map, dVar, ajVar);
            case 2:
                return new e(map, dVar, ajVar);
            case 3:
                return new r(map, dVar, ajVar);
            case 4:
                return new l(map, dVar, ajVar);
            case 5:
                return new n(map, dVar, ajVar);
            case 6:
                return new j(map, dVar, ajVar);
            case 7:
                return new p(map, dVar, ajVar);
            case 8:
                return new o(map, dVar, ajVar);
            case 9:
                return new m(map, dVar, ajVar);
            case 10:
                return new q(map, dVar, ajVar);
            case 11:
                return new g(map, dVar, ajVar);
            case 12:
                return new h(map, dVar, ajVar);
            case 13:
                return new i(map, dVar, ajVar);
            case 14:
                return new k(map, dVar, ajVar);
            case 15:
                return new d(map, dVar, ajVar);
            default:
                return null;
        }
    }
}

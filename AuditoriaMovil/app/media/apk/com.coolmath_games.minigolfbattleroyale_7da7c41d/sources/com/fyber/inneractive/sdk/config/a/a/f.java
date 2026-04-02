package com.fyber.inneractive.sdk.config.a.a;

import com.facebook.appevents.integrity.IntegrityManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
/* loaded from: classes.dex */
public class f extends d {
    public static final a e = a.NONE;

    public f() {
        super("video_player");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.fyber.inneractive.sdk.config.a.a.f$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[UnitDisplayType.values().length];
            a = iArr;
            try {
                iArr[UnitDisplayType.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[UnitDisplayType.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum a {
        NONE(IntegrityManager.INTEGRITY_TYPE_NONE),
        OPEN("open");
        
        public String c;

        a(String str) {
            this.c = str;
        }

        public static a a(String str) {
            a[] values;
            for (a aVar : values()) {
                if (str.equalsIgnoreCase(aVar.c)) {
                    return aVar;
                }
            }
            return NONE;
        }
    }

    @Override // com.fyber.inneractive.sdk.config.a.a.d
    public final d c() {
        f fVar = new f();
        a((d) fVar);
        return fVar;
    }

    /* loaded from: classes.dex */
    public enum b {
        LEGACY("legacy"),
        EXTRACTOR("extractor"),
        NONE(IntegrityManager.INTEGRITY_TYPE_NONE);
        
        public String d;

        b(String str) {
            this.d = str;
        }
    }
}

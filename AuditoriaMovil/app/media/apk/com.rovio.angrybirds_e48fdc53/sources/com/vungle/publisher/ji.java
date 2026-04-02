package com.vungle.publisher;

import android.database.Cursor;
import com.vungle.publisher.eh;
import com.vungle.publisher.log.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes4.dex */
public abstract class ji extends eh {

    /* loaded from: classes4.dex */
    public enum a implements jf {
        error,
        mute,
        moat,
        play_percentage_0(0.0f),
        play_percentage_25(0.25f),
        play_percentage_50(0.5f),
        play_percentage_75(0.75f),
        play_percentage_80(0.8f),
        play_percentage_100(0.99f),
        postroll_click(true),
        postroll_view,
        unmute,
        video_click(true),
        video_close,
        video_pause,
        video_resume;
        
        private final float q;
        private final boolean r;

        a() {
            this(-1.0f, false);
        }

        a(float f) {
            this(f, false);
        }

        a(boolean z) {
            this(-1.0f, z);
        }

        a(float f, boolean z) {
            this.q = f;
            this.r = z;
        }

        @Override // com.vungle.publisher.jf
        public boolean a() {
            return this.r;
        }

        public float b() {
            return this.q;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static abstract class b<R extends wp> extends eh.a<ji, wv, R> {
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.vungle.publisher.eh.a
        public Map<jf, List<ji>> a(String str, wv wvVar) {
            HashMap hashMap = null;
            if (wvVar != null) {
                hashMap = new HashMap();
                a(str, hashMap, a.error, wvVar.g());
                a(str, hashMap, a.mute, wvVar.h());
                wa[] j = wvVar.j();
                if (j != null && j.length > 0) {
                    for (wa waVar : j) {
                        Float c = waVar.c();
                        if (c == null) {
                            Logger.w(Logger.DATABASE_TAG, "Invalid/null play percentage checkpoint received");
                        } else {
                            switch ((int) (c.floatValue() * 100.0d)) {
                                case 0:
                                    a(str, hashMap, a.play_percentage_0, waVar.d());
                                    continue;
                                case 25:
                                    a(str, hashMap, a.play_percentage_25, waVar.d());
                                    continue;
                                case 50:
                                    a(str, hashMap, a.play_percentage_50, waVar.d());
                                    continue;
                                case 75:
                                    a(str, hashMap, a.play_percentage_75, waVar.d());
                                    continue;
                                case 100:
                                    a(str, hashMap, a.play_percentage_100, waVar.d());
                                    continue;
                                default:
                                    Logger.w(Logger.DATABASE_TAG, "Invalid/unsupported play percentage checkpoint: " + c);
                                    continue;
                            }
                        }
                    }
                }
                a(str, hashMap, a.postroll_click, wvVar.c());
                a(str, hashMap, a.postroll_view, wvVar.k());
                a(str, hashMap, a.video_click, wvVar.d());
                a(str, hashMap, a.video_close, wvVar.f());
                a(str, hashMap, a.video_pause, wvVar.i());
                a(str, hashMap, a.video_resume, wvVar.l());
                a(str, hashMap, a.unmute, wvVar.m());
                if (wvVar.n().booleanValue()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(wvVar.o());
                    a(str, hashMap, a.moat, arrayList);
                }
            }
            return hashMap;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.eh.a
        public ji a(ji jiVar, Cursor cursor, boolean z) {
            super.a((b<R>) jiVar, cursor, z);
            jiVar.c = (jf) ce.a(cursor, "event", a.class);
            return jiVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: c */
        public ji[] d(int i) {
            return new ji[i];
        }
    }
}

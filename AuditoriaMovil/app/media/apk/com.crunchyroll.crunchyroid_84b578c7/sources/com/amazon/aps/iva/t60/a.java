package com.amazon.aps.iva.t60;

import com.amazon.aps.iva.o60.c;
import com.amazon.aps.iva.v90.e;
import com.amazon.aps.iva.v90.f;
import com.amazon.aps.iva.yb0.j;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* compiled from: AppTranslationsRepositoryFactory.kt */
/* loaded from: classes2.dex */
public final class a implements f {
    public final com.amazon.aps.iva.xb0.a<Map<String, Object>> a;
    public final com.amazon.aps.iva.p60.f b;
    public Locale c;
    public Map<String, ? extends Object> d;

    /* compiled from: AppTranslationsRepositoryFactory.kt */
    /* renamed from: com.amazon.aps.iva.t60.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0734a implements e {
        public C0734a() {
        }

        @Override // com.amazon.aps.iva.v90.e
        public final CharSequence a(String str, String str2) {
            Object obj;
            Map map = (Map) a.b(a.this).get(str);
            if (map != null) {
                obj = map.get(str2);
            } else {
                obj = null;
            }
            if (!(obj instanceof CharSequence)) {
                return null;
            }
            return (CharSequence) obj;
        }

        @Override // com.amazon.aps.iva.v90.e
        public final CharSequence[] b(String str) {
            Object obj = a.b(a.this).get(str);
            if (obj instanceof List) {
                return (CharSequence[]) ((List) obj).toArray(new CharSequence[0]);
            }
            if ((obj instanceof Object[]) && (obj instanceof CharSequence[])) {
                return (CharSequence[]) obj;
            }
            return null;
        }

        @Override // com.amazon.aps.iva.v90.e
        public final CharSequence getText(String str) {
            Object obj = a.b(a.this).get(str);
            if (obj instanceof CharSequence) {
                return (CharSequence) obj;
            }
            return null;
        }
    }

    public a(c cVar, com.amazon.aps.iva.p60.f fVar) {
        this.a = cVar;
        this.b = fVar;
        this.c = fVar.a();
        this.d = cVar.invoke();
    }

    public static final Map b(a aVar) {
        com.amazon.aps.iva.p60.f fVar = aVar.b;
        if (!j.a(fVar.a(), aVar.c)) {
            aVar.d = aVar.a.invoke();
            aVar.c = fVar.a();
        }
        return aVar.d;
    }

    @Override // com.amazon.aps.iva.v90.f
    public final e a(Locale locale) {
        return new C0734a();
    }
}

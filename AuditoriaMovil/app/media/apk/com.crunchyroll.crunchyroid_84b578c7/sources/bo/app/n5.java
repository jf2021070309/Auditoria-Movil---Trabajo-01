package bo.app;

import com.braze.models.IPutIntoJson;
/* loaded from: classes.dex */
public enum n5 implements IPutIntoJson {
    SUBSCRIBED,
    UNSUBSCRIBED;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[n5.values().length];
            try {
                iArr[n5.SUBSCRIBED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n5.UNSUBSCRIBED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: v */
    public String forJsonPut() {
        int i = a.a[ordinal()];
        if (i != 1) {
            if (i == 2) {
                return "unsubscribed";
            }
            throw new com.amazon.aps.iva.kb0.h();
        }
        return "subscribed";
    }
}

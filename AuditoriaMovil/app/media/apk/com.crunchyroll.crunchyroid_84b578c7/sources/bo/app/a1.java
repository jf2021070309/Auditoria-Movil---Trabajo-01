package bo.app;

import com.braze.models.IPutIntoJson;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes.dex */
public enum a1 implements IPutIntoJson {
    LOCATION_RECORDED("lr"),
    CUSTOM_EVENT("ce"),
    PURCHASE("p"),
    PUSH_STORY_PAGE_CLICK("cic"),
    PUSH_CLICKED("pc"),
    PUSH_ACTION_BUTTON_CLICKED("ca"),
    INTERNAL("i"),
    INTERNAL_ERROR("ie"),
    NEWS_FEED_CARD_IMPRESSION("ci"),
    NEWS_FEED_CARD_CLICK("cc"),
    GEOFENCE("g"),
    CONTENT_CARDS_CLICK("ccc"),
    CONTENT_CARDS_IMPRESSION("cci"),
    CONTENT_CARDS_CONTROL_IMPRESSION("ccic"),
    CONTENT_CARDS_DISMISS("ccd"),
    INCREMENT("inc"),
    ADD_TO_CUSTOM_ATTRIBUTE_ARRAY("add"),
    REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY("rem"),
    SET_CUSTOM_ATTRIBUTE_ARRAY("set"),
    INAPP_MESSAGE_IMPRESSION("si"),
    INAPP_MESSAGE_CONTROL_IMPRESSION("iec"),
    INAPP_MESSAGE_CLICK("sc"),
    INAPP_MESSAGE_BUTTON_CLICK("sbc"),
    USER_ALIAS("uae"),
    SESSION_START("ss"),
    SESSION_END("se"),
    TEST_TYPE("tt"),
    LOCATION_CUSTOM_ATTRIBUTE_ADD("lcaa"),
    LOCATION_CUSTOM_ATTRIBUTE_REMOVE("lcar"),
    NESTED_CUSTOM_ATTRIBUTE_MERGE("ncam"),
    SUBSCRIPTION_GROUP_UPDATE("sgu"),
    FEATURE_FLAG_IMPRESSION_EVENT("ffi"),
    PUSH_DELIVERY_EVENT("pde"),
    UNKNOWN("");
    
    public static final a c = new a(null);
    private static final Map d;
    private final String b;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        public final a1 a(String str) {
            com.amazon.aps.iva.yb0.j.f(str, "value");
            Object obj = a1.d.get(str);
            if (obj == null) {
                obj = a1.UNKNOWN;
            }
            return (a1) obj;
        }

        private a() {
        }
    }

    static {
        int i;
        a1[] values = values();
        int w = com.amazon.aps.iva.aq.k.w(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(w >= 16 ? w : 16);
        for (a1 a1Var : values) {
            linkedHashMap.put(a1Var.b, a1Var);
        }
        d = linkedHashMap;
    }

    a1(String str) {
        this.b = str;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: w */
    public String forJsonPut() {
        return this.b;
    }
}

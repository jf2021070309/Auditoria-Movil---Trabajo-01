package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import androidx.core.provider.FontRequest;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes6.dex */
public class FontResourcesParserCompat {
    private static final int DEFAULT_TIMEOUT_MILLIS = 500;
    public static final int FETCH_STRATEGY_ASYNC = 1;
    public static final int FETCH_STRATEGY_BLOCKING = 0;
    public static final int INFINITE_TIMEOUT_VALUE = -1;
    private static final int ITALIC = 1;
    private static final int NORMAL_WEIGHT = 400;

    /* loaded from: classes6.dex */
    public interface FamilyResourceEntry {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface FetchStrategy {
    }

    /* loaded from: classes6.dex */
    public static final class ProviderResourceEntry implements FamilyResourceEntry {
        private final FontRequest mRequest;
        private final int mStrategy;
        private final String mSystemFontFamilyName;
        private final int mTimeoutMs;

        public ProviderResourceEntry(FontRequest request, int strategy, int timeoutMs, String systemFontFamilyName) {
            this.mRequest = request;
            this.mStrategy = strategy;
            this.mTimeoutMs = timeoutMs;
            this.mSystemFontFamilyName = systemFontFamilyName;
        }

        public ProviderResourceEntry(FontRequest request, int strategy, int timeoutMs) {
            this(request, strategy, timeoutMs, null);
        }

        public FontRequest getRequest() {
            return this.mRequest;
        }

        public int getFetchStrategy() {
            return this.mStrategy;
        }

        public int getTimeout() {
            return this.mTimeoutMs;
        }

        public String getSystemFontFamilyName() {
            return this.mSystemFontFamilyName;
        }
    }

    /* loaded from: classes6.dex */
    public static final class FontFileResourceEntry {
        private final String mFileName;
        private boolean mItalic;
        private int mResourceId;
        private int mTtcIndex;
        private String mVariationSettings;
        private int mWeight;

        public FontFileResourceEntry(String fileName, int weight, boolean italic, String variationSettings, int ttcIndex, int resourceId) {
            this.mFileName = fileName;
            this.mWeight = weight;
            this.mItalic = italic;
            this.mVariationSettings = variationSettings;
            this.mTtcIndex = ttcIndex;
            this.mResourceId = resourceId;
        }

        public String getFileName() {
            return this.mFileName;
        }

        public int getWeight() {
            return this.mWeight;
        }

        public boolean isItalic() {
            return this.mItalic;
        }

        public String getVariationSettings() {
            return this.mVariationSettings;
        }

        public int getTtcIndex() {
            return this.mTtcIndex;
        }

        public int getResourceId() {
            return this.mResourceId;
        }
    }

    /* loaded from: classes6.dex */
    public static final class FontFamilyFilesResourceEntry implements FamilyResourceEntry {
        private final FontFileResourceEntry[] mEntries;

        public FontFamilyFilesResourceEntry(FontFileResourceEntry[] entries) {
            this.mEntries = entries;
        }

        public FontFileResourceEntry[] getEntries() {
            return this.mEntries;
        }
    }

    public static FamilyResourceEntry parse(XmlPullParser parser, Resources resources) throws XmlPullParserException, IOException {
        int type;
        do {
            type = parser.next();
            if (type == 2) {
                break;
            }
        } while (type != 1);
        if (type != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        return readFamilies(parser, resources);
    }

    private static FamilyResourceEntry readFamilies(XmlPullParser parser, Resources resources) throws XmlPullParserException, IOException {
        parser.require(2, null, "font-family");
        String tag = parser.getName();
        if (tag.equals("font-family")) {
            return null;
        }
        skip(parser);
        return null;
    }

    private static int getType(TypedArray typedArray, int index) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(index);
        }
        TypedValue tv = new TypedValue();
        typedArray.getValue(index, tv);
        return tv.type;
    }

    public static List<List<byte[]>> readCerts(Resources resources, int certsId) {
        if (certsId == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArray = resources.obtainTypedArray(certsId);
        try {
            if (typedArray.length() == 0) {
                return Collections.emptyList();
            }
            List<List<byte[]>> result = new ArrayList<>();
            if (getType(typedArray, 0) == 1) {
                for (int i = 0; i < typedArray.length(); i++) {
                    int certId = typedArray.getResourceId(i, 0);
                    if (certId != 0) {
                        result.add(toByteArrayList(resources.getStringArray(certId)));
                    }
                }
            } else {
                result.add(toByteArrayList(resources.getStringArray(certsId)));
            }
            return result;
        } finally {
            typedArray.recycle();
        }
    }

    private static List<byte[]> toByteArrayList(String[] stringArray) {
        List<byte[]> result = new ArrayList<>();
        for (String item : stringArray) {
            result.add(Base64.decode(item, 0));
        }
        return result;
    }

    private static void skip(XmlPullParser parser) throws XmlPullParserException, IOException {
        int depth = 1;
        while (depth > 0) {
            int next = parser.next();
            if (next == 2) {
                depth++;
            } else if (next == 3) {
                depth--;
            }
        }
    }

    private FontResourcesParserCompat() {
    }
}

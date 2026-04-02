package com.rovio.rcs.ads;

import android.util.Log;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
/* loaded from: classes4.dex */
public class VASTParser {
    private static boolean m_isWrapper = false;

    private static boolean isVideoTypeSupported(String str) {
        return str.equals("video/mp4") || str.equals("video/3gpp");
    }

    private static String getAttribute(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        if (attributeCount < 1) {
            return "error";
        }
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return "error";
    }

    private static void addToMultiMap(Map<String, ArrayList<String>> map, String str, String str2) {
        ArrayList<String> arrayList = map.get(str);
        if (arrayList != null) {
            arrayList.add(str2);
            return;
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add(str2);
        map.put(str, arrayList2);
    }

    private static String parseTag(XmlPullParser xmlPullParser, String str) {
        int next = xmlPullParser.next();
        if (3 != next && 2 != next) {
            return new String();
        }
        String trim = xmlPullParser.getName().trim();
        if (next == 3) {
            if (trim.equals(str)) {
                return null;
            }
            return new String();
        }
        return trim;
    }

    private static void storeTagValue(XmlPullParser xmlPullParser, String str, Map<String, ArrayList<String>> map) {
        addToMultiMap(map, str, xmlPullParser.nextText().trim());
    }

    private static void parseLinearCreative(XmlPullParser xmlPullParser, Map<String, ArrayList<String>> map) {
        String parseTag = parseTag(xmlPullParser, "Linear");
        while (parseTag != null) {
            if (parseTag.equals("ClickThrough") || parseTag.equals("ClickTracking")) {
                storeTagValue(xmlPullParser, parseTag, map);
            } else if (!m_isWrapper && parseTag.equals("MediaFile")) {
                String attribute = getAttribute(xmlPullParser, "type");
                if (isVideoTypeSupported(attribute)) {
                    addToMultiMap(map, "type", attribute);
                    addToMultiMap(map, "delivery", getAttribute(xmlPullParser, "delivery").trim());
                    storeTagValue(xmlPullParser, parseTag, map);
                }
            } else if (parseTag.equals("Tracking")) {
                storeTagValue(xmlPullParser, getAttribute(xmlPullParser, "event").trim(), map);
            }
            parseTag = parseTag(xmlPullParser, "Linear");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0035 A[Catch: JSONException -> 0x009d, TryCatch #2 {JSONException -> 0x009d, blocks: (B:6:0x0028, B:8:0x0035, B:10:0x003d, B:11:0x0059, B:16:0x0080, B:18:0x0088, B:23:0x00bb, B:25:0x00c3, B:26:0x00d8, B:28:0x00e0, B:30:0x00f2, B:31:0x0101, B:33:0x0109, B:34:0x0118, B:36:0x0120), top: B:44:0x0028 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static org.json.JSONObject parseCompanion(org.xmlpull.v1.XmlPullParser r6) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rovio.rcs.ads.VASTParser.parseCompanion(org.xmlpull.v1.XmlPullParser):org.json.JSONObject");
    }

    private static void parseCreatives(XmlPullParser xmlPullParser, Map<String, ArrayList<String>> map) {
        JSONArray jSONArray = new JSONArray();
        String parseTag = parseTag(xmlPullParser, "Creatives");
        while (parseTag != null) {
            if (parseTag.equals("Linear")) {
                parseLinearCreative(xmlPullParser, map);
            } else if (parseTag.equals("Companion")) {
                JSONObject parseCompanion = parseCompanion(xmlPullParser);
                if (parseCompanion.length() > 0) {
                    jSONArray.put(parseCompanion);
                }
            }
            parseTag = parseTag(xmlPullParser, "Creatives");
        }
        if (jSONArray.length() > 0) {
            addToMultiMap(map, "companions", jSONArray.toString());
        }
    }

    private static void parseContent(XmlPullParser xmlPullParser, String str, Map<String, ArrayList<String>> map) {
        String parseTag = parseTag(xmlPullParser, str);
        while (parseTag != null) {
            if ((m_isWrapper && parseTag.equals("VASTAdTagURI")) || parseTag.equals("Error") || parseTag.equals("Impression")) {
                storeTagValue(xmlPullParser, parseTag, map);
            } else if (parseTag.equals("Creatives")) {
                parseCreatives(xmlPullParser, map);
            }
            parseTag = parseTag(xmlPullParser, str);
        }
    }

    public static String[][] parse(String str) {
        XmlPullParser newPullParser;
        String trim;
        HashMap hashMap = new HashMap();
        try {
            newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(new StringReader(str));
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            newPullParser.nextTag();
            newPullParser.require(2, null, "VAST");
            newPullParser.nextTag();
            newPullParser.require(2, null, "Ad");
            newPullParser.nextTag();
            trim = newPullParser.getName().trim();
            m_isWrapper = trim.equals("Wrapper");
        } catch (IOException e) {
            hashMap.clear();
            Log.d("VASTParser", "IOException: " + e.getMessage());
        } catch (XmlPullParserException e2) {
            hashMap.clear();
            Log.d("VASTParser", "XmlPullParserException: " + e2.getMessage());
        }
        if (m_isWrapper || trim.equals("InLine")) {
            parseContent(newPullParser, trim, hashMap);
            Log.d("VASTParser", "parsing vast complete");
            String[][] strArr = new String[hashMap.size()];
            int i = 0;
            for (Map.Entry entry : hashMap.entrySet()) {
                ArrayList arrayList = (ArrayList) entry.getValue();
                strArr[i] = new String[arrayList.size() + 1];
                strArr[i][0] = (String) entry.getKey();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    strArr[i][i2 + 1] = (String) arrayList.get(i2);
                }
                i++;
            }
            return strArr;
        }
        throw new XmlPullParserException("not a valid VAST document");
    }
}

package com.amazon.aps.iva.wq;

import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import java.util.Arrays;
import java.util.Locale;
/* compiled from: RumEventDeserializer.kt */
/* loaded from: classes2.dex */
public final class b implements com.amazon.aps.iva.sp.d<Object> {
    /* JADX WARN: Removed duplicated region for block: B:149:0x0338 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0339 A[Catch: NumberFormatException -> 0x0427, IllegalStateException -> 0x0432, TryCatch #14 {IllegalStateException -> 0x0432, NumberFormatException -> 0x0427, blocks: (B:127:0x02a1, B:129:0x02d4, B:133:0x02e3, B:140:0x030d, B:147:0x0332, B:154:0x0348, B:161:0x035e, B:170:0x038a, B:177:0x03a0, B:184:0x03bc, B:191:0x03e2, B:187:0x03d4, B:190:0x03dd, B:180:0x03a9, B:183:0x03b4, B:173:0x0391, B:176:0x039a, B:164:0x0365, B:194:0x03fc, B:195:0x0405, B:197:0x0407, B:198:0x0410, B:157:0x034f, B:160:0x0358, B:150:0x0339, B:153:0x0342, B:143:0x0323, B:146:0x032c, B:136:0x02f9, B:139:0x0302, B:132:0x02dd, B:200:0x0412, B:201:0x041b, B:203:0x041d, B:204:0x0426, B:167:0x036e, B:128:0x02bc), top: B:213:0x02a1, inners: #11, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x034e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x034f A[Catch: NumberFormatException -> 0x0427, IllegalStateException -> 0x0432, TryCatch #14 {IllegalStateException -> 0x0432, NumberFormatException -> 0x0427, blocks: (B:127:0x02a1, B:129:0x02d4, B:133:0x02e3, B:140:0x030d, B:147:0x0332, B:154:0x0348, B:161:0x035e, B:170:0x038a, B:177:0x03a0, B:184:0x03bc, B:191:0x03e2, B:187:0x03d4, B:190:0x03dd, B:180:0x03a9, B:183:0x03b4, B:173:0x0391, B:176:0x039a, B:164:0x0365, B:194:0x03fc, B:195:0x0405, B:197:0x0407, B:198:0x0410, B:157:0x034f, B:160:0x0358, B:150:0x0339, B:153:0x0342, B:143:0x0323, B:146:0x032c, B:136:0x02f9, B:139:0x0302, B:132:0x02dd, B:200:0x0412, B:201:0x041b, B:203:0x041d, B:204:0x0426, B:167:0x036e, B:128:0x02bc), top: B:213:0x02a1, inners: #11, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0364 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0365 A[Catch: NumberFormatException -> 0x0427, IllegalStateException -> 0x0432, TRY_LEAVE, TryCatch #14 {IllegalStateException -> 0x0432, NumberFormatException -> 0x0427, blocks: (B:127:0x02a1, B:129:0x02d4, B:133:0x02e3, B:140:0x030d, B:147:0x0332, B:154:0x0348, B:161:0x035e, B:170:0x038a, B:177:0x03a0, B:184:0x03bc, B:191:0x03e2, B:187:0x03d4, B:190:0x03dd, B:180:0x03a9, B:183:0x03b4, B:173:0x0391, B:176:0x039a, B:164:0x0365, B:194:0x03fc, B:195:0x0405, B:197:0x0407, B:198:0x0410, B:157:0x034f, B:160:0x0358, B:150:0x0339, B:153:0x0342, B:143:0x0323, B:146:0x032c, B:136:0x02f9, B:139:0x0302, B:132:0x02dd, B:200:0x0412, B:201:0x041b, B:203:0x041d, B:204:0x0426, B:167:0x036e, B:128:0x02bc), top: B:213:0x02a1, inners: #11, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0390 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0391 A[Catch: NumberFormatException -> 0x0427, IllegalStateException -> 0x0432, TryCatch #14 {IllegalStateException -> 0x0432, NumberFormatException -> 0x0427, blocks: (B:127:0x02a1, B:129:0x02d4, B:133:0x02e3, B:140:0x030d, B:147:0x0332, B:154:0x0348, B:161:0x035e, B:170:0x038a, B:177:0x03a0, B:184:0x03bc, B:191:0x03e2, B:187:0x03d4, B:190:0x03dd, B:180:0x03a9, B:183:0x03b4, B:173:0x0391, B:176:0x039a, B:164:0x0365, B:194:0x03fc, B:195:0x0405, B:197:0x0407, B:198:0x0410, B:157:0x034f, B:160:0x0358, B:150:0x0339, B:153:0x0342, B:143:0x0323, B:146:0x032c, B:136:0x02f9, B:139:0x0302, B:132:0x02dd, B:200:0x0412, B:201:0x041b, B:203:0x041d, B:204:0x0426, B:167:0x036e, B:128:0x02bc), top: B:213:0x02a1, inners: #11, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03a9 A[Catch: NumberFormatException -> 0x0427, IllegalStateException -> 0x0432, TryCatch #14 {IllegalStateException -> 0x0432, NumberFormatException -> 0x0427, blocks: (B:127:0x02a1, B:129:0x02d4, B:133:0x02e3, B:140:0x030d, B:147:0x0332, B:154:0x0348, B:161:0x035e, B:170:0x038a, B:177:0x03a0, B:184:0x03bc, B:191:0x03e2, B:187:0x03d4, B:190:0x03dd, B:180:0x03a9, B:183:0x03b4, B:173:0x0391, B:176:0x039a, B:164:0x0365, B:194:0x03fc, B:195:0x0405, B:197:0x0407, B:198:0x0410, B:157:0x034f, B:160:0x0358, B:150:0x0339, B:153:0x0342, B:143:0x0323, B:146:0x032c, B:136:0x02f9, B:139:0x0302, B:132:0x02dd, B:200:0x0412, B:201:0x041b, B:203:0x041d, B:204:0x0426, B:167:0x036e, B:128:0x02bc), top: B:213:0x02a1, inners: #11, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03d4 A[Catch: NumberFormatException -> 0x0427, IllegalStateException -> 0x0432, TryCatch #14 {IllegalStateException -> 0x0432, NumberFormatException -> 0x0427, blocks: (B:127:0x02a1, B:129:0x02d4, B:133:0x02e3, B:140:0x030d, B:147:0x0332, B:154:0x0348, B:161:0x035e, B:170:0x038a, B:177:0x03a0, B:184:0x03bc, B:191:0x03e2, B:187:0x03d4, B:190:0x03dd, B:180:0x03a9, B:183:0x03b4, B:173:0x0391, B:176:0x039a, B:164:0x0365, B:194:0x03fc, B:195:0x0405, B:197:0x0407, B:198:0x0410, B:157:0x034f, B:160:0x0358, B:150:0x0339, B:153:0x0342, B:143:0x0323, B:146:0x032c, B:136:0x02f9, B:139:0x0302, B:132:0x02dd, B:200:0x0412, B:201:0x041b, B:203:0x041d, B:204:0x0426, B:167:0x036e, B:128:0x02bc), top: B:213:0x02a1, inners: #11, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0146 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0147 A[Catch: NumberFormatException -> 0x027d, IllegalStateException -> 0x0288, TryCatch #12 {IllegalStateException -> 0x0288, NumberFormatException -> 0x027d, blocks: (B:28:0x00af, B:30:0x00e2, B:34:0x00f1, B:41:0x011b, B:48:0x0140, B:55:0x0156, B:62:0x016c, B:71:0x019c, B:78:0x01b6, B:85:0x01d0, B:92:0x01f7, B:100:0x0230, B:95:0x020d, B:102:0x023c, B:103:0x0245, B:105:0x0247, B:106:0x0250, B:88:0x01e8, B:91:0x01f1, B:81:0x01bd, B:84:0x01c8, B:74:0x01a3, B:77:0x01ae, B:65:0x0173, B:108:0x0252, B:109:0x025b, B:111:0x025d, B:112:0x0266, B:58:0x015d, B:61:0x0166, B:51:0x0147, B:54:0x0150, B:44:0x0131, B:47:0x013a, B:37:0x0107, B:40:0x0110, B:33:0x00eb, B:114:0x0268, B:115:0x0271, B:117:0x0273, B:118:0x027c, B:29:0x00ca, B:68:0x017c, B:98:0x0216), top: B:216:0x00af, inners: #13, #9, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015d A[Catch: NumberFormatException -> 0x027d, IllegalStateException -> 0x0288, TryCatch #12 {IllegalStateException -> 0x0288, NumberFormatException -> 0x027d, blocks: (B:28:0x00af, B:30:0x00e2, B:34:0x00f1, B:41:0x011b, B:48:0x0140, B:55:0x0156, B:62:0x016c, B:71:0x019c, B:78:0x01b6, B:85:0x01d0, B:92:0x01f7, B:100:0x0230, B:95:0x020d, B:102:0x023c, B:103:0x0245, B:105:0x0247, B:106:0x0250, B:88:0x01e8, B:91:0x01f1, B:81:0x01bd, B:84:0x01c8, B:74:0x01a3, B:77:0x01ae, B:65:0x0173, B:108:0x0252, B:109:0x025b, B:111:0x025d, B:112:0x0266, B:58:0x015d, B:61:0x0166, B:51:0x0147, B:54:0x0150, B:44:0x0131, B:47:0x013a, B:37:0x0107, B:40:0x0110, B:33:0x00eb, B:114:0x0268, B:115:0x0271, B:117:0x0273, B:118:0x027c, B:29:0x00ca, B:68:0x017c, B:98:0x0216), top: B:216:0x00af, inners: #13, #9, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0172 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0173 A[Catch: NumberFormatException -> 0x027d, IllegalStateException -> 0x0288, TRY_LEAVE, TryCatch #12 {IllegalStateException -> 0x0288, NumberFormatException -> 0x027d, blocks: (B:28:0x00af, B:30:0x00e2, B:34:0x00f1, B:41:0x011b, B:48:0x0140, B:55:0x0156, B:62:0x016c, B:71:0x019c, B:78:0x01b6, B:85:0x01d0, B:92:0x01f7, B:100:0x0230, B:95:0x020d, B:102:0x023c, B:103:0x0245, B:105:0x0247, B:106:0x0250, B:88:0x01e8, B:91:0x01f1, B:81:0x01bd, B:84:0x01c8, B:74:0x01a3, B:77:0x01ae, B:65:0x0173, B:108:0x0252, B:109:0x025b, B:111:0x025d, B:112:0x0266, B:58:0x015d, B:61:0x0166, B:51:0x0147, B:54:0x0150, B:44:0x0131, B:47:0x013a, B:37:0x0107, B:40:0x0110, B:33:0x00eb, B:114:0x0268, B:115:0x0271, B:117:0x0273, B:118:0x027c, B:29:0x00ca, B:68:0x017c, B:98:0x0216), top: B:216:0x00af, inners: #13, #9, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a3 A[Catch: NumberFormatException -> 0x027d, IllegalStateException -> 0x0288, TryCatch #12 {IllegalStateException -> 0x0288, NumberFormatException -> 0x027d, blocks: (B:28:0x00af, B:30:0x00e2, B:34:0x00f1, B:41:0x011b, B:48:0x0140, B:55:0x0156, B:62:0x016c, B:71:0x019c, B:78:0x01b6, B:85:0x01d0, B:92:0x01f7, B:100:0x0230, B:95:0x020d, B:102:0x023c, B:103:0x0245, B:105:0x0247, B:106:0x0250, B:88:0x01e8, B:91:0x01f1, B:81:0x01bd, B:84:0x01c8, B:74:0x01a3, B:77:0x01ae, B:65:0x0173, B:108:0x0252, B:109:0x025b, B:111:0x025d, B:112:0x0266, B:58:0x015d, B:61:0x0166, B:51:0x0147, B:54:0x0150, B:44:0x0131, B:47:0x013a, B:37:0x0107, B:40:0x0110, B:33:0x00eb, B:114:0x0268, B:115:0x0271, B:117:0x0273, B:118:0x027c, B:29:0x00ca, B:68:0x017c, B:98:0x0216), top: B:216:0x00af, inners: #13, #9, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01bd A[Catch: NumberFormatException -> 0x027d, IllegalStateException -> 0x0288, TryCatch #12 {IllegalStateException -> 0x0288, NumberFormatException -> 0x027d, blocks: (B:28:0x00af, B:30:0x00e2, B:34:0x00f1, B:41:0x011b, B:48:0x0140, B:55:0x0156, B:62:0x016c, B:71:0x019c, B:78:0x01b6, B:85:0x01d0, B:92:0x01f7, B:100:0x0230, B:95:0x020d, B:102:0x023c, B:103:0x0245, B:105:0x0247, B:106:0x0250, B:88:0x01e8, B:91:0x01f1, B:81:0x01bd, B:84:0x01c8, B:74:0x01a3, B:77:0x01ae, B:65:0x0173, B:108:0x0252, B:109:0x025b, B:111:0x025d, B:112:0x0266, B:58:0x015d, B:61:0x0166, B:51:0x0147, B:54:0x0150, B:44:0x0131, B:47:0x013a, B:37:0x0107, B:40:0x0110, B:33:0x00eb, B:114:0x0268, B:115:0x0271, B:117:0x0273, B:118:0x027c, B:29:0x00ca, B:68:0x017c, B:98:0x0216), top: B:216:0x00af, inners: #13, #9, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e8 A[Catch: NumberFormatException -> 0x027d, IllegalStateException -> 0x0288, TryCatch #12 {IllegalStateException -> 0x0288, NumberFormatException -> 0x027d, blocks: (B:28:0x00af, B:30:0x00e2, B:34:0x00f1, B:41:0x011b, B:48:0x0140, B:55:0x0156, B:62:0x016c, B:71:0x019c, B:78:0x01b6, B:85:0x01d0, B:92:0x01f7, B:100:0x0230, B:95:0x020d, B:102:0x023c, B:103:0x0245, B:105:0x0247, B:106:0x0250, B:88:0x01e8, B:91:0x01f1, B:81:0x01bd, B:84:0x01c8, B:74:0x01a3, B:77:0x01ae, B:65:0x0173, B:108:0x0252, B:109:0x025b, B:111:0x025d, B:112:0x0266, B:58:0x015d, B:61:0x0166, B:51:0x0147, B:54:0x0150, B:44:0x0131, B:47:0x013a, B:37:0x0107, B:40:0x0110, B:33:0x00eb, B:114:0x0268, B:115:0x0271, B:117:0x0273, B:118:0x027c, B:29:0x00ca, B:68:0x017c, B:98:0x0216), top: B:216:0x00af, inners: #13, #9, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x020d A[Catch: NumberFormatException -> 0x027d, IllegalStateException -> 0x0288, TRY_LEAVE, TryCatch #12 {IllegalStateException -> 0x0288, NumberFormatException -> 0x027d, blocks: (B:28:0x00af, B:30:0x00e2, B:34:0x00f1, B:41:0x011b, B:48:0x0140, B:55:0x0156, B:62:0x016c, B:71:0x019c, B:78:0x01b6, B:85:0x01d0, B:92:0x01f7, B:100:0x0230, B:95:0x020d, B:102:0x023c, B:103:0x0245, B:105:0x0247, B:106:0x0250, B:88:0x01e8, B:91:0x01f1, B:81:0x01bd, B:84:0x01c8, B:74:0x01a3, B:77:0x01ae, B:65:0x0173, B:108:0x0252, B:109:0x025b, B:111:0x025d, B:112:0x0266, B:58:0x015d, B:61:0x0166, B:51:0x0147, B:54:0x0150, B:44:0x0131, B:47:0x013a, B:37:0x0107, B:40:0x0110, B:33:0x00eb, B:114:0x0268, B:115:0x0271, B:117:0x0273, B:118:0x027c, B:29:0x00ca, B:68:0x017c, B:98:0x0216), top: B:216:0x00af, inners: #13, #9, #8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(com.google.gson.JsonObject r43, java.lang.String r44, java.lang.String r45) throws com.google.gson.JsonParseException {
        /*
            Method dump skipped, instructions count: 1124
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.wq.b.b(com.google.gson.JsonObject, java.lang.String, java.lang.String):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.sp.d
    public final Object a(String str) {
        String asString;
        try {
            JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
            JsonPrimitive asJsonPrimitive = asJsonObject.getAsJsonPrimitive("type");
            if (asJsonPrimitive == null) {
                asString = null;
            } else {
                asString = asJsonPrimitive.getAsString();
            }
            return b(asJsonObject, asString, str);
        } catch (JsonParseException e) {
            com.amazon.aps.iva.iq.a aVar = com.amazon.aps.iva.dq.c.a;
            String format = String.format(Locale.US, "Error while trying to deserialize the serialized RumEvent: %s", Arrays.copyOf(new Object[]{str}, 1));
            j.e(format, "format(locale, this, *args)");
            l1.z(aVar, format, e, 4);
            return null;
        } catch (IllegalStateException e2) {
            com.amazon.aps.iva.iq.a aVar2 = com.amazon.aps.iva.dq.c.a;
            String format2 = String.format(Locale.US, "Error while trying to deserialize the serialized RumEvent: %s", Arrays.copyOf(new Object[]{str}, 1));
            j.e(format2, "format(locale, this, *args)");
            l1.z(aVar2, format2, e2, 4);
            return null;
        }
    }
}

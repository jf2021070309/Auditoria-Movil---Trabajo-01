package com.amazon.aps.iva.fr;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.cast.CredentialsData;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import okhttp3.internal.http2.Http2;
/* compiled from: ViewEvent.kt */
/* loaded from: classes2.dex */
public final class e {
    public final long a;
    public final b b;
    public final String c;
    public final b0 d;
    public final w e;
    public final a0 f;
    public final z g;
    public final f h;
    public final y i;
    public final d j;
    public final t k;
    public final l l;
    public final j m;
    public final g n;
    public final String o = "view";

    /* compiled from: ViewEvent.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public final long a;

        public a(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && this.a == ((a) obj).a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return com.amazon.aps.iva.c.b.b(new StringBuilder("Action(count="), this.a, ")");
        }
    }

    /* compiled from: ViewEvent.kt */
    /* loaded from: classes2.dex */
    public static final class a0 {
        public final Number A;
        public final Number B;
        public final Number C;
        public final Number D;
        public final Number E;
        public final Number F;
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final Long e;
        public final r f;
        public final long g;
        public final Long h;
        public final Long i;
        public final Long j;
        public final Long k;
        public final Number l;
        public final Long m;
        public final Long n;
        public final Long o;
        public final Long p;
        public final i q;
        public final Boolean r;
        public final Boolean s;
        public final a t;
        public final n u;
        public final h v;
        public final s w;
        public final o x;
        public final v y;
        public final List<p> z;

        /* compiled from: ViewEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            /* JADX WARN: Removed duplicated region for block: B:102:0x025f A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:103:0x0260 A[Catch: NumberFormatException -> 0x03f1, IllegalStateException -> 0x03fc, TryCatch #9 {IllegalStateException -> 0x03fc, NumberFormatException -> 0x03f1, blocks: (B:3:0x0008, B:7:0x0027, B:11:0x003e, B:15:0x0051, B:22:0x006c, B:26:0x0089, B:30:0x009e, B:34:0x00b3, B:38:0x00c8, B:42:0x00d9, B:46:0x00ee, B:50:0x0103, B:54:0x0118, B:58:0x012d, B:65:0x0145, B:69:0x015a, B:73:0x016f, B:75:0x0193, B:77:0x01b7, B:84:0x01e1, B:91:0x020b, B:98:0x0235, B:100:0x0257, B:119:0x02e2, B:123:0x02f0, B:127:0x02fe, B:131:0x030f, B:135:0x0320, B:139:0x0331, B:143:0x033f, B:142:0x033b, B:138:0x032b, B:134:0x031a, B:130:0x0309, B:126:0x02fa, B:122:0x02ec, B:103:0x0260, B:106:0x026f, B:107:0x027c, B:109:0x0282, B:111:0x02ba, B:113:0x02c7, B:114:0x02d0, B:116:0x02d2, B:117:0x02db, B:146:0x036e, B:147:0x0377, B:149:0x0379, B:150:0x0382, B:94:0x0214, B:152:0x0384, B:153:0x038d, B:155:0x038f, B:156:0x0398, B:87:0x01ea, B:158:0x039a, B:159:0x03a3, B:161:0x03a5, B:162:0x03ae, B:80:0x01c0, B:164:0x03b0, B:165:0x03b9, B:167:0x03bb, B:168:0x03c4, B:170:0x03c6, B:171:0x03cf, B:173:0x03d1, B:174:0x03da, B:176:0x03dc, B:177:0x03e5, B:179:0x03e7, B:180:0x03f0, B:72:0x0165, B:68:0x0150, B:61:0x0136, B:64:0x013f, B:57:0x0123, B:53:0x010e, B:49:0x00f9, B:45:0x00e4, B:41:0x00d3, B:37:0x00be, B:33:0x00a9, B:29:0x0094, B:25:0x0080, B:18:0x005a, B:21:0x0062, B:14:0x0048, B:10:0x0039, B:6:0x0022), top: B:201:0x0008 }] */
            /* JADX WARN: Removed duplicated region for block: B:109:0x0282 A[Catch: NumberFormatException -> 0x03f1, IllegalStateException -> 0x03fc, TRY_LEAVE, TryCatch #9 {IllegalStateException -> 0x03fc, NumberFormatException -> 0x03f1, blocks: (B:3:0x0008, B:7:0x0027, B:11:0x003e, B:15:0x0051, B:22:0x006c, B:26:0x0089, B:30:0x009e, B:34:0x00b3, B:38:0x00c8, B:42:0x00d9, B:46:0x00ee, B:50:0x0103, B:54:0x0118, B:58:0x012d, B:65:0x0145, B:69:0x015a, B:73:0x016f, B:75:0x0193, B:77:0x01b7, B:84:0x01e1, B:91:0x020b, B:98:0x0235, B:100:0x0257, B:119:0x02e2, B:123:0x02f0, B:127:0x02fe, B:131:0x030f, B:135:0x0320, B:139:0x0331, B:143:0x033f, B:142:0x033b, B:138:0x032b, B:134:0x031a, B:130:0x0309, B:126:0x02fa, B:122:0x02ec, B:103:0x0260, B:106:0x026f, B:107:0x027c, B:109:0x0282, B:111:0x02ba, B:113:0x02c7, B:114:0x02d0, B:116:0x02d2, B:117:0x02db, B:146:0x036e, B:147:0x0377, B:149:0x0379, B:150:0x0382, B:94:0x0214, B:152:0x0384, B:153:0x038d, B:155:0x038f, B:156:0x0398, B:87:0x01ea, B:158:0x039a, B:159:0x03a3, B:161:0x03a5, B:162:0x03ae, B:80:0x01c0, B:164:0x03b0, B:165:0x03b9, B:167:0x03bb, B:168:0x03c4, B:170:0x03c6, B:171:0x03cf, B:173:0x03d1, B:174:0x03da, B:176:0x03dc, B:177:0x03e5, B:179:0x03e7, B:180:0x03f0, B:72:0x0165, B:68:0x0150, B:61:0x0136, B:64:0x013f, B:57:0x0123, B:53:0x010e, B:49:0x00f9, B:45:0x00e4, B:41:0x00d3, B:37:0x00be, B:33:0x00a9, B:29:0x0094, B:25:0x0080, B:18:0x005a, B:21:0x0062, B:14:0x0048, B:10:0x0039, B:6:0x0022), top: B:201:0x0008 }] */
            /* JADX WARN: Removed duplicated region for block: B:121:0x02ea  */
            /* JADX WARN: Removed duplicated region for block: B:122:0x02ec A[Catch: NumberFormatException -> 0x03f1, IllegalStateException -> 0x03fc, TryCatch #9 {IllegalStateException -> 0x03fc, NumberFormatException -> 0x03f1, blocks: (B:3:0x0008, B:7:0x0027, B:11:0x003e, B:15:0x0051, B:22:0x006c, B:26:0x0089, B:30:0x009e, B:34:0x00b3, B:38:0x00c8, B:42:0x00d9, B:46:0x00ee, B:50:0x0103, B:54:0x0118, B:58:0x012d, B:65:0x0145, B:69:0x015a, B:73:0x016f, B:75:0x0193, B:77:0x01b7, B:84:0x01e1, B:91:0x020b, B:98:0x0235, B:100:0x0257, B:119:0x02e2, B:123:0x02f0, B:127:0x02fe, B:131:0x030f, B:135:0x0320, B:139:0x0331, B:143:0x033f, B:142:0x033b, B:138:0x032b, B:134:0x031a, B:130:0x0309, B:126:0x02fa, B:122:0x02ec, B:103:0x0260, B:106:0x026f, B:107:0x027c, B:109:0x0282, B:111:0x02ba, B:113:0x02c7, B:114:0x02d0, B:116:0x02d2, B:117:0x02db, B:146:0x036e, B:147:0x0377, B:149:0x0379, B:150:0x0382, B:94:0x0214, B:152:0x0384, B:153:0x038d, B:155:0x038f, B:156:0x0398, B:87:0x01ea, B:158:0x039a, B:159:0x03a3, B:161:0x03a5, B:162:0x03ae, B:80:0x01c0, B:164:0x03b0, B:165:0x03b9, B:167:0x03bb, B:168:0x03c4, B:170:0x03c6, B:171:0x03cf, B:173:0x03d1, B:174:0x03da, B:176:0x03dc, B:177:0x03e5, B:179:0x03e7, B:180:0x03f0, B:72:0x0165, B:68:0x0150, B:61:0x0136, B:64:0x013f, B:57:0x0123, B:53:0x010e, B:49:0x00f9, B:45:0x00e4, B:41:0x00d3, B:37:0x00be, B:33:0x00a9, B:29:0x0094, B:25:0x0080, B:18:0x005a, B:21:0x0062, B:14:0x0048, B:10:0x0039, B:6:0x0022), top: B:201:0x0008 }] */
            /* JADX WARN: Removed duplicated region for block: B:125:0x02f8  */
            /* JADX WARN: Removed duplicated region for block: B:126:0x02fa A[Catch: NumberFormatException -> 0x03f1, IllegalStateException -> 0x03fc, TryCatch #9 {IllegalStateException -> 0x03fc, NumberFormatException -> 0x03f1, blocks: (B:3:0x0008, B:7:0x0027, B:11:0x003e, B:15:0x0051, B:22:0x006c, B:26:0x0089, B:30:0x009e, B:34:0x00b3, B:38:0x00c8, B:42:0x00d9, B:46:0x00ee, B:50:0x0103, B:54:0x0118, B:58:0x012d, B:65:0x0145, B:69:0x015a, B:73:0x016f, B:75:0x0193, B:77:0x01b7, B:84:0x01e1, B:91:0x020b, B:98:0x0235, B:100:0x0257, B:119:0x02e2, B:123:0x02f0, B:127:0x02fe, B:131:0x030f, B:135:0x0320, B:139:0x0331, B:143:0x033f, B:142:0x033b, B:138:0x032b, B:134:0x031a, B:130:0x0309, B:126:0x02fa, B:122:0x02ec, B:103:0x0260, B:106:0x026f, B:107:0x027c, B:109:0x0282, B:111:0x02ba, B:113:0x02c7, B:114:0x02d0, B:116:0x02d2, B:117:0x02db, B:146:0x036e, B:147:0x0377, B:149:0x0379, B:150:0x0382, B:94:0x0214, B:152:0x0384, B:153:0x038d, B:155:0x038f, B:156:0x0398, B:87:0x01ea, B:158:0x039a, B:159:0x03a3, B:161:0x03a5, B:162:0x03ae, B:80:0x01c0, B:164:0x03b0, B:165:0x03b9, B:167:0x03bb, B:168:0x03c4, B:170:0x03c6, B:171:0x03cf, B:173:0x03d1, B:174:0x03da, B:176:0x03dc, B:177:0x03e5, B:179:0x03e7, B:180:0x03f0, B:72:0x0165, B:68:0x0150, B:61:0x0136, B:64:0x013f, B:57:0x0123, B:53:0x010e, B:49:0x00f9, B:45:0x00e4, B:41:0x00d3, B:37:0x00be, B:33:0x00a9, B:29:0x0094, B:25:0x0080, B:18:0x005a, B:21:0x0062, B:14:0x0048, B:10:0x0039, B:6:0x0022), top: B:201:0x0008 }] */
            /* JADX WARN: Removed duplicated region for block: B:129:0x0306  */
            /* JADX WARN: Removed duplicated region for block: B:130:0x0309 A[Catch: NumberFormatException -> 0x03f1, IllegalStateException -> 0x03fc, TryCatch #9 {IllegalStateException -> 0x03fc, NumberFormatException -> 0x03f1, blocks: (B:3:0x0008, B:7:0x0027, B:11:0x003e, B:15:0x0051, B:22:0x006c, B:26:0x0089, B:30:0x009e, B:34:0x00b3, B:38:0x00c8, B:42:0x00d9, B:46:0x00ee, B:50:0x0103, B:54:0x0118, B:58:0x012d, B:65:0x0145, B:69:0x015a, B:73:0x016f, B:75:0x0193, B:77:0x01b7, B:84:0x01e1, B:91:0x020b, B:98:0x0235, B:100:0x0257, B:119:0x02e2, B:123:0x02f0, B:127:0x02fe, B:131:0x030f, B:135:0x0320, B:139:0x0331, B:143:0x033f, B:142:0x033b, B:138:0x032b, B:134:0x031a, B:130:0x0309, B:126:0x02fa, B:122:0x02ec, B:103:0x0260, B:106:0x026f, B:107:0x027c, B:109:0x0282, B:111:0x02ba, B:113:0x02c7, B:114:0x02d0, B:116:0x02d2, B:117:0x02db, B:146:0x036e, B:147:0x0377, B:149:0x0379, B:150:0x0382, B:94:0x0214, B:152:0x0384, B:153:0x038d, B:155:0x038f, B:156:0x0398, B:87:0x01ea, B:158:0x039a, B:159:0x03a3, B:161:0x03a5, B:162:0x03ae, B:80:0x01c0, B:164:0x03b0, B:165:0x03b9, B:167:0x03bb, B:168:0x03c4, B:170:0x03c6, B:171:0x03cf, B:173:0x03d1, B:174:0x03da, B:176:0x03dc, B:177:0x03e5, B:179:0x03e7, B:180:0x03f0, B:72:0x0165, B:68:0x0150, B:61:0x0136, B:64:0x013f, B:57:0x0123, B:53:0x010e, B:49:0x00f9, B:45:0x00e4, B:41:0x00d3, B:37:0x00be, B:33:0x00a9, B:29:0x0094, B:25:0x0080, B:18:0x005a, B:21:0x0062, B:14:0x0048, B:10:0x0039, B:6:0x0022), top: B:201:0x0008 }] */
            /* JADX WARN: Removed duplicated region for block: B:133:0x0317  */
            /* JADX WARN: Removed duplicated region for block: B:134:0x031a A[Catch: NumberFormatException -> 0x03f1, IllegalStateException -> 0x03fc, TryCatch #9 {IllegalStateException -> 0x03fc, NumberFormatException -> 0x03f1, blocks: (B:3:0x0008, B:7:0x0027, B:11:0x003e, B:15:0x0051, B:22:0x006c, B:26:0x0089, B:30:0x009e, B:34:0x00b3, B:38:0x00c8, B:42:0x00d9, B:46:0x00ee, B:50:0x0103, B:54:0x0118, B:58:0x012d, B:65:0x0145, B:69:0x015a, B:73:0x016f, B:75:0x0193, B:77:0x01b7, B:84:0x01e1, B:91:0x020b, B:98:0x0235, B:100:0x0257, B:119:0x02e2, B:123:0x02f0, B:127:0x02fe, B:131:0x030f, B:135:0x0320, B:139:0x0331, B:143:0x033f, B:142:0x033b, B:138:0x032b, B:134:0x031a, B:130:0x0309, B:126:0x02fa, B:122:0x02ec, B:103:0x0260, B:106:0x026f, B:107:0x027c, B:109:0x0282, B:111:0x02ba, B:113:0x02c7, B:114:0x02d0, B:116:0x02d2, B:117:0x02db, B:146:0x036e, B:147:0x0377, B:149:0x0379, B:150:0x0382, B:94:0x0214, B:152:0x0384, B:153:0x038d, B:155:0x038f, B:156:0x0398, B:87:0x01ea, B:158:0x039a, B:159:0x03a3, B:161:0x03a5, B:162:0x03ae, B:80:0x01c0, B:164:0x03b0, B:165:0x03b9, B:167:0x03bb, B:168:0x03c4, B:170:0x03c6, B:171:0x03cf, B:173:0x03d1, B:174:0x03da, B:176:0x03dc, B:177:0x03e5, B:179:0x03e7, B:180:0x03f0, B:72:0x0165, B:68:0x0150, B:61:0x0136, B:64:0x013f, B:57:0x0123, B:53:0x010e, B:49:0x00f9, B:45:0x00e4, B:41:0x00d3, B:37:0x00be, B:33:0x00a9, B:29:0x0094, B:25:0x0080, B:18:0x005a, B:21:0x0062, B:14:0x0048, B:10:0x0039, B:6:0x0022), top: B:201:0x0008 }] */
            /* JADX WARN: Removed duplicated region for block: B:137:0x0328  */
            /* JADX WARN: Removed duplicated region for block: B:138:0x032b A[Catch: NumberFormatException -> 0x03f1, IllegalStateException -> 0x03fc, TryCatch #9 {IllegalStateException -> 0x03fc, NumberFormatException -> 0x03f1, blocks: (B:3:0x0008, B:7:0x0027, B:11:0x003e, B:15:0x0051, B:22:0x006c, B:26:0x0089, B:30:0x009e, B:34:0x00b3, B:38:0x00c8, B:42:0x00d9, B:46:0x00ee, B:50:0x0103, B:54:0x0118, B:58:0x012d, B:65:0x0145, B:69:0x015a, B:73:0x016f, B:75:0x0193, B:77:0x01b7, B:84:0x01e1, B:91:0x020b, B:98:0x0235, B:100:0x0257, B:119:0x02e2, B:123:0x02f0, B:127:0x02fe, B:131:0x030f, B:135:0x0320, B:139:0x0331, B:143:0x033f, B:142:0x033b, B:138:0x032b, B:134:0x031a, B:130:0x0309, B:126:0x02fa, B:122:0x02ec, B:103:0x0260, B:106:0x026f, B:107:0x027c, B:109:0x0282, B:111:0x02ba, B:113:0x02c7, B:114:0x02d0, B:116:0x02d2, B:117:0x02db, B:146:0x036e, B:147:0x0377, B:149:0x0379, B:150:0x0382, B:94:0x0214, B:152:0x0384, B:153:0x038d, B:155:0x038f, B:156:0x0398, B:87:0x01ea, B:158:0x039a, B:159:0x03a3, B:161:0x03a5, B:162:0x03ae, B:80:0x01c0, B:164:0x03b0, B:165:0x03b9, B:167:0x03bb, B:168:0x03c4, B:170:0x03c6, B:171:0x03cf, B:173:0x03d1, B:174:0x03da, B:176:0x03dc, B:177:0x03e5, B:179:0x03e7, B:180:0x03f0, B:72:0x0165, B:68:0x0150, B:61:0x0136, B:64:0x013f, B:57:0x0123, B:53:0x010e, B:49:0x00f9, B:45:0x00e4, B:41:0x00d3, B:37:0x00be, B:33:0x00a9, B:29:0x0094, B:25:0x0080, B:18:0x005a, B:21:0x0062, B:14:0x0048, B:10:0x0039, B:6:0x0022), top: B:201:0x0008 }] */
            /* JADX WARN: Removed duplicated region for block: B:141:0x0339  */
            /* JADX WARN: Removed duplicated region for block: B:142:0x033b A[Catch: NumberFormatException -> 0x03f1, IllegalStateException -> 0x03fc, TryCatch #9 {IllegalStateException -> 0x03fc, NumberFormatException -> 0x03f1, blocks: (B:3:0x0008, B:7:0x0027, B:11:0x003e, B:15:0x0051, B:22:0x006c, B:26:0x0089, B:30:0x009e, B:34:0x00b3, B:38:0x00c8, B:42:0x00d9, B:46:0x00ee, B:50:0x0103, B:54:0x0118, B:58:0x012d, B:65:0x0145, B:69:0x015a, B:73:0x016f, B:75:0x0193, B:77:0x01b7, B:84:0x01e1, B:91:0x020b, B:98:0x0235, B:100:0x0257, B:119:0x02e2, B:123:0x02f0, B:127:0x02fe, B:131:0x030f, B:135:0x0320, B:139:0x0331, B:143:0x033f, B:142:0x033b, B:138:0x032b, B:134:0x031a, B:130:0x0309, B:126:0x02fa, B:122:0x02ec, B:103:0x0260, B:106:0x026f, B:107:0x027c, B:109:0x0282, B:111:0x02ba, B:113:0x02c7, B:114:0x02d0, B:116:0x02d2, B:117:0x02db, B:146:0x036e, B:147:0x0377, B:149:0x0379, B:150:0x0382, B:94:0x0214, B:152:0x0384, B:153:0x038d, B:155:0x038f, B:156:0x0398, B:87:0x01ea, B:158:0x039a, B:159:0x03a3, B:161:0x03a5, B:162:0x03ae, B:80:0x01c0, B:164:0x03b0, B:165:0x03b9, B:167:0x03bb, B:168:0x03c4, B:170:0x03c6, B:171:0x03cf, B:173:0x03d1, B:174:0x03da, B:176:0x03dc, B:177:0x03e5, B:179:0x03e7, B:180:0x03f0, B:72:0x0165, B:68:0x0150, B:61:0x0136, B:64:0x013f, B:57:0x0123, B:53:0x010e, B:49:0x00f9, B:45:0x00e4, B:41:0x00d3, B:37:0x00be, B:33:0x00a9, B:29:0x0094, B:25:0x0080, B:18:0x005a, B:21:0x0062, B:14:0x0048, B:10:0x0039, B:6:0x0022), top: B:201:0x0008 }] */
            /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0080 A[Catch: NumberFormatException -> 0x03f1, IllegalStateException -> 0x03fc, TryCatch #9 {IllegalStateException -> 0x03fc, NumberFormatException -> 0x03f1, blocks: (B:3:0x0008, B:7:0x0027, B:11:0x003e, B:15:0x0051, B:22:0x006c, B:26:0x0089, B:30:0x009e, B:34:0x00b3, B:38:0x00c8, B:42:0x00d9, B:46:0x00ee, B:50:0x0103, B:54:0x0118, B:58:0x012d, B:65:0x0145, B:69:0x015a, B:73:0x016f, B:75:0x0193, B:77:0x01b7, B:84:0x01e1, B:91:0x020b, B:98:0x0235, B:100:0x0257, B:119:0x02e2, B:123:0x02f0, B:127:0x02fe, B:131:0x030f, B:135:0x0320, B:139:0x0331, B:143:0x033f, B:142:0x033b, B:138:0x032b, B:134:0x031a, B:130:0x0309, B:126:0x02fa, B:122:0x02ec, B:103:0x0260, B:106:0x026f, B:107:0x027c, B:109:0x0282, B:111:0x02ba, B:113:0x02c7, B:114:0x02d0, B:116:0x02d2, B:117:0x02db, B:146:0x036e, B:147:0x0377, B:149:0x0379, B:150:0x0382, B:94:0x0214, B:152:0x0384, B:153:0x038d, B:155:0x038f, B:156:0x0398, B:87:0x01ea, B:158:0x039a, B:159:0x03a3, B:161:0x03a5, B:162:0x03ae, B:80:0x01c0, B:164:0x03b0, B:165:0x03b9, B:167:0x03bb, B:168:0x03c4, B:170:0x03c6, B:171:0x03cf, B:173:0x03d1, B:174:0x03da, B:176:0x03dc, B:177:0x03e5, B:179:0x03e7, B:180:0x03f0, B:72:0x0165, B:68:0x0150, B:61:0x0136, B:64:0x013f, B:57:0x0123, B:53:0x010e, B:49:0x00f9, B:45:0x00e4, B:41:0x00d3, B:37:0x00be, B:33:0x00a9, B:29:0x0094, B:25:0x0080, B:18:0x005a, B:21:0x0062, B:14:0x0048, B:10:0x0039, B:6:0x0022), top: B:201:0x0008 }] */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0094 A[Catch: NumberFormatException -> 0x03f1, IllegalStateException -> 0x03fc, TryCatch #9 {IllegalStateException -> 0x03fc, NumberFormatException -> 0x03f1, blocks: (B:3:0x0008, B:7:0x0027, B:11:0x003e, B:15:0x0051, B:22:0x006c, B:26:0x0089, B:30:0x009e, B:34:0x00b3, B:38:0x00c8, B:42:0x00d9, B:46:0x00ee, B:50:0x0103, B:54:0x0118, B:58:0x012d, B:65:0x0145, B:69:0x015a, B:73:0x016f, B:75:0x0193, B:77:0x01b7, B:84:0x01e1, B:91:0x020b, B:98:0x0235, B:100:0x0257, B:119:0x02e2, B:123:0x02f0, B:127:0x02fe, B:131:0x030f, B:135:0x0320, B:139:0x0331, B:143:0x033f, B:142:0x033b, B:138:0x032b, B:134:0x031a, B:130:0x0309, B:126:0x02fa, B:122:0x02ec, B:103:0x0260, B:106:0x026f, B:107:0x027c, B:109:0x0282, B:111:0x02ba, B:113:0x02c7, B:114:0x02d0, B:116:0x02d2, B:117:0x02db, B:146:0x036e, B:147:0x0377, B:149:0x0379, B:150:0x0382, B:94:0x0214, B:152:0x0384, B:153:0x038d, B:155:0x038f, B:156:0x0398, B:87:0x01ea, B:158:0x039a, B:159:0x03a3, B:161:0x03a5, B:162:0x03ae, B:80:0x01c0, B:164:0x03b0, B:165:0x03b9, B:167:0x03bb, B:168:0x03c4, B:170:0x03c6, B:171:0x03cf, B:173:0x03d1, B:174:0x03da, B:176:0x03dc, B:177:0x03e5, B:179:0x03e7, B:180:0x03f0, B:72:0x0165, B:68:0x0150, B:61:0x0136, B:64:0x013f, B:57:0x0123, B:53:0x010e, B:49:0x00f9, B:45:0x00e4, B:41:0x00d3, B:37:0x00be, B:33:0x00a9, B:29:0x0094, B:25:0x0080, B:18:0x005a, B:21:0x0062, B:14:0x0048, B:10:0x0039, B:6:0x0022), top: B:201:0x0008 }] */
            /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00a9 A[Catch: NumberFormatException -> 0x03f1, IllegalStateException -> 0x03fc, TryCatch #9 {IllegalStateException -> 0x03fc, NumberFormatException -> 0x03f1, blocks: (B:3:0x0008, B:7:0x0027, B:11:0x003e, B:15:0x0051, B:22:0x006c, B:26:0x0089, B:30:0x009e, B:34:0x00b3, B:38:0x00c8, B:42:0x00d9, B:46:0x00ee, B:50:0x0103, B:54:0x0118, B:58:0x012d, B:65:0x0145, B:69:0x015a, B:73:0x016f, B:75:0x0193, B:77:0x01b7, B:84:0x01e1, B:91:0x020b, B:98:0x0235, B:100:0x0257, B:119:0x02e2, B:123:0x02f0, B:127:0x02fe, B:131:0x030f, B:135:0x0320, B:139:0x0331, B:143:0x033f, B:142:0x033b, B:138:0x032b, B:134:0x031a, B:130:0x0309, B:126:0x02fa, B:122:0x02ec, B:103:0x0260, B:106:0x026f, B:107:0x027c, B:109:0x0282, B:111:0x02ba, B:113:0x02c7, B:114:0x02d0, B:116:0x02d2, B:117:0x02db, B:146:0x036e, B:147:0x0377, B:149:0x0379, B:150:0x0382, B:94:0x0214, B:152:0x0384, B:153:0x038d, B:155:0x038f, B:156:0x0398, B:87:0x01ea, B:158:0x039a, B:159:0x03a3, B:161:0x03a5, B:162:0x03ae, B:80:0x01c0, B:164:0x03b0, B:165:0x03b9, B:167:0x03bb, B:168:0x03c4, B:170:0x03c6, B:171:0x03cf, B:173:0x03d1, B:174:0x03da, B:176:0x03dc, B:177:0x03e5, B:179:0x03e7, B:180:0x03f0, B:72:0x0165, B:68:0x0150, B:61:0x0136, B:64:0x013f, B:57:0x0123, B:53:0x010e, B:49:0x00f9, B:45:0x00e4, B:41:0x00d3, B:37:0x00be, B:33:0x00a9, B:29:0x0094, B:25:0x0080, B:18:0x005a, B:21:0x0062, B:14:0x0048, B:10:0x0039, B:6:0x0022), top: B:201:0x0008 }] */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x00be A[Catch: NumberFormatException -> 0x03f1, IllegalStateException -> 0x03fc, TryCatch #9 {IllegalStateException -> 0x03fc, NumberFormatException -> 0x03f1, blocks: (B:3:0x0008, B:7:0x0027, B:11:0x003e, B:15:0x0051, B:22:0x006c, B:26:0x0089, B:30:0x009e, B:34:0x00b3, B:38:0x00c8, B:42:0x00d9, B:46:0x00ee, B:50:0x0103, B:54:0x0118, B:58:0x012d, B:65:0x0145, B:69:0x015a, B:73:0x016f, B:75:0x0193, B:77:0x01b7, B:84:0x01e1, B:91:0x020b, B:98:0x0235, B:100:0x0257, B:119:0x02e2, B:123:0x02f0, B:127:0x02fe, B:131:0x030f, B:135:0x0320, B:139:0x0331, B:143:0x033f, B:142:0x033b, B:138:0x032b, B:134:0x031a, B:130:0x0309, B:126:0x02fa, B:122:0x02ec, B:103:0x0260, B:106:0x026f, B:107:0x027c, B:109:0x0282, B:111:0x02ba, B:113:0x02c7, B:114:0x02d0, B:116:0x02d2, B:117:0x02db, B:146:0x036e, B:147:0x0377, B:149:0x0379, B:150:0x0382, B:94:0x0214, B:152:0x0384, B:153:0x038d, B:155:0x038f, B:156:0x0398, B:87:0x01ea, B:158:0x039a, B:159:0x03a3, B:161:0x03a5, B:162:0x03ae, B:80:0x01c0, B:164:0x03b0, B:165:0x03b9, B:167:0x03bb, B:168:0x03c4, B:170:0x03c6, B:171:0x03cf, B:173:0x03d1, B:174:0x03da, B:176:0x03dc, B:177:0x03e5, B:179:0x03e7, B:180:0x03f0, B:72:0x0165, B:68:0x0150, B:61:0x0136, B:64:0x013f, B:57:0x0123, B:53:0x010e, B:49:0x00f9, B:45:0x00e4, B:41:0x00d3, B:37:0x00be, B:33:0x00a9, B:29:0x0094, B:25:0x0080, B:18:0x005a, B:21:0x0062, B:14:0x0048, B:10:0x0039, B:6:0x0022), top: B:201:0x0008 }] */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00d0  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00d3 A[Catch: NumberFormatException -> 0x03f1, IllegalStateException -> 0x03fc, TryCatch #9 {IllegalStateException -> 0x03fc, NumberFormatException -> 0x03f1, blocks: (B:3:0x0008, B:7:0x0027, B:11:0x003e, B:15:0x0051, B:22:0x006c, B:26:0x0089, B:30:0x009e, B:34:0x00b3, B:38:0x00c8, B:42:0x00d9, B:46:0x00ee, B:50:0x0103, B:54:0x0118, B:58:0x012d, B:65:0x0145, B:69:0x015a, B:73:0x016f, B:75:0x0193, B:77:0x01b7, B:84:0x01e1, B:91:0x020b, B:98:0x0235, B:100:0x0257, B:119:0x02e2, B:123:0x02f0, B:127:0x02fe, B:131:0x030f, B:135:0x0320, B:139:0x0331, B:143:0x033f, B:142:0x033b, B:138:0x032b, B:134:0x031a, B:130:0x0309, B:126:0x02fa, B:122:0x02ec, B:103:0x0260, B:106:0x026f, B:107:0x027c, B:109:0x0282, B:111:0x02ba, B:113:0x02c7, B:114:0x02d0, B:116:0x02d2, B:117:0x02db, B:146:0x036e, B:147:0x0377, B:149:0x0379, B:150:0x0382, B:94:0x0214, B:152:0x0384, B:153:0x038d, B:155:0x038f, B:156:0x0398, B:87:0x01ea, B:158:0x039a, B:159:0x03a3, B:161:0x03a5, B:162:0x03ae, B:80:0x01c0, B:164:0x03b0, B:165:0x03b9, B:167:0x03bb, B:168:0x03c4, B:170:0x03c6, B:171:0x03cf, B:173:0x03d1, B:174:0x03da, B:176:0x03dc, B:177:0x03e5, B:179:0x03e7, B:180:0x03f0, B:72:0x0165, B:68:0x0150, B:61:0x0136, B:64:0x013f, B:57:0x0123, B:53:0x010e, B:49:0x00f9, B:45:0x00e4, B:41:0x00d3, B:37:0x00be, B:33:0x00a9, B:29:0x0094, B:25:0x0080, B:18:0x005a, B:21:0x0062, B:14:0x0048, B:10:0x0039, B:6:0x0022), top: B:201:0x0008 }] */
            /* JADX WARN: Removed duplicated region for block: B:44:0x00e1  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x00e4 A[Catch: NumberFormatException -> 0x03f1, IllegalStateException -> 0x03fc, TryCatch #9 {IllegalStateException -> 0x03fc, NumberFormatException -> 0x03f1, blocks: (B:3:0x0008, B:7:0x0027, B:11:0x003e, B:15:0x0051, B:22:0x006c, B:26:0x0089, B:30:0x009e, B:34:0x00b3, B:38:0x00c8, B:42:0x00d9, B:46:0x00ee, B:50:0x0103, B:54:0x0118, B:58:0x012d, B:65:0x0145, B:69:0x015a, B:73:0x016f, B:75:0x0193, B:77:0x01b7, B:84:0x01e1, B:91:0x020b, B:98:0x0235, B:100:0x0257, B:119:0x02e2, B:123:0x02f0, B:127:0x02fe, B:131:0x030f, B:135:0x0320, B:139:0x0331, B:143:0x033f, B:142:0x033b, B:138:0x032b, B:134:0x031a, B:130:0x0309, B:126:0x02fa, B:122:0x02ec, B:103:0x0260, B:106:0x026f, B:107:0x027c, B:109:0x0282, B:111:0x02ba, B:113:0x02c7, B:114:0x02d0, B:116:0x02d2, B:117:0x02db, B:146:0x036e, B:147:0x0377, B:149:0x0379, B:150:0x0382, B:94:0x0214, B:152:0x0384, B:153:0x038d, B:155:0x038f, B:156:0x0398, B:87:0x01ea, B:158:0x039a, B:159:0x03a3, B:161:0x03a5, B:162:0x03ae, B:80:0x01c0, B:164:0x03b0, B:165:0x03b9, B:167:0x03bb, B:168:0x03c4, B:170:0x03c6, B:171:0x03cf, B:173:0x03d1, B:174:0x03da, B:176:0x03dc, B:177:0x03e5, B:179:0x03e7, B:180:0x03f0, B:72:0x0165, B:68:0x0150, B:61:0x0136, B:64:0x013f, B:57:0x0123, B:53:0x010e, B:49:0x00f9, B:45:0x00e4, B:41:0x00d3, B:37:0x00be, B:33:0x00a9, B:29:0x0094, B:25:0x0080, B:18:0x005a, B:21:0x0062, B:14:0x0048, B:10:0x0039, B:6:0x0022), top: B:201:0x0008 }] */
            /* JADX WARN: Removed duplicated region for block: B:48:0x00f6  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x00f9 A[Catch: NumberFormatException -> 0x03f1, IllegalStateException -> 0x03fc, TryCatch #9 {IllegalStateException -> 0x03fc, NumberFormatException -> 0x03f1, blocks: (B:3:0x0008, B:7:0x0027, B:11:0x003e, B:15:0x0051, B:22:0x006c, B:26:0x0089, B:30:0x009e, B:34:0x00b3, B:38:0x00c8, B:42:0x00d9, B:46:0x00ee, B:50:0x0103, B:54:0x0118, B:58:0x012d, B:65:0x0145, B:69:0x015a, B:73:0x016f, B:75:0x0193, B:77:0x01b7, B:84:0x01e1, B:91:0x020b, B:98:0x0235, B:100:0x0257, B:119:0x02e2, B:123:0x02f0, B:127:0x02fe, B:131:0x030f, B:135:0x0320, B:139:0x0331, B:143:0x033f, B:142:0x033b, B:138:0x032b, B:134:0x031a, B:130:0x0309, B:126:0x02fa, B:122:0x02ec, B:103:0x0260, B:106:0x026f, B:107:0x027c, B:109:0x0282, B:111:0x02ba, B:113:0x02c7, B:114:0x02d0, B:116:0x02d2, B:117:0x02db, B:146:0x036e, B:147:0x0377, B:149:0x0379, B:150:0x0382, B:94:0x0214, B:152:0x0384, B:153:0x038d, B:155:0x038f, B:156:0x0398, B:87:0x01ea, B:158:0x039a, B:159:0x03a3, B:161:0x03a5, B:162:0x03ae, B:80:0x01c0, B:164:0x03b0, B:165:0x03b9, B:167:0x03bb, B:168:0x03c4, B:170:0x03c6, B:171:0x03cf, B:173:0x03d1, B:174:0x03da, B:176:0x03dc, B:177:0x03e5, B:179:0x03e7, B:180:0x03f0, B:72:0x0165, B:68:0x0150, B:61:0x0136, B:64:0x013f, B:57:0x0123, B:53:0x010e, B:49:0x00f9, B:45:0x00e4, B:41:0x00d3, B:37:0x00be, B:33:0x00a9, B:29:0x0094, B:25:0x0080, B:18:0x005a, B:21:0x0062, B:14:0x0048, B:10:0x0039, B:6:0x0022), top: B:201:0x0008 }] */
            /* JADX WARN: Removed duplicated region for block: B:52:0x010b  */
            /* JADX WARN: Removed duplicated region for block: B:53:0x010e A[Catch: NumberFormatException -> 0x03f1, IllegalStateException -> 0x03fc, TryCatch #9 {IllegalStateException -> 0x03fc, NumberFormatException -> 0x03f1, blocks: (B:3:0x0008, B:7:0x0027, B:11:0x003e, B:15:0x0051, B:22:0x006c, B:26:0x0089, B:30:0x009e, B:34:0x00b3, B:38:0x00c8, B:42:0x00d9, B:46:0x00ee, B:50:0x0103, B:54:0x0118, B:58:0x012d, B:65:0x0145, B:69:0x015a, B:73:0x016f, B:75:0x0193, B:77:0x01b7, B:84:0x01e1, B:91:0x020b, B:98:0x0235, B:100:0x0257, B:119:0x02e2, B:123:0x02f0, B:127:0x02fe, B:131:0x030f, B:135:0x0320, B:139:0x0331, B:143:0x033f, B:142:0x033b, B:138:0x032b, B:134:0x031a, B:130:0x0309, B:126:0x02fa, B:122:0x02ec, B:103:0x0260, B:106:0x026f, B:107:0x027c, B:109:0x0282, B:111:0x02ba, B:113:0x02c7, B:114:0x02d0, B:116:0x02d2, B:117:0x02db, B:146:0x036e, B:147:0x0377, B:149:0x0379, B:150:0x0382, B:94:0x0214, B:152:0x0384, B:153:0x038d, B:155:0x038f, B:156:0x0398, B:87:0x01ea, B:158:0x039a, B:159:0x03a3, B:161:0x03a5, B:162:0x03ae, B:80:0x01c0, B:164:0x03b0, B:165:0x03b9, B:167:0x03bb, B:168:0x03c4, B:170:0x03c6, B:171:0x03cf, B:173:0x03d1, B:174:0x03da, B:176:0x03dc, B:177:0x03e5, B:179:0x03e7, B:180:0x03f0, B:72:0x0165, B:68:0x0150, B:61:0x0136, B:64:0x013f, B:57:0x0123, B:53:0x010e, B:49:0x00f9, B:45:0x00e4, B:41:0x00d3, B:37:0x00be, B:33:0x00a9, B:29:0x0094, B:25:0x0080, B:18:0x005a, B:21:0x0062, B:14:0x0048, B:10:0x0039, B:6:0x0022), top: B:201:0x0008 }] */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0120  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x0123 A[Catch: NumberFormatException -> 0x03f1, IllegalStateException -> 0x03fc, TryCatch #9 {IllegalStateException -> 0x03fc, NumberFormatException -> 0x03f1, blocks: (B:3:0x0008, B:7:0x0027, B:11:0x003e, B:15:0x0051, B:22:0x006c, B:26:0x0089, B:30:0x009e, B:34:0x00b3, B:38:0x00c8, B:42:0x00d9, B:46:0x00ee, B:50:0x0103, B:54:0x0118, B:58:0x012d, B:65:0x0145, B:69:0x015a, B:73:0x016f, B:75:0x0193, B:77:0x01b7, B:84:0x01e1, B:91:0x020b, B:98:0x0235, B:100:0x0257, B:119:0x02e2, B:123:0x02f0, B:127:0x02fe, B:131:0x030f, B:135:0x0320, B:139:0x0331, B:143:0x033f, B:142:0x033b, B:138:0x032b, B:134:0x031a, B:130:0x0309, B:126:0x02fa, B:122:0x02ec, B:103:0x0260, B:106:0x026f, B:107:0x027c, B:109:0x0282, B:111:0x02ba, B:113:0x02c7, B:114:0x02d0, B:116:0x02d2, B:117:0x02db, B:146:0x036e, B:147:0x0377, B:149:0x0379, B:150:0x0382, B:94:0x0214, B:152:0x0384, B:153:0x038d, B:155:0x038f, B:156:0x0398, B:87:0x01ea, B:158:0x039a, B:159:0x03a3, B:161:0x03a5, B:162:0x03ae, B:80:0x01c0, B:164:0x03b0, B:165:0x03b9, B:167:0x03bb, B:168:0x03c4, B:170:0x03c6, B:171:0x03cf, B:173:0x03d1, B:174:0x03da, B:176:0x03dc, B:177:0x03e5, B:179:0x03e7, B:180:0x03f0, B:72:0x0165, B:68:0x0150, B:61:0x0136, B:64:0x013f, B:57:0x0123, B:53:0x010e, B:49:0x00f9, B:45:0x00e4, B:41:0x00d3, B:37:0x00be, B:33:0x00a9, B:29:0x0094, B:25:0x0080, B:18:0x005a, B:21:0x0062, B:14:0x0048, B:10:0x0039, B:6:0x0022), top: B:201:0x0008 }] */
            /* JADX WARN: Removed duplicated region for block: B:67:0x014d  */
            /* JADX WARN: Removed duplicated region for block: B:68:0x0150 A[Catch: NumberFormatException -> 0x03f1, IllegalStateException -> 0x03fc, TryCatch #9 {IllegalStateException -> 0x03fc, NumberFormatException -> 0x03f1, blocks: (B:3:0x0008, B:7:0x0027, B:11:0x003e, B:15:0x0051, B:22:0x006c, B:26:0x0089, B:30:0x009e, B:34:0x00b3, B:38:0x00c8, B:42:0x00d9, B:46:0x00ee, B:50:0x0103, B:54:0x0118, B:58:0x012d, B:65:0x0145, B:69:0x015a, B:73:0x016f, B:75:0x0193, B:77:0x01b7, B:84:0x01e1, B:91:0x020b, B:98:0x0235, B:100:0x0257, B:119:0x02e2, B:123:0x02f0, B:127:0x02fe, B:131:0x030f, B:135:0x0320, B:139:0x0331, B:143:0x033f, B:142:0x033b, B:138:0x032b, B:134:0x031a, B:130:0x0309, B:126:0x02fa, B:122:0x02ec, B:103:0x0260, B:106:0x026f, B:107:0x027c, B:109:0x0282, B:111:0x02ba, B:113:0x02c7, B:114:0x02d0, B:116:0x02d2, B:117:0x02db, B:146:0x036e, B:147:0x0377, B:149:0x0379, B:150:0x0382, B:94:0x0214, B:152:0x0384, B:153:0x038d, B:155:0x038f, B:156:0x0398, B:87:0x01ea, B:158:0x039a, B:159:0x03a3, B:161:0x03a5, B:162:0x03ae, B:80:0x01c0, B:164:0x03b0, B:165:0x03b9, B:167:0x03bb, B:168:0x03c4, B:170:0x03c6, B:171:0x03cf, B:173:0x03d1, B:174:0x03da, B:176:0x03dc, B:177:0x03e5, B:179:0x03e7, B:180:0x03f0, B:72:0x0165, B:68:0x0150, B:61:0x0136, B:64:0x013f, B:57:0x0123, B:53:0x010e, B:49:0x00f9, B:45:0x00e4, B:41:0x00d3, B:37:0x00be, B:33:0x00a9, B:29:0x0094, B:25:0x0080, B:18:0x005a, B:21:0x0062, B:14:0x0048, B:10:0x0039, B:6:0x0022), top: B:201:0x0008 }] */
            /* JADX WARN: Removed duplicated region for block: B:71:0x0162  */
            /* JADX WARN: Removed duplicated region for block: B:72:0x0165 A[Catch: NumberFormatException -> 0x03f1, IllegalStateException -> 0x03fc, TryCatch #9 {IllegalStateException -> 0x03fc, NumberFormatException -> 0x03f1, blocks: (B:3:0x0008, B:7:0x0027, B:11:0x003e, B:15:0x0051, B:22:0x006c, B:26:0x0089, B:30:0x009e, B:34:0x00b3, B:38:0x00c8, B:42:0x00d9, B:46:0x00ee, B:50:0x0103, B:54:0x0118, B:58:0x012d, B:65:0x0145, B:69:0x015a, B:73:0x016f, B:75:0x0193, B:77:0x01b7, B:84:0x01e1, B:91:0x020b, B:98:0x0235, B:100:0x0257, B:119:0x02e2, B:123:0x02f0, B:127:0x02fe, B:131:0x030f, B:135:0x0320, B:139:0x0331, B:143:0x033f, B:142:0x033b, B:138:0x032b, B:134:0x031a, B:130:0x0309, B:126:0x02fa, B:122:0x02ec, B:103:0x0260, B:106:0x026f, B:107:0x027c, B:109:0x0282, B:111:0x02ba, B:113:0x02c7, B:114:0x02d0, B:116:0x02d2, B:117:0x02db, B:146:0x036e, B:147:0x0377, B:149:0x0379, B:150:0x0382, B:94:0x0214, B:152:0x0384, B:153:0x038d, B:155:0x038f, B:156:0x0398, B:87:0x01ea, B:158:0x039a, B:159:0x03a3, B:161:0x03a5, B:162:0x03ae, B:80:0x01c0, B:164:0x03b0, B:165:0x03b9, B:167:0x03bb, B:168:0x03c4, B:170:0x03c6, B:171:0x03cf, B:173:0x03d1, B:174:0x03da, B:176:0x03dc, B:177:0x03e5, B:179:0x03e7, B:180:0x03f0, B:72:0x0165, B:68:0x0150, B:61:0x0136, B:64:0x013f, B:57:0x0123, B:53:0x010e, B:49:0x00f9, B:45:0x00e4, B:41:0x00d3, B:37:0x00be, B:33:0x00a9, B:29:0x0094, B:25:0x0080, B:18:0x005a, B:21:0x0062, B:14:0x0048, B:10:0x0039, B:6:0x0022), top: B:201:0x0008 }] */
            /* JADX WARN: Removed duplicated region for block: B:79:0x01bf A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:80:0x01c0 A[Catch: NumberFormatException -> 0x03f1, IllegalStateException -> 0x03fc, TRY_LEAVE, TryCatch #9 {IllegalStateException -> 0x03fc, NumberFormatException -> 0x03f1, blocks: (B:3:0x0008, B:7:0x0027, B:11:0x003e, B:15:0x0051, B:22:0x006c, B:26:0x0089, B:30:0x009e, B:34:0x00b3, B:38:0x00c8, B:42:0x00d9, B:46:0x00ee, B:50:0x0103, B:54:0x0118, B:58:0x012d, B:65:0x0145, B:69:0x015a, B:73:0x016f, B:75:0x0193, B:77:0x01b7, B:84:0x01e1, B:91:0x020b, B:98:0x0235, B:100:0x0257, B:119:0x02e2, B:123:0x02f0, B:127:0x02fe, B:131:0x030f, B:135:0x0320, B:139:0x0331, B:143:0x033f, B:142:0x033b, B:138:0x032b, B:134:0x031a, B:130:0x0309, B:126:0x02fa, B:122:0x02ec, B:103:0x0260, B:106:0x026f, B:107:0x027c, B:109:0x0282, B:111:0x02ba, B:113:0x02c7, B:114:0x02d0, B:116:0x02d2, B:117:0x02db, B:146:0x036e, B:147:0x0377, B:149:0x0379, B:150:0x0382, B:94:0x0214, B:152:0x0384, B:153:0x038d, B:155:0x038f, B:156:0x0398, B:87:0x01ea, B:158:0x039a, B:159:0x03a3, B:161:0x03a5, B:162:0x03ae, B:80:0x01c0, B:164:0x03b0, B:165:0x03b9, B:167:0x03bb, B:168:0x03c4, B:170:0x03c6, B:171:0x03cf, B:173:0x03d1, B:174:0x03da, B:176:0x03dc, B:177:0x03e5, B:179:0x03e7, B:180:0x03f0, B:72:0x0165, B:68:0x0150, B:61:0x0136, B:64:0x013f, B:57:0x0123, B:53:0x010e, B:49:0x00f9, B:45:0x00e4, B:41:0x00d3, B:37:0x00be, B:33:0x00a9, B:29:0x0094, B:25:0x0080, B:18:0x005a, B:21:0x0062, B:14:0x0048, B:10:0x0039, B:6:0x0022), top: B:201:0x0008 }] */
            /* JADX WARN: Removed duplicated region for block: B:86:0x01e9 A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:87:0x01ea A[Catch: NumberFormatException -> 0x03f1, IllegalStateException -> 0x03fc, TRY_LEAVE, TryCatch #9 {IllegalStateException -> 0x03fc, NumberFormatException -> 0x03f1, blocks: (B:3:0x0008, B:7:0x0027, B:11:0x003e, B:15:0x0051, B:22:0x006c, B:26:0x0089, B:30:0x009e, B:34:0x00b3, B:38:0x00c8, B:42:0x00d9, B:46:0x00ee, B:50:0x0103, B:54:0x0118, B:58:0x012d, B:65:0x0145, B:69:0x015a, B:73:0x016f, B:75:0x0193, B:77:0x01b7, B:84:0x01e1, B:91:0x020b, B:98:0x0235, B:100:0x0257, B:119:0x02e2, B:123:0x02f0, B:127:0x02fe, B:131:0x030f, B:135:0x0320, B:139:0x0331, B:143:0x033f, B:142:0x033b, B:138:0x032b, B:134:0x031a, B:130:0x0309, B:126:0x02fa, B:122:0x02ec, B:103:0x0260, B:106:0x026f, B:107:0x027c, B:109:0x0282, B:111:0x02ba, B:113:0x02c7, B:114:0x02d0, B:116:0x02d2, B:117:0x02db, B:146:0x036e, B:147:0x0377, B:149:0x0379, B:150:0x0382, B:94:0x0214, B:152:0x0384, B:153:0x038d, B:155:0x038f, B:156:0x0398, B:87:0x01ea, B:158:0x039a, B:159:0x03a3, B:161:0x03a5, B:162:0x03ae, B:80:0x01c0, B:164:0x03b0, B:165:0x03b9, B:167:0x03bb, B:168:0x03c4, B:170:0x03c6, B:171:0x03cf, B:173:0x03d1, B:174:0x03da, B:176:0x03dc, B:177:0x03e5, B:179:0x03e7, B:180:0x03f0, B:72:0x0165, B:68:0x0150, B:61:0x0136, B:64:0x013f, B:57:0x0123, B:53:0x010e, B:49:0x00f9, B:45:0x00e4, B:41:0x00d3, B:37:0x00be, B:33:0x00a9, B:29:0x0094, B:25:0x0080, B:18:0x005a, B:21:0x0062, B:14:0x0048, B:10:0x0039, B:6:0x0022), top: B:201:0x0008 }] */
            /* JADX WARN: Removed duplicated region for block: B:93:0x0213 A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:94:0x0214 A[Catch: NumberFormatException -> 0x03f1, IllegalStateException -> 0x03fc, TRY_LEAVE, TryCatch #9 {IllegalStateException -> 0x03fc, NumberFormatException -> 0x03f1, blocks: (B:3:0x0008, B:7:0x0027, B:11:0x003e, B:15:0x0051, B:22:0x006c, B:26:0x0089, B:30:0x009e, B:34:0x00b3, B:38:0x00c8, B:42:0x00d9, B:46:0x00ee, B:50:0x0103, B:54:0x0118, B:58:0x012d, B:65:0x0145, B:69:0x015a, B:73:0x016f, B:75:0x0193, B:77:0x01b7, B:84:0x01e1, B:91:0x020b, B:98:0x0235, B:100:0x0257, B:119:0x02e2, B:123:0x02f0, B:127:0x02fe, B:131:0x030f, B:135:0x0320, B:139:0x0331, B:143:0x033f, B:142:0x033b, B:138:0x032b, B:134:0x031a, B:130:0x0309, B:126:0x02fa, B:122:0x02ec, B:103:0x0260, B:106:0x026f, B:107:0x027c, B:109:0x0282, B:111:0x02ba, B:113:0x02c7, B:114:0x02d0, B:116:0x02d2, B:117:0x02db, B:146:0x036e, B:147:0x0377, B:149:0x0379, B:150:0x0382, B:94:0x0214, B:152:0x0384, B:153:0x038d, B:155:0x038f, B:156:0x0398, B:87:0x01ea, B:158:0x039a, B:159:0x03a3, B:161:0x03a5, B:162:0x03ae, B:80:0x01c0, B:164:0x03b0, B:165:0x03b9, B:167:0x03bb, B:168:0x03c4, B:170:0x03c6, B:171:0x03cf, B:173:0x03d1, B:174:0x03da, B:176:0x03dc, B:177:0x03e5, B:179:0x03e7, B:180:0x03f0, B:72:0x0165, B:68:0x0150, B:61:0x0136, B:64:0x013f, B:57:0x0123, B:53:0x010e, B:49:0x00f9, B:45:0x00e4, B:41:0x00d3, B:37:0x00be, B:33:0x00a9, B:29:0x0094, B:25:0x0080, B:18:0x005a, B:21:0x0062, B:14:0x0048, B:10:0x0039, B:6:0x0022), top: B:201:0x0008 }] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static com.amazon.aps.iva.fr.e.a0 a(java.lang.String r41) throws com.google.gson.JsonParseException {
                /*
                    Method dump skipped, instructions count: 1031
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.fr.e.a0.a.a(java.lang.String):com.amazon.aps.iva.fr.e$a0");
            }
        }

        public a0(String str, String str2, String str3, String str4, Long l, r rVar, long j, Long l2, Long l3, Long l4, Long l5, Number number, Long l6, Long l7, Long l8, Long l9, i iVar, Boolean bool, Boolean bool2, a aVar, n nVar, h hVar, s sVar, o oVar, v vVar, List<p> list, Number number2, Number number3, Number number4, Number number5, Number number6, Number number7) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = l;
            this.f = rVar;
            this.g = j;
            this.h = l2;
            this.i = l3;
            this.j = l4;
            this.k = l5;
            this.l = number;
            this.m = l6;
            this.n = l7;
            this.o = l8;
            this.p = l9;
            this.q = iVar;
            this.r = bool;
            this.s = bool2;
            this.t = aVar;
            this.u = nVar;
            this.v = hVar;
            this.w = sVar;
            this.x = oVar;
            this.y = vVar;
            this.z = list;
            this.A = number2;
            this.B = number3;
            this.C = number4;
            this.D = number5;
            this.E = number6;
            this.F = number7;
        }

        public static a0 a(a0 a0Var, i iVar, Boolean bool, h hVar, int i) {
            String str;
            String str2;
            String str3;
            String str4;
            Long l;
            r rVar;
            long j;
            Long l2;
            Long l3;
            Long l4;
            Long l5;
            Number number;
            Long l6;
            Long l7;
            Long l8;
            Long l9;
            i iVar2;
            Boolean bool2;
            Boolean bool3;
            a aVar;
            n nVar;
            h hVar2;
            s sVar;
            o oVar;
            v vVar;
            Long l10;
            List<p> list;
            Number number2;
            Number number3;
            Number number4;
            Number number5;
            Number number6;
            Number number7;
            if ((i & 1) != 0) {
                str = a0Var.a;
            } else {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = a0Var.b;
            } else {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = a0Var.c;
            } else {
                str3 = null;
            }
            if ((i & 8) != 0) {
                str4 = a0Var.d;
            } else {
                str4 = null;
            }
            if ((i & 16) != 0) {
                l = a0Var.e;
            } else {
                l = null;
            }
            if ((i & 32) != 0) {
                rVar = a0Var.f;
            } else {
                rVar = null;
            }
            if ((i & 64) != 0) {
                j = a0Var.g;
            } else {
                j = 0;
            }
            if ((i & 128) != 0) {
                l2 = a0Var.h;
            } else {
                l2 = null;
            }
            if ((i & 256) != 0) {
                l3 = a0Var.i;
            } else {
                l3 = null;
            }
            if ((i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
                l4 = a0Var.j;
            } else {
                l4 = null;
            }
            if ((i & 1024) != 0) {
                l5 = a0Var.k;
            } else {
                l5 = null;
            }
            if ((i & 2048) != 0) {
                number = a0Var.l;
            } else {
                number = null;
            }
            if ((i & 4096) != 0) {
                l6 = a0Var.m;
            } else {
                l6 = null;
            }
            if ((i & 8192) != 0) {
                l7 = a0Var.n;
            } else {
                l7 = null;
            }
            if ((i & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                l8 = a0Var.o;
            } else {
                l8 = null;
            }
            if ((32768 & i) != 0) {
                l9 = a0Var.p;
            } else {
                l9 = null;
            }
            if ((65536 & i) != 0) {
                iVar2 = a0Var.q;
            } else {
                iVar2 = iVar;
            }
            if ((131072 & i) != 0) {
                bool2 = a0Var.r;
            } else {
                bool2 = bool;
            }
            if ((262144 & i) != 0) {
                bool3 = a0Var.s;
            } else {
                bool3 = null;
            }
            if ((524288 & i) != 0) {
                aVar = a0Var.t;
            } else {
                aVar = null;
            }
            if ((1048576 & i) != 0) {
                nVar = a0Var.u;
            } else {
                nVar = null;
            }
            if ((i & 2097152) != 0) {
                hVar2 = a0Var.v;
            } else {
                hVar2 = hVar;
            }
            if ((4194304 & i) != 0) {
                sVar = a0Var.w;
            } else {
                sVar = null;
            }
            if ((8388608 & i) != 0) {
                oVar = a0Var.x;
            } else {
                oVar = null;
            }
            if ((16777216 & i) != 0) {
                vVar = a0Var.y;
            } else {
                vVar = null;
            }
            if ((i & 33554432) != 0) {
                l10 = l4;
                list = a0Var.z;
            } else {
                l10 = l4;
                list = null;
            }
            if ((67108864 & i) != 0) {
                number2 = a0Var.A;
            } else {
                number2 = null;
            }
            if ((134217728 & i) != 0) {
                number3 = a0Var.B;
            } else {
                number3 = null;
            }
            if ((268435456 & i) != 0) {
                number4 = a0Var.C;
            } else {
                number4 = null;
            }
            if ((536870912 & i) != 0) {
                number5 = a0Var.D;
            } else {
                number5 = null;
            }
            if ((1073741824 & i) != 0) {
                number6 = a0Var.E;
            } else {
                number6 = null;
            }
            if ((i & Integer.MIN_VALUE) != 0) {
                number7 = a0Var.F;
            } else {
                number7 = null;
            }
            a0Var.getClass();
            com.amazon.aps.iva.yb0.j.f(str, "id");
            com.amazon.aps.iva.yb0.j.f(str3, ImagesContract.URL);
            com.amazon.aps.iva.yb0.j.f(aVar, "action");
            com.amazon.aps.iva.yb0.j.f(nVar, "error");
            com.amazon.aps.iva.yb0.j.f(vVar, "resource");
            return new a0(str, str2, str3, str4, l, rVar, j, l2, l3, l10, l5, number, l6, l7, l8, l9, iVar2, bool2, bool3, aVar, nVar, hVar2, sVar, oVar, vVar, list, number2, number3, number4, number5, number6, number7);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a0)) {
                return false;
            }
            a0 a0Var = (a0) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, a0Var.a) && com.amazon.aps.iva.yb0.j.a(this.b, a0Var.b) && com.amazon.aps.iva.yb0.j.a(this.c, a0Var.c) && com.amazon.aps.iva.yb0.j.a(this.d, a0Var.d) && com.amazon.aps.iva.yb0.j.a(this.e, a0Var.e) && this.f == a0Var.f && this.g == a0Var.g && com.amazon.aps.iva.yb0.j.a(this.h, a0Var.h) && com.amazon.aps.iva.yb0.j.a(this.i, a0Var.i) && com.amazon.aps.iva.yb0.j.a(this.j, a0Var.j) && com.amazon.aps.iva.yb0.j.a(this.k, a0Var.k) && com.amazon.aps.iva.yb0.j.a(this.l, a0Var.l) && com.amazon.aps.iva.yb0.j.a(this.m, a0Var.m) && com.amazon.aps.iva.yb0.j.a(this.n, a0Var.n) && com.amazon.aps.iva.yb0.j.a(this.o, a0Var.o) && com.amazon.aps.iva.yb0.j.a(this.p, a0Var.p) && com.amazon.aps.iva.yb0.j.a(this.q, a0Var.q) && com.amazon.aps.iva.yb0.j.a(this.r, a0Var.r) && com.amazon.aps.iva.yb0.j.a(this.s, a0Var.s) && com.amazon.aps.iva.yb0.j.a(this.t, a0Var.t) && com.amazon.aps.iva.yb0.j.a(this.u, a0Var.u) && com.amazon.aps.iva.yb0.j.a(this.v, a0Var.v) && com.amazon.aps.iva.yb0.j.a(this.w, a0Var.w) && com.amazon.aps.iva.yb0.j.a(this.x, a0Var.x) && com.amazon.aps.iva.yb0.j.a(this.y, a0Var.y) && com.amazon.aps.iva.yb0.j.a(this.z, a0Var.z) && com.amazon.aps.iva.yb0.j.a(this.A, a0Var.A) && com.amazon.aps.iva.yb0.j.a(this.B, a0Var.B) && com.amazon.aps.iva.yb0.j.a(this.C, a0Var.C) && com.amazon.aps.iva.yb0.j.a(this.D, a0Var.D) && com.amazon.aps.iva.yb0.j.a(this.E, a0Var.E) && com.amazon.aps.iva.yb0.j.a(this.F, a0Var.F)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5;
            int hashCode6;
            int hashCode7;
            int hashCode8;
            int hashCode9;
            int hashCode10;
            int hashCode11;
            int hashCode12;
            int hashCode13;
            int hashCode14;
            int hashCode15;
            int hashCode16;
            int hashCode17;
            int hashCode18;
            int hashCode19;
            int hashCode20;
            int hashCode21;
            int hashCode22;
            int hashCode23;
            int hashCode24;
            int hashCode25;
            int hashCode26 = this.a.hashCode() * 31;
            int i = 0;
            String str = this.b;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int b = com.amazon.aps.iva.c80.a.b(this.c, (hashCode26 + hashCode) * 31, 31);
            String str2 = this.d;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i2 = (b + hashCode2) * 31;
            Long l = this.e;
            if (l == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = l.hashCode();
            }
            int i3 = (i2 + hashCode3) * 31;
            r rVar = this.f;
            if (rVar == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = rVar.hashCode();
            }
            int a2 = com.amazon.aps.iva.b8.i.a(this.g, (i3 + hashCode4) * 31, 31);
            Long l2 = this.h;
            if (l2 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = l2.hashCode();
            }
            int i4 = (a2 + hashCode5) * 31;
            Long l3 = this.i;
            if (l3 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = l3.hashCode();
            }
            int i5 = (i4 + hashCode6) * 31;
            Long l4 = this.j;
            if (l4 == null) {
                hashCode7 = 0;
            } else {
                hashCode7 = l4.hashCode();
            }
            int i6 = (i5 + hashCode7) * 31;
            Long l5 = this.k;
            if (l5 == null) {
                hashCode8 = 0;
            } else {
                hashCode8 = l5.hashCode();
            }
            int i7 = (i6 + hashCode8) * 31;
            Number number = this.l;
            if (number == null) {
                hashCode9 = 0;
            } else {
                hashCode9 = number.hashCode();
            }
            int i8 = (i7 + hashCode9) * 31;
            Long l6 = this.m;
            if (l6 == null) {
                hashCode10 = 0;
            } else {
                hashCode10 = l6.hashCode();
            }
            int i9 = (i8 + hashCode10) * 31;
            Long l7 = this.n;
            if (l7 == null) {
                hashCode11 = 0;
            } else {
                hashCode11 = l7.hashCode();
            }
            int i10 = (i9 + hashCode11) * 31;
            Long l8 = this.o;
            if (l8 == null) {
                hashCode12 = 0;
            } else {
                hashCode12 = l8.hashCode();
            }
            int i11 = (i10 + hashCode12) * 31;
            Long l9 = this.p;
            if (l9 == null) {
                hashCode13 = 0;
            } else {
                hashCode13 = l9.hashCode();
            }
            int i12 = (i11 + hashCode13) * 31;
            i iVar = this.q;
            if (iVar == null) {
                hashCode14 = 0;
            } else {
                hashCode14 = iVar.hashCode();
            }
            int i13 = (i12 + hashCode14) * 31;
            Boolean bool = this.r;
            if (bool == null) {
                hashCode15 = 0;
            } else {
                hashCode15 = bool.hashCode();
            }
            int i14 = (i13 + hashCode15) * 31;
            Boolean bool2 = this.s;
            if (bool2 == null) {
                hashCode16 = 0;
            } else {
                hashCode16 = bool2.hashCode();
            }
            int hashCode27 = (this.u.hashCode() + ((this.t.hashCode() + ((i14 + hashCode16) * 31)) * 31)) * 31;
            h hVar = this.v;
            if (hVar == null) {
                hashCode17 = 0;
            } else {
                hashCode17 = hVar.hashCode();
            }
            int i15 = (hashCode27 + hashCode17) * 31;
            s sVar = this.w;
            if (sVar == null) {
                hashCode18 = 0;
            } else {
                hashCode18 = sVar.hashCode();
            }
            int i16 = (i15 + hashCode18) * 31;
            o oVar = this.x;
            if (oVar == null) {
                hashCode19 = 0;
            } else {
                hashCode19 = oVar.hashCode();
            }
            int hashCode28 = (this.y.hashCode() + ((i16 + hashCode19) * 31)) * 31;
            List<p> list = this.z;
            if (list == null) {
                hashCode20 = 0;
            } else {
                hashCode20 = list.hashCode();
            }
            int i17 = (hashCode28 + hashCode20) * 31;
            Number number2 = this.A;
            if (number2 == null) {
                hashCode21 = 0;
            } else {
                hashCode21 = number2.hashCode();
            }
            int i18 = (i17 + hashCode21) * 31;
            Number number3 = this.B;
            if (number3 == null) {
                hashCode22 = 0;
            } else {
                hashCode22 = number3.hashCode();
            }
            int i19 = (i18 + hashCode22) * 31;
            Number number4 = this.C;
            if (number4 == null) {
                hashCode23 = 0;
            } else {
                hashCode23 = number4.hashCode();
            }
            int i20 = (i19 + hashCode23) * 31;
            Number number5 = this.D;
            if (number5 == null) {
                hashCode24 = 0;
            } else {
                hashCode24 = number5.hashCode();
            }
            int i21 = (i20 + hashCode24) * 31;
            Number number6 = this.E;
            if (number6 == null) {
                hashCode25 = 0;
            } else {
                hashCode25 = number6.hashCode();
            }
            int i22 = (i21 + hashCode25) * 31;
            Number number7 = this.F;
            if (number7 != null) {
                i = number7.hashCode();
            }
            return i22 + i;
        }

        public final String toString() {
            return "View(id=" + this.a + ", referrer=" + this.b + ", url=" + this.c + ", name=" + this.d + ", loadingTime=" + this.e + ", loadingType=" + this.f + ", timeSpent=" + this.g + ", firstContentfulPaint=" + this.h + ", largestContentfulPaint=" + this.i + ", firstInputDelay=" + this.j + ", firstInputTime=" + this.k + ", cumulativeLayoutShift=" + this.l + ", domComplete=" + this.m + ", domContentLoaded=" + this.n + ", domInteractive=" + this.o + ", loadEvent=" + this.p + ", customTimings=" + this.q + ", isActive=" + this.r + ", isSlowRendered=" + this.s + ", action=" + this.t + ", error=" + this.u + ", crash=" + this.v + ", longTask=" + this.w + ", frozenFrame=" + this.x + ", resource=" + this.y + ", inForegroundPeriods=" + this.z + ", memoryAverage=" + this.A + ", memoryMax=" + this.B + ", cpuTicksCount=" + this.C + ", cpuTicksPerSecond=" + this.D + ", refreshRateAverage=" + this.E + ", refreshRateMin=" + this.F + ")";
        }
    }

    /* compiled from: ViewEvent.kt */
    /* loaded from: classes2.dex */
    public static final class b {
        public final String a;

        public b(String str) {
            com.amazon.aps.iva.yb0.j.f(str, "id");
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && com.amazon.aps.iva.yb0.j.a(this.a, ((b) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return defpackage.b.c(new StringBuilder("Application(id="), this.a, ")");
        }
    }

    /* compiled from: ViewEvent.kt */
    /* loaded from: classes2.dex */
    public static final class b0 {
        public final String a;
        public final c0 b;
        public final Boolean c;

        /* compiled from: ViewEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static b0 a(String str) throws JsonParseException {
                Boolean valueOf;
                try {
                    JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
                    String asString = asJsonObject.get("id").getAsString();
                    String asString2 = asJsonObject.get("type").getAsString();
                    c0.a aVar = c0.Companion;
                    com.amazon.aps.iva.yb0.j.e(asString2, "it");
                    aVar.getClass();
                    c0 a = c0.a.a(asString2);
                    JsonElement jsonElement = asJsonObject.get("has_replay");
                    if (jsonElement == null) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(jsonElement.getAsBoolean());
                    }
                    com.amazon.aps.iva.yb0.j.e(asString, "id");
                    return new b0(asString, a, valueOf);
                } catch (IllegalStateException e) {
                    throw new JsonParseException(e.getMessage());
                } catch (NumberFormatException e2) {
                    throw new JsonParseException(e2.getMessage());
                }
            }
        }

        public b0(String str, c0 c0Var, Boolean bool) {
            com.amazon.aps.iva.yb0.j.f(str, "id");
            com.amazon.aps.iva.yb0.j.f(c0Var, "type");
            this.a = str;
            this.b = c0Var;
            this.c = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b0)) {
                return false;
            }
            b0 b0Var = (b0) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, b0Var.a) && this.b == b0Var.b && com.amazon.aps.iva.yb0.j.a(this.c, b0Var.c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2 = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
            Boolean bool = this.c;
            if (bool == null) {
                hashCode = 0;
            } else {
                hashCode = bool.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public final String toString() {
            return "ViewEventSession(id=" + this.a + ", type=" + this.b + ", hasReplay=" + this.c + ")";
        }
    }

    /* compiled from: ViewEvent.kt */
    /* loaded from: classes2.dex */
    public static final class c {
        public final String a;
        public final String b;

        /* compiled from: ViewEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static c a(String str) throws JsonParseException {
                String asString;
                try {
                    JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
                    JsonElement jsonElement = asJsonObject.get("technology");
                    String str2 = null;
                    if (jsonElement == null) {
                        asString = null;
                    } else {
                        asString = jsonElement.getAsString();
                    }
                    JsonElement jsonElement2 = asJsonObject.get("carrier_name");
                    if (jsonElement2 != null) {
                        str2 = jsonElement2.getAsString();
                    }
                    return new c(asString, str2);
                } catch (IllegalStateException e) {
                    throw new JsonParseException(e.getMessage());
                } catch (NumberFormatException e2) {
                    throw new JsonParseException(e2.getMessage());
                }
            }
        }

        public c() {
            this(null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, cVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, cVar.b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int i = 0;
            String str = this.a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = hashCode * 31;
            String str2 = this.b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return i2 + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Cellular(technology=");
            sb.append(this.a);
            sb.append(", carrierName=");
            return defpackage.b.c(sb, this.b, ")");
        }

        public c(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    /* compiled from: ViewEvent.kt */
    /* loaded from: classes2.dex */
    public enum c0 {
        USER("user"),
        SYNTHETICS("synthetics"),
        CI_TEST("ci_test");
        
        public static final a Companion = new a();
        private final String jsonValue;

        /* compiled from: ViewEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static c0 a(String str) {
                com.amazon.aps.iva.yb0.j.f(str, "serializedObject");
                c0[] values = c0.values();
                int length = values.length;
                int i = 0;
                while (i < length) {
                    c0 c0Var = values[i];
                    i++;
                    if (com.amazon.aps.iva.yb0.j.a(c0Var.jsonValue, str)) {
                        return c0Var;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        c0(String str) {
            this.jsonValue = str;
        }

        public static final c0 fromJson(String str) {
            Companion.getClass();
            return a.a(str);
        }

        public final JsonElement toJson() {
            return new JsonPrimitive(this.jsonValue);
        }
    }

    /* compiled from: ViewEvent.kt */
    /* loaded from: classes2.dex */
    public static final class d {
        public final String a;

        public d(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && com.amazon.aps.iva.yb0.j.a(this.a, ((d) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return defpackage.b.c(new StringBuilder("CiTest(testExecutionId="), this.a, ")");
        }
    }

    /* compiled from: ViewEvent.kt */
    /* renamed from: com.amazon.aps.iva.fr.e$e  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0279e {
        /* JADX WARN: Removed duplicated region for block: B:25:0x00a6 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00a7 A[Catch: NumberFormatException -> 0x0181, IllegalStateException -> 0x018c, TryCatch #5 {IllegalStateException -> 0x018c, NumberFormatException -> 0x0181, blocks: (B:3:0x0002, B:5:0x003b, B:9:0x004b, B:16:0x0077, B:23:0x009e, B:30:0x00b4, B:37:0x00ca, B:44:0x00f7, B:51:0x010d, B:58:0x0125, B:65:0x014e, B:61:0x013f, B:64:0x0148, B:54:0x0116, B:57:0x011f, B:47:0x0100, B:50:0x0108, B:40:0x00d3, B:68:0x0156, B:69:0x015f, B:71:0x0161, B:72:0x016a, B:33:0x00bd, B:36:0x00c5, B:26:0x00a7, B:29:0x00af, B:19:0x0091, B:22:0x0099, B:12:0x0065, B:15:0x006d, B:8:0x0046, B:74:0x016c, B:75:0x0175, B:77:0x0177, B:78:0x0180, B:43:0x00db, B:4:0x0023), top: B:87:0x0002, inners: #6, #4 }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00bc A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00bd A[Catch: NumberFormatException -> 0x0181, IllegalStateException -> 0x018c, TryCatch #5 {IllegalStateException -> 0x018c, NumberFormatException -> 0x0181, blocks: (B:3:0x0002, B:5:0x003b, B:9:0x004b, B:16:0x0077, B:23:0x009e, B:30:0x00b4, B:37:0x00ca, B:44:0x00f7, B:51:0x010d, B:58:0x0125, B:65:0x014e, B:61:0x013f, B:64:0x0148, B:54:0x0116, B:57:0x011f, B:47:0x0100, B:50:0x0108, B:40:0x00d3, B:68:0x0156, B:69:0x015f, B:71:0x0161, B:72:0x016a, B:33:0x00bd, B:36:0x00c5, B:26:0x00a7, B:29:0x00af, B:19:0x0091, B:22:0x0099, B:12:0x0065, B:15:0x006d, B:8:0x0046, B:74:0x016c, B:75:0x0175, B:77:0x0177, B:78:0x0180, B:43:0x00db, B:4:0x0023), top: B:87:0x0002, inners: #6, #4 }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00d2 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00d3 A[Catch: NumberFormatException -> 0x0181, IllegalStateException -> 0x018c, TRY_LEAVE, TryCatch #5 {IllegalStateException -> 0x018c, NumberFormatException -> 0x0181, blocks: (B:3:0x0002, B:5:0x003b, B:9:0x004b, B:16:0x0077, B:23:0x009e, B:30:0x00b4, B:37:0x00ca, B:44:0x00f7, B:51:0x010d, B:58:0x0125, B:65:0x014e, B:61:0x013f, B:64:0x0148, B:54:0x0116, B:57:0x011f, B:47:0x0100, B:50:0x0108, B:40:0x00d3, B:68:0x0156, B:69:0x015f, B:71:0x0161, B:72:0x016a, B:33:0x00bd, B:36:0x00c5, B:26:0x00a7, B:29:0x00af, B:19:0x0091, B:22:0x0099, B:12:0x0065, B:15:0x006d, B:8:0x0046, B:74:0x016c, B:75:0x0175, B:77:0x0177, B:78:0x0180, B:43:0x00db, B:4:0x0023), top: B:87:0x0002, inners: #6, #4 }] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00ff A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0100 A[Catch: NumberFormatException -> 0x0181, IllegalStateException -> 0x018c, TryCatch #5 {IllegalStateException -> 0x018c, NumberFormatException -> 0x0181, blocks: (B:3:0x0002, B:5:0x003b, B:9:0x004b, B:16:0x0077, B:23:0x009e, B:30:0x00b4, B:37:0x00ca, B:44:0x00f7, B:51:0x010d, B:58:0x0125, B:65:0x014e, B:61:0x013f, B:64:0x0148, B:54:0x0116, B:57:0x011f, B:47:0x0100, B:50:0x0108, B:40:0x00d3, B:68:0x0156, B:69:0x015f, B:71:0x0161, B:72:0x016a, B:33:0x00bd, B:36:0x00c5, B:26:0x00a7, B:29:0x00af, B:19:0x0091, B:22:0x0099, B:12:0x0065, B:15:0x006d, B:8:0x0046, B:74:0x016c, B:75:0x0175, B:77:0x0177, B:78:0x0180, B:43:0x00db, B:4:0x0023), top: B:87:0x0002, inners: #6, #4 }] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0115 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0116 A[Catch: NumberFormatException -> 0x0181, IllegalStateException -> 0x018c, TryCatch #5 {IllegalStateException -> 0x018c, NumberFormatException -> 0x0181, blocks: (B:3:0x0002, B:5:0x003b, B:9:0x004b, B:16:0x0077, B:23:0x009e, B:30:0x00b4, B:37:0x00ca, B:44:0x00f7, B:51:0x010d, B:58:0x0125, B:65:0x014e, B:61:0x013f, B:64:0x0148, B:54:0x0116, B:57:0x011f, B:47:0x0100, B:50:0x0108, B:40:0x00d3, B:68:0x0156, B:69:0x015f, B:71:0x0161, B:72:0x016a, B:33:0x00bd, B:36:0x00c5, B:26:0x00a7, B:29:0x00af, B:19:0x0091, B:22:0x0099, B:12:0x0065, B:15:0x006d, B:8:0x0046, B:74:0x016c, B:75:0x0175, B:77:0x0177, B:78:0x0180, B:43:0x00db, B:4:0x0023), top: B:87:0x0002, inners: #6, #4 }] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x013e A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x013f A[Catch: NumberFormatException -> 0x0181, IllegalStateException -> 0x018c, TryCatch #5 {IllegalStateException -> 0x018c, NumberFormatException -> 0x0181, blocks: (B:3:0x0002, B:5:0x003b, B:9:0x004b, B:16:0x0077, B:23:0x009e, B:30:0x00b4, B:37:0x00ca, B:44:0x00f7, B:51:0x010d, B:58:0x0125, B:65:0x014e, B:61:0x013f, B:64:0x0148, B:54:0x0116, B:57:0x011f, B:47:0x0100, B:50:0x0108, B:40:0x00d3, B:68:0x0156, B:69:0x015f, B:71:0x0161, B:72:0x016a, B:33:0x00bd, B:36:0x00c5, B:26:0x00a7, B:29:0x00af, B:19:0x0091, B:22:0x0099, B:12:0x0065, B:15:0x006d, B:8:0x0046, B:74:0x016c, B:75:0x0175, B:77:0x0177, B:78:0x0180, B:43:0x00db, B:4:0x0023), top: B:87:0x0002, inners: #6, #4 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static com.amazon.aps.iva.fr.e a(java.lang.String r19) throws com.google.gson.JsonParseException {
            /*
                Method dump skipped, instructions count: 407
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.fr.e.C0279e.a(java.lang.String):com.amazon.aps.iva.fr.e");
        }
    }

    /* compiled from: ViewEvent.kt */
    /* loaded from: classes2.dex */
    public static final class f {
        public final x a;
        public final List<q> b;
        public final c c;

        /* compiled from: ViewEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static f a(String str) throws JsonParseException {
                String jsonElement;
                c a;
                try {
                    JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
                    String asString = asJsonObject.get("status").getAsString();
                    x.a aVar = x.Companion;
                    com.amazon.aps.iva.yb0.j.e(asString, "it");
                    aVar.getClass();
                    x a2 = x.a.a(asString);
                    JsonArray<JsonElement> asJsonArray = asJsonObject.get("interfaces").getAsJsonArray();
                    ArrayList arrayList = new ArrayList(asJsonArray.size());
                    for (JsonElement jsonElement2 : asJsonArray) {
                        q.a aVar2 = q.Companion;
                        String asString2 = jsonElement2.getAsString();
                        com.amazon.aps.iva.yb0.j.e(asString2, "it.asString");
                        aVar2.getClass();
                        arrayList.add(q.a.a(asString2));
                    }
                    JsonElement jsonElement3 = asJsonObject.get("cellular");
                    if (jsonElement3 != null && (jsonElement = jsonElement3.toString()) != null) {
                        a = c.a.a(jsonElement);
                        return new f(a2, arrayList, a);
                    }
                    a = null;
                    return new f(a2, arrayList, a);
                } catch (IllegalStateException e) {
                    throw new JsonParseException(e.getMessage());
                } catch (NumberFormatException e2) {
                    throw new JsonParseException(e2.getMessage());
                }
            }
        }

        public f(x xVar, ArrayList arrayList, c cVar) {
            com.amazon.aps.iva.yb0.j.f(xVar, "status");
            this.a = xVar;
            this.b = arrayList;
            this.c = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (this.a == fVar.a && com.amazon.aps.iva.yb0.j.a(this.b, fVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, fVar.c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int a2 = defpackage.a.a(this.b, this.a.hashCode() * 31, 31);
            c cVar = this.c;
            if (cVar == null) {
                hashCode = 0;
            } else {
                hashCode = cVar.hashCode();
            }
            return a2 + hashCode;
        }

        public final String toString() {
            return "Connectivity(status=" + this.a + ", interfaces=" + this.b + ", cellular=" + this.c + ")";
        }
    }

    /* compiled from: ViewEvent.kt */
    /* loaded from: classes2.dex */
    public static final class h {
        public final long a;

        public h(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof h) && this.a == ((h) obj).a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return com.amazon.aps.iva.c.b.b(new StringBuilder("Crash(count="), this.a, ")");
        }
    }

    /* compiled from: ViewEvent.kt */
    /* loaded from: classes2.dex */
    public static final class j {
        public final k a;
        public final String b;
        public final long c;
        public final long d = 2;

        /* compiled from: ViewEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
            /* JADX WARN: Removed duplicated region for block: B:12:0x0048 A[Catch: NumberFormatException -> 0x0072, IllegalStateException -> 0x007d, TryCatch #4 {IllegalStateException -> 0x007d, NumberFormatException -> 0x0072, blocks: (B:2:0x0000, B:9:0x003f, B:13:0x004c, B:12:0x0048, B:5:0x0012, B:16:0x005d, B:17:0x0066, B:19:0x0068, B:20:0x0071, B:8:0x001a), top: B:27:0x0000, inners: #3 }] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static com.amazon.aps.iva.fr.e.j a(java.lang.String r5) throws com.google.gson.JsonParseException {
                /*
                    com.google.gson.JsonElement r5 = com.google.gson.JsonParser.parseString(r5)     // Catch: java.lang.NumberFormatException -> L72 java.lang.IllegalStateException -> L7d
                    com.google.gson.JsonObject r5 = r5.getAsJsonObject()     // Catch: java.lang.NumberFormatException -> L72 java.lang.IllegalStateException -> L7d
                    java.lang.String r0 = "session"
                    com.google.gson.JsonElement r0 = r5.get(r0)     // Catch: java.lang.NumberFormatException -> L72 java.lang.IllegalStateException -> L7d
                    r1 = 0
                    if (r0 != 0) goto L12
                    goto L18
                L12:
                    java.lang.String r0 = r0.toString()     // Catch: java.lang.NumberFormatException -> L72 java.lang.IllegalStateException -> L7d
                    if (r0 != 0) goto L1a
                L18:
                    r2 = r1
                    goto L3f
                L1a:
                    com.google.gson.JsonElement r0 = com.google.gson.JsonParser.parseString(r0)     // Catch: java.lang.NumberFormatException -> L5c java.lang.IllegalStateException -> L67
                    com.google.gson.JsonObject r0 = r0.getAsJsonObject()     // Catch: java.lang.NumberFormatException -> L5c java.lang.IllegalStateException -> L67
                    java.lang.String r2 = "plan"
                    com.google.gson.JsonElement r0 = r0.get(r2)     // Catch: java.lang.NumberFormatException -> L5c java.lang.IllegalStateException -> L67
                    java.lang.String r0 = r0.getAsString()     // Catch: java.lang.NumberFormatException -> L5c java.lang.IllegalStateException -> L67
                    com.amazon.aps.iva.fr.e$u$a r2 = com.amazon.aps.iva.fr.e.u.Companion     // Catch: java.lang.NumberFormatException -> L5c java.lang.IllegalStateException -> L67
                    java.lang.String r3 = "it"
                    com.amazon.aps.iva.yb0.j.e(r0, r3)     // Catch: java.lang.NumberFormatException -> L5c java.lang.IllegalStateException -> L67
                    r2.getClass()     // Catch: java.lang.NumberFormatException -> L5c java.lang.IllegalStateException -> L67
                    com.amazon.aps.iva.fr.e$u r0 = com.amazon.aps.iva.fr.e.u.a.a(r0)     // Catch: java.lang.NumberFormatException -> L5c java.lang.IllegalStateException -> L67
                    com.amazon.aps.iva.fr.e$k r2 = new com.amazon.aps.iva.fr.e$k     // Catch: java.lang.NumberFormatException -> L5c java.lang.IllegalStateException -> L67
                    r2.<init>(r0)     // Catch: java.lang.NumberFormatException -> L5c java.lang.IllegalStateException -> L67
                L3f:
                    java.lang.String r0 = "browser_sdk_version"
                    com.google.gson.JsonElement r0 = r5.get(r0)     // Catch: java.lang.NumberFormatException -> L72 java.lang.IllegalStateException -> L7d
                    if (r0 != 0) goto L48
                    goto L4c
                L48:
                    java.lang.String r1 = r0.getAsString()     // Catch: java.lang.NumberFormatException -> L72 java.lang.IllegalStateException -> L7d
                L4c:
                    java.lang.String r0 = "document_version"
                    com.google.gson.JsonElement r5 = r5.get(r0)     // Catch: java.lang.NumberFormatException -> L72 java.lang.IllegalStateException -> L7d
                    long r3 = r5.getAsLong()     // Catch: java.lang.NumberFormatException -> L72 java.lang.IllegalStateException -> L7d
                    com.amazon.aps.iva.fr.e$j r5 = new com.amazon.aps.iva.fr.e$j     // Catch: java.lang.NumberFormatException -> L72 java.lang.IllegalStateException -> L7d
                    r5.<init>(r2, r1, r3)     // Catch: java.lang.NumberFormatException -> L72 java.lang.IllegalStateException -> L7d
                    return r5
                L5c:
                    r5 = move-exception
                    com.google.gson.JsonParseException r0 = new com.google.gson.JsonParseException     // Catch: java.lang.NumberFormatException -> L72 java.lang.IllegalStateException -> L7d
                    java.lang.String r5 = r5.getMessage()     // Catch: java.lang.NumberFormatException -> L72 java.lang.IllegalStateException -> L7d
                    r0.<init>(r5)     // Catch: java.lang.NumberFormatException -> L72 java.lang.IllegalStateException -> L7d
                    throw r0     // Catch: java.lang.NumberFormatException -> L72 java.lang.IllegalStateException -> L7d
                L67:
                    r5 = move-exception
                    com.google.gson.JsonParseException r0 = new com.google.gson.JsonParseException     // Catch: java.lang.NumberFormatException -> L72 java.lang.IllegalStateException -> L7d
                    java.lang.String r5 = r5.getMessage()     // Catch: java.lang.NumberFormatException -> L72 java.lang.IllegalStateException -> L7d
                    r0.<init>(r5)     // Catch: java.lang.NumberFormatException -> L72 java.lang.IllegalStateException -> L7d
                    throw r0     // Catch: java.lang.NumberFormatException -> L72 java.lang.IllegalStateException -> L7d
                L72:
                    r5 = move-exception
                    com.google.gson.JsonParseException r0 = new com.google.gson.JsonParseException
                    java.lang.String r5 = r5.getMessage()
                    r0.<init>(r5)
                    throw r0
                L7d:
                    r5 = move-exception
                    com.google.gson.JsonParseException r0 = new com.google.gson.JsonParseException
                    java.lang.String r5 = r5.getMessage()
                    r0.<init>(r5)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.fr.e.j.a.a(java.lang.String):com.amazon.aps.iva.fr.e$j");
            }
        }

        public j(k kVar, String str, long j) {
            this.a = kVar;
            this.b = str;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, jVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, jVar.b) && this.c == jVar.c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int i = 0;
            k kVar = this.a;
            if (kVar == null) {
                hashCode = 0;
            } else {
                hashCode = kVar.hashCode();
            }
            int i2 = hashCode * 31;
            String str = this.b;
            if (str != null) {
                i = str.hashCode();
            }
            return Long.hashCode(this.c) + ((i2 + i) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Dd(session=");
            sb.append(this.a);
            sb.append(", browserSdkVersion=");
            sb.append(this.b);
            sb.append(", documentVersion=");
            return com.amazon.aps.iva.c.b.b(sb, this.c, ")");
        }
    }

    /* compiled from: ViewEvent.kt */
    /* loaded from: classes2.dex */
    public static final class k {
        public final u a;

        public k(u uVar) {
            com.amazon.aps.iva.yb0.j.f(uVar, "plan");
            this.a = uVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof k) && this.a == ((k) obj).a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "DdSession(plan=" + this.a + ")";
        }
    }

    /* compiled from: ViewEvent.kt */
    /* loaded from: classes2.dex */
    public static final class l {
        public final m a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        /* compiled from: ViewEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static l a(String str) throws JsonParseException {
                String asString;
                String asString2;
                String asString3;
                String asString4;
                try {
                    JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
                    String asString5 = asJsonObject.get("type").getAsString();
                    m.a aVar = m.Companion;
                    com.amazon.aps.iva.yb0.j.e(asString5, "it");
                    aVar.getClass();
                    m a = m.a.a(asString5);
                    JsonElement jsonElement = asJsonObject.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
                    if (jsonElement == null) {
                        asString = null;
                    } else {
                        asString = jsonElement.getAsString();
                    }
                    JsonElement jsonElement2 = asJsonObject.get("model");
                    if (jsonElement2 == null) {
                        asString2 = null;
                    } else {
                        asString2 = jsonElement2.getAsString();
                    }
                    JsonElement jsonElement3 = asJsonObject.get("brand");
                    if (jsonElement3 == null) {
                        asString3 = null;
                    } else {
                        asString3 = jsonElement3.getAsString();
                    }
                    JsonElement jsonElement4 = asJsonObject.get("architecture");
                    if (jsonElement4 == null) {
                        asString4 = null;
                    } else {
                        asString4 = jsonElement4.getAsString();
                    }
                    return new l(a, asString, asString2, asString3, asString4);
                } catch (IllegalStateException e) {
                    throw new JsonParseException(e.getMessage());
                } catch (NumberFormatException e2) {
                    throw new JsonParseException(e2.getMessage());
                }
            }
        }

        public l(m mVar, String str, String str2, String str3, String str4) {
            com.amazon.aps.iva.yb0.j.f(mVar, "type");
            this.a = mVar;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            if (this.a == lVar.a && com.amazon.aps.iva.yb0.j.a(this.b, lVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, lVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, lVar.d) && com.amazon.aps.iva.yb0.j.a(this.e, lVar.e)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4 = this.a.hashCode() * 31;
            int i = 0;
            String str = this.b;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = (hashCode4 + hashCode) * 31;
            String str2 = this.c;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i3 = (i2 + hashCode2) * 31;
            String str3 = this.d;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i4 = (i3 + hashCode3) * 31;
            String str4 = this.e;
            if (str4 != null) {
                i = str4.hashCode();
            }
            return i4 + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Device(type=");
            sb.append(this.a);
            sb.append(", name=");
            sb.append(this.b);
            sb.append(", model=");
            sb.append(this.c);
            sb.append(", brand=");
            sb.append(this.d);
            sb.append(", architecture=");
            return defpackage.b.c(sb, this.e, ")");
        }
    }

    /* compiled from: ViewEvent.kt */
    /* loaded from: classes2.dex */
    public enum m {
        MOBILE("mobile"),
        DESKTOP("desktop"),
        TABLET("tablet"),
        TV("tv"),
        GAMING_CONSOLE("gaming_console"),
        BOT("bot"),
        OTHER("other");
        
        public static final a Companion = new a();
        private final String jsonValue;

        /* compiled from: ViewEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static m a(String str) {
                com.amazon.aps.iva.yb0.j.f(str, "serializedObject");
                m[] values = m.values();
                int length = values.length;
                int i = 0;
                while (i < length) {
                    m mVar = values[i];
                    i++;
                    if (com.amazon.aps.iva.yb0.j.a(mVar.jsonValue, str)) {
                        return mVar;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        m(String str) {
            this.jsonValue = str;
        }

        public static final m fromJson(String str) {
            Companion.getClass();
            return a.a(str);
        }

        public final JsonElement toJson() {
            return new JsonPrimitive(this.jsonValue);
        }
    }

    /* compiled from: ViewEvent.kt */
    /* loaded from: classes2.dex */
    public static final class n {
        public final long a;

        public n(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof n) && this.a == ((n) obj).a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return com.amazon.aps.iva.c.b.b(new StringBuilder("Error(count="), this.a, ")");
        }
    }

    /* compiled from: ViewEvent.kt */
    /* loaded from: classes2.dex */
    public static final class o {
        public final long a;

        public o(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof o) && this.a == ((o) obj).a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return com.amazon.aps.iva.c.b.b(new StringBuilder("FrozenFrame(count="), this.a, ")");
        }
    }

    /* compiled from: ViewEvent.kt */
    /* loaded from: classes2.dex */
    public static final class p {
        public final long a;
        public final long b;

        public p(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            if (this.a == pVar.a && this.b == pVar.b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InForegroundPeriod(start=");
            sb.append(this.a);
            sb.append(", duration=");
            return com.amazon.aps.iva.c.b.b(sb, this.b, ")");
        }
    }

    /* compiled from: ViewEvent.kt */
    /* loaded from: classes2.dex */
    public enum q {
        BLUETOOTH("bluetooth"),
        CELLULAR("cellular"),
        ETHERNET("ethernet"),
        WIFI("wifi"),
        WIMAX("wimax"),
        MIXED("mixed"),
        OTHER("other"),
        UNKNOWN("unknown"),
        NONE("none");
        
        public static final a Companion = new a();
        private final String jsonValue;

        /* compiled from: ViewEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static q a(String str) {
                com.amazon.aps.iva.yb0.j.f(str, "serializedObject");
                q[] values = q.values();
                int length = values.length;
                int i = 0;
                while (i < length) {
                    q qVar = values[i];
                    i++;
                    if (com.amazon.aps.iva.yb0.j.a(qVar.jsonValue, str)) {
                        return qVar;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        q(String str) {
            this.jsonValue = str;
        }

        public static final q fromJson(String str) {
            Companion.getClass();
            return a.a(str);
        }

        public final JsonElement toJson() {
            return new JsonPrimitive(this.jsonValue);
        }
    }

    /* compiled from: ViewEvent.kt */
    /* loaded from: classes2.dex */
    public enum r {
        INITIAL_LOAD("initial_load"),
        ROUTE_CHANGE("route_change"),
        ACTIVITY_DISPLAY("activity_display"),
        ACTIVITY_REDISPLAY("activity_redisplay"),
        FRAGMENT_DISPLAY("fragment_display"),
        FRAGMENT_REDISPLAY("fragment_redisplay"),
        VIEW_CONTROLLER_DISPLAY("view_controller_display"),
        VIEW_CONTROLLER_REDISPLAY("view_controller_redisplay");
        
        public static final a Companion = new a();
        private final String jsonValue;

        /* compiled from: ViewEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static r a(String str) {
                com.amazon.aps.iva.yb0.j.f(str, "serializedObject");
                r[] values = r.values();
                int length = values.length;
                int i = 0;
                while (i < length) {
                    r rVar = values[i];
                    i++;
                    if (com.amazon.aps.iva.yb0.j.a(rVar.jsonValue, str)) {
                        return rVar;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        r(String str) {
            this.jsonValue = str;
        }

        public static final r fromJson(String str) {
            Companion.getClass();
            return a.a(str);
        }

        public final JsonElement toJson() {
            return new JsonPrimitive(this.jsonValue);
        }
    }

    /* compiled from: ViewEvent.kt */
    /* loaded from: classes2.dex */
    public static final class s {
        public final long a;

        public s(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof s) && this.a == ((s) obj).a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return com.amazon.aps.iva.c.b.b(new StringBuilder("LongTask(count="), this.a, ")");
        }
    }

    /* compiled from: ViewEvent.kt */
    /* loaded from: classes2.dex */
    public static final class t {
        public final String a;
        public final String b;
        public final String c;

        /* compiled from: ViewEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static t a(String str) throws JsonParseException {
                try {
                    JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
                    String asString = asJsonObject.get(AppMeasurementSdk.ConditionalUserProperty.NAME).getAsString();
                    String asString2 = asJsonObject.get("version").getAsString();
                    String asString3 = asJsonObject.get("version_major").getAsString();
                    com.amazon.aps.iva.yb0.j.e(asString, AppMeasurementSdk.ConditionalUserProperty.NAME);
                    com.amazon.aps.iva.yb0.j.e(asString2, "version");
                    com.amazon.aps.iva.yb0.j.e(asString3, "versionMajor");
                    return new t(asString, asString2, asString3);
                } catch (IllegalStateException e) {
                    throw new JsonParseException(e.getMessage());
                } catch (NumberFormatException e2) {
                    throw new JsonParseException(e2.getMessage());
                }
            }
        }

        public t(String str, String str2, String str3) {
            com.amazon.aps.iva.yb0.j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            com.amazon.aps.iva.yb0.j.f(str2, "version");
            com.amazon.aps.iva.yb0.j.f(str3, "versionMajor");
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof t)) {
                return false;
            }
            t tVar = (t) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, tVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, tVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, tVar.c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.c.hashCode() + com.amazon.aps.iva.c80.a.b(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Os(name=");
            sb.append(this.a);
            sb.append(", version=");
            sb.append(this.b);
            sb.append(", versionMajor=");
            return defpackage.b.c(sb, this.c, ")");
        }
    }

    /* compiled from: ViewEvent.kt */
    /* loaded from: classes2.dex */
    public enum u {
        PLAN_1(1),
        PLAN_2(2);
        
        public static final a Companion = new a();
        private final Number jsonValue;

        /* compiled from: ViewEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static u a(String str) {
                com.amazon.aps.iva.yb0.j.f(str, "serializedObject");
                u[] values = u.values();
                int length = values.length;
                int i = 0;
                while (i < length) {
                    u uVar = values[i];
                    i++;
                    if (com.amazon.aps.iva.yb0.j.a(uVar.jsonValue.toString(), str)) {
                        return uVar;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        u(Number number) {
            this.jsonValue = number;
        }

        public static final u fromJson(String str) {
            Companion.getClass();
            return a.a(str);
        }

        public final JsonElement toJson() {
            return new JsonPrimitive(this.jsonValue);
        }
    }

    /* compiled from: ViewEvent.kt */
    /* loaded from: classes2.dex */
    public static final class v {
        public final long a;

        public v(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof v) && this.a == ((v) obj).a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return com.amazon.aps.iva.c.b.b(new StringBuilder("Resource(count="), this.a, ")");
        }
    }

    /* compiled from: ViewEvent.kt */
    /* loaded from: classes2.dex */
    public enum w {
        ANDROID(CredentialsData.CREDENTIALS_TYPE_ANDROID),
        IOS(CredentialsData.CREDENTIALS_TYPE_IOS),
        BROWSER("browser"),
        FLUTTER("flutter"),
        REACT_NATIVE("react-native");
        
        public static final a Companion = new a();
        private final String jsonValue;

        /* compiled from: ViewEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static w a(String str) {
                com.amazon.aps.iva.yb0.j.f(str, "serializedObject");
                w[] values = w.values();
                int length = values.length;
                int i = 0;
                while (i < length) {
                    w wVar = values[i];
                    i++;
                    if (com.amazon.aps.iva.yb0.j.a(wVar.jsonValue, str)) {
                        return wVar;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        w(String str) {
            this.jsonValue = str;
        }

        public static final w fromJson(String str) {
            Companion.getClass();
            return a.a(str);
        }

        public final JsonElement toJson() {
            return new JsonPrimitive(this.jsonValue);
        }
    }

    /* compiled from: ViewEvent.kt */
    /* loaded from: classes2.dex */
    public enum x {
        CONNECTED("connected"),
        NOT_CONNECTED("not_connected"),
        MAYBE("maybe");
        
        public static final a Companion = new a();
        private final String jsonValue;

        /* compiled from: ViewEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static x a(String str) {
                com.amazon.aps.iva.yb0.j.f(str, "serializedObject");
                x[] values = x.values();
                int length = values.length;
                int i = 0;
                while (i < length) {
                    x xVar = values[i];
                    i++;
                    if (com.amazon.aps.iva.yb0.j.a(xVar.jsonValue, str)) {
                        return xVar;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        x(String str) {
            this.jsonValue = str;
        }

        public static final x fromJson(String str) {
            Companion.getClass();
            return a.a(str);
        }

        public final JsonElement toJson() {
            return new JsonPrimitive(this.jsonValue);
        }
    }

    /* compiled from: ViewEvent.kt */
    /* loaded from: classes2.dex */
    public static final class y {
        public final String a;
        public final String b;
        public final Boolean c;

        /* compiled from: ViewEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static y a(String str) throws JsonParseException {
                Boolean valueOf;
                try {
                    JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
                    String asString = asJsonObject.get("test_id").getAsString();
                    String asString2 = asJsonObject.get("result_id").getAsString();
                    JsonElement jsonElement = asJsonObject.get("injected");
                    if (jsonElement == null) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(jsonElement.getAsBoolean());
                    }
                    com.amazon.aps.iva.yb0.j.e(asString, "testId");
                    com.amazon.aps.iva.yb0.j.e(asString2, "resultId");
                    return new y(asString, asString2, valueOf);
                } catch (IllegalStateException e) {
                    throw new JsonParseException(e.getMessage());
                } catch (NumberFormatException e2) {
                    throw new JsonParseException(e2.getMessage());
                }
            }
        }

        public y(String str, String str2, Boolean bool) {
            this.a = str;
            this.b = str2;
            this.c = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof y)) {
                return false;
            }
            y yVar = (y) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, yVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, yVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, yVar.c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int b = com.amazon.aps.iva.c80.a.b(this.b, this.a.hashCode() * 31, 31);
            Boolean bool = this.c;
            if (bool == null) {
                hashCode = 0;
            } else {
                hashCode = bool.hashCode();
            }
            return b + hashCode;
        }

        public final String toString() {
            return "Synthetics(testId=" + this.a + ", resultId=" + this.b + ", injected=" + this.c + ")";
        }
    }

    public e(long j2, b bVar, String str, b0 b0Var, w wVar, a0 a0Var, z zVar, f fVar, y yVar, d dVar, t tVar, l lVar, j jVar, g gVar) {
        this.a = j2;
        this.b = bVar;
        this.c = str;
        this.d = b0Var;
        this.e = wVar;
        this.f = a0Var;
        this.g = zVar;
        this.h = fVar;
        this.i = yVar;
        this.j = dVar;
        this.k = tVar;
        this.l = lVar;
        this.m = jVar;
        this.n = gVar;
    }

    public static e a(e eVar, a0 a0Var, z zVar, j jVar, g gVar, int i2) {
        long j2;
        b bVar;
        String str;
        b0 b0Var;
        w wVar;
        a0 a0Var2;
        z zVar2;
        f fVar;
        y yVar;
        d dVar;
        t tVar;
        l lVar;
        j jVar2;
        g gVar2;
        if ((i2 & 1) != 0) {
            j2 = eVar.a;
        } else {
            j2 = 0;
        }
        long j3 = j2;
        if ((i2 & 2) != 0) {
            bVar = eVar.b;
        } else {
            bVar = null;
        }
        if ((i2 & 4) != 0) {
            str = eVar.c;
        } else {
            str = null;
        }
        if ((i2 & 8) != 0) {
            b0Var = eVar.d;
        } else {
            b0Var = null;
        }
        if ((i2 & 16) != 0) {
            wVar = eVar.e;
        } else {
            wVar = null;
        }
        if ((i2 & 32) != 0) {
            a0Var2 = eVar.f;
        } else {
            a0Var2 = a0Var;
        }
        if ((i2 & 64) != 0) {
            zVar2 = eVar.g;
        } else {
            zVar2 = zVar;
        }
        if ((i2 & 128) != 0) {
            fVar = eVar.h;
        } else {
            fVar = null;
        }
        if ((i2 & 256) != 0) {
            yVar = eVar.i;
        } else {
            yVar = null;
        }
        if ((i2 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
            dVar = eVar.j;
        } else {
            dVar = null;
        }
        if ((i2 & 1024) != 0) {
            tVar = eVar.k;
        } else {
            tVar = null;
        }
        if ((i2 & 2048) != 0) {
            lVar = eVar.l;
        } else {
            lVar = null;
        }
        if ((i2 & 4096) != 0) {
            jVar2 = eVar.m;
        } else {
            jVar2 = jVar;
        }
        if ((i2 & 8192) != 0) {
            gVar2 = eVar.n;
        } else {
            gVar2 = gVar;
        }
        eVar.getClass();
        com.amazon.aps.iva.yb0.j.f(bVar, "application");
        com.amazon.aps.iva.yb0.j.f(b0Var, "session");
        com.amazon.aps.iva.yb0.j.f(a0Var2, "view");
        com.amazon.aps.iva.yb0.j.f(jVar2, "dd");
        return new e(j3, bVar, str, b0Var, wVar, a0Var2, zVar2, fVar, yVar, dVar, tVar, lVar, jVar2, gVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.a == eVar.a && com.amazon.aps.iva.yb0.j.a(this.b, eVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, eVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, eVar.d) && this.e == eVar.e && com.amazon.aps.iva.yb0.j.a(this.f, eVar.f) && com.amazon.aps.iva.yb0.j.a(this.g, eVar.g) && com.amazon.aps.iva.yb0.j.a(this.h, eVar.h) && com.amazon.aps.iva.yb0.j.a(this.i, eVar.i) && com.amazon.aps.iva.yb0.j.a(this.j, eVar.j) && com.amazon.aps.iva.yb0.j.a(this.k, eVar.k) && com.amazon.aps.iva.yb0.j.a(this.l, eVar.l) && com.amazon.aps.iva.yb0.j.a(this.m, eVar.m) && com.amazon.aps.iva.yb0.j.a(this.n, eVar.n)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9 = (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31;
        int i2 = 0;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode10 = (this.d.hashCode() + ((hashCode9 + hashCode) * 31)) * 31;
        w wVar = this.e;
        if (wVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = wVar.hashCode();
        }
        int hashCode11 = (this.f.hashCode() + ((hashCode10 + hashCode2) * 31)) * 31;
        z zVar = this.g;
        if (zVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = zVar.hashCode();
        }
        int i3 = (hashCode11 + hashCode3) * 31;
        f fVar = this.h;
        if (fVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = fVar.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        y yVar = this.i;
        if (yVar == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = yVar.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        d dVar = this.j;
        if (dVar == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = dVar.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        t tVar = this.k;
        if (tVar == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = tVar.hashCode();
        }
        int i7 = (i6 + hashCode7) * 31;
        l lVar = this.l;
        if (lVar == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = lVar.hashCode();
        }
        int hashCode12 = (this.m.hashCode() + ((i7 + hashCode8) * 31)) * 31;
        g gVar = this.n;
        if (gVar != null) {
            i2 = gVar.hashCode();
        }
        return hashCode12 + i2;
    }

    public final String toString() {
        return "ViewEvent(date=" + this.a + ", application=" + this.b + ", service=" + this.c + ", session=" + this.d + ", source=" + this.e + ", view=" + this.f + ", usr=" + this.g + ", connectivity=" + this.h + ", synthetics=" + this.i + ", ciTest=" + this.j + ", os=" + this.k + ", device=" + this.l + ", dd=" + this.m + ", context=" + this.n + ")";
    }

    /* compiled from: ViewEvent.kt */
    /* loaded from: classes2.dex */
    public static final class g {
        public final Map<String, Object> a;

        /* compiled from: ViewEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static g a(String str) throws JsonParseException {
                try {
                    JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, JsonElement> entry : asJsonObject.entrySet()) {
                        String key = entry.getKey();
                        com.amazon.aps.iva.yb0.j.e(key, "entry.key");
                        linkedHashMap.put(key, entry.getValue());
                    }
                    return new g(linkedHashMap);
                } catch (IllegalStateException e) {
                    throw new JsonParseException(e.getMessage());
                } catch (NumberFormatException e2) {
                    throw new JsonParseException(e2.getMessage());
                }
            }
        }

        public g(Map<String, ? extends Object> map) {
            com.amazon.aps.iva.yb0.j.f(map, "additionalProperties");
            this.a = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof g) && com.amazon.aps.iva.yb0.j.a(this.a, ((g) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Context(additionalProperties=" + this.a + ")";
        }

        public g() {
            this(com.amazon.aps.iva.lb0.a0.b);
        }
    }

    /* compiled from: ViewEvent.kt */
    /* loaded from: classes2.dex */
    public static final class i {
        public final Map<String, Long> a;

        /* compiled from: ViewEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static i a(String str) throws JsonParseException {
                try {
                    JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, JsonElement> entry : asJsonObject.entrySet()) {
                        String key = entry.getKey();
                        com.amazon.aps.iva.yb0.j.e(key, "entry.key");
                        linkedHashMap.put(key, Long.valueOf(entry.getValue().getAsLong()));
                    }
                    return new i(linkedHashMap);
                } catch (IllegalStateException e) {
                    throw new JsonParseException(e.getMessage());
                } catch (NumberFormatException e2) {
                    throw new JsonParseException(e2.getMessage());
                }
            }
        }

        public i(Map<String, Long> map) {
            com.amazon.aps.iva.yb0.j.f(map, "additionalProperties");
            this.a = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof i) && com.amazon.aps.iva.yb0.j.a(this.a, ((i) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "CustomTimings(additionalProperties=" + this.a + ")";
        }

        public i() {
            this(com.amazon.aps.iva.lb0.a0.b);
        }
    }

    /* compiled from: ViewEvent.kt */
    /* loaded from: classes2.dex */
    public static final class z {
        public static final String[] e = {"id", AppMeasurementSdk.ConditionalUserProperty.NAME, Scopes.EMAIL};
        public final String a;
        public final String b;
        public final String c;
        public final Map<String, Object> d;

        /* compiled from: ViewEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static z a(String str) throws JsonParseException {
                String asString;
                String asString2;
                try {
                    JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
                    JsonElement jsonElement = asJsonObject.get("id");
                    String str2 = null;
                    if (jsonElement == null) {
                        asString = null;
                    } else {
                        asString = jsonElement.getAsString();
                    }
                    JsonElement jsonElement2 = asJsonObject.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
                    if (jsonElement2 == null) {
                        asString2 = null;
                    } else {
                        asString2 = jsonElement2.getAsString();
                    }
                    JsonElement jsonElement3 = asJsonObject.get(Scopes.EMAIL);
                    if (jsonElement3 != null) {
                        str2 = jsonElement3.getAsString();
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, JsonElement> entry : asJsonObject.entrySet()) {
                        if (!com.amazon.aps.iva.lb0.o.N(z.e, entry.getKey())) {
                            String key = entry.getKey();
                            com.amazon.aps.iva.yb0.j.e(key, "entry.key");
                            linkedHashMap.put(key, entry.getValue());
                        }
                    }
                    return new z(asString, asString2, str2, linkedHashMap);
                } catch (IllegalStateException e) {
                    throw new JsonParseException(e.getMessage());
                } catch (NumberFormatException e2) {
                    throw new JsonParseException(e2.getMessage());
                }
            }
        }

        public z(String str, String str2, String str3, Map<String, ? extends Object> map) {
            com.amazon.aps.iva.yb0.j.f(map, "additionalProperties");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof z)) {
                return false;
            }
            z zVar = (z) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, zVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, zVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, zVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, zVar.d)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2;
            int i = 0;
            String str = this.a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = hashCode * 31;
            String str2 = this.b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i3 = (i2 + hashCode2) * 31;
            String str3 = this.c;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return this.d.hashCode() + ((i3 + i) * 31);
        }

        public final String toString() {
            return "Usr(id=" + this.a + ", name=" + this.b + ", email=" + this.c + ", additionalProperties=" + this.d + ")";
        }

        public z() {
            this(null, null, null, com.amazon.aps.iva.lb0.a0.b);
        }
    }
}

package com.appsflyer.internal;
/* loaded from: classes.dex */
public class a {
    private static int AppsFlyerConversionListener = 0;
    public static final int AppsFlyerInAppPurchaseValidatorListener = 0;
    public static final byte[] AppsFlyerLib = null;
    private static int getSdkVersion = 1;
    public static byte[] onAppOpenAttribution;
    private static Object onAttributionFailure;
    public static byte[] onConversionDataFail;
    private static Object onDeepLinking;
    private static int onValidateInApp;
    private static int onValidateInAppFailure;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        if ((r12 == null ? '/' : 'L') != 'L') goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
        if (r7 != '\f') goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
        r11 = (com.appsflyer.internal.a.getSdkVersion + 26) - 1;
        com.appsflyer.internal.a.onValidateInApp = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
        if ((r11 % 2) == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
        if (r11 == true) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
        r11 = r3.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0076, code lost:
        r11 = r1;
        r6 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00ac -> B:30:0x007b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r10, short r11, byte r12) {
        /*
            Method dump skipped, instructions count: 183
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.a.$$c(short, short, byte):java.lang.String");
    }

    public static int AFInAppEventType(Object obj) {
        int i = onValidateInApp;
        int i2 = (i ^ 35) + ((i & 35) << 1);
        getSdkVersion = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = onDeepLinking;
        int i4 = onValidateInApp + 21;
        getSdkVersion = i4 % 128;
        int i5 = i4 % 2;
        try {
            int intValue = ((Integer) Class.forName($$c((short) 938, AppsFlyerLib[40], AppsFlyerLib[450]), true, (ClassLoader) onAttributionFailure).getMethod($$c((short) 400, AppsFlyerLib[15], AppsFlyerLib[92]), Object.class).invoke(obj2, obj)).intValue();
            int i6 = onValidateInApp;
            int i7 = (i6 & 87) + (i6 | 87);
            getSdkVersion = i7 % 128;
            if ((i7 % 2 == 0 ? (char) 6 : 'E') != 6) {
                return intValue;
            }
            Object obj3 = null;
            super.hashCode();
            return intValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int AFKeystoreWrapper(int i) {
        int i2 = onValidateInApp + 7;
        getSdkVersion = i2 % 128;
        int i3 = i2 % 2;
        Object obj = onDeepLinking;
        int i4 = (getSdkVersion + 48) - 1;
        onValidateInApp = i4 % 128;
        int i5 = i4 % 2;
        int i6 = onValidateInApp;
        int i7 = (i6 ^ 109) + ((i6 & 109) << 1);
        getSdkVersion = i7 % 128;
        int i8 = i7 % 2;
        try {
            return ((Integer) Class.forName($$c((short) 938, AppsFlyerLib[40], AppsFlyerLib[450]), true, (ClassLoader) onAttributionFailure).getMethod($$c((short) 400, AppsFlyerLib[15], AppsFlyerLib[92]), Integer.TYPE).invoke(obj, Integer.valueOf(i))).intValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object AFKeystoreWrapper(int i, int i2, char c) {
        int i3 = getSdkVersion;
        int i4 = (i3 ^ 99) + ((i3 & 99) << 1);
        onValidateInApp = i4 % 128;
        int i5 = i4 % 2;
        Object obj = onDeepLinking;
        int i6 = onValidateInApp + 33;
        getSdkVersion = i6 % 128;
        int i7 = i6 % 2;
        int i8 = (getSdkVersion + 50) - 1;
        onValidateInApp = i8 % 128;
        int i9 = i8 % 2;
        try {
            return Class.forName($$c((short) 938, AppsFlyerLib[40], AppsFlyerLib[450]), true, (ClassLoader) onAttributionFailure).getMethod($$c((short) 214, AppsFlyerLib[15], AppsFlyerLib[66]), Integer.TYPE, Integer.TYPE, Character.TYPE).invoke(obj, Integer.valueOf(i), Integer.valueOf(i2), Character.valueOf(c));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    static void init$0() {
        int i = (onValidateInApp + 2) - 1;
        getSdkVersion = i % 128;
        int i2 = i % 2;
        byte[] bArr = new byte[986];
        System.arraycopy("]ó\u008et\të\u00153ÅúAìÍ\u000f\u0000\u0001ó\r\u0001\u001bÛþû\u0001!ß\u0002\r\u0004ôô\u0002?Íñ\u0000ý\rúó\u0014óDÅûú\u000fó\u0004\rõ>ÉA\u0000\të\u00153Â\u000bó\u00079ÛÚ\u0006ÿ\u000føî\u0003\u0000\r÷ú3Ñ\u0000\u0004\u0003\u0006\u0002í\u000bú\u0001ó\nò\u0003\u0006\u00056¿üEÞÞ\u0003\fþò\u0000\të\u00153À\u0005úAìÉ\u0005\u000f#Í\u000f\u0000\u0001óó\nò\u0003\u0006\u00056¿üEìÍ\fý\b@Î\u0011óÿ\nú\u0001\të\u00153ÅúAìÉ\u0005\u000f$Ï\u0000\u0011è0Ûþû\u0001!ß\u0002\r\u0004ô\u0003õö\rþ=»ú\u0006ÿ\u000fø?åÛ!èøþýù5ßí5×\u000bî\u0000'Ý\u000eýÿó\r\u0004ý\u001eÑ\t\u0000óô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=ÊA\u0000\u0002ñ.Ýý\u0007ò/Û÷û\nÿí)é\u0005\tõ\u000f\u0002ñ1âþû\u0003!Û÷\r\u0004ý\u0003õö\rþ=»ú\u0006ÿ\u000fø?êßí2Ýý\u0007ô\u000bÿ\u0006ü\u0002þû\u0003\u0003õö\rþ=»ú\u0006ÿ\u000fø?ìáî\u000e!ßí5×\u000bî\u0000'Ý\u000eýÿó\u0002ñ1Ô\u000bÿ\"âþû\u0003!Û÷ûýÛ-Ñ\u0000+Ï\u0011÷ú Û\t\u000bú\u000b\u000b\u0015ù\u0017øºÿOº\u0005õ\u0000\n\u0001þøøS´\u0007ÿòK\u0015ú\u0016ø\u0015ü\u0014ø\u0015ø\u0018ø\të\u00153Â\u000bó\u00079ë×\u000bî\u0000'Ý\u000eýÿóó\nò\u0003\u0006\u00056Íñ\u0000BíÑ\u0000)Ûý\r\u0001õù\u0002ñ/Í\u0004\u000fó\u0004\rõ\u0019ß\u0005ý\u0011ú\u0002!Û÷\r\u0002ï\u0005ýùÌô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=Í5\të\u00153ÅúAêãí\u0013\u0018Ûþû\u0001!ß\u0002\r\u0004ôý\u000eý ßí\të\u00153ÅúAìÉ\u0005\u000f$Ï\u0000\u0011è*Ú\u0001\u0004û\u0001!ß\u0002\r\u0004ôó\nò\u0003\u0006\u00056¿üEé×ø\r÷\u0003\u0001\u0001\b÷ú\u0015õ÷\u0010òô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=Î=®\b\u0002ù\u0002ñ1×\u000bî\u0000'Ý\u000eýÿóË\u0003í\u00132Ë\u0003í\u00132ÿù\u0007ñ\u000f\u0002ñ.\u0002\u000fùì\u0016ûú\rí\u000bó\u0011\u0019ã\u0007ð\u0011ïù)ïí\f#Ù\u0007ø\b÷ú\u0001÷ýü\u000eÌô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=Î4\të\u00153ÅúAº\u0007ý\fû÷\u0002ñ$Þ\u0003ÿ\u000bóþû\u0002ñ3ßï\u0004\u0003÷\u0001\u000f\u0015ïí\fó\nò\u0003\u0006\u00056Íñ\u0000BíÞï\u000bó\rõû%ìö\r\u0004ý\u0015õ÷\u0010\u0016é\të\u00153ÅúAèÝý\u0007\u0016Ú\u0001\u0004û\u0001!ß\u0002\r\u0004ô\u0002ó\u0017å\tõ\u000f\të\u00153ÅúAåú\nÍ\u0015þõü\u000bú\u0001ó\nò\u0003\u0006\u00056º\u000fí\u0004FÚïí\u0004\u001fá\u000býù\u000fí\f\u001cãöÿ\u0002ñ+Û\u0005õ\u000b\bõ+Ñ\u0000\u0004\u0003\u0006\u0002í\u000bú\u0001\të\u00153ÅúAèÝý\u0007\u0015ý\u0013øî\u0003\u0000\r÷ú ëü\b\u0018äý\u0000\u0003ö\të\u00153ÅúAèÝý\u0007!ßò\u0010ñ\tùü\u0005ý\u0005-É\u0005\u000f$Ï\u0000\u0011èý\u000eý!×\u000bî\u0000ô%ë\u0005ô\u0002?Íñ\u0000ý\rúó\u0014ó\u0005\u0011ñ\rí\u000bó\u0011\u0019ã\u0007ð\u0011ïù5Û÷\r\u0002ï\u0005ý\t\u0004ò\të\u00153ÅúAåÛþû\u0001!ß\u0002\r\u0004ô".getBytes("ISO-8859-1"), 0, bArr, 0, 986);
        AppsFlyerLib = bArr;
        AppsFlyerInAppPurchaseValidatorListener = 3;
        int i3 = onValidateInApp + 91;
        getSdkVersion = i3 % 128;
        if (!(i3 % 2 != 0)) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    private a() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(51:1|2|3|(1:5)(1:872)|6|(1:8)(1:871)|9|10|11|(38:13|(2:856|857)|(36:852|853|(36:18|19|(1:21)(1:849)|22|(1:24)(1:847)|25|(30:27|28|29|30|(3:(1:33)(1:39)|34|(2:36|37)(1:38))|(1:41)(3:841|842|843)|42|(2:(1:45)(1:50)|(3:47|48|49))|51|52|53|54|55|56|57|(1:59)(1:839)|60|(1:62)(1:838)|63|(1:65)(1:837)|66|(1:68)(1:836)|69|(1:71)(1:835)|72|(1:74)(1:834)|75|76|(3:80|(22:85|86|87|(8:(1:90)(1:103)|91|(2:93|94)|96|97|98|99|101)|(14:702|703|704|705|706|707|708|709|710|711|712|713|(3:(1:715)(1:810)|716|(1:808)(18:(1:719)(1:807)|720|(1:(1:723)(1:(3:800|(1:802)(1:804)|803)(1:805)))(1:806)|724|725|726|727|728|729|(4:(1:732)(1:745)|733|(5:735|736|(1:738)(1:742)|739|740)(2:743|744)|741)|746|747|(1:749)(1:790)|750|(3:752|753|754)(4:(1:759)(1:789)|760|(3:(1:763)(1:784)|764|(3:766|767|768)(7:769|770|771|772|773|774|775))(4:785|786|787|788)|757)|755|756|757))|809)(1:105)|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|(16:122|123|124|125|126|(5:128|129|130|131|132)(26:630|631|632|633|634|635|636|637|638|639|640|641|642|643|644|645|646|647|648|649|650|651|652|653|654|655)|133|134|135|(1:137)(1:627)|138|(47:520|521|522|523|524|525|526|527|528|(3:529|530|(6:532|533|534|535|(1:537)(1:619)|(3:539|540|541)(1:542))(1:623))|543|544|545|546|547|548|549|550|551|552|553|554|555|556|557|558|559|560|561|562|563|564|565|566|567|568|569|570|571|572|(1:574)|575|576|577|(1:579)(1:583)|(1:581)|582)(67:140|141|142|(1:144)(1:515)|(1:146)(1:514)|147|(1:149)(1:513)|150|151|152|153|154|(3:(1:156)(1:509)|157|(2:507|508)(8:159|160|161|162|163|(1:165)(1:505)|166|(4:168|169|170|171)(0)))|215|216|217|218|219|220|221|222|223|224|225|226|227|228|229|230|231|232|233|234|235|236|237|238|239|240|241|242|243|244|245|246|247|248|249|250|251|252|253|254|255|256|257|258|259|260|261|262|263|264|(1:266)(1:442)|267|(5:269|270|271|272|273)|297)|(1:299)(1:441)|300|(29:302|303|304|305|306|307|308|309|310|311|312|313|314|315|316|317|318|319|320|321|322|323|324|325|326|327|328|(6:330|331|332|333|334|335)|340)(13:415|416|417|418|419|420|421|422|423|424|425|426|427)|(20:342|343|344|345|346|347|348|(1:350)(1:375)|351|352|353|354|355|356|357|358|359|360|361|362)(6:382|383|(1:385)(1:389)|386|387|388)))(2:82|83)|84)|830)|846|30|(0)|(0)(0)|42|(0)|51|52|53|54|55|56|57|(0)(0)|60|(0)(0)|63|(0)(0)|66|(0)(0)|69|(0)(0)|72|(0)(0)|75|76|(4:78|80|(0)(0)|84)|831|832)|851|(0)(0)|25|(0)|846|30|(0)|(0)(0)|42|(0)|51|52|53|54|55|56|57|(0)(0)|60|(0)(0)|63|(0)(0)|66|(0)(0)|69|(0)(0)|72|(0)(0)|75|76|(0)|831|832)|16|(0)|851|(0)(0)|25|(0)|846|30|(0)|(0)(0)|42|(0)|51|52|53|54|55|56|57|(0)(0)|60|(0)(0)|63|(0)(0)|66|(0)(0)|69|(0)(0)|72|(0)(0)|75|76|(0)|831|832)|863|864|865|866|(0)|16|(0)|851|(0)(0)|25|(0)|846|30|(0)|(0)(0)|42|(0)|51|52|53|54|55|56|57|(0)(0)|60|(0)(0)|63|(0)(0)|66|(0)(0)|69|(0)(0)|72|(0)(0)|75|76|(0)|831|832|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0497, code lost:
        if (((java.lang.Boolean) java.lang.Class.forName($$c(r13, com.appsflyer.internal.a.AppsFlyerLib[17], com.appsflyer.internal.a.AppsFlyerLib[60])).getMethod($$c((short) 185, com.appsflyer.internal.a.AppsFlyerLib[40], com.appsflyer.internal.a.AppsFlyerLib[62]), null).invoke(r15, null)).booleanValue() != false) goto L104;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:1031:0x00d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:1053:0x043c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:1076:0x1abd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1082:0x1aad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0208 A[Catch: Exception -> 0x1b70, TRY_LEAVE, TryCatch #49 {Exception -> 0x1b70, blocks: (B:3:0x0012, B:54:0x01b2, B:75:0x0284, B:88:0x032a, B:90:0x03b5, B:94:0x03f2, B:102:0x0404, B:106:0x040d, B:110:0x0416, B:114:0x0420, B:119:0x0438, B:879:0x1aa4, B:885:0x1ab0, B:897:0x1b37, B:886:0x1abd, B:882:0x1aaa, B:66:0x0208, B:10:0x0032, B:86:0x02f6, B:68:0x0253, B:67:0x0215, B:77:0x029d, B:55:0x01d2, B:888:0x1ad5, B:889:0x1b0e), top: B:925:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:828:0x19e4 A[Catch: all -> 0x1a7e, TryCatch #92 {all -> 0x1a7e, blocks: (B:795:0x1993, B:800:0x1999, B:802:0x19a0, B:803:0x19a1, B:808:0x19a7, B:810:0x19ae, B:811:0x19af, B:826:0x19da, B:828:0x19e4, B:829:0x19e5, B:839:0x1a09, B:841:0x1a12, B:842:0x1a13, B:852:0x1a47, B:854:0x1a4e, B:855:0x1a4f, B:305:0x0998, B:303:0x0949, B:349:0x0c36, B:315:0x0a2a), top: B:1049:0x0998 }] */
    /* JADX WARN: Removed duplicated region for block: B:829:0x19e5 A[Catch: all -> 0x1a7e, TryCatch #92 {all -> 0x1a7e, blocks: (B:795:0x1993, B:800:0x1999, B:802:0x19a0, B:803:0x19a1, B:808:0x19a7, B:810:0x19ae, B:811:0x19af, B:826:0x19da, B:828:0x19e4, B:829:0x19e5, B:839:0x1a09, B:841:0x1a12, B:842:0x1a13, B:852:0x1a47, B:854:0x1a4e, B:855:0x1a4f, B:305:0x0998, B:303:0x0949, B:349:0x0c36, B:315:0x0a2a), top: B:1049:0x0998 }] */
    /* JADX WARN: Removed duplicated region for block: B:841:0x1a12 A[Catch: all -> 0x1a7e, TryCatch #92 {all -> 0x1a7e, blocks: (B:795:0x1993, B:800:0x1999, B:802:0x19a0, B:803:0x19a1, B:808:0x19a7, B:810:0x19ae, B:811:0x19af, B:826:0x19da, B:828:0x19e4, B:829:0x19e5, B:839:0x1a09, B:841:0x1a12, B:842:0x1a13, B:852:0x1a47, B:854:0x1a4e, B:855:0x1a4f, B:305:0x0998, B:303:0x0949, B:349:0x0c36, B:315:0x0a2a), top: B:1049:0x0998 }] */
    /* JADX WARN: Removed duplicated region for block: B:842:0x1a13 A[Catch: all -> 0x1a7e, TryCatch #92 {all -> 0x1a7e, blocks: (B:795:0x1993, B:800:0x1999, B:802:0x19a0, B:803:0x19a1, B:808:0x19a7, B:810:0x19ae, B:811:0x19af, B:826:0x19da, B:828:0x19e4, B:829:0x19e5, B:839:0x1a09, B:841:0x1a12, B:842:0x1a13, B:852:0x1a47, B:854:0x1a4e, B:855:0x1a4f, B:305:0x0998, B:303:0x0949, B:349:0x0c36, B:315:0x0a2a), top: B:1049:0x0998 }] */
    /* JADX WARN: Removed duplicated region for block: B:879:0x1aa4 A[Catch: Exception -> 0x1b70, TRY_ENTER, TryCatch #49 {Exception -> 0x1b70, blocks: (B:3:0x0012, B:54:0x01b2, B:75:0x0284, B:88:0x032a, B:90:0x03b5, B:94:0x03f2, B:102:0x0404, B:106:0x040d, B:110:0x0416, B:114:0x0420, B:119:0x0438, B:879:0x1aa4, B:885:0x1ab0, B:897:0x1b37, B:886:0x1abd, B:882:0x1aaa, B:66:0x0208, B:10:0x0032, B:86:0x02f6, B:68:0x0253, B:67:0x0215, B:77:0x029d, B:55:0x01d2, B:888:0x1ad5, B:889:0x1b0e), top: B:925:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:885:0x1ab0 A[Catch: Exception -> 0x1b70, TryCatch #49 {Exception -> 0x1b70, blocks: (B:3:0x0012, B:54:0x01b2, B:75:0x0284, B:88:0x032a, B:90:0x03b5, B:94:0x03f2, B:102:0x0404, B:106:0x040d, B:110:0x0416, B:114:0x0420, B:119:0x0438, B:879:0x1aa4, B:885:0x1ab0, B:897:0x1b37, B:886:0x1abd, B:882:0x1aaa, B:66:0x0208, B:10:0x0032, B:86:0x02f6, B:68:0x0253, B:67:0x0215, B:77:0x029d, B:55:0x01d2, B:888:0x1ad5, B:889:0x1b0e), top: B:925:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:896:0x1b19  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03fb  */
    /* JADX WARN: Type inference failed for: r25v2 */
    static {
        /*
            Method dump skipped, instructions count: 7032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.a.<clinit>():void");
    }
}

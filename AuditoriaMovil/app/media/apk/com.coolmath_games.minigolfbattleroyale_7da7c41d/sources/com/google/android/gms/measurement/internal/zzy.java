package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
/* loaded from: classes2.dex */
public final class zzy extends zzke {
    private String zza;
    private Set<Integer> zzb;
    private Map<Integer, zzt> zzc;
    private Long zzd;
    private Long zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzy(zzkn zzknVar) {
        super(zzknVar);
    }

    private final zzt zzc(Integer num) {
        if (this.zzc.containsKey(num)) {
            return this.zzc.get(num);
        }
        zzt zztVar = new zzt(this, this.zza, null);
        this.zzc.put(num, zztVar);
        return zztVar;
    }

    private final boolean zzd(int i, int i2) {
        zzt zztVar = this.zzc.get(Integer.valueOf(i));
        if (zztVar == null) {
            return false;
        }
        return zzt.zzc(zztVar).get(i2);
    }

    @Override // com.google.android.gms.measurement.internal.zzke
    protected final boolean zzaA() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't wrap try/catch for region: R(17:(6:19|20|21|22|23|(22:(7:25|26|27|28|(1:30)(3:503|(1:505)(1:507)|506)|31|(1:34)(1:33))|(1:36)|37|38|39|40|41|42|(3:44|(1:46)|47)(4:460|(6:461|462|463|464|465|(1:468)(1:467))|(1:470)|471)|48|(5:295|(3:297|(6:299|300|301|302|303|(2:(3:305|(1:307)|308)|310)(1:354))|368)(1:459)|369|(10:372|(3:376|(4:379|(5:381|382|(1:384)(1:388)|385|386)(1:389)|387|377)|390)|391|(3:395|(4:398|(3:403|404|405)|406|396)|409)|410|(3:412|(6:415|(2:417|(3:419|420|421))(1:424)|422|423|421|413)|425)|426|(3:435|(8:438|(1:440)|441|(1:443)|444|(3:446|447|448)(1:450)|449|436)|451)|452|370)|458)|50|51|(3:183|(4:186|(10:188|189|(1:191)(1:292)|192|(10:194|195|196|197|198|199|200|201|(4:203|(11:204|205|206|207|208|209|210|(3:212|213|214)(1:260)|215|216|(1:219)(1:218))|(1:221)|222)(2:270|271)|223)(1:291)|224|(4:227|(3:245|246|247)(6:229|230|(2:231|(2:233|(1:235)(2:236|237))(2:243|244))|(1:239)|240|241)|242|225)|248|249|250)(1:293)|251|184)|294)|53|54|(3:81|(6:84|(7:86|87|88|89|90|(3:(9:92|93|94|95|96|(1:98)(1:157)|99|100|(1:103)(1:102))|(1:105)|106)(2:164|165)|107)(1:181)|108|(2:109|(2:111|(3:147|148|149)(6:113|(2:114|(4:116|(3:118|(1:120)(1:143)|121)(1:144)|122|(1:1)(2:126|(1:128)(2:129|130)))(2:145|146))|(2:135|134)|132|133|134))(0))|150|82)|182)|56|57|(9:60|61|62|63|64|65|(2:67|68)(1:70)|69|58)|78|79)(1:511))|41|42|(0)(0)|48|(0)|50|51|(0)|53|54|(0)|56|57|(1:58)|78|79) */
    /* JADX WARN: Can't wrap try/catch for region: R(27:1|(2:2|(2:4|(2:6|7))(2:527|528))|8|(3:10|11|12)|16|(6:19|20|21|22|23|(22:(7:25|26|27|28|(1:30)(3:503|(1:505)(1:507)|506)|31|(1:34)(1:33))|(1:36)|37|38|39|40|41|42|(3:44|(1:46)|47)(4:460|(6:461|462|463|464|465|(1:468)(1:467))|(1:470)|471)|48|(5:295|(3:297|(6:299|300|301|302|303|(2:(3:305|(1:307)|308)|310)(1:354))|368)(1:459)|369|(10:372|(3:376|(4:379|(5:381|382|(1:384)(1:388)|385|386)(1:389)|387|377)|390)|391|(3:395|(4:398|(3:403|404|405)|406|396)|409)|410|(3:412|(6:415|(2:417|(3:419|420|421))(1:424)|422|423|421|413)|425)|426|(3:435|(8:438|(1:440)|441|(1:443)|444|(3:446|447|448)(1:450)|449|436)|451)|452|370)|458)|50|51|(3:183|(4:186|(10:188|189|(1:191)(1:292)|192|(10:194|195|196|197|198|199|200|201|(4:203|(11:204|205|206|207|208|209|210|(3:212|213|214)(1:260)|215|216|(1:219)(1:218))|(1:221)|222)(2:270|271)|223)(1:291)|224|(4:227|(3:245|246|247)(6:229|230|(2:231|(2:233|(1:235)(2:236|237))(2:243|244))|(1:239)|240|241)|242|225)|248|249|250)(1:293)|251|184)|294)|53|54|(3:81|(6:84|(7:86|87|88|89|90|(3:(9:92|93|94|95|96|(1:98)(1:157)|99|100|(1:103)(1:102))|(1:105)|106)(2:164|165)|107)(1:181)|108|(2:109|(2:111|(3:147|148|149)(6:113|(2:114|(4:116|(3:118|(1:120)(1:143)|121)(1:144)|122|(1:1)(2:126|(1:128)(2:129|130)))(2:145|146))|(2:135|134)|132|133|134))(0))|150|82)|182)|56|57|(9:60|61|62|63|64|65|(2:67|68)(1:70)|69|58)|78|79)(1:511))|526|38|39|40|41|42|(0)(0)|48|(0)|50|51|(0)|53|54|(0)|56|57|(1:58)|78|79|(5:(0)|(0)|(0)|(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02e3, code lost:
        if (r5 != null) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02e5, code lost:
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02ed, code lost:
        if (r5 != null) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0312, code lost:
        if (r5 == null) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0315, code lost:
        r1 = r13.keySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0321, code lost:
        if (r1.hasNext() == false) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0323, code lost:
        r4 = ((java.lang.Integer) r1.next()).intValue();
        r5 = java.lang.Integer.valueOf(r4);
        r6 = (com.google.android.gms.internal.measurement.zzgd) r13.get(r5);
        r7 = (java.util.List) r0.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x033d, code lost:
        if (r7 == null) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0343, code lost:
        if (r7.isEmpty() == false) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0347, code lost:
        r17 = r0;
        r0 = r65.zzf.zzm().zzo(r6.zzc(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x035b, code lost:
        if (r0.isEmpty() != false) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x035d, code lost:
        r5 = r6.zzbu();
        r5.zzd();
        r5.zzc(r0);
        r20 = r1;
        r0 = r65.zzf.zzm().zzo(r6.zza(), r7);
        r5.zzb();
        r5.zza(r0);
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0384, code lost:
        if (r0 >= r6.zzf()) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0396, code lost:
        if (r7.contains(java.lang.Integer.valueOf(r6.zzg(r0).zzb())) == false) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0398, code lost:
        r5.zzf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x039b, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x039e, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x03a3, code lost:
        if (r0 >= r6.zzi()) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x03b5, code lost:
        if (r7.contains(java.lang.Integer.valueOf(r6.zzj(r0).zzb())) == false) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x03b7, code lost:
        r5.zzh(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x03ba, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x03bd, code lost:
        r3.put(java.lang.Integer.valueOf(r4), r5.zzaA());
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x03cb, code lost:
        r0 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x03cf, code lost:
        r17 = r0;
        r20 = r1;
        r3.put(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x03d6, code lost:
        r0 = r17;
        r1 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x072c, code lost:
        if (r11 != null) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x072e, code lost:
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0766, code lost:
        if (r11 != null) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x08fc, code lost:
        if (r13 != null) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x08fe, code lost:
        r13.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0926, code lost:
        if (r13 == null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x0a26, code lost:
        r0 = r65.zzs.zzau().zze();
        r6 = com.google.android.gms.measurement.internal.zzem.zzl(r65.zza);
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0a3a, code lost:
        if (r7.zza() == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x0a3c, code lost:
        r7 = java.lang.Integer.valueOf(r7.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x0a45, code lost:
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0a46, code lost:
        r0.zzc("Invalid property filter ID. appId, id", r6, java.lang.String.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0151, code lost:
        if (r5 != null) goto L513;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0153, code lost:
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0177, code lost:
        if (r5 == null) goto L526;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x022a, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x022b, code lost:
        r18 = "audience_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0230, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0232, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0233, code lost:
        r18 = "audience_id";
        r19 = "data";
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0238, code lost:
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x023b, code lost:
        r4 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0a83  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b6 A[Catch: SQLiteException -> 0x022a, all -> 0x0b13, TRY_LEAVE, TryCatch #13 {SQLiteException -> 0x022a, blocks: (B:63:0x01b0, B:65:0x01b6, B:69:0x01c6, B:70:0x01cb, B:71:0x01d5, B:72:0x01e5, B:74:0x01f4), top: B:459:0x01b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c6 A[Catch: SQLiteException -> 0x022a, all -> 0x0b13, TRY_ENTER, TryCatch #13 {SQLiteException -> 0x022a, blocks: (B:63:0x01b0, B:65:0x01b6, B:69:0x01c6, B:70:0x01cb, B:71:0x01d5, B:72:0x01e5, B:74:0x01f4), top: B:459:0x01b0 }] */
    /* JADX WARN: Type inference failed for: r5v45, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.internal.measurement.zzfk> zzb(java.lang.String r66, java.util.List<com.google.android.gms.internal.measurement.zzfo> r67, java.util.List<com.google.android.gms.internal.measurement.zzgh> r68, java.lang.Long r69, java.lang.Long r70) {
        /*
            Method dump skipped, instructions count: 2843
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzy.zzb(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }
}

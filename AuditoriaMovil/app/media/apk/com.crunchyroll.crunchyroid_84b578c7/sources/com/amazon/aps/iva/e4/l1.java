package com.amazon.aps.iva.e4;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.amazon.aps.iva.g8.a;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.commenting.model.Comment;
import com.ellation.crunchyroll.api.etp.commenting.model.Votes;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
/* compiled from: TextFormatEscaper.java */
/* loaded from: classes.dex */
public class l1 implements com.amazon.aps.iva.gr.l, com.amazon.aps.iva.sq.f {
    public static com.amazon.aps.iva.m50.c b;
    public static com.amazon.aps.iva.oy.b c;
    public static com.amazon.aps.iva.my.d d;
    public static com.amazon.aps.iva.vd.e f;
    public static final l1 a = new l1();
    public static final l1 e = new l1();

    public static String A(i iVar) {
        StringBuilder sb = new StringBuilder(iVar.size());
        for (int i = 0; i < iVar.size(); i++) {
            byte b2 = iVar.b(i);
            if (b2 != 34) {
                if (b2 != 39) {
                    if (b2 != 92) {
                        switch (b2) {
                            case 7:
                                sb.append("\\a");
                                continue;
                            case 8:
                                sb.append("\\b");
                                continue;
                            case 9:
                                sb.append("\\t");
                                continue;
                            case 10:
                                sb.append("\\n");
                                continue;
                            case 11:
                                sb.append("\\v");
                                continue;
                            case 12:
                                sb.append("\\f");
                                continue;
                            case 13:
                                sb.append("\\r");
                                continue;
                            default:
                                if (b2 >= 32 && b2 <= 126) {
                                    sb.append((char) b2);
                                    continue;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((b2 >>> 6) & 3) + 48));
                                    sb.append((char) (((b2 >>> 3) & 7) + 48));
                                    sb.append((char) ((b2 & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }

    public static com.amazon.aps.iva.vd.e B() {
        com.amazon.aps.iva.vd.e eVar = f;
        if (eVar != null) {
            return eVar;
        }
        com.amazon.aps.iva.yb0.j.m("dependencies");
        throw null;
    }

    public static final ArrayList C(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof com.amazon.aps.iva.f00.b) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final boolean D(com.amazon.aps.iva.ee0.e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "<this>");
        com.amazon.aps.iva.ee0.u1 L0 = e0Var.L0();
        if (!(L0 instanceof com.amazon.aps.iva.ge0.h) && (!(L0 instanceof com.amazon.aps.iva.ee0.y) || !(((com.amazon.aps.iva.ee0.y) L0).P0() instanceof com.amazon.aps.iva.ge0.h))) {
            return false;
        }
        return true;
    }

    public static final com.amazon.aps.iva.ad0.e E(com.amazon.aps.iva.la0.c cVar, com.amazon.aps.iva.ed0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
        com.amazon.aps.iva.yb0.j.f(dVar, "annotationsOwner");
        return new com.amazon.aps.iva.ad0.e(cVar, dVar, false);
    }

    public static final String F(Object obj) {
        com.amazon.aps.iva.yb0.j.f(obj, "<this>");
        if (!(obj instanceof com.amazon.aps.iva.i8.b)) {
            if (!(obj instanceof com.amazon.aps.iva.i8.a)) {
                if (obj instanceof a.C0294a) {
                    a.C0294a c0294a = (a.C0294a) obj;
                    return "Unknown";
                } else if (obj instanceof String) {
                    return (String) obj;
                } else {
                    String canonicalName = obj.getClass().getCanonicalName();
                    if (canonicalName == null) {
                        return obj.getClass().getSimpleName();
                    }
                    return canonicalName;
                }
            }
            com.amazon.aps.iva.i8.a aVar = (com.amazon.aps.iva.i8.a) obj;
            throw new IllegalStateException("DialogFragment class was not set".toString());
        }
        com.amazon.aps.iva.i8.b bVar = (com.amazon.aps.iva.i8.b) obj;
        throw new IllegalStateException("Fragment class was not set".toString());
    }

    public static final Object G(Set set, Enum r2, Enum r3, Object obj, boolean z) {
        Enum r1;
        if (z) {
            if (set.contains(r2)) {
                r1 = r2;
            } else if (set.contains(r3)) {
                r1 = r3;
            } else {
                r1 = null;
            }
            if (com.amazon.aps.iva.yb0.j.a(r1, r2) && com.amazon.aps.iva.yb0.j.a(obj, r3)) {
                return null;
            }
            if (obj == null) {
                return r1;
            }
            return obj;
        }
        if (obj != null) {
            set = com.amazon.aps.iva.lb0.x.c1(com.amazon.aps.iva.lb0.m0.R(set, obj));
        }
        return com.amazon.aps.iva.lb0.x.Q0(set);
    }

    public static final Set H(Object obj) {
        Set singleton = Collections.singleton(obj);
        com.amazon.aps.iva.yb0.j.e(singleton, "singleton(element)");
        return singleton;
    }

    public static final Set I(Object... objArr) {
        if (objArr.length > 0) {
            return com.amazon.aps.iva.lb0.o.d0(objArr);
        }
        return com.amazon.aps.iva.lb0.b0.b;
    }

    public static String J(int i) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "Blocking";
        }
        if (i == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return "Optional";
        }
        if (i == 2) {
            z3 = true;
        }
        if (z3) {
            return "Async";
        }
        return "Invalid(value=" + i + ')';
    }

    public static final com.amazon.aps.iva.du.x K(Comment comment, Image image) {
        List<Image> authorAvatars;
        int i;
        int i2;
        com.amazon.aps.iva.yb0.j.f(comment, "<this>");
        String id = comment.getId();
        String parentId = comment.getParentId();
        String authorUsername = comment.getAuthorUsername();
        if (image != null) {
            authorAvatars = com.amazon.aps.iva.ee0.f1.J(image);
        } else {
            authorAvatars = comment.getAuthorAvatars();
        }
        List<Image> list = authorAvatars;
        String comment2 = comment.getComment();
        Votes votes = comment.getVotes();
        if (votes != null) {
            i = votes.getLikeVotes();
        } else {
            i = 0;
        }
        int i3 = i;
        boolean isLikedByUser = comment.isLikedByUser();
        boolean isOwner = comment.isOwner();
        Date created = comment.getCreated();
        int repliesCount = comment.getRepliesCount();
        boolean isFlaggedAsSpoiler = comment.isFlaggedAsSpoiler();
        boolean isFlaggedAsSpoilerByUser = comment.isFlaggedAsSpoilerByUser();
        boolean isFlaggedAsInappropriateByUser = comment.isFlaggedAsInappropriateByUser();
        boolean isFlaggedAsSpoiler2 = comment.isFlaggedAsSpoiler();
        boolean isDeleted = comment.isDeleted();
        if (comment.isOwner()) {
            i2 = R.color.cr_woodsmoke;
        } else {
            i2 = R.color.black;
        }
        return new com.amazon.aps.iva.du.x(id, parentId, authorUsername, list, comment2, i3, isLikedByUser, isOwner, created, repliesCount, isFlaggedAsSpoiler, isFlaggedAsSpoilerByUser, isFlaggedAsInappropriateByUser, isDeleted, i2, false, isFlaggedAsSpoiler2, true);
    }

    public static final void L(com.amazon.aps.iva.ds.a aVar, Throwable th, com.amazon.aps.iva.es.w wVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "<this>");
        com.amazon.aps.iva.yb0.j.f(th, "error");
        if (!(th instanceof CancellationException)) {
            aVar.e(wVar);
        }
    }

    public static void M(com.amazon.aps.iva.iq.a aVar, String str, Exception exc, int i) {
        com.amazon.aps.iva.lb0.a0 a0Var = null;
        if ((i & 2) != 0) {
            exc = null;
        }
        if ((i & 4) != 0) {
            a0Var = com.amazon.aps.iva.lb0.a0.b;
        }
        com.amazon.aps.iva.yb0.j.f(aVar, "<this>");
        com.amazon.aps.iva.yb0.j.f(str, "message");
        com.amazon.aps.iva.yb0.j.f(a0Var, "attributes");
        aVar.d(37, str, exc, a0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object N(com.amazon.aps.iva.qb0.c r7) {
        /*
            com.amazon.aps.iva.ob0.g r0 = r7.getContext()
            com.amazon.aps.iva.a60.b.p(r0)
            com.amazon.aps.iva.ob0.d r7 = com.amazon.aps.iva.a60.b.s(r7)
            boolean r1 = r7 instanceof com.amazon.aps.iva.xe0.e
            r2 = 0
            if (r1 == 0) goto L13
            com.amazon.aps.iva.xe0.e r7 = (com.amazon.aps.iva.xe0.e) r7
            goto L14
        L13:
            r7 = r2
        L14:
            if (r7 != 0) goto L1a
            com.amazon.aps.iva.kb0.q r7 = com.amazon.aps.iva.kb0.q.a
            goto L8b
        L1a:
            com.amazon.aps.iva.se0.d0 r1 = r7.e
            boolean r3 = r1.B()
            r4 = 1
            if (r3 == 0) goto L2d
            com.amazon.aps.iva.kb0.q r2 = com.amazon.aps.iva.kb0.q.a
            r7.g = r2
            r7.d = r4
            r1.y(r0, r7)
            goto L89
        L2d:
            com.amazon.aps.iva.se0.n2 r3 = new com.amazon.aps.iva.se0.n2
            r3.<init>()
            com.amazon.aps.iva.ob0.g r0 = r0.plus(r3)
            com.amazon.aps.iva.kb0.q r5 = com.amazon.aps.iva.kb0.q.a
            r7.g = r5
            r7.d = r4
            r1.y(r0, r7)
            boolean r0 = r3.b
            if (r0 == 0) goto L89
            com.amazon.aps.iva.se0.x0 r0 = com.amazon.aps.iva.se0.g2.a()
            com.amazon.aps.iva.x6.k r1 = r0.e
            r3 = 0
            if (r1 == 0) goto L55
            int r6 = r1.a
            int r1 = r1.b
            if (r6 != r1) goto L53
            goto L55
        L53:
            r1 = r3
            goto L56
        L55:
            r1 = r4
        L56:
            if (r1 == 0) goto L59
            goto L7b
        L59:
            boolean r1 = r0.V()
            if (r1 == 0) goto L67
            r7.g = r5
            r7.d = r4
            r0.L(r7)
            goto L7c
        L67:
            r0.M(r4)
            r7.run()     // Catch: java.lang.Throwable -> L74
        L6d:
            boolean r1 = r0.a0()     // Catch: java.lang.Throwable -> L74
            if (r1 != 0) goto L6d
            goto L78
        L74:
            r1 = move-exception
            r7.h(r1, r2)     // Catch: java.lang.Throwable -> L84
        L78:
            r0.C(r4)
        L7b:
            r4 = r3
        L7c:
            if (r4 == 0) goto L81
            com.amazon.aps.iva.pb0.a r7 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            goto L8b
        L81:
            com.amazon.aps.iva.kb0.q r7 = com.amazon.aps.iva.kb0.q.a
            goto L8b
        L84:
            r7 = move-exception
            r0.C(r4)
            throw r7
        L89:
            com.amazon.aps.iva.pb0.a r7 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
        L8b:
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            if (r7 != r0) goto L90
            return r7
        L90:
            com.amazon.aps.iva.kb0.q r7 = com.amazon.aps.iva.kb0.q.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.e4.l1.N(com.amazon.aps.iva.qb0.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x008a -> B:36:0x008e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(com.ellation.crunchyroll.api.etp.content.ContentApiResponse r5, com.ellation.crunchyroll.api.etp.content.EtpContentService r6, com.amazon.aps.iva.ob0.d r7) {
        /*
            boolean r0 = r7 instanceof com.amazon.aps.iva.r10.w
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.r10.w r0 = (com.amazon.aps.iva.r10.w) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.r10.w r0 = new com.amazon.aps.iva.r10.w
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            com.ellation.crunchyroll.api.etp.content.EtpContentService r5 = r0.h
            com.amazon.aps.iva.ab.x.i0(r7)
            r6 = r5
            goto L8e
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            com.amazon.aps.iva.ab.x.i0(r7)
        L35:
            java.util.List r7 = r5.getData()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r2 = r7 instanceof java.util.Collection
            if (r2 == 0) goto L49
            r2 = r7
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L49
            goto L66
        L49:
            java.util.Iterator r7 = r7.iterator()
        L4d:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L66
            java.lang.Object r2 = r7.next()
            com.ellation.crunchyroll.api.etp.content.model.WatchHistoryPanel r2 = (com.ellation.crunchyroll.api.etp.content.model.WatchHistoryPanel) r2
            com.ellation.crunchyroll.model.Panel r2 = r2.getPanel()
            r4 = 0
            if (r2 == 0) goto L62
            r2 = r3
            goto L63
        L62:
            r2 = r4
        L63:
            if (r2 == 0) goto L4d
            goto L67
        L66:
            r4 = r3
        L67:
            if (r4 == 0) goto L92
            java.lang.Object r7 = r5.getMeta()
            com.ellation.crunchyroll.api.etp.content.model.WatchHistoryMetadata r7 = (com.ellation.crunchyroll.api.etp.content.model.WatchHistoryMetadata) r7
            java.lang.String r7 = r7.getNextPage()
            if (r7 == 0) goto L92
            java.lang.Object r5 = r5.getMeta()
            com.ellation.crunchyroll.api.etp.content.model.WatchHistoryMetadata r5 = (com.ellation.crunchyroll.api.etp.content.model.WatchHistoryMetadata) r5
            java.lang.String r5 = r5.getNextPage()
            com.amazon.aps.iva.yb0.j.c(r5)
            r0.h = r6
            r0.j = r3
            java.lang.Object r7 = r6.getWatchHistory(r5, r0)
            if (r7 != r1) goto L8e
            r5 = r1
            goto L92
        L8e:
            r5 = r7
            com.ellation.crunchyroll.api.etp.content.ContentApiResponse r5 = (com.ellation.crunchyroll.api.etp.content.ContentApiResponse) r5
            goto L35
        L92:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.e4.l1.s(com.ellation.crunchyroll.api.etp.content.ContentApiResponse, com.ellation.crunchyroll.api.etp.content.EtpContentService, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    public static final void t(StringBuilder sb, String str) {
        com.amazon.aps.iva.yb0.j.g(sb, "receiver$0");
        com.amazon.aps.iva.yb0.j.g(str, "s");
        sb.append('\"');
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt != '\f') {
                if (charAt != '\r') {
                    if (charAt != '\"') {
                        if (charAt != '\\') {
                            switch (charAt) {
                                case '\b':
                                    sb.append("\\b");
                                    continue;
                                case '\t':
                                    sb.append("\\t");
                                    continue;
                                case '\n':
                                    sb.append("\\n");
                                    continue;
                                default:
                                    if (charAt < ' ') {
                                        String format = String.format("%02X", Arrays.copyOf(new Object[]{Character.valueOf(charAt)}, 1));
                                        com.amazon.aps.iva.yb0.j.b(format, "java.lang.String.format(format, *args)");
                                        sb.append("\\u00".concat(format));
                                        continue;
                                    } else {
                                        sb.append(charAt);
                                        break;
                                    }
                            }
                        } else {
                            sb.append("\\\\");
                        }
                    } else {
                        sb.append("\\\"");
                    }
                } else {
                    sb.append("\\r");
                }
            } else {
                sb.append("\\f");
            }
        }
        sb.append('\"');
    }

    public static final com.amazon.aps.iva.yy.a u(SharedPreferences sharedPreferences, String str, Object obj) {
        com.amazon.aps.iva.ve0.l0 g = com.amazon.aps.iva.ab.t.g(0, 0, null, 7);
        return new com.amazon.aps.iva.yy.a(g, new com.amazon.aps.iva.zy.b(obj, str, sharedPreferences, g));
    }

    public static final String v(Number number, Number number2) {
        com.amazon.aps.iva.yb0.j.f(number, "from");
        com.amazon.aps.iva.yb0.j.f(number2, "until");
        return "Random range is empty: [" + number + ", " + number2 + ").";
    }

    public static final boolean w(List list) {
        com.amazon.aps.iva.yb0.j.f(list, "<this>");
        List<com.amazon.aps.iva.du.x> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        for (com.amazon.aps.iva.du.x xVar : list2) {
            if (!xVar.q) {
                return false;
            }
        }
        return true;
    }

    public static void y(com.amazon.aps.iva.iq.a aVar, String str) {
        com.amazon.aps.iva.lb0.a0 a0Var = com.amazon.aps.iva.lb0.a0.b;
        com.amazon.aps.iva.yb0.j.f(aVar, "<this>");
        com.amazon.aps.iva.yb0.j.f(str, "message");
        aVar.d(35, str, null, a0Var);
    }

    public static void z(com.amazon.aps.iva.iq.a aVar, String str, Throwable th, int i) {
        com.amazon.aps.iva.lb0.a0 a0Var = null;
        if ((i & 2) != 0) {
            th = null;
        }
        if ((i & 4) != 0) {
            a0Var = com.amazon.aps.iva.lb0.a0.b;
        }
        com.amazon.aps.iva.yb0.j.f(aVar, "<this>");
        com.amazon.aps.iva.yb0.j.f(str, "message");
        com.amazon.aps.iva.yb0.j.f(a0Var, "attributes");
        aVar.d(38, str, th, a0Var);
    }

    @Override // com.amazon.aps.iva.sq.f
    public void a(String str, String str2, String str3, Map map) {
        com.amazon.aps.iva.yb0.j.f(str, "key");
        com.amazon.aps.iva.yb0.j.f(map, "attributes");
    }

    @Override // com.amazon.aps.iva.sq.f
    public void b(com.amazon.aps.iva.sq.d dVar, String str, LinkedHashMap linkedHashMap) {
        com.amazon.aps.iva.yb0.j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
    }

    @Override // com.amazon.aps.iva.sq.f
    public void c(String str, Integer num, Long l, com.amazon.aps.iva.sq.h hVar, LinkedHashMap linkedHashMap) {
        com.amazon.aps.iva.yb0.j.f(str, "key");
        com.amazon.aps.iva.yb0.j.f(hVar, "kind");
    }

    @Override // com.amazon.aps.iva.sq.f
    public void d(com.amazon.aps.iva.sq.d dVar, String str, Map map) {
        com.amazon.aps.iva.yb0.j.f(dVar, "type");
        com.amazon.aps.iva.yb0.j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
    }

    @Override // com.amazon.aps.iva.sq.f
    public void e(Object obj, Map map) {
        com.amazon.aps.iva.yb0.j.f(obj, "key");
        com.amazon.aps.iva.yb0.j.f(map, "attributes");
    }

    @Override // com.amazon.aps.iva.sq.f
    public void l(Object obj, Map map, String str) {
        com.amazon.aps.iva.yb0.j.f(obj, "key");
        com.amazon.aps.iva.yb0.j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(map, "attributes");
    }

    @Override // com.amazon.aps.iva.sq.f
    public void o(String str, String str2, com.amazon.aps.iva.sq.e eVar, Throwable th, Map map) {
        com.amazon.aps.iva.yb0.j.f(str, "key");
        com.amazon.aps.iva.yb0.j.f(eVar, FirebaseAnalytics.Param.SOURCE);
        com.amazon.aps.iva.yb0.j.f(map, "attributes");
    }

    @Override // com.amazon.aps.iva.gr.l
    public void p(Object obj) {
        com.amazon.aps.iva.yb0.j.f(obj, "target");
    }

    @Override // com.amazon.aps.iva.sq.f
    public void q(com.amazon.aps.iva.sq.d dVar, String str, LinkedHashMap linkedHashMap) {
        com.amazon.aps.iva.yb0.j.f(dVar, "type");
        com.amazon.aps.iva.yb0.j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
    }

    @Override // com.amazon.aps.iva.sq.f
    public void r(String str, com.amazon.aps.iva.sq.e eVar, Throwable th, Map map) {
        com.amazon.aps.iva.yb0.j.f(str, "message");
        com.amazon.aps.iva.yb0.j.f(eVar, FirebaseAnalytics.Param.SOURCE);
    }

    public com.amazon.aps.iva.md.c x(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "externalUrl");
        com.amazon.aps.iva.md.c cVar = new com.amazon.aps.iva.md.c();
        Bundle bundle = new Bundle();
        bundle.putString("external_url", str);
        cVar.setArguments(bundle);
        return cVar;
    }
}

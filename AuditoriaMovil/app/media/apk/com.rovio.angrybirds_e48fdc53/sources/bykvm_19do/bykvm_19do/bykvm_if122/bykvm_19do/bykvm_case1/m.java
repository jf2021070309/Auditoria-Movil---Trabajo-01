package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.adapter.util.ThreadHelper;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class m {
    private Map<String, Long> a;
    private Map<String, Pair<String, String>> b;

    /* loaded from: classes.dex */
    class a implements Runnable {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Logger.d("TTMediationSDK_IntervalShowControl", "updateShowPacingTime ritId = " + this.a);
            i i = m.this.i(this.a);
            if (i == null || !i.a()) {
                return;
            }
            Date date = new Date();
            Logger.d("TTMediationSDK_IntervalShowControl", "updateShowPacingTime save time = " + f.b(date.getTime()));
            m.this.a(this.a, date.getTime());
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        final /* synthetic */ String a;

        b(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Logger.d("TTMediationSDK_IntervalShowControl", "addShowFreqctlCount ritId = " + this.a);
            g h = m.this.h(this.a);
            if (h == null || !h.a()) {
                return;
            }
            for (e eVar : h.i()) {
                if (eVar.a() < eVar.c()) {
                    m.this.a(h, eVar.d(), eVar.a() + 1);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {
        private static m a = new m(null);
    }

    private m() {
        a();
    }

    /* synthetic */ m(a aVar) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(g gVar, String str, int i) {
        h.a().a(gVar, str, i);
    }

    private void a(g gVar, String str, long j) {
        h.a().a(gVar, str, j);
    }

    public static m b() {
        return c.a;
    }

    public void a() {
        this.b = new ConcurrentHashMap();
        this.a = new ConcurrentHashMap();
    }

    public void a(String str) {
        ThreadHelper.runOnMSDKThread(new b(str));
    }

    public void a(String str, long j) {
        j.a().a(str, j);
    }

    public boolean a(g gVar) {
        String str;
        if (gVar != null) {
            g h = h(gVar.d());
            if (h == null) {
                str = "freqctl 规则为空直接存储";
            } else if (TextUtils.isEmpty(gVar.e())) {
                Logger.d("TTMediationSDK_IntervalShowControl", "freqctl version 为空 清空本地数据 ");
                d(h.d());
            } else if (TextUtils.equals(h.e(), gVar.e())) {
                Logger.d("TTMediationSDK_IntervalShowControl", "freqctl version 一致 version = " + h.e() + "无需处理");
            } else {
                str = "freqctl version不一致，缓存新规则 old version = " + h.e() + "  new version " + gVar.e();
            }
            Logger.d("TTMediationSDK_IntervalShowControl", str);
            return true;
        }
        return false;
    }

    public boolean a(i iVar) {
        if (iVar != null) {
            i i = i(iVar.d());
            if (i == null) {
                Logger.d("TTMediationSDK_IntervalShowControl", "pacing 规则为空直接存储");
                return true;
            } else if (TextUtils.isEmpty(iVar.j())) {
                Logger.d("TTMediationSDK_IntervalShowControl", "pacing ruleId 为空 清空本地数据 ");
                e(iVar.g());
            } else if (!TextUtils.equals(i.j(), iVar.j())) {
                Logger.d("TTMediationSDK_IntervalShowControl", "pacing ruleId不一致，缓存新规则 old ruleId = " + i.j() + "  new ruleId = " + iVar.j());
                StringBuilder sb = new StringBuilder();
                sb.append("pacing 删除 ritId = ");
                sb.append(iVar.g());
                Logger.d("TTMediationSDK_IntervalShowControl", sb.toString());
                e(iVar.g());
                return true;
            } else {
                Logger.d("TTMediationSDK_IntervalShowControl", "pacing ruleId 一致 ruleId = " + i.j() + " 无需处理");
            }
        }
        return false;
    }

    public void b(g gVar) {
        h.a().a(gVar);
    }

    public void b(i iVar) {
        j.a().a(iVar);
    }

    public boolean b(String str) {
        StringBuilder sb;
        g h = h(str);
        if (h != null && h.a()) {
            for (e eVar : h.i()) {
                Date date = new Date();
                Logger.d("TTMediationSDK_IntervalShowControl", "checkFreqctl date = " + date.getTime() + " item.getEffectiveTime() = " + eVar.b());
                if (date.getTime() > eVar.b()) {
                    a(h, eVar.d(), 0);
                    a(h, eVar.d(), f.a(eVar.e()));
                    sb = new StringBuilder();
                    sb.append("checkFreqctl 有效期外计数需要清0，过期时间需要更新 = ");
                    sb.append(eVar.d());
                } else if (eVar.a() >= eVar.c()) {
                    Logger.d("TTMediationSDK_IntervalShowControl", "checkFreqctl 到了上线不可以展示 ruleId = " + eVar.d() + " count = " + eVar.a());
                    Map<String, Pair<String, String>> map = this.b;
                    String d = eVar.d();
                    map.put(str, new Pair<>(d, eVar.a() + ""));
                    return false;
                } else {
                    sb = new StringBuilder();
                    sb.append("checkFreqctl 未到上线可以展示 ruleId = ");
                    sb.append(eVar.d());
                    sb.append(" count = ");
                    sb.append(eVar.a());
                }
                Logger.d("TTMediationSDK_IntervalShowControl", sb.toString());
            }
        }
        return true;
    }

    public boolean c(String str) {
        i i = i(str);
        if (i != null && i.a() && i.l()) {
            long time = new Date().getTime();
            long k = i.k();
            long k2 = i.k() + i.i();
            Logger.d("TTMediationSDK_IntervalShowControl", "checkPacing currentTime = " + f.b(time) + " showTime = " + f.b(k) + " pacingBean.getPacing() = " + i.i() + " pacingTime = " + f.b(k2));
            if (time <= k2) {
                this.a.put(str, Long.valueOf(time - k));
                return false;
            }
        }
        return true;
    }

    public void d(String str) {
        h.a().a(str);
    }

    public void e(String str) {
        j.a().a(str);
    }

    public Pair<String, String> f(String str) {
        return this.b.get(str);
    }

    public long g(String str) {
        Long l = this.a.get(str);
        if (l == null) {
            return -2L;
        }
        return l.longValue();
    }

    public g h(String str) {
        return h.a().b(str);
    }

    public i i(String str) {
        return j.a().b(str);
    }

    public void j(String str) {
        ThreadHelper.runOnMSDKThread(new a(str));
    }
}

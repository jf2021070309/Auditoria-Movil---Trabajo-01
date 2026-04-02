package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1;

import android.text.TextUtils;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.adapter.util.ThreadHelper;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class l {
    private static final String b = "TTMediationSDK_" + l.class.getSimpleName();
    private Map<String, Long> a;

    /* loaded from: classes.dex */
    class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = l.b;
            Logger.d(str, "adn updateShowPacingTime ritId = " + this.a + " adnSlotId = " + this.b);
            i d = l.this.d(this.a, this.b);
            if (d == null || !d.a()) {
                return;
            }
            Date date = new Date();
            String str2 = l.b;
            Logger.d(str2, "adn updateShowPacingTime save time = " + f.b(date.getTime()));
            l.this.a(this.a, this.b, date.getTime());
        }
    }

    /* loaded from: classes.dex */
    private static class b {
        private static l a = new l(null);
    }

    private l() {
        this.a = new ConcurrentHashMap();
    }

    /* synthetic */ l(a aVar) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, long j) {
        j.a().a(str, str2, j);
    }

    public static l b() {
        return b.a;
    }

    public boolean a(i iVar) {
        if (iVar != null) {
            i d = d(iVar.d(), iVar.c());
            if (d == null) {
                Logger.d(b, "adn pacing 规则为空直接存储");
                return true;
            } else if (TextUtils.isEmpty(iVar.j())) {
                Logger.d(b, "adn pacing ruleId 为空 清空本地数据 ");
                b(iVar.d(), iVar.c());
            } else if (!TextUtils.equals(d.j(), iVar.j())) {
                String str = b;
                Logger.d(str, "adn pacing ruleId不一致，缓存新规则 old ruleId = " + d.j() + "  new ruleId = " + iVar.j());
                b(iVar.d(), iVar.c());
                return true;
            } else {
                String str2 = b;
                Logger.d(str2, "adn pacing ruleId 一致 ruleId = " + d.j() + " 无需处理");
            }
        }
        return false;
    }

    public boolean a(String str, String str2) {
        String str3 = b;
        Logger.d(str3, "adn checkPacing ritId = " + str + " adnSlotId = " + str2);
        i d = d(str, str2);
        if (d != null && d.a() && d.l()) {
            long time = new Date().getTime();
            long k = d.k();
            long k2 = d.k() + d.i();
            Logger.d(str3, "adn checkPacing currentTime = " + f.b(time) + " showTime = " + f.b(k) + " pacingBean.getPacing() = " + d.i() + " pacingTime = " + f.b(k2));
            if (time <= k2) {
                Map<String, Long> map = this.a;
                map.put(str + "_" + str2, Long.valueOf(time - k));
                return false;
            }
        }
        return true;
    }

    public void b(i iVar) {
        j.a().a(iVar);
    }

    public void b(String str, String str2) {
        j.a().a(str, str2);
    }

    public long c(String str, String str2) {
        Map<String, Long> map = this.a;
        Long l = map.get(str + "_" + str2);
        if (l == null) {
            return -2L;
        }
        return l.longValue();
    }

    public i d(String str, String str2) {
        return j.a().b(str, str2);
    }

    public void e(String str, String str2) {
        ThreadHelper.runOnMSDKThread(new a(str, str2));
    }
}

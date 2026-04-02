package e.a.a.a;

import com.android.billingclient.api.SkuDetails;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class i {
    public boolean a;

    /* renamed from: b  reason: collision with root package name */
    public String f4998b;

    /* renamed from: c  reason: collision with root package name */
    public String f4999c;

    /* renamed from: d  reason: collision with root package name */
    public String f5000d;

    /* renamed from: e  reason: collision with root package name */
    public int f5001e = 0;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<SkuDetails> f5002f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5003g;

    /* loaded from: classes.dex */
    public static class a {
        public String a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<SkuDetails> f5004b;

        public a() {
        }

        public /* synthetic */ a(a0 a0Var) {
        }

        public i a() {
            ArrayList<SkuDetails> arrayList = this.f5004b;
            if (arrayList == null || arrayList.isEmpty()) {
                throw new IllegalArgumentException("SkuDetails must be provided.");
            }
            ArrayList<SkuDetails> arrayList2 = this.f5004b;
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                int i3 = i2 + 1;
                if (arrayList2.get(i2) == null) {
                    throw new IllegalArgumentException("SKU cannot be null.");
                }
                i2 = i3;
            }
            if (this.f5004b.size() > 1) {
                SkuDetails skuDetails = this.f5004b.get(0);
                String e2 = skuDetails.e();
                ArrayList<SkuDetails> arrayList3 = this.f5004b;
                int size2 = arrayList3.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    SkuDetails skuDetails2 = arrayList3.get(i4);
                    if (!e2.equals("play_pass_subs") && !skuDetails2.e().equals("play_pass_subs") && !e2.equals(skuDetails2.e())) {
                        throw new IllegalArgumentException("SKUs should have the same type.");
                    }
                }
                String f2 = skuDetails.f();
                ArrayList<SkuDetails> arrayList4 = this.f5004b;
                int size3 = arrayList4.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    SkuDetails skuDetails3 = arrayList4.get(i5);
                    if (!e2.equals("play_pass_subs") && !skuDetails3.e().equals("play_pass_subs") && !f2.equals(skuDetails3.f())) {
                        throw new IllegalArgumentException("All SKUs must have the same package name.");
                    }
                }
            }
            i iVar = new i();
            iVar.a = true ^ this.f5004b.get(0).f().isEmpty();
            iVar.f4998b = this.a;
            iVar.f5000d = null;
            iVar.f4999c = null;
            iVar.f5001e = 0;
            iVar.f5002f = this.f5004b;
            iVar.f5003g = false;
            return iVar;
        }
    }
}

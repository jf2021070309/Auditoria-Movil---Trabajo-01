package c.b0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class c extends b {

    /* renamed from: d  reason: collision with root package name */
    public final SparseIntArray f1289d;

    /* renamed from: e  reason: collision with root package name */
    public final Parcel f1290e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1291f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1292g;

    /* renamed from: h  reason: collision with root package name */
    public final String f1293h;

    /* renamed from: i  reason: collision with root package name */
    public int f1294i;

    /* renamed from: j  reason: collision with root package name */
    public int f1295j;

    /* renamed from: k  reason: collision with root package name */
    public int f1296k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new c.f.a(), new c.f.a(), new c.f.a());
    }

    public c(Parcel parcel, int i2, int i3, String str, c.f.a<String, Method> aVar, c.f.a<String, Method> aVar2, c.f.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f1289d = new SparseIntArray();
        this.f1294i = -1;
        this.f1295j = 0;
        this.f1296k = -1;
        this.f1290e = parcel;
        this.f1291f = i2;
        this.f1292g = i3;
        this.f1295j = i2;
        this.f1293h = str;
    }

    @Override // c.b0.b
    public void a() {
        int i2 = this.f1294i;
        if (i2 >= 0) {
            int i3 = this.f1289d.get(i2);
            int dataPosition = this.f1290e.dataPosition();
            this.f1290e.setDataPosition(i3);
            this.f1290e.writeInt(dataPosition - i3);
            this.f1290e.setDataPosition(dataPosition);
        }
    }

    @Override // c.b0.b
    public b b() {
        Parcel parcel = this.f1290e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.f1295j;
        if (i2 == this.f1291f) {
            i2 = this.f1292g;
        }
        return new c(parcel, dataPosition, i2, e.a.d.a.a.r(new StringBuilder(), this.f1293h, "  "), this.a, this.f1287b, this.f1288c);
    }

    @Override // c.b0.b
    public boolean f() {
        return this.f1290e.readInt() != 0;
    }

    @Override // c.b0.b
    public byte[] g() {
        int readInt = this.f1290e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f1290e.readByteArray(bArr);
        return bArr;
    }

    @Override // c.b0.b
    public CharSequence h() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f1290e);
    }

    @Override // c.b0.b
    public boolean i(int i2) {
        while (this.f1295j < this.f1292g) {
            int i3 = this.f1296k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            this.f1290e.setDataPosition(this.f1295j);
            int readInt = this.f1290e.readInt();
            this.f1296k = this.f1290e.readInt();
            this.f1295j += readInt;
        }
        return this.f1296k == i2;
    }

    @Override // c.b0.b
    public int j() {
        return this.f1290e.readInt();
    }

    @Override // c.b0.b
    public <T extends Parcelable> T l() {
        return (T) this.f1290e.readParcelable(c.class.getClassLoader());
    }

    @Override // c.b0.b
    public String n() {
        return this.f1290e.readString();
    }

    @Override // c.b0.b
    public void p(int i2) {
        a();
        this.f1294i = i2;
        this.f1289d.put(i2, this.f1290e.dataPosition());
        this.f1290e.writeInt(0);
        this.f1290e.writeInt(i2);
    }

    @Override // c.b0.b
    public void q(boolean z) {
        this.f1290e.writeInt(z ? 1 : 0);
    }

    @Override // c.b0.b
    public void r(byte[] bArr) {
        if (bArr == null) {
            this.f1290e.writeInt(-1);
            return;
        }
        this.f1290e.writeInt(bArr.length);
        this.f1290e.writeByteArray(bArr);
    }

    @Override // c.b0.b
    public void s(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f1290e, 0);
    }

    @Override // c.b0.b
    public void t(int i2) {
        this.f1290e.writeInt(i2);
    }

    @Override // c.b0.b
    public void u(Parcelable parcelable) {
        this.f1290e.writeParcelable(parcelable, 0);
    }

    @Override // c.b0.b
    public void v(String str) {
        this.f1290e.writeString(str);
    }
}

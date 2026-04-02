package com.amazon.aps.iva.i7;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.q5.d0;
import com.amazon.aps.iva.t5.g0;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
/* compiled from: TextInformationFrame.java */
/* loaded from: classes.dex */
public final class l extends h {
    public static final Parcelable.Creator<l> CREATOR = new a();
    public final String c;
    public final ImmutableList<String> d;

    /* compiled from: TextInformationFrame.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<l> {
        @Override // android.os.Parcelable.Creator
        public final l createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            readString.getClass();
            String readString2 = parcel.readString();
            String[] createStringArray = parcel.createStringArray();
            createStringArray.getClass();
            return new l(readString, readString2, ImmutableList.copyOf(createStringArray));
        }

        @Override // android.os.Parcelable.Creator
        public final l[] newArray(int i) {
            return new l[i];
        }
    }

    public l(String str, String str2, ImmutableList immutableList) {
        super(str);
        com.amazon.aps.iva.cq.b.t(!immutableList.isEmpty());
        this.c = str2;
        ImmutableList<String> copyOf = ImmutableList.copyOf((Collection) immutableList);
        this.d = copyOf;
        copyOf.get(0);
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (g0.a(this.b, lVar.b) && g0.a(this.c, lVar.c) && this.d.equals(lVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int b = com.amazon.aps.iva.c80.a.b(this.b, 527, 31);
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return this.d.hashCode() + ((b + i) * 31);
    }

    @Override // com.amazon.aps.iva.i7.h
    public final String toString() {
        return this.b + ": description=" + this.c + ": values=" + this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeStringArray((String[]) this.d.toArray(new String[0]));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.amazon.aps.iva.q5.f0.b
    public final void y(d0.a aVar) {
        char c;
        Integer num;
        String str = this.b;
        str.getClass();
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        ImmutableList<String> immutableList = this.d;
        try {
            switch (c) {
                case 0:
                case '\n':
                    aVar.c(immutableList.get(0));
                    return;
                case 1:
                case 11:
                    aVar.e(immutableList.get(0));
                    return;
                case 2:
                case '\f':
                    String str2 = immutableList.get(0);
                    int parseInt = Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = Integer.parseInt(str2.substring(0, 2));
                    aVar.h(Integer.valueOf(parseInt));
                    aVar.g(Integer.valueOf(parseInt2));
                    return;
                case 3:
                case 17:
                    aVar.d(immutableList.get(0));
                    return;
                case 4:
                case 18:
                    aVar.b(immutableList.get(0));
                    return;
                case 5:
                case 19:
                    aVar.f(immutableList.get(0));
                    return;
                case 6:
                case 20:
                    String[] Z = g0.Z(immutableList.get(0));
                    int parseInt3 = Integer.parseInt(Z[0]);
                    if (Z.length > 1) {
                        num = Integer.valueOf(Integer.parseInt(Z[1]));
                    } else {
                        num = null;
                    }
                    aVar.o(Integer.valueOf(parseInt3));
                    aVar.n(num);
                    return;
                case 7:
                case 16:
                    aVar.m(immutableList.get(0));
                    return;
                case '\b':
                case 15:
                    aVar.p(immutableList.get(0));
                    return;
                case '\t':
                case 21:
                    aVar.i(Integer.valueOf(Integer.parseInt(immutableList.get(0))));
                    return;
                case '\r':
                    ArrayList a2 = a(immutableList.get(0));
                    int size = a2.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                aVar.g((Integer) a2.get(2));
                            } else {
                                return;
                            }
                        }
                        aVar.h((Integer) a2.get(1));
                    }
                    aVar.i((Integer) a2.get(0));
                    return;
                case 14:
                    ArrayList a3 = a(immutableList.get(0));
                    int size2 = a3.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                aVar.j((Integer) a3.get(2));
                            } else {
                                return;
                            }
                        }
                        aVar.k((Integer) a3.get(1));
                    }
                    aVar.l((Integer) a3.get(0));
                    return;
                default:
                    return;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }
}

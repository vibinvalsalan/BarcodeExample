package com.honeywell.barcode.Response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Transaction {

@SerializedName("Reference1")
@Expose
private String reference1;
@SerializedName("Reference2")
@Expose
private String reference2;
@SerializedName("Reference3")
@Expose
private String reference3;
@SerializedName("Reference4")
@Expose
private String reference4;
@SerializedName("Reference5")
@Expose
private String reference5;

public String getReference1() {
return reference1;
}

public void setReference1(String reference1) {
this.reference1 = reference1;
}

public String getReference2() {
return reference2;
}

public void setReference2(String reference2) {
this.reference2 = reference2;
}

public String getReference3() {
return reference3;
}

public void setReference3(String reference3) {
this.reference3 = reference3;
}

public String getReference4() {
return reference4;
}

public void setReference4(String reference4) {
this.reference4 = reference4;
}

public String getReference5() {
return reference5;
}

public void setReference5(String reference5) {
this.reference5 = reference5;
}

}
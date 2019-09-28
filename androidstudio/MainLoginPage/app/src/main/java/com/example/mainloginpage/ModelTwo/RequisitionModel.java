package com.example.mainloginpage.ModelTwo;

import java.io.Serializable;

public class RequisitionModel  implements Serializable {
    String requisitiondescription;

    public String getRequisitiondescription() {
        return requisitiondescription;
    }

    public void setRequisitiondescription(String requisitiondescription) {
        this.requisitiondescription = requisitiondescription;
    }
}
